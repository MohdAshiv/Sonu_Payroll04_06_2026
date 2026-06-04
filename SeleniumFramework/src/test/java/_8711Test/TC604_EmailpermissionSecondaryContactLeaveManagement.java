package _8711Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC604_EmailpermissionSecondaryContactLeaveManagement extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void TCvalidateLeaaveManagementEmail() throws Exception {

		sTestCaseID = "TC604";
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
		company.ClickContactDetails();
		company.enterFirstName(data[30]);
		
		company.enterEmail(data[31]);
		company.clickAddContact();
		
        company.enterFirstName(data[34]);
		company.enterEmail(data[35]);
		company.clickAddContact();
	   _8711Page.Page page= new _8711Page.Page(driver);
		page.editSecondryContact();
		page.untickTickAllOptionsManinContact();
		company.clickUpdateContact();
		page.editMainContact();
		page.untickTickAllOptionsManinContact();
		company.clickUpdateContact();
		
		
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
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[63]);
		employee.enterLastName(data[64]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.enterEmailAddress(data[37]);

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
		
		payroll.Run_Payroll();
		
		pages.FilingManagement submitRti=new 	pages.FilingManagement(driver);
		submitRti.Click_gotoFilingManagement();
		submitRti.selectStatus(data[8]);
		submitRti.clickCheckBox();
		submitRti.enterNotes();
		submitRti.clickNottoSubmit();
		pages.EmployerView employerView= new 	pages.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		leaves.clickApplyLeaves();
		leaves.selectLeaveType(data[9]);
		
		leaves.Enter_LeaverStartDateHoliday(data[13]);
		leaves.Enter_LeaverEndDateHoliday(data[14]);
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
		
	    leaves.selectLeaveType(data[10]);
		
		leaves.Enter_LeaverStartDateSick(data[15]);
		leaves.Enter_LeaverEndDateSick(data[16]);
		leaves.enterLeaveReson(data[20]);
		leaves.clickSaveBtn();
	
		leaves.selectLeaveType(data[12]);

		leaves.Enter_LeaverStartDateHoliday(data[18]);
		leaves.Enter_LeaverEndDateHoliday(data[19]);
		leaves.enterLeaveReson(data[20]);

		leaves.clickSaveBtn();

		leaves.selectLeaveType(data[11]);

		leaves.Enter_LeaverStartDateSSP(data[17]);
		leaves.enterAwe();

		leaves.clickSaveBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail1();

		
		_8711Page.Verify8711Page verify = new _8711Page.Verify8711Page(driver);

		verify.verifyEmailContact(data[32],data[33]);
		verify.assertAll();
	
}	
	
	
	
}
