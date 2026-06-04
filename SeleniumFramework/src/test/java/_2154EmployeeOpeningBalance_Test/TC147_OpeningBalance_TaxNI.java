package _2154EmployeeOpeningBalance_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC147_OpeningBalance_TaxNI extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateTaxNI_P11() throws Exception {

		sTestCaseID = "TC147";
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
		openingBalance.Enter_EnterEmployeeNI(data[7]);
		openingBalance.Enter_EnterNetPay(data[8]);
		openingBalance.Enter_EnterELtoPT(data[9]);
		openingBalance.Enter_TaxDeducted(data[10]);
		
		openingBalance.Enter_EmployerNI(data[11]);
		openingBalance.Enter_LEL(data[12]);
		openingBalance.Enter_PTtoUAP(data[13]);
		openingBalance.Click_clickSave();
		
		pages.PayrollRun payroll= new pages.PayrollRun(driver);
		
		payroll.Click_PayrollDashboard();
		

       pages.ProcessPay processPay= new pages.ProcessPay(driver);

		 int j=14;
		 for(int i=0;i<=6;i++){
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.enterBasicPay(data[j++]);
		 processPay.clickSaveBtn();
		 payroll.Run_Payroll();
		 
		 }
		 
        
         pages.reports report = new  pages.reports (driver);
         
         report.Click__Reports_();
         report.Click_P11();
  	    _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver);
        
  	     verify.P11(data[24], data[25], data[26], data[27], data[28]);
 	    utilities.TakeScreenshot.Getscreenshot("TC147_ Verify P11 ", "2154", driver);
         
 	     payroll.scrollClickPayrollDashboard();
  	     
		 employee.clickEmployeeName();
		 processPay.clickEmployeeSalaryDetails2();
		 
	   
	    verify.taxNIYTD(data[21], data[22], data[23]);
	    utilities.TakeScreenshot.Getscreenshot("TC147_ Verify Tax NI ", "2154", driver);

	    payroll.closePopup();
	    payroll.scrollClickPayrollDashboard();
	    
	    for(int i=0;i<=6;i++){payroll.Undo_LastPayroll();}

		 
		 verify.assertAll();
		
	}
	
}
