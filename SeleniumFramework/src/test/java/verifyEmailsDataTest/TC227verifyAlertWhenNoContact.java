package verifyEmailsDataTest;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.verifyClosePayeErrorMessageOOPS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f86f956f-c500-4ca1-8339-015229c19be1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1409, profileId = 101276)
public class TC227verifyAlertWhenNoContact extends TestBase
{
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    

    
    @Test  (groups= {"AllowenceScheme","AllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "5e5b1aed-08c1-409d-b080-00e698fd0261")
    public void GoToUrlAssertUrlClickclickAllowancesSchemesClickmarkYesClickclickSaveClickgotoPayrollDashboard() throws Exception
    {
    	
    	
    	sTestCaseID="TC227";
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
//TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
//_verifyClosePayeErrorMessage.GoToUrl();
//
//
//TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
//_verifyClosePayeErrorMessage.AssertUrl();


 		TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
 		_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
 		
 		
    	VerifyEmailsData.PayrollDsbEmailBody _PayrollDsbEmailBody = new VerifyEmailsData.PayrollDsbEmailBody(driver);
//    TestModellerLogger.SetLastNodeGuid("b57468ce-7182-4d45-914c-f1866c1b5f2f");
//    _PayrollDsbEmailBody.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("53fdefef-477d-4ea5-8b20-b59a49b334be");
//    _PayrollDsbEmailBody.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("76227d22-84e4-4fc9-9614-7542782d7a70");
    _PayrollDsbEmailBody.Click_clickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("226f6549-cfa9-4a48-89b6-6f134625a6c5");
    _PayrollDsbEmailBody.Select_selectPaySlipTemplate(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("1a18737c-e1ab-42ed-920e-0a4c22ddc751");
    _PayrollDsbEmailBody.Click_Alert_MsgWhenNoMainContact();
    

    TestModellerLogger.SetLastNodeGuid("9576ed20-cb7c-486c-a020-08d7fb608111");
    _PayrollDsbEmailBody.verifyAlertWhenNoMainContactEmail();
//    

//    TestModellerLogger.SetLastNodeGuid("cfbe3324-52ce-4d3c-866b-358daae3fcf6");
//    _PayrollDsbEmailBody.Click_checkboxMyselfEmail();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e2c09941-25c9-4ca1-b531-b4273f79dd77");
//    _PayrollDsbEmailBody.Click_checkboxPayrollSummary();
//    
//
    
    

//    TestModellerLogger.SetLastNodeGuid("3dbb815a-3944-4f29-a1b0-f2623fa8ee8c");
//    _PayrollDsbEmailBody.Click_clickSend();
//    
//    
//    TestModellerLogger.SetLastNodeGuid("72a0508f-ea52-4614-9471-aacaad7420ca");
//    _PayrollDsbEmailBody.Click_getErrorMsgWhenNoCheck();
//    
//    
//    TestModellerLogger.SetLastNodeGuid("e2c09941-25c9-4ca1-b531-b4273f79dd77");
//  _PayrollDsbEmailBody.verifyErrormsgWhenNoCheckToComp();



    }

}
