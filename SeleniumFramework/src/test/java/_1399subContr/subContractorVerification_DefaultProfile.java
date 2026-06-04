package _1399subContr;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3f7ceef3-12f4-42f5-a69e-04524a7d50a5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1609, profileId = 101754)
public class subContractorVerification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"subContractorVerification","subContractorVerification - Default Profile"})
    @TestModellerPath(guid = "2b9c6c78-a1f4-40a6-a06a-ccfb5adf7da3")
    public void GoToUrlAssertUrlClickclickAddSubcontractorPositiveEnterEnterFirstNamePositiveEnterEnterLastName() throws InterruptedException
    {
        
    	_1399subContr.subContractorverification _subContractorverification = new _1399subContr.subContractorverification(driver);
    TestModellerLogger.SetLastNodeGuid("e8e1640a-74ea-4d31-aeba-45c31ee991bf");
    _subContractorverification.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94c63ec8-12b2-447b-9bf6-5a097df4f2ec");
    _subContractorverification.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b6ff8d8d-4f3e-4b62-aca4-11c2a96cb87e");
    _subContractorverification.Click_clickAddSubcontractor();
    

    TestModellerLogger.SetLastNodeGuid("1d3c3272-3bdd-45a4-8e00-342591cb7d28");
    _subContractorverification.Enter_EnterFirstName("Luz");
    

    TestModellerLogger.SetLastNodeGuid("b34e4e54-bd09-47e1-aef5-82e00c4d9d0d");
    _subContractorverification.Enter_EnterLastName("Gusikowski");
    

    TestModellerLogger.SetLastNodeGuid("abe7e1ba-9376-4ae5-8be0-f29e3d4d3e5d");
    _subContractorverification.Select_selectBusinessType("Sole Trader");
    

    TestModellerLogger.SetLastNodeGuid("e8a9e8d8-6f2f-41c2-9c4b-5264a553977e");
    _subContractorverification.Enter_EnterTradingName("cupiditate");
    

    TestModellerLogger.SetLastNodeGuid("307fe8f1-c33c-4c51-8e59-d1d804d66834");
    _subContractorverification.Enter_EnterUTRNo("");
    

    TestModellerLogger.SetLastNodeGuid("73d8a4b8-3c94-4e41-931f-2752adf426dd");
    _subContractorverification.Click_clickVerifySubcontractor();
    

    TestModellerLogger.SetLastNodeGuid("59d85d2f-aafc-42b8-9aa8-1fd5900066cd");
    _subContractorverification.Enter_getVrrificationStus();
    

    TestModellerLogger.SetLastNodeGuid("aa33525c-0095-4125-82b4-3178d81ae2e5");
    _subContractorverification.Enter_getVryficationDate();
    

    TestModellerLogger.SetLastNodeGuid("23091044-ea48-4aec-bf30-e956741f7085");
    _subContractorverification.Select_getDeductionRate();
    

    TestModellerLogger.SetLastNodeGuid("fd43fb5a-5876-4bb2-a318-841af49b9e09");
    _subContractorverification.Click_clickSave();
    

    }

}
