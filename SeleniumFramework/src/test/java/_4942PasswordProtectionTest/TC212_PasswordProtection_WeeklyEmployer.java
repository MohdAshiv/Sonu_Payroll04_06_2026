package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC212_PasswordProtection_WeeklyEmployer extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	//@Test(priority=0)

	public void clientSetup() throws Exception {

		sTestCaseID = "TC212";
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
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
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
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		company.enterFirstName(data[13]);
		company.enterEmail(data[14]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		
		pages.FrequencySet freq= new pages.FrequencySet(driver);
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[12]);
		freq.Enter_WeeklyPayDate(data[69]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[70]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.enterEmailAddress(data[14]);

		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[69]);

		employee.enterNICategory(data[7]);
		employee.enterTaxCode(data[8]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[9]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
	}
	@Test(priority=1)

	public void validatePasswordProtectedPayslip() throws Exception {

		sTestCaseID = "TC212";
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
	
		
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.UndoPayroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.clickEnabledPassProtectionEmployer();
		company.selectTag(data[5]);
	
		company.clickCreateBtn();

		company.Click_ClickSave();

		_4942PasswordProtection_Page.VerifyResult verify = new _4942PasswordProtection_Page.VerifyResult(driver);
		//verify.previewIcnAndChangePassWord();

		company.clickIcn();

		verify.verifyEnterdPassword(data[4]);

		payroll.scrollClickPayrollDashboard();
		
		payroll.Run_Payroll();
		
		pages.reports report= new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.clickEmailBtn();

		email.clickSendBtn();

//		email.clickEmailLog();
//		email.clickRecievedPayroll();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	
		verify.VerifyRecivedPayrollSummaryWithPassword11(data[6]);
	    ChangeWindow.Switchwindow(2, driver);

//		payroll.scrollClickPayrollDashboard();
	    payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();

		company.clickPasswordNoEmployer();
		company.Click_ClickSave();
		company.PasswordNotEnabled();
		verify.assertAll();

}	
	

}