package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC006_5676UTR  extends TestBase{

	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null;

		    
		@Test(priority = 1)
		public void validateUTR_BVA()throws Exception {

			sTestCaseID = "TC006";
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

			_1744CISDSB.NewContractor contractor=new _1744CISDSB.NewContractor (driver);
			contractor.Click__New_Contractor();

			contractor.Enter_UtrNo(data[4]);
			
			
			ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
             page.verifyUTR(data[5]);
       
        	 utilities.TakeScreenshot.Getscreenshot("TC006_ validateUTR_BVA ", "Production", driver);

             page.assertAll();
		}

		
		
	    
			@Test (priority=2)
			public void validateAlertMessege()throws Exception {

				sTestCaseID = "TC006";
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
				_CISContrctorSrch.click3Dots();
				_CISContrctorSrch.clickEditBtn();
				_1744CISDSB.NewContractor contractor=new _1744CISDSB.NewContractor (driver);
				
			     contractor.Enter_UtrNo1(data[6]);
				
				ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	          
	             contractor.Click_Submit1();
	            
	             page.verifyAlertMsg(data[7]);
	        	 utilities.TakeScreenshot.Getscreenshot("TC006_ validateAlertMessege ", "Production", driver);

	             page.assertAll();
			}

			
			@Test(priority = 3)
			public void validateUTR_BVA_FromSubContractor()throws Exception {

				sTestCaseID = "TC006";
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
				_CISContrctorSrch.click3Dots();
				_CISContrctorSrch.clickSubContractor();
				_1744CISDSB.NewContractor contractor=new _1744CISDSB.NewContractor (driver);
				
				contractor.subContractorUTR(data[4]);
				
				ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	             page.verifySubContractorUTR(data[5]);
	        	 utilities.TakeScreenshot.Getscreenshot("TC006_ validateUTR_BVA_FromSubContractor ", "Production", driver);

	             page.assertAll();
			}
		
			
			@Test(priority = 4)
			public void validateUTR_Alert__FromSubContractor()throws Exception {

				sTestCaseID = "TC006";
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
				_CISContrctorSrch.click3Dots();
				_CISContrctorSrch.clickSubContractor();
				_1744CISDSB.NewContractor contractor=new _1744CISDSB.NewContractor (driver);
				
				contractor.subContractorUTR(data[6]);
				
				ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
				contractor.clickSubContractorSumbmit();
	             page.verifysubContractorAlertMsg(data[7]);
	        	 utilities.TakeScreenshot.Getscreenshot("TC006_ validateUTR_Alert__FromSubContractor ", "Production", driver);

	             page.assertAll();
			}
		
	
}
