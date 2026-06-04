package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC054_CorrectFigureShow_PayrollPage extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validatePayrollPageFor2Employee() throws Exception {

		sTestCaseID = "TC054";
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
		_1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		 payroll.UndoPayroll();
		 processPay.click3Dots();
		 processPay.clickProcessPay1();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[7]);
		 processPay.clickSaveBtn();
		
		 processPay.click3Dots2();
		 processPay.clickProcessPay2();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[8]);
		 processPay.clickApplyBtn();
		 processPay.untickPensionable();
		 processPay.clickSaveBtn();
		 _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
  	     verify.getDataEmployee1();
  	     utilities.TakeScreenshot.Getscreenshot("TC054_ Get data from PayrollDashboard", "1566", driver);
  	    
		payroll.runPayroll();
		verify.verifyPayrollPageEmployee1();  //Employee1 Verify
		payroll.clickCancel();
		
		verify.getDataEmployee2();
		payroll.runPayroll();
		verify.verifyPayrollPageEmployee2();       //Employee2 Verify
		utilities.TakeScreenshot.Getscreenshot("TC054_ Verify Payroll Page show same which is payrollDashboad", "1566", driver);
		
		
		
		 
		
	}
	
}
