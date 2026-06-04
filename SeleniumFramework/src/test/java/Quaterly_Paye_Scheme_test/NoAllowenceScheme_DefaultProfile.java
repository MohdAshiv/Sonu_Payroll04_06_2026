package Quaterly_Paye_Scheme_test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f86f956f-c500-4ca1-8339-015229c19be1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1409, profileId = 101276)
public class NoAllowenceScheme_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"AllowenceScheme","AllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "5e5b1aed-08c1-409d-b080-00e698fd0261")
    public void GoToUrlAssertUrlClickclickAllowancesSchemesClickmarkYesClickclickSaveClickgotoPayrollDashboard() throws Exception
    {
        
        Quaterly_Paye_Scheme.NoAllowenceScheme _AllowenceScheme = new Quaterly_Paye_Scheme.NoAllowenceScheme(driver);
    TestModellerLogger.SetLastNodeGuid("bae0140d-dc17-4241-81b8-7b78e2574174");
    _AllowenceScheme.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ed563f15-dc52-4aee-9b34-0c281f72bd20");
    _AllowenceScheme.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("60585696-efea-430a-b012-bacf6202f632");
    _AllowenceScheme.Click_clickAllowances_Schemes();
    

    TestModellerLogger.SetLastNodeGuid("fe297d44-a712-442e-9d2c-2c2489254660");
    _AllowenceScheme.Click_markYes();
    

    TestModellerLogger.SetLastNodeGuid("120c4873-a6b6-44d3-b182-de85936b900c");
    _AllowenceScheme.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("e211e2aa-4b5d-4d68-9852-9638070b28a4");
    _AllowenceScheme.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("2699015c-0e09-4e7c-a038-914b7cda00e7");
    _AllowenceScheme.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("2d202a3c-5867-4003-abfd-0010ca91b8e1");
    _AllowenceScheme.Click_clickPayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("ecb461e7-351c-46aa-9bc9-076e15f1d048");
    _AllowenceScheme.Select_SelectPayrollMonthDate("31/05/2020");
    

    }

}
