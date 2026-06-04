package tests1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f3f7e13c-ebfe-4a31-baf2-a61502ac7c97
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1387, profileId = 101255)
public class PaymentManagement_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"PaymentManagement","PaymentManagement - Default Profile"})
    @TestModellerPath(guid = "1c5b9fe2-cfed-42cc-9ee9-d19e0df4db10")
    public void GoToUrlAssertUrlClickSelectPaymentManagementYesClickclickSaveClickgotoTaxPaymentClickclickHMRC() throws InterruptedException
    {
        
        pages1.PaymentManagement _PaymentManagement = new pages1.PaymentManagement(driver);
    TestModellerLogger.SetLastNodeGuid("d14acd4d-39eb-4d7f-84b9-fa3b0a0c67fe");
    _PaymentManagement.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a306ead-d6b9-447c-9bc8-baa83f106cbc");
    _PaymentManagement.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d6c5946-cd14-49ae-90bd-0b9629c78f5f");
    _PaymentManagement.Click_SelectPaymentManagementYes();
    

    TestModellerLogger.SetLastNodeGuid("b6a88c2c-ef8f-40d8-aaef-fdf497500c8d");
    _PaymentManagement.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("4906364b-7b2c-4239-84e8-da251b4cd428");
    _PaymentManagement.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("5d3939ba-c0a6-4961-8550-f94bc1c7bc95");
    _PaymentManagement.Click_clickHMRCPaymentsMade();
    

    TestModellerLogger.SetLastNodeGuid("dbb472d3-f132-46a7-b49c-50838ad11f27");
    _PaymentManagement.Enter_EnterNICActualPaidAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("133099b4-ac82-4125-9edc-f4ae24e459d9");
    _PaymentManagement.Click_clickSave_1();
    

    TestModellerLogger.SetLastNodeGuid("8180aea7-3494-4e98-af58-0f9684375c79");
    _PaymentManagement.Click_DownloadExport_to_PDF();
    

    }

}
