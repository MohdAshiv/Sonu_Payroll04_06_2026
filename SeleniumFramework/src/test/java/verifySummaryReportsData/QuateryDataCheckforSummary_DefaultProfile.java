package verifySummaryReportsData;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fab4a917-4351-4f38-b12c-d6c0637c1e59
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1681, profileId = 101973)
public class QuateryDataCheckforSummary_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"QuateryDataCheckforSummary","QuateryDataCheckforSummary - Default Profile"})
    @TestModellerPath(guid = "d3bd508a-6c70-48ac-9752-f081e651083c")
    public void GoToUrlAssertUrlPositiveSelectselectTaxYearsPositiveSelectselectPayrollDateClickgetPaymentsCli()
    {
        
    	verifySummaryReportData.QuarteryDataCheckforSummary _QuarteryDataCheckforSummary = new verifySummaryReportData.QuarteryDataCheckforSummary(driver);
    TestModellerLogger.SetLastNodeGuid("c1a0d473-fbc6-4a32-8e89-07045e2898d0");
    _QuarteryDataCheckforSummary.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b35f5b17-946f-4365-8b61-fa8f145863be");
    _QuarteryDataCheckforSummary.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4575d0b4-2644-47c6-910c-776f8c4d6761");
    _QuarteryDataCheckforSummary.Select_selectTaxYears("2020-2021");
    

    TestModellerLogger.SetLastNodeGuid("4b4e06c8-85f4-446b-89bc-1b95a1307d9e");
    _QuarteryDataCheckforSummary.Select_selectPayrollDate("5/4/2021 12:00:00 AM");
    

//    TestModellerLogger.SetLastNodeGuid("80ddd6c1-167d-404b-83c3-e5b907224aa6");
//    _QuarteryDataCheckforSummary.Click_getPayments();
//    
//
//    TestModellerLogger.SetLastNodeGuid("43ea4fa8-161b-4fea-b41b-fe835c15208c");
//    _QuarteryDataCheckforSummary.Click_getTax();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41bd6c8b-fef2-463e-9153-3b348af154ba");
//    _QuarteryDataCheckforSummary.Click_getEmployeeNI();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a9fe747-e43e-4a1e-9b0f-8e26d10a1216");
//    _QuarteryDataCheckforSummary.Click_getERNI();
    

    }

}
