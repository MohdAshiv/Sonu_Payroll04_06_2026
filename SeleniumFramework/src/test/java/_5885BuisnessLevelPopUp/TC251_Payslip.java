package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC251_Payslip extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateEmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC251";
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
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payslipsclick();
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
        email.selectEmailType(data[5]);
		//email.clickEmailBtn();
        email.clickPayslipEmailBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtnPayslip();
        email.clickPayslipEmailBtn();
		verify.verifyCloseBtnPayslip();
		
		verify.asserAll();
	}	
	
	
	
	@Test(priority=2)

	public void validateEmployeeEmailPopUp() throws Exception {

		sTestCaseID = "TC251";
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
	  
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payslipsclick();
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
        email.selectEmailType(data[6]);
		//email.clickEmailBtn();
       // email.clickEmailPayslipBtn();
        email.clickPayslipEmailBtn();

		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtn1();
        email.clickPayslipEmailBtn();
		verify.verifyCloseBtn1();
		
	
	
		verify.asserAll();
	}	
	
	
	@Test(priority=3)

	public void validateBothEmailPopUp() throws Exception {

		sTestCaseID = "TC251";
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
	  
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payslipsclick();
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
        email.selectEmailType(data[7]);
		//email.clickEmailBtn();
      //  email.clickEmailPayslipBtn();
        email.clickPayslipEmailBtn();

		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtn2();
        email.selectEmailType(data[7]);

        email.clickPayslipEmailBtn();

		verify.verifyCloseBtn2();
		
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		verify.asserAll();
	}	
	
	
}
