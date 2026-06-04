package test.frequency;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/88fffc54-d989-455f-b905-9d8ff7a1e266
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1358, profileId = 101226)
public class TC22subScriptFourWeeklyFrequency_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;


    
    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "47059d2c-e4d1-4bd9-b07b-44f49df9173f")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
       
    	sTestCaseID="TC22";
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
//    

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
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    
    
    pages.frequency.FourWeekly _FourWeekly = new pages.frequency.FourWeekly(driver);
//    TestModellerLogger.SetLastNodeGuid("03f2e0aa-083a-4d15-b394-3fa24cc7575e");
//    _FourWeekly.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7b131195-ce19-4087-8bbf-48a8a2699bdb");
//    _FourWeekly.AssertUrl();
    

 

    TestModellerLogger.SetLastNodeGuid("21e7fc1e-2454-4449-aae2-53ad4888ef82");
    _FourWeekly.Click_ClickSave();
    


pages.frequency.runpayrollpagefourweekly _runpayrollpage = new pages.frequency.runpayrollpagefourweekly(driver);
//    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
//    _runpayrollpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
//    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


	    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
	    _PayrollDoUndo.Click_Undo_Last_Payroll_();


    }

}
