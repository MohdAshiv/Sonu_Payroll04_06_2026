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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/01717449-9ea5-4dd1-8ba3-fa4acb5debe0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1361, profileId = 101228)
public class TC20subScriptFortnightFrequency_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "d97d3250-0e14-47d5-bc4a-e78660cf288a")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC20";
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
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    
    
    pages.frequency.fortnightFrequency _fortnightFrequency = new pages.frequency.fortnightFrequency(driver);

    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

  



pages.frequency.runpayrollpagefortnight _runpayrollpage = new pages.frequency.runpayrollpagefortnight(driver);
  

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
/*
    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "12220b8e-0c74-4e93-8c42-9dd47cf4c263")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs2()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Margaretta58");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("Jv6q7bEHdT");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("amet");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("commodi");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.fortnightFrequency _fortnightFrequency = new pages.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287.539088483798");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "c952a994-84c3-4c69-951b-9501733ba9b7")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs3()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Benton.Bernhard");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("1Y0Jii0LUn");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("vel");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("aut");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.fortnightFrequency _fortnightFrequency = new pages.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287.539088483798");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "6a17deb7-c280-4601-893b-18e9fa339b57")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs4()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Herman_Hamill86");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("QSsj4MFuQG");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("incidunt");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("recusandae");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.fortnightFrequency _fortnightFrequency = new pages.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "d4ae7b90-7bf5-42a4-b850-c423797c585b")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs5()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Hugh_Casper");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("vMoHFzCw1R");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("molestias");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("dolores");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.fortnightFrequency _fortnightFrequency = new pages.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "c295dad2-80ca-406a-a688-6ee37a1bc5ed")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs6()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Elton_Gerlach28");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("CzKugJytiF");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("voluptas");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("quo");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("FourWeekly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.fortnightFrequency _fortnightFrequency = new pages.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "7c9628ac-f5e7-4b4d-ad64-859477aab2ad")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs7()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Suzanne26");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("0U3bVzJr8Y");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("asperiores");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("aliquid");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.fortnightFrequency _fortnightFrequency = new pages.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptFortnightFrequency","subScriptFortnightFrequency - Default Profile"})
    @TestModellerPath(guid = "1352ff12-ed13-4c39-984b-4dd1815498d3")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs8()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Thaddeus47");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("iNvVH_yuco");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("illo");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("error");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Blue");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.fortnightFrequency _fortnightFrequency = new pages.fortnightFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("a96ff942-6ffa-4746-b9f0-456f3bd5349b");
    _fortnightFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00e8c7bc-1f6c-49e6-b499-5e7fe8763f9a");
    _fortnightFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6601bd47-1c1b-47b3-8464-487ad0fcfd24");
    _fortnightFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("da1f6e2d-9522-4c0a-8584-ea66d1f6ddc7");
    _fortnightFrequency.Select_selectpayMode1("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("6538ec3d-15fc-4e2f-aa36-a93b4caca474");
    _fortnightFrequency.Enter_FortnightlyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("b0b855c6-6b24-4579-b5de-e4971d73aa96");
    _fortnightFrequency.Click_clickSave();
    

    }
*/
}
