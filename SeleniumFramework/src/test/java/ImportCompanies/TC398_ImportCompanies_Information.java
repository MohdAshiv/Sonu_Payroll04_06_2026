package ImportCompanies;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC398_ImportCompanies_Information  extends   TestBase{
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateCompanyImportWithCompanyName() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateClientName();
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
		companyEdit.ClickInformation();
		verify.verifyCompanyName();
		
		verify.assertAll();
		
	}
	
	
	

	@Test(priority=2)

	public void TC02validateCompanyImportWithAddressLine1() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateAddressLine1();
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
		companyEdit.ClickInformation();
		verify.verifyAddressLine1();
		
		verify.assertAll();
		
	}
	
	

	@Test(priority=3)

	public void TC03validateCompanyImportWithAddressLine2() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateAddressLine2();
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
		companyEdit.ClickInformation();
		verify.verifyAddressLine2();
		
		verify.assertAll();
		
	}
	

	@Test(priority=4)

	public void TC04validateCompanyImportWithCity() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateCity();
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
		companyEdit.ClickInformation();
		verify.verifyCity();
		
		verify.assertAll();
		
	}
	
	@Test(priority=5)

	public void TC05validateCompanyImportWithCounty() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateCountry();
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
		companyEdit.ClickInformation();
		verify.verifyCountry();
		
		verify.assertAll();
		
	}
	

	@Test(priority=6)

	public void TC06validateCompanyImportWithPostCode() throws Exception {

		sTestCaseID = "TC398";
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
		company.updatePostCode1();
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
		companyEdit.ClickInformation();
		verify.verifyPostCode();
		
		verify.assertAll();
		
	}
	

	@Test(priority=7)

	public void TC07validateCompanyImportWithAddressLine1Null() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateAddressLine1Null();
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
		companyEdit.ClickInformation();
		verify.verifyAddressLine1();
		
		verify.assertAll();
		
	}
	

	@Test(priority=8)

	public void TC08validateCompanyImportWithAddressLine2Null() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateAddressLine2Null();
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
		companyEdit.ClickInformation();
		verify.verifyAddressLine2();
		
		verify.assertAll();
		
	}
	


	@Test(priority=9)

	public void TC09validateCompanyImportWithCityNull() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateCityNull();
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
		companyEdit.ClickInformation();
		verify.verifyCity();
		
		verify.assertAll();
		
	}
	
	@Test(priority=10)

	public void TC10validateCompanyImportWithCountyNull() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateCountryNull();
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
		companyEdit.ClickInformation();
		verify.verifyCountry();
		
		verify.assertAll();
		
	}
	


	@Test(priority=11)

	public void TC11validateCompanyImportWithPostCodeNull() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateBlankPostCode();
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
		companyEdit.ClickInformation();
      	verify.verifyPostCodeNull();
		
		verify.assertAll();
		
	}
	
	
	
	@Test(priority=12)

	public void TC12validateCompanyImportWithCompanyNameNull() throws Exception {

		sTestCaseID = "TC398";
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
		company.updateClientNameNull();
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
