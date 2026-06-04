package _1748RunPayrollfromAgent;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.loginpageSandbox;
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
public class TC792_808AgentRunPayrollPDF_EE extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void runPayrollPopup() throws Exception
    {
        
    	sTestCaseID="TC792";
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
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
   



    }
    
    
    @Test  (priority=2,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollPDF_EE() throws Exception
    {
        
    	sTestCaseID="TC793";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
 

    }
    
    @Test  (priority=3,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollZIP_EE() throws Exception
    {
        
    	sTestCaseID="TC794";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
 


    }
    
    @Test  (priority=4,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollNoProt_EE() throws Exception
    {
        
    	sTestCaseID="TC795";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
 


    }
    
    @Test  (priority=5,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollPDF_ER() throws Exception
    {
        
    	sTestCaseID="TC796";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
 


    }
    
    @Test  (priority=6,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollZIP_ER() throws Exception
    {
        
    	sTestCaseID="TC797";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
 

    }
    
    
    @Test  (priority=7,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollNoProt_ER() throws Exception
    {
        
    	sTestCaseID="TC798";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
  
    }
    
    @Test  (priority=8,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollPDF_Both() throws Exception
    {
        
    	sTestCaseID="TC799";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    



    }
    
    
    @Test  (priority=9,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollZIP_Both() throws Exception
    {
        
    	sTestCaseID="TC800";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
  

    }
    
    @Test  (priority=10,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollNoProt_Both() throws Exception
    {
        
    	sTestCaseID="TC801";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
  

    }
    
    @Test  (priority=11,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollPDF_Dont() throws Exception
    {
        
    	sTestCaseID="TC802";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
 
    }
    
    @Test  (priority=12,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollZIP_Dont() throws Exception
    {
        
    	sTestCaseID="TC803";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
  


    }
    
    @Test  (priority=13,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollNoProt_Dont() throws Exception
    {
        
    	sTestCaseID="TC804";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
    
 

    }
    
    @Test  (priority=14,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollPDF_EEwithRTI() throws Exception
    {
        
    	sTestCaseID="TC805";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    

    }
    
    
    @Test  (priority=15,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollZIP_ERwithRTI() throws Exception
    {
        
    	sTestCaseID="TC806";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
 

    }
    
    
    @Test  (priority=16,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void AgentRunPayrollPDF_BothWithRTI() throws Exception
    {
        
    	sTestCaseID="TC807";
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
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

  

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
//    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
//    _paswProtectionPDF.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
//    _paswProtectionPDF.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    
    
    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.SwitchToAgentPage(2);
    
    
_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
 

    }
    
    @Test  (priority=17,enabled=true,groups= {"SubscriptPswdProtectionPDF","SubscriptPswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "0af5e30a-6eb8-4605-81b9-8030b3c6eabf")
    public void runPayrollPopupNoRTI() throws Exception
    {
        
    	sTestCaseID="TC808";
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
    

    TestModellerLogger.SetLastNodeGuid("66d32f4c-3300-4a27-b91a-d208982572f4");
    _Agent_Payroll_DSB.Click_Run_Payroll();
    
 //   _Agent_Payroll_DSB.popUpScreenshot();
    
    
 


    }

}
