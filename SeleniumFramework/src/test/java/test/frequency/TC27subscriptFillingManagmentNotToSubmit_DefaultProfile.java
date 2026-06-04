package test.frequency;

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
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c135d6cc-82b1-4c7c-9a02-bf5b9467351b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1319, profileId = 101188)
public class TC27subscriptFillingManagmentNotToSubmit_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;


    
    @Test  (groups= {"subscriptDeregisterWithEmploye","subscriptDeregisterWithEmploye - Default Profile"})
    @TestModellerPath(guid = "543c0792-f1c3-45e0-9f1d-29f5957a691e")
    public void GoToUrlAssertUrlPositiveSelectStatusSearch1ClickSelectCheckBoxPositiveSelectSubmitReasonClickS1() throws Exception
    {
      
    	sTestCaseID="TC27";
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
    

pages.SearchClient2 _SearchClient2 = new pages.SearchClient2(driver);
//    TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//    _SearchClient2.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//    _SearchClient2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
    _SearchClient2.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
    _SearchClient2.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
    _SearchClient2.Click_SearchButton();
    

    TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
    _SearchClient2.Click_ClickOnClient();
    

pages.leavertesting3 _leavertesting = new pages.leavertesting3(driver);

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    



    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    _leavertesting.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("74ee97bb-1865-4fc3-b38b-e1d751372381");
    _leavertesting.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("daf8d06f-5e14-4f77-b50b-5f0ece9142f1");
    _leavertesting.Click_gotoFilingManagement();
    
    pages.frequency.NotToSubmot _NotToSubmot = new pages.frequency.NotToSubmot(driver);
//    TestModellerLogger.SetLastNodeGuid("bcf2d450-71bb-4c1b-99d6-4b09ac97fb99");
//    _NotToSubmot.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("361abb44-a8b2-41de-ba3b-bacedf981428");
//    _NotToSubmot.AssertUrl();
//    

    pages.DeregisterwithEmployee _DeregisterwithEmployee = new pages.DeregisterwithEmployee(driver);


    TestModellerLogger.SetLastNodeGuid("30c9a3c5-7da0-4e63-9f1b-c116c58016df");
    _DeregisterwithEmployee.Select_StatusSearch1(data[5]);


    TestModellerLogger.SetLastNodeGuid("a3524d39-3d26-45a6-bc91-6b5104c4ce02");
    _DeregisterwithEmployee.Click_SelectCheckBox();

    TestModellerLogger.SetLastNodeGuid("34148a0e-5c9e-4be5-b517-2e2063627eb9");
    _NotToSubmot.Enter_EnterNotes(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("ea5a2da4-271a-4d74-a792-d9d548dd3e30");
//    _NotToSubmot.Click_ClickNot_to_submit();
//    

//    pages.frequency.not_to_submitclick _not_to_submitclick = new pages.frequency.not_to_submitclick(driver);
////    TestModellerLogger.SetLastNodeGuid("f02b4fb5-6b38-45e2-b877-ae451429fb78");
////    _not_to_submitclick.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("ada33f7b-20df-43e4-a47c-32c4057ef794");
////    _not_to_submitclick.AssertUrl();
////    
//
//    TestModellerLogger.SetLastNodeGuid("4011717c-b31c-493a-8f28-f34ca5194c79");
//    _not_to_submitclick.Click_clickNot_to_submit();
//    
//    
//    TestModellerLogger.SetLastNodeGuid("65666cdd-8560-4dfd-a8e6-8062fb039052");
//    _NotToSubmot.Click_clickNOTTOSUBMIT2();
    

    
    
PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
	
	TestModellerLogger.SetLastNodeGuid("ba20616f-2ad5-40d5-9166-657bb6b0822f");
    _PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();


PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


	    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
	    _PayrollDoUndo.Click_Undo_Last_Payroll_();
    
    

    

//_1918NMWPage._1918NMWAlert __1918NMWAlert = new _1918NMWPage._1918NMWAlert(driver);	
//
//TestModellerLogger.SetLastNodeGuid("5e677033-4454-4a99-940a-b7fb06dece99");
//__1918NMWAlert.Click_gotoPayrollDashboard1();
//
//
//PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);
//
//    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
//    _PayrollDoUndo.Click_Undo_Last_Payroll_();
    

//    TestModellerLogger.SetLastNodeGuid("68a24600-c36f-4846-b61f-b4308b921555");
//    _NotToSubmot.Click_DownloadPDF();
//    
     
    	
//        pages.DeregisterwithEmployee _DeregisterwithEmployee = new pages.DeregisterwithEmployee(driver);
//
//
//    TestModellerLogger.SetLastNodeGuid("30c9a3c5-7da0-4e63-9f1b-c116c58016df");
//    _DeregisterwithEmployee.Select_StatusSearch1(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("a3524d39-3d26-45a6-bc91-6b5104c4ce02");
//    _DeregisterwithEmployee.Click_SelectCheckBox();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8122f2d7-794b-451a-8976-64e237769729");
//    _DeregisterwithEmployee.Select_SubmitReason(data[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("11a48221-7314-4ea1-8bea-d3f16636ad0b");
//    _DeregisterwithEmployee.Click_SubmitToHMRC();
//    
//    pages.frequency.fillingVerification _h11 = new pages.frequency.fillingVerification(driver);
////    TestModellerLogger.SetLastNodeGuid("c8a170fe-63de-49c5-9dac-97b46096d8e2");
////    _h11.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("d73e0ab5-17ee-442c-ac43-a1a7d9aa6cdd");
////    _h11.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("133d17fd-52da-45aa-a04a-2df26288d779");
//    _h11.Click_ClickSUBMITTED();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6719b15f-0bb1-4788-b411-4b58c96e7ef4");
//    _h11.Click_DownloadPDF();
//    
    }

//    TestModellerLogger.SetLastNodeGuid("78e38328-5850-48a5-b344-62e690b4223c");
//    _DeregisterwithEmployee.Click_PayrollDashboard();
//    




/*
    @Test  (groups= {"subscriptDeregisterWithEmploye","subscriptDeregisterWithEmploye - Default Profile"})
    @TestModellerPath(guid = "5d3a5581-f79b-4618-a148-17c77c2ec306")
    public void GoToUrlAssertUrlPositiveSelectStatusSearch1ClickSelectCheckBoxPositiveSelectSubmitReasonClickS2() throws Exception
    {
        
        pages.DeregisterwithEmployee _DeregisterwithEmployee = new pages.DeregisterwithEmployee(driver);
    TestModellerLogger.SetLastNodeGuid("e7e7b13e-cad5-4ca5-8a0c-da98f1de055e");
    _DeregisterwithEmployee.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d6423e20-09c0-476a-9514-bfb648ed0f57");
    _DeregisterwithEmployee.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("30c9a3c5-7da0-4e63-9f1b-c116c58016df");
    _DeregisterwithEmployee.Select_StatusSearch1("Pending");
    

    TestModellerLogger.SetLastNodeGuid("a3524d39-3d26-45a6-bc91-6b5104c4ce02");
    _DeregisterwithEmployee.Click_SelectCheckBox();
    

    TestModellerLogger.SetLastNodeGuid("8122f2d7-794b-451a-8976-64e237769729");
    _DeregisterwithEmployee.Select_SubmitReason("Reasonable excuse");
    

    TestModellerLogger.SetLastNodeGuid("11a48221-7314-4ea1-8bea-d3f16636ad0b");
    _DeregisterwithEmployee.Click_SubmitToHMRC();
    

    TestModellerLogger.SetLastNodeGuid("78e38328-5850-48a5-b344-62e690b4223c");
    _DeregisterwithEmployee.Click_PayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("a4dc0a5c-2ac0-4f93-845f-4297ce0c9817");
    _DeregisterwithEmployee.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("8c9eed08-021a-4fe7-819f-03d548b3a2ac");
    _DeregisterwithEmployee.Click_RunPayroll2();
    

pages.deregistercompany _deregistercompany = new pages.deregistercompany(driver);
    TestModellerLogger.SetLastNodeGuid("92e36840-8038-4058-b69e-dcc782f97d62");
    _deregistercompany.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f210d055-c68b-4639-9f56-2e37685b74e2");
    _deregistercompany.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c5a03d8-2b44-4009-8013-157adee9170c");
    _deregistercompany.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("b7945180-59df-470a-9376-78c9b86ce68a");
    _deregistercompany.Click_ClickRunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("576ee54e-7555-456b-ac17-75ab51aedf4f");
    _deregistercompany.Click_ClickEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("567c58ae-55ad-448f-8a09-ef1acf55aa06");
    _deregistercompany.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("80f7bc94-218f-4326-a31a-dfa32c9c94db");
    _deregistercompany.Click_selectYes();
    

    TestModellerLogger.SetLastNodeGuid("5b939b97-177b-46c4-8a72-05a1c721dc67");
    _deregistercompany.Enter_EnterDeRegistrationDate("44280.546959340281");
    

    TestModellerLogger.SetLastNodeGuid("112659ad-e4a5-4eb5-864b-261bdd1cdbfe");
    _deregistercompany.Click_ClickSave();
    

pages.verifypage _verifypage = new pages.verifypage(driver);
    TestModellerLogger.SetLastNodeGuid("8966ec8c-5997-446f-8516-3d0395be64bb");
    _verifypage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1b6ac91c-411a-4da3-a48d-0e675c22edf6");
    _verifypage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ada05901-b7d7-428c-be1d-92efed88ee50");
    _verifypage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("0920bf51-30ea-40e7-9db0-4b1f44c63ae0");
    _verifypage.Click__Company_DeRegistered_Message();
    

    TestModellerLogger.SetLastNodeGuid("f29f7141-3b91-4fe0-8cc9-fa6c11dd5a0c");
    _verifypage.Click_gotoFilingManagement();
    

    }
*/
}
