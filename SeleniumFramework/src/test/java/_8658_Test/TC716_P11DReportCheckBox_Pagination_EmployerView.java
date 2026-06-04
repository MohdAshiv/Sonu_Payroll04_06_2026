package _8658_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC716_P11DReportCheckBox_Pagination_EmployerView extends  TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	@Test(priority=1)
	public void TC01validateP11DCheckBoxShouldUncheckBydefaultEmployer() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		report.Click_P45Forms();
		
		employerView.Select_SelectP45Form(data[5]);
		
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxUntick_P11D();
	    verify .assertAll();
	}	
	
	
	
	@Test(priority=2)
	public void TC02validateP11DCheckBoxShouldCheckBydefaultEmployer() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
		
	    pages.reports report = new pages.reports(driver);
	    
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
		
		report.Click_P45Forms();
		
		employerView.Select_SelectP45Form(data[5]);
		
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxTick_P11D();
		
	     verify .assertAll();
	
	}
	
	
	@Test(priority=3)
	public void TC03validateP11DCheckBoxShouldUncheckBydefaultEmployees() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
	    
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
		report.Click_P45Forms();
		employerView.Select_SelectP45Form(data[5]);

		pages.EmailSection email= new pages.EmailSection(driver);

	    email.selectEmailType(data[7]);

		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxUntick_P11D();
	    verify .assertAll();
	
	}	
	
	@Test(priority=4)
	public void TC04validateP11DCheckBoxShouldCheckBydefaultEmployee() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		
		report.Click_P45Forms();
		employerView.Select_SelectP45Form(data[5]);
		pages.EmailSection email= new pages.EmailSection(driver);

	    email.selectEmailType(data[7]);
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxTick_P11D();
		
	   verify .assertAll();
	
	}
	
	
	@Test(priority=5)
	public void TC05validateP11DEmailSentToEmployer() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
	    
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		report.Click_P45Forms();
		employerView.Select_SelectP45Form(data[5]);
		pages.EmailSection email = new pages.EmailSection(driver);
		email.clickP11DCheckBox();
		email.clickEmailBtnP11D();
		email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.verifyP11DforEmployer(106);
	     verify .assertAll();
	}
	
	
	@Test(priority=6)
	public void TC06validateP11DEmailSentToEmployee() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
	    
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		
		report.Click_P45Forms();
		employerView.Select_SelectP45Form(data[5]);
		pages.EmailSection email = new pages.EmailSection(driver);
		
	    email.selectEmailType(data[7]);
	    email.clickP11DCheckBox();
		email.clickEmailBtnP11D();
		email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.verifyRecievedP11D_EmployerView();
		 verify.verifyRecievedP11D_EmployerView();
		 verify.verifyRecievedP11D12Employee_EmployerView();
	     verify .assertAll();

	}
	
	@Test(priority=7)
	public void TC07validateP11DEmailSentToEmployerForSelectedEmployees() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
		report.Click_P45Forms();
		
		employerView.Select_SelectP45Form(data[5]);
		
		_8658_Page.Page8658 page= new _8658_Page.Page8658(driver);
		page.SelectFirstEmployeeFromEveryPageP11DEmployerView();
		pages.EmailSection email = new pages.EmailSection(driver);

		email.clickEmailBtnP11D();
		email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.verifyP11DforEmployer(8);
	    verify .assertAll();
	}
	
	@Test(priority=8)
	public void TC08validateP11DEmailSentToEmployeeForSelectedEmployees() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
		
		report.Click_P45Forms();
		
		employerView.Select_SelectP45Form(data[5]);
		_8658_Page.Page8658 page= new _8658_Page.Page8658(driver);
		page.SelectFirstEmployeeFromEveryPageP11DEmployerView();
		
		pages.EmailSection email = new pages.EmailSection(driver);
	    email.selectEmailType(data[7]);

	    email.clickEmailBtnP11D(); 
		email.clickSendBtn();

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);

		 verify.verifyRecievedP11D3Employee_EmployerView();

	     verify .assertAll();
	}
	
	@Test(priority=9)
	public void TC09validateP11DCheckBoxShouldNotTickAutomaticIfEmailTypeChange() throws Exception {
		sTestCaseID = "TC716";
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
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
	    _2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		report.Click_P45Forms();

		employerView.Select_SelectP45Form(data[5]);
		pages.EmailSection email = new pages.EmailSection(driver);

		email.clickP11DCheckBox();
		
		_8658_Page.Page8658 page= new _8658_Page.Page8658(driver);
		page.untickFirstEmployeeP11D();
		email.selectEmailType(data[7]);
		
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.UntickOnlyOneEmployeeP11D();
	     verify .assertAll();
	
		
	}
}
