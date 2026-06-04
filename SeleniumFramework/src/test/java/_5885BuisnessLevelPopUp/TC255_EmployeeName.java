package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC255_EmployeeName extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOpeningBalance() throws Exception {

		sTestCaseID = "TC255";
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
	
		pages.EmployeePage employee= new pages.EmployeePage(driver);
		employee.Click_clickonEmpName();
	
	    pages.OpeningBalanceEntry openingBalance= new   pages.OpeningBalanceEntry(driver);
	    openingBalance.Click_gotoOpeningBalances();
	   
		 
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelBtnOpeningBalance();
		
		 openingBalance.Click_gotoOpeningBalances();

		 verify.verifyCloseBtnOpeningBalance();
		
		 verify.asserAll();
	}		
	
	
	

	@Test(priority=2)

	public void validatePayDatePopUp() throws Exception {

		sTestCaseID = "TC255";
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
	
		pages.EmployeePage employee= new pages.EmployeePage(driver);
		employee.Click_clickonEmpName();
	
	  
	    _5885BuisnessLevelPopUP_Page.BuisnessPage dashboard= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		 dashboard.clickPayDate();
		 
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCloseBtnPayDate();
		
		 verify.asserAll();
	}		
	
	
	
	
	@Test(priority=3)

	public void validateAddLeavePopUp() throws Exception {

		sTestCaseID = "TC255";
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
	
		
	  
		pages.LeaveManagement leave= new pages.LeaveManagement (driver);
		
		leave.clickLeaveManagement();
		leave.clickApprovedLeaves();
		
	    _5885BuisnessLevelPopUP_Page.BuisnessPage dashboard= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		 //dashboard.clickLeaveManagement();
		 dashboard.clickAddLeaveReport();
		// dashboard.clickEmployeeName();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelBtnLeaveReport();
		// dashboard.clickEmployeeName();

	//	 verify.verifyCloseBtnLeaveReport();

		 verify.asserAll();
	}	
}


