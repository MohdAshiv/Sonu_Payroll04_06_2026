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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cd219cb1-21f1-4e09-9745-816205da8c60
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1278, profileId = 101151)
public class deregistertest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"deregistertest","deregistertest - Default Profile"})
    @TestModellerPath(guid = "413015d1-738e-47f1-960d-68b96b6b26b5")
    public void GoToUrlAssertUrlClickClickRunPayroll1ClickClickRunPayroll2ClickClickEditCompanyClickgotoPayrol1() throws Exception
    {
        
        pages.deregistercompany _deregistercompany = new pages.deregistercompany(driver);
    TestModellerLogger.SetLastNodeGuid("92e36840-8038-4058-b69e-dcc782f97d62");
    _deregistercompany.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f210d055-c68b-4639-9f56-2e37685b74e2");
    _deregistercompany.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c5a03d8-2b44-4009-8013-157adee9170c");
    _deregistercompany.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("b7945180-59df-470a-9376-78c9b86ce68a");
    _deregistercompany.Click_ClickRunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("576ee54e-7555-456b-ac17-75ab51aedf4f");
    _deregistercompany.Click_ClickEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("567c58ae-55ad-448f-8a09-ef1acf55aa06");
    _deregistercompany.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("80f7bc94-218f-4326-a31a-dfa32c9c94db");
    _deregistercompany.Click_selectYes();
    

    TestModellerLogger.SetLastNodeGuid("5b939b97-177b-46c4-8a72-05a1c721dc67");
    _deregistercompany.Enter_EnterDeRegistrationDate("44276");
    

    TestModellerLogger.SetLastNodeGuid("112659ad-e4a5-4eb5-864b-261bdd1cdbfe");
    _deregistercompany.Click_ClickSave();
    

    }

    @Test  (groups= {"deregistertest","deregistertest - Default Profile"})
    @TestModellerPath(guid = "1b10eeb9-f16e-4dbf-becd-ac17839aa2b5")
    public void GoToUrlAssertUrlClickClickRunPayroll1ClickClickRunPayroll2ClickClickEditCompanyClickgotoPayrol2() throws Exception
    {
        
        pages.deregistercompany _deregistercompany = new pages.deregistercompany(driver);
    TestModellerLogger.SetLastNodeGuid("92e36840-8038-4058-b69e-dcc782f97d62");
    _deregistercompany.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f210d055-c68b-4639-9f56-2e37685b74e2");
    _deregistercompany.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c5a03d8-2b44-4009-8013-157adee9170c");
    _deregistercompany.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("b7945180-59df-470a-9376-78c9b86ce68a");
    _deregistercompany.Click_ClickRunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("576ee54e-7555-456b-ac17-75ab51aedf4f");
    _deregistercompany.Click_ClickEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("567c58ae-55ad-448f-8a09-ef1acf55aa06");
    _deregistercompany.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("80f7bc94-218f-4326-a31a-dfa32c9c94db");
    _deregistercompany.Click_selectYes();
    

    TestModellerLogger.SetLastNodeGuid("5b939b97-177b-46c4-8a72-05a1c721dc67");
    _deregistercompany.Enter_EnterDeRegistrationDate("44276.259595393516");
    

    TestModellerLogger.SetLastNodeGuid("112659ad-e4a5-4eb5-864b-261bdd1cdbfe");
    _deregistercompany.Click_ClickSave();
    

    }

}
