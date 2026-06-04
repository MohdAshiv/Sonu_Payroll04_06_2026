package test.frequency;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7fe59c80-8ce8-4d99-bbbb-cac6624622fc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1374, profileId = 101243)
public class EmployeeFrequencyChange_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"EmployeeFrequencyChange","EmployeeFrequencyChange - Default Profile"})
    @TestModellerPath(guid = "dc568007-5175-4c5f-b670-b3d8b8451e25")
    public void GoToUrlAssertUrlClickclickEditemployeedetailsClickclickMandatoryPayrollInformationPositiveSelec1()
    {
        
        pages.frequency.EmployeeFrequencyChange _EmployeeFrequencyChange = new pages.frequency.EmployeeFrequencyChange(driver);
    TestModellerLogger.SetLastNodeGuid("04438a4e-7708-422c-a2c8-bbb7f23aef35");
    _EmployeeFrequencyChange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a8848e7e-063c-4ddf-9772-118a1eb5e91c");
    _EmployeeFrequencyChange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a28e2ed-a5b9-4375-9590-7476b4b9aa9b");
    _EmployeeFrequencyChange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("6e6bda8b-bf13-471a-a06f-4618162e3b27");
    _EmployeeFrequencyChange.Click_clickMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("165c34a1-4d80-4ce1-a66a-8887a168e1d4");
    _EmployeeFrequencyChange.Select_SelectPayrollFrequency("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("658643f2-3c27-4b25-b5dc-d730c17ee4f0");
    _EmployeeFrequencyChange.Click_clickSave();
    

    }

    @Test  (groups= {"EmployeeFrequencyChange","EmployeeFrequencyChange - Default Profile"})
    @TestModellerPath(guid = "1e7bcbdb-9117-4125-b420-956f0c72b4c5")
    public void GoToUrlAssertUrlClickclickEditemployeedetailsClickclickMandatoryPayrollInformationPositiveSelec2()
    {
        
    	pages.frequency.EmployeeFrequencyChange _EmployeeFrequencyChange = new pages.frequency.EmployeeFrequencyChange(driver);
    TestModellerLogger.SetLastNodeGuid("04438a4e-7708-422c-a2c8-bbb7f23aef35");
    _EmployeeFrequencyChange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a8848e7e-063c-4ddf-9772-118a1eb5e91c");
    _EmployeeFrequencyChange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a28e2ed-a5b9-4375-9590-7476b4b9aa9b");
    _EmployeeFrequencyChange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("6e6bda8b-bf13-471a-a06f-4618162e3b27");
    _EmployeeFrequencyChange.Click_clickMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("165c34a1-4d80-4ce1-a66a-8887a168e1d4");
    _EmployeeFrequencyChange.Select_SelectPayrollFrequency("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("658643f2-3c27-4b25-b5dc-d730c17ee4f0");
    _EmployeeFrequencyChange.Click_clickSave();
    

    }

    @Test  (groups= {"EmployeeFrequencyChange","EmployeeFrequencyChange - Default Profile"})
    @TestModellerPath(guid = "2b776ec8-28c2-4ab2-aef9-8570d3b18aa0")
    public void GoToUrlAssertUrlClickclickEditemployeedetailsClickclickMandatoryPayrollInformationPositiveSelec3()
    {
        
    	pages.frequency.EmployeeFrequencyChange _EmployeeFrequencyChange = new pages.frequency.EmployeeFrequencyChange(driver);
    TestModellerLogger.SetLastNodeGuid("04438a4e-7708-422c-a2c8-bbb7f23aef35");
    _EmployeeFrequencyChange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a8848e7e-063c-4ddf-9772-118a1eb5e91c");
    _EmployeeFrequencyChange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a28e2ed-a5b9-4375-9590-7476b4b9aa9b");
    _EmployeeFrequencyChange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("6e6bda8b-bf13-471a-a06f-4618162e3b27");
    _EmployeeFrequencyChange.Click_clickMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("165c34a1-4d80-4ce1-a66a-8887a168e1d4");
    _EmployeeFrequencyChange.Select_SelectPayrollFrequency("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("658643f2-3c27-4b25-b5dc-d730c17ee4f0");
    _EmployeeFrequencyChange.Click_clickSave();
    

    }

    @Test  (groups= {"EmployeeFrequencyChange","EmployeeFrequencyChange - Default Profile"})
    @TestModellerPath(guid = "2e235dbd-3725-4cf8-a64d-fb9e2d462f4e")
    public void GoToUrlAssertUrlClickclickEditemployeedetailsClickclickMandatoryPayrollInformationPositiveSelec4()
    {
        
    	pages.frequency.EmployeeFrequencyChange _EmployeeFrequencyChange = new pages.frequency.EmployeeFrequencyChange(driver);
    TestModellerLogger.SetLastNodeGuid("04438a4e-7708-422c-a2c8-bbb7f23aef35");
    _EmployeeFrequencyChange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a8848e7e-063c-4ddf-9772-118a1eb5e91c");
    _EmployeeFrequencyChange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a28e2ed-a5b9-4375-9590-7476b4b9aa9b");
    _EmployeeFrequencyChange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("6e6bda8b-bf13-471a-a06f-4618162e3b27");
    _EmployeeFrequencyChange.Click_clickMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("165c34a1-4d80-4ce1-a66a-8887a168e1d4");
    _EmployeeFrequencyChange.Select_SelectPayrollFrequency("Fourweekly");
    

    TestModellerLogger.SetLastNodeGuid("658643f2-3c27-4b25-b5dc-d730c17ee4f0");
    _EmployeeFrequencyChange.Click_clickSave();
    

    }

    @Test  (groups= {"EmployeeFrequencyChange","EmployeeFrequencyChange - Default Profile"})
    @TestModellerPath(guid = "c3371025-2fa1-4ac1-9818-7690cde82218")
    public void GoToUrlAssertUrlClickclickEditemployeedetailsClickclickMandatoryPayrollInformationPositiveSelec5()
    {
        
    	pages.frequency.EmployeeFrequencyChange _EmployeeFrequencyChange = new pages.frequency.EmployeeFrequencyChange(driver);
    TestModellerLogger.SetLastNodeGuid("04438a4e-7708-422c-a2c8-bbb7f23aef35");
    _EmployeeFrequencyChange.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a8848e7e-063c-4ddf-9772-118a1eb5e91c");
    _EmployeeFrequencyChange.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a28e2ed-a5b9-4375-9590-7476b4b9aa9b");
    _EmployeeFrequencyChange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("6e6bda8b-bf13-471a-a06f-4618162e3b27");
    _EmployeeFrequencyChange.Click_clickMandatoryPayrollInformation();
    

    TestModellerLogger.SetLastNodeGuid("165c34a1-4d80-4ce1-a66a-8887a168e1d4");
    _EmployeeFrequencyChange.Select_SelectPayrollFrequency("Annually");
    

    TestModellerLogger.SetLastNodeGuid("658643f2-3c27-4b25-b5dc-d730c17ee4f0");
    _EmployeeFrequencyChange.Click_clickSave();
    

    }

}
