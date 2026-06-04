package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC528_NI_Letter_A_Monthly_EA_OpeningBalance  extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateEmployerAllowances() throws Exception {

		sTestCaseID = "TC528";
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
//  
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[29]); 
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[69]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName();
		pages.OpeningBalanceEntry openingBalance= new pages.OpeningBalanceEntry(driver);
		
		openingBalance.Click_gotoOpeningBalances();
		openingBalance.Enter_EnterTaxCode(data[30]);
		openingBalance.Enter_EnterGrosspay(data[31]);
		openingBalance.Enter_EnterEmployeeNI(data[32]);
		openingBalance.Enter_EnterNetPay(data[33]);
		openingBalance.Enter_EnterELtoPT(data[34]);
		openingBalance.Enter_EmployeePension(data[35]);
		openingBalance.Enter_EmployerPension(data[36]);
		openingBalance.Enter_TaxDeducted(data[37]);
		openingBalance.Enter_EmployerNI(data[38]);
		openingBalance.Enter_LEL(data[39]);
		openingBalance.Enter_PTtoUAP(data[40]);
		openingBalance.Click_clickSave();
		
		payroll.Click_PayrollDashboard();

		pages.ProcessPay page = new pages.ProcessPay(driver);

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
		company.clickEnabledEmployementAllownaces();

		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
	
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);

	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   
	    verify.verifyEmployementAllowance( data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],data[19],data[20],data[21],data[22]);
	    pages.FilingManagement filling=  new pages.FilingManagement(driver);
		
	 	filling.Click_gotoFilingManagement();
	 		
	 		
		_6440_Page.fpsPage fps = new _6440_Page.fpsPage(driver);
		fps.clickAprilEps();
		verify.getXMLData();
		verify.verifyEA_Tag(data[13]);
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		verify.verifyPayrollSummaryEA(data[12]);
	    verify.assertAll();
	
}	
}
