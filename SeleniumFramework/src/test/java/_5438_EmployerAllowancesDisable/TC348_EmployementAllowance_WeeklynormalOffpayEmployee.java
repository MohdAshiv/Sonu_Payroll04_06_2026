package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC348_EmployementAllowance_WeeklynormalOffpayEmployee extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
    

     //@Test(priority = 0)
	
		public void ClientSetup() throws Exception 
		{
			
			sTestCaseID = "TC348";
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
			
			freq.Click_ClickAdditionalFrequecy();
			freq.Select_F2(data[81]);
			freq.Enter_WeeklyPayDate(data[7]);
			company.Click_ClickSave();
			freq.clickDeletBtn();
			
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
					
			
		}
	
	@Test(priority=1)

	public void TC01validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC348";
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
		
		edit.click_Paydetails();
		edit.enterBasicSalary(data[5]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[6]);
		edit.clickSaveBtn();
		
		
		payroll.scrollClickPayrollDashboard();
		
		pages.EditCompany company = new pages.EditCompany(driver);
	
		company.Click_gotoEditCompany();
        company.Click_clickPayrollDetails();
        company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	    company.Click_clickPayrollSettings();
	    
//	pages.FrequencySet freq= new pages.FrequencySet(driver);
//		
//		freq.Click_ClickAdditionalFrequecy();
//		freq.Select_F2(data[12]);
//		freq.Enter_WeeklyPayDate(data[69]);
//		company.Click_ClickSave();
//		freq.clickDeletBtn();
	    
	    
	    
	    company.Enter_NomismaStartDate(data[7]);
	    company.Enter_WeeklyPeriodEndDate(data[7]);
	    company.Click_ClickSave();
	    
		payroll.Click_PayrollDashboard();
		for(int i=0;i<=32;i++) {payroll.Run_Payroll(); }
		
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickNoEmployementAllownaces();
		
	    payroll.Click_PayrollDashboard();
	    payroll.Run_Payroll();
	    
	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowanceWeekly1( data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36],data[37],data[38],data[39],data[40],data[41],data[42],data[43],data[44],data[45],data[46],data[47],data[48],data[49],data[50],data[51],data[52],data[53],data[54],data[55],data[56],data[57]);
	    
        verify.assertAll();
}		
	
	
	@Test(priority=2)

	public void TC02validateEmployementAllowancePayrollSummary() throws Exception {

		sTestCaseID = "TC348";
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

	    pages.reports report = new pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	   
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
        verify.verifyPayrollSummary(data[58],data[59]);	   
        
        payroll.Click_PayrollDashboard();
        for(int i=0;i<=33;i++) {payroll.Undo_LastPayroll();  Thread.sleep(3000);}
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);

		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
        verify.assertAll();
	
	}

	
	
}
