package _2185Net_Pay_Arrangement_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC007_2185_Qualifying_Pensionable extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validatePensionableAmountwithQualifying() throws Exception {

		sTestCaseID = "TC007";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 _loginpage = new pages.loginpage4(driver);
		_loginpage.GoToUrl();
		_loginpage.AssertUrl();
		_loginpage.Enter_EnterUsername(data[1]);
		_loginpage.Enter_Enterpassword(data[2]);
		_loginpage.Click_LoginButton();

		pages.agentpage _agentpage = new pages.agentpage(driver);
		_agentpage.Enter_SearchAgentName(data[3]);
		_agentpage.Click_ClickSearch();
		_agentpage.Click_ClickAgent();

		pages.OpenClient _OpenClient = new pages.OpenClient(driver);
		_OpenClient.Click_ClientsClick();
		_OpenClient.Enter_EnterClientName(data[4]);
		_OpenClient.Click_ClickSearch();
		_OpenClient.Click_ClickClient();

		_2185Net_Pay_Arrangement_Page.Pension_Dashboard _pension = new _2185Net_Pay_Arrangement_Page.Pension_Dashboard(	driver);
//		_pension.Click_Pension();
//		_pension.Click_ViewScheme();
//		_pension.Click_EditScheme();
//		_pension.Open_CalculationBasis("Qualifying Earnings");
//		_pension.Click_SaveBtn();
	    _pension.Click_Pension();
		_pension.Verify_PensionableAmount(data[5]);
		 utilities.TakeScreenshot.Getscreenshot("TC007_verify Pensionable Amount" , "2185", driver);
	   
}}
