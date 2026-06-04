package _2155Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC096_VerifyUnitsAndRateChangesForFuturePayroll extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void validatFuturePayroll() throws Exception {

		sTestCaseID = "TC096";
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
		employee.Enter_DayRate(data[6]);
		employee.clickSaveBtn();
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
	    
	    pages.ProcessPay processPay= new  pages.ProcessPay(driver);
	    
	    processPay.click3Dots();
	    processPay.clickProcessPay();
	    processPay.enterUnit(data[7]);
	    processPay.applyFuturePay();
	    processPay.clickSaveBtn();
	    employee.clickEmployeeName();
	   _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);
	    
	    verify.verifyFuturePayroll(data[8]);
	    utilities.TakeScreenshot.Getscreenshot("TC096_ VerifyFuturePayroll", "2155", driver);

	    
	    payroll.Click_PayrollDashboard();
	    payroll.Run_Payroll();
	    
	    processPay.click3Dots();
	    processPay.clickProcessPay();
	    processPay.rateChange(data[9]);
	    processPay.enterUnit(data[10]);
	    processPay.applyFuturePay();
	    processPay.clickSaveBtn();
	    employee.clickEmployeeName();
	    verify.verifyFuturePayroll1(data[11]);
	    verify.assertAll();
	
	}
	
	
	@Test(priority=2)
	public void validatPayslip() throws Exception {

		sTestCaseID = "TC096";
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
	
	    pages.reports report= new    pages.reports(driver);
	    
	    _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);    
		report.Click__Reports_();
		report.Click_Payslipsclick();
		verify.payslip2(data[8], data[12], data[13]);
		    
	}
	

	@Test(priority=3)
	public void UndoLastPayroll() throws Exception {

		sTestCaseID = "TC096";
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
		payroll.Undo_LastPayroll();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.click3Dots();
  		employee.clickEditBtn();
  		employee.click_Paydetails();
  		employee.Click_howpayworkout(data[14]);
  		employee.clickSaveBtn();

		 
}
}
