package _1540EEInfoImport;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f950ee3e-df17-4040-ac47-3ee417b05ffe
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1286, profileId = 101160)
public class TC931DwnldDataFormat extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
        
    	sTestCaseID="TC840";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    
    Thread.sleep(5000);
    _1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    
    _AgentDsbPayroll.Click__Import_Employees();
    
 //   _AgentDsbPayroll.Click_UploadEEDetailFile();
    
    
    page.factory.ImportEmployee _ImportEE=new page.factory.ImportEmployee(driver);
    
    _ImportEE.Click_DownloadFile();
    

//pages.SearchClient2 _SearchClient2 = new pages.SearchClient2(driver);
////    TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
////    _SearchClient2.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
////    _SearchClient2.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
//    _SearchClient2.Click_ClientsClick();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
//    _SearchClient2.Enter_EnterClientName(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
//    _SearchClient2.Click_SearchButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
//    _SearchClient2.Click_ClickOnClient();
//    
//
//pages.leavertesting _leavertesting = new pages.leavertesting(driver);
////    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
////    _leavertesting.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
////    _leavertesting.AssertUrl();
////    
//
//    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
//    _leavertesting.Click_gotoPayroll();
//    
    
    

    }
    
   
}
