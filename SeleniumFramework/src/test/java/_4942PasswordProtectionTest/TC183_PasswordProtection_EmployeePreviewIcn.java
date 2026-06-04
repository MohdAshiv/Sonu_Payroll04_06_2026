package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC183_PasswordProtection_EmployeePreviewIcn extends TestBase{


	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validatePreviewIcnAndCreatedPassword() throws Exception {

		sTestCaseID = "TC183";
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
	    company.enterInputTextPasswordEmployee(data[6]);
	    company.clickCreateBtnEmployee();
	    
	    company.Click_ClickSave();
	  
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);

	    verify.previewIcnAndChangePassWord();
	    company.clickIcnEmployee();
	    
	    verify.verifyEnterdPassword(data[6]);
	    utilities.TakeScreenshot.Getscreenshot("TC183_ verify EnterdPassword ", "4942", driver);

	    company.clickPasswordNoEmployee();
	    
	    company.Click_ClickSave();
	    verify.PasswordNotEnabledEmployee();
  
	    verify.assertAll();
	   
}
	
	
}
