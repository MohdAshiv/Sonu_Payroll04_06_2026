package _5852_NoEmployerNIC;

import org.testng.annotations.Test;

import pages.EmployeePage;
import tests.TestBase;
import utilities.ExcelData;

public class TC311_NoEmployerNICLiablityWithAdditionAmount  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test
	public void validateOffPayWorkerRecurringAdditionDeduction() throws Exception {

		sTestCaseID = "TC311";
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
		edit.clickMandotoryPayroll();
		 edit.clickNoEmployerNIC();
		edit.enterNICategory(data[13]);
		edit.enterTaxCode(data[14]);

		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[15]);
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
		 
		 recurring.clickdeductionTab();
		 recurring.enterFromDateDeduction(data[6]);
		 recurring.enterToDateDeduction(data[7]);
		 recurring.enterAcountCodeDeduction(data[8]);
		 recurring.enterDescriptionDeduction(data[11]);
		 recurring.enterAmountDeduction(data[12]);
		 processPay.clickSaveBtn();
		 
		 processPay.clickEmployeeName();
		
	    _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);

		 verify.verifyERNI(data[16], data[17]);

		
		
		payroll.Click_PayrollDashboard();

		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 recurring.clickdeductionTab();
		 processPay.selectCheckBx1();
		 processPay.clickDeletBtn();
		 processPay.clickSaveBtn();
		
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();

		edit.clickNoEmployerNIC();
		
		edit.clickSaveBtn();
		
		verify.assertAll();
		
}
	
	
}
