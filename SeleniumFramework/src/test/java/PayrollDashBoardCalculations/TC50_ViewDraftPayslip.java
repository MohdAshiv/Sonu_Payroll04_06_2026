package PayrollDashBoardCalculations;
import org.testng.annotations.Test;
import tests.TestBase;
import utilities.ExcelData;

public class TC50_ViewDraftPayslip extends TestBase  {
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
    @Test(priority=1)

public void TC01validateViewDraftPayslip() throws Exception {

	sTestCaseID = "TC050";
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
	agentpage.Click_ClickAgent();
	
	
	pages.OpenClient OpenClient = new pages.OpenClient(driver);		
	OpenClient.Click_ClientsClick();
	OpenClient.Enter_EnterClientName(data[4]);
	OpenClient.Click_ClickSearch();
	OpenClient.Click_ClickClient();		

	pages.PayrollRun payroll= new pages.PayrollRun (driver);
	payroll.clickViewDraftPayslip();
	PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
	verify.selectAllEmployeeCheckboxes();
	verify.verifyViewDraftPayslipEmployeeSearch("A");
	verify.verifyViewDraftPayslipEmployeeSearch("E");
	payroll.selectNumberOfEmployess(5,"//*[@id='chkAll']");
	verify.verifyDraftPayslipPdfOpened(5);

}

}
