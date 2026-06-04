package AgentLevelExportToPdfCsvFileName;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC_793_AgentLevelCsvPdfFileName extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validatePayrollCompanyImportCsv() throws Exception {

		sTestCaseID = "TC793";
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

	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.clickAgentPayroll();
	    payroll.clickAgentPayrollDashboad();
	    
		ImportCompaniesPage.CompanyImportPage company= new ImportCompaniesPage.CompanyImportPage(driver);
		company.clickImportCompanies();
		
		company.clickCsvIcn();
		
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[5]);
        
        verify.asserAll();
		
}
	
	@Test(priority=2)

	public void TC02validatePayrollEmployeeImportCsv() throws Exception {

		sTestCaseID = "TC793";
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

	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.clickAgentPayroll();
	    payroll.clickAgentPayrollDashboad();
	    
		ImportCompaniesPage.CompanyImportPage company= new ImportCompaniesPage.CompanyImportPage(driver);
		company.clickImportEmployee();
		
		company.clickCsvIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[6]);
        
        verify.asserAll();
		
}
	
	@Test(priority=3)

	public void TC03validateAgentSubmitRtiPdf() throws Exception {

		sTestCaseID = "TC793";
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

	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.clickAgentPayroll();
	    agentpage.clickSubmitRtiBtn();
	    
   _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectStatusAndSearchBtn(data[7]);
	
        file.rtiStatusPopupPdf();
                
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[9]);
        file.clickCloseBtn();
        
        file.selectStatusAndSearchBtn(data[8]);
    	
        file.rtiStatusPopupPdf();
        verify.verifyDownloadFileNameContains(data[9]);

        verify.asserAll();
		
}
	
	
	@Test(priority=4)

	public void TC04validateAgentSubmitP11DFailledPdf() throws Exception {

		sTestCaseID = "TC793";
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

	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.clickAgentPayroll();
	    agentpage.clickSubmitP11DBtn();
	    
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectStatusAndSearchBtn(data[7]);
	
        file.submitRtiP11D();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[10]);
        
    	
        file.p11DFailledPopupPdf();
        verify.verifyDownloadFileNameContains(data[11]);

        verify.asserAll();
		
}
	
	
	
	@Test(priority=5)

	public void TC05validateAgentSubmitP11DYetTOSubmitdPdf() throws Exception {

		sTestCaseID = "TC793";
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

	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.clickAgentPayroll();
	    agentpage.clickSubmitP11DBtn();
	    
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectStatusAndSearchBtn(data[12]);
	
        file.submitRtiP11D();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[11]);
        
   
        verify.asserAll();
		
}

	
	
}
