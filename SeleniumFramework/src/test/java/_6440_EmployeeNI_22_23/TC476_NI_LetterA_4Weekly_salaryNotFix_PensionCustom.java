package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC476_NI_LetterA_4Weekly_salaryNotFix_PensionCustom  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateNITaxPensionNetPayTotal() throws Exception {

		sTestCaseID = "TC476";
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
//		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[9]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[88]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[86]);
		Bk.Enter_CompanyAddressLine1(data[87]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[88]);
		Bk.Enter_NewEndDate(data[89]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[90]);
		company.enterRefrenceNumber(data[91]);
		company.accountOfficeReffrence(data[92]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[108]);
		
	     pages.FrequencySet freq= new pages.FrequencySet(driver);
		
		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[78]);
		freq.Enter_FourWeeklyPayDate(data[79]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		
		company.clickYesPension();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.PensionSetup pension = new pages.PensionSetup(driver);
		
		pension.enterPensionStagingDate(data[93]);
		pension.enterSignatoryTitle();
		pension.enterSignatoryName();
		pension.enterEmailAddress(data[94]);
		pension.enterPhoneNumber();
		pension.enterPensionId(data[95]);
		pension.clickPensonDetailsSave();
		payroll.scrollClickPayrollDashboard();
		pension.clickPensionDashBoard();
		pension.addSchemeManually();
		pension.enterPensionSchemeName(data[96]);
		pension.selectPensionProvider(data[96]);
		pension.selectCalculationBasis(data[97]);
		pension.selectCalculationMethod(data[98]);
		pension.eeContribution(data[99]);
		pension.enterErContribution(data[100]);
		pension.enterSubgroupName();
		pension.enterGroupId();
		pension.enterSubGroupId();
		pension.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		employee.clickNewEmployee();
		employee.enterTitle(data[110]);
		employee.enterFirstName(data[102]);
		employee.enterLastName(data[103]);
		employee.enterDateOfBirth(data[104]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[107]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[108]);

		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[7]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[5]);

		employee.clickSaveBtn();
		employee.clickAutoEnrolment();
		pension.selectWorkerType(data[109]);
		pension.selectScheme(data[96]);
		pension.enterEnrollmentDate(data[108]);
		pension.eeChoosenContribution(data[99]);
		pension.erChoosenContribution(data[100]);
		pension.eeVoluntaryContribution(data[101]);
		pension.eRVoluntaryContribution(data[101]);
		pension.clickAutoEnrollmentSaveBtn();
	    payroll.Click_PayrollDashboard();
	    
		pages.ProcessPay page = new pages.ProcessPay(driver);

		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[64]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[65]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[66]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[67]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[68]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[69]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[70]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[71]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[72]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[73]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[74]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[75]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[76]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		
		employee.clickEmployeeName();

	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	    
	    verify.verify4WeeklyEmployeeNI(data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15],data[16],data[17],data[18],data[19],data[20],data[21]);

	    verify.verify4WeeklyEmployerNI1(data[22],data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30],data[31],data[32],data[33],data[34],data[35]);
	   
	    verify.verify4WeeklyTax(data[36],data[37],data[38],data[39], data[40], data[41], data[42],data[43],data[44],data[45],data[46],data[47],data[48],data[49]);

	    verify.verify4WeeklyNetPay1(data[50], data[51], data[52], data[53], data[54], data[55], data[56], data[57],data[58],data[59],data[60],data[61],data[62],data[63]);

	    verify.verify4WeeklyEmployeePension(data[111], data[112], data[113], data[114], data[115], data[116], data[117], data[118],data[119],data[120],data[121],data[122],data[123],data[124]);

	    verify.verify4WeeklyEmployerPension(data[125], data[126], data[127], data[128], data[129], data[130], data[131], data[132],data[133],data[134],data[135],data[136],data[137],data[138]);

    	page.clickEmployeeSalaryDetailsFourWeekly();
	    
	    verify.netTaxNIPensionYTD(data[80], data[81], data[82], data[83],data[84],data[85]);
        verify.assertAll();
	
}		
}
