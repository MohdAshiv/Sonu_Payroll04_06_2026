package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC005_4729LinkedwithAccount extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateLinkedWithAccount() throws Exception {

		sTestCaseID = "TC005";
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
	
	    pages.reports report= new   pages.reports(driver);
	    
	    ProductionIssuePage.ProductionPage page=   new ProductionIssuePage.ProductionPage(driver);
	   
	    pages.EditCompany company= new pages.EditCompany(driver);

	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.clickLinkedwithAccountBtn();
	    company.saveLinkedWithBtn();
	    page.verifyAccountOffice(data[5]);
   	    utilities.TakeScreenshot.Getscreenshot("TC005_ validateLinkedWithAccount ", "Production", driver);

	    page.assertAll();
	    
    
}
}
