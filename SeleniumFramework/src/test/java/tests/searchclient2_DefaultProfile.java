package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3f3651f5-b6c8-4098-9ba8-2a2dde0d408e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1280, profileId = 101156)
public class searchclient2_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"searchclient2","searchclient2 - Default Profile"})
    @TestModellerPath(guid = "231fd73c-b414-423e-b71d-a6e9299c853d")
    public void GoToUrlAssertUrlClickClientsClickPositiveEnterEnterClientNameClickSearchButtonClickClickOnClie()
    {
        
        pages.SearchClient2 _SearchClient2 = new pages.SearchClient2(driver);
    TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
    _SearchClient2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
    _SearchClient2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
    _SearchClient2.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
    _SearchClient2.Enter_EnterClientName("porro");
    

    TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
    _SearchClient2.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
    _SearchClient2.Click_ClickOnClient();
    

    }

}
