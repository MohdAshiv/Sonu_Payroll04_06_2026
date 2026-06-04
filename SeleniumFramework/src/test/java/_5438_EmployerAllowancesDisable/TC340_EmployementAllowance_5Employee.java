package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC340_EmployementAllowance_5Employee  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	//  @Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		
		sTestCaseID = "TC340";
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
		buisness.enterRegistrationDate(data[127]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[125]);
		Bk.Enter_CompanyAddressLine1(data[126]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[127]);
		Bk.Enter_NewEndDate(data[128]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[129]);
		company.enterRefrenceNumber(data[130]);
		company.accountOfficeReffrence(data[131]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		
		
		
		company.Enter_NomismaStartDate(data[139]);
		
        pages.FrequencySet freq= new pages.FrequencySet(driver);
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[140]);
		freq.Enter_WeeklyPayDate(data[139]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[132]);
		employee.enterFirstName(data[133]);
		employee.enterLastName(data[134]);
		employee.enterDateOfBirth(data[135]);
		employee.enterAddressLine(data[136]);
		employee.enterAddressLine2(data[137]);
		employee.enterPostCode(data[138]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[139]);

		employee.enterNICategory(data[122]);
		employee.enterTaxCode(data[123]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[124]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
				
		
		employee.clickNewEmployee();
		employee.enterTitle(data[132]);
		employee.enterFirstName(data[119]);
		employee.enterLastName(data[120]);
		employee.enterDateOfBirth(data[135]);
		employee.enterAddressLine(data[136]);
		employee.enterAddressLine2(data[137]);
		employee.enterPostCode(data[138]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[139]);

		employee.enterNICategory(data[122]);
		employee.enterTaxCode(data[123]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[121]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		employee.clickNewEmployee();
		employee.enterTitle(data[132]);
		employee.enterFirstName(data[116]);
		employee.enterLastName(data[117]);
		employee.enterDateOfBirth(data[135]);
		employee.enterAddressLine(data[136]);
		employee.enterAddressLine2(data[137]);
		employee.enterPostCode(data[138]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[139]);

		employee.enterNICategory(data[122]);
		employee.enterTaxCode(data[123]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[118]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[112]);
		employee.enterFirstName(data[113]);
		employee.enterLastName(data[114]);
		employee.enterDateOfBirth(data[135]);
		employee.enterAddressLine(data[136]);
		employee.enterAddressLine2(data[137]);
		employee.enterPostCode(data[138]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[139]);

		employee.enterNICategory(data[122]);
		employee.enterTaxCode(data[123]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[115]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[132]);
		employee.enterFirstName(data[110]);
		employee.enterLastName(data[111]);
		employee.enterDateOfBirth(data[135]);
		employee.enterAddressLine(data[136]);
		employee.enterAddressLine2(data[137]);
		employee.enterPostCode(data[138]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[139]);

		employee.enterNICategory(data[122]);
		employee.enterTaxCode(data[123]);
		employee.clickSaveBtn();
	
	
		payroll.Click_PayrollDashboard();
		
	}

	@Test(priority=1)
	public void TC01validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC340";
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
	    
	
        company.Click_gotoEditCompany();
     
	    company.ClickOpeningBalance();
	    openingBalance.eneterEA(data[40]);
	    company.Click_ClickSave();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	    Thread.sleep(3000);
	    payroll.Click_PayrollDashboard();
		edit.clickEmployeeName();

		openingBalance.Click_gotoOpeningBalances();
		
		openingBalance.Enter_EnterTaxCode(data[5]);
	
		openingBalance.Enter_EnterGrosspay(data[6]);
		openingBalance.Enter_EnterEmployeeNI(data[7]);
		openingBalance.Enter_EnterNetPay(data[8]);
		openingBalance.Enter_EnterELtoPT(data[9]);

		openingBalance.Enter_TaxDeducted(data[10]);
		openingBalance.Enter_EmployerNI(data[11]);
		openingBalance.Enter_LEL(data[12]);
		openingBalance.Enter_PTtoUAP(data[13]);
		
		openingBalance.Click_clickSave();
		payroll.Click_PayrollDashboard();
	
        edit.clickEmployeeName1();

		openingBalance.Click_gotoOpeningBalances();
		
		openingBalance.Enter_EnterTaxCode(data[5]);
		openingBalance.Enter_EnterGrosspay(data[14]);
		openingBalance.Enter_EnterEmployeeNI(data[15]);
		openingBalance.Enter_EnterNetPay(data[16]);

		openingBalance.Enter_EnterELtoPT(data[17]);
		openingBalance.Enter_EmployeePension(data[18]);
		openingBalance.Enter_EmployerPension(data[19]);

		openingBalance.Enter_TaxDeducted(data[20]);
		openingBalance.Enter_EmployerNI(data[21]);
		openingBalance.Enter_LEL(data[22]);
		openingBalance.Enter_PTtoUAP(data[23]);
		
		openingBalance.Click_clickSave();
		payroll.Click_PayrollDashboard();

        edit.clickEmployeeName2();

		openingBalance.Click_gotoOpeningBalances();
		
		openingBalance.Enter_EnterTaxCode(data[5]);
		openingBalance.Enter_EnterGrosspay(data[24]);
		openingBalance.Enter_EnterEmployeeNI(data[25]);
		openingBalance.Enter_EnterNetPay(data[26]);

		openingBalance.Enter_EnterELtoPT(data[27]);

		openingBalance.Enter_TaxDeducted(data[28]);
		openingBalance.Enter_EmployerNI(data[29]);
		openingBalance.Enter_LEL(data[30]);
		openingBalance.Enter_PTtoUAP(data[31]);
		
		openingBalance.Click_clickSave();
		payroll.Click_PayrollDashboard();
	    
	  
        edit.clickEmployeeName3();

		openingBalance.Click_gotoOpeningBalances();
		
		openingBalance.Enter_EnterTaxCode(data[5]);

		openingBalance.Enter_EnterGrosspay(data[32]);
		openingBalance.Enter_EnterEmployeeNI(data[33]);
		openingBalance.Enter_EnterNetPay(data[34]);

		openingBalance.Enter_EnterELtoPT(data[35]);

		openingBalance.Enter_TaxDeducted(data[36]);
		openingBalance.Enter_EmployerNI(data[37]);
		openingBalance.Enter_LEL(data[38]);
		openingBalance.Enter_PTtoUAP(data[39]);
		
		openingBalance.Click_clickSave();
		payroll.Click_PayrollDashboard();
	    
	    for(int i=0;i<=37;i++) {payroll.Run_Payroll(); }
	    
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickNoEmployementAllownaces();
	   
        payroll.Click_PayrollDashboard();

        payroll.Run_Payroll();
 
	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowanceWeekly1( data[40], data[41], data[42],data[43],data[44],data[45],data[46],data[47],data[48],data[49],data[50],data[51],data[52],data[53], data[54], data[55],data[56],data[57],data[58],data[59],data[60],data[61],data[62],data[63],data[64],data[65],data[66], data[67], data[68],data[69],data[70],data[71],data[72],data[73],data[74],data[75],data[76],data[77],data[78],data[79] ,data[80], data[81],data[82],data[83],data[84],data[85],data[86],data[87],data[88],data[89]);
        verify.assertAll();
       
}			
	
	
	@Test(priority=2)

	public void TC02validateEmployementAllowancePayrollSummary() throws Exception {

		sTestCaseID = "TC340";
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
	   
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
        verify.verifyPayrollSummary(data[89],data[90]);	   

        verify.assertAll();
	
	}

	

	@Test(priority=3)

	public void TC03validateP60Report() throws Exception {

		sTestCaseID = "TC340";
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
       for(int i=0;i<=2;i++) {payroll.Run_Payroll(); }
	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	  
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickP60PdfIcn7();
	    
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);

		verify.verifyP60Director(data[100], data[101], data[102], data[103],data[104],data[105]);
	
		verify.assertAll();
	}
	@Test(priority=4)

	public void TC04validateXml() throws Exception {

		sTestCaseID = "TC340";
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
	     
	     payroll.SelectTaxYear(data[141]);
	     filling.clickFps();
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);

	     verify.getXMLData();  

	     verify.verifyXml(data[91], data[92], data[93], data[94], data[95], data[96], data[97], data[98], data[99]);  
	 
	     payroll.scrollClickPayrollDashboard();
		 for(int i=0;i<=41;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000); }

         verify.assertAll();
}		

	
	
}
