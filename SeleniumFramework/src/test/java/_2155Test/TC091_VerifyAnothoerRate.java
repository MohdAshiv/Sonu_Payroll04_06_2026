package _2155Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC091_VerifyAnothoerRate extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test
	public void validateAnotherHourlyRateAfterRunPayroll() throws Exception {

		sTestCaseID = "TC091";
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
	    processPay.addMoreRate();
	    processPay.enterRate1(data[7]);
	    processPay.enterUnit1(data[8]);
	   
	    processPay.enterRate(data[7]);
	    processPay.enterUnit(data[8]);
	   
	    processPay.applyFuturePay();
	    processPay.clickSaveBtn();
	    
	    payroll.Run_Payroll();
	    
	    processPay.click3Dots();
	    processPay.clickProcessPay();
	    _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);
	    verify.payWorkedOut(data[9], data[8],data[7]);
	    utilities.TakeScreenshot.Getscreenshot("TC091_ ProcessPay Rate Unit", "2155", driver);
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Undo_LastPayroll();
	    
	    employee.click3Dots();
  		employee.clickEditBtn();
  		employee.click_Paydetails();
  		employee.Click_howpayworkout(data[10]);
  		employee.clickSaveBtn();
	    verify.assertAll();
	    
}

}