package _2081_RecurringAddition_Deductions;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC044_Individually_EmployeePaySchedule extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateRecurringIndividuallyEmployeePaySchedule_EmailAndDownloadPayslip() throws Exception {

		sTestCaseID = "TC044";
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

		pages.reports _reportSection = new pages.reports(driver);

		_reportSection.Click__Reports_();

		_reportSection.Click_Individual_Employee_Pay_Scheduleclick();

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_2081_RecurringAddition_Deductions_page.EmailPage _email = new _2081_RecurringAddition_Deductions_page.EmailPage(
				driver);
		// verify email for Employer
		_email.Click_Email();
		_email.Click_SendBtn();
		
        pages.AgentLevelEmailLog email = new pages.AgentLevelEmailLog(driver);
		
		email.clickEmailDropDown();
		email.clickEmailLog();
		email.clickRecievedEmail();
		_verify.verifyEmailLog(data[11]);
		utilities.TakeScreenshot.Getscreenshot("TC044_ Verify EmailLog Employer", "2081", driver);

		// verify email for Employees
		utilities.ChangeWindow.Switchwindow(2, driver);

		_reportSection.Click__Reports_();
		_reportSection.Click_Individual_Employee_Pay_Scheduleclick();
		_email.Select_Type(data[12]);
		_email.Click_Email();
		_email.Click_SendBtn();
		email.clickEmailDropDown();
		email.clickEmailLog();
		email.clickRecievedEmail();
		
		           // _email.Click_EmailLog();
		_verify.verifyEmailLog(data[13]);
		utilities.TakeScreenshot.Getscreenshot("TC044_ Verify EmailLog Employees", "2081", driver);
		utilities.ChangeWindow.Switchwindow(2, driver);

		// verify Downloadpayslip Clickable
		_reportSection.Click__Reports_();
		_reportSection.Click_Individual_Employee_Pay_Scheduleclick();
		_verify.DownloadPayslipClikable();

	}

	@Test(priority = 2, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateRecurringIndividuallyEmployeePaySchedule_CSV() throws Exception {

		sTestCaseID = "TC044";
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

		pages.reports _reportSection = new pages.reports(driver);
		_reportSection.Click__Reports_();
		_reportSection.Click_Individual_Employee_Pay_Scheduleclick();

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);
		_verify.ReadCSVFile2(data[14]);

	}

	@Test(priority = 3, enabled = true, groups = { "subscriptAllowenceScheme",
			"subscriptAllowenceScheme - Default Profile" })

	public void validateRecurringIndividuallyEmployeePaySchedule_PDF_Report() throws Exception {

		sTestCaseID = "TC044";
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

		pages.reports _reportSection = new pages.reports(driver);
		_reportSection.Click__Reports_();
		_reportSection.Click_Individual_Employee_Pay_Scheduleclick();

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);

		_verify.Individually_EmployeePaySchedulePDF(data[15]); // verify
		

	}

	@Test(priority = 4)

	public void validateRecurringIndividuallyEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC044";
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

		pages.reports _reportSection = new pages.reports(driver);
		_reportSection.Click__Reports_();
		_reportSection.Click_Individual_Employee_Pay_Scheduleclick();

		_2081_RecurringAddition_Deductions_page.VerifyData _verify = new _2081_RecurringAddition_Deductions_page.VerifyData(
				driver);

		_verify.Grossamountverify(data[16], data[17]); // verify
		utilities.TakeScreenshot.Getscreenshot("TC044_ Verify Gross Pay", "2081", driver);
		
		_2081_RecurringAddition_Deductions_page.PayrollPage _payroll = new _2081_RecurringAddition_Deductions_page.PayrollPage(
				driver);
		_payroll.Click_PayrollDashboard();
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
