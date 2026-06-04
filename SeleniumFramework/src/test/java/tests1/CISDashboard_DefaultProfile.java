package tests1;

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
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e0d6594f-5ea0-435b-84f8-7a35338c2a0c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1396, profileId = 101264)
public class CISDashboard_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"CISDashboard","CISDashboard - Default Profile"})
    @TestModellerPath(guid = "0458d62e-705d-4e58-b626-51eb6069b730")
    public void GoToUrlAssertUrlClickclickCISClickgotoCISDashboard()
    {
        
        pages1.CISDashboard _CISDashboard = new pages1.CISDashboard(driver);
    TestModellerLogger.SetLastNodeGuid("6a964e14-9cec-4fff-bea2-8c255da89cdd");
    _CISDashboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c6164964-b26e-4753-ba1c-38aed9901526");
    _CISDashboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d1588f07-be14-4f0f-84a4-7b55c4cf8afd");
    _CISDashboard.Click_clickCIS();
    

    TestModellerLogger.SetLastNodeGuid("d3a60f45-ee7f-4221-8145-53f54235eb39");
    _CISDashboard.Click_gotoCISDashboard();
    

    }

}
