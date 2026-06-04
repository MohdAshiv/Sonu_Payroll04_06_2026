package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC076_AdditionDeduction_Fornightly_K9 extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test
	public void validateTaxNiGross_YTD() throws Exception {

		sTestCaseID = "TC076";
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
		
		_1566AdditionDeductionPage.Recurring recurring= new _1566AdditionDeductionPage.Recurring(driver);
		_1566AdditionDeductionPage.EmployeeEdit employee= new _1566AdditionDeductionPage.EmployeeEdit (driver);
		
	     _1566AdditionDeductionPage.PayrollRun payroll= new _1566AdditionDeductionPage.PayrollRun(driver);
	     employee.clickEmployeeName();
		 employee.editEmployeeDetails();
		 employee.clickPaydetails();
		 employee.enterBasicSalary(data[13]);
		 employee.clickSaveBtn();
		 employee.clickMandotoryPayroll();
		 employee.enterTaxCode(data[14]);
		 employee.clickSaveBtn();
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
		 recurring.enterFrequency(data[5]);
		 recurring.enterFromDate(data[6]);
		 recurring.enterAcountCode(data[7]);
		 recurring.enterdescription(data[8]);
		 recurring.enterAmount(data[9]);
		 recurring.applyOnBtn();
		 processPay.untickTaxAndNI();
		 
		 processPay.clickAddMore();
		 recurring.enterFrequency1(data[5]);
		 recurring.enterFromDate1(data[6]);
		 recurring.enterAcountCode1(data[7]);
		 recurring.enterDescription1(data[8]);
		 recurring.enterAmount1(data[10]);
		 recurring.applyOnBtn1();
		 processPay.untickAllOptions2();	
		 processPay.clickSaveBtn(); 
		
		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 recurring.clickdeductionTab();
		 processPay.selectCheckBx1();
		 processPay.clickDeletBtn();
		 recurring.clickAddMoreDeduction();
		 recurring.enterFromDateDeduction(data[6]);
		 recurring.enterAcountCodeDeduction(data[7]);
		 recurring.enterDescriptionDeduction(data[11]);
		 recurring.enterAmountDeduction(data[12]);
		 recurring.applyOnBtndeduction();
		 processPay.onlyNiableDeductions();
		 processPay.clickSaveBtn(); 
		 
		 processPay.clickEmployeeName();
		 processPay.clickEmployeeSalaryDetails2();
	    _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
		 
	     verify.taxNIYTD1(data[15],data[16],data[17]);
	     

	}
	
	
}
