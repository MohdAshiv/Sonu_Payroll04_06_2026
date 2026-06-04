package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC079_OpeningBalance extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateTaxNi_YTD() throws Exception {

		sTestCaseID = "TC079";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 _loginpage = new pages.loginpage4(driver);
		_loginpage.GoToUrl();
		_loginpage.AssertUrl();
		_loginpage.Enter_EnterUsername(data[1]);
		_loginpage.Enter_Enterpassword(data[2]);
		_loginpage.Click_LoginButton();

		pages.agentpage _agentpage = new pages.agentpage(driver);
		_agentpage.Enter_SearchAgentName(data[3]);
		_agentpage.Click_ClickSearch();
		_agentpage.Click_ClickAgent();

		pages.OpenClient _OpenClient = new pages.OpenClient(driver);
		_OpenClient.Click_ClientsClick();
		_OpenClient.Enter_EnterClientName(data[4]);
		_OpenClient.Click_ClickSearch();
		_OpenClient.Click_ClickClient();
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		
		processPay.clickEmployeeName();
		
		pages.OpeningBalanceEntry openingBalance= new pages.OpeningBalanceEntry(driver);
		
		openingBalance.Click_gotoOpeningBalances();
		
		openingBalance.Enter_EnterTaxCode(data[5]);
		openingBalance.Enter_EnterGrosspay(data[6]);
		openingBalance.Enter_EnterEmployeeNI(data[7]);
		openingBalance.Enter_EnterNetPay(data[8]);
		openingBalance.Enter_EnterELtoPT(data[9]);
		openingBalance.Enter_TaxDeducted(data[10]);
		
		openingBalance.Enter_EmployerNI(data[11]);
		openingBalance.Enter_LEL(data[12]);
		openingBalance.Enter_PTtoUAP(data[13]);
		openingBalance.Click_clickSave();
		
		_1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
		
		payroll.Click_PayrollDashboard();
		
        processPay.click3Dots();
        processPay.clickProcessPay();
        processPay.selectCheckBx();
        processPay.clickDeletBtn();
        processPay.clickAddMore();
        processPay.enterAccountCode(data[14]);
        processPay.enterDescription(data[15]);
        processPay.enterAmount(data[16]);
        processPay.clickApplyBtn();
        processPay.onlyCheckPayeTaxForProcessPay();
        processPay.clickSaveBtn();
        
        payroll.Run_Payroll();
        
        processPay.click3Dots();
        processPay.clickProcessPay();
        processPay.selectCheckBx();
        processPay.clickDeletBtn();
        processPay.clickAddMore();
        processPay.enterAccountCode(data[14]);
        processPay.enterDescription(data[15]);
        processPay.enterAmount(data[17]);
        processPay.clickApplyBtn();
       processPay.onlyCheckPayeTaxForProcessPay();
    
        processPay.clickSaveBtn();
        payroll.Run_Payroll();
        
        processPay.clickEmployeeName();
        processPay.clickEmployeeSalaryDetails2();
        _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
        
        
        verify.taxNIYTD1(data[18], data[19], data[20]);
       
      
	}
	
	

	@Test(priority = 2)

	public void validateP11() throws Exception {

		sTestCaseID = "TC079";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 _loginpage = new pages.loginpage4(driver);
		_loginpage.GoToUrl();
		_loginpage.AssertUrl();
		_loginpage.Enter_EnterUsername(data[1]);
		_loginpage.Enter_Enterpassword(data[2]);
		_loginpage.Click_LoginButton();

		pages.agentpage _agentpage = new pages.agentpage(driver);
		_agentpage.Enter_SearchAgentName(data[3]);
		_agentpage.Click_ClickSearch();
		_agentpage.Click_ClickAgent();

		pages.OpenClient _OpenClient = new pages.OpenClient(driver);
		_OpenClient.Click_ClientsClick();
		_OpenClient.Enter_EnterClientName(data[4]);
		_OpenClient.Click_ClickSearch();
		_OpenClient.Click_ClickClient();
		

		pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P11();
	    
	   _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
	   
	    verify.verifyP11(data[12], data[9], data[13], data[22], data[7]);
	    utilities.TakeScreenshot.Getscreenshot("TC079_Verify P11", "1566", driver);
}
	
	@Test(priority = 3)

	public void validateIEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC079";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 _loginpage = new pages.loginpage4(driver);
		_loginpage.GoToUrl();
		_loginpage.AssertUrl();
		_loginpage.Enter_EnterUsername(data[1]);
		_loginpage.Enter_Enterpassword(data[2]);
		_loginpage.Click_LoginButton();

		pages.agentpage _agentpage = new pages.agentpage(driver);
		_agentpage.Enter_SearchAgentName(data[3]);
		_agentpage.Click_ClickSearch();
		_agentpage.Click_ClickAgent();

		pages.OpenClient _OpenClient = new pages.OpenClient(driver);
		_OpenClient.Click_ClientsClick();
		_OpenClient.Enter_EnterClientName(data[4]);
		_OpenClient.Click_ClickSearch();
		_OpenClient.Click_ClickClient();
		

		pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();
	    
	   _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
	   
	    verify.individualEmployeePaySchedule(data[6], data[10], data[7], data[8],data[11]);
	    utilities.TakeScreenshot.Getscreenshot("TC079_Verify Individual Pay Schedule", "1566", driver);
}
	
	@Test(priority = 4)

	public void validatePayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC079";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 _loginpage = new pages.loginpage4(driver);
		_loginpage.GoToUrl();
		_loginpage.AssertUrl();
		_loginpage.Enter_EnterUsername(data[1]);
		_loginpage.Enter_Enterpassword(data[2]);
		_loginpage.Click_LoginButton();

		pages.agentpage _agentpage = new pages.agentpage(driver);
		_agentpage.Enter_SearchAgentName(data[3]);
		_agentpage.Click_ClickSearch();
		_agentpage.Click_ClickAgent();

		pages.OpenClient _OpenClient = new pages.OpenClient(driver);
		_OpenClient.Click_ClientsClick();
		_OpenClient.Enter_EnterClientName(data[4]);
		_OpenClient.Click_ClickSearch();
		_OpenClient.Click_ClickClient();
		

		pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Reporting_Period_Summary();
	    
	   _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
	    verify.payrollReportingPeriodSummary(data[6], data[10], data[7], data[8],data[11]);
	    utilities.TakeScreenshot.Getscreenshot("TC079_Verify PayrollReportingPeriodSummary", "1566", driver);
	    

	
}
	
	
    @Test (priority = 5)
	

	public void validatePayslip() throws Exception {

		sTestCaseID = "TC079";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 _loginpage = new pages.loginpage4(driver);
		_loginpage.GoToUrl();
		_loginpage.AssertUrl();
		_loginpage.Enter_EnterUsername(data[1]);
		_loginpage.Enter_Enterpassword(data[2]);
		_loginpage.Click_LoginButton();

		pages.agentpage _agentpage = new pages.agentpage(driver);
		_agentpage.Enter_SearchAgentName(data[3]);
		_agentpage.Click_ClickSearch();
		_agentpage.Click_ClickAgent();

		pages.OpenClient _OpenClient = new pages.OpenClient(driver);
		_OpenClient.Click_ClientsClick();
		_OpenClient.Enter_EnterClientName(data[4]);
		_OpenClient.Click_ClickSearch();
		_OpenClient.Click_ClickClient();
		
		pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    
	   _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
	    verify.payslip1( data[23],data[18],data[19],data[20]);
	  
	  
	
}

  @Test (priority = 6)


public void validateTaxPayment() throws Exception {

	sTestCaseID = "TC079";
	Sheet = "Sheet6";
	data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

	pages.loginpage4 _loginpage = new pages.loginpage4(driver);
	_loginpage.GoToUrl();
	_loginpage.AssertUrl();
	_loginpage.Enter_EnterUsername(data[1]);
	_loginpage.Enter_Enterpassword(data[2]);
	_loginpage.Click_LoginButton();

	pages.agentpage _agentpage = new pages.agentpage(driver);
	_agentpage.Enter_SearchAgentName(data[3]);
	_agentpage.Click_ClickSearch();
	_agentpage.Click_ClickAgent();

	pages.OpenClient _OpenClient = new pages.OpenClient(driver);
	_OpenClient.Click_ClientsClick();
	_OpenClient.Enter_EnterClientName(data[4]);
	_OpenClient.Click_ClickSearch();
	_OpenClient.Click_ClickClient();
	
   _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
    verify.taxPayement( data[7],data[11],data[10]);
    utilities.TakeScreenshot.Getscreenshot("TC079_Verify tax payment ", "1566", driver);
    
    _1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
    
    payroll.Click_PayrollDashboard();
	for(int i=1;i<=2;i++)
	{
		 payroll.Undo_LastPayroll();  
	}
}
	
}
