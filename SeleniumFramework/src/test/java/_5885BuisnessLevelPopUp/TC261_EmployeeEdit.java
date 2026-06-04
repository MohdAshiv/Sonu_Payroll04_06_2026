package _5885BuisnessLevelPopUp;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC261_EmployeeEdit extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateEmployerEmailPopUp() throws Exception {

		sTestCaseID = "TC261";
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
	    pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickOffPayWorker();
	
		_5885BuisnessLevelPopUP_Page.PopUpCancelBtn verify=new _5885BuisnessLevelPopUP_Page.PopUpCancelBtn(driver);
		
		verify.verifyCloseBtnOffPayrollPopUp();
		
		verify.asserAll();
	}		
}
