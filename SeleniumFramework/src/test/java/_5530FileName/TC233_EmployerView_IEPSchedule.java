package _5530FileName;

import org.testng.annotations.Test;

import pages.LeaveManagement;
import tests.TestBase;
import utilities.ExcelData;

public class TC233_EmployerView_IEPSchedule extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	// @Test(priority = 0)
	
			public void ClientSetup() throws Exception 
			{
				sTestCaseID = "TC233";
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
				company.ClickP11D();
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
				   payroll.scrollClickPayrollDashboard();
					
					employee.clickEmployeeName();
					employee.editEmployeeDetails();
				
					employee.click_Paydetails();
					employee.enterLeavingDate(data[38]);
					employee.clickSaveBtn();
				
				pages.P11DPage p11d= new pages.P11DPage (driver);
				p11d.clickExpensesAndBenefits();
				p11d.enterMakeAndModel();
				p11d.selectRegistrationDate(data[36]);
				p11d.selectFuelType(data[37]);
				p11d.enterListPrice();
				p11d.clickAddCarDetails();
				
			payroll.scrollClickPayrollDashboard();
		
			for(int i=0;i<=12;i++) {

             payroll.Run_Payroll();
			}
				
			pages.FilingManagement filling = new pages.FilingManagement(driver);
			filling.Click_gotoFilingManagement();
			payroll.SelectTaxYear(data[35]);
			filling.selectStatus(data[34]);
			filling.clickCheckBox();
			filling.enterNotes();
			filling.clickNottoSubmit();
			payroll.SelectTaxYear(data[39]);
			filling.selectStatus(data[34]);
			filling.clickCheckBox();
			filling.enterNotes();
			filling.clickNottoSubmit();
			}

	@Test(priority=1)

	public void validateCsvFileName() throws Exception {

		sTestCaseID = "TC233";
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
	
		
		_2154EmployeeOpeningBalance_Page.EmployerView employerView=new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		
		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
		
        pages.reports report= new  pages.reports(driver);
       
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickIEPScheduleCsvIcn();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[5]);
        verify.asserAll();

        
	}
	
	
	@Test(priority=2)

	public void validatePdfFileName() throws Exception {

		sTestCaseID = "TC233";
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
	
	   _2154EmployeeOpeningBalance_Page.EmployerView employerView=new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		
		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
		
        pages.reports report= new  pages.reports(driver);
        report.Click_Individual_Employee_Pay_Scheduleclick();
        
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickIEPSchedulePdfIcn();
        
        _5530FileNamePage.VerifyFileNmae verify= new _5530FileNamePage.VerifyFileNmae(driver);
        
        verify.verifyDownloadFileName(data[6]);
        
        verify.asserAll();

	}
	
	
}
