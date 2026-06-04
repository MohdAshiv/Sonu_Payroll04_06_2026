package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC017_12266_CIS_StatusFailed extends TestBase{
	
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	
	@Test(priority = 1)
	public void TC03validateAddNoteFromPdf() throws Exception {

		sTestCaseID = "TC017";
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

		
		_2044CIS_Submt.CISDashboard CisDashboard = new _2044CIS_Submt.CISDashboard(driver);

	    CisDashboard.Click_clickCIS();
	    
	    CisDashboard.clickCisFailedReport();
	    CisDashboard.clickCisFailedStatus();

	
		ProductionIssuePage.VerifyResult verify = new ProductionIssuePage.VerifyResult(driver);
		verify.verifyFailledStatusPopup(data[5]);

		verify.assertAll();
	}



}
