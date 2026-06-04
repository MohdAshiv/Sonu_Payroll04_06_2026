package _2155Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC085_Verify_DayRate extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	 // @Test(priority = 0)
	
	public void ClientSetup() throws Exception 
	{
		
		sTestCaseID = "TC085";
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
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName1(data[4]);
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[14]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[12]);
		Bk.Enter_CompanyAddressLine1(data[13]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[14]);
		Bk.Enter_NewEndDate(data[15]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		company.enterFirstName(data[30]);
		company.enterEmail(data[31]);
		company.clickAddContact();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[16]);
		company.enterRefrenceNumber(data[17]);
		company.accountOfficeReffrence(data[18]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[29]);
		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

	    payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[19]);
		employee.enterFirstName(data[20]);
		employee.enterLastName(data[21]);
		employee.enterDateOfBirth(data[22]);
		employee.enterAddressLine(data[23]);
		employee.enterAddressLine2(data[24]);
		employee.enterPostCode(data[25]);
		employee.enterEmailAddress(data[31]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[29]);

		employee.enterNICategory(data[26]);
		employee.enterTaxCode(data[27]);
		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary1(data[28]);
//		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
				
		
	}
	  
	  
		@Test(priority=1)

	public void validateDayRate() throws Exception {

		sTestCaseID = "TC085";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
	
		employee.click3Dots();
		employee.clickEditBtn();
		employee.click_Paydetails();
		employee.Click_howpayworkout(data[5]);
		employee.Enter_HourRate(data[6]);
		employee.clickSaveBtn();
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
	    
	    pages.ProcessPay processPay= new  pages.ProcessPay(driver);
	    
	    employee.click3Dots();
	    processPay.clickProcessPay();
	    processPay.enterUnit(data[7]);
	    processPay.clickSaveBtn();
	    
	    payroll.Run_Payroll();
	    
	    employee.click3Dots();
	    employee.clickEditBtn();
	    employee.click_Paydetails();
	    employee.Click_howpayworkout(data[8]);
	    employee.Enter_DayRate(data[9]);
	    employee.clickSaveBtn();
	    
	    payroll.Click_PayrollDashboard();
	    
	    employee.click3Dots();
	    processPay.clickProcessPay();
	    processPay.enterUnit(data[10]);
	    processPay.applyFuturePay();
	    
	    processPay.clickSaveBtn();
	    
	    payroll.Run_Payroll();
	    employee.click3Dots();
	    processPay.clickProcessPay();
	    
	    _2155Page.Verify_ExpectedResults verify= new  _2155Page.Verify_ExpectedResults(driver);
	    
	    verify.payWorkedOut(data[11],data[10],data[9]);
	    utilities.TakeScreenshot.Getscreenshot("TC085_ ProcessPay Rate Unit", "2155", driver);
	    
	 
	    // Reset employee 
	    payroll.Click_PayrollDashboard();
	    for(int i=0;i<=1;i++)
	    {
	    	payroll.Undo_LastPayroll();
	    }
	    
	    employee.click3Dots();
		employee.clickEditBtn();
		employee.click_Paydetails();
		employee.Click_howpayworkout(data[5]);
		employee.Enter_HourRate(data[6]);
		employee.clickSaveBtn();
		
		verify.assertAll();
		
}

}