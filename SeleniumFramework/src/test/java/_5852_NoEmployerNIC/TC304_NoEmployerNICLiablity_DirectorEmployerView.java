package _5852_NoEmployerNIC;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC304_NoEmployerNICLiablity_DirectorEmployerView  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC_01validateNIC_EmployerView() throws Exception {

		sTestCaseID = "TC304";
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
      
	    

		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();
		filling.selectStatus(data[10]);
		filling.clickCheckBox();
		filling.enterNotes();
		filling.clickNottoSubmit();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        
        verify.verifyEmployerNic(data[11]);
        
        verify.assertAll();
}	        

	
	@Test(priority=2)

	public void TC_02validateIndividualEmployeePayScheduleEmployerView() throws Exception {

		sTestCaseID = "TC304";
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
	
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		
       _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
         
        verify.verifyIndividualPaySchedule(data[12], data[13], data[14], data[15]);
        
        verify.assertAll();

	}	
	
	
	@Test(priority=3)

	public void TC_03validateEmployerViewPayrollReportingPeriodSummary() throws Exception {

		sTestCaseID = "TC304";
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
        
        verify.verifyPayrollReportingPeriodSummary(data[12], data[13], data[14], data[15]);
        
        verify.assertAll();
}
	
	

	@Test(priority=4)

	public void TC_04validateEmployeeViewIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC304";
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
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		

        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
          
        verify.verifyIndividualPaySchedule(data[12], data[13], data[14], data[15]);
          
        verify.assertAll();

	}	
	

	@Test(priority=5)

	public void TC_05validateEmployeeViewIndividualEmployeePayScheduleExportToPdf() throws Exception {

		sTestCaseID = "TC304";
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
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickIEPSchedulePdfIcn();

        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
          
         verify.VerifyEmployeeViewIEPSExportToPdf(data[16], data[17]);
          
         verify.assertAll();

	}	
	
	@Test(priority=6)

	public void TC_06validateEmployeeViewIndividualEmployeePayScheduleExportToCsv() throws Exception {

		sTestCaseID = "TC304";
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
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();

        pages.reports report= new  pages.reports(driver);
        
        report.Click_Individual_Employee_Pay_Scheduleclick();
		
        _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.clickIEPScheduleCsvIcn();

        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
          
         verify.ReadCSVFileEmployeeViewIEPS(data[17]);;
         
         utilities.ChangeWindow.Switchwindow(2, driver);
          
        pages.FilingManagement filling = new pages.FilingManagement(driver);
 		filling.Click_gotoFilingManagement();
 		filling.undoRti();
 		filling.undoRti1();

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);

	    for(int i=0;i<=4;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
        
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoEmployerNIC();
		edit.clickNoDirector();
		edit.clickSaveBtn();
        verify.assertAll();


	}	
	
	
	
}
