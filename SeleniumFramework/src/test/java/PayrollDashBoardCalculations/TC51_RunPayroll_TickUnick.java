package PayrollDashBoardCalculations;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC51_RunPayroll_TickUnick extends TestBase {
	
		public String sTestCaseID = null;
		String[] data = null;
		String Sheet = null;
		
	@Test(priority=1)

	public void TC01validateTickUntick() throws Exception {

		sTestCaseID = "TC051";
		Sheet = "PayrollDashboardCalculations";
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
		buisness.enterRegistrationDate(data[88]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();

		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[86]);
		Bk.Enter_CompanyAddressLine1(data[87]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[88]);
		Bk.Enter_NewEndDate(data[89]);
		Bk.Click_AccPeriodSave();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		
	    company.Click_clickDepartments();		
		company.clickDepartment();
		company.enterDepartmentName1(data[12]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(15000);
			
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[108]);
		company.Click_ClickSave();
		
		
		
		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
	   pages.PensionSetup pension = new pages.PensionSetup(driver);
		
		pension.enterPensionStagingDate(data[93]);
		pension.enterSignatoryTitle();
		pension.enterSignatoryName();
		pension.enterEmailAddress(data[94]);
		pension.enterPhoneNumber();
		pension.enterPensionId(data[95]);
		pension.clickPensonDetailsSave();
		payroll.scrollClickPayrollDashboard();
		pension.clickPensionDashBoard();
		pension.addSchemeManually();
		pension.enterPensionSchemeName(data[96]);
		pension.selectPensionProvider(data[96]);
		pension.selectCalculationBasis(data[97]);
		pension.selectCalculationMethod(data[98]);
		pension.eeContribution(data[99]);
		pension.enterErContribution(data[100]);
		pension.enterSubgroupName();
		pension.enterGroupId();
		pension.enterSubGroupId();
		pension.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		for(int i=7;i<=11;i++) {
			
		employee.clickNewEmployee();
		employee.enterFirstName(data[i]);
		employee.enterLastName(data[103]);
		employee.enterDateOfBirth(data[104]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[107]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[108]);
		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[12 + (i - 7)]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		}
		payroll.runPayroll();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyAllCheckboxesAreTicked();
	    verify.unTickAllCheckboxesAndVerify();

	}


 @Test(priority=2)

public void TC02validateTotalRecordAfterTick() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
	payroll.runPayroll();
	payroll.selectRequiredEmployeesAndUntickRest(3);
	payroll.runPayroll2();
	PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

	verify.verifyTotalRecordDashboard("3");
	payroll.selectPreviousPayrollPeriod();
	verify.verifyTotalRecordDashboard("5");

	payroll.runPayroll();
	verify.verifyTotalRecordRunPayroll("2");
	payroll.runPayroll2();
	verify.verifyTotalRecordDashboard("5");

}
 

 @Test(priority=3)

public void TC03validatePayslipEmailWarning() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
   payroll.UndoPayroll();
   payroll.runPayroll();
   payroll.selectType(data[17]);
   
   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
   verify.verifyEmailWarning("Important! Company Main Contact email address not registered to send payroll reports to employer, Please add the same.");
   payroll.selectType(data[18]);
   verify.verifyEmailWarning("Important! None of the employee email address registered to send payslip, Please add the same or choose other option.");
   payroll.selectType(data[19]);
   verify.verifyEmailWarning("Important! None of the employee email address registered to send payslip, Please add the same or choose other option.");

   
   
}
 

 @Test(priority=4)

public void TC04validateEmailToMain_Selected() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
   // payroll.UndoPayroll();
   
	pages.EditCompany company= new 	pages.EditCompany(driver);
	
	company.Click_gotoEditCompany();
	company.ClickContactDetails();
	company.enterFirstName(data[20]);
	
	company.enterEmail(data[21]);
	company.clickAddContact();
	payroll.Click_PayrollDashboard();
	
	pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
	
	employee.click3Dots();
	employee.clickEditBtn();
	employee.enterEmailAddress(data[21]);
	employee.clickSaveNextBtn();
	employee.enterEmailAddress(data[21]);
	employee.clickSaveNextBtn();
	employee.enterEmailAddress(data[21]);
	employee.clickSaveNextBtn();
	employee.enterEmailAddress(data[21]);
	employee.clickSaveNextBtn();
	employee.enterEmailAddress(data[21]);
	employee.clickSaveBtn();
	payroll.Click_PayrollDashboard();

    payroll.runPayroll();

   payroll.selectType(data[17]);
   payroll.selectRequiredEmployeesAndUntickRest(3);

   payroll.runPayroll2();
   payroll.sendEmailFromRunPayroll();

  pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	
  emaillog.clickEmailDropDown();
  emaillog.clickEmailLog();
  emaillog.clickRecievedEmail();

 PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

  verify.verifyPayslipWithSummary(5);
   
}
 

 @Test(priority=5)

public void TC05validateEmailToEmployees_All() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
   payroll.UndoPayroll();
   
   payroll.runPayroll();

   payroll.selectType(data[18]);
   payroll.runPayroll2();
   payroll.sendEmailFromRunPayroll();

  pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	
  emaillog.clickEmailDropDown();
  emaillog.clickEmailLog();

   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

  verify.verifyRecievedEmployeePayslip(5);
   
}
 

 @Test(priority=6)

public void TC06validateEmailToMain_All() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
   payroll.UndoPayroll();
   
   payroll.runPayroll();

   payroll.selectType(data[17]);
   payroll.runPayroll2();
   payroll.sendEmailFromRunPayroll();

  pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	
  emaillog.clickEmailDropDown();
  emaillog.clickEmailLog();
  emaillog.clickRecievedEmail();

   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
  verify.verifyPayslipWithSummary(7);
   
}
 


 @Test(priority=7)

public void TC07validateEmailToEmployees_Selected() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
   payroll.UndoPayroll();
   
   payroll.runPayroll();

   payroll.selectType(data[18]);
   payroll.selectRequiredEmployeesAndUntickRest(2);

   payroll.runPayroll2();
   payroll.sendEmailFromRunPayroll();

  pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	
  emaillog.clickEmailDropDown();
  emaillog.clickEmailLog();

   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

  verify.verifyRecievedEmployeePayslip(2);
   
}
 
 

 @Test(priority=8)

public void TC08validateEmailToBoth_All() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
   payroll.UndoPayroll();
   
   payroll.runPayroll();

   payroll.selectType(data[19]);

   payroll.runPayroll2();
   payroll.sendEmailFromRunPayroll1();
   
   Thread.sleep(5000);//wait for a second to open a new PopUp
   payroll.sendEmailFromRunPayroll();

   
 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	
   emaillog.clickEmailDropDown();
   emaillog.clickEmailLog();
   emaillog.clickRecievedEmail();
   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);


	verify.verifyPayslipWithSummary(7);
	emaillog.clickEmailDropDown1();
   emaillog.clickEmailLog();
   verify.verifyRecievedEmployeePayslip1(5);  
   
}
 

 @Test(priority=9)

public void TC09validateEmailToBoth_Selected() throws Exception {

	sTestCaseID = "TC051";
	Sheet = "PayrollDashboardCalculations";
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
   payroll.UndoPayroll();
   
   payroll.runPayroll();

   payroll.selectType(data[19]);
   payroll.selectRequiredEmployeesAndUntickRest(3);

   payroll.runPayroll2();
   payroll.sendEmailFromRunPayroll1();
   
   Thread.sleep(5000);//wait for a second to open a new PopUp
   payroll.sendEmailFromRunPayroll();
   
 pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
	
   emaillog.clickEmailDropDown();
   emaillog.clickEmailLog();
   emaillog.clickRecievedEmail();
   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);


	verify.verifyPayslipWithSummary(5);
	emaillog.clickEmailDropDown1();
    emaillog.clickEmailLog();
    verify.verifyRecievedEmployeePayslip1(3);
  
   
}
}
