package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC286_OffPayWorker_OpeningBalanceDirector extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerPayslip() throws Exception {

		sTestCaseID = "TC286";
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
		
		
		edit.clickYesDirector();
		edit.enter_DirectorFromDate(data[5]);
		edit.select_NI_CalculationMethod(data[6]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[7]);
		
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.clickSaveBtn();
		
		edit.click_Paydetails();
		edit.enterBasicSalary2(data[8]);
		
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
	    pages.EditCompany company= new pages.EditCompany(driver);
	   
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
		company.clickEnabledEmployementAllownaces();

		company.Click_ClickSave();
		payroll.Click_PayrollDashboard();
		
		edit.clickEmployeeName();
        pages.OpeningBalanceEntry openingBalance= new pages.OpeningBalanceEntry(driver);
		
		openingBalance.Click_gotoOpeningBalances();
	
		openingBalance.Enter_EnterGrosspay(data[9]);
		openingBalance.Enter_EnterEmployeeNI(data[10]);
		openingBalance.Enter_EnterELtoPT(data[11]);
		
		openingBalance.Enter_TaxDeducted(data[12]);
		openingBalance.Enter_EmployerNI(data[13]);
		openingBalance.Enter_LEL(data[14]);
		openingBalance.Enter_PTtoUAP(data[15]);
		openingBalance.Click_clickSave();
	
		
		payroll.Click_PayrollDashboard();
		
		edit.clickEmployeeName1();
		
		openingBalance.Click_gotoOpeningBalances();
		
		openingBalance.Enter_EnterGrosspay(data[16]);
		openingBalance.Enter_EnterEmployeeNI(data[17]);
		openingBalance.Enter_EnterELtoPT(data[18]);
		
		openingBalance.Enter_TaxDeducted(data[19]);
		openingBalance.Enter_EmployerNI(data[20]);
		openingBalance.Enter_LEL(data[21]);
		openingBalance.Enter_PTtoUAP(data[22]);
		openingBalance.Click_clickSave();
	
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();

	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	     page.clickPayslipIcn();;
	  
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyPayslipData(data[23], data[24], data[25], data[26], data[27]);
		
		verify.assertAll();
   	
		
	}
	
	
	@Test(priority=2)

	public void validateOffPayWorkerTaxPayment() throws Exception {

		sTestCaseID = "TC286";
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
	    report.Click__Reports_();
	    report.clickTaxPayment();
	    
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		verify.verifyTaxPaymentReport(data[28], data[29], data[30] ,data[31]);
		
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		
	    pages.EditCompany company= new pages.EditCompany(driver);

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickNoEmployementAllownaces();
		company.Click_ClickSave();
		payroll.Click_PayrollDashboard();

		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[32]);
		edit.clickSaveBtn();
	    payroll.Click_PayrollDashboard();

		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoDirector();
		edit.clickSaveBtn();
		
		verify.assertAll();
   	
	}
}
