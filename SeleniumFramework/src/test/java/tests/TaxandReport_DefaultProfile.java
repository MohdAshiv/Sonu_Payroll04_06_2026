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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/534d93a0-9af2-4acb-afc7-8614114d167d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1337, profileId = 101204)
public class TaxandReport_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"TaxandReport","TaxandReport - Default Profile"})
    @TestModellerPath(guid = "47c1b170-493d-4f23-8ad3-c026354d7f83")
    public void GoToUrlAssertUrlClickgotoPayrollDashboardClickRunPayroll1ClickRunPayroll2ClickgotoTaxPaymentC() throws Exception
    {
        
        pages.TaxAndReport _TaxAndReport = new pages.TaxAndReport(driver);
    TestModellerLogger.SetLastNodeGuid("51fb1800-036a-4452-b049-f8b02abe4d69");
    _TaxAndReport.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("977d41f8-b4e2-4e7e-b0d5-b7d550215beb");
    _TaxAndReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9c70c2d-a863-4b0c-b97a-91488f412253");
    _TaxAndReport.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("7f6fb047-d5bc-47cc-9119-0e6aec70bbf4");
    _TaxAndReport.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("c6835075-372f-4eb6-81d9-fc561aee0ccc");
    _TaxAndReport.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("518036f6-42e4-48ef-81be-8d5d993ae294");
    _TaxAndReport.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("956b7072-33c4-4a67-b480-2043c99484d9");
    _TaxAndReport.Click_clickExporttoPDF();
    

    TestModellerLogger.SetLastNodeGuid("63af41d9-6bd2-461f-bf65-cd4ad17a8ca7");
    _TaxAndReport.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("1aeb3e46-f37b-4596-ae6d-bba764c13be0");
    _TaxAndReport.Click_clickP11();
    

    TestModellerLogger.SetLastNodeGuid("75096b09-fb87-4c76-a471-f37a047f05d3");
    _TaxAndReport.Click_ExporttoPDF2();
    

    TestModellerLogger.SetLastNodeGuid("9023de17-23e0-40a1-8bfe-f449404f838e");
    _TaxAndReport.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("414cc8b6-3ec0-4df2-865d-b222bc565e54");
    _TaxAndReport.Click_clickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("7529f9a6-6da8-465b-ada8-6046616e418b");
    _TaxAndReport.Click_downloadPayslip();
    

    }

}
