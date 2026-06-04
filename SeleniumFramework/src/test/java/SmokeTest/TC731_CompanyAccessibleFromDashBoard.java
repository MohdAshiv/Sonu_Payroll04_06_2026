package SmokeTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC731_CompanyAccessibleFromDashBoard extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateLimitedCompany() throws Exception {

		sTestCaseID = "TC731";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		buisness.clickPayroll();
		buisness.clickDashBoard();
		buisness.searchClient();
		
	
		SmokePage.VerifyData verify= new SmokePage.VerifyData(driver);
		
		verify.verifyLimitedCompany();
		
		verify.assertAll();
	
}		
	
	@Test(priority=2)
	public void TC02validateSoleTrader() throws Exception {

		sTestCaseID = "TC731";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickSoleTrader();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterUtrNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		
		buisness.clickPayroll();
		buisness.clickDashBoard();
		buisness.searchClient();
		
		SmokePage.VerifyData verify= new SmokePage.VerifyData(driver);
		verify.verifyLimitedCompany();
		
		verify.assertAll();
	
}	
	

	@Test(priority=3)
	public void TC03validateLimitedLiablityPartnership() throws Exception {

		sTestCaseID = "TC731";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedLiablityPartnership();
		
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterLiablityPartnershipUtrNo();
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDateLimitedLiablity(data[58]);
		
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.enterFirstName1();
		buisness.enterLastName1();
		buisness.clickSaveBtn();
		

		buisness.clickPayroll();
		buisness.clickDashBoard();
		buisness.searchClient();
	
		SmokePage.VerifyData verify= new SmokePage.VerifyData(driver);
		
		verify.verifyLimitedCompany();
		
		verify.assertAll();
	
}	
	
	@Test(priority=4)
	public void TC04validatePublicLimitedCompany() throws Exception {

		sTestCaseID = "TC731";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickPublicLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		

		buisness.clickPayroll();
		buisness.clickDashBoard();
		buisness.searchClient();
		
		SmokePage.VerifyData verify= new SmokePage.VerifyData(driver);
		
		verify.verifyLimitedCompany();
		
		verify.assertAll();
	
}	
}
