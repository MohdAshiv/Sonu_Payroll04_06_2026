package AlertsForEmployeeAge;

import reports.TestNGListener;
import tests.TestBase;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ec46dc20-1da3-4c5f-83da-ce785f427030
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1338, profileId = 101205)
public class TC475over21andEmpRateisBelowNMW extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subScriptOpeningBalance","subScriptOpeningBalance - Default Profile"})
    @TestModellerPath(guid = "e853ed54-ab2a-40c0-a93c-d6d152bff41f")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
    	
    	sTestCaseID="TC475";
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
    

    TestModellerLogger.SetLastNodeGuid("e0fb63b7-8522-4daf-b671-0e1712be8115");
    _gotoPayrollSetting.Click_clickPayroll();
    
    
      pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
//    
//    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
//    _runpayrollpage.Click_ClickRunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
//    _runpayrollpage.Click_ClickRunPayroll2();
//    

//    TestModellerLogger.SetLastNodeGuid("a3342d2d-f649-4841-b422-99c823ece078");
//    _gotoPayrollSetting.Click_clickEditCompany();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa4ac16e-6c4f-4b4c-9a57-ded7110bf2b6");
//    _gotoPayrollSetting.Click_gotoPayrollDetails();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d08e4a03-9e9b-46f6-aee7-a2a736a55c08");
//    _gotoPayrollSetting.Click_PayrollSettings();
//    

    _1760ER_Allow.SearchEmployee _searchEmployee = new _1760ER_Allow.SearchEmployee(driver);
//    TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//    _searchEmployee.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//    _searchEmployee.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
    _searchEmployee.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
    _searchEmployee.Select_SelectEmployeeStatus(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
    _searchEmployee.Enter_EnterEmployeeName(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
    _searchEmployee.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
    _searchEmployee.Click_clickonEmpName();
    
    
	_1918NMWPage._1918NMWAlert __1918NMWAlert = new _1918NMWPage._1918NMWAlert(driver);
	
	   TestModellerLogger.SetLastNodeGuid("1ae83720-b8a9-490a-8a1f-c7fd7e1a8f85");
	    __1918NMWAlert.EditEmployeeDetail();
	    
	    
	    TestModellerLogger.SetLastNodeGuid("3dd8fc25-4713-4f26-898b-3f3b0a8a67d2");
	    __1918NMWAlert.Click_clickPersonalDetails();
	    

	    TestModellerLogger.SetLastNodeGuid("b6d42121-662a-45f3-8875-99ab29bcadde");
	    __1918NMWAlert.Enter_EmpDOB(data[9]);
	    
	    
	    
	    
	    TestModellerLogger.SetLastNodeGuid("f294f3ef-1d8d-4549-92d7-9102a9caa0f2");
	    __1918NMWAlert.Click_ClickMandatoryPayrollInformation();
	    

	    TestModellerLogger.SetLastNodeGuid("29bd7bf6-0470-430e-a131-d91e2d757388");
	    __1918NMWAlert.Enter_EmpJoiningDate(data[8]);
	    
	    
	    TestModellerLogger.SetLastNodeGuid("29bd7bf6-0470-430e-a131-d91e2d757388");
	    __1918NMWAlert.Select_EmpNICategoryCode(data[10]);
	    
	    
	   
	    TestModellerLogger.SetLastNodeGuid("9c25aaa2-0d04-4f84-9fd5-fe2802c31458");
	    __1918NMWAlert.clickPayDetail();
	    
	    
	    
//	    __1918NMWAlert.Enter_ApprenticeDate(data[11]);
	    __1918NMWAlert.Remove_ApprenticeDate();
	    
	    
	    TestModellerLogger.SetLastNodeGuid("9c25aaa2-0d04-4f84-9fd5-fe2802c31458");
	    __1918NMWAlert.Enter_EmpHourRate(data[7]);
	    


	    
	    TestModellerLogger.SetLastNodeGuid("b6d42121-662a-45f3-8875-99ab29bcadde");
	    __1918NMWAlert.Click_clickSave();
	    
//	    TestModellerLogger.SetLastNodeGuid("b6d42121-662a-45f3-8875-99ab29bcadde");
//	    __1918NMWAlert.Click_clickSave();
	    
	    
	    
//	    __1918NMWAlert.successmsg();
	    
	    __1918NMWAlert.refreshpage();
	    

	    TestModellerLogger.SetLastNodeGuid("b26aa896-f41f-4fa8-a4b5-5d6b9a01c2b8");
	    __1918NMWAlert.Click_Alert_at_EmpEditPage();
	    
	    
	    __1918NMWAlert.scForalert1();
//	    
//
	    TestModellerLogger.SetLastNodeGuid("5e677033-4454-4a99-940a-b7fb06dece99");
	    __1918NMWAlert.Click_gotoPayrollDashboardA();
//	    
//
	    TestModellerLogger.SetLastNodeGuid("0baa3546-ab2e-4d34-a22d-fca248051ec1");
	    __1918NMWAlert.Click_Alert_at_PayrollDashboard();
	    
	    
	    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
	    _runpayrollpage.Click_ClickRunPayroll1();
	    

	    TestModellerLogger.SetLastNodeGuid("930c683a-0ed2-46e2-a1ae-04724f60bfd5");
	    __1918NMWAlert.Click_Alert_at_Payroll();


    
    
    

    }

}
