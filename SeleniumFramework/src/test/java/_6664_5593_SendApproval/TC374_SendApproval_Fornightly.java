package _6664_5593_SendApproval;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC374_SendApproval_Fornightly extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	@Test(priority=1)

	public void TC01validateSendApprovalRecievedInEmail() throws Exception {

		sTestCaseID = "TC374";
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

	    verify.verifyApprovedEmail(data[6],data[7],data[8]);
	    verify.assertAll();
}
	
	@Test(priority=2)

	public void TC02validateSendApprovalPayrollSummary() throws Exception {

		sTestCaseID = "TC374";
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
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);

	    verify.getSendApprovalSummary();
	    employer.clickApprovBtn();
	    employer.clickSubmitBtn();
	    
        utilities.ChangeWindow.Switchwindow(2, driver);

        payroll.Run_Payroll();
        
        pages.reports report = new   pages.reports(driver);

        report.Click__Reports_();
        report.Click_Payroll_Summary();
	    verify.verifyApproverdPayrollSummary();
	    verify.assertAll();
}
	
	
	
	@Test(priority=3)

	public void TC03validateSendApprovalQueryRecievedInEmail() throws Exception {

		sTestCaseID = "TC374";
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

	    verify.verifyQueryEmail();
	    verify.assertAll();
}
	
	
	@Test(priority=4)

	public void TC04validateSendApprovalQueryPopup() throws Exception {

		sTestCaseID = "TC374";
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
	  
	  
	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickApprovePayroll();
	    employer.clickQueryBtn();
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);
	    
	 
        verify.verifyCancelBtnQuery();

        
	    employer.clickQueryBtn();
        verify.verifyCloseBtnQuery();
	  
	    verify.assertAll();
}
	
	
	
	@Test(priority=5)

	public void TC05validateSendApprovalQueryEmployerNote() throws Exception {

		sTestCaseID = "TC374";
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
	  
	  
	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickApprovePayroll();
	    employer.clickQueryBtn();
	    employer.enterQueryNote();
	    _6664_PageClass.VerifySendApproval verify= new  _6664_PageClass.VerifySendApproval(driver);
	    
	    employer.clickSubmitQueryBtn();
	    employer.clickHistoryBtn();
        verify.getquery();

        utilities.ChangeWindow.Switchwindow(2, driver);
        pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	   
        payroll.Click_PayrollDashboard();
        //   verify.verifyAlertMsg();//  alert is removed from dashboard
        payroll.ClickEmployerNote();
	    verify.verifyQueryEmployerNote();
	    verify.assertAll();
}	
	
}
