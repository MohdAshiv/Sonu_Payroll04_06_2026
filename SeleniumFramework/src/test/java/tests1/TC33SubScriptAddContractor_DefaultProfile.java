package tests1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/75918de1-92ef-4a18-8c4e-9a1709b1a648
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1399, profileId = 101266)
public class TC33SubScriptAddContractor_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;


    
    @Test  (groups= {"SubScriptAddContractor","SubScriptAddContractor - Default Profile"})
    @TestModellerPath(guid = "20fb363f-2104-4309-91ed-f20677955ecc")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
       
    	sTestCaseID="TC33";
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
    

pages1.CISDashboard _CISDashboard = new pages1.CISDashboard(driver);
//    TestModellerLogger.SetLastNodeGuid("6a964e14-9cec-4fff-bea2-8c255da89cdd");
//    _CISDashboard.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c6164964-b26e-4753-ba1c-38aed9901526");
//    _CISDashboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d1588f07-be14-4f0f-84a4-7b55c4cf8afd");
    _CISDashboard.Click_clickCIS();
    

    TestModellerLogger.SetLastNodeGuid("d3a60f45-ee7f-4221-8145-53f54235eb39");
    _CISDashboard.Click_gotoCISDashboard();
    

pages1.AddContractorInCIS _AddContractorInCIS = new pages1.AddContractorInCIS(driver);
//    TestModellerLogger.SetLastNodeGuid("aa0abf47-7b40-4ce7-b49e-4c9a5fd79a4d");
//    _AddContractorInCIS.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("66d48b05-0678-4807-a2fc-7a1e7f8171c0");
//    _AddContractorInCIS.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("368dbed2-d526-4356-8cb7-7d494de7ed1c");
    _AddContractorInCIS.Click_ClickAddContractor();
    

 /*   TestModellerLogger.SetLastNodeGuid("eb1f3047-8759-43a5-a68d-2b6beb5c45e6");
    _AddContractorInCIS.Enter_ContractorName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("d70bf4ad-e847-4221-a8bc-d860d3ef2984");
    _AddContractorInCIS.Enter_ContractoeFirstName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("43b812d1-57d5-4b5d-8db0-ebcf782e1ac1");
    _AddContractorInCIS.Enter_ContractorSurName(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b7fff08a-4829-4c39-93c8-ac6ca73c6731");
    _AddContractorInCIS.Enter_ContractorRefNo(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("97b0841b-eb69-41c8-abe0-9eb0c90b12ab");
    _AddContractorInCIS.Enter_HMRCOfficeNo(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("b0551459-39d5-4e9d-807a-3338b62e67e9");
    _AddContractorInCIS.Enter_AccountOffRefNo(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("4b979a93-91c0-4344-862b-d0c613e6cab0");
    _AddContractorInCIS.Enter_UtrNo(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("622701e9-f935-4e56-9b8f-cfcf23a45206");
    _AddContractorInCIS.Enter_PhoneNo(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("476dfdde-48b3-4149-b9e3-fbe1d0dafa6e");
    _AddContractorInCIS.Enter_EmailId(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("e13c312a-702a-4357-9c0a-521a2d712690");
    _AddContractorInCIS.Enter_Address1(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("42564e4d-4bb1-4613-b314-3f62c5144fed");
    _AddContractorInCIS.Enter_Address2(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("4fa581ba-5685-48ea-889c-c08ce8c712fe");
    _AddContractorInCIS.Enter_PostCode(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("f0f2d532-69cc-466c-b5d9-26767b665ec2");
    _AddContractorInCIS.Click_ClickSave();
   */ 

    }

}
