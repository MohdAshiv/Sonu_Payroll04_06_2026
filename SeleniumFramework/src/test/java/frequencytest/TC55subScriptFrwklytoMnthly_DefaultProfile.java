package frequencytest;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Blue;
import pages.frequency.runpayrollpage1;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/61094e72-17a3-4f97-8e81-923bd7e8148c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1353, profileId = 101220)
public class TC55subScriptFrwklytoMnthly_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subScriptPayFrequency","subScriptPayFrequency - Default Profile"})
    @TestModellerPath(guid = "05667963-18ac-43c9-9286-f1838557c35a")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC55";
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
    

payslip_Blue _payslip = new payslip_Blue(driver);
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
//    
    pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);





pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

    pages.frequency.runpayrollpageMonthly _runpayrollpage = new pages.frequency.runpayrollpageMonthly(driver);
////    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
////    _runpayrollpage.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
////    _runpayrollpage.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    
    
    frequency.SearchEMPpage _EMPSearch = new frequency.SearchEMPpage(driver);
    
    TestModellerLogger.SetLastNodeGuid("7cb4ab9c-9920-4049-bbb2-cfffbbc1c65f");
    _EMPSearch.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("3fd95f28-2ee3-423e-bb39-696f925e309a");
    _EMPSearch.Select_selectEmployeeStatus(data[6]);
    
    _EMPSearch.Enter_SearchEmployeFirstName(data[7]);
    //driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearch' and @type='text']")).sendKeys(data[7]);

    TestModellerLogger.SetLastNodeGuid("ffc5a6e7-cc13-493e-86f2-6023149d1833");
    _EMPSearch.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("b69f3861-c4f1-4301-91c4-586a41760159");
    _EMPSearch.Click_clickonEmpName();
    
    
  	frequency.Empfrqchange _Empfrqchange = new frequency.Empfrqchange(driver);
//    TestModellerLogger.SetLastNodeGuid("b5881c0d-a1ae-4bb8-975a-5a3a8b98b819");
//    _Empfrqchange.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("557b84c8-cbd7-4fe4-91a7-325695c18947");
//    _Empfrqchange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94e09c67-2b22-46e9-8b2c-9311f9e5855d");
    _Empfrqchange.Click_getgrosssalary();
    

    TestModellerLogger.SetLastNodeGuid("cec2b39a-880b-4090-9dac-068b5c6a8a54");
    _Empfrqchange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("cc5eb559-bd12-41be-9607-8b1d69d8dbb4");
    _Empfrqchange.Click_gotoMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("bb9bc4ed-d666-4b37-b0d5-5de5405f1a19");
    _Empfrqchange.Select_selectPayrollFrequencyCode(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("cbe82168-243d-456e-abcc-ddaad302d58a");
    _Empfrqchange.Click_gotoPayDetails();
    

    TestModellerLogger.SetLastNodeGuid("85182243-8a94-449a-8981-6c587555e9dc");
    _Empfrqchange.Enter_EnterAnnualSalary(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("676137ff-d9b3-4a7d-99be-f9d018b25598");
    _Empfrqchange.Click_clickSave();
    
    
   

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    
    
    TestModellerLogger.SetLastNodeGuid("7cb4ab9c-9920-4049-bbb2-cfffbbc1c65f");
    _EMPSearch.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("3fd95f28-2ee3-423e-bb39-696f925e309a");
    _EMPSearch.Select_selectEmployeeStatus(data[6]);
    
    driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearch' and @type='text']")).sendKeys(data[7]);

    TestModellerLogger.SetLastNodeGuid("ffc5a6e7-cc13-493e-86f2-6023149d1833");
    _EMPSearch.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("b69f3861-c4f1-4301-91c4-586a41760159");
    _EMPSearch.Click_clickonEmpName();
    
    _Empfrqchange.afterchange();
    
    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    
    
    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    
    _payslip.makenotapplicablefourweekly();
    
    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    
    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    
    
    

    }
}
