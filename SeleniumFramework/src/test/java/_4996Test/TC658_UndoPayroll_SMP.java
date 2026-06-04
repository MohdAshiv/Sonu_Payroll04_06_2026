package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC658_UndoPayroll_SMP extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)
	public void TC01validateSmpLeave() throws Exception {
		sTestCaseID = "TC658";
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
	
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

			employee.clickNewEmployee();
			employee.enterTitle(data[54]);
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[70]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			
			employee.enterJoiningDate(data[53]);

			employee.enterNICategory(data[6]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			
			 payroll.Click_PayrollDashboard();
			
			
			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[71]);
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
			
			
			pages.LeaveManagement leave= new pages.LeaveManagement (driver);
			
			leave.clickLeaveManagement();
			leave.clickApprovedLeaves();
			leave.clickAddLeave();
			leave.Enter_ExpectedBirthDate(data[9]);
			leave.Enter_ActualBirthDate(data[9]);
			leave.Enter_AWE(data[8]);
			leave.Enter_LeaverStartDate(data[9]);
			leave.clickSaveBtn();
			
			payroll.Click_PayrollDashboard();
		
			
			payroll.Run_Payroll();
			
			_4996Page.Page4996 page = new _4996Page.Page4996(driver);

			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.SwithToDefault();
			page.tickEmployeeACheckBox();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[21]);
			payroll.Run_Payroll();

		  payroll.Click_PayrollDashboard();
		  pages.reports report = new pages.reports(driver);
		  report.Click__Reports_();
		  report.Click_Statutory_Maternity_Paternityclick();
			 
		  _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		   verify.verifySmpLeave(data[10], data[11], data[12], data[13], data[14], data[15], data[16],data[17],data[18], data[19], data[20], data[21]);

		   verify.assertAll();
		
}
	
	
	
	@Test(priority=2)
	public void TC02validateSmpLeaveUndoJuly() throws Exception {
		sTestCaseID = "TC658";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		
		for(int i= 0;i<=2;i++) {payroll.Run_Payroll();}
			
		
			
			_4996Page.Page4996 page = new _4996Page.Page4996(driver);

			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.SwithToDefault();
			page.tickEmployeeACheckBox();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[22]);
			payroll.Run_Payroll();

		  payroll.Click_PayrollDashboard();
		  pages.reports report = new pages.reports(driver);
		  report.Click__Reports_();
		  report.Click_Statutory_Maternity_Paternityclick();
			 
		  _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		   verify.verifySmpLeave(data[10], data[11], data[12], data[13], data[14], data[15], data[16],data[17],data[18], data[19], data[20], data[21]);

		   verify.assertAll();
		
}
	
	
	
	@Test(priority=3)
	public void TC03validateSmpLeaveUndoOct() throws Exception {
		sTestCaseID = "TC658";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		
		for(int i= 0;i<=2;i++) {payroll.Run_Payroll();}
						
			_4996Page.Page4996 page = new _4996Page.Page4996(driver);

			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.SwithToDefault();
			page.tickEmployeeACheckBox();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[23]);
			payroll.Run_Payroll();

		  payroll.Click_PayrollDashboard();
		  pages.reports report = new pages.reports(driver);
		  report.Click__Reports_();
		  report.Click_Statutory_Maternity_Paternityclick();
			 
		  _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		   verify.verifySmpLeave(data[10], data[11], data[12], data[13], data[14], data[15], data[16],data[17],data[18], data[19], data[20], data[21]);

		   verify.assertAll();
		
}
	
	
	@Test(priority=4)
	public void TC04validateSmpLeaveUndoJan() throws Exception {
		sTestCaseID = "TC658";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		for(int i= 0;i<=2;i++) {payroll.Run_Payroll();}
						
			_4996Page.Page4996 page = new _4996Page.Page4996(driver);

			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.SwithToDefault();
			page.tickEmployeeACheckBox();
			page.clickUndoBtn1();
			page.SwithToDefault();
			payroll.SelecPeriodEndDate(data[24]);
			
			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
	
			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[72]);
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
			employee.enterBasicSalary3(data[25]);
			employee.clickSaveBtn();
			
			payroll.Click_PayrollDashboard();
			payroll.Run_Payroll();

		   payroll.Click_PayrollDashboard();
		   pages.reports report = new pages.reports(driver);
		   report.Click__Reports_();
		   report.Click_Statutory_Maternity_Paternityclick();
			 
		  _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		   verify.verifySmpLeave(data[10], data[11], data[12], data[13], data[14], data[15], data[16],data[17],data[18], data[19], data[20], data[21]);
           verify.assertAll();
}
	
}
