package _1964_RunPayroll;

import reports.TestNGListener;
import tests.TestBase;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/67c4774a-6aae-4cb9-9c99-e1589ed3c96e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1468, profileId = 101340)
public class T151TC01_1964_RunPayroll_OverDue_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"Gross Pay Calculation","Gross Pay Calculation - Default Profile"})
    @TestModellerPath(guid = "1c009671-6fcc-42f6-8a38-8a40d6118463")
    public void GoToUrlAssertUrlClickEEGrossPayClickclickRunPayroll1ClickclickRunPayroll2ClickgotoReportsClic() throws Exception
    {
    	
    	sTestCaseID="TC151";
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
//        TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//        _agentpage.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//        _agentpage.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
        _agentpage.Enter_SearchAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
        _agentpage.Click_ClickSearch();
        

        TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
        _agentpage.Click_ClickAgent();
        

    pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//        TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//        _OpenClient.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//        _OpenClient.AssertUrl();
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
//        TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//        _payslip.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//        _payslip.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
        _payslip.Click_ClickPayroll();
        
        
        _1964_RunPayroll.Gross_Pay_Calculation _Gross_Pay_Calculation = new _1964_RunPayroll.Gross_Pay_Calculation(driver);
//    TestModellerLogger.SetLastNodeGuid("dce3e02d-bee8-4ade-83e5-9009ec205d1e");
//    _Gross_Pay_Calculation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e06bfb81-f315-4e5c-9a71-f3da139b068d");
//    _Gross_Pay_Calculation.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("1282b10d-1a19-42a0-8dd4-cfaf5f2e3e8d");
//    _Gross_Pay_Calculation.Click_EE_GrossPay();
    

    TestModellerLogger.SetLastNodeGuid("018d7507-efbb-477e-b0d2-8599698131f7");
    _Gross_Pay_Calculation.Click_clickRun_Payroll1();
    



    }

}
