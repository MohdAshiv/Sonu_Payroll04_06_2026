package _1853Test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d9fb0833-130e-4316-bfaa-5d86a9375c20
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1838, profileId = 102348)
public class EEIndividualPay_UserStories extends TestBase
{
    

    
    @Test  (groups= {"EEIndividualPay","EEIndividualPay - User Stories"})
    @TestModellerPath(guid = "5ee57544-ed1d-49a9-a848-fb63d94a3829")
    public void GoToUrlAssertUrlClickReportsClickIndividualEmployeePaySchedulePositiveSelectChooseEEERPositive()
    {
        
        pages.EEIndividualPay _EEIndividualPay = new pages.EEIndividualPay(driver);
    TestModellerLogger.SetLastNodeGuid("acf7268c-1f6c-4740-805d-5733eab308c6");
    _EEIndividualPay.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d907cf82-6da7-4224-a0ee-6cf5c3414747");
    _EEIndividualPay.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e26c4964-132b-42b9-85f4-12825bc8f987");
    _EEIndividualPay.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("eb3160a5-add4-49d2-aaf8-b116814a547a");
    _EEIndividualPay.Click_Individual_Employee_Pay_Schedule();
    

    TestModellerLogger.SetLastNodeGuid("c9d989ed-eec9-4ee4-85ae-a7684b9793be");
    _EEIndividualPay.Select_ChooseEE_ER("Employees");
    

    TestModellerLogger.SetLastNodeGuid("896212b4-e5c8-4333-8946-92255d668aae");
    _EEIndividualPay.Select_chooseEmployee("Mr. A Last");
    

    TestModellerLogger.SetLastNodeGuid("70283de1-c84f-49c2-a073-8938af9da9e7");
    _EEIndividualPay.Click_Download_Payslipbutton();
    

    TestModellerLogger.SetLastNodeGuid("091a022d-e9bc-4aa6-9630-a3395a30df0f");
    _EEIndividualPay.Click_EmailButton();
    

    TestModellerLogger.SetLastNodeGuid("6204af67-a3f0-4aa6-ad79-c1a91b6c29ff");
    _EEIndividualPay.Click_DownloadOption();
    

    TestModellerLogger.SetLastNodeGuid("e91e3132-fcd6-4aa0-8334-c2d70dfc5499");
    _EEIndividualPay.Click_PDFView();
    

    }

    @Test  (groups= {"EEIndividualPay","EEIndividualPay - User Stories"})
    @TestModellerPath(guid = "ded5ef63-e41e-4c85-8026-264e7cefdea1")
    public void GoToUrlAssertUrlClickReportsClickIndividualEmployeePaySchedulePositiveSelectChooseEEERPositive1()
    {
        
        pages.EEIndividualPay _EEIndividualPay = new pages.EEIndividualPay(driver);
    TestModellerLogger.SetLastNodeGuid("acf7268c-1f6c-4740-805d-5733eab308c6");
    _EEIndividualPay.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d907cf82-6da7-4224-a0ee-6cf5c3414747");
    _EEIndividualPay.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e26c4964-132b-42b9-85f4-12825bc8f987");
    _EEIndividualPay.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("eb3160a5-add4-49d2-aaf8-b116814a547a");
    _EEIndividualPay.Click_Individual_Employee_Pay_Schedule();
    

    TestModellerLogger.SetLastNodeGuid("c9d989ed-eec9-4ee4-85ae-a7684b9793be");
    _EEIndividualPay.Select_ChooseEE_ER("Employer");
    

    TestModellerLogger.SetLastNodeGuid("896212b4-e5c8-4333-8946-92255d668aae");
    _EEIndividualPay.Select_chooseEmployee("Mr. A Last");
    

    TestModellerLogger.SetLastNodeGuid("70283de1-c84f-49c2-a073-8938af9da9e7");
    _EEIndividualPay.Click_Download_Payslipbutton();
    

    TestModellerLogger.SetLastNodeGuid("091a022d-e9bc-4aa6-9630-a3395a30df0f");
    _EEIndividualPay.Click_EmailButton();
    

    TestModellerLogger.SetLastNodeGuid("6204af67-a3f0-4aa6-ad79-c1a91b6c29ff");
    _EEIndividualPay.Click_DownloadOption();
    

    TestModellerLogger.SetLastNodeGuid("e91e3132-fcd6-4aa0-8334-c2d70dfc5499");
    _EEIndividualPay.Click_PDFView();
    

    }

}