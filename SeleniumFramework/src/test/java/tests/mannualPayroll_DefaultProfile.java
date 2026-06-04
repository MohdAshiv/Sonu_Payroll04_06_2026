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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5d6d99bb-5838-4dbf-b8b0-1ba71b569f7d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1341, profileId = 101208)
public class mannualPayroll_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"mannualPayroll","mannualPayroll - Default Profile"})
    @TestModellerPath(guid = "d88d7cd0-ecaf-4cf0-851f-9350c2f8ad18")
    public void GoToUrlAssertUrlClickclickSettingClickclickDisable()
    {
        
        pages.mannualPayroll _mannualPayroll = new pages.mannualPayroll(driver);
    TestModellerLogger.SetLastNodeGuid("3d4fbda3-207a-486a-94f0-8f7ec47f9976");
    _mannualPayroll.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("24eb0cbf-2c04-4692-867d-b37e4e51f02d");
    _mannualPayroll.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec23023f-d5be-435a-aa4b-9d7ebfbdd2d0");
    _mannualPayroll.Click_clickSetting();
    

    TestModellerLogger.SetLastNodeGuid("9ffccb4a-a415-421d-9372-d1c36b2d0b2d");
    _mannualPayroll.Click_clickDisable();
    

    }

}
