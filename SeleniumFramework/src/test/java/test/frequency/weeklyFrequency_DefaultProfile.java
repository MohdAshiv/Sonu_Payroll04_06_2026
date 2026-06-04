package test.frequency;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.frequency.weeklyFrequency;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d4e94416-498a-4b8e-ab38-c73150f1e2d5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1357, profileId = 101225)
public class weeklyFrequency_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"weeklyFrequency","weeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "8a340219-fe67-4057-85c2-342a4b723b71")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectselectpayModePositiveEnterWeeklyPayro1()
    {
        
        pages.frequency.weeklyFrequency _weeklyFrequency = new weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"weeklyFrequency","weeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "aa724a3f-4507-48f6-85bd-0be9823119e5")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectselectpayModePositiveEnterWeeklyPayro2()
    {
        
        pages.frequency.weeklyFrequency _weeklyFrequency = new weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287.417309756944");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"weeklyFrequency","weeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "c0c748cb-8fb7-4c92-ab2a-a5eb6a7f1d7d")
    public void GoToUrlAssertUrlClickClickAdditionalFrequecyPositiveSelectselectpayModePositiveEnterWeeklyPayro3()
    {
        
        pages.frequency.weeklyFrequency _weeklyFrequency = new weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287.417309756944");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

}
