package New_LeaveManagementTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC11_VerifyUserPersonalAndEmploymentDetails extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_VerifyUserPersonalAndEmploymentDetails() throws Exception {

		sTestCaseID = "TC08";
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

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();

		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessNameInput(data[4]);
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[8]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//		Bk.Click_BKEdit();
//		Bk.Select_services(data[9]);
//		Bk.Enter_CompanyAddressLine1(data[10]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[4]);
//		Bk.Enter_NewEndDate(data[11]);
//		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
//		
		pages.EditCompany company = new pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();

		company.enterPayeNumber(data[12]);
		company.enterRefrenceNumber(data[13]);
		company.accountOfficeReffrence(data[14]);
		company.Click_ClickSave();

		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[23]);
		company.Click_ClickSave();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[23]);
		company.enterleaveDays(data[41]);
		company.enterHolidayPayRate(data[24]);
		company.enterMaxCarryOver(data[25]);
		company.enterWeeklyWorkingHrs(data[26]);
//		
		company.Click_ClickSave();
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Click_PayrollDashboard();

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[15]);
		employee.enterLastName(data[16]);
		employee.enterDateOfBirth(data[17]);
		employee.enterAddressLine(data[18]);
		employee.enterAddressLine2(data[19]);
		employee.enterPostCode(data[20]);
		employee.enterEmailAddress(data[36]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();

		employee.enterJoiningDate(data[21]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		payroll.Click_PayrollDashboard();

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String UserName = RandomStringUtils.randomAlphabetic(5);
		employee.enterPortalLoginUsername(UserName);
		employee.clickOnEmailButton();
		String UserPassword = employee.getPasswordForNewPortalUser();
		employee.LoggedOutAndReloginButton();
		loginpage.Enter_EnterUsername(UserName);
		loginpage.Enter_Enterpassword(UserPassword);
		loginpage.Click_LoginButton();
		employee.MultiFactorAuthenticationDropdown("No");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();
		employee.RemindMeInMultiFactorAuthenticationDropdown("Never");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();

		leaves.VerifyUserPersonalAndEmploymentDetailsInDashboard("Name", data[40] + " " + data[15] + " " + data[16]);
		leaves.VerifyUserPersonalAndEmploymentDetailsInDashboard("Address Line 1", data[18]);
		leaves.VerifyUserPersonalAndEmploymentDetailsInDashboard("Address Line 2", data[19]);
		leaves.VerifyUserPersonalAndEmploymentDetailsInDashboard("Postcode", data[20]);
		leaves.VerifyUserPersonalAndEmploymentDetailsInDashboard("DOB", data[17]);
		leaves.VerifyUserPersonalAndEmploymentDetailsInDashboard("Email Address", data[36]);

		leaves.VerifyPayrollDataInDashboard("Basic Salary (£)", data[5]);
		leaves.VerifyPayrollDataInDashboard("Apprentice", data[37]);
		leaves.VerifyPayrollDataInDashboard("Student Loan", data[37]);
		leaves.VerifyPayrollDataInDashboard("Joining Date", data[21]);
		leaves.VerifyPayrollDataInDashboard("Tax Code", data[7]);
		leaves.VerifyPayrollDataInDashboard("NI Category", data[6]);
		leaves.VerifyPayrollDataInDashboard("Payment Mode", data[38]);
		leaves.VerifyPayrollDataInDashboard("Pay Frequency", data[39]);
		leaves.VerifyPayrollDataInDashboard("Comments", data[37]);

		leaves.assertAll();
		employee.AssertALL();
		company.AssertALL();

	}

	@Test(priority = 1)
	public void TC02_verifyLeaveManagementDataNewUserAndAfterAddNewLeave() throws Exception {

		sTestCaseID = "TC08.1";
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
		leaves.selectEmployeeNameInApprovedLeavesPage(data[5]);
		leaves.clickDeletAllInLeaveApprovedPage(data[5]);

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String UserName = RandomStringUtils.randomAlphabetic(5);
		employee.enterPortalLoginUsername(UserName);
		employee.clickOnEmailButton();
		String UserPassword = employee.getPasswordForNewPortalUser();
		employee.LoggedOutAndReloginButton();
		loginpage.Enter_EnterUsername(UserName);
		loginpage.Enter_Enterpassword(UserPassword);
		loginpage.Click_LoginButton();
		employee.MultiFactorAuthenticationDropdown("No");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();
		employee.RemindMeInMultiFactorAuthenticationDropdown("Never");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();

		leaves.clickLeaveManagement();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);

		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[8]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.Enter_LeaverEndDateHoliday(data[9]);
		leaves.enterLeaveReson(data[11]);
		leaves.clickSaveBtn();

		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[12], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);

		employee.LoggedOutAndReloginButton();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		payroll.Click_PayrollDashboard();

		payroll.UndoPayroll();
		payroll.Run_Payroll();

		pages.FilingManagement submitRti = new pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[13]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();

		pages.EmployerView employerView = new pages.EmployerView(driver);
		employerView.Click_EmployerView();

		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		// leaves.selectEmployeeNameInApprovedLeavesPage(data[16]);
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[14], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[8], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[15], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[7], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[13], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[11], 2, 8);
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();

		utilities.ChangeWindow.Switchwindow(4, driver);
		payroll.Click_PayrollDashboard();

		employee.LoggedOutAndReloginButton();
		loginpage.Enter_EnterUsername(UserName);
		loginpage.Enter_Enterpassword(UserPassword);
		loginpage.Click_LoginButton();

		leaves.clickLeaveManagement();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[17]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[12], 1);

		leaves.assertAll();

	}

	@Test(priority = 2)
	public void TC03_verifyLeaveManagementDataAfterDeleteAllLeaves() throws Exception {

		sTestCaseID = "TC08.1";
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
		leaves.selectEmployeeNameInApprovedLeavesPage(data[5]);
		leaves.clickDeletAllInLeaveApprovedPage(data[5]);

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String UserName = RandomStringUtils.randomAlphabetic(5);
		employee.enterPortalLoginUsername(UserName);
		employee.clickOnEmailButton();
		String UserPassword = employee.getPasswordForNewPortalUser();
		employee.LoggedOutAndReloginButton();
		loginpage.Enter_EnterUsername(UserName);
		loginpage.Enter_Enterpassword(UserPassword);
		loginpage.Click_LoginButton();
		employee.MultiFactorAuthenticationDropdown("No");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();
		employee.RemindMeInMultiFactorAuthenticationDropdown("Never");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();

		leaves.clickLeaveManagement();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);

		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[8]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.Enter_LeaverEndDateHoliday(data[9]);
		leaves.enterLeaveReson(data[11]);
		leaves.clickSaveBtn();

		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[12], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);
		leaves.clickCancelLeaves();
		leaves.verifyLeaveDataInCancelLeavePage("Leave Type", data[8], 2, 0);
		leaves.verifyLeaveDataInCancelLeavePage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInCancelLeavePage("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveDataInCancelLeavePage("Duration", data[15], 2, 3);
		leaves.verifyLeaveDataInCancelLeavePage("Total Weeks", data[7], 2, 4);
		leaves.verifyLeaveDataInCancelLeavePage("Status", data[13], 2, 5);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		leaves.verifyLeaveDataInCancelLeavePage("Reason", data[11], 2, 7);

		leaves.clickDeletIcnCancelLeaves();
		leaves.clickCnacelBtn();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);
		leaves.assertAll();
		
	}
	
	@Test(priority = 3)
	public void TC04_verifyLeaveManagementDataIfWeCancelAnLeaveAndAddAgainSameLeaveAddWithSameData () throws Exception {

		sTestCaseID = "TC08.1";
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
		leaves.selectEmployeeNameInApprovedLeavesPage(data[5]);
		leaves.clickDeletAllInLeaveApprovedPage(data[5]);

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String UserName = RandomStringUtils.randomAlphabetic(5);
		employee.enterPortalLoginUsername(UserName);
		employee.clickOnEmailButton();
		String UserPassword = employee.getPasswordForNewPortalUser();
		employee.LoggedOutAndReloginButton();
		loginpage.Enter_EnterUsername(UserName);
		loginpage.Enter_Enterpassword(UserPassword);
		loginpage.Click_LoginButton();
		employee.MultiFactorAuthenticationDropdown("No");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();
		employee.RemindMeInMultiFactorAuthenticationDropdown("Never");
		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();

		leaves.clickLeaveManagement();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);

		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[8]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.Enter_LeaverEndDateHoliday(data[9]);
		leaves.enterLeaveReson(data[11]);
		leaves.clickSaveBtn();

		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[12], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);
		leaves.clickCancelLeaves();
		leaves.verifyLeaveDataInCancelLeavePage("Leave Type", data[8], 2, 0);
		leaves.verifyLeaveDataInCancelLeavePage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInCancelLeavePage("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveDataInCancelLeavePage("Duration", data[15], 2, 3);
		leaves.verifyLeaveDataInCancelLeavePage("Total Weeks", data[7], 2, 4);
		leaves.verifyLeaveDataInCancelLeavePage("Status", data[13], 2, 5);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		leaves.verifyLeaveDataInCancelLeavePage("Reason", data[11], 2, 7);

		leaves.clickDeletIcnCancelLeaves();
		leaves.clickCnacelBtn();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);
		
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[8]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.Enter_LeaverEndDateHoliday(data[9]);
		leaves.enterLeaveReson(data[11]);
		leaves.clickSaveBtn();

		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[6]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken("0", 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[12], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 1);
		leaves.clickCancelLeaves();
		leaves.verifyLeaveDataInCancelLeavePage("Leave Type", data[8], 2, 0);
		leaves.verifyLeaveDataInCancelLeavePage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInCancelLeavePage("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveDataInCancelLeavePage("Duration", data[15], 2, 3);
		leaves.verifyLeaveDataInCancelLeavePage("Total Weeks", data[7], 2, 4);
		leaves.verifyLeaveDataInCancelLeavePage("Status", data[13], 2, 5);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		leaves.verifyLeaveDataInCancelLeavePage("Reason", data[11], 2, 7);
		leaves.clickDeletIcnCancelLeaves();
		leaves.clickCnacelBtn();
		
		leaves.assertAll();
		
	}

}
