package EmailGDPR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC354_GDPR_PayslipEmail extends TestBase { 

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validateEmployeeRecieivedIndividualPayslip() throws Exception {

		sTestCaseID = "TC354";
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
        report.Click_Payslipsclick();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		

	    email.selectEmailType(data[5]);
	 
	    email.clickPayslipEmailBtn();

	    email.clickSendBtnEmployee();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyRecievedEmployeePayslip();
	    verify.assertAll();
	    
}
	
	


	@Test(priority=2)

	public void TC02validateEmployerRecieivedSummaryWithPayslip() throws Exception {

		sTestCaseID = "TC354";
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
        report.Click_Payslipsclick();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.selectEmailType(data[6]);
	 
	    email.clickPayslipEmailBtn();

	    email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithSummary();
	    verify.assertAll();
	    
}
	

	@Test(priority=3)

	public void TC03validateEmployerRecieivedPayslipWithoutSummary() throws Exception {

		sTestCaseID = "TC354";
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
        report.Click_Payslipsclick();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.selectEmailType(data[6]);
	 
	    email.clickPayslipEmailBtn();

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

	public void TC04validateBothRecieivedPayslipWithSummary() throws Exception {

		sTestCaseID = "TC354";
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
        report.Click_Payslipsclick();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.selectEmailType(data[7]);
	 
	    email.clickPayslipEmailBtn();
	    email.clickSendBtnEmployee();

	    email.clickSendBtn();
	    

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithSummary();
//	    emaillog.clickEmailDropDown1();
	//    emaillog.clickEmailLog();
//	    emaillog.clickEmailDropDown();
//	    emaillog.clickEmailLog();
	    
		WebElement backBtn = driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
		backBtn.click();
		utilities.ChangeWindow.Switchwindow(1, driver);

	    verify.verifyRecievedEmployeePayslip1();

	    verify.assertAll();
	    
}
	
	

	@Test(priority=5)

	public void TC05validateBothRecieivedPayslipWithoutSummary() throws Exception {

		sTestCaseID = "TC354";
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
        report.Click_Payslipsclick();
        
		pages.EmailSection email= new pages.EmailSection(driver);
		
	    email.selectEmailType(data[7]);
	 
	    email.clickPayslipEmailBtn();
	    email.clickSendBtnEmployee();

	    payroll.uncheckPayrollSummaryAndSend();
	    

	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    
	    verify.verifyPayslipWithoutSummary();
//	    emaillog.clickEmailDropDown1();
//	    emaillog.clickEmailLog();
	    
		WebElement backBtn = driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
		backBtn.click();
		utilities.ChangeWindow.Switchwindow(1, driver);

		// verify.verifyRecievedEmployeePayslip1();
	    
	    verify.verifyRecievedEmployeePayslip1();

	    verify.assertAll();
	    
}
	

}
