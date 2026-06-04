package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC590_PayrollSummary_Monthly_JanFebMarch  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateDataConsistentlyRemains() throws Exception {

		sTestCaseID = "TC590";
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

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.PayrollRun payroll= new pages.PayrollRun (driver);


		pages.reports report= new pages.reports(driver);
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[46]);
		processPay.clickSaveBtn();

		
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[47]);
		processPay.clickSaveBtn();
		
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[38]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[39]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[40]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[41]);
		processPay.clickSaveBtn();
		
		
		payroll.Run_Payroll();
		
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[42]);
		processPay.clickSaveBtn();

		processPay.click3Dot2();
		processPay.clickProcessPay2();
		processPay.enterBasicPay(data[43]);
		processPay.clickSaveBtn();

		processPay.click3Dot3();
		processPay.clickProcessPay3();
		processPay.enterBasicPay(data[44]);
		processPay.clickSaveBtn();
		
		processPay.click3Dot4();
		processPay.clickProcessPay4();
		processPay.enterBasicPay(data[45]);
		processPay.clickSaveBtn();
		
		payroll.Run_Payroll();
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[35]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifyPayrollSummaryCFBF_Ammount(data[14], data[17], data[18], data[19], data[20], data[21],data[22],data[48],data[48]);
		_8566Page.payrollSummaryPage page = new _8566Page.payrollSummaryPage(driver);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[14], data[17], data[18], data[19], data[20], data[21],data[22],data[48],data[48]);
		payroll.SelecPeriodEndDate(data[36]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[15], data[23], data[24], data[25], data[26], data[27],data[28],data[48],data[48]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[15], data[23], data[24], data[25], data[26], data[27],data[28],data[48],data[48]);

		payroll.SelecPeriodEndDate(data[37]);

		verify.verifyPayrollSummaryCFBF_Ammount(data[16], data[29], data[30], data[31], data[32], data[33],data[34],data[48],data[48]);
		page.clickRefreshBtn();
		verify.verifyPayrollSummaryCFBF_Ammount(data[16], data[29], data[30], data[31], data[32], data[33],data[34],data[48],data[48]);

		verify.assertAll();
		
	}	
	
	
	@Test(priority=2)

	public void TC02validatePayrollSummary() throws Exception {

		sTestCaseID = "TC590";
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
		
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		        
		        
		pages.PayrollRun payroll= new pages.PayrollRun (driver);


		pages.reports report= new pages.reports(driver);
		
		
		report.clickTaxPayment();
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.taxPayement(data[71], data[72], data[73], data[74]);
		verify.assertAll();
		
	}	
	
}
