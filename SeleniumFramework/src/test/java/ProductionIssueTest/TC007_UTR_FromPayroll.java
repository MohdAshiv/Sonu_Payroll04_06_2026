package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC007_UTR_FromPayroll  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateUTRFromCIS_Sufferd() throws Exception {

		sTestCaseID = "TC007";
		Sheet = "Sheet7";
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
	
	    pages.reports report= new   pages.reports(driver);
	    report.clickTaxPayment();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.clickCisSufferd();
        page.enterValueSave(data[5]);
        page.enterCisUTR(data[6]);
        page.verifyCisSufferdUTR(data[7]);
        page.verifyAlertCisUtr(data[8]);
	   	 utilities.TakeScreenshot.Getscreenshot("TC007_ validateUTRFromCIS_Sufferd ", "Production", driver);

	    page.assertAll();
   
}

	@Test(priority=2)

	public void validateUTRFromEditCompany() throws Exception {

		sTestCaseID = "TC007";
		Sheet = "Sheet7";
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
	
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
       
		
		pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	   
	    company.inputTextUTR(data[6]);
        page.verifyCompanyUTR(data[7]);
        page.editCompanyUtr();
        company.Click_ClickSave();
        page.verifyCompanyAlertUtr(data[10]);
	   	 utilities.TakeScreenshot.Getscreenshot("TC007_ validateUTRFromEditCompany ", "Production", driver);

	    page.assertAll();
   
}
	

	@Test(priority=3)

	public void validateUTRFromRegisterdCis() throws Exception {

		sTestCaseID = "TC007";
		Sheet = "Sheet7";
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
	
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);

		pages.EditCompany company= new pages.EditCompany(driver);
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.clickRegisterdCis();
	    page.clickCreate();
	    page.enterCreateUTR(data[6]);
	    page.verifyCreateUTR(data[7]);
	   	 utilities.TakeScreenshot.Getscreenshot("TC007_ validateUTRFromRegisterdCis ", "Production", driver);

	   // page.verifyAlertCreateUtr(data[10]);
     
      //  page.verifyCompanyAlertUtr(data[9]);
	    page.assertAll();
   
}
	
	

	@Test(priority=4)

	public void validateUTRAlertFromRegisterdCis() throws Exception {

		sTestCaseID = "TC007";
		Sheet = "Sheet7";
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
	
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);

		pages.EditCompany company= new pages.EditCompany(driver);
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.clickRegisterdCis();
	    page.clickCreate();
	    page.enterCreateUTR(data[6]);
	    page.verifyCreateUTR(data[7]);
	    page.verifyAlertCreateUtr(data[10]);
   	    utilities.TakeScreenshot.Getscreenshot("TC007_ validateUTRAlertFromRegisterdCis ", "Production", driver);

        
	    page.assertAll();
   
}
}
