package _2155Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC094_VerifyPayslip extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void validatPayslip() throws Exception {

		sTestCaseID = "TC094";
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
	    processPay.enterUnit(data[8]);
	    processPay.applyFuturePay();
	    processPay.clickSaveBtn();

	
	    
	    _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);
	    
        payroll.Run_Payroll();
	    pages.reports report= new    pages.reports(driver);
	    
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    verify.payslip(data[9], data[10], data[11]);
	    
	    
	}
	
	@Test(priority=2)
		public void validatFuturePayroll() throws Exception {

		sTestCaseID = "TC094";
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

		
         employee.clickEmployeeName();
	    
	    _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);
	    
	     verify.verifyFuturePayroll(data[9]);
	    utilities.TakeScreenshot.Getscreenshot("TC094_ Verify Future Payroll", "2155", driver);
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Undo_LastPayroll();
	    
	    //Reset Employee
	    
	    employee.click3Dots();
  		employee.clickEditBtn();
  		employee.click_Paydetails();
  		employee.Click_howpayworkout(data[12]);
  		employee.clickSaveBtn();
	    
	    verify.assertAll();
}

}