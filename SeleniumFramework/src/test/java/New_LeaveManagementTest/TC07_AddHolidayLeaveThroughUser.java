package New_LeaveManagementTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC07_AddHolidayLeaveThroughUser extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_verifyHolidaysLeaveTypeDataFor2Days() throws Exception {

		sTestCaseID = "TC07";
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
		
		
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String  UserName = RandomStringUtils.randomAlphabetic(5); 
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
		
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.Enter_LeaverEndDateHoliday(data[10]);
		leaves.enterLeaveReson(data[44]);
		leaves.clickSaveBtn();
		
		
		
		employee.LoggedOutAndReloginButton1();
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
//		payroll.Run_Payroll();
//		
//		
//		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
//		submitRti.Click_gotoFilingManagement();
//		submitRti.selectStatus(data[8]);
//		submitRti.clickCheckBox();
//		submitRti.enterNotes();
//		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
				
		
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[10], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[18], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[45], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[44], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(5, driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[10]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[41], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[34], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[32], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[34], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[10], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[18], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveApprovedData("Reason", data[44], 2, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}
	
	
	

	@Test(priority = 1)
	public void TC02_verifyHalfHolidaysLeaveTypeDataFor2Days() throws Exception {

		sTestCaseID = "TC07";
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

		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String  UserName = RandomStringUtils.randomAlphabetic(5); 
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
		
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.clickHalfDayChekBox();
		leaves.enterLeaveReson(data[44]);
		leaves.clickSaveBtn();
		
		
		
		employee.LoggedOutAndReloginButton1();
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
//		payroll.Run_Payroll();
//		
//		
//		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
//		submitRti.Click_gotoFilingManagement();
//		submitRti.selectStatus(data[8]);
//		submitRti.clickCheckBox();
//		submitRti.enterNotes();
//		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		
		
		
		
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		//leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[27], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[28], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[45], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		 leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[44], 2, 8);
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(5, driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		
		
		
	
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[40], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[43], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[36], 2, 4);

		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
		// leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[35], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[36], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);

		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[9], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[27], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[28], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		 leaves.verifyLeaveApprovedData("Reason", data[44], 2, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();

		
		leaves.assertAll();

	}
	
	@Test(priority = 2)
	public void TC03_verifyHolidaysLeaveTypeDataFor15Days() throws Exception {

		sTestCaseID = "TC07";
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
		
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String  UserName = RandomStringUtils.randomAlphabetic(5); 
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
		
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.Enter_LeaverEndDateHoliday(data[13]);
		leaves.enterLeaveReson(data[44]);
		leaves.clickSaveBtn();
		
		
		
		employee.LoggedOutAndReloginButton1();
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
//		payroll.Run_Payroll();
//		
//		
//		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
//		submitRti.Click_gotoFilingManagement();
//		submitRti.selectStatus(data[8]);
//		submitRti.clickCheckBox();
//		submitRti.enterNotes();
//		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		
		
		
		
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[13], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[29], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[45], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		 leaves.verifyLeaveApprovedData("Reason", data[44], 2, 8);
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(5, driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		
		

		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[13]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[42], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[39], 2, 4);

		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
		// leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[38], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[39], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);

		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[13], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[29], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
		// leaves.verifyLeaveApprovedData("Attachment", Sheet, 0, 7);
		 leaves.verifyLeaveApprovedData("Reason", data[44], 2, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();

		leaves.assertAll();



	}
	
	
	@Test(priority = 3)
	public void TC04_verifyAllPaySlipForHolidaysLeaveTypeDataFor2Days() throws Exception {

		sTestCaseID = "TC07";
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
		
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String  UserName = RandomStringUtils.randomAlphabetic(5); 
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
		
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.Enter_LeaverStartDateHoliday(data[46]);
		leaves.Enter_LeaverEndDateHoliday(data[47]);
		leaves.enterLeaveReson(data[44]);
		leaves.clickSaveBtn();
		
		
		
		employee.LoggedOutAndReloginButton1();
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
		

		
		
		
//		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
//		submitRti.Click_gotoFilingManagement();
//		submitRti.selectStatus(data[8]);
//		submitRti.clickCheckBox();
//		submitRti.enterNotes();
//		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		
		
		
		
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[46], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[47], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[18], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[45], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[44], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(5, driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName();
		
	
		
		
		String Date = leaves.ChangeDateFormat(data[9]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 2, 0);
		String Date2 = leaves.ChangeDateFormat(data[10]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[41], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[34], 2, 4);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Employee Name", data[37], 0);
	//	leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Department", data[21], 1);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Days", data[30], 2);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Leave Entitlement Hours", data[31], 3);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Days Taken", data[32], 4);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Hours Taken", data[33], 5);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("SMP / SPP", data[33], 6);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Unpaid", data[33], 7);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Other", data[33], 9);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Deduction", data[33], 11);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Days", data[34], 12);
		leaves.verifyLeaveDataInEmployeeLeaveDetailsPage("Balance Hours", data[31], 13);
		
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.verifyLeaveApprovedData("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveApprovedData("Leave Start Date", data[46], 2, 1);
		leaves.verifyLeaveApprovedData("Leave End Date", data[47], 2, 2);
		leaves.verifyLeaveApprovedData("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveApprovedData("Duration", data[18], 2, 4);
		leaves.verifyLeaveApprovedData("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveApprovedData("Status", data[20], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveApprovedData("Reason", data[44], 2, 8);
		
		
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 1, data[32],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 2, data[34],10);
		
		
		
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 1, data[32],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 2, data[34],10);
		
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 34, data[30],2);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 35, data[32],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 36, data[34],10);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
		
	}
		
	
	@Test(priority = 4)
	public void TC05_verifyRejectedLeaveForHolidaysLeaves() throws Exception {

		sTestCaseID = "TC07";
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
		
	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		String  UserName = RandomStringUtils.randomAlphabetic(5); 
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
		
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.Enter_LeaverEndDateHoliday(data[10]);
		leaves.enterLeaveReson(data[44]);
		leaves.clickSaveBtn();
		
		
		
		employee.LoggedOutAndReloginButton1();
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
//		payroll.Run_Payroll();
//		
//		
//		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
//		submitRti.Click_gotoFilingManagement();
//		submitRti.selectStatus(data[8]);
//		submitRti.clickCheckBox();
//		submitRti.enterNotes();
//		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		
		
		
		
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[10], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[5], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[18], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[45], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[44], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickRejectBtn();
		String Note = leaves.GetApprovedAndRejectNote();
		utilities.ChangeWindow.Switchwindow(5, driver);
		employee.LoggedOutAndReloginButton();
		loginpage.Enter_EnterUsername(UserName);
		loginpage.Enter_Enterpassword(UserPassword);
		loginpage.Click_LoginButton();

		leaves.clickLeaveManagement();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[48]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[49], 1);
		//leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[12], 2);
		leaves.clickHistoryLeaves1();
		leaves.verifyLeaveHistoryUserEnd(Note, "Leave Type", data[5], 8);
		leaves.verifyLeaveHistoryUserEnd(Note, "From Date", data[9], 7);
		leaves.verifyLeaveHistoryUserEnd(Note, "To Date", data[10], 6);
		leaves.verifyLeaveHistoryUserEnd(Note, "Duration", data[18], 5);
		leaves.verifyLeaveHistoryUserEnd(Note, "Total Weeks", data[19], 4);
		leaves.verifyLeaveHistoryUserEnd(Note, "Status", data[50], 3);
		leaves.verifyLeaveHistoryUserEnd(Note, "Reason", data[44], 1);
		
		leaves.assertAll();
		
	}
	
}
