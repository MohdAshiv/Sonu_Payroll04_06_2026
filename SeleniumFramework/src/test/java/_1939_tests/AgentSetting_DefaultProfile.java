package _1939_tests;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c15e0392-24a0-4887-973e-365a0a3f418e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1511, profileId = 101463)
public class AgentSetting_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"AgentSetting","AgentSetting - Default Profile"})
    @TestModellerPath(guid = "d30b4cc5-406c-4ef2-b3bf-28323efbd8e1")
    public void GoToUrlAssertUrlClickClickAgentSettingsClickclickPayrollClickClicktoAddDatePositiveEnterEnterA() throws InterruptedException
    {
        
    	_1939_page.AgentsSetting _AgentsSetting = new _1939_page.AgentsSetting(driver);
    TestModellerLogger.SetLastNodeGuid("9c12e65b-7db5-4604-aadb-4fb04da5d1c9");
    _AgentsSetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eaaefc30-621f-4537-b288-c0044655cb08");
    _AgentsSetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("40d94aae-f05e-4f6d-a49a-cbc68c7aa060");
    _AgentsSetting.Click_ClickAgentSettings();
    

    TestModellerLogger.SetLastNodeGuid("4584b632-51f1-42d2-b657-d4c77d169454");
    _AgentsSetting.Click_clickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("c5c76273-6d5a-4c5a-90e6-5999ba109e09");
    _AgentsSetting.Click_ClicktoAddDate();
    

    TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
    _AgentsSetting.Enter_EnterAutoRunDate("44341");
    

    TestModellerLogger.SetLastNodeGuid("6eacfabc-a22b-4a08-b808-3eedbcae0ddd");
    _AgentsSetting.Click_ClickSave();
    

    }

    @Test  (groups= {"AgentSetting","AgentSetting - Default Profile"})
    @TestModellerPath(guid = "60f9005d-0f47-4c45-ab9c-2bb5f38adef1")
    public void GoToUrlAssertUrlClickClickAgentSettingsClickclickPayrollClickClicktoAddDatePositiveEnterEnterA1() throws InterruptedException
    {
        
    	_1939_page.AgentsSetting _AgentsSetting = new _1939_page.AgentsSetting(driver);
    TestModellerLogger.SetLastNodeGuid("9c12e65b-7db5-4604-aadb-4fb04da5d1c9");
    _AgentsSetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eaaefc30-621f-4537-b288-c0044655cb08");
    _AgentsSetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("40d94aae-f05e-4f6d-a49a-cbc68c7aa060");
    _AgentsSetting.Click_ClickAgentSettings();
    

    TestModellerLogger.SetLastNodeGuid("4584b632-51f1-42d2-b657-d4c77d169454");
    _AgentsSetting.Click_clickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("c5c76273-6d5a-4c5a-90e6-5999ba109e09");
    _AgentsSetting.Click_ClicktoAddDate();
    

    TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
    _AgentsSetting.Enter_EnterAutoRunDate("44341.566622453705");
    

    TestModellerLogger.SetLastNodeGuid("6eacfabc-a22b-4a08-b808-3eedbcae0ddd");
    _AgentsSetting.Click_ClickSave();
    

    }

}
