package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC447_NI_Letter_A_C1257L_RAS_Qualifying_2Weekly extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void TC01validateNITaxPensionNetPay() throws Exception {

		sTestCaseID = "TC447";
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
		freq.Select_F2(data[247]);
		freq.Enter_FortnightlyPayDate(data[108]);
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
		employee.clickM1W1Basis();

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
		page.enterBasicPay(data[61]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[62]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[63]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[64]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[65]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[66]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[67]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[64]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[68]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
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
	
		for (int i = 12; i <= 18; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[71]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}

		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[72]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
	

		for (int i = 20; i <= 21; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[71]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[73]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		for (int i = 23; i <= 24; i++) {
			page.click3Dots();
			page.clickProcessPay();
			page.enterBasicPay(data[71]);
			page.clickSaveBtn();
			payroll.Run_Payroll();
		}
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[74]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[75]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[71]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
	
		employee.clickEmployeeName();

		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		 verify.verifyFortightlyEmployeeNI(data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24], data[25], data[26], data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34]);
		   
		 verify.verifyFortightlyEmployerNI1(data[112], data[113], data[114], data[115], data[116], data[117], data[118], data[119], data[120], data[121], data[122],data[123],data[124], data[125], data[126], data[127], data[128], data[129], data[130], data[131], data[132], data[133], data[134],data[135],data[136],data[137],data[138]);

		 verify.verifyFortightlyTax(data[139], data[140], data[141], data[142], data[143], data[144], data[145], data[146],data[147],data[148], data[149], data[150], data[151], data[152], data[153], data[154], data[155], data[156], data[157], data[158],data[159],data[160],data[161],data[162],data[163],data[164],data[165]);
		 verify.verifyFortightlyNetPay1(data[166], data[167], data[168], data[169], data[170], data[171], data[172], data[173], data[174], data[175],data[176],data[177], data[178], data[179], data[180], data[181], data[182], data[183], data[184], data[185], data[186], data[187],data[188],data[189], data[190], data[191], data[192]);
		 verify.verifyFortightlyEmployeePension(data[193], data[194], data[195], data[196], data[197], data[198], data[199],data[200],data[201], data[202], data[203], data[204], data[205], data[206], data[207], data[208], data[209], data[210], data[211],data[212],data[213],data[214],data[215],data[216],data[217],data[218],data[219]);
		 verify.verifyFortightlyEmployerPension(data[220], data[221], data[222], data[223], data[224], data[225], data[226], data[227], data[228],data[229],data[230], data[231], data[232], data[233], data[234], data[235], data[236], data[237], data[238], data[239], data[240],data[241],data[242], data[243], data[244], data[245], data[246]);
         verify.assertAll();

	}
	
	

	@Test(priority = 2)

	public void TC02validateNITaxPensionNetPayTotal() throws Exception {


		sTestCaseID = "TC447";
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
//
//		freq.Click_ClickAdditionalFrequecy();
//		freq.Select_F2(data[247]);
//		freq.Enter_FortnightlyPayDate(data[108]);
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
//		employee.clickM1W1Basis();
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
//		page.enterBasicPay(data[61]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[62]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[63]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[64]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[65]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[66]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[67]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[64]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[68]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
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
//	
//		for (int i = 12; i <= 18; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[71]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[72]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//	
//
//		for (int i = 20; i <= 21; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[71]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[73]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		for (int i = 23; i <= 24; i++) {
//			page.click3Dots();
//			page.clickProcessPay();
//			page.enterBasicPay(data[71]);
//			page.clickSaveBtn();
//			payroll.Run_Payroll();
//		}
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[74]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[75]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[71]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
		employee.clickEmployeeName();

		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		page.clickEmployeeSalaryDetailsFortnightly();

	    verify.grossnetTaxNIPensionYTD(data[79],data[80], data[81], data[82], data[83],data[84],data[85]);

	    verify.assertAll();

	}
	
	
	
}
