package tests1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f087b9b9-74ce-4bca-8876-00229d5f353a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1385, profileId = 101253)
public class TC29subscriptEmployerNotes_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscriptEmployerNotes","subscriptEmployerNotes - Default Profile"})
    @TestModellerPath(guid = "54c15cc9-18ec-4284-8582-1d873331499b")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
       
    	sTestCaseID="TC29";
        Sheet="Sheet1";
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
//  TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//  _agentpage.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//  _agentpage.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
  _agentpage.Enter_SearchAgentName(data[3]);
  

  TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
  _agentpage.Click_ClickSearch();
  

  TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
  _agentpage.Click_ClickAgent();
  

pages.SearchClient2 _SearchClient3 = new pages.SearchClient2(driver);
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient3.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient3.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient3.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient3.Click_ClickOnClient();
  

verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
//  TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
//  _verifyClosePayeErrorMessage.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
//  _verifyClosePayeErrorMessage.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
  _verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();

//pages1.P11D _P11D = new pages1.P11D(driver);
//    TestModellerLogger.SetLastNodeGuid("effebf3f-fb18-4aa1-8c06-0c10c7e2505f");
//    _P11D.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2505aac8-9ba5-4685-b033-fe93ddd0ce21");
//    _P11D.AssertUrl();
//    

 
//
//    TestModellerLogger.SetLastNodeGuid("29ac446c-aa3d-43cc-bc22-773684618961");
//    _P11D.Click__Payroll_Dashboard_();
//    

    

pages1.EmployerNotes _EmployerNotes = new pages1.EmployerNotes(driver);
//    TestModellerLogger.SetLastNodeGuid("975a55d2-27fd-4652-820f-371e0333f371");
//    _EmployerNotes.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8b9f2ec1-da34-42b8-ae7b-969e1119f26f");
//    _EmployerNotes.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ee618d94-132b-49b0-8f26-81a0e9a2a912");
    _EmployerNotes.Click_gotoEmployerNotes();
    

    TestModellerLogger.SetLastNodeGuid("444a9660-bfc7-4c93-9b58-ea754fa57288");
    _EmployerNotes.Enter_YearEndNotes(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("0aceb88b-b9b6-4228-b660-f92f1e6ae16c");
    _EmployerNotes.Enter_Month1(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("40c9cac1-c768-4807-a5cf-dd46053075c9");
    _EmployerNotes.Enter_Month2(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("5536c438-141d-4d70-bf4d-ba692e3b2451");
    _EmployerNotes.Enter_Month3(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("bf51480e-5767-413a-bbfc-4428ecb88382");
    _EmployerNotes.Enter_Month4(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("4bf8c4c8-86f4-4f34-8a9d-ddb83ab71ad1");
    _EmployerNotes.Enter_Month5(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("01afd99b-1b67-458a-9142-f74b1ee556bd");
    _EmployerNotes.Enter_Month6(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("ca341650-e578-410d-b96d-d2678270c7c6");
    _EmployerNotes.Enter_Month7(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("2db8a7cd-a807-47cd-b931-d7cbfdbfd82d");
    _EmployerNotes.Enter_Month8(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("8a22aad7-671f-401b-a430-1d7484b39410");
    _EmployerNotes.Enter_Month9(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("1b7af999-0fea-47ef-9b9e-e276309fdfdd");
    _EmployerNotes.Enter_Month10(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("ef9a14c6-676e-4696-b14e-718007cf21df");
    _EmployerNotes.Enter_Month11(data[16]);
    

    TestModellerLogger.SetLastNodeGuid("3630eb7c-8163-44fe-9c7b-aff3fc989569");
    _EmployerNotes.Enter_Month12(data[17]);
    

    TestModellerLogger.SetLastNodeGuid("65643b32-d06f-48e3-8fac-e3e18287805b");
    _EmployerNotes.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("75dbfb8c-e444-4d50-a1eb-8da306f53487");
    _EmployerNotes.Click_gotoPayrollDashboard();
    

    }

}
