package AgentLevelExportToPdfCsvFileName;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC_794_AgentLevelReportsCsvPdfFileName extends TestBase{
	
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	@Test(priority=1)

	public void TC01AeEmployerWithoutStagingDatexlsx() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(1); // Ae Employer without Staging datae
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickExportEmployersIndex1();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[4]);
        
        verify.asserAll();
		
}
	
	
	
	@Test(priority=2)

	public void TC02ClientsWhoHaveAutoEnrolledxlsx() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(2); // Clients who have Auto Enrolled
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickExportEmployersIndex2();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[5]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=3)

	public void TC03EmployerNotesExportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(4); // Employer Notes
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickEmployerNotesCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[6]);
        
        verify.asserAll();
		
}
	

	@Test(priority=4)

	public void TC04EmployerNotesExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(4); // Employer Notes
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickEmployerNotesPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[7]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=5)

	public void TC05EmployerYearEndUpdatesExportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(5); // Employer Year End Updates

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickEmployerYearEndCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[8]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=6)

	public void TC06EmployerYearEndUpdatesExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(5); // Employer Year End Updates

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickEmployerYearEndPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[7]);
        verify.asserAll();
		
}

	
	@Test(priority=7)

	public void TC07ExportCompanyDataPayrollExportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(6); // Export Company Data Payroll

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickExportCompanyDataCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileName(data[9]);
        verify.asserAll();
		
}
	
	@Test(priority=8)

	public void TC08ExportCompanyDataPayrollExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(6); // Export Company Data Payroll

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickExportCompanyDataPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileName(data[10]);
        verify.asserAll();
		
}
	
	

	@Test(priority=9)

	public void TC09NIContributionReportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(9); // NI Contribution Report

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickNiContributionReportCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[11]);
        verify.asserAll();
		
}
	

	@Test(priority=10)

	public void TC10NIContributionReportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(9); // NI Contribution Report

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickNiContributionReportPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[12]);
        verify.asserAll();
		
}
	
	

	@Test(priority=11)

	public void TC11P11DFailedSubmissionExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(10); //P11D Failed Submission 

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectStatusAndSearchBtn(data[13]);
        file.exportToPdf();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[14]);
        
        file.selectStatusAndSearchBtn(data[15]);
        file.exportToPdf();
        verify.verifyDownloadFileNameContains(data[14]);

        
        verify.asserAll();
		
}
	
	
	@Test(priority=12)

	public void TC12P11DSuccessfulSubmissionExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(11); //P11D Successful Submission

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.exportToPdf();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[14]);
 
        verify.asserAll();
		
}
	
	

	@Test(priority=13)

	public void TC13PAYEandNILiabilityReportExportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(12); //PAYE and NI Liability Report


        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.payeNiLianlityCsv();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[16]);
 
        verify.asserAll();
		
}
	
	

	@Test(priority=14)

	public void TC14PAYEandNILiabilityReportExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(12); //PAYE and NI Liability Report


        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.payeNiLianlityPdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[17]);
 
        verify.asserAll();
		
}
	
	
	@Test(priority=15)

	public void TC15PayslipCountReportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(13); // Payslip Count Report

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.payslipCountCsv();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[18]);
 
        verify.asserAll();
		
}
	
	

	@Test(priority=16)

	public void TC16PayslipCountReportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(13); // Payslip Count Report

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.payslipCountPdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
         verify.verifyDownloadFileNameContains(data[18]);
 
         verify.asserAll();
		
}
	
	
	

	@Test(priority=17)

	public void TC17PensionContributionFailedSubmissionExportToPdf() throws Exception {

		sTestCaseID = "TC794";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[19]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(14); // Pension Contribution Failed Submission

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.fillingStatuPdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
         verify.verifyDownloadFileName(data[20]);
 
         verify.asserAll();
		
}
	
	@Test(priority=18)

	public void TC18RTiSubmissionReportExportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(14); // RTI Submission Report

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.RtiSubmissionCsv();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[21]);
 
        verify.asserAll();
		
}
	
	

	@Test(priority=19)

	public void TC19RTiSubmissionReportExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(14); // RTI Submission Report

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.RtiSubmissionPdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[21]);
 
        verify.asserAll();
		
}
	
	@Test(priority=20)

	public void TC20RTiSubmissionReportStatusPopupExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(14); // RTI Submission Report

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.rtiStatusPopupPdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[22]);
 
        verify.asserAll();
		
}
	

	@Test(priority=21)

	public void TC21TaxRateTablesExportToCsv() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(15); // Tax Rate Tables

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickTaxRateCsv();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[23]);
 
        verify.asserAll();
		
}
	

	@Test(priority=22)

	public void TC22TaxRateTablesExportToPdf() throws Exception {

		sTestCaseID = "TC794";
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

	    agentpage.ClickAgentReport();
	    
	    agentpage.ClickReportsName(15); // Tax Rate Tables

        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickTaxRatePdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[23]);
 
        verify.asserAll();
		
}
}
