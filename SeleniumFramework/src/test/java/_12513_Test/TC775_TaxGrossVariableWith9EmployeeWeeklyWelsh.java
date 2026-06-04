package _12513_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC775_TaxGrossVariableWith9EmployeeWeeklyWelsh extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	@Test(priority=1)

	public void validateTaxCalculation() throws Exception {

		sTestCaseID = "TC775";
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
	
	    		
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);
	   
	    verify.verifyTaxDashBoard(data[19], data[20], data[21], data[22], data[23], data[24], data[25], data[26], data[27], data[28], data[29],data[30]);

        verify.assertAll();
	
}
}
