package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC690_UndoLastPayroll_EmployeeFortnightly26ChangeSalary extends  TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority=1)
	public void TC01validateTaxNIFortnightly() throws Exception {
		sTestCaseID = "TC690";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Run_Payroll();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();
		filling.selectStatus(data[19]);
		filling.clickCheckBox();
		filling.enterNotes();
		filling.clickNottoSubmit();
		
		payroll.Click_PayrollDashboard();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		 verify.verifyAlertMsg(data[21]);
		page.clickNameCheckBox();
		page.tickEmployee3();
		page.tickEmployee9();
		page.tickEmployee6();


		page.clickUndoBtn1();
		employee.clickEmployeeName2();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterLeavingDate(data[5]);
		employee.enterBasicSalary(data[6]);

		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
                                    
		employee.clickEmployeeName5();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterLeavingDate(data[5]);
		employee.enterBasicSalary(data[7]);

		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
                                    
		
		employee.clickEmployeeName8();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterLeavingDate(data[5]);
		employee.enterBasicSalary(data[8]);

		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
                                    
		verify.verifyTax(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81]);
		verify.verifyEmployeeNI(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
		verify.verifyEmployerNI2(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
		verify.verifyEmployeePension(data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127], data[128], data[129]);
		verify.verifyEmployerPension(data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
         payroll.Run_Payroll();
		verify.assertAll();
	}
	
	
	
	
	

	@Test(priority=2)
	public void TC02validateTaxNIFortnightlyPayslip() throws Exception {
		sTestCaseID = "TC690";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.reports report = new pages.reports (driver);
		report.Click__Reports_();
		report.Click_Payslipsclick();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyEmployeePensionPayslip(data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127], data[128], data[129]);
		verify.verifyEmployerPensionPayslip(data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
		verify.assertAll();
	}
	
	

	@Test(priority=3)
	public void TC03validateTaxNIFortnightlyPayrollSummary() throws Exception {
		sTestCaseID = "TC690";
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
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.reports report = new pages.reports (driver);
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyPayrollSummary(data[9], data[10], data[11], data[12], data[13], data[14]);
		verify.assertAll();
	}
}
