package _5852_NoEmployerNIC;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC301_NoEmployerNIC_Liablity extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

     //  @Test(priority = 0)
	
		public void ClientSetup() throws Exception 
		{
			
			sTestCaseID = "TC301";
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
			buisness.enterRegistrationDate(data[36]);
			buisness.enterFirstName();
			buisness.enterLastName();
			buisness.clickSaveBtn();
			
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
		
			pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
			Bk.Click_BKEdit();
			Bk.Select_services(data[34]);
			Bk.Enter_CompanyAddressLine1(data[35]);
			Bk.Click_Save();

			Bk.Click_AccountingPeriod();
			Bk.Click_AddAccountingPeriod();
			Bk.Enter_NewStartDate(data[36]);
			Bk.Enter_NewEndDate(data[37]);
			Bk.Click_AccPeriodSave();
			OpenClient.Click_ClientsClick();
			OpenClient.Enter_EnterClientName(data[4]);
			OpenClient.Click_ClickSearch();
			OpenClient.Click_ClickClient();
			
			pages.EditCompany company= new 	pages.EditCompany(driver);
			
			company.Click_gotoEditCompany();
			company.Click_clickPayrollDetails();
			
			company.enterPayeNumber(data[38]);
			company.enterRefrenceNumber(data[39]);
			company.accountOfficeReffrence(data[40]);
			
			company.Click_ClickSave();
			company.Click_clickPayrollSettings();
			company.Enter_NomismaStartDate(data[48]);
			company.Click_ClickSave();
			pages.PayrollRun payroll= new pages.PayrollRun (driver);

		    payroll.Click_PayrollDashboard();
			
			pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
			
			employee.clickNewEmployee();
			employee.enterTitle(data[41]);
			employee.enterFirstName(data[42]);
			employee.enterLastName(data[43]);
			employee.enterDateOfBirth(data[44]);
			employee.enterAddressLine(data[45]);
			employee.enterAddressLine2(data[46]);
			employee.enterPostCode(data[47]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[48]);

			employee.enterNICategory(data[5]);
			employee.enterTaxCode(data[6]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary1(data[7]);
			employee.clickSaveBtn();
		
			payroll.Click_PayrollDashboard();
					
			
		}
	@Test(priority=1)

	public void TC_01validateNIC_TillJully() throws Exception {

		sTestCaseID = "TC301";
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
		
		edit.enterNICategory(data[5]);
		
		edit.enterTaxCode(data[6]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[7]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		for (int i = 0; i <= 3; i++) {payroll.Run_Payroll();}
		 edit.clickEmployeeName();
	    edit.editEmployeeDetails();
	    edit.clickMandotoryPayroll();
	    edit.clickNoEmployerNIC();
	    edit.clickSaveBtn();
	    payroll.Click_PayrollDashboard();
        edit.clickEmployeeName();
        _5852_NoEmployerNIC_Page.NoEmployerNICPage page= new  _5852_NoEmployerNIC_Page.NoEmployerNICPage(driver);
        page.clickEmployeeSalaryDetailsJuly();
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.taxNIGrossYTD(data[8], data[9], data[10], data[11]);
        
        verify.assertAll();
}	
	
	

	@Test(priority=2)

	public void TC_02validatePayslip() throws Exception {

		sTestCaseID = "TC301";
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

	    payroll.Run_Payroll();
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
         pages.reports report = new  pages.reports(driver);
         
         report.Click__Reports_();
         report.Click_Payslipsclick();
         edit.selectPeriodEndDate(data[12]);
        
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.VerifyEmployeeEmployerNIOnPayslipReport(data[9],data[10]);
        
        verify.assertAll();
}	
	
	

	@Test(priority=3)

	public void TC_03validatePayslipEmail() throws Exception {

		sTestCaseID = "TC301";
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
		
         pages.reports report = new  pages.reports(driver);
         
         report.Click__Reports_();
         report.Click_Payslipsclick();
         edit.selectPeriodEndDate(data[12]);
         pages.EmailSection email=new pages.EmailSection(driver);
//         email.clickEmailBtn();
        
	     email.clickPayslipEmailBtn();
 		
	     email.clickSendBtn();
         pages.AgentLevelEmailLog emaillog= new  pages.AgentLevelEmailLog (driver);
         emaillog.clickEmailDropDown();
         emaillog.clickEmailLog();
         emaillog.clickRecievedEmail();        
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.VerifyRecievedEmailPayslip(data[9],data[10]);
        
        verify.assertAll();
}	
	
	@Test(priority=4)

	public void TC_04validateIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC301";
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
		
         pages.reports report = new  pages.reports(driver);
         
         report.Click__Reports_();
         report.Click_Individual_Employee_Pay_Scheduleclick();
       
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.verifyIndividualPaySchedule(data[13], data[14], data[15], data[16]);
        
        verify.assertAll();
}	
	
	@Test(priority=5)

	public void TC_05validatePayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC301";
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
		
         pages.reports report = new  pages.reports(driver);
         
         report.Click__Reports_();
         report.Click_Payroll_Reporting_Period_Summary();
       
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.verifyPayrollReportingPeriodSummary(data[13], data[14], data[15], data[16]);
        
        verify.assertAll();
}	
	
	@Test(priority=6)

	public void TC_06validatePayrollSummary() throws Exception {

		sTestCaseID = "TC301";
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
		
         pages.reports report = new  pages.reports(driver);
         
         report.Click__Reports_();
         report.Click_Payroll_Summary();
       
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.verifyPayrollSummary(data[17], data[18], data[19], data[20]);
        
        verify.assertAll();
}	
	
    @Test(priority=7)

	public void TC_07validateXML() throws Exception {

		sTestCaseID = "TC301";
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
	

         pages.FilingManagement filling = new  pages.FilingManagement(driver);
 	    
         filling.Click_gotoFilingManagement();
         _5852_NoEmployerNIC_Page.NoEmployerNICPage page= new  _5852_NoEmployerNIC_Page.NoEmployerNICPage(driver);

         page.clickFps();
         
         _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);

         verify.getXMLData();
         verify.verifyXML(data[22], data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30]);
         verify.assertAll();
        
      
}	
	
	
	@Test(priority=8)

	public void TC_08validateTaxPayment() throws Exception {

		sTestCaseID = "TC301";
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
		
         pages.reports report = new  pages.reports(driver);
         
        report.clickTaxPayment();
         
         _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);

         verify.verifyTaxPaymentReport(data[13], data[14], data[15], data[32]);
         verify.assertAll();
        
      
}	
	
	@Test(priority=9)

	public void TC_09validateEmployerNIOnPayrollDashboard() throws Exception {

		sTestCaseID = "TC301";
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

         edit.selectPeriodEndDate(data[21]);
         
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
         verify.verifyEmployerNic(data[31]);
         edit.selectPeriodEndDate(data[33]);

         payroll.Click_PayrollDashboard();
         verify.verifyEmployerNic(data[31]);
           
         for(int i=0;i<=6;i++) {payroll.Run_Payroll(); verify.verifyEmployerNic(data[31]); Thread.sleep(1000);}

         for(int i=0;i<=11;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
         
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoEmployerNIC();
		edit.clickSaveBtn();

         verify.assertAll();
        
      
}	
}
