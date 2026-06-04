package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC674_UndoLastPayroll_EmployeeFortnightly17_AddExpense extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	@Test(priority=2)
	public void TC01validateTaxNIPensiom() throws Exception {
		sTestCaseID = "TC674";
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
		
		pages.FilingManagement filling = new pages.FilingManagement(driver);
		filling.Click_gotoFilingManagement();
		filling.selectStatus(data[19]);
		filling.clickCheckBox();
		filling.enterNotes();
	//	filling.selectReson(data[20]);
		filling.clickNottoSubmit();
		
		payroll.Click_PayrollDashboard();
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		 verify.verifyAlertMsg(data[21]);
		page.clickNameCheckBox();
		page.tickEmployee5();

		page.clickUndoBtn1();
		page.SwithToDefault();
		payroll.SelecPeriodEndDate(data[22]);
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.clickEmployeeName4();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[5]);
		employee.clickSaveBtn();

		employee.enterLeavingDate(data[23]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();

		page.clickUndone5Employee3Dot();
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		processPay.clickProcessPay();
    	processPay.clickAddMore();
    	processPay.enterAccountCode(data[16]);
    	processPay.enterDescription(data[17]);
    	processPay.enterAmount(data[18]);
    	processPay.clickApplyBtn();
    	processPay.untickAllOptions();
    	processPay.clickSaveBtn();
		payroll.SelecPeriodEndDate(data[22]);
		verify.verifyTax(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81]);
		verify.verifyEmployeeNI(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
		verify.verifyEmployerNI2(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
		payroll.Run_Payroll();
		verify.assertAll();
	}
	

	
}
