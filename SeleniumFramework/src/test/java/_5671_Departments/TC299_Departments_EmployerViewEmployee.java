package _5671_Departments;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC299_Departments_EmployerViewEmployee extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC_01validateDepartmentsOnEmployerViewEmployee() throws Exception {

		sTestCaseID = "TC299";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.verifyDepartmentsEmployerViewEmployee( data[5]);
		
		driver.navigate().back(); Thread.sleep(3000);
		employerView.clickEmployee1();
		verify.verifyDepartmentsEmployerViewEmployee( data[6]);

		verify.assertAll();
	}	
	
	
	@Test(priority=2)

	public void TC_02validateDepartmentIndividualEmployeePayScheduleFirstEmployee() throws Exception {

		sTestCaseID = "TC299";
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
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.verifyEmployeeSelectionDisable();
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[5]);
		
		verify.assertAll();

	}	
	
	@Test(priority=3)

	public void TC_03validateDepartmentIndividualEmployeePayScheduleSecondEmployee() throws Exception {

		sTestCaseID = "TC299";
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
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee1();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.verifyEmployeeSelectionDisable();
		verify.verifyDepartmentsIndividualEmployeePaySchedule(data[6]);
		
		verify.assertAll();

	}	
	

	@Test(priority=4)

	public void TC_04validateDepartmentIndividualEmployeePayScheduleExportToPdfFirstEmployee() throws Exception {

		sTestCaseID = "TC299";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.clickEmployee();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
	
		verify.VerifyDepartmentOnIEPScheduleExportToPdf(data[7],data[5]);

		verify.assertAll();

	}
	
	
	
	@Test(priority=5)

	public void TC_05validateDepartmentIndividualEmployeePayScheduleExportToCsvFirstEmployee() throws Exception {

		sTestCaseID = "TC299";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.ReadCSVFile(data[9],data[5]);
	 	
		verify.assertAll();

	}	
	


	@Test(priority=6)

	public void TC_06validateDepartmentIndividualEmployeePayScheduleExportToPdfSecondEmployee() throws Exception {

		sTestCaseID = "TC299";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.clickEmployee1();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
	
		verify.VerifyDepartmentOnIEPScheduleExportToPdf(data[8],data[6]);

		verify.assertAll();

	}
	
	

	@Test(priority=7)

	public void TC_07validateDepartmentIndividualEmployeePayScheduleExportToCsvFirstEmployee() throws Exception {

		sTestCaseID = "TC299";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee1();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		_5671Departments_Page.VerifyPage verify= new _5671Departments_Page.VerifyPage (driver);
		
		verify.ReadCSVFile(data[10],data[6]);
		verify.deletCsv(data[9], data[10]);
	 	
		verify.assertAll();

	}	
	
	
}
