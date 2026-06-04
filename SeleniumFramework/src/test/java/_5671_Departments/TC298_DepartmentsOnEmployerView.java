package _5671_Departments;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC298_DepartmentsOnEmployerView  extends TestBase{

	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC_01validateDepartmentsOnEmployerView() throws Exception {

		sTestCaseID = "TC298";
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

     

		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();
		filling.selectStatus(data[5]);
		filling.clickCheckBox();
		filling.enterNotes();
		filling.clickNottoSubmit();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		verify.verifyDepartmentsOnEmployerView(data[6], data[7]);
		verify.assertAll();
	}	
	
	
	
	@Test(priority=2)

	public void TC_02validateDepartmentIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		page.selectEmployee(data[8]);
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[6]);
		
		page.selectEmployee(data[9]);
		
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[7]);

		verify.assertAll();

	}	
	
	
	
	@Test(priority=3)

	public void TC_03validateDepartmentIndividualEmployeePayScheduleExportToPdf() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		page.selectEmployee(data[8]);
		verify.VerifyDepartmentOnIEPScheduleExportToPdf(data[10],data[6]);
		
		page.selectEmployee(data[9]);
		
		verify.VerifyDepartmentOnIEPScheduleExportToPdf(data[11],data[7]);

		verify.assertAll();

	}	
	
	
	@Test(priority=4)

	public void TC_04validateDepartmentIndividualEmployeePayScheduleExportToCsv() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		page.selectEmployee(data[8]);

		verify.ReadCSVFile(data[12],data[6]);
	 		
		page.selectEmployee(data[9]);
		verify.ReadCSVFile(data[13],data[7]);
		verify.deletCsv(data[12], data[13]);


		verify.assertAll();

	}	
	
	
	
	@Test(priority=5)

	public void TC_05validateDepartmentonPayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Payroll_Reporting_Period_Summary();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.verifyDepartmentsPayrollReportingPeriodSummary(data[6],data[7]);

		verify.assertAll();

	}	
	
	
	@Test(priority=6)

	public void TC_06validateDepartmentonPayrollReportingPeriodSummaryExportToPdf() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Payroll_Reporting_Period_Summary();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.VerifyDepartmentOnPayrollReportingPeriodSummaryExportToPdf(data[6], data[7]);

		verify.assertAll();

	}	
	
	
	@Test(priority=7)

	public void TC_07validateDepartmentonPayrollReportingPeriodSummaryExportToCsv() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Payroll_Reporting_Period_Summary();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.verifyPayrollReportingPeriodSummaryCsv(data[6], data[7]);

		verify.assertAll();

	}	
	
	@Test(priority=8)

	public void TC_08validateDepartmentonPayslip() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Payslipsclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.verifyDepartmentsPayslip(data[6], data[7]);


		verify.assertAll();

	}	
	
	
	@Test(priority=9)

	public void TC_09validateDepartmentonPayslipExportToPdf() throws Exception {

		sTestCaseID = "TC298";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Payslipsclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.VerifyDepartmentOnPayslipReport1(data[7]);


		verify.assertAll();

	}	
}
