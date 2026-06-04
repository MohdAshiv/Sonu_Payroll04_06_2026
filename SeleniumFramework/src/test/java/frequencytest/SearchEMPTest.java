package frequencytest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0b3c6fec-fbf1-4f8f-8d9d-f3444ef19e0b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1445, profileId = 101328)
public class SearchEMPTest extends TestBase
{
    

    
    @Test  (groups= {"EMPSearchAndPaternitypage","EMPSearchAndPaternitypage - Default Profile"})
    @TestModellerPath(guid = "25905974-1b3d-44ea-9046-159b954b49b6")
    public void GoToUrlAssertUrlClickclickEmployeeListPositiveSelectselectEmployeeStatusClickclickSearchClickc1()
    {
        
    	frequency.SearchEMPpage _EMPSearchAndPaternitypage = new frequency.SearchEMPpage(driver);
    TestModellerLogger.SetLastNodeGuid("ee6fc556-3512-4412-9904-d58bd2cfb66c");
    _EMPSearchAndPaternitypage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("aa2da3d8-bc12-411e-aeaa-da354ddc631a");
    _EMPSearchAndPaternitypage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7cb4ab9c-9920-4049-bbb2-cfffbbc1c65f");
    _EMPSearchAndPaternitypage.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("3fd95f28-2ee3-423e-bb39-696f925e309a");
    _EMPSearchAndPaternitypage.Select_selectEmployeeStatus("Current Employees");
    

    TestModellerLogger.SetLastNodeGuid("ffc5a6e7-cc13-493e-86f2-6023149d1833");
    _EMPSearchAndPaternitypage.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("b69f3861-c4f1-4301-91c4-586a41760159");
    _EMPSearchAndPaternitypage.Click_clickonEmpName();
    

    TestModellerLogger.SetLastNodeGuid("de2cc3a7-c470-441a-ba87-11d78ae67dce");
    _EMPSearchAndPaternitypage.Click_clickAddLeave();
    

    TestModellerLogger.SetLastNodeGuid("a14172e9-1561-4387-98c4-92da9340e9ec");
    _EMPSearchAndPaternitypage.Enter_getStartDatePaternity("44310");
    

    TestModellerLogger.SetLastNodeGuid("9de4e8e1-253c-4606-812a-164e3afff48e");
    _EMPSearchAndPaternitypage.Enter_getEndDatePaternity("44310.307184953701");
    

    }

 /*   @Test  (groups= {"EMPSearchAndPaternitypage","EMPSearchAndPaternitypage - Default Profile"})
    @TestModellerPath(guid = "cc061d5c-462c-48f2-914f-1fd225c06e05")
    public void GoToUrlAssertUrlClickclickEmployeeListPositiveSelectselectEmployeeStatusClickclickSearchClickc2()
    {
        
        pages.EMPSearchAndPaternitypage _EMPSearchAndPaternitypage = new pages.EMPSearchAndPaternitypage(driver);
    TestModellerLogger.SetLastNodeGuid("ee6fc556-3512-4412-9904-d58bd2cfb66c");
    _EMPSearchAndPaternitypage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("aa2da3d8-bc12-411e-aeaa-da354ddc631a");
    _EMPSearchAndPaternitypage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7cb4ab9c-9920-4049-bbb2-cfffbbc1c65f");
    _EMPSearchAndPaternitypage.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("3fd95f28-2ee3-423e-bb39-696f925e309a");
    _EMPSearchAndPaternitypage.Select_selectEmployeeStatus("Current Employees");
    

    TestModellerLogger.SetLastNodeGuid("ffc5a6e7-cc13-493e-86f2-6023149d1833");
    _EMPSearchAndPaternitypage.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("b69f3861-c4f1-4301-91c4-586a41760159");
    _EMPSearchAndPaternitypage.Click_clickonEmpName();
    

    TestModellerLogger.SetLastNodeGuid("de2cc3a7-c470-441a-ba87-11d78ae67dce");
    _EMPSearchAndPaternitypage.Click_clickAddLeave();
    

    TestModellerLogger.SetLastNodeGuid("a14172e9-1561-4387-98c4-92da9340e9ec");
    _EMPSearchAndPaternitypage.Enter_getStartDatePaternity("44310.307184953701");
    

    TestModellerLogger.SetLastNodeGuid("9de4e8e1-253c-4606-812a-164e3afff48e");
    _EMPSearchAndPaternitypage.Enter_getEndDatePaternity("44310.307184953701");
    

    }

    @Test  (groups= {"EMPSearchAndPaternitypage","EMPSearchAndPaternitypage - Default Profile"})
    @TestModellerPath(guid = "04214a42-5b0e-4a6a-92a2-76c267158cc9")
    public void GoToUrlAssertUrlClickclickEmployeeListPositiveSelectselectEmployeeStatusClickclickSearchClickc3()
    {
        
        pages.EMPSearchAndPaternitypage _EMPSearchAndPaternitypage = new pages.EMPSearchAndPaternitypage(driver);
    TestModellerLogger.SetLastNodeGuid("ee6fc556-3512-4412-9904-d58bd2cfb66c");
    _EMPSearchAndPaternitypage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("aa2da3d8-bc12-411e-aeaa-da354ddc631a");
    _EMPSearchAndPaternitypage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7cb4ab9c-9920-4049-bbb2-cfffbbc1c65f");
    _EMPSearchAndPaternitypage.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("3fd95f28-2ee3-423e-bb39-696f925e309a");
    _EMPSearchAndPaternitypage.Select_selectEmployeeStatus("Current Employees");
    

    TestModellerLogger.SetLastNodeGuid("ffc5a6e7-cc13-493e-86f2-6023149d1833");
    _EMPSearchAndPaternitypage.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("b69f3861-c4f1-4301-91c4-586a41760159");
    _EMPSearchAndPaternitypage.Click_clickonEmpName();
    

    TestModellerLogger.SetLastNodeGuid("de2cc3a7-c470-441a-ba87-11d78ae67dce");
    _EMPSearchAndPaternitypage.Click_clickAddLeave();
    

    TestModellerLogger.SetLastNodeGuid("a14172e9-1561-4387-98c4-92da9340e9ec");
    _EMPSearchAndPaternitypage.Enter_getStartDatePaternity("44310.307184953701");
    

    TestModellerLogger.SetLastNodeGuid("9de4e8e1-253c-4606-812a-164e3afff48e");
    _EMPSearchAndPaternitypage.Enter_getEndDatePaternity("44310.307184953701");
    

    }
*/
}
