package tests;

import reports.TestNGListener;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5335cd01-1e01-4a2b-83e1-56c89372ad01
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1321, profileId = 101190)
public class payslipEmailPopup_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"payslipPopup","payslipPopup - Default Profile"})
    @TestModellerPath(guid = "954d3765-f638-4eb9-956b-c876a2c5b773")
    public void GoToUrlAssertUrlClickRunPayroll2ClickSend() throws Exception
    {
        
        pages.PayrollEmailPopup _vikas_test = new pages.PayrollEmailPopup(driver);
    TestModellerLogger.SetLastNodeGuid("a28ba06c-5b56-417e-8c4f-c45e24e6cd51");
    _vikas_test.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0f187731-8fd7-4efc-aea3-df7685c6821a");
    _vikas_test.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("03528a57-42c6-47f4-823e-37ae8ccb0042");
    _vikas_test.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("5d21fc91-3e12-4bd3-af4a-bfdcd57131d4");
    _vikas_test.Click__Send_();
    

    }

}
