package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC022_13430_P11D_ClickableFunctionality extends TestBase {
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateP11DClickableBuisnessView() throws Exception {

		sTestCaseID = "TC022";
		Sheet = "Sheet7";
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
		
	      pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickP11DEmployeeBtn();
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyP11DemployeeIsClickable(data[6]);
		
		verify.assertAll();

		
}	

	
	@Test(priority=2)

	public void TC02validateP11DClickableEmployerView() throws Exception {

		sTestCaseID = "TC022";
		Sheet = "Sheet7";
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


		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();

		pages.reports report = new pages.reports(driver);
		report.Click_P45Forms();
		
		
		employerView.Select_SelectP45Form(data[5]);
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	     payroll.SelectTaxYear(data[7]);
	 	
	    pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickP11DEmployeeBtn();
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyP11DemployeeIsClickable(data[6]);
		
		verify.assertAll();

}	
	

	@Test(priority=3)

	public void TC03validateP11DClickableEmployeeView() throws Exception {

		sTestCaseID = "TC022";
		Sheet = "Sheet7";
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


		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();

		pages.reports report = new pages.reports(driver);
		report.Click_P45Forms();
		
		
		employerView.Select_SelectP45Form(data[5]);
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	     payroll.SelectTaxYear(data[7]);
	 	
	    pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickP11DEmployeeBtn();
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyP11DemployeeIsClickable(data[6]);
		
		verify.assertAll();

}	
	
	
	

	@Test(priority=4)

	public void TC04validateBuisnessLoginViewP11DClickableEmployerView() throws Exception {

		sTestCaseID = "TC022";
		Sheet = "Sheet7";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[8]);
		loginpage.Enter_Enterpassword(data[9]);
		loginpage.Click_LoginButton();

//		pages.agentpage agentpage = new pages.agentpage(driver);
//		agentpage.Enter_SearchAgentName(data[8]);
//		agentpage.Click_ClickSearch();
//		agentpage.Click_ClickAgent();
//		
//		pages.OpenClient OpenClient = new pages.OpenClient(driver);
//
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[9]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();


		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

	//	employerView.Click_EmployerView();

		employerView.Click__Reports_();

		pages.reports report = new pages.reports(driver);
		report.Click_P45Forms();
		
		
		employerView.Select_SelectP45Form(data[5]);
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	     payroll.SelectTaxYear(data[7]);
	 	
//	    pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickP11DEmployeeBtn();
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyP11DemployeeIsClickable1(data[6]);
		
		verify.assertAll();

}	
	

	@Test(priority=5)

	public void TC05validateBuisnessLoginP11DClickableEmployeeView() throws Exception {

		sTestCaseID = "TC022";
		Sheet = "Sheet7";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[8]);
		loginpage.Enter_Enterpassword(data[9]);
		loginpage.Click_LoginButton();

//	     pages.agentpage agentpage = new pages.agentpage(driver);
//		agentpage.Enter_SearchAgentName(data[8]);
//		agentpage.Click_ClickSearch();
//		agentpage.Click_ClickAgent();
//		
//		pages.OpenClient OpenClient = new pages.OpenClient(driver);

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[9]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();


		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		//employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();

		pages.reports report = new pages.reports(driver);
		report.Click_P45Forms();
		
		
		employerView.Select_SelectP45Form(data[5]);
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	     payroll.SelectTaxYear(data[7]);
	 	
	    pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyP11DemployeeIsClickable1(data[6]);
		
		verify.assertAll();

}	
	

}
