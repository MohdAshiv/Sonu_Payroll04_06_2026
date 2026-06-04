package _1743PayrollDSB;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.verifyClosePayeErrorMessageOOPS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3e091eeb-65e5-4077-81b6-7752729c278c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1411, profileId = 101275)
public class TC720_725CheckPayroll_InprogressClient extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void Inprogress_Overdue() throws Exception
    {
        
    	sTestCaseID="TC720";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
    
    _1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    
    Thread.sleep(5000);
    _1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    
    TestModellerLogger.SetLastNodeGuid("31e69eb8-8982-4015-8561-579f3ddb99e9");
    _AgentDsbPayroll.getCountPayroll_Overdue_Inprogress(data[4]);
    
    _AgentDsbPayroll.getTableCountofAutoPayroll();
    
    _AgentDsbPayroll.verifyAutoPayrollCount();
    
    }
    
    
    @Test  (priority=2,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void Inprogress_1week() throws Exception
    {
        
    	sTestCaseID="TC721";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
    
    _1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    
    Thread.sleep(5000);
    _1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    
    TestModellerLogger.SetLastNodeGuid("31e69eb8-8982-4015-8561-579f3ddb99e9");
    _AgentDsbPayroll.getCountPayroll_1week_Inprogress(data[4]);
    
    _AgentDsbPayroll.getTableCountofAutoPayroll();
    
    _AgentDsbPayroll.verifyAutoPayrollCount();
    
    }
    
    
    @Test  (priority=3,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void Inprogress_1Month() throws Exception
    {
        
    	sTestCaseID="TC722";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
    
    _1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    
    Thread.sleep(5000);
    _1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    
    TestModellerLogger.SetLastNodeGuid("31e69eb8-8982-4015-8561-579f3ddb99e9");
    _AgentDsbPayroll.getCountPayroll_1Month_Inprogress(data[4]);
    
    _AgentDsbPayroll.getTableCountofAutoPayroll();
    
    _AgentDsbPayroll.verifyAutoPayrollCount();
    
    }
    
    @Test  (priority=4,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void Inprogress_2Month() throws Exception
    {
        
    	sTestCaseID="TC723";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
    
    _1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    
    Thread.sleep(5000);
    _1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    
    TestModellerLogger.SetLastNodeGuid("31e69eb8-8982-4015-8561-579f3ddb99e9");
    _AgentDsbPayroll.getCountPayroll_2Month_Inprogress(data[4]);
    
    _AgentDsbPayroll.getTableCountofAutoPayroll();
    
    _AgentDsbPayroll.verifyAutoPayrollCount();
    
    }
    
    
    @Test  (priority=5,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void Inprogress_3_6Month() throws Exception
    {
        
    	sTestCaseID="TC724";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
    
    _1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    
    Thread.sleep(5000);
    _1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    
    TestModellerLogger.SetLastNodeGuid("31e69eb8-8982-4015-8561-579f3ddb99e9");
    _AgentDsbPayroll.getCountPayroll_3_6Month_Inprogress(data[4]);
    
    _AgentDsbPayroll.getTableCountofAutoPayroll();
    
    _AgentDsbPayroll.verifyAutoPayrollCount();
    
    }
    
    
    @Test  (priority=6,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void Inprogress_6plusMonth() throws Exception
    {
        
    	sTestCaseID="TC725";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
    
    _1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Dashboard();
    
    Thread.sleep(5000);
    _1743Agent_Dashboard.AgentDsbPayroll _AgentDsbPayroll = new _1743Agent_Dashboard.AgentDsbPayroll(driver);
    
    TestModellerLogger.SetLastNodeGuid("31e69eb8-8982-4015-8561-579f3ddb99e9");
    _AgentDsbPayroll.getCountPayroll_6plusMonth_InProgress(data[4]);
    
    _AgentDsbPayroll.getTableCountofAutoPayroll();
    
    _AgentDsbPayroll.verifyAutoPayrollCount();
    
    }
}
