package _12513_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC788_2Employee_NoEmployerNIC_NormalEmployee extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	@Test(priority=1)

	public void TC01validateNITaxPensionNetPay() throws Exception {

		sTestCaseID = "TC788";
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
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[102]);
		employee.enterLastName(data[103]);
		employee.enterDateOfBirth(data[104]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[107]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		
		employee.enterJoiningDate(data[108]);
		employee.clickNoEmployerNIC();

		employee.enterNICategory(data[6]);
		employee.enterNationalInsuranceNumber(data[114]);

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
	
		
		employee.clickNewEmployee();
		employee.enterFirstName(data[110]);
		employee.enterLastName(data[111]);
		employee.enterDateOfBirth(data[104]);
		employee.enterAddressLine(data[105]);
		employee.enterAddressLine2(data[106]);
		employee.enterPostCode(data[107]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[108]);
		employee.enterNationalInsuranceNumber(data[114]);
		employee.enterNICategory(data[6]);
		employee.enterTaxCode(data[112]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[113]);
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
		

		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();
		company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
		payroll.Click_PayrollDashboard();

		
		
		for(int i=0;i<=11;i++) {payroll.Run_Payroll(); Thread.sleep(2000);}
		employee.clickEmployeeName();
	    		
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	    
	    verify.verifyEmployeeNI(data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],data[19]);
		   
	    verify.verifyEmployerNI1(data[20], data[21], data[22], data[23], data[24], data[25], data[26], data[27], data[28], data[29], data[30],data[31]);
	    verify.verifyTax(data[32], data[33], data[34], data[35], data[36], data[37], data[38], data[39], data[40], data[41], data[42],data[43]);

	    verify.verifyNetPay1(data[44], data[45], data[46], data[47], data[48], data[49], data[50], data[51], data[52], data[53], data[54],data[55]);

	    verify.verifyEmployeePension(data[56], data[57], data[58], data[59], data[60], data[61], data[61], data[63], data[64], data[65], data[66],data[67]);

	    verify.verifyEmployerPension(data[68], data[69], data[70], data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78],data[79]);

        verify.assertAll();
	
}
	

	
	@Test(priority=2)

	public void TC02validateNITaxPensionNetPayNoEmployerNIC() throws Exception {

		sTestCaseID = "TC788";
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
	
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);

		employee.clickEmployeeName1();
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	   
	    verify.verifyEmployeeNI(data[116], data[117], data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126],data[127]);
		   
	    verify.verifyEmployerNI1(data[128], data[129], data[130], data[131], data[132], data[133], data[134], data[135], data[136], data[137], data[138],data[139]);
	    verify.verifyTax(data[140], data[141], data[142], data[143], data[144],data[145], data[146], data[147], data[148], data[149], data[150], data[151]);

	    verify.verifyNetPay1(data[193], data[194], data[195], data[196], data[197], data[198], data[199], data[200], data[201], data[202], data[203],data[204]);

	    verify.verifyEmployeePension(data[205], data[206], data[207], data[208], data[209], data[210], data[211], data[212], data[213], data[214], data[215],data[216]);

	    verify.verifyEmployerPension(data[217], data[218], data[219], data[220], data[221], data[222], data[223], data[224], data[225], data[226], data[227],data[228]);

        verify.assertAll();
	
}
	

	@Test(priority=3)

	public void TC03validateEmployementAllowances() throws Exception {

		sTestCaseID = "TC788";
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
	
		pages.reports report = new pages.reports (driver);
		report.Click__Reports_();
		report.clickTaxPayment();
		
        _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	    
	    verify.verifyEmployementAllowance(data[152], data[153],  data[154], data[155], data[156], data[157], data[158], data[159], data[160], data[161], data[162], data[163],data[164]);
	    
        verify.assertAll();
	
}
	

	@Test(priority=4)

	public void TC04validateXmlMarch() throws Exception {

		sTestCaseID = "TC788";
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
		
		 pages.FilingManagement filling=  new pages.FilingManagement(driver);
			
	     filling.Click_gotoFilingManagement();
			
			
	    _6440_Page.fpsPage fps = new _6440_Page.fpsPage(driver);
		 _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);

		fps.clickAprilFps();   // MarchFPS
		verify.getXMLData();

		verify.verify1StEmployeeXml(data[165], data[166], data[167], data[168], data[169], data[170], data[171], data[172],data[173], data[174], data[175], data[176], data[177],data[178]);
		fps.clickAprilFps();   // MarchFPS
		verify.getXMLData();

		verify.verify2ndEmployeeXml(data[179], data[180], data[181], data[182], data[183], data[184], data[185], data[186],data[187], data[188], data[189], data[190], data[191],data[192]);

		verify.assertAll();
	}
}
