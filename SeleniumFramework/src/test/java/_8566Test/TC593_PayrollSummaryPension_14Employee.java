package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC593_PayrollSummaryPension_14Employee  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validatePayrollSummaryApril() throws Exception {

		sTestCaseID = "TC593";
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
//		OpenClient.Enter_EnterClientName(data[80]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
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
		company.enterFirstName(data[265]);
		company.enterEmail(data[266]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		company.enterUtrNumber();

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
		employee.enterTitle(data[4]);
		employee.enterFirstName(data[5]);
		employee.enterLastName(data[6]);
		employee.enterDateOfBirth(data[49]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[110]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[64]);
		employee.enterNI(data[125]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[140]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[155]);
		employee.selectStudentLone(data[169]);
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
		
		
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[7]);
		employee.enterFirstName(data[8]);
		employee.enterLastName(data[9]);
		employee.enterDateOfBirth(data[50]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[111]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[65]);
		employee.enterNI(data[126]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[141]);
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[65]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[156]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[10]);
		employee.enterFirstName(data[11]);
		employee.enterLastName(data[12]);
		employee.enterDateOfBirth(data[51]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[112]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[66]);
		employee.enterNI(data[127]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[142]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[157]);
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
		
		
		
		

		employee.clickNewEmployee();
		employee.enterTitle(data[13]);
		employee.enterFirstName(data[14]);
		employee.enterLastName(data[15]);
		employee.enterDateOfBirth(data[52]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[113]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[67]);
		employee.enterNI(data[128]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[143]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[158]);
		employee.clickSaveBtn();
		employee.clickAutoEnrolment();
		pension.selectWorkerType(data[81]);
		pension.selectScheme(data[96]);
		pension.eeChoosenContribution(data[99]);
		pension.erChoosenContribution(data[100]);
		pension.eeVoluntaryContribution(data[101]);
		pension.eRVoluntaryContribution(data[101]);
		pension.clickAutoEnrollmentSaveBtn();
		payroll.Click_PayrollDashboard();
		
		

		employee.clickNewEmployee();
		employee.enterTitle(data[16]);
		employee.enterFirstName(data[17]);
		employee.enterLastName(data[18]);
		employee.enterDateOfBirth(data[53]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[114]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[68]);
		employee.enterNI(data[129]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[144]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[159]);
		employee.selectStudentLone(data[170]);

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
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[19]);
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[54]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[115]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[69]);
		employee.enterNI(data[130]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[145]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[160]);
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
		
		
		

		employee.clickNewEmployee();
		employee.enterTitle(data[22]);
		employee.enterFirstName(data[23]);
		employee.enterLastName(data[24]);
		employee.enterDateOfBirth(data[55]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[116]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[70]);
		employee.enterNI(data[131]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[146]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[161]);
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
		
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[25]);
		employee.enterFirstName(data[26]);
		employee.enterLastName(data[27]);
		employee.enterDateOfBirth(data[56]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[117]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[71]);
		employee.enterNI(data[132]);
		employee.enterNICategory(data[85]);
		employee.enterTaxCode(data[147]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[162]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		
		

		employee.clickNewEmployee();
		employee.enterTitle(data[28]);
		employee.enterFirstName(data[29]);
		employee.enterLastName(data[30]);
		employee.enterDateOfBirth(data[57]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[118]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[72]);
		employee.enterNI(data[133]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[148]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[163]);
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
		
		

		employee.clickNewEmployee();
		employee.enterTitle(data[31]);
		employee.enterFirstName(data[32]);
		employee.enterLastName(data[33]);
		employee.enterDateOfBirth(data[58]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[119]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[73]);
		employee.enterNI(data[134]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[149]);
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[73]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[164]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[34]);
		employee.enterFirstName(data[35]);
		employee.enterLastName(data[36]);
		employee.enterDateOfBirth(data[59]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[120]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[74]);
		employee.enterNI(data[135]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[150]);
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[74]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[165]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[37]);
		employee.enterFirstName(data[38]);
		employee.enterLastName(data[39]);
		employee.enterDateOfBirth(data[60]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[121]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[75]);
		employee.enterNI(data[136]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[151]);
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[75]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[166]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		

		employee.clickNewEmployee();
		employee.enterTitle(data[40]);
		employee.enterFirstName(data[41]);
		employee.enterLastName(data[42]);
		employee.enterDateOfBirth(data[61]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[122]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[76]);
		employee.enterNI(data[137]);

		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[152]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[166]);

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
		
		

		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[46]);
		employee.enterFirstName(data[47]);
		employee.enterLastName(data[48]);
		employee.enterDateOfBirth(data[63]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[123]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[78]);
		employee.enterNI(data[139]);
		employee.enterNICategory(data[79]);
		employee.enterTaxCode(data[154]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[168]);
		employee.selectStudentLone(data[170]);

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
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	    
	    payroll.Click_PayrollDashboard();
	    
		_1566AdditionDeductionPage.ProcessPay ProcessPay= new _1566AdditionDeductionPage.ProcessPay(driver);

	    pages.ProcessPay rates= new  pages.ProcessPay(driver);

	    payroll.clickNextPage();
	    
	    ProcessPay.click3Dot3();
	    ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
	    rates.enterUnit(data[83]);
	    rates.enterRate(data[84]);
	    ProcessPay.clickSaveBtn();
	    payroll.Run_Payroll();
	    
	    pages.reports report= new  pages.reports(driver);
	    
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[171], data[172], data[173], data[174], data[175], data[176], data[177], data[178], data[179], data[180], data[181], data[182], data[183], data[184]);
	    
		verify.assertAll();
}
	
	@Test(priority=2)

	public void TC02validatePayrollSummarWithCISyMay() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
				
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[185]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName7();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[186]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
         
		payroll.clickNextPage();
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[186]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		payroll.clickNextPage();

		employee.clickEmployeeName3();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[186]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		payroll.clickNextPage();

	    pages.reports report= new  pages.reports(driver);
	    
		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		pages.ProcessPay rates = new pages.ProcessPay(driver);

		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[187]);
		rates.enterRate(data[84]);
		ProcessPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		report.clickTaxPayment();

		_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		cis.clickCisSufferd();
		cis.enterMayCIS(data[188]);
		cis.saveCIS();

		payroll.Click_PayrollDashboard();
		
//		payroll.Undo_LastPayroll();
//		payroll.Run_Payroll();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPensionWithCIS(data[189], data[190], data[191], data[192], data[193], data[194], data[195], data[196], data[197], data[198], data[199], data[200], data[201], data[202],data[203]);
		
		verify.assertAll();
}

	
	@Test(priority=3)

	public void TC03validatePayrollSummarJune() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);


	

		payroll.clickNextPage();

	    pages.reports report= new  pages.reports(driver);
	    
		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		pages.ProcessPay rates = new pages.ProcessPay(driver);

		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
		ProcessPay.clickSaveBtn();
		
		
		
		payroll.Run_Payroll();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[206], data[207], data[208], data[209], data[210], data[211], data[212], data[213], data[214], data[215], data[216], data[217], data[218], data[219]);
		
		verify.assertAll();
}

	
	
	@Test(priority=4)

	public void TC04validatePayrollSummarJulyWithCIS() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);


		payroll.clickNextPage();

	    pages.reports report= new  pages.reports(driver);
	    
		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		pages.ProcessPay rates = new pages.ProcessPay(driver);

		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
		
		ProcessPay.clickAddMore();
		ProcessPay.enterAccountCode(data[220]);
		ProcessPay.enterDescription(data[221]);
		ProcessPay.enterAmount(data[222]);
		
		ProcessPay.clickSaveBtn();

		payroll.Run_Payroll();
		
		report.clickTaxPayment();
		_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		cis.clickCisSufferd();
		cis.enterJulyCIS(data[223]);
		cis.saveCIS();

		payroll.Click_PayrollDashboard();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPensionWithCIS(data[224], data[225], data[226], data[227], data[228], data[229], data[230], data[231], data[232], data[233], data[234], data[235], data[236], data[237],data[238]);
		
		verify.assertAll();
}

	

	@Test(priority=5)

	public void TC05validatePayrollSummarAug() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
			pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		
		ProcessPay.click3Dot5();
		ProcessPay.clickProcessPay5();
	    ProcessPay.enterBasicPay(data[243]);
		ProcessPay.clickSaveBtn();

		
		ProcessPay.click3Dot6();
		ProcessPay.clickProcessPay6();
	    ProcessPay.enterBasicPay(data[239]);
		
		
		ProcessPay.clickAddMore();
		ProcessPay.enterAccountCode(data[240]);
		ProcessPay.enterDescription(data[241]);
		ProcessPay.enterAmount(data[242]);

		ProcessPay.clickSaveBtn();
		payroll.clickNextPage();


		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

		payroll.Run_Payroll();
		

		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[244], data[245], data[246], data[247], data[248], data[249], data[250], data[251], data[252], data[253], data[254], data[255],data[256], data[257]);
		
		verify.assertAll();
}
	
	@Test(priority=6)

	public void TC06validatePayrollSummarAugEmail() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		 pages.reports report= new  pages.reports(driver);
		    
	
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[258],data[259],data[260],data[261],data[262],data[263],data[264]);
	
		verify.assertAll();
}
	
	@Test(priority=7)

	public void TC07yvalidatePayrollSummarySep() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
		pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		
		ProcessPay.click3Dots();
		ProcessPay.clickProcessPay();
	    ProcessPay.enterBasicPay(data[267]);
		ProcessPay.clickSaveBtn();

		
	

		payroll.clickNextPage();


		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

		payroll.Run_Payroll();
		

		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[268], data[269], data[270], data[271], data[272], data[273], data[274], data[275], data[276], data[277], data[278], data[279],data[280], data[281]);
		
		verify.assertAll();
}
	
	@Test(priority=8)

	public void TC08validatePayrollSummarSepEmail() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		 pages.reports report= new  pages.reports(driver);
	     pages.PayrollRun payroll = new pages.PayrollRun(driver);

//	    payroll.Undo_LastPayroll();
//	    
//	    payroll.Run_Payroll();
	
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[282],data[283],data[284],data[285],data[286],data[287],data[288]);
	
		verify.assertAll();
	
	}
	
	
	@Test(priority=9)

	public void TC09yvalidatePayrollSummaryOctCIS() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
		pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

	

		payroll.clickNextPage();


		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

		ProcessPay.click3Dot4();
		ProcessPay.clickProcessPay4();
	    ProcessPay.enterBasicPay(data[289]);
		ProcessPay.clickSaveBtn();

		payroll.Run_Payroll();
		
		report.clickTaxPayment();
		_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		cis.clickCisSufferd();
		cis.enterOctCIS1(data[305]);
		cis.saveCIS();

		payroll.Click_PayrollDashboard();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPensionWithCIS(data[290], data[291], data[292], data[293], data[294], data[295], data[296], data[297], data[298], data[299], data[300], data[301],data[302], data[303],data[304]);
		
		verify.assertAll();
}
	
	@Test(priority=10)

	public void TC10validatePayrollSummarOctEmail() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		 pages.reports report= new  pages.reports(driver);

	 
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummaryWithCIS(data[306],data[307],data[308],data[309],data[310],data[311],data[312],data[313]);
	
		verify.assertAll();
	
	}
	
	
	@Test(priority=11)

	public void TC11yvalidatePayrollSummaryNOV() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
		pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		ProcessPay.click3Dots();
		ProcessPay.clickProcessPay();
	    ProcessPay.enterBasicPay(data[314]);
		ProcessPay.clickSaveBtn();

		
		
		ProcessPay.click3Dot6();
		ProcessPay.clickProcessPay6();
	    ProcessPay.enterBasicPay(data[314]);
		ProcessPay.clickSaveBtn();


		payroll.clickNextPage();


		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

	
		payroll.Run_Payroll();
		
		
		payroll.Click_PayrollDashboard();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[315], data[316], data[317], data[318], data[319], data[320], data[321], data[322], data[323], data[324], data[325], data[326],data[327], data[328]);
		
		verify.assertAll();
}
	
	@Test(priority=12)

	public void TC12validatePayrollSummarNovEmail() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		 pages.reports report= new  pages.reports(driver);
	     pages.PayrollRun payroll = new pages.PayrollRun(driver);

//	    payroll.Undo_LastPayroll();
//	    
//	    payroll.Run_Payroll();
	
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[329],data[330],data[331],data[332],data[333],data[334],data[335]);
	
		verify.assertAll();
	
	}
	
	
	@Test(priority=13)

	public void TC13validatePayrollSummaryDec() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
		pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		ProcessPay.click3Dots();
		ProcessPay.clickProcessPay();
	    ProcessPay.enterBasicPay(data[336]);
		ProcessPay.clickSaveBtn();

		
		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[337]);
		ProcessPay.clickSaveBtn();
		
		
		ProcessPay.click3Dot6();
		ProcessPay.clickProcessPay6();
	    ProcessPay.enterBasicPay(data[338]);
		ProcessPay.clickSaveBtn();


		payroll.clickNextPage();


		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

	
		payroll.Run_Payroll();
		
		
		payroll.Click_PayrollDashboard();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[339], data[340], data[341], data[342], data[343], data[344], data[345], data[346], data[347], data[348], data[349], data[350],data[351], data[352]);
		
		verify.assertAll();
}
	
	
	@Test(priority=14)

	public void TC14validatePayrollSummarDecEmail() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		 pages.reports report= new  pages.reports(driver);
	     pages.PayrollRun payroll = new pages.PayrollRun(driver);
	
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[353],data[354],data[355],data[356],data[357],data[358],data[359]);
	
		verify.assertAll();
	
	}
	
	
	@Test(priority=15)

	public void TC15validatePayrollSummaryJan24() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
		pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		
		ProcessPay.click3Dot7();
		ProcessPay.clickProcessPay7();
		ProcessPay.clickAddMore();
		ProcessPay.enterAccountCode(data[220]);
		ProcessPay.enterDescription(data[221]);
		ProcessPay.enterAmount(data[360]);
		
		ProcessPay.clickSaveBtn();
		
	
		payroll.clickNextPage();

		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

		payroll.Run_Payroll();
		
		payroll.Click_PayrollDashboard();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[361], data[362], data[363], data[364], data[365], data[366], data[367], data[368], data[369], data[370], data[371], data[372],data[373], data[374]);
		
		verify.assertAll();
}
	
	

	@Test(priority=16)

	public void TC16validatePayrollSummarJan24Email() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		 pages.reports report= new  pages.reports(driver);
	     pages.PayrollRun payroll = new pages.PayrollRun(driver);

	
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[375],data[376],data[377],data[378],data[379],data[380],data[381]);
	
		verify.assertAll();
	
	}
	
	
	
	@Test(priority=17)

	public void TC17validatePayrollSummaryFeb24() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
		pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		
		ProcessPay.click3Dot6();
		ProcessPay.clickProcessPay6();
		ProcessPay.enterBasicPay(data[382]);
		ProcessPay.clickSaveBtn();
		
		ProcessPay.click3Dot7();
		ProcessPay.clickProcessPay7();
		ProcessPay.enterBasicPay(data[382]);
		ProcessPay.clickSaveBtn();
		
		ProcessPay.click3Dot8();
		ProcessPay.clickProcessPay8();
		ProcessPay.enterBasicPay(data[382]);
		ProcessPay.clickSaveBtn();
		
		
		ProcessPay.click3Dot9();
		ProcessPay.clickProcessPay9();
		ProcessPay.enterBasicPay(data[382]);
		ProcessPay.clickSaveBtn();
	
		payroll.clickNextPage();

		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

		payroll.Run_Payroll();
		
		report.clickTaxPayment();
		_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		cis.clickCisSufferd();
		cis.enterFebCis(data[383]);
		cis.saveCIS();

		payroll.Click_PayrollDashboard();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPensionWithCIS(data[384], data[385], data[386], data[387], data[388], data[389], data[390], data[391], data[392], data[393], data[394], data[395],data[396], data[397],data[398]);
		
		verify.assertAll();
}
	
	
	@Test(priority=18)

	public void TC18validatePayrollSummarFeb24Email() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		 pages.reports report= new  pages.reports(driver);

	 
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummaryWithCIS(data[399],data[400],data[401],data[402],data[403],data[404],data[405],data[406]);
	
		verify.assertAll();
	
	}
	
	@Test(priority=19)

	public void TC19validatePayrollSummaryMar24() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		 pages.reports report= new  pages.reports(driver);
		    
		pages.ProcessPay rates = new pages.ProcessPay(driver);

		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);

		
		ProcessPay.click3Dot6();
		ProcessPay.clickProcessPay6();
		ProcessPay.enterBasicPay(data[407]);
		ProcessPay.clickSaveBtn();
		
		ProcessPay.click3Dot7();
		ProcessPay.clickProcessPay7();
		ProcessPay.enterBasicPay(data[408]);
		ProcessPay.clickSaveBtn();
		
		payroll.clickNextPage();

		ProcessPay.click3Dot3();
		ProcessPay.clickProcessPay3();
	    ProcessPay.enterBasicPay(data[82]);
		rates.enterUnit(data[205]);
		rates.enterRate(data[84]);
	
		ProcessPay.clickSaveBtn();

		payroll.Run_Payroll();
		
		payroll.Click_PayrollDashboard();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[409], data[410], data[411], data[412], data[413], data[414], data[415], data[416], data[417], data[418], data[419], data[420],data[421], data[422]);
		
		verify.assertAll();
}
	
	@Test(priority=20)

	public void TC20validatePayrollSummarMarch24Email() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		 pages.reports report= new  pages.reports(driver);
	     pages.PayrollRun payroll = new pages.PayrollRun(driver);

	
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[423],data[424],data[425],data[426],data[427],data[428],data[429]);
	
		verify.assertAll();
	
	}
	
	@Test(priority=21)

	public void TC21validatePayrollSummarTaxPaymentCIS() throws Exception {

		sTestCaseID = "TC593";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		 pages.reports report= new  pages.reports(driver);
	
		 report.clickTaxPayment();

		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
		verify.verifyCisSufferd(data[430],data[431], data[432], data[433], data[434], data[435], data[436],data[437],data[438],data[439],data[440],data[441],data[442]);
	
		verify.assertAll();
	
	}
}
