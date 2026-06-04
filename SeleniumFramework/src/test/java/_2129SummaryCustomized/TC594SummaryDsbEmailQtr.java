package _2129SummaryCustomized;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/eddbe1c6-0304-4f8b-a4b2-eb77c040b946
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1860, profileId = 102414)
public class TC594SummaryDsbEmailQtr extends TestBase
{
	
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    

    
    @Test  (groups= {"_2129SummaryPayslipEmailtest","_2129SummaryPayslipEmailtest - Test Cases"})
    @TestModellerPath(guid = "f5dec0da-35b5-415f-83ce-d5b8fd7b5bbe")
    public void GoToUrlAssertUrlClickPayslipsPositiveSelectPayrollDateClickEmailPayslipsClickTickCompanyemaila() throws Exception
    {
    	
    	sTestCaseID="TC594";
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



         
    	_2129pages._2129BSummaryDsbEmail _2129BSummaryDsbEmail = new _2129pages._2129BSummaryDsbEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("3e06b059-feec-4ac9-92d3-00e555ec857d");
//    __2129SummaryPayslipEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("15c3b002-f3dc-450c-97c6-9ad2566d6acb");
//    __2129SummaryPayslipEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5583d3e1-91a8-4a13-9cc5-169f3e61ddcb");
    _2129BSummaryDsbEmail.Click_Run_Payroll1();
    

    TestModellerLogger.SetLastNodeGuid("861be01c-9d9a-41aa-bacf-35ad3a860b05");
    _2129BSummaryDsbEmail.Select_PaySlipTemplate(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("d27a1699-5ad6-4ed9-ac3e-90e260c20887");
    _2129BSummaryDsbEmail.Click_Run_Payroll2();
    

//    TestModellerLogger.SetLastNodeGuid("eae9b28b-df8c-415b-9916-70eb5e8a9f4d");
//    _2129BSummaryDsbEmail.Click_TickCompany_email_address();
    

//    TestModellerLogger.SetLastNodeGuid("aae4d0fa-9913-4e17-8632-f23874093826");
//    _2129BSummaryDsbEmail.Click_TickPayroll_Summary();
    

    TestModellerLogger.SetLastNodeGuid("9ddd8703-38aa-4d12-82ce-42cd67f501b5");
    _2129BSummaryDsbEmail.Click__Send_();
    
    
    TestModellerLogger.SetLastNodeGuid("5583d3e1-91a8-4a13-9cc5-169f3e61ddcb");
    _2129BSummaryDsbEmail.Click_Run_Payroll1();
    

    TestModellerLogger.SetLastNodeGuid("861be01c-9d9a-41aa-bacf-35ad3a860b05");
    _2129BSummaryDsbEmail.Select_PaySlipTemplate(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("d27a1699-5ad6-4ed9-ac3e-90e260c20887");
    _2129BSummaryDsbEmail.Click_Run_Payroll2();
    

//    TestModellerLogger.SetLastNodeGuid("eae9b28b-df8c-415b-9916-70eb5e8a9f4d");
//    _2129BSummaryDsbEmail.Click_TickCompany_email_address();
    

//    TestModellerLogger.SetLastNodeGuid("aae4d0fa-9913-4e17-8632-f23874093826");
//    _2129BSummaryDsbEmail.Click_TickPayroll_Summary();
    

    TestModellerLogger.SetLastNodeGuid("9ddd8703-38aa-4d12-82ce-42cd67f501b5");
    _2129BSummaryDsbEmail.Click__Send_();
    
    
    TestModellerLogger.SetLastNodeGuid("5583d3e1-91a8-4a13-9cc5-169f3e61ddcb");
    _2129BSummaryDsbEmail.Click_Run_Payroll1();
    

    TestModellerLogger.SetLastNodeGuid("861be01c-9d9a-41aa-bacf-35ad3a860b05");
    _2129BSummaryDsbEmail.Select_PaySlipTemplate(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("d27a1699-5ad6-4ed9-ac3e-90e260c20887");
    _2129BSummaryDsbEmail.Click_Run_Payroll2();
    

//    TestModellerLogger.SetLastNodeGuid("eae9b28b-df8c-415b-9916-70eb5e8a9f4d");
//    _2129BSummaryDsbEmail.Click_TickCompany_email_address();
    

//    TestModellerLogger.SetLastNodeGuid("aae4d0fa-9913-4e17-8632-f23874093826");
//    _2129BSummaryDsbEmail.Click_TickPayroll_Summary();
    

    TestModellerLogger.SetLastNodeGuid("9ddd8703-38aa-4d12-82ce-42cd67f501b5");
    _2129BSummaryDsbEmail.Click__Send_();
    
    
    PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


	    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
	    _PayrollDoUndo.Click_Undo_Last_Payroll_();
	    
	    
	    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
	    _PayrollDoUndo.Click_Undo_Last_Payroll_();
	    
	    
	    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
	    _PayrollDoUndo.Click_Undo_Last_Payroll_();
	    
	    
	    
    

    }
/*
    @Test  (groups= {"_2129SummaryPayslipEmailtest","_2129SummaryPayslipEmailtest - Test Cases"})
    @TestModellerPath(guid = "5fe9031f-16bb-4b17-9adc-50c49c223ccc")
    public void GoToUrlAssertUrlClickPayslipsPositiveSelectPayrollDateClickEmailPayslipsClickTickCompanyemaila1() throws InterruptedException
    {
    	
    	
    	sTestCaseID="TC592";
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



        
        Quaterly_Paye_Scheme.NoAllowenceScheme _AllowenceScheme = new Quaterly_Paye_Scheme.NoAllowenceScheme(driver);
 

    TestModellerLogger.SetLastNodeGuid("2699015c-0e09-4e7c-a038-914b7cda00e7");
    _AllowenceScheme.Click_gotoReports();
        
    	_2129pages._2129SummaryPayslipEmail __2129SummaryPayslipEmail = new _2129pages._2129SummaryPayslipEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("3e06b059-feec-4ac9-92d3-00e555ec857d");
//    __2129SummaryPayslipEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("15c3b002-f3dc-450c-97c6-9ad2566d6acb");
//    __2129SummaryPayslipEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5583d3e1-91a8-4a13-9cc5-169f3e61ddcb");
    __2129SummaryPayslipEmail.Click_Payslips();
    

    TestModellerLogger.SetLastNodeGuid("861be01c-9d9a-41aa-bacf-35ad3a860b05");
    __2129SummaryPayslipEmail.Select_PayrollDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("d27a1699-5ad6-4ed9-ac3e-90e260c20887");
    __2129SummaryPayslipEmail.Click__Email_Payslips();
    

//    TestModellerLogger.SetLastNodeGuid("eae9b28b-df8c-415b-9916-70eb5e8a9f4d");
//    __2129SummaryPayslipEmail.Click_TickCompany_email_address();
    

    TestModellerLogger.SetLastNodeGuid("aae4d0fa-9913-4e17-8632-f23874093826");
    __2129SummaryPayslipEmail.Click_TickPayroll_Summary();
    

    TestModellerLogger.SetLastNodeGuid("9ddd8703-38aa-4d12-82ce-42cd67f501b5");
    __2129SummaryPayslipEmail.Click__Send_();
    

    }

    @Test  (groups= {"_2129SummaryPayslipEmailtest","_2129SummaryPayslipEmailtest - Test Cases"})
    @TestModellerPath(guid = "48c5d4b8-dcea-4333-b823-a7e374ba05b4")
    public void GoToUrlAssertUrlClickPayslipsPositiveSelectPayrollDateClickEmailPayslipsClickTickCompanyemaila2() throws InterruptedException
    {
    	
    	
    	sTestCaseID="TC593";
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



        
        Quaterly_Paye_Scheme.NoAllowenceScheme _AllowenceScheme = new Quaterly_Paye_Scheme.NoAllowenceScheme(driver);
 

    TestModellerLogger.SetLastNodeGuid("2699015c-0e09-4e7c-a038-914b7cda00e7");
    _AllowenceScheme.Click_gotoReports();
        
    	_2129pages._2129SummaryPayslipEmail __2129SummaryPayslipEmail = new _2129pages._2129SummaryPayslipEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("3e06b059-feec-4ac9-92d3-00e555ec857d");
//    __2129SummaryPayslipEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("15c3b002-f3dc-450c-97c6-9ad2566d6acb");
//    __2129SummaryPayslipEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5583d3e1-91a8-4a13-9cc5-169f3e61ddcb");
    __2129SummaryPayslipEmail.Click_Payslips();
    

    TestModellerLogger.SetLastNodeGuid("861be01c-9d9a-41aa-bacf-35ad3a860b05");
    __2129SummaryPayslipEmail.Select_PayrollDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("d27a1699-5ad6-4ed9-ac3e-90e260c20887");
    __2129SummaryPayslipEmail.Click__Email_Payslips();
    

    TestModellerLogger.SetLastNodeGuid("eae9b28b-df8c-415b-9916-70eb5e8a9f4d");
    __2129SummaryPayslipEmail.Click_TickCompany_email_address();
    

    TestModellerLogger.SetLastNodeGuid("aae4d0fa-9913-4e17-8632-f23874093826");
    __2129SummaryPayslipEmail.Click_TickPayroll_Summary();
    

    TestModellerLogger.SetLastNodeGuid("9ddd8703-38aa-4d12-82ce-42cd67f501b5");
    __2129SummaryPayslipEmail.Click__Send_();
    

    }
*/
}