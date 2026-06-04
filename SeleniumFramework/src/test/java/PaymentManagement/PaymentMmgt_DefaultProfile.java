package PaymentManagement;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4c8d6be5-2b79-48bb-9a0d-9138f8748135
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1450, profileId = 101334)
public class PaymentMmgt_DefaultProfile extends TestBase
{
    
 
    
    @Test  (groups= {"PaymentMmgt","PaymentMmgt - Default Profile"})
    @TestModellerPath(guid = "838c21ea-4044-4bb3-8d19-cf795c7e9cac")
    public void GoToUrlAssertUrlClickclickPayrollSettingsClickclickCompanyDetailsClickMarkYestoPaymentMmgtClic() throws Exception
    {
        
    	PaymentMmgt.PaymentMmgt _PaymentMmgt = new PaymentMmgt.PaymentMmgt(driver);
    TestModellerLogger.SetLastNodeGuid("ef7cf453-0267-47db-8388-a31200eaa772");
    _PaymentMmgt.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("19e695c6-8a6b-4c2e-b79d-8449a407f239");
    _PaymentMmgt.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7e5cbc6f-c4b2-470c-b459-816f3042236e");
    _PaymentMmgt.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("2f5590f7-e106-4057-8440-b5c6996e6e06");
    _PaymentMmgt.Click_clickCompanyDetails();
    

    TestModellerLogger.SetLastNodeGuid("32dc191c-633b-4a08-ad95-6ec15efe8800");
    _PaymentMmgt.Click_MarkYestoPaymentMmgt();
    

    TestModellerLogger.SetLastNodeGuid("80af7c8d-d174-4330-ae3d-d09047f3fdc2");
    _PaymentMmgt.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fb1cd1d6-71fb-45a6-91fb-8aec8d6c71de");
    _PaymentMmgt.Click_getmsg();
    

    }

}
