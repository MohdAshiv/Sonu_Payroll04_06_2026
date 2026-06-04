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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a6243965-f970-4327-8b55-dc46ea95f31d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1340, profileId = 101207)
public class clickenable_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"clickenable","clickenable - Default Profile"})
    @TestModellerPath(guid = "8f80fa1d-dbc8-4134-8e25-abd1c98f5b66")
    public void GoToUrlAssertUrlClickclickEnable() throws InterruptedException
    {
        
        pages.enableclick _enableclick = new pages.enableclick(driver);
    TestModellerLogger.SetLastNodeGuid("7389e9c4-fd31-4073-b7cf-293fb928afc7");
    _enableclick.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("79090e6d-160c-4419-918b-e1c17619def5");
    _enableclick.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("24c2fd5f-de2f-4fd4-a82e-32a495ff21ef");
    _enableclick.Click_clickEnable();
    

    }

}
