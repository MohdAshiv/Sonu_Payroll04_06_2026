package tests1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/24568fdc-ca49-418b-badc-b342bc742286
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1392, profileId = 101260)
public class TC31RegisterCIS_DefaultProfile extends TestBase
{
    

	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscriptPaymentManagement","subscriptPaymentManagement - Default Profile"})
    @TestModellerPath(guid = "c0f6a15e-465e-41ec-b39a-f32adccede0e")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC31";
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
        
        pages1.RegisterCIS _RegisterCIS = new pages1.RegisterCIS(driver);
//    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
//    _RegisterCIS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
//    _RegisterCIS.AssertUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
//    _RegisterCIS.Click_SelectYes();
//    
//
//    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
//    _RegisterCIS.Click_clickLink();
//    
//    
//    pages1.selectontractor _selectontractor = new pages1.selectontractor(driver);
//    TestModellerLogger.SetLastNodeGuid("e75ee75c-2fb8-4608-9ff9-e26212185234");
//    _selectontractor.Select_SelectContractor("amair");
    
//    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
//    _RegisterCIS.Select_SelectContractor("");
//    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
//    _RegisterCIS.Select_SelectContractor("A & A CEILINGS TO PARTITIONS LIMITED");
    

//    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
//    _RegisterCIS.Click_clickSave1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
//    _RegisterCIS.Click_clickSave2();
    

    }
/*
    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "18e4331a-f515-47a3-b4d6-339143025658")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic2()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("A & A CEILINGS TO PARTITIONS LIMITED");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "7f898b7b-6857-47e6-83ae-4278851ebbee")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic3()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("A&Y SERVICES LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "72dedce2-3add-47e0-8d53-7db33d51869b")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic4()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AAB LOGISTICS LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "0a968616-c0ba-4ea4-8657-5e5b23a2eb56")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic5()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("ACCURATE WELDING & ENGINEERING LIMITED");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "642497de-5a3f-4543-bf01-0fa33a2355a8")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic6()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Admiral Home Improvements UK Ltd");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "944fe056-abbe-446f-886f-a00a44300a5f")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic7()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Admiral Windows & Glass Limited");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "879325a2-6e2d-4b3c-991f-5da15b963ac9")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic8()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("ADMIRAL WINDOWS & GLASS LIMITED");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "2e64e851-8728-473a-be5d-0a294cc9abaa")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Clic9()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AERHAUS UK LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "4cbb3c75-d2df-4a8a-8860-b28d8824fc41")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli10()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AGL Brickwork Ltd");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "153eeac5-7261-454e-8399-2659f6e66ac5")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli11()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AGL Steelform Ltd");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "a25b6a98-cc9a-4790-b3d0-8f76777d6840")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli12()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AGTE CONSTRUCTION LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "007c1fab-092c-4a73-9836-2113c9d53769")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli13()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AJP Decorators and Building Services Ltd");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "0f39a9bc-42ac-4046-863c-d801b47ab39a")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli14()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AKI AIR LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "a5d3fc1f-c559-4fa4-a4ef-5fef8238e2a8")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli15()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("ALEKSANDAR RECRUITMENT LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "14f98db0-c942-451e-b18c-941ef91f33b7")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli16()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Aleksandar11 LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "00675904-6a70-4ba4-ad79-f2d5bb00fb16")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli17()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Allwood Flooring Installations Limited");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "a65a8006-a629-4db1-818d-b3bb2b01dd74")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli18()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Alqahtani Ltd");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "978332d0-3893-4e21-b704-7a8307e75085")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli19()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("ALS CIVILS LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "734a0714-2789-4181-837b-e40d682c2002")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli20()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("AMA&M CONSTRUCTION LTD");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "d7aaf501-e51b-4f08-9ed8-f61d7c531f73")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli21()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Amair");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "40260554-6d19-4fd7-9174-c64f286c44d6")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli22()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("amair");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "fa68cece-4ab1-4c00-8a44-2d723b3e4544")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli23()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Amsfield Design & Build Ltd");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "cb85ac27-1acc-4837-a164-fdd57de13d95")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli24()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Andrew Humphries");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }

    @Test  (groups= {"RegisterCIS","RegisterCIS - Default Profile"})
    @TestModellerPath(guid = "9ecac622-9f88-40d6-bb3e-4e11ad3171e8")
    public void GoToUrlAssertUrlClickSelectYesClickclickLinkPositiveSelectSelectContractorClickclickSave1Cli25()
    {
        
        pages.RegisterCIS _RegisterCIS = new pages.RegisterCIS(driver);
    TestModellerLogger.SetLastNodeGuid("19c87be0-e3e8-4741-a1bd-de398dd64752");
    _RegisterCIS.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a89f77c-6498-4af2-bfd5-3309ef8b3b71");
    _RegisterCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("176f48d3-219a-40c7-ae01-d81ca7ed56f0");
    _RegisterCIS.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("848aec5a-c83c-4e9c-bcf7-61765b768a02");
    _RegisterCIS.Click_clickLink();
    

    TestModellerLogger.SetLastNodeGuid("75db53b8-8078-4881-b051-c58a20f48c87");
    _RegisterCIS.Select_SelectContractor("Andrew Jones");
    

    TestModellerLogger.SetLastNodeGuid("bcc2a420-7e53-469f-88d5-a46c9dde1d21");
    _RegisterCIS.Click_clickSave1();
    

    TestModellerLogger.SetLastNodeGuid("531573d5-dcd3-4757-8d2a-c4aa31a1348d");
    _RegisterCIS.Click_clickSave2();
    

    }
*/
}
