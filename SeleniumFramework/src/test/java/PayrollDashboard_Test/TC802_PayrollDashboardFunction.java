package PayrollDashboard_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC802_PayrollDashboardFunction extends TestBase{
	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority = 1)
	public void TC01validateEmployeeNameInAlphabeticOrder() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);
		verify.checkEmployeeNaemAlphabeticalOrder();

		verify.assertAll();
	}	
	
	
	@Test(priority = 2)
	public void TC02validatePagination() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.paginationPayrollDashBoard();
		verify.assertAll();
	}	
	

	@Test(priority = 3)
	public void TC03validatePaginationOnRunPayrollPage() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

		payroll.runPayroll();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.paginatiOnRunPayrollPage();
		verify.assertAll();
	}	
	
	
	@Test(priority = 4)
	public void TC04validatePayrollStatusDashboardToAgent_NotStarted() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

      	pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		//dashboard.payrollStatusClick();
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyPayrollStatusDashboard(data[8]);
		
		

		utilities.ChangeWindow.Switchwindow(1, driver);
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 	//	agentpage.clickSubmitRtiBtn();
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
		verify.verifyPayrollStatusAgentRunPayroll(data[8]);

 		
		verify.assertAll();
	}	
	
	
	@Test(priority = 5)
	public void TC05validatePayrollStatusDashboardToAgent_InProgress() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

      	pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClick();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[9]);
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyPayrollStatusDashboard(data[9]);
		

		utilities.ChangeWindow.Switchwindow(1, driver);        
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 	//	agentpage.clickSubmitRtiBtn();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
		verify.verifyPayrollStatusAgentRunPayroll(data[9]);

 		
		verify.assertAll();
	}	
	
	

	@Test(priority = 6)
	public void TC06validatePayrollStatusDashboardToAgent_OnHold() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

      	pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClick();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[10]);
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyPayrollStatusDashboard(data[10]);
		

		utilities.ChangeWindow.Switchwindow(1, driver);        
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
		verify.verifyPayrollStatusAgentRunPayroll(data[10]);

 		
		verify.assertAll();
	}	
	
	

	@Test(priority = 7)
	public void TC07validatePayrollStatusDashboardToAgent_QueryRecieved() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

      	pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClick();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[11]);
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyPayrollStatusDashboard(data[11]);
		

		utilities.ChangeWindow.Switchwindow(1, driver);        
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
		verify.verifyPayrollStatusAgentRunPayroll(data[11]);
 		
		verify.assertAll();
	}	
	
	

	@Test(priority = 8)
	public void TC08validatePayrollStatusDashboardToAgent_AwaitingApproval() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

      	pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClick();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[12]);
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyPayrollStatusDashboard(data[12]);
		

		utilities.ChangeWindow.Switchwindow(1, driver);        
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
		verify.verifyPayrollStatusAgentRunPayroll(data[12]);
 		
		verify.assertAll();
	}	
	
	
	@Test(priority = 9)
	public void TC09validatePayrollStatusDashboardToAgent_Approved() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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

      	pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClick();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[13]);
		PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

		verify.verifyPayrollStatusDashboard(data[13]);
		
		utilities.ChangeWindow.Switchwindow(1, driver);        
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
		verify.verifyPayrollStatusAgentRunPayroll(data[13]);
 		
		verify.assertAll();
	}	
	
	
	
	@Test(priority = 10)
	public void TC10validatePayrollStatusAgentToDashboard_NotStarted() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
	   pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClickAgent();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[8]);

		verify.verifyPayrollStatusAgentRunPayroll(data[8]);
		

		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
      
		verify.verifyPayrollStatusDashboard(data[8]);

		verify.assertAll();
	}	
	
	

	@Test(priority = 11)
	public void TC11validatePayrollStatusAgentToDashboard_InProgress() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
	   pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClickAgent();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[9]);

		verify.verifyPayrollStatusAgentRunPayroll(data[9]);
		

		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
      
		verify.verifyPayrollStatusDashboard(data[9]);

		verify.assertAll();
	}	
	
	
	
	@Test(priority = 12)
	public void TC12validatePayrollStatusAgentToDashboard_OnHold() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
	   pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClickAgent();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[10]);

		verify.verifyPayrollStatusAgentRunPayroll(data[10]);
		

		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
      
		verify.verifyPayrollStatusDashboard(data[10]);

		verify.assertAll();
	}	
	
	
	@Test(priority = 13)
	public void TC13validatePayrollStatusAgentToDashboard_QueryRecieved() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
	   pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClickAgent();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[11]);

		verify.verifyPayrollStatusAgentRunPayroll(data[11]);
		

		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
      
		verify.verifyPayrollStatusDashboard(data[11]);

		verify.assertAll();
	}	
	
	
	@Test(priority = 14)
	public void TC14validatePayrollStatusAgentToDashboard_AwaitingApproval() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
	   pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClickAgent();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[12]);

		verify.verifyPayrollStatusAgentRunPayroll(data[12]);
		

		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
      
		verify.verifyPayrollStatusDashboard(data[12]);

		verify.assertAll();
	}	
	
	
	@Test(priority = 15)
	public void TC15validatePayrollStatusAgentToDashboard_Approved() throws Exception {

		sTestCaseID = "TC802";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
	   PayrollDashboardPage.VerifyData verify= new PayrollDashboardPage.VerifyData(driver);

 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
	   pages.DashboardPage dashboard= new pages.DashboardPage(driver);
		
		dashboard.payrollStatusClickAgent();
		dashboard.selectPayrollStatusAndClickOnSaveBtn(data[13]);

		verify.verifyPayrollStatusAgentRunPayroll(data[13]);

		pages.OpenClient OpenClient = new pages.OpenClient(driver);

		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
      
		verify.verifyPayrollStatusDashboard(data[13]);
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
		payroll.Run_Payroll();

		verify.verifyPayrollStatusDashboard(data[8]);
		
		utilities.ChangeWindow.Switchwindow(1, driver);        
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 		
 		agentpage.enterCompanyName1(data[4]);
 		agentpage.updateName1();
 		
		verify.verifyPayrollStatusAgentRunPayroll(data[8]);

		verify.assertAll();
	}
	
	
}
