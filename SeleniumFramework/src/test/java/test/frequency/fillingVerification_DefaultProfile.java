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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c520b4ed-f0eb-4434-8976-18b382473a3f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1377, profileId = 101246)
public class fillingVerification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"fillingVerification","fillingVerification - Default Profile"})
    @TestModellerPath(guid = "8ce1dd08-8c21-49d1-9a2f-e4bf83de2cae")
    public void GoToUrlAssertUrlClickClickSUBMITTEDClickDownloadPDF()
    {
        
        pages.frequency.fillingVerification _h11 = new pages.frequency.fillingVerification(driver);
    TestModellerLogger.SetLastNodeGuid("c8a170fe-63de-49c5-9dac-97b46096d8e2");
    _h11.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d73e0ab5-17ee-442c-ac43-a1a7d9aa6cdd");
    _h11.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("133d17fd-52da-45aa-a04a-2df26288d779");
    _h11.Click_ClickSUBMITTED();
    

    TestModellerLogger.SetLastNodeGuid("6719b15f-0bb1-4788-b411-4b58c96e7ef4");
    _h11.Click_DownloadPDF();
    

    }

}
