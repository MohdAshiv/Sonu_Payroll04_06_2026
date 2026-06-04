package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC024_13272_DepartmentBookkeepingAllocation extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)

	public void TC01validateDepartmentNumberOfStaffsIfAllcatedByBookkeeping() throws Exception {

		sTestCaseID = "TC024";
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
//
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[29]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
	
		OpenClient.Click_ClickClientPayroll();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);

		company.Click_gotoEditCompany();
          company.Click_clickDepartments();		
		
			company.clickDepartment();
			company.enterDepartmentName1(data[6]);
			company.clickDepatrmentSaveBtn();
			Thread.sleep(15000);
		
		company.ClickContactDetails();
		company.enterFirstName(data[30]);
		company.enterEmail(data[31]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();

		company.enterPayeNumber(data[16]);
		company.enterRefrenceNumber(data[17]);
		company.accountOfficeReffrence(data[18]);

		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[29]);
		company.Click_ClickSave();
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		payroll.Click_PayrollDashboard();

		pages.EmployeeEditAndRateChanges employee = new pages.EmployeeEditAndRateChanges(driver);

		employee.clickNewEmployee();
		employee.enterTitle(data[19]);
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[22]);
		employee.enterAddressLine(data[23]);
		employee.enterAddressLine2(data[24]);
		employee.enterPostCode(data[25]);
		employee.enterEmailAddress(data[31]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[29]);

		employee.clickOffPayWorker();

		employee.enterNICategory(data[26]);
		employee.enterTaxCode(data[27]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName();
		employee.editEmployeeDetails();

		employee.click_Paydetails();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectDepartment(data[6]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		

		utilities.ChangeWindow.Switchwindow(1, driver);
		OpenClient.Click_ClickClientBK();
		
		pages.BookKeeping_Page Bk= new pages.BookKeeping_Page(driver);
		
		Bk.clickExpenditure();
		Bk.clickAdvisorTool();
		Bk.clickDepartmentalEnteries();
		Bk.selectTransaction();
		Bk.selectDepartment(data[6]);
		Bk.clickBulkAllocate();

		utilities.ChangeWindow.Switchwindow(2, driver);

		company.Click_gotoEditCompany();
        company.Click_clickDepartments();
          
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyNumberOfStaff(data[7]);
		
		verify.assertAll();

 }	
	
	
	
	
	@Test(priority=2)

	public void TC02validateDepartmentNumberOfStaffsIfUnallcatedByBookkeeping() throws Exception {

		sTestCaseID = "TC024";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
	
		OpenClient.Click_ClickClientBK();
		
	    pages.BookKeeping_Page Bk= new pages.BookKeeping_Page(driver);
		
		Bk.clickExpenditure();
		Bk.clickAdvisorTool();
		Bk.clickDepartmentalEnteries();
		Bk.clickBulkUnallocate();
		pages.EditCompany company= new 	pages.EditCompany(driver);

		utilities.ChangeWindow.Switchwindow(1, driver);
		OpenClient.Click_ClickClientPayroll();

		company.Click_gotoEditCompany();
        company.Click_clickDepartments();
          
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyNumberOfStaff(data[7]);
		
		verify.assertAll();

 }	

}
