package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC268_OffPayWorker_AOE extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayrollAOE() throws Exception {

		sTestCaseID = "TC268";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
       
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		
		pages.Addition_DeductionAOEPage aOE= new 	pages.Addition_DeductionAOEPage (driver);
		aOE.Click_click_three_dots();
		
		aOE.Click_clickAdditionDeductionAOE();
		aOE.Click_clickAOE();
		aOE.Click_clickAddMore();
		aOE.Select_AOEDropDownList(data[5]);
		aOE.Enter_DatetoApplyFrom(data[6]);
		aOE.Enter_MonthlyAmount(data[7]);
		aOE.Click_clickSave();
		//aOE.Click_closeButton();
		payroll.Click_PayrollDashboard();
		edit.clickEmployeeName();
		verify.verifyAoePayement(data[8]);
		payroll.Click_PayrollDashboard();
		
		aOE.Click_click_three_dots();

		aOE.Click_clickAdditionDeductionAOE();
		aOE.Click_clickAOE();
		aOE.Click_Check_toDeleteAOE();
		aOE.Click_DeleteBtnAOE();
		payroll.Click_PayrollDashboard();
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		verify.assertAll();

	}
	

	
}
