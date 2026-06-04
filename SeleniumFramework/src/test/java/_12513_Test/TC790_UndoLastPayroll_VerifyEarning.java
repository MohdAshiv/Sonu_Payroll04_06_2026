package _12513_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC790_UndoLastPayroll_VerifyEarning extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateTaxNIBothEmployee() throws Exception {
		sTestCaseID = "TC790";
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
//		
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
		

			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[70]);
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
			employee.enterBasicSalary3(data[9]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
		
			payroll.Run_Payroll();
			
			pages.reports report = new pages.reports(driver);
			report.Click__Reports_();
			report.Click_Payslipsclick();
			

			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		 
			verify.verifyPayslip(data[10], data[11], data[12], data[13], data[14]);
			
			payroll.Click_PayrollDashboard();
			
			_4996Page.Page4996 page = new _4996Page.Page4996(driver);

			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.SwithToDefault();
			page.tickEmployeeACheckBox();
			page.clickUndoBtn1();
			page.SwithToDefault();
			payroll.SelecPeriodEndDate(data[8]);
			
//			payroll.runPayroll();
//			payroll.runPayroll2Times();
//			
//			System.out.println("hhi");
			//payroll.Click_PayrollDashboard();

			verify.assertAll();
	}
	
	
	@Test(priority=2)
	public void TC02validateTaxNiIfEmployeeB_Undo() throws Exception {
		sTestCaseID = "TC790";
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
		//OpenClient.Enter_EnterClientName2();

		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click_Payslipsclick();
		
		
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		 
		verify.verifyPayslip(data[10], data[11], data[12], data[13], data[14]);
		
		verify.assertAll();
	}
	
}
