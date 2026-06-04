package _2081_RecurringAddition_Deductions;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC043_RecurringAdition_PeriodSummary extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateRecurringAdditionPayrollSummary() throws Exception {

		sTestCaseID = "TC043";
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

		_2081_RecurringAddition_Deductions_page.EmployeePage _employee = new _2081_RecurringAddition_Deductions_page.EmployeePage(
				driver);
		_employee.Click_clickonEmpName();

		_employee.Click_ViewAditionDeduction();
		_employee.Enter_Frequency(data[5]);
		_employee.Enter_FromDate(data[6]);
		_employee.Enter_toDate(data[7]);
		_employee.Enter_AcountCode(data[8]);
		_employee.Enter_description(data[9]);
		_employee.Enter_Amount(data[10]);
		// _employee.Click_ApplyOn();
		_employee.Click_SaveBtn();

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);

		for (int i = 1; i <= 4; i++) {
			_payroll.Run_Payroll();
		}
		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		pages.reports _reportSection = new pages.reports(driver);

		_reportSection.Click__Reports_();
		_reportSection.Click_Payroll_Reporting_Period_Summary();
		_verify.verifyPayrollSummaryPeriodPayments(data[11]);
		utilities.TakeScreenshot.Getscreenshot("TC043_ Verify Bonous Amount ", "2081", driver);

	}

	@Test(priority = 2, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateRecurringAdditionOnPDF() throws Exception {

		sTestCaseID = "TC043";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		pages.reports _reportSection = new pages.reports(driver);

		_reportSection.Click__Reports_();
		_reportSection.Click_Payroll_Reporting_Period_Summary();
		_verify.Click_PayslipIcn();
		_verify.VerifyPdfPayrollSummaryPeriod(data[10]);

	}

	@Test(priority = 3)

	public void validateRecurringAdditionOnCSV() throws Exception {

		sTestCaseID = "TC043";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		pages.reports _reportSection = new pages.reports(driver);

		_reportSection.Click__Reports_();
		_reportSection.Click_Payroll_Reporting_Period_Summary();
		_verify.ReadCSVFile(data[10]);

		
//		_payroll.Click_PayrollDashboard();
//		for (int i = 1; i <= 4; i++) {
//			_payroll.Undo_LastPayroll();
//		}
//
//		_2081_RecurringAddition_Deductions_page.EmployeePage _employee = new _2081_RecurringAddition_Deductions_page.EmployeePage(
//				driver);
//		_employee.Click_clickonEmpName();
//		_employee.Click_ViewAditionDeduction();
//		_employee.Delet_Addition();
//		_employee.Click_SaveBtn();

	}
	
	@Test(priority = 4)

	public void UndoLastPayrollAndDeletAddition() throws Exception {

		sTestCaseID = "TC043";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);
		for (int i = 1; i <= 4; i++) {
			_payroll.Undo_LastPayroll();
		}

		_2081_RecurringAddition_Deductions_page.EmployeePage _employee = new _2081_RecurringAddition_Deductions_page.EmployeePage(
				driver);
		_employee.Click_clickonEmpName();
		_employee.Click_ViewAditionDeduction();
		_employee.Delet_Addition();
		_employee.Click_Savedata();

	}
}
