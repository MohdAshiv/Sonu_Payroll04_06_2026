package test.frequency;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/48df533f-239c-4c30-ba61-6d49cb0f8e84
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1379, profileId = 101249)
public class nottosubmitclick_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"not_to_submitclick","not_to_submitclick - Default Profile"})
    @TestModellerPath(guid = "b5bb82e5-7a50-4f3d-be6b-2c05b4d99441")
    public void GoToUrlAssertUrlClickclickNottosubmit()
    {
        
        pages.frequency.not_to_submitclick _not_to_submitclick = new pages.frequency.not_to_submitclick(driver);
    TestModellerLogger.SetLastNodeGuid("f02b4fb5-6b38-45e2-b877-ae451429fb78");
    _not_to_submitclick.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ada33f7b-20df-43e4-a47c-32c4057ef794");
    _not_to_submitclick.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4011717c-b31c-493a-8f28-f34ca5194c79");
    _not_to_submitclick.Click_clickNot_to_submit();
    

    }

}
