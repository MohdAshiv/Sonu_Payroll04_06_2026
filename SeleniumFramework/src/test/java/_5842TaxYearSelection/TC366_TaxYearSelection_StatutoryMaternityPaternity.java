package _5842TaxYearSelection;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC366_TaxYearSelection_StatutoryMaternityPaternity extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void  TC01validateSelectedTaxYear() throws Exception {

		sTestCaseID = "TC366";
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

	    pages.reports report= new  pages.reports (driver);
	    report.Click__Reports_();
	    report.Click_Statutory_Maternity_Paternityclick();
	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYear(data[5]);
	    verify.assertAll();

}
	
	
	@Test(priority=2)

	public void  TC02_validateSelectedTaxYearWithPeriodEndDate() throws Exception {

		sTestCaseID = "TC366";
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
	    report.Click_Statutory_Maternity_Paternityclick();
	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYear(data[5]);
	    verify.assertAll();
	
}
	
	

	@Test(priority=3)
	public void  TC03validateSelectedTaxYearWithChangeLeaveType() throws Exception {

		sTestCaseID = "TC366";
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

	    pages.reports report= new  pages.reports (driver);
	    report.Click__Reports_();
	    report.Click_Statutory_Maternity_Paternityclick();
	  
	   _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.selectLeaveType(data[7]);
	    verify.verifySelectedTaxYear(data[5]);
	    verify.assertAll();

}
	
	
}
