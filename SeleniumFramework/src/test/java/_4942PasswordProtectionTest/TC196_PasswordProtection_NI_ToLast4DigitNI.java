package _4942PasswordProtectionTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ChangeWindow;
import utilities.ExcelData;

public class TC196_PasswordProtection_NI_ToLast4DigitNI extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	    //@Test(priority = 0)
		
		public void ClientSetup() throws Exception 
		{
			sTestCaseID = "TC196";
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
		}
	@Test(priority=1)

	public void TC01validatePasswordShouldBeNiNumberOnEmailProcessPage() throws Exception {

		sTestCaseID = "TC196";
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
	    
	    company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	    

	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[6]);
	   
	    payroll.scrollClickPayrollDashboard();
	    
	    for(int i=0;i<=1;i++) {payroll.Run_Payroll();}
	    payroll.runPayroll();
	    payroll.selectType(data[7]);
	    payroll.runPayroll2();
        payroll.selectPayrollSummaryAndSend();
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedPayslipPasswordProtected20(data[8]);
	    verify.VerifyRecivedPayslipPasswordProtected21(data[8]);
	    ChangeWindow.Switchwindow(2, driver);

	    pages.reports report= new  pages.reports(driver);
	    
		report.Click__Reports_();
		report.Click_Payslipsclick();
		

	    email.selectEmailType(data[9]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtn();

//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();


		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
	    verify.VerifyRecivedPayslipPasswordProtected20(data[8]);
	    verify.VerifyRecivedPayslipPasswordProtected21(data[8]);
	    
	    ChangeWindow.Switchwindow(2, driver);

	  //  payroll.scrollClickPayrollDashboard();
	    report.Click__Reports_();
		report.Click_Payslipsclick();
		
		email.selectEmailType(data[10]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtnEmployee();
//	    email.closePopup();
//	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
	    emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

	    verify.VerifyRecivedPayslipPasswordProtected22(data[8]);

	    verify.assertAll();
}
	
	

	@Test(priority=2)

	public void TC02validatePasswordShouldBeLast4DigitNiNumberOnEmailProcessPage() throws Exception {

		sTestCaseID = "TC196";
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
	    company.clickChangePassword();
	    
	    company. selectTagEmployee(data[13]);
	 
	  
	    company.clickCreateBtnEmployee();
	    
	    company.Click_ClickSave();
	 
	    company.clickIcnEmployee();
	    

	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	     
	    verify.verifyEnterdPassword(data[14]);
	   
	    payroll.scrollClickPayrollDashboard();
	    
	    
	    payroll.runPayroll();
	    payroll.selectType(data[7]);
	    payroll.runPayroll2();
        payroll.selectPayrollSummaryAndSend();
	    
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    verify.VerifyRecivedPayslipPasswordProtected23(data[12]);
	    verify.VerifyRecivedPayslipPasswordProtected24(data[12]);
	    ChangeWindow.Switchwindow(2, driver);

	    pages.reports report= new  pages.reports(driver);
	    
		report.Click__Reports_();
		report.Click_Payslipsclick();
		
	    email.selectEmailType(data[9]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtn();
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

	    verify.VerifyRecivedPayslipPasswordProtected23(data[12]);
	    verify.VerifyRecivedPayslipPasswordProtected24(data[12]);
	    ChangeWindow.Switchwindow(2, driver);

	  // payroll.scrollClickPayrollDashboard();
	    
	    report.Click__Reports_();
		report.Click_Payslipsclick();
		
		email.selectEmailType(data[10]);
	    email.clickPayslipEmailBtn();
	    email.clickSendBtnEmployee();
	   // email.closePopup();        
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	
	    verify.VerifyRecivedPayslipPasswordProtected25(data[12]);

	    verify.assertAll();
}

	

	@Test(priority=3)

	public void TC03validatePasswordShouldBeLast4DigitNiNumberOnPayrollSummary() throws Exception {

		sTestCaseID = "TC196";
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

	    pages.reports report= new  pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    _4942PasswordProtection_Page.EmailPage email= new   _4942PasswordProtection_Page.EmailPage(driver);

        email.clickEmailBtn();
	    
	    email.clickSendBtn();
	    
//	    email.clickEmailLog();
//	    email.clickRecievedPayroll();
	    pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
	    

	   _4942PasswordProtection_Page.VerifyResultEmployee verify= new _4942PasswordProtection_Page.VerifyResultEmployee(driver);
	    verify.VerifyRecivedPayslipPasswordProtected23(data[12]);
	    verify.VerifyRecivedPayslipPasswordProtected24(data[12]); 
	    ChangeWindow.Switchwindow(2, driver);

	    //payroll.scrollClickPayrollDashboard();
	    
	    payroll.Click_PayrollDashboard();
	    for (int i=0;i<=3;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}

	    company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_clickPayrollSettings();

		company.clickPasswordNoEmployee();
		company.Click_ClickSave();
		verify.PasswordNotEnabledEmployee();
	    verify.assertAll();
}
	
}
