package _1908WeeklyRate;

import org.testng.annotations.Test;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import tests.TestBase;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

public class TC018_1908WeektoDayAlert extends TestBase{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null;

		    
		    @Test  (priority=1,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
		    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
		    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
		    {
		        
		    	sTestCaseID="TC018";
		        Sheet="Sheet4";
		     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
		    	
		    	
		        pages.loginpage4 _loginpage = new pages.loginpage4(driver);
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
//		    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//		    _agentpage.GoToUrl();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//		    _agentpage.AssertUrl();
		    

		    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
		    _agentpage.Enter_SearchAgentName(data[3]);
		    

		    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
		    _agentpage.Click_ClickSearch();
		    

		    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
		    _agentpage.Click_ClickAgent();
		    
		    
//		   	_1939_page.AgentsSetting _AgentsSetting = new _1939_page.AgentsSetting(driver);
////		    TestModellerLogger.SetLastNodeGuid("9c12e65b-7db5-4604-aadb-4fb04da5d1c9");
////		    _AgentsSetting.GoToUrl();
		////    
		////
////		    TestModellerLogger.SetLastNodeGuid("eaaefc30-621f-4537-b288-c0044655cb08");
////		    _AgentsSetting.AssertUrl();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("40d94aae-f05e-4f6d-a49a-cbc68c7aa060");
//		    _AgentsSetting.Click_ClickAgentSettings();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("4584b632-51f1-42d2-b657-d4c77d169454");
//		    _AgentsSetting.Click_clickPayroll();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("c5c76273-6d5a-4c5a-90e6-5999ba109e09");
//		    _AgentsSetting.Click_ClicktoAddDate();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
//		    _AgentsSetting.Enter_EnterAutoRunDate(data[4]);
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("6eacfabc-a22b-4a08-b808-3eedbcae0ddd");
//		    _AgentsSetting.Click_ClickSave();
		    

		pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//		    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//		    _OpenClient.GoToUrl();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//		    _OpenClient.AssertUrl();
		    

		    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
		    _OpenClient.Click_ClientsClick();
		    

		    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
		    _OpenClient.Enter_EnterClientName(data[4]);
		    

		    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
		    _OpenClient.Click_ClickSearch();
		    

		    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
		    _OpenClient.Click_ClickClient();
	  
		    pages.gotoPayrollSetting _gotoPayrollSetting = new pages.gotoPayrollSetting(driver);
//		    TestModellerLogger.SetLastNodeGuid("b333bb86-e176-4761-b72c-e02790318565");
//		    _gotoPayrollSetting.GoToUrl();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("c9dacefe-86b3-4337-b563-f20d557a63c0");
//		    _gotoPayrollSetting.AssertUrl();
		    

		    TestModellerLogger.SetLastNodeGuid("e0fb63b7-8522-4daf-b671-0e1712be8115");
		    _gotoPayrollSetting.Click_clickPayroll();
		    

//		    TestModellerLogger.SetLastNodeGuid("a3342d2d-f649-4841-b422-99c823ece078");
//		    _gotoPayrollSetting.Click_clickEditCompany();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("fa4ac16e-6c4f-4b4c-9a57-ded7110bf2b6");
//		    _gotoPayrollSetting.Click_gotoPayrollDetails();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("d08e4a03-9e9b-46f6-aee7-a2a736a55c08");
//		    _gotoPayrollSetting.Click_PayrollSettings();
		//    

		    _1908Page.SearchEmployee _searchEmploye = new _1908Page.SearchEmployee(driver);
//		    TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//		    _searchEmployee.GoToUrl();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//		    _searchEmployee.AssertUrl();
		    

		    TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
		    _searchEmploye.Click_clickEmployeeList();
		    

		   TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
		    _searchEmploye.Select_SelectEmployeeStatus(data[5]);
		    

		    TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
		    _searchEmploye.Enter_EnterEmployeeName(data[6]);
		    

		    TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
		    _searchEmploye.Click_clickSearch();
		    

		    TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
		    _searchEmploye.Click_clickonEmpName();
		    
		    
		    _1908Page.EditEmployeeDetails _EditEmployee = new _1908Page.EditEmployeeDetails(driver);
		    _EditEmployee.Click_editemplydetail();
		    _EditEmployee.Click_Paydetails();
		    _EditEmployee.Click_howpayworkout(data[7]);
		    Thread.sleep(1000);
		    _1908Page.AlertDetails _AlertDetail = new _1908Page.AlertDetails(driver);
		    _AlertDetail.VerifyAlertMessage(data[8],"Please add the day rate and complete process pay set up as pay worked out has changed.");
		    _EditEmployee.TakeShot("Verify WeektoDay Alert");
		    _EditEmployee.restrainChanges();
		    
		    }

}
