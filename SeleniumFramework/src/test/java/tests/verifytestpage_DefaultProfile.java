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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ccfe1da2-0698-48b8-a899-e988ff3dc3fb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1270, profileId = 101152)
public class verifytestpage_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"verifytestpage","verifytestpage - Default Profile"})
    @TestModellerPath(guid = "20947606-329a-4827-944d-ca9719bb5284")
    public void GoToUrlAssertUrlClickgotoPayrollDashboardClickCompanyDeRegisteredMessageClickgotoFilingManageme() throws Exception
    {
        
        pages.verifypage _verifypage = new pages.verifypage(driver);
    TestModellerLogger.SetLastNodeGuid("8966ec8c-5997-446f-8516-3d0395be64bb");
    _verifypage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1b6ac91c-411a-4da3-a48d-0e675c22edf6");
    _verifypage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ada05901-b7d7-428c-be1d-92efed88ee50");
    _verifypage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("0920bf51-30ea-40e7-9db0-4b1f44c63ae0");
    _verifypage.Click__Company_DeRegistered_Message();
    

    TestModellerLogger.SetLastNodeGuid("f29f7141-3b91-4fe0-8cc9-fa6c11dd5a0c");
    _verifypage.Click_gotoFilingManagement();
    

    }

}
