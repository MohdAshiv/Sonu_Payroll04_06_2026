package PaymentManagement;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.verifyClosePayeErrorMessageOOPS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3e091eeb-65e5-4077-81b6-7752729c278c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1411, profileId = 101275)
public class T115TC03_PM_weekly3 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
        
    	sTestCaseID="TC115";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    
    
    verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
//  TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
//  _verifyClosePayeErrorMessage.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
//  _verifyClosePayeErrorMessage.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
  _verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
  

  TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
  _verifyClosePayeErrorMessageOOPS.Click_gotoEditCompany();
  

  TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
  _verifyClosePayeErrorMessageOOPS.Click_gotoPayrollDetails();
  
  
  PaymentMmgt.PaymentMmgt _PaymentMmgt = new PaymentMmgt.PaymentMmgt(driver);
//  TestModellerLogger.SetLastNodeGuid("ef7cf453-0267-47db-8388-a31200eaa772");
//  _PaymentMmgt.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("19e695c6-8a6b-4c2e-b79d-8449a407f239");
//  _PaymentMmgt.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("7e5cbc6f-c4b2-470c-b459-816f3042236e");
  _PaymentMmgt.Click_clickPayrollSettings();
  

  TestModellerLogger.SetLastNodeGuid("2f5590f7-e106-4057-8440-b5c6996e6e06");
  _PaymentMmgt.Click_clickCompanyDetails1();
  

//  TestModellerLogger.SetLastNodeGuid("32dc191c-633b-4a08-ad95-6ec15efe8800");
//  _PaymentMmgt.Click_MarkYestoPaymentMmgt();
//  
//
//  TestModellerLogger.SetLastNodeGuid("80af7c8d-d174-4330-ae3d-d09047f3fdc2");
//  _PaymentMmgt.Click_clickSave();
//  

//  TestModellerLogger.SetLastNodeGuid("fb1cd1d6-71fb-45a6-91fb-8aec8d6c71de");
//  _PaymentMmgt.Click_getmsg();
//  
  
  
	PaymentMmgt.TS01PM _TS01PM = new PaymentMmgt.TS01PM(driver);
//TestModellerLogger.SetLastNodeGuid("d6d004e4-1417-40dc-aba3-056fb84b8e69");
//_TS01PM.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("fc3445c6-a772-4046-b777-f30c19bb19d5");
//_TS01PM.AssertUrl();


//	TestModellerLogger.SetLastNodeGuid("d67589ad-f985-42a3-b4a3-dc7a1ec922d5");
//	_TS01PM.Click_gotoPayrollDashboard();
	
	
	  
    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _TS01PM.Click_gotoPayrollDashboard1();
    
    
//	  TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
//	  _TS01PM.Click_ClickRunPayroll1();
//	    
//
//	    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
//	    _TS01PM.Click_ClickRunPayroll2();


	TestModellerLogger.SetLastNodeGuid("6bc30cff-7ed9-479d-bcc7-bcde3ebc4150");
	_TS01PM.Click_gotoTaxPayment1();


//	TestModellerLogger.SetLastNodeGuid("6adcd45c-fb9a-4c6b-ab14-5666bdbf791e");
//	_TS01PM.Click_clickHMRCPaymentsMade();
//
//
//	TestModellerLogger.SetLastNodeGuid("a0d5d3ee-2265-4bf6-ba4e-1f66b54c567a");
//	_TS01PM.Enter_EnterNICActualPaidAmount(data[5]);
//
//
//	TestModellerLogger.SetLastNodeGuid("9677af39-4612-49c5-94fa-22b8765eea53");
//	_TS01PM.Click_clickSave();

	
  
  
	    

//	TestModellerLogger.SetLastNodeGuid("fa18d375-2bbe-487c-9082-276254a642f8");
//	_TS01PM.Click_gotoFilingManagement();


//	TestModellerLogger.SetLastNodeGuid("6dbfa148-da7a-4409-bebb-32ba6c5c205c");
//	_TS01PM.Click_gotoReports();
//
//
//	TestModellerLogger.SetLastNodeGuid("11a15c7a-7be7-432b-baa2-2d98c54ab3ee");
//	_TS01PM.Click_clickPayrollSummary();
//
//
//	TestModellerLogger.SetLastNodeGuid("ebae7f9e-46b0-46c3-8685-5eeea8bb5d62");
//	_TS01PM.Click_getPaymentoftheMonth();
//
//
//	TestModellerLogger.SetLastNodeGuid("f55774c5-f633-4d69-ab9a-0b7fbe8c41f2");
//	_TS01PM.Click_getPayeDuetoHMRC();
//
//
//	TestModellerLogger.SetLastNodeGuid("ac25526b-82f3-476e-bf5e-499c212c792b");
//	_TS01PM.Click_getCF();
//
//
//	TestModellerLogger.SetLastNodeGuid("b272c10b-0df2-4dce-86b5-68ee1efeae5a");
//	_TS01PM.Click_getBalBF();
//
//
//	TestModellerLogger.SetLastNodeGuid("0941f51f-1bcd-4f48-b7cf-49c1354a6629");
//	_TS01PM.Click_getTax();
//
//
//	TestModellerLogger.SetLastNodeGuid("52b0313c-80b8-47fc-b55b-709a4b3d872b");
//	_TS01PM.Click_getEE_NI();
//
//
//	TestModellerLogger.SetLastNodeGuid("67c6520f-bd95-4fbc-9405-7cb6e72d19f1");
//	_TS01PM.Click_getER_NI();
//  
  
  


    }

}
