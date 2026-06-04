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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/015f7d9b-a556-48f6-a4c6-73551249aaa7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1886, profileId = 102474)
public class AgentDsbPayroll_UserStories extends TestBase
{
    

    
    @Test  (groups= {"AgentDsbPayroll","AgentDsbPayroll - User Stories"})
    @TestModellerPath(guid = "5e3e7871-b963-4099-83e3-7c275d4c8bd7")
    public void AssertUrlGoToUrlEnterSearchClientClickAutoPayrollClickManualPayrollClickPensionClickP11DClic() throws InterruptedException
    {
        
    	_1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    TestModellerLogger.SetLastNodeGuid("e258ea9a-d1b7-49e3-985d-8dbd789c7def");
    _AgentDsbPayroll.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bd603287-59eb-4a13-831f-cff24edb3ba1");
    _AgentDsbPayroll.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0049788f-e6dd-440b-82a6-e2d6aadb4d94");
    _AgentDsbPayroll.Enter_Search_Client("");
    

    TestModellerLogger.SetLastNodeGuid("31e69eb8-8982-4015-8561-579f3ddb99e9");
    _AgentDsbPayroll.Click_Auto_Payroll();
    

    TestModellerLogger.SetLastNodeGuid("71498c3c-35bc-4a58-82ca-d47e2b248bc1");
    _AgentDsbPayroll.Click_Manual_Payroll();
    

    TestModellerLogger.SetLastNodeGuid("c7c04381-d3a3-4347-a52f-010e45b7c4ac");
    _AgentDsbPayroll.Click_Pension();
    

    TestModellerLogger.SetLastNodeGuid("e8b08a44-3c5e-473c-bff9-3a962b4626e8");
    _AgentDsbPayroll.Click_P11D();
    

    TestModellerLogger.SetLastNodeGuid("ba3917c5-c01c-439a-83d9-b05aabeb47ec");
    _AgentDsbPayroll.Click_Total_Client();
    

    TestModellerLogger.SetLastNodeGuid("56050426-0a39-4f5b-8af4-7c9b28f2c1cd");
    _AgentDsbPayroll.Click__Import_Companies();
    

    TestModellerLogger.SetLastNodeGuid("eb20a438-ff95-4f01-89ea-27745e59a68e");
    _AgentDsbPayroll.Click__Import_Employees();
    

    TestModellerLogger.SetLastNodeGuid("4790c6f2-e354-469f-a4c9-5518771b11d8");
    _AgentDsbPayroll.Click_Payroll_Table();
    

    TestModellerLogger.SetLastNodeGuid("49a06dd5-009c-45ee-9d05-149ba90162a9");
    _AgentDsbPayroll.Click_Pension_Table();
    

    TestModellerLogger.SetLastNodeGuid("654d8ad2-ab0e-4f65-b6e2-4e24862a0ac8");
    _AgentDsbPayroll.Click_Payroll_Deadlines_by_Accountant();
    

    TestModellerLogger.SetLastNodeGuid("1ca70ae6-1622-45fd-9811-9fff401d3c08");
    _AgentDsbPayroll.Click_Pension_Dedlines_by_Accountant();
    

    TestModellerLogger.SetLastNodeGuid("4a608319-b5d9-4c80-b4dd-4cbcbaf44605");
    _AgentDsbPayroll.Enter_PayrollAccountantSearch("");
    

    TestModellerLogger.SetLastNodeGuid("f57e301a-fe8a-4eef-b36f-eb639d9b2e45");
    _AgentDsbPayroll.Enter_PensionAcctSearch("");
    

    }

}