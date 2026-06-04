package _2154EmployeeOpeningBalance_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC145_OpeningBalance_XML extends TestBase {

	public String sTestCaseID = null;
	String Sheet = null;
	String[] data = null;

	@Test(priority = 1)
	public void validateTaxPayment() throws Exception {

		sTestCaseID = "TC145";
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
		
		pages.EmployeeEditAndRateChanges employee= new 	pages.EmployeeEditAndRateChanges(driver);
		employee.clickEmployeeName();
        pages.OpeningBalanceEntry openingBalance= new pages.OpeningBalanceEntry(driver);
		
		openingBalance.Click_gotoOpeningBalances();
		openingBalance.Enter_EnterTaxCode(data[15]);
		openingBalance.Enter_EnterGrosspay(data[16]);
		
		openingBalance.Enter_EnterELtoPT(data[17]);
		openingBalance.Enter_TaxDeducted(data[18]);
		
		
		openingBalance.Enter_LEL(data[19]);
	
		openingBalance.Click_clickSave();

	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
	    
	    payroll.Run_Payroll();
		
        pages.reports report= new pages.reports(driver);
		 
		 report.clickTaxPayment();
		 
	    _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver); 

         verify.taxPayement2(data[5], data[6], data[7], data[8]);
   	    utilities.TakeScreenshot.Getscreenshot("TC145_ Verify TaxPayment ", "2154", driver);

         verify.assertAll();
}
	
	@Test(priority = 2)

	public void validateXmlSep() throws Exception {

		sTestCaseID = "TC145";
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
	   
		_2154EmployeeOpeningBalance_Page.FillingManagement xml=new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
		
		xml.Click_gotoFilingManagement();
		xml.clickFPS2();
		xml.getXMLData1();
		xml.verifyXML(data[10], data[11],data[10], data[12], data[13], data[14]);
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

	    payroll.Click_PayrollDashboard();
	    payroll.Undo_LastPayroll();
		
  	    xml.assertAll();
  
}
	
}
