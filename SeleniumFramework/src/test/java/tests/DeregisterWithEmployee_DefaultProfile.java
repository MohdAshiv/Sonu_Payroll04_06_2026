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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a832d127-072b-4e4a-bae4-5effb50f8d9b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1318, profileId = 101187)
public class DeregisterWithEmployee_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"DeregisterWithEmployee","DeregisterWithEmployee - Default Profile"})
    @TestModellerPath(guid = "28a51e78-2f4c-48a2-8836-a04eefcb0eae")
    public void GoToUrlAssertUrlPositiveSelectStatusSearch1ClickSelectCheckBoxPositiveSelectSubmitReasonClickS() throws InterruptedException
    {
        
        pages.DeregisterwithEmployee _DeregisterwithEmployee = new pages.DeregisterwithEmployee(driver);
    TestModellerLogger.SetLastNodeGuid("e7e7b13e-cad5-4ca5-8a0c-da98f1de055e");
    _DeregisterwithEmployee.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d6423e20-09c0-476a-9514-bfb648ed0f57");
    _DeregisterwithEmployee.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("30c9a3c5-7da0-4e63-9f1b-c116c58016df");
    _DeregisterwithEmployee.Select_StatusSearch1("Pending");
    

    TestModellerLogger.SetLastNodeGuid("a3524d39-3d26-45a6-bc91-6b5104c4ce02");
    _DeregisterwithEmployee.Click_SelectCheckBox();
    

    TestModellerLogger.SetLastNodeGuid("8122f2d7-794b-451a-8976-64e237769729");
    _DeregisterwithEmployee.Select_SubmitReason("Reasonable excuse");
    

    TestModellerLogger.SetLastNodeGuid("11a48221-7314-4ea1-8bea-d3f16636ad0b");
    _DeregisterwithEmployee.Click_SubmitToHMRC();
    

    TestModellerLogger.SetLastNodeGuid("78e38328-5850-48a5-b344-62e690b4223c");
    _DeregisterwithEmployee.Click_PayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("a4dc0a5c-2ac0-4f93-845f-4297ce0c9817");
    _DeregisterwithEmployee.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("8c9eed08-021a-4fe7-819f-03d548b3a2ac");
    _DeregisterwithEmployee.Click_RunPayroll2();
    

    }

}
