package _1853Test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3ce1226f-1706-4277-8c5e-2e8ec956293f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1837, profileId = 102345)
public class EmployeeDasboardTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"EmployeeDasboardTest","EmployeeDasboardTest - Default Profile"})
    @TestModellerPath(guid = "1f605b65-de58-4ef8-9193-1e8bd836c32c")
    public void GoToUrlAssertUrlClickEmployerViewEntersearchimployeeClickSearchClickClickOnEmployeeClickEmplo()
    {
        
        pages.EmployeeDasboard _EmployeeDasboard = new pages.EmployeeDasboard(driver);
    TestModellerLogger.SetLastNodeGuid("35ddc8ba-c892-4956-ab97-3475e0fee66b");
    _EmployeeDasboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a9b207b5-eb0a-487a-b8f5-a0bf362c7cbc");
    _EmployeeDasboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da537b6-848a-49d4-b76d-d299bfdf2cbd");
    _EmployeeDasboard.Click_Employer_View();
    

    TestModellerLogger.SetLastNodeGuid("4c605f32-8701-4019-ac26-5917ffe5e080");
    _EmployeeDasboard.Enter_search_imployee("");
    

    TestModellerLogger.SetLastNodeGuid("4703a6ed-27cf-4287-a0b8-90941fc7c5de");
    _EmployeeDasboard.Click__Search();
    

    TestModellerLogger.SetLastNodeGuid("d99dfe27-c5f8-458a-ba06-1330178a3215");
    _EmployeeDasboard.Click_ClickOnEmployee();
    

    TestModellerLogger.SetLastNodeGuid("04689667-af12-4920-8dfe-ec7c614a40c2");
    _EmployeeDasboard.Click__Employee_Dashboard_();
    

    }

}