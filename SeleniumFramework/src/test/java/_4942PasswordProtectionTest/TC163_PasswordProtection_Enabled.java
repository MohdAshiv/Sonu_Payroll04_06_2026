package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC163_PasswordProtection_Enabled extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

   // @Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		
		sTestCaseID = "TC163";
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
		buisness.enterRegistrationDate(data[8]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[6]);
		Bk.Enter_CompanyAddressLine1(data[7]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[8]);
		Bk.Enter_NewEndDate(data[9]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		company.enterFirstName(data[24]);
		company.enterEmail(data[25]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[10]);
		company.enterRefrenceNumber(data[11]);
		company.accountOfficeReffrence(data[12]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[23]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[13]);
		employee.enterFirstName(data[14]);
		employee.enterLastName(data[15]);
		employee.enterDateOfBirth(data[16]);
		employee.enterAddressLine(data[17]);
		employee.enterAddressLine2(data[18]);
		employee.enterPostCode(data[19]);
		employee.enterEmailAddress(data[25]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[23]);

		employee.enterNICategory(data[20]);
		employee.enterTaxCode(data[21]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[22]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
				
		
	}
	@Test(priority=1)

	public void validateGeneratePassWordPage() throws Exception {

		sTestCaseID = "TC163";
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
	    
	    
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	    
	    
	    verify.verifyAppearPasswordPage(data[5]);
   	    utilities.TakeScreenshot.Getscreenshot("TC163_ Verify Generate Password Page ", "4942", driver);

	    
	   
}
	
	

	@Test(priority=2)

	public void validateTags() throws Exception {

		sTestCaseID = "TC163";
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
	    
	    
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	    
	    
	    verify.verifyTagsAndText();
   	    utilities.TakeScreenshot.Getscreenshot("TC163_ verifyTagsAndTex ", "4942", driver);

	    verify.assertAll();
   	    

	    
	   
}
	
	
}
