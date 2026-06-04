package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC003_5455CancelBtn extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test
	public void validateGrossEarningYTDFromFPS() throws Exception {

		sTestCaseID = "TC003";
		Sheet = "Sheet7";
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
		
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    
	  
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
		page.clickPension();
		page.clickAddScheam();
		page.verifyCancelBtn();
        page.clickViewSchem();
        page.clickEditPension();
        page.verifyCancelBtnFromEditBtn();
        page.clickDeletPension();
        page.verifyCancelBtnFromDeletBtn();
        page.clickAddScheam1();
        page.verifyCancelBtnFromAddScheamBtn();
        
       
		page.assertAll();
}	
	
}
