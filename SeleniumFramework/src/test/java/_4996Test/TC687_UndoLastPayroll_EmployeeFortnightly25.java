package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC687_UndoLastPayroll_EmployeeFortnightly25 extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateTaxNIFortnightly() throws Exception {
		sTestCaseID = "TC687";
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

		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[10]);
		employee.enterLastName(data[11]);
		employee.enterDateOfBirth(data[65]);
		employee.enterAddressLine(data[66]);
		employee.enterAddressLine2(data[67]);
		employee.enterPostCode(data[68]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[69]);
		employee.enterNICategory(data[12]);
		employee.enterTaxCode(data[13]);

		employee.selectStarterDeclaration(data[18]);
		employee.enableP45();
		employee.enterLeaveDateSalary(data[19]);
		employee.enterIncomeTax(data[20]);
		employee.enterP45LeavingDate(data[21]);
		employee.clickSaveBtn();
		
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[7]);
     	employee.clickSaveBtn();
     	payroll.Click_PayrollDashboard();
     
     	
     	employee.clickEmployeeName4();
		employee.editEmployeeDetails();
		employee.enterFirstName1(data[22]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
     	
		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[5]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		employee.clickEmployeeName2();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[6]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		employee.clickEmployeeName3();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[7]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName4();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[8]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		

		employee.clickEmployeeName5();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[9]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName6();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[14]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName7();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[15]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		employee.clickEmployeeName8();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[16]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
							
		employee.clickEmployeeName9();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[17]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
							
			
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyTax(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81]);
		verify.verifyEmployeeNI(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
		verify.verifyEmployerNI2(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
		verify.verifyEmployeePension(data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127], data[128], data[129]);
		verify.verifyEmployerPension(data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
		verify.assertAll();
	}
		
}
