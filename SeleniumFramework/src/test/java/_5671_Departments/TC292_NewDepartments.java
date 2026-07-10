package _5671_Departments;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC292_NewDepartments extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	   //@Test(priority = 0)
	
		public void ClientSetup() throws Exception 
		{
			sTestCaseID = "TC292";
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

	public void TC01validateSameNameDepatrmentShouldNotExist() throws Exception {

		sTestCaseID = "TC292";
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
		company.enterDepartmentName1(" ");
		company.clickDepatrmentSaveBtn();
		verify.verifyDepartmentShouldNotDuplicate("Error! Please enter a department name.");

		company.enterDepartmentName1(data[7]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(7000);
		
		company.clickDepartment();
		company.enterDepartmentName1(data[7]);
		company.clickDepatrmentSaveBtn();
		verify.verifyDepartmentShouldNotDuplicate(data[8]);
		verify.assertAll();
}
	
	@Test(priority=2)

	public void TC02validateAssignDepartmentShouldReflectOnDashBoard() throws Exception {

		sTestCaseID = "TC292";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName("2023 Payrolls");
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName("17898 @#$%^&*&*TestDepartment");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
        _5671Departments_Page.DepartmentsPage page= new  _5671Departments_Page.DepartmentsPage(driver);
        
        
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("eight");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("AA");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("BB");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("one");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("Nine");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("seven");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("six");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
		
		for(int i=0;i<=79;i++) {
		edit.click_Paydetails();
	//	page.selectDepartment(data[7]);
		page.selectDepartment("ten");
	     edit.clickSaveNextBtn();
		Thread.sleep(2000);
		System.out.println(i);
		}
		
	
		
//		payroll.Click_PayrollDashboard();
//
//		
//		
//		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
//
//		
//        verify.verifyDepartmentFirstEmployee(data[7]);
//		
//	   verify.assertAll();
 	
}

	
	
	
	@Test(priority=3)

	public void TC03validateNoOfStaff() throws Exception {

		sTestCaseID = "TC292";
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
		company.clickNoOffStaff();
		verify.verifyNumberOfStaff(data[9]);
	
		verify.assertAll();
	   
   
}

	
	
	
	@Test(priority=4)

	public void TC04validateAssignDepartmentShouldReflectOnDashBoardRunPayroll() throws Exception {

		sTestCaseID = "TC292";
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
		
        for(int i=0;i<=3;i++) {payroll.Run_Payroll();}
        	
        _5671Departments_Page.DepartmentsPage page= new  _5671Departments_Page.DepartmentsPage(driver);
	    edit.clickEmployeeName1();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDepartment(data[7]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);

		
        verify.verifyDepartmentSecondEmployee(data[7]);
		
	    verify.assertAll();
 	
}
	

	@Test(priority=5)

	public void TC05validateNoOfStaffRunPayroll() throws Exception {

		sTestCaseID = "TC292";
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
		company.clickNoOffStaff();
		verify.verifyNumberOfStaff(data[10]);
	
		verify.assertAll();
	
}
	
	
	@Test(priority=6)

	public void TC06ResetDepartmentAndValidateStaffNumber() throws Exception {

		sTestCaseID = "TC292";
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
	    edit.clickEmployeeName1();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDefaultDepartment(data[11]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		for(int i=0;i<=3;i++) {payroll.Undo_LastPayroll(); Thread.sleep(1000);}
		edit.clickEmployeeName();
		edit.editEmployeeDetails();

		edit.click_Paydetails();
		page.selectDefaultDepartment(data[11]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		pages.EditCompany company = new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
		
		company.Click_clickDepartments();
		company.clickNoOffStaff();
		verify.verifyNumberOfStaff(data[12]);
	
	    verify.assertAll();
 	
}
	
	@Test(priority=7)

	public void TC07validateMultilpeDepartmentsAdded() throws Exception {

		sTestCaseID = "TC292";
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
		Thread.sleep(3000);
		for(int i=0; i<=9;i++) {
		company.clickDepartment();
		company.enterDepartmentName();
		company.clickDepatrmentSaveBtn();
		verify.verifyDepartmentSavedMsg(data[5]);
		
		Thread.sleep(9000);

	
		}
		
		verify.assertAll();
	   
   
	
}
	@Test(priority=8)

	public void TC08validateMultilpeDepartmentsDeleted() throws Exception {

		sTestCaseID = "TC292";
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
		
		verify.verifyDepartmentDeletMsg(data[6]);
	
		verify.assertAll();
	   
}
	
	
}
