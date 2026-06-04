package _2185Net_Pay_Arrangement_Test;

import org.testng.annotations.Test;

import pages.reports;
import tests.TestBase;
import utilities.ExcelData;

public class TC030_Verify_P11_Report extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void verifyP11() throws Exception {

		sTestCaseID = "TC030";
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
		
		
		_2185Net_Pay_Arrangement_Page.Report_Section _report= new _2185Net_Pay_Arrangement_Page.Report_Section(driver);
		_report.Click_ReportSection();
		_report.Click_P11Report();
		_report.Select_TaxYear(data[5]);
		_report.VerifyTotalStatuary(1900.00);
		_report.VerifyTotalPaytoDate(1900.00);
	    _report.VerifyTotalFreepay(1048.25);
	    _report.VerifyTotalTaxablePay(851.75);
	    _report.VerifyTotalTaxDue(170.20);
	    utilities.TakeScreenshot.Getscreenshot("TC030_verify P11 ", "2185", driver);
	    
		_2185Net_Pay_Arrangement_Page.Pension_Dashboard _pension = new _2185Net_Pay_Arrangement_Page.Pension_Dashboard(	driver);
		_pension.Click_PayrollDashBoard();
	    _payroll.Click_UndoLastPayroll12();
		
		
}
}
