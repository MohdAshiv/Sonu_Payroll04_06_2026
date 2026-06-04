package _8711Test;
import org.testng.annotations.Test;
import tests.TestBase;
import utilities.ExcelData;

public class TC597_EmailpermissionOptions  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	@Test(priority = 1)
	public void TC01validatePermissionDropdownShouldReflect () throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		_8711Page.Page page= new _8711Page.Page(driver);
		
		page.clickAddOnSetting1();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyPermmisonDropDownAllOptionsShouldSelectted();
		
		verify.assertAll();
	
	}
	
	
	
	@Test(priority = 2)
	public void TC02validatePermissionOptionsShouldDisable () throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.ClickContactDetails();

		_8711Page.Page page= new _8711Page.Page(driver);
		
		page.clickAddOnSetting1();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyPermmisonDropDownAllOptionsShouldDisable();
		verify.assertAll();
	
	}
	
	
	
	
	@Test(priority = 3)
	public void TC03validatePermissionOptionsSynchronization () throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.ClickContactDetails();

		_8711Page.Page page= new _8711Page.Page(driver);
		
		page.untickTickAllOptionsManinContact();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyAllOptionsSelected();
		page.untickTickAllOptionsManinContact();
		verify.verifyAllOptionsNotSelected();

		verify.assertAll();
	
	}
	
	
	@Test(priority = 4)
	public void TC04validatePermissionOptionsShouldReflect () throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.ClickContactDetails();

		_8711Page.Page page= new _8711Page.Page(driver);
		
		page.clickAddOnSetting1();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyPermmisonDropDownText(data[5],data[6],data[7],data[8]);
		verify.assertAll();
	
	}
	

	
	@Test(priority = 5)
	public void TC05validatePermissionForSecondContact () throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		
		company.ClickContactDetails();
		
     	company.enterFirstName(data[33]);
		
		company.enterEmail(data[34]);
		company.clickAddContact();

		_8711Page.Page page= new _8711Page.Page(driver);
		
		page.clickAddOnSetting2();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyPermissonDropDownAllOptionsShouldUnchecked();
		verify.assertAll();
	
	}
	
	

	@Test(priority = 6)
	public void TC06validatePermissionAlert () throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		
		company.ClickContactDetails();
		

		_8711Page.Page page= new _8711Page.Page(driver);
		
		page.editMainContact();
		
		page.untickTickAllOptionsManinContact();
		company.clickUpdateContact();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyAlert(data[9]);
		verify.assertAll();
	
	}
	
	
	@Test(priority = 7)
	public void TC07validateSecondryContactConvertToMainContactIfDeletScondryContact() throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		
		company.ClickContactDetails();     	

		_8711Page.Page page= new _8711Page.Page(driver);
	     page.deletMainContact();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyEmailContanctInfo(data[35],data[33],data[34]);
		verify.assertAll();
	
	}
	
	@Test(priority = 8)
	public void TC08validatePermissionMainContactWillAutoTrnaserToSecondaryContact() throws Exception 
	{
		
		sTestCaseID = "TC597";
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
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		
		company.ClickContactDetails();     	

		_8711Page.Page page= new _8711Page.Page(driver);
		
		
		page.clickAddOnSetting1();
		
		_8711Page.Verify8711Page verify= new _8711Page.Verify8711Page(driver);
		
		verify.verifyPermmisonDropDownAllOptionsShouldSelectted();
		verify.assertAll();
	
	}
	
}
