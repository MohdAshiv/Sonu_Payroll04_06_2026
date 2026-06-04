package SmokeTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC732_ExistingCompanyAccessibleAndLoginSuccessful extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateCompanyShoudAccessibleFromDashBoard() throws Exception {

		sTestCaseID = "TC732";
		Sheet = "Sheet6";
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

		pages.CreateClient buisness= new pages.CreateClient (driver);
	
		buisness.clickPayroll();

		buisness.clickDashBoard();
		buisness.searchClient1();
		
	
		SmokePage.VerifyData verify= new SmokePage.VerifyData(driver);
		
		verify.verifyLimitedCompany1(data[4]);
		
		verify.assertAll();
	
}		
	
	

	@Test(priority=2)
	public void TC02validateCompanyShoudAccessibleFromClient() throws Exception {

		sTestCaseID = "TC732";
		Sheet = "Sheet6";
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
		OpenClient.Click_ClickClient1();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		
		SmokePage.VerifyData verify= new SmokePage.VerifyData(driver);
		
		verify.verifyLimitedCompany1(data[4]);
		
		verify.assertAll();
	
}	
	

	@Test(priority=3)
	public void TC03validateLoginSuccesful() throws Exception {

		sTestCaseID = "TC732";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();
		
		SmokePage.VerifyData verify= new SmokePage.VerifyData(driver);
		
		verify.verifyLimitedCompany1(data[5]);
		
		verify.assertAll();
	
}	
}
