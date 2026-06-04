package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC468_NI_LetterA_4Weekly_9312 extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validateNITaxNetPayGross() throws Exception {

		sTestCaseID = "TC468";
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
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[9]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[7]);
		Bk.Enter_CompanyAddressLine1(data[8]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[9]);
		Bk.Enter_NewEndDate(data[10]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[11]);
		company.enterRefrenceNumber(data[12]);
		company.accountOfficeReffrence(data[13]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[20]);
		
		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[21]);
		freq.Enter_FourWeeklyPayDate(data[20]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[22]);
		employee.enterFirstName(data[14]);
		employee.enterLastName(data[15]);
		employee.enterDateOfBirth(data[16]);
		employee.enterAddressLine(data[17]);
		employee.enterAddressLine2(data[18]);
		employee.enterPostCode(data[19]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[20]);

		employee.enterNICategory(data[5]);
		employee.enterTaxCode(data[6]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[4]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();

		employee.clickEmployeeName();

	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	    
	    verify.verify4WeeklyEmployeeNI(data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30],data[31],data[32],data[33],data[34],data[35],data[36]);
	   
	    verify.verify4WeeklyEmployerNI(data[37],data[38],data[39], data[40], data[41], data[42],data[43],data[44],data[45],data[46],data[47],data[48],data[49],data[50]);

	    verify.verify4WeeklyTax( data[51], data[52], data[53], data[54], data[55], data[56], data[57],data[58],data[59],data[60],data[61],data[62],data[63],data[64]);
        verify.verify4WeeklyNetPay( data[65], data[66], data[67], data[68], data[69], data[70], data[71],data[72],data[73],data[74],data[75],data[76],data[77],data[78]);
	    
		pages.ProcessPay page = new pages.ProcessPay(driver);

    	page.clickEmployeeSalaryDetailsFourWeekly();
		verify.netTaxNIGrossYTD(data[79], data[80], data[81], data[82], data[83]);
        
        verify.assertAll();
	
}
	
}
