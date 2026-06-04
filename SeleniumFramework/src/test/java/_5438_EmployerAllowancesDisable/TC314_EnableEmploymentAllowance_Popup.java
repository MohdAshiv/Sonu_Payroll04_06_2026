package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC314_EnableEmploymentAllowance_Popup extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


 //   @Test(priority = 0)
	
		public void ClientSetup() throws Exception 
		{
			
			sTestCaseID = "TC314";
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
			buisness.enterBuisnessName1(data[4]);
			
			buisness.enterRegistrationNo();
			buisness.enterRegistrationDate(data[36]);
			buisness.enterFirstName();
			buisness.enterLastName();
			buisness.clickSaveBtn();
			
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
		
			pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
			Bk.Click_BKEdit();
			Bk.Select_services(data[34]);
			Bk.Enter_CompanyAddressLine1(data[35]);
			Bk.Click_Save();

			Bk.Click_AccountingPeriod();
			Bk.Click_AddAccountingPeriod();
			Bk.Enter_NewStartDate(data[36]);
			Bk.Enter_NewEndDate(data[37]);
			Bk.Click_AccPeriodSave();
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
			pages.EditCompany company= new 	pages.EditCompany(driver);
			
			company.Click_gotoEditCompany();
			company.Click_clickPayrollDetails();
			
			company.enterPayeNumber(data[38]);
			company.enterRefrenceNumber(data[39]);
			company.accountOfficeReffrence(data[40]);
			
			company.Click_ClickSave();
			company.Click_clickPayrollSettings();
			company.Enter_NomismaStartDate(data[48]);
			company.Click_ClickSave();
			pages.PayrollRun payroll= new pages.PayrollRun (driver);

		    payroll.Click_PayrollDashboard();
			
			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
			
			employee.clickNewEmployee();
			employee.enterTitle(data[41]);
			employee.enterFirstName(data[42]);
			employee.enterLastName(data[43]);
			employee.enterDateOfBirth(data[44]);
			employee.enterAddressLine(data[45]);
			employee.enterAddressLine2(data[46]);
			employee.enterPostCode(data[47]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[48]);

			employee.enterNICategory(data[31]);
			employee.enterTaxCode(data[32]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary1(data[33]);
			employee.clickSaveBtn();
		
			payroll.Click_PayrollDashboard();
					
			
		}
		
	@Test(priority=1)

	public void TC_01validateFinishBtnShouldDisableWithNoDropdownSelection() throws Exception {

		sTestCaseID = "TC314";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
	
		
	    pages.EditCompany company= new pages.EditCompany(driver);
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    
	    _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage page= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage (driver); 
	    page.selectNiLiablitiesOptions(data[5]);
	    
	    _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyAlertMsgAndFinishBtn(data[6]);
	  
	    
	   verify.assertAll();
	    
	
}
	
	
	@Test(priority=2)

	public void TC_02validateAlertIfEA_ExceedMaxLimit() throws Exception {

		sTestCaseID = "TC314";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
	
		
	    pages.EditCompany company= new pages.EditCompany(driver);
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    
	    _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage page= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage (driver); 
	    page.enterEmployementAllowance(data[7]);
	    company.clickEnabledEmployementAllownaces();
	    
	    _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyAlertMsg(data[8]);
	  
	    verify.assertAll();
	    
	
}
	
	
	
	@Test(priority=3)

	public void TC_03validateEA_EnableDisable() throws Exception {

		sTestCaseID = "TC314";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
	
	    pages.EditCompany company= new pages.EditCompany(driver);
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	    _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage page= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage (driver); 
	    
	    _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.enabledEmploymentAllowanceEA();
	    
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Run_Payroll();
	    
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickNoEmployementAllownaces();
	    
	    verify.disableEmploymentAllowanceEA();
	    
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();
	    
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    verify.disableEmploymentAllowanceEA();

	    verify.assertAll();
	    
	
}

}