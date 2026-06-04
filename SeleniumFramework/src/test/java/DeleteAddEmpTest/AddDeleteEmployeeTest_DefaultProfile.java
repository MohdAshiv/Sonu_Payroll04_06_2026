package DeleteAddEmpTest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a77ff85d-a2c8-4bd7-9cb6-624d5874ee9c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1793, profileId = 102258)
public class AddDeleteEmployeeTest_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Add_Delete_EmployeeTest","Add_Delete_EmployeeTest - Default Profile"})
    @TestModellerPath(guid = "0a099fd7-0e75-4cac-a8e9-bf1c1a96b842")
    public void GoToUrlAssertUrlClickNewEmployeeClickPersonalDetailsPositiveEnterEnterFirstNamePositiveEnterEn() throws InterruptedException
    {
        
    	DeleteAddEmpPage.Add_Delete_Employee _Add_Delete_Employee = new DeleteAddEmpPage.Add_Delete_Employee(driver);
    TestModellerLogger.SetLastNodeGuid("a3cd93d8-e96d-4ece-b861-c2944bb95047");
    _Add_Delete_Employee.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f38c3537-8885-4e4f-8228-12b07f2dc0e9");
    _Add_Delete_Employee.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9dfbe92c-eb24-47f9-b8b4-b761bf3a24ad");
    _Add_Delete_Employee.Click__New_Employee_();
    

    TestModellerLogger.SetLastNodeGuid("eca607be-67c2-40b7-aecf-5b6a8dcf4ebd");
    _Add_Delete_Employee.Click_Personal_Details();
    

    TestModellerLogger.SetLastNodeGuid("caf2c3f9-ae18-4dd0-a88a-e4a39377e79c");
    _Add_Delete_Employee.Enter_EnterFirstName("Noemi");
    

    TestModellerLogger.SetLastNodeGuid("8ba29342-03c3-4f0d-a40a-7eda8917d388");
    _Add_Delete_Employee.Enter_EnterLastName("Wisozk");
    

    TestModellerLogger.SetLastNodeGuid("9bd8968b-2e34-4575-8891-b0ec7ca2a6e5");
    _Add_Delete_Employee.Select_Gender("Male");
    

    TestModellerLogger.SetLastNodeGuid("4aacd0cb-7ff5-4944-86ca-873a4fa0d5cf");
    _Add_Delete_Employee.Enter_EnterDOB("");
    

    TestModellerLogger.SetLastNodeGuid("80073638-eb5e-4bef-af4d-97faa137c6f8");
    _Add_Delete_Employee.Enter_Address1("348 Lowe Lock, West Ara, Turkey");
    

    TestModellerLogger.SetLastNodeGuid("11d94da7-49db-4ea6-b38b-09ab87671c08");
    _Add_Delete_Employee.Enter_EnterAddress2("4416 Orn Run, East Forest, Senegal");
    

    TestModellerLogger.SetLastNodeGuid("38cbf407-5307-4f5f-9350-c6cf81a543eb");
    _Add_Delete_Employee.Select_DropDownCountry("Outside of UK");
    

    TestModellerLogger.SetLastNodeGuid("ac2fba41-dd22-49e9-9855-c11544ca5ff3");
    _Add_Delete_Employee.Enter_Country("");
    

    TestModellerLogger.SetLastNodeGuid("6517cc9f-20b5-4e16-a068-583f9c397f75");
    _Add_Delete_Employee.Click_Mandatory_Payroll_Information();
    

    TestModellerLogger.SetLastNodeGuid("d08b0522-899a-4ecc-b208-dae733e6e4bd");
    _Add_Delete_Employee.Enter_EnterJoiningDate("2021-05-30 09:46:30");
    

    TestModellerLogger.SetLastNodeGuid("2fec68fa-bc70-4399-a319-4d766cd92f55");
    _Add_Delete_Employee.Select_PayrollFrequencyCode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("eadd6aca-15b3-4ad4-9f51-46a9e5a91282");
    _Add_Delete_Employee.Enter_EnterTaxCode("");
    

    TestModellerLogger.SetLastNodeGuid("44131a31-359f-456e-a413-1e866b8bc3cc");
    _Add_Delete_Employee.Click_Pay_Details();
    

    TestModellerLogger.SetLastNodeGuid("9daefca3-bfbf-47a9-87f1-15d7fe7e5049");
    _Add_Delete_Employee.Enter_EnterBasicSalary("");
    

    TestModellerLogger.SetLastNodeGuid("e973c4e9-b157-42f0-b867-0f451b5cac28");
    _Add_Delete_Employee.Click_Save();
    

    TestModellerLogger.SetLastNodeGuid("2f5e2f59-aa8e-4b27-8b64-1bc1d928105a");
    _Add_Delete_Employee.Click_gotoPayroll_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("72946bbb-b682-4582-a9d1-eb01ef0d27df");
    _Add_Delete_Employee.Click_clickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("f075bef4-30d7-473b-a6c2-3a87e978016f");
    _Add_Delete_Employee.Click_chooseDelete();
    

    }

}