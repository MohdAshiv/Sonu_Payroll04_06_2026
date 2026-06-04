package _2855LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC573_LeaveRequestWithMaternityLeave extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority = 1)
	public void TC01validateApprovedMaternityApprovedLeaveRequestAdmin() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();

		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.enterExpectedBirthDate(data[22]);
		leaves.Enter_ActualBirthDate(data[22]);
		leaves.enterFromDate(data[22]);
		leaves.enterAwe1();
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		utilities.ChangeWindow.Switchwindow(3, driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.clickApproveBtn();
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);
		
		verify.verifyleaveApprovedOrRejectMsg();
		utilities.ChangeWindow.Switchwindow(3, driver);
	//	payroll.Click_PayrollDashboard();
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.clcikSearchBtn();
	
		verify.verifySMPLeave(data[21], data[22], data[23], data[24],data[25],data[26],data[27]);
		verify.assertAll();
}	
	
	
	@Test(priority = 2)
	public void TC02validateApprovedMaternityApprovedLeaveRequestEmployer() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();
		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.enterExpectedBirthDate(data[22]);
		leaves.Enter_ActualBirthDate(data[22]);
		leaves.enterFromDate(data[22]);
		leaves.enterAwe1();
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		utilities.ChangeWindow.Switchwindow(3, driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.clickApproveBtn();
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);

		verify.verifyleaveApprovedOrRejectMsg();

		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		
		verify.verifySMPLeave(data[21], data[22], data[23], data[24],data[25],data[26],data[27]);
		verify.assertAll();
	
	
}
	
	@Test(priority = 3)
	public void TC03validateApprovedMaternityApprovedLeaveHistorytEmployee() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[29]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();
		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.enterExpectedBirthDate(data[22]);
		leaves.Enter_ActualBirthDate(data[22]);
		leaves.enterFromDate(data[22]);
		leaves.enterAwe1();
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();

		utilities.ChangeWindow.Switchwindow(3, driver);

		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.clickApproveBtn();
		
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);

		verify.verifyleaveApprovedOrRejectMsg();
		utilities.ChangeWindow.Switchwindow(3, driver);
		employerView.Click_EmployerView();

		employerView.clickEmployee();
		leaves.clickLeaveManagement();

		leaves.clickHistoryLeaves1();
		
		verify.verifySMPLeave(data[30], data[31], data[32], data[33],data[34],data[35],data[36]);
		verify.assertAll();
	
}
	

	@Test(priority = 4)
	public void TC04validateApprovedMaternityApprovedLeaveHistorytEmployer() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();
		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.enterExpectedBirthDate(data[22]);
		leaves.Enter_ActualBirthDate(data[22]);
		leaves.enterFromDate(data[22]);
		leaves.enterAwe1();
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();

		utilities.ChangeWindow.Switchwindow(3, driver);

		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickApproveBtn();
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);
		verify.verifyleaveApprovedOrRejectMsg();

		leaves.clickLeaveManagement();
		leaves.clickHistoryLeaves();
		verify.verifySMPLeave(data[21], data[22], data[23], data[24],data[25],data[26],data[27]);

		verify.assertAll();
	
}
	
	@Test(priority = 5)
	public void TC05validateApprovedMaternityRejectedLeaveHistorytEmployer() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[29]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();
		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.enterExpectedBirthDate(data[22]);
		leaves.Enter_ActualBirthDate(data[22]);
		leaves.enterFromDate(data[22]);
		leaves.enterAwe1();
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();

		utilities.ChangeWindow.Switchwindow(3, driver);

		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickRejectBtn();
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);
		verify.verifyleaveRejectMsg();

		leaves.clickLeaveManagement();
		leaves.clickHistoryLeaves();
		verify.verifySMPLeave(data[37], data[38], data[39], data[40],data[41],data[42],data[43]);

		verify.assertAll();
	
}
	
	

	@Test(priority = 6)
	public void TC06validateApprovedMaternityRejectedLeaveHistorytEmployee() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();
		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.enterExpectedBirthDate(data[22]);
		leaves.Enter_ActualBirthDate(data[22]);
		leaves.enterFromDate(data[22]);
		leaves.enterAwe1();
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		utilities.ChangeWindow.Switchwindow(3, driver);

		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickRejectBtn();
		
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);

		verify.verifyleaveRejectMsg();
		utilities.ChangeWindow.Switchwindow(3, driver);
		employerView.Click_EmployerView();

		employerView.clickEmployee();
		leaves.clickLeaveManagement();

		leaves.clickHistoryLeaves1();
		
		verify.verifySMPLeave1(data[44], data[45], data[46], data[47],data[48],data[49],data[50]);
		verify.assertAll();
	
}
	
	@Test(priority = 7)
	public void TC07validateApprovedMaternityRejectedLeaveRequestEmployer() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();
		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		leaves.enterExpectedBirthDate(data[22]);
		leaves.Enter_ActualBirthDate(data[22]);
		leaves.enterFromDate(data[22]);
		leaves.enterAwe1();
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		utilities.ChangeWindow.Switchwindow(3, driver);
		employerView.Click_EmployerView();
		leaves.clickLeaveManagement();
		leaves.clickPendingForApproval();
		leaves.clickEmployeeNameOnLeaveCancelPage();
		leaves.clickCheckBox();
		leaves.enterNote();
		leaves.clickRejectBtn();
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);

		verify.verifyleaveRejectMsg();
		leaves.clickLeaveManagement();
		leaves.clickRejectedLeaves();
		
		verify.verifySMPLeave(data[37], data[38], data[39], data[40],data[41],data[42],data[43]);
		verify.assertAll();
	
	
}
	
	@Test(priority = 8)
	public void TC08validateErrorMsgForSameDurationLeave() throws Exception {

		sTestCaseID = "TC573";
		Sheet = "Sheet6";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();
		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[70]);
		company.enterHolidayPayRate(data[71]);
		company.enterMaxCarryOver(data[72]);
		company.enterWeeklyWorkingHrs(data[73]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[50]);
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
	     leaves.selectLeaveType(data[50]);
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		_2855Page.VerifyLeaveManagement verify= new  _2855Page.VerifyLeaveManagement(driver);

		verify.verifyConcideDuration(data[51]);
		verify.assertAll();
	}
}
