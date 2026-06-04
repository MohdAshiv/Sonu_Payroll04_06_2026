package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b08ab1f7-8ecb-4327-99fe-b1c35d3f7ada
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1307, profileId = 101173)
public class TC11SubscriptNomismaStartDate_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;


    
    @Test  (groups= {"SubscriptNomismaStartDate","SubscriptNomismaStartDate - Default Profile"})
    @TestModellerPath(guid = "b818c72b-997f-49a2-920f-97e31534c818")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC11";
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
    

pages.activateclient _activateclient = new pages.activateclient(driver);
//    TestModellerLogger.SetLastNodeGuid("af7e7d38-6db8-4612-a614-92367b2e8864");
//    _activateclient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("00360c19-f247-46f6-b835-dc296d6de27c");
//    _activateclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("f5d141aa-09d8-4cf9-83ea-84de3db35103");
    _activateclient.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("66e35596-28e8-41e6-ae3d-0c86893f33c7");
    _activateclient.Click_ClickEditompany();
    

//    TestModellerLogger.SetLastNodeGuid("a170b91d-0f36-482c-ac35-ca4009a43c7d");
//    _activateclient.Click_ClickIsActive();
//    

    TestModellerLogger.SetLastNodeGuid("77c1b262-32d1-4ad3-b234-6fdd49d0c45c");
    _activateclient.Click_ClickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("16c3aae5-914a-4920-8782-aaf04dddafa7");
    _activateclient.Enter_PayeRegDate(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("49641995-e8db-4e04-b720-48a5eb30c817");
    _activateclient.Enter_PayeRefNo1(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("9dd82b39-8500-492c-9036-14160c2cb23f");
    _activateclient.Enter_PayeRefNo2(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("e3838f3e-3965-4915-a86d-1c1dd6c817dc");
    _activateclient.Enter_AccountsOfcRef(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("75fd8418-4929-49e4-8500-3638e509a0f4");
    _activateclient.Click_ClickSave();
    

//    TestModellerLogger.SetLastNodeGuid("1e4ccf7b-fac1-4d0f-87c9-9a25924edaff");
//    _activateclient.Click_GotoPayrollDashboard();
//    

//pages.VerifyCompanyStatus _VerifyCompanyStatus = new pages.VerifyCompanyStatus(driver);
//    TestModellerLogger.SetLastNodeGuid("a9da7f92-c8dd-442c-87a1-015bed31374c");
//    _VerifyCompanyStatus.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7019c3d9-0e18-4444-9cac-27aa6b309d0c");
//    _VerifyCompanyStatus.AssertUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("619bc6fb-f227-4794-a438-038a95b65209");
//    _VerifyCompanyStatus.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f5ff3825-39ec-4bfb-a59e-25680372cfd7");
//    _VerifyCompanyStatus.Click_RunPayroll2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("00a846b3-c5b1-4877-b25e-84970c2a8b6a");
//    _VerifyCompanyStatus.Click_PayrollgeneratedMessage();
//    
//
//    TestModellerLogger.SetLastNodeGuid("85f58615-313e-4d91-8c53-e063098593f2");
//    _VerifyCompanyStatus.Click_EditCompanyClick();
//    

pages.NomismaStartDate _NomismaStartDate = new pages.NomismaStartDate(driver);
//    TestModellerLogger.SetLastNodeGuid("de2e9898-2818-43ee-be32-0fb231264c1b");
//    _NomismaStartDate.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6ccba08d-ca26-4c2b-9e52-8d5374221fa2");
//    _NomismaStartDate.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8260cb8d-03b6-4f63-a3ec-8c33a2c7a042");
    _NomismaStartDate.Click_ClickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("d183490b-a45d-45e5-a15b-0785348cfdc1");
    _NomismaStartDate.Enter_EnterNomismaStartDate(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("70fe592e-b31e-48c7-b30d-67e83779ff08");
    _NomismaStartDate.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("4d998e5a-047f-4dbb-a937-77465d478b6b");
    _NomismaStartDate.Click_gotoPayrollDashboard();
    

//    TestModellerLogger.SetLastNodeGuid("cb0c1adf-bda7-4b79-aa45-e833215d44bc");
//    _NomismaStartDate.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4b094ca-2cc8-4ff4-9d85-8d247ea84c50");
//    _NomismaStartDate.Click_RunPayroll2();
//    

    TestModellerLogger.SetLastNodeGuid("76b506d3-8a78-4977-b624-cf31824d0cf6");
    _NomismaStartDate.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("b5ec1ec4-ae42-4cb9-9908-1de5125ad9f2");
    _NomismaStartDate.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("1ee3eade-25d8-4e2d-8202-7fd105159d1b");
    _NomismaStartDate.Click_PayrollSettings2();
    

    }
/*
    @Test  (groups= {"SubscriptNomismaStartDate","SubscriptNomismaStartDate - Default Profile"})
    @TestModellerPath(guid = "a227b691-6ba2-4b61-9b16-869e4e8e974e")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs2() throws Exception
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Alexa77");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("hacp1CndHC");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("pariatur");
    

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
    _OpenClient.Enter_EnterClientName("omnis");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.activateclient _activateclient = new pages.activateclient(driver);
    TestModellerLogger.SetLastNodeGuid("af7e7d38-6db8-4612-a614-92367b2e8864");
    _activateclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00360c19-f247-46f6-b835-dc296d6de27c");
    _activateclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f5d141aa-09d8-4cf9-83ea-84de3db35103");
    _activateclient.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("66e35596-28e8-41e6-ae3d-0c86893f33c7");
    _activateclient.Click_ClickEditompany();
    

    TestModellerLogger.SetLastNodeGuid("a170b91d-0f36-482c-ac35-ca4009a43c7d");
    _activateclient.Click_ClickIsActive();
    

    TestModellerLogger.SetLastNodeGuid("77c1b262-32d1-4ad3-b234-6fdd49d0c45c");
    _activateclient.Click_ClickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("16c3aae5-914a-4920-8782-aaf04dddafa7");
    _activateclient.Enter_PayeRegDate("44280");
    

    TestModellerLogger.SetLastNodeGuid("49641995-e8db-4e04-b720-48a5eb30c817");
    _activateclient.Enter_PayeRefNo1("");
    

    TestModellerLogger.SetLastNodeGuid("9dd82b39-8500-492c-9036-14160c2cb23f");
    _activateclient.Enter_PayeRefNo2("");
    

    TestModellerLogger.SetLastNodeGuid("e3838f3e-3965-4915-a86d-1c1dd6c817dc");
    _activateclient.Enter_AccountsOfcRef("");
    

    TestModellerLogger.SetLastNodeGuid("75fd8418-4929-49e4-8500-3638e509a0f4");
    _activateclient.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("1e4ccf7b-fac1-4d0f-87c9-9a25924edaff");
    _activateclient.Click_GotoPayrollDashboard();
    

pages.VerifyCompanyStatus _VerifyCompanyStatus = new pages.VerifyCompanyStatus(driver);
    TestModellerLogger.SetLastNodeGuid("a9da7f92-c8dd-442c-87a1-015bed31374c");
    _VerifyCompanyStatus.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7019c3d9-0e18-4444-9cac-27aa6b309d0c");
    _VerifyCompanyStatus.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("619bc6fb-f227-4794-a438-038a95b65209");
    _VerifyCompanyStatus.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("f5ff3825-39ec-4bfb-a59e-25680372cfd7");
    _VerifyCompanyStatus.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("00a846b3-c5b1-4877-b25e-84970c2a8b6a");
    _VerifyCompanyStatus.Click_PayrollgeneratedMessage();
    

    TestModellerLogger.SetLastNodeGuid("85f58615-313e-4d91-8c53-e063098593f2");
    _VerifyCompanyStatus.Click_EditCompanyClick();
    

pages.NomismaStartDate _NomismaStartDate = new pages.NomismaStartDate(driver);
    TestModellerLogger.SetLastNodeGuid("de2e9898-2818-43ee-be32-0fb231264c1b");
    _NomismaStartDate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6ccba08d-ca26-4c2b-9e52-8d5374221fa2");
    _NomismaStartDate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8260cb8d-03b6-4f63-a3ec-8c33a2c7a042");
    _NomismaStartDate.Click_ClickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("d183490b-a45d-45e5-a15b-0785348cfdc1");
    _NomismaStartDate.Enter_EnterNomismaStartDate("44280.159366423613");
    

    TestModellerLogger.SetLastNodeGuid("70fe592e-b31e-48c7-b30d-67e83779ff08");
    _NomismaStartDate.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("4d998e5a-047f-4dbb-a937-77465d478b6b");
    _NomismaStartDate.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("cb0c1adf-bda7-4b79-aa45-e833215d44bc");
    _NomismaStartDate.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("a4b094ca-2cc8-4ff4-9d85-8d247ea84c50");
    _NomismaStartDate.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("76b506d3-8a78-4977-b624-cf31824d0cf6");
    _NomismaStartDate.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("b5ec1ec4-ae42-4cb9-9908-1de5125ad9f2");
    _NomismaStartDate.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("1ee3eade-25d8-4e2d-8202-7fd105159d1b");
    _NomismaStartDate.Click_PayrollSettings2();
    

    }

    @Test  (groups= {"SubscriptNomismaStartDate","SubscriptNomismaStartDate - Default Profile"})
    @TestModellerPath(guid = "702f6c0c-5038-4f7c-b919-b73109c828bf")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs3() throws Exception
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Katlynn_Waters");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("SCSWclHmNq");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("est");
    

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
    _OpenClient.Enter_EnterClientName("et");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.activateclient _activateclient = new pages.activateclient(driver);
    TestModellerLogger.SetLastNodeGuid("af7e7d38-6db8-4612-a614-92367b2e8864");
    _activateclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00360c19-f247-46f6-b835-dc296d6de27c");
    _activateclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f5d141aa-09d8-4cf9-83ea-84de3db35103");
    _activateclient.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("66e35596-28e8-41e6-ae3d-0c86893f33c7");
    _activateclient.Click_ClickEditompany();
    

    TestModellerLogger.SetLastNodeGuid("a170b91d-0f36-482c-ac35-ca4009a43c7d");
    _activateclient.Click_ClickIsActive();
    

    TestModellerLogger.SetLastNodeGuid("77c1b262-32d1-4ad3-b234-6fdd49d0c45c");
    _activateclient.Click_ClickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("16c3aae5-914a-4920-8782-aaf04dddafa7");
    _activateclient.Enter_PayeRegDate("44280");
    

    TestModellerLogger.SetLastNodeGuid("49641995-e8db-4e04-b720-48a5eb30c817");
    _activateclient.Enter_PayeRefNo1("");
    

    TestModellerLogger.SetLastNodeGuid("9dd82b39-8500-492c-9036-14160c2cb23f");
    _activateclient.Enter_PayeRefNo2("");
    

    TestModellerLogger.SetLastNodeGuid("e3838f3e-3965-4915-a86d-1c1dd6c817dc");
    _activateclient.Enter_AccountsOfcRef("");
    

    TestModellerLogger.SetLastNodeGuid("75fd8418-4929-49e4-8500-3638e509a0f4");
    _activateclient.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("1e4ccf7b-fac1-4d0f-87c9-9a25924edaff");
    _activateclient.Click_GotoPayrollDashboard();
    

pages.VerifyCompanyStatus _VerifyCompanyStatus = new pages.VerifyCompanyStatus(driver);
    TestModellerLogger.SetLastNodeGuid("a9da7f92-c8dd-442c-87a1-015bed31374c");
    _VerifyCompanyStatus.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7019c3d9-0e18-4444-9cac-27aa6b309d0c");
    _VerifyCompanyStatus.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("619bc6fb-f227-4794-a438-038a95b65209");
    _VerifyCompanyStatus.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("f5ff3825-39ec-4bfb-a59e-25680372cfd7");
    _VerifyCompanyStatus.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("00a846b3-c5b1-4877-b25e-84970c2a8b6a");
    _VerifyCompanyStatus.Click_PayrollgeneratedMessage();
    

    TestModellerLogger.SetLastNodeGuid("85f58615-313e-4d91-8c53-e063098593f2");
    _VerifyCompanyStatus.Click_EditCompanyClick();
    

pages.NomismaStartDate _NomismaStartDate = new pages.NomismaStartDate(driver);
    TestModellerLogger.SetLastNodeGuid("de2e9898-2818-43ee-be32-0fb231264c1b");
    _NomismaStartDate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6ccba08d-ca26-4c2b-9e52-8d5374221fa2");
    _NomismaStartDate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8260cb8d-03b6-4f63-a3ec-8c33a2c7a042");
    _NomismaStartDate.Click_ClickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("d183490b-a45d-45e5-a15b-0785348cfdc1");
    _NomismaStartDate.Enter_EnterNomismaStartDate("44280.159366423613");
    

    TestModellerLogger.SetLastNodeGuid("70fe592e-b31e-48c7-b30d-67e83779ff08");
    _NomismaStartDate.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("4d998e5a-047f-4dbb-a937-77465d478b6b");
    _NomismaStartDate.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("cb0c1adf-bda7-4b79-aa45-e833215d44bc");
    _NomismaStartDate.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("a4b094ca-2cc8-4ff4-9d85-8d247ea84c50");
    _NomismaStartDate.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("76b506d3-8a78-4977-b624-cf31824d0cf6");
    _NomismaStartDate.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("b5ec1ec4-ae42-4cb9-9908-1de5125ad9f2");
    _NomismaStartDate.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("1ee3eade-25d8-4e2d-8202-7fd105159d1b");
    _NomismaStartDate.Click_PayrollSettings2();
    

    }

    @Test  (groups= {"SubscriptNomismaStartDate","SubscriptNomismaStartDate - Default Profile"})
    @TestModellerPath(guid = "ce4f01f3-9640-4b46-9cd8-e3f8c38f7bd7")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs4() throws Exception
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Valentina82");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("EHk2XG8sjG");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("deserunt");
    

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
    _OpenClient.Enter_EnterClientName("unde");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.activateclient _activateclient = new pages.activateclient(driver);
    TestModellerLogger.SetLastNodeGuid("af7e7d38-6db8-4612-a614-92367b2e8864");
    _activateclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00360c19-f247-46f6-b835-dc296d6de27c");
    _activateclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f5d141aa-09d8-4cf9-83ea-84de3db35103");
    _activateclient.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("66e35596-28e8-41e6-ae3d-0c86893f33c7");
    _activateclient.Click_ClickEditompany();
    

    TestModellerLogger.SetLastNodeGuid("a170b91d-0f36-482c-ac35-ca4009a43c7d");
    _activateclient.Click_ClickIsActive();
    

    TestModellerLogger.SetLastNodeGuid("77c1b262-32d1-4ad3-b234-6fdd49d0c45c");
    _activateclient.Click_ClickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("16c3aae5-914a-4920-8782-aaf04dddafa7");
    _activateclient.Enter_PayeRegDate("44280.159366423613");
    

    TestModellerLogger.SetLastNodeGuid("49641995-e8db-4e04-b720-48a5eb30c817");
    _activateclient.Enter_PayeRefNo1("");
    

    TestModellerLogger.SetLastNodeGuid("9dd82b39-8500-492c-9036-14160c2cb23f");
    _activateclient.Enter_PayeRefNo2("");
    

    TestModellerLogger.SetLastNodeGuid("e3838f3e-3965-4915-a86d-1c1dd6c817dc");
    _activateclient.Enter_AccountsOfcRef("");
    

    TestModellerLogger.SetLastNodeGuid("75fd8418-4929-49e4-8500-3638e509a0f4");
    _activateclient.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("1e4ccf7b-fac1-4d0f-87c9-9a25924edaff");
    _activateclient.Click_GotoPayrollDashboard();
    

pages.VerifyCompanyStatus _VerifyCompanyStatus = new pages.VerifyCompanyStatus(driver);
    TestModellerLogger.SetLastNodeGuid("a9da7f92-c8dd-442c-87a1-015bed31374c");
    _VerifyCompanyStatus.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7019c3d9-0e18-4444-9cac-27aa6b309d0c");
    _VerifyCompanyStatus.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("619bc6fb-f227-4794-a438-038a95b65209");
    _VerifyCompanyStatus.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("f5ff3825-39ec-4bfb-a59e-25680372cfd7");
    _VerifyCompanyStatus.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("00a846b3-c5b1-4877-b25e-84970c2a8b6a");
    _VerifyCompanyStatus.Click_PayrollgeneratedMessage();
    

    TestModellerLogger.SetLastNodeGuid("85f58615-313e-4d91-8c53-e063098593f2");
    _VerifyCompanyStatus.Click_EditCompanyClick();
    

pages.NomismaStartDate _NomismaStartDate = new pages.NomismaStartDate(driver);
    TestModellerLogger.SetLastNodeGuid("de2e9898-2818-43ee-be32-0fb231264c1b");
    _NomismaStartDate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6ccba08d-ca26-4c2b-9e52-8d5374221fa2");
    _NomismaStartDate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8260cb8d-03b6-4f63-a3ec-8c33a2c7a042");
    _NomismaStartDate.Click_ClickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("d183490b-a45d-45e5-a15b-0785348cfdc1");
    _NomismaStartDate.Enter_EnterNomismaStartDate("44280");
    

    TestModellerLogger.SetLastNodeGuid("70fe592e-b31e-48c7-b30d-67e83779ff08");
    _NomismaStartDate.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("4d998e5a-047f-4dbb-a937-77465d478b6b");
    _NomismaStartDate.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("cb0c1adf-bda7-4b79-aa45-e833215d44bc");
    _NomismaStartDate.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("a4b094ca-2cc8-4ff4-9d85-8d247ea84c50");
    _NomismaStartDate.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("76b506d3-8a78-4977-b624-cf31824d0cf6");
    _NomismaStartDate.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("b5ec1ec4-ae42-4cb9-9908-1de5125ad9f2");
    _NomismaStartDate.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("1ee3eade-25d8-4e2d-8202-7fd105159d1b");
    _NomismaStartDate.Click_PayrollSettings2();
    

    }
*/
}
