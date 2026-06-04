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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/be97be9d-1c95-44ab-b06e-bc9d219b7e0b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1343, profileId = 101211)
public class reports_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"reports","reports - Default Profile"})
    @TestModellerPath(guid = "06e9d44e-bef2-49f5-afac-3aa79d6ad780")
    public void GoToUrlClickP45FormsPositiveSelectSelectP45FormClickApprenticeshipLevyClickBACsPaymentUploadFil() throws Exception
    {
        
        pages1.reports _reports = new pages1.reports(driver);
    TestModellerLogger.SetLastNodeGuid("ab102354-b6d1-44b0-8435-d0c261e53cb1");
    _reports.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e24decb8-2294-46da-ad75-0ba3b8be4ff0");
    _reports.Click_P45Forms();
    

    TestModellerLogger.SetLastNodeGuid("a696cd3f-5e17-4d2d-8096-da4a60d86df1");
    _reports.Select_SelectP45Form("P45");
    

    TestModellerLogger.SetLastNodeGuid("17436297-2a6b-4dfe-b2b6-d389fd8faa34");
    _reports.Click_Apprenticeship_Levy();
    

    TestModellerLogger.SetLastNodeGuid("f8e452ee-ab62-4165-a0cb-a997a3323c90");
    _reports.Click_BACs_Payment_Upload_File();
    

    TestModellerLogger.SetLastNodeGuid("5e46b00d-510a-4823-b5a7-89669363fd7a");
    _reports.Click_Employee_Details_Listclick();
    

    TestModellerLogger.SetLastNodeGuid("319ac179-14a9-4a9a-82a6-ed809c730542");
    _reports.Click_Individual_Employee_Pay_Scheduleclick();
    

    TestModellerLogger.SetLastNodeGuid("b2d4ada0-4643-48cc-bc36-06e730e2bf60");
    _reports.Click_P11();
    

    TestModellerLogger.SetLastNodeGuid("a3a28dc0-2983-4c0a-bc36-5632d0531c54");
    _reports.Click_Payroll_Reporting_Period_Summary();
    

    TestModellerLogger.SetLastNodeGuid("81367740-2de3-4561-86ce-f8546bc97841");
    _reports.Click_Payroll_Summary();
    

    TestModellerLogger.SetLastNodeGuid("57d17e00-dfd9-4dfd-bf3f-45781d531542");
    _reports.Click_Payslipsclick();
    

    TestModellerLogger.SetLastNodeGuid("8f90235c-979c-41f4-b584-2e7fe6a9d756");
    _reports.Click_Statutory_Maternity_Paternityclick();
    

    }

}
