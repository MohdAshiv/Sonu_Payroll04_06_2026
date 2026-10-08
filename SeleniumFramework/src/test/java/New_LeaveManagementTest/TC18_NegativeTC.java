package New_LeaveManagementTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC18_NegativeTC extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_verifyLeaveStartDateColumn_ForHolidaysLeaveType() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[5]);
		leaves.clickDeletAllInLeaveApprovedPage(data[5]);
		leaves.clickAddLeaves();
		
		leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverStartDateHoliday(data[7]);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[7]);
		
		
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[9]);
		
		
//		leaves.CopyPaste_LeaverStartDateHoliday();
//		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
//		leaves.clickSaveBtn();
//		leaves.verifyValidationMsg(data[8],"Copy Paste");
		
		
		leaves.clickHalfDayChekBox();
		leaves.Enter_LeaverStartDateHoliday(data[7]);
		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[7]);
		
		
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[9]);
		
		
//		leaves.CopyPaste_LeaverStartDateHoliday();
//		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
//		leaves.clickSaveBtn();
//		leaves.verifyValidationMsg(data[8],data[9]);

		leaves.assertAll();

	}

	@Test(priority = 1)
	public void TC02_verifyLeaveEndDate_ForHolidaysLeaveType() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[6]);
		leaves.Enter_LeaverEndDateHoliday(data[7]);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],data[7]);
		leaves.Enter_LeaverEndDateHoliday(data[9]);
		js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],data[9]);
//		leaves.CopyPaste_LeaverEndDateHoliday();
//		leaves.clickSaveBtn();
//		leaves.verifyValidationMsg(data[10],"Copy Paste");
		leaves.assertAll();
	}

	@Test(priority = 2)
	public void TC03_verifyActualBirthDateColumnForSPP() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[11]);
		leaves.Enter_ActualBirthDate(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[12],data[7]);
		leaves.Enter_ActualBirthDate(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[12],data[9]);
		leaves.CopyPaste_ActualBirthDate();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[12],"Copy Paste");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		leaves.Enter_ActualBirthDate(dtf.format(now));
		leaves.enterAwe(data[13]);
		leaves.verifyWarningValidationMsg(data[16],data[13]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[13]);
		leaves.enterAwe(data[14]);
		leaves.verifyWarningValidationMsg(data[16],data[14]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[14]);
		leaves.enterAwe(data[17]);
		leaves.verifyWarningValidationMsg(data[16],data[17]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[17]);
		leaves.enterAwe(data[18]);
		leaves.assertAll();

	}

	@Test(priority = 3)
	public void TC04_verifyAverageWeeklyEarningsColumnForSPP() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[11]);
		leaves.enterAwe(data[13]);
		leaves.verifyWarningValidationMsg(data[16],data[13]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[13]);
		leaves.enterAwe(data[14]);
		leaves.verifyWarningValidationMsg(data[16],data[14]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[14]);
		leaves.enterAwe(data[21]);
		leaves.verifyWarningValidationMsg(data[16],data[21]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[21]);
		leaves.enterAwe(data[17]);
		leaves.verifyWarningValidationMsg(data[16],data[17]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[17]);
		leaves.assertAll();

	}

	@Test(priority = 4)
	public void TC05_verifyLeaveStartDateColumnForSPP() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[11]);
		leaves.Enter_LeaverStartDateSSP(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[7]);
		leaves.Enter_LeaverStartDateSSP(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[9]);
		leaves.CopyPaste_LeaverStartDateSSP();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],"Copy Paste");
		leaves.assertAll();

	}

	@Test(priority = 5)
	public void TC06_verifyWeekColumnForSPP() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[11]);
		leaves.enterTotalWeeks(data[13]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[19],data[13]);
		leaves.enterTotalWeeks(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[19],data[9]);
		leaves.enterTotalWeeks(data[18]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[20],data[18]);
		leaves.enterTotalWeeks(data[21]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[20],data[21]);
		leaves.enterTotalWeeks(data[14]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[20],data[14]);
		leaves.assertAll();

	}

	@Test(priority = 6)
	public void TC07_verifyLeaveStartDateColumnForSickLeavet() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[22]);
		leaves.Enter_LeaverStartDateSick(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[23],data[7]);
		leaves.Enter_LeaverStartDateSick(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[23],data[9]);
		leaves.CopyPaste_LeaverStartDateSick();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[23],"Copy Paste");
		leaves.assertAll();

	}

	@Test(priority = 7)
	public void TC08_verifyLeaveEndDateColumnForSickLeavet() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[22]);
		leaves.Enter_LeaverEndDateSick(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[24],data[7]);
		leaves.Enter_LeaverEndDateSick(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[24],data[9]);
		leaves.CopyPaste_LeaverEndDateSick();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[24],"Copy Paste");
		leaves.assertAll();

	}

	@Test(priority = 7)
	public void TC08_verifyLeaveNoticePeriodColumnForSickLeavet() throws Exception {

		sTestCaseID = "TC13";
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

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[22]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.enter_NoticePeriodDayesInSick(data[13]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[25],data[13]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.enter_NoticePeriodDayesInSick(data[21]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[25],data[21]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.enter_NoticePeriodDayesInSick(data[14]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[25],data[14]);
		leaves.assertAll();

	}

	@Test(priority = 8)
	public void TC09_verifyTotalWeeksColumnForSickLeavet() throws Exception {

		sTestCaseID = "TC13";
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

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[22]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.enterTotalWeeksSick(data[13]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[26],data[13]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.enterTotalWeeksSick(data[17]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[26],data[17]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.enterTotalWeeksSick(data[14]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[25],data[14]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.enterTotalWeeksSick(data[21]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[25],data[21]);
		leaves.assertAll();

	}
	
	@Test(priority = 9)
	public void TC10_verifyAverageWeeklyEarningsColumnForSickLeavet() throws Exception {

		sTestCaseID = "TC13";
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

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[22]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.Enter_AWESick(data[13]);
		leaves.verifyWarningValidationMsg(data[27],data[13]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[13]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.Enter_AWESick(data[17]);
		leaves.verifyWarningValidationMsg(data[27],data[17]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[17]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.Enter_AWESick(data[14]);;
		leaves.verifyWarningValidationMsg(data[27],data[17]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[14]);
		leaves.Enter_LeaverEndDateSick(dtf.format(now));
		leaves.Enter_AWESick(data[21]);
		leaves.verifyWarningValidationMsg(data[27],data[21]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[15],data[21]);
		leaves.assertAll();

	}
	
	
	@Test(priority = 10)
	public void TC11_verifyLeaveStartDateColumn_ForUnpaidLeaveType() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[5]);
		leaves.clickDeletAllInLeaveApprovedPage(data[5]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[28]);
		leaves.Enter_LeaverStartDateHoliday(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[7]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[9]);
		leaves.CopyPaste_LeaverStartDateHoliday();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],"Copy Paste");
		leaves.clickHalfDayChekBox();
		leaves.Enter_LeaverStartDateHoliday(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[7]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[9]);
		leaves.CopyPaste_LeaverStartDateHoliday();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[9]);

		leaves.assertAll();

	}

	@Test(priority = 11)
	public void TC12_verifyLeaveEndDate_ForUnpaidLeaveType() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[28]);
		leaves.Enter_LeaverEndDateHoliday(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],data[7]);
		leaves.Enter_LeaverEndDateHoliday(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],data[9]);
		leaves.CopyPaste_LeaverEndDateHoliday();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],"Copy Paste");
		leaves.assertAll();
	}
	
	
	@Test(priority = 12)
	public void TC13_verifyLeaveStartDateColumn_ForOtherLeaveType() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.selectEmployeeNameInApprovedLeavesPage(data[5]);
		leaves.clickDeletAllInLeaveApprovedPage(data[5]);
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[29]);
		leaves.Enter_LeaverStartDateHoliday(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[7]);
		leaves.Enter_LeaverStartDateHoliday(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],data[9]);
		leaves.CopyPaste_LeaverStartDateHoliday();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[8],"Copy Paste");
		leaves.assertAll();

	}

	@Test(priority = 13)
	public void TC14_verifyLeaveEndDate_ForOtherLeaveType() throws Exception {

		sTestCaseID = "TC13";
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
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectLeaveType(data[29]);
		leaves.Enter_LeaverEndDateHoliday(data[7]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],data[7]);
		leaves.Enter_LeaverEndDateHoliday(data[9]);
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],data[9]);
		leaves.CopyPaste_LeaverEndDateHoliday();
		leaves.clickSaveBtn();
		leaves.verifyValidationMsg(data[10],"Copy Paste");
		leaves.assertAll();
	}

}
