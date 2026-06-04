package PayrollDashboard_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC807_PayrollDashboard_SearchingAndSorting  extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateSearchingWithEmployeeName() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		dashboard.enterDtaAndClickOnSearchBtn(data[5]);

		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyEmployeeName(data[7]);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		
		dashboard.enterDtaAndClickOnSearchBtn(data[6]);
		
		verify.verifyEmployeeName(data[7]);
		verify.assertAll();
	}
	
	

	@Test(priority=2)

	public void TC02validateSearchingWithGross() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		dashboard.enterDtaAndClickOnSearchBtn(data[8]);

		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyEmployeeName(data[9]);
		
	
		verify.assertAll();
	}
	

	@Test(priority=3)

	public void TC03validateSearchingWithTaxCode() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		dashboard.enterDtaAndClickOnSearchBtn(data[10]);

		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.verifyEmployeeName(data[11]);
		
		verify.assertAll();
	}
	
	
	
	@Test(priority=4)

	public void TC04validateGrossSorting() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSorting();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending(5);
		dashboard.clickOnSorting();
		verify.testSortAscending(5);
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.clickNextPage();        // verify Sorting on 2nd page
		
		dashboard.clickOnSorting();
		verify.testSortDescending(5);
		dashboard.clickOnSorting();
		verify.testSortAscending(5);

		verify.assertAll();
	}
	
	
	

	@Test(priority=5)

	public void TC05validateTaxSorting() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSorting();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending(6);
		dashboard.clickOnSorting();
		verify.testSortAscending(6);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

        payroll.clickNextPage();        // verify Sorting on 2nd page
		dashboard.clickOnSorting();
		verify.testSortDescending(6);
		dashboard.clickOnSorting();
		verify.testSortAscending(6);
		verify.assertAll();
		
	}
	
	

	@Test(priority=6)

	public void TC06validateEmployeeNISorting() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSorting();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending(10);
		dashboard.clickOnSorting();
		verify.testSortAscending(10);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
        payroll.clickNextPage();     // verify Sorting on 2nd page
		dashboard.clickOnSorting();
		verify.testSortDescending(10);
		dashboard.clickOnSorting();
		verify.testSortAscending(10);
		verify.assertAll();
	}
	
	
	@Test(priority=7)

	public void TC07validateEmployeePension() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSorting();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending(11);
		dashboard.clickOnSorting();
		verify.testSortAscending(11);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
        payroll.clickNextPage();     // verify Sorting on 2nd page
		dashboard.clickOnSorting();
		verify.testSortDescending(11);
		dashboard.clickOnSorting();
		verify.testSortAscending(11);
		verify.assertAll();
	}
	
	
	@Test(priority=8)

	public void TC08validateNetPay() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSorting();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending(12);
		dashboard.clickOnSorting();
		verify.testSortAscending(12);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
        payroll.clickNextPage();     // verify Sorting on 2nd page
		dashboard.clickOnSorting();
		verify.testSortDescending(12);
		dashboard.clickOnSorting();
		verify.testSortAscending(12);
		verify.assertAll();
	}

	
	
	
	@Test(priority=9)

	public void TC09validateEmployerNI() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSorting();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending(13);
		dashboard.clickOnSorting();
		verify.testSortAscending(13);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
        payroll.clickNextPage();     // verify Sorting on 2nd page
		dashboard.clickOnSorting();
		verify.testSortDescending(13);
		dashboard.clickOnSorting();
		verify.testSortAscending(13);
		verify.assertAll();
	}
	
	
	
	
	@Test(priority=10)

	public void TC10validateEmployerPension() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSorting();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending(14);
		dashboard.clickOnSorting();
		verify.testSortAscending(14);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
        payroll.clickNextPage();     // verify Sorting on 2nd page
		dashboard.clickOnSorting();
		verify.testSortDescending(14);
		dashboard.clickOnSorting();
		verify.testSortAscending(14);
		verify.assertAll();
	}


	
	@Test(priority=11)

	public void TC11validateTaxCodeSorting() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickOnSortingTaxCode();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending1(2);
		
		
		dashboard.clickOnSortingTaxCode();
		verify.testSortAscending1(2);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
        payroll.clickNextPage(); 
		dashboard.clickOnSortingTaxCode();
        verify.testSortDescending1(2);

		dashboard.clickOnSortingTaxCode();
		verify.testSortAscending1(2);

		verify.assertAll();
	}
	
	
	@Test(priority=12)

	public void TC12validateDepartmentSorting() throws Exception {

		sTestCaseID = "TC807";
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
		
		pages.DashboardPage dashboard= new pages.DashboardPage(driver);

		dashboard.clickDepartment();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.testSortDescending1(4);
		dashboard.clickDepartment();
		verify.testSortAscending1(4);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
        payroll.clickNextPage(); 
		dashboard.clickDepartment();
		
        verify.testSortDescending1(4);
		dashboard.clickDepartment();
		verify.testSortAscending1(4);

		verify.assertAll();
	}
}
