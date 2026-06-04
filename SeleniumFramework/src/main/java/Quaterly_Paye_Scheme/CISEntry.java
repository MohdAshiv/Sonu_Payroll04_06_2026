package Quaterly_Paye_Scheme;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cc7cc460-6887-4a34-8ffa-a6790e9d64e9
@TestModellerModule(guid = "cc7cc460-6887-4a34-8ffa-a6790e9d64e9")
public class CISEntry extends BasePage
{
	static float EE_NIvalue=0;
	static float ER_NIvalue=0;
	static float Income_Taxvalue=0;
	static float CIS_Sufferedvalue=0;
	static float Amount_Due_to_HMRCvalue=0;
	static float AmountPaidvalue=0;
	static float Balance_Due_to_HMRC_value=0;
	
	public CISEntry (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickCISSufferedElem = By.xpath("//label[contains(.,'Quarter:')]/../../../../../../../div[3]/div/a[4]");

	private By EnterAmountElem = By.xpath("//label[contains(.,'Jan-2021:')]/../../div[2]/input");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickCISSuffered
     * @name Click ClickCISSuffered
     */
	public void Click_ClickCISSuffered()
	{
        
		WebElement elem = getWebElement(ClickCISSufferedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickCISSuffered", "Click_ClickCISSuffered failed. Unable to locate object: " + ClickCISSufferedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickCISSuffered", "Click_ClickCISSuffered failed. Unable to locate object: " + ClickCISSufferedElem.toString());

			Assert.fail("Unable to locate object: " + ClickCISSufferedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickCISSuffered");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickCISSuffered");
	}

      
	/**
 	 * Enter EnterAmount
	 * @throws InterruptedException 
     * @name Enter EnterAmount
     */
 	public void Enter_EnterAmount(String EnterAmount) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(EnterAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterAmount", "Enter_EnterAmount failed. Unable to locate object: " + EnterAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterAmount", "Enter_EnterAmount failed. Unable to locate object: " + EnterAmountElem.toString());

 			Assert.fail("Unable to locate object: " + EnterAmountElem.toString());
         }

 		elem.sendKeys(EnterAmount);
 		
 		Thread.sleep(1000);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterAmount " + EnterAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterAmount " + EnterAmount);
 	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		
		Tax_Payment_Table EE_ob=new Tax_Payment_Table(m_Driver);
		
		EE_ob.monthvaluemethod();
		
//Calling value from EE_NI method	
/*
 * 
 * 		
 */
		
		
		 EE_NIvalue=EE_ob.EE_NI();
		
		System.out.println("Your EE_NI value: "+EE_NIvalue);
		
//Calling value from ER_NI method	
/*
 * 
 * 
 * 		
*/ 	
		//Tax_Payment_Table ER_ob=new Tax_Payment_Table(m_Driver);
		
		ER_NIvalue=EE_ob.ER_NI();
		
		System.out.println("Your EE_NI value: "+ER_NIvalue);
		
		
//Calling value from Income_Tax method	
/*
 * 
 * 
 * 		
*/ 	
				//Tax_Payment_Table Income_Tax_ob=new Tax_Payment_Table(m_Driver);
				
				Income_Taxvalue=EE_ob.Income_Tax();
				
				System.out.println("Your Income_Tax value: "+Income_Taxvalue);
				
				
//Calling value from CIS_Suffered method	
/*
 * 
 * 
 * 		
*/ 	
				//Tax_Payment_Table CIS_Suffered_ob=new Tax_Payment_Table(m_Driver);
								
				CIS_Sufferedvalue=EE_ob.CIS_Suffered();
								
				System.out.println("Your CIS_Suffered value: "+CIS_Sufferedvalue);
				
				
				
//Calling value from Amount_Due_to_HMRC method	
/*
 * 
 * 
 * 		
*/ 	
				//Tax_Payment_Table Amount_Due_to_HMRC_ob=new Tax_Payment_Table(m_Driver);
												
				Amount_Due_to_HMRCvalue=EE_ob.Amount_Due_to_HMRC();
												
				System.out.println("Your Amount_Due_to_HMRC value: "+Amount_Due_to_HMRCvalue);		

				
				
//Verifying CIS paid is ok or not	
				
				float Expected=(Income_Taxvalue+ER_NIvalue+EE_NIvalue)-CIS_Sufferedvalue;
				float Actual=Amount_Due_to_HMRCvalue;
				
				if(Actual==Expected)
				{
					System.out.println("CIS_Suffered value is subtracted correctly");
				}
				else
				{
					System.out.println("Error...CIS_Suffered value is subtracted wrongly");
				}
				
//Assert section
				
			
				
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(Actual, Expected, Actual);
			soft.assertAll();
				
//Calling value from Amount Paid method	
/*
* 
* 
* 		
*/ 	
				//Tax_Payment_Table AmountPaid_ob=new Tax_Payment_Table(m_Driver);
																
				AmountPaidvalue=EE_ob.AmountPaid();
																
				System.out.println("Your Amount Paid value: "+AmountPaidvalue);		
				
				
				
//Calling value from Balance Due to HMRC	
/*
* 
* 
* 		
*/ 	
			//	Tax_Payment_Table Balance_Due_to_HMRC_ob=new Tax_Payment_Table(m_Driver);
																				
				Balance_Due_to_HMRC_value=EE_ob.Balance_Due_to_HMRC();
																				
				System.out.println("Your Balance due to HMRC Paid value: "+Balance_Due_to_HMRC_value);				
		

				
//Verifying Balance Due to HMRC is ok or not	
				
				if(Balance_Due_to_HMRC_value==(Amount_Due_to_HMRCvalue-AmountPaidvalue))
				{
					System.out.println("Balance due to HMRC value is correctly given");
				}
				else
				{
					System.out.println("Error...Paid amount is not subtracted correctly");
				}				
				
		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
	

	
	
	
}