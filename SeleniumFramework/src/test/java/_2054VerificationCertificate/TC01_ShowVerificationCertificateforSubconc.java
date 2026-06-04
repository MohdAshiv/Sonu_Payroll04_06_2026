package _2054VerificationCertificate;

import org.testng.annotations.Test;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import tests.TestBase;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

public class TC01_ShowVerificationCertificateforSubconc extends TestBase
{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null;

		    
	 @Test 
	 @TestModellerPath(guid = "8c7c840e-6086-4f3d-b9ff-7b3f3724775c")
		    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
		    {
		     sTestCaseID="TC001";
		     Sheet="Sheet9";
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

		
		    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
		    _agentpage.Enter_SearchAgentName(data[3]);
		    

		    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
		    _agentpage.Click_ClickSearch();
		    

		    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
		    _agentpage.Click_ClickAgent();
		    
		    _2047CISRpt_Pymtanddeduc.AddCISContrctor _CISContrctorSrch = new _2047CISRpt_Pymtanddeduc.AddCISContrctor(driver);
	
		 	 TestModellerLogger.SetLastNodeGuid("ebdefc4d-ae35-40b5-96f9-386aff9dd658");
		    _CISContrctorSrch.Click_clickCIS();
		    

		    TestModellerLogger.SetLastNodeGuid("85b6fb06-eabe-42c6-9786-713b81636869");
		    _CISContrctorSrch.Click_clickContractorList();
		    

		  TestModellerLogger.SetLastNodeGuid("3a82676f-048d-4d69-bf1b-6fbe160ea282");
		    _CISContrctorSrch.Search_ContractorName();
		    

		    TestModellerLogger.SetLastNodeGuid("e4b3696d-5ae4-44e5-8eff-65b04c075a46");
		    _CISContrctorSrch.Enter_Contractorname(data[4]);
		    

		    TestModellerLogger.SetLastNodeGuid("ae741c88-e2dd-4be9-a495-95bd77fbc081");
		    _CISContrctorSrch.Click_Updatebtn();
		    
		    Thread.sleep(2000);
		    
		    TestModellerLogger.SetLastNodeGuid("ae741c88-e2dd-4be9-a495-95bd77fbc081");
	        _CISContrctorSrch.Click_ContractorName();
	        
      _2055CISReports.CisReports reports = new  _2055CISReports.CisReports(driver);

		       reports.Click_CISReport();
	        
	           reports.Click_VerificationCertificate();
	           
	  _2054CISRpt_VerfCertifcate.VerificationCertificate VrfCrtifc = new  _2054CISRpt_VerfCertifcate.VerificationCertificate(driver);

	           VrfCrtifc.Select_FinacialYear(data[5]);
	           
	           VrfCrtifc.Click_Updatebtn();
	           
	           Thread.sleep(2000);
	           
	           VrfCrtifc.TakeShot("Verify Financial Year for VerificationCertificate");


}
}
