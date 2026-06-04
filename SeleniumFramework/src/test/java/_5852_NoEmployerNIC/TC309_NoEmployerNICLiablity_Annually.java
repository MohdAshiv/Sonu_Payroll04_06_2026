package _5852_NoEmployerNIC;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC309_NoEmployerNICLiablity_Annually  extends TestBase{



	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	


	   //  @Test(priority = 0)
		
		public void ClientSetup() throws Exception 
		{
			
			sTestCaseID = "TC309";
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
			buisness.enterRegistrationDate(data[12]);
			buisness.enterFirstName();
			buisness.enterLastName();
			buisness.clickSaveBtn();
			
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
		
			pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
			Bk.Click_BKEdit();
			Bk.Select_services(data[10]);
			Bk.Enter_CompanyAddressLine1(data[11]);
			Bk.Click_Save();

			Bk.Click_AccountingPeriod();
			Bk.Click_AddAccountingPeriod();
			Bk.Enter_NewStartDate(data[12]);
			Bk.Enter_NewEndDate(data[13]);
			Bk.Click_AccPeriodSave();
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
			pages.EditCompany company= new 	pages.EditCompany(driver);
			
			company.Click_gotoEditCompany();
			company.Click_clickPayrollDetails();
			
			company.enterPayeNumber(data[14]);
			company.enterRefrenceNumber(data[15]);
			company.accountOfficeReffrence(data[16]);
			
			company.Click_ClickSave();
			company.Click_clickPayrollSettings();
			company.Enter_NomismaStartDate(data[24]);
			
			pages.FrequencySet freq= new pages.FrequencySet(driver);
			freq.Click_ClickAdditionalFrequecy();
			freq.Select_F2(data[25]);
			freq.Enter_AnnualPayDate(data[24]);
			company.Click_ClickSave();
			
			freq.clickDeletBtn();
			pages.PayrollRun payroll= new pages.PayrollRun (driver);

		    payroll.Click_PayrollDashboard();
			
			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
			
			employee.clickNewEmployee();
			employee.enterTitle(data[17]);
			employee.enterFirstName(data[18]);
			employee.enterLastName(data[19]);
			employee.enterDateOfBirth(data[20]);
			employee.enterAddressLine(data[21]);
			employee.enterAddressLine2(data[22]);
			employee.enterPostCode(data[23]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[24]);

			employee.enterNICategory(data[5]);
			employee.enterTaxCode(data[6]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary1(data[7]);
			employee.clickSaveBtn();
		
			payroll.Click_PayrollDashboard();
			
			
		}

	@Test(priority=1)
	public void validateEmployerNIFornightly() throws Exception {

		sTestCaseID = "TC309";
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

	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoEmployerNIC();
		edit.enterNICategory(data[5]);
		edit.enterTaxCode(data[6]);

		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[7]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
	
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
         verify.verifyEmployerNic(data[8]);
         
        
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoEmployerNIC();
		edit.clickSaveBtn();
        verify.assertAll();

}
	
}
