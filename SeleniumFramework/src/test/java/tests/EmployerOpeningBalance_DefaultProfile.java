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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6b1b3080-80ca-444c-a61b-7b6b8a9cbd28
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1346, profileId = 101213)
public class EmployerOpeningBalance_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"EmployerOpeningBalance","EmployerOpeningBalance - Default Profile"})
    @TestModellerPath(guid = "8d6c193e-a6ee-4933-b46a-4dbed3e8ca93")
    public void GoToUrlAssertUrlClickgotoOpeningBalancesEnterApprenticeshipLevyEnterCISSufferedEnterCISTaxEnt()
    {
        
        pages.EmployerOpeningBalance _EmployerOpeningBalance = new pages.EmployerOpeningBalance(driver);
    TestModellerLogger.SetLastNodeGuid("4dab2062-b5ce-46c6-969d-5179179e38b0");
    _EmployerOpeningBalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b5264ab4-7a5b-43b5-bdec-acc125b8024d");
    _EmployerOpeningBalance.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f49f925a-efac-428a-ba6b-99859090462b");
    _EmployerOpeningBalance.Click_gotoOpeningBalances();
    

    TestModellerLogger.SetLastNodeGuid("7f91ac73-bc7f-4298-ac6d-70741c2e15ff");
    _EmployerOpeningBalance.Enter_ApprenticeshipLevy("");
    

    TestModellerLogger.SetLastNodeGuid("1f94767a-a4df-4ede-9d06-b91e3f54ad8d");
    _EmployerOpeningBalance.Enter_CISSuffered("");
    

    TestModellerLogger.SetLastNodeGuid("b299ce53-1e1a-48eb-a5ff-e9ae5a0efb47");
    _EmployerOpeningBalance.Enter_CISTax("");
    

    TestModellerLogger.SetLastNodeGuid("08eeae53-5f62-461e-a8d2-4a329d3dc286");
    _EmployerOpeningBalance.Enter_TaxRefundFunding("");
    

    TestModellerLogger.SetLastNodeGuid("48896b60-2314-49d4-9472-a17c412b802d");
    _EmployerOpeningBalance.Enter_StatutoryPayRecovery("");
    

    TestModellerLogger.SetLastNodeGuid("64de2b64-d1f9-40d2-861e-b50cc0121824");
    _EmployerOpeningBalance.Enter_ActualPaidToHMRC("");
    

    TestModellerLogger.SetLastNodeGuid("eaf9a335-9b90-4c27-ad13-ac666e6a9f0d");
    _EmployerOpeningBalance.Enter_SMPRecovered("");
    

    TestModellerLogger.SetLastNodeGuid("11bbf2ba-b752-4afb-96b9-511ec8a6577e");
    _EmployerOpeningBalance.Enter_NICCompensationOnSMP("");
    

    TestModellerLogger.SetLastNodeGuid("522b1bf0-fca8-4f1b-9f66-892ab49f523f");
    _EmployerOpeningBalance.Enter_SPPRecovered("");
    

    TestModellerLogger.SetLastNodeGuid("015c9947-7935-40da-b3d3-96cab3c378ea");
    _EmployerOpeningBalance.Enter_NICCompensationOnSPP("");
    

    TestModellerLogger.SetLastNodeGuid("50f611cf-88bc-470b-bfd5-3a8d2277b751");
    _EmployerOpeningBalance.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("d66fda97-7031-40c3-a203-b39b859dfc94");
    _EmployerOpeningBalance.Click_gotoPayrollDashboard();
    

    }

}
