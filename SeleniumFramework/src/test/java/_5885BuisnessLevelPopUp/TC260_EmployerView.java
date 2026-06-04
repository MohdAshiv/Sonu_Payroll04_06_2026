package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC260_EmployerView extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateP45EmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
        
       _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectForm(data[5]);
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
        email.selectEmailType(data[6]);
		email.clickCheckBoxAllP45();

		email.clickEmailBtnP45();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		verify.verifyCancelBtnFormEmailPopUp();
		email.clickEmailBtnP45();

		verify.verifyCloseBtnFormEmailPopUp();
		verify.asserAll();
	}	
	
	
	
	@Test(priority=2)

	public void TC02validateP45EmployeeEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
       _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectForm(data[5]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

        email.selectEmailType(data[7]);
		email.clickCheckBoxAllP45();

		email.clickEmailBtnP45();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtnFormEmailPopUp();
		email.clickEmailBtnP45();
		verify.verifyCloseBtnFormEmailPopUp();
		
		verify.asserAll();
	}	
	
	
	

	@Test(priority=3)

	public void TC03validateP60EmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
       _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectForm(data[8]);
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.clickCheckBoxAllP60();

        email.selectEmailType(data[6]);
		email.clickEmailBtnP60();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtnFormEmailPopUp();
		email.clickEmailBtnP60();

		verify.verifyCloseBtnFormEmailPopUp();
		
		verify.asserAll();
	}	
	
	
	

	@Test(priority=4)

	public void TC04validateP60EmployeeEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
       _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectForm(data[8]);
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.clickCheckBoxAllP60();

        email.selectEmailType(data[7]);
		email.clickEmailBtnP60();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtnFormEmailPopUp();
		email.clickEmailBtnP60();

		verify.verifyCloseBtnFormEmailPopUp();
		
		verify.asserAll();
	}	
	
	

	@Test(priority=5)

	public void TC05validateP11EmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
       _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectForm(data[9]);
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.selectTaxYear(data[12]);
		email.clickCheckBoxAllP11D();
        email.selectEmailType(data[6]);
		email.clickEmailBtnP11D();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtnFormEmailPopUp();
		email.clickEmailBtnP11D();

		verify.verifyCloseBtnFormEmailPopUp();
		
		verify.asserAll();
	}	
	
	
	@Test(priority=6)

	public void TC06validateP11EmployeeEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
	
        pages.reports report= new  pages.reports(driver);
        report.Click__Reports_();
        report.Click_P45Forms();
       _5530FileNamePage.FileNamePage file= new  _5530FileNamePage.FileNamePage(driver);
        
        file.selectForm(data[9]);
        
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
        email.selectEmailType(data[7]);
		email.selectTaxYear(data[12]);
		email.clickCheckBoxAllP11D();

		email.clickEmailBtnP11D();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCancelBtnFormEmailPopUp();
		email.clickEmailBtnP11D();

		verify.verifyCloseBtnFormEmailPopUp();
		
		verify.asserAll();
	}	
	
	
	@Test(priority=7)

	public void TC07validateEmployerViewP45EmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[5]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.selectEmailType(data[6]);
		email.clickCheckBoxAllP45();
		email.clickEmailBtnP45();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP45();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	
	@Test(priority=8)

	public void TC08validateEmployerViewP45EmployeeEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[5]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.selectEmailType(data[7]);
		email.clickCheckBoxAllP45();

		email.clickEmailBtnP45();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP45();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	
	@Test(priority=9)

	public void TC09validateEmployerViewP60EmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
		OpenClient.Enter_EnterClientName(data[10]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[8]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.selectEmailType(data[6]);
		email.clickCheckBoxAllP60();
		email.clickEmailBtnP60EmployerView();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP60EmployerView();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	
	@Test(priority=10)

	public void TC10validateEmployerViewP60EmployeeEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
		OpenClient.Enter_EnterClientName(data[10]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[8]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.selectEmailType(data[7]);
		email.clickCheckBoxAllP60();
		email.clickEmailBtnP60EmployerView();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP60EmployerView();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	

	@Test(priority=11)

	public void TC11validateEmployerViewP11DEmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
        pages.reports report= new  pages.reports(driver);
        
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[9]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.selectTaxYear(data[12]);
		email.clickCheckBoxAllP11D();
		email.selectEmailType(data[6]);
		email.clickEmailBtnP11D();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP11D();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	
	

	@Test(priority=12)

	public void TC12validateEmployerViewP11DEmployeeEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
        pages.reports report= new  pages.reports(driver);
        
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[9]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.selectTaxYear(data[12]);
		email.clickCheckBoxAllP11D();

		email.selectEmailType(data[7]);
		email.clickEmailBtnP11D();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP11D();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	
	@Test(priority=13)

	public void TC13validateEmployerViewIndividuaEPSEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
		OpenClient.Enter_EnterClientName(data[10]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_Individual_Employee_Pay_Scheduleclick();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		//payroll.SelectTaxYear(data[11]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.clickCheckBoxAllP60();
		email.selectEmailType(data[6]);
		email.clickEmailBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtn();
		
		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
		email.selectEmailType(data[7]);
		email.clickEmailBtn();
		
		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtn();
		
		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
        verify.asserAll();
	}
	
	
	
	
	@Test(priority=14)

	public void TC14validateEmployerViewPayslipEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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
		OpenClient.Enter_EnterClientName(data[10]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_Payslipsclick();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.SelectTaxYear(data[11]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.selectEmailType(data[6]);
		email.clickEmailPayslipBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailPayslipBtn();
		
		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
		email.selectEmailType(data[7]);
		email.clickEmailPayslipBtn();
		
		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailPayslipBtn();
		
		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
        verify.asserAll();
	}
	
	
	@Test(priority=15)

	public void TC15validateEmployerViewTaxPaymentEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
        
		report.clickTaxPayment1();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

	

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.clickEmailTaxBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailTaxBtn();
		
		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
	
        verify.asserAll();
	}
	
	
	@Test(priority=16)

	public void TC16validateEmployerViewEmployeeIndividuaEPSEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		
		employerView.Click__Reports_();
	
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_Individual_Employee_Pay_Scheduleclick();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.SelectTaxYear(data[12]);
	
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		email.clickEmailBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtn();
		
		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
		
        verify.asserAll();
	}
	
	
	
	@Test(priority=17)

	public void TC17validateEmployerViewEmployeeNameP60EmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.clickEmployee();
		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[8]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

	//	email.clickCheckBoxAllP60();
		email.clickEmailBtnP60EmployerView();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP60EmployerView();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	
	@Test(priority=18)

	public void TC18validateEmployerViewEmployeeP45EmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();
		
			
        pages.reports report= new  pages.reports(driver);
        
       
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[5]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);

		//email.clickCheckBoxAllP45();
		email.clickEmailBtnP45();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP45();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	

	@Test(priority=19)

	public void TC19validateEmployerViewEmployeeP11DEmailPopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.clickEmployee();
		employerView.Click__Reports_();
		
        pages.reports report= new  pages.reports(driver);
        
		report.Click_P45Forms();
		_5530FileNamePage.FileNamePage file = new _5530FileNamePage.FileNamePage(driver);

		file.selectEmployerViewForm(data[9]);

		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		email.selectTaxYear(data[12]);
		email.clickCheckBoxAllP11D();

		email.clickEmailBtnP11D();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCancelBtnEmployerViewFormEmailPopUp();
		email.clickEmailBtnP11D();

		verify.verifyCloseBtnEmployerViewFormEmailPopUp();
     
        verify.asserAll();
	}
	
	
	
//	@Test(priority=20)

	public void TC20validateEmployerViewPayDatePopUp() throws Exception {

		sTestCaseID = "TC260";
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

		_2154EmployeeOpeningBalance_Page.EmployerView employerView = new _2154EmployeeOpeningBalance_Page.EmployerView(driver);

		employerView.Click_EmployerView();

		employerView.clickEmployee();
		employerView.clickPayDate();
		
	
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify = new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);

		verify.verifyCloseBtnEmployerViewPayDatePopUp();
     
        verify.asserAll();
	}
}
