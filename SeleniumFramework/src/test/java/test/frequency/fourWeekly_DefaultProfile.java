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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/508016ba-c353-44a3-a49b-7a8c5f87e621
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1363, profileId = 101230)
public class fourWeekly_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"fourWeekly","fourWeekly - Default Profile"})
    @TestModellerPath(guid = "02af9e76-eb5a-43ea-808c-0aa845170f1f")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectSelectpayModePositiveEnterFourWeeklyP1() throws InterruptedException
    {
        
        pages.frequency.FourWeekly _FourWeekly = new pages.frequency.FourWeekly(driver);
    TestModellerLogger.SetLastNodeGuid("03f2e0aa-083a-4d15-b394-3fa24cc7575e");
    _FourWeekly.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b131195-ce19-4087-8bbf-48a8a2699bdb");
    _FourWeekly.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0880b77d-b0ce-4a20-8ebe-396cbf90d16b");
    _FourWeekly.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("0e019eb1-1739-4316-9fad-7e6e95706049");
    _FourWeekly.Select_SelectpayMode("FourWeekly");
    

    TestModellerLogger.SetLastNodeGuid("2ef5d6f4-4598-4559-a526-064eb052df3c");
    _FourWeekly.Enter_FourWeeklyPayrollEndDate("44288");
    

    TestModellerLogger.SetLastNodeGuid("21e7fc1e-2454-4449-aae2-53ad4888ef82");
    _FourWeekly.Click_ClickSave();
    

    }

    @Test  (groups= {"fourWeekly","fourWeekly - Default Profile"})
    @TestModellerPath(guid = "196c55d5-b142-4e48-b910-191ca7e02e58")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectSelectpayModePositiveEnterFourWeeklyP2() throws InterruptedException
    {
        
    	pages.frequency.FourWeekly _FourWeekly = new pages.frequency.FourWeekly(driver);
    TestModellerLogger.SetLastNodeGuid("03f2e0aa-083a-4d15-b394-3fa24cc7575e");
    _FourWeekly.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b131195-ce19-4087-8bbf-48a8a2699bdb");
    _FourWeekly.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0880b77d-b0ce-4a20-8ebe-396cbf90d16b");
    _FourWeekly.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("0e019eb1-1739-4316-9fad-7e6e95706049");
    _FourWeekly.Select_SelectpayMode("FourWeekly");
    

    TestModellerLogger.SetLastNodeGuid("2ef5d6f4-4598-4559-a526-064eb052df3c");
    _FourWeekly.Enter_FourWeeklyPayrollEndDate("44288.29610122685");
    

    TestModellerLogger.SetLastNodeGuid("21e7fc1e-2454-4449-aae2-53ad4888ef82");
    _FourWeekly.Click_ClickSave();
    

    }

    @Test  (groups= {"fourWeekly","fourWeekly - Default Profile"})
    @TestModellerPath(guid = "2aaeec70-40b4-4583-89eb-f5abfb6e2bf7")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectSelectpayModePositiveEnterFourWeeklyP3() throws InterruptedException
    {
        
    	pages.frequency.FourWeekly _FourWeekly = new pages.frequency.FourWeekly(driver);
    TestModellerLogger.SetLastNodeGuid("03f2e0aa-083a-4d15-b394-3fa24cc7575e");
    _FourWeekly.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b131195-ce19-4087-8bbf-48a8a2699bdb");
    _FourWeekly.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0880b77d-b0ce-4a20-8ebe-396cbf90d16b");
    _FourWeekly.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("0e019eb1-1739-4316-9fad-7e6e95706049");
    _FourWeekly.Select_SelectpayMode("FourWeekly");
    

    TestModellerLogger.SetLastNodeGuid("2ef5d6f4-4598-4559-a526-064eb052df3c");
    _FourWeekly.Enter_FourWeeklyPayrollEndDate("44288.29610122685");
    

    TestModellerLogger.SetLastNodeGuid("21e7fc1e-2454-4449-aae2-53ad4888ef82");
    _FourWeekly.Click_ClickSave();
    

    }

}
