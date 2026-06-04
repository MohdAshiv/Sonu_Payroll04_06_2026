package _5852_NoEmployerNIC;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC310_NoEmployerNICLiablityWithOffPayWorker extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void validateEmployerNIOnPayrollDashboard_NiCategoryC() throws Exception {

		sTestCaseID = "TC310";
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
         
        _5852_NoEmployerNIC_Page.VerifyPage verify= new  _5852_NoEmployerNIC_Page.VerifyPage(driver);
         verify.verifyERNI(data[8], data[9]);
           
         payroll.Click_PayrollDashboard();
        
         for(int i=0;i<=3;i++) {payroll.Undo_LastPayroll();  Thread.sleep(1000);}

	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickNoEmployerNIC();
		edit.clickSaveBtn();
        verify.assertAll();

}
	
}
