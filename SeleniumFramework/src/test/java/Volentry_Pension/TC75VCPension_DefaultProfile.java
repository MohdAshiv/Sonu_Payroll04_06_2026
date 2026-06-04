package Volentry_Pension;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f22e58be-f0ae-496c-9057-e4ca8ae2d1b4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1456, profileId = 101336)
public class TC75VCPension_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"VC_Pension","VC_Pension - Default Profile"})
    @TestModellerPath(guid = "8a2c5334-1aa7-4a42-a51f-d83ce681da47")
    public void GoToUrlAssertUrlClickgotoReportsClickgetEEPensionClickgetERpensionClickgotoPensionDashboardCl() throws Exception
    {
    	
    	
    	
    	sTestCaseID="TC75";
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
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
        
    	volentry_Pension.VC_Pension _VC_Pension = new volentry_Pension.VC_Pension(driver);
//    TestModellerLogger.SetLastNodeGuid("1440f8c6-ef12-4aab-9c8c-537c379e2e5e");
//    _VC_Pension.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f51cdc05-7a38-4548-b097-e984680d126c");
//    _VC_Pension.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("ca2b2a7e-3b7c-45f6-bbf8-cf49102ed0db");
    _VC_Pension.Click_gotoReports();
    
    _VC_Pension.Click_clickPayslips();
    

//    TestModellerLogger.SetLastNodeGuid("6a06e597-93d2-4e43-aba3-23df5a29eeb1");
//    _VC_Pension.Click_get_EE_Pension();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e5499ce6-bc23-488f-9c01-f05d5f09bbb5");
//    _VC_Pension.Click_get_ER_pension();
    

    TestModellerLogger.SetLastNodeGuid("319436a4-6a06-43af-af70-10d3ea9de391");
    _VC_Pension.Click_gotoPension_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("0a19b958-5210-43cc-a78f-233964226d43");
    _VC_Pension.Click_click_three_dots();
    

    TestModellerLogger.SetLastNodeGuid("ed5fcd27-826c-492d-a703-7f4d15a0a005");
    _VC_Pension.Click_clickEdit();
    

    TestModellerLogger.SetLastNodeGuid("17ae219f-72c3-4ba3-b29d-58c975a858b7");
    _VC_Pension.Click_clickAutoEnrolment();
    

    TestModellerLogger.SetLastNodeGuid("e72d7299-7d5a-4e78-b4fc-6f5e972ad942");
    _VC_Pension.Enter_EEChosenContribution(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("95d457f5-c598-41ef-ad29-a856a7a7de35");
    _VC_Pension.Enter_ERChosenContribution(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("7b881de9-9ac1-454e-a52d-d24e0d915cf7");
    _VC_Pension.Enter_EEVoluntaryContribution(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("68d1d0c1-52c5-4ea4-afbd-12fe31f557d1");
    _VC_Pension.Enter_ERVoluntaryContribution(data[8]);
    

//    TestModellerLogger.SetLastNodeGuid("73d6fbfc-9ddf-42d2-a744-39b6924f1b13");
//    _VC_Pension.Click_gotoPayroll_Dashboard();
//    

//    TestModellerLogger.SetLastNodeGuid("079647e9-3b51-4498-ac19-0c329dcca740");
//    _VC_Pension.Select_getPayrollDate();
    
    
    _VC_Pension.Click_gotoPayroll_Dashboard();
    

//    TestModellerLogger.SetLastNodeGuid("a69e1686-89c1-4f85-8eeb-71e34a39d420");
//    _VC_Pension.Click_Run_Payroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a3ec9662-0b8d-4fa6-be1f-e7f36062aeb6");
//    _VC_Pension.Click_Run_Payroll2();
    

    TestModellerLogger.SetLastNodeGuid("fa407cbb-fb1c-4d2c-973b-acb202824da9");
    _VC_Pension.Click_gotoReports();
    
    
    _VC_Pension.Click_clickPayslips2();
    
    
    _VC_Pension.verifyxml();
    

//    TestModellerLogger.SetLastNodeGuid("f8116eac-2204-44c1-af85-351b247ec98c");
//    _VC_Pension.Click_get_EE_Pension2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7f291a9b-eaa8-4cfd-9c19-64a21d3647ac");
//    _VC_Pension.Click_get_ER_pension2();
//    

    }

}
