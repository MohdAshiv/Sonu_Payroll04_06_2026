package pages1;

import pages.BasePage;

import java.awt.List;
import java.util.ArrayList;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/09279e2e-a5d6-42d3-9573-35caaaf39aa6
@TestModellerModule(guid = "09279e2e-a5d6-42d3-9573-35caaaf39aa6")
public class createContractorInCIS extends BasePage
{
	public createContractorInCIS (WebDriver driver)
	{
		super(driver);
	}


	
	private By CreateontractorElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$btnCreate']");

	private By ContractoeFirstNameElem = By.xpath("//label[contains(.,'First Name:')]/../../div[2]/input");

	private By ContractorSurNameElem = By.xpath("//label[contains(.,'Last Name:')]/../../div[2]/input");

	private By UtrNoElem = By.xpath("//label[contains(.,'Contractor UTR No: *')]/../../div[2]/input");

	private By SaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52693&CompanyCode=13460&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52693&CompanyCode=13460&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52693&CompanyCode=13460&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52693&CompanyCode=13460&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52693&CompanyCode=13460&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Createontractor
	 * @throws InterruptedException 
     * @name Click Createontractor
     */
	public void Click_Createontractor() throws InterruptedException
	{
		java.util.List<WebElement> li=new ArrayList<WebElement>();
		
        li=m_Driver.findElements(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe"));
        int size=li.size();
        System.out.println("This is size "+size);
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(CreateontractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Createontractor", "Click_Createontractor failed. Unable to locate object: " + CreateontractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Createontractor", "Click_Createontractor failed. Unable to locate object: " + CreateontractorElem.toString());

			Assert.fail("Unable to locate object: " + CreateontractorElem.toString());
        }

		elem.click();
		Thread.sleep(2000);
//		m_Driver.switchTo().frame("//iframe[@name='1619076892406']");
		System.out.println("Hello");
		 	
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Createontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_Createontractor");
	}

      
	/**
 	 * Enter ContractoeFirstName
	 * @throws InterruptedException 
     * @name Enter ContractoeFirstName
     */
 	public void Enter_ContractoeFirstName(String ContractoeFirstName) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@name='1619076892406']")));

 		WebElement elem = getWebElement(ContractoeFirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractoeFirstName", "Enter_ContractoeFirstName failed. Unable to locate object: " + ContractoeFirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractoeFirstName", "Enter_ContractoeFirstName failed. Unable to locate object: " + ContractoeFirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + ContractoeFirstNameElem.toString());
         }
 		Thread.sleep(1000);
 		System.out.println("Hello");
 		elem.sendKeys(ContractoeFirstName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractoeFirstName " + ContractoeFirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractoeFirstName " + ContractoeFirstName);
 	}

      
	/**
 	 * Enter ContractorSurName
     * @name Enter ContractorSurName
     */
 	public void Enter_ContractorSurName(String ContractorSurName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ContractorSurNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorSurName", "Enter_ContractorSurName failed. Unable to locate object: " + ContractorSurNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorSurName", "Enter_ContractorSurName failed. Unable to locate object: " + ContractorSurNameElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorSurNameElem.toString());
         }

 		elem.sendKeys(ContractorSurName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorSurName " + ContractorSurName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorSurName " + ContractorSurName);
 	}

      
	/**
 	 * Enter UtrNo
     * @name Enter UtrNo
     */
 	public void Enter_UtrNo(String UtrNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(UtrNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UtrNo", "Enter_UtrNo failed. Unable to locate object: " + UtrNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UtrNo", "Enter_UtrNo failed. Unable to locate object: " + UtrNoElem.toString());

 			Assert.fail("Unable to locate object: " + UtrNoElem.toString());
         }

 		elem.sendKeys(UtrNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UtrNo " + UtrNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UtrNo " + UtrNo);
 	}

     
	/**
 	 * Click Save
     * @name Click Save
     */
	public void Click_Save()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

			Assert.fail("Unable to locate object: " + SaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Save");
	}
}