package frequencytest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b73efbf2-5794-4e7d-af00-8d035e97ba54
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1439, profileId = 101313)
public class changedateofmonth_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"changedateofmonth","changedateofmonth - Default Profile"})
    @TestModellerPath(guid = "a7c349ec-4e5e-405a-8fc8-3223ccf1dd1e")
    public void GoToUrlAssertUrlPositiveSelectselectDayofMonthFrequencyClickgotoPayrollDashboardPositiveSelectv() throws InterruptedException
    {
        
        frequency.changedateofmonth _changedateofmonth = new frequency.changedateofmonth(driver);
    TestModellerLogger.SetLastNodeGuid("37aacac8-96f9-4d8c-b3b9-395eaaca1bd6");
    _changedateofmonth.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c04d2477-e473-465a-a885-00cb3a125926");
    _changedateofmonth.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2aa697e3-aa8e-4555-92d8-649a53ec1836");
    _changedateofmonth.Select_selectDayofMonthFrequency("6");
    

    TestModellerLogger.SetLastNodeGuid("55fed7f3-5c51-4f47-9b66-cb0cd7de25c5");
    _changedateofmonth.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("5566e5d7-7623-4860-828d-0625e36d4093");
    _changedateofmonth.Select_verifychangedDate("31/05/2021");
    

    }

}
