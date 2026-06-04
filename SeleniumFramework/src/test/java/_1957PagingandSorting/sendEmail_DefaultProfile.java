package _1957PagingandSorting;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/401e9931-31f0-4a12-8e84-368f95210f8d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1593, profileId = 101709)
public class sendEmail_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"sendEmail","sendEmail - Default Profile"})
    @TestModellerPath(guid = "84e10cbc-78ea-40f0-9392-cd5774c9ec89")
    public void GoToUrlAssertUrlClickRunPayroll1PositiveSelectchooseSentoptionClickRunPayroll2ClickgotoReports() throws InterruptedException
    {
        
    	_1957PagingandSorting.sendEmail _sendEmail = new _1957PagingandSorting.sendEmail(driver);
    TestModellerLogger.SetLastNodeGuid("b11d8d2a-ffa8-4893-8702-cc4bdc41f6f4");
    _sendEmail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("20bd9f36-7a0a-40b2-889d-c6bbfe6de8eb");
    _sendEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fb755dbe-2e04-49d0-9815-d0032fedd4c7");
    _sendEmail.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("9f8338c5-7d76-4c5c-8720-4ca9fb992b12");
    _sendEmail.Select_chooseSentoption("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("d58b6020-0832-482b-afd4-62ca2b5b8448");
    _sendEmail.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("c60ab623-8439-4066-ac28-c552eb7ae92a");
    _sendEmail.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("0ba22acd-3b49-41f7-a58a-b95cfbb352d7");
    _sendEmail.Click_clickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("8f6578a6-008e-46e0-8671-0a7d7afd6527");
    _sendEmail.Select_chooseEmailType("Employer");
    

    TestModellerLogger.SetLastNodeGuid("8954759b-cc7d-4f2f-a50c-22e0ef5e7d49");
    _sendEmail.Click_clickEmailPayslips();
    

    TestModellerLogger.SetLastNodeGuid("22f29cb0-346f-4d31-9c3b-f484e7328039");
    _sendEmail.Click_clickSend();
    

    }

//    @Test  (groups= {"sendEmail","sendEmail - Default Profile"})
//    @TestModellerPath(guid = "8230b65e-5e47-4c90-96ab-8e2f0e095d47")
//    public void GoToUrlAssertUrlClickRunPayroll1PositiveSelectchooseSentoptionClickRunPayroll2ClickgotoReports1()
//    {
//        
//        pages.sendEmail _sendEmail = new pages.sendEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("b11d8d2a-ffa8-4893-8702-cc4bdc41f6f4");
//    _sendEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("20bd9f36-7a0a-40b2-889d-c6bbfe6de8eb");
//    _sendEmail.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fb755dbe-2e04-49d0-9815-d0032fedd4c7");
//    _sendEmail.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9f8338c5-7d76-4c5c-8720-4ca9fb992b12");
//    _sendEmail.Select_chooseSentoption("To Main Contact");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d58b6020-0832-482b-afd4-62ca2b5b8448");
//    _sendEmail.Click_RunPayroll2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c60ab623-8439-4066-ac28-c552eb7ae92a");
//    _sendEmail.Click_gotoReports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ba22acd-3b49-41f7-a58a-b95cfbb352d7");
//    _sendEmail.Click_clickPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f6578a6-008e-46e0-8671-0a7d7afd6527");
//    _sendEmail.Select_chooseEmailType("Employees");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8954759b-cc7d-4f2f-a50c-22e0ef5e7d49");
//    _sendEmail.Click_clickEmailPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("22f29cb0-346f-4d31-9c3b-f484e7328039");
//    _sendEmail.Click_clickSend();
//    
//
//    }
//
//    @Test  (groups= {"sendEmail","sendEmail - Default Profile"})
//    @TestModellerPath(guid = "2acc38bf-595a-40e8-ae45-9a6e5ab2dddc")
//    public void GoToUrlAssertUrlClickRunPayroll1PositiveSelectchooseSentoptionClickRunPayroll2ClickgotoReports2()
//    {
//        
//        pages.sendEmail _sendEmail = new pages.sendEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("b11d8d2a-ffa8-4893-8702-cc4bdc41f6f4");
//    _sendEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("20bd9f36-7a0a-40b2-889d-c6bbfe6de8eb");
//    _sendEmail.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fb755dbe-2e04-49d0-9815-d0032fedd4c7");
//    _sendEmail.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9f8338c5-7d76-4c5c-8720-4ca9fb992b12");
//    _sendEmail.Select_chooseSentoption("To Main Contact");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d58b6020-0832-482b-afd4-62ca2b5b8448");
//    _sendEmail.Click_RunPayroll2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c60ab623-8439-4066-ac28-c552eb7ae92a");
//    _sendEmail.Click_gotoReports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ba22acd-3b49-41f7-a58a-b95cfbb352d7");
//    _sendEmail.Click_clickPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f6578a6-008e-46e0-8671-0a7d7afd6527");
//    _sendEmail.Select_chooseEmailType("Both");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8954759b-cc7d-4f2f-a50c-22e0ef5e7d49");
//    _sendEmail.Click_clickEmailPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("22f29cb0-346f-4d31-9c3b-f484e7328039");
//    _sendEmail.Click_clickSend();
//    
//
//    }
//
//    @Test  (groups= {"sendEmail","sendEmail - Default Profile"})
//    @TestModellerPath(guid = "c57dee03-16eb-4723-a912-e714331080fe")
//    public void GoToUrlAssertUrlClickRunPayroll1PositiveSelectchooseSentoptionClickRunPayroll2ClickgotoReports3()
//    {
//        
//        pages.sendEmail _sendEmail = new pages.sendEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("b11d8d2a-ffa8-4893-8702-cc4bdc41f6f4");
//    _sendEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("20bd9f36-7a0a-40b2-889d-c6bbfe6de8eb");
//    _sendEmail.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fb755dbe-2e04-49d0-9815-d0032fedd4c7");
//    _sendEmail.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9f8338c5-7d76-4c5c-8720-4ca9fb992b12");
//    _sendEmail.Select_chooseSentoption("To Employees");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d58b6020-0832-482b-afd4-62ca2b5b8448");
//    _sendEmail.Click_RunPayroll2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c60ab623-8439-4066-ac28-c552eb7ae92a");
//    _sendEmail.Click_gotoReports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ba22acd-3b49-41f7-a58a-b95cfbb352d7");
//    _sendEmail.Click_clickPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f6578a6-008e-46e0-8671-0a7d7afd6527");
//    _sendEmail.Select_chooseEmailType("Employer");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8954759b-cc7d-4f2f-a50c-22e0ef5e7d49");
//    _sendEmail.Click_clickEmailPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("22f29cb0-346f-4d31-9c3b-f484e7328039");
//    _sendEmail.Click_clickSend();
//    
//
//    }
//
//    @Test  (groups= {"sendEmail","sendEmail - Default Profile"})
//    @TestModellerPath(guid = "3e15e5be-08b2-47c6-a02b-f8c04aad61ce")
//    public void GoToUrlAssertUrlClickRunPayroll1PositiveSelectchooseSentoptionClickRunPayroll2ClickgotoReports4()
//    {
//        
//        pages.sendEmail _sendEmail = new pages.sendEmail(driver);
//    TestModellerLogger.SetLastNodeGuid("b11d8d2a-ffa8-4893-8702-cc4bdc41f6f4");
//    _sendEmail.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("20bd9f36-7a0a-40b2-889d-c6bbfe6de8eb");
//    _sendEmail.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fb755dbe-2e04-49d0-9815-d0032fedd4c7");
//    _sendEmail.Click_RunPayroll1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9f8338c5-7d76-4c5c-8720-4ca9fb992b12");
//    _sendEmail.Select_chooseSentoption("Don't Send");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d58b6020-0832-482b-afd4-62ca2b5b8448");
//    _sendEmail.Click_RunPayroll2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c60ab623-8439-4066-ac28-c552eb7ae92a");
//    _sendEmail.Click_gotoReports();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ba22acd-3b49-41f7-a58a-b95cfbb352d7");
//    _sendEmail.Click_clickPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8f6578a6-008e-46e0-8671-0a7d7afd6527");
//    _sendEmail.Select_chooseEmailType("Employer");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8954759b-cc7d-4f2f-a50c-22e0ef5e7d49");
//    _sendEmail.Click_clickEmailPayslips();
//    
//
//    TestModellerLogger.SetLastNodeGuid("22f29cb0-346f-4d31-9c3b-f484e7328039");
//    _sendEmail.Click_clickSend();
//    
//
//    }

}
