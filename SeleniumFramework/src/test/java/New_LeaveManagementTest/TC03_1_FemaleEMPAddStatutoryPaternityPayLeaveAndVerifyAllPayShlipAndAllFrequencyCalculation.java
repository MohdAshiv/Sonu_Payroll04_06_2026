package New_LeaveManagementTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC03_1_FemaleEMPAddStatutoryPaternityPayLeaveAndVerifyAllPayShlipAndAllFrequencyCalculation extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;	
	
	@Test(priority = 1)
	public void TC02_verifyStatutoryPaternityPayLeaveTypeDataFor1weeks() throws Exception {

		sTestCaseID = "TC03_1";
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

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterTotalWeeks("1");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		
		
	
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(Lastdate);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[41], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[30], 2, 4);

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
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", Lastdate, 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[29], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[23], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		// leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();

		leaves.assertAll();

	}
	
	@Test(priority = 2)
	public void TC03_verifyValidationOfStatutoryPaternityPayLeaveType() throws Exception {

		sTestCaseID = "TC03_1";
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

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_LeaverStartDateSSP(data[9]);
		leaves.enterAwe("600");
		leaves.enterTotalWeeks("3");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg("Error! Statutory Parental Pay can only be 1 or 2 weeks.","Issue In Validation");
		String LastDD = leaves.VerifyDateAccrodingToWeeks(data[9], 3);
		Assert.assertEquals(LastDD, Lastdate,"Date is not getting visible accroding Weeks");
		
		leaves.enterTotalWeeks("10");
		String Lastdate2=leaves.GetLastDate();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg("Error! Statutory Parental Pay can only be 1 or 2 weeks.","Issue In Validation");
		String LastDD2 = leaves.VerifyDateAccrodingToWeeks(data[9], 10);
		Assert.assertEquals(LastDD, Lastdate,"Date is not getting visible accroding Weeks");

		leaves.assertAll();

	}
	
	
	
	@Test(priority = 3)
	public void TC04_verifyDataInPayslipForStatutoryPaternityPayLeaveType() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[45]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterTotalWeeks("1");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		
		
	
		String Date = leaves.ChangeDateFormat(data[45]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(Lastdate);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[41], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[30], 2, 4);

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
		leaves.verifyLeaveApprovedData("Leave Start Date", data[45], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", Lastdate, 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[29], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[23], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		// leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		
		
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 35, data[30],2);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 36, data[33],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 37, data[30],10);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();

	}
	
	
	
	
	@Test(priority = 4)
	public void TC05_verifyCalculationStatutoryPaternityPayLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("169");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"169",14);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 5)
	public void TC06_verifyCalculationStatutoryPaternityPayLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("300");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"300",14);
		leaves.assertAll();
		
		
	}
	
/*

	@Test(priority = 6)
	public void TC07_verifyWeeklyCalculationStatutoryPaternityPayLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		
		
		payroll.Click_PayrollDashboard();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		
		pages.FrequencySet freq= new pages.FrequencySet(driver);
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[5]);
		freq.Enter_WeeklyPayDate(data[6]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		company.Click_ClickSave();
		
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("169");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"169",14);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 7)
	public void TC08_verifyWeeklyCalculationStatutoryPaternityPayLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("300");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"300",14);
		leaves.assertAll();
		
		
	}
	
	@Test(priority = 8)
	public void TC09_verifyFortnightlyCalculationStatutoryPaternityPayLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("169");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"169",14);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 9)
	public void TC10_verifyFortnightlyCalculationStatutoryPaternityPayLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("300");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"300",14);
		leaves.assertAll();
		
		
	}

	@Test(priority = 10)
	public void TC11_verifyFourWeeklyCalculationStatutoryPaternityPayLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("169");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"169",14);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 11)
	public void TC12_verifyFourWeeklyCalculationStatutoryPaternityPayLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("300");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"300",14);
		leaves.assertAll();
		
		
	}
	
	@Test(priority = 12)
	public void TC13_verifyAnnuallyCalculationStatutoryPaternityPayLeaveAmountIfAWEisLessThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		OpenClient.Enter_EnterClientName(data[15]);
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("169");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"169",14);
		leaves.assertAll();
		
		
	}
	
	
	
	@Test(priority = 13)
	public void TC14_verifyAnnuallyCalculationStatutoryPaternityPayLeaveAmountIfAWEisGreaterThanThreshold() throws Exception {

		sTestCaseID = "TC03_1";
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
		OpenClient.Enter_EnterClientName(data[15]);
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
		leaves.Enter_ActualBirthDate(data[9]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("300");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyPaternityLeaveCalucationInReport(WeeklySMPSPPRate,"300",14);
		leaves.assertAll();
		
		
	}
	
	
	@Test(priority = 14)
	public void TC15_verifyEnterManualAmountRunPayrollTimeInStatutoryPaternityPayLeaveType() throws Exception {

		sTestCaseID = "TC03_1";
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
		leaves.Enter_ActualBirthDate(data[55]);
	//	leaves.Enter_LeaverStartDateSSP(data[9]);
	//	leaves.enterAwe();
		leaves.enterAwe("200");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollWithEditAmount("SPP", "600");
		
		leaves.clickOnReportSection();
		leaves.clickOnAnyEmployeeReportByName(data[50]);
		leaves.selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(data[51],data[16]);
		leaves.verifyAmountForPaternityLeaveInReport("600");
		leaves.assertAll();
		
}
	*/
	
}
