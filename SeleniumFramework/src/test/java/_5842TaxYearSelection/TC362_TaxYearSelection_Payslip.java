package _5842TaxYearSelection;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC362_TaxYearSelection_Payslip  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void  TC01validateSelectedTaxYear() throws Exception {

		sTestCaseID = "TC362";
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

	   // for(int i=0;i<=39;i++) {payroll.Run_Payroll();}
	    payroll.SelectTaxYear(data[5]);

	    pages.reports report= new  pages.reports (driver);
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYear(data[5]);
	    verify.assertAll();
	
}
	
	
	@Test(priority=2)

	public void  TC02_validateSelectedTaxYearWithPeriodEndDate() throws Exception {

		sTestCaseID = "TC362";
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

	    payroll.SelectTaxYear(data[10]);

	    payroll.SelecPeriodEndDate(data[11]);
	    pages.reports report= new  pages.reports (driver);
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYearAndPeriodEnd(data[10], data[11]);
	    verify.assertAll();
	
}
	
	@Test(priority=3)

	public void  TC03_validateSelectedTaxYearAndPeriodEndDateWithEmailDropDown() throws Exception {

		sTestCaseID = "TC362";
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

	    payroll.SelectTaxYear(data[5]);

	    payroll.SelecPeriodEndDate(data[6]);
	    pages.reports report= new  pages.reports (driver);
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    
        pages.EmailSection email= new pages.EmailSection(driver);
		

	    email.selectEmailType(data[7]);

	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYearAndPeriodEnd(data[5], data[6]);
	    
	    email.selectEmailType(data[8]);
	    
	    
	    verify.verifySelectedTaxYearAndPeriodEnd(data[5], data[6]);
	    email.selectEmailType(data[9]);

	    verify.verifySelectedTaxYearAndPeriodEnd(data[5], data[6]);

	    verify.assertAll();
	
}
	
	@Test(priority=4)

	public void  TC04_validateSelectedTaxYearAndPeriodEndDateWithRegenerateBtn() throws Exception {

		sTestCaseID = "TC362";
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

	    payroll.SelectTaxYear(data[10]);

	    payroll.SelecPeriodEndDate(data[11]);
	    pages.reports report= new  pages.reports (driver);
	    report.Click__Reports_();
	    report.Click_Payslipsclick();
	    
        pages.EmailSection email= new pages.EmailSection(driver);
		

	    email.clickRegenerateBtn();

	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYearAndPeriodEnd(data[10], data[11]);
	    
	    verify.assertAll();
	
}
}
