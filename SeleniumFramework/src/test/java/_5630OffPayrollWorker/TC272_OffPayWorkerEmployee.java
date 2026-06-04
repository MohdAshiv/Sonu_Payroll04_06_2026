package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC272_OffPayWorkerEmployee extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerTaxPayment() throws Exception {

		sTestCaseID = "TC272";
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
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	    
	    company.Click_ClickSave();
	    
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Run_Payroll();
	    pages.reports report= new pages.reports(driver);
	    report.clickTaxPayment();
	  
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyTaxPaymentReport(data[7],data[8],data[9],data[10]);
		
//		payroll.Click_PayrollDashboard();
//		
//		payroll.Undo_LastPayroll();
//        edit.clickEmployeeName();
//		edit.editEmployeeDetails();
//		edit.clickMandotoryPayroll();
//		edit.clickNoOffPayWorker();
//		edit.clickSaveBtn();
//
//		payroll.Click_PayrollDashboard();
//
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		company.Click_AllowancesSchemes();
//      	company.clickNoEmployementAllownaces();
//      	company.Click_ClickSave();
		verify.assertAll();
}
	

	@Test(priority=2)

	public void validateOffPayWorkerIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC272";
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
	    report.Click_Individual_Employee_Pay_Scheduleclick();
	  
	  
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyIndividualPaySchedule(data[7],data[8],data[9],data[11]);
		
//		payroll.Click_PayrollDashboard();
//		payroll.Undo_LastPayroll();
//        edit.clickEmployeeName();
//		edit.editEmployeeDetails();
//		edit.clickMandotoryPayroll();
//		edit.clickNoOffPayWorker();
//		edit.clickSaveBtn();
//		payroll.Click_PayrollDashboard();
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		company.Click_AllowancesSchemes();
//      	company.clickNoEmployementAllownaces();
//      	company.Click_ClickSave();
		verify.assertAll();
}
	

	@Test(priority=3)

	public void validateOffPayWorkerPayrollSummary() throws Exception {

		sTestCaseID = "TC272";
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
	    report.Click_Payroll_Summary();
	  
	  
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyPayrollSummary(data[7],data[8],data[9],data[11]);
		
//		payroll.Click_PayrollDashboard();
//		payroll.Undo_LastPayroll();
//        edit.clickEmployeeName();
//		edit.editEmployeeDetails();
//		edit.clickMandotoryPayroll();
//		edit.clickNoOffPayWorker();
//		edit.clickSaveBtn();
//		payroll.Click_PayrollDashboard();
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		company.Click_AllowancesSchemes();
//      	company.clickNoEmployementAllownaces();
//      	company.Click_ClickSave();
		verify.assertAll();
}
	
	
	
	@Test(priority=4)

	public void validateXML() throws Exception {

		sTestCaseID = "TC272";
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
	   
	    filling.clickFps();
	 
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	   
	    verify.getXMLData();
	    verify.verifyXMLOffPayWorker(data[12], data[13], data[14], data[15], data[16], data[17], data[18], data[19], data[20],data[21]);
	    verify.assertAll();
	}
	
	@Test(priority=5)

	public void validateOffPayWorkerPayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC272";
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
	
		verify.verifyPayrollReportingPeriodSummary(data[7],data[8],data[9],data[11]);
		
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickNoEmployementAllownaces();
		company.Click_ClickSave();
		verify.assertAll();
}

}
