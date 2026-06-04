package _2087EmailLog;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/875a3e56-743b-4c32-ba6d-7a81ab18060f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1796, profileId = 102264)
public class test_2087EmailLogTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"_2087EmailLogTest","_2087EmailLogTest - Default Profile"})
    @TestModellerPath(guid = "1510056c-d0d5-4380-83f4-8f26b6e90147")
    public void GoToUrlAssertUrlClickclickOnPersonClickEmailLogClickgetLogCount() throws InterruptedException
    {
        
    	_2087EmailLogPage._2087EmailLog __2087EmailLog = new _2087EmailLogPage._2087EmailLog(driver);
    TestModellerLogger.SetLastNodeGuid("ab0bed84-97a6-4554-a912-ab892e2387d0");
    __2087EmailLog.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1852f274-12cc-47c7-8aa0-a5567c8e4a39");
    __2087EmailLog.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e64508e0-bceb-47f3-9f68-b2166e26e48b");
    __2087EmailLog.Click_clickOnPerson();
    

    TestModellerLogger.SetLastNodeGuid("12c85ca3-f78c-4f86-bc8f-efea9758bb9c");
    __2087EmailLog.Click_Email_Log();
    

    TestModellerLogger.SetLastNodeGuid("4b7723f8-8866-4a1e-9a2a-f7d0796bac5f");
    __2087EmailLog.Click_getLogCount();
    

    }

}