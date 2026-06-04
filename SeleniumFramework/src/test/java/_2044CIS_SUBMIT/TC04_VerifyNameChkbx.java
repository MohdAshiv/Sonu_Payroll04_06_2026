package _2044CIS_SUBMIT;

import org.testng.annotations.Test;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import tests.TestBase;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

public class TC04_VerifyNameChkbx extends TestBase
{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null;

	       
	 @Test (groups= {"SaleInToReconcile","SaleInToReconcile - Default Profile"})
	 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
		    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
		    {
		        
		    	sTestCaseID="TC004";
		        Sheet="Sheet2";
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
//		    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//		    _agentpage.GoToUrl();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//		    _agentpage.AssertUrl();
		    

		    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
		    _agentpage.Enter_SearchAgentName(data[3]);
		    

		    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
		    _agentpage.Click_ClickSearch();
		    

		    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
		    _agentpage.Click_ClickAgent();
		    
		    
		    _2044CIS_Submt.CISDashboard CisDsbd = new _2044CIS_Submt.CISDashboard(driver);
		    CisDsbd.Click_clickCIS();
		    
		    _2044CIS_Submt.CISFiling CisFile = new _2044CIS_Submt.CISFiling(driver);
		
		    CisFile.Click_CISFiling();
		    
		    CisFile.Select_FinacialYer(data[4]);
		    
		    CisFile.Select_FilePeriod(data[5]);
		    
		    CisFile.Click_Searchbtn();
		    Thread.sleep(1000);
		    CisFile.Click_NameCheckBox();
		    Thread.sleep(1000);
		    CisFile.VerifyNameCheckbox();
		    CisFile.GetPicShoot("NameChkbox Selected");
		    
		    }

}
