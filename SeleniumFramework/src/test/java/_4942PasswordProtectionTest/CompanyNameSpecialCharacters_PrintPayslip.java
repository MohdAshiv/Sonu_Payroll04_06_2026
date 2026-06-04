package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class CompanyNameSpecialCharacters_PrintPayslip  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	//  @Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		
		sTestCaseID = "TC159";
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
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		company.enterFirstName(data[30]);
		company.enterEmail(data[31]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[16]);
		company.enterRefrenceNumber(data[17]);
		company.accountOfficeReffrence(data[18]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[29]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[19]);
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[22]);
		employee.enterAddressLine(data[23]);
		employee.enterAddressLine2(data[24]);
		employee.enterPostCode(data[25]);
		employee.enterEmailAddress(data[31]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[29]);

		employee.enterNICategory(data[26]);
		employee.enterTaxCode(data[27]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[28]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
				
		
	}
	@Test(priority=1)

	public void TC_01validatePrintPayslipWithBothEmployeeEmployer() throws Exception {

		sTestCaseID = "TC159";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);//Sonu agent for Sandbox
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.UndoPayroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickEnabledPassProtectionEmployee();
	    company.selectTagEmployee(data[8]);
	 
	  
	   company.clickCreateBtnEmployee();
	    
	    //company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	   
	    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[8]);
	   
	    company.clickEnabledPassProtectionEmployer();
	    company.selectTag(data[10]);
	    company.clickCreateBtn();
	   // company.Click_ClickSave();
	    
	    
	    payroll.scrollClickPayrollDashboard();
	   
	    payroll.Run_Payroll();

	    pages.reports report = new pages.reports(driver);

	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	 
	     _5530FileNamePage.VerifyFileNmae verify1= new _5530FileNamePage.VerifyFileNmae(driver);
	        
	     verify.verifyPrintPayslip();
	     verify1.verifyDownloadFileName(data[11]);
	     verify1.asserAll();
	    
	    utilities.ChangeWindow.Switchwindow(2, driver);
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
        company.clickPasswordNoEmployer();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
		verify.PasswordNotEnabled();
	    verify.assertAll();
}
	
	
	@Test(priority=2)
	public void TC_02validatePrintPayslipWithEmployer() throws Exception {

		sTestCaseID = "TC159";
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
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.UndoPayroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();

	    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    company.clickEnabledPassProtectionEmployer();
	    company.selectTag(data[10]);
	    company.clickCreateBtn();
	    company.Click_ClickSave();
	    
	    
	    payroll.scrollClickPayrollDashboard();
	   
	    payroll.Run_Payroll();

	    pages.reports report = new pages.reports(driver);

	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	 
	     _5530FileNamePage.VerifyFileNmae verify1= new _5530FileNamePage.VerifyFileNmae(driver);
	        
	     verify.verifyPrintPayslip();
	     verify1.verifyDownloadFileName(data[11]);
	     verify1.asserAll();
	    
	    utilities.ChangeWindow.Switchwindow(2, driver);
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
        company.clickPasswordNoEmployer();
		company.Click_ClickSave();
		verify.PasswordNotEnabled();
	    verify.assertAll();
}
	
	
	@Test(priority=3)
	public void TC_03validatePrintPayslipWithEmployee() throws Exception {

		sTestCaseID = "TC159";
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
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.UndoPayroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickEnabledPassProtectionEmployee();
	    company.selectTagEmployee(data[8]);
	 
	  
	    company.clickCreateBtnEmployee();
	    
	    company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	   
	    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[8]);
	   
	    payroll.scrollClickPayrollDashboard();
	   
	    payroll.Run_Payroll();

	    pages.reports report = new pages.reports(driver);

	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	 
	     _5530FileNamePage.VerifyFileNmae verify1= new _5530FileNamePage.VerifyFileNmae(driver);
	        
	     verify.verifyPrintPayslip();
	     verify1.verifyDownloadFileName(data[11]);
	     verify1.asserAll();
	    
	    utilities.ChangeWindow.Switchwindow(2, driver);
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
	    verify.assertAll();
}
	
	
	@Test(priority=4)

	public void TC_04validatePrintPayslipRegenerate_Employer() throws Exception {

		sTestCaseID = "TC159";
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
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	
	    payroll.UndoPayroll();
	    payroll.Run_Payroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickEnabledPassProtectionEmployer();
	 
	    company.selectTag(data[10]);
	    company.clickCreateBtn();
	    
	    company.Click_ClickSave();
	  
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);

	     
	    payroll.Click_PayrollDashboard();

	    pages.reports report = new pages.reports(driver);

	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
        email.clickRegenerateBtn();
        
	 
	     _5530FileNamePage.VerifyFileNmae verify1= new _5530FileNamePage.VerifyFileNmae(driver);
	        
	  	 verify.verifyPrintPayslip();

	     verify1.verifyDownloadFileName(data[11]);
	     verify1.asserAll();
	    
	    utilities.ChangeWindow.Switchwindow(2, driver);
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.clickPasswordNoEmployer();
		company.Click_ClickSave();
		verify.PasswordNotEnabled();
	    verify.assertAll();
	   
}	

	
	

	@Test(priority=5)

	public void TC_05validatePrintPayslipRegenerate_Employee() throws Exception {

		sTestCaseID = "TC159";
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
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.UndoPayroll();
	    payroll.Run_Payroll();
		pages.EditCompany company = new pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.clickEnabledPassProtectionEmployee();
		company.selectTagEmployee(data[8]);

		company.clickCreateBtnEmployee();

		company.Click_ClickSave();

		company.clickIcnEmployee();

		_4942PasswordProtection_Page.VerifyResultEmployee verify = new _4942PasswordProtection_Page.VerifyResultEmployee(
				driver);

		verify.verifyEnterdPassword(data[9]);

		payroll.scrollClickPayrollDashboard();

	    pages.reports report = new pages.reports(driver);

	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
        email.clickRegenerateBtn();
        
	     _5530FileNamePage.VerifyFileNmae verify1= new _5530FileNamePage.VerifyFileNmae(driver);
	        
	  	 verify.verifyPrintPayslip();

	     verify1.verifyDownloadFileName(data[11]);
	     verify1.asserAll();
	    
	    utilities.ChangeWindow.Switchwindow(2, driver);
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
	    verify.assertAll();
	   
}	
	
	
	@Test(priority=6)

	public void TC_06validatePrintPayslipWithBothEmployeeEmployer() throws Exception {

		sTestCaseID = "TC159";
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
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.UndoPayroll();
	    payroll.Run_Payroll();
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_clickPayrollSettings();
	    company.clickEnabledPassProtectionEmployee();
	    company.selectTagEmployee(data[8]);
	 
	    company.clickCreateBtnEmployee();
	    
	    company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	   
	    
	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[9]);
	   
	    company.clickEnabledPassProtectionEmployer();
	    company.selectTag(data[10]);
	    company.clickCreateBtn();
	    company.Click_ClickSave();
	    
	    
	    payroll.scrollClickPayrollDashboard();
	   

	    pages.reports report = new pages.reports(driver);

	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	     email.clickRegenerateBtn();
	        
	     _5530FileNamePage.VerifyFileNmae verify1= new _5530FileNamePage.VerifyFileNmae(driver);
	        
	     verify.verifyPrintPayslip();
	    
	     verify1.verifyDownloadFileName(data[11]);
	     verify1.asserAll();
	    
	    utilities.ChangeWindow.Switchwindow(2, driver);
	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();
        company.clickPasswordNoEmployer();
		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
		verify.PasswordNotEnabled();
	    verify.assertAll();
}
	
}
