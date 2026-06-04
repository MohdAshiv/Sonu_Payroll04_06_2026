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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4c4472d7-fc11-4958-86b4-1f6fa3c56498
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1384, profileId = 101252)
public class EmployerNotes_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"EmployerNotes","EmployerNotes - Default Profile"})
    @TestModellerPath(guid = "396f37be-c063-4c71-8433-7c4aa8a8716b")
    public void GoToUrlAssertUrlClickgotoEmployerNotesEnterYearEndNotesEnterMonth1EnterMonth2EnterMonth3Ente() throws Exception
    {
        
        pages1.EmployerNotes _EmployerNotes = new pages1.EmployerNotes(driver);
    TestModellerLogger.SetLastNodeGuid("975a55d2-27fd-4652-820f-371e0333f371");
    _EmployerNotes.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8b9f2ec1-da34-42b8-ae7b-969e1119f26f");
    _EmployerNotes.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ee618d94-132b-49b0-8f26-81a0e9a2a912");
    _EmployerNotes.Click_gotoEmployerNotes();
    

    TestModellerLogger.SetLastNodeGuid("444a9660-bfc7-4c93-9b58-ea754fa57288");
    _EmployerNotes.Enter_YearEndNotes("");
    

    TestModellerLogger.SetLastNodeGuid("0aceb88b-b9b6-4228-b660-f92f1e6ae16c");
    _EmployerNotes.Enter_Month1("");
    

    TestModellerLogger.SetLastNodeGuid("40c9cac1-c768-4807-a5cf-dd46053075c9");
    _EmployerNotes.Enter_Month2("");
    

    TestModellerLogger.SetLastNodeGuid("5536c438-141d-4d70-bf4d-ba692e3b2451");
    _EmployerNotes.Enter_Month3("");
    

    TestModellerLogger.SetLastNodeGuid("bf51480e-5767-413a-bbfc-4428ecb88382");
    _EmployerNotes.Enter_Month4("");
    

    TestModellerLogger.SetLastNodeGuid("4bf8c4c8-86f4-4f34-8a9d-ddb83ab71ad1");
    _EmployerNotes.Enter_Month5("");
    

    TestModellerLogger.SetLastNodeGuid("01afd99b-1b67-458a-9142-f74b1ee556bd");
    _EmployerNotes.Enter_Month6("");
    

    TestModellerLogger.SetLastNodeGuid("ca341650-e578-410d-b96d-d2678270c7c6");
    _EmployerNotes.Enter_Month7("");
    

    TestModellerLogger.SetLastNodeGuid("2db8a7cd-a807-47cd-b931-d7cbfdbfd82d");
    _EmployerNotes.Enter_Month8("");
    

    TestModellerLogger.SetLastNodeGuid("8a22aad7-671f-401b-a430-1d7484b39410");
    _EmployerNotes.Enter_Month9("");
    

    TestModellerLogger.SetLastNodeGuid("1b7af999-0fea-47ef-9b9e-e276309fdfdd");
    _EmployerNotes.Enter_Month10("");
    

    TestModellerLogger.SetLastNodeGuid("ef9a14c6-676e-4696-b14e-718007cf21df");
    _EmployerNotes.Enter_Month11("");
    

    TestModellerLogger.SetLastNodeGuid("3630eb7c-8163-44fe-9c7b-aff3fc989569");
    _EmployerNotes.Enter_Month12("");
    

    TestModellerLogger.SetLastNodeGuid("65643b32-d06f-48e3-8fac-e3e18287805b");
    _EmployerNotes.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("75dbfb8c-e444-4d50-a1eb-8da306f53487");
    _EmployerNotes.Click_gotoPayrollDashboard();
    

    }

}
