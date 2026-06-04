package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC014_13099_SearchResult extends TestBase {
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	
	@Test(priority = 1)
	public void TC01validateSearchEmployee() throws Exception {

		sTestCaseID = "TC014";
		Sheet = "Sheet7";
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


	   ProductionIssuePage.ProductionPage page=   new ProductionIssuePage.ProductionPage(driver);
	   page.enterEmployeeAndSearchBtn(data[5]);
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyEmployeeName(data[6]);
		verify.assertAll();
         
	}

}
