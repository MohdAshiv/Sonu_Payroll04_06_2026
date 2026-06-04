package AgentLevelExportToPdfCsvFileName;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC_795_AgentLevelReports_ClientSpecificReport extends TestBase {
	
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	@Test(priority=1)

	public void TC01AccountsSubmissionReportByCompanyExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();

        file.clickClientSpecificReport();
        
        file.selectReportType(data[4]); //Accounts Submission Report By Company
        
        file.selectCompany(data[5]);
        
        file.clickWagesJournalCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[6]);
        
        verify.asserAll();
		
}

	
	
	@Test(priority=2)

	public void TC02AccountsSubmissionReportByCompanyExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();

        file.clickClientSpecificReport();
        
        file.selectReportType(data[4]); //Accounts Submission Report By Company
        
        file.selectCompany(data[5]);
        
        file.clickWagesJournalPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[6]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=3)

	public void TC03ApprenticeshipLevyExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();

        file.clickClientSpecificReport();
        
        file.selectReportType(data[7]); //Apprenticeship Levy
        
        file.selectCompany(data[5]);
        
        file.clickApprenticeLevyCsvIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[8]);
        
        verify.asserAll();
		
}

	
	@Test(priority=4)

	public void TC04ApprenticeshipLevyExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();

        file.clickClientSpecificReport();
        
        file.selectReportType(data[7]); //Apprenticeship Levy
        
        file.selectCompany(data[5]);
        
        file.clickApreniceLevyPdfIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[9]);
        
        verify.asserAll();
		
}

	
	
	@Test(priority=5)

	public void TC05BankAccountDetailsExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[10]); //Bank Account Details
        
        file.selectCompany(data[5]);
        file.clickExportCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[11]);
        
        verify.asserAll();
		
}
	

	@Test(priority=6)

	public void TC06BankAccountDetailsExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[10]); //Bank Account Details
        
        file.selectCompany(data[5]);
        file.clickExportPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[11]);
        
        verify.asserAll();
		
}
	

	@Test(priority=7)

	public void TC07CISDeductionSufferedReportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[12]);  // CIS Deduction Suffered Report
        file.selectCompany(data[5]);
        file.clickCisDeductionCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileName(data[13]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=8)

	public void TC08CISDeductionSufferedReportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[12]);  // CIS Deduction Suffered Report
        file.selectCompany(data[5]);
        file.clickCisDeductionPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileName(data[14]);
        
        verify.asserAll();
		
}

	
	@Test(priority=9)

	public void TC09CompanyPaySummaryReportForallEmployeesExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[15]);  // Company Pay Summary Report For all Employees
        file.selectCompany(data[5]);
        file.clickCompanyPaySummaryCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileName(data[16]);
        
        verify.asserAll();
		
}
	
	@Test(priority=10)

	public void TC10CompanyPaySummaryReportForallEmployeesExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[15]);  // Company Pay Summary Report For all Employees
        file.selectCompany(data[5]);
        file.clickCompanyPaySummaryPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileName(data[17]);
        
        verify.asserAll();
		
}
	
	@Test(priority=11)

	public void TC11EmployeeLeavesExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[18]);  // Employee Leaves
        file.selectCompany(data[5]);
        file.clickEmployeeLeavesCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[19]);
        
        verify.asserAll();
		
}
	
	@Test(priority=12)

	public void TC12EmployeeLeavesExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[18]);  // Employee Leaves
        file.selectCompany(data[5]);
        file.clickEmployeeLeavesPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[19]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=13)

	public void TC13EmployeeListExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[20]);  // Employee List
        file.selectCompany(data[5]);
        file.clickEmployeeListCsvIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[21]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=14)

	public void TC14EmployeeListExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[20]);  // Employee List
        file.selectCompany(data[5]);
        file.clickEmployeeListPdfIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[21]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=15)

	public void TC15EmployeePayDetailsExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[22]);  // Employee Pay Details
        file.selectCompany(data[5]);
        file.clickIEPScheduleCsvIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[23]);
        
        verify.asserAll();
		
}
	
	@Test(priority=16)

	public void TC16EmployeePayDetailsExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[22]);  // Employee Pay Details
        file.selectCompany(data[5]);
        file.clickIEPSchedulePdfIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[23]);
        
        verify.asserAll();
		
}
	

	@Test(priority=17)

	public void TC17EmployeePaySummaryReportExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[24]);  // Employee Pay Summary Report
        file.selectCompany(data[5]);
        file.clickCompanyPaySummaryCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[25]);
        
        verify.asserAll();
		
}
	

	@Test(priority=18)

	public void TC18EmployeePaySummaryReportExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[24]);  //Employee Pay Summary Report
        file.selectCompany(data[5]);
        file.clickCompanyPaySummaryPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[25]);
        verify.asserAll();
}
	
	
	@Test(priority=19)
	public void TC19NationalInsuranceCategoryReviewExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[26]);  // National Insurance Category Review
        file.selectCompany(data[5]);
        file.clickNICRPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[27]);
        verify.asserAll();
}
	

	@Test(priority=20)

	public void TC20P11DeductionsExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[28]);  //  P11 Deductions
        file.selectCompany(data[5]);
        file.clickExportCsv1();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[29]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=21)

	public void TC21P11DeductionsExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[28]);  //  P11 Deductions
        file.selectCompany(data[5]);
        file.clickP11PdfIcn();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[29]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=22)

	public void TC22P11DeductionsExportToSinglePdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[28]);  //  P11Deductions
        file.selectCompany(data[5]);
        file.clickExportToSinglePdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[30]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=23)

	public void TC23P11D_P11DbExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[31]);  //  P11 Deductions
        file.selectCompany(data[5]);
        file.clickP11DBPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[32]);
        
        verify.asserAll();
		
}
	
	
	
	@Test(priority=24)

	public void TC24P11DExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[31]);  //  P11 Deductions
        file.selectCompany(data[5]);
        file.clickP11DPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[33]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=25)

	public void TC25PayslipCountReportExportToCSV() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[34]);  //  Payslip Count Report
        file.selectCompany(data[5]);
        file.payslipCountCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[35]);
        
        verify.asserAll();
		
}
	
	@Test(priority=26)

	public void TC26PayslipCountReportExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[34]);  //  Payslip Count Report
        file.selectCompany(data[5]);
        file.payslipCountPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[35]);
        
        verify.asserAll();
		
}
	
	
	
	@Test(priority=27)

	public void TC27PeriodTotalExportToCSV() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[36]);  //  PeriodTotal
        file.selectCompany(data[5]);
        file.clickPayrollReportingCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[37]);
        
        verify.asserAll();
		
}
	
	@Test(priority=28)

	public void TC28PeriodTotalExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[36]);  //  Period Total
        file.selectCompany(data[5]);
        file.clickPayrollReportingPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[37]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=29)

	public void TC29RTISubmissionReportExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[38]);  //  PRTI Submission Report
        file.selectCompany(data[5]);
        file.RtiSubmissionPdf1();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[39]);
        
        verify.asserAll();
		
}
	
	
	

	@Test(priority=30)

	public void TC30StatutoryParentalPayExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);

	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[40]);  //  Statutory Parental Pay
        file.selectCompany(data[42]);
        file.clickSppPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[41]);
        
        verify.asserAll();
		
}
	

	@Test(priority=31)

	public void TC31StatutoryPayRecoveryExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
         
	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[43]);  //  Statutory Pay Recovery
        file.selectCompany(data[42]);
        file.clickSprCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[44]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=32)

	public void TC32StatutoryPayRecoveryExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
         
	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[43]);  //  Statutory Pay Recovery
        file.selectCompany(data[42]);
        file.clickSprPdf() ;   
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[44]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=33)

	public void TC33StatutorySickPayExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
         
	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[45]);  //  Statutory Sick Pay
        file.selectCompany(data[42]);
        file.clickSspPdf() ;   
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[46]);
        verify.asserAll();
		
}
	
	
	
	@Test(priority=34)

	public void TC34StatutoryMaternityPayExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
         
	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[48]);  //  Statutory Maternity Pay
        file.selectCompany(data[49]);
        file.clickSmpPdf() ;   
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[50]);
        verify.asserAll();
		
}

	

	@Test(priority=35)

	public void TC35TaxPaymentReconciliationExportToCsv() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
         
	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[51]);  //  Tax Payment Reconciliation
        file.selectCompany(data[5]);
        file.taxPayementCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[52]);
        
        verify.asserAll();
		
}
	
	
	@Test(priority=36)

	public void TC36TaxPaymentReconciliationExportToPdf() throws Exception {

		sTestCaseID = "TC795";
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
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
         
	    agentpage.ClickAgentReport();
        file.clickClientSpecificReport();
        
        file.selectReportType(data[51]);  //  Tax Payment Reconciliation
        file.selectCompany(data[5]);
        file.taxPayementPdf();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[53]);
        
        verify.asserAll();
		
}
		
	
}
