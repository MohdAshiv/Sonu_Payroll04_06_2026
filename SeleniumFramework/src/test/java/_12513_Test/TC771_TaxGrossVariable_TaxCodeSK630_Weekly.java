package _12513_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC771_TaxGrossVariable_TaxCodeSK630_Weekly extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	@Test(priority=1)

	public void validateTaxCalculation() throws Exception {

		sTestCaseID = "TC771";
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
		buisness.enterRegistrationDate(data[46]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[44]);
		Bk.Enter_CompanyAddressLine1(data[45]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[46]);
		Bk.Enter_NewEndDate(data[47]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[48]);
		company.enterRefrenceNumber(data[49]);
		company.accountOfficeReffrence(data[50]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[57]);
		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[42]);
		freq.Enter_WeeklyPayDate(data[57]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
	//	company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[51]);
		employee.enterLastName(data[52]);
		employee.enterDateOfBirth(data[53]);
		employee.enterAddressLine(data[54]);
		employee.enterAddressLine2(data[55]);
		employee.enterPostCode(data[56]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[57]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[43]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		payroll.Run_Payroll();
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);

		for(int i=7;i<=8;i++) {
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.enterBasicPay(data[i]);
        processPay.clickSaveBtn();
		payroll.Run_Payroll();

		}

		employee.clickEmployeeName();
	    		
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	   
	    verify.verifyTaxWeekly(data[59], data[60], data[61], data[62], data[63], data[64], data[65], data[66], data[67], data[68], data[69],data[70],data[71],data[72],data[73],data[74],data[75],data[76],data[77],data[78],data[79],data[80],data[81],data[82],data[83],data[84],data[85],data[86],data[87],data[88],data[89],data[90],data[91],data[92],data[93],data[94],data[95],data[96],data[97],data[98],data[99],data[100],data[101],data[102],data[103],data[104],data[105],data[106],data[107],data[108],data[109],data[110],data[111]);

        verify.assertAll();
}
}
