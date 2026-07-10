package _4996Test;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC622_UndoPayroll_EmployeeA extends TestBase {
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateTaxNIBothEmployee() throws Exception {
		sTestCaseID = "TC622";
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
			
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		 
			verify.verifyTax(data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18], data[19], data[20], data[21]);
			verify.verifyEmployeeNI(data[22], data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30], data[31], data[32], data[33]);
			verify.verifyEmployerNI(data[34], data[35], data[36], data[37], data[38], data[39], data[40], data[41], data[42], data[43], data[44], data[45]);
			verify.assertAll();
	}
	
	
	@Test(priority=2)
	public void TC02validateTaxNiIfEmployeeA_Undo() throws Exception {
		sTestCaseID = "TC622";
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
	//	OpenClient.Enter_EnterClientName(data[4]);
	    OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Run_Payroll();
		page.clickUndoLastPayrollBtn();
		page.clickNameCheckBox();
		page.SwithToDefault();
		page.tickEmployeeACheckBox();
		page.clickUndoBtn1();
		page.SwithToDefault();
		
		payroll.SelecPeriodEndDate(data[8]);
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[46]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
	   _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		 
		verify.verifyTax(data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81], data[82], data[83]);
		verify.verifyEmployeeNI(data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93], data[94], data[95]);
		verify.verifyEmployerNI(data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105], data[106], data[107]);
		
		verify.assertAll();
	}
}
