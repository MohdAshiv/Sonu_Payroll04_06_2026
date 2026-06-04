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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/af7153c7-8d9c-4f05-b4ee-e00723d7438b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1389, profileId = 101256)
public class TC30subscriptPaymentManagement_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscriptPaymentManagement","subscriptPaymentManagement - Default Profile"})
    @TestModellerPath(guid = "c0f6a15e-465e-41ec-b39a-f32adccede0e")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC30";
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
    

 



pages1.PaymentManagement _PaymentManagement = new pages1.PaymentManagement(driver);
//    TestModellerLogger.SetLastNodeGuid("d14acd4d-39eb-4d7f-84b9-fa3b0a0c67fe");
//    _PaymentManagement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8a306ead-d6b9-447c-9bc8-baa83f106cbc");
//    _PaymentManagement.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d6c5946-cd14-49ae-90bd-0b9629c78f5f");
    _PaymentManagement.Click_SelectPaymentManagementYes();
    

//    TestModellerLogger.SetLastNodeGuid("b6a88c2c-ef8f-40d8-aaef-fdf497500c8d");
//    _PaymentManagement.Click_clickSave();
//    

    TestModellerLogger.SetLastNodeGuid("4906364b-7b2c-4239-84e8-da251b4cd428");
    _PaymentManagement.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("5d3939ba-c0a6-4961-8550-f94bc1c7bc95");
    _PaymentManagement.Click_clickHMRCPaymentsMade();
    
    
//    pages1.Tax _Tax = new pages1.Tax(driver);
//    
//    TestModellerLogger.SetLastNodeGuid("8dbc9383-eec7-4aa8-acde-305762870e73");
//    _Tax.Enter_NICActualPaidAmount(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("b843457e-0d8c-4bab-9c68-df6cf3155d64");
//    _Tax.Click_Save();
//    

    TestModellerLogger.SetLastNodeGuid("dbb472d3-f132-46a7-b49c-50838ad11f27");
    _PaymentManagement.Enter_EnterNICActualPaidAmount(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("133099b4-ac82-4125-9edc-f4ae24e459d9");
    _PaymentManagement.Click_clickSave_1();
    

    TestModellerLogger.SetLastNodeGuid("8180aea7-3494-4e98-af58-0f9684375c79");
    _PaymentManagement.Click_DownloadExport_to_PDF();
    

    }
/*
    @Test  (groups= {"subscriptPaymentManagement","subscriptPaymentManagement - Default Profile"})
    @TestModellerPath(guid = "1d6dee41-c814-4b1e-8559-11094ba07e62")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs2()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Maida84");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("AzChy2PbWG");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("saepe");
    

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
    

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
    _paswProtectionPDF.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
    _paswProtectionPDF.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat("Just ZIP Files");
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fb15ea15-0a67-4c84-b08c-163589b5cb1d");
    _paswProtectionPDF.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("eb729bbe-d0d3-47e4-906e-df965e08e35b");
    _paswProtectionPDF.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("af084283-548d-4a90-bbd6-5b53aa618444");
    _paswProtectionPDF.Select_SelectcontactOption("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("48421937-9736-470e-b3a5-95bc2c3033a0");
    _paswProtectionPDF.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("08415b29-7e2a-417b-959f-5eb9e939cca5");
    _paswProtectionPDF.Click_PayrollgeneratedMessage();
    

pages.h18 _PaymentManagement = new pages.h18(driver);
    TestModellerLogger.SetLastNodeGuid("d14acd4d-39eb-4d7f-84b9-fa3b0a0c67fe");
    _PaymentManagement.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a306ead-d6b9-447c-9bc8-baa83f106cbc");
    _PaymentManagement.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d6c5946-cd14-49ae-90bd-0b9629c78f5f");
    _PaymentManagement.Click_SelectPaymentManagementYes();
    

    TestModellerLogger.SetLastNodeGuid("b6a88c2c-ef8f-40d8-aaef-fdf497500c8d");
    _PaymentManagement.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("4906364b-7b2c-4239-84e8-da251b4cd428");
    _PaymentManagement.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("5d3939ba-c0a6-4961-8550-f94bc1c7bc95");
    _PaymentManagement.Click_clickHMRCPaymentsMade();
    

    TestModellerLogger.SetLastNodeGuid("dbb472d3-f132-46a7-b49c-50838ad11f27");
    _PaymentManagement.Enter_EnterNICActualPaidAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("133099b4-ac82-4125-9edc-f4ae24e459d9");
    _PaymentManagement.Click_clickSave_1();
    

    TestModellerLogger.SetLastNodeGuid("8180aea7-3494-4e98-af58-0f9684375c79");
    _PaymentManagement.Click_DownloadExport_to_PDF();
    

    }

    @Test  (groups= {"subscriptPaymentManagement","subscriptPaymentManagement - Default Profile"})
    @TestModellerPath(guid = "c927024f-e642-4f0a-b7bd-f8e79159f700")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs3()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Roger_Kshlerin58");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("KNtl_hrf6X");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("et");
    

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
    _OpenClient.Enter_EnterClientName("alias");
    

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
    

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
    _paswProtectionPDF.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
    _paswProtectionPDF.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat("No Protection");
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fb15ea15-0a67-4c84-b08c-163589b5cb1d");
    _paswProtectionPDF.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("eb729bbe-d0d3-47e4-906e-df965e08e35b");
    _paswProtectionPDF.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("af084283-548d-4a90-bbd6-5b53aa618444");
    _paswProtectionPDF.Select_SelectcontactOption("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("48421937-9736-470e-b3a5-95bc2c3033a0");
    _paswProtectionPDF.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("08415b29-7e2a-417b-959f-5eb9e939cca5");
    _paswProtectionPDF.Click_PayrollgeneratedMessage();
    

pages.h18 _PaymentManagement = new pages.h18(driver);
    TestModellerLogger.SetLastNodeGuid("d14acd4d-39eb-4d7f-84b9-fa3b0a0c67fe");
    _PaymentManagement.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a306ead-d6b9-447c-9bc8-baa83f106cbc");
    _PaymentManagement.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d6c5946-cd14-49ae-90bd-0b9629c78f5f");
    _PaymentManagement.Click_SelectPaymentManagementYes();
    

    TestModellerLogger.SetLastNodeGuid("b6a88c2c-ef8f-40d8-aaef-fdf497500c8d");
    _PaymentManagement.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("4906364b-7b2c-4239-84e8-da251b4cd428");
    _PaymentManagement.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("5d3939ba-c0a6-4961-8550-f94bc1c7bc95");
    _PaymentManagement.Click_clickHMRCPaymentsMade();
    

    TestModellerLogger.SetLastNodeGuid("dbb472d3-f132-46a7-b49c-50838ad11f27");
    _PaymentManagement.Enter_EnterNICActualPaidAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("133099b4-ac82-4125-9edc-f4ae24e459d9");
    _PaymentManagement.Click_clickSave_1();
    

    TestModellerLogger.SetLastNodeGuid("8180aea7-3494-4e98-af58-0f9684375c79");
    _PaymentManagement.Click_DownloadExport_to_PDF();
    

    }

    @Test  (groups= {"subscriptPaymentManagement","subscriptPaymentManagement - Default Profile"})
    @TestModellerPath(guid = "fbede0e4-1fe4-4e4f-af53-86b85c612cb9")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs4()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Genesis.Kerluke");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("KOQYS3ZWJy");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("necessitatibus");
    

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
    _OpenClient.Enter_EnterClientName("non");
    

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
    

pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
    _paswProtectionPDF.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
    _paswProtectionPDF.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat("Just PDF");
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fb15ea15-0a67-4c84-b08c-163589b5cb1d");
    _paswProtectionPDF.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("eb729bbe-d0d3-47e4-906e-df965e08e35b");
    _paswProtectionPDF.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("af084283-548d-4a90-bbd6-5b53aa618444");
    _paswProtectionPDF.Select_SelectcontactOption("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("48421937-9736-470e-b3a5-95bc2c3033a0");
    _paswProtectionPDF.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("08415b29-7e2a-417b-959f-5eb9e939cca5");
    _paswProtectionPDF.Click_PayrollgeneratedMessage();
    

pages.h18 _PaymentManagement = new pages.h18(driver);
    TestModellerLogger.SetLastNodeGuid("d14acd4d-39eb-4d7f-84b9-fa3b0a0c67fe");
    _PaymentManagement.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a306ead-d6b9-447c-9bc8-baa83f106cbc");
    _PaymentManagement.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d6c5946-cd14-49ae-90bd-0b9629c78f5f");
    _PaymentManagement.Click_SelectPaymentManagementYes();
    

    TestModellerLogger.SetLastNodeGuid("b6a88c2c-ef8f-40d8-aaef-fdf497500c8d");
    _PaymentManagement.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("4906364b-7b2c-4239-84e8-da251b4cd428");
    _PaymentManagement.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("5d3939ba-c0a6-4961-8550-f94bc1c7bc95");
    _PaymentManagement.Click_clickHMRCPaymentsMade();
    

    TestModellerLogger.SetLastNodeGuid("dbb472d3-f132-46a7-b49c-50838ad11f27");
    _PaymentManagement.Enter_EnterNICActualPaidAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("133099b4-ac82-4125-9edc-f4ae24e459d9");
    _PaymentManagement.Click_clickSave_1();
    

    TestModellerLogger.SetLastNodeGuid("8180aea7-3494-4e98-af58-0f9684375c79");
    _PaymentManagement.Click_DownloadExport_to_PDF();
    

    }
*/
}
