package EmailGDPR;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC360_GDPR_AssessEmployee extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateEmployeeRecieivedAutoEnrollement() throws Exception {

		sTestCaseID = "TC360";
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
        payroll.Click_PensionDashboard();
        
        EmailGDPR_Page.GDPR page =new EmailGDPR_Page.GDPR(driver);
        page.clickAssessEmployee();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
      //  email.clickEmployeeRadioBtn();  
        page.clickSelectChkBox();

	    email.selectEmailTypeAssessEmployeeContribution();

      //  email.clickSendEmailBtn();
        email.clickSendBtn();
	   
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
        verify.verifyRecievedAssessEmployee();
        verify.assertAll();
	    
}
	
	
	@Test(priority=2)

	public void TC02validateEmployerRecieivedAutoEnrollement() throws Exception {

		sTestCaseID = "TC360";
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
        payroll.Click_PensionDashboard();
        
        EmailGDPR_Page.GDPR page =new EmailGDPR_Page.GDPR(driver);
        page.clickAssessEmployee();
		pages.EmailSection email= new pages.EmailSection(driver);
		///email.selectEmailType1(data[7]);
	    page.clickSelectChkBox();

	    email.selectEmailTypeAssessEmployerContribution();
	     email.clickSendBtn();
		   
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
        verify.verifyRecievedAssessEmployer(data[5]);
        verify.assertAll();
}


	
}
