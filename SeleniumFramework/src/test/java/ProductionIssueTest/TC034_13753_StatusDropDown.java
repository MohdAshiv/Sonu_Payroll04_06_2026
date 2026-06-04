package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC034_13753_StatusDropDown extends TestBase{
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateStatusWithAll() throws Exception {

		sTestCaseID = "TC034";
		Sheet = "Sheet7";
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
		buisness.enterRegistrationDate(data[88]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[86]);
		Bk.Enter_CompanyAddressLine1(data[87]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[88]);
		Bk.Enter_NewEndDate(data[89]);
		Bk.Click_AccPeriodSave();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[108]);
		
	    pages.FrequencySet freq= new pages.FrequencySet(driver);
		
//		freq.Click_ClickAdditionalFrequecy();
//		freq.Select_F2(data[12]);
//		freq.Enter_WeeklyPayDate(data[108]);
//		company.Click_ClickSave();
//	
		company.Click_ClickSave();
		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
//
		pages.PensionSetup pension = new pages.PensionSetup(driver);
		
		pension.enterPensionStagingDate(data[93]);
		pension.enterSignatoryTitle();
		pension.enterSignatoryName();
		pension.enterEmailAddress(data[94]);
		pension.enterPhoneNumber();
		pension.enterPensionId(data[95]);
		pension.clickPensonDetailsSave();
		payroll.scrollClickPayrollDashboard();
		pension.clickPensionDashBoard();
		pension.addSchemeManually();
		pension.enterPensionSchemeName(data[96]);
		pension.selectPensionProvider(data[96]);
		pension.selectCalculationBasis(data[97]);
		pension.selectCalculationMethod(data[98]);
		pension.eeContribution(data[99]);
		pension.enterErContribution(data[100]);
		pension.enterSubgroupName();
		pension.enterGroupId();
		pension.enterSubGroupId();
		pension.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[17]);
		employee.enterLastName(data[14]);
		employee.enterDateOfBirth(data[104]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[107]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[108]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		employee.clickAutoEnrolment();
		pension.selectWorkerType(data[109]);
		pension.selectScheme(data[96]);
		pension.enterEnrollmentDate(data[108]);
		pension.eeChoosenContribution(data[99]);
		pension.erChoosenContribution(data[100]);
		pension.eeVoluntaryContribution(data[101]);
		pension.eRVoluntaryContribution(data[101]);
		pension.clickAutoEnrollmentSaveBtn();
		payroll.Click_PayrollDashboard();
		
		for(int i=0;i<=3;i++) {payroll.Run_Payroll();}
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();

		filling.selectFrequency(data[8]);
		filling.clickOnCheckBox();
		filling.clickSumbimtBtn();
		filling.clickOnCheckBox2();
		filling.enterNotes();
		filling.clickNottoSubmit();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyStatus(4);
		
		verify.assertAll();
	}
		
	
	
	@Test(priority=2)
	public void TC02validateStatusWithSubmit() throws Exception {

		sTestCaseID = "TC034";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();

		filling.selectFrequency(data[8]);
		filling.selectPensionStatus(data[18]);
		
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyStatusSubmitAndNotToSubmit(1,data[18]);
		verify.assertAll();
		
	}
	
	
	@Test(priority=3)
	public void TC03validateStatusWithNotToSubmit() throws Exception {

		sTestCaseID = "TC034";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();

		filling.selectFrequency(data[8]);
		filling.selectPensionStatus("Not To Submit");
		
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyStatusSubmitAndNotToSubmit(1,data[19]);
		verify.assertAll();
		
	}
	
	
	
	@Test(priority=4)
	public void TC04validateStatusWithPending() throws Exception {

		sTestCaseID = "TC034";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();

		filling.selectFrequency(data[8]);
		filling.selectPensionStatus(data[20]);
		
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyStatusSubmitAndNotToSubmit(2,data[20]);
		verify.assertAll();
		
	}
	
	
	
	@Test(priority=5)
	public void TC05validateStatusWithProcessingAndFailed() throws Exception {

		sTestCaseID = "TC034";
		Sheet = "Sheet7";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();

		filling.selectFrequency(data[8]);
		filling.selectPensionStatus(data[21]);
		
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifNoRecordStatus(data[23]);
		
		filling.selectPensionStatus(data[22]);
		
		verify.verifNoRecordStatus(data[23]);
		verify.assertAll();
		
	}
}
