package AOE;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f950ee3e-df17-4040-ac47-3ee417b05ffe
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1286, profileId = 101160)
public class TC901_906AOE_ChildSupportPopup5 extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
        
    	sTestCaseID="TC823";
        Sheet="Sheet3";
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
    

pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//    _leavertesting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//    _leavertesting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    
    
    page.factory.EmployeeThreeDotOption selectoptions=new page.factory.EmployeeThreeDotOption(driver);
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    selectoptions.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    selectoptions.Click_SelectAddition_Deduction();
    
    
    page.factory.EmployeeAddition_Deduction_AOE_Page addDeduction=new page.factory.EmployeeAddition_Deduction_AOE_Page(driver);
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    addDeduction.ClickAOE();
    
    
    addDeduction.DeleteAOE();
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    addDeduction.ClickAddButton();
    

    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    addDeduction.SelectAOEOption(data[5]);
    
    addDeduction.verifyCSPopup(data[5]);
    
//    page.factory.AOE_ChildSupportPopup popupEntry=new page.factory.AOE_ChildSupportPopup(driver);
//    
//    popupEntry.Enter_referenceElem(data[6]);
//    
//    popupEntry.Enter_Description(data[7]);
//    
//    popupEntry.Enter_DateMade(data[8]);
//    
//    popupEntry.Enter_DateAppliedFor(data[9]);
//    
//    popupEntry.Enter_Date2Stop(data[10]);
//    
//    popupEntry.CheckPriority();
//    
//    popupEntry.Enter_MonthlyAmount(data[11]);
//    
//    popupEntry.Enter_ProtectedAmt(data[12]);
//    
//    popupEntry.CheckAdminChargeBox();
//    
//    popupEntry.EnterAttachmentShortfallAtStart(data[13]);
//    
//    popupEntry.EnterCumulatvAmntPaidStart(data[14]);
//    
//    popupEntry.EnterNotes(data[15]);
//    
//    popupEntry.ClickSavebtn();
//    
//    popupEntry.closePopup();
    
//    

//    TestModellerLogger.SetLastNodeGuid("74ee97bb-1865-4fc3-b38b-e1d751372381");
//    _leavertesting.Click_RunPayroll2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("daf8d06f-5e14-4f77-b50b-5f0ece9142f1");
//    _leavertesting.Click_gotoFilingManagement();
//    
//    
//PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
//	
//	TestModellerLogger.SetLastNodeGuid("ba20616f-2ad5-40d5-9166-657bb6b0822f");
//    _PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();
//    
//    
//    PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);
//
//
//    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
//    _PayrollDoUndo.Click_Undo_Last_Payroll_();
    

    }
    
    @Test  (priority=2,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs2() throws Exception
    {
        
    	sTestCaseID="TC824";
        Sheet="Sheet3";
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
    

pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//    _leavertesting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//    _leavertesting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    
    
    page.factory.EmployeeThreeDotOption selectoptions=new page.factory.EmployeeThreeDotOption(driver);
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    selectoptions.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    selectoptions.Click_SelectAddition_Deduction();
    
    
    page.factory.EmployeeAddition_Deduction_AOE_Page addDeduction=new page.factory.EmployeeAddition_Deduction_AOE_Page(driver);
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    addDeduction.ClickAOE();
    
addDeduction.DeleteAOE();
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    addDeduction.ClickAddButton();
    

    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    addDeduction.SelectAOEOption(data[5]);
    
//    addDeduction.verifyCSPopup(data[5]);
    
    page.factory.AOE_ChildSupportPopup popupEntry=new page.factory.AOE_ChildSupportPopup(driver);
    
    popupEntry.Enter_referenceElem(data[6]);
    
    popupEntry.Enter_Description(data[7]);
    
    popupEntry.Enter_DateMade(data[8]);
    
    popupEntry.Enter_DateAppliedFor(data[9]);
    
 //   popupEntry.Enter_Date2Stop(data[10]);
    
 //   popupEntry.CheckPriority();
    
    popupEntry.Enter_MonthlyAmount(data[11]);
    
    popupEntry.Enter_ProtectedAmt(data[12]);
    
//    popupEntry.CheckAdminChargeBox();
//    
//    popupEntry.EnterAttachmentShortfallAtStart(data[13]);
//    
//    popupEntry.EnterCumulatvAmntPaidStart(data[14]);
//    
//    popupEntry.EnterNotes(data[15]);
    
    popupEntry.ClickSavebtn();
    
    popupEntry.closePopup();
    

    }
    
    @Test  (priority=3,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs3() throws Exception
    {
        
    	sTestCaseID="TC825";
        Sheet="Sheet3";
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
    

pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//    _leavertesting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//    _leavertesting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    
    
    page.factory.EmployeeThreeDotOption selectoptions=new page.factory.EmployeeThreeDotOption(driver);
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    selectoptions.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    selectoptions.Click_SelectAddition_Deduction();
    
    
    page.factory.EmployeeAddition_Deduction_AOE_Page addDeduction=new page.factory.EmployeeAddition_Deduction_AOE_Page(driver);
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    addDeduction.ClickAOE();
    
addDeduction.DeleteAOE();
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    addDeduction.ClickAddButton();
    

    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    addDeduction.SelectAOEOption(data[5]);
    
 //   addDeduction.verifyCSPopup(data[5]);
    
    page.factory.AOE_ChildSupportPopup popupEntry=new page.factory.AOE_ChildSupportPopup(driver);
    
    popupEntry.Enter_referenceElem(data[6]);
    
    popupEntry.Enter_Description(data[7]);
    
    popupEntry.Enter_DateMade(data[8]);
    
    popupEntry.Enter_DateAppliedFor(data[9]);
    
 //   popupEntry.Enter_Date2Stop(data[10]);
    
    popupEntry.CheckPriority();
    
    popupEntry.Enter_MonthlyAmount(data[11]);
    
    popupEntry.Enter_ProtectedAmt(data[12]);
    
//    popupEntry.CheckAdminChargeBox();
//    
//    popupEntry.EnterAttachmentShortfallAtStart(data[13]);
//    
//    popupEntry.EnterCumulatvAmntPaidStart(data[14]);
//    
//    popupEntry.EnterNotes(data[15]);
    
    popupEntry.ClickSavebtn();
    
    popupEntry.closePopup();

    }
    
    @Test  (priority=4,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs4() throws Exception
    {
        
    	sTestCaseID="TC826";
        Sheet="Sheet3";
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
    

pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//    _leavertesting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//    _leavertesting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    
    
    page.factory.EmployeeThreeDotOption selectoptions=new page.factory.EmployeeThreeDotOption(driver);
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    selectoptions.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    selectoptions.Click_SelectAddition_Deduction();
    
    
    page.factory.EmployeeAddition_Deduction_AOE_Page addDeduction=new page.factory.EmployeeAddition_Deduction_AOE_Page(driver);
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    addDeduction.ClickAOE();
    
    addDeduction.DeleteAOE();
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    addDeduction.ClickAddButton();
    

    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    addDeduction.SelectAOEOption(data[5]);
    
 //   addDeduction.verifyCSPopup(data[5]);
    
    page.factory.AOE_ChildSupportPopup popupEntry=new page.factory.AOE_ChildSupportPopup(driver);
    
    popupEntry.Enter_referenceElem(data[6]);
    
    popupEntry.Enter_Description(data[7]);
    
    popupEntry.Enter_DateMade(data[8]);
    
    popupEntry.Enter_DateAppliedFor(data[9]);
    
//    popupEntry.Enter_Date2Stop(data[10]);
//    
//    popupEntry.CheckPriority();
    
    popupEntry.Enter_MonthlyAmount(data[11]);
    
    popupEntry.Enter_ProtectedAmt(data[12]);
    
    popupEntry.CheckAdminChargeBox();
    
//    popupEntry.EnterAttachmentShortfallAtStart(data[13]);
//    
//    popupEntry.EnterCumulatvAmntPaidStart(data[14]);
    
    popupEntry.EnterNotes(data[15]);
    
    popupEntry.ClickSavebtn();
    
    popupEntry.closePopup();

    }
    
    @Test  (priority=5,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs5() throws Exception
    {
        
    	sTestCaseID="TC827";
        Sheet="Sheet3";
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
    

pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//    _leavertesting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//    _leavertesting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    
    
    page.factory.EmployeeThreeDotOption selectoptions=new page.factory.EmployeeThreeDotOption(driver);
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    selectoptions.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    selectoptions.Click_SelectAddition_Deduction();
    
    
    page.factory.EmployeeAddition_Deduction_AOE_Page addDeduction=new page.factory.EmployeeAddition_Deduction_AOE_Page(driver);
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    addDeduction.ClickAOE();
    

    addDeduction.DeleteAOE();
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    addDeduction.ClickAddButton();
    

    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    addDeduction.SelectAOEOption(data[5]);
    
//    addDeduction.verifyCSPopup(data[5]);
    
    page.factory.AOE_ChildSupportPopup popupEntry=new page.factory.AOE_ChildSupportPopup(driver);
    
    popupEntry.Enter_referenceElem(data[6]);
    
    popupEntry.Enter_Description(data[7]);
    
    popupEntry.Enter_DateMade(data[8]);
    
    popupEntry.Enter_DateAppliedFor(data[9]);
    
//    popupEntry.Enter_Date2Stop(data[10]);
//    
//    popupEntry.CheckPriority();
    
    popupEntry.Enter_MonthlyAmount(data[11]);
    
    popupEntry.Enter_ProtectedAmt(data[12]);
    
    popupEntry.CheckAdminChargeBox();
    
//    popupEntry.EnterAttachmentShortfallAtStart(data[13]);
//    
//    popupEntry.EnterCumulatvAmntPaidStart(data[14]);
    
    popupEntry.EnterNotes(data[15]);
    
    popupEntry.ClickSavebtn();
    
    popupEntry.closePopup();

    }
    
    @Test  (priority=6,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs6() throws Exception
    {
        
    	sTestCaseID="TC828";
        Sheet="Sheet3";
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
    

pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//    _leavertesting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//    _leavertesting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    
    
    page.factory.EmployeeThreeDotOption selectoptions=new page.factory.EmployeeThreeDotOption(driver);
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    selectoptions.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    selectoptions.Click_SelectAddition_Deduction();
    
    
    page.factory.EmployeeAddition_Deduction_AOE_Page addDeduction=new page.factory.EmployeeAddition_Deduction_AOE_Page(driver);
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    addDeduction.ClickAOE();
    

    addDeduction.DeleteAOE();
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    addDeduction.ClickAddButton();
    

    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    addDeduction.SelectAOEOption(data[5]);
    
    addDeduction.verifyCSPopup(data[5]);
    
    page.factory.AOE_ChildSupportPopup popupEntry=new page.factory.AOE_ChildSupportPopup(driver);
    
    popupEntry.Enter_referenceElem(data[6]);
    
    popupEntry.Enter_Description(data[7]);
    
    popupEntry.Enter_DateMade(data[8]);
    
    popupEntry.Enter_DateAppliedFor(data[9]);
    
    popupEntry.Enter_Date2Stop(data[10]);
    
//    popupEntry.CheckPriority();
    
    popupEntry.Enter_MonthlyAmount(data[11]);
    
    popupEntry.Enter_ProtectedAmt(data[12]);
    
    popupEntry.CheckAdminChargeBox();
    
//    popupEntry.EnterAttachmentShortfallAtStart(data[13]);
//    
//    popupEntry.EnterCumulatvAmntPaidStart(data[14]);
//    
//    popupEntry.EnterNotes(data[15]);
    
    popupEntry.ClickSavebtn();
    
    popupEntry.closePopup();
    

    }
    
    @Test  (priority=7,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs7() throws Exception
    {
        
    	sTestCaseID="TC829";
        Sheet="Sheet3";
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
    

pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//    TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//    _leavertesting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//    _leavertesting.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
    _leavertesting.Click_gotoPayroll();
    
    
    page.factory.EmployeeThreeDotOption selectoptions=new page.factory.EmployeeThreeDotOption(driver);
    

    TestModellerLogger.SetLastNodeGuid("5727fe0d-d650-4293-9a69-70a027ff3f6b");
    selectoptions.Click_ClickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("615f9252-d630-4075-80a0-ad1c838d3e96");
    selectoptions.Click_SelectAddition_Deduction();
    
    
    page.factory.EmployeeAddition_Deduction_AOE_Page addDeduction=new page.factory.EmployeeAddition_Deduction_AOE_Page(driver);
    

    TestModellerLogger.SetLastNodeGuid("a767f774-f14a-406a-92fe-6a2954c8e5b6");
    addDeduction.ClickAOE();
    
    addDeduction.DeleteAOE();
    

    TestModellerLogger.SetLastNodeGuid("54da4881-fd79-4be7-8edd-20af523691e0");
    addDeduction.ClickAddButton();
    

    TestModellerLogger.SetLastNodeGuid("318547d0-8647-4b09-82a4-f0a24e14e39f");
    addDeduction.SelectAOEOption(data[5]);
    
    page.factory.AOE_ChildSupportPopup popupEntry=new page.factory.AOE_ChildSupportPopup(driver);
    
    popupEntry.Enter_referenceElem(data[6]);
    
    popupEntry.Enter_Description(data[7]);
    
    popupEntry.Enter_DateMade(data[8]);
    
    popupEntry.Enter_DateAppliedFor(data[8]);
    
 //   popupEntry.Enter_Date2Stop(data[9]);
    
    popupEntry.CheckPriority();
    
    popupEntry.Enter_MonthlyAmount(data[11]);
    
    popupEntry.Enter_ProtectedAmt(data[12]);
    
    popupEntry.CheckAdminChargeBox();
    
//    popupEntry.EnterAttachmentShortfallAtStart(data[13]);
//    
//    popupEntry.EnterCumulatvAmntPaidStart(data[14]);
    
    popupEntry.EnterNotes(data[15]);
    
    popupEntry.ClickSavebtn();
    
    popupEntry.closePopup();
    

    }

}
