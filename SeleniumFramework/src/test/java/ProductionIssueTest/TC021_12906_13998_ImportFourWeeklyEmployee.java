package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC021_12906_13998_ImportFourWeeklyEmployee extends TestBase {
	
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateFourWeeklyImport() throws Exception {

		sTestCaseID = "TC021";
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

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.clickAgentPayroll();
	    payroll.clickAgentPayrollDashboad();
	    
		ImportCompaniesPage.CompanyImportPage company= new ImportCompaniesPage.CompanyImportPage(driver);
		company.clickImportEmployee();
		
		
		company.chooseFile1(data[5]);
		
		company.clickUploadBtn();
		company.selectDateFormate1();
		
		company.clickImportBtn1Employee();
		

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);

		verify.verifyEmployeeName(data[8]);
		verify.assertAll();
		
	}
	
	

	@Test(priority=2)

	public void TC02validateFourWeeklyImport() throws Exception {

		sTestCaseID = "TC021";
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

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.clickAgentPayroll();
	    payroll.clickAgentPayrollDashboad();
	    
		ImportCompaniesPage.CompanyImportPage company= new ImportCompaniesPage.CompanyImportPage(driver);
		company.clickImportEmployee();
		
		
		company.chooseFile1(data[9]);
		
		company.clickUploadBtn();
		company.selectDateFormate1();
		
		company.clickImportBtn1Employee();
		

		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);

		verify.verifyErrorMsg();
		verify.assertAll();
		
	}
	
	
	

}


