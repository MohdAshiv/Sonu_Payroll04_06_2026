package New_LeaveManagementTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC09_AddSickLeaveThroughUser extends TestBase {

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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[9]);
		leaves.Enter_LeaverEndDateSick(data[10]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.enterLeaveReson(data[43]);
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
		payroll.Run_Payroll();
		
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[44]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[10], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[18], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[44], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[43], 2, 8);
		
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

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[11]);
		leaves.Enter_LeaverEndDateSick(data[12]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.enterLeaveReson(data[43]);
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
		payroll.Run_Payroll();
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[44]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[11], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[12], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[28], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[22], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[44], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[43], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(5, driver);
		
		payroll.Click_PayrollDashboard();
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

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[14]);
		leaves.Enter_LeaverEndDateSick(data[15]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.enterLeaveReson(data[43]);
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
		payroll.Run_Payroll();
		
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[44]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[14], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[15], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[29], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[27], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[44], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[43], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(5, driver);
		
		payroll.Click_PayrollDashboard();
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

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[14]);
		leaves.Enter_LeaverEndDateSick(data[15]);
		leaves.enter_NoticePeriodDayesInSick(data[32]);
		leaves.chk_EligiblForSSPInSick();
		leaves.enterLeaveReson(data[43]);
		String loc = System.getProperty("user.dir") + "\\SonuPDF" + "\\";
		leaves.chooseFileSickLeave(loc+"Mr. Employee.pdf");
		
	
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
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[44]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[14], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[15], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[26], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[29], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[27], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[44], 2, 6);
		leaves.verifyLeaveAttachmentInPendingForApprovalPage("Attachment", "Mr-Employee", 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[43], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(5, driver);
		
		payroll.Click_PayrollDashboard();
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
	    leaves.verifyLeaveApprovedData("Attachment", "Mr. Employee.pdf", 2, 7);
	//	leaves.verifyLeaveApprovedData("Reason", Sheet, 0, 8);
		leaves.clickDeletBtnInLeaveApprovedPage();

		leaves.assertAll();



	}
	
	
	@Test(priority = 4)
	public void TC05_verifyAllPaySlipForSickLeaveTypeDataFor2Days() throws Exception {

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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[45]);
		leaves.Enter_LeaverEndDateSick(data[46]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.enterLeaveReson(data[43]);
		leaves.clickSaveBtn();
		
		
		
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
		

		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[44]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[45], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[46], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[18], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[44], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[43], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		
		utilities.ChangeWindow.Switchwindow(4, driver);
		
		payroll.Click_PayrollDashboard();
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
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 34, data[30],2);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 35, data[33],4);
		leaves.ReadFull_FilletedPDFReportofDividentVoucher(1, 1, 36, data[30],10);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletBtnInLeaveApprovedPage();
		
		leaves.assertAll();
	}
	
	
	@Test(priority = 5)
	public void TC06_verifyRejectedLeaveForSickLeave() throws Exception {

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
	

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[21]);
		leaves.clickDeletAllInLeaveApprovedPage(data[21]);

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
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
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[9]);
		leaves.Enter_LeaverEndDateSick(data[10]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.enterLeaveReson(data[43]);
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
		payroll.Run_Payroll();
		
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[44]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.verifyLeaveDataInPendingForApprovalPage("Employee Name", data[16], 2, 0);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Start Date", data[9], 2, 1);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave End Date", data[10], 2, 2);
		leaves.verifyLeaveDataInPendingForApprovalPage("Leave Type", data[24], 2, 3);
		leaves.verifyLeaveDataInPendingForApprovalPage("Duration", data[18], 2, 4);
		leaves.verifyLeaveDataInPendingForApprovalPage("Total Weeks", data[19], 2, 5);
		leaves.verifyLeaveDataInPendingForApprovalPage("Status", data[44], 2, 6);
	//	leaves.verifyLeaveApprovedData("Attachment", Sheet, 2, 7);
		leaves.verifyLeaveDataInPendingForApprovalPage("Reason", data[43], 2, 8);
		
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickRejectBtn();
		String Note = leaves.GetApprovedAndRejectNote();
		utilities.ChangeWindow.Switchwindow(4, driver);
		employee.LoggedOutAndReloginButton1();
		loginpage.Enter_EnterUsername(UserName);
		loginpage.Enter_Enterpassword(UserPassword);
		loginpage.Click_LoginButton();

		leaves.clickLeaveManagement();
		leaves.clickManageLeaves();
		leaves.verifyLeaveBalance(data[47]);
		// leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[7], 0);
		leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[48], 1);
		//leaves.verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(data[12], 2);
		leaves.clickHistoryLeaves1();
		leaves.verifyLeaveHistoryUserEnd(Note, "Leave Type", data[24], 8);
		leaves.verifyLeaveHistoryUserEnd(Note, "From Date", data[9], 7);
		leaves.verifyLeaveHistoryUserEnd(Note, "To Date", data[10], 6);
		leaves.verifyLeaveHistoryUserEnd(Note, "Duration", data[18], 5);
		leaves.verifyLeaveHistoryUserEnd(Note, "Total Weeks", data[19], 4);
		leaves.verifyLeaveHistoryUserEnd(Note, "Status", data[49], 3);
		leaves.verifyLeaveHistoryUserEnd(Note, "Reason", data[43], 1);
		
		leaves.assertAll();
	}
}
