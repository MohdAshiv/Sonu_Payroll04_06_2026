package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC164_PasswordProtection_CreatePassword extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateGeneratePassWordPage() throws Exception {

		sTestCaseID = "TC164";
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
	    company.selectTag("Accountant Defined Password");

	    company.enterInputTextPassword(data[5]);
	    company.clickCreateBtn();
	    
	  //  company.Click_clickPayrollDetails();
	  //  company.Click_ClickSave();
	   // company.Click_clickPayrollSettings();
	    company.clickIcn();
	    
	    
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	    
	      verify.verifyEnterdPassword(data[5]);
	   	  utilities.TakeScreenshot.Getscreenshot("TC164_ verifyEnterdPassword ", "4942", driver);


	      verify.assertAll();
	   
}

	@Test(priority = 2)

	public void validateRecivedEmailShouldBeProtected() throws Exception {

		sTestCaseID = "TC164";
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
	    
	    payroll.Click_PayrollDashboard();
	    payroll.UndoPayroll();
	    
	    payroll.runPayroll();
	    payroll.selectType(data[8]);
	    payroll.runPayroll2();
	    payroll.selectPayrollSummaryAndSend();
	    
	    
		// _4942PasswordProtection_Page.EmailPage email= new
		// _4942PasswordProtection_Page.EmailPage(driver);

//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
   
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	    
        // verify.pdfOpenAndEnterPassword();
	    verify.VerifyRecivedPayrollSummaryWithPassword(data[6]);

	    ChangeWindow.Switchwindow(2, driver);
	    
	     // payroll.scrollClickPayrollDashboard();
	    
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    
	   
	    company.clickPasswordNoEmployer();
	    company.Click_ClickSave();
	    company.PasswordNotEnabled();
	   
	   
}
}
