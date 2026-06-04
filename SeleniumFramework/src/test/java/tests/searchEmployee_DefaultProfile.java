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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a74a5d97-16d8-4437-85f0-ecbad3e8be20
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1335, profileId = 101202)
public class searchEmployee_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"searchEmployee","searchEmployee - Default Profile"})
    @TestModellerPath(guid = "3b86d892-daf8-412e-8ca3-91a3c0612d49")
    public void GoToUrlAssertUrlClickclickEmployeeListPositiveSelectSelectEmployeeStatusPositiveEnterEnterEmplo() throws InterruptedException
    {
        
        pages.searchEmployee _searchEmployee = new pages.searchEmployee(driver);
    TestModellerLogger.SetLastNodeGuid("4f81d30b-0724-4ab2-8f06-208700c46efe");
    _searchEmployee.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("165612bc-b7d0-48d4-90c4-19f9bc3c5c55");
    _searchEmployee.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0765b1b3-7474-4ac4-a499-d8c5d0c1fc27");
    _searchEmployee.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("5845ba85-5da8-4991-9c52-62e78a4773bd");
    _searchEmployee.Select_SelectEmployeeStatus("All Employees");
    

    TestModellerLogger.SetLastNodeGuid("bcc5fab0-d250-4bf8-bf40-858f0fca1440");
    _searchEmployee.Enter_EnterEmployeeName("in");
    

    TestModellerLogger.SetLastNodeGuid("2cd99def-f788-4a9e-890e-12745b4065e2");
    _searchEmployee.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("03323129-f2e7-499a-940b-e6e8f7820173");
    _searchEmployee.Click_clickonEmpName();
    

    }

}
