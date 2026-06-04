package _1768Test;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7cdc9f76-1328-438e-ba59-6ea8e9a47a49
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1745, profileId = 102123)
public class TaxPaymentSummaryReport_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"TaxPayment_SummaryReport","TaxPayment_SummaryReport - Default Profile"})
    @TestModellerPath(guid = "c594eb59-8983-4bd7-acf7-749eefd670fc")
    public void GoToUrlAssertUrlClickgotoTaxPaymentClickclickCISSufferedTabPositiveEnterEnterCISSufferedAmount()
    {
        
    	_1768._1768Check __1768Check = new _1768._1768Check(driver);
    TestModellerLogger.SetLastNodeGuid("49d9d989-6fe3-4ca4-9801-311481f0e1f4");
    __1768Check.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b66cfcc0-0383-4af7-aaaf-afc5beae37fe");
    __1768Check.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("af59a123-ff0a-4e62-9f56-51263b39c1ac");
    __1768Check.Click_gotoTaxPayment();
    

    TestModellerLogger.SetLastNodeGuid("9499d87b-8852-460d-bd79-a87d0b533e78");
    __1768Check.Click_clickCISSufferedTab();
    

    TestModellerLogger.SetLastNodeGuid("1a03b2c4-47be-49cd-aa68-a5e42fb78ec1");
    __1768Check.Enter_EnterCISSufferedAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("996c0c7d-c80b-41c9-8794-974f0b032d0e");
    __1768Check.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("6e4f2c78-4754-43e2-8ab8-870e844f6323");
    __1768Check.Click_clickHMRCPaymentsMadeTab();
    

    TestModellerLogger.SetLastNodeGuid("5375f703-e778-4d75-8e63-738ec91882dc");
    __1768Check.Click_clickSave();
    

    TestModellerLogger.SetLastNodeGuid("4cf8e745-943d-45c8-a602-19d6a5d1818a");
    __1768Check.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("a7041c77-e6ec-49eb-b1a7-77ed3b319a34");
    __1768Check.Click_cliclPayrollSummary();
    

    TestModellerLogger.SetLastNodeGuid("f315e446-587f-42c7-b004-e49cdb4b76ff");
    __1768Check.Select_selectTaxYears("2021-2022");
    

    TestModellerLogger.SetLastNodeGuid("194dab78-66a7-4a5a-9e11-78159c764380");
    __1768Check.Select_selectPayrollDate("31/07/2021");
    

    TestModellerLogger.SetLastNodeGuid("8e06c95f-071b-4cee-ad1f-980c22726119");
    __1768Check.Click_clickEmail();
    

    TestModellerLogger.SetLastNodeGuid("e2eff0a4-6ff0-4dfc-b6e5-8f7f33c65e5a");
    __1768Check.Click_clickSummaryAttachment();
    

    }

}