package _9126Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC705_Department_Filter extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateDepartmentwithAll() throws Exception {
		sTestCaseID = "TC705";
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

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();

		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();

		company.Click_clickDepartments();
		
		
		
		for(int i=9; i<=11;i++)
		{
			company.clickDepartment();
			company.enterDepartmentName1(data[i]);
			company.clickDepatrmentSaveBtn();
			Thread.sleep(7000);
		}
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
		
		
		
	pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		

		for(int i=70;i<=74;i++)
		{
			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[i]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			
			employee.enterJoiningDate(data[69]);

			employee.enterNICategory(data[6]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			
			employee.click_Paydetails();
			employee.enterBasicSalary3(data[5]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
			Thread.sleep(3000);
			
		}
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		
		employee.clickEmployeeName();
		employee.editEmployeeDetails();

		employee.click_Paydetails();

		page.selectDepartment(data[9]);
		employee.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName1();
		employee.editEmployeeDetails();

		employee.click_Paydetails();
		page.selectDepartment(data[9]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		employee.clickEmployeeName2();
		employee.editEmployeeDetails();

		employee.click_Paydetails();
		page.selectDepartment(data[10]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		employee.clickEmployeeName3();
		employee.editEmployeeDetails();

		employee.click_Paydetails();
		page.selectDepartment(data[10]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		employee.clickEmployeeName4();
		employee.editEmployeeDetails();

		employee.click_Paydetails();
		page.selectDepartment(data[11]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
	
		
		payroll.Run_Payroll();
		
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);

		  
		  
	//	verify.verifyDepartment(data[12],data[13],data[14],data[15],data[16]);
		verify.verifyDataGroup();
	    verify .assertAll();

	}
	
	
	
	@Test(priority=2)
	public void TC02validateDepartmentWithSingle() throws Exception {
		sTestCaseID = "TC705";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectDepartmentReport(data[10]);
		page.searchBtn();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		
		  
		verify.verifyDataGroup();
		
	    verify .assertAll();
	
		
	}
	
	@Test(priority=3)
	public void TC03validateDepartmentalPage() throws Exception {
		sTestCaseID = "TC705";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	    pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	
		verify.verifyHeader(data[20]);
		
	    verify .assertAll();
	
		
	}
}
