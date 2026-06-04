package _8658_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC713_P45ReportCheckBox_Pagination extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	@Test(priority=1)
	public void TC01validateP45CheckBoxShouldUncheckBydefaultEmployer() throws Exception {
		sTestCaseID = "TC713";
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
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
	//	for(int i=0;i<=1;i++) {payroll.Run_Payroll();}
		
		report.Click__Reports_();
		
		report.Click_P45Forms();
		
		report.Select_SelectP45Form(data[5]);

		System.out.println("knckd");
		
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxUntick();
		
	   verify .assertAll();
	
	}
	
	
	
	@Test(priority=2)
	public void TC02validateP45CheckBoxShouldCheckBydefaultEmployer() throws Exception {
		sTestCaseID = "TC713";
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
	    
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		report.Click__Reports_();
		
		report.Click_P45Forms();
		
		report.Select_SelectP45Form(data[5]);

		System.out.println("knckd");
		
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxTickP45();
		
	   verify .assertAll();
	
		
	}
	
	
	@Test(priority=3)
	public void TC03validateP45CheckBoxShouldUncheckBydefaultEmployees() throws Exception {
		sTestCaseID = "TC713";
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
	    
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		
		report.Click__Reports_();
		
		report.Click_P45Forms();
		
		report.Select_SelectP45Form(data[5]);

		 
		pages.EmailSection email= new pages.EmailSection(driver);

	    email.selectEmailType(data[7]);

		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxUntick();
		
	   verify .assertAll();
	
	}
	
	@Test(priority=4)
	public void TC04validateP45CheckBoxShouldCheckBydefaultEmployees() throws Exception {
		sTestCaseID = "TC713";
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
	    
		
		report.Click__Reports_();
		
		report.Click_P45Forms();
		
		report.Select_SelectP45Form(data[5]);
		pages.EmailSection email = new pages.EmailSection(driver);

		email.selectEmailType(data[7]);

		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		verify.PageNavigationWithCheckboxTickP45();
		
	   verify .assertAll();
	
		
	}
	
	

	@Test(priority=5)
	public void TC05validateP45EmailSentToEmployer() throws Exception {
		sTestCaseID = "TC713";
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
		report.Click__Reports_();
		report.Click_P45Forms();
		
		report.Select_SelectP45Form(data[5]);
		pages.EmailSection email = new pages.EmailSection(driver);
		email.clickP45CheckBox();

		email.clickEmailBtnP45();
		email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.verifyP45forEmployer(104);
	     verify .assertAll();
		
	}
	
	
	@Test(priority=6)
	public void TC06validateP45EmailSentToEmployee() throws Exception {
		sTestCaseID = "TC713";
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
		report.Click__Reports_();
		report.Click_P45Forms();
		
		report.Select_SelectP45Form(data[5]);
		pages.EmailSection email = new pages.EmailSection(driver);
		
		email.clickP45CheckBox();
		email.selectEmailType(data[7]);
		email.clickEmailBtnP45();
		email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);

		 verify.verifyRecievedP45();
		 verify.verifyRecievedP45();
		 verify.verifyRecievedP45For12Employee();
	     verify .assertAll();
	
	}
	

	@Test(priority=7)
	public void TC07validateP45EmailSentToEmployerForSelectedEmployees() throws Exception {
		sTestCaseID = "TC713";
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
		report.Click__Reports_();
		report.Click_P45Forms();
		report.Select_SelectP45Form(data[5]);
		
		_8658_Page.Page8658 page= new _8658_Page.Page8658(driver);
		page.SelectFirstEmployeeFromEveryPageP45();
		pages.EmailSection email = new pages.EmailSection(driver);

		email.clickEmailBtnP45(); 
		email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	    
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.verifyP45forEmployer(6);
	     verify .assertAll();
	
	}
	
	
	@Test(priority=8)
	public void TC08validateP45EmailSentToEmployeeForSelectedEmployees() throws Exception {
		sTestCaseID = "TC713";
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
		report.Click__Reports_();
		report.Click_P45Forms();
		report.Select_SelectP45Form(data[5]);
		
		_8658_Page.Page8658 page= new _8658_Page.Page8658(driver);
		page.SelectFirstEmployeeFromEveryPageP45();
		pages.EmailSection email = new pages.EmailSection(driver);

		email.selectEmailType(data[7]);

		email.clickEmailBtnP45(); 
		email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	    
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.verifyRecievedP45For3Employee();
	     verify .assertAll();
	
	}
	
	

	@Test(priority=9)
	public void TC09validateP45CheckBoxShouldNotTickAutomaticIfEmailTypeChange() throws Exception {
		sTestCaseID = "TC713";
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
		
		report.Click__Reports_();
		report.Click_P45Forms();
		
		report.Select_SelectP45Form(data[5]);
		pages.EmailSection email = new pages.EmailSection(driver);

		email.clickP45CheckBox();
		
		_8658_Page.Page8658 page= new _8658_Page.Page8658(driver);
		page.untickFirstEmployeeP45();
		email.selectEmailType(data[7]);
		_8658_Page.VerifyData verify= new _8658_Page.VerifyData (driver);
		 verify.UntickOnlyOneEmployee();
	     verify .assertAll();
	
		
	}
	
	
	
}
