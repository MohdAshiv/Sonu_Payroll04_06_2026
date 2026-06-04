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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b55014e7-3d47-46ae-8286-6371035698fc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1332, profileId = 101200)
public class AutomaticPayslip2_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"automaticPayslip","automaticPayslip - Default Profile"})
    @TestModellerPath(guid = "f67f66a3-946f-49e9-adc7-4b45de8a127b")
    public void GoToUrlAssertUrlClickBtnEnableAutorunClickContinue1PositiveSelectSelectEmailModeClicktapYesCl() throws Exception
    {
        
        pages.automaticPayroll _automaticPayroll = new pages.automaticPayroll(driver);
    TestModellerLogger.SetLastNodeGuid("fd1751d6-c8f1-4f81-8bab-e348b93e3e4f");
    _automaticPayroll.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36e6d83b-c2c5-4d86-91b1-d1651e69e73e");
    _automaticPayroll.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("95c8898d-35f7-43ac-9397-c8ac5e4afb3c");
    _automaticPayroll.Click_BtnEnableAutorun();
    

    TestModellerLogger.SetLastNodeGuid("4f461bf5-5e84-45d0-a37c-8acd1ba89691");
    _automaticPayroll.Click_Continue1();
    

    TestModellerLogger.SetLastNodeGuid("8c70e24e-0749-4128-81b1-2fa170386665");
    _automaticPayroll.Select_SelectEmailMode("Email Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("8b44bd5b-d2d8-4e1a-bd31-c8b0480d43cf");
    _automaticPayroll.Click_tapYes();
    
    
    

    TestModellerLogger.SetLastNodeGuid("fe80fe59-8cbd-4e30-9b51-07ff8be70fdd");
    _automaticPayroll.Click_Continue2();
    

    TestModellerLogger.SetLastNodeGuid("921628d4-a98f-421e-99f8-c40da7362431");
    _automaticPayroll.Click_BtnEnableAutorun2();
    

    TestModellerLogger.SetLastNodeGuid("395242fe-3d1b-4b50-ab24-005224517d6a");
    _automaticPayroll.Click_gotoPayrollDashboard();
    

    }

}
