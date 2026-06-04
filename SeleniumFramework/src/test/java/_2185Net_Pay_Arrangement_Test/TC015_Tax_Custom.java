package _2185Net_Pay_Arrangement_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC015_Tax_Custom extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateTaxAndPensionableAmountWithCustom() throws Exception {

		sTestCaseID = "TC015";
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
	   _pension.Click_Pension();

		_pension.Verify_PensionableAmount(data[5]);
		 utilities.TakeScreenshot.Getscreenshot("TC015_verify Pensionable Amount" , "2185", driver);
		_pension.Click_PayrollDashBoard();
	
		_2185Net_Pay_Arrangement_Page.RunPayroll _payroll=new _2185Net_Pay_Arrangement_Page.RunPayroll(driver);
	    _payroll.Click_clickRunPayroll1();
	    _payroll.Click_RunPayroll2();
		
		_2185Net_Pay_Arrangement_Page.XML_Data _xmldata= new _2185Net_Pay_Arrangement_Page.XML_Data(driver);
		_xmldata.Click_gotoFiling_Management();
		_xmldata.Enter_getXMLData1();
		_xmldata.verifyTax();
		utilities.TakeScreenshot.Getscreenshot("TC015_verify Tax Amount", "2185", driver);

		
		 _payroll.scrollClickPayrollDashboard();
		_payroll.Undo_LastPayroll();
}

}