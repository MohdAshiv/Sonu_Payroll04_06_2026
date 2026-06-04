package _1749PensionConribution;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Green;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/02e888cb-4b77-49a4-a4ce-ee70f741cc9b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1309, profileId = 101180)
public class TC815_822PensionContributionPage extends TestBase

{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void verifyPentionContributionTable() throws Exception
    {
        
    	sTestCaseID="TC815";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.PensionTableContentSC();
    
    }
    
    
    @Test  (priority=2,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void verifyAccountManagerSelectOption() throws Exception
    {
        
    	sTestCaseID="TC816";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.Select__AccountManager(data[4]);
    
    pensionContribution.Click_UpdateButton();
    
    pensionContribution.AccountManagerSC();
    
    }
    
    
    @Test  (priority=3,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void verifyCompanyNameSelectOption() throws Exception
    {
        
    	sTestCaseID="TC817";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.Enter_CompanyNameTextBox(data[4]);
    
    pensionContribution.Click_UpdateButton();
    
    pensionContribution.CompanyNameSerchSC();
    
    }
    
    
    @Test  (priority=4,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void VerifyselectStatusPendin() throws Exception
    {
        
    	sTestCaseID="TC818";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.SelectStatus(data[4]);
    
    pensionContribution.Click_UpdateButton();
    
    pensionContribution.StatusSelectionSShot(data[4]);
    
    }
    
    
    @Test  (priority=5,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void VerifyselectStatusFailed() throws Exception
    {
        
    	sTestCaseID="TC819";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.SelectStatus(data[4]);
    
    pensionContribution.Click_UpdateButton();
    
    pensionContribution.StatusSelectionSShot(data[4]);
    
    }
    
    
    @Test  (priority=6,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void VerifyselectStatusAll() throws Exception
    {
        
    	sTestCaseID="TC820";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.SelectStatus(data[4]);
    
    pensionContribution.Click_UpdateButton();
    
    pensionContribution.StatusSelectionSShot(data[4]);
    
    }
    
    
    @Test  (priority=7,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void verifySubmitContributionButtonAvailability() throws Exception
    {
        
    	sTestCaseID="TC821";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.submitContributionButton();
    
    }
    
    
    
    @Test  (priority=8,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void verifySubmitContributionTotalRecord() throws Exception
    {
        
    	sTestCaseID="TC822";
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
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_Pension_Contribution();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.submitContributionButton();
    
    }
    
    

}
