package frequencytest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/00a2721b-503d-4bc0-aa8f-329fe66a85b5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1446, profileId = 101330)
public class Empfreqchange_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Empfreqchange","Empfreqchange - Default Profile"})
    @TestModellerPath(guid = "ee86e1ac-9ef2-435b-adfe-2d19a4f1e094")
    public void GoToUrlAssertUrlClickgetgrosssalaryClickclickEditemployeedetailsClickgotoMandatoryPayrollInform1() throws InterruptedException
    {
        
    	frequency.Empfrqchange _Empfrqchange = new frequency.Empfrqchange(driver);
    TestModellerLogger.SetLastNodeGuid("b5881c0d-a1ae-4bb8-975a-5a3a8b98b819");
    _Empfrqchange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("557b84c8-cbd7-4fe4-91a7-325695c18947");
    _Empfrqchange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94e09c67-2b22-46e9-8b2c-9311f9e5855d");
    _Empfrqchange.Click_getgrosssalary();
    

    TestModellerLogger.SetLastNodeGuid("cec2b39a-880b-4090-9dac-068b5c6a8a54");
    _Empfrqchange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("cc5eb559-bd12-41be-9607-8b1d69d8dbb4");
    _Empfrqchange.Click_gotoMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("bb9bc4ed-d666-4b37-b0d5-5de5405f1a19");
    _Empfrqchange.Select_selectPayrollFrequencyCode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("cbe82168-243d-456e-abcc-ddaad302d58a");
    _Empfrqchange.Click_gotoPayDetails();
    

    TestModellerLogger.SetLastNodeGuid("85182243-8a94-449a-8981-6c587555e9dc");
    _Empfrqchange.Enter_EnterAnnualSalary("");
    

    TestModellerLogger.SetLastNodeGuid("676137ff-d9b3-4a7d-99be-f9d018b25598");
    _Empfrqchange.Click_clickSave();
    

    }

    @Test  (groups= {"Empfreqchange","Empfreqchange - Default Profile"})
    @TestModellerPath(guid = "26d233d4-0775-41b5-86f8-225c87aed017")
    public void GoToUrlAssertUrlClickgetgrosssalaryClickclickEditemployeedetailsClickgotoMandatoryPayrollInform2() throws InterruptedException
    {
        
    	frequency.Empfrqchange _Empfrqchange = new frequency.Empfrqchange(driver);
    TestModellerLogger.SetLastNodeGuid("b5881c0d-a1ae-4bb8-975a-5a3a8b98b819");
    _Empfrqchange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("557b84c8-cbd7-4fe4-91a7-325695c18947");
    _Empfrqchange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94e09c67-2b22-46e9-8b2c-9311f9e5855d");
    _Empfrqchange.Click_getgrosssalary();
    

    TestModellerLogger.SetLastNodeGuid("cec2b39a-880b-4090-9dac-068b5c6a8a54");
    _Empfrqchange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("cc5eb559-bd12-41be-9607-8b1d69d8dbb4");
    _Empfrqchange.Click_gotoMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("bb9bc4ed-d666-4b37-b0d5-5de5405f1a19");
    _Empfrqchange.Select_selectPayrollFrequencyCode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("cbe82168-243d-456e-abcc-ddaad302d58a");
    _Empfrqchange.Click_gotoPayDetails();
    

    TestModellerLogger.SetLastNodeGuid("85182243-8a94-449a-8981-6c587555e9dc");
    _Empfrqchange.Enter_EnterAnnualSalary("");
    

    TestModellerLogger.SetLastNodeGuid("676137ff-d9b3-4a7d-99be-f9d018b25598");
    _Empfrqchange.Click_clickSave();
    

    }

    @Test  (groups= {"Empfreqchange","Empfreqchange - Default Profile"})
    @TestModellerPath(guid = "cec45f49-ce99-45bf-91b2-65e774365feb")
    public void GoToUrlAssertUrlClickgetgrosssalaryClickclickEditemployeedetailsClickgotoMandatoryPayrollInform3() throws InterruptedException
    {
        
    	frequency.Empfrqchange _Empfrqchange = new frequency.Empfrqchange(driver);
    TestModellerLogger.SetLastNodeGuid("b5881c0d-a1ae-4bb8-975a-5a3a8b98b819");
    _Empfrqchange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("557b84c8-cbd7-4fe4-91a7-325695c18947");
    _Empfrqchange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94e09c67-2b22-46e9-8b2c-9311f9e5855d");
    _Empfrqchange.Click_getgrosssalary();
    

    TestModellerLogger.SetLastNodeGuid("cec2b39a-880b-4090-9dac-068b5c6a8a54");
    _Empfrqchange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("cc5eb559-bd12-41be-9607-8b1d69d8dbb4");
    _Empfrqchange.Click_gotoMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("bb9bc4ed-d666-4b37-b0d5-5de5405f1a19");
    _Empfrqchange.Select_selectPayrollFrequencyCode("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("cbe82168-243d-456e-abcc-ddaad302d58a");
    _Empfrqchange.Click_gotoPayDetails();
    

    TestModellerLogger.SetLastNodeGuid("85182243-8a94-449a-8981-6c587555e9dc");
    _Empfrqchange.Enter_EnterAnnualSalary("");
    

    TestModellerLogger.SetLastNodeGuid("676137ff-d9b3-4a7d-99be-f9d018b25598");
    _Empfrqchange.Click_clickSave();
    

    }

    @Test  (groups= {"Empfreqchange","Empfreqchange - Default Profile"})
    @TestModellerPath(guid = "70bd2eda-a696-4cb0-abac-ead63061f73e")
    public void GoToUrlAssertUrlClickgetgrosssalaryClickclickEditemployeedetailsClickgotoMandatoryPayrollInform4() throws InterruptedException
    {
        
    	frequency.Empfrqchange _Empfrqchange = new frequency.Empfrqchange(driver);
    TestModellerLogger.SetLastNodeGuid("b5881c0d-a1ae-4bb8-975a-5a3a8b98b819");
    _Empfrqchange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("557b84c8-cbd7-4fe4-91a7-325695c18947");
    _Empfrqchange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94e09c67-2b22-46e9-8b2c-9311f9e5855d");
    _Empfrqchange.Click_getgrosssalary();
    

    TestModellerLogger.SetLastNodeGuid("cec2b39a-880b-4090-9dac-068b5c6a8a54");
    _Empfrqchange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("cc5eb559-bd12-41be-9607-8b1d69d8dbb4");
    _Empfrqchange.Click_gotoMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("bb9bc4ed-d666-4b37-b0d5-5de5405f1a19");
    _Empfrqchange.Select_selectPayrollFrequencyCode("Fourweekly");
    

    TestModellerLogger.SetLastNodeGuid("cbe82168-243d-456e-abcc-ddaad302d58a");
    _Empfrqchange.Click_gotoPayDetails();
    

    TestModellerLogger.SetLastNodeGuid("85182243-8a94-449a-8981-6c587555e9dc");
    _Empfrqchange.Enter_EnterAnnualSalary("");
    

    TestModellerLogger.SetLastNodeGuid("676137ff-d9b3-4a7d-99be-f9d018b25598");
    _Empfrqchange.Click_clickSave();
    

    }

    @Test  (groups= {"Empfreqchange","Empfreqchange - Default Profile"})
    @TestModellerPath(guid = "dd5dad33-588a-4300-aa23-c39dae47c549")
    public void GoToUrlAssertUrlClickgetgrosssalaryClickclickEditemployeedetailsClickgotoMandatoryPayrollInform5() throws InterruptedException
    {
        
    	frequency.Empfrqchange _Empfrqchange = new frequency.Empfrqchange(driver);
    TestModellerLogger.SetLastNodeGuid("b5881c0d-a1ae-4bb8-975a-5a3a8b98b819");
    _Empfrqchange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("557b84c8-cbd7-4fe4-91a7-325695c18947");
    _Empfrqchange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94e09c67-2b22-46e9-8b2c-9311f9e5855d");
    _Empfrqchange.Click_getgrosssalary();
    

    TestModellerLogger.SetLastNodeGuid("cec2b39a-880b-4090-9dac-068b5c6a8a54");
    _Empfrqchange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("cc5eb559-bd12-41be-9607-8b1d69d8dbb4");
    _Empfrqchange.Click_gotoMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("bb9bc4ed-d666-4b37-b0d5-5de5405f1a19");
    _Empfrqchange.Select_selectPayrollFrequencyCode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("cbe82168-243d-456e-abcc-ddaad302d58a");
    _Empfrqchange.Click_gotoPayDetails();
    

    TestModellerLogger.SetLastNodeGuid("85182243-8a94-449a-8981-6c587555e9dc");
    _Empfrqchange.Enter_EnterAnnualSalary("");
    

    TestModellerLogger.SetLastNodeGuid("676137ff-d9b3-4a7d-99be-f9d018b25598");
    _Empfrqchange.Click_clickSave();
    

    }

}
