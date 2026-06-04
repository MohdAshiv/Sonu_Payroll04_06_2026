package _5852_NoEmployerNIC;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC303_NoEmployerNICLiablity_Drirector extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC_01validateNIC_TillJully() throws Exception {

		sTestCaseID = "TC303";
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
		edit.clickYesDirector();
		edit.enter_DirectorFromDate(data[7]);
		edit.select_NI_CalculationMethod(data[8]);
		edit.clickSaveBtn();
		edit.click_Paydetails();
		edit.enterBasicSalary(data[9]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		for (int i = 0; i <= 3; i++) {payroll.Run_Payroll();}
		 edit.clickEmployeeName();
	    edit.editEmployeeDetails();
	    edit.clickMandotoryPayroll();
	    edit.clickNoEmployerNIC();
	    edit.clickSaveBtn();
	    payroll.Click_PayrollDashboard();
	    payroll.Run_Payroll();
        edit.clickEmployeeName();
        _5852_NoEmployerNIC_Page.NoEmployerNICPage page= new  _5852_NoEmployerNIC_Page.NoEmployerNICPage(driver);
        page.clickEmployeeSalaryDetailsJuly();
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
         verify.taxNIGrossYTD(data[10], data[11], data[12], data[13]);
        
        verify.assertAll();
}	
	
	@Test(priority=2)

	public void TC_02validatePayslip() throws Exception {

		sTestCaseID = "TC303";
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
         edit.selectPeriodEndDate(data[14]);
        
        
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.VerifyEmployeeEmployerNIOnPayslipReport(data[11],data[12]);
        
        verify.assertAll();
}	
	
	

	@Test(priority=3)

	public void TC_03validatePayslipEmail() throws Exception {

		sTestCaseID = "TC303";
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
         edit.selectPeriodEndDate(data[14]);
         pages.EmailSection email=new pages.EmailSection(driver);
         email.clickPayslipEmailBtn();
         email.clickSendBtn();
         
         pages.AgentLevelEmailLog emaillog= new  pages.AgentLevelEmailLog (driver);
         emaillog.clickEmailDropDown();
         emaillog.clickEmailLog();
         emaillog.clickRecievedEmail();
         
      
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.VerifyRecievedEmailPayslip(data[11],data[12]);
        
        verify.assertAll();
        
}	
	@Test(priority=4)

	public void TC_04validateIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC303";
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
        
        verify.verifyIndividualPaySchedule(data[15], data[16], data[17], data[18]);
        
        verify.assertAll();
}	
	
	
	@Test(priority=5)

	public void TC_05validatePayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC303";
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
        
        verify.verifyPayrollReportingPeriodSummary(data[15], data[16], data[17], data[18]);
        
        verify.assertAll();
}	
	
	@Test(priority=6)

	public void TC_06validatePayrollSummary() throws Exception {

		sTestCaseID = "TC303";
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
        
        verify.verifyPayrollSummary(data[19], data[20], data[21], data[22]);
        
        verify.assertAll();
}	
	

    @Test(priority=7)

	public void TC_07validateXML() throws Exception {

		sTestCaseID = "TC303";
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
         
         pages.FilingManagement filling = new  pages.FilingManagement(driver);
 	    
         filling.Click_gotoFilingManagement();
         _5852_NoEmployerNIC_Page.NoEmployerNICPage page= new  _5852_NoEmployerNIC_Page.NoEmployerNICPage(driver);

         page.clickFps();
         
         _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);

         verify.getXMLData();
         verify.verifyXML( data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30],data[30]);
         verify.assertAll();
        
      
}	
	
    

	@Test(priority=8)

	public void TC_08validateTaxPayment() throws Exception {

		sTestCaseID = "TC303";
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

         verify.verifyTaxPaymentReport(data[15], data[16], data[17], data[17]);
         verify.assertAll();
        
      
}	
	
	
	
	@Test(priority=9)

	public void TC_09validateEmployerNIOnPayrollDashboard() throws Exception {

		sTestCaseID = "TC303";
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
		
         edit.selectPeriodEndDate(data[31]);
         
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
         verify.verifyEmployerNic(data[33]);
         edit.selectPeriodEndDate(data[35]);

         payroll.Click_PayrollDashboard();
         verify.verifyEmployerNic(data[32]);//
           
         payroll.Run_Payroll();
         verify.verifyEmployerNic(data[32]);
         payroll.Run_Payroll();
         verify.verifyEmployerNic(data[34]);
         
         for(int i=0;i<=4;i++) {payroll.Run_Payroll(); verify.verifyEmployerNic(data[32]); Thread.sleep(1000);}

         for(int i=0;i<=11;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
         
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoDirector();
		edit.clickNoEmployerNIC();
		edit.clickSaveBtn();

        verify.assertAll();
        
      
}	
	
}
