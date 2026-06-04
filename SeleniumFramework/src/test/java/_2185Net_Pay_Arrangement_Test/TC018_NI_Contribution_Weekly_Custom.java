package _2185Net_Pay_Arrangement_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC018_NI_Contribution_Weekly_Custom extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateNiContributionCustom() throws Exception {

		sTestCaseID = "TC018";
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
		
		_2185Net_Pay_Arrangement_Page.RunPayroll _payroll=new _2185Net_Pay_Arrangement_Page.RunPayroll(driver);
		
		for(int i=0;i<=4;i++)
		{
	    _payroll.Click_clickRunPayroll1();
	    _payroll.Click_RunPayroll2();

		}
	    _2185Net_Pay_Arrangement_Page.XML_Data _xmldata= new _2185Net_Pay_Arrangement_Page.XML_Data(driver);
		_xmldata.Click_gotoFiling_Management();
		_xmldata.Enter_getXMLData1();
		utilities.TakeScreenshot.Getscreenshot("TC018_verify Taxable and NI ", "2185", driver);
		_xmldata.verifyTaxAndNIC(data[5],data[6],data[7]);
		
		_payroll.scrollClickPayrollDashboard();
		for(int i=0;i<=4;i++) {	_payroll.Undo_LastPayroll();}
	
		 
}
}
