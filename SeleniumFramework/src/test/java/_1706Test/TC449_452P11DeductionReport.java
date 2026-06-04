package _1706Test;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Blue;
import pages.verifyClosePayeErrorMessageOOPS;
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
public class TC449_452P11DeductionReport extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    
    @Test  (priority = 1,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickcl() throws Exception
    {
    	
    	
    	sTestCaseID="TC449";
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
	
	
	PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);
    
    TestModellerLogger.SetLastNodeGuid("5b352d43-6f19-4f73-b2ec-bc79577eb857");
    _PayrollDoUndo.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("21c1b047-4521-4814-a8ef-f2520560bfa3");
    _PayrollDoUndo.Click_RunPayroll2();
	
	
	_1706Page._1706P11DeductionReport __1706P11DeductionReport = new _1706Page._1706P11DeductionReport(driver);
	
	TestModellerLogger.SetLastNodeGuid("0ca1d0a8-709f-4de1-a528-b657d1e8b34a");
    __1706P11DeductionReport.Click_getGross();
    

    TestModellerLogger.SetLastNodeGuid("462f05e9-56f2-4768-8873-f2107940090a");
    __1706P11DeductionReport.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("cd94851e-80cd-4284-a5ea-b9db49f434e2");
    __1706P11DeductionReport.Click_clickP11();
    

    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.Click_scrollToPAYE_Income_Tax();
    

    TestModellerLogger.SetLastNodeGuid("4183b37e-7beb-487d-a998-9ae61d0de7ad");
    __1706P11DeductionReport.Click_MatchData();
    
    
    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.gotoDashboard();
    
    
//    PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
    _PayrollDoUndo.Click_Undo_Last_Payroll_();
        

    

    }
    
 
    
    
    @Test  (priority = 2,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickc4() throws Exception
    {
    	
    	
    	sTestCaseID="TC450";
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
	
	
	PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);
    
    TestModellerLogger.SetLastNodeGuid("5b352d43-6f19-4f73-b2ec-bc79577eb857");
    _PayrollDoUndo.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("21c1b047-4521-4814-a8ef-f2520560bfa3");
    _PayrollDoUndo.Click_RunPayroll2();
    
    
    
        
_1706Page._1706P11DeductionReport __1706P11DeductionReport = new _1706Page._1706P11DeductionReport(driver);
	
	TestModellerLogger.SetLastNodeGuid("0ca1d0a8-709f-4de1-a528-b657d1e8b34a");
    __1706P11DeductionReport.Click_getGross();
    

    TestModellerLogger.SetLastNodeGuid("462f05e9-56f2-4768-8873-f2107940090a");
    __1706P11DeductionReport.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("cd94851e-80cd-4284-a5ea-b9db49f434e2");
    __1706P11DeductionReport.Click_clickP11();
    

    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.Click_scrollToPAYE_Income_Tax();
    

    TestModellerLogger.SetLastNodeGuid("4183b37e-7beb-487d-a998-9ae61d0de7ad");
    __1706P11DeductionReport.Click_MatchDataTotalTaxablePay();
    
    
    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.gotoDashboard();
    
    
//    PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
    _PayrollDoUndo.Click_Undo_Last_Payroll_();
        
 
    }
    
    
    @Test  (priority = 3,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickc2() throws Exception
    {
    	
    	
    	sTestCaseID="TC451";
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
	
	
	PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);
    
    TestModellerLogger.SetLastNodeGuid("5b352d43-6f19-4f73-b2ec-bc79577eb857");
    _PayrollDoUndo.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("21c1b047-4521-4814-a8ef-f2520560bfa3");
    _PayrollDoUndo.Click_RunPayroll2();
    
        
_1706Page._1706P11DeductionReport __1706P11DeductionReport = new _1706Page._1706P11DeductionReport(driver);
	
	TestModellerLogger.SetLastNodeGuid("0ca1d0a8-709f-4de1-a528-b657d1e8b34a");
    __1706P11DeductionReport.Click_getTax();
    

    TestModellerLogger.SetLastNodeGuid("462f05e9-56f2-4768-8873-f2107940090a");
    __1706P11DeductionReport.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("cd94851e-80cd-4284-a5ea-b9db49f434e2");
    __1706P11DeductionReport.Click_clickP11();
    

    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.Click_scrollToPAYE_Income_Tax();
    

    TestModellerLogger.SetLastNodeGuid("4183b37e-7beb-487d-a998-9ae61d0de7ad");
    __1706P11DeductionReport.Click_MatchDataTaxDue();
    
    
    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.gotoDashboard();
    
    
//    PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
    _PayrollDoUndo.Click_Undo_Last_Payroll_();
        
 
    }
    
    
    @Test  (priority = 4,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickcl1() throws Exception
    {
    	
    	
    	sTestCaseID="TC452";
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
	
	
	
	
	
	_1706Page._1706P11DeductionReport __1706P11DeductionReport = new _1706Page._1706P11DeductionReport(driver);
	
//	TestModellerLogger.SetLastNodeGuid("0ca1d0a8-709f-4de1-a528-b657d1e8b34a");
//    __1706P11DeductionReport.Click_getGross();
    

    TestModellerLogger.SetLastNodeGuid("462f05e9-56f2-4768-8873-f2107940090a");
    __1706P11DeductionReport.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("cd94851e-80cd-4284-a5ea-b9db49f434e2");
    __1706P11DeductionReport.Click_clickP11();
    

    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
    __1706P11DeductionReport.Click_scrollToPAYE_Income_Tax();
    

    TestModellerLogger.SetLastNodeGuid("4183b37e-7beb-487d-a998-9ae61d0de7ad");
    __1706P11DeductionReport.TakeScreenshot1();
    
    
//    TestModellerLogger.SetLastNodeGuid("27f6d2fb-5d16-4eb6-a004-fb8fc07bfdb6");
//    __1706P11DeductionReport.gotoDashboard();
    
    
//    PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


//    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
//    _PayrollDoUndo.Click_Undo_Last_Payroll_();
        

    

    }

}
