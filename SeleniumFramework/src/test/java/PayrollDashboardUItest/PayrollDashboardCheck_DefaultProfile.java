package PayrollDashboardUItest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/425818a7-f568-4589-b484-9e5e5ac0a434
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1746, profileId = 102126)
public class PayrollDashboardCheck_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"PayrollDashboardCheck","PayrollDashboardCheck - Default Profile"})
    @TestModellerPath(guid = "8dc6b6d6-7791-4887-bfa4-25a2c21fc8f3")
    public void GoToUrlAssertUrlClickNomismaLogoClickClientNameClickcheckUpcomingLeaveBtnClickchkEmployeeListB()
    {
        
    	PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
    TestModellerLogger.SetLastNodeGuid("3707719e-4723-4023-a10f-5ba9fa39081f");
    _PayrollDashboardCheck.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d79b4058-ded6-4424-83e8-571547dd72f7");
    _PayrollDashboardCheck.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ba20616f-2ad5-40d5-9166-657bb6b0822f");
    _PayrollDashboardCheck.Click_NomismaLogo();
    

    TestModellerLogger.SetLastNodeGuid("c5bf95dc-8b7b-4500-8ae6-d1e89ab50deb");
    _PayrollDashboardCheck.Click_ClientName();
    

    TestModellerLogger.SetLastNodeGuid("e8da9005-9e88-4b12-95a4-d19b9858d294");
    _PayrollDashboardCheck.Click_checkUpcomingLeaveBtn();
    

    TestModellerLogger.SetLastNodeGuid("ad3ead5a-9f6a-4822-a270-1975e669276a");
    _PayrollDashboardCheck.Click_chkEmployeeListBtn();
    

    TestModellerLogger.SetLastNodeGuid("c94acc3c-3b44-4df6-8196-bfe13c542278");
    _PayrollDashboardCheck.Click_chkEmployerNotesBtn();
    

    TestModellerLogger.SetLastNodeGuid("63e081b7-2470-4ea2-8ccc-885a90f279c7");
    _PayrollDashboardCheck.Click_chkJournalsBtn();
    

    TestModellerLogger.SetLastNodeGuid("5e521949-b20d-48f1-aa7b-cb113e020bea");
    _PayrollDashboardCheck.Click_chkNew_EmployeeBtn();
    

    TestModellerLogger.SetLastNodeGuid("0e7c1e4c-4d63-417c-b4f6-5d76067a590e");
    _PayrollDashboardCheck.Click_ClickOnEmployeeName();
    

    TestModellerLogger.SetLastNodeGuid("f2b7ca1d-f62d-4b81-9c46-a2d61dd07501");
    _PayrollDashboardCheck.Click_ClickOnThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("1f1ecab5-99cf-4c29-85c2-75a21f13c096");
    _PayrollDashboardCheck.Click_clickSearchBtn();
    

    TestModellerLogger.SetLastNodeGuid("ff949704-6167-4c6c-b4fc-170304639665");
    _PayrollDashboardCheck.Click_ClientLogin_Logout();
    

    TestModellerLogger.SetLastNodeGuid("855ae8ef-9e86-4d3f-9010-b165833c8a52");
    _PayrollDashboardCheck.Click_EditCompanyBtn();
    

    TestModellerLogger.SetLastNodeGuid("d4a3568e-33ea-4a58-bfc4-1cf46ab3ca94");
    _PayrollDashboardCheck.Click_EmployerViewButton();
    

    TestModellerLogger.SetLastNodeGuid("f1a32713-342b-4b0e-9cf0-9148c55f5e0a");
    _PayrollDashboardCheck.Click_FilingStatus();
    

    TestModellerLogger.SetLastNodeGuid("fbe37832-9676-4de6-affd-5e50ca45011c");
    _PayrollDashboardCheck.Click_FilingStatusText();
    

    TestModellerLogger.SetLastNodeGuid("4c2e2c24-8e49-4ebd-a215-250eb01ccb5b");
    _PayrollDashboardCheck.Click_Frequency();
    

    TestModellerLogger.SetLastNodeGuid("f3d524c2-7b6c-41da-9627-3486f10833d5");
    _PayrollDashboardCheck.Click_FrequencyType();
    

    TestModellerLogger.SetLastNodeGuid("693e6a65-c137-4b57-b7b0-ee05d0a75a29");
    _PayrollDashboardCheck.Click_gotoFilingManagementBtn();
    

    TestModellerLogger.SetLastNodeGuid("8680342f-a3ee-4714-8466-08986f22b4df");
    _PayrollDashboardCheck.Click_gotoLeaveManagementBtn();
    

    TestModellerLogger.SetLastNodeGuid("cffbad31-a63b-47c0-9a32-22ea7e57c924");
    _PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();
    

    TestModellerLogger.SetLastNodeGuid("bc563ce3-df15-4bbb-82b5-3c19feaee102");
    _PayrollDashboardCheck.Click_gotoReportsBtn();
    

    TestModellerLogger.SetLastNodeGuid("6400fa8f-0a83-4fe3-bb7e-7714525bf1d4");
    _PayrollDashboardCheck.Click_gotoTaxPaymentBtn();
    

    TestModellerLogger.SetLastNodeGuid("09430812-8396-4d48-9dfb-63a50b0984a2");
    _PayrollDashboardCheck.Click_TypeofPayroll();
    

    TestModellerLogger.SetLastNodeGuid("f2b8f2f7-7fe2-44ed-bb67-6f94319b05b7");
    _PayrollDashboardCheck.Click_TypeTextforPayroll();
    

    TestModellerLogger.SetLastNodeGuid("fda7265e-a809-4642-8a93-ea3eef92ab13");
    _PayrollDashboardCheck.Click_Undo_Last_Payroll_();
    

    TestModellerLogger.SetLastNodeGuid("6293d8e9-b618-4371-a7dc-353c28139160");
    _PayrollDashboardCheck.Enter_search_inputforCompany("Block Inc");
    

    TestModellerLogger.SetLastNodeGuid("fdfa52ba-566e-4d78-8dd4-cea8d4e25bde");
    _PayrollDashboardCheck.Select_PayrollDateselection("31/08/2021");
    

    TestModellerLogger.SetLastNodeGuid("f032b07e-fcb9-4f8f-a3c7-3c99b76411d6");
    _PayrollDashboardCheck.Select_selectTaxYearsoption("2021-2022");
    

    }

}