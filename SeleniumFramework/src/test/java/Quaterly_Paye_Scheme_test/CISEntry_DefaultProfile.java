package Quaterly_Paye_Scheme_test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0728f230-fd4c-4ebd-bf3a-174775739d46
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1429, profileId = 101300)
public class CISEntry_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"CISEntry","CISEntry - Default Profile"})
    @TestModellerPath(guid = "fc2ef239-df0e-4d52-9452-35cbb9cdd572")
    public void GoToUrlAssertUrlClickClickCISSufferedPositiveEnterEnterAmountClickclickSave() throws InterruptedException
    {
        
    	Quaterly_Paye_Scheme.CISEntry _CISEntry = new Quaterly_Paye_Scheme.CISEntry(driver);
    TestModellerLogger.SetLastNodeGuid("757da26b-6d8a-4efc-9fa9-a9e4cd8e4755");
    _CISEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7336a84-b0a4-4e4f-b297-5022b96fa992");
    _CISEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd889de5-aac5-4c2d-9f5c-c574974a4a55");
    _CISEntry.Click_ClickCISSuffered();
    

    TestModellerLogger.SetLastNodeGuid("cd107a6f-be06-4a01-a750-835dc6ba9ced");
    _CISEntry.Enter_EnterAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("30260b13-9b04-4dee-b598-276340ae3252");
    _CISEntry.Click_clickSave();
    

    }

}
