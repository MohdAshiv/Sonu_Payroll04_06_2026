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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/32a1fe01-d943-4360-a951-0e088330ebeb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1336, profileId = 101203)
public class openingBalanceEntry_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"openingBalanceEntry","openingBalanceEntry - Default Profile"})
    @TestModellerPath(guid = "711bae12-7a74-47ea-97d1-d9ad34c6bb9c")
    public void GoToUrlAssertUrlClickgotoOpeningBalancesEnterEnterTaxCodeEnterEnterGrosspayEnterEnterEmployeeN() throws InterruptedException
    {
        
        pages.OpeningBalanceEntry _OpeningBalanceEntry = new pages.OpeningBalanceEntry(driver);
    TestModellerLogger.SetLastNodeGuid("c2061167-b672-418c-8270-74c55625e599");
    _OpeningBalanceEntry.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c84ae8ff-1e8b-43c9-b473-abe4abb4762d");
    _OpeningBalanceEntry.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bbe20689-ce0a-48dc-922e-2026466ce2e1");
    _OpeningBalanceEntry.Click_gotoOpeningBalances();
    

    TestModellerLogger.SetLastNodeGuid("4d1752cb-7a92-497a-973d-0d86db3bf95c");
    _OpeningBalanceEntry.Enter_EnterTaxCode("");
    

    TestModellerLogger.SetLastNodeGuid("05fc3a41-91f8-4a92-8d3a-d5845a2fb747");
    _OpeningBalanceEntry.Enter_EnterGrosspay("");
    

    TestModellerLogger.SetLastNodeGuid("399ef982-7594-46fa-9acd-bd8af33ef5b7");
    _OpeningBalanceEntry.Enter_EnterEmployeeNI("");
    

    TestModellerLogger.SetLastNodeGuid("5cf13bac-fd99-4f57-a98e-e9855f383183");
    _OpeningBalanceEntry.Enter_EnterNetPay("");
    

    TestModellerLogger.SetLastNodeGuid("03743e17-778b-41ac-8fc3-e61963dcfa6b");
    _OpeningBalanceEntry.Enter_EnterELtoPT("");
    

    TestModellerLogger.SetLastNodeGuid("7ab82f35-00c7-499d-b91f-2b7bc55955d7");
    _OpeningBalanceEntry.Enter_EnterEmployeePension("");
    

    TestModellerLogger.SetLastNodeGuid("79b387b3-919f-4a8d-93c1-4e3b76637a53");
    _OpeningBalanceEntry.Enter_EmployerPension("");
    

    TestModellerLogger.SetLastNodeGuid("216e646f-e246-4182-8c83-64a98e547905");
    _OpeningBalanceEntry.Enter_PayrollGiving("");
    

    TestModellerLogger.SetLastNodeGuid("6494949b-f0ac-45bc-9e0f-4ec75144cef6");
    _OpeningBalanceEntry.Enter_StatutorySickPay("");
    

    TestModellerLogger.SetLastNodeGuid("6b71c5f6-57e6-4088-8e65-ee91ed927088");
    _OpeningBalanceEntry.Enter_StatutoryMaternityPay("");
    

    TestModellerLogger.SetLastNodeGuid("9ff70e6b-b8c2-4356-b1ba-6780c4c80887");
    _OpeningBalanceEntry.Enter_StatutoryPaternityPay("");
    

    TestModellerLogger.SetLastNodeGuid("2bcf41f5-8283-4ce7-981a-b79d935eb97c");
    _OpeningBalanceEntry.Select_NICategoryCode("A");
    

    TestModellerLogger.SetLastNodeGuid("71e9f445-7fc1-455d-bcee-afba9baa9189");
    _OpeningBalanceEntry.Enter_TaxDeducted("");
    

    TestModellerLogger.SetLastNodeGuid("db179e05-700b-4116-a995-9f2fe4d3f840");
    _OpeningBalanceEntry.Enter_EmployerNI("");
    

    TestModellerLogger.SetLastNodeGuid("53a73dd7-db66-41c7-baad-d05da2adbd98");
    _OpeningBalanceEntry.Enter_LEL("");
    

    TestModellerLogger.SetLastNodeGuid("e7c247f2-cf0d-41a5-bbec-a48c57cc0577");
    _OpeningBalanceEntry.Enter_PTtoUAP("");
    

    TestModellerLogger.SetLastNodeGuid("bcc6dd0c-2d2c-4529-aa86-bd304767db8e");
    _OpeningBalanceEntry.Enter_StudentLoan1("");
    

    TestModellerLogger.SetLastNodeGuid("a999e132-4b25-44e8-88c8-93a3309d12f0");
    _OpeningBalanceEntry.Enter_StudentLoan2("");
    

    TestModellerLogger.SetLastNodeGuid("a53ddfb1-b595-4ca9-9886-909365ab18d5");
    _OpeningBalanceEntry.Enter_StudentLoan4("");
    

    TestModellerLogger.SetLastNodeGuid("5cf76664-5ce6-44e1-90f5-de7760e14279");
    _OpeningBalanceEntry.Enter_PostgradLoan("");
    

    TestModellerLogger.SetLastNodeGuid("2fd73b40-5b8c-46e3-a33f-61121e765b0d");
    _OpeningBalanceEntry.Enter_SharedParentingPay("");
    

    TestModellerLogger.SetLastNodeGuid("cbc223c2-ff00-48d5-8645-4c864b6391d3");
    _OpeningBalanceEntry.Enter_StatutoryAdoptionPay("");
    

    TestModellerLogger.SetLastNodeGuid("704dbc9e-3dd5-4a84-a3ea-262177cc2795");
    _OpeningBalanceEntry.Enter_PayrolledBIKClass1a("");
    

    TestModellerLogger.SetLastNodeGuid("745afab3-421b-4552-b5c1-dd6696b64b00");
    _OpeningBalanceEntry.Enter_PayrolledBIKNotClass1a("");
    

    TestModellerLogger.SetLastNodeGuid("0fa1e3b9-9a3a-407d-9c14-a658d6a3d5e4");
    _OpeningBalanceEntry.Click_clickSave();
    

    }

}
