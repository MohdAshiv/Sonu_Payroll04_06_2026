package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC207_PasswordProtection_P60 extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	//   @Test(priority = 0)
	
			public void ClientSetup() throws Exception 
			{
				sTestCaseID = "TC207";
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
				buisness.enterRegistrationDate(data[17]);
				buisness.enterFirstName();
				buisness.enterLastName();
				buisness.clickSaveBtn();
				
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName(data[4]);
				OpenClient.Click_ClickSearch();
			
				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
				Bk.Click_BKEdit();
				Bk.Select_services(data[15]);
				Bk.Enter_CompanyAddressLine1(data[16]);
				Bk.Click_Save();

				Bk.Click_AccountingPeriod();
				Bk.Click_AddAccountingPeriod();
				Bk.Enter_NewStartDate(data[17]);
				Bk.Enter_NewEndDate(data[18]);
				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName(data[4]);
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
				
				pages.EditCompany company= new 	pages.EditCompany(driver);
				
				company.Click_gotoEditCompany();
				company.ClickContactDetails();
				company.enterFirstName(data[33]);
				company.enterEmail(data[34]);
				company.clickAddContact();
				company.Click_clickPayrollDetails();
				
				company.enterPayeNumber(data[19]);
				company.enterRefrenceNumber(data[20]);
				company.accountOfficeReffrence(data[21]);
				company.Click_ClickSave();
				company.Click_clickPayrollSettings();
				company.Enter_NomismaStartDate(data[32]);
				company.Click_ClickSave();
				pages.PayrollRun payroll= new pages.PayrollRun (driver);

			    payroll.Click_PayrollDashboard();
				
				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
				
				employee.clickNewEmployee();
				employee.enterTitle(data[22]);
				employee.enterFirstName(data[23]);
				employee.enterLastName(data[24]);
				employee.enterDateOfBirth(data[25]);
				employee.enterAddressLine(data[26]);
				employee.enterAddressLine2(data[27]);
				employee.enterPostCode(data[28]);
				employee.enterEmailAddress(data[34]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[32]);

				employee.enterNICategory(data[29]);
				employee.enterTaxCode(data[30]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[31]);
				employee.clickSaveBtn();
				payroll.Click_PayrollDashboard();
				
				
				employee.clickNewEmployee();
				employee.enterTitle(data[22]);
				employee.enterFirstName(data[35]);
				employee.enterLastName(data[36]);
				employee.enterDateOfBirth(data[25]);
				employee.enterAddressLine(data[26]);
				employee.enterAddressLine2(data[27]);
				employee.enterPostCode(data[28]);
				employee.enterEmailAddress(data[34]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[32]);

				employee.enterNICategory(data[29]);
				employee.enterTaxCode(data[30]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[31]);
				employee.clickSaveBtn();
				
				payroll.Click_PayrollDashboard();
				
				employee.clickNewEmployee();
				employee.enterTitle(data[22]);
				employee.enterFirstName(data[37]);
				employee.enterLastName(data[38]);
				employee.enterDateOfBirth(data[25]);
				employee.enterAddressLine(data[26]);
				employee.enterAddressLine2(data[27]);
				employee.enterPostCode(data[28]);
				employee.enterEmailAddress(data[34]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[32]);

				employee.enterNICategory(data[29]);
				employee.enterTaxCode(data[30]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[31]);
				employee.clickSaveBtn();
				
				payroll.Click_PayrollDashboard();
				employee.clickNewEmployee();
				employee.enterTitle(data[39]);
				employee.enterFirstName(data[41]);
				employee.enterLastName(data[42]);
				employee.enterDateOfBirth(data[25]);
				employee.enterAddressLine(data[26]);
				employee.enterAddressLine2(data[27]);
				employee.enterPostCode(data[28]);
				employee.enterEmailAddress(data[34]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[32]);

				employee.enterNICategory(data[29]);
				employee.enterTaxCode(data[30]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[31]);
				employee.clickSaveBtn();
				
				payroll.Click_PayrollDashboard();
				
				
				employee.clickNewEmployee();
				employee.enterTitle(data[40]);
				employee.enterFirstName(data[43]);
				employee.enterLastName(data[44]);
				employee.enterDateOfBirth(data[25]);
				employee.enterAddressLine(data[26]);
				employee.enterAddressLine2(data[27]);
				employee.enterPostCode(data[28]);
				employee.enterEmailAddress(data[34]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[32]);

				employee.enterNICategory(data[29]);
				employee.enterTaxCode(data[30]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[31]);
				employee.clickSaveBtn();
				
				payroll.Click_PayrollDashboard();
			}
	@Test(priority=1)

	public void validateEmployerPasswordP60() throws Exception {

		sTestCaseID = "TC207";
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

		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickEnabledPassProtectionEmployee();
	    company.selectTagEmployee(data[5]);
	 
	  
	     company.clickCreateBtnEmployee();
	   
	 
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);	   
	    company.clickEnabledPassProtectionEmployer();
	    company.selectTag(data[6]);
	    company.clickCreateBtn();
	    company.Click_ClickSave();
	   
	    
	    payroll.scrollClickPayrollDashboard();
	    
		for (int i = 0; i <= 11; i++) {payroll.Run_Payroll();}
			
		

		pages.reports report = new pages.reports(driver);

		report.Click__Reports_();
		report.Click_P45Forms();
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.selectEmailType(data[7]);
	    email.clickCheckBoxAllP60();

		email.clickEmailBtnP60();
		email.clickSendBtnP60();
//		email.closePopupP60();
//
//		email.clickEmailLog();
//		email.clickRecievedPayroll();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

		verify.VerifPPFile();
		verify.VerifyRecivedP60PasswordProtected9(data[9]);
	
		verify.assertAll();

}
	
	

	@Test(priority=2)

	public void validateEmployeePasswordP60() throws Exception {

		sTestCaseID = "TC207";
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

		pages.EditCompany company= new pages.EditCompany(driver);
 
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);

		



//
		pages.reports report = new pages.reports(driver);

		report.Click__Reports_();
		report.Click_P45Forms();
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.selectEmailType(data[8]);
	    email.clickCheckBoxAllP60();

		email.clickEmailBtnP60();
		email.clickSendBtnP60();
//		email.closePopupP60();
//
//		email.clickEmailLog();
//		email.clickRecievedPayroll();
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

		verify.VerifyRecivedP60PasswordProtected10(data[9]);
	    ChangeWindow.Switchwindow(2, driver);

//		payroll.scrollClickPayrollDashboard();
	    
	    payroll.Click_PayrollDashboard();
		for (int i = 0; i <= 11; i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
		

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.clickPasswordNoEmployer();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
		verify.assertAll();

}
	
	
}
