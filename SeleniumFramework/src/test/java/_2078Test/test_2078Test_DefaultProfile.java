package _2078Test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2d25939b-5608-49e7-8521-4d80b7dee967
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1787, profileId = 102246)
public class test_2078Test_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"_2078Test","_2078Test - Default Profile"})
    @TestModellerPath(guid = "9f65737f-cb8a-4e1f-b0a2-d6ad5bac399d")
    public void GoToUrlAssertUrlClickReportsClickPayrollSummary()
    {
        
    	_2078PaymentOfMonth._2078 __2078 = new _2078PaymentOfMonth._2078(driver);
    TestModellerLogger.SetLastNodeGuid("8a5d1e23-d8f3-4930-aad9-00ef3e80f73a");
    __2078.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c2a4ac62-c7ec-4df8-880e-225a0a7aea15");
    __2078.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("412c5dff-17bf-49f3-ba7a-2d0e748785d3");
    __2078.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1093daf0-1ded-42be-ac49-4f4e32ffcba7");
    __2078.Click_Payroll_Summary();
    

    }

}