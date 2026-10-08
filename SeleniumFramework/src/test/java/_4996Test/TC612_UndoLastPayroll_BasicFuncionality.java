package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC612_UndoLastPayroll_BasicFuncionality extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
                                                                                          
	@Test(priority=1)
	public void TC01validateUndoLastPayrollCancelBtn() throws Exception {
		sTestCaseID = "TC612";
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
		
		for(int i=70;i<=90;i++)
		{
			employee.clickNewEmployee();
			Thread.sleep(1000);

			employee.enterFirstName(data[63]);
			employee.enterLastName(data[i]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.clickSaveBtn();
			Thread.sleep(1000);

			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[69]);

			employee.enterNICategory(data[6]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			Thread.sleep(1000);

			employee.click_Paydetails();
			employee.enterBasicSalary3(data[5]);
			employee.clickSaveBtn();
			Thread.sleep(1000);

			payroll.Click_PayrollDashboard();
			
			Thread.sleep(3000);
			
		}
		
		  payroll.Run_Payroll();
		
		 _4996Page.Page4996  page= new _4996Page.Page4996(driver);
		 
		  page.clickUndoLastPayrollBtn();
		  
		  _4996Page.Verify4996 verify=   new _4996Page.Verify4996(driver);
		  
		  verify.verifyUndoLastPayrollCancelBtn();
		
		  payroll.Undo_LastPayroll();
		  verify.assertAll();

	}
	
	
	
	
	@Test(priority=2)
	public void TC02validateUndoLastPayrollCheckBoxSelectedByDefault() throws Exception {
		sTestCaseID = "TC612";
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
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();

		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();

		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		verify.verifyCheckBoxSelcted();
		
		verify.verifyUndoLastPayrollCancelBtn();

		payroll.Undo_LastPayroll();

		verify.assertAll();

	}
	

	@Test(priority=3)
	public void TC03validateUndoLastPayrollCheckBoxNotSelected() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();

		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();

		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		verify.verifyCheckBoxNotSelcted();
		
		verify.verifyUndoLastPayrollCancelBtn();
		payroll.Undo_LastPayroll();

		verify.assertAll();

	}
	
	
	
	
	@Test(priority=4)
	public void TC04validateUndoLastPayrollCloseBtn() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();

		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();

		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		
		verify.verifyUndoLastPayrollCloseBtn();
		
		payroll.Undo_LastPayroll();

		verify.assertAll();

	}

	
	@Test(priority=5)
	public void TC05validateUndoLastPayrollAlertIfCheckboxUntick() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();
		
		page.clickNameCheckBox();
		
		page.clickUndoBtn();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		
		verify.verifyAlertMsgNormal(data[10]);
		
		page.SwithToDefault();
		page.clickCloseBtn();
		
		payroll.Undo_LastPayroll();

		verify.assertAll();
	}
	
	
	@Test(priority=6)
	public void TC06validateUndoLastPayrollAlertIfCheckboxSelected() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);
		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();
		
		page.goToInsideFrame();
		page.clickUndoBtn();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		verify.verifyAlertMsgNormal(data[11]);
		
		page.SwithToDefault();
	//	page.clickCloseBtn();
		
	//	payroll.Undo_LastPayroll();

		verify.assertAll();
	}
	
	
	@Test(priority=7)
	public void TC07validateUndoLastPayrollAlertForSomeSelectedEmployees() throws Exception {
		sTestCaseID = "TC612";
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
//		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[58]);
//		buisness.enterFirstName();
//		buisness.enterLastName();
//		buisness.clickSaveBtn();
//		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//	
//		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//		Bk.Click_BKEdit();
//		Bk.Select_services(data[56]);
//		Bk.Enter_CompanyAddressLine1(data[57]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[58]);
//		Bk.Enter_NewEndDate(data[59]);
//		Bk.Click_AccPeriodSave();
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[60]);
//		company.enterRefrenceNumber(data[61]);
//		company.accountOfficeReffrence(data[62]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[69]);
//		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//	
//		payroll.Click_PayrollDashboard();
//		
//		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		
//
//		for(int i=70;i<=73;i++)
//		{
//			employee.clickNewEmployee();
//			employee.enterFirstName(data[63]);
//			employee.enterLastName(data[i]);
//			employee.enterDateOfBirth(data[65]);
//			employee.enterAddressLine(data[66]);
//			employee.enterAddressLine2(data[67]);
//			employee.enterPostCode(data[68]);
//			employee.clickSaveBtn();
//			employee.clickMandotoryPayroll();
//			
//			employee.enterJoiningDate(data[69]);
//
//			employee.enterNICategory(data[6]);
//			employee.enterTaxCode(data[7]);
//			employee.clickSaveBtn();
//			
//			employee.click_Paydetails();
//			employee.enterBasicSalary3(data[5]);
//			employee.clickSaveBtn();
//			payroll.Click_PayrollDashboard();
//			
//			Thread.sleep(3000);
//			
//		}
		
		
		   payroll.Run_Payroll();
		  _4996Page.Page4996 page = new _4996Page.Page4996(driver);

			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();

			page.SwithToDefault();

			page.UntickEmployeeCCheckBox();
			page.clickUndoBtn();
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyAlertMsgNormal(data[12]);
			
			page.SwithToDefault();
			

			verify.assertAll();

	}
	
	
	
	

	@Test(priority=8)
	public void TC08validateUndoLastPayrollPayrollDashBoard() throws Exception {
		sTestCaseID = "TC612";
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

		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyAlertMsg1(data[13]);

		verify.assertAll();

	}
	
	
	@Test(priority=9)
	public void TC09validatePendingPayrollForPastPeriod() throws Exception {
		sTestCaseID = "TC612";
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

		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickPendingPayrollForPastPeriodIcn();

		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyPendingPayrollForApproval(data[14],data[15]);
		verify.assertAll();

	}
	
	

	@Test(priority=10)
	public void TC10validateUndoLastPayrollPayslip() throws Exception {
		sTestCaseID = "TC612";
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

		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payslipsclick();
		
		
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyPayslip(data[72]);
		verify.assertAll();

	}
	
	@Test(priority=11)
	public void TC11validateUndoLastPayrollReportingPeriodSummary() throws Exception {
		sTestCaseID = "TC612";
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

		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payroll_Reporting_Period_Summary();
		
		
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyPayrollReportingPeriodSummary(data[16]);
		verify.assertAll();

	}
	
	
	@Test(priority=12)
	public void TC12validateUndoLastPayrollPayrollSummary() throws Exception {
		sTestCaseID = "TC612";
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

		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyPayrollSummary(data[14]);
		verify.assertAll();

	}
	
	
	@Test(priority=13)
	public void TC13validateUndoLastPayrollIndividualEmployeePaySchedule() throws Exception {
		sTestCaseID = "TC612";
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

		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Individual_Employee_Pay_Scheduleclick();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.SelectEmployee(data[16]);
	
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyIndividualEmployeePaySchedule();
		verify.assertAll();

	}
	
	
	
	@Test(priority=14)
	public void TC14validateUndoLastPayrollShouldNotReflectRunPayrollPage() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.runPayroll();
	
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyRunPayrollPage(data[72]);
		verify.assertAll();

	}
	
	
	@Test(priority=15)
	public void TC15validateUndoLastPayrollP11() throws Exception {
		sTestCaseID = "TC612";
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

		pages.reports report= new pages.reports(driver);
		report.Click__Reports_();
		report.Click_P11();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		//payroll.SelectEmployee(data[16]);
	
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.checkAbsenceOfEmployeeP11();
		verify.assertAll();

	}
	
	
	@Test(priority=16)
	public void TC16validateUndoLastPayrollEmployeeFromLastPeriod() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.SelecPeriodEndDate(data[8]);
	
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
	    verify.verifyUndoEmployeeFromLastPeriod(data[16]);

		verify.assertAll();

	}
	
	
	
	@Test(priority=17)
	public void TC17validateUndoLastPayrollEmployeeFromLastPeriodInlineDropdown() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.SelecPeriodEndDate(data[8]);
	
		
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyInlineElementIsClickable();

		verify.assertAll();

	}
	
	@Test(priority=18)
	public void TC18validateUndoLastPayrollEmployeeFromLastPeriodClickable() throws Exception {
		sTestCaseID = "TC612";
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

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.SelecPeriodEndDate(data[8]);
	
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyUndoEmployeeClickable();

		
		verify.assertAll();

	}
	
	

	@Test(priority=19)
	public void TC19validateUndoLastPayrollAbleToAddNotinalPay() throws Exception {
		sTestCaseID = "TC612";
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
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.SelecPeriodEndDate(data[8]);
	    _4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoneEmployee3Dot();

		_1566AdditionDeductionPage.ProcessPay processPay = new _1566AdditionDeductionPage.ProcessPay(driver);

			processPay.clickProcessPay();
			processPay.clickAddMore();
			processPay.enterAccountCode(data[17]);
			processPay.enterDescription(data[18]);
			processPay.enterAmount(data[19]);
			processPay.clickApplyBtn();
			processPay.tickNotinalPay();
			processPay.clickSaveBtn();

		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
	
		verify.verifyPayrollDashboardGrossNetpay(data[20]);
		verify.assertAll();

	}
	
	}
