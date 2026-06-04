package tests1;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/04e3c7ea-0ff8-4ef9-b39a-93c784d18ec6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1382, profileId = 101250)
public class P11D_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"P11D","P11D - Default Profile"})
    @TestModellerPath(guid = "3aad21d5-46a9-4075-b479-82031f6e29ec")
    public void GoToUrlAssertUrlClickYesClickSaveClickPayrollDashboardClickMrsumitjhaClickEditemployeedetails() throws Exception
    {
        
        pages1.P11D _P11D = new pages1.P11D(driver);
    TestModellerLogger.SetLastNodeGuid("effebf3f-fb18-4aa1-8c06-0c10c7e2505f");
    _P11D.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2505aac8-9ba5-4685-b033-fe93ddd0ce21");
    _P11D.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec1306eb-a776-46ce-a975-bf10a14f196e");
    _P11D.Click_Yes();
    

    TestModellerLogger.SetLastNodeGuid("710409c1-89ba-458a-8fc8-4c6585991137");
    _P11D.Click__Save();
    

    TestModellerLogger.SetLastNodeGuid("29ac446c-aa3d-43cc-bc22-773684618961");
    _P11D.Click__Payroll_Dashboard_();
    

    TestModellerLogger.SetLastNodeGuid("c1914846-cf2b-4575-a560-cfc56ca7344a");
    _P11D.Click_Mr_sumit_jha();
    

    TestModellerLogger.SetLastNodeGuid("aee7c74f-4368-4c9f-9076-173dc2f9b03e");
    _P11D.Click__Edit_employee_details_();
    

    TestModellerLogger.SetLastNodeGuid("c7c04c15-64b1-451e-8c4e-59c693344fcb");
    _P11D.Click_Expenses_and_Benefits();
    

    TestModellerLogger.SetLastNodeGuid("e42c7dc7-d23c-4c78-a460-91cbe8e727ef");
    _P11D.Click__Filing_Management_();
    

    TestModellerLogger.SetLastNodeGuid("035be61e-68fd-4e54-8c5a-c6b62cde0447");
    _P11D.Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency("P11D");
    

    }

}
