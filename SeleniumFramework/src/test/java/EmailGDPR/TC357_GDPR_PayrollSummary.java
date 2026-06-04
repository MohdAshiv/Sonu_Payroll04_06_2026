package EmailGDPR;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC357_GDPR_PayrollSummary extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateEmployeeRecieivedIndividualPayslipWithSummary() throws Exception {

		sTestCaseID = "TC357";
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
        payroll.Run_Payroll();

        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payroll_Summary();
        
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.clickEmailBtn();
		email.clickSendBtn();

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithSummary1();
        
        verify.assertAll();
	    
}
	
	
	@Test(priority=2)

	public void TC02validateEmployeeRecieivedIndividualOnlyPayslip() throws Exception {

		sTestCaseID = "TC357";
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
        payroll.Run_Payroll();

        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payroll_Summary();
        
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.clickEmailBtn();
	    payroll.uncheckPayrollSummaryAndSend();
	

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithoutSummary1();
        
        verify.assertAll();
	    
}
	

	@Test(priority=3)

	public void TC03validateEmployeeRecieivedOnlySummary() throws Exception {

		sTestCaseID = "TC357";
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
        payroll.Run_Payroll();

        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payroll_Summary();
        
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.clickEmailBtn();
	    payroll.uncheckPayslipAndSend();

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifySummaryWithoutPayslip1();
        
        verify.assertAll();
	    
}
	
	
}
