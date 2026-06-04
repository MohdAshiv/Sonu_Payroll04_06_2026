package _1853Test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/14ae6e62-f59f-4f5c-8600-cc3fff3c0863
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1835, profileId = 102339)
public class TC581IndividualEmployeeP60 extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    
    
    @Test  (groups= {"FilingManagementTest","FilingManagementTest - Default Profile"})
    @TestModellerPath(guid = "169a73fe-a823-474d-8ca1-4a0c0e55236d")
    public void GoToUrlAssertUrlPositiveSelectselectTaxYearsEnterEnterNotesPositiveSelectSubmitReasonClickNott() throws Exception
    {
    	
    	sTestCaseID="TC581";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
        
        pages.loginpage3B _loginpage = new pages.loginpage3B(driver);
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
    //    

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
        

        TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
        _OpenClient.Click_ClientsClick();
        

        TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
        _OpenClient.Enter_EnterClientName(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
        _OpenClient.Click_ClickSearch();
        

        TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
        _OpenClient.Click_ClickClient();
        

    pages.gotoPayrollSetting _gotoPayrollSetting = new pages.gotoPayrollSetting(driver);
//        TestModellerLogger.SetLastNodeGuid("b333bb86-e176-4761-b72c-e02790318565");
//        _gotoPayrollSetting.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("c9dacefe-86b3-4337-b563-f20d557a63c0");
//        _gotoPayrollSetting.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("e0fb63b7-8522-4daf-b671-0e1712be8115");
        _gotoPayrollSetting.Click_clickPayroll();
        
        
        
        pages.FilingManagement _FilingManagement2 = new pages.FilingManagement(driver);
        
        TestModellerLogger.SetLastNodeGuid("ce7fd648-a7bc-4663-8eeb-a050715bb607");
        _FilingManagement2.Click_gotoFilingManagement();
        
        
        pages.FilingManagement1 _FilingManagement = new pages.FilingManagement1(driver);
        
        
        _FilingManagement.Select_selectTaxYears("2021-2022");
        
        
        _FilingManagement.Select_StatusSearch("Pending");
        
        
        _FilingManagement.selectMonth();
    

 //   TestModellerLogger.SetLastNodeGuid("ce7fd648-a7bc-4663-8eeb-a050715bb607");
    
    

    TestModellerLogger.SetLastNodeGuid("d651cad9-9025-45a7-9c22-83d397fadd5c");
    _FilingManagement.Enter_EnterNotes("NA");
    

//    TestModellerLogger.SetLastNodeGuid("fbf51607-b48e-43e8-919d-f896461d7506");
//    _FilingManagement.Select_SubmitReason("Reasonable excuse");
    

    TestModellerLogger.SetLastNodeGuid("cb8220d5-f608-4e50-be66-fb2726fa7f6a");
    _FilingManagement.Click_Not_to_submit1();
    

//    TestModellerLogger.SetLastNodeGuid("60c1c7ce-0069-4f5f-8881-7ad6e3fd85a3");
//    _FilingManagement.Click_checkFile();
    
    
    pages.EmployeeDasboard _EmployeeDasboard = new pages.EmployeeDasboard(driver);
    
    TestModellerLogger.SetLastNodeGuid("6da537b6-848a-49d4-b76d-d299bfdf2cbd");
    _EmployeeDasboard.Click_Employer_View();
    
    
    pages.EEIndividualPay _EEIndividualPay = new pages.EEIndividualPay(driver);
    
    TestModellerLogger.SetLastNodeGuid("e26c4964-132b-42b9-85f4-12825bc8f987");
    _EEIndividualPay.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("eb3160a5-add4-49d2-aaf8-b116814a547a");
    _EEIndividualPay.Click_Individual_Employee_P60();
    

//    TestModellerLogger.SetLastNodeGuid("c9d989ed-eec9-4ee4-85ae-a7684b9793be");
//    _EEIndividualPay.Select_ChooseEE_ER("Employees");
//    
//
//    TestModellerLogger.SetLastNodeGuid("896212b4-e5c8-4333-8946-92255d668aae");
//    _EEIndividualPay.Select_chooseEmployee1("Mr. A Last");
    

//    TestModellerLogger.SetLastNodeGuid("4c605f32-8701-4019-ac26-5917ffe5e080");
//    _EmployeeDasboard.Enter_search_imployee("A");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4703a6ed-27cf-4287-a0b8-90941fc7c5de");
//    _EmployeeDasboard.Click__Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d99dfe27-c5f8-458a-ba06-1330178a3215");
//    _EmployeeDasboard.Click_ClickOnEmployee();
//    
//
//    TestModellerLogger.SetLastNodeGuid("04689667-af12-4920-8dfe-ec7c614a40c2");
//    _EmployeeDasboard.Click__Employee_Dashboard_();
//    
//
    TestModellerLogger.SetLastNodeGuid("ee699ef2-b0b4-4242-986c-61e64dbc354e");
    _FilingManagement.Click_Undo();
    

    }

}