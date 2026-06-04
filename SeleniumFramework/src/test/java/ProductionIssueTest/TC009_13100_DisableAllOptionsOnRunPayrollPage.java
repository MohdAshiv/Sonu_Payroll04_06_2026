package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC009_13100_DisableAllOptionsOnRunPayrollPage  extends TestBase{
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	@Test(priority=1)
	public void RunPayrollPageWithDontSend() throws Exception 
	{
		
		sTestCaseID = "TC009";
		Sheet = "Sheet7";
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
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//	    buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[14]);
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
//		Bk.Select_services(data[12]);
//		Bk.Enter_CompanyAddressLine1(data[13]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[14]);
//		Bk.Enter_NewEndDate(data[15]);
//		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
//		company.Click_gotoEditCompany();
//		company.ClickContactDetails();
//		company.enterFirstName(data[30]);
//		company.enterEmail(data[31]);
//		company.clickAddContact();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[16]);
//		company.enterRefrenceNumber(data[17]);
//		company.accountOfficeReffrence(data[18]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[29]);
//		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//	    payroll.Click_PayrollDashboard();
//		
//		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[19]);
//		employee.enterFirstName(data[20]);
//		employee.enterLastName(data[21]);
//		employee.enterDateOfBirth(data[22]);
//		employee.enterAddressLine(data[23]);
//		employee.enterAddressLine2(data[24]);
//		employee.enterPostCode(data[25]);
//		employee.enterEmailAddress(data[31]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[29]);
//
//		employee.enterNICategory(data[26]);
//		employee.enterTaxCode(data[27]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[28]);
//		employee.clickSaveBtn();
//	
//		payroll.Click_PayrollDashboard();
		
		payroll.runPayroll();
		//payroll.runPayroll_2();

		
   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);   		
   		verify.verifyRunPayrollPage();
				
		
	}
	

	@Test(priority=2)
	public void RunPayrollPageWithToMainContact() throws Exception 
	{
		
		sTestCaseID = "TC009";
		Sheet = "Sheet7";
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
		payroll.selectType(data[5]);
		payroll.runPayroll_2();

		
   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);   		
   		verify.verifyRunPayrollPage();
				
		
	}

}
