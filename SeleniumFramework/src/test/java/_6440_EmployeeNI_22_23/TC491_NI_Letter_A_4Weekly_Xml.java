package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC491_NI_Letter_A_4Weekly_Xml extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validateNITaxNetPayGross() throws Exception {

		sTestCaseID = "TC491";
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
//		OpenClient.Enter_EnterClientName(data[120]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
		
		
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
		company.Enter_NomismaStartDate(data[26]);
		
		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[21]);
		freq.Enter_FourWeeklyPayDate(data[26]);
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
		employee.enterJoiningDate(data[27]);

		employee.enterNICategory(data[5]);
		employee.enterTaxCode(data[6]);
		
		employee.selectStarterDeclaration(data[28]);
		employee.enableP45();
		employee.enterLeaveDateSalary(data[23]);
		employee.enterIncomeTax(data[24]);
		employee.enterP45LeavingDate(data[25]);
		
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[4]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();
	 pages.FilingManagement filling=  new pages.FilingManagement(driver);
			
		 
		 for(int i=0;i<=9;i++) {payroll.Run_Payroll();}
			 filling.Click_gotoFilingManagement();
			
			
			_6440_Page.VerifyData verify = new _6440_Page.VerifyData(driver);
			_6440_Page.fpsPage fps = new _6440_Page.fpsPage(driver);
			fps.clickWeek15Fps1();// week 16
			verify.getXMLData();
	    	verify.verifyXML1(data[75], data[76], data[77], data[78], data[79], data[80], data[81], data[82], data[83],data[84], data[85], data[86], data[87], data[88]);

			fps.clickWeek52Fps();
			verify.getXMLData();
			verify.verifyXML1(data[89], data[90], data[91], data[92], data[93], data[94], data[95], data[96], data[97],
					data[98], data[99], data[100], data[101], data[102]);
			payroll.scrollClickPayrollDashboard();

			pages.reports report = new pages.reports(driver);

			report.Click__Reports_();
			report.Click_P45Forms();
			report.Select_SelectP45Form(data[109]);
			_5630OffPayrollWorkerPage.OffPayWorkerPage pdf = new _5630OffPayrollWorkerPage.OffPayWorkerPage(driver);
			pdf.clickP60PdfIcn();
			verify.verifyP60OffPayWorker2(data[110], data[111], data[112], data[113], data[114], data[115],data[116],data[117],data[118],data[119]);

			verify.assertAll();
	
}	
	
}
