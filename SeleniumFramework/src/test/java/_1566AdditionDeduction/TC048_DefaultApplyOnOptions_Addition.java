package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC048_DefaultApplyOnOptions_Addition extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validateApplyIcnSholudTickByDefault() throws Exception {

		sTestCaseID = "TC048";
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
		 processPay.clickAddMore();
		 processPay.clickApplyBtn();
		 _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
		 verify.DefaultCheckedAllOptions();
		 utilities.TakeScreenshot.Getscreenshot("TC048_ Verify All options default Check", "1566", driver);
				
	}
	
	@Test(priority = 2)

	public void validateApplyIcnAllOptionsShouldClickable() throws Exception {

		sTestCaseID = "TC048";
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
		 processPay.clickAddMore();
		 processPay.clickApplyBtn();
		 _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
		 verify.elemClickable();
		 utilities.TakeScreenshot.Getscreenshot("TC048_ Verify All options Clickable", "1566", driver);
		 
				
	}
}
