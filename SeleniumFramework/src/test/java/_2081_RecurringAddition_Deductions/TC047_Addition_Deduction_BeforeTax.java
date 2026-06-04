package _2081_RecurringAddition_Deductions;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC047_Addition_Deduction_BeforeTax extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validatPensionShouldAutoCalculate() throws Exception {

		sTestCaseID = "TC047";
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
		_employee.Click_deductionTab();
		_employee.Enter_FromDateDeduction(data[6]);
		_employee.Enter_toDateDeduction(data[7]);
		_employee.Enter_AcountCodeDeduction(data[8]);
		_employee.Enter_descriptionDeduction(data[9]);
		_employee.Enter_AmountDeduction(data[10]);

		_employee.Click_AddMoreDeduction();
		_employee.Enter_FromDateDeduction1(data[6]);
		_employee.Enter_toDateDeduction1(data[7]);
		_employee.Enter_AcountCodeDeduction1(data[8]);
		_employee.Enter_descriptionDeduction1(data[11]);
		_employee.Enter_AmountDeduction1(data[12]);
		_employee.Click_SaveBtn();

		_employee.Click_clickonEmpName();

		_employee.Click_ViewAditionDeduction();
		_employee.Enter_Frequency(data[5]);
		_employee.Enter_FromDate(data[16]);
		_employee.Enter_toDate(data[17]);
		_employee.Enter_AcountCode(data[8]);
		_employee.Enter_description(data[13]);
		_employee.Enter_Amount(data[14]);
		_employee.Click_AddMore();
		_employee.Enter_Frequency1(data[5]);
		_employee.Enter_FromDate1(data[16]);
		_employee.Enter_toDate1(data[17]);
		_employee.Enter_AcountCode1(data[8]);
		_employee.Enter_description1(data[15]);
		_employee.Enter_Amount1(data[18]);
		_employee.Click_SaveBtn();

		_employee.Click_clickonEmpName();
		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_verify.PensionAmount3(data[20], data[23]);
		utilities.TakeScreenshot.Getscreenshot("TC047_ Verify Pension for every month", "2081", driver);

	}

	@Test(priority = 2)

	public void validatGrossAndAdditonDeductionProcessPage() throws Exception {

		sTestCaseID = "TC047";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);
		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_verify.GrossAmount(data[19]);
		System.out.println();
		for (int i = 1; i <= 2; i++) {
			_payroll.Run_Payroll();
		}

		_employee.GotoProcessPayPage();
		_verify.verifyAdditionDeductions(data[14], data[18], data[10], data[12]);
		utilities.TakeScreenshot.Getscreenshot("TC047_ Verify Addition Deduction", "2081", driver);

		_payroll.Click_PayrollDashboard();
		for (int i = 1; i <= 2; i++) {
			_payroll.Undo_LastPayroll();
		}
	}

	@Test(priority = 3)

	public void validateAdditonDeductionPayslip() throws Exception {

		sTestCaseID = "TC047";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);
		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);

		System.out.println();
		for (int i = 1; i <= 8; i++) {
			_payroll.Run_Payroll();
		}

		pages.reports _reportSection = new pages.reports(driver);

		_reportSection.Click__Reports_();
		_reportSection.Click_Payslipsclick();

		_verify.openPayslip4();

		_verify.payslipAdditionDeductions(data[14], data[18], data[9], data[12]);

	}

	@Test(priority = 4)

	public void validateDeductionStopFromDec() throws Exception {

		sTestCaseID = "TC047";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);
		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_employee.Click_clickonEmpName();
		_verify.AutostopDeductionfromDec(data[22]);
		utilities.TakeScreenshot.Getscreenshot("TC047_ Verify Stop Deduction", "2081", driver);

}
	
	@Test(priority = 5)
	
	
	    public void resetEmployee() throws Exception
	    {
		sTestCaseID = "TC047";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);
		for (int i = 1; i <= 8; i++) {
			_payroll.Undo_LastPayroll();
		}
		_employee.Click_clickonEmpName();
		_employee.Click_ViewAditionDeduction();
		_employee.Delet_Addition();
		_employee.Click_Savedata();

		_employee.Click_clickonEmpName();
		_employee.Click_ViewAditionDeduction();
		_employee.Click_deductionTab();
		_employee.Delet_Deduction();
		_employee.Click_Savedata();
		_payroll.Click_PayrollDashboard();
	    }
}