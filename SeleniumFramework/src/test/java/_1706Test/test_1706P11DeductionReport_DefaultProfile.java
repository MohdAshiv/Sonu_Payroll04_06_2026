package _1706Test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f40c3533-56a3-4510-8e50-55b715f751d1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1795, profileId = 102261)
public class test_1706P11DeductionReport_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"_1706P11DeductionReport","_1706P11DeductionReport - Default Profile"})
    @TestModellerPath(guid = "21702935-d847-4fb0-9ba1-bc7e2ba421de")
    public void GoToUrlAssertUrlClickgetGrossClickgotoReportsClickclickP11ClickscrollToPAYEIncomeTaxClickMatc()
    {
        
    	_1706Page._1706P11DeductionReport __1706P11DeductionReport = new _1706Page._1706P11DeductionReport(driver);
    TestModellerLogger.SetLastNodeGuid("a74ef51c-63ca-47ed-8b45-4073346b533a");
    __1706P11DeductionReport.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ebc1d20-5575-4df4-8b87-fcbfbcd68cdb");
    __1706P11DeductionReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0ca1d0a8-709f-4de1-a528-b657d1e8b34a");
    __1706P11DeductionReport.Click_getGross();
    

    TestModellerLogger.SetLastNodeGuid("462f05e9-56f2-4768-8873-f2107940090a");
    __1706P11DeductionReport.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("cd94851e-80cd-4284-a5ea-b9db49f434e2");
    __1706P11DeductionReport.Click_clickP11();
    

    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.Click_scrollToPAYE_Income_Tax();
    

    TestModellerLogger.SetLastNodeGuid("4183b37e-7beb-487d-a998-9ae61d0de7ad");
    __1706P11DeductionReport.Click_MatchData();
    

    }

}