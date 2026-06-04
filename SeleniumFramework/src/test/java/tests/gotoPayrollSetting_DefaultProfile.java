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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ec7a923f-5493-4d51-9de4-ae261ef6dd9f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1331, profileId = 101199)
public class gotoPayrollSetting_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"gotoPayrollSetting","gotoPayrollSetting - Default Profile"})
    @TestModellerPath(guid = "6619d767-af08-4d84-8d49-a6cbfc84a017")
    public void GoToUrlAssertUrlClickclickPayrollClickclickEditCompanyClickgotoPayrollDetailsClickPayrollSetti()
    {
        
        pages.gotoPayrollSetting _gotoPayrollSetting = new pages.gotoPayrollSetting(driver);
    TestModellerLogger.SetLastNodeGuid("b333bb86-e176-4761-b72c-e02790318565");
    _gotoPayrollSetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9dacefe-86b3-4337-b563-f20d557a63c0");
    _gotoPayrollSetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0fb63b7-8522-4daf-b671-0e1712be8115");
    _gotoPayrollSetting.Click_clickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("a3342d2d-f649-4841-b422-99c823ece078");
    _gotoPayrollSetting.Click_clickEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("fa4ac16e-6c4f-4b4c-9a57-ded7110bf2b6");
    _gotoPayrollSetting.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("d08e4a03-9e9b-46f6-aee7-a2a736a55c08");
    _gotoPayrollSetting.Click_PayrollSettings();
    

    }

}
