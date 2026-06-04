package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC327_EmployementAllowance_FourWeekly extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	@Test(priority=1)
	public void validateEmployementAllowance() throws Exception {

		sTestCaseID = "TC327";
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
		
        pages.EditCompany company= new pages.EditCompany(driver);
	    
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		
		edit.click_Paydetails();
		edit.enterBasicSalary(data[5]);
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	 
	    payroll.Click_PayrollDashboard();
		
	    for(int i=0;i<=2;i++) {payroll.Run_Payroll(); }
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    
	    company.clickNoEmployementAllownaces();
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Run_Payroll();
	    pages.reports report = new pages.reports(driver);
	    report.clickTaxPayment();
	   
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowance(data[6], data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18]);
	    
	    payroll.Click_PayrollDashboard();
	   
	    for(int i=0;i<=3;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
	   
        verify.assertAll();
}		
}
