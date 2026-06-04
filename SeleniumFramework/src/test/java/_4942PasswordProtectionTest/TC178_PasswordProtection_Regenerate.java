package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC178_PasswordProtection_Regenerate extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateEmailPayrollSummaryAfterClickOnRegenerateBtn() throws Exception {

		sTestCaseID = "TC178";
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
	    payroll.Run_Payroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickEnabledPassProtectionEmployer();
	 
	    company.enterInputTextPassword(data[5]);
	    company.clickCreateBtn();
	    
	    company.Click_ClickSave();
	  
	   
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	     verify.previewIcnAndChangePassWord();
	     
	    payroll.Click_PayrollDashboard();
	    
	     pages.reports report= new  pages.reports(driver);
	     report.Click__Reports_();
	     report.Click_Payslipsclick();
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
         email.clickRegenerateBtn();
	     email.clickPayslipEmailBtn();

		payroll.selectPayrollSummaryAndSend();
//		email.clickEmailLog();
//		email.clickRecievedPayroll();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
		verify.VerifyRecivedPayrollSummaryWithPassword9(data[6]);


         verify.assertAll();
	   
}	

	@Test(priority=2)

	public void validateRecievedEmployerEmailShouldBeProtected() throws Exception {

		sTestCaseID = "TC178";
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
		
	   
		payroll.runPayroll();
		payroll.selectType(data[8]);
		payroll.runPayroll2();
		payroll.selectPayrollSummaryAndSend();
		
		   
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
        verify.VerifyRecivedPayrollSummaryWithPassword10(data[9]);
	    ChangeWindow.Switchwindow(2, driver);

		//payroll.scrollClickPayrollDashboard();
		  
	    pages.reports report= new pages.reports(driver);
	    
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    
			    
	    email.clickEmailBtn();
	    email.clickSendBtn();
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();

	  		emaillog.clickEmailDropDown();
	  		emaillog.clickEmailLog();
	  	    emaillog.clickRecievedEmail();
        verify.VerifyRecivedPayrollSummaryWithPassword10(data[9]);
     
 		
        verify.assertAll();
	   
}

	
	@Test(priority=3)

	public void validateRecievedEmployeePayslipShouldBeUnprotected() throws Exception {

		sTestCaseID = "TC178";
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
	
		   
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
//		
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
     //   verify.VerifyRecivedPaySlipUnProtected3(data[10]);
        
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	//    payroll.scrollClickPayrollDashboard();

		pages.reports report = new pages.reports(driver);

		report.Click__Reports_();

		report.Click_Individual_Employee_Pay_Scheduleclick();

		email.clickEmailBtn();
		email.clickSendBtn();
//		email.closePopup();
//
//		email.clickEmailLog();
//		email.clickRecievedPayroll();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

		verify.VerifyRecivedPaySlipUnProtected3(data[10]);
	    ChangeWindow.Switchwindow(2, driver);

		
	   // payroll.scrollClickPayrollDashboard();
	    payroll.Click_PayrollDashboard();
	  
	    for(int i=0;i<=1;i++) {payroll.Undo_LastPayroll();}
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	   
	    company.clickPasswordNoEmployer();
	    company.Click_ClickSave();
	    company.PasswordNotEnabled();
	   
	    verify.assertAll();   
}

}
