package SmallerEmployertest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f694b2f6-0516-48bc-a5c9-e3540180be3b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1449, profileId = 101333)
public class TC68MidYearQualifiedforSmallerEmployer_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"SmallerEmployer","SmallerEmployer - Default Profile"})
    @TestModellerPath(guid = "a4970cf7-b037-4c89-bbfc-1414ba2599b7")
    public void GoToUrlAssertUrlClickclickAllowancesSchemesClickselectYestosmallERClickselectNotosmallERClickc() throws Exception
    {
       
    	sTestCaseID="TC68";
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
    
    
    
    frequency.DiffFPSforDiffFreq _payslip = new frequency.DiffFPSforDiffFreq(driver);
//  TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//  _payslip.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//  _payslip.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
  _payslip.Click_ClickPayroll();
  
  
  SmallerEmployerpage.SmallerEmployer _SmallerEmployer = new SmallerEmployerpage.SmallerEmployer(driver);
  
//  TestModellerLogger.SetLastNodeGuid("ccd04594-ca58-4895-9426-dc770c38086d");
//  _SmallerEmployer.Click__Tax_Payment_();
//  
//  TestModellerLogger.SetLastNodeGuid("e1a2eee1-44ab-4e31-967b-cdcb2545da0f");
//  _SmallerEmployer.Select_selectTaxYear(data[5]);
//  
//  _SmallerEmployer.lastyearliability();
//  
//  _SmallerEmployer.Click_gotoPayrollDashboard();
//  
  

  TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
  _payslip.Click_gotoEditCompany();
  

  TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
  _payslip.Click_clickPayrollDetails();
  
    	
    	
    	
    	
    	
 //   	SmallerEmployerpage.SmallerEmployer _SmallerEmployer = new SmallerEmployerpage.SmallerEmployer(driver);
//    TestModellerLogger.SetLastNodeGuid("f5e3698e-0bdd-47fa-bef2-20d22ab184bc");
//    _SmallerEmployer.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0768d890-7826-42e5-bc82-a8000630f6c9");
//    _SmallerEmployer.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c584689b-77cc-47c5-ac57-971d9dafe7f3");
    _SmallerEmployer.Click_clickAllowances_Schemes();
    

    TestModellerLogger.SetLastNodeGuid("440165a6-83f7-4b4b-a3fb-1fffb3b75d18");
    _SmallerEmployer.Click_selectYestosmallER1();
    

//    TestModellerLogger.SetLastNodeGuid("acef2072-204b-4bc6-8bb8-75aad95a5646");
//    _SmallerEmployer.Click_selectNotosmallER();
//    

    TestModellerLogger.SetLastNodeGuid("d050a6cf-2064-4847-9357-dda355082b21");
    _SmallerEmployer.Click_clickSave();
    

//    TestModellerLogger.SetLastNodeGuid("ccd04594-ca58-4895-9426-dc770c38086d");
//    _SmallerEmployer.Click__Tax_Payment_();
//    
//   // _SmallerEmployer.lastyearliability();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e1a2eee1-44ab-4e31-967b-cdcb2545da0f");
//    _SmallerEmployer.Select_selectTaxYear(data[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("15a8c9d6-be6c-4a2f-989f-1d2322bcd2c3");
//    _SmallerEmployer.Click_clickStatPayamount();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a96648d9-f0a4-4798-ab20-bd82475f6046");
//    _SmallerEmployer.Select_selectTaxYear(data[5]);
//    
//    
//    _SmallerEmployer.verifyparenting_pay_recoverd();

//    TestModellerLogger.SetLastNodeGuid("667358fd-2305-439f-9849-0ee5b55cac6e");
//    _SmallerEmployer.Click_getMonth();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a16ffdbe-be2e-4ebb-8416-81282e2cd948");
//    _SmallerEmployer.Click_getParentingPay();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a3a419cd-7624-47d2-b892-d36205379c3b");
//    _SmallerEmployer.Click_getParentingPayrecovery();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b36201af-545a-46ed-8ed5-b97931e436f9");
//    _SmallerEmployer.Click_getParenting_Pay_NIC_Compensation();
//    

    }

}
