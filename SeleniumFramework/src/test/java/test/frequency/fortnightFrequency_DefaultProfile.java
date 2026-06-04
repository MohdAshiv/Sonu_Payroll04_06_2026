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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/808bc7d4-9176-423a-9cd4-e1fe6210f9ad
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1360, profileId = 101227)
public class fortnightFrequency_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"fortnightFrequency","fortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "40cc797d-0620-4346-ab77-1e87e7240fac")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectselectpayMode1PositiveEnterFortnightl1() throws InterruptedException
    {
        
        pages.frequency.fortnightFrequency _fortnightFrequency = new pages.frequency.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"fortnightFrequency","fortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "134d173a-c8ea-4cf1-992f-0cbf33e294ac")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectselectpayMode1PositiveEnterFortnightl2() throws InterruptedException
    {
        
    	pages.frequency.fortnightFrequency _fortnightFrequency = new pages.frequency.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287.523717905089");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"fortnightFrequency","fortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "4482faa3-2c92-45fa-a26c-baacfc67481d")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectselectpayMode1PositiveEnterFortnightl3() throws InterruptedException
    {
        
    	pages.frequency.fortnightFrequency _fortnightFrequency = new pages.frequency.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287.523717905089");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

}
