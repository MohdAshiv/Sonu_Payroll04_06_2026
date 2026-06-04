package _11552Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC729_LeaveFinancialYear extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateLeaveTaxPeriod1() throws Exception {

		sTestCaseID = "TC729";
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

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[29]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[17]);
		company.enterleaveDays(data[18]);
		company.enterHolidayPayRate(data[19]);
		company.enterMaxCarryOver(data[20]);
		company.enterWeeklyWorkingHrs(data[21]);
		company.Click_ClickSave();
		
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickNewEmployee();
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[69]);
		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[8]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		 pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
			
		 for(int i=0;i<=11;i++) {payroll.Run_Payroll(); Thread.sleep(2000);}
		
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.clickLeaveReport();
		leaves.selectPeriodEnd(data[11]);
		
		_11552_Page._11552_VerifyPage verify= new _11552_Page._11552_VerifyPage(driver);
		verify.verifyLeaveReportPeriodFirst(data[11]);
		verify.assertAll();
	
}		
	
	
	@Test(priority=2)
	public void TC02validateLeaveTaxPeriod1() throws Exception {

		sTestCaseID = "TC729";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();		

		 pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
			
	//	 for(int i=0;i<=11;i++) {payroll.Run_Payroll(); Thread.sleep(2000);}
		
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.clickLeaveReport();
		leaves.selectPeriodEnd(data[13]);
		
		_11552_Page._11552_VerifyPage verify= new _11552_Page._11552_VerifyPage(driver);
		verify.verifyLeaveReportPeriodFirst(data[13]);
		verify.assertAll();
	
}		
	

	@Test(priority=3)

	public void TC03validatePayslip() throws Exception {

		sTestCaseID = "TC729";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		

		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
	    company.clickDisplayLeaveOnPayslip();
	    company.Click_ClickSave();
	    
	    pages.reports report= new  pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.SelectTaxYear(data[14]);

	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
        email.clickRegenerateBtn();
        
        utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[12]);
		pdf.ReadPDF();

		
	    pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
//		leaves.clickLeaveManagement();
//		leaves.clickApprovedLeaves();
//		leaves.clickLeaveReport();
//		leaves.selectPeriodEnd(data[10]);
		
		_11552_Page._11552_VerifyPage verify= new _11552_Page._11552_VerifyPage(driver);
		verify.verifyPayslip(data[10]);
		verify.assertAll();
	
}
	
	

	@Test(priority=4)

	public void TC04validatePayslipExportToPdf() throws Exception {

		sTestCaseID = "TC729";
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
		
		
	    pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
	    
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.clickLeaveReport();
		
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[22]);
		pdf.ReadPDF();
		
//		leaves.clickLeaveManagement();
//		leaves.clickApprovedLeaves();
//		leaves.clickLeaveReport();
//		leaves.selectPeriodEnd(data[10]);
		
		_11552_Page._11552_VerifyPage verify= new _11552_Page._11552_VerifyPage(driver);
		verify.verifyPayslip(data[10]);
		verify.assertAll();
	
}
	
	

	//@Test(priority=5)

	public void TC05validatePayslipExportToCsv() throws Exception {

		sTestCaseID = "TC729";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		
	    pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
	    
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.clickLeaveReport();
		
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[23]);
		pdf.ReadPDF();
		
//		leaves.clickLeaveManagement();
//		leaves.clickApprovedLeaves();
//		leaves.clickLeaveReport();
//		leaves.selectPeriodEnd(data[10]);
		
		_11552_Page._11552_VerifyPage verify= new _11552_Page._11552_VerifyPage(driver);
	//	verify.verifyPayslip(data[10]);
		verify.assertAll();
	
}
	
	

	@Test(priority=6)

	public void TC06validateAgentLeaveReport() throws Exception {

		sTestCaseID = "TC729";
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
		agentpage.ClickAgentReport();
		
		
		_11552_Page.AgentToBuisness aReport= new _11552_Page.AgentToBuisness(driver);
		aReport.clickClientSpeceficReport();
		aReport.selectReportType(data[15]);
		aReport.enterComapnay(data[16]);
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		
	    pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
	    
		leaves.clickLeaveManagement();
		leaves.clickApprovedLeaves();
		leaves.clickLeaveReport();
		
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[23]);
		pdf.ReadPDF();
		
//		leaves.clickLeaveManagement();
//		leaves.clickApprovedLeaves();
//		leaves.clickLeaveReport();
//		leaves.selectPeriodEnd(data[10]);
		
		_11552_Page._11552_VerifyPage verify= new _11552_Page._11552_VerifyPage(driver);
	//	verify.verifyPayslip(data[10]);
		verify.assertAll();
	
}
	
}
