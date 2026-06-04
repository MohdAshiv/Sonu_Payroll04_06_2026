package _6664_5593_SendApproval;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC371_SendApproval_DisableEnable extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01ValidateSendApprovalDisableWith_DontSend() throws Exception {

		sTestCaseID = "TC371";
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
	    payroll.selectType(data[5]);
	    
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);
	    
	    verify.verifyDisableSendApproval();
	    verify.assertAll();
	}
	
	

	@Test(priority=2)

	public void TC02ValidateSendApprovalDisableWith_Employees() throws Exception {

		sTestCaseID = "TC371";
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
	    payroll.selectType(data[6]);
	    
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);
	    
	    verify.verifyDisableSendApproval();
	    verify.assertAll();
	}
	
	
	@Test(priority=3)

	public void TC03ValidateSendApprovalEnableWith_MainContact() throws Exception {

		sTestCaseID = "TC371";
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
	    payroll.selectType(data[7]);
	    
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);
	    
	    verify.verifyEnableSendApproval();
	    verify.assertAll();
	}
	
	@Test(priority=4)

	public void TC04ValidateSendApprovalAllowToOpenContactDetails() throws Exception {

		sTestCaseID = "TC371";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[8]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[14]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.runPayroll();
	    payroll.selectType(data[7]);
	    payroll.clickSendApprovalBtn();
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);
	    
	    verify.verifyContactDetail(data[9]);
	    verify.assertAll();
	}
	
	
	
	@Test(priority=5)

	public void TC05validateSendApprovalPeriodEnd() throws Exception {

		sTestCaseID = "TC371";
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
	    payroll.runPayroll();
	    payroll.selectType(data[7]);
	    payroll.clickSendApprovalBtn();

	    payroll.sendEmailFromRunPayroll();
	  
	  
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);

	    verify.verifyPeriodEnd(data[11]);
	    verify.assertAll();
}

}
