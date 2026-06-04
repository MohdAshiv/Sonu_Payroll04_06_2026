package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC584_PayrollSummary_2Weekly extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void validateDataConsistentlyRemains() throws Exception {

		sTestCaseID = "TC584";
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
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[9]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[7]);
		Bk.Enter_CompanyAddressLine1(data[8]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[9]);
		Bk.Enter_NewEndDate(data[10]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[11]);
		company.enterRefrenceNumber(data[12]);
		company.accountOfficeReffrence(data[13]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[20]);
		
		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[21]);
		freq.Enter_FortnightlyPayDate(data[20]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[22]);
		employee.enterFirstName(data[14]);
		employee.enterLastName(data[15]);
		employee.enterDateOfBirth(data[16]);
		employee.enterAddressLine(data[17]);
		employee.enterAddressLine2(data[18]);
		employee.enterPostCode(data[19]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[20]);

		employee.enterNICategory(data[5]);
		employee.enterTaxCode(data[6]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		System.out.println("mvhc");
		employee.enterBasicSalary3(data[4]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[23]);
		employee.enterFirstName(data[14]);
		employee.enterLastName(data[24]);
		employee.enterDateOfBirth(data[16]);
		employee.enterAddressLine(data[17]);
		employee.enterAddressLine2(data[18]);
		employee.enterPostCode(data[19]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[20]);

		employee.enterNICategory(data[5]);
		employee.enterTaxCode(data[6]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[4]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		
		employee.clickNewEmployee();
		employee.enterTitle(data[22]);
		employee.enterFirstName(data[14]);
		employee.enterLastName(data[25]);
		employee.enterDateOfBirth(data[16]);
		employee.enterAddressLine(data[17]);
		employee.enterAddressLine2(data[18]);
		employee.enterPostCode(data[19]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[20]);

		employee.enterNICategory(data[5]);
		employee.enterTaxCode(data[6]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[27]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		

        for(int i=0;i<=1;i++)	{payroll.Run_Payroll();}	
        
        
        
    	_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

 		   processPay.click3Dots();
 		   processPay.clickProcessPay();
 		   processPay.enterBasicPay(data[34]);
           processPay.clickSaveBtn();
           
           processPay.click3Dot2();
 		   processPay.clickProcessPay2();
 		   processPay.enterBasicPay(data[34]);
           processPay.clickSaveBtn();
           
           processPay.click3Dot3();
 		   processPay.clickProcessPay3();
 		   processPay.enterBasicPay(data[34]);
           processPay.clickSaveBtn();
           
		pages.reports report= new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
		
		_8566Page.payrollSummaryPage page1 = new _8566Page.payrollSummaryPage(driver);

		verify.verifyPayrollSummary(data[28], data[29], data[30], data[31], data[32], data[33]);
		
		page1.clickRefreshBtn();
		verify.verifyPayrollSummary(data[28], data[29], data[30], data[31], data[32], data[33]);
		page1.clickRefreshBtn();

		verify.verifyPayrollSummary(data[28], data[29], data[30], data[31], data[32], data[33]);

		verify.assertAll();
	
}
	
}
