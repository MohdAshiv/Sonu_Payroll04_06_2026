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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3be1315f-0d25-4ff5-86e7-033286d918f0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1333, profileId = 101201)
public class TC16subScriptAutomaticPayroll_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	

    
    @Test  (groups= {"subScriptAutomaticPayroll","subScriptAutomaticPayroll - Default Profile"})
    @TestModellerPath(guid = "913953ca-e71e-479c-83d0-853826909e84")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
    	
    	sTestCaseID="TC16";
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
    

//pages.ClientSearch _ClientSearch = new pages.ClientSearch(driver);
////    TestModellerLogger.SetLastNodeGuid("93d78480-9d69-44c5-9114-93ac41edde1e");
////    _ClientSearch.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("31f196ed-365a-4fe5-b626-b84e20a41039");
////    _ClientSearch.AssertUrl();
////    
//
//    TestModellerLogger.SetLastNodeGuid("4009589f-046a-4b1a-8be0-aea1043e0b4a");
//    _ClientSearch.Enter_SearchClient(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("e1744d6b-046c-4443-98ee-5fe688fea1d7");
//    _ClientSearch.Click_ClickSearchButton();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e639f1a8-5246-459f-9b3f-1bd5aba900d6");
//    _ClientSearch.Click_ClickOnClientWorkbook();
//
    
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
    

pages.gotoPayrollSetting _gotoPayrollSetting = new pages.gotoPayrollSetting(driver);
//    TestModellerLogger.SetLastNodeGuid("b333bb86-e176-4761-b72c-e02790318565");
//    _gotoPayrollSetting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9dacefe-86b3-4337-b563-f20d557a63c0");
//    _gotoPayrollSetting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("e0fb63b7-8522-4daf-b671-0e1712be8115");
    _gotoPayrollSetting.Click_clickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("a3342d2d-f649-4841-b422-99c823ece078");
    _gotoPayrollSetting.Click_clickEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("fa4ac16e-6c4f-4b4c-9a57-ded7110bf2b6");
    _gotoPayrollSetting.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("d08e4a03-9e9b-46f6-aee7-a2a736a55c08");
    _gotoPayrollSetting.Click_PayrollSettings();
    

_1939_page.Enable_Automatic_Payroll _Enable_Automatic_Payroll = new _1939_page.Enable_Automatic_Payroll(driver);
	
    TestModellerLogger.SetLastNodeGuid("87e761a2-e708-41be-9ac7-300af5e89105");
    _Enable_Automatic_Payroll.Click_ClickEnableAutorun();
    

    TestModellerLogger.SetLastNodeGuid("9dd05302-4394-46c5-b3e5-7db65c3593cd");
    _Enable_Automatic_Payroll.Click_ClickContinue();
    

    TestModellerLogger.SetLastNodeGuid("b0709c62-6d43-411b-afb5-8444d1c06800");
    _Enable_Automatic_Payroll.Select_SelectEmailMode(data[5]);
    
    
    
    TestModellerLogger.SetLastNodeGuid("b0709c62-6d43-411b-afb5-8444d1c06800");
    _Enable_Automatic_Payroll.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("98493ed0-a6be-479e-8013-48656b5a7faa");
    _Enable_Automatic_Payroll.Click_Continue2();
    

    TestModellerLogger.SetLastNodeGuid("a7a1a484-f86e-436c-93b4-06be15d9cd29");
    _Enable_Automatic_Payroll.Click_Enable2();
  

//  TestModellerLogger.SetLastNodeGuid("2f5590f7-e106-4057-8440-b5c6996e6e06");
//  _PaymentMmgt.Click_clickCompanyDetails();
//  

//  TestModellerLogger.SetLastNodeGuid("32dc191c-633b-4a08-ad95-6ec15efe8800");
//  _PaymentMmgt.Click_MarkYestoPaymentMmgt();
//  
//
    
    _1939_page.TC02_AutoPayrollDate _PaymentMmgt = new _1939_page.TC02_AutoPayrollDate(driver);
    
  TestModellerLogger.SetLastNodeGuid("80af7c8d-d174-4330-ae3d-d09047f3fdc2");
  _PaymentMmgt.Click_clickSave();
  

  TestModellerLogger.SetLastNodeGuid("fb1cd1d6-71fb-45a6-91fb-8aec8d6c71de");
  _PaymentMmgt.Click_getmsg();
    

    }

}
