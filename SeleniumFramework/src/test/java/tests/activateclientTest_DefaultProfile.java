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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/067e9363-8f34-41c5-a7da-62c77debff8d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1268, profileId = 101150)
public class activateclientTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"activateclientTest","activateclientTest - Default Profile"})
    @TestModellerPath(guid = "28a011be-af4f-4ffe-9834-cca1c2faafbe")
    public void GoToUrlAssertUrlClickClickPayrollClickClickEditompanyClickClickIsActiveClickClickPayrollDetail1() throws Exception
    {
        
        pages.activateclient _activateclient = new pages.activateclient(driver);
    TestModellerLogger.SetLastNodeGuid("af7e7d38-6db8-4612-a614-92367b2e8864");
    _activateclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00360c19-f247-46f6-b835-dc296d6de27c");
    _activateclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f5d141aa-09d8-4cf9-83ea-84de3db35103");
    _activateclient.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("66e35596-28e8-41e6-ae3d-0c86893f33c7");
    _activateclient.Click_ClickEditompany();
    

    TestModellerLogger.SetLastNodeGuid("a170b91d-0f36-482c-ac35-ca4009a43c7d");
    _activateclient.Click_ClickIsActive("123");
    

    TestModellerLogger.SetLastNodeGuid("77c1b262-32d1-4ad3-b234-6fdd49d0c45c");
    _activateclient.Click_ClickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("16c3aae5-914a-4920-8782-aaf04dddafa7");
    _activateclient.Enter_PayeRegDate("44274");
    

    TestModellerLogger.SetLastNodeGuid("49641995-e8db-4e04-b720-48a5eb30c817");
    _activateclient.Enter_PayeRefNo1("");
    

    TestModellerLogger.SetLastNodeGuid("9dd82b39-8500-492c-9036-14160c2cb23f");
    _activateclient.Enter_PayeRefNo2("");
    

    TestModellerLogger.SetLastNodeGuid("e3838f3e-3965-4915-a86d-1c1dd6c817dc");
    _activateclient.Enter_AccountsOfcRef("");
    

    TestModellerLogger.SetLastNodeGuid("75fd8418-4929-49e4-8500-3638e509a0f4");
    _activateclient.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("1e4ccf7b-fac1-4d0f-87c9-9a25924edaff");
    _activateclient.Click_GotoPayrollDashboard();
    

    }

    @Test  (groups= {"activateclientTest","activateclientTest - Default Profile"})
    @TestModellerPath(guid = "a0bd8054-58ae-497f-8269-994ff2bca3ca")
    public void GoToUrlAssertUrlClickClickPayrollClickClickEditompanyClickClickIsActiveClickClickPayrollDetail2() throws Exception
    {
        
        pages.activateclient _activateclient = new pages.activateclient(driver);
    TestModellerLogger.SetLastNodeGuid("af7e7d38-6db8-4612-a614-92367b2e8864");
    _activateclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00360c19-f247-46f6-b835-dc296d6de27c");
    _activateclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f5d141aa-09d8-4cf9-83ea-84de3db35103");
    _activateclient.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("66e35596-28e8-41e6-ae3d-0c86893f33c7");
    _activateclient.Click_ClickEditompany();
    

    TestModellerLogger.SetLastNodeGuid("a170b91d-0f36-482c-ac35-ca4009a43c7d");
    _activateclient.Click_ClickIsActive("123");
    

    TestModellerLogger.SetLastNodeGuid("77c1b262-32d1-4ad3-b234-6fdd49d0c45c");
    _activateclient.Click_ClickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("16c3aae5-914a-4920-8782-aaf04dddafa7");
    _activateclient.Enter_PayeRegDate("44274.532582685184");
    

    TestModellerLogger.SetLastNodeGuid("49641995-e8db-4e04-b720-48a5eb30c817");
    _activateclient.Enter_PayeRefNo1("");
    

    TestModellerLogger.SetLastNodeGuid("9dd82b39-8500-492c-9036-14160c2cb23f");
    _activateclient.Enter_PayeRefNo2("");
    

    TestModellerLogger.SetLastNodeGuid("e3838f3e-3965-4915-a86d-1c1dd6c817dc");
    _activateclient.Enter_AccountsOfcRef("");
    

    TestModellerLogger.SetLastNodeGuid("75fd8418-4929-49e4-8500-3638e509a0f4");
    _activateclient.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("1e4ccf7b-fac1-4d0f-87c9-9a25924edaff");
    _activateclient.Click_GotoPayrollDashboard();
    

    }

}
