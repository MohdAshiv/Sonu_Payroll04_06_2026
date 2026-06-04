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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4c9319e2-e1bc-4f37-95e4-4a886013eea0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1398, profileId = 101265)
public class AddContractorInCIS_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"AddContractorInCIS","AddContractorInCIS - Default Profile"})
    @TestModellerPath(guid = "17a216a0-c3df-4509-97ea-a251b44fb3db")
    public void GoToUrlAssertUrlClickClickAddContractorPositiveEnterContractorNamePositiveEnterContractoeFirstN() throws Exception
    {
        
        pages1.AddContractorInCIS _AddContractorInCIS = new pages1.AddContractorInCIS(driver);
    TestModellerLogger.SetLastNodeGuid("aa0abf47-7b40-4ce7-b49e-4c9a5fd79a4d");
    _AddContractorInCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("66d48b05-0678-4807-a2fc-7a1e7f8171c0");
    _AddContractorInCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("368dbed2-d526-4356-8cb7-7d494de7ed1c");
    _AddContractorInCIS.Click_ClickAddContractor();
    

    TestModellerLogger.SetLastNodeGuid("eb1f3047-8759-43a5-a68d-2b6beb5c45e6");
    _AddContractorInCIS.Enter_ContractorName("animi");
    

    TestModellerLogger.SetLastNodeGuid("d70bf4ad-e847-4221-a8bc-d860d3ef2984");
    _AddContractorInCIS.Enter_ContractoeFirstName("Earl");
    

    TestModellerLogger.SetLastNodeGuid("43b812d1-57d5-4b5d-8db0-ebcf782e1ac1");
    _AddContractorInCIS.Enter_ContractorSurName("maiores");
    

    TestModellerLogger.SetLastNodeGuid("b7fff08a-4829-4c39-93c8-ac6ca73c6731");
    _AddContractorInCIS.Enter_ContractorRefNo("");
    

    TestModellerLogger.SetLastNodeGuid("97b0841b-eb69-41c8-abe0-9eb0c90b12ab");
    _AddContractorInCIS.Enter_HMRCOfficeNo("");
    

    TestModellerLogger.SetLastNodeGuid("b0551459-39d5-4e9d-807a-3338b62e67e9");
    _AddContractorInCIS.Enter_AccountOffRefNo("");
    

    TestModellerLogger.SetLastNodeGuid("4b979a93-91c0-4344-862b-d0c613e6cab0");
    _AddContractorInCIS.Enter_UtrNo("");
    

    TestModellerLogger.SetLastNodeGuid("622701e9-f935-4e56-9b8f-cfcf23a45206");
    _AddContractorInCIS.Enter_PhoneNo("1-373-718-4273");
    

    TestModellerLogger.SetLastNodeGuid("476dfdde-48b3-4149-b9e3-fbe1d0dafa6e");
    _AddContractorInCIS.Enter_EmailId("#NAME?");
    

    TestModellerLogger.SetLastNodeGuid("e13c312a-702a-4357-9c0a-521a2d712690");
    _AddContractorInCIS.Enter_Address1("8789 Franecki Corner, New Vicky, New Zealand");
    

    TestModellerLogger.SetLastNodeGuid("42564e4d-4bb1-4613-b314-3f62c5144fed");
    _AddContractorInCIS.Enter_Address2("3282 Ledner Village, Codyside, Venezuela");
    

    TestModellerLogger.SetLastNodeGuid("4fa581ba-5685-48ea-889c-c08ce8c712fe");
    _AddContractorInCIS.Enter_PostCode("43262-0788");
    

    TestModellerLogger.SetLastNodeGuid("f0f2d532-69cc-466c-b5d9-26767b665ec2");
    _AddContractorInCIS.Click_ClickSave();
    

    }

}
