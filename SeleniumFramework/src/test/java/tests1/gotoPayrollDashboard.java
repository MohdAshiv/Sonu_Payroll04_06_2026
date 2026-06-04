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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/86339258-5b9e-4747-8324-17c4b4e445d8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1279, profileId = 101155)
public class gotoPayrollDashboard extends TestBase
{
    

    
    @Test  (groups= {"verifyClosePayeErrorMessage","verifyClosePayeErrorMessage - Default Profile"})
    @TestModellerPath(guid = "70646550-0940-4c7b-9811-b3da0ef92e8e")
    public void GoToUrlAssertUrlClickClickPayrollClickgotoEditCompanyClickgotoPayrollDetailsClickClosePAYEtoYe1() throws Exception
    {
        
        pages1.gotoPayrollDashboard _verifyClosePayeErrorMessage = new pages1.gotoPayrollDashboard(driver);
    TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
    _verifyClosePayeErrorMessage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
    _verifyClosePayeErrorMessage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
    _verifyClosePayeErrorMessage.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
    _verifyClosePayeErrorMessage.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
    _verifyClosePayeErrorMessage.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("a0b9860a-6157-407f-9bcb-0e930a194135");
    _verifyClosePayeErrorMessage.Click_ClosePAYEtoYes();
    

    TestModellerLogger.SetLastNodeGuid("98af6d89-396c-4089-88e3-298d59884c8f");
    _verifyClosePayeErrorMessage.Enter_EnterDeRegistrationDate("44276");
    

    TestModellerLogger.SetLastNodeGuid("b8b1d12f-ab94-4b0b-84e8-d3e13da018e4");
    _verifyClosePayeErrorMessage.Click_ErrorMessage();
    

    }

    @Test  (groups= {"verifyClosePayeErrorMessage","verifyClosePayeErrorMessage - Default Profile"})
    @TestModellerPath(guid = "37db0cc6-25de-4567-b3e7-8e009a956a2f")
    public void GoToUrlAssertUrlClickClickPayrollClickgotoEditCompanyClickgotoPayrollDetailsClickClosePAYEtoYe2() throws Exception
    {
        
        pages.verifyClosePayeErrorMessage _verifyClosePayeErrorMessage = new pages.verifyClosePayeErrorMessage(driver);
    TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
    _verifyClosePayeErrorMessage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
    _verifyClosePayeErrorMessage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
    _verifyClosePayeErrorMessage.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
    _verifyClosePayeErrorMessage.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
    _verifyClosePayeErrorMessage.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("a0b9860a-6157-407f-9bcb-0e930a194135");
    _verifyClosePayeErrorMessage.Click_ClosePAYEtoYes();
    

    TestModellerLogger.SetLastNodeGuid("98af6d89-396c-4089-88e3-298d59884c8f");
    _verifyClosePayeErrorMessage.Enter_EnterDeRegistrationDate("44276.289690381942");
    

    TestModellerLogger.SetLastNodeGuid("b8b1d12f-ab94-4b0b-84e8-d3e13da018e4");
    _verifyClosePayeErrorMessage.Click_ErrorMessage();
    

    }

    @Test  (groups= {"verifyClosePayeErrorMessage","verifyClosePayeErrorMessage - Default Profile"})
    @TestModellerPath(guid = "0ce9f540-e703-4e5c-b3f6-f473b1ea1607")
    public void GoToUrlAssertUrlClickClickPayrollClickgotoEditCompanyClickgotoPayrollDetailsClickClosePAYEtoYe3() throws Exception
    {
        
        pages.verifyClosePayeErrorMessage _verifyClosePayeErrorMessage = new pages.verifyClosePayeErrorMessage(driver);
    TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
    _verifyClosePayeErrorMessage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
    _verifyClosePayeErrorMessage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
    _verifyClosePayeErrorMessage.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
    _verifyClosePayeErrorMessage.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
    _verifyClosePayeErrorMessage.Click_gotoPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("a0b9860a-6157-407f-9bcb-0e930a194135");
    _verifyClosePayeErrorMessage.Click_ClosePAYEtoYes();
    

    TestModellerLogger.SetLastNodeGuid("98af6d89-396c-4089-88e3-298d59884c8f");
    _verifyClosePayeErrorMessage.Enter_EnterDeRegistrationDate("44276.289690381942");
    

    TestModellerLogger.SetLastNodeGuid("b8b1d12f-ab94-4b0b-84e8-d3e13da018e4");
    _verifyClosePayeErrorMessage.Click_ErrorMessage();
    

    }

}
