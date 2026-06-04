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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/da293935-a516-47be-8632-20825170099c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1306, profileId = 101178)
public class pswdProtectionPDF_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"pswdProtectionPDF","pswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "27a9f1fc-1ee9-476e-9edb-11e716de92bc")
    public void GoToUrlAssertUrlPositiveSelectSelectPaswdProtectionFormatClickclickSaveClickgotoPayrollDashboar1() throws InterruptedException
    {
        
        pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
    _paswProtectionPDF.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
    _paswProtectionPDF.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat("Just PDF");
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fb15ea15-0a67-4c84-b08c-163589b5cb1d");
    _paswProtectionPDF.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("eb729bbe-d0d3-47e4-906e-df965e08e35b");
    _paswProtectionPDF.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("af084283-548d-4a90-bbd6-5b53aa618444");
    _paswProtectionPDF.Select_SelectcontactOption("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("48421937-9736-470e-b3a5-95bc2c3033a0");
    _paswProtectionPDF.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("08415b29-7e2a-417b-959f-5eb9e939cca5");
    _paswProtectionPDF.Click_PayrollgeneratedMessage();
    

    }

    @Test  (groups= {"pswdProtectionPDF","pswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "7cc726be-b354-4c08-a6c5-1ee30ecce2ba")
    public void GoToUrlAssertUrlPositiveSelectSelectPaswdProtectionFormatClickclickSaveClickgotoPayrollDashboar2() throws InterruptedException
    {
        
        pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
    _paswProtectionPDF.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
    _paswProtectionPDF.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat("Just ZIP Files");
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fb15ea15-0a67-4c84-b08c-163589b5cb1d");
    _paswProtectionPDF.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("eb729bbe-d0d3-47e4-906e-df965e08e35b");
    _paswProtectionPDF.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("af084283-548d-4a90-bbd6-5b53aa618444");
    _paswProtectionPDF.Select_SelectcontactOption("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("48421937-9736-470e-b3a5-95bc2c3033a0");
    _paswProtectionPDF.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("08415b29-7e2a-417b-959f-5eb9e939cca5");
    _paswProtectionPDF.Click_PayrollgeneratedMessage();
    

    }

    @Test  (groups= {"pswdProtectionPDF","pswdProtectionPDF - Default Profile"})
    @TestModellerPath(guid = "d2221196-8613-419d-9e9f-57ef67e24db8")
    public void GoToUrlAssertUrlPositiveSelectSelectPaswdProtectionFormatClickclickSaveClickgotoPayrollDashboar3() throws InterruptedException
    {
        
        pages.paswProtectionPDF _paswProtectionPDF = new pages.paswProtectionPDF(driver);
    TestModellerLogger.SetLastNodeGuid("04281830-e8f1-48f8-a39d-323781adfa87");
    _paswProtectionPDF.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b571f32-1094-483f-ae3c-2a30aa064117");
    _paswProtectionPDF.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca14ab73-7f7d-4485-afff-c2a7aa71b576");
    _paswProtectionPDF.Select_SelectPaswdProtectionFormat("No Protection");
    

    TestModellerLogger.SetLastNodeGuid("7d95dae3-a976-4f95-9e66-d9d40fa8b1ba");
    _paswProtectionPDF.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("fb15ea15-0a67-4c84-b08c-163589b5cb1d");
    _paswProtectionPDF.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("eb729bbe-d0d3-47e4-906e-df965e08e35b");
    _paswProtectionPDF.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("af084283-548d-4a90-bbd6-5b53aa618444");
    _paswProtectionPDF.Select_SelectcontactOption("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("48421937-9736-470e-b3a5-95bc2c3033a0");
    _paswProtectionPDF.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("08415b29-7e2a-417b-959f-5eb9e939cca5");
    _paswProtectionPDF.Click_PayrollgeneratedMessage();
    

    }

}
