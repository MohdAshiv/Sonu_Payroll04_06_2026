package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC290_OffPayWorker_LeaveManagement extends TestBase{



	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateNormalEmployeeShouldAbletoTakeLeave() throws Exception {

		sTestCaseID = "TC290";
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
		

	    pages.LeaveManagement leave= new  pages.LeaveManagement(driver);
        leave.clickLeaveManagement();
        leave.clickAddLeave();
        leave.selectEmployee(data[5]);
        
        leave.selectLeaveType(data[6]);
        leave.clickSaveBtn();
        
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	    verify.verifyLeaveAddAlertMsg();
	    
	    leave.clickDeletIcn();
	    leave.clickDeletBtn();
	    
	    verify.assertAll();
}
	
	

	@Test(priority=2)

	public void validateNormalEmployeeShouldNotAbletoTakeLeave() throws Exception {

		sTestCaseID = "TC290";
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
		

	    pages.LeaveManagement leave= new  pages.LeaveManagement(driver);
        leave.clickLeaveManagement();
        leave.clickAddLeave();
        leave.selectEmployee(data[7]);
        
        leave.selectLeaveType(data[8]);
        
        
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	    verify.verifyAlertMsg();
	    
	    verify.assertAll();
}
	
	
}
