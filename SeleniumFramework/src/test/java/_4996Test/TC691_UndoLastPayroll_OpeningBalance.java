package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC691_UndoLastPayroll_OpeningBalance extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateTaxNIEmailToMAIN() throws Exception {
		sTestCaseID = "TC691";
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
//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
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
		company.ClickContactDetails();
		company.enterFirstName(data[30]);
		company.enterEmail(data[31]);
		company.clickAddContact();
		
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[37]);
		company.Click_ClickSave();


		company.Click_clickPayrollSettings();
		
		company.clickYesPension();

		pages.PensionSetup pension = new pages.PensionSetup(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pension.enterPensionStagingDate(data[37]);
		pension.enterSignatoryTitle();
		pension.enterSignatoryName();
		pension.enterEmailAddress(data[40]);
		pension.enterPhoneNumber();
		pension.enterPensionId(data[41]);
		pension.clickPensonDetailsSave();
		payroll.scrollClickPayrollDashboard();
		
		pension.clickPensionDashBoard();
		pension.addSchemeManually();
		pension.enterPensionSchemeName(data[42]);
		pension.selectPensionProvider(data[42]);
		pension.selectCalculationBasis(data[43]);
		pension.selectCalculationMethod(data[44]);
		pension.eeContribution(data[45]);
		pension.enterErContribution(data[46]);
		pension.enterSubgroupName();
		pension.enterGroupId();
		pension.enterSubGroupId();
		pension.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

			employee.clickNewEmployee();
			employee.enterFirstName(data[33]);
			employee.enterLastName(data[34]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.enterEmailAddress(data[32]);

			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			
			employee.enterJoiningDate(data[69]);

			employee.enterNICategory(data[7]);
			employee.enterTaxCode(data[49]);
			employee.clickSaveBtn();
			
			employee.click_Paydetails();
			employee.enterBasicSalary3(data[5]);
			employee.clickSaveBtn();
			employee.clickAutoEnrolment();
			pension.selectWorkerType(data[48]);
			pension.selectScheme(data[42]);
			pension.enterEnrollmentDate(data[39]);
			pension.eeChoosenContribution(data[45]);
			pension.erChoosenContribution(data[46]);
			pension.eeVoluntaryContribution(data[47]);
			pension.eRVoluntaryContribution(data[47]);
			pension.clickAutoEnrollmentSaveBtn();
			payroll.Click_PayrollDashboard();
			
			
			employee.clickNewEmployee();
			employee.enterFirstName(data[35]);
			employee.enterLastName(data[36]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.enterEmailAddress(data[32]);

			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			
			employee.enterJoiningDate(data[69]);

			employee.enterNICategory(data[7]);
			employee.enterTaxCode(data[8]);
			employee.clickSaveBtn();
			
			employee.click_Paydetails();
			employee.enterBasicSalary3(data[6]);
			employee.clickSaveBtn();

			payroll.Click_PayrollDashboard();
			
			employee.clickEmployeeName();
	        pages.OpeningBalanceEntry openingBalance= new pages.OpeningBalanceEntry(driver);
			
			openingBalance.Click_gotoOpeningBalances();
			
			openingBalance.Enter_EnterTaxCode(data[8]);
			openingBalance.Enter_EnterGrosspay(data[9]);
			openingBalance.Enter_EnterEmployeeNI(data[10]);
			openingBalance.Enter_EnterNetPay(data[11]);
			openingBalance.Enter_EnterELtoPT(data[12]);
			openingBalance.Enter_EmployeePension(data[13]);
			openingBalance.Enter_EmployerPension(data[14]);

			openingBalance.Enter_TaxDeducted(data[15]);
			
			openingBalance.Enter_EmployerNI(data[16]);
			openingBalance.Enter_LEL(data[17]);
			openingBalance.Enter_PTtoUAP(data[18]);
			openingBalance.Click_clickSave();
			payroll.Click_PayrollDashboard();
			
			
			employee.clickEmployeeName1();
			openingBalance.Click_gotoOpeningBalances();
			
			openingBalance.Enter_EnterTaxCode(data[19]);
			openingBalance.Enter_EnterGrosspay(data[20]);
			openingBalance.Enter_EnterEmployeeNI(data[21]);
			openingBalance.Enter_EnterNetPay(data[22]);
			openingBalance.Enter_EnterELtoPT(data[23]);
			
			openingBalance.Enter_TaxDeducted(data[24]);
			
			openingBalance.Enter_EmployerNI(data[25]);
			openingBalance.Enter_LEL(data[26]);
			openingBalance.Enter_PTtoUAP(data[27]);
			openingBalance.Click_clickSave();
			payroll.Click_PayrollDashboard();

		     payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[28]);

			payroll.runPayroll(); 
			payroll.selectType(data[29]);
			payroll.runPayroll2();
			payroll.sendEmailFromRunPayroll();

			payroll.SelecPeriodEndDate(data[28]);
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81]);
			verify.verifyEmployeeNI(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployerNI2(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.verifyEmployeePension(data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127], data[128], data[129]);
			verify.verifyEmployerPension(data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
			verify.assertAll();
	}
	
	

	@Test(priority=2)
	public void TC02validateTaxNIEmailToBoth() throws Exception {
		sTestCaseID = "TC691";
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

			
		    payroll.Undo_LastPayroll();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[28]);

			payroll.runPayroll(); 
			payroll.selectType(data[53]);
			payroll.runPayroll2();
			payroll.Click_SendBtnEmployee();
			payroll.sendEmailFromRunPayroll();


			payroll.SelecPeriodEndDate(data[28]);
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81]);
			verify.verifyEmployeeNI(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployerNI2(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.verifyEmployeePension(data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127], data[128], data[129]);
			verify.verifyEmployerPension(data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
			verify.assertAll();
	}
	
	

	@Test(priority=3)
	public void TC03validateTaxNIEmailToEmployees () throws Exception {
		sTestCaseID = "TC691";
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

			
		    payroll.Undo_LastPayroll();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[28]);

			payroll.runPayroll(); 
			payroll.selectType(data[54]);
			payroll.runPayroll2();
			payroll.sendEmailFromRunPayroll();

			payroll.SelecPeriodEndDate(data[28]);
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81]);
			verify.verifyEmployeeNI(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployerNI2(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.verifyEmployeePension(data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127], data[128], data[129]);
			verify.verifyEmployerPension(data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
			verify.assertAll();
			
	}
	
	
	

	@Test(priority=4)
	public void TC04validateTaxNI_DontSend() throws Exception {
		sTestCaseID = "TC691";
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

		payroll.Undo_LastPayroll();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[28]);
			payroll.Run_Payroll();

			payroll.SelecPeriodEndDate(data[28]);
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81]);
			verify.verifyEmployeeNI(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployerNI2(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.verifyEmployeePension(data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127], data[128], data[129]);
			verify.verifyEmployerPension(data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
			verify.assertAll();
	}
	
}
