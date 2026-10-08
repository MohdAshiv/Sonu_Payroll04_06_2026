package New_LeaveManagementTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC19_verifyCarriedForwardLeavesInNextYear extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	
	@Test(priority = 1)
	public void TC01_verify15CarriedForwardLeavesInNextYear() throws Exception {

		sTestCaseID = "TC14L";
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

//		OpenClient.Click_ClientsClick();
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
		company.ClickP11D();
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[9]);
		company.clickDisplayLeaveOnPayslip();
		company.Click_ClickSave();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[9]);
		company.enterleaveDays(data[30]);
		company.enterHolidayPayRate(data[10]);
		company.enterMaxCarryOver(data[11]);
		company.enterWeeklyWorkingHrs(data[11]);
		company.Click_ClickSave();
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickNewEmployee();
		employee.enterTitle(data[12]);
		employee.enterFirstName(data[13]);
		employee.enterLastName(data[14]);
		employee.enterDateOfBirth(data[15]);
		employee.enterAddressLine(data[16]);
		employee.enterAddressLine2(data[17]);
		employee.enterPostCode(data[18]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[9]);
		employee.enterNICategory(data[19]);
		employee.enterTaxCode(data[20]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[21]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		employee.clickNewEmployee();
		employee.enterTitle(data[12]);
		employee.enterFirstName(data[13]);
		employee.enterLastName(data[22]);
		employee.enterDateOfBirth(data[15]);
		employee.enterAddressLine(data[16]);
		employee.enterAddressLine2(data[17]);
		employee.enterPostCode(data[18]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[9]);
		employee.enterNICategory(data[19]);
		employee.enterTaxCode(data[20]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[21]);
		employee.clickSaveBtn();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectEmployee(data[25]);
		leaves.selectLeaveType(data[28]);
		leaves.Enter_LeaverStartDateHoliday(data[26]);
		leaves.Enter_LeaverEndDateHoliday(data[27]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		
	
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		payroll.Run_PayrollByIndex(12);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		Report.clickOnEmpLinkByNameInDashboard(data[25]);
		company.clickGeneralTerms();
		company.verifyLeaveStartDate(data[29]);
		company.verifyLeaveDays(data[30]);
		company.verifyHolidayPayRate(data[10]);
		company.verifyMaxCarryOver(data[11]);
		leaves.verifyAnnualLeaveSchedule(data[30], data[31], data[32], data[32], data[32], data[33]);
		
		
		leaves.assertAll();
		company.AssertALL();
		
		
		
	}
	
	
	@Test(priority = 2)
	public void TC02_verify3CarriedForwardLeavesInNextYear() throws Exception {

		sTestCaseID = "TC14L";
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

//		OpenClient.Click_ClientsClick();
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
		company.ClickP11D();
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[9]);
		company.clickDisplayLeaveOnPayslip();
		company.Click_ClickSave();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[9]);
		company.enterleaveDays(data[30]);
		company.enterHolidayPayRate(data[10]);
		company.enterMaxCarryOver(data[36]);
		company.enterWeeklyWorkingHrs(data[11]);
		company.Click_ClickSave();
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickNewEmployee();
		employee.enterTitle(data[12]);
		employee.enterFirstName(data[13]);
		employee.enterLastName(data[14]);
		employee.enterDateOfBirth(data[15]);
		employee.enterAddressLine(data[16]);
		employee.enterAddressLine2(data[17]);
		employee.enterPostCode(data[18]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[9]);
		employee.enterNICategory(data[19]);
		employee.enterTaxCode(data[20]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[21]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		employee.clickNewEmployee();
		employee.enterTitle(data[12]);
		employee.enterFirstName(data[13]);
		employee.enterLastName(data[22]);
		employee.enterDateOfBirth(data[15]);
		employee.enterAddressLine(data[16]);
		employee.enterAddressLine2(data[17]);
		employee.enterPostCode(data[18]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[9]);
		employee.enterNICategory(data[19]);
		employee.enterTaxCode(data[20]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[21]);
		employee.clickSaveBtn();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectEmployee(data[25]);
		leaves.selectLeaveType(data[28]);
		leaves.Enter_LeaverStartDateHoliday(data[26]);
		leaves.Enter_LeaverEndDateHoliday(data[38]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		
	
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		payroll.Run_PayrollByIndex(12);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		Report.clickOnEmpLinkByNameInDashboard(data[25]);
		company.clickGeneralTerms();
		company.verifyLeaveStartDate(data[29]);
		company.verifyLeaveDays(data[30]);
		company.verifyHolidayPayRate(data[10]);
		company.verifyMaxCarryOver(data[36]);
		leaves.verifyAnnualLeaveSchedule(data[30], data[39], data[32], data[32], data[32], data[40]);
		
		
		leaves.assertAll();
		company.AssertALL();
		
		
		
	}
	
	
	@Test(priority = 3)
	public void TC03_verifyAnnualLeaveSchedule() throws Exception {

		sTestCaseID = "TC14L";
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

//		OpenClient.Click_ClientsClick();
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
		company.ClickP11D();
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[9]);
		company.clickDisplayLeaveOnPayslip();
		company.Click_ClickSave();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[9]);
		company.enterleaveDays(data[30]);
		company.enterHolidayPayRate(data[10]);
		company.enterMaxCarryOver(data[11]);
		company.enterWeeklyWorkingHrs(data[11]);
		company.Click_ClickSave();
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		payroll.Click_PayrollDashboard();
		employee.clickNewEmployee();
		employee.enterTitle(data[12]);
		employee.enterFirstName(data[13]);
		employee.enterLastName(data[14]);
		employee.enterDateOfBirth(data[15]);
		employee.enterAddressLine(data[16]);
		employee.enterAddressLine2(data[17]);
		employee.enterPostCode(data[18]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[9]);
		employee.enterNICategory(data[19]);
		employee.enterTaxCode(data[20]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[21]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		employee.clickNewEmployee();
		employee.enterTitle(data[12]);
		employee.enterFirstName(data[13]);
		employee.enterLastName(data[22]);
		employee.enterDateOfBirth(data[15]);
		employee.enterAddressLine(data[16]);
		employee.enterAddressLine2(data[17]);
		employee.enterPostCode(data[18]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[9]);
		employee.enterNICategory(data[19]);
		employee.enterTaxCode(data[20]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[21]);
		employee.clickSaveBtn();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.selectEmployee(data[25]);
		leaves.selectLeaveType(data[28]);
		leaves.Enter_LeaverStartDateHoliday(data[26]);
		leaves.Enter_LeaverEndDateHoliday(data[27]);
	//	leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
		
	
		payroll.Click_PayrollDashboard();
		payroll.FullUndoPayroll();
		payroll.Run_PayrollByIndex(5);
		Reports.P60P45AndP11DformsReports Report=new Reports.P60P45AndP11DformsReports(driver);
		Report.clickOnEmpLinkByNameInDashboard(data[25]);
		company.clickGeneralTerms();
		company.verifyLeaveStartDate(data[9]);
		company.verifyLeaveDays(data[30]);
		company.verifyHolidayPayRate(data[10]);
		company.verifyMaxCarryOver(data[32]);
		leaves.verifyAnnualLeaveSchedule(data[41], data[32], data[43], data[32], data[32], data[42]);
		
		
		leaves.assertAll();
		company.AssertALL();
		
		
		
	}
}