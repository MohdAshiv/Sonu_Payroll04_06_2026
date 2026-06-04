package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC197_PasswordProtection_JustZipFiles extends TestBase {
     
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	//@Test(priority=1)

	//Can not verify in Automation 
	public void validateRecievedEmailZipFilePasswordProtected() throws Exception {

		sTestCaseID = "TC197";
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
	    company.selectFileTypeViaEmail(data[12]);
	    company.clickEnabledPassProtectionEmployee();
	    
	    company.selectTagEmployee(data[5]);
	 
	  
	    company.clickCreateBtnEmployee();
	    
	    company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	    

	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[6]);
	   
	    payroll.scrollClickPayrollDashboard();
	    pages.reports report= new   pages.reports(driver);
	    
	    payroll.Run_Payroll();
	    report.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();
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

	    verify.VerifyRecivedZIPPayslipPasswordProtected();
	    ChangeWindow.Switchwindow(2, driver);

	   // payroll.scrollClickPayrollDashboard();
	    
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
		
	    verify.VerifyRecivedZIPPayslipPasswordProtected();
	    ChangeWindow.Switchwindow(2, driver);

	   // payroll.scrollClickPayrollDashboard();
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();
	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
        company.selectFileTypeViaEmail(data[11]);
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
		verify.assertAll();

	
}
	
	
}
