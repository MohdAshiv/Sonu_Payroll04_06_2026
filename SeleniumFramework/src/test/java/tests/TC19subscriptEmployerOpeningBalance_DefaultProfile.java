package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/aef55862-6cc4-4a25-a38c-1a47441f2a61
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1347, profileId = 101214)
public class TC19subscriptEmployerOpeningBalance_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subscriptEmployerOpeningBalance","subscriptEmployerOpeningBalance - Default Profile"})
    @TestModellerPath(guid = "30005bae-3e71-426f-b8b7-11b3ed4fb498")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
        
    	sTestCaseID="TC19";
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
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.gotoPayrollSetting _gotoPayrollSetting = new pages.gotoPayrollSetting(driver);
//    TestModellerLogger.SetLastNodeGuid("b333bb86-e176-4761-b72c-e02790318565");
//    _gotoPayrollSetting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9dacefe-86b3-4337-b563-f20d557a63c0");
//    _gotoPayrollSetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0fb63b7-8522-4daf-b671-0e1712be8115");
    _gotoPayrollSetting.Click_clickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("a3342d2d-f649-4841-b422-99c823ece078");
    _gotoPayrollSetting.Click_clickEditCompany();
    


    
    pages.EmployerOpeningBalance _EmployerOpeningBalance = new pages.EmployerOpeningBalance(driver);
//  TestModellerLogger.SetLastNodeGuid("4dab2062-b5ce-46c6-969d-5179179e38b0");
//  _EmployerOpeningBalance.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("b5264ab4-7a5b-43b5-bdec-acc125b8024d");
//  _EmployerOpeningBalance.AssertUrl();
//  

  TestModellerLogger.SetLastNodeGuid("f49f925a-efac-428a-ba6b-99859090462b");
  _EmployerOpeningBalance.Click_gotoOpeningBalances();
  

  TestModellerLogger.SetLastNodeGuid("7f91ac73-bc7f-4298-ac6d-70741c2e15ff");
  _EmployerOpeningBalance.Enter_ApprenticeshipLevy(data[5]);
  

  TestModellerLogger.SetLastNodeGuid("1f94767a-a4df-4ede-9d06-b91e3f54ad8d");
  _EmployerOpeningBalance.Enter_CISSuffered(data[6]);
  

  TestModellerLogger.SetLastNodeGuid("b299ce53-1e1a-48eb-a5ff-e9ae5a0efb47");
  _EmployerOpeningBalance.Enter_CISTax(data[7]);
  

//  TestModellerLogger.SetLastNodeGuid("08eeae53-5f62-461e-a8d2-4a329d3dc286");
//  _EmployerOpeningBalance.Enter_TaxRefundFunding("");
//  

//  TestModellerLogger.SetLastNodeGuid("48896b60-2314-49d4-9472-a17c412b802d");
//  _EmployerOpeningBalance.Enter_StatutoryPayRecovery(data[8]);
  

//  TestModellerLogger.SetLastNodeGuid("64de2b64-d1f9-40d2-861e-b50cc0121824");
//  _EmployerOpeningBalance.Enter_ActualPaidToHMRC("");
  

  TestModellerLogger.SetLastNodeGuid("eaf9a335-9b90-4c27-ad13-ac666e6a9f0d");
  _EmployerOpeningBalance.Enter_SMPRecovered(data[9]);
  

  TestModellerLogger.SetLastNodeGuid("11bbf2ba-b752-4afb-96b9-511ec8a6577e");
  _EmployerOpeningBalance.Enter_NICCompensationOnSMP(data[10]);
  

//  TestModellerLogger.SetLastNodeGuid("522b1bf0-fca8-4f1b-9f66-892ab49f523f");
//  _EmployerOpeningBalance.Enter_SPPRecovered("");
//  

  TestModellerLogger.SetLastNodeGuid("015c9947-7935-40da-b3d3-96cab3c378ea");
  _EmployerOpeningBalance.Enter_NICCompensationOnSPP(data[11]);
  

  TestModellerLogger.SetLastNodeGuid("50f611cf-88bc-470b-bfd5-3a8d2277b751");
  _EmployerOpeningBalance.Click_clickSave();
  

//  TestModellerLogger.SetLastNodeGuid("d66fda97-7031-40c3-a203-b39b859dfc94");
//  _EmployerOpeningBalance.Click_gotoPayrollDashboard();


pages.TaxAndReport _TaxAndReport = new pages.TaxAndReport(driver);
//    TestModellerLogger.SetLastNodeGuid("51fb1800-036a-4452-b049-f8b02abe4d69");
//    _TaxAndReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("977d41f8-b4e2-4e7e-b0d5-b7d550215beb");
//    _TaxAndReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9c70c2d-a863-4b0c-b97a-91488f412253");
    _TaxAndReport.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("7f6fb047-d5bc-47cc-9119-0e6aec70bbf4");
    _TaxAndReport.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("c6835075-372f-4eb6-81d9-fc561aee0ccc");
    _TaxAndReport.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("518036f6-42e4-48ef-81be-8d5d993ae294");
    _TaxAndReport.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("956b7072-33c4-4a67-b480-2043c99484d9");
    _TaxAndReport.Click_clickExporttoPDF();
    
    
    pages.FilingManagement _leavertesting = new pages.FilingManagement(driver);
    

    TestModellerLogger.SetLastNodeGuid("daf8d06f-5e14-4f77-b50b-5f0ece9142f1");
    _leavertesting.Click_gotoFilingManagement();
    
    
PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
	
	TestModellerLogger.SetLastNodeGuid("ba20616f-2ad5-40d5-9166-657bb6b0822f");
    _PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();


PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


	    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
	    _PayrollDoUndo.Click_Undo_Last_Payroll_();



    

    }

}
