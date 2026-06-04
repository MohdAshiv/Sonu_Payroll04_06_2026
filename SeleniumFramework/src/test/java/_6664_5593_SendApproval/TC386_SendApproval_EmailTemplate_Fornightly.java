package _6664_5593_SendApproval;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC386_SendApproval_EmailTemplate_Fornightly extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateSendApprovalEmailBody() throws Exception {

		sTestCaseID = "TC386";
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
	    payroll.selectType(data[5]);
	    payroll.clickSendApprovalBtn();

	    payroll.sendEmailFromRunPayroll();
	  
	  
        pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);

	    verify.verifySendForApprovedEmail(data[6],data[7]);
	    verify.assertAll();
}
	
	
	@Test(priority=2)
	public void TC02validateSendApprovedRecievedInEmailBody() throws Exception {

		sTestCaseID = "TC386";
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
	    payroll.selectType(data[5]);
	    payroll.clickSendApprovalBtn();

	    payroll.sendEmailFromRunPayroll();
	  
	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickApprovePayroll();
	    employer.clickApprovBtn();
	    employer.clickSubmitBtn();
        pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);

	    verify.verifyApprovedEmail1(data[8],data[9],data[10]);
	    verify.assertAll();
}
	
	

	@Test(priority=3)

	public void TC03validateSendApprovalQueryRecievedInEmail() throws Exception {

		sTestCaseID = "TC386";
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
	  
	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickApprovePayroll();
	    employer.clickQueryBtn();
	    employer.enterQueryNote();
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);
	    
	    employer.clickSubmitQueryBtn();
	    employer.clickHistoryBtn();
        verify.getquery();

        
        pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
 
	    verify.verifyQueryEmailBody(data[11],data[12]);
	    verify.assertAll();
}	
	
	
}
