package _5671_Departments;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC297_Payslip_Departments extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateDepartmentOnPayslip() throws Exception {

		sTestCaseID = "TC297";
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
		report.Click_Payslipsclick();
		
		verify.verifyDepartmentsPayslip(data[6], data[5]);
		
		verify.assertAll();
	  
}		
	
	
	

	@Test(priority=2)

	public void validateDepartmentOnEmployeeDetailListExportToPdf() throws Exception {

		sTestCaseID = "TC296";
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
		report.Click_Payslipsclick();
		_5671Departments_Page.DepartmentsPage page= new _5671Departments_Page.DepartmentsPage(driver);

		verify.VerifyDepartmentOnPayslipReport(data[6]);
		
		verify.assertAll();
	  
}
	
}
