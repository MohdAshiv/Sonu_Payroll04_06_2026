package calculationsAcrossReports;

import org.testng.annotations.Test;
import tests.TestBase;
import utilities.ExcelData;

public class TC04_NetPayCalculation extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[88]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[86]);
		Bk.Enter_CompanyAddressLine1(data[87]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[88]);
		Bk.Enter_NewEndDate(data[89]);
		Bk.Click_AccPeriodSave();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		
		company.ClickContactDetails();
		company.enterFirstName(data[10]);
		
		company.enterEmail(data[11]);
		company.clickAddContact();
		
	    company.Click_clickDepartments();		
		company.clickDepartment();
		company.enterDepartmentName1(data[12]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(15000);
			
		company.Click_clickPayrollDetails();
		company.enterRegistrationDate(data[108]);
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		company.inputTextUTR(data[8]);
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[108]);
		company.Click_ClickSave();
		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.PensionSetup pension = new pages.PensionSetup(driver);
		
		pension.enterPensionStagingDate(data[93]);
		pension.enterSignatoryTitle();
		pension.enterSignatoryName();
		pension.enterEmailAddress(data[94]);
		pension.enterPhoneNumber();
		pension.enterPensionId(data[95]);
		pension.clickPensonDetailsSave();
		payroll.scrollClickPayrollDashboard();
		pension.clickPensionDashBoard();
		pension.addSchemeManually();
		pension.enterPensionSchemeName(data[96]);
		pension.selectPensionProvider(data[96]);
		pension.selectCalculationBasis(data[97]);
		pension.selectCalculationMethod(data[98]);
		pension.eeContribution(data[99]);
		pension.enterErContribution(data[100]);
		pension.enterSubgroupName();
		pension.enterGroupId();
		pension.enterSubGroupId();
		pension.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[102]);
		employee.enterLastName(data[103]);
		employee.enterDateOfBirth(data[104]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[107]);
		employee.enterEmailAddress(data[11]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[108]);

		employee.enterNICategory(data[6]);
		employee.enterNationalInsuranceNumber("JG536834C");
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();

		employee.click_Paydetails();
		employee.selectDepartment(data[12]);
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		employee.clickAutoEnrolment();
		pension.selectWorkerType(data[109]);
		pension.selectScheme(data[96]);
		pension.enterEnrollmentDate(data[108]);
		pension.eeChoosenContribution(data[99]);
		pension.erChoosenContribution(data[100]);
		pension.eeVoluntaryContribution(data[101]);
		pension.eRVoluntaryContribution(data[101]);
		pension.clickAutoEnrollmentSaveBtn();
		payroll.Click_PayrollDashboard();

		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		payroll.Run_Payroll();
		
		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();
		report.Click_Individual_Employee_Pay_Scheduleclick();
		verify.verifyCapturedNetPay("//*[@class='table-responsive']/div/table/tbody/tr[position()>1 and position()<last()]", "//*[@class='table-responsive']/div/table/tbody/tr[position() < last()]/td[12]");
}
	
	
	@Test(priority=2)

	public void TC02validatePayslip() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);		
		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payslipsclick();
		verify.verifyCapturedNetPay("//*[@id='tblReportData']//tbody/tr",".//td[9]");
	}
	
	
	@Test(priority=3)

	public void TC03validateFillingManagement() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.captureNetPay();		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();
		verify.verifyCapturedNetPay("//*[@class='table-responsive']//table/tbody/tr[2]",".//td[13]");

	}
	

	@Test(priority=4)
	public void TC04validateDepartmental() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		verify.verifyCapturedNetPay("//*[@id='tblDepartmentReport']/tbody/tr[@class='dept-header']","//*[@id='tblDepartmentReport']/tbody/tr[@class='dept-header']/th[16]");
	}
	
	

	@Test(priority=5)
	public void TC05validatePayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC003";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();

		report.Click_Payroll_Reporting_Period_Summary();
		verify.verifyCapturedNetPay("//*[@class='table-responsive']//table/tbody/tr[2]","//*[@class='table-responsive']//table/tbody/tr/td[16]");
	}
	
	
	@Test(priority=6)
	public void TC06validatePayElementReport() throws Exception {

		sTestCaseID = "TC002";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();

		report.Click_PayElementReport();
		verify.verifyCapturedNetPay("//*[@id='tblPayElementBody']/tr","//*[@id='tblPayElementBody']/tr/td[8]");
	}
	

	@Test(priority=7)
	public void TC07validatePayrollSummary() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();

		report.Click_Payroll_Summary();
		verify.verifyCapturedNetPay("//tr[td[1][contains(normalize-space(.),'Testing Employee')]][@valign=\"top\"]","//tr[td[1][contains(normalize-space(.),'Testing Employee')]][@valign='top']/td[9]");
	}
	
	@Test(priority=8)
	public void TC08validateAnnualPayrollSchedule() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();

		report.clickAnnualPayrollSchedule();
		report.	showAnnualPayScheduleEmailBtn();
		verify.verifyCapturedNetPay("(//*[@class='table table-head-bg'])[2]/tbody/tr[2]","(//*[@class='table table-head-bg'])[2]/tbody/tr[2]/td[6]");

	}
	

	@Test(priority=9)
	public void TC09validateClickingEmployeeName() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
       pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.captureNetPay();		
		employee.clickEmployeeName();
		verify.verifyCapturedNetPay("(//*[@class='table table-head-bg'])[1]/tbody/tr[2]",".//td[8]");
	}
	
	@Test(priority=10)
	public void TC10validatePaymentSummary() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.captureNetPay();		
		pages.reports report= new   pages.reports(driver);
		report.Click__Reports_();
		report.clickPaymentSummaryReport();
		verify.verifyCapturedNetPay("//*[@class='table table-head-bg']/tbody/tr[2]",".//td[2]");
	}
	
	
	@Test(priority=11)
	public void TC11validateEmployerView() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
	pages.FilingManagement filling = new pages.FilingManagement(driver);
		
	PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
 
    	verify.captureNetPay();		
  		filling.Click_gotoFilingManagement();
		filling.selectStatus(data[23]);
		filling.clickCheckBox();
		filling.enterNotes();
		filling.clickNottoSubmit();
	

		pages.EmployerView employer= new pages.EmployerView(driver);
		employer.Click_EmployerView();		

		verify.verifyCapturedNetPay("//*[@class='table table-head-bg']/tbody/tr[2]",".//td[12]");
	}
	
	@Test(priority=12)
	public void TC12validateEmployeeDashboard() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

     	verify.captureNetPay();		

		pages.EmployerView employer= new pages.EmployerView(driver);
		employer.Click_EmployerView();
		employer.clickEmployee();
		
		verify.verifyCapturedNetPay("//*[@class='table table-head-bg']/tbody/tr[2]","//*[@class='table table-head-bg']/tbody/tr[2]/td[10]");
	}

	@Test(priority=13)
	public void TC13validateEmployee_IEPS() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

    	verify.captureNetPay();		

		pages.EmployerView employer= new pages.EmployerView(driver);
		employer.Click_EmployerView();
		employer.clickEmployee();

		employer.Click__Reports_();
	    employer.clickIndividalEmployeePaySchedule();
	    verify.verifyCapturedNetPay("//*[@class='table-responsive']/div/table/tbody/tr[position()>1 and position()<last()]","//*[@class='table-responsive']/div/table/tbody/tr[position() < last()]/td[12]");
	}
	
	

	@Test(priority=14)
	public void TC14validateEmployerView_IEPS() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
	    PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

   	    verify.captureNetPay();		

		pages.EmployerView employer= new pages.EmployerView(driver);
		employer.Click_EmployerView();
		employer.Click__Reports_();
		employer.clickIndividalEmployeePaySchedule();

	    verify.verifyCapturedNetPay("//*[@class='table-responsive']/div/table/tbody/tr[position()>1 and position()<last()]","//*[@class='table-responsive']/div/table/tbody/tr[position() < last()]/td[12]");
	}
	

	@Test(priority=15)
	public void TC15validateEmployerView_Payslip() throws Exception {

		sTestCaseID = "TC004";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
	    PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

   	    verify.captureNetPay();		
		pages.EmployerView employer= new pages.EmployerView(driver);
		employer.Click_EmployerView();
		employer.Click__Reports_();
		employer.clickPayslip();
	    verify.verifyCapturedNetPay("//*[@class= 'table-responsive']/table/tbody/tr[2]",".//td[12]");
	}
	

	@Test(priority=16)
	public void TC16validateEmployerView_PayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC002";
		Sheet = "calculationsAcrossReports";
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
		OpenClient.Enter_EnterClientName("diUiWPLsB");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();		
	    PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

   	    verify.captureNetPay();		
		pages.EmployerView employer= new pages.EmployerView(driver);
		employer.Click_EmployerView();
		employer.Click__Reports_();
		employer.clickPayrollReportingPeriodSummary();
		verify.verifyCapturedNetPay("//*[@class='table-responsive']//table/tbody/tr[2]","//*[@class='table-responsive']//table/tbody/tr/td[16]");
	}
}


