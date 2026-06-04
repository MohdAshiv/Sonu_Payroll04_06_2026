package _9126Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC710_DepartmentalAnalysis_EmailPopUp extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateEmailCancelBtn() throws Exception {
		sTestCaseID = "TC710";
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

		company.Click_clickDepartments();
		
		
		
		for(int i=9; i<=11;i++)
		{
			company.clickDepartment();
			company.enterDepartmentName1(data[i]);
			company.clickDepatrmentSaveBtn();
			Thread.sleep(7000);
		}
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
		

		for(int i=70;i<=71;i++)
		{
			employee.clickNewEmployee();
			employee.enterFirstName(data[63]);
			employee.enterLastName(data[i]);
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
			
			Thread.sleep(3000);
			
		}
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		
		employee.clickEmployeeName();
		employee.editEmployeeDetails();

		employee.click_Paydetails();

		page.selectDepartment(data[9]);
		employee.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		
		employee.clickEmployeeName1();
		employee.editEmployeeDetails();

		employee.click_Paydetails();
		page.selectDepartment(data[10]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
		
		
		payroll.Run_Payroll();
		
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	    System.out.println("jnckj");
	  
		verify.verifyEmailCancelBtn();
		
	    verify .assertAll();

	}
	
	
	@Test(priority=2)
	public void TC02validateEmailClose() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	    System.out.println("jnckj");
	  
		verify.verifyEmailCloseBtn();
		
	    verify .assertAll();

	}
	
	
	@Test(priority=3)
	public void TC03validateEmailPopUpHeader() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifyEmailPopUpHeader();
		
	    verify .assertAll();

	}
	
	

	@Test(priority=4)
	public void TC04validateEmailSendWithNullEmail() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		email.clickSendBtnDepartmentalAnalysis();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifyEmailPopUpAlert();
		
	    verify .assertAll();

	}
	
	

	@Test(priority=5)
	public void TC05validateEmailPopUpAttachCheckBox() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifyCheckBoxSelected();
		
	    verify .assertAll();

	}
	
	


	@Test(priority=6)
	public void TC06validateEmailPopUpCompanyEmailCheckBox() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifyCompanyEmailCheckBoxNotSelected();
		
	    verify .assertAll();

	}
	
	

	@Test(priority=7)
	public void TC07validateEmailPopUpMyselfEmailCheckBox() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifyMyselfEmailCheckBoxNotSelected();
		
	    verify .assertAll();

	}
	
	
	@Test(priority=8)
	public void TC08validateEmailPopUpMyselfEmailCheckBox() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifyMyselfEmailCheckBoxNotSelected();
		
	    verify .assertAll();

	}
	
	

	@Test(priority=9)
	public void TC09validateSubjectInsideDetaileddReport() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectReportType(data[8]);

	
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifySubjectInsideEmailPopup(data[15]);
		
	    verify .assertAll();

	}
	

	@Test(priority=10)
	public void TC10validateSubjectInsideSummarizedReport() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

	
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		verify.verifySubjectInsideEmailPopup(data[16]);
		
	    verify .assertAll();

	}
	

	@Test(priority=11)
	public void TC11validateAttachementClickableInsideClickableDetaileddReportPDF() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
		page.selectReportType(data[8]);

		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
	  
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		page.switchInsideFrame();
		pdf.DownloadPDF(driver, data[20]);
		pdf.ReadPDF();
		page.switchInsideFrame();
		verify.verifyEmailPopupAttachement(data[12],data[13]);
		
	    verify .assertAll();

	}
	

	@Test(priority=12)
	public void TC12validateAttachementClickableInsideClickableSummarizedReportPDF() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
	
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		page.switchInsideFrame();
		pdf.DownloadPDF(driver, data[20]);
		pdf.ReadPDF();
		page.switchInsideFrame();

		verify.verifyEmailPopupAttachement(data[12],data[14]);
		
	    verify .assertAll();

	}
	
	

	@Test(priority=13)
	public void TC13validateEmailSentMsg() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
	   _5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
	   
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		email.enterToEmail(data[17]);
		email.clickSendBtnDepartmentalAnalysis();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyEmailPopUpAlert1();
	    verify .assertAll();

	}
	
	
	@Test(priority=14)
	public void TC14validateEmailSentSuccesfullySubjectSummraized() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
	   
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		email.enterToEmail(data[17]);
		email.clickSendBtnDepartmentalAnalysis();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifySubjectInsideEmailLog(data[16]);
	    verify .assertAll();

	}
	
	
	@Test(priority=15)
	public void TC15validateEmailSentSuccesfullySubjectDetailed() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectReportType(data[8]);

	   //_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
	   
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		email.enterToEmail(data[17]);
		email.clickSendBtnDepartmentalAnalysis();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifySubjectInsideEmailLog(data[15]);
	    verify .assertAll();

	}
	
	

	@Test(priority=16)
	public void TC16validateEmailSentSuccesfullyDetailedPDF() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectReportType(data[8]);

	   //_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
	   
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		email.enterToEmail(data[17]);
		email.clickSendBtnDepartmentalAnalysis();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
				
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[21]);
		pdf.ReadPDF();
		//verify.verifyEmailPopupAttachement(data[12],data[13]);
	    verify .assertAll();

	}
	

	@Test(priority=17)
	public void TC17validateEmailSentSuccesfullySummraizedPDF() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		email.enterToEmail(data[17]);
		email.clickSendBtnDepartmentalAnalysis();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
			
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();

		
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[21]);
		pdf.ReadPDF();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyEmailPopupAttachement(data[12],data[14]);
	    verify .assertAll();

	}
	

	@Test(priority=18)
	public void TC18validateExportToPDFSummarized() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[22]);
		pdf.ReadPDF();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyEmailPopupAttachement(data[12],data[14]);
	    verify .assertAll();

	}
	

	@Test(priority=19)
	public void TC19validateExportToPDFDetailed() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectReportType(data[8]);
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[22]);
		pdf.ReadPDF();
		verify.verifyEmailPopupAttachement(data[12],data[13]);
	    verify .assertAll();
	}
	
	//@Test(priority=20)
	public void TC20validateExportToCSvDetailed() throws Exception {
		sTestCaseID = "TC710";
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
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);

		page.selectReportType(data[8]);
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		utilities.DownloadPdf pdf= new  utilities.DownloadPdf(driver);
		pdf.DownloadPDF(driver, data[23]);
//		pdf.ReadPDF();
		verify.verifyEmailPopupAttachement(data[12],data[13]);
	    verify .assertAll();
	}
	
	

	@Test(priority=21)
	public void TC21validateEmailAttachmentShouldNotRecievedIfCheckBoxUntick() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		email.enterToEmail(data[17]);

		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
        page.switchInsideFrame();
		page.untickAttachmentCheckBox();
		page.OutInsideFrame();
		email.clickSendBtnDepartmentalAnalysis();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyAttachement(0);
		
	    verify .assertAll();

	}
	

	@Test(priority=22)
	public void TC22validateEmailAttachmentShouldRecievedIfCheckBoxtick() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		email.enterToEmail(data[17]);

		_5671Departments_Page.DepartmentsPage page = new _5671Departments_Page.DepartmentsPage(driver);
      
		email.clickSendBtnDepartmentalAnalysis();
		
		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);
		
		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyAttachement(1);
		
	    verify .assertAll();

	}
	
	@Test(priority=23)
	public void TC23validateCompanyEmailAddressShowSelectedIfEmailContactAdded() throws Exception {
		sTestCaseID = "TC710";
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
			
		pages.EditCompany company= new 	pages.EditCompany(driver);
		company.Click_gotoEditCompany();
		company.ClickContactDetails();
		company.enterFirstName(data[18]);
		company.enterEmail(data[17]);
		company.clickAddContact();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		
		payroll.Click_PayrollDashboard();
	
		pages.reports report = new pages.reports(driver);
		report.Click__Reports_();
		report.Click__DepartmentalAnalyisis_();
		
		pages.EmailSection email= new pages.EmailSection(driver);
		email.clickEmailBtn();
		
		_9126Page.Verify9126 verify= new _9126Page.Verify9126(driver);
		verify.verifyCompanyEmailCheckBoxSelected();
		
	    verify .assertAll();

	}
}
