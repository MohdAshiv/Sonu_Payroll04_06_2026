package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC168_PasswordProtection_RemovedPassword  extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validatePasswordProtectionShouldBeDisableAfterRemovePassword() throws Exception {

		sTestCaseID = "TC168";
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
	    
	   // company.Click_clickPayrollDetails();
	    company.Click_ClickSave();
	  //  company.Click_clickPayrollSettings();
	    company.clickChangePassword();
	    
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	    
	    verify.verifyEnterdPassword2(data[5]);
	    
	    company.clearInputText();
	    company.clickCreateBtn();
	    company.Click_ClickSave();
	    verify.PasswordNotEnabled();
	    
	    
	   	utilities.TakeScreenshot.Getscreenshot("TC168_ Recieved PayslipUnprotected ", "4942", driver);


	   verify.assertAll();
	   
}
	
	
}
