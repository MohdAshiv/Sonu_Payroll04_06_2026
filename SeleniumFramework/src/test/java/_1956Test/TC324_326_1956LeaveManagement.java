package _1956Test;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.verifyClosePayeErrorMessageOOPS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ae1a2965-cf4d-4dc8-b2fc-8568adc2f048
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1773, profileId = 102204)
public class TC324_326_1956LeaveManagement extends TestBase
{
    
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority = 1,enabled=true, groups= {"_1956LeaveManagement","_1956LeaveManagement - Default Profile"})
    @TestModellerPath(guid = "c1e8d7d0-1d4c-44d5-897f-7366b458164f")
    public void GoToUrlAssertUrlClickAddLeavePositiveSelectselectEmployeePositiveSelectselectLeaveTypePositive() throws Exception
    {
    	

    	
    	sTestCaseID="TC324";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage3 _loginpage = new pages.loginpage3(driver);
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
	
	
	PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
	
	TestModellerLogger.SetLastNodeGuid("8680342f-a3ee-4714-8466-08986f22b4df");
    _PayrollDashboardCheck.Click_gotoLeaveManagementBtn();
	
        
    	_1956Page._1956 __1956 = new _1956Page._1956(driver);
//    TestModellerLogger.SetLastNodeGuid("a298023a-f6c9-47fd-9e0f-6c54659d96e9");
//    __1956.GoToUrl();
//
//    TestModellerLogger.SetLastNodeGuid("be7b8940-a555-4e8f-b2df-1cd62ebe1c7a");
//    __1956.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("93943e8c-9968-4e91-8c66-48039ee75141");
    __1956.Click__Add_Leave_();

    TestModellerLogger.SetLastNodeGuid("57c317a0-f1e8-45c9-9037-c7cf3b73b66a");
    __1956.Select_selectEmployee(data[5]);

    TestModellerLogger.SetLastNodeGuid("5c39aae4-de78-4df0-a7ac-680f16fe9438");
    __1956.Select_selectLeaveType(data[6]);

    TestModellerLogger.SetLastNodeGuid("f2d25e7b-471f-4915-9687-67fd0db3267f");
    __1956.Enter_LeaveStartDate(data[7]);

    TestModellerLogger.SetLastNodeGuid("28ff7fd7-3ffd-4f61-b0f5-1dc057192e10");
    __1956.Enter_LeaveEndDate(data[8]);

    TestModellerLogger.SetLastNodeGuid("c17286aa-d654-41d8-b587-254a0be40711");
    __1956.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("cffbad31-a63b-47c0-9a32-22ea7e57c924");
    _PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();

    TestModellerLogger.SetLastNodeGuid("633b6e69-d1a1-44e0-97a6-2a0f3f944fb6");
    __1956.Click_clickRun_Payroll1();

    TestModellerLogger.SetLastNodeGuid("7851865b-ef60-474d-b233-d70f302c524c");
    __1956.Click_clickRun_Payroll2();

//    TestModellerLogger.SetLastNodeGuid("3e389556-315a-4c5f-8ac2-6bcfa8687677");
//    __1956.Enter_Select_Employee("");
//
//    TestModellerLogger.SetLastNodeGuid("c4ad733f-22b6-4f34-bad4-743abb8d88b8");
//    __1956.Click_getLeaveBalance();
//
//    TestModellerLogger.SetLastNodeGuid("378ba543-1d93-4703-8c2d-033df3274a6c");
//    __1956.Click_gotoReports();
//
//    TestModellerLogger.SetLastNodeGuid("33774d3f-7e25-44ae-a766-877869287df1");
//    __1956.Click_Payslips();

    }


    @Test  (priority = 2,enabled=true, groups= {"_1956LeaveManagement","_1956LeaveManagement - Default Profile"})
    @TestModellerPath(guid = "3c32a914-a372-4d01-9d32-8e28498f24f7")
    public void GoToUrlAssertUrlClickAddLeavePositiveSelectselectEmployeePositiveSelectselectLeaveTypePositive1() throws Exception
    {
    	
    	
    	sTestCaseID="TC325";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage3 _loginpage = new pages.loginpage3(driver);
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
	
	
PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
	
	TestModellerLogger.SetLastNodeGuid("8680342f-a3ee-4714-8466-08986f22b4df");
    _PayrollDashboardCheck.Click_gotoLeaveManagementBtn();
    
        
    	_1956Page._1956 __1956 = new _1956Page._1956(driver);
//    TestModellerLogger.SetLastNodeGuid("a298023a-f6c9-47fd-9e0f-6c54659d96e9");
//    __1956.GoToUrl();
//
//    TestModellerLogger.SetLastNodeGuid("be7b8940-a555-4e8f-b2df-1cd62ebe1c7a");
//    __1956.AssertUrl();

//    TestModellerLogger.SetLastNodeGuid("93943e8c-9968-4e91-8c66-48039ee75141");
//    __1956.Click__Add_Leave_();
//
//    TestModellerLogger.SetLastNodeGuid("57c317a0-f1e8-45c9-9037-c7cf3b73b66a");
//    __1956.Select_selectEmployee("Mr. A last");
//
//    TestModellerLogger.SetLastNodeGuid("5c39aae4-de78-4df0-a7ac-680f16fe9438");
//    __1956.Select_selectLeaveType("Holiday");
//
//    TestModellerLogger.SetLastNodeGuid("f2d25e7b-471f-4915-9687-67fd0db3267f");
//    __1956.Enter_LeaveStartDate("44397");
//
//    TestModellerLogger.SetLastNodeGuid("28ff7fd7-3ffd-4f61-b0f5-1dc057192e10");
//    __1956.Enter_LeaveEndDate("2021-11-13 09:14:03");
//
//    TestModellerLogger.SetLastNodeGuid("c17286aa-d654-41d8-b587-254a0be40711");
//    __1956.Click_Save();

    TestModellerLogger.SetLastNodeGuid("633b6e69-d1a1-44e0-97a6-2a0f3f944fb6");
    __1956.Click_Leave_Report();

    TestModellerLogger.SetLastNodeGuid("7851865b-ef60-474d-b233-d70f302c524c");
    __1956.Select_Period(data[5]);

    TestModellerLogger.SetLastNodeGuid("3e389556-315a-4c5f-8ac2-6bcfa8687677");
    __1956.Enter_Select_Employee(data[6]);
    
    
    TestModellerLogger.SetLastNodeGuid("33774d3f-7e25-44ae-a766-877869287df1");
    __1956.Click_Search();

    TestModellerLogger.SetLastNodeGuid("c4ad733f-22b6-4f34-bad4-743abb8d88b8");
    __1956.Click_getLeaveBalance();
    
    
    TestModellerLogger.SetLastNodeGuid("378ba543-1d93-4703-8c2d-033df3274a6c");
    __1956.Click_gotoReports();

    TestModellerLogger.SetLastNodeGuid("33774d3f-7e25-44ae-a766-877869287df1");
    __1956.Click_Payslips();
    
    TestModellerLogger.SetLastNodeGuid("3e389556-315a-4c5f-8ac2-6bcfa8687677");
    __1956.openPayslip();
    
    TestModellerLogger.SetLastNodeGuid("c4ad733f-22b6-4f34-bad4-743abb8d88b8");
    __1956.getPayslip();
    
    
//    TestModellerLogger.SetLastNodeGuid("633b6e69-d1a1-44e0-97a6-2a0f3f944fb6");
//    __1956.Click_Leave_Report();
//
//    TestModellerLogger.SetLastNodeGuid("7851865b-ef60-474d-b233-d70f302c524c");
//    __1956.Select_Period(data[5]);
//
//    TestModellerLogger.SetLastNodeGuid("3e389556-315a-4c5f-8ac2-6bcfa8687677");
//    __1956.Enter_Select_Employee(data[6]);
    
    
//    TestModellerLogger.SetLastNodeGuid("33774d3f-7e25-44ae-a766-877869287df1");
//    __1956.Click_Search();
//    
    

//    TestModellerLogger.SetLastNodeGuid("378ba543-1d93-4703-8c2d-033df3274a6c");
//    __1956.Click_gotoReports();

    

    }


    @Test  (priority =3 ,enabled=true, groups= {"_1956LeaveManagement","_1956LeaveManagement - Default Profile"})
    @TestModellerPath(guid = "c5aec9b7-f1d8-4dd1-bb34-efe7d8939ed3")
    public void GoToUrlAssertUrlClickAddLeavePositiveSelectselectEmployeePositiveSelectselectLeaveTypePositive2() throws Exception
    {
    	
    	
    	sTestCaseID="TC326";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     pages.loginpage3 _loginpage = new pages.loginpage3(driver);
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
        
    	_1956Page._1956 __1956 = new _1956Page._1956(driver);
//    TestModellerLogger.SetLastNodeGuid("a298023a-f6c9-47fd-9e0f-6c54659d96e9");
//    __1956.GoToUrl();
//
//    TestModellerLogger.SetLastNodeGuid("be7b8940-a555-4e8f-b2df-1cd62ebe1c7a");
//    __1956.AssertUrl();
//
//    TestModellerLogger.SetLastNodeGuid("93943e8c-9968-4e91-8c66-48039ee75141");
//    __1956.Click__Add_Leave_();
//
//    TestModellerLogger.SetLastNodeGuid("57c317a0-f1e8-45c9-9037-c7cf3b73b66a");
//    __1956.Select_selectEmployee("Mr. A last");
//
//    TestModellerLogger.SetLastNodeGuid("5c39aae4-de78-4df0-a7ac-680f16fe9438");
//    __1956.Select_selectLeaveType("Holiday");
//
//    TestModellerLogger.SetLastNodeGuid("f2d25e7b-471f-4915-9687-67fd0db3267f");
//    __1956.Enter_LeaveStartDate("2022-05-29 22:50:41");
//
//    TestModellerLogger.SetLastNodeGuid("28ff7fd7-3ffd-4f61-b0f5-1dc057192e10");
//    __1956.Enter_LeaveEndDate("44397");
//
//    TestModellerLogger.SetLastNodeGuid("c17286aa-d654-41d8-b587-254a0be40711");
//    __1956.Click_Save();
//
//    TestModellerLogger.SetLastNodeGuid("633b6e69-d1a1-44e0-97a6-2a0f3f944fb6");
//    __1956.Click_Leave_Report();
//
//    TestModellerLogger.SetLastNodeGuid("7851865b-ef60-474d-b233-d70f302c524c");
//    __1956.Select_Period("01/01/2021 - 31/12/2021");
//
//    TestModellerLogger.SetLastNodeGuid("3e389556-315a-4c5f-8ac2-6bcfa8687677");
//    __1956.Enter_Select_Employee("");
//
//    TestModellerLogger.SetLastNodeGuid("c4ad733f-22b6-4f34-bad4-743abb8d88b8");
//    __1956.Click_getLeaveBalance();

    TestModellerLogger.SetLastNodeGuid("378ba543-1d93-4703-8c2d-033df3274a6c");
    __1956.Click_gotoReports();

    TestModellerLogger.SetLastNodeGuid("33774d3f-7e25-44ae-a766-877869287df1");
    __1956.Click_Payslips();
    
    TestModellerLogger.SetLastNodeGuid("3e389556-315a-4c5f-8ac2-6bcfa8687677");
    __1956.leavesverifyScreenshot();
    
//    TestModellerLogger.SetLastNodeGuid("c4ad733f-22b6-4f34-bad4-743abb8d88b8");
//    __1956.getPayslip();

    }


}