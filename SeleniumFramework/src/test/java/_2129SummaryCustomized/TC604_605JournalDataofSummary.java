package _2129SummaryCustomized;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/432a9c03-5c2d-4106-a138-3e67addf1688
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1873, profileId = 102438)
public class TC604_605JournalDataofSummary extends TestBase
{
    

    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    

    
    @Test  (groups= {"_2129SummaryPayslipEmailtest","_2129SummaryPayslipEmailtest - Test Cases"})
    @TestModellerPath(guid = "f5dec0da-35b5-415f-83ce-d5b8fd7b5bbe")
    public void GoToUrlAssertUrlClickPayslipsPositiveSelectPayrollDateClickEmailPayslipsClickTickCompanyemaila() throws Exception
    {
    	
    	sTestCaseID="TC604";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage4 _loginpage = new pages.loginpage4(driver);
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
        
    	_2129pages._2129SummaryJournal __2129SummaryJournal = new _2129pages._2129SummaryJournal(driver);
//    TestModellerLogger.SetLastNodeGuid("52a0aab7-a55d-4219-8a20-97956f297733");
//    __2129SummaryJournal.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa8a2a47-cbdb-4c2c-9e79-079c0c0081ad");
//    __2129SummaryJournal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2fb80c80-c090-47ab-9811-9e3e1ee3865f");
    __2129SummaryJournal.Click_Reports();
    

    TestModellerLogger.SetLastNodeGuid("a1512e85-b62f-4475-b3a2-2e361faae845");
    __2129SummaryJournal.Click_Wages_JournalAgent();
    

    TestModellerLogger.SetLastNodeGuid("bdab0454-45fd-4273-af5a-03233ee533f8");
    __2129SummaryJournal.Select_TaxYear(data[5]);
    
 

    TestModellerLogger.SetLastNodeGuid("22327273-712d-4ab3-ac29-c43ff7ec5b9b");
    __2129SummaryJournal.Select_PayrollDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("4f79dfaf-43a8-4526-87a6-5b4409a62854");
    __2129SummaryJournal.CreateTransactionNo(data[4]);
    

    
    

    TestModellerLogger.SetLastNodeGuid("6c6b5285-4956-4c1d-b8f2-1e6c155a691e");
    __2129SummaryJournal.Click_getTotalAtAgent1();
    

    TestModellerLogger.SetLastNodeGuid("82a02ab2-145c-4566-bebb-1cad7c834c24");
    __2129SummaryJournal.Click_getTotalAtAgent2();
    
    
    TestModellerLogger.SetLastNodeGuid("53dcac6f-3294-4d8d-9dcf-d2c69c4e6e63");
    __2129SummaryJournal.TakeJournalScreenshotAgent();
    

    TestModellerLogger.SetLastNodeGuid("a6ddb3d9-85ea-45df-b881-82eb95ccf02b");
    __2129SummaryJournal.Click_closepopup();
    
    
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
    

    TestModellerLogger.SetLastNodeGuid("752dfbc4-604d-41eb-9648-bae2a7d6cc73");
    __2129SummaryJournal.Click_JournalsAtDSB();
    

    TestModellerLogger.SetLastNodeGuid("43dccf4e-23ad-4d8f-bf89-a46d212f7eef");
    __2129SummaryJournal.Click_ClickOnEye();
    

    TestModellerLogger.SetLastNodeGuid("4b380312-760a-43e0-ae2d-b7415fa2a84a");
    __2129SummaryJournal.Click_getTotalFromDSB1();
    

    TestModellerLogger.SetLastNodeGuid("b0d2cb9a-0953-440c-b27a-5b216830fde9");
    __2129SummaryJournal.Click_getTotalFromDSB2();
    
    
    TestModellerLogger.SetLastNodeGuid("53dcac6f-3294-4d8d-9dcf-d2c69c4e6e63");
    __2129SummaryJournal.TakeJournalScreenshotDsb();
    

    }
    
    
   

    @Test  (groups= {"_2129SummaryPayslipEmailtest","_2129SummaryPayslipEmailtest - Test Cases"})
    @TestModellerPath(guid = "48c5d4b8-dcea-4333-b823-a7e374ba05b4")
    public void GoToUrlAssertUrlClickPayslipsPositiveSelectPayrollDateClickEmailPayslipsClickTickCompanyemaila2() throws Exception
    {
    	
    	
    	sTestCaseID="TC605";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage4 _loginpage = new pages.loginpage4(driver);
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
        
    	_2129pages._2129SummaryJournal __2129SummaryJournal = new _2129pages._2129SummaryJournal(driver);
//    TestModellerLogger.SetLastNodeGuid("52a0aab7-a55d-4219-8a20-97956f297733");
//    __2129SummaryJournal.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa8a2a47-cbdb-4c2c-9e79-079c0c0081ad");
//    __2129SummaryJournal.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2fb80c80-c090-47ab-9811-9e3e1ee3865f");
//    __2129SummaryJournal.Click_Reports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a1512e85-b62f-4475-b3a2-2e361faae845");
//    __2129SummaryJournal.Click_Wages_JournalAgent();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdab0454-45fd-4273-af5a-03233ee533f8");
//    __2129SummaryJournal.Select_TaxYear("2021-2022");
//    
//
//    TestModellerLogger.SetLastNodeGuid("22327273-712d-4ab3-ac29-c43ff7ec5b9b");
//    __2129SummaryJournal.Select_PayrollDate("25/03/2022");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4f79dfaf-43a8-4526-87a6-5b4409a62854");
//    __2129SummaryJournal.Click__2129_Summary_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("53dcac6f-3294-4d8d-9dcf-d2c69c4e6e63");
//    __2129SummaryJournal.Click_click_on_companyAgentLevel();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c6b5285-4956-4c1d-b8f2-1e6c155a691e");
//    __2129SummaryJournal.Click_getTotalAtAgent1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("82a02ab2-145c-4566-bebb-1cad7c834c24");
//    __2129SummaryJournal.Click_getTotalAtAgent2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a6ddb3d9-85ea-45df-b881-82eb95ccf02b");
//    __2129SummaryJournal.Click_closepopup();
    

    TestModellerLogger.SetLastNodeGuid("752dfbc4-604d-41eb-9648-bae2a7d6cc73");
    __2129SummaryJournal.Click_JournalsAtDSB();
    

    TestModellerLogger.SetLastNodeGuid("43dccf4e-23ad-4d8f-bf89-a46d212f7eef");
    __2129SummaryJournal.Click_ClickOnEye();
    

    TestModellerLogger.SetLastNodeGuid("4b380312-760a-43e0-ae2d-b7415fa2a84a");
    __2129SummaryJournal.Click_getTotalFromDSB1();
    

    TestModellerLogger.SetLastNodeGuid("b0d2cb9a-0953-440c-b27a-5b216830fde9");
    __2129SummaryJournal.Click_getTotalFromDSB2();
    
    TestModellerLogger.SetLastNodeGuid("53dcac6f-3294-4d8d-9dcf-d2c69c4e6e63");
    __2129SummaryJournal.TakeJournalScreenshotDsb();
    

    }

}