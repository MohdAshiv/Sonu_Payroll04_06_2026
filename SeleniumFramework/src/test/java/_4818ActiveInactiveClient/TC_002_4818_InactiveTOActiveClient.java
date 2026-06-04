package _4818ActiveInactiveClient;

import org.testng.annotations.Test;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import pages.gotoPayrollSetting;
import tests.TestBase;
import utilities.ExcelData;

public class TC_002_4818_InactiveTOActiveClient extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateInactiveToActiveClient() throws Exception {

		sTestCaseID = "TC002";
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

		_4818ActiveInactiveClient.ClientTab _clientTab = new _4818ActiveInactiveClient.ClientTab(driver);
		_clientTab.clkClient();
		_clientTab.enterClientStatus(data[4]);
		_clientTab.clickClientSearch();
		_clientTab.clickEditClient();
		_clientTab.enterCompanyStatus(data[5]);
		_clientTab.saveBtn();
		_clientTab.clickClosePopup();

		_4818ActiveInactiveClient.PayrollDashboard _searchClient = new _4818ActiveInactiveClient.PayrollDashboard(driver);
		_searchClient.Click_PayrollLnk();
		_searchClient.Click_DashboardLnk();
		_searchClient.clickTotalClient();
		_searchClient.verifyActiveCopany(data[8]);
		_clientTab.clkClient();

		_clientTab.enterClientStatus(data[5]);
		_clientTab.clickClientSearch();
		_searchClient.resetClientStatus2();
		_clientTab.enterCompanyStatus(data[4]);
		_clientTab.saveBtn();
		_clientTab.clickClosePopup();

	}
}