package _1939_tests;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/01347461-62bf-49a3-ab8c-38bd6768fa26
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1514, profileId = 101475)
public class EnableAutomaticPayroll_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Enable_Automatic_Payroll","Enable_Automatic_Payroll - Default Profile"})
    @TestModellerPath(guid = "f1a3cf70-4ecf-4b38-ac90-80632ff09cd9")
    public void GoToUrlAssertUrlClickClickEnableAutorunClickClickContinuePositiveSelectSelectEmailModeClickCli() throws InterruptedException
    {
        
    	_1939_page.Enable_Automatic_Payroll _Enable_Automatic_Payroll = new _1939_page.Enable_Automatic_Payroll(driver);
    TestModellerLogger.SetLastNodeGuid("06d423d4-179c-4160-912d-7c625866dbc8");
    _Enable_Automatic_Payroll.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb14f435-89d1-4b50-91c2-b1ef27949164");
    _Enable_Automatic_Payroll.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("87e761a2-e708-41be-9ac7-300af5e89105");
    _Enable_Automatic_Payroll.Click_ClickEnableAutorun();
    

    TestModellerLogger.SetLastNodeGuid("9dd05302-4394-46c5-b3e5-7db65c3593cd");
    _Enable_Automatic_Payroll.Click_ClickContinue();
    

    TestModellerLogger.SetLastNodeGuid("b0709c62-6d43-411b-afb5-8444d1c06800");
    _Enable_Automatic_Payroll.Select_SelectEmailMode("Email Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("98493ed0-a6be-479e-8013-48656b5a7faa");
    _Enable_Automatic_Payroll.Click_ClickContinue();
    

    TestModellerLogger.SetLastNodeGuid("a7a1a484-f86e-436c-93b4-06be15d9cd29");
    _Enable_Automatic_Payroll.Click_ClickEnableAutorun();
    

    }

}
