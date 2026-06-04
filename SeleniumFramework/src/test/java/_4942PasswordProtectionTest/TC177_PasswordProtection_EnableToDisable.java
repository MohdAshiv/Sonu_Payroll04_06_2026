package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC177_PasswordProtection_EnableToDisable extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validatePasswordFromPreviewIcnAfterChangeTagPayeToAccount() throws Exception {

		sTestCaseID = "TC177";
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
	    company.clickEnabledPassProtectionEmployer();
	   
	    company.enterInputTextPassword(data[5]);
	    company.clickCreateBtn();
	  
	    company.Click_ClickSave();
	   
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	     verify.EnabledPassProtectionEmployer();
	     verify.previewIcnAndChangePassWord();
	     
	     company.clickPasswordNoEmployer();
	     
	     company.Click_ClickSave();
	     
	     verify.PasswordNotEnabled();
	 	 utilities.TakeScreenshot.Getscreenshot("TC177_ VerifyEnterdPassword ", "4942", driver);

	    payroll.scrollClickPayrollDashboard();
	     
	 	payroll.runPayroll();
		payroll.selectType(data[6]);
		payroll.runPayroll2();
		payroll.selectPayrollSummaryAndSend();
		
		   
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
        verify.VerifyRecivedPayrollSummary(data[7]);
	    ChangeWindow.Switchwindow(2, driver);

	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	   
	    company.clickPasswordNoEmployer();
	    company.Click_ClickSave();
	    company.PasswordNotEnabled();
	   
        verify.assertAll();
	   
}	
	
}
