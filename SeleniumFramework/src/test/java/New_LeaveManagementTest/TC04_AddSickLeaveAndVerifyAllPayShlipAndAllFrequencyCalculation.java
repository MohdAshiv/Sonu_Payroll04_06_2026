package New_LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC04_AddSickLeaveAndVerifyAllPayShlipAndAllFrequencyCalculation extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_verifySickLeaveTypeDataFor2Days() throws Exception {

		sTestCaseID = "TC04";
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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[9]);
		leaves.Enter_LeaverEndDateSick(data[10]);
		leaves.Enter_AWESick("200");
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[10]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[41], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[34], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[30], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[10], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[18], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
	//	leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}
	

	@Test(priority = 1)
	public void TC02_verifyHalfSickLeaveTypeDataFor5Days() throws Exception {

		sTestCaseID = "TC04";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[11]);
		leaves.Enter_LeaverEndDateSick(data[12]);
		leaves.Enter_AWESick("200");
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		
		
	
		String Date = leaves.ChangeDateFormat(data[11]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[12]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[40], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[34], 2, 4);

		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
		// leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[30], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);

		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[11], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[12], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[28], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[22], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		// leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();

		
		leaves.assertAll();

	}
	
	@Test(priority = 2)
	public void TC03_verifySickLeaveTypeDataFor1Days() throws Exception {

		sTestCaseID = "TC04";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[14]);
		leaves.Enter_LeaverEndDateSick(data[15]);
		leaves.Enter_AWESick("200");
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		

		String Date = leaves.ChangeDateFormat(data[14]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[15]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[23], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[34], 2, 4);

		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
		// leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[30], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);

		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[14], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[15], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[29], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[27], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		// leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();

		leaves.assertAll();


	}

	
	
	@Test(priority = 3)
	public void TC04_verifySickLeaveAttachment() throws Exception {

		sTestCaseID = "TC04";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[14]);
		leaves.Enter_LeaverEndDateSick(data[15]);
		leaves.enter_NoticePeriodDayesInSick(data[32]);
		leaves.Enter_AWESick("200");
		leaves.chk_EligiblForSSPInSick();
		String loc = System.getProperty("user.dir") + "\\TestData\\" + "\\";
		leaves.chooseFileSickLeave(loc+"Mr. Employee.pdf");
		leaves.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		

		String Date = leaves.ChangeDateFormat(data[14]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[15]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[23], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[34], 2, 4);

		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
		// leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[30], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);

		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[14], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[15], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[29], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[27], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	    leaves.verifyAttechmentLeaveApprovedData("Attachment", "Mr. Employee.pdf", 2, 7);
		// leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();

		leaves.assertAll();

	}
	
	
	@Test(priority = 4)
	public void TC05_verifyPayslipForSickLeaveTypeDataFor2Days() throws Exception {

		sTestCaseID = "TC04";
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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[45]);
		leaves.Enter_LeaverEndDateSick(data[46]);
		leaves.Enter_AWESick("200");
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[45]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[46]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[41], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[34], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[30], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[45], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[46], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[18], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
	//	leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 0, data[30],2);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 1, data[33],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 2, data[30],10);
		
		
		
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 0, data[30],2);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 1, data[33],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 2, data[30],10);
		
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 34, data[30],0);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 35, data[33],0);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 36, data[30],0);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
		
	}
	
	
	
	
	@Test(priority = 5)
	public void TC06_verifyCalucationOfSickLeaveTypeDataFor14Days() throws Exception {

		sTestCaseID = "TC04";
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
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		String WeeklySSPRate = leaves.GetSSPAmount(data[54]);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[50]);
		leaves.Enter_LeaverEndDateSick(data[51]);
		leaves.Enter_AWESick("600");
		//leaves.chk_EligiblForSSPInSick();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[55]);
	//	leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7]);
		leaves.SSPSelectTaxYear(data[54]);
		leaves.verifySSPLeaveCalucationInReport(WeeklySSPRate,data[50],data[51]);
		leaves.assertAll();
		
		leaves.assertAll();
	}
	
	
	@Test(priority = 6)
	public void TC07_verifyWeeklyCalucationOfSickLeaveTypeDataFor14Days() throws Exception {

		sTestCaseID = "TC04";
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
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		String WeeklySSPRate = leaves.GetSSPAmount(data[54]);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[8]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[50]);
		leaves.Enter_LeaverEndDateSick(data[51]);
		leaves.Enter_AWESick("600");
	//	leaves.chk_EligiblForSSPInSick();
		leaves.clickSaveBtn();
		
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		payroll.Run_Payroll();
		payroll.Run_Payroll();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[55]);
	//	leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7]);
		leaves.SSPSelectTaxYear(data[54]);

		leaves.verifySSPLeaveCalucationInReport(WeeklySSPRate,data[50],data[51]);
		leaves.assertAll();
		
		leaves.assertAll();
	}
	
	
	@Test(priority = 7)
	public void TC08_verifyFortnightlyCalucationOfSickLeaveTypeDataFor14Days() throws Exception {

		sTestCaseID = "TC04";
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
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		String WeeklySSPRate = leaves.GetSSPAmount(data[54]);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[5]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[50]);
		leaves.Enter_LeaverEndDateSick(data[51]);
		//leaves.chk_EligiblForSSPInSick();
		leaves.Enter_AWESick("600");
		leaves.clickSaveBtn();
		
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		payroll.Run_Payroll();
	
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[55]);
	//	leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7]);
		leaves.SSPSelectTaxYear(data[54]);

		leaves.verifySSPLeaveCalucationInReport(WeeklySSPRate,data[50],data[51]);
		leaves.assertAll();
		
		leaves.assertAll();
	}
	
	@Test(priority = 8)
	public void TC09_verifyFourWeeklyCalucationOfSickLeaveTypeDataFor14Days() throws Exception {

		sTestCaseID = "TC04";
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
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		String WeeklySSPRate = leaves.GetSSPAmount(data[54]);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[50]);
		leaves.Enter_LeaverEndDateSick(data[51]);
	//	leaves.chk_EligiblForSSPInSick();
		leaves.Enter_AWESick("600");
		leaves.clickSaveBtn();
		
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		payroll.Run_Payroll();
	
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[55]);
	//	leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7]);
		leaves.SSPSelectTaxYear(data[54]);

		leaves.verifySSPLeaveCalucationInReport(WeeklySSPRate,data[50],data[51]);
		leaves.assertAll();
		
		leaves.assertAll();
	}
	@Test(priority = 9)
	public void TC10_verifyAnnuallyCalucationOfSickLeaveTypeDataFor14Days() throws Exception {

		sTestCaseID = "TC04";
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
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		String WeeklySSPRate = leaves.GetSSPAmount(data[54]);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[17]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[50]);
		leaves.Enter_LeaverEndDateSick(data[51]);
	//	leaves.chk_EligiblForSSPInSick();
		leaves.Enter_AWESick("600");
		leaves.clickSaveBtn();
		
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		
	
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[55]);
	//	leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7]);
		leaves.verifySSPLeaveCalucationInReport(WeeklySSPRate,data[50],data[51]);
		leaves.assertAll();
		
	}
	
	
	@Test(priority = 10)
	public void TC11_verifyEnterManualAmountRunPayrollTimeInSickLeaveType() throws Exception {

		sTestCaseID = "TC04";
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
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		leaves.ChangeDateFormat(data[9]);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[50]);
		leaves.Enter_LeaverEndDateSick(data[51]);
	//	leaves.chk_EligiblForSSPInSick();
		leaves.Enter_AWESick("600");
		leaves.clickSaveBtn();
		
		payroll.Run_PayrollWithEditAmount("SSP", "700");
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[55]);
	//	leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7]);
		leaves.verifyAmountForSickLeaveInReport("700",data[50],data[51]);
		leaves.assertAll();
		
		leaves.assertAll();
	}
	
}
