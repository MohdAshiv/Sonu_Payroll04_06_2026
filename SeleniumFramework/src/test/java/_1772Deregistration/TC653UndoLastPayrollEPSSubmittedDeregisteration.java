package _1772Deregistration;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7e74711d-ef2b-4bd3-9896-b317f2717fe4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1281, profileId = 101157)
public class TC653UndoLastPayrollEPSSubmittedDeregisteration extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"WrongPayeCloseSubscript","WrongPayeCloseSubscript - Default Profile"})
    @TestModellerPath(guid = "f36c2f07-f87e-4b97-972a-50f2d8245715")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
       
    	sTestCaseID="TC653";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        pages.loginpage3 _loginpage = new pages.loginpage3(driver);
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
    

pages.SearchClient2 _SearchClient3 = new pages.SearchClient2(driver);
//    TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//    _SearchClient2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//    _SearchClient2.AssertUrl();
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
//    TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
//    _verifyClosePayeErrorMessage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
//    _verifyClosePayeErrorMessage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
    _verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
    _verifyClosePayeErrorMessageOOPS.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
    _verifyClosePayeErrorMessageOOPS.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("a0b9860a-6157-407f-9bcb-0e930a194135");
    _verifyClosePayeErrorMessageOOPS.Click_ClosePAYEtoYes();
    

    TestModellerLogger.SetLastNodeGuid("98af6d89-396c-4089-88e3-298d59884c8f");
    _verifyClosePayeErrorMessageOOPS.Enter_EnterDeRegistrationDate1(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b8b1d12f-ab94-4b0b-84e8-d3e13da018e4");
    _verifyClosePayeErrorMessageOOPS.ClickScreenshot(data[6]);
    

    }

  /*  @Test  (groups= {"WrongPayeCloseSubscript","WrongPayeCloseSubscript - Default Profile"})
    @TestModellerPath(guid = "c8f219c9-7e56-438a-8de6-eef8362773c1")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs2()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Ayla.Frami99");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("VgZN7UpRio");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("et");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.SearchClient2 _SearchClient2 = new pages.SearchClient2(driver);
    TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
    _SearchClient2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
    _SearchClient2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
    _SearchClient2.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
    _SearchClient2.Enter_EnterClientName("autem");
    

    TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
    _SearchClient2.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
    _SearchClient2.Click_ClickOnClient();
    

pages.verifyClosePayeErrorMessage _verifyClosePayeErrorMessage = new pages.verifyClosePayeErrorMessage(driver);
    TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
    _verifyClosePayeErrorMessage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
    _verifyClosePayeErrorMessage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
    _verifyClosePayeErrorMessage.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
    _verifyClosePayeErrorMessage.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
    _verifyClosePayeErrorMessage.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("a0b9860a-6157-407f-9bcb-0e930a194135");
    _verifyClosePayeErrorMessage.Click_ClosePAYEtoYes();
    

    TestModellerLogger.SetLastNodeGuid("98af6d89-396c-4089-88e3-298d59884c8f");
    _verifyClosePayeErrorMessage.Enter_EnterDeRegistrationDate("44276.302144131943");
    

    TestModellerLogger.SetLastNodeGuid("b8b1d12f-ab94-4b0b-84e8-d3e13da018e4");
    _verifyClosePayeErrorMessage.Click_ErrorMessage();
    

    }

    @Test  (groups= {"WrongPayeCloseSubscript","WrongPayeCloseSubscript - Default Profile"})
    @TestModellerPath(guid = "0ac17532-a05b-428e-a689-bb85a361703f")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs3()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Glenda_Labadie81");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("gwJMSQMyxA");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("in");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.SearchClient2 _SearchClient2 = new pages.SearchClient2(driver);
    TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
    _SearchClient2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
    _SearchClient2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
    _SearchClient2.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
    _SearchClient2.Enter_EnterClientName("non");
    

    TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
    _SearchClient2.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
    _SearchClient2.Click_ClickOnClient();
    

pages.verifyClosePayeErrorMessage _verifyClosePayeErrorMessage = new pages.verifyClosePayeErrorMessage(driver);
    TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
    _verifyClosePayeErrorMessage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
    _verifyClosePayeErrorMessage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
    _verifyClosePayeErrorMessage.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
    _verifyClosePayeErrorMessage.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
    _verifyClosePayeErrorMessage.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("a0b9860a-6157-407f-9bcb-0e930a194135");
    _verifyClosePayeErrorMessage.Click_ClosePAYEtoYes();
    

    TestModellerLogger.SetLastNodeGuid("98af6d89-396c-4089-88e3-298d59884c8f");
    _verifyClosePayeErrorMessage.Enter_EnterDeRegistrationDate("44276.302144131943");
    

    TestModellerLogger.SetLastNodeGuid("b8b1d12f-ab94-4b0b-84e8-d3e13da018e4");
    _verifyClosePayeErrorMessage.Click_ErrorMessage();
    

    }
*/
}
