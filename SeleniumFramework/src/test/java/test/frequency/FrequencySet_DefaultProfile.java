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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/aaaa55b1-4571-4d85-bbec-12e9bd36f243
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1352, profileId = 101219)
public class FrequencySet_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"FrequencySet","FrequencySet - Default Profile"})
    @TestModellerPath(guid = "d769b3df-7560-4400-8c14-eeb2a11df460")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectpayModeEnterSelectFrequencyClickclic1() throws InterruptedException
    {
        
        pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

    }

    @Test  (groups= {"FrequencySet","FrequencySet - Default Profile"})
    @TestModellerPath(guid = "16e40316-1d15-424b-ad2e-4b153c770f75")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectpayModeEnterSelectFrequencyClickclic2() throws InterruptedException
    {
        
        pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

    }

    @Test  (groups= {"FrequencySet","FrequencySet - Default Profile"})
    @TestModellerPath(guid = "7a7ff882-7d5a-43a2-bae7-56255a5dc46e")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectpayModeEnterSelectFrequencyClickclic3() throws InterruptedException
    {
        
        pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

    }

    @Test  (groups= {"FrequencySet","FrequencySet - Default Profile"})
    @TestModellerPath(guid = "44953e66-2632-4291-b31b-fad656f8955e")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectpayModeEnterSelectFrequencyClickclic4() throws InterruptedException
    {
        
        pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("FourWeekly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

    }

    @Test  (groups= {"FrequencySet","FrequencySet - Default Profile"})
    @TestModellerPath(guid = "acc18c81-fe4d-4b1f-b4ce-fe2506b8cdd5")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectpayModeEnterSelectFrequencyClickclic5() throws InterruptedException
    {
        
        pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

    }

}
