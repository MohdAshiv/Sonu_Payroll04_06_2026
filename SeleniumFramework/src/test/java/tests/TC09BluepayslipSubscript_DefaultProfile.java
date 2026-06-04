package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Blue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/085a0d42-ee6a-4643-a49d-027927163198
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1294, profileId = 101165)
public class TC09BluepayslipSubscript_DefaultProfile extends TestBase
{
    
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"payslipSubscript","payslipSubscript - Default Profile"})
    @TestModellerPath(guid = "e519d8c8-a361-45b3-a89a-9dc045740de6")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC9";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
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
    

payslip_Blue _payslip = new payslip_Blue(driver);

//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Blue");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    
    }
  /*  TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    
    
    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
  
    pages.payslip_Blue _payslip1 = new pages.payslip_Blue(driver);

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip1.Select_TemplateColor("Blue");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    }

    @Test  (groups= {"payslipSubscript","payslipSubscript - Default Profile"})
    @TestModellerPath(guid = "b9fa6003-3b79-47e9-a72b-321cee7b69cb")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs2()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Nelson_Fisher");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("qvFXpJ4up3");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("eum");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("soluta");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
   

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Blue");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

    }
*/
}
