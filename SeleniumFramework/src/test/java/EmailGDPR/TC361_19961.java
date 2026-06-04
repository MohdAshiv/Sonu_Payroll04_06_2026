package EmailGDPR;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC361_19961 extends TestBase {
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test
	public void TC01validateEmailToEmployer() throws Exception {

		sTestCaseID = "TC354";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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
		OpenClient.Enter_EnterClientName("BroweserTab");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payslipsclick();

		pages.EmailSection email = new pages.EmailSection(driver);
	    email.selectEmailType(data[6]);

		email.clickPayslipCheckBoxCheckBox();
		email.selectFirstEmployee();
	    email.clickPayslipEmailBtn();
	    
		utilities.ChangeWindow.Switchwindow(1, driver);
		OpenClient.Click_ClickClient();
		
		report.Click__Reports_();
		report.Click_Payslipsclick();
	    email.selectEmailType(data[6]);

		email.clickPayslipCheckBoxCheckBox();
		email.selectSecondEmployee();
	    email.clickPayslipEmailBtn();

		utilities.ChangeWindow.Switchwindow(2, driver);
	    email.clickSendBtn();
	    
	    utilities.ChangeWindow.Switchwindow(3, driver);
	    email.clickSendBtn();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;
	    utilities.ChangeWindow.Switchwindow(4, driver);

	    verify.verifyPayslipWithSummaryOneEmployee();
	    emaillog.clickBackBtn();
	    utilities.ChangeWindow.Switchwindow(1, driver);
	    emaillog.clickRecievedEmail2();
	    verify.verifyPayslipWithSummaryOneEmployee();
	    verify.assertAll();

	}

	
	@Test
	public void TC02validateEmailToEmployee() throws Exception {

		sTestCaseID = "TC354";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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
		OpenClient.Enter_EnterClientName("BroweserTab");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payslipsclick();
		
		pages.EmailSection email = new pages.EmailSection(driver);
	    email.selectEmailType(data[5]);
		email.clickPayslipCheckBoxCheckBox();
		email.selectFirstEmployee();
	    email.clickPayslipEmailBtn();
	    
		utilities.ChangeWindow.Switchwindow(1, driver);
		OpenClient.Click_ClickClient();
		report.Click__Reports_();
		report.Click_Payslipsclick();
	    email.selectEmailType(data[5]);

		email.clickPayslipCheckBoxCheckBox();
		email.selectSecondEmployee();
	    email.clickPayslipEmailBtn();

		utilities.ChangeWindow.Switchwindow(2, driver);
	    email.clickSendBtnEmployee();
	    
	    utilities.ChangeWindow.Switchwindow(3, driver);
	    email.clickSendBtnEmployee();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;	   // utilities.ChangeWindow.Switchwindow(4, driver);

	    verify.verifyRecievedEmployeePayslipOne();
	    verify.assertAll();
	}
	

	@Test(priority=3)
	public void TC03validateEmailToEmployeeEmployerView() throws Exception {

		sTestCaseID = "TC354";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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
		OpenClient.Enter_EnterClientName("BroweserTab");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.UndoPayroll();
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus("Pending");
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		employerView.clickPayslip();
		pages.EmailSection email = new pages.EmailSection(driver);
	    email.selectEmailType(data[5]);
		email.clickPayslipCheckBoxCheckBox();
		email.selectFirstEmployee();
	    email.clickEmployerPayslipEmailBtn();
	    
		utilities.ChangeWindow.Switchwindow(2, driver);

		employerView.Click_EmployerView();
		employerView.Click__Reports_();
		employerView.clickPayslip();
	    email.selectEmailType(data[5]);
		email.clickPayslipCheckBoxCheckBox();
		email.selectSecondEmployee();
	    email.clickEmployerPayslipEmailBtn();
		utilities.ChangeWindow.Switchwindow(3, driver);

	    email.clickSendBtnEmployeeOnEmployerView();
	    
	    utilities.ChangeWindow.Switchwindow(4, driver);
	    email.clickSendBtnEmployeeOnEmployerView();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    EmailGDPR_Page.VerifyData verify= new EmailGDPR_Page.VerifyData(driver) ;	   // utilities.ChangeWindow.Switchwindow(4, driver);

	    verify.verifyRecievedEmployeePayslipOneEmployerView();

	    verify.assertAll();

	}

}
