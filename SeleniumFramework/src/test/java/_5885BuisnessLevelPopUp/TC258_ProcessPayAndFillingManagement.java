package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC258_ProcessPayAndFillingManagement  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateNetPayCalculaterPopUp() throws Exception {

		sTestCaseID = "TC258";
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
	
		pages.ProcessPay processPay= new pages.ProcessPay(driver);
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.clickNetPayCalculator();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCloseBtnNetPayCalculator();
		
		verify.asserAll();
	}		
	
	
	
	
	@Test(priority=2)

	public void validateFpsPopUp() throws Exception {

		sTestCaseID = "TC258";
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
	
		pages.PayrollRun payroll= new pages.PayrollRun(driver);
		
		payroll.Run_Payroll();
		
		pages.FilingManagement filling= new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();
		filling.clickFps();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCloseBtnFPS();
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		
		verify.asserAll();
	}		
	

	@Test(priority=3)

	public void validateEPSPopUp() throws Exception {

		sTestCaseID = "TC258";
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
	
		pages.PayrollRun payroll= new pages.PayrollRun(driver);
		
		payroll.Run_Payroll();
		
		pages.FilingManagement filling= new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();
		filling.clickEps();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	    
		verify.verifyCloseBtnEps();
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		
		verify.asserAll();
	}		
}
