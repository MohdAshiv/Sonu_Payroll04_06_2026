package _2154EmployeeOpeningBalance_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC152_OpeningBalanceTaxPayment  extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateTaxPayment() throws Exception {

		sTestCaseID = "TC152";
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
		openingBalance.Enter_EnterTaxCode(data[5]);
		openingBalance.Enter_EnterGrosspay(data[6]);
		openingBalance.Enter_EnterNetPay(data[7]);
		openingBalance.Enter_EnterELtoPT(data[8]);
		
		
		openingBalance.Enter_TaxDeducted(data[9]);
		
		openingBalance.Enter_EmployerNI(data[10]);
		openingBalance.Enter_LEL(data[11]);
		
		openingBalance.Click_clickSave();
		
		pages.PayrollRun payroll= new pages.PayrollRun(driver);
		
		payroll.Click_PayrollDashboard();
		
	    pages.ProcessPay processPay= new pages.ProcessPay(driver);

		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.enterBasicPay(data[16]);
		 processPay.clickSaveBtn();
		 payroll.Run_Payroll();
		
        pages.reports report = new  pages.reports (driver);
        report.clickTaxPayment();
  	   _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver);
  	   
  	     verify.taxPayement2(data[12], data[13], data[14], data[15]);
  	     utilities.TakeScreenshot.Getscreenshot("TC152_ Verify Tax Payement ", "2154", driver);
  	   
         payroll.Click_PayrollDashboard();
         
         payroll.Undo_LastPayroll();
         verify.assertAll();
	
	}
}
