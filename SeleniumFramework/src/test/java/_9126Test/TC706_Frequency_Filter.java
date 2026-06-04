package _9126Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC706_Frequency_Filter extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateDepartmentWeekly() throws Exception {
		sTestCaseID = "TC706";
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
//
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
		
		for(int i=9; i<=13;i++)
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
		
	pages.FrequencySet freq= new pages.FrequencySet(driver);
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[47]);
		freq.Enter_AnnualPayDate(data[51]);
		company.Click_ClickSave();
		
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F3(data[48]);
		freq.Enter_FortnightlyPayDate(data[52]);
		company.Click_ClickSave();
		
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F4(data[49]);
		freq.Enter_FourWeeklyPayDate(data[53]);
		company.Click_ClickSave();
		
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F5(data[50]);
		freq.Enter_WeeklyPayDate(data[54]);
		company.Click_ClickSave();
		
		
		
	pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

        int k=41;
        int l=9;

		for(int i=70;i<=74;i++)
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
			employee.enterPayFrequency(data[k]);
			employee.enterNICategory(data[6]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			page.selectDepartment(data[l]);

			employee.enterBasicSalary3(data[5]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
			Thread.sleep(3000);
			k++;
			l++;
		}
		
		
		payroll.Run_Payroll();
		
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		  
	//	verify.verifySelectedDepartment(data[14],data[15],data[16],data[17],data[18]);
		
		verify.verifyDataGroupFrequencyWise(data[14],data[28]);
	    verify .assertAll();

	}
	
	

	@Test(priority=2)
	public void TC02validateDepartmentWithFortnightly() throws Exception {
		sTestCaseID = "TC706";
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
	    pages.reports report = new pages.reports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Run_Payroll();
		report.Click__Reports_();
		
		report.Click__DepartmentalAnalyisis_();

		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		  
	//	verify.verifySelectedDepartment(data[15],data[14],data[16],data[17],data[18]);
		verify.verifyDataGroupFrequencyWise(data[15],data[29]);

	    verify .assertAll();
	
		
	}
	
	
	
	@Test(priority=3)
	public void TC03validateDepartmentWithFourWeekly() throws Exception {
		sTestCaseID = "TC706";
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
	    pages.reports report = new pages.reports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		for(int i=0;i<=2;i++) {payroll.Run_Payroll();}

		report.Click__Reports_();
		
		report.Click__DepartmentalAnalyisis_();

		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		  
	//	verify.verifySelectedDepartment(data[16],data[14],data[15],data[17],data[18]);
		verify.verifyDataGroupFrequencyWise(data[16],data[30]);

	    verify .assertAll();
	
		
	}
	
	

	@Test(priority=4)
	public void TC04validateDepartmentWithMonthly() throws Exception {
		sTestCaseID = "TC706";
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
	    pages.reports report = new pages.reports(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		for(int i=0;i<=2;i++) {payroll.Run_Payroll();}

		report.Click__Reports_();
		
		report.Click__DepartmentalAnalyisis_();

		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		  
	//	verify.verifySelectedDepartment(data[17],data[14],data[15],data[16],data[18]);
		verify.verifyDataGroupFrequencyWise(data[17],data[31]);

	    verify .assertAll();
	
		
	}
	
	

	
	
	
	
	//@Test(priority=6)  pending 
	public void TC06validateSelectedFrequencyReflectDataAccordingly_Weekly() throws Exception {
		sTestCaseID = "TC706";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		
		page.selectPeriodEnd(data[8]);
		//page.selectReportType(data[21]);
		page.selectFrequency(data[22]);
		page.enterFromDate(data[23]);
		page.enterToDate(data[24]);

		page.searchBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDetailedReport(data[74]);
	
	    verify .assertAll();
	}
	

//	@Test(priority=7) pending here
	public void TC07validateSelectedFrequencyReflectDataAccordingly_Monthly() throws Exception {
		sTestCaseID = "TC706";
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
		page.selectReportType(data[21]);
		page.selectFrequency(data[25]);
		page.enterFromDate(data[23]);
		page.enterToDate(data[24]);

		page.searchBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDetailedReport(data[70]);
	
	    verify .assertAll();
	}
	
	@Test(priority=8)
	public void TC08validateSelectedFrequencyReflectDataAccordingly_Fourweekly() throws Exception {
		sTestCaseID = "TC706";
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
		page.selectReportType(data[21]);
		page.selectFrequency(data[26]);
		page.enterFromDate(data[23]);
		page.enterToDate(data[24]);

		page.searchBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDetailedReport(data[73]);
	
	    verify .assertAll();
	}
	
	@Test(priority=9)
	public void TC09validateSelectedFrequencyReflectDataAccordingly_Fortnightly() throws Exception {
		sTestCaseID = "TC706";
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
		page.selectReportType(data[21]);
		page.selectFrequency(data[48]);
		page.enterFromDate(data[23]);
		page.enterToDate(data[24]);

		page.searchBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDetailedReport(data[72]);
	
	    verify .assertAll();
	}
	
	
	
	@Test(priority=10)
	public void TC10validateDepartmentWithAnnualy() throws Exception {
		sTestCaseID = "TC706";
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
		
		for(int i=9; i<=13;i++)
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
		
	pages.FrequencySet freq= new pages.FrequencySet(driver);
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[47]);
		freq.Enter_AnnualPayDate(data[51]);
		company.Click_ClickSave();
		
		freq.clickDeletBtn();
	
	pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

        int l=9;

		for(int i=70;i<=74;i++)
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
			page.selectDepartment(data[l]);

			employee.enterBasicSalary3(data[5]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
			Thread.sleep(3000);
			l++;
		}
		
		payroll.Run_Payroll();
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDepartment(data[16],data[14],data[18],data[17],data[15]);
		
	    verify .assertAll();

	
		
	}
	
	
	

	@Test(priority=11)
	public void TC11validateSelectedFrequencyReflectDataAccordingly_Annually() throws Exception {
		sTestCaseID = "TC706";
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
		
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		
		page.selectPeriodEnd(data[8]);
		page.selectFrequency(data[42]);
		page.enterFromDate(data[23]);
		page.enterToDate(data[27]);
		page.searchBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyDepartment(data[16],data[14],data[18],data[17],data[15]);
	
	    verify .assertAll();
	}
	
}
