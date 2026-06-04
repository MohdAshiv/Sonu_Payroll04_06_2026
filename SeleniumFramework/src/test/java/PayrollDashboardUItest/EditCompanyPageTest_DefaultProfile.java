package PayrollDashboardUItest;

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
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b0e30105-05b4-49ca-a73d-301414ce00f0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1775, profileId = 102219)
public class EditCompanyPageTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"EditCompanyPageTest","EditCompanyPageTest - Default Profile"})
    @TestModellerPath(guid = "75b1bbd2-6a8f-47c3-9c34-1204b5411ed9")
    public void GoToUrlAssertUrlClickCompanyDetailsClickContactDetailsClickGeneralTermsClickInformationClickO()
    {
        
    	PayrollDashboardUI.EditCompanyPage _EditCompanyPage = new PayrollDashboardUI.EditCompanyPage(driver);
    TestModellerLogger.SetLastNodeGuid("82077a4f-b811-404c-832f-69cbf48b36b7");
    _EditCompanyPage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f9f21977-887e-4ae7-97f1-1fc15181f14f");
    _EditCompanyPage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("07dfa28b-2027-467d-9a35-39a62ad2444e");
    _EditCompanyPage.Click_Company_Details();
    

    TestModellerLogger.SetLastNodeGuid("17cee1e5-204f-481e-a174-8075bfe19827");
    _EditCompanyPage.Click_Contact_Details();
    

    TestModellerLogger.SetLastNodeGuid("81e00e72-a7d8-4891-b429-2c09946ecd7e");
    _EditCompanyPage.Click_General_Terms();
    

    TestModellerLogger.SetLastNodeGuid("afa92c0f-efb5-4e4a-986b-e71aa5e4e996");
    _EditCompanyPage.Click_Information();
    

    TestModellerLogger.SetLastNodeGuid("4e94af95-168c-4572-b1ef-3282c42320a1");
    _EditCompanyPage.Click_Opening_Balances();
    

    TestModellerLogger.SetLastNodeGuid("2b8e5adc-b09e-4d8d-b874-a1bbeeefa5ed");
    _EditCompanyPage.Click_Payroll_Details();
    

    TestModellerLogger.SetLastNodeGuid("78153c06-000c-4481-bc27-58d8ea0629ec");
    _EditCompanyPage.Enter_Address1("98183 Gilda Inlet, Weissnathaven, Iceland");
    

    TestModellerLogger.SetLastNodeGuid("b7939c7b-52d9-449f-8baa-233cf9c1f164");
    _EditCompanyPage.Enter_Address2("93485 Wyman Crossroad, Leannonview, Cape Verde");
    

    TestModellerLogger.SetLastNodeGuid("3d1e8775-66ab-421f-bbf5-0a8ba71ef361");
    _EditCompanyPage.Enter_Address3("47613 Kiehn Mews, Laylafort, Niger");
    

    TestModellerLogger.SetLastNodeGuid("2033554a-8a5e-43a0-a8ff-a4c3b67b33d4");
    _EditCompanyPage.Enter_Address4("432 Landen Locks, North Dangelomouth, Sierra Leone");
    

    TestModellerLogger.SetLastNodeGuid("172fbf8d-5e65-4a64-8e4b-9f36136332bb");
    _EditCompanyPage.Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo("Johnston - Nicolas");
    

    TestModellerLogger.SetLastNodeGuid("6f507c0a-eea4-45d0-8705-09e57191691f");
    _EditCompanyPage.Enter_PostCode("85696-6544");
    

    }

}