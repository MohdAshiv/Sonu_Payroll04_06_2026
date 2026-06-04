package verifyEmailsDataTest;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/578a2e1c-e210-44b5-b9f1-325d9ea9eb90
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1491, profileId = 101400)
public class TC112verifyEmail_DefaultProfile extends TestBase
{
	
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    

    
    @Test  (groups= {"verifyEmail","verifyEmail - Default Profile"})
    @TestModellerPath(guid = "40db4321-172b-4db3-ab0c-dd55b8dbac6c")
    public void GoToUrlAssertUrlClickRunPayroll1PositiveSelectSelecttoMainContactClickRunPayroll2ClickopenPayr() throws Exception
    {
    	
    	sTestCaseID="TC112";
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
    

    volentry_Pension.gotoPayrollSetting _payslip = new volentry_Pension.gotoPayrollSetting(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    	
    	
        
    	VerifyEmailsData.verifyEmail _verifyEmail = new VerifyEmailsData.verifyEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("37f3fd6b-2619-4032-8f55-b6c485c67d5c");
//    _verifyEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1966e0ba-8ef5-4715-9d74-668142890af2");
//    _verifyEmail.AssertUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("1fc82158-15ce-40b5-bc76-fdb1ad261fd2");
//    _verifyEmail.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("03f45e6e-d068-4171-a094-7d7eaf21e0f2");
//    _verifyEmail.Select_SelecttoMainContact(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("16f3f94e-c09a-4666-9441-2adee1db858f");
//    _verifyEmail.Click_RunPayroll2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d3ab9d5a-a46b-4837-b434-80dcffdeb6b7");
//    _verifyEmail.Click_openPayrollSummary();
//    
//
//    TestModellerLogger.SetLastNodeGuid("08fb6589-ee1a-4435-a9dc-9ebf96bddd2b");
//    _verifyEmail.Click_clickSend();
    

    TestModellerLogger.SetLastNodeGuid("632f8ab6-0f05-4798-b4ee-27230732b5db");
    _verifyEmail.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("f90e3e00-6501-44df-90bf-faf8786ef9fb");
    _verifyEmail.Click_clickPayrollSummary();
    

//    TestModellerLogger.SetLastNodeGuid("5d451da2-b6b2-49a6-b723-4790e772be23");
//    _verifyEmail.Click_getPayments();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80505834-101e-4df3-8382-e2e2a1c361e9");
//    _verifyEmail.Click_getTax();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b5321afa-eaa9-41ce-980f-a19fa5b4fe95");
//    _verifyEmail.Click_getStudentloan();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a795539-ac1f-4434-9c18-bc3af14ad657");
//    _verifyEmail.Click_getPGloan();
//    
//
//    TestModellerLogger.SetLastNodeGuid("681930f7-ce4d-4f03-ba1f-06db670b8783");
//    _verifyEmail.Click_getEE_NI();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d760f8c2-70bb-495b-9e3a-4582e738a3c9");
//    _verifyEmail.Click_getNetPay();
//    
//
//    TestModellerLogger.SetLastNodeGuid("44fff27e-5de5-43a8-b36f-53e8d6b284bb");
//    _verifyEmail.Click_getER_NI();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c13295d5-3106-44a6-9a46-0bd981170fef");
//    _verifyEmail.Click_getEE_NISummary();
//    
//
//    TestModellerLogger.SetLastNodeGuid("908ed853-0f27-44c5-8df6-63da1d033026");
//    _verifyEmail.Click_getHMRC_over_Payment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("67c00fe4-8171-40af-9c93-0d70d904a70f");
//    _verifyEmail.Click_getER_NISummary();
//    
//
//    TestModellerLogger.SetLastNodeGuid("da9fabd4-dde9-4ff4-9a81-11bd511853fc");
//    _verifyEmail.Click_getB_F();
//    
//
//    TestModellerLogger.SetLastNodeGuid("87251b93-9e3f-4a41-a909-b955228e67bc");
//    _verifyEmail.Click_getNIC_EMP_Allowance();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9d9e2ad-ec0e-41db-b93f-0da0637f4f26");
//    _verifyEmail.Click_getC_F();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e5349512-bb3d-4c9b-90f9-6c54096584ed");
//    _verifyEmail.Click_getSMPSSPRecovery();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ee539b0b-44a6-4514-8fc3-45a4d0af5f7d");
//    _verifyEmail.Click_getSMPSPPCompensation();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e7cef719-aa80-432b-82c5-9bc7dbc86564");
//    _verifyEmail.Click_getFunding_Rec();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bc094169-4456-48be-a313-909f5c534e02");
//    _verifyEmail.Click_getTotalNI();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2e3e0ec2-6afe-4add-9f04-6f221ad1ca63");
//    _verifyEmail.Click_getNETPAIDtoStaff();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4708ebbd-5766-4ad8-85ee-b3daf08fefcc");
//    _verifyEmail.Click_getPAYE_Tax();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1233790c-7afc-4195-87f4-9d78a41d7818");
//    _verifyEmail.Click_PayeNIDueHMRC();
//    
//
//    TestModellerLogger.SetLastNodeGuid("68419f7a-4179-44cb-8a26-236da81b0266");
//    _verifyEmail.Click_getTax_Refund_Funding();
//    
//
//    TestModellerLogger.SetLastNodeGuid("92217448-8ce8-4805-acb7-a657cb3a26da");
//    _verifyEmail.Click_getPayment_for_Month();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3b1deba3-83b0-4519-a9cd-12b53da6f723");
//    _verifyEmail.Click_getStudent_Loan_Repay();
//    
//
//    TestModellerLogger.SetLastNodeGuid("aa00a4ac-bf2d-4586-b077-2bb71d7d9eca");
//    _verifyEmail.Click_getTotalCostforthePeriod();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6e878531-2019-489d-9d9a-d4a3f1b03a94");
//    _verifyEmail.Click_getPG_loan_Repay();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6bee4de2-64b7-4a0a-aac1-ea8006fe1ea9");
//    _verifyEmail.Click_getTotal_Tax();
//    

    }

}
