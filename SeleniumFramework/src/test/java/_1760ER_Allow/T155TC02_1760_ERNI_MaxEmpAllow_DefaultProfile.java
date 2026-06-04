package _1760ER_Allow;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Blue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ec46dc20-1da3-4c5f-83da-ce785f427030
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1338, profileId = 101205)
public class T155TC02_1760_ERNI_MaxEmpAllow_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subScriptOpeningBalance","subScriptOpeningBalance - Default Profile"})
    @TestModellerPath(guid = "e853ed54-ab2a-40c0-a93c-d6d152bff41f")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
    	
    	sTestCaseID="TC155";
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
    

pages.gotoPayrollSetting _gotoPayrollSetting = new pages.gotoPayrollSetting(driver);
//    TestModellerLogger.SetLastNodeGuid("b333bb86-e176-4761-b72c-e02790318565");
//    _gotoPayrollSetting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9dacefe-86b3-4337-b563-f20d557a63c0");
//    _gotoPayrollSetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0fb63b7-8522-4daf-b671-0e1712be8115");
    _gotoPayrollSetting.Click_clickPayroll();
    

//    TestModellerLogger.SetLastNodeGuid("a3342d2d-f649-4841-b422-99c823ece078");
//    _gotoPayrollSetting.Click_clickEditCompany();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa4ac16e-6c4f-4b4c-9a57-ded7110bf2b6");
//    _gotoPayrollSetting.Click_gotoPayrollDetails();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d08e4a03-9e9b-46f6-aee7-a2a736a55c08");
//    _gotoPayrollSetting.Click_PayrollSettings();
//    

    _1760ER_Allow.SearchEmployee _searchEmployee = new _1760ER_Allow.SearchEmployee(driver);
//    TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
//    _searchEmployee.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
//    _searchEmployee.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
    _searchEmployee.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
    _searchEmployee.Select_SelectEmployeeStatus(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
    _searchEmployee.Enter_EnterEmployeeName(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
    _searchEmployee.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
    _searchEmployee.Click_clickonEmpName();
    

    _1760ER_Allow.OpeningBalanceEntry _OpeningBalanceEntry = new _1760ER_Allow.OpeningBalanceEntry(driver);
//    TestModellerLogger.SetLastNodeGuid("c2061167-b672-418c-8270-74c55625e599");
//    _OpeningBalanceEntry.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c84ae8ff-1e8b-43c9-b473-abe4abb4762d");
//    _OpeningBalanceEntry.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("bbe20689-ce0a-48dc-922e-2026466ce2e1");
    _OpeningBalanceEntry.Click_gotoOpeningBalances();
    

//    TestModellerLogger.SetLastNodeGuid("4d1752cb-7a92-497a-973d-0d86db3bf95c");
//    _OpeningBalanceEntry.Enter_EnterTaxCode(data[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("05fc3a41-91f8-4a92-8d3a-d5845a2fb747");
//    _OpeningBalanceEntry.Enter_EnterGrosspay(data[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("399ef982-7594-46fa-9acd-bd8af33ef5b7");
//    _OpeningBalanceEntry.Enter_EnterEmployeeNI(data[9]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("5cf13bac-fd99-4f57-a98e-e9855f383183");
//    _OpeningBalanceEntry.Enter_EnterNetPay(data[10]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("03743e17-778b-41ac-8fc3-e61963dcfa6b");
//    _OpeningBalanceEntry.Enter_EnterELtoPT(data[11]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("7ab82f35-00c7-499d-b91f-2b7bc55955d7");
//    _OpeningBalanceEntry.Enter_EnterEmployeePension("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("79b387b3-919f-4a8d-93c1-4e3b76637a53");
//    _OpeningBalanceEntry.Enter_EmployerPension("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("216e646f-e246-4182-8c83-64a98e547905");
//    _OpeningBalanceEntry.Enter_PayrollGiving("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6494949b-f0ac-45bc-9e0f-4ec75144cef6");
//    _OpeningBalanceEntry.Enter_StatutorySickPay("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6b71c5f6-57e6-4088-8e65-ee91ed927088");
//    _OpeningBalanceEntry.Enter_StatutoryMaternityPay("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9ff70e6b-b8c2-4356-b1ba-6780c4c80887");
//    _OpeningBalanceEntry.Enter_StatutoryPaternityPay("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2bcf41f5-8283-4ce7-981a-b79d935eb97c");
//    _OpeningBalanceEntry.Select_NICategoryCode(data[12]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("71e9f445-7fc1-455d-bcee-afba9baa9189");
//    _OpeningBalanceEntry.Enter_TaxDeducted(data[13]);
//    

    TestModellerLogger.SetLastNodeGuid("db179e05-700b-4116-a995-9f2fe4d3f840");
    _OpeningBalanceEntry.Enter_EmployerNI();
//    
//
//    TestModellerLogger.SetLastNodeGuid("53a73dd7-db66-41c7-baad-d05da2adbd98");
//    _OpeningBalanceEntry.Enter_LEL(data[15]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("e7c247f2-cf0d-41a5-bbec-a48c57cc0577");
//    _OpeningBalanceEntry.Enter_PTtoUAP(data[16]);
//    

//    TestModellerLogger.SetLastNodeGuid("bcc6dd0c-2d2c-4529-aa86-bd304767db8e");
//    _OpeningBalanceEntry.Enter_StudentLoan1("");
//    

//    TestModellerLogger.SetLastNodeGuid("a999e132-4b25-44e8-88c8-93a3309d12f0");
//    _OpeningBalanceEntry.Enter_StudentLoan2("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a53ddfb1-b595-4ca9-9886-909365ab18d5");
//    _OpeningBalanceEntry.Enter_StudentLoan4("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5cf76664-5ce6-44e1-90f5-de7760e14279");
//    _OpeningBalanceEntry.Enter_PostgradLoan("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2fd73b40-5b8c-46e3-a33f-61121e765b0d");
//    _OpeningBalanceEntry.Enter_SharedParentingPay("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cbc223c2-ff00-48d5-8645-4c864b6391d3");
//    _OpeningBalanceEntry.Enter_StatutoryAdoptionPay("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("704dbc9e-3dd5-4a84-a3ea-262177cc2795");
//    _OpeningBalanceEntry.Enter_PayrolledBIKClass1a("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("745afab3-421b-4552-b5c1-dd6696b64b00");
//    _OpeningBalanceEntry.Enter_PayrolledBIKNotClass1a("");
//    

   TestModellerLogger.SetLastNodeGuid("0fa1e3b9-9a3a-407d-9c14-a658d6a3d5e4");
   _OpeningBalanceEntry.Click_clickSave();
    

   _1760ER_Allow.TaxAndReport _TaxAndReport = new _1760ER_Allow.TaxAndReport(driver);
//    TestModellerLogger.SetLastNodeGuid("51fb1800-036a-4452-b049-f8b02abe4d69");
//    _TaxAndReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("977d41f8-b4e2-4e7e-b0d5-b7d550215beb");
//    _TaxAndReport.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c9c70c2d-a863-4b0c-b97a-91488f412253");
//    _TaxAndReport.Click_gotoPayrollDashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7f6fb047-d5bc-47cc-9119-0e6aec70bbf4");
//    _TaxAndReport.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c6835075-372f-4eb6-81d9-fc561aee0ccc");
//    _TaxAndReport.Click_RunPayroll2();
//    

    TestModellerLogger.SetLastNodeGuid("518036f6-42e4-48ef-81be-8d5d993ae294");
    _TaxAndReport.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("956b7072-33c4-4a67-b480-2043c99484d9");
    _TaxAndReport.maxEmpAllowance();
//    
//
//    TestModellerLogger.SetLastNodeGuid("63af41d9-6bd2-461f-bf65-cd4ad17a8ca7");
//    _TaxAndReport.Click_gotoReports();
//    

//    TestModellerLogger.SetLastNodeGuid("1aeb3e46-f37b-4596-ae6d-bba764c13be0");
//    _TaxAndReport.Click_clickP11();
//    
//
//    TestModellerLogger.SetLastNodeGuid("75096b09-fb87-4c76-a471-f37a047f05d3");
//    _TaxAndReport.Click_ExporttoPDF2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9023de17-23e0-40a1-8bfe-f449404f838e");
//    _TaxAndReport.Click_gotoReports();
    

//    TestModellerLogger.SetLastNodeGuid("414cc8b6-3ec0-4df2-865d-b222bc565e54");
//    _TaxAndReport.Click_clickPayslips();
//    

//    TestModellerLogger.SetLastNodeGuid("7529f9a6-6da8-465b-ada8-6046616e418b");
//    _TaxAndReport.Click_downloadPayslip();
    
//    payslip_Blue _payslip = new payslip_Blue(driver);
//    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
//    _payslip.Click_clickReGenerate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
//    _payslip.Click_downloadPaySlip();
//    
    

    }

}
