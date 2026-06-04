package _4818ActiveInactiveClient;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC_001_4818ValidateInactiveClient extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateInactiveClient() throws Exception {

		sTestCaseID = "TC001";
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

		_4818ActiveInactiveClient.PayrollDashboard _searchClient = new _4818ActiveInactiveClient.PayrollDashboard(driver);
		_searchClient.Click_PayrollLnk();
		_searchClient.Click_DashboardLnk();
		_searchClient.clickTotalClient();
		_searchClient.VerifyErrorMsg();

	}
}
