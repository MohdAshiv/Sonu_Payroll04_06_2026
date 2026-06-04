 package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC594_PayrollSummaryPension_4Weekly extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validatePayrollSummaryAprilMayJune() throws Exception {

		sTestCaseID = "TC594";
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
		company.enterFirstName(data[82]);
		company.enterEmail(data[83]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		company.enterUtrNumber();

		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[108]);
		
		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[21]);
		freq.Enter_FourWeeklyPayDate(data[20]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
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
		
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[156]);
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
		pension.selectWorkerType(data[109]);
		pension.selectScheme(data[96]);
		pension.enterEnrollmentDate(data[108]);
		pension.eeChoosenContribution(data[99]);
		pension.erChoosenContribution(data[100]);
		pension.eeVoluntaryContribution(data[101]);
		pension.eRVoluntaryContribution(data[101]);
		pension.clickAutoEnrollmentSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
	
		payroll.Click_PayrollDashboard();
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	    
	    payroll.Click_PayrollDashboard();
	    
		 pages.reports report= new pages.reports(driver);
 
	    payroll.Run_Payroll();
	    
	    report.clickTaxPayment();

		_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		cis.clickCisSufferd();
		cis.enterAprilCIS(data[144]);
		cis.saveCIS();

		payroll.Click_PayrollDashboard();
	    
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[159]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[160]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[161]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[162]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[163]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[164]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[165]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[166]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[35]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPensionWithCIS(data[171], data[172], data[173], data[174], data[175], data[176], data[177], data[178], data[179], data[180], data[181], data[182],data[183], data[184],data[185]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifySummaryPensionWithCIS(data[171], data[172], data[173], data[174], data[175], data[176], data[177], data[178], data[179], data[180], data[181], data[182],data[183], data[184],data[185]);
		payroll.SelecPeriodEndDate(data[36]);

		verify.verifySummaryPension(data[186], data[187], data[188], data[189], data[190], data[191], data[192], data[193], data[194], data[195], data[196], data[197],data[198], data[199]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[186], data[187], data[188], data[189], data[190], data[191], data[192], data[193], data[194], data[195], data[196], data[197],data[198], data[199]);

		payroll.SelecPeriodEndDate(data[37]);

		verify.verifySummaryPension(data[200], data[201], data[202], data[203], data[204], data[205], data[206], data[207], data[208], data[209], data[210], data[211],data[212], data[213]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[200], data[201], data[202], data[203], data[204], data[205], data[206], data[207], data[208], data[209], data[210], data[211],data[212], data[213]);
	
		verify.assertAll();
	}
	
	
	@Test(priority=2)

	public void TC02validatePayrollSummaryJulyAugSep() throws Exception {

		sTestCaseID = "TC594";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    pages.reports report= new pages.reports(driver);
 
	
	    
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[129]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[130]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[131]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[132]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[133]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[134]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[135]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[136]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[137]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[138]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[139]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[124]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[38]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[214], data[215], data[216], data[217], data[218], data[219], data[220], data[221], data[222], data[223], data[224], data[225],data[226], data[227]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[214], data[215], data[216], data[217], data[218], data[219], data[220], data[221], data[222], data[223], data[224], data[225],data[226], data[227]);
		payroll.SelecPeriodEndDate(data[39]);

		verify.verifySummaryPension(data[228], data[229], data[230], data[231], data[232], data[233], data[234], data[235], data[236], data[237], data[238], data[239],data[240], data[241]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[228], data[229], data[230], data[231], data[232], data[233], data[234], data[235], data[236], data[237], data[238], data[239],data[240], data[241]);

		payroll.SelecPeriodEndDate(data[40]);

		verify.verifySummaryPension(data[242], data[243], data[244], data[245], data[246], data[247], data[248], data[249], data[250], data[251], data[252], data[253],data[254], data[255]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[242], data[243], data[244], data[245], data[246], data[247], data[248], data[249], data[250], data[251], data[252], data[253],data[254], data[255]);
	
		verify.assertAll();
	}
	
	@Test(priority=3)

	public void TC03validatePayrollSummaryOctNovDec() throws Exception {

		sTestCaseID = "TC594";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    pages.reports report= new pages.reports(driver);
 
	
	    
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[22]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[23]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[24]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[25]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[26]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[27]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[28]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[29]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[30]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[31]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[32]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[33]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[41]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[256], data[257], data[258], data[259], data[260], data[261], data[262], data[263], data[264], data[265], data[266], data[267],data[268], data[269]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[256], data[257], data[258], data[259], data[260], data[261], data[262], data[263], data[264], data[265], data[266], data[267],data[268], data[269]);
		payroll.SelecPeriodEndDate(data[42]);

		verify.verifySummaryPension(data[270], data[271], data[272], data[273], data[274], data[275], data[276], data[277], data[278], data[279], data[280], data[281],data[282], data[283]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[270], data[271], data[272], data[273], data[274], data[275], data[276], data[277], data[278], data[279], data[280], data[281],data[282], data[283]);

		payroll.SelecPeriodEndDate(data[43]);

		verify.verifySummaryPension(data[284], data[285], data[286], data[287], data[288], data[289], data[290], data[291], data[292], data[293], data[294], data[295],data[296], data[297]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[284], data[285], data[286], data[287], data[288], data[289], data[290], data[291], data[292], data[293], data[294], data[295],data[296], data[297]);
	
		verify.assertAll();
	}
	
	

	@Test(priority=4)

	public void TC04validatePayrollSummaryJanFebMarch() throws Exception {

		sTestCaseID = "TC594";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    pages.reports report= new pages.reports(driver);

	    
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[354]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[355]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[356]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[357]);
		processPay.clickSaveBtn();
		
		
		payroll.Run_Payroll();

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[299]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[300]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[301]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[302]);
		processPay.clickSaveBtn();
		
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[303]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[304]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[305]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[306]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[307]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[308]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[309]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[310]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[44]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension(data[311], data[312], data[313], data[314], data[315], data[316], data[317], data[318], data[319], data[320], data[321], data[322],data[323], data[324]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[311], data[312], data[313], data[314], data[315], data[316], data[317], data[318], data[319], data[320], data[321], data[322],data[323], data[324]);
		payroll.SelecPeriodEndDate(data[45]);

		verify.verifySummaryPension(data[325], data[326], data[327], data[328], data[329], data[330], data[331], data[332], data[333], data[334], data[335], data[336],data[337], data[338]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[325], data[326], data[327], data[328], data[329], data[330], data[331], data[332], data[333], data[334], data[335], data[336],data[337], data[338]);

		payroll.SelecPeriodEndDate(data[46]);

		verify.verifySummaryPension(data[339], data[340], data[341], data[342], data[343], data[344], data[345], data[346], data[347], data[348], data[349], data[350],data[351], data[352]);
		page.clickRefreshBtn();
		verify.verifySummaryPension(data[339], data[340], data[341], data[342], data[343], data[344], data[345], data[346], data[347], data[348], data[349], data[350],data[351], data[352]);
	
		verify.assertAll();
	}
}
