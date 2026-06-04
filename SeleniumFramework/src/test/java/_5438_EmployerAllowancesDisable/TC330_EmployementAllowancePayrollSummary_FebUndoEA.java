package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC330_EmployementAllowancePayrollSummary_FebUndoEA extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC330";
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

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        pages.EditCompany company= new pages.EditCompany(driver);
	    
	    edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesDirector();
		edit.enter_DirectorFromDate(data[5]);
		edit.select_NI_CalculationMethod(data[6]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[7]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		edit.clickEmployeeName();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		edit.enterBasicSalary(data[8]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
		company.clickEnabledEmployementAllownaces();
		payroll.Click_PayrollDashboard();
	
	    for(int i=0;i<=10;i++) {payroll.Run_Payroll(); }
	   
        company.Click_gotoEditCompany();
		
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickNoEmployementAllownaces();
		
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Run_Payroll();
	  
	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	    
	    payroll.SelectTaxYear(data[25]);
	   
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowance( data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],data[19],data[20],data[21]);
	    
	  
        verify.assertAll();
}	
	
	@Test(priority=2)
	
	
	public void TC02validateEmployementAllowancePayrollSummaryEmail() throws Exception {

		sTestCaseID = "TC330";
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

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        pages.EditCompany company= new pages.EditCompany(driver);
	    
	    pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    payroll.SelectTaxYear(data[25]);

		_5438_EmployerAllowancesDisable_Page.VerifyData verify = new _5438_EmployerAllowancesDisable_Page.VerifyData(driver);

		pages.EmailSection page = new pages.EmailSection(driver);
        verify.verifyPayrollSummary(data[20], data[22]);

		page.clickEmailBtn();
		page.clickSendBtn();

		pages.AgentLevelEmailLog email = new pages.AgentLevelEmailLog(driver);

        email.clickEmailDropDown();
        email.clickEmailLog();
        email.clickRecievedEmail();
        
        verify.assertAll();
	
	}
		
	@Test(priority=3)

	public void TC03validateEmployementAllowancePayrollSummary() throws Exception {

		sTestCaseID = "TC330";
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

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        pages.EditCompany company= new pages.EditCompany(driver);
	    
	    pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    payroll.SelectTaxYear(data[25]);

        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
        verify.verifyPayrollSummary(data[20],data[22]);	   
         payroll.Click_PayrollDashboard();
	    
	    for(int i=0;i<=11;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
	   
	    edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoDirector();
		edit.clickSaveBtn();
        verify.assertAll();
	
	}
		
	
}
