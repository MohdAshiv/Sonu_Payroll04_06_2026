package ImportCompanies;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC394_ImportCompany_Frequency extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateCompanyImportWithMonthlyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyMontly();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();

		verify.verifyImportFrequency(data[7]);
		
		verify.assertAll();
		
	}
	
		
	

	@Test(priority=2)

	public void TC02validateCompanyImportWithMonthlyWeeklyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyMontlyWeekly();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();

		verify.verifyImportFrequency(data[8]);
		verify.assertAll();
		
	}
	
	

	@Test(priority=3)

	public void TC03validateCompanyImportWithMonthlyFortnightlyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyMontlyFortnightly();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();

		verify.verifyImportFrequency(data[9]);
		verify.assertAll();
		
	}
	
	

	@Test(priority=4)

	public void TC04validateCompanyImportWithAnuuallyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyAnnually();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();

		verify.verifyImportFrequency(data[10]);
		verify.assertAll();
		
	}
	

	@Test(priority=5)

	public void TC05validateCompanyImportWithFourWeeklyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyFourWeekly();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();

		verify.verifyImportFrequency(data[11]);
		verify.assertAll();
		
	}
	

	@Test(priority=6)

	public void TC06validateCompanyImportWithTwoWeeklyAndFourWeeklyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyTwoWeeklyFourWeekly();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();

		verify.verifyImportFrequency(data[12]);
		verify.assertAll();
		
	}
	
	

	@Test(priority=7)

	public void TC07validateCompanyImportWithMonthlyAnnuallyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyMonthlyAnnually();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();
		verify.verifyImportFrequency(data[13]);
		verify.assertAll();
		
	}
	
	
	@Test(priority=8)

	public void TC08validateCompanyImportWithWeeklyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyWeekly();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();
		verify.verifyImportFrequency(data[14]);
		verify.assertAll();
		
	}
	
	@Test(priority=9)

	public void TC09validateCompanyImportWithFortNightlyFrequency() throws Exception {

		sTestCaseID = "TC394";
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
		company.updateOnlyFortnightly();
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
		companyEdit.Click_clickPayrollDetails();
		companyEdit.Click_clickPayrollSettings();
		verify.verifyImportFrequency(data[15]);
		verify.assertAll();
		
	}
}
