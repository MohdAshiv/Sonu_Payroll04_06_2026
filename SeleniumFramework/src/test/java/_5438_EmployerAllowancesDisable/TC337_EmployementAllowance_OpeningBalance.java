package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC337_EmployementAllowance_OpeningBalance extends TestBase{
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	 //  @Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		
		sTestCaseID = "TC337";
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
		buisness.enterRegistrationDate(data[51]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[49]);
		Bk.Enter_CompanyAddressLine1(data[50]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[51]);
		Bk.Enter_NewEndDate(data[52]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[53]);
		company.enterRefrenceNumber(data[54]);
		company.accountOfficeReffrence(data[55]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[63]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[56]);
		employee.enterFirstName(data[57]);
		employee.enterLastName(data[58]);
		employee.enterDateOfBirth(data[59]);
		employee.enterAddressLine(data[60]);
		employee.enterAddressLine2(data[61]);
		employee.enterPostCode(data[62]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[63]);

		employee.enterNICategory(data[46]);
		employee.enterTaxCode(data[47]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[48]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
				
		
	}
	
	
	@Test(priority=1)
	public void TC01validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC337";
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
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	    company.Click_clickPayrollSettings();
	    
	    company.Enter_NomismaStartDate(data[6]);
	    company.Click_ClickSave();
	    company.ClickOpeningBalance();
	    openingBalance.eneterEA(data[15]);
	    company.Click_ClickSave();
	    payroll.Click_PayrollDashboard();
	    
		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);
		employee.clickEmployeeName();


		openingBalance.Click_gotoOpeningBalances();
		openingBalance.Enter_EnterTaxCode(data[7]);
		openingBalance.Enter_EnterGrosspay(data[8]);
		openingBalance.Enter_EnterEmployeeNI(data[9]);
		openingBalance.Enter_EnterELtoPT(data[10]);

		openingBalance.Enter_TaxDeducted(data[11]);
		openingBalance.Enter_EmployerNI(data[12]);
		openingBalance.Enter_LEL(data[13]);
		openingBalance.Enter_PTtoUAP(data[14]);
		
		openingBalance.Click_clickSave();
		payroll.Click_PayrollDashboard();
	
	    
	    for(int i=0;i<=1;i++) {payroll.Run_Payroll(); }

		company.Click_gotoEditCompany();

	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickNoEmployementAllownaces();
	 
        payroll.Click_PayrollDashboard();
	    for(int i=0;i<=3;i++) {payroll.Run_Payroll(); }


	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   payroll.SelectTaxYear(data[45]);
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowance( data[15], data[16], data[17], data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27]);
	    
	  
       verify.assertAll();
}			
	

	@Test(priority=2)

	public void TC02validateEmployementAllowanceTag() throws Exception {

		sTestCaseID = "TC337";
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
	     payroll.SelectTaxYear(data[45]);
	     _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage xml1= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage(driver);
	     xml1.clickAprilEps();
	  
	     _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	     verify.getXMLData();  
	     verify.verifyEA_Tag(data[28]);
	     xml1.clickLastEps();
	     verify.getXMLData();  
	     verify.verifyEA_Tag(data[29]);
         verify.assertAll();
}		

	@Test(priority=3)

	public void TC03validateEmployementAllowancePayrollSummary() throws Exception {

		sTestCaseID = "TC337";
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
		   payroll.SelectTaxYear(data[45]);

        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
         verify.verifyPayrollSummary1(data[30]);	   

         verify.assertAll();
	
	}
	
	

	@Test(priority=4)

	public void TC04validateXml() throws Exception {

		sTestCaseID = "TC337";
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
		  payroll.SelectTaxYear(data[45]);

	     filling.clickFps();
	     _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage xml1= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage(driver); ;
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);

	     verify.getXMLData();  

	     verify.verifyXml(data[36], data[37], data[38], data[39], data[40], data[41], data[42], data[43], data[44]);  
	 
         verify.assertAll();
}		
	
	
	@Test(priority=5)

	public void TC05validateP11() throws Exception {

		sTestCaseID = "TC337";
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
	    report.Click_P11();
	    payroll.SelectTaxYear(data[45]);

        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
        verify.P11Report(data[31],data[32],data[33],data[34],data[35]);	   
	     payroll.scrollClickPayrollDashboard();
	    for(int i=0;i<=5;i++) {payroll.Undo_LastPayroll(); }
        verify.assertAll();
	}
	   
	
}
