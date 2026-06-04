package _5530FileName;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC236_EmployerView_TaxPayment extends TestBase {

	
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateCsvFileName() throws Exception {

		sTestCaseID = "TC236";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();

		employerView.clickTaxPayment();
        
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickEmployerTaxExportCsvIcn();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[5]);
        verify.asserAll();

	}


	@Test(priority=2)

	public void validatePdfFileName() throws Exception {

		sTestCaseID = "TC236";
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
	
		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();

		employerView.clickTaxPayment();
        
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickEmployerTaxExportPdfIcn();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[6]);
     
        verify.asserAll();

	}
}
