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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dc2c0b45-2420-4943-a1a0-9a6aab5f3c9b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1859, profileId = 102411)
public class TC598_600SendEmailofQtrPayrollWeeklyFrq extends TestBase
{
	
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    

    
    @Test  (groups= {"2129_SummaryForEmailTest","2129_SummaryForEmailTest - Default Profile"})
    @TestModellerPath(guid = "cd0aa4cd-2a48-40ab-b71b-b7e3747d372b")
    public void GoToUrlAssertUrlPositiveSelectPayrollDateClickEmailClickTickCompanyemailaddressClickTickEmploy() throws Exception
    {
    	
    	sTestCaseID="TC598";
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
    

    TestModellerLogger.SetLastNodeGuid("2d202a3c-5867-4003-abfd-0010ca91b8e1");
    _AllowenceScheme.Click_clickPayrollSummary1();
    

    
    
    _2129pages.QuarteryDataCheckforSummary _QuarteryDataCheckforSummary = new _2129pages.QuarteryDataCheckforSummary(driver);


    TestModellerLogger.SetLastNodeGuid("4575d0b4-2644-47c6-910c-776f8c4d6761");
    _QuarteryDataCheckforSummary.Select_selectTaxYears(data[5]);
        
    	_2129pages._2129SummaryforEmail __2129SummaryforEmail = new _2129pages._2129SummaryforEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("bd24b768-4977-47f1-ba2f-1a881440c239");
//    __2129SummaryforEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5e537b81-f1f5-410e-9029-8bfdf284bebb");
//    __2129SummaryforEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("033cb5cf-9fef-492f-9b42-ee9946174065");
    __2129SummaryforEmail.Select_PayrollDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("1c225b58-9169-4f80-b6c3-f398c1d01b4e");
    __2129SummaryforEmail.Click_Email();
    

//    TestModellerLogger.SetLastNodeGuid("23809a16-3418-4dda-899c-e850b2fc592c");
//    __2129SummaryforEmail.Click_TickCompany_email_address();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2c45b6df-d215-45c6-97bb-bb3673937486");
//    __2129SummaryforEmail.Click_TickEmployee_Payslip();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b81184d2-9b67-47b1-bd26-72c402d2aceb");
//    __2129SummaryforEmail.Click_TickPayroll_Summary();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1f7d4cd9-8c8f-4351-9073-5ba8d551d339");
//    __2129SummaryforEmail.Click_EmailHeader();
    

    TestModellerLogger.SetLastNodeGuid("910e43f7-d77f-4943-985f-58906feaef7d");
    __2129SummaryforEmail.Click_ClickSend();
    

    }

    @Test  (groups= {"2129_SummaryForEmailTest","2129_SummaryForEmailTest - Default Profile"})
    @TestModellerPath(guid = "759907d7-009d-43dc-bfbe-58ac81dd52f8")
    public void GoToUrlAssertUrlPositiveSelectPayrollDateClickEmailClickTickCompanyemailaddressClickTickEmploy1() throws Exception
    {
    	
    	
    	sTestCaseID="TC599";
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
    

    TestModellerLogger.SetLastNodeGuid("2d202a3c-5867-4003-abfd-0010ca91b8e1");
    _AllowenceScheme.Click_clickPayrollSummary1();
    

    
    
    _2129pages.QuarteryDataCheckforSummary _QuarteryDataCheckforSummary = new _2129pages.QuarteryDataCheckforSummary(driver);


    TestModellerLogger.SetLastNodeGuid("4575d0b4-2644-47c6-910c-776f8c4d6761");
    _QuarteryDataCheckforSummary.Select_selectTaxYears(data[5]);
        
    	_2129pages._2129SummaryforEmail __2129SummaryforEmail = new _2129pages._2129SummaryforEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("bd24b768-4977-47f1-ba2f-1a881440c239");
//    __2129SummaryforEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5e537b81-f1f5-410e-9029-8bfdf284bebb");
//    __2129SummaryforEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("033cb5cf-9fef-492f-9b42-ee9946174065");
    __2129SummaryforEmail.Select_PayrollDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("1c225b58-9169-4f80-b6c3-f398c1d01b4e");
    __2129SummaryforEmail.Click_Email();
    

//    TestModellerLogger.SetLastNodeGuid("23809a16-3418-4dda-899c-e850b2fc592c");
//    __2129SummaryforEmail.Click_TickCompany_email_address();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2c45b6df-d215-45c6-97bb-bb3673937486");
//    __2129SummaryforEmail.Click_TickEmployee_Payslip();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b81184d2-9b67-47b1-bd26-72c402d2aceb");
//    __2129SummaryforEmail.Click_TickPayroll_Summary();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1f7d4cd9-8c8f-4351-9073-5ba8d551d339");
//    __2129SummaryforEmail.Click_EmailHeader();
    

    TestModellerLogger.SetLastNodeGuid("910e43f7-d77f-4943-985f-58906feaef7d");
    __2129SummaryforEmail.Click_ClickSend();
    

    }

    @Test  (groups= {"2129_SummaryForEmailTest","2129_SummaryForEmailTest - Default Profile"})
    @TestModellerPath(guid = "8618060f-69db-44e9-990e-a5188a1adc6f")
    public void GoToUrlAssertUrlPositiveSelectPayrollDateClickEmailClickTickCompanyemailaddressClickTickEmploy2() throws Exception
    {
    	
    	
    	sTestCaseID="TC600";
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
    

    TestModellerLogger.SetLastNodeGuid("2d202a3c-5867-4003-abfd-0010ca91b8e1");
    _AllowenceScheme.Click_clickPayrollSummary1();
    

    
    
    _2129pages.QuarteryDataCheckforSummary _QuarteryDataCheckforSummary = new _2129pages.QuarteryDataCheckforSummary(driver);


    TestModellerLogger.SetLastNodeGuid("4575d0b4-2644-47c6-910c-776f8c4d6761");
    _QuarteryDataCheckforSummary.Select_selectTaxYears(data[5]);
        
    	_2129pages._2129SummaryforEmail __2129SummaryforEmail = new _2129pages._2129SummaryforEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("bd24b768-4977-47f1-ba2f-1a881440c239");
//    __2129SummaryforEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5e537b81-f1f5-410e-9029-8bfdf284bebb");
//    __2129SummaryforEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("033cb5cf-9fef-492f-9b42-ee9946174065");
    __2129SummaryforEmail.Select_PayrollDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("1c225b58-9169-4f80-b6c3-f398c1d01b4e");
    __2129SummaryforEmail.Click_Email();
    

//    TestModellerLogger.SetLastNodeGuid("23809a16-3418-4dda-899c-e850b2fc592c");
//    __2129SummaryforEmail.Click_TickCompany_email_address();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2c45b6df-d215-45c6-97bb-bb3673937486");
//    __2129SummaryforEmail.Click_TickEmployee_Payslip();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b81184d2-9b67-47b1-bd26-72c402d2aceb");
//    __2129SummaryforEmail.Click_TickPayroll_Summary();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1f7d4cd9-8c8f-4351-9073-5ba8d551d339");
//    __2129SummaryforEmail.Click_EmailHeader();
    

    TestModellerLogger.SetLastNodeGuid("910e43f7-d77f-4943-985f-58906feaef7d");
    __2129SummaryforEmail.Click_ClickSend();
    

    }

}