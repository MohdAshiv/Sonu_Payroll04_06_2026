package EmployerAndEmployeePassword;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC10_5EmployeeUndoRerunScenario extends TestBase{
	
	 public String sTestCaseID = null;
		String[] data = null;
		String Sheet = null;

		@Test(priority=1)

		public void TC01UndoOneEmployeeAndRerun() throws Exception {

			sTestCaseID = "TC010";
			Sheet = "Password";
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
//			pages.CreateClient buisness= new pages.CreateClient (driver);
//			buisness.clickNewClient();
//			buisness.clickLimitedCompany();
//			buisness.clickMnualyLimitedCompany();
//			buisness.enterBuisnessName();
//			
//			buisness.enterRegistrationNo();
//			buisness.enterRegistrationDate(data[88]);
//			buisness.enterFirstName();
//			buisness.enterLastName();
//			buisness.clickSaveBtn();
//			
//			OpenClient.Click_ClientsClick();
//			OpenClient.Enter_EnterClientName2();
//			OpenClient.Click_ClickSearch();
//		
//			pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//			Bk.Click_BKEdit();
//			Bk.Select_services(data[86]);
//			Bk.Enter_CompanyAddressLine1(data[87]);
//			Bk.Click_Save();
//
//			Bk.Click_AccountingPeriod();
//			Bk.Click_AddAccountingPeriod();
//			Bk.Enter_NewStartDate(data[88]);
//			Bk.Enter_NewEndDate(data[89]);
//			Bk.Click_AccPeriodSave();
			
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName("WsQgtKTLY");
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
//			pages.EditCompany company= new 	pages.EditCompany(driver);
//			
//			company.Click_gotoEditCompany();
//			
//		    company.Click_clickDepartments();		
//			company.clickDepartment();
//			company.enterDepartmentName1(data[12]);
//			company.clickDepatrmentSaveBtn();
//			Thread.sleep(15000);
//				
//			company.Click_clickPayrollDetails();
//			
//			company.enterPayeNumber(data[90]);
//			company.enterRefrenceNumber(data[91]);
//			company.accountOfficeReffrence(data[92]);
//			
//			company.Click_ClickSave();
//			company.Click_clickPayrollSettings();
//			company.Enter_NomismaStartDate(data[108]);
//			company.Click_ClickSave();
//			
//			
//			
//			company.clickYesPension();
//			pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//			
//		pages.PensionSetup pension = new pages.PensionSetup(driver);
//			
//			pension.enterPensionStagingDate(data[93]);
//			pension.enterSignatoryTitle();
//			pension.enterSignatoryName();
//			pension.enterEmailAddress(data[94]);
//			pension.enterPhoneNumber();
//			pension.enterPensionId(data[95]);
//			pension.clickPensonDetailsSave();
//			payroll.scrollClickPayrollDashboard();
//			pension.clickPensionDashBoard();
//			pension.addSchemeManually();
//			pension.enterPensionSchemeName(data[96]);
//			pension.selectPensionProvider(data[96]);
//			pension.selectCalculationBasis(data[97]);
//			pension.selectCalculationMethod(data[98]);
//			pension.eeContribution(data[99]);
//			pension.enterErContribution(data[100]);
//			pension.enterSubgroupName();
//			pension.enterGroupId();
//			pension.enterSubGroupId();
//			pension.clickSaveBtn();
//			payroll.Click_PayrollDashboard();
//			
//			
//
//			payroll.Click_PayrollDashboard();
//			
//			
//			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//			
//			for(int i=7;i<=11;i++) {
//				
//			employee.clickNewEmployee();
//			employee.enterFirstName(data[103]);
//			employee.enterLastName(data[i]);
//			employee.enterDateOfBirth(data[104]);
//			employee.enterAddressLine(data[105]);
//			employee.enterAddressLine2(data[106]);
//			employee.enterPostCode(data[107]);
//			employee.clickSaveBtn();
//			employee.clickMandotoryPayroll();
//			employee.enterJoiningDate(data[108]);
//			employee.enterNICategory(data[6]);
//			employee.enterTaxCode(data[12 + (i - 7)]);
//			employee.clickSaveBtn();
//			employee.click_Paydetails();
//			employee.enterBasicSalary3(data[5]);
//			employee.clickSaveBtn();
//			payroll.Click_PayrollDashboard();
//			
//			}
		    pages.PayrollRun payroll= new pages.PayrollRun (driver);

		    payroll.Run_Payroll();

			pages.EditCompany company= new pages.EditCompany(driver);

		    company.Click_gotoEditCompany();
		    company.Click_clickPayrollDetails();
		    company.Click_clickPayrollSettings();
		    company.clickEnabledPassProtectionEmployer();
		    company.selectTag("Company UTR Number");
			
		    company.clickCreateBtn();//save btn
		    
		    
		    company.clickEnabledPassProtectionEmployee();
		    company.selectTagEmployee("Employee's First name");
		    company.clickCreateBtnEmployee();//save btn

		    
		    company.clickChangePasswordEmployer();																																														
		    
		    PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
		    
		    verify.verifyLastActivityLogField("Company UTR Number");
		    company.clickChangePasswordEmployee();	
		    verify.verifyLastActivityLogField("Employee's First name");

		    payroll.Click_PayrollDashboard();
		    
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);

			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();

			page.SwithToDefault();

			page.UntickEmployeeCCheckBox();
			page.clickUndoBtn();
			
			driver.navigate().refresh();
			payroll.UndoPayroll();
			
		    payroll.runPayroll();
	
		    payroll.selectType("To Main Contact");
		    payroll.runPayroll2();
		    payroll.sendEmailFromRunPayroll();

		   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		 	
		   emaillog.clickEmailDropDown();
		   emaillog.clickEmailLog();
		   emaillog.clickRecievedEmail();

	       verify.verifyPDFPasswordProtection("Employer's Summary",data[25]);
	       verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
	       verify.verifyPDFPasswordProtection("Payslips_",data[25]);

		}
		

		@Test(priority=1)
		public void TC01_validateToMainFromRunPayroll() throws Exception {

			sTestCaseID = "TC010";
			Sheet = "Password";
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
			OpenClient.Enter_EnterClientName("WsQgtKTLY");
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
			pages.PayrollRun payroll= new pages.PayrollRun (driver);
			payroll.UndoPayrollTillLast();
			    
			
			pages.EditCompany company= new pages.EditCompany(driver);
			payroll.Click_PayrollDashboard();

		    company.Click_gotoEditCompany();
		    company.Click_clickPayrollDetails();
		    company.Click_clickPayrollSettings();
		    company.clickChangePasswordEmployer();																																														
		    company.selectTag("PAYE Reference Number");
			
		    company.clickCreateBtn();//save btn
		    
		    company.clickChangePasswordEmployee();	
		    company.selectTagEmployee("Post code");
		    company.clickCreateBtnEmployee();//save btn

		    
		    company.clickChangePasswordEmployer();																																														
		    
		    PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
		    
		    verify.verifyLastActivityLogField("PAYE Reference Number");
		    company.clickChangePasswordEmployee();	
		    verify.verifyLastActivityLogField("Post code");

		    payroll.Click_PayrollDashboard();
		    payroll.UndoPayroll();
		    
		    payroll.runPayroll();

		    payroll.selectType("To Main Contact");
		    payroll.runPayroll2();
		    payroll.sendEmailFromRunPayroll();

		   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		 	
		   emaillog.clickEmailDropDown();
		   emaillog.clickEmailLog();
		   emaillog.clickRecievedEmail();
	   
	     verify.verifyPDFPasswordProtection("Employer's Summary",data[27]);
	     verify.verifyPDFPasswordProtection("Employee Payslip",data[28]);
	     verify.verifyPDFPasswordProtection("Payslips_",data[27]);

		}

		
}
