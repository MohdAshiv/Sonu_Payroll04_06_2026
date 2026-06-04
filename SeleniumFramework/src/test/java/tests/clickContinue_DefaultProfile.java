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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/519805c8-f4e6-4229-a3c3-9f514bdb0e06
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1339, profileId = 101206)
public class clickContinue_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"clickContinue","clickContinue - Default Profile"})
    @TestModellerPath(guid = "48a18042-7fbe-4681-bd9a-841b9596faf2")
    public void GoToUrlAssertUrlClickYesClickclickContinue()
    {
        
        pages.clickContinue _clickContinue = new pages.clickContinue(driver);
    TestModellerLogger.SetLastNodeGuid("8cb946e1-b82c-45bc-84e4-d54b46fe8ef6");
    _clickContinue.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4bb06d53-b25f-4570-8bd8-56dbd3651ea8");
    _clickContinue.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("eac4470b-1998-4e57-a3fb-5d63a9520a7c");
    _clickContinue.Click_Yes();
    

    TestModellerLogger.SetLastNodeGuid("55905fda-ec66-43bf-a8ee-3a523cc26a9f");
    _clickContinue.Click_clickContinue();
    

    }

}
