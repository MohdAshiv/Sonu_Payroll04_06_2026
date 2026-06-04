package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC432_NI_LetterA_78L_CustomSalarySacrifice extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void TC01validateNITaxPensionNetPay() throws Exception {

		sTestCaseID = "TC432";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();
		
		pages.agentpage agentpage = new pages.agentpage(driver);
	
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
	
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness = new pages.CreateClient(driver);
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

		pages.AccountingPeriodSettingBK_FAInactive Bk = new pages.AccountingPeriodSettingBK_FAInactive(driver);
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

		pages.EditCompany company = new pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();

		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);

		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[108]);

		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[111]);
		freq.Enter_WeeklyPayDate(data[108]);
		company.Click_ClickSave();
		freq.clickDeletBtn();

		company.clickYesPension();
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

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

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		employee.clickNewEmployee();
		employee.enterTitle(data[110]);
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

		payroll.Click_PayrollDashboard();
		pages.ProcessPay page = new pages.ProcessPay(driver);

		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[62]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[66]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		for (int i = 3; i <= 5; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[62]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}

		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[63]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
	

		for (int i = 7; i <= 10; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[62]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[64]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		

		for (int i = 12; i <= 13; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[62]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[65]);
		page.clickSaveBtn();
		payroll.Run_Payroll();

		for (int i = 15; i <= 28; i++) {
			int j = 632;
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[62]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}
		
		for (int i = 29; i <= 38; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[68]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}

		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[66]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		for (int i = 40; i <= 47; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[68]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[67]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[66]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		for (int i = 50; i <= 51; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[68]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[69]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[70]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		employee.clickEmployeeName();


		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		   verify.verifyEmployeeNIWeekly(data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],data[19],data[20], data[21], data[22], data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30],data[31],data[32], data[33], data[34], data[35], data[36], data[37], data[38], data[39], data[40], data[41], data[42],data[43],data[44], data[45], data[46], data[47], data[48], data[49], data[50], data[51], data[52], data[53], data[54],data[55],data[56],data[57],data[58],data[59],data[60]);
		   
		    verify.verifyEmployerNIWeekly(data[112], data[113], data[114], data[115], data[116], data[117], data[118], data[119], data[120], data[121], data[122],data[123],data[124], data[125], data[126], data[127], data[128], data[129], data[130], data[131], data[132], data[133], data[134],data[135],data[136], data[137], data[138], data[139], data[140], data[141], data[142], data[143], data[144], data[145], data[146],data[147],data[148], data[149], data[150], data[151], data[152], data[153], data[154], data[155], data[156], data[157], data[158],data[159],data[160],data[161],data[162],data[163],data[164]);
		    verify.verifyTaxWeekly(data[165], data[166], data[167], data[168], data[169], data[170], data[171], data[172], data[173], data[174], data[175],data[176],data[177], data[178], data[179], data[180], data[181], data[182], data[183], data[184], data[185], data[186], data[187],data[188],data[189], data[190], data[191], data[192], data[193], data[194], data[195], data[196], data[197], data[198], data[199],data[200],data[201], data[202], data[203], data[204], data[205], data[206], data[207], data[208], data[209], data[210], data[211],data[212],data[213],data[214],data[215],data[216],data[217]);

		    verify.verifyNetpayWeekly(data[218], data[219], data[220], data[221], data[222], data[223], data[224], data[225], data[226], data[227], data[228],data[229],data[230], data[231], data[232], data[233], data[234], data[235], data[236], data[237], data[238], data[239], data[240],data[241],data[242], data[243], data[244], data[245], data[246], data[247], data[248], data[249], data[250], data[251], data[252],data[253], data[254], data[255], data[256], data[257], data[258], data[259], data[260], data[261], data[262], data[263],data[264],data[265],data[266],data[267],data[268],data[269],data[270]);

		    verify.verifyEmployeePensionWeekly( data[271], data[272], data[273], data[274], data[275], data[276], data[277], data[278], data[279], data[280],data[281],data[282], data[283], data[284], data[285], data[286], data[287], data[288], data[289], data[290], data[291], data[292],data[293],data[294], data[295], data[296], data[297], data[298], data[299], data[300], data[301], data[302], data[303], data[304],data[305],data[306], data[307], data[308], data[309], data[310], data[311], data[312], data[313], data[314], data[315], data[316],data[317],data[318],data[319],data[320],data[321],data[322],data[323]);

		    verify.verifyEmployerPensionWeekly( data[324], data[325], data[326], data[327], data[328], data[329], data[330], data[331], data[332], data[333],data[334],data[335], data[336], data[337], data[338], data[339], data[340], data[341], data[342], data[343], data[344], data[345],data[346],data[347], data[348], data[349], data[350], data[351], data[352], data[353], data[354], data[355], data[356], data[357],data[358],data[359], data[360], data[361], data[362], data[363], data[364], data[365], data[366], data[367], data[368], data[369],data[370],data[371],data[372],data[373],data[374],data[375],data[376]);
		  verify.assertAll();

	}
	
	

	@Test(priority = 2)

	public void TC02validateNITaxPensionNetPayTotal() throws Exception {

		sTestCaseID = "TC432";
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
		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness = new pages.CreateClient(driver);
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
//		pages.AccountingPeriodSettingBK_FAInactive Bk = new pages.AccountingPeriodSettingBK_FAInactive(driver);
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
//		pages.EditCompany company = new pages.EditCompany(driver);
//
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//
//		company.enterPayeNumber(data[90]);
//		company.enterRefrenceNumber(data[91]);
//		company.accountOfficeReffrence(data[92]);
//
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[108]);
//
//		pages.FrequencySet freq = new pages.FrequencySet(driver);
//
//		freq.Click_ClickAdditionalFrequecy();
//		freq.Select_F2(data[111]);
//		freq.Enter_WeeklyPayDate(data[108]);
//		company.Click_ClickSave();
//		freq.clickDeletBtn();
//
//		company.clickYesPension();
//		pages.PayrollRun payroll = new pages.PayrollRun(driver);
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
		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[110]);
//		employee.enterFirstName(data[102]);
//		employee.enterLastName(data[103]);
//		employee.enterDateOfBirth(data[104]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[107]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[108]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[7]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[5]);
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
//
//		payroll.Click_PayrollDashboard();
//
//		payroll.Click_PayrollDashboard();
		pages.ProcessPay page = new pages.ProcessPay(driver);
//
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[62]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[66]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		for (int i = 3; i <= 5; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[63]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//	
//
//		for (int i = 7; i <= 10; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[64]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//
//		for (int i = 12; i <= 13; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[65]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//
//		for (int i = 15; i <= 28; i++) {
//			int j = 632;
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		for (int i = 29; i <= 38; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[68]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[66]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		for (int i = 40; i <= 47; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[68]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[67]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[66]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		for (int i = 50; i <= 51; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[68]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[69]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[70]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		employee.clickEmployeeName();


		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		employee.clickEmployeeName();

		page.clickEmployeeSalaryDetailsWeekly();

	    verify.netTaxNIPensionYTD(data[80], data[81], data[82], data[83],data[84],data[85]);

	    verify.assertAll();

	}
	
	
	
	

	@Test(priority = 3)

	public void TC03validateNITaxPensionNetPayTotal() throws Exception {

		sTestCaseID = "TC432";
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
		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness = new pages.CreateClient(driver);
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
//		pages.AccountingPeriodSettingBK_FAInactive Bk = new pages.AccountingPeriodSettingBK_FAInactive(driver);
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
//		pages.EditCompany company = new pages.EditCompany(driver);
//
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//
//		company.enterPayeNumber(data[90]);
//		company.enterRefrenceNumber(data[91]);
//		company.accountOfficeReffrence(data[92]);
//
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[108]);
//
//		pages.FrequencySet freq = new pages.FrequencySet(driver);
//
//		freq.Click_ClickAdditionalFrequecy();
//		freq.Select_F2(data[111]);
//		freq.Enter_WeeklyPayDate(data[108]);
//		company.Click_ClickSave();
//		freq.clickDeletBtn();
//
//		company.clickYesPension();
//		pages.PayrollRun payroll = new pages.PayrollRun(driver);
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
//		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[110]);
//		employee.enterFirstName(data[102]);
//		employee.enterLastName(data[103]);
//		employee.enterDateOfBirth(data[104]);
//		employee.enterAddressLine(data[105]);
//		employee.enterAddressLine2(data[106]);
//		employee.enterPostCode(data[107]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[108]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[7]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[5]);
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
//
//		payroll.Click_PayrollDashboard();
//
//		payroll.Click_PayrollDashboard();
//		pages.ProcessPay page = new pages.ProcessPay(driver);
//
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[62]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[66]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		for (int i = 3; i <= 5; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[63]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//	
//
//		for (int i = 7; i <= 10; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[64]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//
//		for (int i = 12; i <= 13; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[65]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//
//		for (int i = 15; i <= 28; i++) {
//			int j = 632;
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[62]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		for (int i = 29; i <= 38; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[68]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[66]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		for (int i = 40; i <= 47; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[68]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[67]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[66]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		for (int i = 50; i <= 51; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[68]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[69]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[70]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		employee.clickEmployeeName();


		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		pages.reports report= new 	pages.reports (driver);
		
		report.Click__Reports_();
		report.Click_P45Forms();
		report.Select_SelectP45Form(data[71]);
		_5630OffPayrollWorkerPage.OffPayWorkerPage pdf= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    pdf.clickP60PdfIcn();
	    verify.verifyP60OffPayWorker(data[72], data[73], data[74], data[75], data[76], data[77]);

	    verify.assertAll();

	}
	
	
	
}
