package verifyEmailsDataTest;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7462eb82-ce91-4db6-b8e7-998dde166c66
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1658, profileId = 101895)
public class PayrollDsbEmailBody_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"PayrollDsbEmailBody","PayrollDsbEmailBody - Default Profile"})
    @TestModellerPath(guid = "f01e184f-4b53-4f8b-b106-d4241bdf4db0")
    public void GoToUrlAssertUrlClickclickRunPayroll1PositiveSelectselectPaySlipTemplateClickRunPayroll2Clickc() throws InterruptedException
    {
        
    	VerifyEmailsData.PayrollDsbEmailBody _PayrollDsbEmailBody = new VerifyEmailsData.PayrollDsbEmailBody(driver);
    TestModellerLogger.SetLastNodeGuid("b57468ce-7182-4d45-914c-f1866c1b5f2f");
    _PayrollDsbEmailBody.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("53fdefef-477d-4ea5-8b20-b59a49b334be");
    _PayrollDsbEmailBody.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("76227d22-84e4-4fc9-9614-7542782d7a70");
    _PayrollDsbEmailBody.Click_clickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("226f6549-cfa9-4a48-89b6-6f134625a6c5");
    _PayrollDsbEmailBody.Select_selectPaySlipTemplate("To Main Contact");
    

    TestModellerLogger.SetLastNodeGuid("1a18737c-e1ab-42ed-920e-0a4c22ddc751");
    _PayrollDsbEmailBody.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("9576ed20-cb7c-486c-a020-08d7fb608111");
    _PayrollDsbEmailBody.Click_clickCompany_email_address();
    

    TestModellerLogger.SetLastNodeGuid("cfbe3324-52ce-4d3c-866b-358daae3fcf6");
    _PayrollDsbEmailBody.Click_checkboxMyselfEmail();
    

    TestModellerLogger.SetLastNodeGuid("e2c09941-25c9-4ca1-b531-b4273f79dd77");
    _PayrollDsbEmailBody.Click_checkboxPayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("72a0508f-ea52-4614-9471-aacaad7420ca");
    _PayrollDsbEmailBody.Click_verifyPayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("3dbb815a-3944-4f29-a1b0-f2623fa8ee8c");
    _PayrollDsbEmailBody.Click_clickSend();
    

    }

    @Test  (groups= {"PayrollDsbEmailBody","PayrollDsbEmailBody - Default Profile"})
    @TestModellerPath(guid = "cf58d254-3e89-4bfc-a974-25f2ab79b2b9")
    public void GoToUrlAssertUrlClickclickRunPayroll1PositiveSelectselectPaySlipTemplateClickRunPayroll2Clickc1() throws InterruptedException
    {
        
    	VerifyEmailsData.PayrollDsbEmailBody _PayrollDsbEmailBody = new VerifyEmailsData.PayrollDsbEmailBody(driver);
    TestModellerLogger.SetLastNodeGuid("b57468ce-7182-4d45-914c-f1866c1b5f2f");
    _PayrollDsbEmailBody.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("53fdefef-477d-4ea5-8b20-b59a49b334be");
    _PayrollDsbEmailBody.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("76227d22-84e4-4fc9-9614-7542782d7a70");
    _PayrollDsbEmailBody.Click_clickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("226f6549-cfa9-4a48-89b6-6f134625a6c5");
    _PayrollDsbEmailBody.Select_selectPaySlipTemplate("To Employees");
    

    TestModellerLogger.SetLastNodeGuid("1a18737c-e1ab-42ed-920e-0a4c22ddc751");
    _PayrollDsbEmailBody.Click_RunPayroll2();
    

    TestModellerLogger.SetLastNodeGuid("9576ed20-cb7c-486c-a020-08d7fb608111");
    _PayrollDsbEmailBody.Click_clickCompany_email_address();
    

    TestModellerLogger.SetLastNodeGuid("cfbe3324-52ce-4d3c-866b-358daae3fcf6");
    _PayrollDsbEmailBody.Click_checkboxMyselfEmail();
    

    TestModellerLogger.SetLastNodeGuid("e2c09941-25c9-4ca1-b531-b4273f79dd77");
    _PayrollDsbEmailBody.Click_checkboxPayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("72a0508f-ea52-4614-9471-aacaad7420ca");
    _PayrollDsbEmailBody.Click_verifyPayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("3dbb815a-3944-4f29-a1b0-f2623fa8ee8c");
    _PayrollDsbEmailBody.Click_clickSend();
    

    }

}