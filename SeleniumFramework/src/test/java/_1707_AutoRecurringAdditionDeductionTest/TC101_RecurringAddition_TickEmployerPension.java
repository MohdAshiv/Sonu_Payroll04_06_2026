package _1707_AutoRecurringAdditionDeductionTest;

import org.testng.annotations.Test;

import pages.EmployeePage;
import tests.TestBase;
import utilities.ExcelData;

public class TC101_RecurringAddition_TickEmployerPension extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test
	public void validateRecurringAdditionTickEmployerPension() throws Exception {

		sTestCaseID = "TC101";
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
		 processPay.onlyTickEmployerPensionable();
		 processPay.clickSaveBtn();  
		 
		_1707AutoRecurringAddition_Deduction.VerifyData verify= new  _1707AutoRecurringAddition_Deduction.VerifyData(driver);
		
		 verify.payrollDashboard(data[13], data[15], data[16], data[17], data[18], data[19]);
	     utilities.TakeScreenshot.Getscreenshot("TC101_Verify payrollDashboardData", "1707", driver);

	     for(int i=0;i<=11;i++) { payroll.Run_Payroll();}
		 pages.reports report= new  pages.reports(driver);
		 report.Click__Reports_();
		 report.Click_Individual_Employee_Pay_Scheduleclick();
		 
		 employee.Select_TaxYear(data[12]);
		
		 verify.employeePaySchedule(data[13], data[14]);
	     utilities.TakeScreenshot.Getscreenshot("TC101_Verify Employee PaySchedule", "1707", driver);

		 payroll.Click_PayrollDashboard();
		 
		 for(int i=0;i<=11;i++) { payroll.Undo_LastPayroll();}
		 verify.assertAll();
		
		 
}
	
}
