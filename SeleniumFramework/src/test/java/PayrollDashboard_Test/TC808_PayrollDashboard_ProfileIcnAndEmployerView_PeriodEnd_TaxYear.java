package PayrollDashboard_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC808_PayrollDashboard_ProfileIcnAndEmployerView_PeriodEnd_TaxYear extends TestBase{
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateEmployerViewBtn() throws Exception {

		sTestCaseID = "TC808";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.clickOnEmployerView();
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);		
		verify.verifyEmployerView(data[5]);
		
		verify.assertAll();
		
		
	}
	
	
	
	@Test(priority=2)

	public void TC02validateEmailLogBtn() throws Exception {

		sTestCaseID = "TC808";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.clickEmailDropDown();
		
		dashboard.clickOnEmailLog();
	
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);		
		verify.verifyHeaderTop(data[6]);
		
		verify.assertAll();
		
		
	}
	
	
	

	@Test(priority=3)

	public void TC03vlidateSMSBtn() throws Exception {

		sTestCaseID = "TC808";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.clickEmailDropDown();
		
		dashboard.clickSmsLog();
	
		
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);		
		verify.verifyHeaderTop(data[7]);
		
		verify.assertAll();
		
		
	}
	

	@Test(priority=4)

	public void TC04vlidateChangePasswordBtn() throws Exception {

		sTestCaseID = "TC808";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.clickEmailDropDown();
		dashboard.clickChangePasswordBtn();
	
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);		
		verify.verifyChangePassword(data[8]);
		
		verify.assertAll();
		
		
	}
	
	
	@Test(priority=5)

	public void TC05vlidateSignOutBtn() throws Exception {

		sTestCaseID = "TC808";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.clickEmailDropDown();
		dashboard.clickSignOut();
	
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);		
		verify.verifySignOutBtn(data[9]);
		
		verify.assertAll();
		
		
	}

	
	@Test(priority=6)

	public void TC06validateTaxYear() throws Exception {

		sTestCaseID = "TC808";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[10]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[11]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);


	    payroll.SelectTaxYear(data[12]);
//
//	    pages.reports report= new  pages.reports (driver);
//	    report.Click__Reports_();
//	    report.Click_Payroll_Summary();
	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYear(data[12]);
	    verify.assertAll();
			
	}
	
	
	@Test(priority=7)

	public void TC07validatePeriodEndDate() throws Exception {

		sTestCaseID = "TC808";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[10]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[11]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.SelecPeriodEndDate(data[13]);

	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedPeriodEnd(data[13]);
	    verify.assertAll();
	
		
	}
	
	

	@Test(priority=8)

	public void TC08validateCurrentPeriodEndShouldVisibleOnRunPayroll() throws Exception {

		sTestCaseID = "TC808";
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
				
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);		
		verify.getPeriodEndDate();
	    payroll.runPayroll();

		verify.verifyCurrentPeriodOnRunPayrollPage();
		verify.assertAll();		
		
	}
	
}
