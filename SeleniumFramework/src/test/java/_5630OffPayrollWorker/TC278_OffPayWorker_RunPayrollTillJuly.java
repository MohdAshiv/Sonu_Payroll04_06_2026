package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC278_OffPayWorker_RunPayrollTillJuly extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerTaxPayment() throws Exception {

		sTestCaseID = "TC278";
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
//		edit.clickYesBtn();
		edit.enterTaxCode(data[5]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[6]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
	    pages.EditCompany company= new pages.EditCompany(driver);
	   
	    
	    
	    edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		
		edit.enterTaxCode(data[5]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary2(data[7]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		for (int i = 0; i <= 2; i++) {payroll.Run_Payroll();}

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
		company.clickEnabledEmployementAllownaces();

		company.Click_ClickSave();
		payroll.Click_PayrollDashboard();
		
		
		
		payroll.Run_Payroll();
	    pages.reports report= new pages.reports(driver);
	    report.clickTaxPayment();
	  
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyTaxPaymentReport(data[8],data[9],data[10],data[11]);
   	    utilities.TakeScreenshot.Getscreenshot("TC278_ validateOffPayWorkerTaxPayment ", "5630", driver);

		verify.assertAll();
}	
	
	
	
	@Test(priority=2)

	public void validateOffPayWorkerTaxPaymentCSv() throws Exception {

		sTestCaseID = "TC278";
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
	
	    pages.reports report= new pages.reports(driver);
	    report.clickTaxPayment();
	  
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickCsvIcn();
	    page.getData();
	    page.Dataverify();
	    page.deletCsv();
	    
		payroll.Click_PayrollDashboard();

		for (int i = 0; i <= 3; i++) {payroll.Undo_LastPayroll(); Thread.sleep(1000);}
        edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();

		payroll.Click_PayrollDashboard();
	    pages.EditCompany company= new pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();	
      	company.clickNoEmployementAllownaces();
      	company.Click_ClickSave();
      	payroll.Click_PayrollDashboard();

        edit.clickEmployeeName1();
 		edit.editEmployeeDetails();
 		edit.click_Paydetails();
 		edit.enterBasicSalary(data[12]);
 		edit.clickSaveBtn();

	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	   page.asertall();
}	
	

	
}


