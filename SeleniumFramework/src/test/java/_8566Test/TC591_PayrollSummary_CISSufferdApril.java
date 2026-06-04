package _8566Test;

import org.testng.annotations.Test;
import tests.TestBase;
import utilities.ExcelData;

public class TC591_PayrollSummary_CISSufferdApril  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void TC01validatePayrollSummaryCFWithCISApril() throws Exception {

		sTestCaseID = "TC591";
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
		company.ClickContactDetails();
		company.enterFirstName(data[43]);
		company.enterEmail(data[44]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		company.enterUtrNumber();
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
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
		
		employee.enterJoiningDate(data[45]);

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
		
		employee.enterJoiningDate(data[46]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[8]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[11]);
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
		
		employee.enterJoiningDate(data[47]);

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
		
		employee.enterJoiningDate(data[48]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[10]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[13]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		pages.reports report= new pages.reports(driver);
		
		payroll.Run_Payroll();
		report.clickTaxPayment();
		
		_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		cis.clickCisSufferd();
		cis.enterAprilCIS(data[15]);
		cis.saveCIS();
				
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[35]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCis(data[14],data[16], data[17], data[18], data[19], data[20], data[21],data[22],data[23],data[24]);
		
		verify.assertAll();
		
	}
	
	
	
	
	 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

	public void TC02validatePayrollSummaryCFMay() throws Exception {

		sTestCaseID = "TC591";
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
//		company.enterUtrNumber();
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[69]);
//		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//		payroll.Click_PayrollDashboard();
//		
//		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
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
//		employee.enterJoiningDate(data[45]);
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
//		employee.enterJoiningDate(data[46]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[8]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[11]);
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
//		employee.enterJoiningDate(data[47]);
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
//		employee.enterJoiningDate(data[48]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[10]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[13]);
//		employee.clickSaveBtn();
//		payroll.Click_PayrollDashboard();
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[71]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[72]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[73]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[74]);
		processPay.clickSaveBtn();
		
		pages.reports report= new pages.reports(driver);
		
		payroll.Run_Payroll();
		
				
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[36]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCFBF_Ammount(data[25],data[26], data[27], data[28], data[29], data[30], data[31],data[32],data[33]);
		
		verify.assertAll();
		
	}
	 
	
	 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

		public void TC03validatePayrollSummaryCFJune() throws Exception {

			sTestCaseID = "TC591";
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
//			OpenClient.Click_ClientsClick();
//			OpenClient.Enter_EnterClientName(data[70]);
//			OpenClient.Click_ClickSearch();
//			OpenClient.Click_ClickClient();
//			
//			OpenClient.Click_ClientsClick();
//			pages.CreateClient buisness= new pages.CreateClient (driver);
//			buisness.clickNewClient();
//			buisness.clickLimitedCompany();
//			buisness.clickMnualyLimitedCompany();
//			buisness.enterBuisnessName();
//			
//			buisness.enterRegistrationNo();
//			buisness.enterRegistrationDate(data[58]);
//			buisness.enterFirstName();
//			buisness.enterLastName();
//			buisness.clickSaveBtn();
			
//			OpenClient.Click_ClientsClick();
//			OpenClient.Enter_EnterClientName2();
//			OpenClient.Click_ClickSearch();
	//	
//			pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//			Bk.Click_BKEdit();
//			Bk.Select_services(data[56]);
//			Bk.Enter_CompanyAddressLine1(data[57]);
//			Bk.Click_Save();
	//
//			Bk.Click_AccountingPeriod();
//			Bk.Click_AddAccountingPeriod();
//			Bk.Enter_NewStartDate(data[58]);
//			Bk.Enter_NewEndDate(data[59]);
//			Bk.Click_AccPeriodSave();
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName2();
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
			pages.EditCompany company= new 	pages.EditCompany(driver);
			
			company.Click_gotoEditCompany();
			company.Click_clickPayrollDetails();
			company.Click_AllowancesSchemes();
			company.clickYesEmployementAllownaces();
		    company.clickEnabledEmployementAllownaces();
			
			pages.PayrollRun payroll= new pages.PayrollRun (driver);
	
			payroll.Click_PayrollDashboard();
//			
//			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//			
//			employee.clickNewEmployee();
//			employee.enterTitle(data[54]);
//			employee.enterFirstName(data[63]);
//			employee.enterLastName(data[64]);
//			employee.enterDateOfBirth(data[65]);
//			employee.enterAddressLine(data[66]);
//			employee.enterAddressLine2(data[67]);
//			employee.enterPostCode(data[68]);
//			employee.clickSaveBtn();
//			employee.clickMandotoryPayroll();
//			
//			employee.enterJoiningDate(data[45]);
	//
//			employee.enterNICategory(data[6]);
//			employee.enterTaxCode(data[7]);
//			employee.clickSaveBtn();
//			employee.click_Paydetails();
//			employee.enterBasicSalary3(data[5]);
//			employee.clickSaveBtn();
//			
//			payroll.Click_PayrollDashboard();
//			
	//
//			employee.clickNewEmployee();
//			employee.enterTitle(data[54]);
//			employee.enterFirstName(data[63]);
//			employee.enterLastName(data[49]);
//			employee.enterDateOfBirth(data[65]);
//			employee.enterAddressLine(data[66]);
//			employee.enterAddressLine2(data[67]);
//			employee.enterPostCode(data[68]);
//			employee.clickSaveBtn();
//			employee.clickMandotoryPayroll();
//			
//			employee.enterJoiningDate(data[46]);
	//
//			employee.enterNICategory(data[6]);
//			employee.enterTaxCode(data[8]);
//			employee.clickSaveBtn();
//			employee.click_Paydetails();
//			employee.enterBasicSalary3(data[11]);
//			employee.clickSaveBtn();
//			
//			payroll.Click_PayrollDashboard();
	//
//			employee.clickNewEmployee();
//			employee.enterTitle(data[54]);
//			employee.enterFirstName(data[63]);
//			employee.enterLastName(data[50]);
//			employee.enterDateOfBirth(data[65]);
//			employee.enterAddressLine(data[66]);
//			employee.enterAddressLine2(data[67]);
//			employee.enterPostCode(data[68]);
//			employee.clickSaveBtn();
//			employee.clickMandotoryPayroll();
//			
//			employee.enterJoiningDate(data[47]);
	//
//			employee.enterNICategory(data[6]);
//			employee.enterTaxCode(data[9]);
//			employee.clickSaveBtn();
//			employee.click_Paydetails();
//			employee.enterBasicSalary3(data[12]);
//			employee.clickSaveBtn();
//			
//			payroll.Click_PayrollDashboard();
	//
//			employee.clickNewEmployee();
//			employee.enterTitle(data[54]);
//			employee.enterFirstName(data[63]);
//			employee.enterLastName(data[51]);
//			employee.enterDateOfBirth(data[65]);
//			employee.enterAddressLine(data[66]);
//			employee.enterAddressLine2(data[67]);
//			employee.enterPostCode(data[68]);
//			employee.clickSaveBtn();
//			employee.clickMandotoryPayroll();
//			
//			employee.enterJoiningDate(data[48]);
	//
//			employee.enterNICategory(data[6]);
//			employee.enterTaxCode(data[10]);
//			employee.clickSaveBtn();
//			employee.click_Paydetails();
//			employee.enterBasicSalary3(data[13]);
//			employee.clickSaveBtn();
//			payroll.Click_PayrollDashboard();
			_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

			processPay.click3Dots();
			processPay.clickProcessPay();
			processPay.enterBasicPay(data[75]);
			processPay.clickSaveBtn();

			processPay.click3Dot2();
			processPay.clickProcessPay2();
			processPay.enterBasicPay(data[76]);
			processPay.clickSaveBtn();

			processPay.click3Dot3();
			processPay.clickProcessPay3();
			processPay.enterBasicPay(data[77]);
			processPay.clickSaveBtn();
			
			processPay.click3Dot4();
			processPay.clickProcessPay4();
			processPay.enterBasicPay(data[78]);
			processPay.clickSaveBtn();
			
			pages.reports report= new pages.reports(driver);
			
			payroll.Run_Payroll();
			
			report.Click__Reports_();
			report.Click_Payroll_Summary();
			
			payroll.SelecPeriodEndDate(data[37]);
			
			_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

			verify.verifyPayrollSummaryCFBF_Ammount(data[79],data[80], data[81], data[82], data[83], data[84], data[85],data[86],data[87]);
			
			verify.assertAll();
			
		}

	 
		 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

			public void TC04validatePayrollSummaryCFJuly() throws Exception {

				sTestCaseID = "TC591";
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
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName(data[70]);
//				OpenClient.Click_ClickSearch();
//				OpenClient.Click_ClickClient();
//				
//				OpenClient.Click_ClientsClick();
//				pages.CreateClient buisness= new pages.CreateClient (driver);
//				buisness.clickNewClient();
//				buisness.clickLimitedCompany();
//				buisness.clickMnualyLimitedCompany();
//				buisness.enterBuisnessName();
//				
//				buisness.enterRegistrationNo();
//				buisness.enterRegistrationDate(data[58]);
//				buisness.enterFirstName();
//				buisness.enterLastName();
//				buisness.clickSaveBtn();
				
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName2();
//				OpenClient.Click_ClickSearch();
		//	
//				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//				Bk.Click_BKEdit();
//				Bk.Select_services(data[56]);
//				Bk.Enter_CompanyAddressLine1(data[57]);
//				Bk.Click_Save();
		//
//				Bk.Click_AccountingPeriod();
//				Bk.Click_AddAccountingPeriod();
//				Bk.Enter_NewStartDate(data[58]);
//				Bk.Enter_NewEndDate(data[59]);
//				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName2();
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
//				
				pages.EditCompany company= new 	pages.EditCompany(driver);
				
		//		company.Click_gotoEditCompany();
//				company.Click_clickPayrollDetails();
//				company.Click_AllowancesSchemes();
//				
//				company.clickYesEmployementAllownaces();
//				Thread.sleep(3000);
//			    company.clickEnabledEmployementAllownaces();
//				Thread.sleep(3000);
//
				pages.PayrollRun payroll= new pages.PayrollRun (driver);
//				payroll.Click_PayrollDashboard();
//				
//				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//				
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[64]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[45]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[7]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[5]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
//				
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[49]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[46]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[8]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[11]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[50]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[47]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[9]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[12]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[51]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[48]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[10]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[13]);
//				employee.clickSaveBtn();
//				payroll.Click_PayrollDashboard();
				_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

				processPay.click3Dots();
				processPay.clickProcessPay();
				processPay.enterBasicPay(data[88]);
				processPay.clickSaveBtn();

				processPay.click3Dot2();
				processPay.clickProcessPay2();
				processPay.enterBasicPay(data[89]);
				processPay.clickSaveBtn();

				processPay.click3Dot3();
				processPay.clickProcessPay3();
				processPay.enterBasicPay(data[90]);
				processPay.clickSaveBtn();
				
				processPay.click3Dot4();
				processPay.clickProcessPay4();
				processPay.enterBasicPay(data[91]);
				processPay.clickSaveBtn();
				
				pages.reports report= new pages.reports(driver);
				
				payroll.Run_Payroll();
				
				
				_5885BuisnessLevelPopUP_Page.BuisnessPage cis = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
				report.Click__Reports_();

				report.clickTaxPayment();
				cis.clickCisSufferd();
				cis.enterJulyCIS(data[39]);
				cis.saveCIS();
				
				report.Click__Reports_();
				report.Click_Payroll_Summary();
				
				payroll.SelecPeriodEndDate(data[38]);
				
				_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

				verify.verifyPayrollSummaryCis(data[92],data[93], data[94], data[95], data[96], data[97], data[98],data[99],data[100],data[101]);
				
				verify.assertAll();
				
			}
	 
	 
		 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

			public void TC05validateTaxPaymentCis() throws Exception {

				sTestCaseID = "TC591";
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
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName(data[70]);
//				OpenClient.Click_ClickSearch();
//				OpenClient.Click_ClickClient();
//				
//				OpenClient.Click_ClientsClick();
//				pages.CreateClient buisness= new pages.CreateClient (driver);
//				buisness.clickNewClient();
//				buisness.clickLimitedCompany();
//				buisness.clickMnualyLimitedCompany();
//				buisness.enterBuisnessName();
//				
//				buisness.enterRegistrationNo();
//				buisness.enterRegistrationDate(data[58]);
//				buisness.enterFirstName();
//				buisness.enterLastName();
//				buisness.clickSaveBtn();
				
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName2();
//				OpenClient.Click_ClickSearch();
		//	
//				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//				Bk.Click_BKEdit();
//				Bk.Select_services(data[56]);
//				Bk.Enter_CompanyAddressLine1(data[57]);
//				Bk.Click_Save();
		//
//				Bk.Click_AccountingPeriod();
//				Bk.Click_AddAccountingPeriod();
//				Bk.Enter_NewStartDate(data[58]);
//				Bk.Enter_NewEndDate(data[59]);
//				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName2();
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
//				
//				pages.EditCompany company= new 	pages.EditCompany(driver);
//				
//				company.Click_gotoEditCompany();
//				company.Click_clickPayrollDetails();
//				company.Click_AllowancesSchemes();
//				company.clickYesEmployementAllownaces();
//			    company.clickEnabledEmployementAllownaces();
//				
				pages.PayrollRun payroll= new pages.PayrollRun (driver);
//		
//				payroll.Click_PayrollDashboard();
//				
//				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//				
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[64]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[45]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[7]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[5]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
//				
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[49]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[46]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[8]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[11]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[50]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[47]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[9]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[12]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[51]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[48]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[10]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[13]);
//				employee.clickSaveBtn();
//				payroll.Click_PayrollDashboard();
				_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

			
				
				pages.reports report= new pages.reports(driver);
		
				report.clickTaxPayment();
				
				
				_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

				verify.verifyCisSufferd(data[102],data[103], data[104], data[105], data[106], data[107], data[108],data[109],data[110],data[111],data[112],data[113],data[114]);
				
				verify.assertAll();
				
			}
	 
	 
		   @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

			public void TC06validatePayrollSummaryCFBFAug() throws Exception {

				sTestCaseID = "TC591";
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
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName(data[70]);
//				OpenClient.Click_ClickSearch();
//				OpenClient.Click_ClickClient();
//				
//				OpenClient.Click_ClientsClick();
//				pages.CreateClient buisness= new pages.CreateClient (driver);
//				buisness.clickNewClient();
//				buisness.clickLimitedCompany();
//				buisness.clickMnualyLimitedCompany();
//				buisness.enterBuisnessName();
//				
//				buisness.enterRegistrationNo();
//				buisness.enterRegistrationDate(data[58]);
//				buisness.enterFirstName();
//				buisness.enterLastName();
//				buisness.clickSaveBtn();
				
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName2();
//				OpenClient.Click_ClickSearch();
		//	
//				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//				Bk.Click_BKEdit();
//				Bk.Select_services(data[56]);
//				Bk.Enter_CompanyAddressLine1(data[57]);
//				Bk.Click_Save();
		//
//				Bk.Click_AccountingPeriod();
//				Bk.Click_AddAccountingPeriod();
//				Bk.Enter_NewStartDate(data[58]);
//				Bk.Enter_NewEndDate(data[59]);
//				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName2();
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
				
				pages.EditCompany company= new 	pages.EditCompany(driver);
				
//				company.Click_gotoEditCompany();
//				company.Click_clickPayrollDetails();
//				company.Click_AllowancesSchemes();
//				company.clickYesEmployementAllownaces();
//			    company.clickEnabledEmployementAllownaces();
				
				pages.PayrollRun payroll= new pages.PayrollRun (driver);
//		
//				payroll.Click_PayrollDashboard();
//				
//				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//				
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[64]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[45]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[7]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[5]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
//				
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[49]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[46]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[8]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[11]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[50]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[47]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[9]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[12]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[51]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[48]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[10]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[13]);
//				employee.clickSaveBtn();
//				payroll.Click_PayrollDashboard();
				_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

				processPay.click3Dots();
				processPay.clickProcessPay();
				processPay.enterBasicPay(data[115]);
				processPay.clickSaveBtn();

				processPay.click3Dot2();
				processPay.clickProcessPay2();
				processPay.enterBasicPay(data[116]);
				processPay.clickSaveBtn();

				processPay.click3Dot3();
				processPay.clickProcessPay3();
				processPay.enterBasicPay(data[117]);
				processPay.clickSaveBtn();
				
				processPay.click3Dot4();
				processPay.clickProcessPay4();
				processPay.enterBasicPay(data[118]);
				processPay.clickSaveBtn();
				
				pages.reports report= new pages.reports(driver);
				
				payroll.Run_Payroll();
				
				
				report.Click__Reports_();

				report.clickTaxPayment();
				
				
				report.Click__Reports_();
				report.Click_Payroll_Summary();
				
				payroll.SelecPeriodEndDate(data[40]);
				
				_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

				verify.verifyPayrollSummaryCFBF_Ammount(data[119],data[120], data[121], data[122], data[123], data[124], data[125],data[126],data[127]);
				
				verify.assertAll();
				
			}
	 
	
		 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

			public void TC07validateTaxPaymentCisAug() throws Exception {

				sTestCaseID = "TC591";
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
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName(data[70]);
//				OpenClient.Click_ClickSearch();
//				OpenClient.Click_ClickClient();
//				
//				OpenClient.Click_ClientsClick();
//				pages.CreateClient buisness= new pages.CreateClient (driver);
//				buisness.clickNewClient();
//				buisness.clickLimitedCompany();
//				buisness.clickMnualyLimitedCompany();
//				buisness.enterBuisnessName();
//				
//				buisness.enterRegistrationNo();
//				buisness.enterRegistrationDate(data[58]);
//				buisness.enterFirstName();
//				buisness.enterLastName();
//				buisness.clickSaveBtn();
				
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName2();
//				OpenClient.Click_ClickSearch();
		//	
//				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//				Bk.Click_BKEdit();
//				Bk.Select_services(data[56]);
//				Bk.Enter_CompanyAddressLine1(data[57]);
//				Bk.Click_Save();
		//
//				Bk.Click_AccountingPeriod();
//				Bk.Click_AddAccountingPeriod();
//				Bk.Enter_NewStartDate(data[58]);
//				Bk.Enter_NewEndDate(data[59]);
//				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName2();
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
//				
//				pages.EditCompany company= new 	pages.EditCompany(driver);
//				
//				company.Click_gotoEditCompany();
//				company.Click_clickPayrollDetails();
//				company.Click_AllowancesSchemes();
//				company.clickYesEmployementAllownaces();
//			    company.clickEnabledEmployementAllownaces();
//				
				pages.PayrollRun payroll= new pages.PayrollRun (driver);
//		
//				payroll.Click_PayrollDashboard();
//				
//				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//				
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[64]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[45]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[7]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[5]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
//				
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[49]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[46]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[8]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[11]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[50]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[47]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[9]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[12]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[51]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[48]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[10]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[13]);
//				employee.clickSaveBtn();
//				payroll.Click_PayrollDashboard();
				_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

				pages.reports report= new pages.reports(driver);
		
				report.clickTaxPayment();
				
				
				_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

				verify.verifyCisSufferd(data[128],data[129], data[130], data[131], data[132], data[133], data[134],data[135],data[136],data[137],data[138],data[139],data[140]);
				
				verify.assertAll();
				
			}
		 
		
		 
		   @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

			public void TC08validatePayrollSummaryCFBFSep() throws Exception {

				sTestCaseID = "TC591";
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
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName(data[70]);
//				OpenClient.Click_ClickSearch();
//				OpenClient.Click_ClickClient();
				
//				OpenClient.Click_ClientsClick();
//				pages.CreateClient buisness= new pages.CreateClient (driver);
//				buisness.clickNewClient();
//				buisness.clickLimitedCompany();
//				buisness.clickMnualyLimitedCompany();
//				buisness.enterBuisnessName();
//				
//				buisness.enterRegistrationNo();
//				buisness.enterRegistrationDate(data[58]);
//				buisness.enterFirstName();
//				buisness.enterLastName();
//				buisness.clickSaveBtn();
				
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName2();
//				OpenClient.Click_ClickSearch();
		//	
//				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//				Bk.Click_BKEdit();
//				Bk.Select_services(data[56]);
//				Bk.Enter_CompanyAddressLine1(data[57]);
//				Bk.Click_Save();
		//
//				Bk.Click_AccountingPeriod();
//				Bk.Click_AddAccountingPeriod();
//				Bk.Enter_NewStartDate(data[58]);
//				Bk.Enter_NewEndDate(data[59]);
//				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName2();
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
//				
//				pages.EditCompany company= new 	pages.EditCompany(driver);
//				
//				company.Click_gotoEditCompany();
//				company.Click_clickPayrollDetails();
//				company.Click_AllowancesSchemes();
//				company.clickYesEmployementAllownaces();
//			    company.clickEnabledEmployementAllownaces();
//				
				pages.PayrollRun payroll= new pages.PayrollRun (driver);
//		
//				payroll.Click_PayrollDashboard();
//				
//				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//				
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[64]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[45]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[7]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[5]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
//				
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[49]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[46]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[8]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[11]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[50]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[47]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[9]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[12]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[51]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[48]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[10]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[13]);
//				employee.clickSaveBtn();
//				payroll.Click_PayrollDashboard();
				_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

				processPay.click3Dots();
				processPay.clickProcessPay();
				processPay.enterBasicPay(data[141]);
				processPay.clickSaveBtn();

				processPay.click3Dot2();
				processPay.clickProcessPay2();
				processPay.enterBasicPay(data[142]);
				processPay.clickSaveBtn();

				processPay.click3Dot3();
				processPay.clickProcessPay3();
				processPay.enterBasicPay(data[143]);
				processPay.clickSaveBtn();
				
				processPay.click3Dot4();
				processPay.clickProcessPay4();
				processPay.enterBasicPay(data[144]);
				processPay.clickSaveBtn();
				
				pages.reports report= new pages.reports(driver);
				
				payroll.Run_Payroll();
				
				
				report.Click__Reports_();

				report.clickTaxPayment();
				
				
				report.Click__Reports_();
				report.Click_Payroll_Summary();
				
				payroll.SelecPeriodEndDate(data[41]);
				
				_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

				verify.verifyPayrollSummaryCFBF_Ammount(data[145],data[146], data[147], data[148], data[149], data[150], data[151],data[152],data[153]);
				
				verify.assertAll();
				
			}
		 
		
		 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

			public void TC09validateTaxPaymentCisSep() throws Exception {

				sTestCaseID = "TC591";
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
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName(data[70]);
//				OpenClient.Click_ClickSearch();
//				OpenClient.Click_ClickClient();
//				
//				OpenClient.Click_ClientsClick();
//				pages.CreateClient buisness= new pages.CreateClient (driver);
//				buisness.clickNewClient();
//				buisness.clickLimitedCompany();
//				buisness.clickMnualyLimitedCompany();
//				buisness.enterBuisnessName();
//				
//				buisness.enterRegistrationNo();
//				buisness.enterRegistrationDate(data[58]);
//				buisness.enterFirstName();
//				buisness.enterLastName();
//				buisness.clickSaveBtn();
				
//				OpenClient.Click_ClientsClick();
//				OpenClient.Enter_EnterClientName2();
//				OpenClient.Click_ClickSearch();
		//	
//				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//				Bk.Click_BKEdit();
//				Bk.Select_services(data[56]);
//				Bk.Enter_CompanyAddressLine1(data[57]);
//				Bk.Click_Save();
		//
//				Bk.Click_AccountingPeriod();
//				Bk.Click_AddAccountingPeriod();
//				Bk.Enter_NewStartDate(data[58]);
//				Bk.Enter_NewEndDate(data[59]);
//				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName2();
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
//				
//				pages.EditCompany company= new 	pages.EditCompany(driver);
//				
//				company.Click_gotoEditCompany();
//				company.Click_clickPayrollDetails();
//				company.Click_AllowancesSchemes();
//				company.clickYesEmployementAllownaces();
//			    company.clickEnabledEmployementAllownaces();
//				
				pages.PayrollRun payroll= new pages.PayrollRun (driver);
//		
//				payroll.Click_PayrollDashboard();
//				
//				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//				
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[64]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[45]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[7]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[5]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
//				
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[49]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[46]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[8]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[11]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[50]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[47]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[9]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[12]);
//				employee.clickSaveBtn();
//				
//				payroll.Click_PayrollDashboard();
		//
//				employee.clickNewEmployee();
//				employee.enterTitle(data[54]);
//				employee.enterFirstName(data[63]);
//				employee.enterLastName(data[51]);
//				employee.enterDateOfBirth(data[65]);
//				employee.enterAddressLine(data[66]);
//				employee.enterAddressLine2(data[67]);
//				employee.enterPostCode(data[68]);
//				employee.clickSaveBtn();
//				employee.clickMandotoryPayroll();
//				
//				employee.enterJoiningDate(data[48]);
		//
//				employee.enterNICategory(data[6]);
//				employee.enterTaxCode(data[10]);
//				employee.clickSaveBtn();
//				employee.click_Paydetails();
//				employee.enterBasicSalary3(data[13]);
//				employee.clickSaveBtn();
//				payroll.Click_PayrollDashboard();
				_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

				pages.reports report= new pages.reports(driver);
		
				report.clickTaxPayment();
				
				_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

				verify.verifyCisSufferd(data[154],data[155], data[156], data[157], data[158], data[159], data[160],data[161],data[162],data[163],data[164],data[165],data[166]);
				
				verify.assertAll();
				
			}
		 
		 
		
		 
			   @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

				public void TC10validatePayrollSummaryCFBF_Oct() throws Exception {

					sTestCaseID = "TC591";
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
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName(data[70]);
//					OpenClient.Click_ClickSearch();
//					OpenClient.Click_ClickClient();
					
//					OpenClient.Click_ClientsClick();
//					pages.CreateClient buisness= new pages.CreateClient (driver);
//					buisness.clickNewClient();
//					buisness.clickLimitedCompany();
//					buisness.clickMnualyLimitedCompany();
//					buisness.enterBuisnessName();
//					
//					buisness.enterRegistrationNo();
//					buisness.enterRegistrationDate(data[58]);
//					buisness.enterFirstName();
//					buisness.enterLastName();
//					buisness.clickSaveBtn();
					
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName2();
//					OpenClient.Click_ClickSearch();
			//	
//					pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//					Bk.Click_BKEdit();
//					Bk.Select_services(data[56]);
//					Bk.Enter_CompanyAddressLine1(data[57]);
//					Bk.Click_Save();
			//
//					Bk.Click_AccountingPeriod();
//					Bk.Click_AddAccountingPeriod();
//					Bk.Enter_NewStartDate(data[58]);
//					Bk.Enter_NewEndDate(data[59]);
//					Bk.Click_AccPeriodSave();
					OpenClient.Click_ClientsClick();
					OpenClient.Enter_EnterClientName2();
					OpenClient.Click_ClickSearch();
					OpenClient.Click_ClickClient();
//					
//					pages.EditCompany company= new 	pages.EditCompany(driver);
//					
//					company.Click_gotoEditCompany();
//					company.Click_clickPayrollDetails();
//					company.Click_AllowancesSchemes();
//					company.clickYesEmployementAllownaces();
//				    company.clickEnabledEmployementAllownaces();
//					
					pages.PayrollRun payroll= new pages.PayrollRun (driver);
//			
//					payroll.Click_PayrollDashboard();
//					
					pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
					
					employee.clickNewEmployee();
					employee.enterTitle(data[54]);
					employee.enterFirstName(data[63]);
					employee.enterLastName(data[167]);
					employee.enterDateOfBirth(data[65]);
					employee.enterAddressLine(data[66]);
					employee.enterAddressLine2(data[67]);
					employee.enterPostCode(data[68]);
					employee.clickSaveBtn();
					employee.clickMandotoryPayroll();
					
					employee.enterJoiningDate(data[197]);
			
					employee.enterNICategory(data[6]);
					employee.enterTaxCode(data[174]);
					employee.clickSaveBtn();
					employee.click_Paydetails();
					employee.enterBasicSalary3(data[181]);
					employee.clickSaveBtn();
					
					payroll.Click_PayrollDashboard();
					
			
					employee.clickNewEmployee();
					employee.enterTitle(data[54]);
					employee.enterFirstName(data[63]);
					employee.enterLastName(data[168]);
					employee.enterDateOfBirth(data[65]);
					employee.enterAddressLine(data[66]);
					employee.enterAddressLine2(data[67]);
					employee.enterPostCode(data[68]);
					employee.clickSaveBtn();
					employee.clickMandotoryPayroll();
					
					employee.enterJoiningDate(data[198]);
			
					employee.enterNICategory(data[6]);
					employee.enterTaxCode(data[175]);
					employee.clickSaveBtn();
					employee.click_Paydetails();
					employee.enterBasicSalary3(data[182]);
					employee.clickSaveBtn();
					
					payroll.Click_PayrollDashboard();
			
					employee.clickNewEmployee();
					employee.enterTitle(data[54]);
					employee.enterFirstName(data[63]);
					employee.enterLastName(data[169]);
					employee.enterDateOfBirth(data[65]);
					employee.enterAddressLine(data[66]);
					employee.enterAddressLine2(data[67]);
					employee.enterPostCode(data[68]);
					employee.clickSaveBtn();
					employee.clickMandotoryPayroll();
					
					employee.enterJoiningDate(data[199]);
			
					employee.enterNICategory(data[6]);
					employee.enterTaxCode(data[176]);
					employee.clickSaveBtn();
					employee.click_Paydetails();
					employee.enterBasicSalary3(data[183]);
					employee.clickSaveBtn();
					
					payroll.Click_PayrollDashboard();
			
					employee.clickNewEmployee();
					employee.enterTitle(data[54]);
					employee.enterFirstName(data[63]);
					employee.enterLastName(data[170]);
					employee.enterDateOfBirth(data[65]);
					employee.enterAddressLine(data[66]);
					employee.enterAddressLine2(data[67]);
					employee.enterPostCode(data[68]);
					employee.clickSaveBtn();
					employee.clickMandotoryPayroll();
					
					employee.enterJoiningDate(data[200]);
			
					employee.enterNICategory(data[6]);
					employee.enterTaxCode(data[177]);
					employee.clickSaveBtn();
					employee.click_Paydetails();
					employee.enterBasicSalary3(data[184]);
					employee.clickSaveBtn();
					payroll.Click_PayrollDashboard();


					employee.clickNewEmployee();
					employee.enterTitle(data[54]);
					employee.enterFirstName(data[63]);
					employee.enterLastName(data[171]);
					employee.enterDateOfBirth(data[65]);
					employee.enterAddressLine(data[66]);
					employee.enterAddressLine2(data[67]);
					employee.enterPostCode(data[68]);
					employee.clickSaveBtn();
					employee.clickMandotoryPayroll();
					
					employee.enterJoiningDate(data[201]);
			
					employee.enterNICategory(data[6]);
					employee.enterTaxCode(data[178]);
					employee.clickSaveBtn();
					employee.click_Paydetails();
					employee.enterBasicSalary3(data[185]);
					employee.clickSaveBtn();
					payroll.Click_PayrollDashboard();
					

					employee.clickNewEmployee();
					employee.enterTitle(data[54]);
					employee.enterFirstName(data[63]);
					employee.enterLastName(data[172]);
					employee.enterDateOfBirth(data[65]);
					employee.enterAddressLine(data[66]);
					employee.enterAddressLine2(data[67]);
					employee.enterPostCode(data[68]);
					employee.clickSaveBtn();
					employee.clickMandotoryPayroll();
					
					employee.enterJoiningDate(data[202]);
			
					employee.enterNICategory(data[6]);
					employee.enterTaxCode(data[179]);
					employee.clickSaveBtn();
					employee.click_Paydetails();
					employee.enterBasicSalary3(data[186]);
					employee.clickSaveBtn();
					payroll.Click_PayrollDashboard();
					

					employee.clickNewEmployee();
					employee.enterTitle(data[54]);
					employee.enterFirstName(data[63]);
					employee.enterLastName(data[173]);
					employee.enterDateOfBirth(data[65]);
					employee.enterAddressLine(data[66]);
					employee.enterAddressLine2(data[67]);
					employee.enterPostCode(data[68]);
					employee.clickSaveBtn();
					employee.clickMandotoryPayroll();
					
					employee.enterJoiningDate(data[203]);
			
					employee.enterNICategory(data[6]);
					employee.enterTaxCode(data[180]);
					employee.clickSaveBtn();
					employee.click_Paydetails();
					employee.enterBasicSalary3(data[187]);
					employee.clickSaveBtn();
					payroll.Click_PayrollDashboard();
					
					_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

					processPay.click3Dots();
					processPay.clickProcessPay();
					processPay.enterBasicPay(data[204]);
					processPay.clickSaveBtn();

					processPay.click3Dot2();
					processPay.clickProcessPay2();
					processPay.enterBasicPay(data[205]);
					processPay.clickSaveBtn();

					processPay.click3Dot3();
					processPay.clickProcessPay3();
					processPay.enterBasicPay(data[206]);
					processPay.clickSaveBtn();
					
					processPay.click3Dot4();
					processPay.clickProcessPay4();
					processPay.enterBasicPay(data[207]);
					processPay.clickSaveBtn();
					pages.reports report= new pages.reports(driver);
					
					payroll.Run_Payroll();
					
					
					report.Click__Reports_();
					report.Click_Payroll_Summary();
					
					payroll.SelecPeriodEndDate(data[42]);
					
					_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

					verify.verifyPayrollSummaryCFBF_Ammount(data[188],data[189], data[190], data[191], data[192], data[193], data[194],data[195],data[196]);
					
					verify.assertAll();
					
				}
			 
		 
		 
		 
		
			 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

				public void TC11validateTaxPaymentCisOct() throws Exception {

					sTestCaseID = "TC591";
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
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName(data[70]);
//					OpenClient.Click_ClickSearch();
//					OpenClient.Click_ClickClient();
//					
//					OpenClient.Click_ClientsClick();
//					pages.CreateClient buisness= new pages.CreateClient (driver);
//					buisness.clickNewClient();
//					buisness.clickLimitedCompany();
//					buisness.clickMnualyLimitedCompany();
//					buisness.enterBuisnessName();
//					
//					buisness.enterRegistrationNo();
//					buisness.enterRegistrationDate(data[58]);
//					buisness.enterFirstName();
//					buisness.enterLastName();
//					buisness.clickSaveBtn();
					
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName2();
//					OpenClient.Click_ClickSearch();
			//	
//					pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//					Bk.Click_BKEdit();
//					Bk.Select_services(data[56]);
//					Bk.Enter_CompanyAddressLine1(data[57]);
//					Bk.Click_Save();
			//
//					Bk.Click_AccountingPeriod();
//					Bk.Click_AddAccountingPeriod();
//					Bk.Enter_NewStartDate(data[58]);
//					Bk.Enter_NewEndDate(data[59]);
//					Bk.Click_AccPeriodSave();
					OpenClient.Click_ClientsClick();
					OpenClient.Enter_EnterClientName2();
					OpenClient.Click_ClickSearch();
					OpenClient.Click_ClickClient();
//					
//					pages.EditCompany company= new 	pages.EditCompany(driver);
//					
//					company.Click_gotoEditCompany();
//					company.Click_clickPayrollDetails();
//					company.Click_AllowancesSchemes();
//					company.clickYesEmployementAllownaces();
//				    company.clickEnabledEmployementAllownaces();
//					
					pages.PayrollRun payroll= new pages.PayrollRun (driver);
//			
//					payroll.Click_PayrollDashboard();
//					
//					pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//					
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[64]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[45]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[7]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[5]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
//					
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[49]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[46]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[8]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[11]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[50]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[47]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[9]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[12]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[51]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[48]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[10]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[13]);
//					employee.clickSaveBtn();
//					payroll.Click_PayrollDashboard();
					_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

					pages.reports report= new pages.reports(driver);
			
					report.clickTaxPayment();
					
					_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

					verify.verifyCisSufferd(data[208],data[209], data[210], data[211], data[212], data[213], data[214],data[215],data[216],data[217],data[218],data[219],data[220]);
					
					verify.assertAll();
					
				}
		 
		 
		 
			 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

				public void TC12validatePayrollSummaryEmailOct() throws Exception {

					sTestCaseID = "TC591";
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
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName(data[70]);
//					OpenClient.Click_ClickSearch();
//					OpenClient.Click_ClickClient();
//					
//					OpenClient.Click_ClientsClick();
//					pages.CreateClient buisness= new pages.CreateClient (driver);
//					buisness.clickNewClient();
//					buisness.clickLimitedCompany();
//					buisness.clickMnualyLimitedCompany();
//					buisness.enterBuisnessName();
//					
//					buisness.enterRegistrationNo();
//					buisness.enterRegistrationDate(data[58]);
//					buisness.enterFirstName();
//					buisness.enterLastName();
//					buisness.clickSaveBtn();
					
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName2();
//					OpenClient.Click_ClickSearch();
			//	
//					pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//					Bk.Click_BKEdit();
//					Bk.Select_services(data[56]);
//					Bk.Enter_CompanyAddressLine1(data[57]);
//					Bk.Click_Save();
			//
//					Bk.Click_AccountingPeriod();
//					Bk.Click_AddAccountingPeriod();
//					Bk.Enter_NewStartDate(data[58]);
//					Bk.Enter_NewEndDate(data[59]);
//					Bk.Click_AccPeriodSave();
					OpenClient.Click_ClientsClick();
					OpenClient.Enter_EnterClientName2();
					OpenClient.Click_ClickSearch();
					OpenClient.Click_ClickClient();
//					
//					pages.EditCompany company= new 	pages.EditCompany(driver);
//					
//					company.Click_gotoEditCompany();
//					company.Click_clickPayrollDetails();
//					company.Click_AllowancesSchemes();
//					company.clickYesEmployementAllownaces();
//				    company.clickEnabledEmployementAllownaces();
//					
					pages.PayrollRun payroll= new pages.PayrollRun (driver);
//			
//					payroll.Click_PayrollDashboard();
//					
//					pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//					
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[64]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[45]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[7]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[5]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
//					
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[49]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[46]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[8]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[11]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[50]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[47]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[9]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[12]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[51]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[48]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[10]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[13]);
//					employee.clickSaveBtn();
//					payroll.Click_PayrollDashboard();
					_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

					pages.reports report= new pages.reports(driver);
			
					report.Click__Reports_();
					report.Click_Payroll_Summary();
					_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
					
					email.clickEmailBtn();

					email.clickSendBtn();

					pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

//					email.clickEmailLog();
//					email.clickRecievedPayroll();
					emaillog.clickEmailDropDown();
					emaillog.clickEmailLog();
					emaillog.clickRecievedEmail();
					
					_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
                     verify.VerifyRecivedPayrollSummary(data[221]);
					
					verify.assertAll();
					
				}
		 
		
			 @Test(dependsOnMethods = "TC01validatePayrollSummaryCFWithCISApril")

				public void TC13validatePaySlipEmailOct() throws Exception {

					sTestCaseID = "TC591";
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
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName(data[70]);
//					OpenClient.Click_ClickSearch();
//					OpenClient.Click_ClickClient();
//					
//					OpenClient.Click_ClientsClick();
//					pages.CreateClient buisness= new pages.CreateClient (driver);
//					buisness.clickNewClient();
//					buisness.clickLimitedCompany();
//					buisness.clickMnualyLimitedCompany();
//					buisness.enterBuisnessName();
//					
//					buisness.enterRegistrationNo();
//					buisness.enterRegistrationDate(data[58]);
//					buisness.enterFirstName();
//					buisness.enterLastName();
//					buisness.clickSaveBtn();
					
//					OpenClient.Click_ClientsClick();
//					OpenClient.Enter_EnterClientName2();
//					OpenClient.Click_ClickSearch();
			//	
//					pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//					Bk.Click_BKEdit();
//					Bk.Select_services(data[56]);
//					Bk.Enter_CompanyAddressLine1(data[57]);
//					Bk.Click_Save();
			//
//					Bk.Click_AccountingPeriod();
//					Bk.Click_AddAccountingPeriod();
//					Bk.Enter_NewStartDate(data[58]);
//					Bk.Enter_NewEndDate(data[59]);
//					Bk.Click_AccPeriodSave();
					OpenClient.Click_ClientsClick();
					OpenClient.Enter_EnterClientName2();
					OpenClient.Click_ClickSearch();
					OpenClient.Click_ClickClient();
//					
//					pages.EditCompany company= new 	pages.EditCompany(driver);
//					
//					company.Click_gotoEditCompany();
//					company.Click_clickPayrollDetails();
//					company.Click_AllowancesSchemes();
//					company.clickYesEmployementAllownaces();
//				    company.clickEnabledEmployementAllownaces();
//					
					pages.PayrollRun payroll= new pages.PayrollRun (driver);
//			
//					payroll.Click_PayrollDashboard();
//					
//					pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//					
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[64]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[45]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[7]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[5]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
//					
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[49]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[46]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[8]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[11]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[50]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[47]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[9]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[12]);
//					employee.clickSaveBtn();
//					
//					payroll.Click_PayrollDashboard();
			//
//					employee.clickNewEmployee();
//					employee.enterTitle(data[54]);
//					employee.enterFirstName(data[63]);
//					employee.enterLastName(data[51]);
//					employee.enterDateOfBirth(data[65]);
//					employee.enterAddressLine(data[66]);
//					employee.enterAddressLine2(data[67]);
//					employee.enterPostCode(data[68]);
//					employee.clickSaveBtn();
//					employee.clickMandotoryPayroll();
//					
//					employee.enterJoiningDate(data[48]);
			//
//					employee.enterNICategory(data[6]);
//					employee.enterTaxCode(data[10]);
//					employee.clickSaveBtn();
//					employee.click_Paydetails();
//					employee.enterBasicSalary3(data[13]);
//					employee.clickSaveBtn();
//					payroll.Click_PayrollDashboard();
					_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

					pages.reports report= new pages.reports(driver);
			
					report.Click__Reports_();
					report.Click_Payslipsclick();
					_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
					email.selectEmailType(data[222]);
				    email.clickPayslipEmailBtn();
				    email.clickSendBtn();

					pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

//					email.clickEmailLog();
//					email.clickRecievedPayroll();
					emaillog.clickEmailDropDown();
					emaillog.clickEmailLog();
					emaillog.clickRecievedEmail();
					
					_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
                  verify.VerifyRecivedPayrollSummary(data[221]);
					
					verify.assertAll();
					
				}
		 
}
