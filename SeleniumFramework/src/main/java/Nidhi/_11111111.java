package Nidhi;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2ec46c4b-3a0e-418c-9cbf-d34bcef2b840
@TestModellerModule(guid = "2ec46c4b-3a0e-418c-9cbf-d34bcef2b840")
public class _11111111 extends BasePage
{
	public _11111111 (WebDriver driver)
	{
		super(driver);
	}


	
	private By BankingElem = By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a/span");

	private By New_Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a");

	private By New_TransactionElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By AccountElem = By.xpath("//label[normalize-space()= 'Bank Name:']/../div/select");

	private By EnterDateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDate']");

	private By DescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDescription']");

	private By RecievedAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDbAmount']");

	private By SpentAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtAmount']");

	private By VATRatetypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptRecord$ctl00$ddVATRate']");

	private By Allocate_toElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=53468&CompanyCode=13236&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=53468&CompanyCode=13236&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=53468&CompanyCode=13236&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=53468&CompanyCode=13236&menuid=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=53468&CompanyCode=13236&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Banking
     * @name Click Banking
     */
	public void Click_Banking()
	{
        
		WebElement elem = getWebElement(BankingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Banking", "Click_Banking failed. Unable to locate object: " + BankingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Banking", "Click_Banking failed. Unable to locate object: " + BankingElem.toString());

			Assert.fail("Unable to locate object: " + BankingElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Banking");

		TestModellerLogger.PassStep(m_Driver, "Click_Banking");
	}

     
	/**
 	 * Click New 
     * @name Click New 
     */
	public void Click_New_()
	{
        
		WebElement elem = getWebElement(New_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

			Assert.fail("Unable to locate object: " + New_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_");

		TestModellerLogger.PassStep(m_Driver, "Click_New_");
	}

     
	/**
 	 * Click New Transaction
     * @name Click New Transaction
     */
	public void Click_New_Transaction()
	{
        
		WebElement elem = getWebElement(New_TransactionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Transaction", "Click_New_Transaction failed. Unable to locate object: " + New_TransactionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Transaction", "Click_New_Transaction failed. Unable to locate object: " + New_TransactionElem.toString());

			Assert.fail("Unable to locate object: " + New_TransactionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Transaction");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Transaction");
	}

    
	/**
 	 * Select Account
     * @name Select Account
     */
    public void Select_Account(String Account)
 	{
 	    
 		WebElement elem = getWebElement(AccountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Account", "Select_Account failed. Unable to locate object: " + AccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Account", "Select_Account failed. Unable to locate object: " + AccountElem.toString());

 			Assert.fail("Unable to locate object: " + AccountElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Account);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Account " + Account);

 		TestModellerLogger.PassStep(m_Driver, "Select_Account " + Account);
 	}

      
	/**
 	 * Enter EnterDate
     * @name Enter EnterDate
     */
 	public void Enter_EnterDate(String EnterDate)
 	{
 	    
 		WebElement elem = getWebElement(EnterDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterDate", "Enter_EnterDate failed. Unable to locate object: " + EnterDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterDate", "Enter_EnterDate failed. Unable to locate object: " + EnterDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterDateElem.toString());
         }

 		elem.sendKeys(EnterDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterDate " + EnterDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterDate " + EnterDate);
 	}

      
	/**
 	 * Enter Description
     * @name Enter Description
     */
 	public void Enter_Description(String Description)
 	{
 	    
 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

      
	/**
 	 * Enter RecievedAmount
     * @name Enter RecievedAmount
     */
 	public void Enter_RecievedAmount(String RecievedAmount)
 	{
 	    
 		WebElement elem = getWebElement(RecievedAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RecievedAmount", "Enter_RecievedAmount failed. Unable to locate object: " + RecievedAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RecievedAmount", "Enter_RecievedAmount failed. Unable to locate object: " + RecievedAmountElem.toString());

 			Assert.fail("Unable to locate object: " + RecievedAmountElem.toString());
         }

 		elem.sendKeys(RecievedAmount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RecievedAmount " + RecievedAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RecievedAmount " + RecievedAmount);
 	}

      
	/**
 	 * Enter SpentAmount
     * @name Enter SpentAmount
     */
 	public void Enter_SpentAmount(String SpentAmount)
 	{
 	    
 		WebElement elem = getWebElement(SpentAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SpentAmount", "Enter_SpentAmount failed. Unable to locate object: " + SpentAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SpentAmount", "Enter_SpentAmount failed. Unable to locate object: " + SpentAmountElem.toString());

 			Assert.fail("Unable to locate object: " + SpentAmountElem.toString());
         }

 		elem.sendKeys(SpentAmount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SpentAmount " + SpentAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SpentAmount " + SpentAmount);
 	}

    
	/**
 	 * Select VATRatetype
     * @name Select VATRatetype
     */
    public void Select_VATRatetype(String VATRatetype)
 	{
 	    
 		WebElement elem = getWebElement(VATRatetypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRatetype", "Select_VATRatetype failed. Unable to locate object: " + VATRatetypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRatetype", "Select_VATRatetype failed. Unable to locate object: " + VATRatetypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATRatetypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATRatetype);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_VATRatetype " + VATRatetype);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRatetype " + VATRatetype);
 	}

     
	/**
 	 * Click Allocate to
     * @name Click Allocate to
     */
	public void Click_Allocate_to()
	{
        
		WebElement elem = getWebElement(Allocate_toElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Allocate_to", "Click_Allocate_to failed. Unable to locate object: " + Allocate_toElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Allocate_to", "Click_Allocate_to failed. Unable to locate object: " + Allocate_toElem.toString());

			Assert.fail("Unable to locate object: " + Allocate_toElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Allocate_to");

		TestModellerLogger.PassStep(m_Driver, "Click_Allocate_to");
	}
}