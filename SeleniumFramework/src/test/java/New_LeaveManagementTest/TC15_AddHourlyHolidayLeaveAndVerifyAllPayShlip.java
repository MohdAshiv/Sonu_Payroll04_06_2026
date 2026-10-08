package New_LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC15_AddHourlyHolidayLeaveAndVerifyAllPayShlip extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_verifyHourlyHolidaysLeaveTypeDataFor4Hours() throws Exception {

		sTestCaseID = "TC11";
		Sheet = "Sheet10";
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
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.enter_LeaveDate(data[9]);
		leaves.enter_LeaveEndDate(data[9]);
		leaves.enter_LeaveHour(data[55]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[55], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[57], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[33], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[58], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[63], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[33], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[57], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[56], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[41], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
	//	leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}
	

	@Test(priority = 1)
	public void TC02_verifyHalfHolidaysLeaveTypeDataFor7Hours() throws Exception {

		sTestCaseID = "TC11";
		Sheet = "Sheet10";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.enter_LeaveDate(data[9]);
		leaves.enter_LeaveHour(data[59]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[59], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[58], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[33], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[58], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[62], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[33], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[61], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[60], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[41], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
	//	leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();

	}
	
	@Test(priority = 0)
	public void TC03_verifyAddMultipleHourlyHolidaysLeaveTypeDataFor4Hours() throws Exception {

		sTestCaseID = "TC11";
		Sheet = "Sheet10";
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
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.enter_LeaveDate(data[9]);
		leaves.enter_LeaveHour(data[55]);
		leaves.clickOnAddMultipleLeaveButton();
		leaves.enter_LeaveDate2(data[10]);
		leaves.enter_LeaveHour2(data[55]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[55], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[57], 2, 4);
		
		String Date3 = leaves.ChangeDateFormat(data[10]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date2", Date, 3, 0);
		String Date4 = leaves.ChangeDateFormat(data[10]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date2", Date2, 3, 1);
		leaves.verifyLeaveDataInEmployeePage("Days2", data[55], 3, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type2", data[5], 3, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance2", data[64], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[33], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[58], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[65], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[33], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[64], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[56], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[41], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 3, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[10], 3, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[10], 3, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[5], 3, 3);
		leaves.verifyLeaveApprovedData("Duration", data[56], 3, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[41], 3, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 3, 6);
		
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}
	
	@Test(priority = 3)
	public void TC04_verifyPayslipForHolidaysLeaveTypeOf2Days() throws Exception {

		sTestCaseID = "TC11";
		Sheet = "Sheet10";
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
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		 
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.enter_LeaveDate(data[9]);
		leaves.enter_LeaveHour(data[55]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		
	
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.SelectedPatslipTemplete("Green");
		company.Click_ClickSave();
		
		pages.reports _rep=new pages.reports(driver);
		_rep.Click__Reports_();
		_rep.Click_Payslipsclick();
		_rep.click_Regenerate();
		
		
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		
		leaves.DeleteCSv_PDF();
		leaves.downloadPayShipByIndexPDF("1");
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 0, data[58]);
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 1, data[63]);
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 2, data[57]);
		
		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.SelectedPatslipTemplete("Blue");
		company.Click_ClickSave();
		
		
		_rep.Click__Reports_();
		_rep.Click_Payslipsclick();
		_rep.click_Regenerate();
		
		
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		
		leaves.DeleteCSv_PDF();
		leaves.downloadPayShipByIndexPDF("1");
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 0, data[58]);
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 1, data[63]);
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 2, data[57]);
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.SelectedPatslipTemplete("Pink");
		company.Click_ClickSave();
		
		_rep.Click__Reports_();
		_rep.Click_Payslipsclick();
		_rep.click_Regenerate();
		
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		
		leaves.DeleteCSv_PDF();
		leaves.downloadPayShipByIndexPDF("1");
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 0, data[58]);
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 1, data[63]);
		leaves.ReadFullHours_FilletedPDFReportofDividentVoucher(1, 1, 2, data[57]);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}

}
