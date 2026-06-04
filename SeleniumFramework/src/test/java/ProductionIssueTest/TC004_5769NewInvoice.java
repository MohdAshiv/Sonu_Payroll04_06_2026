package ProductionIssueTest;

import org.testng.annotations.Test;

import _2052CISRpt_SubConcList.SubContractorList;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import tests.TestBase;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

public class TC004_5769NewInvoice extends TestBase{

	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null;

		    
		@Test
		public void validateNewInvoicePage()
				throws Exception {

			sTestCaseID = "TC004";
			Sheet = "Sheet7";
			data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

			pages.loginpage _loginpage = new pages.loginpage(driver);

			_loginpage.GoToUrl();

			_loginpage.AssertUrl();

			_loginpage.Enter_EnterUsername(data[1]);

			_loginpage.Enter_Enterpassword(data[2]);

			_loginpage.Click_LoginButton();

			pages.agentpage _agentpage = new pages.agentpage(driver);

			_agentpage.Enter_SearchAgentName(data[3]);

			_agentpage.Click_ClickSearch();

			_agentpage.Click_ClickAgent();

			_2047CISRpt_Pymtanddeduc.AddCISContrctor _CISContrctorSrch = new _2047CISRpt_Pymtanddeduc.AddCISContrctor(driver);

			_CISContrctorSrch.Click_clickCIS();

			_CISContrctorSrch.Click_clickContractorList();

			_CISContrctorSrch.Click_ContractorName1();
			

			ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);

			page.clickNewBtn();
			page.verifyNewInvoicePage();
	   	    utilities.TakeScreenshot.Getscreenshot("TC004_ validateNewInvoicePage ", "Production", driver);

			page.assertAll();

		}

}
