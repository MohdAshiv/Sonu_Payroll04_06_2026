package EmployerAndEmployeePassword;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC05_PayeRefreneAndPostCode extends TestBase  {
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01_validateToMainFromRunPayroll() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayrollTillLast();
		    
		
		pages.EditCompany company= new pages.EditCompany(driver);
		payroll.Click_PayrollDashboard();

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickChangePasswordEmployer();																																														
	    company.selectTag("PAYE Reference Number");
		
	    company.clickCreateBtn();//save btn
	    
	    company.clickChangePasswordEmployee();	
	    company.selectTagEmployee("Post code");
	    company.clickCreateBtnEmployee();//save btn

	    
	    company.clickChangePasswordEmployer();																																														
	    
	    PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	    
	    verify.verifyLastActivityLogField("PAYE Reference Number");
	    company.clickChangePasswordEmployee();	
	    verify.verifyLastActivityLogField("Post code");

	    payroll.Click_PayrollDashboard();
	    payroll.UndoPayroll();
	    
	    payroll.runPayroll();

	    payroll.selectType(data[15]);
	    payroll.runPayroll2();
	    payroll.sendEmailFromRunPayroll();

	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	 	
	   emaillog.clickEmailDropDown();
	   emaillog.clickEmailLog();
	   emaillog.clickRecievedEmail();
   
     verify.verifyPDFPasswordProtection("Employer's Summary",data[25]);
     verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
     verify.verifyPDFPasswordProtection("Payslips_",data[25]);

	}

	

	@Test(priority=2)
	public void TC02_validateToEmployeesRunPayroll() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
	    pages.PayrollRun payroll= new pages.PayrollRun (driver);	   
	    payroll.UndoPayroll();
	    
	    payroll.runPayroll();

	    payroll.selectType(data[16]);
	    payroll.runPayroll2();
	    payroll.sendEmailFromRunPayroll();

	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	 	
	   emaillog.clickEmailDropDown();
	   emaillog.clickEmailLog();
	   emaillog.clickRecievedEmail();
	  PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

     verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);

	}
	
	

	@Test(priority=3)
	public void TC03_validateToBothRunPayroll() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		   
		payroll.runPayroll();

	    payroll.selectType(data[17]);

		payroll.runPayroll2();
		payroll.sendEmailFromRunPayroll1();
		   
		Thread.sleep(5000);//wait for a second to open a new PopUp
		 payroll.sendEmailFromRunPayroll();
		   
		 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
	 PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("Employer's Summary",data[25]);
	   verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
	   verify.verifyPDFPasswordProtection("Payslips_",data[25]);
	   
	   emaillog.clickEmailDropDown1();
	   emaillog.clickEmailLog();
	   emaillog.clickRecievedEmail2();
	   verify.verifyPDFPasswordProtection("Employee Payslip","testing");

	}
	
	

	@Test(priority=4)
	public void TC04_payslipReport_Eployer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_Payslipsclick();
		
	    payroll.SelectTaxYear(data[18]);

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.selectEmailType(data[19]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtn();
	
	 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	 PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("Employer's Summary",data[25]);
	   verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
	 
	}
	
	

	@Test(priority=5)
	public void TC05_payslipReport_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_Payslipsclick();
		
	    payroll.SelectTaxYear(data[18]);

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.selectEmailType(data[20]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtnEmployee();
	
	 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	 PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

     verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
	 
	}
	

	@Test(priority=6)
	public void TC06_payslipReport_Both() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_Payslipsclick();
		
	    payroll.SelectTaxYear(data[18]);

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.selectEmailType(data[21]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtnEmployee();
	    
		Thread.sleep(5000);//wait for a second to open a new PopUp
	    email.clickSendBtn();

	 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	 PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("Employer's Summary",data[25]);
	   verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
	   
	   emaillog.clickEmailDropDown1();
	   emaillog.clickEmailLog();
	   emaillog.clickRecievedEmail2();
	   verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
	 
	}
	

	@Test(priority=7)
	public void TC07_pensionSummary_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_PensionSummary();
		

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.selectEmailType(data[19]);
	    email.clickEmailBtn();
	    email.clickSendBtn();
	
	 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	 PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("PensionSummaryReport",data[25]);
	 
	}
	
	
	

	@Test(priority=8)
	public void TC08_pensionSummary_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_PensionSummary();
		
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.selectEmailType(data[20]);
	    email.clickEmailBtn();
	    email.clickSendBtnEmployee();
	
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("PensionSummaryReport",data[26]);
	 
	}
		

	@Test(priority=9)
	public void TC09_departmentalAnalysisReport() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click__DepartmentalAnalyisis_();
		
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.clickDepartmentalEmailBtn();
	    email.clickDepartmentalSendBtn();
	
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("DepartmentalAnalysisReport",data[25]);
	 
	}

	
	@Test(priority=10)
	public void TC10_hoursSummaryReport() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.clickHoursSummary();
		
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.clickHoursSummaryEmailBtn();
	    email.clickHoursSummarySendBtn();
	
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("Hours Summary",data[25]);
	}
	
	@Test(priority=11)
	public void TC11_attachmentEarningReport() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.clickAttachmentEarning();
		
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.clickAttachmentEarningEmailBtn();
	    email.clickAttachmentEarningSendBtn();
	
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("AttachmentEarningReport",data[25]);
	}
	
	
	@Test(priority=12)
	public void TC12_payrollReportingPeriodSummaryReport() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_Payroll_Reporting_Period_Summary();
		
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.clickPayrollReportingPeriodSummaryEmailBtn();
	    email.clickPayrollReportingPeriodSummarySendBtn();
	
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("PayrollReportingPeriodSummary",data[25]);
	}
	
	
	@Test(priority=13)
	public void TC13_paymentSummaryReport() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.clickPaymentSummaryReport();
		
	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.clickPaymentSummaryEmailBtn();
	    email.clickPaymentSummarySendBtn();
	
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();
	    
	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("PaymentSummaryReport",data[25]);
	}
	
	

	@Test(priority=14)
	public void TC14_individualEmployeePaySchedule_Eployer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_Individual_Employee_Pay_Scheduleclick();
		
	    payroll.SelectTaxYear(data[18]);

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.selectEmailType(data[19]);
	    email.clickEmailBtn();
	    email.clickSendBtn();
	
	 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	 PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("Employee Payslip",data[25]);
	 
	}
	
	
	@Test(priority=15)
	public void TC15_individualEmployeePaySchedule_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.Click_Individual_Employee_Pay_Scheduleclick();
		
	    payroll.SelectTaxYear(data[18]);

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailType(data[20]);
	    email.clickEmailBtn();
	    email.clickSendBtn();
	
	 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	  PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
	 
	}
	
	@Test(priority=16)
	public void TC16_annualPayrollSchedule() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.clickAnnualPayrollSchedule();
		

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    email.clickAnnualPayScheduleEmailBtn();
	    email.clickSendBtn();
	
   	 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("Payroll-HMRC Payments",data[25]);
	   verify.verifyPDFPasswordProtection("Testing",data[25]);

	}
	
	
	@Test(priority=17)
	public void TC17_taxPaymentReeport() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		
	    report.clickTaxPayment();

	   _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    email.clickEmailTaxBtn();
	    email.clickTaxPaymentSendBtn();
	
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	   verify.verifyPDFPasswordProtection("TaxPaymentReconciliationReport",data[25]);

	}
	
	
	
	
	@Test(priority=18)
	public void TC18_p11DReport_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		report.Click_P45Forms();
	    report.Select_SelectP45Form("P11D");

	   _4942PasswordProtection_Page.EmailPage email= new _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailTypeForms(data[19]);
	    email.tickAllEmployeP11D();
	    email.clickEmailBtnP11D();
	    email.clickSendBtn();
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("P11D",data[25]);
	   verify.verifyPDFPasswordProtection("P11D(b)",data[25]);
	}
	
	
	@Test(priority=19)
	public void TC19_p11DReport_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		report.Click_P45Forms();
	    report.Select_SelectP45Form("P11D");

	   _4942PasswordProtection_Page.EmailPage email= new _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailTypeForms(data[20]);
	    email.tickAllEmployeP11D();
	    email.clickEmailBtnP11D();
	    email.clickSendBtn();
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("P11D",data[26]);

	}
	
	
	@Test(priority=20)
	public void TC20_assessEmployees_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.PensionSetup pension = new pages.PensionSetup(driver);
		pension.clickPensionDashBoard();
		EmailGDPR_Page.GDPR page =new EmailGDPR_Page.GDPR(driver);
	    page.clickAssessEmployee();
	    pages.EmailSection email= new pages.EmailSection(driver);
	    page.clickSelectChkBox();
	    email.selectEmailTypeAssessEmployeeContribution();
	    email.clickSendBtn();
		
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("AUTOENROLLED",data[26]);

	}
	

	@Test(priority=21)
	public void TC21_assessEmployees_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		pages.PensionSetup pension = new pages.PensionSetup(driver);
		pension.clickPensionDashBoard();
		EmailGDPR_Page.GDPR page =new EmailGDPR_Page.GDPR(driver);
	    page.clickAssessEmployee();
		pages.EmailSection email= new pages.EmailSection(driver);
		page.clickSelectChkBox();
		email.selectEmailTypeAssessEmployerContribution();
		email.clickSendBtn();
		
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("AUTOENROLLED",data[25]);

	}
	
	
	@Test(priority=22)
	public void TC22_sendForApprovalRunPayroll() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
																																															
	    PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	    
	    pages.PayrollRun payroll= new pages.PayrollRun (driver);
	    payroll.UndoPayroll();
	    payroll.runPayroll();
	    payroll.selectType(data[15]);
	    payroll.clickSendApprovalBtn();
	    payroll.sendEmailFromRunPayroll();

	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	 	
	   emaillog.clickEmailDropDown();
	   emaillog.clickEmailLog();
	   emaillog.clickRecievedEmail();
   
     verify.verifyPDFPasswordProtection("Employer's Summary",data[25]);
     verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);

	}
	

	@Test(priority=23)
	public void TC23_p60Report_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		
		for(int i=1;i<=12;i++) {payroll.Run_Payroll();Thread.sleep(3000);}
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		report.Click_P45Forms();
	    report.Select_SelectP45Form("P60");

	   _4942PasswordProtection_Page.EmailPage email= new _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailTypeForms(data[19]);
	    email.tickAllEmployeP60();
	    email.clickEmailBtnP60();
	    email.clickSendBtnP60();
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("P60",data[26]);
	}
	
	

	@Test(priority=24)
	public void TC24_p60Report_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		report.Click_P45Forms();
	    report.Select_SelectP45Form("P60");

	   _4942PasswordProtection_Page.EmailPage email= new _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailTypeForms(data[20]);
	    email.tickAllEmployeP60();
	    email.clickEmailBtnP60();
	    email.clickSendBtnP60();
	   pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("P60",data[26]);
	}
	
	
	@Test(priority=25)
	public void TC25_p45Report_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		OpenClient.Enter_EnterClientName(data[22]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();


		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickChangePasswordEmployer();																																														
	    company.selectTag("PAYE Reference Number");
		
	    company.clickCreateBtn();//save btn
	    
	    company.clickChangePasswordEmployee();	
	    company.selectTagEmployee("Post code");
	    company.clickCreateBtnEmployee();//save btn

	    company.clickChangePasswordEmployer();																																														
	    
	    PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	    
	    verify.verifyLastActivityLogField("PAYE Reference Number");
	    company.clickChangePasswordEmployee();	
	    verify.verifyLastActivityLogField("Post code");
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		report.Click_P45Forms();
	    report.Select_SelectP45Form("P45");

	   _4942PasswordProtection_Page.EmailPage email= new _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailTypeForms(data[19]);
	    email.tickAllEmployeP45();
	    email.clickEmailBtnP45();
	    email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   verify.verifyPDFPasswordProtection("P45",data[26]);
	}
	

	@Test(priority=26)
	public void TC26_p45Report_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
		OpenClient.Enter_EnterClientName(data[22]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.UndoPayroll();
		payroll.Run_Payroll();
		
		pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
		report.Click_P45Forms();
	    report.Select_SelectP45Form("P45");

	    _4942PasswordProtection_Page.EmailPage email= new _4942PasswordProtection_Page.EmailPage(driver);
	    email.selectEmailTypeForms(data[20]);
	    email.tickAllEmployeP45();
	    email.clickEmailBtnP45();
	    email.clickSendBtn();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
	    emaillog.clickEmailDropDown();
	    emaillog.clickEmailLog();
	    emaillog.clickRecievedEmail();

	   PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("P45",data[26]);
	}
	
	
	@Test(priority=27)
	public void TC27_payslipEmployerView_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

		pages.FilingManagement filling = new pages.FilingManagement(driver);
		
		filling.Click_gotoFilingManagement();
		
		filling.selectStatus(data[23]);
		filling.clickCheckBox();
		filling.enterNotes();
		filling.clickNottoSubmit();
			
		
	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickPayslip();
	    employer.selectEmailType(data[19]);
	    employer.clickPayslipEmailBtn();
	    employer.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

		verify.verifyPDFPasswordProtection("Employer's Summary",data[25]);
		verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
		 
	}
	
	@Test(priority=28)
	public void TC28_payslipEmployerView_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickPayslip();
	    employer.selectEmailType(data[20]);
	    employer.clickPayslipEmailBtn();
	    employer.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	     verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
		 
	}
	
	
	@Test(priority=29)
	public void TC29_hoursSummaryEmployerView() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickHoursSummary();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.clickHoursSummaryEmailBtn();
	    email.clickHoursSummarySendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);

	    verify.verifyPDFPasswordProtection("Hours Summary",data[25]);
		 
	}
	
	@Test(priority=30)
	public void TC30_taxPaymentmployerView() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickTaxPayment();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    employer.clickEmailTaxBtn();
	    employer.clickTaxPaymentSendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	  verify.verifyPDFPasswordProtection("TaxPaymentReconciliationReport",data[25]);
		 
	}
	

	@Test(priority=31)
	public void TC31_iEPSEmployerView_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickIndividalEmployeePaySchedule();
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    employer.selectEmailType(data[19]);
	    email.clickEmailBtn();
	    email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("Employee Payslip",data[25]); // here with employee on buisness  with employer
		 
	}
	
	

	@Test(priority=32)
	public void TC32_iEPSEmployerView_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickIndividalEmployeePaySchedule();
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    employer.selectEmailType(data[20]);
	    email.clickEmailBtn();
	    email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
		verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
		 
	}
	
	@Test(priority=33)
	public void TC33_P60EmployerView_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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
			

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    
	    employer.selecteForms("P60");

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    employer.selectEmailType(data[19]);
	    email.tickAllEmployeP60();
	    employer.clickEmailBtnP60();
	    email.clickSendBtnP60();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
		verify.verifyPDFPasswordProtection("P60",data[26]); // here with employee on buisness  with employer
		 
	}
	
	
	
	@Test(priority=34)
	public void TC34_P60EmployerView_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    
	    employer.selecteForms("P60");

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    employer.selectEmailType(data[20]);
	    email.tickAllEmployeP60();
	    employer.clickEmailBtnP60();
	    email.clickSendBtnP60();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
		verify.verifyPDFPasswordProtection("P60",data[26]);
		 
	}
	
	

	@Test(priority=35)
	public void TC35_P11DEmployerView_Employer() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    employer.selecteForms("P11D");
	    employer.selectTaxYear(data[18]);

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    employer.selectEmailType(data[19]);
	    email.tickAllEmployeP11D();
	    email.clickEmailBtnP11D();
	    email.clickSendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	    verify.verifyPDFPasswordProtection("P11D",data[25]);  // here with employee on buisness  with employer
		verify.verifyPDFPasswordProtection("P11D(b)",data[25]);		 
	}

	
	@Test(priority=36)
	public void TC36_P11DEmployerView_Employee() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    employer.selecteForms("P11D");
	    employer.selectTaxYear(data[18]);

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    employer.selectEmailType(data[20]);
	    email.tickAllEmployeP11D();
	    email.clickEmailBtnP11D();
	    email.clickSendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	 verify.verifyPDFPasswordProtection("P11D",data[26]);
	}
	
	
	@Test(priority=37)
	public void TC37_iEPSEmployerView_EmployeeDashboard() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickEmployee();
	    employer.Click__Reports_();
	    employer.clickIndividalEmployeePaySchedule();
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

	    email.clickEmailBtn();
	    email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
		verify.verifyPDFPasswordProtection("Employee Payslip",data[26]);
		 
	}	

	@Test(priority=38)
	public void TC38_P60EmployerView_EmployeeDashboard() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickEmployee();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
		pages.reports report= new   pages.reports(driver);
		 employer.selecteForms("P60");

		_4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
		 employer.clickEmailBtnP60();
		 email.clickSendBtnP60();
		 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
					
		  emaillog.clickEmailDropDown();
		  emaillog.clickEmailLog();
		  emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
		verify.verifyPDFPasswordProtection("P60",data[26]);  
	}
	

	@Test(priority=39)
	public void TC39_P11DEmployerView_EmployeeDashboard() throws Exception {

		sTestCaseID = "TC005";
		Sheet = "Password";
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


	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickEmployee();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    employer.selecteForms("P11D");
	    employer.selectTaxYear(data[18]);

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    email.tickAllEmployeP11D();
	    email.clickEmailBtnP11D();
	    email.clickSendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	    verify.verifyPDFPasswordProtection("P11D",data[26]);
	}
	

	@Test(priority=40)
	public void TC40_P45EmployerView_Employer() throws Exception {
		sTestCaseID = "TC005";
		Sheet = "Password";
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
		OpenClient.Enter_EnterClientName(data[22]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.FilingManagement filling = new pages.FilingManagement(driver);
//		filling.Click_gotoFilingManagement();
//		filling.selectStatus(data[23]);
//		filling.clickCheckBox();
//		filling.enterNotes();
//		filling.clickNottoSubmit();

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    employer.selecteForms("P45");
	    employer.selectTaxYear(data[18]);

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    employer.selectEmailType(data[19]);
	    email.tickAllEmployeP45();
	    email.clickEmailBtnP45();
	    email.clickSendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	  verify.verifyPDFPasswordProtection("P45",data[26]);

	}
	
	
	

	@Test(priority=41)
	public void TC41_P45EmployerView_Employee() throws Exception {
		sTestCaseID = "TC005";
		Sheet = "Password";
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
		OpenClient.Enter_EnterClientName(data[22]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    employer.selecteForms("P45");
	    employer.selectTaxYear(data[18]);

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    employer.selectEmailType(data[20]);
	    email.tickAllEmployeP45();
	    email.clickEmailBtnP45();
	    email.clickSendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("P45",data[26]);

	}
	
	@Test(priority=42)
	public void TC42_P45EmployerView_EmployeeDashboard() throws Exception {
		sTestCaseID = "TC005";
		Sheet = "Password";
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
		OpenClient.Enter_EnterClientName(data[22]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

	    pages.EmployerView employer= new pages.EmployerView(driver);
	    employer.Click_EmployerView();
	    employer.clickEmployee();
	    employer.Click__Reports_();
	    employer.clickP45P60p45Forms();
	    employer.selecteForms("P45");

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    email.clickEmailBtnP45();
	    email.clickSendBtn();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
				
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		utilities.ChangeWindow.tabswitch(driver);
		PasswordPage.VerifyPage verify= new PasswordPage.VerifyPage (driver);
	   verify.verifyPDFPasswordProtection("P45",data[26]);

	}


}
