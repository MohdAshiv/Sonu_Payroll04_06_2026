package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC345_EmployementAllowance_OffPay3Employee extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	 //  @Test(priority = 0)
		
			public void ClientSetup() throws Exception 
			{
				
				sTestCaseID = "TC345";
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
				buisness.enterRegistrationDate(data[68]);
				buisness.enterFirstName();
				buisness.enterLastName();
				buisness.clickSaveBtn();
				
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName(data[4]);
				OpenClient.Click_ClickSearch();
			
				pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
				Bk.Click_BKEdit();
				Bk.Select_services(data[66]);
				Bk.Enter_CompanyAddressLine1(data[67]);
				Bk.Click_Save();

				Bk.Click_AccountingPeriod();
				Bk.Click_AddAccountingPeriod();
				Bk.Enter_NewStartDate(data[68]);
				Bk.Enter_NewEndDate(data[69]);
				Bk.Click_AccPeriodSave();
				OpenClient.Click_ClientsClick();
				OpenClient.Enter_EnterClientName(data[4]);
				OpenClient.Click_ClickSearch();
				OpenClient.Click_ClickClient();
				
				pages.EditCompany company= new 	pages.EditCompany(driver);
				
				company.Click_gotoEditCompany();
				company.Click_clickPayrollDetails();
				
				company.enterPayeNumber(data[70]);
				company.enterRefrenceNumber(data[71]);
				company.accountOfficeReffrence(data[72]);
				
				company.Click_ClickSave();
				company.Click_clickPayrollSettings();
				
				pages.FrequencySet freq= new pages.FrequencySet(driver);
				
				
				company.Enter_NomismaStartDate(data[80]);
				company.Click_ClickSave();
				pages.PayrollRun payroll= new pages.PayrollRun (driver);

			    payroll.Click_PayrollDashboard();
				
				pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
				
				employee.clickNewEmployee();
				employee.enterTitle(data[73]);
				employee.enterFirstName(data[74]);
				employee.enterLastName(data[75]);
				employee.enterDateOfBirth(data[76]);
				employee.enterAddressLine(data[77]);
				employee.enterAddressLine2(data[78]);
				employee.enterPostCode(data[79]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[80]);

				employee.enterNICategory(data[63]);
				employee.enterTaxCode(data[64]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[65]);
				employee.clickSaveBtn();
			
				payroll.Click_PayrollDashboard();
						
				
				employee.clickNewEmployee();
				employee.enterTitle(data[73]);
				employee.enterFirstName(data[60]);
				employee.enterLastName(data[61]);
				employee.enterDateOfBirth(data[76]);
				employee.enterAddressLine(data[77]);
				employee.enterAddressLine2(data[78]);
				employee.enterPostCode(data[79]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[80]);

				employee.enterNICategory(data[63]);
				employee.enterTaxCode(data[64]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[62]);
				employee.clickSaveBtn();
			
				payroll.Click_PayrollDashboard();
				
				
				employee.clickNewEmployee();
				employee.enterTitle(data[73]);
				employee.enterFirstName(data[57]);
				employee.enterLastName(data[58]);
				employee.enterDateOfBirth(data[76]);
				employee.enterAddressLine(data[77]);
				employee.enterAddressLine2(data[78]);
				employee.enterPostCode(data[79]);
				employee.clickSaveBtn();
				employee.clickMandotoryPayroll();
				employee.enterJoiningDate(data[80]);

				employee.enterNICategory(data[63]);
				employee.enterTaxCode(data[64]);
				employee.clickSaveBtn();
				employee.click_Paydetails();
				employee.enterBasicSalary1(data[59]);
				employee.clickSaveBtn();
			
				payroll.Click_PayrollDashboard();
						
				
			}
	
	@Test(priority=1)

	public void TC01validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC345";
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
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();// aded this line 12 Feb 2024

		edit.enterTaxCode(data[5]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[6]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
	    pages.EditCompany company= new pages.EditCompany(driver);
	   
	    
	    
		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();// aded this line 12 Feb 2024

		edit.enterTaxCode(data[5]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[7]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		edit.clickEmployeeName2();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();// aded this line 12 Feb 2024

		edit.enterTaxCode(data[5]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[8]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		
		company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
		payroll.Click_PayrollDashboard();

	    for(int i=0;i<=10;i++) {payroll.Run_Payroll(); }

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickNoEmployementAllownaces();
	
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Run_Payroll();
	    
	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   
	    payroll.SelectTaxYear(data[81]);
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	     verify.verifyEmployementAllowance( data[9], data[10], data[11], data[12], data[13], data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21]);
	    
	     payroll.Click_PayrollDashboard();
	    
	     System.out.println("xyz");
	     for(int i=0;i<=11;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}

			edit.clickEmployeeName();
			edit.editEmployeeDetails();
			edit.clickMandotoryPayroll();
			edit.clickNoOffPayWorker();
			edit.clickSaveBtn();

			payroll.Click_PayrollDashboard();

			edit.clickEmployeeName1();
			edit.editEmployeeDetails();
			edit.clickMandotoryPayroll();
			edit.clickNoOffPayWorker();
			edit.clickSaveBtn();

			payroll.Click_PayrollDashboard();
			edit.clickEmployeeName2();
			edit.editEmployeeDetails();
			edit.clickMandotoryPayroll();
			edit.clickNoOffPayWorker();
			edit.clickSaveBtn();

			payroll.Click_PayrollDashboard();
		    verify.assertAll();
}	
	
}
