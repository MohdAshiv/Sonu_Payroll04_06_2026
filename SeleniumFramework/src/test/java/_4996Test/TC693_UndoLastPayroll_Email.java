package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC693_UndoLastPayroll_Email  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateUndoLastPayrollToMain() throws Exception {
		sTestCaseID = "TC693";
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
		company.ClickContactDetails();
		company.enterFirstName(data[30]);
		company.enterEmail(data[31]);
		company.clickAddContact();
		
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[60]);
		company.enterRefrenceNumber(data[61]);
		company.accountOfficeReffrence(data[62]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[69]);
		company.Click_ClickSave();
	pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		

		for(int i=70;i<=80;i++)
		{
			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[i]);
			employee.enterDateOfBirth(data[65]);
			employee.enterAddressLine(data[66]);
			employee.enterAddressLine2(data[67]);
			employee.enterPostCode(data[68]);
			employee.enterEmailAddress(data[32]);
			employee.clickSaveBtn();
			employee.clickMandotoryPayroll();
			
			employee.enterJoiningDate(data[69]);
			employee.enterNICategory(data[6]);
			employee.enterTaxCode(data[7]);
			employee.clickSaveBtn();
			
			employee.click_Paydetails();
			employee.enterBasicSalary3(data[5]);
			employee.clickSaveBtn();
			payroll.Click_PayrollDashboard();
			
			Thread.sleep(3000);
			
		}
		
	     payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[8]);

			payroll.runPayroll(); 
			payroll.selectType(data[29]);
			payroll.runPayroll2();
			payroll.sendEmailFromRunPayroll();

			payroll.SelecPeriodEndDate(data[8]);
	    _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
		verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
		verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);

		
		verify.assertAll();
	}
	
	
	@Test(priority=2)
	public void TC02validateTaxNIEmailToBoth() throws Exception {
		sTestCaseID = "TC693";
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

			
		    payroll.Undo_LastPayroll();
		    
		    driver.navigate().refresh();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[8]);

			payroll.runPayroll(); 
			payroll.selectType(data[53]);
			payroll.runPayroll2();
			payroll.Click_SendBtnEmployee();
			payroll.sendEmailFromRunPayroll();


			payroll.SelecPeriodEndDate(data[8]);
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);

			
			verify.assertAll();
	}
	
	
	
	@Test(priority=3)
	public void TC03validateTaxNIEmailToEmloyees() throws Exception {
		sTestCaseID = "TC693";
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
			
		    payroll.Undo_LastPayroll();
		    
		    driver.navigate().refresh();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[8]);

			payroll.runPayroll(); 
			payroll.selectType(data[28]);
			payroll.runPayroll2();
			payroll.sendEmailFromRunPayroll();

			payroll.SelecPeriodEndDate(data[8]);
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.assertAll();
	}
	
	
	
	@Test(priority=4)
	public void TC04validateTaxNIEmailDontSend() throws Exception {
		sTestCaseID = "TC693";
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
			
		    payroll.Undo_LastPayroll();
		    
		    driver.navigate().refresh();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.SelecPeriodEndDate(data[8]);

			payroll.Run_Payroll();
			payroll.SelecPeriodEndDate(data[8]);
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.assertAll();
	}
	
}
