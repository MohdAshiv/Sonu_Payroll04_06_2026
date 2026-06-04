package _2185Net_Pay_Arrangement_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC032_RTI_Submission_Report extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateP60TotalTaxDeducted() throws Exception {

		sTestCaseID = "TC032";
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

		_2185Net_Pay_Arrangement_Page.RunPayroll _payroll = new _2185Net_Pay_Arrangement_Page.RunPayroll(driver);
//		_payroll.Click_Runpayroll12();
//		_2185Net_Pay_Arrangement_Page.Report_Section _report = new _2185Net_Pay_Arrangement_Page.Report_Section(driver);
//		_report.Click_FilingM();
//		_report.Select_TaxYear(data[5]);
//
		_2185Net_Pay_Arrangement_Page.RTI_Submission _rtiReport = new _2185Net_Pay_Arrangement_Page.RTI_Submission(driver);
//		_rtiReport.selectChekBx();
//		_rtiReport.Select_Reson();
//		_rtiReport.Submit_HMRC();
    	utilities.ChangeWindow.Switchwindow(1, driver);
		_rtiReport.Click_AgentReport();
		_rtiReport.Click_RTI_Report();
		_rtiReport.Select_Taxyear(data[5]);
		_rtiReport.Select_Company(data[4]);
		_rtiReport.verifySubmissionRTI();

	}
	
}