package PayrollDashBoardCalculations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC49_ScrollAndCountEmployees201 extends TestBase {
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

public void TC01validateTotalRecordsOnDashboardAndRunPayrollwithEvenNumber() throws Exception {

	sTestCaseID = "TC049";
	Sheet = "PayrollDashboardCalculations";
	data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
	pages.loginpage4  loginpage = new pages.loginpage4(driver);

	loginpage.GoToUrl();	
	loginpage.AssertUrl();
	loginpage.Enter_EnterUsername(data[1]);
	loginpage.Enter_Enterpassword(data[2]);
	loginpage.Click_LoginButton();

	pages.agentpage agentpage = new pages.agentpage(driver);
	agentpage.Enter_SearchAgentName(data[3]);
	agentpage.Click_ClickSearch();
	agentpage.Click_ClickAgent1();
	
	
	pages.OpenClient OpenClient = new pages.OpenClient(driver);		
	OpenClient.Click_ClientsClick();
	OpenClient.Enter_EnterClientName(data[4]);
	OpenClient.Click_ClickSearch();
	OpenClient.Click_ClickClient();		

	PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
	verify.verifyAllRowsLoadedByScrolling();
	
	pages.PayrollRun payroll= new pages.PayrollRun (driver);
	payroll.runPayroll();
	verify.verifyAllRowsLoadedByScrollingRunPayrollPage();


}
	
 @Test(priority=2)

public void TC02validateTotalRecordsOnDashboardAndRunPayrollwithOddNumber() throws Exception {

	sTestCaseID = "TC049";
	Sheet = "PayrollDashboardCalculations";
	data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
	pages.loginpage4  loginpage = new pages.loginpage4(driver);

	loginpage.GoToUrl();	
	loginpage.AssertUrl();
	loginpage.Enter_EnterUsername(data[1]);
	loginpage.Enter_Enterpassword(data[2]);
	loginpage.Click_LoginButton();

	pages.agentpage agentpage = new pages.agentpage(driver);
	agentpage.Enter_SearchAgentName("AutomationTester");
	agentpage.Click_ClickSearch();
	agentpage.Click_ClickAgent();
	
	
	pages.OpenClient OpenClient = new pages.OpenClient(driver);		
	OpenClient.Click_ClientsClick();
	OpenClient.Enter_EnterClientName("ygHKVVzVn");
	OpenClient.Click_ClickSearch();
	OpenClient.Click_ClickClient();		

	PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
	verify.verifyAllRowsLoadedByScrolling();
	
	pages.PayrollRun payroll= new pages.PayrollRun (driver);
	payroll.runPayroll();
	verify.verifyAllRowsLoadedByScrollingRunPayrollPage();


}
}
