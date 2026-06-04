package _2087EmailLog;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f30206be-1ef4-460b-8e4e-f56126dce9c6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1797, profileId = 102267)
public class test_2087EmailLogP60_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"_2087EmailLogP60","_2087EmailLogP60 - Default Profile"})
    @TestModellerPath(guid = "e4131f13-a144-4454-ac7b-bf24230b3950")
    public void AssertUrlGoToUrlClickgotoReportsClickP60P45P11DFormsPositiveSelectselectEmailToClickclickEmail()
    {
        
    	_2087EmailLogPage._2087EmailLogP60 __2087EmailLogP60 = new _2087EmailLogPage._2087EmailLogP60(driver);
    TestModellerLogger.SetLastNodeGuid("f1a9bf3b-0d48-4b58-8ece-1e67f3823249");
    __2087EmailLogP60.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0d792ff-711f-4ff0-857d-ef4ec80220c9");
    __2087EmailLogP60.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0790fec-03b4-421c-b001-df7a405cd23a");
    __2087EmailLogP60.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("0a2d4103-d997-4d69-a688-197ae8f83931");
    __2087EmailLogP60.Click_P60P45P11D_Forms();
    

    TestModellerLogger.SetLastNodeGuid("313d596e-d25d-4bcc-94a6-917b7edd9df1");
    __2087EmailLogP60.Select_selectEmailTo("Employer");
    

    TestModellerLogger.SetLastNodeGuid("c314f04e-ff6d-42d9-b8a0-919351611b83");
    __2087EmailLogP60.Click_clickEmail();
    

    TestModellerLogger.SetLastNodeGuid("68ba42ef-c648-47e1-9f92-598ead2d9a7a");
    __2087EmailLogP60.Click__Send_();
    

    TestModellerLogger.SetLastNodeGuid("92cf536b-b2b0-4b91-bb7c-a2f292a8f9d4");
    __2087EmailLogP60.Click_click();
    

    }

    @Test  (groups= {"_2087EmailLogP60","_2087EmailLogP60 - Default Profile"})
    @TestModellerPath(guid = "bd7bf348-3dac-46a0-a024-2a2db4ad5dee")
    public void AssertUrlGoToUrlClickgotoReportsClickP60P45P11DFormsPositiveSelectselectEmailToClickclickEmail1()
    {
        
    	_2087EmailLogPage._2087EmailLogP60 __2087EmailLogP60 = new _2087EmailLogPage._2087EmailLogP60(driver);
    TestModellerLogger.SetLastNodeGuid("f1a9bf3b-0d48-4b58-8ece-1e67f3823249");
    __2087EmailLogP60.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0d792ff-711f-4ff0-857d-ef4ec80220c9");
    __2087EmailLogP60.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0790fec-03b4-421c-b001-df7a405cd23a");
    __2087EmailLogP60.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("0a2d4103-d997-4d69-a688-197ae8f83931");
    __2087EmailLogP60.Click_P60P45P11D_Forms();
    

    TestModellerLogger.SetLastNodeGuid("313d596e-d25d-4bcc-94a6-917b7edd9df1");
    __2087EmailLogP60.Select_selectEmailTo("Employees");
    

    TestModellerLogger.SetLastNodeGuid("c314f04e-ff6d-42d9-b8a0-919351611b83");
    __2087EmailLogP60.Click_clickEmail();
    

    TestModellerLogger.SetLastNodeGuid("68ba42ef-c648-47e1-9f92-598ead2d9a7a");
    __2087EmailLogP60.Click__Send_();
    

    TestModellerLogger.SetLastNodeGuid("92cf536b-b2b0-4b91-bb7c-a2f292a8f9d4");
    __2087EmailLogP60.Click_click();
    

    }

}