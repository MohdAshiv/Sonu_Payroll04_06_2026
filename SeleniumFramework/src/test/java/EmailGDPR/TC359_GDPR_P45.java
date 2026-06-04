package EmailGDPR;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC359_GDPR_P45 extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateEmployeeRecieivedIndividualP45D() throws Exception {

		sTestCaseID = "TC359";
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
        for(int i=0;i<=2;i++) {payroll.Run_Payroll();}

        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.selectForm(data[5]);
	    email.clickP45CheckBox();

	    email.selectEmailType(data[6]);

	    email.clickEmailBtnP45();
		email.clickSendBtn();

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
        //verify.verifyRecievedP45();
        verify.verifyRecievedP45AfterDownload();
        verify.assertAll();
	    
}
	
	
	@Test(priority=2)

	public void TC02validateEmployerRecieivedIndividualP45D() throws Exception {

		sTestCaseID = "TC359";
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

        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.selectForm(data[5]);
	    email.clickP45CheckBox();

	    email.selectEmailType(data[7]);

	    email.clickEmailBtnP45();
		email.clickSendBtn();

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
        verify.verifyP45forEmployer();
        utilities.ChangeWindow.Switchwindow(2, driver);
        payroll.Click_PayrollDashboard();
        
       for(int i=0;i<=2;i++) {payroll.Undo_LastPayroll(); Thread.sleep(3000);}

        verify.assertAll();
	    
}
	
}
