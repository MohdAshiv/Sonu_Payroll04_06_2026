package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC073_Addition_C56L extends TestBase{

public String sTestCaseID = null;
String[] data = null;
String Sheet = null;

@Test
public void validateTaxNiNet_YTD() throws Exception {

	sTestCaseID = "TC073";
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
	 employee.enterBasicSalary(data[10]);
	 employee.clickSaveBtn();
	 employee.clickMandotoryPayroll();
	 employee.enterTaxCode(data[11]);
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
	 processPay.onlyCheckPayeTax();
	 processPay.clickSaveBtn(); 
	 
	 _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
	 verify.getDataEmployee1();
	 
	 processPay.clickEmployeeName();
	
     verify.verifyPayrollPageEmployee1();

}
}