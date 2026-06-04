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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6878a3d7-4bef-4d93-baf1-05ee5c761d6f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1394, profileId = 101261)
public class SelectContractor_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"SelectContractor","SelectContractor - Default Profile"})
    @TestModellerPath(guid = "7df53907-a03e-4a74-9b58-aa61e99100f8")
    public void GoToUrlAssertUrlPositiveSelectSelectContractor1() throws InterruptedException
    {
        
        pages1.selectontractor _selectontractor = new pages1.selectontractor(driver);
    TestModellerLogger.SetLastNodeGuid("18f0f84a-d00a-49e6-802f-40010d1e16e9");
    _selectontractor.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("37fe523a-7495-4e04-8902-bea0aca4a516");
    _selectontractor.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e75ee75c-2fb8-4608-9ff9-e26212185234");
    _selectontractor.Select_SelectContractor("ALEKSANDAR RECRUITMENT LTD");
    

    }

    @Test  (groups= {"SelectContractor","SelectContractor - Default Profile"})
    @TestModellerPath(guid = "6bd1e15e-b89b-4178-ab5f-6931d013fa13")
    public void GoToUrlAssertUrlPositiveSelectSelectContractor2() throws InterruptedException
    {
        
        pages1.selectontractor _selectontractor = new pages1.selectontractor(driver);
    TestModellerLogger.SetLastNodeGuid("18f0f84a-d00a-49e6-802f-40010d1e16e9");
    _selectontractor.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("37fe523a-7495-4e04-8902-bea0aca4a516");
    _selectontractor.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e75ee75c-2fb8-4608-9ff9-e26212185234");
    _selectontractor.Select_SelectContractor("amair");
    

    }

}
