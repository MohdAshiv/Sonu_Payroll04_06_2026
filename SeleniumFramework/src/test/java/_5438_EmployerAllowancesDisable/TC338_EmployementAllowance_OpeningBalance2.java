package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC338_EmployementAllowance_OpeningBalance2 extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
   //@Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		
		sTestCaseID = "TC338";
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

		employee.enterNICategory(data[49]);
		employee.enterTaxCode(data[32]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[33]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
				
		
	}
	
	
	@Test(priority=1)
	public void TC01validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC338";
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
		pages.OpeningBalanceEntry openingBalance = new pages.OpeningBalanceEntry(driver);

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        pages.EditCompany company= new pages.EditCompany(driver);
	    
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		
		edit.click_Paydetails();
		edit.enterBasicSalary(data[5]);
		edit.clickSaveBtn();
		edit.clickMandotoryPayroll();
		edit.enterTaxCode(data[7]);
		edit.enterNICategory(data[8]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		company.Click_gotoEditCompany();
       company.Click_clickPayrollDetails();

	    company.Click_clickPayrollSettings();
	    
	    company.Enter_NomismaStartDate(data[6]);
	    company.Click_ClickSave();
	    company.ClickOpeningBalance();
	    openingBalance.eneterEA(data[16]);
	    company.Click_ClickSave();
	    payroll.Click_PayrollDashboard();
	    
		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);
		employee.clickEmployeeName();

		openingBalance.Click_gotoOpeningBalances();
		
		openingBalance.Enter_EnterTaxCode(data[7]);
		openingBalance.Select_NICategoryCode(data[8]);
		openingBalance.Enter_EnterGrosspay(data[9]);
		openingBalance.Enter_EnterEmployeeNI(data[10]);
		openingBalance.Enter_EnterELtoPT(data[11]);

		openingBalance.Enter_TaxDeducted(data[12]);
		openingBalance.Enter_EmployerNI(data[13]);
		openingBalance.Enter_LEL(data[14]);
		openingBalance.Enter_PTtoUAP(data[15]);
		
		openingBalance.Click_clickSave();
		payroll.Click_PayrollDashboard();
	    for(int i=0;i<=2;i++) {payroll.Run_Payroll(); }
	    
	    company.Click_gotoEditCompany();

	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	  
        payroll.Click_PayrollDashboard();
	    for(int i=0;i<=1;i++) {payroll.Run_Payroll(); }
 
	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   
	    payroll.SelectTaxYear(data[31]);
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowance( data[16], data[17], data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28]);
	 
        verify.assertAll();
        
}				

	@Test(priority=2)

	public void TC02validateEmployementAllowanceTag() throws Exception {

		sTestCaseID = "TC338";
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

        pages.FilingManagement filling= new  pages.FilingManagement(driver);
	     filling.Click_gotoFilingManagement();
	    _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage xml1= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage(driver);
	   
	    payroll.SelectTaxYear(data[31]);

	    _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	     xml1.clickLast1Eps();
	     verify.getXMLData();  
	     verify.verifyEA_Tag(data[29]);
         verify.assertAll();
}	
	
	

	@Test(priority=3)

	public void TC03validateEmployementAllowancePayrollSummary() throws Exception {

		sTestCaseID = "TC338";
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

	    pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    payroll.SelectTaxYear(data[31]);

        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
         verify.verifyPayrollSummary1(data[30]);	   

         payroll.Click_PayrollDashboard();
 	    for(int i=0;i<=4;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000); }
        pages.EditCompany company= new pages.EditCompany(driver);

 	    company.Click_gotoEditCompany();

	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickNoEmployementAllownaces();
	    
	     payroll.Click_PayrollDashboard();
         verify.assertAll();
	
	}
}
