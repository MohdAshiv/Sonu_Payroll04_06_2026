package tests;

import reports.TestNGListener;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/10e0265f-63f7-40a6-a93c-d27affd433f7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1300, profileId = 101172)
public class NomismaStartDate_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"NomismaStartDate","NomismaStartDate - Default Profile"})
    @TestModellerPath(guid = "d1d68ec9-a570-4faf-acd0-951de98711c0")
    public void GoToUrlAssertUrlClickClickPayrollSettingsPositiveEnterEnterNomismaStartDateClickClickSaveClick1() throws Exception
    {
        
        pages.NomismaStartDate _NomismaStartDate = new pages.NomismaStartDate(driver);
    TestModellerLogger.SetLastNodeGuid("de2e9898-2818-43ee-be32-0fb231264c1b");
    _NomismaStartDate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6ccba08d-ca26-4c2b-9e52-8d5374221fa2");
    _NomismaStartDate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8260cb8d-03b6-4f63-a3ec-8c33a2c7a042");
    _NomismaStartDate.Click_ClickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("d183490b-a45d-45e5-a15b-0785348cfdc1");
    _NomismaStartDate.Enter_EnterNomismaStartDate("44279");
    

    TestModellerLogger.SetLastNodeGuid("70fe592e-b31e-48c7-b30d-67e83779ff08");
    _NomismaStartDate.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("4d998e5a-047f-4dbb-a937-77465d478b6b");
    _NomismaStartDate.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("cb0c1adf-bda7-4b79-aa45-e833215d44bc");
    _NomismaStartDate.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("a4b094ca-2cc8-4ff4-9d85-8d247ea84c50");
    _NomismaStartDate.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("76b506d3-8a78-4977-b624-cf31824d0cf6");
    _NomismaStartDate.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("b5ec1ec4-ae42-4cb9-9908-1de5125ad9f2");
    _NomismaStartDate.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("1ee3eade-25d8-4e2d-8202-7fd105159d1b");
    _NomismaStartDate.Click_PayrollSettings2();
    

    }

    @Test  (groups= {"NomismaStartDate","NomismaStartDate - Default Profile"})
    @TestModellerPath(guid = "2727fe51-cb5f-45e8-a3e3-4aa42a8d50ec")
    public void GoToUrlAssertUrlClickClickPayrollSettingsPositiveEnterEnterNomismaStartDateClickClickSaveClick2() throws Exception
    {
        
        pages.NomismaStartDate _NomismaStartDate = new pages.NomismaStartDate(driver);
    TestModellerLogger.SetLastNodeGuid("de2e9898-2818-43ee-be32-0fb231264c1b");
    _NomismaStartDate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6ccba08d-ca26-4c2b-9e52-8d5374221fa2");
    _NomismaStartDate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8260cb8d-03b6-4f63-a3ec-8c33a2c7a042");
    _NomismaStartDate.Click_ClickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("d183490b-a45d-45e5-a15b-0785348cfdc1");
    _NomismaStartDate.Enter_EnterNomismaStartDate("44279.498949305555");
    

    TestModellerLogger.SetLastNodeGuid("70fe592e-b31e-48c7-b30d-67e83779ff08");
    _NomismaStartDate.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("4d998e5a-047f-4dbb-a937-77465d478b6b");
    _NomismaStartDate.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("cb0c1adf-bda7-4b79-aa45-e833215d44bc");
    _NomismaStartDate.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("a4b094ca-2cc8-4ff4-9d85-8d247ea84c50");
    _NomismaStartDate.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("76b506d3-8a78-4977-b624-cf31824d0cf6");
    _NomismaStartDate.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("b5ec1ec4-ae42-4cb9-9908-1de5125ad9f2");
    _NomismaStartDate.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("1ee3eade-25d8-4e2d-8202-7fd105159d1b");
    _NomismaStartDate.Click_PayrollSettings2();
    

    }

    @Test  (groups= {"NomismaStartDate","NomismaStartDate - Default Profile"})
    @TestModellerPath(guid = "c731fcab-3ec4-4cee-8ffe-15e58a9d18b5")
    public void GoToUrlAssertUrlClickClickPayrollSettingsPositiveEnterEnterNomismaStartDateClickClickSaveClick3() throws Exception
    {
        
        pages.NomismaStartDate _NomismaStartDate = new pages.NomismaStartDate(driver);
    TestModellerLogger.SetLastNodeGuid("de2e9898-2818-43ee-be32-0fb231264c1b");
    _NomismaStartDate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6ccba08d-ca26-4c2b-9e52-8d5374221fa2");
    _NomismaStartDate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8260cb8d-03b6-4f63-a3ec-8c33a2c7a042");
    _NomismaStartDate.Click_ClickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("d183490b-a45d-45e5-a15b-0785348cfdc1");
    _NomismaStartDate.Enter_EnterNomismaStartDate("44279.498949305555");
    

    TestModellerLogger.SetLastNodeGuid("70fe592e-b31e-48c7-b30d-67e83779ff08");
    _NomismaStartDate.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("4d998e5a-047f-4dbb-a937-77465d478b6b");
    _NomismaStartDate.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("cb0c1adf-bda7-4b79-aa45-e833215d44bc");
    _NomismaStartDate.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("a4b094ca-2cc8-4ff4-9d85-8d247ea84c50");
    _NomismaStartDate.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("76b506d3-8a78-4977-b624-cf31824d0cf6");
    _NomismaStartDate.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("b5ec1ec4-ae42-4cb9-9908-1de5125ad9f2");
    _NomismaStartDate.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("1ee3eade-25d8-4e2d-8202-7fd105159d1b");
    _NomismaStartDate.Click_PayrollSettings2();
    

    }

}
