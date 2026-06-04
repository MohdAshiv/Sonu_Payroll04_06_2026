package _1744CISDSBTest;

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
public class TC505NewCntrorisActive extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true,groups= {"subScriptOpeningBalance","subScriptOpeningBalance - Default Profile"})
    @TestModellerPath(guid = "e853ed54-ab2a-40c0-a93c-d6d152bff41f")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
    	
    	sTestCaseID="TC505";
        Sheet="Sheet3";
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
    

    _1744CISDSB.CIS_Dashboard _CIS_Dashboard = new _1744CISDSB.CIS_Dashboard(driver);
    
    TestModellerLogger.SetLastNodeGuid("fe2b4ba1-52cf-473b-bfe1-55a22806dfdd");
    _CIS_Dashboard.Click_gotoCIS();
    

    TestModellerLogger.SetLastNodeGuid("72f2a607-7bb7-4908-9100-959f8a7536f9");
    _CIS_Dashboard.Click_CIS_Dashboard();
    
    
    
    TestModellerLogger.SetLastNodeGuid("4da80ce9-d319-48dd-963f-f12d41f699da");
    _CIS_Dashboard.Enter_Search_a_Contractor(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4da80ce9-d319-48dd-963f-f12d41f699da");
    _CIS_Dashboard.Click_Edit_Contractor();
    
    TestModellerLogger.SetLastNodeGuid("4da80ce9-d319-48dd-963f-f12d41f699da");
    _CIS_Dashboard.verifyNewContractorIsActive();
  
    }
    
 
}
