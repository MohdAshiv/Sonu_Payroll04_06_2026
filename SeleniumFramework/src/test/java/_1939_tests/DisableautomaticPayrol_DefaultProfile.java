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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6a4438cb-7907-4c1e-9320-72925bfd4821
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1513, profileId = 101466)
public class DisableautomaticPayrol_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Disable_automatic_Payrol","Disable_automatic_Payrol - Default Profile"})
    @TestModellerPath(guid = "edc38818-dfc3-470e-a883-9bd6da260ef5")
    public void GoToUrlAssertUrlClickClickEmailSettingsClickClickDisable() throws InterruptedException
    {
        
    	_1939_page.Disable_automatic_Payroll _Disable_automatic_Payroll = new _1939_page.Disable_automatic_Payroll(driver);
    TestModellerLogger.SetLastNodeGuid("9d1a2560-1f39-40f7-921f-6bf473bc1f9c");
    _Disable_automatic_Payroll.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("792f7f48-62bf-4991-affb-c48e4245656c");
    _Disable_automatic_Payroll.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4d741436-f87a-48e7-b0bf-91a02903066d");
    _Disable_automatic_Payroll.Click_ClickEmailSettings();
    

    TestModellerLogger.SetLastNodeGuid("d064a208-6c59-4c04-9a49-34f208d851e8");
    _Disable_automatic_Payroll.Click_ClickDisable();
    

    }

}
