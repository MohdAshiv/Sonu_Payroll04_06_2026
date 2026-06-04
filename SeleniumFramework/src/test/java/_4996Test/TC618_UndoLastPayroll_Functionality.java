package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC618_UndoLastPayroll_Functionality  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateUndoLastPayrollAbleTOAddDepartment() throws Exception {
		sTestCaseID = "TC618";
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
		

		for(int i=70;i<=73;i++)
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
		
		   payroll.Run_Payroll();
		   _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.SwithToDefault();
			page.UntickEmployeeCCheckBox();
			page.clickUndoBtn1();
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			page.SwithToDefault();
			
			company.Click_gotoEditCompany();
			
			company.Click_clickDepartments();
			
			company.clickDepartment();
			company.enterDepartmentName1(data[9]);
			company.clickDepatrmentSaveBtn();
			Thread.sleep(3000);
		
			payroll.scrollClickPayrollDashboard();
			payroll.SelecPeriodEndDate(data[8]);
			

			employee.clickEmployeeName2();
			employee.editEmployeeDetails();

			employee.click_Paydetails();
			_5671Departments_Page.DepartmentsPage department = new _5671Departments_Page.DepartmentsPage(driver);

			department.selectDepartment(data[9]);
			employee.clickSaveBtn();

			payroll.Click_PayrollDashboard();

			payroll.Run_Payroll();
			verify.verifyDepartmentUndoneEmployee(data[9]);
			
			payroll.Undo_LastPayroll();
			verify.assertAll();
	}
	
	
	
	@Test(priority=2)
	public void TC02validateUndoLastPayrollAbleTOAddLeave() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);


		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeCCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
			
		pages.LeaveManagement leave= new pages.LeaveManagement(driver);
		
		leave.clickLeaveManagement();
		leave.clickApprovedLeaves();
		leave.clickAddLeave();
		leave.selectEmployee(data[10]);
		leave.selectLeaveType(data[11]);
		leave.clickSaveBtn();
		verify.verifyLeaveRecordAlert();

		payroll.Click_PayrollDashboard();
		payroll.SelecPeriodEndDate(data[8]);
		payroll.Run_Payroll();

		payroll.Undo_LastPayroll();
		
		
		verify.assertAll();
	}

	
	

	@Test(priority=3)
	public void TC03validateUndoLastPayrollAbleToAddPaymentFromProcessPay() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeCCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
			
		payroll.SelecPeriodEndDate(data[8]);
		
		page.clickUndoneEmployee3Dot();
		
    	_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
    	processPay.clickProcessPay();
    	processPay.enterBasicPay(data[12]);
    	processPay.clickSaveBtn();
    	verify.verifyPayrollDashboardGross(data[13]);

    	payroll.Run_Payroll();
    	verify.verifyPayrollDashboardGross(data[14]);
    	
    	payroll.Undo_LastPayroll();
    	
		verify.assertAll();
	}
	
	
	

	@Test(priority=4)
	public void TC04validateUndoLastPayrollAbleToAddPaymentFromEditCompany() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeCCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
			
		payroll.SelecPeriodEndDate(data[8]);
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.clickEmployeeName2();
		
		employee.editEmployeeDetails();

		employee.click_Paydetails();
		
		employee.enterBasicSalary(data[15]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
    	_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
    	
    	verify.verifyPayrollDashboardGross(data[16]);

    	payroll.Run_Payroll();
    	verify.verifyPayrollDashboardGross(data[16]);
    	
    	payroll.Undo_LastPayroll();
    	
		verify.assertAll();
	}
	
	
	@Test(priority=5)
	public void TC05validateUndoLastPayrollAbleToAddTerminationFromProcessPay() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeCCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
			
		payroll.SelecPeriodEndDate(data[8]);
		
        _1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		
        page.clickUndoneEmployee3Dot();
        processPay.clickProcessPay();
		processPay.clickAddMore();
		processPay.enterAccountCode(data[17]);
		processPay.enterDescription(data[18]);
		processPay.enterAmount(data[19]);
		processPay.clickSaveBtn();
	
    	verify.verifyPayrollDashboardGrossNetpay(data[20]);

    	payroll.Run_Payroll();
    	
    	payroll.Undo_LastPayroll();
    	
		verify.assertAll();
	}
	
	
	
	//@Test(priority=6)
	public void TC06validateUndoLastPayrollEmployeeNotAbleToDelet() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeCCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
			
		payroll.SelecPeriodEndDate(data[8]);
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

        page.clickUndoneEmployee3Dot();

        page.clickUndoneDeletEmployeeInlineDropdown();
		employee.clickDeletBtn();
    	verify.verifEmployeePageAlertMsg(data[21]);

		
		payroll.Click_PayrollDashboard();

		
    	payroll.Run_Payroll();
    	
    	payroll.Undo_LastPayroll();
    	
		verify.assertAll();
	}
	
	
	
	//@Test(priority=7)
	public void TC07validateUndoLastPayrollAbleToAddDirector() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeCCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
			
		payroll.SelecPeriodEndDate(data[8]);
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.clickEmployeeName2();
		
		employee.editEmployeeDetails();

		employee.clickMandotoryPayroll();
		
		employee.clickYesDirector();
		employee.enter_DirectorFromDate(data[69]);
		
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
    	
    	verify.verifyPayrollDashboardDirector(data[22]);

    	payroll.Run_Payroll();
    	verify.verifyPayrollDashboardDirector(data[22]);
    	
    	payroll.Undo_LastPayroll();
    	
		verify.assertAll();
	}
	
	
	
	
	//@Test(priority=8)
	public void TC08validateUndoLastPayrollAbleToAddNoEmployerNIC() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeBCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
			
		payroll.SelecPeriodEndDate(data[8]);
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.clickEmployeeName1();
		
		employee.editEmployeeDetails();

		employee.clickMandotoryPayroll();
		
		employee.clickNoEmployerNIC();
		
		
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
    	
    	verify.verifyPayrollDashboardDirector(data[22]);

    	payroll.Run_Payroll();
    	verify.verifyPayrollDashboardDirector(data[22]);
    	
    	payroll.Undo_LastPayroll();
    	
		verify.assertAll();
	}
	
	
	//@Test(priority=9)
	public void TC09validateUndoLastPayrollAbleToAddOffPayWorker() throws Exception {
		sTestCaseID = "TC618";
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

		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Run_Payroll();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.UntickEmployeeBCheckBox();
		page.clickUndoBtn1();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		page.SwithToDefault();
		payroll.SelecPeriodEndDate(data[8]);
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.clickEmployeeName1();
		employee.editEmployeeDetails();

		employee.clickMandotoryPayroll();
		employee.clickYesOffPayWorker();
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
    	verify.verifyPayrollDashboardTaxNIGrossNet(data[24],data[25],data[26],data[27],data[28]);

    	payroll.Run_Payroll();
    	verify.verifyPayrollDashboardTaxNIGrossNet(data[24],data[25],data[26],data[27],data[28]);

    	payroll.Undo_LastPayroll();
    	
		verify.assertAll();
	}
	
	
}
