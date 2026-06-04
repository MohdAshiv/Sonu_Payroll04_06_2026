package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC179_PasswordProtection_EmployeeNotEnabled extends TestBase{

	
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	  // @Test(priority = 0)
		
		public void ClientSetup() throws Exception 
		{
			sTestCaseID = "TC179";
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
			buisness.enterBuisnessName1(data[4]);
			
			buisness.enterRegistrationNo();
			buisness.enterRegistrationDate(data[12]);
			buisness.enterFirstName();
			buisness.enterLastName();
			buisness.clickSaveBtn();
			
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
		
			pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
			Bk.Click_BKEdit();
			Bk.Select_services(data[10]);
			Bk.Enter_CompanyAddressLine1(data[11]);
			Bk.Click_Save();

			Bk.Click_AccountingPeriod();
			Bk.Click_AddAccountingPeriod();
			Bk.Enter_NewStartDate(data[12]);
			Bk.Enter_NewEndDate(data[13]);
			Bk.Click_AccPeriodSave();
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
			pages.EditCompany company= new 	pages.EditCompany(driver);
			
			company.Click_gotoEditCompany();
			company.ClickContactDetails();
			company.enterFirstName(data[28]);
			company.enterEmail(data[29]);
			company.clickAddContact();
			company.Click_clickPayrollDetails();
			
			company.enterPayeNumber(data[14]);
			company.enterRefrenceNumber(data[15]);
			company.accountOfficeReffrence(data[16]);
			
			company.Click_ClickSave();
			company.Click_clickPayrollSettings();
			company.Enter_NomismaStartDate(data[27]);
			company.Click_ClickSave();
			pages.PayrollRun payroll= new pages.PayrollRun (driver);

		    payroll.Click_PayrollDashboard();
			
			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
			
			employee.clickNewEmployee();
			employee.enterTitle(data[17]);
			employee.enterFirstName(data[18]);
			employee.enterLastName(data[19]);
			employee.enterDateOfBirth(data[20]);
			employee.enterAddressLine(data[21]);
			employee.enterAddressLine2(data[22]);
			employee.enterPostCode(data[23]);
			employee.enterEmailAddress(data[29]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[27]);

			employee.enterNICategory(data[24]);
			employee.enterTaxCode(data[25]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary1(data[26]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
					
			
		}
	@Test(priority = 1)

	public void validateRecivedEmailShouldBeUnprotected() throws Exception {

		sTestCaseID = "TC179";
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
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	
		pages.EditCompany company= new pages.EditCompany(driver);
		
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    
	    _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	    verify.PasswordNotEnabledEmployee();
	
	    
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    
	    payroll.Click_PayrollDashboard();
	    payroll.UndoPayroll();
	    
	    payroll.runPayroll();
	    payroll.selectType(data[5]);
	    payroll.runPayroll2();
	    payroll.selectPayrollSummaryAndSend();
	    
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
//	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

	    
	    verify.VerifyRecivedPayrollSummaryUnprotected(data[6]);
	    verify.VerifyRecivedPaySlipUnprotected(data[7]);
        verify.assertAll();
}
	
}
