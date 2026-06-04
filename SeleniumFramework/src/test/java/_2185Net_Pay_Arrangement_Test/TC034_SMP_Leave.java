package _2185Net_Pay_Arrangement_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC034_SMP_Leave extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validatSmpLeaveShouldNotCalculateUntillLeaveStart() throws Exception {

		sTestCaseID = "TC034";
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
		 _payroll.Click_Runpayroll12();

		_2185Net_Pay_Arrangement_Page.XML_Data _xmldata = new _2185Net_Pay_Arrangement_Page.XML_Data(driver);
		_xmldata.Click_gotoFiling_Management2();
		_xmldata.Enter_getXMLData1();
		utilities.TakeScreenshot.Getscreenshot("TC034_verify Gross Amount _qualifying", "2185", driver);
		_xmldata.verifyGrossPay(data[5]);

	}

	@Test(priority = 2, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateTaxableP16() throws Exception {

		sTestCaseID = "TC034";
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

		_2185Net_Pay_Arrangement_Page.Report_Section _report = new _2185Net_Pay_Arrangement_Page.Report_Section(driver);
		_report.Click_ReportSection();
		_report.Click_P11Report();
		_report.Select_TaxYear(data[6]);
		_report.verifyTaxableP16(data[7]);
	}

	@Test(priority = 3, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateTaxableReportingSummary() throws Exception {

		sTestCaseID = "TC034";
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

		_2185Net_Pay_Arrangement_Page.Report_Section _report = new _2185Net_Pay_Arrangement_Page.Report_Section(driver);
		_report.Click_ReportSection();
		_report.Click_ReportingSummary();
		_report.Select_Taxyear(data[6]);
		_report.verifyTaxableSummaryPeriod(data[7]);
		
		_2185Net_Pay_Arrangement_Page.Pension_Dashboard dashboard= new _2185Net_Pay_Arrangement_Page.Pension_Dashboard (driver);
		 dashboard.Click_PayrollDashBoardScroll();
		
		 _2185Net_Pay_Arrangement_Page.RunPayroll _payroll = new _2185Net_Pay_Arrangement_Page.RunPayroll(driver);
		_payroll.Click_UndoLastPayroll12();
	}
	


}
