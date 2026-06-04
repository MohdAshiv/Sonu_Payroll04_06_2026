package tests1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/bdeb0370-6da1-4b7a-8613-c5ec5942039d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1395, profileId = 101262)
public class TC32createContractorInCIS_DefaultProfile extends TestBase
{
    

	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscriptPaymentManagement","subscriptPaymentManagement - Default Profile"})
    @TestModellerPath(guid = "c0f6a15e-465e-41ec-b39a-f32adccede0e")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC32";
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
        
        pages1.RegisterCIS _RegisterCIS = new pages1.RegisterCIS(driver);
//    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
//    _RegisterCIS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
//    _RegisterCIS.AssertUrl();
        
//    
        
        _RegisterCIS.click_no();

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    
    _RegisterCIS.Click_Create();
        
//        pages1.createContractorInCIS _createContractorInCIS = new pages1.createContractorInCIS(driver);
////    TestModellerLogger.SetLastNodeGuid("592be309-0871-45ad-ad79-fb96d56cb14a");
////    _createContractorInCIS.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("04c167a8-1a82-4c1f-99b9-85dfec8aa45c");
////    _createContractorInCIS.AssertUrl();
//    
//
////    TestModellerLogger.SetLastNodeGuid("403831fb-6fb1-4dc2-9b09-e502ed7c74e0");
////    _createContractorInCIS.Click_Createontractor();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c00225e7-2e29-4f09-ab5b-e76e59b13a6d");
//    _createContractorInCIS.Enter_ContractoeFirstName(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a9680d39-a1f9-407f-b06c-ea1aa743ebdd");
//    _createContractorInCIS.Enter_ContractorSurName(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b510fbf-a27b-4ca9-9ce3-a8fa7cac22eb");
//    _createContractorInCIS.Enter_UtrNo(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("3464e072-8967-4f90-b14e-436350e3ddf7");
//    _createContractorInCIS.Click_Save();
//    

    }

}
