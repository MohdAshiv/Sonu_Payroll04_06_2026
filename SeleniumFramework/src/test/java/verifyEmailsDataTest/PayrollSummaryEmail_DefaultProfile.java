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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c353566f-dc40-4657-a3c4-684262864774
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1675, profileId = 101952)
public class PayrollSummaryEmail_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"PayrollSummaryEmail","PayrollSummaryEmail - Default Profile"})
    @TestModellerPath(guid = "43f91d08-9780-42e4-aaff-c5a1918dfe8b")
    public void GoToUrlAssertUrlClickclickEmailClickCheckuncheckCompanyemailaddressPositiveEnterSendEmailtoOthe() throws InterruptedException
    {
        
    	VerifyEmailsData.PayrollSummaryEmail _PayrollSummaryEmail = new VerifyEmailsData.PayrollSummaryEmail(driver);
    TestModellerLogger.SetLastNodeGuid("212123a6-7487-45da-96de-03e01630e193");
    _PayrollSummaryEmail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c77642f3-64b1-4290-9fcb-687a811a893b");
    _PayrollSummaryEmail.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7178d497-91ca-417d-9ea3-6932cee2b968");
    _PayrollSummaryEmail.Click_clickEmail();
    

    TestModellerLogger.SetLastNodeGuid("8a93be47-027e-4b91-b98f-e8984a9633dd");
    _PayrollSummaryEmail.Click_Check_uncheck_Companyemailaddress();
    

    TestModellerLogger.SetLastNodeGuid("195e9993-2e93-4dd7-82a9-d3596d035be2");
    _PayrollSummaryEmail.Enter_SendEmailtoOther("#NAME?");
    

    TestModellerLogger.SetLastNodeGuid("585d6047-c3ea-44ce-b744-d633d4c9b475");
    _PayrollSummaryEmail.Click_check_unchek_EmployeePayslip();
    

    TestModellerLogger.SetLastNodeGuid("03623631-eda5-455e-8ce2-06b28a8f0703");
    _PayrollSummaryEmail.Click_chek_unchek_PayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("185b03fd-051a-4d99-8182-b53d6a469a02");
    _PayrollSummaryEmail.Click_getEmailBodyHeader();
    

    TestModellerLogger.SetLastNodeGuid("53b01b0a-9392-4ef2-83c8-655c3b630a36");
    _PayrollSummaryEmail.Click_clickSend();
    

    }

}
