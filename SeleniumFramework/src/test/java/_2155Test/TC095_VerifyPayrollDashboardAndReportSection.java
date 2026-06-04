package _2155Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC095_VerifyPayrollDashboardAndReportSection extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void validatPayrollDashBoard() throws Exception {

		sTestCaseID = "TC095";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
	
		employee.click3Dots();
		employee.clickEditBtn();
		employee.click_Paydetails();
		employee.Click_howpayworkout(data[5]);
		employee.Enter_HourRate(data[6]);
		employee.clickSaveBtn();
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
	    
	    pages.ProcessPay processPay= new  pages.ProcessPay(driver);
	    
	    processPay.click3Dots();
	    processPay.clickProcessPay();
	    processPay.enterUnit(data[7]);
	    processPay.clickSaveBtn();
	    processPay.click3Dots();
	    processPay.clickProcessPay();
	    processPay.addMoreRate();
	    processPay.payDescription1(data[8]);
	    processPay.enterRate(data[9]);
	    processPay.enterUnit1(data[10]);
	    processPay.applyFuturePay();
	    processPay.clickSaveBtn();
	  
	    _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);
	    verify.payrollDashboard(data[11]);
	    
}
	

	@Test(priority=2)
	public void validatPayyslip() throws Exception {

		sTestCaseID = "TC095";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		 pages.PayrollRun payroll= new  pages.PayrollRun(driver);
		 
		payroll.Run_Payroll();

	    _2155Page.Verify_ExpectedResults verify = new _2155Page.Verify_ExpectedResults(driver);

		pages.reports report = new pages.reports(driver);

		report.Click__Reports_();
		report.Click_Payslipsclick();
	    verify.payslip(data[11], data[12], data[13]);
	
	
	}
	
	
	@Test(priority=3)
	public void validatReportSection() throws Exception {

		sTestCaseID = "TC095";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		 pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    _2155Page.Verify_ExpectedResults verify = new _2155Page.Verify_ExpectedResults(driver);

		pages.reports report = new pages.reports(driver);

		report.Click__Reports_();
		report.Click_Individual_Employee_Pay_Scheduleclick();
		verify.individualEmployeePaySchedule(data[11]);
	    utilities.TakeScreenshot.Getscreenshot("TC095_ IndividualEmployeePaySchedule", "2155", driver);

		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		verify.payrollSummary(data[11]);
	    utilities.TakeScreenshot.Getscreenshot("TC095_ PayrollSummary", "2155", driver);

		
		report.Click__Reports_();
		report.Click_Payroll_Reporting_Period_Summary();
		verify.payrollReportingPeriodSummary(data[11]);
	    utilities.TakeScreenshot.Getscreenshot("TC095_ PayrollSummary", "2155", driver);

		
		//Reset Employee
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.click3Dots();
  		employee.clickEditBtn();
  		employee.click_Paydetails();
  		employee.Click_howpayworkout(data[14]);
  		employee.clickSaveBtn();
  		verify.assertAll();
  		verify.assertAll();
	  
	
	}
	
}
