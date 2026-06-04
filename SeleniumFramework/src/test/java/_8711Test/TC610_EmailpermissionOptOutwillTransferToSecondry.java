package _8711Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC610_EmailpermissionOptOutwillTransferToSecondry  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	@Test(priority = 1)
	public void TC01validateEmailpermissionOptOutwillTransferToSecondry () throws Exception 
	{
		
		sTestCaseID = "TC610";
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
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
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
		

        company.enterFirstName(data[33]);
		company.enterEmail(data[34]);
		company.clickAddContact();		
		_8711Page.Page page= new _8711Page.Page(driver);
	
		page.editSecondryContact();
		page.onlyCheckTimesheetMnagement();
		company.clickUpdateContact();
		
		
		page.editMainContact();
		page.untickTimesheetManagement();
		company.clickUpdateContact();
		
		
		page.clickAddOnSetting2();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyOnlyTimesheetOptionSelected();
		
		verify.assertAll();
	
	}
	
	
	@Test(priority = 2)
	public void TC02validateNotSelectionNotAllowedToOptOut () throws Exception 
	{
		
		sTestCaseID = "TC610";
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
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
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
		

        company.enterFirstName(data[33]);
		company.enterEmail(data[34]);
		company.clickAddContact();		
		_8711Page.Page page= new _8711Page.Page(driver);
	
	
		page.editMainContact();
		page.untickTimesheetManagement();
		company.clickUpdateContact();
		
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyAlert(data[11]);
		
		verify.assertAll();
	
	}
	
	
	@Test(priority = 3)
	public void TC03validateNotSelectionNotAllowedToOptOut () throws Exception 
	{
		
		sTestCaseID = "TC610";
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
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
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
		

        company.enterFirstName(data[33]);
		company.enterEmail(data[34]);
		company.clickAddContact();		
		_8711Page.Page page= new _8711Page.Page(driver);
	
	
		page.editMainContact();
		page.untickTimesheetManagement();
		company.clickUpdateContact();
		
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyAlert(data[11]);
		
		verify.assertAll();
	
	}
	
	

	@Test(priority = 4)
	public void TC04validateMainContactOptionDefaultcheckEvenAddWithUntick () throws Exception 
	{
		
		sTestCaseID = "TC610";
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
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
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
		
		_8711Page.Page page= new _8711Page.Page(driver);
	
		page.untickTickAllOptionsManinContact();
		company.clickAddContact();

		page.clickAddOnSetting1();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyPermmisonDropDownAllOptionsShouldSelectted();
		
		verify.assertAll();
	
	}
	
	
	@Test(priority = 5)
	public void TC05validateDelectBtn () throws Exception 
	{
		
		sTestCaseID = "TC610";
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
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
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

        company.enterFirstName(data[33]);
		company.enterEmail(data[34]);
		company.clickAddContact();		
		
		_8711Page.Page page= new _8711Page.Page(driver);
	
		page.editMainContact();
		
		page.deletMainContact();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyAlert(data[10]);
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		page.deletMainContact();
		verify.verifyAlert(data[9]);

		
		verify.assertAll();
	
	}
	
}
