package _12513_Test;

import org.testng.annotations.Test;

import pages.reports;
import tests.TestBase;
import utilities.ExcelData;

public class TC791_P45_NormalTaxCodeXml extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateXmlP45June() throws Exception {
		sTestCaseID = "TC791";
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
			
			employee.enterJoiningDate(data[70]);

			employee.enterNICategory(data[6]);
			employee.enterTaxCode(data[7]);
			

			employee.selectStarterDeclaration(data[19]);
			employee.enableP45();
			employee.enterLeaveDateSalary(data[20]);
			employee.enterIncomeTax(data[21]);
			employee.enterP45LeavingDate(data[22]);
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
			
		
			for ( int i=0;i<=2;i++) {payroll.Run_Payroll();}
			

			 pages.FilingManagement filling=  new pages.FilingManagement(driver);
				
		     filling.Click_gotoFilingManagement();
				
				
		    _6440_Page.fpsPage fps = new _6440_Page.fpsPage(driver);
			 _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);

			fps.clickAprilEps();   // June FPS
			verify.getXMLData();

			verify.verify1StEmployeeXmlWithPension(data[23], data[24], data[25], data[26],  data[27], data[28],data[29], data[30], data[31], data[32], data[33],data[34],data[35],data[36],data[37]);
		
			verify.assertAll();

	}
	
	

	@Test(priority=2)
	public void TC02validateP45ReportSep() throws Exception {
		sTestCaseID = "TC791";
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
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
     	pages.PayrollRun payroll= new pages.PayrollRun (driver);

		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.click_Paydetails();
		employee.enterLeavingDate(data[8]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		for ( int i=0;i<=2;i++) {payroll.Run_Payroll();}
			
		

		pages.reports report = new  reports(driver);
		report.Click__Reports_();
		report.Click_P45Forms();
		report.Select_SelectP45Form(data[9]);
		System.err.println("kncnc");
		
		_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
		verify.verifyP45PTaxPayToDateTotalTax2(data[10],data[11]);
        verify.assertAll();
        
  

	}
	
	
	
	
	@Test(priority=3)
	public void TC03validateXMLP45Sep() throws Exception {
		sTestCaseID = "TC791";
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
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		pages.PayrollRun payroll = new pages.PayrollRun(driver);

		pages.FilingManagement filling = new pages.FilingManagement(driver);

		filling.Click_gotoFilingManagement();

		_6440_Page.fpsPage fps = new _6440_Page.fpsPage(driver);
		_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);

		fps.clickAprilEps(); // SepTember FPS
		verify.getXMLData();

		verify.verify1StEmployeeXmlWithPension(data[71], data[72], data[73], data[74], data[75], data[76], data[77],data[78], data[79], data[80], data[81], data[82], data[83], data[84], data[85]);

		verify.assertAll();

	}
	
	
	
}
