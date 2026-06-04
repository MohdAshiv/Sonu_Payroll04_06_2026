package tests1;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages1.CompareLEL;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/04e3c7ea-0ff8-4ef9-b39a-93c784d18ec6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1382, profileId = 101250)
public class CompareLEL_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"P11D","P11D - Default Profile"})
    @TestModellerPath(guid = "3aad21d5-46a9-4075-b479-82031f6e29ec")
    public void GoToUrlAssertUrlClickYesClickSaveClickPayrollDashboardClickMrsumitjhaClickEditemployeedetails() throws Exception
    {
        
        pages1.CompareLEL _P11D = new pages1.CompareLEL(driver);
    TestModellerLogger.SetLastNodeGuid("effebf3f-fb18-4aa1-8c06-0c10c7e2505f");
    _P11D.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2505aac8-9ba5-4685-b033-fe93ddd0ce21");
    _P11D.AssertUrl();
    

   
    

    TestModellerLogger.SetLastNodeGuid("e42c7dc7-d23c-4c78-a460-91cbe8e727ef");
    _P11D.Click__Filing_Management_();
    

 

    }

}
