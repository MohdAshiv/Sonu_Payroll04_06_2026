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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f3be41b7-de80-4773-b715-d95aa2b524f1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1383, profileId = 101251)
public class TC28subscriptP11D_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscriptP11D","subscriptP11D - Default Profile"})
    @TestModellerPath(guid = "0090d2dd-249c-4d9b-883b-6d6df02b140b")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
       
    	sTestCaseID="TC28";
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
  

  TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
  _verifyClosePayeErrorMessageOOPS.Click_gotoEditCompany();
  

  TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
  _verifyClosePayeErrorMessageOOPS.Click_gotoPayrollDetails();
  
    
    

pages1.P11D _P11D = new pages1.P11D(driver);
//    TestModellerLogger.SetLastNodeGuid("effebf3f-fb18-4aa1-8c06-0c10c7e2505f");
//    _P11D.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2505aac8-9ba5-4685-b033-fe93ddd0ce21");
//    _P11D.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec1306eb-a776-46ce-a975-bf10a14f196e");
    _P11D.Click_Yes();
    

    TestModellerLogger.SetLastNodeGuid("710409c1-89ba-458a-8fc8-4c6585991137");
    _P11D.Click__Save();
    

    TestModellerLogger.SetLastNodeGuid("29ac446c-aa3d-43cc-bc22-773684618961");
    _P11D.Click__Payroll_Dashboard_();
    

    TestModellerLogger.SetLastNodeGuid("c1914846-cf2b-4575-a560-cfc56ca7344a");
    _P11D.Click_Mr_sumit_jha();
    

    TestModellerLogger.SetLastNodeGuid("aee7c74f-4368-4c9f-9076-173dc2f9b03e");
    _P11D.Click__Edit_employee_details_();
    

    TestModellerLogger.SetLastNodeGuid("c7c04c15-64b1-451e-8c4e-59c693344fcb");
    _P11D.Click_Expenses_and_Benefits();
    

    TestModellerLogger.SetLastNodeGuid("e42c7dc7-d23c-4c78-a460-91cbe8e727ef");
    _P11D.Click__Filing_Management_();
    

    TestModellerLogger.SetLastNodeGuid("035be61e-68fd-4e54-8c5a-c6b62cde0447");
    _P11D.Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency("P11D");
    

    }

}
