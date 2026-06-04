package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC252_PayrollSummary extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateEmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC252";
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
        report.Click_Payroll_Summary();
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
      
		email.clickEmailBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtn();
		email.clickEmailBtn();
		verify.verifyCloseBtn();
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		verify.asserAll();
	}		
	
}
