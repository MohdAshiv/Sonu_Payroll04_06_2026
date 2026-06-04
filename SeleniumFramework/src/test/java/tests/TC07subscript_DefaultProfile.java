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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e515d4b1-4467-4707-8db4-45e3b9b7d421
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1271, profileId = 101153)
public class TC07subscript_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscript","subscript - Default Profile"})
    @TestModellerPath(guid = "856c6b4d-b665-4eed-9da3-eec593a40160")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
        
    	sTestCaseID="TC7";
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
    

    TestModellerLogger.SetLastNodeGuid("f5d141aa-09d8-4cf9-83ea-84de3db35103");
    _activateclient.Click_ClickPayroll();
    

//    TestModellerLogger.SetLastNodeGuid("66e35596-28e8-41e6-ae3d-0c86893f33c7");
//    _activateclient.Click_ClickEditompany();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a170b91d-0f36-482c-ac35-ca4009a43c7d");
//    _activateclient.Click_ClickIsActive();
//    
//
//    TestModellerLogger.SetLastNodeGuid("77c1b262-32d1-4ad3-b234-6fdd49d0c45c");
//    _activateclient.Click_ClickPayrollDetails();
//    
//
//    TestModellerLogger.SetLastNodeGuid("16c3aae5-914a-4920-8782-aaf04dddafa7");
//    _activateclient.Enter_PayeRegDate(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("49641995-e8db-4e04-b720-48a5eb30c817");
//    _activateclient.Enter_PayeRefNo1(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("9dd82b39-8500-492c-9036-14160c2cb23f");
//    _activateclient.Enter_PayeRefNo2(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("e3838f3e-3965-4915-a86d-1c1dd6c817dc");
//    _activateclient.Enter_AccountsOfcRef(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("75fd8418-4929-49e4-8500-3638e509a0f4");
//    _activateclient.Click_ClickSave();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1e4ccf7b-fac1-4d0f-87c9-9a25924edaff");
//    _activateclient.Click_GotoPayrollDashboard();
    

pages.deregistercompany _deregistercompany = new pages.deregistercompany(driver);
//    TestModellerLogger.SetLastNodeGuid("92e36840-8038-4058-b69e-dcc782f97d62");
//    _deregistercompany.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f210d055-c68b-4639-9f56-2e37685b74e2");
//    _deregistercompany.AssertUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("1c5a03d8-2b44-4009-8013-157adee9170c");
//    _deregistercompany.Click_ClickRunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b7945180-59df-470a-9376-78c9b86ce68a");
//    _deregistercompany.Click_ClickRunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("576ee54e-7555-456b-ac17-75ab51aedf4f");
    _deregistercompany.Click_ClickEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("567c58ae-55ad-448f-8a09-ef1acf55aa06");
    _deregistercompany.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("80f7bc94-218f-4326-a31a-dfa32c9c94db");
    _deregistercompany.Click_selectYes();
    

    TestModellerLogger.SetLastNodeGuid("5b939b97-177b-46c4-8a72-05a1c721dc67");
    _deregistercompany.Enter_EnterDeRegistrationDate(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("112659ad-e4a5-4eb5-864b-261bdd1cdbfe");
    _deregistercompany.Click_ClickSave();
    

pages.verifypage _verifypage = new pages.verifypage(driver);
//    TestModellerLogger.SetLastNodeGuid("8966ec8c-5997-446f-8516-3d0395be64bb");
//    _verifypage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1b6ac91c-411a-4da3-a48d-0e675c22edf6");
//    _verifypage.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ada05901-b7d7-428c-be1d-92efed88ee50");
    _verifypage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("0920bf51-30ea-40e7-9db0-4b1f44c63ae0");
    _verifypage.Click__Company_DeRegistered_Message();
    

    TestModellerLogger.SetLastNodeGuid("f29f7141-3b91-4fe0-8cc9-fa6c11dd5a0c");
    _verifypage.Click_gotoFilingManagement();
    
PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
	
	TestModellerLogger.SetLastNodeGuid("ba20616f-2ad5-40d5-9166-657bb6b0822f");
    _PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();


PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


	    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
	    _PayrollDoUndo.Click_Undo_Deregister();
	    
	    _PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();
	
    

    }

 
}
