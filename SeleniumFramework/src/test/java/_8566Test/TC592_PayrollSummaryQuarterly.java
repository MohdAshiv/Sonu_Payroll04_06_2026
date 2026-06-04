package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC592_PayrollSummaryQuarterly extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateDataConsistentlyRemainsAprilMayJune() throws Exception {

		sTestCaseID = "TC592";
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
//		OpenClient.Enter_EnterClientName(data[70]);
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
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		company.enterUtrNumber();

		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
		company.enableQuarterlyPayeScheme();

		company.Click_ClickSave();

		company.enableQuarterlyPayeScheme();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[69]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		

		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[49]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[69]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[8]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
	//	employee.enterBasicSalary3(data[11]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();

		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[50]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[69]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[9]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[12]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();

		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[51]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[69]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[10]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[13]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		
		
		payroll.Run_Payroll();
		
		
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[39]);
		processPay.clickSaveBtn();

	
		
		payroll.Run_Payroll();
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[40]);
		processPay.clickSaveBtn();

		
		payroll.Run_Payroll();

		pages.reports report= new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[35]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCFBF_Ammount(data[14], data[17], data[18], data[19], data[20], data[21],data[22],data[23],data[24]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[14], data[17], data[18], data[19], data[20], data[21],data[22],data[23],data[24]);
		payroll.SelecPeriodEndDate(data[36]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[15], data[25], data[26], data[27],data[28],data[29],data[30],data[31],data[32]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[15], data[25], data[26], data[27],data[28],data[29],data[30],data[31],data[32]);

		payroll.SelecPeriodEndDate(data[37]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[16], data[71], data[72], data[73], data[74], data[75],data[76],data[77],data[78]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[16], data[71], data[72], data[73], data[74], data[75],data[76],data[77],data[78]);

		verify.assertAll();
		
	}
	
	
	
	@Test(priority=2)

	public void TC02validateDataConsistentlyRemainsJulyAugSep() throws Exception {

		sTestCaseID = "TC592";
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
//		OpenClient.Enter_EnterClientName(data[70]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[58]);
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
//		Bk.Select_services(data[56]);
//		Bk.Enter_CompanyAddressLine1(data[57]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[58]);
//		Bk.Enter_NewEndDate(data[59]);
//		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[60]);
//		company.enterRefrenceNumber(data[61]);
//		company.accountOfficeReffrence(data[62]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[69]);
//		company.Click_ClickSave();
//		company.Click_AllowancesSchemes();
//		company.clickYesEmployementAllownaces();
//	    company.clickEnabledEmployementAllownaces();
//		company.enableQuarterlyPayeScheme();
//
//		company.Click_ClickSave();
//
//		company.enableQuarterlyPayeScheme();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//		payroll.Click_PayrollDashboard();
//		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[64]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[7]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[5]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[49]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[8]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//	//	employee.enterBasicSalary3(data[11]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[50]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[9]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[12]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[51]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[10]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[13]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[79]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[80]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[81]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[82]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();

		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[42]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[69]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[118]);
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[69]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterLeavingDate(data[48]);

		employee.enterBasicSalary3(data[43]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[119]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName1();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[120]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName2();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[121]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName3();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode(data[122]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[83]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[84]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[85]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[86]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[87]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[88]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[89]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[90]);
		processPay.clickSaveBtn();
		payroll.Run_Payroll();

		

		pages.reports report= new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[44]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCFBF_Ammount(data[91],data[92], data[93], data[94], data[95], data[96], data[97],data[98],data[99]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[91],data[92], data[93], data[94], data[95], data[96], data[97],data[98],data[99]);
		payroll.SelecPeriodEndDate(data[45]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[100], data[101], data[102], data[103],data[104],data[105],data[106],data[107],data[108]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[100], data[101], data[102], data[103],data[104],data[105],data[106],data[107],data[108]);

		payroll.SelecPeriodEndDate(data[46]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[109], data[110], data[111], data[112], data[113], data[114],data[115],data[116],data[117]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[109], data[110], data[111], data[112], data[113], data[114],data[115],data[116],data[117]);

		verify.assertAll();
		
	}
	
	
	
	@Test(priority=3)

	public void TC03validateDataConsistentlyRemainsOctNovDec() throws Exception {

		sTestCaseID = "TC592";
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
//		OpenClient.Enter_EnterClientName(data[70]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[58]);
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
//		Bk.Select_services(data[56]);
//		Bk.Enter_CompanyAddressLine1(data[57]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[58]);
//		Bk.Enter_NewEndDate(data[59]);
//		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[60]);
//		company.enterRefrenceNumber(data[61]);
//		company.accountOfficeReffrence(data[62]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[69]);
//		company.Click_ClickSave();
//		company.Click_AllowancesSchemes();
//		company.clickYesEmployementAllownaces();
//	    company.clickEnabledEmployementAllownaces();
//		company.enableQuarterlyPayeScheme();
//
//		company.Click_ClickSave();
//
//		company.enableQuarterlyPayeScheme();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//		payroll.Click_PayrollDashboard();
//		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[64]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[7]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[5]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[49]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[8]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//	//	employee.enterBasicSalary3(data[11]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[50]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[9]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[12]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[51]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[10]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[13]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[123]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[124]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[125]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[126]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot5();
		processPay.clickProcessPay5();
		processPay.enterBasicPay(data[127]);
		processPay.clickSaveBtn();
		payroll.Run_Payroll();

		pages.reports report = new pages.reports(driver);

		report.clickTaxPayment();

		_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		cis.clickCisSufferd();
		cis.enterOctCIS1(data[136]);
		cis.saveCIS();

		payroll.Click_PayrollDashboard();
		
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[128]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[129]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[130]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[131]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[132]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[133]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[134]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[135]);
		processPay.clickSaveBtn();
		payroll.Run_Payroll();

		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[165]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCis(data[137],data[138], data[139], data[140], data[141], data[142], data[143],data[144],data[145],data[146]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCis(data[137],data[138], data[139], data[140], data[141], data[142], data[143],data[144],data[145],data[146]);
		payroll.SelecPeriodEndDate(data[166]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[147],data[148], data[149], data[150], data[151],data[152],data[153],data[154],data[155]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[147],data[148], data[149], data[150], data[151],data[152],data[153],data[154],data[155]);

		payroll.SelecPeriodEndDate(data[167]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[156], data[157], data[158], data[159], data[160], data[161],data[162],data[163],data[164]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[156], data[157], data[158], data[159], data[160], data[161],data[162],data[163],data[164]);

		verify.assertAll();
		
	}
	
	

	@Test(priority=4)

	public void TC04validateDataConsistentlyRemainsJanFebMarch() throws Exception {

		sTestCaseID = "TC592";
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
//		OpenClient.Enter_EnterClientName(data[70]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[58]);
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
//		Bk.Select_services(data[56]);
//		Bk.Enter_CompanyAddressLine1(data[57]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[58]);
//		Bk.Enter_NewEndDate(data[59]);
//		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
//		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[60]);
//		company.enterRefrenceNumber(data[61]);
//		company.accountOfficeReffrence(data[62]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[69]);
//		company.Click_ClickSave();
//		company.Click_AllowancesSchemes();
//		company.clickYesEmployementAllownaces();
//	    company.clickEnabledEmployementAllownaces();
//		company.enableQuarterlyPayeScheme();
//
//		company.Click_ClickSave();
//
//		company.enableQuarterlyPayeScheme();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//		payroll.Click_PayrollDashboard();
//		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[64]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[7]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[5]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[49]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[8]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//	//	employee.enterBasicSalary3(data[11]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[50]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[9]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[12]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[51]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[10]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[13]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		
		

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[171]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[172]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[173]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[174]);
		processPay.clickSaveBtn();
		
	
		payroll.Run_Payroll();

		pages.reports report = new pages.reports(driver);
		

		payroll.Click_PayrollDashboard();
		
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[175]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[176]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[177]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[178]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[179]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[180]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[181]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[182]);
		processPay.clickSaveBtn();
		payroll.Run_Payroll();

		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[168]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCFBF_Ammount(data[183],data[184], data[185], data[186], data[187],data[188],data[189],data[190],data[191]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
	//	verify.verifyPayrollSummaryCFBF_Ammount(data[183],data[184], data[185], data[186], data[187],data[188],data[189],data[190],data[191]);
		payroll.SelecPeriodEndDate(data[169]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[192],data[193], data[194], data[195], data[196],data[197],data[198],data[199],data[200]);
		page.clickRefreshBtn();
	//	verify.verifyPayrollSummaryCFBF_Ammount(data[192],data[193], data[194], data[195], data[196],data[197],data[198],data[199],data[200]);

		payroll.SelecPeriodEndDate(data[170]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[201], data[202], data[203], data[204], data[205], data[206],data[207],data[208],data[209]);
		page.clickRefreshBtn();
	//verify.verifyPayrollSummaryCFBF_Ammount(data[201], data[202], data[203], data[204], data[205], data[206],data[207],data[208],data[209]);

		verify.assertAll();
		
	}
	
}
