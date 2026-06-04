package _1540EEInfoImport;

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
public class TC932EEIInfomport extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyJobTitle() throws Exception
    {
        
    	sTestCaseID="TC841";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

_searchEmployee.verifyJobTitle();


//TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
//_searchEmployee.verifyEE();
//    

    }
    
    
    @Test  (priority=2,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyGender() throws Exception
    {
        
    	sTestCaseID="TC842";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

_searchEmployee.verifyGender();


//TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
//_searchEmployee.verifyEE();
//    

    }
    
    
    @Test  (priority=3,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyDOB() throws Exception
    {
        
    	sTestCaseID="TC843";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

_searchEmployee.verifyDOB();


//TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
//_searchEmployee.verifyEE();
//    

    }
    
    
    @Test  (priority=4,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyAddress() throws Exception
    {
        
    	sTestCaseID="TC844";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

_searchEmployee.verifyAddress();


//TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
//_searchEmployee.verifyEE();
//    

    }
    
    
    @Test  (priority=5,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyJoiningDate() throws Exception
    {
        
    	sTestCaseID="TC845";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

_searchEmployee.verifyDOJ();


//TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
//_searchEmployee.verifyEE();
//    

    }
    
    
    @Test  (priority=6,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyPayrollID() throws Exception
    {
        
    	sTestCaseID="TC846";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

EmployeeDeatil.verifyPayrollID();


//TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
//_searchEmployee.verifyEE();
//    

    }
    
    
    @Test  (priority=7,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyRTISubmissionID() throws Exception
    {
        
    	sTestCaseID="TC847";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

EmployeeDeatil.verifyRTISubmission();

    }
    
    
    @Test  (priority=8,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyPayFrequency() throws Exception
    {
        
    	sTestCaseID="TC848";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

EmployeeDeatil.verifyFrequency();

    }
    
    
    @Test  (priority=9,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyBankDetails() throws Exception
    {
        
    	sTestCaseID="TC849";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

EmployeeDeatil.verifyBankDetail();

    }
    
    
    @Test  (priority=10,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyNI_Category() throws Exception
    {
        
    	sTestCaseID="TC850";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

EmployeeDeatil.verifyNICatogery();

    }
    
    
    @Test  (priority=11,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyTax_Code() throws Exception
    {
        
    	sTestCaseID="TC851";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

EmployeeDeatil.verifyTaxCode();

    }
    
    
    @Test  (priority=12,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyDirector_Import() throws Exception
    {
        
    	sTestCaseID="TC852";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.Click_ClickMandatoryPayrollInformation();

EmployeeDeatil.verifyDirectorData();

    }
    
    
    @Test  (priority=13,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifySalary_Import() throws Exception
    {
        
    	sTestCaseID="TC853";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.clickPayDetail();

EmployeeDeatil.verifySalary();

    }
    
    
    @Test  (priority=14,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyApprenticeDate_Import() throws Exception
    {
        
    	sTestCaseID="TC854";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_EditEE();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

EmployeeDeatil.clickPayDetail();

EmployeeDeatil.verifyApprenticeDat();

    }
    
    
    @Test  (priority=15,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifyOpening_Balance() throws Exception
    {
        
    	sTestCaseID="TC855";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_OpeningBalance();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

//EmployeeDeatil.clickPayDetail();

EmployeeDeatil.verifyOPeningBalance();

    }
    
    
    @Test  (priority=16,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifypension_Balance() throws Exception
    {
        
    	sTestCaseID="TC856";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_OpeningBalance();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

//EmployeeDeatil.clickPayDetail();

EmployeeDeatil.verifyPensionBalance();

    }
    
    
    @Test  (priority=17,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifypension_BalancePopup() throws Exception
    {
        
    	sTestCaseID="TC857";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_OpeningBalance();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

//EmployeeDeatil.clickPayDetail();

//EmployeeDeatil.verifyPensionBalance();

    }
    
    
    @Test  (priority=18,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifypension_BalanceAmount() throws Exception
    {
        
    	sTestCaseID="TC858";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_OpeningBalance();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

//EmployeeDeatil.clickPayDetail();

//EmployeeDeatil.verifyPensionBalance();

    }
    
    
    @Test  (priority=19,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifypension_BalanceYELAmount() throws Exception
    {
        
    	sTestCaseID="TC859";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_OpeningBalance();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

//EmployeeDeatil.clickPayDetail();

//EmployeeDeatil.verifyPensionBalance();

    }
    
    
    @Test  (priority=20,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void verifypension_BalancePopup1() throws Exception
    {
        
    	sTestCaseID="TC860";
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
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
    
    
    pages.leavertesting _leavertesting = new pages.leavertesting(driver);
//  TestModellerLogger.SetLastNodeGuid("53cc8e40-2bfe-4851-ad9c-1034e0fc748d");
//  _leavertesting.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("5a50342d-4bea-4a0a-a17c-f9ee0e8edb94");
//  _leavertesting.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("107717b3-a7fa-4bff-a4b6-ab74c6abd7bc");
  _leavertesting.Click_gotoPayroll();
  
  
  pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
//TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//_searchEmployee.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//_searchEmployee.AssertUrl();


TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
_searchEmployee.Click_clickEmployeeList();


TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
_searchEmployee.Select_SelectEmployeeStatus(data[5]);


TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
_searchEmployee.Enter_EnterEmployeeName(data[6]);


TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
_searchEmployee.Click_clickSearch();


_searchEmployee.Click_clickonEmpName();


_searchEmployee.Click_OpeningBalance();

page.factory.EmployeeDataInput EmployeeDeatil=new page.factory.EmployeeDataInput(driver);

//EmployeeDeatil.clickPayDetail();

//EmployeeDeatil.verifyPensionBalance();

    }
    
   
}
