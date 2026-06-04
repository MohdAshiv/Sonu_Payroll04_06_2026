package _5842TaxYearSelection;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC361_PeriodEndDateWithSelectedTaxYear  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01_validatePeriodEndWithSelectedTaxYear() throws Exception {

		sTestCaseID = "TC361";
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

	//    for(int i=0;i<=39;i++) {payroll.Run_Payroll();}
	    payroll.SelectTaxYear(data[5]);

	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	   // verify.verifySelectedTaxYear(data[5]);
	    verify.verifyPeriodEnd(data[7],data[8]);
	    payroll.SelectTaxYear(data[6]);
	    verify.verifyPeriodEnd(data[9],data[7]);
	    verify.assertAll();
	
}
	
	
	@Test(priority=2)

	public void TC02_validatePeriodEndWithSelectedTaxYear() throws Exception {

		sTestCaseID = "TC361";
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
		OpenClient.Enter_EnterClientName(data[10]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	  // for(int i=0;i<=39;i++) {payroll.Run_Payroll();}
	    payroll.SelectTaxYear(data[5]);

	    _5842TaxYearSelectionPage.VerifyData verify= new  _5842TaxYearSelectionPage.VerifyData(driver);
	    
	    verify.verifySelectedTaxYear(data[5]);
	   
	    verify.assertAll();
	
}
	
}
