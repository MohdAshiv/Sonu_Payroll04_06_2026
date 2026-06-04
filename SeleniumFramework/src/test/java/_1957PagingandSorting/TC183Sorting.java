package _1957PagingandSorting;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Blue;
import pages.frequency.runpayrollpage1;
import pages.frequency.weeklyFrequency;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/61094e72-17a3-4f97-8e81-923bd7e8148c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1353, profileId = 101220)
public class TC183Sorting extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subScriptPayFrequency","subScriptPayFrequency - Default Profile"})
    @TestModellerPath(guid = "05667963-18ac-43c9-9286-f1838557c35a")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC183";
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
    

    _1747page.payslip_Blueforfrequency _payslip = new _1747page.payslip_Blueforfrequency(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    
    
    
    _1957PagingandSorting.checksorting _reports = new _1957PagingandSorting.checksorting(driver);
    
    
    _reports.checkSortingatDashboard();
    
    TestModellerLogger.SetLastNodeGuid("ab102354-b6d1-44b0-8435-d0c261e53cb1");
    _reports.Click__Reports_();
    
    
    TestModellerLogger.SetLastNodeGuid("5e46b00d-510a-4823-b5a7-89669363fd7a");
    _reports.Click_Employee_Details_Listclick();
    
    
    _reports.checkSortingatEMPDetail();
    
    
    TestModellerLogger.SetLastNodeGuid("ab102354-b6d1-44b0-8435-d0c261e53cb1");
    _reports.Click__Reports_();
    
    
    TestModellerLogger.SetLastNodeGuid("319ac179-14a9-4a9a-82a6-ed809c730542");
    _reports.Click_Individual_Employee_Pay_Scheduleclick();
    
    
    _reports.checkSortingatEmpPaySchedule();
    
    
    
    TestModellerLogger.SetLastNodeGuid("ab102354-b6d1-44b0-8435-d0c261e53cb1");
    _reports.Click__Reports_();
    
    
    TestModellerLogger.SetLastNodeGuid("57d17e00-dfd9-4dfd-bf3f-45781d531542");
    _reports.Click_Payslipsclick();
    
    
    _reports.checkSortingatPayslip();
    
    
    TestModellerLogger.SetLastNodeGuid("ab102354-b6d1-44b0-8435-d0c261e53cb1");
    _reports.Click__Reports_();
    
    
    TestModellerLogger.SetLastNodeGuid("b2d4ada0-4643-48cc-bc36-06e730e2bf60");
    _reports.Click_P11();
    
    
    _reports.checkSortingatP11();
    
    
    TestModellerLogger.SetLastNodeGuid("ab102354-b6d1-44b0-8435-d0c261e53cb1");
    _reports.Click__Reports_();
    
    _reports.Click_Payroll_Summary();
    
    
    _reports.checkSortingatPayrollsummary();
    
    
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.runPayroll2();
    
    
    
//    _1747page.filingmanagement1 _leavertesting = new _1747page.filingmanagement1(driver);
//	  
//	  TestModellerLogger.SetLastNodeGuid("daf8d06f-5e14-4f77-b50b-5f0ece9142f1");
//	  _leavertesting.Click_gotoFilingManagement();
//    
//	  
//	  _leavertesting.LastPayrollEPS();
    
    }

}
