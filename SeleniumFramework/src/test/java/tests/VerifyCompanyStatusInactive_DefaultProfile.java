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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7f35345a-d8ca-4385-ac72-62ce488fa243
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1289, profileId = 101162)
public class VerifyCompanyStatusInactive_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"VerifyCompanyStatus","VerifyCompanyStatus - Default Profile"})
    @TestModellerPath(guid = "09868176-1412-4c2a-ad68-b285fc1b83fd")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickPayrollgeneratedMessageClickEditCompanyCl() throws Exception
    {
        
        pages.VerifyCompanyStatus _VerifyCompanyStatus = new pages.VerifyCompanyStatus(driver);
    TestModellerLogger.SetLastNodeGuid("a9da7f92-c8dd-442c-87a1-015bed31374c");
    _VerifyCompanyStatus.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7019c3d9-0e18-4444-9cac-27aa6b309d0c");
    _VerifyCompanyStatus.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("619bc6fb-f227-4794-a438-038a95b65209");
    _VerifyCompanyStatus.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("f5ff3825-39ec-4bfb-a59e-25680372cfd7");
    _VerifyCompanyStatus.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("00a846b3-c5b1-4877-b25e-84970c2a8b6a");
    _VerifyCompanyStatus.Click_PayrollgeneratedMessage();
    

    TestModellerLogger.SetLastNodeGuid("85f58615-313e-4d91-8c53-e063098593f2");
    _VerifyCompanyStatus.Click_EditCompanyClick();
    

    }

}
