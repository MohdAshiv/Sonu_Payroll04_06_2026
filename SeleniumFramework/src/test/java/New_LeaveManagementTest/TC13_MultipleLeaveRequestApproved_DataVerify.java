package New_LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC13_MultipleLeaveRequestApproved_DataVerify extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void TCvalidateApprovedLeavesHistory() throws Exception {

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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[16]);
		leaves.clickDeletAllInLeaveApprovedPage(data[16]);
		
		
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[5]);
		leaves.Enter_LeaverStartDateHoliday(data[10]);
		leaves.Enter_LeaverEndDateHoliday(data[10]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		leaves.clickAddLeaves();
	    leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateSick(data[11]);
		leaves.Enter_LeaverEndDateSick(data[11]);
		leaves.Enter_AWESick("200");
		leaves.chk_EligiblForSSPInSick();
		leaves.clickSaveBtn();
		
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[7]);
		leaves.Enter_ActualBirthDate(data[12]);
		leaves.Enter_LeaverStartDateSSP(data[12]);
		leaves.enterTotalWeeks("1");
		String Lastdate=leaves.GetLastDate();
		leaves.clickSaveBtn();
	
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[8]);
		leaves.Enter_LeaverStartDateHoliday(data[13]);
		leaves.Enter_LeaverEndDateHoliday(data[13]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();

		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.Enter_LeaverStartDateHoliday(data[14]);
		leaves.Enter_LeaverEndDateHoliday(data[14]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(4);
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		
		String Date = leaves.ChangeDateFormat(data[10]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date, 6, 0);
		String Date2 = leaves.ChangeDateFormat(data[10]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date2, 6, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[20], 6, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[5], 6, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[22], 6, 4);
		
		
		String Date3 = leaves.ChangeDateFormat(data[11]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date3, 5, 0);
		String Date4 = leaves.ChangeDateFormat(data[11]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date4, 5, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[20], 5, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[17], 5, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[22], 5, 4);
		
		
		String Date5 = leaves.ChangeDateFormat(data[12]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date5, 4, 0);
		String Date6 = leaves.ChangeDateFormat(Lastdate);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date6, 4, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[21], 4, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[18], 4, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[22], 4, 4);
		
		
		String Date7 = leaves.ChangeDateFormat(data[13]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date7, 3, 0);
		String Date8 = leaves.ChangeDateFormat(data[13]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date8, 3, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[20], 3, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[8], 3, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[22], 3, 4);
		
		
		String Date9 = leaves.ChangeDateFormat(data[14]);
		leaves.verifyLeaveDataInEmployeePage("Leave Start Date", Date9, 2, 0);
		String Date10 = leaves.ChangeDateFormat(data[14]);
		leaves.verifyLeaveDataInEmployeePage("Leave End Date", Date10, 2, 1);
		leaves.verifyLeaveDataInEmployeePage("Days", data[20], 2, 2);
		leaves.verifyLeaveDataInEmployeePage("Leave Type", data[19], 2, 3);
		leaves.verifyLeaveDataInEmployeePage("Annual Leave Balance", data[22], 2, 4);

		leaves.assertAll();
		
		
	
}	
	
	
	
}
