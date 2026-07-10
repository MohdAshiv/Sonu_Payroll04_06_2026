package PayrollDashBoardCalculations;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC01_NICalculationsMonthly extends TestBase {

    public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateNormalEmployeeNI() throws Exception {

		sTestCaseID = "TC001";
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
		
	    company.Click_clickDepartments();		
		company.clickDepartment();
		company.enterDepartmentName1(data[12]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(15000);
			
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		
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
		payroll.Click_PayrollDashboard();
	    verify.verifyIncomeTaxPensionNPA("Monthly");

		verify.verifyTop10EmployeesNI("Monthly");
		payroll.runPayroll();
		verify.verifyTop10EmployeesNIRunPayroll("Monthly");
		payroll.Click_PayrollDashboard();

		payroll.Run_Payroll();

		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("2500");
		processPay.clickSaveBtn();
		verify.verifyTop10EmployeesNI("Monthly");
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("00");
		processPay.clickSaveBtn();
		verify.verifyTop10EmployeesNI("Monthly");
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("123000");
		processPay.clickSaveBtn();
		verify.verifyTop10EmployeesNI("Monthly");
		
		payroll.runPayroll();
		verify.verifyTop10EmployeesNIRunPayroll("Monthly");


	}
	
	
	@Test(priority=2)

	public void TC02validateDirectorNI() throws Exception {

		sTestCaseID = "TC001";
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
		
	    pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

        payroll.UndoPayroll();

		employee.click3Dots();
		employee.clickEditBtn();
		
		employee.clickMandotoryPayroll();
		

		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[108]);
		employee.select_NI_CalculationMethod("Alternative Method");
		employee.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyDirectorNI("ALTERNATIVE",1, "MONTHLY");
		payroll.runPayroll();
		verify.verifyDirectorNiRunPayroll("ALTERNATIVE",1, "MONTHLY");
		payroll.Click_PayrollDashboard();

		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("2100");
		processPay.clickSaveBtn();
		verify.verifyDirectorNI("ALTERNATIVE",1, "MONTHLY");
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("00");
		processPay.clickSaveBtn();
		verify.verifyDirectorNI("ALTERNATIVE",1, "MONTHLY");
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("150000");
		processPay.clickSaveBtn();
		verify.verifyDirectorNI("ALTERNATIVE",1, "MONTHLY");
		payroll.runPayroll();
		verify.verifyDirectorNiRunPayroll("ALTERNATIVE",1, "MONTHLY");

	}
	
	

	@Test(priority=3)

	public void TC03validateFreePortNI() throws Exception {

		sTestCaseID = "TC001";
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
		
	  pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		
	    company.Click_clickPayrollDetails();		
		company.clickYesFreePort();
		company.clickYesInvesmentZone();
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
	
	    pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

        payroll.UndoPayroll();

		employee.click3Dots();
		employee.clickEditBtn();
		
		employee.clickMandotoryPayroll();
		
		employee.clickNoDirector();
		employee.enterNICategory("F");
		employee.enterWorkPlacePostCode("HA3 8DP");
		employee.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyTop10EmployeesFreeportNI("Monthly");
		payroll.runPayroll();
		
		verify.verifyTop10EmployeesFreeportNiRunPayroll("Monthly");
		payroll.runPayroll2();

		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("2000");
		processPay.clickSaveBtn();
		verify.verifyTop10EmployeesFreeportNI("Monthly");
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("00");
		processPay.clickSaveBtn();
		verify.verifyTop10EmployeesFreeportNI("Monthly");
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay("90000");
		processPay.clickSaveBtn();
		verify.verifyTop10EmployeesFreeportNI("Monthly");
		payroll.runPayroll();

		verify.verifyTop10EmployeesFreeportNiRunPayroll("Monthly");


	}
}
