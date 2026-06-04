package PayrollDashBoardCalculations;
import org.testng.annotations.Test;
import tests.TestBase;
import utilities.ExcelData;

public class TC14_PensionFourWeekly extends TestBase {
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)
	public void TC01validateQalifyingRAS() throws Exception {

		sTestCaseID = "TC014";
		Sheet = "PayrollDashboardCalculations";	
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

		
	    company.Click_clickDepartments();		
		company.clickDepartment();
		company.enterDepartmentName1(data[8]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(15000);
		
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		
		pages.FrequencySet freq= new pages.FrequencySet(driver);
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[12]);
		freq.Enter_FourWeeklyPayDate(data[69]);
		company.Click_ClickSave();
	
		freq.clickDeletBtn();
		
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
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyPension("FOUR_WEEKLY", "QUALIFYING","RAS");
	    payroll.runPayroll();
		verify.verifyPensionRunPayroll("FOUR_WEEKLY", "QUALIFYING","RAS");

}
	

	@Test(priority=2)
	public void TC02validateCustomRAS() throws Exception {
		sTestCaseID = "TC014";
		Sheet = "PayrollDashboardCalculations";	
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

		pages.PensionSetup pension = new pages.PensionSetup(driver);
	
		pension.clickPensionDashBoard();
		pension.clickViewScheme();
		pension.clickEditScheme();
		
		pension.selectCalculationBasis1("Custom");
		pension.selectCalculationMethod1(data[98]);
	
		pension.clickSaveBtn1();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
	
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyPension("FOUR_WEEKLY", "CUSTOM","RAS");
	    payroll.runPayroll();
		verify.verifyPensionRunPayroll("FOUR_WEEKLY", "CUSTOM","RAS");

			
	}
	
	
	

	@Test(priority=3)
	public void TC03validateQualifyingNetPay() throws Exception {
		sTestCaseID = "TC014";
		Sheet = "PayrollDashboardCalculations";	
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

		pages.PensionSetup pension = new pages.PensionSetup(driver);
	
		pension.clickPensionDashBoard();
		pension.clickViewScheme();
		pension.clickEditScheme();
		
		pension.selectCalculationBasis1("Qualifying Earnings");
		pension.selectCalculationMethod1("Net pay arrangement");
	
		pension.clickSaveBtn1();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
	
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyPension("FOUR_WEEKLY", "QUALIFYING","NET_PAY");
	    payroll.runPayroll();
		verify.verifyPensionRunPayroll("FOUR_WEEKLY", "QUALIFYING","NET_PAY");


	}
	

	@Test(priority=4)
	public void TC04validateCustomNetPay() throws Exception {
		sTestCaseID = "TC014";
		Sheet = "PayrollDashboardCalculations";	
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

		pages.PensionSetup pension = new pages.PensionSetup(driver);
	
		pension.clickPensionDashBoard();
		pension.clickViewScheme();
		pension.clickEditScheme();
		
		pension.selectCalculationBasis1("Custom");
		pension.selectCalculationMethod1("Net pay arrangement");
	
		pension.clickSaveBtn1();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyPension("FOUR_WEEKLY", "CUSTOM","NET_PAY");
	    payroll.runPayroll();
		verify.verifyPensionRunPayroll("FOUR_WEEKLY", "CUSTOM","NET_PAY");

	}
	
	@Test(priority=5)
	public void TC05validateQualifyingSalarySacrifice() throws Exception {
		sTestCaseID = "TC014";
		Sheet = "PayrollDashboardCalculations";	
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

		pages.PensionSetup pension = new pages.PensionSetup(driver);
	
		pension.clickPensionDashBoard();
		pension.clickViewScheme();
		pension.clickEditScheme();
		
		pension.selectCalculationBasis1("Qualifying Earnings");
		pension.selectCalculationMethod1("Salary sacrifice");
	
		pension.clickSaveBtn1();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyPension("FOUR_WEEKLY", "QUALIFYING","SALARY_SACRIFICE");
	    payroll.runPayroll();
		verify.verifyPensionRunPayroll("FOUR_WEEKLY", "QUALIFYING","SALARY_SACRIFICE");

	}
	
	@Test(priority=6)
	public void TC06validateCustomSalarySacrifice() throws Exception {
		sTestCaseID = "TC014";
		Sheet = "PayrollDashboardCalculations";	
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

		pages.PensionSetup pension = new pages.PensionSetup(driver);
	
		pension.clickPensionDashBoard();
		pension.clickViewScheme();
		pension.clickEditScheme();
		
		pension.selectCalculationBasis1("Custom");
		pension.selectCalculationMethod1("Salary sacrifice");
	
		pension.clickSaveBtn1();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyPension("FOUR_WEEKLY", "CUSTOM","SALARY_SACRIFICE");
	    payroll.runPayroll();
		verify.verifyPensionRunPayroll("FOUR_WEEKLY", "CUSTOM","SALARY_SACRIFICE");

	}

	
}
