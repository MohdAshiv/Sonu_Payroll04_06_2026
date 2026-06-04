package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC283_OffPayWorker_MulipleFrequency extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerTaxPayment() throws Exception {

		sTestCaseID = "TC283";
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
	
		for (int i = 0; i <= 3; i++) {	payroll.Run_Payroll();}
	    pages.EditCompany company= new pages.EditCompany(driver);
	  
	
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.enterTaxCode(data[5]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[7]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		for (int i = 0; i <= 57; i++) {	payroll.Run_Payroll();}

	    pages.reports report= new pages.reports(driver);
	    report.clickTaxPayment();
	  
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	   verify.verifyTaxPaymentReport2(data[8],data[9],data[10],data[11],data[12]);
   	 // utilities.TakeScreenshot.Getscreenshot("TC281_ validateOffPayWorkerTaxPayment ", "5630", driver);

		verify.assertAll();
}
	
	
	@Test(priority=2)

	public void validateP60EmployeeBOffPayWorker() throws Exception {

		sTestCaseID = "TC283";
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
	
	    pages.EditCompany company= new pages.EditCompany(driver);
	  
	
	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickP60PdfIcn();
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		verify.verifyP60OffPayWorkerEmployee( data[13], data[14], data[15],data[16],data[17],data[18],data[19]);
       verify.assertAll();
	}

	
	
	@Test(priority=3)

	public void validateP60EmployeeAOffPayWorker() throws Exception {

		sTestCaseID = "TC283";
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
	
	    pages.EditCompany company= new pages.EditCompany(driver);
	  
	
	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickP60PdfIcn2();
	   _5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		verify.verifyP60OffPayWorkerEmployee( data[20], data[21], data[22],data[23],data[24],data[25],data[26]);
		
	    utilities.ChangeWindow.Switchwindow(2, driver);
        
        payroll.Click_PayrollDashboard();
      	for (int i = 0; i <= 57; i++) {	payroll.Undo_LastPayroll(); Thread.sleep(1000);}
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
      	for (int i = 0; i <= 3; i++) {	payroll.Undo_LastPayroll(); Thread.sleep(1000);}
    	edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		verify.assertAll();
	}
}
