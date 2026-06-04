package EmailGDPR;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC358_GDPR_IndividualEmployeePaySchedule  extends TestBase{
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateEmployeeRecieivedIndividualEmployeePayslip_SelectAll() throws Exception {

		sTestCaseID = "TC358";
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
    
        for(int i=0;i<=11;i++) {payroll.Run_Payroll();}
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
		email.selectEmailType(data[5]);
		for(int i=7;i<=26;i++)
		{
		email.selectEmployee(data[i]);
	    email.clickEmailBtn();
		email.clickSendBtn();

		}
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	   

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployeeIEPSPayslip(12);
        verify.assertAll();
	    
}
	
	

	@Test(priority=2)

	public void TC02validateEmployeeRecieivedIndividualEmployeePayslip_Select3Period() throws Exception {

		sTestCaseID = "TC358";
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
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        EmailGDPR_Page.GDPR page= new  EmailGDPR_Page.GDPR(driver);
		pages.EmailSection email= new pages.EmailSection(driver);
		
		email.selectEmailType(data[5]);
		for(int i=7;i<=26;i++)
		{
		email.selectEmployee(data[i]);
        page.select3Period();

	    email.clickEmailBtn();
		email.clickSendBtn();

		}
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	   

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployeeIEPSPayslip(3);
        verify.assertAll();
	    
}
	
	

	@Test(priority=3)

	public void TC03validateEmployeeRecieivedIndividualEmployeePayslip_Select2Period() throws Exception {

		sTestCaseID = "TC358";
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
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        EmailGDPR_Page.GDPR page= new  EmailGDPR_Page.GDPR(driver);
      
		pages.EmailSection email= new pages.EmailSection(driver);
		
		email.selectEmailType(data[5]);
		for(int i=7;i<=26;i++)
		{
		email.selectEmployee(data[i]);
	    page.select2Period();
	    email.clickEmailBtn();
		email.clickSendBtn();

		}
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	   

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployeeIEPSPayslip(2);
        verify.assertAll();
	    
}
	
	
	
	
	@Test(priority=4)

	public void TC04validateEmployerRecieivedIndividualEmployeePayslip_SelectAllPeriod() throws Exception {

		sTestCaseID = "TC358";
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
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        EmailGDPR_Page.GDPR page= new  EmailGDPR_Page.GDPR(driver);
      
		pages.EmailSection email= new pages.EmailSection(driver);
		
		email.selectEmailType(data[6]);
		for(int i=7;i<=26;i++)
		{
		email.selectEmployee(data[i]);
	  
	    email.clickEmailBtn();
		email.clickSendBtn();

		}
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	   

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployerIEPSPayslip(data[26],data[25],data[24],data[23],data[22],data[21],data[20],data[19],data[18],data[17],data[16],data[15],data[14],data[13],data[12],data[11],data[10],data[9],data[8],data[7],12);
        verify.assertAll();
	    
}
	
	
	

	@Test(priority=5)

	public void TC05validateEmployerRecieivedIndividualEmployeePayslip_Select3Period() throws Exception {

		sTestCaseID = "TC358";
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
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        EmailGDPR_Page.GDPR page= new  EmailGDPR_Page.GDPR(driver);
      
		pages.EmailSection email= new pages.EmailSection(driver);
		
		email.selectEmailType(data[6]);
		for(int i=7;i<=26;i++)
		{
		email.selectEmployee(data[i]);
	     page.select3Period();
	    email.clickEmailBtn();
		email.clickSendBtn();

		}
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	   

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployerIEPSPayslip(data[26],data[25],data[24],data[23],data[22],data[21],data[20],data[19],data[18],data[17],data[16],data[15],data[14],data[13],data[12],data[11],data[10],data[9],data[8],data[7],3);
        verify.assertAll();
	    
}
	
	
	
	@Test(priority=6)

	public void TC06validateEmployerRecieivedIndividualEmployeePayslip_Select2Period() throws Exception {

		sTestCaseID = "TC358";
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
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        EmailGDPR_Page.GDPR page= new  EmailGDPR_Page.GDPR(driver);
      
		pages.EmailSection email= new pages.EmailSection(driver);
		
		email.selectEmailType(data[6]);
		for(int i=7;i<=26;i++)
		{
			
		email.selectEmployee(data[i]);
	    page.select2Period();
	    email.clickEmailBtn();
		email.clickSendBtn();

		}
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	   

	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployerIEPSPayslip(data[26],data[25],data[24],data[23],data[22],data[21],data[20],data[19],data[18],data[17],data[16],data[15],data[14],data[13],data[12],data[11],data[10],data[9],data[8],data[7],2);
        utilities.ChangeWindow.Switchwindow(2, driver);
        payroll.Click_PayrollDashboard();
       for(int i=0;i<=11;i++ ) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}

        verify.assertAll();
	    
}
	
}
