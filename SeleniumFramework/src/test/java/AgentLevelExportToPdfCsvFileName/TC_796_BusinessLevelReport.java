package AgentLevelExportToPdfCsvFileName;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC_796_BusinessLevelReport extends TestBase{
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	@Test(priority=1)

	public void TC01departmentalAnalysisExportToCsv() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.Click__DepartmentalAnalyisis_();
        file.departmentAnalysisCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[5]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=2)

	public void TC02departmentalAnalysisExportToPdf() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.Click__DepartmentalAnalyisis_();
        
        file.departmentAnalysisPdf();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[5]);
        
        verify.asserAll();
		
}

	

	@Test(priority=3)

	public void TC03payementSummaryExportToCsv() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.clickPaymentSummary();
        file.paymentSummaryCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[6]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=4)

	public void TC04payementSummaryExportToPdf() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.clickPaymentSummary();
        
        file.paymentSummaryPdf();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[6]);
        
        verify.asserAll();
		
}
	

	@Test(priority=5)

	public void TC05journalExportToCsv() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
      
        file.journalCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[7]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=6)

	public void TC06journalExportToPdf() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.journalPdf();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[7]);
        
        verify.asserAll();
		
}

	
	@Test(priority=7)

	public void TC07notesExportToPdf() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.notesPdf();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[8]);
        
        verify.asserAll();
		
}


	@Test(priority=8)

	public void TC08approvedLeavesExportToCsv() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.LeaveManagement leave = new pages.LeaveManagement(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
         leave.clickLeaveManagement();
         leave.clickApprovedLeaves();
         leave.clcikSearchBtn();
         file.leaveCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[9]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=9)

	public void TC09approvedLeavesExportToPdf() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.LeaveManagement leave = new pages.LeaveManagement(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
         leave.clickLeaveManagement();
         leave.clickApprovedLeaves();
         leave.clcikSearchBtn();
         file.leavePdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[9]);
        
        verify.asserAll();
		
}
	
	
	
	@Test(priority=10)

	public void TC10attachmentEarningExportToCsv() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.clickAttachmentEarning();
        file.attachmentEarningCsv();
	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[10]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=11)

	public void TC11attachmentEarningExportToPdf() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.clickAttachmentEarning();
        
        file.attachmentEarningPdf();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[10]);
        
        verify.asserAll();
		
}
	

	@Test(priority=12)

	public void TC12individualEmployeePayScheduleExportToPdf() throws Exception {
		
		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();

        file.iepsFile();
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[11]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=13)

	public void TC13annualPayScheduleExportToCsv() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.clickAnnualPayrollSchedule();
        file.clickShow();
        file.clicApsCsv();	    
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileNameContains(data[12]);
        
        verify.asserAll();
		
}
	
	

	@Test(priority=14)

	public void TC14annualPayScheduleExportToPdf() throws Exception {

		sTestCaseID = "TC796";
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
		OpenClient.Click_ClickClient2();
		
		pages.reports report = new pages.reports(driver);
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        report.Click__Reports_();
	    report.clickAnnualPayrollSchedule();
        file.clickApsPdf();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        verify.verifyDownloadFileNameContains(data[13]);
        
        verify.asserAll();
		
}

}
