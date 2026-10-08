package New_LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class EditEmployee  extends TestBase{
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_LeaveStartDateShouldBeDisableAllways_LeaveStartDateMustBeSetAccordingCompanyStandard() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[10]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		company.clickGeneralTerms();
		company.verifyLeaveStartDate(data[10]);
		company.verifyLeaveStartDateBoxDisible();

		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[25]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyLeaveStartDate(data[25]);
		company.verifyLeaveStartDateBoxDisible();
		
	
		company.AssertALL();
		Report.assertAll();
		
	}
	
	
	@Test(priority = 2)
	public void TC02_AnnualLeaveDaysMustSetAccordingToEditCompany() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterleaveDays(data[26]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyLeaveDays(data[26]);
		leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterleaveDays(data[14]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyLeaveDays(data[14]);
		leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		
		
	}
	
	@Test(priority = 3)
	public void TC03_VerfiyAnnualLeaveDaysUpdatedAccordingToEmployee() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.enterleaveDays(data[26]);
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyLeaveDays(data[26]);
		leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyLeaveDays(data[14]);
		leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	
	@Test(priority = 4)
	public void TC04_VerfiyHolidayPayRateUpdatedFromEditCompany() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterHolidayPayRate(data[28]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyHolidayPayRate(data[28]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterHolidayPayRate(data[11]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyHolidayPayRate(data[11]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		
		
	}
	
	@Test(priority = 5)
	public void TC05_VerfiyHolidayPayRateUpdatedAccordingToEmployee() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.enterHolidayPayRate(data[28]);
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyHolidayPayRate(data[28]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyHolidayPayRate(data[11]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	
	@Test(priority = 6)
	public void TC06_VerfiyCarryForwardUpdatedFromEditCompany() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterMaxCarryOver(data[29]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(12);
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxCarryOver(data[29]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterMaxCarryOver(data[14]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(12);
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxCarryOver(data[14]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		
		
	}
	
	@Test(priority = 7)
	public void TC07_VerfiyCarryForwardUpdatedAccordingToEmployee() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.enterMaxCarryOver(data[29]);
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		//payroll.Run_PayrollByIndex(12);
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxCarryOver(data[29]);
		leaves.verifyAnnualLeaveSchedule(data[26], data[29], data[27], data[27], data[27], data[30]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(12);
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxCarryOver(data[14]);
		leaves.verifyAnnualLeaveSchedule(data[26], data[14], data[27], data[27], data[27], data[31]);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.AssertALL();
		Report.assertAll();
		
	}
	
	@Test(priority = 8)
	public void TC08_VerfiyPaySicknessUpdatedFromEditCompany () throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterMaxSickDays(data[32]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxSickDays(data[32]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterMaxSickDays(data[33]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxSickDays(data[33]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		
		
	}
	
	@Test(priority = 9)
	public void TC09_VerfiyPaySicknessUpdatedAccordingToEmployee() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.enterMaxSickDays(data[32]);
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxSickDays(data[32]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyMaxSickDays(data[33]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	@Test(priority = 10)
	public void TC10_VerfiyVerfiyNoticePeriodUpdatedFromEditCompany() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterNoticePeriod(data[32]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyNoticePeriod(data[32]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterNoticePeriod(data[33]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyNoticePeriod(data[33]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		
		
	}
	
	@Test(priority = 11)
	public void TC11_VerfiyPaySicknessUpdatedAccordingToEmployee() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.enterNoticePeriod(data[32]);
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyNoticePeriod(data[32]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyNoticePeriod(data[33]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	
	@Test(priority = 12)
	public void TC12_VerfiyRetirementAgeUpdatedFromEditCompany() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterRetirementAgeMale(data[31]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyRetirementAgeMale(data[31]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterRetirementAgeMale(data[34]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyRetirementAgeMale(data[34]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	@Test(priority = 13)
	public void TC13_VerfiyRetirementAgeUpdatedAccordingToEmploye() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.enterRetirementAgeMale(data[31]);
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyRetirementAgeMale(data[31]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyRetirementAgeMale(data[34]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	
	@Test(priority = 14)
	public void TC14_VerfiyWorkingDaysUpdatedFromEditCompany() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.chkNormalWorkingDays(data[35]);
		company.chkNormalWorkingDays(data[36]);
		company.chkNormalWorkingDays(data[37]);
		company.chkNormalWorkingDays(data[38]);
		company.chkNormalWorkingDays(data[39]);
		company.chkNormalWorkingDays(data[40]);
		company.chkNormalWorkingDays(data[41]);
		company.unChkNormalWorkingDays(data[35]);
		company.unChkNormalWorkingDays(data[36]);
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyUnChkedNormalWorkingDays(data[35]);
		company.verifyUnChkedNormalWorkingDays(data[36]);
		company.verifychkedNormalWorkingDays(data[37]);
		company.verifychkedNormalWorkingDays(data[38]);
		company.verifychkedNormalWorkingDays(data[39]);
		company.verifychkedNormalWorkingDays(data[40]);
		company.verifychkedNormalWorkingDays(data[41]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		
		company.chkNormalWorkingDays(data[35]);
		company.chkNormalWorkingDays(data[36]);
		company.chkNormalWorkingDays(data[37]);
		company.chkNormalWorkingDays(data[38]);
		company.chkNormalWorkingDays(data[39]);
		company.chkNormalWorkingDays(data[40]);
		company.chkNormalWorkingDays(data[41]);
		company.unChkNormalWorkingDays(data[40]);
		company.unChkNormalWorkingDays(data[41]);
		
		
		company.Click_OverwriteExistingEmployees();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyUnChkedNormalWorkingDays(data[40]);
		company.verifyUnChkedNormalWorkingDays(data[41]);
		company.verifychkedNormalWorkingDays(data[35]);
		company.verifychkedNormalWorkingDays(data[36]);
		company.verifychkedNormalWorkingDays(data[37]);
		company.verifychkedNormalWorkingDays(data[38]);
		company.verifychkedNormalWorkingDays(data[39]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	@Test(priority = 15)
	public void TC15_VerfiyWorkingDaysUpdatedAccordingToEmployee() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		
		company.chkNormalWorkingDays(data[35]);
		company.chkNormalWorkingDays(data[36]);
		company.chkNormalWorkingDays(data[37]);
		company.chkNormalWorkingDays(data[38]);
		company.chkNormalWorkingDays(data[39]);
		company.chkNormalWorkingDays(data[40]);
		company.chkNormalWorkingDays(data[41]);
		company.unChkNormalWorkingDays(data[35]);
		company.unChkNormalWorkingDays(data[36]);
		
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyUnChkedNormalWorkingDays(data[35]);
		company.verifyUnChkedNormalWorkingDays(data[36]);
		company.verifychkedNormalWorkingDays(data[37]);
		company.verifychkedNormalWorkingDays(data[38]);
		company.verifychkedNormalWorkingDays(data[39]);
		company.verifychkedNormalWorkingDays(data[40]);
		company.verifychkedNormalWorkingDays(data[41]);
		//leaves.verifyAnnualLeaveSchedule(data[26], data[27], data[27], data[27], data[27], data[26]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Employee A");
		company.clickGeneralTerms();
		company.verifyUnChkedNormalWorkingDays(data[40]);
		company.verifyUnChkedNormalWorkingDays(data[41]);
		company.verifychkedNormalWorkingDays(data[35]);
		company.verifychkedNormalWorkingDays(data[36]);
		company.verifychkedNormalWorkingDays(data[37]);
		company.verifychkedNormalWorkingDays(data[38]);
		company.verifychkedNormalWorkingDays(data[39]);
		//leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		company.AssertALL();
		Report.assertAll();
		
	}
	
	
	@Test(priority = 16)
	public void TC16_VerifyFunctionalityOfButtonResetWithCompantStd() throws Exception {

		sTestCaseID = "TC26";
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
		

		OpenClient.Enter_EnterClientName("UIxevihRj");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.EditCompany company= new 	pages.EditCompany(driver);
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterleaveDays(data[14]);
		company.enterHolidayPayRate(data[11]);
		company.enterMaxCarryOver(data[14]);
		company.enterMaxSickDays(data[33]);
		company.enterNoticePeriod(data[33]);
		company.enterRetirementAgeMale(data[34]);
		company.chkNormalWorkingDays(data[35]);
		company.chkNormalWorkingDays(data[36]);
		company.chkNormalWorkingDays(data[37]);
		company.chkNormalWorkingDays(data[38]);
		company.chkNormalWorkingDays(data[39]);
		company.chkNormalWorkingDays(data[40]);
		company.chkNormalWorkingDays(data[41]);
		company.unChkNormalWorkingDays(data[40]);
		company.unChkNormalWorkingDays(data[41]);
		company.Click_ClickSave();
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(3);
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[15]);
		employee.enterFirstName(data[42]);
		employee.enterLastName(data[43]);
		employee.enterDateOfBirth(data[18]);
		employee.enterAddressLine(data[19]);
		employee.enterAddressLine2(data[20]);
		employee.enterPostCode(data[21]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[22]);
		employee.enterNICategory(data[17]);
		employee.enterTaxCode(data[23]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[24]);
		company.clickGeneralTerms();
		
		company.enterleaveDays(data[44]);
		company.enterHolidayPayRate(data[44]);
		company.enterMaxCarryOver(data[44]);
		company.enterMaxSickDays(data[44]);
		company.enterNoticePeriod(data[44]);
		company.enterRetirementAgeMale(data[44]);
		company.chkNormalWorkingDays(data[35]);
		company.chkNormalWorkingDays(data[36]);
		company.chkNormalWorkingDays(data[37]);
		company.chkNormalWorkingDays(data[38]);
		company.chkNormalWorkingDays(data[39]);
		company.chkNormalWorkingDays(data[40]);
		company.chkNormalWorkingDays(data[41]);
		company.unChkNormalWorkingDays(data[35]);
		company.unChkNormalWorkingDays(data[36]);
		employee.clickSaveBtn();
		
		
		Report.clickOnEmpLinkByNameInDashboard("Mr. Ashiv Ltd");
		company.clickGeneralTerms();
		
		company.verifyLeaveDays(data[44]);
		company.verifyHolidayPayRate(data[44]);
		company.verifyMaxCarryOver(data[44]);
		company.verifyMaxSickDays(data[44]);
		company.verifyNoticePeriod(data[44]);
		company.verifyRetirementAgeMale(data[44]);
		company.verifychkedNormalWorkingDays(data[40]);
		company.verifychkedNormalWorkingDays(data[41]);
		company.verifychkedNormalWorkingDays(data[37]);
		company.verifychkedNormalWorkingDays(data[38]);
		company.verifychkedNormalWorkingDays(data[39]);
		company.verifyUnChkedNormalWorkingDays(data[35]);
		company.verifyUnChkedNormalWorkingDays(data[36]);
		leaves.verifyAnnualLeaveSchedule(data[44], data[27], data[27], data[27], data[27], data[44]);
		
		company.clickOnResetWithCompanyStdInEditEmp();
		company.clickOnSaveBtnInEditEmp();
		payroll.Click_PayrollDashboard();
		Report.clickOnEmpLinkByNameInDashboard("Mr. Ashiv Ltd");
		company.clickGeneralTerms();
		
		
		company.verifyLeaveDays(data[14]);
		company.verifyHolidayPayRate(data[11]);
		//company.verifyMaxCarryOver(data[14]);
		company.verifyMaxSickDays(data[33]);
		company.verifyNoticePeriod(data[33]);
		company.verifyRetirementAgeMale(data[34]);
		company.verifychkedNormalWorkingDays(data[35]);
		company.verifychkedNormalWorkingDays(data[36]);
		company.verifychkedNormalWorkingDays(data[37]);
		company.verifychkedNormalWorkingDays(data[38]);
		company.verifychkedNormalWorkingDays(data[39]);
		company.verifyUnChkedNormalWorkingDays(data[40]);
		company.verifyUnChkedNormalWorkingDays(data[41]);
		leaves.verifyAnnualLeaveSchedule(data[14], data[27], data[27], data[27], data[27], data[14]);
		
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		employee.clickOnEmployeeList();
		employee.DeleteEmp("Mr. Ashiv  Ltd");
		
		company.AssertALL();
		
		
	}
}