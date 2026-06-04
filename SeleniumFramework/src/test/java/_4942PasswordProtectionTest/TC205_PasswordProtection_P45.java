package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC205_PasswordProtection_P45 extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validatePassworP45PasswordEmployer() throws Exception {

		sTestCaseID = "TC205";
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
	    company.clickEnabledPassProtectionEmployee();
	    company.selectTagEmployee(data[5]);
	 
	  
	    company.clickCreateBtnEmployee();
	    
	    company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	   
	    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[6]);
	   
	    company.clickEnabledPassProtectionEmployer();
	    company.enterInputTextPassword(data[7]);
	    company.clickCreateBtn();
	    company.Click_ClickSave();
	    
	    
	    payroll.scrollClickPayrollDashboard();
	    
	   for (int i=0;i<=2;i++) {payroll.Run_Payroll();}
	   
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
	    
	    pages.reports report= new  pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	    email.selectForm(data[8]);
	    email.selectEmailType(data[9]);
	    email.clickEmailBtnP45();
	    email.clickSendBtn();

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedEmployer2P45(data[11]);
	    verify.VerifyRecivedEmployerP45(data[11]);

	    verify.assertAll();
}
	
	@Test(priority=2)

	public void validatePassworP45PasswordEmployee() throws Exception {

		sTestCaseID = "TC205";
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

    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
   
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
	    
	    pages.reports report= new  pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	    email.selectForm(data[8]);
	    email.selectEmailType(data[10]);
	    email.clickEmailBtnP45();
	    email.clickSendBtn();
//	    email.closePopupP60();
//	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedEmployeeP45(data[11]);
	    ChangeWindow.Switchwindow(2, driver);

       
	    
//	    payroll.scrollClickPayrollDashboard();
	    payroll.Click_PayrollDashboard();
	    for (int i=0;i<=2;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
	   
	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
        company.clickPasswordNoEmployer();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
	    verify.assertAll();
}
	
	
	
}
