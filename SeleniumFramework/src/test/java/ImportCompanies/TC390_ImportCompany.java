package ImportCompanies;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC390_ImportCompany  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
    //@Test(priority=1)

	public void TC01validate200CompaniesImported() throws Exception {

		sTestCaseID = "TC390";
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
		
		company.updateCSV();
		
		company.chooseFile();
		
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		verify.verifyImportCompanies();
		verify.assertAll();
		
		
	}
	
	
	@Test(priority=2)

	public void TC02validateSingleCompanyImported() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateCSV1();
		
		company.saveCsv();

		company.chooseFile1(data[5]);
		
		company.clickUploadBtn();

		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();

		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);
		verify.verifyImportCompanies();
		verify.assertAll();
		
		
	}
	

	@Test(priority=3)

	public void TC03validateBlankCompanyImport() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateCSVNull();
		company.saveCsv();

		company.chooseFile1(data[5]);
		
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);

		verify.verifyImportCompanywithNUll(data[7]);
		verify.assertAll();
		
		
	}
	
	
	
	
	@Test(priority=4)

	public void TC04validateCompanyImportWithBlankRegistrationDate() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateBlankCSVRegistrationDate();
		
		company.saveCsv();

		company.chooseFile1(data[5]);
		
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
	    company.deletFilename(data[6]);
		verify.verifyImportCompanies();
	 
		verify.assertAll();
		
		
	}
	

	@Test(priority=5)

	public void TC05validateCompanyImportWithPensionNo() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateCSVCompanyPensionNO();
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
	    
	    pages.EditCompany companyEdit= new pages.EditCompany(driver);
	    companyEdit.Click_gotoEditCompany();
	    companyEdit.Click_clickPayrollDetails();
	    companyEdit.Click_clickPayrollSettings();
	    
	    verify.pensionNotEnabled();
		verify.assertAll();

	}
	


	@Test(priority=6)

	public void TC06validateCompanyImportWithPensionYes() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateCSV1();
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

		verify.pensionEnabled();
		verify.assertAll();
	
	}
	
	

	@Test(priority=7)

	public void TC07validateCompanyImportWithPasswordJustZip() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateCSVPasswordProtectionType(data[8]);
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

		verify.verifySelectedPasswordType(data[8]);
		verify.assertAll();
	
	}
	
	
	
	@Test(priority=8)

	public void TC08validateCompanyImportWithPasswordJustPdf() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateCSVPasswordProtectionType(data[9]);
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

		verify.verifySelectedPasswordType(data[9]);
		verify.assertAll();
	
	}
	
	
	@Test(priority=9)

	public void TC09validateCompanyImportWitNullPayRefrence() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateBlankCSVPayeRefrence();
		company.saveCsv();

		company.chooseFile1(data[5]);
		
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
	     company.deletFilename(data[6]);

		verify.verifyImportCompanywithNUll(data[10]);
		verify.assertAll();
		
		
	}
	

	@Test(priority=10)

	public void TC10validateCompanyImportWithoutContactDetails() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateBlankContactDetails();
		company.saveCsv();

		company.chooseFile1(data[5]);
		
		company.clickUploadBtn();
		company.selectDateFormate(data[4]);
		
		company.clickImportBtn();
		
		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
		company.deletFilename(data[6]);

		verify.verifyImportCompanies();

		verify.assertAll();
		
		
	}
	
	
	
	@Test(priority=11)

	public void TC11validateCompanyImportWithoutPostCode() throws Exception {

		sTestCaseID = "TC390";
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
		verify.assertAll();
		
	}

	

	@Test(priority=12)

	public void TC12validateCompanyImportWithPensionNull() throws Exception {

		sTestCaseID = "TC390";
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
		company.updateCSVCompanyPensionNull();
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
	    
	    pages.EditCompany companyEdit= new pages.EditCompany(driver);
	    companyEdit.Click_gotoEditCompany();
	    companyEdit.Click_clickPayrollDetails();
	    companyEdit.Click_clickPayrollSettings();
	    
	    verify.pensionNotEnabled();
		verify.assertAll();

	}
	

}
