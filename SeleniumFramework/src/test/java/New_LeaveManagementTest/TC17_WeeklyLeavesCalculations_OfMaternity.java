package New_LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC17_WeeklyLeavesCalculations_OfMaternity  extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	
	
	@Test(priority = 0)
	public void TC01_CreateAClientWithMrTitleAndVerifyDataAndLeavesTypeOption() throws Exception {

		sTestCaseID = "TC01";
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
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
	
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
	    company.Click_clickDepartments();		
		company.clickDepartment();
		company.enterDepartmentName1(data[25]);
		company.clickDepatrmentSaveBtn();
		Thread.sleep(15000);
		
		company.Click_clickPayrollDetails();
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		company.Click_ClickSave();
		
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		pages.FrequencySet freq= new pages.FrequencySet(driver);
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[26]);
		freq.Enter_WeeklyPayDate(data[69]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		company.Click_ClickSave();
		company.clickDisplayLeaveOnPayslip();
		company.Click_ClickSave();
		company.clickGeneralTerms();
		company.clickCommanContractualTerms();
		company.enterLeaveStartDate(data[32]);
		company.enterHolidayPayRate(data[33]);
		company.enterMaxCarryOver(data[34]);
		company.enterWeeklyWorkingHrs(data[35]);
		company.chkNormalWorkingDays(data[42]);
		company.chkNormalWorkingDays(data[43]);
		company.chkNormalWorkingDays(data[44]);
		company.chkNormalWorkingDays(data[45]);
		company.chkNormalWorkingDays(data[46]);
		company.chkNormalWorkingDays(data[47]);
		company.chkNormalWorkingDays(data[48]);
		company.unChkNormalWorkingDays(data[47]);
		company.unChkNormalWorkingDays(data[48]);
	
		
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[54]);
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.enterEmailAddress("muhammad.ashiv@nomi.co.uk");
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[55]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
	//	employee.SearchEmployee(data[63]);
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.verifyFirstName(data[63]);
		employee.verifyLastName(data[64]);
		employee.verifyDateOfBirth(data[65]);
		employee.verifyAddressLine(data[66]);
		employee.verifyAddressLine2(data[67]);
		employee.verifyPostCode(data[68]);
		
		employee.clickMandotoryPayroll();
		employee.verifyJoiningDate(data[55]);
		employee.verifyNICategory(data[6]);
		employee.verifyTaxCode(data[7]);
		
		employee.click_Paydetails();
		employee.verifyBasicSalary3(data[5]);
		company.verifyWeeklyWorkingHrs(data[35]);
		
		company.clickGeneralTerms();
		company.verifyLeaveStartDate(data[32]);
		company.verifyHolidayPayRate(data[33]);
		company.verifyUnChkedNormalWorkingDays(data[47]);
		company.verifyUnChkedNormalWorkingDays(data[48]);
		company.verifychkedNormalWorkingDays(data[42]);
		company.verifychkedNormalWorkingDays(data[43]);
		company.verifychkedNormalWorkingDays(data[44]);
		company.verifychkedNormalWorkingDays(data[44]);
		company.verifychkedNormalWorkingDays(data[46]);
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickAddLeaves();
		leaves.VerifyAllLeaveType("Statutory Paternity Pay-Sick Leave-Half day sick-Holiday-Unpaid Leave-Other");
		leaves.selectLeaveType(data[36]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[42], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[43], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[44], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[45], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[46], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[47], data[49]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[48], data[49]);
		leaves.selectLeaveType(data[37]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[42], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[43], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[44], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[45], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[46], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[47], data[49]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[48], data[49]);
		leaves.selectLeaveType(data[38]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[42], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[43], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[44], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[45], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[46], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[47], data[49]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[48], data[49]);
		leaves.selectLeaveType(data[39]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[42], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[43], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[44], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[45], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[46], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[47], data[49]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[48], data[49]);
		leaves.selectLeaveType(data[40]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[42], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[43], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[44], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[45], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[46], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[47], data[49]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[48], data[49]);
		leaves.selectLeaveType(data[41]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[42], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[43], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[44], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[45], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[46], data[50]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[47], data[49]);
		leaves.verifyChkAndUnChkedNormalWorkingDays(data[48], data[49]);
		employee.AssertALL();
		company.AssertALL();
	}
	
	
}