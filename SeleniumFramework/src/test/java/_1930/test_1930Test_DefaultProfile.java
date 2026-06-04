package _1930;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/218981cc-eed2-4910-a98a-127acbbca7b7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1776, profileId = 102222)
public class test_1930Test_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"_1930Test","_1930Test - Default Profile"})
    @TestModellerPath(guid = "316b636d-a16a-46e7-a302-05df57c154e7")
    public void GoToUrlAssertUrlClickgotoReportsClickP11ClickgetcLELClickgetPTClickgetUELClickgotoFilingMana()
    {
        
    	_1930._1930page __1930page = new _1930._1930page(driver);
    TestModellerLogger.SetLastNodeGuid("dc3728a4-cc99-4060-9418-3e31311dcc66");
    __1930page.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("44945d34-0415-4631-8850-9f7511ea4a12");
    __1930page.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4e535917-7ca3-408d-a6b8-8c04621e4956");
    __1930page.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("cf92077e-4d58-4222-a8f5-a6685570717e");
    __1930page.Click_P11();
    

    TestModellerLogger.SetLastNodeGuid("783e3e9e-ff28-48a6-b7f5-6837578dc189");
    __1930page.getEarningsP11();
    

    TestModellerLogger.SetLastNodeGuid("c7802579-a1ba-4119-a4d5-1f69dc9ab163");
    __1930page.Click_getPT();
    

    TestModellerLogger.SetLastNodeGuid("519a577b-8ba6-4ca5-8f36-296804395579");
    __1930page.Click_getUEL();
    

    TestModellerLogger.SetLastNodeGuid("761d0e63-632c-4451-ad43-724ae26763c8");
    __1930page.Click_gotoFiling_Management();
    

    TestModellerLogger.SetLastNodeGuid("a11f860b-7ae0-4ffc-91d2-f21eb4560cd7");
    __1930page.Select_selectTaxYears("2021-2022");
    

    TestModellerLogger.SetLastNodeGuid("b3618d93-5963-44dd-9a03-9139881bb97b");
    __1930page.Click_getDeatilFPS();
    

    }

}