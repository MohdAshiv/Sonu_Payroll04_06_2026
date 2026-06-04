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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0a66c295-c2a7-4a09-9909-c9f029506f0b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1283, profileId = 101159)
public class leavertesting_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"leavertesting","leavertesting - Default Profile"})
    @TestModellerPath(guid = "404600c8-0d74-4f96-b794-b4a32a3beeac")
    public void GoToUrlAssertUrlClickgotoPayrollClickClickThreeDotClickSelectLeaverPositiveEnterEnterLeavingDa1() throws Exception
    {
        
        pages.leavertesting _leavertesting = new pages.leavertesting(driver);
    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
    _leavertesting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
    _leavertesting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    _leavertesting.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    _leavertesting.Click_SelectLeaver();
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    _leavertesting.Enter_EnterLeavingDate("44277");
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    _leavertesting.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("daf8d06f-5e14-4f77-b50b-5f0ece9142f1");
    _leavertesting.Click_gotoFilingManagement();
    

    }

    @Test  (groups= {"leavertesting","leavertesting - Default Profile"})
    @TestModellerPath(guid = "2e52b176-3f38-4320-8dad-2bedece3bedb")
    public void GoToUrlAssertUrlClickgotoPayrollClickClickThreeDotClickSelectLeaverPositiveEnterEnterLeavingDa2() throws Exception
    {
        
        pages.leavertesting _leavertesting = new pages.leavertesting(driver);
    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
    _leavertesting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
    _leavertesting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    _leavertesting.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    _leavertesting.Click_SelectLeaver();
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    _leavertesting.Enter_EnterLeavingDate("44277.450111412036");
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    _leavertesting.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("daf8d06f-5e14-4f77-b50b-5f0ece9142f1");
    _leavertesting.Click_gotoFilingManagement();
    

    }

    @Test  (groups= {"leavertesting","leavertesting - Default Profile"})
    @TestModellerPath(guid = "d4de36cd-bd2e-4176-9ff3-0b9263501840")
    public void GoToUrlAssertUrlClickgotoPayrollClickClickThreeDotClickSelectLeaverPositiveEnterEnterLeavingDa3() throws Exception
    {
        
        pages.leavertesting _leavertesting = new pages.leavertesting(driver);
    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
    _leavertesting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
    _leavertesting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    _leavertesting.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    _leavertesting.Click_SelectLeaver();
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    _leavertesting.Enter_EnterLeavingDate("44277.450111412036");
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    _leavertesting.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("daf8d06f-5e14-4f77-b50b-5f0ece9142f1");
    _leavertesting.Click_gotoFilingManagement();
    

    }

}
