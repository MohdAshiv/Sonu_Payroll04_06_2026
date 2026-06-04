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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/150ee727-d575-4f27-86ae-31aab81059ec
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1354, profileId = 101142)
public class runpayrolltestpagefortnight_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"runpayrolltestpage","runpayrolltestpage - Default Profile"})
    @TestModellerPath(guid = "715323b8-df3a-4387-bfcf-d7ca53fb6cb7")
    public void GoToUrlAssertUrlClickgotoPayrollDashboardClickClickRunPayroll1ClickClickRunPayroll2() throws Exception
    {
        
        pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

    }

}
