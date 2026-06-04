package EmailGDPR;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC353_EmailGDPR_RunPayroll  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	//TC01validateRecieivedIndividualPayslip
	public void TC01validateRecieivedIndividualPayslip() throws Exception {

		sTestCaseID = "TC353";
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

	//	agentpage.BrokenLink();
		//OpenClient.Click_ClickClientPayroll();		
		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
//		filling.Click_gotoFilingManagement();
//
////		filling.selectStatus(data[6]);
////		filling.clickCheckBox();
//		filling.clickSubmitHmrcBtn500Time();
	
        pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    
        payroll.UndoPayroll();
	    payroll.runPayroll();
	    payroll.selectType(data[5]);
	    payroll.runPayroll2();
	    payroll.sendEmailFromRunPayroll();
	    
        pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployeePayslip();
	    verify.assertAll();
	    
}
	
	@Test(priority=2)

	public void TC02validateRecieivedPayslipWithSummary() throws Exception {

		sTestCaseID = "TC353";
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
	    payroll.selectType(data[6]);
	    payroll.runPayroll2();
	    payroll.sendEmailFromRunPayroll();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithSummary();
	    verify.assertAll();
	    
}
	@Test(priority=3)

	public void TC03validateRecieivedPayslipWithoutSummary() throws Exception {

		sTestCaseID = "TC353";
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
	    payroll.selectType(data[6]);
	    payroll.runPayroll2();
	    payroll.uncheckPayrollSummaryAndSend();
	    
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithoutSummary();
	    verify.assertAll();
	    
}
	
	
	

	@Test(priority=4)

	public void TC04validateSendApproval_RecieivedPayslipWithSummary() throws Exception {

		sTestCaseID = "TC353";
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
	    payroll.selectType(data[6]);
	    payroll.clickSendApprovalBtn();

	    payroll.sendEmailFromRunPayroll();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithSummary();
	    verify.assertAll();
	    
}
	

	@Test(priority=5)

	public void TC05validateSendApproval_RecieivedPayslipWithotSummary() throws Exception {

		sTestCaseID = "TC353";
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
	    payroll.selectType(data[6]);
	    payroll.clickSendApprovalBtn();
	    payroll.uncheckPayrollSummaryAndSend();
	    
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithoutSummary();
	    verify.assertAll();
	    
}
	
	
	
	@Test(priority=6)

	//TC01validateRecieivedIndividualPayslip
	public void TC06validateNI() throws Exception {

		sTestCaseID = "TC353";
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
		//OpenClient.Enter_EnterClientName("JGYBCJXOr");
		OpenClient.Enter_EnterClientName(data[4]);

		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.FilingManagement filling = new pages.FilingManagement(driver);

	
        pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    
//        payroll.UndoPayroll();
//	    payroll.runPayroll();
//	    payroll.runPayroll2();

	    Thread.sleep(5000);
        pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	   
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyIncomeTax("Monthly");
	  //  verify.assertAll();
	    
}
	
}
