package _12513_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC763_TaxCodeW1M1_Weekly  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void validateTaxCalculation() throws Exception {

		sTestCaseID = "TC763";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[46]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[44]);
		Bk.Enter_CompanyAddressLine1(data[45]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[46]);
		Bk.Enter_NewEndDate(data[47]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[48]);
		company.enterRefrenceNumber(data[49]);
		company.accountOfficeReffrence(data[50]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[57]);
		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[40]);
		freq.Enter_WeeklyPayDate(data[57]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
	pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[51]);
		employee.enterLastName(data[52]);
		employee.enterDateOfBirth(data[53]);
		employee.enterAddressLine(data[54]);
		employee.enterAddressLine2(data[55]);
		employee.enterPostCode(data[56]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[57]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[41]);
		employee.clickM1W1Basis();
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[58]);
		employee.enterLastName(data[52]);
		employee.enterDateOfBirth(data[53]);
		employee.enterAddressLine(data[54]);
		employee.enterAddressLine2(data[55]);
		employee.enterPostCode(data[56]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[57]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[42]);
		employee.clickM1W1Basis();

		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[7]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[59]);
		employee.enterLastName(data[52]);
		employee.enterDateOfBirth(data[53]);
		employee.enterAddressLine(data[54]);
		employee.enterAddressLine2(data[55]);
		employee.enterPostCode(data[56]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[57]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[43]);
		employee.clickM1W1Basis();

		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[8]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
	    		
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	   
	    verify.verifyTaxDashBoard(data[19], data[20], data[21], data[22], data[23], data[24], data[25], data[26], data[27], data[28], data[29],data[30]);

        verify.assertAll();
	
}

	
}
