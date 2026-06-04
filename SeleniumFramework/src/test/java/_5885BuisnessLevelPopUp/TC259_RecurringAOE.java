package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC259_RecurringAOE extends TestBase {

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateAoeChildSupportDeductionPopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[5]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[5]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}		
	
	
	
	
	@Test(priority=2)

	public void TC02validateAoeCouncilTaxAttachementPopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[6]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[6]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}		
	
	

	@Test(priority=3)

	public void Tc03validateAoeDirectEarningsAttachmentHigherRatePopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[7]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[7]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}		
	
	

	@Test(priority=4)

	public void TC04validateAoeDirectEarningsAttachmentStanderdRatePopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[8]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[8]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}		
	
	
	@Test(priority=5)

	public void TC05validateAoeEarningsArrestmentPopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[9]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[9]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}		
	
	
	@Test(priority=6)

	public void TC06validateAoeMagistratesCourtAttachmentPopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[10]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[10]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}		
	
	

	@Test(priority=7)

	public void TC07validateAoeMaintainsAttachmentofEarningsOrdertPopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[11]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[11]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}	
	
	
	@Test(priority=8)

	public void TC08validateAoeOtherAttachmentOrderPopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[12]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[12]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}	
	
	

	@Test(priority=9)

	public void TC09validateAoeAttachmentofEarningsOrderPopUp() throws Exception {

		sTestCaseID = "TC259";
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
	
		pages.EmployeePage recucrring= new 	pages.EmployeePage (driver);
		
		recucrring.Click_clickonEmpName();
		
		recucrring.Click_ViewAditionDeduction();
		
		recucrring.clickAoe();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[13]);
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
	
		verify.verifyCancelBtnAoePopUp();
		recucrring.clickAddMoreElem();
		recucrring.selectAoeType(data[13]);
		verify.verifyCloseBtnAoePopUp();
		
		verify.asserAll();
	}		
}
