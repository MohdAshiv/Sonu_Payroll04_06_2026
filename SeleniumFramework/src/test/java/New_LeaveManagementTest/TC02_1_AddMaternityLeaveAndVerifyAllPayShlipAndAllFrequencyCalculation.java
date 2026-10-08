package New_LeaveManagementTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC02_1_AddMaternityLeaveAndVerifyAllPayShlipAndAllFrequencyCalculation extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_verifyMaternityLeaveTypeDataFor2weeks() throws Exception {

		sTestCaseID = "TC10";
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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[9]);
		leaves.Enter_ActualBirthDateInMaternity(data[9]);
		leaves.Enter_LeaverStartDate(data[9]);
		leaves.enterMaternityTotalWeeks(data[10]);
		leaves.enterAwe1();
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(Lastdate);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[40], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[30], 2, 4);
		
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
		leaves.verifyLeaveApprovedData("Leave End Date", Lastdate, 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[18], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[10], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
	//	leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}
	
	
	
	

	@Test(priority = 1)
	public void TC02_verifyMaternityLeaveTypeDataFor2weeks() throws Exception {

		sTestCaseID = "TC10";
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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[9]);
		leaves.Enter_ActualBirthDateInMaternity(data[9]);
		leaves.Enter_LeaverStartDate(data[9]);
		leaves.enterMaternityTotalWeeks(data[11]);
		leaves.enterAwe1();
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(Lastdate);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[12], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[30], 2, 4);
		
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
		leaves.verifyLeaveApprovedData("Leave End Date", Lastdate, 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[13], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[11], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
	//	leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}
	
	
	
	
	@Test(priority = 2)
	public void TC02_verifyDataInPayslipForMaternityLeaveType() throws Exception {

		sTestCaseID = "TC10";
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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[15]);
		leaves.Enter_ActualBirthDateInMaternity(data[15]);
		leaves.Enter_LeaverStartDate(data[15]);
		leaves.enterMaternityTotalWeeks(data[10]);
		leaves.enterAwe1();
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		payroll.Run_Payroll();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[15]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(Lastdate);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[40], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[30], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[33], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[56], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[30], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[15], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", Lastdate, 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[18], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[10], 2, 5);
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 0, data[30],2);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 1, data[33],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 2, data[30],10);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();

	}
	
	
	
	
	@Test(priority = 3)
	public void TC04_verifyCurrentYearCalculationMaternityLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[54]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("150");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks(data[10]);
		//leaves.enterMaternityTotalWeeks("39");
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(2);	
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"150",6);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 4)
	public void TC05_verifyCurrentYearCalculationMaternityLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[54]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks("25");
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(6);
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",25);
		leaves.assertAll();
		
	}

	@Test(priority = 5)
	public void TC06_verifyWeeklyCurrentYearCalculationMaternityLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[57]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[8]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks(data[10]);
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",6);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 6)
	public void TC07_verifyWeeklyCurrentYearCalculationMaternityLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[57]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[8]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks("25");
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",25);
		leaves.assertAll();
		
		
	}

	
	@Test(priority = 7)
	public void TC08_verifyFortnightlyCurrentYearCalculationMaternityLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[54]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[5]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks(data[10]);
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",6);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 8)
	public void TC09_verifyFortnightlyCurrentYearCalculationMaternityLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[57]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[5]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks("25");
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",25);
		leaves.assertAll();
		
		
	}

	
	@Test(priority = 9)
	public void TC10_verifyFortnightlyCurrentYearCalculationMaternityLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[57]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[6]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks(data[10]);
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",6);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 10)
	public void TC11_verifyFortnightlyCurrentYearCalculationMaternityLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[57]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[6]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks("25");
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",25);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 11)
	public void TC12_verifyAnnuallyCurrentYearCalculationMaternityLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[57]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[14]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectEmployee(data[16]);
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks(data[10]);
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(1);
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",6);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 12)
	public void TC13_verifyAnnuallyCurrentYearCalculationMaternityLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC10";
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
		String WeeklySMPSPPRate = leaves.GetStatutoryThresholdAmount(data[54]);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[14]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
	
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_AWE("250");
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks("25");
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyMaternityLeaveCalucationInReport(WeeklySMPSPPRate,"250",25);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 13)
	public void TC14_verifyEnterManualAmountRunPayrollTimeInMaternityLeaveType() throws Exception {

		sTestCaseID = "TC10";
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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ExpectedBirthDate(data[27]);
		leaves.Enter_ActualBirthDateInMaternity(data[27]);
		leaves.Enter_LeaverStartDate(data[27]);
		leaves.enterMaternityTotalWeeks(data[55]);
		leaves.Enter_AWE("150");
		String Lastdate=leaves.GetMaternityLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollWithEditAmount("SMP", "500");
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[7],data[16]);
		leaves.verifyAmountForMaternityLeaveInReport("500");
		leaves.assertAll();

	}
}
