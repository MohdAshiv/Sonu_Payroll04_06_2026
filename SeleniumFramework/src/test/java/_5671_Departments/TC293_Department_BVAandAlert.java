package _5671_Departments;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;


public class TC293_Department_BVAandAlert  extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

    // @Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		sTestCaseID = "TC293";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName1(data[4]);
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[15]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[13]);
		Bk.Enter_CompanyAddressLine1(data[14]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[15]);
		Bk.Enter_NewEndDate(data[16]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		company.enterFirstName(data[31]);
		company.enterEmail(data[32]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[17]);
		company.enterRefrenceNumber(data[18]);
		company.accountOfficeReffrence(data[19]);
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[30]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[20]);
		employee.enterFirstName(data[21]);
		employee.enterLastName(data[22]);
		employee.enterDateOfBirth(data[23]);
		employee.enterAddressLine(data[24]);
		employee.enterAddressLine2(data[25]);
		employee.enterPostCode(data[26]);
		employee.enterEmailAddress(data[32]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[30]);

		employee.enterNICategory(data[27]);
		employee.enterTaxCode(data[28]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[29]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		employee.clickNewEmployee();
		employee.enterTitle(data[34]);
		employee.enterFirstName(data[35]);
		employee.enterLastName(data[36]);
		employee.enterDateOfBirth(data[23]);
		employee.enterAddressLine(data[24]);
		employee.enterAddressLine2(data[25]);
		employee.enterPostCode(data[26]);
		employee.enterEmailAddress(data[32]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[30]);

		employee.enterNICategory(data[27]);
		employee.enterTaxCode(data[28]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary1(data[29]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		System.out.println("xvhvh");
	}
	
	@Test(priority=1)

	public void TC01validateDepartmentInputTextBVA() throws Exception {

		sTestCaseID = "TC293";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		
		company.clickDepartment();
		company.enterDepartmentName1(data[5]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(2000);
		verify.verifyDepartmentName(data[6]);
		verify.assertAll();
}	
	
	
	

	@Test(priority=2)

	public void TC02validateDeletAlert() throws Exception {

		sTestCaseID = "TC293";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		
		company.clickDeletDepartment();
		//company.clickDeletDepartment1();

		verify.verifyDeletAlert(data[7]);
		verify.assertAll();
}	
	

	@Test(priority=3)

	public void TC03validateDeleteDepartmentInputTextDisable() throws Exception {

		sTestCaseID = "TC293";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		
		company.clickDeletDepartment();

		verify.verifyDeletDepartmentDisable();
		verify.assertAll();
}	
	
	

	
	@Test(priority=4)

	public void TC04validateEditUpdateDepartment() throws Exception {

		sTestCaseID = "TC293";
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

		pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		company.clickEditDepartment();
		
		company.enterDepartmentName1(data[8]);
		company.clickUpdateDepatrmentBtn();
		
		verify.verifyDepartmentName(data[8]);
	  
		verify.verifyDepartmentDeletMsg1(data[10]);
	
	    
		verify.assertAll();
}	
	
	
	
	@Test(priority=5)

	public void TC05validateAssignUpdatedDepartmentShouldReflectOnDashBoard() throws Exception {

		sTestCaseID = "TC293";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        _5671Departments_Page.DepartmentsPage page= new  _5671Departments_Page.DepartmentsPage(driver);
        
        pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		company.clickDepartment();
		
		company.enterDepartmentName1(data[8]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(7000);
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[8]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();

		
        verify.verifyDepartmentFirstEmployee(data[8]);
		
        company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		company.clickEditDepartment();
		
		company.enterDepartmentName1(data[9]);
		company.clickUpdateDepatrmentBtn();
        
		payroll.Click_PayrollDashboard();
        verify.verifyDepartmentFirstEmployee(data[9]);

        payroll.Undo_LastPayroll();
        company.Click_gotoEditCompany();
		
        company.Click_clickDepartments();

		verify.verifyDepartmentDeletMsg1(data[10]);
	    verify.assertAll();
 	
}
	
	
	@Test(priority=6)

	public void TC06validateToastMsgWithoutDepartment() throws Exception {

		sTestCaseID = "TC293";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        _5671Departments_Page.DepartmentsPage page= new  _5671Departments_Page.DepartmentsPage(driver);
        
        pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		company.clickDepartment();
		
		company.clickDepatrmentSaveBtn();
		verify.verifyMsgWithEmptyDepartment(data[11]);
	    verify.assertAll();
 	
}

	
	
	@Test(priority=7)

	public void TC07validateAlertMsgIfAssignDepartmentAndDelet() throws Exception {

		sTestCaseID = "TC293";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        _5671Departments_Page.DepartmentsPage page= new  _5671Departments_Page.DepartmentsPage(driver);
        
        pages.EditCompany company = new pages.EditCompany(driver);
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		company.clickDepartment();
		
		company.enterDepartmentName1(data[8]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(7000);
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[8]);
		edit.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();

		payroll.Undo_LastPayroll();
    
		
        company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		company.clickDeletDepartment();
		verify.verifyDeletAlert(data[12]);
     //   driver.switchTo().alert().accept();
	    verify.assertAll();
 	
}
	
}
