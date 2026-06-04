package test.frequency;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b67cb2f0-fb77-463e-ab89-006d56a5e702
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1378, profileId = 101247)
public class NotToSubmit_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"NotToSubmit","NotToSubmit - Default Profile"})
    @TestModellerPath(guid = "baf12af4-baa4-49dc-affe-67cf4d1932df")
    public void GoToUrlAssertUrlClickSelectCheckboxEnterEnterNotesClickClickNottosubmitClickclickNOTTOSUBMIT2() throws Exception
    {
        
        pages.frequency.NotToSubmot _NotToSubmot = new pages.frequency.NotToSubmot(driver);
    TestModellerLogger.SetLastNodeGuid("bcf2d450-71bb-4c1b-99d6-4b09ac97fb99");
    _NotToSubmot.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("361abb44-a8b2-41de-ba3b-bacedf981428");
    _NotToSubmot.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("69226255-3241-44f3-a305-b4fc2cd1d8ed");
    _NotToSubmot.Click_SelectCheckbox();
    

    TestModellerLogger.SetLastNodeGuid("34148a0e-5c9e-4be5-b517-2e2063627eb9");
    _NotToSubmot.Enter_EnterNotes("");
    

    TestModellerLogger.SetLastNodeGuid("ea5a2da4-271a-4d74-a792-d9d548dd3e30");
    _NotToSubmot.Click_ClickNot_to_submit();
    

    TestModellerLogger.SetLastNodeGuid("65666cdd-8560-4dfd-a8e6-8062fb039052");
    _NotToSubmot.Click_clickNOTTOSUBMIT2();
    

    TestModellerLogger.SetLastNodeGuid("68a24600-c36f-4846-b61f-b4308b921555");
    _NotToSubmot.Click_DownloadPDF();
    

    }

}
