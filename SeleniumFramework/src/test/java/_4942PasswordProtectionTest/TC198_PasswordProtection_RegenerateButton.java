package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC198_PasswordProtection_RegenerateButton extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validatePasswordShouldBeTaxCodeAndEmailProcessPage() throws Exception {

		sTestCaseID = "TC198";
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
	
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.clickMandotoryPayroll();
		employee.enterTaxCode("1257L");
		employee.clickSaveBtn();
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    
	    payroll.Click_PayrollDashboard();

	    for(int i=0;i<=3;i++) {payroll.Run_Payroll();}
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
	   
	 	verify.assertAll();
}
	


	@Test(priority=2)

	public void TC02validatePayrollSummary() throws Exception {

		sTestCaseID = "TC198";
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
	    report.Click_Payslipsclick();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
        email.clickRegenerateBtn();
        
	    report.Click__Reports_();
	    
	    report.Click_Payroll_Summary();
	    
	    email.clickEmailBtn();
	    
	    email.clickSendBtn();
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);

	    verify.VerifyRecivedPayslipPasswordProtected26(data[12]);
        
	    verify.assertAll();
 
}
	
	@Test(priority=3)

	public void TC03validateEmployeeEmployerPasswordAcrossAllScreen() throws Exception {

		sTestCaseID = "TC198";
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
	    report.Click_Payslipsclick();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectPeriodEndDate(data[13]);
	    email.clickRegenerateBtn();
	    
	    
	    report.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();
 
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

	    verify.VerifyRecivedPayslipPasswordProtected27(data[8]);
	    ChangeWindow.Switchwindow(2, driver);

	  //  payroll.scrollClickPayrollDashboard();
	    
	    report.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();
	    email.selectEmailType(data[10]);
	    email.clickEmailBtn();
	    email.clickSendBtn();
//	    email.closePopup();
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedPayslipPasswordProtected27(data[8]);
	    ChangeWindow.Switchwindow(2, driver);

	  //  payroll.scrollClickPayrollDashboard();
		report.Click__Reports_();
		report.Click_Payslipsclick();
		

	    email.selectEmailType(data[9]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtn();
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedPayslipPasswordProtected26(data[12]);
	    ChangeWindow.Switchwindow(2, driver);

	  //  payroll.scrollClickPayrollDashboard();
	    report.Click__Reports_();
		report.Click_Payslipsclick();
		
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
		
	    verify.VerifyRecivedPayslipPasswordProtected26(data[12]);
	    ChangeWindow.Switchwindow(2, driver);

	 //   payroll.scrollClickPayrollDashboard();
	    
	    payroll.Click_PayrollDashboard();
	    for (int i=0;i<=3;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
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
