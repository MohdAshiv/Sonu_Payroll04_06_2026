package _2185Net_Pay_Arrangement_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC033_Employerview extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validatDataFromEmployerView() throws Exception {

		sTestCaseID = "TC033";
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
		_2185Net_Pay_Arrangement_Page.Report_Section _report = new _2185Net_Pay_Arrangement_Page.Report_Section(driver);
//		_report.Click_FilingM();
//		_report.Select_TaxYear(data[5]);
		_2185Net_Pay_Arrangement_Page.RTI_Submission _rtiReport = new _2185Net_Pay_Arrangement_Page.RTI_Submission(
				driver);
//		_rtiReport.selectChekBx();
//		_rtiReport.Select_Reson();
//		_rtiReport.Submit_HMRC();
		
		_rtiReport.Click_EmployerView();

		_report.Select_TaxYear(data[5]);
		_rtiReport.veryfyEmployerView(data[6], data[7], data[8]);

		

	}

	

}