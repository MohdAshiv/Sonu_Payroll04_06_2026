package _1707_AutoRecurringAdditionDeductionTest;

import org.testng.annotations.Test;

import pages.EmployeePage;
import tests.TestBase;
import utilities.ExcelData;

public class TC103_RecuringAddition_untickEmployerPension  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test
	public void validateRecurringAdditionUntickEmployerPension() throws Exception {

		sTestCaseID = "TC103";
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
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.Recurring recurring = new pages.Recurring(driver);
		pages.ProcessPay processPay  = new pages.ProcessPay (driver);
		pages.EmployeePage employee= new EmployeePage(driver);
		pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickPaydetails();
		edit.enterBasicSalary(data[11]);
		edit.clickSaveBtn();
		
		 pages.PayrollRun payroll= new  pages.PayrollRun(driver);
		 payroll.Click_PayrollDashboard();
	   
		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 recurring.enterFrequency(data[5]);
		 recurring.enterFromDate(data[6]);
		 recurring.Enter_toDate(data[7]);
		 recurring.enterAcountCode(data[8]);
		 recurring.enterdescription(data[9]);
		 recurring.enterAmount(data[10]);
		 recurring.applyOnBtn();
		 processPay.untickTaxEmployerPensionable();
		 processPay.clickSaveBtn();  
		 
		_1707AutoRecurringAddition_Deduction.VerifyData verify= new  _1707AutoRecurringAddition_Deduction.VerifyData(driver);
		 for(int i=0;i<=1;i++) { payroll.Run_Payroll();}
	
		 verify.payrollDashboard(data[12], data[13], data[14], data[15], data[16], data[17]);
		 utilities.TakeScreenshot.Getscreenshot("TC103_Verify payrollDashboardData June", "1707", driver);
		 for(int i=0;i<=2;i++) {
		 payroll.Run_Payroll();
		 }
		 verify.payrollDashboard(data[12], data[13], data[18], data[15], data[16], data[17]);
		 utilities.TakeScreenshot.Getscreenshot("TC103_Verify payrollDashboardData Sep", "1707", driver);

		 for(int i=0;i<=4;i++) { payroll.Undo_LastPayroll();}
		 
		 verify.assertAll();
	
}
}
