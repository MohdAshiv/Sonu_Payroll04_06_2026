package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC483_NI_LetterA_442_Monthly_SalaryNotFix  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateNITaxNetPay() throws Exception {

		sTestCaseID = "TC483";
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
		company.Click_ClickSave();
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
		employee.enterBasicSalary3(data[5]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
		pages.ProcessPay page = new pages.ProcessPay(driver);

		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[8]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[9]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[10]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[11]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[12]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[13]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[14]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[15]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[16]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[17]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[18]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[19]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
	    		
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	    
        pages.reports report= new 	pages.reports (driver);
		
		report.Click__Reports_();
		report.Click_P11();
	
       verify.verifyP11EarningsAtTheLEL(data[129], data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138], data[139], data[140], data[141]);
       verify.verifyP11EarningsAboveTheLEL(data[142], data[143], data[144], data[145], data[146], data[147], data[148], data[149], data[150], data[151], data[152], data[153], data[154]);
       verify.verifyP11EarningsAboveThePT(data[155], data[156], data[157], data[158], data[159], data[160], data[161], data[162], data[163], data[164], data[165], data[166], data[167]);
       verify.verifyP11TotalContributions(data[168], data[169], data[170], data[171], data[172], data[173], data[174], data[175], data[176], data[177], data[178], data[179], data[180]);

       verify.verifyP11EmployeeContributions(data[181], data[182], data[183], data[184], data[185], data[186], data[187], data[188], data[189], data[190], data[191], data[192], data[193]);

       verify.verifyP11TotalPayToDate( data[194], data[195], data[196], data[197], data[198], data[199], data[200], data[201], data[202], data[203], data[204], data[205]);

       verify.verifyP11TotalTaxablePayToDate( data[206], data[207], data[208], data[209], data[210], data[211], data[212], data[213], data[214],data[215], data[216], data[217]);

       verify.verifyP11TotalTaxDueTodate( data[218], data[219], data[220], data[221], data[222],data[223], data[224], data[225], data[226], data[227], data[228], data[229],  data[230], data[231]);

	    verify.assertAll();
        verify.assertAll();
	
}
	
}
