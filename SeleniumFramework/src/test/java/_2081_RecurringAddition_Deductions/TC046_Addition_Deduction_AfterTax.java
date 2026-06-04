package _2081_RecurringAddition_Deductions;

import org.testng.Reporter;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC046_Addition_Deduction_AfterTax extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validateGrossOnPayrollDashboard() throws Exception {

		sTestCaseID = "TC046";
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
		 _employee.Click_ApplyOnDeduction();
		_employee.Click_SaveBtn();
		_employee.Click_clickonEmpName();
		_employee.Click_ViewAditionDeduction();
		_employee.Enter_Frequency(data[5]);
		_employee.Enter_FromDate(data[6]);
		_employee.Enter_toDate(data[11]);
		_employee.Enter_AcountCode(data[8]);
		_employee.Enter_description(data[12]);
		_employee.Enter_Amount(data[13]);
		 _employee.Click_ApplyOn();
		_employee.Click_SaveBtn();

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_verify.GrossPay(data[14]);
		utilities.TakeScreenshot.Getscreenshot("TC046_ Gross on Payrolldashboard", "2081", driver);
		
		

	}
	
	
	@Test(priority = 2)

	public void validateAdditionDeductionOnProcessPage() throws Exception {

		sTestCaseID = "TC046";
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
		_employee.GotoProcessPay();
		_verify.verifyAdditionDeduction(data[13], data[10]);
		utilities.TakeScreenshot.Getscreenshot("TC046_ Verify Addition Deduction", "2081", driver);

	}
	@Test(priority = 3)

	public void validatePensionShouldAutoCalculate() throws Exception {

		sTestCaseID = "TC046";
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

		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);

		_verify.PensionAmount1(data[15], data[16]);
		utilities.TakeScreenshot.Getscreenshot("TC046_ Verify pension for every month", "2081", driver);

	}
	

	@Test(priority = 4)

	public void validateAdditionDeductionPayslip() throws Exception {

		sTestCaseID = "TC046";
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

		for (int i = 1; i <= 5; i++) {
			_payroll.Run_Payroll();
		}

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		pages.reports _reportSection = new pages.reports(driver);

		_reportSection.Click__Reports_();
		_reportSection.Click_Payslipsclick();
		_verify.openPayslip3();
		_verify.payslipAdditionDeduction(data[13], data[10]);

	}

	@Test(priority = 5)

	public void validateAdditionDeductionPayrollPeriodSummaryReport() throws Exception {

		sTestCaseID = "TC046";
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

		_verify.AdditionDeductionPayrollReporting(data[17], data[13], data[10]);
		_verify.AdditionDeductionPayrollReporting(data[17], data[13], data[10]);
		_verify.AdditionDeductionPayrollReporting(data[18], data[13], data[10]);
		_verify.AdditionDeductionPayrollReporting(data[18], data[13], data[10]);
		_verify.AdditionDeductionPayrollReporting(data[19], data[13], data[10]);
		_verify.AdditionDeductionPayrollReporting(data[19], data[13], data[10]);
		_verify.AdditionDeductionPayrollReporting(data[20], data[13], data[10]);
		_verify.AdditionDeductionPayrollReporting(data[20], data[13], data[10]);
		utilities.TakeScreenshot.Getscreenshot("TC046_ Verify Addition Deduction PRPS", "2081", driver);
		Reporter.log("Verify Addition deduction Coulom ");

	}

	@Test(priority = 6)

	public void validateAdditionDeductionPayrollSummaryAndIndividualPayschedule() throws Exception {

		sTestCaseID = "TC046";
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
		_reportSection.Click_Payroll_Summary();
		_verify.PayrollSummary(data[21]);
		_reportSection.Click__Reports_();
		_reportSection.Click_Individual_Employee_Pay_Scheduleclick();
		_verify.individualEmployeePaySchedule(data[10], data[22]);
		utilities.TakeScreenshot.Getscreenshot("TC046_ Verify  Deduction IEPS", "2081", driver);
}
	
	@Test(priority = 7)

	public void validateNetPayONAdditonDeduction() throws Exception {

		sTestCaseID = "TC046";
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
		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_verify.verifyNetPayt(data[23], data[24]);
		utilities.TakeScreenshot.Getscreenshot("TC046_ Verify Net Pay", "2081", driver);
}
	
	@Test(priority = 8)

	public void validateAutoStopDeductionAugust() throws Exception {

		sTestCaseID = "TC046";
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
		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_verify.AutostopDeduction(data[22]);
		
		utilities.TakeScreenshot.Getscreenshot("TC046_ Verify Stop Deduction", "2081", driver);

	     _payroll.Click_PayrollDashboard();
		for (int i = 1; i <= 5; i++) {
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