package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC201_PasswordProtection_FirstNameEmployeeEmployer extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validatePasswordEmployeeEmployer() throws Exception {

		sTestCaseID = "TC201";
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
	   
	    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[6]);
	   
	    company.clickEnabledPassProtectionEmployer();
	    company.enterInputTextPassword(data[9]);
	    company.clickCreateBtn();
	    company.Click_ClickSave();
	    
	    
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

	    verify.VerifyRecivedPayslipPasswordProtected29(data[8]);
	    verify.VerifyRecievedPayrollSummary1(data[10]);
	    ChangeWindow.Switchwindow(2, driver);

	  //  payroll.scrollClickPayrollDashboard();
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
        company.clickPasswordNoEmployer();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
	    verify.assertAll();
}
	
	
	@Test(priority=2)

	public void validatePrintPayslip() throws Exception {

		sTestCaseID = "TC201";
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
	   
	    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[6]);
	   
	    company.clickEnabledPassProtectionEmployer();
	    company.enterInputTextPassword(data[9]);
	    company.clickCreateBtn();
	    company.Click_ClickSave();
	    
	    
	    payroll.scrollClickPayrollDashboard();
	   
	    payroll.Run_Payroll();

	    pages.reports report = new pages.reports(driver);

	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	 
	     _5530FileNamePage.VerifyFileNmae verify1= new _5530FileNamePage.VerifyFileNmae(driver);
	        
	     verify.verifyPrintPayslip();
	     verify1.verifyDownloadFileName(data[11]);
	     verify1.asserAll();
	    
	    utilities.ChangeWindow.Switchwindow(2, driver);
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

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


