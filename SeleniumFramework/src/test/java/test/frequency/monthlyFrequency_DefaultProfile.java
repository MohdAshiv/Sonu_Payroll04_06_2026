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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7b0e894a-97e6-4e11-a4cf-cb4a87781e6d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1368, profileId = 101233)
public class monthlyFrequency_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "978a24b9-361d-4915-b7f9-bce19fa9feb6")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay1() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("-Select-");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "cba9c7d8-6af3-4bbb-90b8-8804970534e7")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay2() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("N/A");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "f4d2bcd3-d60d-497d-8ba6-41c5a6b9797f")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay3() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("1");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "6f286350-4f31-4df9-99f7-0545d30df59d")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay4() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("2");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "00cda482-7c9d-45dd-9e5d-6f2cd2e3f921")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay5() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("3");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "430e3391-27d6-4768-9477-9aaa53e43125")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay6() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("4");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "29a54846-0c2a-46b9-80ff-632ac38a9862")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay7() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("5");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "104a04c5-9710-419e-afa7-da0b0f388c56")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay8() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("6");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "77f7c85d-b812-432a-91c6-e0d21b4f81da")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPay9() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("7");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "a385bc46-77bc-4cc4-9b29-164cd28d28c4")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa10() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("8");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "afe6d8ab-c0dc-4061-916f-aeafa751511c")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa11() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("9");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "7ba2e92a-a949-4a10-a5b7-9a42e2ac71db")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa12() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("10");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "d97d9dc8-9025-492f-af61-8c4c330e3de4")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa13() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("11");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "caca79d3-3755-4b09-9dbb-eba7725262ca")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa14() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("12");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "7fe70232-f69d-4f73-810e-b5213a172121")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa15() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("13");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "7e0a28ff-712d-4eb6-a848-5f6a6b2b0437")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa16() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("14");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "fd67c34f-a363-4c82-9369-36a94d992ca1")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa17() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("15");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "1b100b8f-8835-4f5e-9b7a-72b80fd45dae")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa18() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("16");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "c0ac06be-698f-456e-8e1f-4e3e98ec9a33")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa19() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("17");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "09f208b6-3bed-4688-9eff-c9e41fab6ed7")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa20() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("18");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "78a79886-6671-4988-85e9-7c033d716ee5")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa21() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("19");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "77fb2e56-2989-4626-9604-0e913ca0b8c4")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa22() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("20");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "49ddaedf-2c9e-4fed-8283-336fbfa9529e")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa23() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("21");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "12880e25-7d00-4d2e-8c71-82f7d2eb6578")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa24() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("22");
    

    }

    @Test  (groups= {"monthlyFrequency","monthlyFrequency - Default Profile"})
    @TestModellerPath(guid = "ffa8ab5e-0786-4400-adae-5cf836685a0c")
    public void GoToUrlAssertUrlClickclickAdditionalFrequecyPositiveSelectSelectpayModePositiveSelectMonthlyPa25() throws InterruptedException
    {
        
    	pages.frequency.monthlyFrequency _monthlyFrequency = new pages.frequency.monthlyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("4ebb191a-250b-4259-993e-b945d5c37653");
    _monthlyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6da5ccfb-dc86-49a8-adc0-c1d4ef15f340");
    _monthlyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f7b06552-e3e0-4d59-a287-cd1b011429f8");
    _monthlyFrequency.Click_clickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("148cc9d6-b879-4994-bea0-96d9dd9f32f4");
    _monthlyFrequency.Select_SelectpayMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("808e80ca-7535-4a1d-8ae6-cf09afb555d1");
    _monthlyFrequency.Select_MonthlyPayDay("23");
    

    }

}
