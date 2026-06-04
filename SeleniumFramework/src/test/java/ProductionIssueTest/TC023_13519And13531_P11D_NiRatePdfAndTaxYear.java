package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;


public class TC023_13519And13531_P11D_NiRatePdfAndTaxYear extends TestBase{
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateAgentSubmitRtiPdf() throws Exception {

		sTestCaseID = "TC023";
		Sheet = "Sheet7";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
	//	agentpage.Enter_SearchAgentName(data[3]);
		
		agentpage.Enter_SearchAgentName("AutomationTester");

		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	  //  payroll.clickAgentPayroll();
	//    utilities.ChangeWindow.tabswitch(driver);
	      agentpage.BrokenLink();
	    
	    System.out.println("wait");
	    
	    

//	    agentpage.clickSubmitP11DBtn();
//	    
//		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
//		verify.verifyP11dNiRate(data[6],data[9]);
//		
//        verify.assertAll();
}
	
	

	@Test(priority=2)

	public void TC02validateNiRateP11dEmployerClientSpecificEmployer() throws Exception {

		sTestCaseID = "TC023";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();

        file.clickClientSpecificReport();
        
        file.selectReportType(data[5]); //P11D & P11D(b)
        
        file.selectCompany1(data[4]);
        
	    
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
        
		verify.verifyP11dNiRate(data[7],data[9]);
        
        verify.assertAll();
		
}

	
	

	@Test(priority=3)

	public void TC03validateTaxYearP11dEmployerClientSpecificEmployee() throws Exception {

		sTestCaseID = "TC023";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();

        file.clickClientSpecificReport();
        
        file.selectReportType(data[5]); //P11D & P11D(b)
        
        file.selectCompany1(data[4]);
        
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
        
		verify.verifyP11dNiRate1(data[8]);
        
        verify.assertAll();
		
}
	
	
	@Test(priority=4)

	public void TC04validateTaxYearP11dEmployerClientSpecificEmployer() throws Exception {

		sTestCaseID = "TC023";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();

        file.clickClientSpecificReport();
        
        file.selectReportType(data[5]); //P11D & P11D(b)
        
        file.selectCompany1(data[4]);
        
	    
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
        
		verify.verifyP11dNiRate(data[7],data[10]);
        
        verify.assertAll();
		
}
	
}
