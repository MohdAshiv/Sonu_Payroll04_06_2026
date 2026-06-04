package _2154EmployeeOpeningBalance_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC143_OpeningBalance_EmployeeEmployer extends TestBase {

	
	public String sTestCaseID = null;
	String Sheet = null;
	String[] data = null;

	@Test(priority = 1)

	public void validateTaxPayment() throws Exception {

		sTestCaseID = "TC143";
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
		
        pages.reports report= new pages.reports(driver);
		 
		 report.clickTaxPayment();
		 
	    _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver); 

         verify.taxPayement2(data[5], data[6], data[7], data[8]);
   	    utilities.TakeScreenshot.Getscreenshot("TC143_ Verify TaxPayment ", "2154", driver);

         verify.assertAll();
}
	
	@Test(priority = 2)

	public void validateP11() throws Exception {

		sTestCaseID = "TC143";
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
		
        pages.reports report= new pages.reports(driver);
		 
		report.Click__Reports_();
		report.Click_P11();
		 
	    _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver); 

         verify.verifyP11(data[9], data[10], data[11], data[12], data[13]);
  	    utilities.TakeScreenshot.Getscreenshot("TC143_ Verify P11 ", "2154", driver);

}
	
	@Test(priority = 3)

	public void validateEmployerIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC143";
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
		
		
		_2154EmployeeOpeningBalance_Page.EmployerView employerView=new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		
		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
        pages.reports report= new pages.reports(driver);
		 
		
		report.Click_Individual_Employee_Pay_Scheduleclick();
		 
	    _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver); 
        verify.individualEmployeePaySchedule(data[15], data[7], data[13], data[14], data[6]);
  	    utilities.TakeScreenshot.Getscreenshot("TC143_ Verify Individual EmployeePay Schedule_Employer", "2154", driver);
  	     verify.assertAll();
}
	

	@Test(priority = 4)

	public void validateEmployeeIndividualEmployeePaySchedule() throws Exception {

		sTestCaseID = "TC143";
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
		
		
		_2154EmployeeOpeningBalance_Page.EmployerView employerView=new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		
		employerView.Click_EmployerView();
		employerView.clickEmployee();
		employerView.Click__Reports_();
        pages.reports report= new pages.reports(driver);
		 
		
		report.Click_Individual_Employee_Pay_Scheduleclick();
		 
	    _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver); 
        verify.individualEmployeePaySchedule(data[15], data[7], data[13], data[14], data[6]);
  	    utilities.TakeScreenshot.Getscreenshot("TC143_ Verify Individual EmployeePay Schedule_Employee ", "2154", driver);

}
	
	@Test(priority = 5)

	public void validateOpeningBalanceTaxPayment() throws Exception {

		sTestCaseID = "TC143";
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
		
		
		_2154EmployeeOpeningBalance_Page.EmployerView employerView=new _2154EmployeeOpeningBalance_Page.EmployerView(driver);
		
		employerView.Click_EmployerView();
		
		employerView.Click__Reports_();
		
		employerView.clickTaxPayment();
		
        pages.reports report= new pages.reports(driver);
		 
		 
	    _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver); 
	     verify.taxPayement1(data[5], data[6], data[7], data[8]);
	    
  	    utilities.TakeScreenshot.Getscreenshot("TC143_ Verify Taxpayment_ER_View", "2154", driver);
  	    verify.assertAll(); 
}
	
	
}
