package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC269_OffPayrollWorker_XML extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerMonthlyXML() throws Exception {

		sTestCaseID = "TC269";
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
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	     payroll.Run_Payroll();
	     
	     pages.FilingManagement filling= new  pages.FilingManagement(driver);
	     filling.Click_gotoFilingManagement();
	     filling.clickFps();
	     
	     _2154EmployeeOpeningBalance_Page.FillingManagement xml= new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
	     xml.getXMLData();
	     xml.verifyOffPayWorker(data[5]);
	     payroll.Click_PayrollDashboard();
	     payroll.Undo_LastPayroll();
	     edit.clickEmployeeName();
		 edit.editEmployeeDetails();
		 edit.clickMandotoryPayroll();
		 edit.clickNoOffPayWorker();
		 edit.clickSaveBtn();

	     xml.assertAll();
	
	}
	

	@Test(priority=2)

	public void validateOffPayWorkerWeeklyXML() throws Exception {

		sTestCaseID = "TC269";
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
		OpenClient.Enter_EnterClientName(data[6]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	     payroll.Run_Payroll();
	     
	     pages.FilingManagement filling= new  pages.FilingManagement(driver);
	     filling.Click_gotoFilingManagement();
	     filling.clickFps();
	     
	     _2154EmployeeOpeningBalance_Page.FillingManagement xml= new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
	     xml.getXMLData();
	     xml.verifyOffPayWorker(data[5]);
	     payroll.Click_PayrollDashboard();
	     payroll.Undo_LastPayroll();
	     edit.clickEmployeeName();
		 edit.editEmployeeDetails();
		 edit.clickMandotoryPayroll();
		 edit.clickNoOffPayWorker();
		 edit.clickSaveBtn();

	     xml.assertAll();
	
	}
	
	
	@Test(priority=3)

	public void validateOffPayWorkerFornightlyXML() throws Exception {

		sTestCaseID = "TC269";
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
		OpenClient.Enter_EnterClientName(data[7]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	     payroll.Run_Payroll();
	     
	     pages.FilingManagement filling= new  pages.FilingManagement(driver);
	     filling.Click_gotoFilingManagement();
	     filling.clickFps();
	     
	     _2154EmployeeOpeningBalance_Page.FillingManagement xml= new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
	     xml.getXMLData();
	     xml.verifyOffPayWorker(data[5]);
	     payroll.Click_PayrollDashboard();
	     payroll.Undo_LastPayroll();
	     edit.clickEmployeeName();
		 edit.editEmployeeDetails();
		 edit.clickMandotoryPayroll();
		 edit.clickNoOffPayWorker();
		 edit.clickSaveBtn();

	     xml.assertAll();
	
	}
	
	

	@Test(priority=4)

	public void validateOffPayWorkerFourWeeklyXML() throws Exception {

		sTestCaseID = "TC269";
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
		OpenClient.Enter_EnterClientName(data[8]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	     payroll.Run_Payroll();
	     
	     pages.FilingManagement filling= new  pages.FilingManagement(driver);
	     filling.Click_gotoFilingManagement();
	     filling.clickFps();
	     
	     _2154EmployeeOpeningBalance_Page.FillingManagement xml= new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
	     xml.getXMLData();
	     xml.verifyOffPayWorker(data[5]);
	     payroll.Click_PayrollDashboard();
	     payroll.Undo_LastPayroll();
	     edit.clickEmployeeName();
		 edit.editEmployeeDetails();
		 edit.clickMandotoryPayroll();
		 edit.clickNoOffPayWorker();
		 edit.clickSaveBtn();

	     xml.assertAll();
	
	}
	

	@Test(priority=5)

	public void validateOffPayWorkerAnnualyXML() throws Exception {

		sTestCaseID = "TC269";
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
		OpenClient.Enter_EnterClientName(data[9]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	     payroll.Run_Payroll();
	     
	     pages.FilingManagement filling= new  pages.FilingManagement(driver);
	     filling.Click_gotoFilingManagement();
	     filling.clickFps();
	     
	     _2154EmployeeOpeningBalance_Page.FillingManagement xml= new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
	     xml.getXMLData();
	     xml.verifyOffPayWorker(data[5]);
	     payroll.Click_PayrollDashboard();
	     payroll.Undo_LastPayroll();
	     edit.clickEmployeeName();
		 edit.editEmployeeDetails();
		 edit.clickMandotoryPayroll();
		 edit.clickNoOffPayWorker();
		 edit.clickSaveBtn();

	     xml.assertAll();
	
	}
}
