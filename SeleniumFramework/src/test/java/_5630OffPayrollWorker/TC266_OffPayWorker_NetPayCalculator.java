package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC266_OffPayWorker_NetPayCalculator extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerNetPayCalculator() throws Exception {

		sTestCaseID = "TC266";
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
	
	   
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.clickSaveBtn();
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);

		
		payroll.Click_PayrollDashboard();
		
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.clickNetPayCalculator();
		 processPay.enterNetPayInput(data[5]);
		 processPay.clickCalculatBtn();
		 processPay.clickSaveBtn();
		 verify.verifyNetPay(data[6]);
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 
		 processPay.enterBasicPay(data[7]);
		 processPay.clickSaveBtn();
		
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
	    edit.clickMandotoryPayroll();
		
		edit.clickNoOffPayWorker();
			
		edit.clickSaveBtn();		
	    verify.assertAll();

	}
}
