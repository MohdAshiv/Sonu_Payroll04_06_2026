package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC065_ER_EE_Pensionable_PayrollXml extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validateTaxableAndNiableAndEE_Er_Pensionable() throws Exception {

		sTestCaseID = "TC065";
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
		 processPay.click3Dots2();
		
		 processPay.clickProcessPay2();
		 processPay.enterBasicPay(data[8]);
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore(); 
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[7]);
		 processPay.clickApplyBtn();
		 processPay.onlyTickEmployerPensionPayeTax();
		 utilities.TakeScreenshot.Getscreenshot("TC065_onlyTickEmployerPensionPayeTax", "1566", driver);
		 processPay.clickSaveBtn();
		 _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
		    
		 verify.verifyEmployeePension(1500);
	     verify.verifyEmployerPension2(5000);
	     utilities.TakeScreenshot.Getscreenshot("TC065_Verify EE and ER Pension", "1566", driver);
		 _1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
		 payroll.Run_Payroll();
		 
	    _1566AdditionDeductionPage.FillingManagement xml=new _1566AdditionDeductionPage.FillingManagement(driver);
		 
		 xml.Click_gotoFilingManagement();
		 xml.clickFPS();
		 xml.getXMLData();
		 utilities.TakeScreenshot.Getscreenshot("TC065_Verify Taxable and Niable", "1566", driver);
		 xml.verifyTaxablePayAndNiable(data[9],data[10]);
		 payroll.scrollClickPayrollDashboard();
		 payroll.Undo_LastPayroll();
}
}
