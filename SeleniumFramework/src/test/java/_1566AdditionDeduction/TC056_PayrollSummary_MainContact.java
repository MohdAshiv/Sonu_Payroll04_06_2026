package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC056_PayrollSummary_MainContact extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validatePayrollSummaryForMultipleEmployee() throws Exception {

		sTestCaseID = "TC056";
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
		 processPay.untickNIC();
		 processPay.clickSaveBtn();
		 
		 
		 processPay.click3Dots3();
		 processPay.clickProcessPay3();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[9]);
		 processPay.clickApplyBtn();
		 processPay.untickPensionable();
		 processPay.clickSaveBtn();
		 
		 
		 processPay.click3Dots4();
		 processPay.clickProcessPay4();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[10]);
		 processPay.clickApplyBtn();
		 processPay.untickPayeTax();
		 processPay.clickSaveBtn();
		 
	   _1566AdditionDeductionPage.Recurring recurring= new _1566AdditionDeductionPage.Recurring(driver);
	     processPay.click3Dots5();
		 processPay.clickProcessPay5();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 recurring.clickdeductionTab();
		 processPay.selectCheckBx1();
		 processPay.clickDeletBtn();
		 processPay.clickSaveBtn();
		
		 processPay.click3Dots5();
		 processPay.clickProcessPay5();
		 processPay.clickAddMore();
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[11]);
		 processPay.clickApplyBtn();
		 processPay.untickTaxEmployeePensionable();
		 processPay.clickSaveBtn();
		 _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
  	    
  	    _1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
  	     verify.getMultipleEmployeeData();
		 payroll.runPayroll();
		 processPay.selectType(data[12]);
		 payroll.runPayroll2();
		 payroll.clickPayrollSummary();
		 verify.VerifyPayrollSummary();
		 

	}
}
