package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC254_TaxPayment extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateHMRCPopUp() throws Exception {

		sTestCaseID = "TC254";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
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
	
		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.clickTaxPayment();
		
	
		_5885BuisnessLevelPopUP_Page.BuisnessPage dashboard= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		 dashboard.clickHmrcAdjustments();
		
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelBtnTaxPayment1();
		 dashboard.clickHmrcAdjustments();

		 verify.verifyCloseBtnTaxPayment1();
		
		 verify.asserAll();
	}		
		
	@Test(priority=2)

	public void validateStatutoryPayFundingPopUp() throws Exception {

		sTestCaseID = "TC254";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
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
	
		pages.reports report= new pages.reports(driver);
	
		report.clickTaxPayment();
		
	
		_5885BuisnessLevelPopUP_Page.BuisnessPage dashboard= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		 dashboard.clickStatutoryPayFunding();
		
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelBtnTaxPayment1();
		 dashboard.clickStatutoryPayFunding();

		 verify.verifyCloseBtnTaxPayment1();
		
		 verify.asserAll();
	}
	
	
	@Test(priority=3)

	public void validateTaxRefundPopUp() throws Exception {

		sTestCaseID = "TC254";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
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
	
		pages.reports report= new pages.reports(driver);
	
		report.clickTaxPayment();
		
	
		_5885BuisnessLevelPopUP_Page.BuisnessPage dashboard= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		 dashboard.clickTaxRefund();
		
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelBtnTaxPayment1();
		 dashboard.clickTaxRefund();

		 verify.verifyCloseBtnTaxPayment1();
		
		 verify.asserAll();
	}
	
	
	

	@Test(priority=4)

	public void validateTCisSufferdPopUp() throws Exception {

		sTestCaseID = "TC254";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
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
	
		pages.reports report= new pages.reports(driver);
	
		report.clickTaxPayment();
		
	
		_5885BuisnessLevelPopUP_Page.BuisnessPage dashboard= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		 dashboard.clickCisSufferd();
		
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelBtnTaxPayment1();
		 dashboard.clickCisSufferd();

		 verify.verifyCloseBtnTaxPayment1();
		
		 verify.asserAll();
	}
	
	
	
	@Test(priority=5)

	public void validateEmailPopUp() throws Exception {

		sTestCaseID = "TC254";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
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

	    payroll.Run_Payroll();
	
		pages.reports report= new pages.reports(driver);

		report.clickTaxPayment();

		_5885BuisnessLevelPopUP_Page.BuisnessPage dashboard = new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

		dashboard.clickEmailBtn();

		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnTaxPayment();
		dashboard.clickEmailBtn();

		verify.verifyCloseBtnTaxPayment();
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		verify.asserAll();
	}
	
	
	
}
