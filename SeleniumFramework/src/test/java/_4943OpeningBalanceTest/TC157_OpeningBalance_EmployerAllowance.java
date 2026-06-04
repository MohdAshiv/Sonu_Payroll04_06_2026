package _4943OpeningBalanceTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC157_OpeningBalance_EmployerAllowance extends TestBase {
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validateOpeningBalance() throws Exception {

		sTestCaseID = "TC157";
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
	   
		pages.EmployeeEditAndRateChanges employee= new 	pages.EmployeeEditAndRateChanges(driver);
		employee.clickEmployeeName();
        pages.OpeningBalanceEntry openingBalance= new pages.OpeningBalanceEntry(driver);
		
		openingBalance.Click_gotoOpeningBalances();
	
		openingBalance.Enter_EnterGrosspay(data[5]);
		openingBalance.Enter_EnterEmployeeNI(data[6]);
		openingBalance.Enter_EnterNetPay(data[7]);
		openingBalance.Enter_EnterELtoPT(data[8]);
		
	
		openingBalance.Enter_TaxDeducted(data[9]);
		openingBalance.Enter_EmployerNI(data[10]);
		openingBalance.Enter_LEL(data[11]);
		openingBalance.Enter_PTtoUAP(data[12]);
		openingBalance.Click_clickSave();
	
        pages.PayrollRun payroll= new pages.PayrollRun(driver);
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
	
	    pages.ProcessPay processPay= new pages.ProcessPay(driver);

		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.enterBasicPay(data[13]);
		 processPay.clickSaveBtn();
		 payroll.Run_Payroll();
		 
		
        employee.clickEmployeeName();
	    
	    employee.selectTaxYear(data[14]);
	    openingBalance.Click_gotoOpeningBalances();

	    _4943OpeningBalancePage.VerifyData verify= new _4943OpeningBalancePage.VerifyData (driver);
		verify.verifyOpeningBalance(data[5], data[6], data[7], data[8], data[9], data[10], data[11], data[12]);
   	    utilities.TakeScreenshot.Getscreenshot("TC157_ Verify OpeningBalance ", "4943", driver);

		
		verify.assertAll();
		
	
	}
	
	@Test(priority = 2)

	public void validateTaxPayment() throws Exception {

		sTestCaseID = "TC157";
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
		
		pages.reports report= new pages.reports(driver);
		report.clickTaxPayment();
		pages.EmployeeEditAndRateChanges employee= new 	pages.EmployeeEditAndRateChanges(driver);

		employee.selectTaxYear(data[14]);
		
		
	    _4943OpeningBalancePage.VerifyData verify= new _4943OpeningBalancePage.VerifyData (driver);
	    
	    verify.verifyEmployerAllowances(data[15]);
   	    utilities.TakeScreenshot.Getscreenshot("TC157_ Verify EmployerAllowances ", "4943", driver);

        pages.PayrollRun payroll= new pages.PayrollRun(driver);
        
        payroll.Click_PayrollDashboard();
        
        
        for(int i=0;i<=1;i++) {payroll.Undo_LastPayroll();}

	    verify.assertAll();   
   
}

	
	
}
