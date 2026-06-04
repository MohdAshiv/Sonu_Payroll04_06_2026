package _5671_Departments;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC294_Department_ReportSection extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateDepartmentOnPayrollSummary() throws Exception {

		sTestCaseID = "TC294";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		
		company.clickDepartment();
		company.enterDepartmentName1(data[5]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(9000);
		
		company.clickDepartment();
		company.enterDepartmentName1(data[6]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(9000);

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();

		pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);

		edit.clickEmployeeName();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectDepartment(data[6]);
		edit.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		
		edit.clickEmployeeName1();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[5]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		verify.verifyDepartmentsPayrollSummary(data[6], data[5]);
		
	
		verify.assertAll();
	  
}	
	
	
	

	@Test(priority=2)

	public void validateDepartmentOnPayrollSummaryExportToPdf() throws Exception {

		sTestCaseID = "TC294";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_5671Departments_Page.DepartmentsPage page= new _5671Departments_Page.DepartmentsPage(driver);

		 _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
	        
		 file.clickPayrollSummaryPdf();
		verify.VerifyDepartmentOnPayrollSummaryExportToPdf(data[5], data[6]);
		
		
		verify.assertAll();
	  
}
	
	
	
	
	@Test(priority=3)

	public void validateDepartmentOnPayrollSummaryExportToCsv() throws Exception {

		sTestCaseID = "TC294";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_5671Departments_Page.DepartmentsPage page= new _5671Departments_Page.DepartmentsPage(driver);

		 _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
	        
		 file.clickPayrollSummaryCsv();
		verify.verifyPayrollSummaryCsv(data[5], data[6]);
		
		
		verify.assertAll();
	  
}
	
	
	

	@Test(priority=4)

	public void validateDepartmentOnP11() throws Exception {

		sTestCaseID = "TC294";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_P45Forms();
		_5671Departments_Page.DepartmentsPage page= new _5671Departments_Page.DepartmentsPage(driver);

		
		
		pages.EmailSection email= new pages.EmailSection(driver);

		 _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
	        
		email.selectForm(data[19]);
		verify.verifyDepartmentOnP11D(data[6]);
		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();
		
		payroll.Undo_LastPayroll();
		 company.Click_gotoEditCompany();
			
	    company.Click_clickDepartments();
	    
		for(int i=0;i<=1;i++) {verify.verifyDepartmentDeletMsg1(data[7]); Thread.sleep(7000);}
		verify.assertAll();
	  
		verify.assertAll();
	  
}
	
	
	
	@Test(priority=5)

	public void validateDepartmentOnIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC294";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		
		company.clickDepartment();
		company.enterDepartmentName1(data[5]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(7000);
		
		company.clickDepartment();
		company.enterDepartmentName1(data[6]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(7000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();

		pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);

		edit.clickEmployeeName();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectDepartment(data[6]);
		edit.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		
		edit.clickEmployeeName1();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[5]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Individual_Employee_Pay_Scheduleclick();
		
		page.selectEmployee(data[8]);
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[6]);
		
		page.selectEmployee(data[9]);
		
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[5]);

		verify.assertAll();
	  
}	
	
	
	@Test(priority=6)

	public void validateDepartmentOnIndividualEmployeePayScheduleExportToPdf() throws Exception {

		sTestCaseID = "TC294";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.DepartmentsPage page= new _5671Departments_Page.DepartmentsPage(driver);

		page.selectEmployee(data[8]);

		verify.VerifyDepartmentOnIEPScheduleExportToPdf(data[10],data[6]);
		
		page.selectEmployee(data[9]);
		verify.VerifyDepartmentOnIEPScheduleExportToPdf(data[11],data[5]);

		verify.assertAll();
	  
}
	
	@Test(priority=7)

	public void validateDepartmentOnIndividualEmployeePayScheduleExportToCsv() throws Exception {

		sTestCaseID = "TC294";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.DepartmentsPage page= new _5671Departments_Page.DepartmentsPage(driver);

		page.selectEmployee(data[8]);

		verify.ReadCSVFile(data[12],data[6]);
	 
		page.selectEmployee(data[9]);
		verify.ReadCSVFile(data[13],data[5]);

		verify.deletCsv(data[12], data[13]);
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.scrollClickPayrollDashboard();
		
		payroll.Undo_LastPayroll();
		 company.Click_gotoEditCompany();
			
	    company.Click_clickDepartments();
	    
		for(int i=0;i<=1;i++) {verify.verifyDepartmentDeletMsg1(data[7]); Thread.sleep(7000);}
		verify.assertAll();
	  
}
}
