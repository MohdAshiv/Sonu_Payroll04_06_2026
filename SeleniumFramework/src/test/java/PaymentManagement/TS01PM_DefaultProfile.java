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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c3e05c8e-021f-4f85-834a-8d5cd1324f45
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1482, profileId = 101373)
public class TS01PM_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"TS01PM","TS01PM - Default Profile"})
    @TestModellerPath(guid = "f64c09f9-2835-43a5-8aff-3b2176b89d79")
    public void GoToUrlAssertUrlClickgotoPayrollDashboardClickgotoTaxPaymentClickclickHMRCPaymentsMadePositive() throws InterruptedException
    {
        
    	PaymentMmgt.TS01PM _TS01PM = new PaymentMmgt.TS01PM(driver);
    TestModellerLogger.SetLastNodeGuid("d6d004e4-1417-40dc-aba3-056fb84b8e69");
    _TS01PM.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc3445c6-a772-4046-b777-f30c19bb19d5");
    _TS01PM.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d67589ad-f985-42a3-b4a3-dc7a1ec922d5");
    _TS01PM.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("6bc30cff-7ed9-479d-bcc7-bcde3ebc4150");
    _TS01PM.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("6adcd45c-fb9a-4c6b-ab14-5666bdbf791e");
    _TS01PM.Click_clickHMRCPaymentsMade();
    

    TestModellerLogger.SetLastNodeGuid("a0d5d3ee-2265-4bf6-ba4e-1f66b54c567a");
    _TS01PM.Enter_EnterNICActualPaidAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("9677af39-4612-49c5-94fa-22b8765eea53");
    _TS01PM.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fa18d375-2bbe-487c-9082-276254a642f8");
    _TS01PM.Click_gotoFilingManagement();
    

    TestModellerLogger.SetLastNodeGuid("6dbfa148-da7a-4409-bebb-32ba6c5c205c");
    _TS01PM.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("11a15c7a-7be7-432b-baa2-2d98c54ab3ee");
    _TS01PM.Click_clickPayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("ebae7f9e-46b0-46c3-8685-5eeea8bb5d62");
    _TS01PM.Click_getPaymentoftheMonth();
    

    TestModellerLogger.SetLastNodeGuid("f55774c5-f633-4d69-ab9a-0b7fbe8c41f2");
    _TS01PM.Click_getPayeDuetoHMRC();
    

    TestModellerLogger.SetLastNodeGuid("ac25526b-82f3-476e-bf5e-499c212c792b");
    _TS01PM.Click_getCF();
    

    TestModellerLogger.SetLastNodeGuid("b272c10b-0df2-4dce-86b5-68ee1efeae5a");
    _TS01PM.Click_getBalBF();
    

    TestModellerLogger.SetLastNodeGuid("0941f51f-1bcd-4f48-b7cf-49c1354a6629");
    _TS01PM.Click_getTax();
    

    TestModellerLogger.SetLastNodeGuid("52b0313c-80b8-47fc-b55b-709a4b3d872b");
    _TS01PM.Click_getEE_NI();
    

    TestModellerLogger.SetLastNodeGuid("67c6520f-bd95-4fbc-9405-7cb6e72d19f1");
    _TS01PM.Click_getER_NI();
    

    }

}
