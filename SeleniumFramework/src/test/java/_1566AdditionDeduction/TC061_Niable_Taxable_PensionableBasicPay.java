package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC061_Niable_Taxable_PensionableBasicPay extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validateTaxableAndNiable_PensionableFromXml() throws Exception {

		sTestCaseID = "TC061";
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
		 processPay.enterBasicPay(data[10]);
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 
		 processPay.clickAddMore(); 
		 processPay.enterAccountCode(data[5]);
		 processPay.enterDescription(data[6]);
		 processPay.enterAmount(data[7]);
		 processPay.clickApplyBtn();
		 processPay.untickPensionable();  // Taxable and NIable
		
		 processPay.clickAddMore(); 
		 processPay.enterAccountCode2(data[5]);
		 processPay.enterDescription2(data[8]);
		 processPay.enterAmount2(data[9]);
		 processPay.clickApplyBtn2();
		 processPay.untickAllOptions2();
		 
		processPay.clickSaveBtn();
		 _1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
		 payroll.Run_Payroll();
		 
	    _1566AdditionDeductionPage.FillingManagement xml=new _1566AdditionDeductionPage.FillingManagement(driver);
		 
		 xml.Click_gotoFilingManagement();
		 xml.clickFPS();
		 xml.getXMLData();
		 utilities.TakeScreenshot.Getscreenshot("TC061_Verify Taxable and Niable", "1566", driver);
		 xml.verifyTaxablePayAndNiable2(data[11],data[11]);
		 
		 xml.Click_gotoFilingManagement();
		 xml.selectPension(data[12]);
		 xml.getXMLData2();
		 utilities.TakeScreenshot.Getscreenshot("TC061_Verify PensionablePay", "1566", driver);
		 xml.verifyPensionablePay2(data[10]);
		 payroll.Click_PayrollDashboard();
		 payroll.Undo_LastPayroll();
}
}
