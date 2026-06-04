package _1744CISDSBTest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/24f5c23f-0e16-4d00-99b1-35e312869cc3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1804, profileId = 102282)
public class CISDashboard_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"CIS_Dashboard","CIS_Dashboard - Default Profile"})
    @TestModellerPath(guid = "5ed77ec0-4319-46a0-bf66-03fc3d051811")
    public void GoToUrlAssertUrlClickgotoCISClickCISDashboardClickDueSubmissionPositiveEnterCompanyNameinDueSu() throws InterruptedException
    {
        
    	_1744CISDSB.CIS_Dashboard _CIS_Dashboard = new _1744CISDSB.CIS_Dashboard(driver);
    TestModellerLogger.SetLastNodeGuid("590492e8-cb79-41c6-8420-676786fbc9d9");
    _CIS_Dashboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca53e640-a341-496b-9da1-e7cdd04120f1");
    _CIS_Dashboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fe2b4ba1-52cf-473b-bfe1-55a22806dfdd");
    _CIS_Dashboard.Click_gotoCIS();
    

    TestModellerLogger.SetLastNodeGuid("72f2a607-7bb7-4908-9100-959f8a7536f9");
    _CIS_Dashboard.Click_CIS_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("4da80ce9-d319-48dd-963f-f12d41f699da");
    _CIS_Dashboard.Click_DueSubmission();
    

    TestModellerLogger.SetLastNodeGuid("a0f704cd-b00a-42ee-912d-a2bef41e0aa0");
    _CIS_Dashboard.Enter_CompanyNameinDueSubmission("Lockman Group");
    

    TestModellerLogger.SetLastNodeGuid("f8425e60-2ffc-428e-a3fc-e724a9568d78");
    _CIS_Dashboard.Click_SearchDueSubmission();
    

    TestModellerLogger.SetLastNodeGuid("4a2d032e-d34f-41b2-abe9-760bca01c2cb");
    _CIS_Dashboard.Click_OverDueReturns();
    

    TestModellerLogger.SetLastNodeGuid("9c8145b5-9f36-470e-a2cc-ec3f6c551618");
    _CIS_Dashboard.Select_FilingPeriodofOverdueReturn("06-Mar-22 - 05-Apr-22");
    

    TestModellerLogger.SetLastNodeGuid("fab249ae-60b7-494c-9ea5-91fdafb64114");
    _CIS_Dashboard.Click_SearchOverdueReturn();
    

    TestModellerLogger.SetLastNodeGuid("b594569a-1d4b-43b6-a1e7-ede1bce42153");
    _CIS_Dashboard.Click_UpcomingReturns();
    

    TestModellerLogger.SetLastNodeGuid("45affbe7-8a3f-4997-aa25-2342e171c4ec");
    _CIS_Dashboard.Select_ContractorinUpercomingReturn("1399");
    

    TestModellerLogger.SetLastNodeGuid("8d131ad4-9451-4478-9cd3-084ddc4c5927");
    _CIS_Dashboard.Click_FailedSubmission();
    

    TestModellerLogger.SetLastNodeGuid("54b55699-0e1e-4315-b3c3-76c80ea41c25");
    _CIS_Dashboard.Click_TotalContractor();
    

    TestModellerLogger.SetLastNodeGuid("32bbbcbe-8752-4be2-a3bb-89b6a569dc8d");
    _CIS_Dashboard.Enter_SearchContractorNameTotalContractor("sunt");
    

    TestModellerLogger.SetLastNodeGuid("7d830579-9d91-4a3a-8b30-bcb0974306ee");
    _CIS_Dashboard.Click_Add_Contractor();
    

    TestModellerLogger.SetLastNodeGuid("d995315f-0078-4733-a963-f398242f4c8d");
    _CIS_Dashboard.Enter_CompanyNameinDueSubmission("Hodkiewicz, Bednar and Effertz");
    

    TestModellerLogger.SetLastNodeGuid("14e61234-f9b3-4ae3-9fd1-25770fef96fd");
    _CIS_Dashboard.Enter_ContractoeFirstName("Bella");
    

    TestModellerLogger.SetLastNodeGuid("7fbb74e7-5b9e-4162-b041-9d2431007765");
    _CIS_Dashboard.Enter_ContractorSurName("molestias");
    

    TestModellerLogger.SetLastNodeGuid("e42fbf2e-cba2-45e0-bb6a-855d424f229f");
    _CIS_Dashboard.Enter_OfficeNo("");
    

    TestModellerLogger.SetLastNodeGuid("ab0107de-810b-49fd-9e40-6ff7b93423a6");
    _CIS_Dashboard.Enter_AccountOffRefNo("");
    

    TestModellerLogger.SetLastNodeGuid("03d7f301-12cb-406b-b1d3-d0d93c7bfc54");
    _CIS_Dashboard.Enter_UtrNo("");
    

    TestModellerLogger.SetLastNodeGuid("12ddedfa-f338-4077-bcb4-928ddcf98fef");
    _CIS_Dashboard.Click_Submit();
    

    }

}