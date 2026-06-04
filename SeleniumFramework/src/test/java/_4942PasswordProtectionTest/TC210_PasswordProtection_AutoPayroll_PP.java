package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC210_PasswordProtection_AutoPayroll_PP extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateRecivedEmailShouldPasswordProtected() throws Exception {

		sTestCaseID = "TC210";
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

	   
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.Click_ClickEnableAutorun();
	    company.Click_ClickContinue();
	    company.Select_SelectEmailMode(data[10]);
	    company.Click_SelectYes();
	    company.Click_Continue2();
	    company.Click_Enable2();
	    
		company.clickEnabledPassProtectionEmployee();
		company.selectTagEmployee(data[5]);

		company.clickCreateBtnEmployee();

		company.clickEnabledPassProtectionEmployer();
		company.selectTag(data[6]);
		company.clickCreateBtn();
		company.Click_ClickSave();

		payroll.scrollClickPayrollDashboard();
		
		

		pages.reports report = new pages.reports(driver);
        payroll.Run_Payroll();
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.clickEmailBtn();

		email.clickSendBtn();

//		email.clickEmailLog();
//		email.clickRecievedPayroll();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);	   

		verify.VerifyRecivedPayslipPasswordProtected36(data[9]);
	    ChangeWindow.Switchwindow(2, driver);

	    
//	    payroll.scrollClickPayrollDashboard();
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.Click_ClickEmailSettings();
	    company.Click_ClickDisable();
	    Thread.sleep(2000);
		company.clickPasswordNoEmployer();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
	    verify.assertAll();
}
}
