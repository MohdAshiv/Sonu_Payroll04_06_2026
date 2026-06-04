package ImportCompanies;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC396_ImportCompany_BankDetatils extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateCompanyImportWithBankName() throws Exception {

		sTestCaseID = "TC396";
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
		company.updateBankName();
        company.saveCsv();

		company.chooseFile1(data[5]);
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);

		verify.verifyImportCompanies();
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName1();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.EditCompany companyEdit = new pages.EditCompany(driver);
		companyEdit.Click_gotoEditCompany();
		companyEdit.ClickOpeningBalance();

		verify.verifyBankName();
		
		verify.assertAll();
		
	}
	
	
	@Test(priority=2)

	public void TC02validateCompanyImportWithSortCode() throws Exception {

		sTestCaseID = "TC396";
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
		company.updateSortCode();
        company.saveCsv();

		company.chooseFile1(data[5]);
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);

		verify.verifyImportCompanies();
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName1();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.EditCompany companyEdit = new pages.EditCompany(driver);
		companyEdit.Click_gotoEditCompany();
		companyEdit.clickGeneralTerms();
		companyEdit.clickBankDetails();

		verify.verifySortCode();
		
		verify.assertAll();
		
	}
	

	@Test(priority=3)

	public void TC03validateCompanyImportWithAccountNumber() throws Exception {

		sTestCaseID = "TC396";
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
		company.updateAccountNumber();
        company.saveCsv();

		company.chooseFile1(data[5]);
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);

		verify.verifyImportCompanies();
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName1();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		pages.EditCompany companyEdit = new pages.EditCompany(driver);
		companyEdit.Click_gotoEditCompany();
		companyEdit.clickGeneralTerms();
		companyEdit.clickBankDetails();

		verify.verifyAccountNumber();
		
		verify.assertAll();
		
	}
	
	
	@Test(priority=4)

	public void TC04validateCompanyImportWithBankNameNull() throws Exception {

		sTestCaseID = "TC396";
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
		company.updateBankNameNull();
        company.saveCsv();

		company.chooseFile1(data[5]);
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);

		verify.verifyAlertMsgNull(data[8]);
	
		verify.assertAll();
		
	}
	
	

	@Test(priority=5)

	public void TC05validateCompanyImportWithSortCodeNull() throws Exception {

		sTestCaseID = "TC396";
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
		company.updateSortCodeNull();
        company.saveCsv();

		company.chooseFile1(data[5]);
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);
		verify.verifyAlertMsgNull(data[8]);
		verify.assertAll();
		
	}
	
	@Test(priority=6)

	public void TC06validateCompanyImportWithAccountNumberNull() throws Exception {

		sTestCaseID = "TC396";
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
		company.updateAccountNumberNull();
        company.saveCsv();

		company.chooseFile1(data[5]);
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);
		verify.verifyAlertMsgNull(data[8]);
		verify.assertAll();
		
	}
	
}
