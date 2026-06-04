package _1995subContractorPayReportTest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2cecaa51-b6f1-42d3-8f7c-a0bfe602b328
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1626, profileId = 101802)
public class _1995subcontractorPayReport_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"_1995subcontractorPayReport","_1995subcontractorPayReport - Default Profile"})
    @TestModellerPath(guid = "8b7d6d6d-3a38-4b18-a891-1dceb39ccb30")
    public void GoToUrlAssertUrlClickgotoCISReportsClickclickAllSubcontractorsPayTotalsPositiveSelectselectPeri()
    {
        
    	_1995subContractorPayreport._1995subcontractorPayReport __1995subcontractorPayReport = new _1995subContractorPayreport._1995subcontractorPayReport(driver);
    TestModellerLogger.SetLastNodeGuid("bbd9f4a3-2f69-4fb4-a369-d256fbfa547b");
    __1995subcontractorPayReport.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("12320bfb-0954-4523-9eff-b4f8265cc6c6");
    __1995subcontractorPayReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5bc72705-6b1c-43c2-801b-ec51d9356242");
    __1995subcontractorPayReport.Click_gotoCISReports();
    

    TestModellerLogger.SetLastNodeGuid("0f1921f1-746c-45d5-873b-9ba96dc1208b");
    __1995subcontractorPayReport.Click_clickAll_Subcontractors_Pay_Totals();
    

    TestModellerLogger.SetLastNodeGuid("bb239a24-5acf-48be-aa1e-7d6e35787d57");
    __1995subcontractorPayReport.Select_selectPeriod("06-Jun-21 - 05-Jul-21");
    

    TestModellerLogger.SetLastNodeGuid("9df89dcd-bd87-4b65-bc56-8969f5efe6f5");
    __1995subcontractorPayReport.Click_getsubContractorList();
    

    TestModellerLogger.SetLastNodeGuid("32d52cc1-9b88-4429-8200-8260a10fea09");
    __1995subcontractorPayReport.Click_gotoCISReports();
    

    TestModellerLogger.SetLastNodeGuid("5b44f846-d5cb-48d3-b3e6-232b71d6a830");
    __1995subcontractorPayReport.Click_clickCIS300_Monthly_Return_Report();
    

    TestModellerLogger.SetLastNodeGuid("23d1a961-2afd-4024-a56c-67019fb1ef22");
    __1995subcontractorPayReport.Select_selectPeriod("06-Jun-21 - 05-Jul-21");
    

    TestModellerLogger.SetLastNodeGuid("6b567461-fb33-4200-9b93-1dc1bd01b591");
    __1995subcontractorPayReport.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("0e123805-66d6-4ce7-87ed-4b2177eeb81d");
    __1995subcontractorPayReport.Click_mtchsubContractor();
    

    }

}
