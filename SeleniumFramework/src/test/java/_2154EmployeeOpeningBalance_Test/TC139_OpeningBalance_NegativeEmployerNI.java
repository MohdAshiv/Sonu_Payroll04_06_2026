package _2154EmployeeOpeningBalance_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC139_OpeningBalance_NegativeEmployerNI  extends TestBase{

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateNegativeEmployerNI() throws Exception {

		sTestCaseID = "TC139";
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
		
		openingBalance.Enter_EnterTaxCode(data[5]);
		openingBalance.Enter_EnterGrosspay(data[6]);
		openingBalance.Enter_EnterEmployeeNI(data[7]);
		
		openingBalance.Enter_EmployerNI(data[8]);
		
		openingBalance.Click_clickSave();
		
       _2154EmployeeOpeningBalance_Page.VerifyData verify= new _2154EmployeeOpeningBalance_Page.VerifyData(driver); 
		verify.NegativeEmployeeNI(data[9]);
		verify.NegativeEmployeeNI(data[9]);
	  utilities.TakeScreenshot.Getscreenshot("TC139_ Validation_EE_ER NI ", "2154", driver);

}
	
}
