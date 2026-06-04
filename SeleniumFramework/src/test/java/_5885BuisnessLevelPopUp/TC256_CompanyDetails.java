package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC256_CompanyDetails extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	//@Test(priority=1)

	public void validateLinkedwithAccount() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.clickLinkedwithAccountBtn();
	  
	    
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelLinkedWithAccount();
		 company.clickLinkedwithAccountBtn();

		 verify.verifyCloseBtnLinkedWithAccount();
		
		 verify.asserAll();
	}		
	
	
	

	@Test(priority=2)

	public void validateDepartmentPopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickDepartments();
	    company.clickDepartment();
	  
	    
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		 verify.verifyCancelDepartment();
		 company.clickDepartment();
		 verify.verifyCloseBtnDepartment();
		
		 verify.asserAll();
	}		
	
	
	

	//@Test(priority=3)

	public void validateViewAllPopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickDepartments();
	    _5885BuisnessLevelPopUP_Page.BuisnessPage companypage= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

	    companypage.clickViewAll();
	  
	    
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		
		 verify.verifyCloseBtnDepartmentList();
		
		 verify.asserAll();
	}		
	
	


	@Test(priority=4)

	public void validateEditDepartmentListPopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickDepartments();
	    _5885BuisnessLevelPopUP_Page.BuisnessPage companypage= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

	  
	  
	    companypage.clickEditDepatmentList();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		
		verify.verifyCloseBtnEditDepartmentList();
		

		companypage.clickEditDepatmentList();

		verify.verifyCancelBtnEditDepartmentList();

		 verify.asserAll();
	}	
	
	
	@Test(priority=5)

	public void validateDeletDepartmentListPopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickDepartments();
	    _5885BuisnessLevelPopUP_Page.BuisnessPage companypage= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

	  
		companypage.clickDelettDepatmentList();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		
		verify.verifyCloseBtnEditDepartmentList();
		

		companypage.clickDelettDepatmentList();

		verify.verifyCancelBtnEditDepartmentList();

		 verify.asserAll();
	}	
	
	
	@Test(priority=6)

	public void validateClosePayeSchemPopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();

	    company.clickClosePayeScheme();
	  
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		
		verify.verifyCancelBtnClosePayeScheme();
		
		 company.clickClosePayeScheme();

		 verify.verifyCloseBtnClosePayeSchem();

		 verify.asserAll();
	}	
	
	@Test(priority=7)

	public void validateRegisterdCISPopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();

	    company.clickRegisterdCis();
	  
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		
		 verify.verifyCancelBtnRegisterdCis();
		
		 company.clickRegisterdCis();

		 verify.verifyCloseBtnRegisterdCis();

		 verify.asserAll();
	}	
	
	
	
	@Test(priority=8)

	public void validateRegisterdCISCreatePopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();

	    company.clickRegisterdCis();
	  
	    _5885BuisnessLevelPopUP_Page.BuisnessPage companypage= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

	    companypage.clickCreateBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		
		 verify.verifyCancelBtnRegisterdCisCreate();
		
		 companypage.clickCreateBtn();

		 verify.verifyCloseBtnRegisterdCisCreate();

		 verify.asserAll();
	}	
	
	

	@Test(priority=9)

	public void validateRegisterdCISLinkPopUp() throws Exception {

		sTestCaseID = "TC256";
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
	
		  
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();

	    company.clickRegisterdCis();
	  
	    _5885BuisnessLevelPopUP_Page.BuisnessPage companypage= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);

	    companypage.clickLinkBtn();
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		
		 verify.verifyCancelBtnRegisterdCisLink();
		
		 companypage.clickLinkBtn();

		 verify.verifyCloseBtnRegisterdCisLink();

		 verify.asserAll();
	}	
	
	
	

}
