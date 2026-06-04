package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC588_PayrollSummary_Monthly_JulyAugSep extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void TCvalidateDataConsistentlyRemains() throws Exception {

		sTestCaseID = "TC588";
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

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[70]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
//		OpenClient.Click_ClientsClick();
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[58]);
//		buisness.enterFirstName();
//		buisness.enterLastName();
//		buisness.clickSaveBtn();
//		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//	
//		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//		Bk.Click_BKEdit();
//		Bk.Select_services(data[56]);
//		Bk.Enter_CompanyAddressLine1(data[57]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[58]);
//		Bk.Enter_NewEndDate(data[59]);
//		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
//		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[60]);
//		company.enterRefrenceNumber(data[61]);
//		company.accountOfficeReffrence(data[62]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[69]);
//		company.Click_ClickSave();
//
//		payroll.Click_PayrollDashboard();
//		
//		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[64]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[7]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[5]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//		
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[49]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[8]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[11]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[50]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[9]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[12]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//		employee.clickNewEmployee();
//		employee.enterTitle(data[54]);
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[51]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[10]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[13]);
//		employee.clickSaveBtn();
//		
//		payroll.Click_PayrollDashboard();
//
//        for(int i=0;i<=3;i++)	{payroll.Run_Payroll();}
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		
		
		pages.reports report= new pages.reports(driver);
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[5]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[11]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[12]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[13]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[38]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[38]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[38]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[38]);
		processPay.clickSaveBtn();
		
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[39]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[40]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[41]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[42]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[35]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCFBF_Ammount(data[14], data[17], data[18], data[19], data[20], data[21],data[22],data[38],data[38]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[14], data[17], data[18], data[19], data[20], data[21],data[22],data[38],data[38]);
		payroll.SelecPeriodEndDate(data[36]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[15], data[23], data[24], data[25], data[26], data[27],data[28],data[38],data[38]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[15], data[23], data[24], data[25], data[26], data[27],data[28],data[38],data[38]);

		payroll.SelecPeriodEndDate(data[37]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[16], data[29], data[30], data[31], data[32], data[33],data[34],data[38],data[38]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[16], data[29], data[30], data[31], data[32], data[33],data[34],data[38],data[38]);

		verify.assertAll();
		
	}
}
