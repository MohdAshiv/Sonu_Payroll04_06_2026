package _5852_NoEmployerNIC;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC305_NoEmployerNICLiablity_EnabledDisable extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC_01validateNIC_OptionShouldNotDisableAfterRunPayroll() throws Exception {

		sTestCaseID = "TC305";
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
		
         payroll.Run_Payroll();  
         
		edit.clickEmployeeName();
	    edit.editEmployeeDetails();
	    edit.clickMandotoryPayroll();
	 
     
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.enabledNoEmployerNIC();
        
	    payroll.Click_PayrollDashboard();
         payroll.Undo_LastPayroll();
        verify.assertAll();
}	
		
	
	
	@Test(priority=2)

	public void TC_02validateNIC_OptionShouldNotDisableAfterTickAndRunPayroll() throws Exception {

		sTestCaseID = "TC305";
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
	    edit.clickNoEmployerNIC();
	    edit.clickSaveBtn();
	    payroll.Click_PayrollDashboard();
	    payroll.Run_Payroll();
	    
		edit.clickEmployeeName();
	    edit.editEmployeeDetails();
	    edit.clickMandotoryPayroll();
	
     
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
        
        verify.enabledNoEmployerNIC();
        
        edit.clickNoEmployerNIC();
        
        edit.clickSaveBtn();
       
	    payroll.Click_PayrollDashboard();
         payroll.Undo_LastPayroll();
        verify.assertAll();
}	
	
	
	@Test(priority=3)

	public void TC_03validateEmployerNIOnPayrollDashboard_NiCategoryC() throws Exception {

		sTestCaseID = "TC305";
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
	    payroll.Run_Payroll();
	    
         edit.selectPeriodEndDate(data[8]);
         
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
         verify.verifyEmployerNic(data[9]);
           
         edit.selectPeriodEndDate(data[10]);

         payroll.Click_PayrollDashboard();
         verify.verifyEmployerNic(data[9]);
           
         for(int i=0;i<=6;i++) {payroll.Run_Payroll(); verify.verifyEmployerNic(data[9]); Thread.sleep(1000);}

         for(int i=0;i<=11;i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
         
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoEmployerNIC();
		edit.clickSaveBtn();
        verify.assertAll();

}
	
	
	
}
