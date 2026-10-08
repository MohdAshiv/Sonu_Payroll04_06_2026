package New_LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class ExtraTC  extends TestBase{
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_LeaveShouldStartAtTheDateWhichEnteredInEditCompany() throws Exception {

		sTestCaseID = "TC25";
		Sheet = "Sheet10";
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
		

//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[5]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[6]);
		company.enterRefrenceNumber(data[7]);
		company.accountOfficeReffrence(data[8]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[9]);
		company.clickDisplayLeaveOnPayslip();
		company.Click_ClickSave();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[10]);
		company.enterHolidayPayRate(data[11]);
		company.enterMaxCarryOver(data[12]);
		company.enterWeeklyWorkingHrs(data[14]);
		company.Click_ClickSave();
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
	
		employee.clickNewEmployee();
		employee.enterTitle(data[15]);
		employee.enterFirstName(data[16]);
		employee.enterLastName(data[17]);
		employee.enterDateOfBirth(data[18]);
		employee.enterAddressLine(data[19]);
		employee.enterAddressLine2(data[20]);
		employee.enterPostCode(data[21]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[22]);
		employee.enterNICategory(data[17]);
		employee.enterTaxCode(data[23]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[24]);
		employee.clickSaveBtn();

		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.verifyLeaveStartDate(data[10]);
		
	
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(12);
		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.verifyLeaveStartDate(data[13]);
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verfyAvailablePeriodInDropdown("06/04/2023 - 05/04/2024 & ");
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(12);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verfyAvailablePeriodInDropdown("06/04/2023 - 05/04/2024 & 06/04/2024 - 05/04/2025 & ");
		
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.clickonEmpbyIndex(0);
		leaves.verifyEmpLeaveDataInEmployeeLeaveDetailsPopUnderTheLeaveReport("Start Date:", data[13]);
		
		
//		employee.clickEmployeeName();
//		employee.editEmployeeDetails();
		
		
		company.AssertALL();
		leaves.assertAll();
		
	}
	
	
	@Test(priority = 1)
	public void TC01_VerifyLeaveDays() throws Exception {

		sTestCaseID = "TC25";
		Sheet = "Sheet10";
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
		

		OpenClient.Enter_EnterClientName("XMupTiNhz");
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[5]);
//		buisness.enterFirstName();
//		buisness.enterLastName();
//		buisness.clickSaveBtn();
//		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[6]);
//		company.enterRefrenceNumber(data[7]);
//		company.accountOfficeReffrence(data[8]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[9]);
//		company.clickDisplayLeaveOnPayslip();
//		company.Click_ClickSave();
//		company.clickGeneralTerms();
//		company.clickCommanContractualTerms();
//		company.enterLeaveStartDate(data[10]);
//		company.enterleaveDays(data[14]);
//		company.enterHolidayPayRate(data[11]);
//		company.enterMaxCarryOver(data[12]);
//		company.enterWeeklyWorkingHrs(data[14]);
//		company.Click_ClickSave();
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
	
//		employee.clickNewEmployee();
//		employee.enterTitle(data[15]);
//		employee.enterFirstName(data[16]);
//		employee.enterLastName(data[17]);
//		employee.enterDateOfBirth(data[18]);
//		employee.enterAddressLine(data[19]);
//		employee.enterAddressLine2(data[20]);
//		employee.enterPostCode(data[21]);
//		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		employee.enterJoiningDate(data[22]);
//		employee.enterNICategory(data[17]);
//		employee.enterTaxCode(data[23]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[24]);
//		employee.clickSaveBtn();

		
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.verifyLeaveDays(data[14]);
		
	
//		payroll.Click_PayrollDashboard();
//		payroll.Run_PayrollByIndex(12);
//		
//		
//		

		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verfyAvailablePeriodInDropdown("06/04/2023 - 05/04/2024 & ");
		
		payroll.Click_PayrollDashboard();
		payroll.Run_PayrollByIndex(12);
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.verfyAvailablePeriodInDropdown("06/04/2023 - 05/04/2024 & 06/04/2024 - 05/04/2025 & ");
		
		payroll.Click_PayrollDashboard();
		payroll.Click_PayrollDashboard();
		company.Click_gotoEditCompany();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.verifyLeaveDays(data[14]);
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		
		leaves.clickLeaveManagement();
		leaves.clickLeaveReport();
		leaves.clickonEmpbyIndex(0);
		leaves.verifyEmpLeaveDataInEmployeeLeaveDetailsPopUnderTheLeaveReport("Annual Leave (Days):", data[14]);
		
		
//		employee.clickEmployeeName();
//		employee.editEmployeeDetails();
		
		
//		company.AssertALL();
		leaves.assertAll();
		
	}
}