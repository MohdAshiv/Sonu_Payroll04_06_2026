package _5671_Departments;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC300_MultipleDepartments  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC_01validateMultipleDepartmentsOnPayrollDashBoard() throws Exception {

		sTestCaseID = "TC300";
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
		
		for(int i=5; i<=14;i++)
		{
			company.clickDepartment();
			company.enterDepartmentName1(data[i]);
			company.clickDepatrmentSaveBtn();
			Thread.sleep(7000);
		}
	
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();

		pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);

		edit.clickEmployeeName();
		edit.editEmployeeDetails();

		edit.click_Paydetails();

		page.selectDepartment(data[5]);
		edit.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		
		edit.clickEmployeeName1();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[6]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		edit.clickEmployeeName2();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[7]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		edit.clickEmployeeName3();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[8]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		edit.clickEmployeeName4();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[9]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		edit.clickEmployeeName5();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[10]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		edit.clickEmployeeName6();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[11]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		edit.clickEmployeeName7();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[12]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		edit.clickEmployeeName8();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[13]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
	
		
		edit.clickEmployeeName9();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[14]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		
		
		verify.verifyMulipleDepartments(data[5], data[6], data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14]);
		
		verify.assertAll();
	  
}	
	
	

	@Test(priority=2)

	public void TC_02validateMultipleDepartmentsOnPayrollSummary() throws Exception {

		sTestCaseID = "TC300";
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

		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		verify.verifyMultipleDepartmentsPayrollSummary(data[5], data[6], data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14]);
		
		verify.assertAll();
		
	}
	
	
	
	

	@Test(priority=3)

	public void TC_03validateMultipleDepartmentsOnPayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC300";
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

		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payroll_Reporting_Period_Summary();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		verify.verifyMulipleDepartmentsPayrollReportingPeriodSummary(data[6], data[7], data[9], data[10], data[5], data[8], data[11], data[12], data[13], data[14]);
		
		verify.assertAll();
		
	}
	
	
	@Test(priority=4)

	public void TC_04validateDepartmentOnIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC300";
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

	
		pages.PayrollRun payroll = new pages.PayrollRun(driver);


		pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);

		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Individual_Employee_Pay_Scheduleclick();
		
		page.selectEmployee(data[16]);
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[5]);
		
		page.selectEmployee(data[17]);
		
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[6]);

		page.selectEmployee(data[18]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[7]);

		page.selectEmployee(data[19]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[8]);

		page.selectEmployee(data[20]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[9]);

		page.selectEmployee(data[21]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[10]);

		page.selectEmployee(data[22]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[11]);

		page.selectEmployee(data[23]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[12]);

		page.selectEmployee(data[24]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[13]);

		page.selectEmployee(data[25]);

		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[14]);

		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		

	   	company.Click_gotoEditCompany();
		company.Click_clickDepartments();
		    
		for(int i=0;i<=9;i++) {verify.verifyDepartmentDeletMsg1(data[15]); Thread.sleep(7000);}
		verify.assertAll();
	  
}	
	
	
}
