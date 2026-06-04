package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC350_EmployementAllowance_WeekMonth  extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	//  @Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		
		sTestCaseID = "TC350";
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
		buisness.enterRegistrationDate(data[69]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[67]);
		Bk.Enter_CompanyAddressLine1(data[68]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[69]);
		Bk.Enter_NewEndDate(data[70]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[71]);
		company.enterRefrenceNumber(data[72]);
		company.accountOfficeReffrence(data[73]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		
		pages.FrequencySet freq= new pages.FrequencySet(driver);
		company.Enter_NomismaStartDate(data[81]);

		freq.Click_ClickAdditionalFrequecy();

		freq.Select_F2(data[82]);
		freq.Enter_WeeklyPayDate(data[81]);
		company.Click_ClickSave();

		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[74]);
		employee.enterFirstName(data[75]);
		employee.enterLastName(data[76]);
		employee.enterDateOfBirth(data[77]);
		employee.enterAddressLine(data[78]);
		employee.enterAddressLine2(data[79]);
		employee.enterPostCode(data[80]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[81]);
		employee.enterPayFrequency(data[82]);
		employee.enterNICategory(data[64]);
		employee.enterTaxCode(data[65]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[66]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[74]);
		employee.enterFirstName(data[83]);
		employee.enterLastName(data[84]);
		employee.enterDateOfBirth(data[77]);
		employee.enterAddressLine(data[78]);
		employee.enterAddressLine2(data[79]);
		employee.enterPostCode(data[80]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[81]);
		employee.enterPayFrequency(data[82]);
		employee.enterNICategory(data[64]);
		employee.enterTaxCode(data[85]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[66]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		employee.clickNewEmployee();
		employee.enterTitle(data[74]);
		employee.enterFirstName(data[86]);
		employee.enterLastName(data[87]);
		employee.enterDateOfBirth(data[77]);
		employee.enterAddressLine(data[78]);
		employee.enterAddressLine2(data[79]);
		employee.enterPostCode(data[80]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[81]);
		employee.enterPayFrequency(data[82]);
		employee.enterNICategory(data[64]);
		employee.enterTaxCode(data[88]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[89]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		employee.clickNewEmployee();
		employee.enterTitle(data[90]);
		employee.enterFirstName(data[91]);
		employee.enterLastName(data[92]);
		employee.enterDateOfBirth(data[77]);
		employee.enterAddressLine(data[78]);
		employee.enterAddressLine2(data[79]);
		employee.enterPostCode(data[80]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[81]);
		employee.enterPayFrequency(data[82]);
		employee.enterNICategory(data[64]);
		employee.enterTaxCode(data[93]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[66]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
	}
				
	@Test(priority=1)

	public void TC01validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC350";
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
//	    company.Click_gotoEditCompany();
//	    company.Click_clickPayrollDetails();
//	    company.Click_AllowancesSchemes();
//	    company.clickYesEmployementAllownaces();
//	    company.clickEnabledEmployementAllownaces();
//	    driver.navigate().refresh();
//	    payroll.Click_PayrollDashboard();

	 
		
//	    for(int i=0;i<=48;i++) {payroll.Run_Payroll(); Thread.sleep(1000); }
//
//	    company.Click_gotoEditCompany();
//		
//	    company.Click_clickPayrollDetails();
//	    company.Click_AllowancesSchemes();
//	    company.clickNoEmployementAllownaces();
//		
//	    
//	    payroll.Click_PayrollDashboard();
//	    payroll.Run_Payroll();
	    
	    
	   
	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   
	    payroll.SelectTaxYear(data[94]);
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowanceWeekly2(data[5],data[6], data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36],data[37],data[38],data[39],data[40],data[41],data[42],data[43],data[44],data[45],data[46],data[47],data[48],data[49],data[50],data[51],data[52],data[53],data[54],data[55],data[56]);
	    
        verify.assertAll();
}			
	
	@Test(priority=2)

	public void TC02validateP60Report() throws Exception {

		sTestCaseID = "TC350";
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
	    pages.reports report= new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_P45Forms();
	    
	    _5630OffPayrollWorkerPage.OffPayWorkerPage page= new   _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
	    page.clickP60PdfIcn6();
	    
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);

		verify.verifyP60Director1(data[57], data[58], data[59], data[60],data[61],data[62]);
	
		verify.assertAll();
	}
	
	
	@Test(priority=3)

	public void TC03validateXml() throws Exception {

		sTestCaseID = "TC350";
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
	     xml1.clickMayEps();
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);

	     verify.getXMLData();  
	  
	     verify.verifyEA_Tag(data[63]);
	 
	     payroll.scrollClickPayrollDashboard();
		  for(int i=0;i<=49;i++) {payroll.Undo_LastPayroll();  Thread.sleep(3000);}
         verify.assertAll();
}		

	
}
