package _1912;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/218981cc-eed2-4910-a98a-127acbbca7b7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1776, profileId = 102222)
public class TC353_355_1912DirSalNotFixed extends TestBase
{
    

    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority = 1,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickcl() throws Exception
    {
    	
    	
    	sTestCaseID="TC353";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage3B _loginpage = new pages.loginpage3B(driver);
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
        
	_1912page.verifyEarningLimits3rdEmp __1930page = new _1912page.verifyEarningLimits3rdEmp(driver);
////    TestModellerLogger.SetLastNodeGuid("dc3728a4-cc99-4060-9418-3e31311dcc66");
////    __1930page.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("44945d34-0415-4631-8850-9f7511ea4a12");
////    __1930page.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4e535917-7ca3-408d-a6b8-8c04621e4956");
//    __1930page.Click_gotoReports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cf92077e-4d58-4222-a8f5-a6685570717e");
//    __1930page.Click_P11();
//    
//    
//    
//    TestModellerLogger.SetLastNodeGuid("a11f860b-7ae0-4ffc-91d2-f21eb4560cd7");
//    __1930page.Select_selectTaxYears(data[5]);
//    
//    
//    TestModellerLogger.SetLastNodeGuid("cf92077e-4d58-4222-a8f5-a6685570717e");
//    __1930page.SelectEmp(data[6]);
//    
//    
//
//    TestModellerLogger.SetLastNodeGuid("783e3e9e-ff28-48a6-b7f5-6837578dc189");
//    __1930page.getEarningsP11();
//    
//
////    TestModellerLogger.SetLastNodeGuid("c7802579-a1ba-4119-a4d5-1f69dc9ab163");
////    __1930page.Click_getPT();
////    
////
////    TestModellerLogger.SetLastNodeGuid("519a577b-8ba6-4ca5-8f36-296804395579");
////    __1930page.Click_getUEL();
//    

    TestModellerLogger.SetLastNodeGuid("761d0e63-632c-4451-ad43-724ae26763c8");
    __1930page.Click_gotoFiling_Management();
    

    TestModellerLogger.SetLastNodeGuid("a11f860b-7ae0-4ffc-91d2-f21eb4560cd7");
    __1930page.Select_selectTaxYears(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b3618d93-5963-44dd-9a03-9139881bb97b");
    __1930page.ClickFPS();
    
    
    TestModellerLogger.SetLastNodeGuid("c7802579-a1ba-4119-a4d5-1f69dc9ab163");
    __1930page.Enter_getXMLData();
    

    TestModellerLogger.SetLastNodeGuid("519a577b-8ba6-4ca5-8f36-296804395579");
    __1930page.checkLEL();
    

    }
    
    
  

    
    @Test  (priority = 2,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickc2() throws Exception
    {
    	
    	
    	sTestCaseID="TC354";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage3B _loginpage = new pages.loginpage3B(driver);
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
        
	_1912page.verifyEarningLimits3rdEmp __1930page = new _1912page.verifyEarningLimits3rdEmp(driver);
//    TestModellerLogger.SetLastNodeGuid("dc3728a4-cc99-4060-9418-3e31311dcc66");
//    __1930page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("44945d34-0415-4631-8850-9f7511ea4a12");
//    __1930page.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("4e535917-7ca3-408d-a6b8-8c04621e4956");
//    __1930page.Click_gotoReports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cf92077e-4d58-4222-a8f5-a6685570717e");
//    __1930page.Click_P11();
//    
//    
//    TestModellerLogger.SetLastNodeGuid("a11f860b-7ae0-4ffc-91d2-f21eb4560cd7");
//    __1930page.Select_selectTaxYears(data[5]);
//    
//    
//    TestModellerLogger.SetLastNodeGuid("cf92077e-4d58-4222-a8f5-a6685570717e");
//    __1930page.SelectEmp(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("783e3e9e-ff28-48a6-b7f5-6837578dc189");
//    __1930page.getEarningsP11();
//    
//
////    TestModellerLogger.SetLastNodeGuid("c7802579-a1ba-4119-a4d5-1f69dc9ab163");
////    __1930page.Click_getPT();
////    
////
////    TestModellerLogger.SetLastNodeGuid("519a577b-8ba6-4ca5-8f36-296804395579");
////    __1930page.Click_getUEL();
//    

    TestModellerLogger.SetLastNodeGuid("761d0e63-632c-4451-ad43-724ae26763c8");
    __1930page.Click_gotoFiling_Management();
    

    TestModellerLogger.SetLastNodeGuid("a11f860b-7ae0-4ffc-91d2-f21eb4560cd7");
    __1930page.Select_selectTaxYears(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b3618d93-5963-44dd-9a03-9139881bb97b");
    __1930page.ClickFPS();
    
    
    TestModellerLogger.SetLastNodeGuid("c7802579-a1ba-4119-a4d5-1f69dc9ab163");
    __1930page.Enter_getXMLData();
    

    TestModellerLogger.SetLastNodeGuid("519a577b-8ba6-4ca5-8f36-296804395579");
    __1930page.checkPT();
    

    }
    
    
    @Test  (priority = 3,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickc3() throws Exception
    {
    	
    	
    	sTestCaseID="TC355";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage3B _loginpage = new pages.loginpage3B(driver);
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
        
	_1912page.verifyEarningLimits3rdEmp __1930page = new _1912page.verifyEarningLimits3rdEmp(driver);
//    TestModellerLogger.SetLastNodeGuid("dc3728a4-cc99-4060-9418-3e31311dcc66");
//    __1930page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("44945d34-0415-4631-8850-9f7511ea4a12");
//    __1930page.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("4e535917-7ca3-408d-a6b8-8c04621e4956");
//    __1930page.Click_gotoReports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cf92077e-4d58-4222-a8f5-a6685570717e");
//    __1930page.Click_P11();
//    
//    
//    TestModellerLogger.SetLastNodeGuid("a11f860b-7ae0-4ffc-91d2-f21eb4560cd7");
//    __1930page.Select_selectTaxYears(data[5]);
//    
//    
//    TestModellerLogger.SetLastNodeGuid("cf92077e-4d58-4222-a8f5-a6685570717e");
//    __1930page.SelectEmp(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("783e3e9e-ff28-48a6-b7f5-6837578dc189");
//    __1930page.getEarningsP11();
//    
//
////    TestModellerLogger.SetLastNodeGuid("c7802579-a1ba-4119-a4d5-1f69dc9ab163");
////    __1930page.Click_getPT();
////    
////
////    TestModellerLogger.SetLastNodeGuid("519a577b-8ba6-4ca5-8f36-296804395579");
////    __1930page.Click_getUEL();
//    

    TestModellerLogger.SetLastNodeGuid("761d0e63-632c-4451-ad43-724ae26763c8");
    __1930page.Click_gotoFiling_Management();
    

    TestModellerLogger.SetLastNodeGuid("a11f860b-7ae0-4ffc-91d2-f21eb4560cd7");
    __1930page.Select_selectTaxYears(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b3618d93-5963-44dd-9a03-9139881bb97b");
    __1930page.ClickFPS();
    
    
    TestModellerLogger.SetLastNodeGuid("c7802579-a1ba-4119-a4d5-1f69dc9ab163");
    __1930page.Enter_getXMLData();
    

    TestModellerLogger.SetLastNodeGuid("519a577b-8ba6-4ca5-8f36-296804395579");
    __1930page.checkUEL();
    

    }

}