package _1707_AutoRecurringAdditionDeductionTest;

import org.testng.annotations.Test;

import pages.EmployeePage;
import tests.TestBase;
import utilities.ExcelData;

public class TC118_RecurringAddition_OnlyTickPayeTax extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test
	public void validateTaxableNiableAndPensionable() throws Exception {

		sTestCaseID = "TC118";
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
		 recurring.clickdeductionTab();
		 processPay.selectCheckBx1();
		 processPay.clickDeletBtn();
		 processPay.clickSaveBtn();
		
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
		 processPay.onlyCheckPayeTax();
		 processPay.clickSaveBtn();
	     for(int i=0;i<=11;i++) { payroll.Run_Payroll();}
		 
		 _1707AutoRecurringAddition_Deduction.FillingManagement filling= new _1707AutoRecurringAddition_Deduction.FillingManagement(driver);

		 filling.Click_gotoFilingManagement();
		 filling.verifydata10Months(3, 12, data[12],data[13]);
		 
		 filling.selectPension(data[14]);
		 
		 filling.verifyPensionable(2, 11, data[13]);
		 payroll.scrollClickPayrollDashboard();
		 for(int i=0;i<=11;i++) { payroll.Undo_LastPayroll();}
		 filling.assertAll();
		
	
	
	}
}
