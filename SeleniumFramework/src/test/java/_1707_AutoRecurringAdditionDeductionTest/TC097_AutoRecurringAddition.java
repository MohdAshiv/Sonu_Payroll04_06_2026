package _1707_AutoRecurringAdditionDeductionTest;

import org.testng.annotations.Test;

import pages.EmployeePage;
import tests.TestBase;
import utilities.ExcelData;

public class TC097_AutoRecurringAddition  extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
     
	   // @Test(priority = 0)
		
		public void ClientSetup() throws Exception 
		{
			
			sTestCaseID = "TC097";
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
			buisness.enterBuisnessName1(data[20]);
			
			buisness.enterRegistrationNo();
			buisness.enterRegistrationDate(data[23]);
			buisness.enterFirstName();
			buisness.enterLastName();
			buisness.clickSaveBtn();
			
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[20]);
			OpenClient.Click_ClickSearch();
		
			pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
			Bk.Click_BKEdit();
			Bk.Select_services(data[21]);
			Bk.Enter_CompanyAddressLine1(data[22]);
			Bk.Click_Save();

			Bk.Click_AccountingPeriod();
			Bk.Click_AddAccountingPeriod();
			Bk.Enter_NewStartDate(data[23]);
			Bk.Enter_NewEndDate(data[24]);
			Bk.Click_AccPeriodSave();
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[20]);
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
			pages.EditCompany company= new 	pages.EditCompany(driver);
			
			company.Click_gotoEditCompany();
			company.Click_clickPayrollDetails();
			
			company.enterPayeNumber(data[25]);
			company.enterRefrenceNumber(data[26]);
			company.accountOfficeReffrence(data[27]);
			
			company.Click_ClickSave();
			company.Click_clickPayrollSettings();
			company.Enter_NomismaStartDate(data[28]);
			company.Click_ClickSave();
			company.clickYesPension();
			pages.PayrollRun payroll= new pages.PayrollRun (driver);

			pages.PensionSetup pension = new pages.PensionSetup(driver);
			
			pension.enterPensionStagingDate(data[28]);
			pension.enterSignatoryTitle();
			pension.enterSignatoryName();
			pension.enterEmailAddress(data[29]);
			pension.enterPhoneNumber();
			pension.enterPensionId(data[30]);
			pension.clickPensonDetailsSave();
			payroll.scrollClickPayrollDashboard();
			pension.clickPensionDashBoard();
			pension.addSchemeManually();
			pension.enterPensionSchemeName(data[31]);
			pension.selectPensionProvider(data[31]);
			pension.selectCalculationBasis(data[32]);
			pension.selectCalculationMethod(data[33]);
			pension.eeContribution(data[34]);
			pension.enterErContribution(data[35]);
			pension.enterSubgroupName();
			pension.enterGroupId();
			pension.enterSubGroupId();
			pension.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
			
			employee.clickNewEmployee();
			employee.enterFirstName(data[37]);
			employee.enterLastName(data[38]);
			employee.enterDateOfBirth(data[39]);
			employee.enterAddressLine(data[40]);
			employee.enterAddressLine2(data[41]);
			employee.enterPostCode(data[42]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[43]);

			employee.enterNICategory(data[44]);
			employee.enterTaxCode(data[45]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary1(data[46]);
			employee.clickSaveBtn();
			employee.clickAutoEnrolment();
			pension.selectWorkerType(data[47]);
			pension.selectScheme(data[31]);
			pension.enterEnrollmentDate(data[28]);
			pension.eeChoosenContribution(data[34]);
			pension.erChoosenContribution(data[35]);
			pension.eeVoluntaryContribution(data[36]);
			pension.eRVoluntaryContribution(data[36]);
			pension.clickAutoEnrollmentSaveBtn();
			payroll.Click_PayrollDashboard();
					
			
		}
	
	@Test(priority=1)
	public void validateRecurringAddition() throws Exception {

		sTestCaseID = "TC097";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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
		
		pages.Recurring recurring = new pages.Recurring(driver);
		pages.ProcessPay processPay  = new pages.ProcessPay (driver);
		pages.EmployeePage employee= new EmployeePage(driver);
		pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickPaydetails();
		edit.enterBasicSalary(data[11]);
		edit.clickSaveBtn();
		
		 pages.PayrollRun payroll= new  pages.PayrollRun(driver);
		 payroll.Click_PayrollDashboard();
	   
		
		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 recurring.enterFrequency(data[5]);
		 recurring.enterFromDate(data[6]);
		 recurring.Enter_toDate(data[7]);
		 recurring.enterAcountCode(data[8]);
		 recurring.enterdescription(data[9]);
		 recurring.enterAmount(data[10]);
		 processPay.clickSaveBtn();  
		 
		 employee.Click_clickonEmpName();
		 
		 _1707AutoRecurringAddition_Deduction.VerifyData verify= new  _1707AutoRecurringAddition_Deduction.VerifyData(driver);
		 
	     verify.GrossPay(data[12], data[13]);
	     utilities.TakeScreenshot.Getscreenshot("TC097_Verify GrossPay", "1707", driver);
		 verify.assertAll();
	}
	
	
}
