package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC652_UndoLastPayroll_5EmployeeWeek14 extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)
	public void TC01validateTaxNI5Employee() throws Exception {
		sTestCaseID = "TC652";
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
			
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[5]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName1();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[6]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName2();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[7]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName3();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[8]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		employee.clickEmployeeName4();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[9]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		 _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		 
		verify.verifyTax( data[75], data[76], data[77], data[78], data[79], data[80], data[81],data[82], data[83], data[84], data[85], data[86]);
		verify.verifyEmployeeNI( data[87], data[88], data[89], data[90], data[91], data[92], data[93],data[94], data[95], data[96], data[97], data[98]);
		verify.verifyEmployerNI(data[99], data[100], data[101], data[102], data[103], data[104], data[105],data[106],data[107],data[108],data[109],data[110]);
		verify.assertAll();
}
}
