package _4818ActiveInactiveClient;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC003_4818_InactiveClientReportSection extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile" })

	public void validateInactiveClientOnReportSection()
			throws Exception {

		sTestCaseID = "TC003";
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
    	
    	_4818ActiveInactiveClient.ClientTab _clientTab= new _4818ActiveInactiveClient.ClientTab(driver);
		_clientTab.clkClient();
		_clientTab.enterClientName(data[4]);
		_clientTab.enterClientService(data[5]);
		_clientTab.enterClientStatus(data[6]);
		_clientTab.clickClientSearch();
	    _clientTab.verifyAllDataForInactive(data[4], data[5], data[6]);
	    utilities.TakeScreenshot.Getscreenshot("verify Inactive Client", "4818", driver);

	}
	
	
}
