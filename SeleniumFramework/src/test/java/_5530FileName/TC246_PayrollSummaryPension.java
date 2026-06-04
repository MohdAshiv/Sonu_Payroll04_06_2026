package _5530FileName;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC246_PayrollSummaryPension extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateCsvFileName() throws Exception {

		sTestCaseID = "TC246";
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
	    payroll.UndoPayroll();
        payroll.Run_Payroll();
        
        
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payroll_Summary();
        
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickPayrollSummaryCsv();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[5]);
        verify.asserAll();

	}
	
	
	@Test(priority=2)

	public void validatePdfFileName() throws Exception {

		sTestCaseID = "TC246";
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

        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_Payroll_Summary();
        
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickPayrollSummaryPdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[6]);
        payroll.Click_PayrollDashboard();
        payroll.Undo_LastPayroll();
        verify.asserAll();

	}
	
}
