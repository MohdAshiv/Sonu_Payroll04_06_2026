package New_LeaveManagementTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC14_MulipleLeavesRequestApprovedThroghUser_DataVerify extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_verifyHolidaysLeaveTypeDataFor2Days() throws Exception {

		sTestCaseID = "TC09";
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
//		leaves.clickLeaveManagement();
//		leaves.clickApprovedLeaves();
//		leaves.selectEmployeeNameInApprovedLeavesPage(data[16]);
//		leaves.clickDeletAllInLeaveApprovedPage(data[16]);
		
	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		employee.clickEmployeeName();
//		employee.editEmployeeDetails();
//		employee.click_Paydetails();
//		String  UserName = RandomStringUtils.randomAlphabetic(5); 
//		employee.enterPortalLoginUsername(UserName);
//		employee.clickOnEmailButton();
//		String UserPassword = employee.getPasswordForNewPortalUser();
//		employee.LoggedOutAndReloginButton();
//		loginpage.Enter_EnterUsername(UserName);
//		loginpage.Enter_Enterpassword(UserPassword);
//		loginpage.Click_LoginButton();
//		employee.MultiFactorAuthenticationDropdown("No");
//		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();
//		employee.RemindMeInMultiFactorAuthenticationDropdown("Never");
//		employee.ClickOnSaveButtonInMultiFactorAuthenticationPage();
//		
//		
//		
//		
//		
//		leaves.clickLeaveManagement();
//		
//		leaves.clickApplyLeaves();
//		leaves.selectLeaveType(data[5]);
//		leaves.Enter_LeaverStartDateHoliday(data[10]);
//		leaves.Enter_LeaverEndDateHoliday(data[10]);
//		leaves.enterLeaveReson(data[23]);
//		leaves.clickSaveBtn(); 
//		
//		leaves.clickApplyLeaves();
//	    leaves.selectLeaveType(data[6]);
//		leaves.Enter_LeaverStartDateSick(data[11]);
//		leaves.Enter_LeaverEndDateSick(data[11]);
//		leaves.Enter_AWESick("200");
//	//	leaves.enterLeaveReson(data[20]);
//		leaves.enterLeaveReson(data[23]);
//		leaves.clickSaveBtn();
//		
//		
//		leaves.clickApplyLeaves();
//		leaves.selectLeaveType(data[7]);
//		leaves.Enter_ActualBirthDate(data[12]);
//		leaves.Enter_LeaverStartDateSSP(data[12]);
//		leaves.enterTotalWeeks("1");
//		String Lastdate=leaves.GetLastDate();
//		leaves.enterLeaveReson(data[23]);
//		leaves.clickSaveBtn();
//		
//		
//		
//		
//		
//		leaves.clickApplyLeaves();
//		leaves.selectLeaveType(data[8]);
//		leaves.Enter_LeaverStartDateHoliday(data[13]);
//		leaves.Enter_LeaverEndDateHoliday(data[13]);
//		leaves.enterLeaveReson(data[23]);
//		leaves.clickSaveBtn();
//		
//		
//		employee.LoggedOutAndReloginButton();
//		loginpage.Enter_EnterUsername(data[1]);
//		loginpage.Enter_Enterpassword(data[2]);
//		loginpage.Click_LoginButton();
//		agentpage.Enter_SearchAgentName(data[3]);
//		agentpage.Click_ClickSearch();
//		agentpage.Click_ClickAgent();
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		payroll.Click_PayrollDashboard();
//		
//
//		payroll.UndoPayroll();
//		payroll.Run_Payroll();
//		payroll.Run_Payroll();
//		payroll.Run_Payroll();
		
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[24]);
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
		
		utilities.ChangeWindow.Switchwindow(4, driver);
		
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
	
	
	

	
}
