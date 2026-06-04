package _1707_AutoRecurringAdditionDeductionTest;

import org.testng.annotations.Test;

import pages.EmployeePage;
import tests.TestBase;
import utilities.ExcelData;

public class TC111_RecurringDeduction_BeforeEmployeePension extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test
	public void validateTaxableNiablePension() throws Exception {

		sTestCaseID = "TC111";
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
		edit.enterBasicSalary(data[10]);
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
		 System.out.println("xyz");
		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 recurring.clickdeductionTab();
		 recurring.enterFromDateDeduction(data[5]);
		 recurring.enterToDateDeduction(data[6]);
		 recurring.enterAcountCodeDeduction(data[7]);
		 recurring.enterDescriptionDeduction(data[8]);
		 recurring.enterAmountDeduction(data[9]);
		 recurring.applyOnBtndeduction();
		 processPay.onlyTickEmployeePensionable1();
		 processPay.clickSaveBtn();
		
		 
	     for(int i=0;i<=3;i++) { payroll.Run_Payroll();}
	     _1707AutoRecurringAddition_Deduction.FillingManagement filling= new _1707AutoRecurringAddition_Deduction.FillingManagement(driver);

	     filling.Click_gotoFilingManagement();
	     filling.clickFPS();
	     filling.getXMLData();
         filling.verifyTaxablePayAndNiable(data[11], data[11]);
         payroll.scrollClickPayrollDashboard();
         _1707AutoRecurringAddition_Deduction.VerifyData  verify= new  _1707AutoRecurringAddition_Deduction.VerifyData(driver);
     
          verify.PensionAmount(data[12], data[13]);
         for(int i=0;i<=3;i++) { payroll.Undo_LastPayroll();}
         filling.assertAll();
}
}
