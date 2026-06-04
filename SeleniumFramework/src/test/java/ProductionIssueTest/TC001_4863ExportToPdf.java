package ProductionIssueTest;

import org.testng.annotations.Test;

import pages.PayrollRun;
import tests.TestBase;
import utilities.ExcelData;

public class TC001_4863ExportToPdf extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateExportToPdfEmployerView() throws Exception {

		sTestCaseID = "TC001";
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
	    
	    ProductionIssuePage.ProductionPage page=   new ProductionIssuePage.ProductionPage(driver);
	    page.Click_EmployerView();
	    page.clickEmployee();
	    page.Click__Reports_();
	    report.Click_Individual_Employee_Pay_Scheduleclick();
	    page.clickPdfICn();
	    page.VerifyExportToPdf(data[5], data[6]);
	    page.clickCheckBox();
	    page.clickPdfICn();
	    page.VerifyExportToPdf1(data[7], data[8]);
	    page.clickcsvICn();
	    page.verifyCsvFile(data[9]);
	    
	    page.assertAll();
	    
	 

	    
	    
	    
}

}