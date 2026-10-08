package calculationsAcrossReports;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC07_AgentRunPayroll2 extends TestBase {
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=19)

	public void TC01_validateTaxPayment() throws Exception {

		sTestCaseID = "TC002";
		Sheet = "calculationsAcrossReports";
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
		
		company.ClickContactDetails();
		company.enterFirstName(data[10]);
		
		company.enterEmail(data[11]);
		company.clickAddContact();
		
	    company.Click_clickDepartments();		
		company.clickDepartment();
		company.enterDepartmentName1(data[12]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(15000);
			
		company.Click_clickPayrollDetails();
		company.enterRegistrationDate(data[108]);
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		company.inputTextUTR(data[8]);
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[108]);
		company.Click_ClickSave();
		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

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
		employee.enterFirstName(data[102]);
		employee.enterLastName(data[103]);
		employee.enterDateOfBirth(data[104]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[107]);
		employee.enterEmailAddress(data[11]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[108]);

		employee.enterNICategory(data[6]);
		employee.enterNationalInsuranceNumber("JG536834C");
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();

		employee.click_Paydetails();
		employee.selectDepartment(data[12]);
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
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
        payroll.Run_Payroll();
		verify.captureIncomeTax("Monthly");
		utilities.ChangeWindow.Switchwindow(1, driver);
		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		agentpage.searchCompanyName();
		agentpage.clickSearchButton();
		verify.verifyCapturedIncomeTax("(//*[@class='table table-head-bg'])/tbody/tr[1]","(//*[@class='table table-head-bg'])/tbody/tr[1]/td[7]");

	}

	
	@Test(priority=2, dependsOnMethods = "TC01_validateTaxPayment")

	public void TC02validateGrossAmount() throws Exception {

		sTestCaseID = "TC002";
		Sheet = "calculationsAcrossReports";
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
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
        payroll.Run_Payroll();


		verify.captureGross();
		utilities.ChangeWindow.Switchwindow(1, driver);
		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		agentpage.searchCompanyName();
		agentpage.clickSearchButton();
		verify.verifyCapturedGross("(//*[@class='table table-head-bg'])/tbody/tr[1]","(//*[@class='table table-head-bg'])/tbody/tr[1]/td[6]");
	}
	
	

	@Test(priority=3, dependsOnMethods = "TC01_validateTaxPayment")

	public void TC03validateTotalCoast() throws Exception {

		sTestCaseID = "TC002";
		Sheet = "calculationsAcrossReports";
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
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
        payroll.Run_Payroll();
        
		verify.captureTotalCost();
		utilities.ChangeWindow.Switchwindow(1, driver);
		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		agentpage.searchCompanyName();
		agentpage.clickSearchButton();
		verify.verifyTotalCost("(//*[@class='table table-head-bg'])/tbody/tr[1]","(//*[@class='table table-head-bg'])/tbody/tr[1]/td[9]");

	}
	
	

	@Test(priority=4, dependsOnMethods = "TC01_validateTaxPayment")

	public void TC04validateNetPay() throws Exception {

		sTestCaseID = "TC002";
		Sheet = "calculationsAcrossReports";
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
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
        payroll.Run_Payroll();
        
		verify.captureNetPay();		
		utilities.ChangeWindow.Switchwindow(1, driver);
		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		agentpage.searchCompanyName();
		agentpage.clickSearchButton();
		verify.verifyCapturedNetPay("(//*[@class='table table-head-bg'])/tbody/tr[1]","(//*[@class='table table-head-bg'])/tbody/tr[1]/td[8]");

	}

}
