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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/559288d4-898b-48a6-b81f-617c3ab5fb6f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1375, profileId = 101244)
public class clickEmployee_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"clickEmployee","clickEmployee - Default Profile"})
    @TestModellerPath(guid = "61af0ca1-c449-495a-a513-6a39defc9d1d")
    public void GoToUrlAssertUrlClickClickEmployee()
    {
        
        pages.frequency.clickEmployee _clickEmployee = new pages.frequency.clickEmployee(driver);
    TestModellerLogger.SetLastNodeGuid("d4e35378-7c58-4e38-8ab2-586400d0af63");
    _clickEmployee.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eccde45d-6b2c-46c0-81a4-a41aee8baca1");
    _clickEmployee.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8cb1de3-c970-4e70-8812-cce6ce37b2e1");
    _clickEmployee.Click_ClickEmployee();
    

    }

}
