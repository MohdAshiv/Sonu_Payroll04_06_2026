package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC281_OffPayWorker_Cumulative_RunPauroll12 extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerTaxPayment() throws Exception {

		sTestCaseID = "TC281";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.enterTaxCode(data[5]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[6]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
	    pages.EditCompany company= new pages.EditCompany(driver);
	   
	    edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		
		edit.enterTaxCode(data[15]);
		edit.clickYesDirector();
		edit.enter_DirectorFromDate(data[7]);
		edit.select_NI_CalculationMethod(data[8]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary2(data[9]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		for (int i = 0; i <= 3; i++) {payroll.Run_Payroll();}

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
		company.clickEnabledEmployementAllownaces();

		company.Click_ClickSave();
		payroll.Click_PayrollDashboard();
		
		for (int i = 0; i <= 7; i++) {payroll.Run_Payroll();}
		
	

	    pages.reports report= new pages.reports(driver);
	    report.clickTaxPayment();
	  
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyTaxPaymentReport(data[10],data[11],data[12],data[13]);
   	    utilities.TakeScreenshot.Getscreenshot("TC281_ validateOffPayWorkerTaxPayment ", "5630", driver);



		verify.assertAll();
}	
	
	
	@Test(priority=2)

	public void validateOffPayWorkerPayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC281";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
		
	    pages.EditCompany company= new pages.EditCompany(driver);
	  
	  
	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Reporting_Period_Summary();
	  
	  
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyPayrollReportingPeriodSummary(data[10],data[11],data[12],data[47]);
		verify.assertAll();
	}
	
	@Test(priority=3)

	public void validateP60OffPayWorker() throws Exception {

		sTestCaseID = "TC281";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	   
		
	    pages.EditCompany company= new pages.EditCompany(driver);
	  
	
	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	  
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickP60PdfIcn();
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		verify.verifyP60OffPayWorker(data[16], data[17], data[18], data[19],data[20],data[21]);

		verify.assertAll();
}	
	
	
	@Test(priority=4)

	public void validateP60Director() throws Exception {

		sTestCaseID = "TC281";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	  
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickP60PdfIcn2();
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		verify.verifyP60Director(data[22], data[23], data[24], data[25],data[26],data[27]);
	
		verify.assertAll();
	}
	
	
	
	
	@Test(priority=5)

	public void validateXML() throws Exception {

		sTestCaseID = "TC281";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    pages.FilingManagement filling= new pages.FilingManagement(driver);
	    
	    filling.Click_gotoFilingManagement();
	   
	  
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickFps();
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	   
	    verify.getXMLData();
	    verify.verifyXMLOffPayWorker(data[28], data[29], data[30], data[31], data[32], data[33], data[34], data[35], data[36],data[37]);
	    page.clickFps();
	    verify.getXMLData();
	    verify.verifyXMLDirector(data[38], data[39], data[40], data[41], data[42], data[43], data[44], data[45], data[46]);
	    
	    payroll.scrollClickPayrollDashboard();


		for (int i = 0; i <= 11; i++) {	payroll.Undo_LastPayroll(); Thread.sleep(1000);}
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();

		payroll.Click_PayrollDashboard();
	    pages.EditCompany company= new pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickNoEmployementAllownaces();
		company.Click_ClickSave();
		payroll.Click_PayrollDashboard();

		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoDirector();
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[14]);
		edit.clickSaveBtn();
	    verify.assertAll();
	
}
}
