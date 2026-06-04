package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC595_PayrollSummaryPension_42Employee extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validatePayrollSummaryApril() throws Exception {

		sTestCaseID = "TC595";
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
		OpenClient.Enter_EnterClientName(data[80]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[88]);
//		buisness.enterFirstName();
//		buisness.enterLastName();
//		buisness.clickSaveBtn();
//		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//	
//		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//		Bk.Click_BKEdit();
//		Bk.Select_services(data[86]);
//		Bk.Enter_CompanyAddressLine1(data[87]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[88]);
//		Bk.Enter_NewEndDate(data[89]);
//		Bk.Click_AccPeriodSave();
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.ClickContactDetails();
//		company.enterFirstName(data[76]);
//		company.enterEmail(data[77]);
//		company.clickAddContact();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[90]);
//		company.enterRefrenceNumber(data[91]);
//		company.accountOfficeReffrence(data[92]);
//		company.enterUtrNumber();
//
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[108]);
//	
//		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//		pages.PensionSetup pension = new pages.PensionSetup(driver);
//		
//		pension.enterPensionStagingDate(data[93]);
//		pension.enterSignatoryTitle();
//		pension.enterSignatoryName();
//		pension.enterEmailAddress(data[94]);
//		pension.enterPhoneNumber();
//		pension.enterPensionId(data[95]);
//		pension.clickPensonDetailsSave();
//		payroll.scrollClickPayrollDashboard();
//		pension.clickPensionDashBoard();
//		pension.addSchemeManually();
//		pension.enterPensionSchemeName(data[96]);
//		pension.selectPensionProvider(data[96]);
//		pension.selectCalculationBasis(data[97]);
//		pension.selectCalculationMethod(data[98]);
//		pension.eeContribution(data[99]);
//		pension.enterErContribution(data[100]);
//		pension.enterSubgroupName();
//		pension.enterGroupId();
//		pension.enterSubGroupId();
//		pension.clickSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//	   pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[112]);
//		employee.enterFirstName(data[113]);
//		employee.enterLastName(data[114]);
//		employee.enterDateOfBirth(data[241]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[284]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[327]);
//		employee.enterNI(data[370]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[413]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[456]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[115]);
//		employee.enterFirstName(data[116]);
//		employee.enterLastName(data[117]);
//		employee.enterDateOfBirth(data[242]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[285]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[328]);
//		employee.enterNI(data[371]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[414]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[457]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//
//		
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[118]);
//		employee.enterFirstName(data[119]);
//		employee.enterLastName(data[120]);
//		employee.enterDateOfBirth(data[243]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[286]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[329]);
//		employee.enterNI(data[372]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[415]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[458]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[121]);
//		employee.enterFirstName(data[122]);
//		employee.enterLastName(data[123]);
//		employee.enterDateOfBirth(data[244]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[287]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[330]);
//		employee.enterNI(data[373]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[416]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[459]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//	
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[124]);
//		employee.enterFirstName(data[125]);
//		employee.enterLastName(data[126]);
//		employee.enterDateOfBirth(data[245]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[288]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[331]);
//		employee.enterNI(data[374]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[417]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[460]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[127]);
//		employee.enterFirstName(data[128]);
//		employee.enterLastName(data[129]);
//		employee.enterDateOfBirth(data[246]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[289]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[332]);
//		employee.enterNI(data[375]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[418]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[461]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);
//		pension.selectStatus(data[110]);
//		pension.selectScheme(data[96]);
//		pension.enterOptOutDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[130]);
//		employee.enterFirstName(data[131]);
//		employee.enterLastName(data[132]);
//		employee.enterDateOfBirth(data[247]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[290]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[333]);
//		employee.enterNI(data[376]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[419]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[462]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//	
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[133]);
//		employee.enterFirstName(data[134]);
//		employee.enterLastName(data[135]);
//		employee.enterDateOfBirth(data[248]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[291]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[334]);
//		employee.enterNI(data[377]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[420]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[463]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[136]);
//		employee.enterFirstName(data[137]);
//		employee.enterLastName(data[138]);
//		employee.enterDateOfBirth(data[249]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[292]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[335]);
//		employee.enterNI(data[378]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[421]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[464]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[139]);
//		employee.enterFirstName(data[140]);
//		employee.enterLastName(data[141]);
//		employee.enterDateOfBirth(data[250]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[293]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[336]);
//		employee.enterNI(data[379]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[422]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[465]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[142]);
//		employee.enterFirstName(data[143]);
//		employee.enterLastName(data[144]);
//		employee.enterDateOfBirth(data[251]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[294]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[337]);
//		employee.enterNI(data[380]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[423]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[466]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[145]);
//		employee.enterFirstName(data[146]);
//		employee.enterLastName(data[147]);
//		employee.enterDateOfBirth(data[252]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[295]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[338]);
//		employee.enterNI(data[381]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[424]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[467]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[148]);
//		employee.enterFirstName(data[149]);
//		employee.enterLastName(data[150]);
//		employee.enterDateOfBirth(data[253]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[296]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[339]);
//		employee.enterNI(data[382]);
//		employee.enterNICategory(data[72]);
//		employee.enterTaxCode(data[425]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[468]);
//		employee.clickSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[151]);
//		employee.enterFirstName(data[152]);
//		employee.enterLastName(data[153]);
//		employee.enterDateOfBirth(data[254]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[297]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[340]);
//		employee.enterNI(data[383]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[426]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[469]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[154]);
//		employee.enterFirstName(data[155]);
//		employee.enterLastName(data[156]);
//		employee.enterDateOfBirth(data[255]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[298]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[341]);
//		employee.enterNI(data[384]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[427]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[470]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[157]);
//		employee.enterFirstName(data[158]);
//		employee.enterLastName(data[159]);
//		employee.enterDateOfBirth(data[256]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[299]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[342]);
//		employee.enterNI(data[385]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[428]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[471]);
//		employee.selectStudentLone(data[74]);
//
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[160]);
//		employee.enterFirstName(data[161]);
//		employee.enterLastName(data[162]);
//		employee.enterDateOfBirth(data[257]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[300]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[343]);
//		employee.enterNI(data[386]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[429]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[472]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[163]);
//		employee.enterFirstName(data[164]);
//		employee.enterLastName(data[165]);
//		employee.enterDateOfBirth(data[258]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[301]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[344]);
//		employee.enterNI(data[387]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[430]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[473]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[166]);
//		employee.enterFirstName(data[167]);
//		employee.enterLastName(data[168]);
//		employee.enterDateOfBirth(data[259]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[302]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[345]);
//		employee.enterNI(data[388]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[431]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[474]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[169]);
//		employee.enterFirstName(data[170]);
//		employee.enterLastName(data[171]);
//		employee.enterDateOfBirth(data[260]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[303]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[346]);
//		employee.enterNI(data[389]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[432]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[475]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[172]);
//		employee.enterFirstName(data[173]);
//		employee.enterLastName(data[174]);
//		employee.enterDateOfBirth(data[261]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[304]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[347]);
//		employee.enterNI(data[390]);
//		employee.enterNICategory(data[73]);
//		employee.enterTaxCode(data[433]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[476]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[175]);
//		employee.enterFirstName(data[176]);
//		employee.enterLastName(data[177]);
//		employee.enterDateOfBirth(data[262]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[305]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[348]);
//		employee.enterNI(data[391]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[434]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[477]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[178]);
//		employee.enterFirstName(data[179]);
//		employee.enterLastName(data[180]);
//		employee.enterDateOfBirth(data[263]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[306]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[349]);
//		employee.enterNI(data[392]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[435]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[478]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		
//		
//
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[181]);
//		employee.enterFirstName(data[182]);
//		employee.enterLastName(data[183]);
//		employee.enterDateOfBirth(data[263]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[307]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[350]);
//		employee.enterNI(data[393]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[436]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[479]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[184]);
//		employee.enterFirstName(data[185]);
//		employee.enterLastName(data[186]);
//		employee.enterDateOfBirth(data[264]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[308]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[351]);
//		employee.enterNI(data[394]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[437]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[480]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[187]);
//		employee.enterFirstName(data[188]);
//		employee.enterLastName(data[189]);
//		employee.enterDateOfBirth(data[265]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[309]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[352]);
//		employee.enterNI(data[395]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[438]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[481]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);
//		pension.selectStatus(data[111]);
//		pension.selectScheme(data[96]);
//		
//		pension.enterPostponeEndDate(data[78]);
//		pension.enterEnrollmentDate(data[70]);
//
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[190]);
//		employee.enterFirstName(data[191]);
//		employee.enterLastName(data[192]);
//		employee.enterDateOfBirth(data[266]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[310]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[353]);
//		employee.enterNI(data[396]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[439]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[482]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[193]);
//		employee.enterFirstName(data[194]);
//		employee.enterLastName(data[195]);
//		employee.enterDateOfBirth(data[267]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[311]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[354]);
//		employee.enterNI(data[397]);
//		employee.enterNICategory(data[72]);
//		employee.enterTaxCode(data[440]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[483]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[196]);
//		employee.enterFirstName(data[197]);
//		employee.enterLastName(data[198]);
//		employee.enterDateOfBirth(data[268]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[312]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[355]);
//		employee.enterNI(data[398]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[441]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[484]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);
//		pension.selectStatus(data[111]);
//		pension.selectScheme(data[96]);
//		
//		pension.enterPostponeEndDate(data[78]);
//		pension.enterEnrollmentDate(data[71]);
//
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[199]);
//		employee.enterFirstName(data[200]);
//		employee.enterLastName(data[201]);
//		employee.enterDateOfBirth(data[269]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[313]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[356]);
//		employee.enterNI(data[399]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[442]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[485]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[202]);
//		employee.enterFirstName(data[203]);
//		employee.enterLastName(data[204]);
//		employee.enterDateOfBirth(data[270]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[314]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[357]);
//		employee.enterNI(data[400]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[443]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[486]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[205]);
//		employee.enterFirstName(data[206]);
//		employee.enterLastName(data[207]);
//		employee.enterDateOfBirth(data[271]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[315]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[358]);
//		employee.enterNI(data[401]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[444]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[487]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[208]);
//		employee.enterFirstName(data[209]);
//		employee.enterLastName(data[210]);
//		employee.enterDateOfBirth(data[272]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[316]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[359]);
//		employee.enterNI(data[402]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[445]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[488]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[81]);		
//		pension.selectScheme(data[96]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[211]);
//		employee.enterFirstName(data[212]);
//		employee.enterLastName(data[213]);
//		employee.enterDateOfBirth(data[273]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[317]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[360]);
//		employee.enterNI(data[403]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[446]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[489]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);
//		pension.selectStatus(data[110]);
//		pension.selectScheme(data[96]);
//		pension.enterOptOutDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[214]);
//		employee.enterFirstName(data[215]);
//		employee.enterLastName(data[216]);
//		employee.enterDateOfBirth(data[274]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[318]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[361]);
//		employee.enterNI(data[404]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[447]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[490]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[217]);
//		employee.enterFirstName(data[218]);
//		employee.enterLastName(data[219]);
//		employee.enterDateOfBirth(data[275]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[319]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[362]);
//		employee.enterNI(data[405]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[448]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[491]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[220]);
//		employee.enterFirstName(data[221]);
//		employee.enterLastName(data[222]);
//		employee.enterDateOfBirth(data[276]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[320]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[363]);
//		employee.enterNI(data[406]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[449]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[492]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[223]);
//		employee.enterFirstName(data[224]);
//		employee.enterLastName(data[225]);
//		employee.enterDateOfBirth(data[277]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[321]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[364]);
//		employee.enterNI(data[407]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[450]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[493]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[226]);
//		employee.enterFirstName(data[227]);
//		employee.enterLastName(data[228]);
//		employee.enterDateOfBirth(data[278]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[322]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[365]);
//		employee.enterNI(data[408]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[451]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[494]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[229]);
//		employee.enterFirstName(data[230]);
//		employee.enterLastName(data[231]);
//		employee.enterDateOfBirth(data[279]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[323]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[366]);
//		employee.enterNI(data[409]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[452]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[495]);
//		employee.clickSaveBtn();
//		;
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[232]);
//		employee.enterFirstName(data[233]);
//		employee.enterLastName(data[234]);
//		employee.enterDateOfBirth(data[280]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[324]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[367]);
//		employee.enterNI(data[410]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[453]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[496]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//
//		
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[235]);
//		employee.enterFirstName(data[236]);
//		employee.enterLastName(data[237]);
//		employee.enterDateOfBirth(data[281]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[325]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[368]);
//		employee.enterNI(data[411]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[454]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[497]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[75]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[238]);
//		employee.enterFirstName(data[239]);
//		employee.enterLastName(data[240]);
//		employee.enterDateOfBirth(data[282]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[326]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[369]);
//		employee.enterNI(data[412]);
//		employee.enterNICategory(data[79]);
//		employee.enterTaxCode(data[455]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[498]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[109]);		
//		pension.selectScheme(data[96]);
//		pension.enterEnrollmentDate(data[108]);
//		pension.eeChoosenContribution(data[99]);
//		pension.erChoosenContribution(data[100]);
//		pension.eeVoluntaryContribution(data[101]);
//		pension.eRVoluntaryContribution(data[101]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		payroll.NavigateNextPage();
//		payroll.NavigateNextPage();
//		payroll.NavigateNextPage();
//
//		
//		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//		ProcessPay.clickDeductionTab();
//		ProcessPay.clickAddMoreDeduction();
//		ProcessPay.enterAccountCodeDeduction(data[67]);
//		ProcessPay.enterDeductionDescription(data[68]);
//		ProcessPay.enterdeductionAmount(data[69]);
//		ProcessPay.clickApplyBtnDeduction();
//		ProcessPay.untickAllOptionsDeduction();
//		ProcessPay.clickSaveBtn();
		
	    pages.reports report= new  pages.reports(driver);

//     payroll.Run_Payroll();
	    
	    
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);

	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    payroll.SelecPeriodEndDate(data[64]);

		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension42Employee(data[500], data[501], data[502], data[503], data[504], data[505], data[506], data[507], data[508], data[509], data[510], data[511], data[512]);

		
		verify.assertAll();
	}
		
	

	@Test(priority=2)

	public void TC02validatePayrollSummarAprilEmail() throws Exception {

		sTestCaseID = "TC595";
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
		OpenClient.Enter_EnterClientName(data[80]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		 pages.reports report= new  pages.reports(driver);
		    
	    pages.PayrollRun payroll = new pages.PayrollRun(driver);

		report.Click__Reports_();
		report.Click_Payroll_Summary();
	    payroll.SelecPeriodEndDate(data[64]);

		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[513],data[514],data[515],data[516],data[517],data[518],data[519]);
	
		verify.assertAll();
}

}
