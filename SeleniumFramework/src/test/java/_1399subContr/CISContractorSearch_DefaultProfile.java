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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6ed8c294-af85-41e1-96dd-fbbef9f8ac6d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1608, profileId = 101751)
public class CISContractorSearch_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"CISContractorSearch","CISContractorSearch - Default Profile"})
    @TestModellerPath(guid = "5f42c039-7ba4-4582-9d1d-eba048e41dde")
    public void GoToUrlAssertUrlClickclickCISClickclickContractorListPositiveEnterEnterContractorNameClickSear()
    {
        
    	_1399subContr.CISContrctorSearch _CISContrctorSearch = new _1399subContr.CISContrctorSearch(driver);
    TestModellerLogger.SetLastNodeGuid("3e3bf5fe-6c31-48f8-86d7-19fa3fc63234");
    _CISContrctorSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2da2f92a-b5eb-4fc7-9844-f31e173db2be");
    _CISContrctorSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ebdefc4d-ae35-40b5-96f9-386aff9dd658");
    _CISContrctorSearch.Click_clickCIS();
    

    TestModellerLogger.SetLastNodeGuid("85b6fb06-eabe-42c6-9786-713b81636869");
    _CISContrctorSearch.Click_clickContractorList();
    

    TestModellerLogger.SetLastNodeGuid("3a82676f-048d-4d69-bf1b-6fbe160ea282");
    _CISContrctorSearch.Enter_EnterContractorName("voluptas");
    

    TestModellerLogger.SetLastNodeGuid("e4b3696d-5ae4-44e5-8eff-65b04c075a46");
    _CISContrctorSearch.Click_SearchContractorname();
    

    TestModellerLogger.SetLastNodeGuid("ae741c88-e2dd-4be9-a495-95bd77fbc081");
    _CISContrctorSearch.Click_Clickoncontractor();
    

    }

}
