package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC638_UndoLastPayroll_3EmployeeWeekly  extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)
	public void TC01validateTaxNI3Employee() throws Exception {
		sTestCaseID = "TC638";
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

//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[4]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[58]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[56]);
		Bk.Enter_CompanyAddressLine1(data[57]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[58]);
		Bk.Enter_NewEndDate(data[59]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		
    	pages.FrequencySet freq= new pages.FrequencySet(driver);
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[54]);
		freq.Enter_WeeklyPayDate(data[70]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		

			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[64]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[69]);
			employee.enterNICategory(data[6]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary3(data[9]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
			

			employee.clickNewEmployee();
			employee.enterFirstName(data[71]);
			employee.enterLastName(data[72]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[69]);
			employee.enterNICategory(data[8]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary3(data[10]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			

			employee.clickNewEmployee();
			employee.enterFirstName(data[73]);
			employee.enterLastName(data[74]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			employee.enterJoiningDate(data[69]);
			employee.enterNICategory(data[8]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			employee.click_Paydetails();
			employee.enterBasicSalary3(data[11]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
		 _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
				 
		    verify.verifyTax( data[75], data[76], data[77], data[78], data[79], data[80], data[81],data[82], data[83], data[84], data[85], data[86]);
			verify.verifyEmployeeNI( data[87], data[88], data[89], data[90], data[91], data[92], data[93],data[94], data[95], data[96], data[97], data[98]);
			verify.verifyEmployerNI(data[99], data[100], data[101], data[102], data[103], data[104], data[105],data[106],data[107],data[108],data[109],data[110]);
			verify.assertAll();
}
	
	

	@Test(priority=2)
	public void TC02validateTaxNiIf1EmployeeUndo() throws Exception {
		sTestCaseID = "TC638";
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
		
		
		_4996Page.Page4996 page = new _4996Page.Page4996(driver);

		page.clickUndoLastPayrollBtn();
		 _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);


		page.clickNameCheckBox();
		page.tickEmployeeCostelCheckBox();
	

		page.clickUndoBtn1();
		page.SwithToDefault();
		
		payroll.SelecPeriodEndDate(data[12]);
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
	
		
		employee.clickEmployeeName1();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterBasicSalary(data[13]);
		employee.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		payroll.SelecPeriodEndDate(data[12]);
		verify.verifyTax(data[111], data[112], data[113], data[114], data[115], data[116], data[117], data[118], data[119], data[120], data[121], data[122]);
		verify.verifyEmployeeNI(data[123], data[124], data[125], data[126], data[127], data[128], data[129], data[130], data[131], data[132], data[133], data[134]);
		verify.verifyEmployerNI(data[135], data[136], data[137], data[138], data[139], data[140], data[141], data[142], data[143], data[144], data[145], data[146]);
		payroll.Run_Payroll(); 
		verify.assertAll();
	}
	
	
}
