package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC162_PasswordProtection_JustZip extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateRecivedEmailShouldBeUnprotected() throws Exception {

		sTestCaseID = "TC162";
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
	    company.selectFileTypeViaEmail(data[5]);
	
	    
	    company.PasswordNotEnabled();
	    
	    company.Click_ClickSave();
	    
	    
	    payroll.Click_PayrollDashboard();
	    payroll.UndoPayroll();
	    
	    payroll.runPayroll();
	    payroll.selectType(data[6]);
	    payroll.runPayroll2();
	    payroll.selectPayrollSummaryAndSend();
	   
	    
	      pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
		    emaillog.clickEmailDropDown();
		    emaillog.clickEmailLog();
		    emaillog.clickRecievedEmail();
		    System.out.println("xyz");
	    
//	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
//	    
//	    email.clickEmailLog();      Not Requred
//	    email.clickRecievedPayroll();
	    
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	    
	    verify.VerifyRecivedPayrollSummary1(data[7]);
	
}
	
	
	@Test(priority=2)

	public void ResetComapny() throws Exception {

		sTestCaseID = "TC162";
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
	    company.selectFileTypeViaEmail(data[8]);

	    company.Click_ClickSave();
	    payroll.Click_PayrollDashboard();
	
	}
	
	
}
