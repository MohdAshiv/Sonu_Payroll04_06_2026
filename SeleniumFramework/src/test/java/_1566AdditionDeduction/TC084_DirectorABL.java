package _1566AdditionDeduction;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC084_DirectorABL   extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateNetTaxNiGross_YTD() throws Exception {

		sTestCaseID = "TC084";
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

		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 
		 processPay.enterBasicPay(data[5]);
		 processPay.clickSaveBtn();
		 payroll.Run_Payroll();
		 for(int i=1;i<=9;i++)
		 {
			 processPay.click3Dots();
			 processPay.clickProcessPay();
			 
			 processPay.enterBasicPay(data[6]);
			 processPay.clickSaveBtn();
			 payroll.Run_Payroll();
		 }
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.enterBasicPay(data[6]);
		 processPay.clickSaveBtn();
		
		 
		processPay.clickEmployeeName();
		processPay.clickEmployeeSalaryDetails2();
            
       _1566AdditionDeductionPage.VerifyExpectedResult verify= new  _1566AdditionDeductionPage.VerifyExpectedResult(driver);
		verify.netTaxNIGrossYTD1(data[7], data[8], data[9], data[10], data[11]);
		 
		 payroll.closePopup();
		 
		 payroll.scrollClickPayrollDashboard();
		 
		 
		 for(int i=1;i<=10;i++)
		 {
			payroll.Undo_LastPayroll();
		 }
		 verify.assertAll();
	}
	
	
}
