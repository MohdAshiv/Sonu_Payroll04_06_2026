package ImportCompanies;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC391_ImportCompany_PayDate  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateCompanyImportWithoutAnnuallPaydate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateBlankAnuallPaydate();
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

		verify.verifyFrequency(data[11]);
		
		verify.assertAll();
		
	}
	
	
	
	@Test(priority=2)

	public void TC02validateCompanyImportWithNewAnnuallyPayDate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateAnnuallyPaydate();
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

		verify.verifyAnnuallyPayDate();
		verify.assertAll();

		
	}
	
	
	
	
	@Test(priority=3)

	public void TC03validateCompanyImportWithNewWeeklyPayDate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateWeeklyPaydate();
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

		verify.verifyWeeklyPayDate();
		verify.assertAll();

		
	}
	
	
	
	
	@Test(priority=4)

	public void TC04validateCompanyImportWithFourWeeklyPayDate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateFourWeeklyPaydate();
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

		verify.verifyFourWeeklyPayDate();
		verify.assertAll();

		
	}
	
	
	
	@Test(priority=5)

	public void TC05validateCompanyImportWithFortnightlyPayDate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateFortnightlyPaydate();
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

		verify.verifyFortNightlyPayDate();
		verify.assertAll();

		
	}

	@Test(priority=6)

	public void TC06validateCompanyImportWithMonthlyPayDate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateMonthlyPaydate();
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

		verify.verifyMonthlyPaydate();

		verify.assertAll();

	}
	
	

	@Test(priority=7)

	public void TC07validateCompanyImportWithoutWeeklyPaydate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateWeeklyPaydateNull();
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

		verify.verifyFrequency(data[7]);

		verify.assertAll();

	}

	
	
	@Test(priority=8)

	public void TC08validateCompanyImportWithoutMonthlyPaydate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateMonthlyPaydateNull();
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

		verify.verifyFrequency(data[8]);

		verify.assertAll();

	}
	
	
	
	@Test(priority=9)

	public void TC09validateCompanyImportWithoutFortnightlyPaydate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateFortnightlyPaydateNull();
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

		verify.verifyFrequency(data[9]);

		verify.assertAll();

	}

	
	@Test(priority=10)

	public void TC10validateCompanyImportWithoutFourWeeklyPaydate() throws Exception {

		sTestCaseID = "TC391";
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
		company.updateFourWeeklyPaydateNull();
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

		verify.verifyFrequency(data[10]);

		verify.assertAll();

	}
	

//	
//	@Test(priority=26)
//
//	public void TC88validateCompanyImportWithNewAnnually() throws Exception {
//
//		sTestCaseID = "TC391";
//		Sheet = "Sheet6";
//		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
//
//		pages.loginpage4  loginpage = new pages.loginpage4(driver);
//		loginpage.GoToUrl();	
//		loginpage.AssertUrl();
//		loginpage.Enter_EnterUsername(data[1]);
//		loginpage.Enter_Enterpassword(data[2]);
//		loginpage.Click_LoginButton();
//
//		pages.agentpage agentpage = new pages.agentpage(driver);
//		agentpage.Enter_SearchAgentName(data[3]);
//		agentpage.Click_ClickSearch();
//		agentpage.Click_ClickAgent();
//
//	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
//
//	    payroll.clickAgentPayroll();
//	    payroll.clickAgentPayrollDashboad();
//	    
//		ImportCompaniesPage.CompanyImportPage company= new ImportCompaniesPage.CompanyImportPage(driver);
//		company.clickImportEmployee();
//		
//		company.clickCsvIcn();
//		company.updatePayeR();
//
////		company.chooseFile2();
////		
////		company.selectDateFormate1();
////		
////		company.clickImportBtn1();
////		
////		ImportCompaniesPage.verifyPage verify= new ImportCompaniesPage.verifyPage(driver);
////		//verify.verifyImportCompanies();
//	
//		//company.deletFilename(data[6]);
//	//	 verify.assertAll();
//		
//	}
}
