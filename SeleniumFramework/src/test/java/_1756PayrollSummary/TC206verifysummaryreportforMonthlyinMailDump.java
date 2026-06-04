package _1756PayrollSummary;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.verifyClosePayeErrorMessageOOPS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f86f956f-c500-4ca1-8339-015229c19be1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1409, profileId = 101276)
public class TC206verifysummaryreportforMonthlyinMailDump extends TestBase
{
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    

    
    @Test  (groups= {"AllowenceScheme","AllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "5e5b1aed-08c1-409d-b080-00e698fd0261")
    public void GoToUrlAssertUrlClickclickAllowancesSchemesClickmarkYesClickclickSaveClickgotoPayrollDashboard() throws Exception
    {
    	
    	
    	sTestCaseID="TC206";
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
 
 
 
 _1399subContr.AgentSearch ag=new _1399subContr.AgentSearch(driver);
 
 ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 
 ag.Click_Search();
 
 ag.Click__Nidhi1_();
 
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
 

// TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
// _agentpage.Enter_SearchAgentName(data[3]);
// 
//
// TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
// _agentpage.Click_ClickSearch();
// 
//
// TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
// _agentpage.Click_ClickAgent();
 

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
//TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
//_verifyClosePayeErrorMessage.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
//_verifyClosePayeErrorMessage.AssertUrl();


 		TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
 		_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();


    	_1943_GrossPay_Reports.Gross_Pay_Calculation _Gross_Pay_Calculation = new _1943_GrossPay_Reports.Gross_Pay_Calculation(driver);
    	
    	
//        TestModellerLogger.SetLastNodeGuid("018d7507-efbb-477e-b0d2-8599698131f7");
//        _Gross_Pay_Calculation.Click_clickRun_Payroll1();
//        
//        
//       	VerifyEmailsData.verifyEmail _verifyEmail = new VerifyEmailsData.verifyEmail(driver);
//       	
//       	TestModellerLogger.SetLastNodeGuid("03f45e6e-d068-4171-a094-7d7eaf21e0f2");
//       	_verifyEmail.Select_SelecttoMainContact(data[5]);
//        
//
//        TestModellerLogger.SetLastNodeGuid("f4e0d203-f17e-409f-8a75-aff33f531ef7");
//        _Gross_Pay_Calculation.Click_clickRun_Payroll2();
//        
//        
//        TestModellerLogger.SetLastNodeGuid("d3ab9d5a-a46b-4837-b434-80dcffdeb6b7");
//      _verifyEmail.chekpayroll();
//      
//  
//      TestModellerLogger.SetLastNodeGuid("08fb6589-ee1a-4435-a9dc-9ebf96bddd2b");
//      _verifyEmail.Click_clickSend();


//		TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
//			_verifyClosePayeErrorMessageOOPS.Click_gotoEditCompany();
//
//
//			TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
//			_verifyClosePayeErrorMessageOOPS.Click_gotoPayrollDetails();
     
        
        Quaterly_Paye_Scheme.NoAllowenceScheme _AllowenceScheme = new Quaterly_Paye_Scheme.NoAllowenceScheme(driver);
//    TestModellerLogger.SetLastNodeGuid("bae0140d-dc17-4241-81b8-7b78e2574174");
//    _AllowenceScheme.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed563f15-dc52-4aee-9b34-0c281f72bd20");
//    _AllowenceScheme.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("60585696-efea-430a-b012-bacf6202f632");
//    _AllowenceScheme.Click_clickAllowances_Schemes();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe297d44-a712-442e-9d2c-2c2489254660");
//    _AllowenceScheme.Click_markYes();
//    
//
//    TestModellerLogger.SetLastNodeGuid("120c4873-a6b6-44d3-b182-de85936b900c");
//    _AllowenceScheme.Click_clickSave();
//    

//    TestModellerLogger.SetLastNodeGuid("e211e2aa-4b5d-4d68-9852-9638070b28a4");
//    _AllowenceScheme.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("2699015c-0e09-4e7c-a038-914b7cda00e7");
    _AllowenceScheme.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("2d202a3c-5867-4003-abfd-0010ca91b8e1");
    _AllowenceScheme.Click_clickPayrollSummary1();
    

    TestModellerLogger.SetLastNodeGuid("ecb461e7-351c-46aa-9bc9-076e15f1d048");
    _AllowenceScheme.TakeSCforSummaryforMonth();
    

    }

}
