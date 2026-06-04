package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC002_5637GrossEarningNICYTD extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateGrossEarningYTDFromFPS() throws Exception {

		sTestCaseID = "TC002";
		Sheet = "Sheet7";
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
	    
	    pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges(driver);
	    employee.clickEmployeeName();
	    
        pages.OpeningBalanceEntry openingBalance= new pages.OpeningBalanceEntry(driver);

    	openingBalance.Click_gotoOpeningBalances();
		openingBalance.Enter_EnterTaxCode(data[5]);
		openingBalance.Enter_EnterGrosspay(data[6]);
		openingBalance.Enter_EnterEmployeeNI(data[7]);
		openingBalance.Enter_EnterNetPay(data[8]);
		
		openingBalance.Enter_TaxDeducted(data[9]);
		
		openingBalance.Enter_EmployerNI(data[10]);
		openingBalance.Enter_LEL(data[11]);
		openingBalance.Enter_PTtoUAP(data[12]);
		openingBalance.Click_clickSave();
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		_2154EmployeeOpeningBalance_Page.FillingManagement filling= new _2154EmployeeOpeningBalance_Page.FillingManagement (driver);
		
		filling.Click_gotoFilingManagement();
		filling.clickFPS2();
		filling.getXMLData();
		filling.verifyGrossEarningYTD(data[13]);
		
		payroll.scrollClickPayrollDashboard();
		payroll.Undo_LastPayroll();
		filling.assertAll();
	    
	    

	
}
}
