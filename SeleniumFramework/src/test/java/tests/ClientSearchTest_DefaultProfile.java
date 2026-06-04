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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e44fc71b-636c-4d9e-9dd0-091cc3cfa159
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1263, profileId = 101147)
public class ClientSearchTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ClientSearchTest","ClientSearchTest - Default Profile"})
    @TestModellerPath(guid = "78277cb3-7101-4774-8dd2-6a5cd345ba6e")
    public void GoToUrlAssertUrlEnterSearchClientClickClickSearchButtonClickClickOnClientWorkbook()
    {
        
        pages.ClientSearch _ClientSearch = new pages.ClientSearch(driver);
    TestModellerLogger.SetLastNodeGuid("93d78480-9d69-44c5-9114-93ac41edde1e");
    _ClientSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("31f196ed-365a-4fe5-b626-b84e20a41039");
    _ClientSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4009589f-046a-4b1a-8be0-aea1043e0b4a");
    _ClientSearch.Enter_SearchClient("");
    

    TestModellerLogger.SetLastNodeGuid("e1744d6b-046c-4443-98ee-5fe688fea1d7");
    _ClientSearch.Click_ClickSearchButton();
    

    TestModellerLogger.SetLastNodeGuid("e639f1a8-5246-459f-9b3f-1bd5aba900d6");
    _ClientSearch.Click_ClickOnClientWorkbook();
    

    }

}
