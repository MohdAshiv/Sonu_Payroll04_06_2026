package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC010_12948_AddNote extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)
	public void TC01validateAddNoteFromTaxPayementReport() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		pages.CreateClient buisness = new pages.CreateClient(driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();

		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();

		pages.AccountingPeriodSettingBK_FAInactive Bk = new pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.EditCompany company = new pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		company.enterFirstName(data[30]);
		company.enterEmail(data[31]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();

		company.enterPayeNumber(data[16]);
		company.enterRefrenceNumber(data[17]);
		company.accountOfficeReffrence(data[18]);

		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[29]);
		company.Click_ClickSave();
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Click_PayrollDashboard();

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		employee.clickNewEmployee();
		employee.enterTitle(data[19]);
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[22]);
		employee.enterAddressLine(data[23]);
		employee.enterAddressLine2(data[24]);
		employee.enterPostCode(data[25]);
		employee.enterEmailAddress(data[31]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[29]);

		employee.clickOffPayWorker();

		employee.enterNICategory(data[26]);
		employee.enterTaxCode(data[27]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[28]);
		employee.clickSaveBtn();

		payroll.Click_PayrollDashboard();

		payroll.Run_Payroll();

		pages.reports report = new pages.reports(driver);
		report.clickTaxPayment();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNote(data[5]);
        verify.assertAll();
	}

	@Test(priority = 2)
	public void TC02validateAddNoteFromCsv() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.reports report = new pages.reports(driver);
		report.clickTaxPayment();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNoteCSV(data[6]);
		verify.assertAll();
	}

	@Test(priority = 3)
	public void TC03validateAddNoteFromPdf() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.reports report = new pages.reports(driver);
		report.clickTaxPayment();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNotePdf(data[8], data[7]);

		verify.assertAll();
	}

	@Test(priority = 4)
	public void TC04validateAddNoteFromEmailPdf() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.reports report = new pages.reports(driver);
		report.clickTaxPayment();

		pages.EmailSection email = new pages.EmailSection(driver);

		email.clickEmailTaxBtn();
		email.clickSendBtnTaxPayement();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNotePdf1(data[9], data[7]);

		verify.assertAll();
	}

	@Test(priority = 5)
	public void TC05validateAddNoteFromTaxPaymentReportEmployerView() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();

		filling.selectStatus(data[10]);
		filling.clickCheckBox();
		filling.enterNotes();
		filling.clickNottoSubmit();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(
				driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		employerView.clickTaxPayment();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNote1(data[5]);

		verify.assertAll();
	}

	@Test(priority = 6)
	public void TC06validateAddNoteFromCSVEmployerView() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();


		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(
				driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		employerView.clickTaxPayment();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNoteCSV(data[6]);

		verify.assertAll();
	}

	@Test(priority = 7)
	public void TC07validateAddNoteFromPdfEmployerView() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(
				driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		employerView.clickTaxPayment();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNotePdf(data[11], data[7]);

		verify.assertAll();
	}

	@Test(priority = 8)
	public void TC08validateAddNoteFromEmailPdfEmployerView() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(
				driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		employerView.clickTaxPayment();
		
		pages.EmailSection email = new pages.EmailSection(driver);
		email.clickEmailTaxBtnEmployerView();
		email.clickSendBtnTaxPayementEmployerView();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyOffPayWorkerNotePdf1(data[9], data[7]);
		verify.assertAll();
	}
	
	

	@Test(priority = 9)
	public void TC09validateToEmailTaxPayementReportAtEmployer() throws Exception {

		sTestCaseID = "TC010";
		Sheet = "Sheet7";
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
		pages.CreateClient buisness = new pages.CreateClient(driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();

		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();

		pages.AccountingPeriodSettingBK_FAInactive Bk = new pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.EditCompany company = new pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickPayrollDetails();

		company.enterPayeNumber(data[16]);
		company.enterRefrenceNumber(data[17]);
		company.accountOfficeReffrence(data[18]);

		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[29]);
		company.Click_ClickSave();
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Click_PayrollDashboard();

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		employee.clickNewEmployee();
		employee.enterTitle(data[19]);
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[22]);
		employee.enterAddressLine(data[23]);
		employee.enterAddressLine2(data[24]);
		employee.enterPostCode(data[25]);
		employee.enterEmailAddress(data[31]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[29]);

		employee.clickOffPayWorker();

		employee.enterNICategory(data[26]);
		employee.enterTaxCode(data[27]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[28]);
		employee.clickSaveBtn();

		payroll.Click_PayrollDashboard();

		payroll.Run_Payroll();

		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();

		filling.selectStatus(data[10]);
		filling.clickCheckBox();
		filling.enterNotes();
		filling.clickNottoSubmit();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(
				driver);
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		employerView.clickTaxPayment();
		
		pages.EmailSection email = new pages.EmailSection(driver);
		email.clickEmailTaxBtnEmployerView();
		email.enterEmailTaxPayementEmployerView();
		email.clickSendBtnTaxPayementEmployerView();
		
		
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyEmailToTaxPayement();
		verify.assertAll();
		
	}

}
