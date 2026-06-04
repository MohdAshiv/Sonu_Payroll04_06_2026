package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC053_EmployeeeDashboard_3Months extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validateEmployeeDashboard() throws Exception {

		sTestCaseID = "TC053";
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
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		// processPay.clickSaveBtn();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[7]);
		 processPay.clickApplyBtn();
		 processPay.untickPayeTax();
		 processPay.clickSaveBtn();
		 _1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
		 payroll.Run_Payroll();
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[8]);
		 processPay.clickApplyBtn();
		 processPay.untickNIC();
		 processPay.clickSaveBtn();
		 payroll.Run_Payroll();
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[9]);
		 processPay.clickApplyBtn();
		 processPay.untickPensionable();
		 processPay.clickSaveBtn();
		 processPay.selectPeriod(data[10]);
		 _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
  	     verify.payrollDashboard();
		 processPay.clickEmployeeName();
		 verify.employeedashboard();
		 payroll.Click_PayrollDashboard();
		 utilities.TakeScreenshot.Getscreenshot("TC053_ Verify Employee Dashboard April", "1566", driver);
		 
		 processPay.selectPeriod(data[11]);
		 verify.payrollDashboard();
		 processPay.clickEmployeeName();
		 verify.employeedashboardMay();
		 utilities.TakeScreenshot.Getscreenshot("TC053_ Verify Employee Dashboard May", "1566", driver);
		 payroll.Click_PayrollDashboard();
		 
		 processPay.selectPeriod(data[12]);
		 verify.payrollDashboard();
		 processPay.clickEmployeeName();
		 verify.employeedashboardJune();
		 utilities.TakeScreenshot.Getscreenshot("TC053_ Verify Employee Dashboard June", "1566", driver);
		 payroll.Click_PayrollDashboard();
		 for(int i=1;i<=2;i++)
		 {
		 payroll.Undo_LastPayroll();
		 }
}
}
