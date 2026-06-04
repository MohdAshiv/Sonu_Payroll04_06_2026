package _9126Test;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC708_DepartmentalAnalysis_FinancialYear extends TestBase{
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	@Test(priority=1)
	public void TC01validateDepartmentAnalysisFinancialYear() throws Exception {
		sTestCaseID = "TC708";
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
//		OpenClient.Enter_EnterClientName(data[4]);
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

		company.Click_clickDepartments();
		
		
		
		for(int i=9; i<=11;i++)
		{
			company.clickDepartment();
			company.enterDepartmentName1(data[i]);
			company.clickDepatrmentSaveBtn();
			Thread.sleep(7000);
		}
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		
		
	pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		

		for(int i=70;i<=71;i++)
		{
			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[i]);
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
			employee.enterBasicSalary3(data[5]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
			Thread.sleep(3000);
			
		}
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		page.selectDepartment(data[9]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName1();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		page.selectDepartment(data[9]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();

		for(int i=0;i<=35;i++) {payroll.Run_Payroll();}
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		page.selectPeriodEnd(data[8]);
		page.enterFromDate(data[12]);
		
		page.enterToDate(data[13]);
		page.searchBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	    System.out.println("jnckj");
		  
		  
		verify.verifyAlert(data[14]);
		
	    verify .assertAll();

	}
	
	
	
	
	@Test(priority=2)
	public void TC02validateDepartmentAnalysisExportToPdf() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectFinancialYear(data[15]);
		page.searchBtn();
		page.clickExportToPdf();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		  
		verify.verifyAlert(data[16]);
		
	    verify .assertAll();

	}
		
	
	@Test(priority=3)
	public void TC03validateDepartmentAnalysisExportToCsv() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectFinancialYear(data[15]);
		page.searchBtn();
		page.clickExportToCsv();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		  
		verify.verifyAlert(data[16]);
		
	    verify .assertAll();

	}
	

	
	
	@Test(priority=4)
	public void TC04validatePeriodEndTag() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

	
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		  
		verify.verifyTagsAndText();
		
	    verify .assertAll();

	}
	
	
	

	@Test(priority=5)
	public void TC05validateDateShoudOnlyAcceptNumeric() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectPeriodEnd(data[8]);
		page.enterFromDate(data[17]);
		
		page.enterToDate(data[18]);
		page.searchBtn();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyAlertWithDate(data[19]);
	    verify .assertAll();

	}
	
	
	
	@Test(priority=6)
	public void TC06validateFromDateIcn() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectPeriodEnd(data[8]);
		page.enterFromDateIcn();
		
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyFromDatePicker();
	    verify .assertAll();

	}
	
	
	@Test(priority=7)
	public void TC07validateToDateIcn() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectPeriodEnd(data[8]);
		page.entertoDateIcn();
		
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifytToDatePicker();
	    verify .assertAll();

	}
	

	@Test(priority=8)
	public void TC08validatePeriodEndTagDepartment() throws Exception {
		sTestCaseID = "TC708";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyTagsAndTextDepatmrnt();
	    verify .assertAll();

	}
	
	

	@Test(priority=9)
	public void TC09validateWithToDate() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectPeriodEnd(data[8]);
		
		page.enterToDate(data[22]);
		page.searchBtn();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyAlertWithDate(data[19]);
	    verify .assertAll();

	}
	
	
	@Test(priority=10)
	public void TC10validateWithFromDate() throws Exception {
		sTestCaseID = "TC708";
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

		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectPeriodEnd(data[8]);
		
		page.enterFromDate(data[22]);
		page.searchBtn();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyAlertWithDate(data[20]);
	    verify .assertAll();

	}
	
	
	@Test(priority=11)
	public void TC11validatePeriodEndTagReportType() throws Exception {
		sTestCaseID = "TC708";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyTagsAndTextReoortType();
	    verify .assertAll();

	}
	
	
	@Test(priority=12)
	public void TC12validatePeriodEndTagFrequency() throws Exception {
		sTestCaseID = "TC708";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectPeriodEnd(data[8]);
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyTagsAndTextFrequency();
	    verify .assertAll();

	}
	
	
	
	@Test(priority=13)
	public void TC13validateReportTypeFilter() throws Exception {
		sTestCaseID = "TC708";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectReportType(data[21]);
		page.searchBtn();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDetailedReport(data[70]);
	    verify .assertAll();

	}
	
	
	@Test(priority=14)
	public void TC14validateChevronIcnUP() throws Exception {
		sTestCaseID = "TC708";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectReportType(data[21]);
		page.searchBtn();
		page.clickChevronIcn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDetailedReport(data[98]);
	
	    verify .assertAll();

	}
	
	@Test(priority=15)
	public void TC15validateChevronIcnDown() throws Exception {
		sTestCaseID = "TC708";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectReportType(data[21]);
		page.searchBtn();
		page.clickChevronIcn();
		page.clickChevronIcn();

		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDetailedReport(data[70]);
	
	    verify .assertAll();
	}
	
}
