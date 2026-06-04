package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC160_PasswordProtection_AutoPayrollEnabled extends TestBase {
	
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	//@Test

	public void validateRecivedEmailShouldBeUnprotected() throws Exception {

		sTestCaseID = "TC160";
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

	    payroll.UndoPayroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.Click_ClickEnableAutorun();
	    company.Click_ClickContinue();
	    company.Select_SelectEmailMode(data[5]);
	    company.Click_SelectYes();
	    company.Click_Continue2();
	    company.Click_Enable2();
	    
	    company.PasswordNotEnabled();
	    
	    
	    payroll.Click_PayrollDashboard();
	    payroll.UndoPayroll();
	    
	    payroll.runPayroll();
	    payroll.selectType(data[6]);
	    payroll.runPayroll2();
	    payroll.selectPayrollSummaryAndSend();
	    
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
	    
 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	         //email.clickEmailLog();
	       //  email.clickRecievedPayroll();
	    
	    System.out.println("xyz");
	    
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	    
	    verify.VerifyRecivedPayrollSummary(data[7]);
	    
	    ChangeWindow.Switchwindow(2, driver);
	    
	      // payroll.scrollClickPayrollDashboard();
	    
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.Click_ClickEmailSettings();
	    company.Click_ClickDisable();
	 
}

}
