package _2155Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC086_VerifyHourlyRate extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateHourlyRate() throws Exception {

		sTestCaseID = "TC086";
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
	    
	    employee.click3Dots();
	    processPay.clickProcessPay();
	    processPay.enterUnit(data[7]);
	    processPay.clickSaveBtn();
	    
	    payroll.Run_Payroll();
	    
	    employee.click3Dots();
	    employee.clickEditBtn();
	    employee.click_Paydetails();
	    employee.Click_howpayworkout(data[8]);
	    employee.Enter_HourRate(data[9]);
	    employee.clickSaveBtn();
	    
	    payroll.Click_PayrollDashboard();
	    
	    employee.click3Dots();
	    processPay.clickProcessPay();
	    processPay.enterUnit(data[10]);
	    processPay.applyFuturePay();
	    
	    processPay.clickSaveBtn();
	    
	    payroll.Run_Payroll();
	    employee.click3Dots();
	    processPay.clickProcessPay();
	    
	    _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);
	    
	    verify.payWorkedOut(data[11],data[10],data[9]);
	    utilities.TakeScreenshot.Getscreenshot("TC086_ ProcessPay Rate Unit", "2155", driver);

	    // Reset employee 
	    payroll.Click_PayrollDashboard();
	    for(int i=0;i<=1;i++)
	    {
	    	payroll.Undo_LastPayroll();
	    }
	    employee.click3Dots();
		employee.clickEditBtn();
		employee.click_Paydetails();
		employee.Click_howpayworkout(data[5]);
		employee.Enter_DayRate(data[6]);
		employee.clickSaveBtn();
		verify.assertAll();
}
}
