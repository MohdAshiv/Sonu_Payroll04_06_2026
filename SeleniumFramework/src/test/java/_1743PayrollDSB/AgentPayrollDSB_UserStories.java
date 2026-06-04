package _1743PayrollDSB;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9ece86ce-cda3-4a83-b074-e437332eb0b5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1887, profileId = 102477)
public class AgentPayrollDSB_UserStories extends TestBase
{
    

    
    @Test  (groups= {"Agent_Payroll DSB","Agent_Payroll DSB - User Stories"})
    @TestModellerPath(guid = "588b72b9-d5d2-4e34-8bbe-53474d348a75")
    public void ClickPayrollClickDashboardClickRunPayrollClickSubmitP11DClickSubmitPensionContributionClickSub() throws InterruptedException
    {
        
    	_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("f92caf82-5f9b-4889-9fa2-e951981f3f1e");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    

    TestModellerLogger.SetLastNodeGuid("4df67b4a-1507-4eff-9cc8-1f5691b890e5");
    _Agent_Payroll_DSB.Click_Submit_P11D();
    

    TestModellerLogger.SetLastNodeGuid("1ca25c74-2529-40ea-90da-2eff328a7c16");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    

    TestModellerLogger.SetLastNodeGuid("152eb8ec-4039-4c80-8bf0-cc3730b23705");
    _Agent_Payroll_DSB.Click_Submit_RTI();
    

    }

}