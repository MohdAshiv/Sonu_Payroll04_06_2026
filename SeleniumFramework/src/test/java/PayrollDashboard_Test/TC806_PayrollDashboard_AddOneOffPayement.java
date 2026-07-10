package PayrollDashboard_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC806_PayrollDashboard_AddOneOffPayement extends TestBase{
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateAddOneOffPayementRunPayrollAndUndoPayroll() throws Exception {

		sTestCaseID = "TC806";
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
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[108]);
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
		
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		_5671Departments_Page.DepartmentsPage page1 = new _5671Departments_Page.DepartmentsPage(driver);
		page1.selectDepartment(data[12]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[10]);
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
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[108]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
		employee.click3Dots();		
		
		employee.clickOnLeveBtn();
		employee.enterLeaveDate(data[28]);
	
		for(int i=0;i<=2;i++) {payroll.Run_Payroll();}

		
		pages.OneOffPayment oneOff= new pages.OneOffPayment(driver);
		oneOff.click_OneOffPayment();
		oneOff.selectAllEmployeeAndClickSaveBtn();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyDashboardRecord(data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24]);

		payroll.Run_Payroll();
		verify.verifyLeaverEmployee(0);
		payroll.Undo_LastPayroll();
		verify.verifyLeaverEmployee(1);

		verify.assertAll();
		

	}
	
	
	
	@Test(priority = 2)
	public void TC02validateAddOneOffFromPreviousPeriod() throws Exception {

		sTestCaseID = "TC806";
		Sheet = "Sheet6";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.SelecPeriodEndDate(data[9]);
		
		
		pages.OneOffPayment oneOff= new pages.OneOffPayment(driver);
		oneOff.click_OneOffPayment();
		oneOff.selectAllEmployeeAndClickSaveBtn();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyDashboardRecord(data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24]);

		oneOff.click_OneOffPayment();

		oneOff.deletOneOffPayement();

		verify.verifyLeaverEmployee(0);

		verify.assertAll();
		
	
	}

	
	//@Test(priority = 3)
	public void TC03validateOneOffPayementDeletAndSaveBtn() throws Exception {

		sTestCaseID = "TC806";
		Sheet = "Sheet6";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		
		pages.OneOffPayment oneOff= new pages.OneOffPayment(driver);
		oneOff.click_OneOffPayment();
		oneOff.selectAllEmployeeAndClickSaveBtn();
		
		payroll.Run_Payroll();
		

		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		
		oneOff.click_OneOffPayment();
		oneOff.selectAllEmployeeAndClickSaveBtn();

		verify.verifyAlertMsg(data[25]);
		oneOff.click_OneOffPayment();
		oneOff.deletOneOffPayement();
		verify.verifyAlertMsg(data[26]);

		payroll.SelecPeriodEndDate(data[9]);
		oneOff.click_OneOffPayment();
		oneOff.selectAllEmployeeAndClickSaveBtn();

		verify.verifyAlertMsg(data[25]);
		oneOff.click_OneOffPayment();
		oneOff.deletOneOffPayement();
		Thread.sleep(3000);
		verify.verifyAlertMsg(data[26]);
		System.out.println("mdm");

		verify.assertAll();
		
	
	}

}
