package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC195_PasswordProtection_NI_Tag extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validatePasswordShouldBeNiNumberOnEmailProcessPage() throws Exception {

		sTestCaseID = "TC195";
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
	    company.clickEnabledPassProtectionEmployee();
	    company.selectTagEmployee(data[5]);
	 
	  
	    company.clickCreateBtnEmployee();
	    
	    company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	   
   	    utilities.TakeScreenshot.Getscreenshot("TC195_ Verify Created Password ", "4942", driver);

	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[6]);
	   
	    payroll.scrollClickPayrollDashboard();
	    
	    payroll.runPayroll();
	    payroll.selectType(data[7]);
	    payroll.runPayroll2();
        payroll.selectPayrollSummaryAndSend();
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
	    verify.VerifyRecivedPayslipPasswordProtected18(data[8]);
	    
	    verify.assertAll();
}
	


	@Test(priority=2)

	public void TC02validateP60EmailPassword() throws Exception {

		sTestCaseID = "TC195";
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

	
	   for (int i=0;i<=10;i++) {payroll.Run_Payroll();}
	    
	    pages.reports report= new   pages.reports(driver);
	    
	    report.Click__Reports_();
	    report.Click_P45Forms();
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailType(data[9]);
	    email.clickCheckBoxAllP60();

	    email.clickEmailBtnP60();
	    email.clickSendBtnP60();
//	    email.closePopupP60();
//	    
//	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
 
	   verify.VerifyRecivedP60PasswordProtected8(data[11]);
	    ChangeWindow.Switchwindow(2, driver);

		payroll.scrollClickPayrollDashboard();
		report.Click__Reports_();
		report.Click_P45Forms();
		email.selectEmailType(data[10]);
	    email.clickCheckBoxAllP60();

		email.clickEmailBtnP60();
		email.clickSendBtnP60();
//		email.closePopupP60();
//		
//		   
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		verify.VerifyRecivedP60PasswordProtected8(data[11]);

	    verify.assertAll();
 
}
	
	@Test(priority=3)

	public void TC03validateEmployeeEmployerPasswordAcrossAllScreen() throws Exception {

		sTestCaseID = "TC195";
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
       
	    pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();
	    payroll.SelectTaxYear(data[13]);

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
 
	    email.selectEmailType(data[9]);
	    email.clickEmailBtn();
	    email.clickSendBtn();
//	    email.closePopup();
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);

	    verify.VerifyRecivedPayslipPasswordProtected18(data[8]);
	    ChangeWindow.Switchwindow(2, driver);

	  //  payroll.scrollClickPayrollDashboard();
	    
	    report.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();
	    payroll.SelectTaxYear(data[13]);

	    email.selectEmailType(data[10]);
	    email.clickEmailBtn();
	    email.clickSendBtn();
//	    email.closePopup();
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();	    
	    verify.VerifyRecivedPayslipPasswordProtected18(data[8]);
	    ChangeWindow.Switchwindow(2, driver);

	   // payroll.scrollClickPayrollDashboard();
		report.Click__Reports_();
		report.Click_Payslipsclick();
		
	    payroll.SelectTaxYear(data[13]);

	    email.selectEmailType(data[9]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtn();
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedPayslipPasswordProtected19(data[12]);	
	    ChangeWindow.Switchwindow(2, driver);

	   // payroll.scrollClickPayrollDashboard();
	    report.Click__Reports_();
		report.Click_Payslipsclick();
	    payroll.SelectTaxYear(data[13]);

		email.selectEmailType(data[10]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtnEmployee();
//	    email.closePopup();
//	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedPayslipPasswordProtected19(data[12]);
	    ChangeWindow.Switchwindow(2, driver);

	    
	  //  payroll.scrollClickPayrollDashboard();
	    
	    report.Click__Reports_();
	    
	    report.Click_Payroll_Summary();
	    payroll.SelectTaxYear(data[13]);

	    email.clickEmailBtn();
	    
	    email.clickSendBtn();
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedPayslipPasswordProtected19(data[12]);
	    ChangeWindow.Switchwindow(2, driver);

	  //  payroll.scrollClickPayrollDashboard();
	    payroll.Click_PayrollDashboard();
	    for (int i=0;i<=11;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();

		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
	    verify.assertAll();
	  
	}
	
	
}
