package Nidhi;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5c312a85-9fbf-487e-8c32-c57b4a6a795e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1788, profileId = 102249)
public class LedgerBookTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"LedgerBookTest","LedgerBookTest - Default Profile"})
    @TestModellerPath(guid = "3735053f-4d36-48d5-9b1c-06c9c9db0d91")
    public void GoToUrlAssertUrlClickAdvisorToolsClickReportsClickGeneralLedgerNominalLedgerPositiveSelectsele() throws InterruptedException
    {
        
    	Nidhi.LedgerBook _LedgerBook = new Nidhi.LedgerBook(driver);
    TestModellerLogger.SetLastNodeGuid("837f2b51-077e-43fa-9de2-63f86a8ae868");
    _LedgerBook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a0d6a66f-ef72-4eea-a8c4-02adc7d448d9");
    _LedgerBook.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("21397459-6e53-4796-a9a5-9691db39f7d5");
    _LedgerBook.Click__Advisor_Tools_();
    

    TestModellerLogger.SetLastNodeGuid("3199a274-c6de-4619-af7f-691a64885176");
    _LedgerBook.Click_Reports();
    

    TestModellerLogger.SetLastNodeGuid("68ec6ed9-305b-4b20-8d38-034d94f232ab");
    _LedgerBook.Click_General_LedgerNominal_Ledger();
    

    TestModellerLogger.SetLastNodeGuid("5286ab3d-1593-490e-bb10-b5548a8892dd");
    _LedgerBook.Select_selectAccountType();
    

    TestModellerLogger.SetLastNodeGuid("f88396af-703b-4e82-b029-d6cf7d000151");
    _LedgerBook.Click_Account();
    

    TestModellerLogger.SetLastNodeGuid("e5d846b3-25c3-4563-8101-86b561846c8e");
    _LedgerBook.Select_selectDateRange("This Month");
    

    }


}