package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC505_NI_Letter_A_Monthly_AdditionDeduction  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateNITaxNetPay() throws Exception {

		sTestCaseID = "TC505";
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
//		OpenClient.Enter_EnterClientName(data[87]);
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
       
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
       
       for(int i=0;i<=11;i++) {
        processPay.click3Dots();
        processPay.clickProcessPay();
		processPay.clickAddMore();
		processPay.enterAccountCode(data[9]);
		processPay.enterDescription(data[10]);
		processPay.enterAmount(data[8]);
		processPay.clickApplyBtn();
		processPay.tickNotinalPay();
		processPay.clickSaveBtn();
		
		 processPay.click3Dots();
	        processPay.clickProcessPay();
			processPay.clickAddMore();
			processPay.enterAccountCode2(data[9]);
			processPay.enterDescription2(data[10]);
			processPay.enterAmount2(data[8]);
			processPay.clickApplyBtn2();
			processPay.untickAllOptions2();
			
			processPay.clickDeductionTab();
			processPay.clickAddMoreDeduction();
			processPay.enterAccountCodeDeduction(data[9]);
			processPay.enterDeductionDescription(data[10]);
			processPay.enterdeductionAmount(data[55]);
			processPay.clickApplyOnDeduction();
			processPay.untickAllOptionsDeduction();
			processPay.clickSaveBtn();
			
		
		payroll.Run_Payroll();}
	 
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);

       
	    employee.clickEmployeeName();
	    verify.verifyEmployeeNI(data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],data[19],data[20],data[21],data[22]);
		   
	    verify.verifyEmployerNI( data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30],data[31],data[32],data[33],data[34]);
	    verify.verifyTax( data[35], data[36], data[37], data[38], data[39], data[40], data[41], data[42],data[43],data[44],data[45],data[46]);

	    verify.verifyNetPay(data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80],data[81]);

	    pages.ProcessPay page= new  pages.ProcessPay(driver);

	    page.clickEmployeeSalaryDetails3();
	    		
	    verify.netTaxNIGrossYTD(data[82], data[83], data[84], data[85],data[86]);
	    
	    payroll.closePopup();
		payroll.scrollClickPayrollDashboard();

       pages.FilingManagement filling=  new pages.FilingManagement(driver);
		
		filling.Click_gotoFilingManagement();
		
		
		_6440_Page.fpsPage fps = new _6440_Page.fpsPage(driver);
		fps.clickMarch3Fps();

		//fps.clickAprilFps();
		verify.getXMLData();
		verify.verifyXML4(data[88], data[89], data[90], data[91], data[92], data[93], data[94], data[95],data[96], data[97], data[98], data[99], data[100],data[101],data[102],data[103]);
	
}
	
	
	@Test(priority=2)

	public void validateNITaxNetPayXmlMarch() throws Exception {

		sTestCaseID = "TC505";
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
		
	//.Click_ClientsClick();
//		pages.CreateClient buisness= new pages.CreateClient (driver);
//		buisness.clickNewClient();
//		buisness.clickLimitedCompany();
//		buisness.clickMnualyLimitedCompany();
//		buisness.enterBuisnessName();
//		
//		buisness.enterRegistrationNo();
//		buisness.enterRegistrationDate(data[58]);
//		buisness.enterFirstName();
//		buisness.enterLastName();
//		buisness.clickSaveBtn();
//		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//	
//		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
//		Bk.Click_BKEdit();
//		Bk.Select_services(data[56]);
//		Bk.Enter_CompanyAddressLine1(data[57]);
//		Bk.Click_Save();
//
//		Bk.Click_AccountingPeriod();
//		Bk.Click_AddAccountingPeriod();
//		Bk.Enter_NewStartDate(data[58]);
//		Bk.Enter_NewEndDate(data[59]);
//		Bk.Click_AccPeriodSave();
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName2();
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
//		pages.EditCompany company= new 	pages.EditCompany(driver);
//		
//		company.Click_gotoEditCompany();
//		company.Click_clickPayrollDetails();
//		
//		company.enterPayeNumber(data[60]);
//		company.enterRefrenceNumber(data[61]);
//		company.accountOfficeReffrence(data[62]);
//		
//		company.Click_ClickSave();
//		company.Click_clickPayrollSettings();
//		company.Enter_NomismaStartDate(data[69]);
//		company.Click_ClickSave();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//
//	
//		payroll.Click_PayrollDashboard();
//		
//		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
//		
//		employee.clickNewEmployee();
//		employee.enterFirstName(data[63]);
//		employee.enterLastName(data[64]);
//		employee.enterDateOfBirth(data[65]);
//		employee.enterAddressLine(data[66]);
//		employee.enterAddressLine2(data[67]);
//		employee.enterPostCode(data[68]);
//		employee.clickSaveBtn();
//		employee.clickMandotoryPayroll();
//		
//		employee.enterJoiningDate(data[69]);
//
//	
//		employee.enterNICategory(data[6]);
//		employee.enterTaxCode(data[7]);
//		employee.clickSaveBtn();
//		employee.click_Paydetails();
//		employee.enterBasicSalary3(data[5]);
//		employee.clickSaveBtn();
//	
//		payroll.Click_PayrollDashboard();
//       
//		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
//       
//     
//        processPay.click3Dots();
//        processPay.clickProcessPay();
//		processPay.clickAddMore();
//		processPay.enterAccountCode(data[9]);
//		processPay.enterDescription(data[10]);
//		processPay.enterAmount(data[8]);
//		processPay.clickApplyBtn();
//		processPay.untickAllOptions();
//		processPay.clickSaveBtn();
		
		
	    
       pages.FilingManagement filling=  new pages.FilingManagement(driver);
		
		filling.Click_gotoFilingManagement();
	   _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);

		_6440_Page.fpsPage fps = new _6440_Page.fpsPage(driver);
		fps.clickAprilFps();

		//	fps.clickMarch3Fps();
			verify.getXMLData();
			verify.verifyXML4( data[104], data[105], data[106], data[107], data[108], data[109], data[110],data[111], data[112], data[113], data[114], data[115],data[116],data[117],data[118],data[119]);

		    verify.assertAll();
		
	
}
}
