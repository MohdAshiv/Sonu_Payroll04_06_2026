package TaxCode;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7ec03348-02f5-4b89-a4f8-10c1254b84db
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1792, profileId = 102255)
public class ChangeTaxCodeTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ChangeTaxCodeTest","ChangeTaxCodeTest - Default Profile"})
    @TestModellerPath(guid = "f7a1b877-b66e-4ab6-837d-c3f522a6d535")
    public void GoToUrlAssertUrlEntersearchEmployeeClickSearchClickClickOnEmpClickEditemployeedetailsClickMan() throws InterruptedException
    {
        
    	Tax_CodePage.ChangeTaxCode _ChangeTaxCode = new Tax_CodePage.ChangeTaxCode(driver);
    TestModellerLogger.SetLastNodeGuid("cbb2138e-c95c-4e9b-896f-92af8a3179ed");
    _ChangeTaxCode.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("24fc7496-a3c8-493d-97da-1439ef1c2444");
    _ChangeTaxCode.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6cc89dfa-2fe2-411a-8405-8249e7e99634");
    _ChangeTaxCode.Enter_search_Employee("");
    

    TestModellerLogger.SetLastNodeGuid("469204e4-d88b-4863-bd07-df9b8486d9cb");
    _ChangeTaxCode.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("fc946808-7392-4d12-9e5e-eb0356bf473e");
    _ChangeTaxCode.Click_ClickOnEmp();
    

    TestModellerLogger.SetLastNodeGuid("94e6ca00-237a-42c7-a791-f7c06a17e8eb");
    _ChangeTaxCode.Click__Edit_employee_details_();
    

    TestModellerLogger.SetLastNodeGuid("012bca41-8199-4717-8f02-dfea1e4fc84f");
    _ChangeTaxCode.Click_Mandatory_Payroll_Information();
    

    TestModellerLogger.SetLastNodeGuid("d382ca6e-37b0-49dd-a6ce-a9ff43ee8146");
    _ChangeTaxCode.Enter_EnterTaxCode("");
    

    TestModellerLogger.SetLastNodeGuid("664fc361-cd47-4d54-bfb1-e9391adab7d6");
    _ChangeTaxCode.Click_checkW1M1_basis();
    

    TestModellerLogger.SetLastNodeGuid("bcdf278b-a166-40d0-b403-b9f65aea38d3");
    _ChangeTaxCode.Click_Pay_Details();
    

    TestModellerLogger.SetLastNodeGuid("3410a36d-cc1e-475c-964a-2c4656d15850");
    _ChangeTaxCode.Enter_EnterBasicSalary("");
    

    TestModellerLogger.SetLastNodeGuid("cbbc04f9-e370-4b0f-8860-294f6f7be21f");
    _ChangeTaxCode.Click__Save();
    

    }

}