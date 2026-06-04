package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC165_PasswordProtection_PreviewIcon  extends TestBase{

	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateGeneratePassWordPage() throws Exception {

		sTestCaseID = "TC165";
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
	    
	  //  company.Click_clickPayrollDetails();
	     company.Click_ClickSave();
	 //   company.Click_clickPayrollSettings();
	  
	    
	    
	    _4942PasswordProtection_Page.VerifyResult verify= new _4942PasswordProtection_Page.VerifyResult(driver);
	      verify.previewIcnAndChangePassWord();
	      
	     company.clickIcn();
	     
	     verify.verifyEnterdPassword(data[5]);
	   	 utilities.TakeScreenshot.Getscreenshot("TC165_ verifyEnterdPassword ", "4942", driver);
	     
	 
	     verify.assertAll();
	   
}	
	
	
	
	
	
}
