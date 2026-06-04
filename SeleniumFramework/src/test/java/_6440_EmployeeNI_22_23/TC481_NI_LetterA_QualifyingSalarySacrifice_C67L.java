package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC481_NI_LetterA_QualifyingSalarySacrifice_C67L  extends TestBase{
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validateNITaxPensionNetPay() throws Exception {

		sTestCaseID = "TC481";
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
//		OpenClient.Enter_EnterClientName(data[122]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[6]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[4]);
		Bk.Enter_CompanyAddressLine1(data[5]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[6]);
		Bk.Enter_NewEndDate(data[7]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[8]);
		company.enterRefrenceNumber(data[9]);
		company.accountOfficeReffrence(data[10]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[109]);
		company.Click_ClickSave();
		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.PensionSetup pension = new pages.PensionSetup(driver);
		
		pension.enterPensionStagingDate(data[11]);
		pension.enterSignatoryTitle();
		pension.enterSignatoryName();
		pension.enterEmailAddress(data[12]);
		pension.enterPhoneNumber();
		pension.enterPensionId(data[13]);
		pension.clickPensonDetailsSave();
		payroll.scrollClickPayrollDashboard();
		pension.clickPensionDashBoard();
		pension.addSchemeManually();
		pension.enterPensionSchemeName(data[14]);
		pension.selectPensionProvider(data[14]);
		pension.selectCalculationBasis(data[15]);
		pension.selectCalculationMethod(data[16]);
		pension.eeContribution(data[17]);
		pension.enterErContribution(data[18]);
		pension.enterSubgroupName();
		pension.enterGroupId();
		pension.enterSubGroupId();
		pension.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[22]);
		employee.enterAddressLine(data[23]);
		employee.enterAddressLine2(data[24]);
		employee.enterPostCode(data[25]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[26]);

		employee.enterNICategory(data[27]);
		employee.enterTaxCode(data[28]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[29]);
		employee.clickSaveBtn();
		employee.clickAutoEnrolment();
		pension.selectWorkerType(data[30]);
		pension.selectScheme(data[14]);
		pension.enterEnrollmentDate(data[26]);
		pension.eeChoosenContribution(data[17]);
		pension.erChoosenContribution(data[18]);
		pension.eeVoluntaryContribution(data[19]);
		pension.eRVoluntaryContribution(data[19]);
		pension.clickAutoEnrollmentSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.ProcessPay page = new pages.ProcessPay(driver);

		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[110]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[111]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[112]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[113]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[114]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[115]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[116]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[117]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[118]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[119]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[120]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[121]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		employee.clickEmployeeName();

	    		
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	    
	    verify.verifyEmployeeNI(data[31], data[32], data[33], data[34], data[35], data[36], data[37], data[38], data[39], data[40], data[41],data[42]);
	   
	    verify.verifyEmployerNI1(data[43], data[44], data[45], data[46], data[47], data[48], data[49], data[50], data[51], data[52], data[53],data[54]);
	    verify.verifyTax(data[55], data[56], data[57], data[58], data[59], data[60], data[61], data[62], data[63], data[64], data[65],data[66]);

	    verify.verifyNetPay1(data[67], data[68], data[69], data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77],data[78]);

	    verify.verifyEmployeePension(data[79], data[80], data[81], data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89],data[90]);

	    verify.verifyEmployerPension( data[91], data[92], data[93], data[94], data[95], data[96], data[97], data[98], data[99], data[100],data[101],data[102]);

		page.clickEmployeeSalaryDetails3();
		
	    
	    verify.netTaxNIPensionYTD(data[103], data[104], data[105], data[106],data[107],data[108]);

        verify.assertAll();
	
}
	
	

	@Test(priority=2)

	public void TC02ValidateP60() throws Exception {

		sTestCaseID = "TC481";
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
		OpenClient.Enter_EnterClientName(data[232]);
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
//		buisness.enterRegistrationDate(data[6]);
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
//		Bk.Select_services(data[4]);
//		Bk.Enter_CompanyAddressLine1(data[5]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[6]);
//		Bk.Enter_NewEndDate(data[7]);
//		Bk.Click_AccPeriodSave();
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[8]);
//		company.enterRefrenceNumber(data[9]);
//		company.accountOfficeReffrence(data[10]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[109]);
//		company.Click_ClickSave();
//		company.clickYesPension();
//		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//		pages.PensionSetup pension = new pages.PensionSetup(driver);
//		
//		pension.enterPensionStagingDate(data[11]);
//		pension.enterSignatoryTitle();
//		pension.enterSignatoryName();
//		pension.enterEmailAddress(data[12]);
//		pension.enterPhoneNumber();
//		pension.enterPensionId(data[13]);
//		pension.clickPensonDetailsSave();
//		payroll.scrollClickPayrollDashboard();
//		pension.clickPensionDashBoard();
//		pension.addSchemeManually();
//		pension.enterPensionSchemeName(data[14]);
//		pension.selectPensionProvider(data[14]);
//		pension.selectCalculationBasis(data[15]);
//		pension.selectCalculationMethod(data[16]);
//		pension.eeContribution(data[17]);
//		pension.enterErContribution(data[18]);
//		pension.enterSubgroupName();
//		pension.enterGroupId();
//		pension.enterSubGroupId();
//		pension.clickSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterFirstName(data[20]);
//		employee.enterLastName(data[21]);
//		employee.enterDateOfBirth(data[22]);
//		employee.enterAddressLine(data[23]);
//		employee.enterAddressLine2(data[24]);
//		employee.enterPostCode(data[25]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[26]);
//
//		employee.enterNICategory(data[27]);
//		employee.enterTaxCode(data[28]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[29]);
//		employee.clickSaveBtn();
//		employee.clickAutoEnrolment();
//		pension.selectWorkerType(data[30]);
//		pension.selectScheme(data[14]);
//		pension.enterEnrollmentDate(data[26]);
//		pension.eeChoosenContribution(data[17]);
//		pension.erChoosenContribution(data[18]);
//		pension.eeVoluntaryContribution(data[19]);
//		pension.eRVoluntaryContribution(data[19]);
//		pension.clickAutoEnrollmentSaveBtn();
//		payroll.Click_PayrollDashboard();
//		
//		pages.ProcessPay page = new pages.ProcessPay(driver);
//
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[110]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[111]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[112]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[113]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[114]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[115]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[116]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[117]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[118]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[119]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[120]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		
//		page.click3Dots();
//		page.clickProcessPay();
//		page.enterBasicPay(data[121]);
//		page.clickSaveBtn();
//		payroll.Run_Payroll();
//		
//		employee.clickEmployeeName();

		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		pages.reports report= new 	pages.reports (driver);
		
		report.Click__Reports_();
		report.Click_P45Forms();
		report.Select_SelectP45Form(data[128]);
		_5630OffPayrollWorkerPage.OffPayWorkerPage pdf= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    pdf.clickP60PdfIcn();
	    verify.verifyP60(data[122], data[123], data[124], data[125], data[126], data[127]);

	    verify.assertAll();
}
	

	@Test(priority=3)

	public void TC03ValidateP11() throws Exception {

		sTestCaseID = "TC481";
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
		buisness.enterRegistrationDate(data[6]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[4]);
		Bk.Enter_CompanyAddressLine1(data[5]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[6]);
		Bk.Enter_NewEndDate(data[7]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[8]);
		company.enterRefrenceNumber(data[9]);
		company.accountOfficeReffrence(data[10]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[109]);
		company.Click_ClickSave();
		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.PensionSetup pension = new pages.PensionSetup(driver);
		
		pension.enterPensionStagingDate(data[11]);
		pension.enterSignatoryTitle();
		pension.enterSignatoryName();
		pension.enterEmailAddress(data[12]);
		pension.enterPhoneNumber();
		pension.enterPensionId(data[13]);
		pension.clickPensonDetailsSave();
		payroll.scrollClickPayrollDashboard();
		pension.clickPensionDashBoard();
		pension.addSchemeManually();
		pension.enterPensionSchemeName(data[14]);
		pension.selectPensionProvider(data[14]);
		pension.selectCalculationBasis(data[15]);
		pension.selectCalculationMethod(data[16]);
		pension.eeContribution(data[17]);
		pension.enterErContribution(data[18]);
		pension.enterSubgroupName();
		pension.enterGroupId();
		pension.enterSubGroupId();
		pension.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[22]);
		employee.enterAddressLine(data[23]);
		employee.enterAddressLine2(data[24]);
		employee.enterPostCode(data[25]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[26]);

		employee.enterNICategory(data[27]);
		employee.enterTaxCode(data[28]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[29]);
		employee.clickSaveBtn();
		employee.clickAutoEnrolment();
		pension.selectWorkerType(data[30]);
		pension.selectScheme(data[14]);
		pension.enterEnrollmentDate(data[26]);
		pension.eeChoosenContribution(data[17]);
		pension.erChoosenContribution(data[18]);
		pension.eeVoluntaryContribution(data[19]);
		pension.eRVoluntaryContribution(data[19]);
		pension.clickAutoEnrollmentSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.ProcessPay page = new pages.ProcessPay(driver);

		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[110]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[111]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[112]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[113]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[114]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[115]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[116]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[117]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[118]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[119]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[120]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[121]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		employee.clickEmployeeName();

		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		pages.reports report= new 	pages.reports (driver);
		
		report.Click__Reports_();
		report.Click_P11();
	
       verify.verifyP11EarningsAtTheLEL(data[129], data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
       verify.verifyP11EarningsAboveTheLEL(data[142], data[143], data[144], data[145], data[146], data[147], data[148], data[149], data[150], data[151], data[152], data[153], data[154]);
       verify.verifyP11EarningsAboveThePT(data[155], data[156], data[157], data[158], data[159], data[160], data[161], data[162], data[163], data[164], data[165], data[166], data[167]);
       verify.verifyP11TotalContributions(data[168], data[169], data[170], data[171], data[172], data[173], data[174], data[175], data[176], data[177], data[178], data[179], data[180]);

       verify.verifyP11EmployeeContributions(data[181], data[182], data[183], data[184], data[185], data[186], data[187], data[188], data[189], data[190], data[191], data[192], data[193]);

       verify.verifyP11TotalPayToDate( data[194], data[195], data[196], data[197], data[198], data[199], data[200], data[201], data[202], data[203], data[204], data[205]);

       verify.verifyP11TotalTaxablePayToDate( data[206], data[207], data[208], data[209], data[210], data[211], data[212], data[213], data[214],data[215], data[216], data[217]);

       verify.verifyP11TotalTaxDueTodate( data[218], data[219], data[220], data[221], data[222],data[223], data[224], data[225], data[226], data[227], data[228], data[229],  data[230], data[231]);

	    verify.assertAll();
}
}
