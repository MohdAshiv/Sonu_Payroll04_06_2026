package pages1;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6cdb8260-0a2d-4ba5-b9af-14bc3353f09b
@TestModellerModule(guid = "6cdb8260-0a2d-4ba5-b9af-14bc3353f09b")
public class AddContractorInCIS extends BasePage
{
	public AddContractorInCIS (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickAddContractorElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnAdd']");

	private By ContractorNameElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtContractorName']");

	private By ContractoeFirstNameElem = By.xpath("//label[contains(.,'First Name')]/../../div[2]/input");

	private By ContractorSurNameElem = By.xpath("//label[contains(.,'Last Name')]/../../div[2]/input");

	private By ContractorRefNoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtContractorRefNo']");

	private By HMRCOfficeNoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtOfficeNo']");

	private By AccountOffRefNoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAccountOffRefNo']");

	private By UtrNoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUtrNo']");

	private By PhoneNoElem = By.xpath("//label[contains(.,'Phone No.')]/../../div[2]/input");

	private By EmailIdElem = By.xpath("//label[contains(.,'Email Id')]/../../div[2]/input");

	private By Address1Elem = By.xpath("//label[contains(.,'Address')]/../../div[2]/input");

	private By Address2Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtAddress2']");

	private By PostCodeElem = By.xpath("//label[contains(.,'PostCode')]/../../div[2]/input");

	private By ClickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickAddContractor
     * @name Click ClickAddContractor
     */
	public void Click_ClickAddContractor()
	{
        
		WebElement elem = getWebElement(ClickAddContractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickAddContractor", "Click_ClickAddContractor failed. Unable to locate object: " + ClickAddContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickAddContractor", "Click_ClickAddContractor failed. Unable to locate object: " + ClickAddContractorElem.toString());

			Assert.fail("Unable to locate object: " + ClickAddContractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickAddContractor");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickAddContractor");
	}

      
	/**
 	 * Enter ContractorName
	 * @throws InterruptedException 
     * @name Enter ContractorName
     */
 	public void Enter_ContractorName(String ContractorName) throws InterruptedException
 	{
 		 Thread.sleep(2000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//div[contains(@id,'addcontratormodal1')]//iframe")));

 		WebElement elem = getWebElement(ContractorNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorName", "Enter_ContractorName failed. Unable to locate object: " + ContractorNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorName", "Enter_ContractorName failed. Unable to locate object: " + ContractorNameElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorNameElem.toString());
         }
 		 Thread.sleep(2000);
 		elem.sendKeys(ContractorName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorName " + ContractorName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorName " + ContractorName);
 	}

      
	/**
 	 * Enter ContractoeFirstName
     * @name Enter ContractoeFirstName
     */
 	public void Enter_ContractoeFirstName(String ContractoeFirstName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ContractoeFirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractoeFirstName", "Enter_ContractoeFirstName failed. Unable to locate object: " + ContractoeFirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractoeFirstName", "Enter_ContractoeFirstName failed. Unable to locate object: " + ContractoeFirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + ContractoeFirstNameElem.toString());
         }

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
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

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
 	 * Enter ContractorRefNo
     * @name Enter ContractorRefNo
     */
 	public void Enter_ContractorRefNo(String ContractorRefNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ContractorRefNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorRefNo", "Enter_ContractorRefNo failed. Unable to locate object: " + ContractorRefNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorRefNo", "Enter_ContractorRefNo failed. Unable to locate object: " + ContractorRefNoElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorRefNoElem.toString());
         }

 		elem.sendKeys(ContractorRefNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorRefNo " + ContractorRefNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorRefNo " + ContractorRefNo);
 	}

      
	/**
 	 * Enter HMRCOfficeNo
     * @name Enter HMRCOfficeNo
     */
 	public void Enter_HMRCOfficeNo(String HMRCOfficeNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(HMRCOfficeNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HMRCOfficeNo", "Enter_HMRCOfficeNo failed. Unable to locate object: " + HMRCOfficeNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_HMRCOfficeNo", "Enter_HMRCOfficeNo failed. Unable to locate object: " + HMRCOfficeNoElem.toString());

 			Assert.fail("Unable to locate object: " + HMRCOfficeNoElem.toString());
         }

 		elem.sendKeys(HMRCOfficeNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_HMRCOfficeNo " + HMRCOfficeNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_HMRCOfficeNo " + HMRCOfficeNo);
 	}

      
	/**
 	 * Enter AccountOffRefNo
     * @name Enter AccountOffRefNo
     */
 	public void Enter_AccountOffRefNo(String AccountOffRefNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(AccountOffRefNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AccountOffRefNo", "Enter_AccountOffRefNo failed. Unable to locate object: " + AccountOffRefNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AccountOffRefNo", "Enter_AccountOffRefNo failed. Unable to locate object: " + AccountOffRefNoElem.toString());

 			Assert.fail("Unable to locate object: " + AccountOffRefNoElem.toString());
         }

 		elem.sendKeys(AccountOffRefNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AccountOffRefNo " + AccountOffRefNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AccountOffRefNo " + AccountOffRefNo);
 	}

      
	/**
 	 * Enter UtrNo
     * @name Enter UtrNo
     */
 	public void Enter_UtrNo(String UtrNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

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
 	 * Enter PhoneNo
     * @name Enter PhoneNo
     */
 	public void Enter_PhoneNo(String PhoneNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PhoneNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PhoneNo", "Enter_PhoneNo failed. Unable to locate object: " + PhoneNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PhoneNo", "Enter_PhoneNo failed. Unable to locate object: " + PhoneNoElem.toString());

 			Assert.fail("Unable to locate object: " + PhoneNoElem.toString());
         }

 		elem.sendKeys(PhoneNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PhoneNo " + PhoneNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PhoneNo " + PhoneNo);
 	}

      
	/**
 	 * Enter EmailId
     * @name Enter EmailId
     */
 	public void Enter_EmailId(String EmailId)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EmailIdElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmailId", "Enter_EmailId failed. Unable to locate object: " + EmailIdElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmailId", "Enter_EmailId failed. Unable to locate object: " + EmailIdElem.toString());

 			Assert.fail("Unable to locate object: " + EmailIdElem.toString());
         }

 		elem.sendKeys(EmailId);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmailId " + EmailId);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmailId " + EmailId);
 	}

      
	/**
 	 * Enter Address1
     * @name Enter Address1
     */
 	public void Enter_Address1(String Address1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Address1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

 			Assert.fail("Unable to locate object: " + Address1Elem.toString());
         }

 		elem.sendKeys(Address1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address1 " + Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address1 " + Address1);
 	}

      
	/**
 	 * Enter Address2
     * @name Enter Address2
     */
 	public void Enter_Address2(String Address2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Address2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

 			Assert.fail("Unable to locate object: " + Address2Elem.toString());
         }

 		elem.sendKeys(Address2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address2 " + Address2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address2 " + Address2);
 	}

      
	/**
 	 * Enter PostCode
     * @name Enter PostCode
     */
 	public void Enter_PostCode(String PostCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + PostCodeElem.toString());
         }

 		elem.sendKeys(PostCode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode " + PostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode " + PostCode);
 	}

     
	/**
 	 * Click ClickSave
	 * @throws Exception 
     * @name Click ClickSave
     */
	public void Click_ClickSave() throws Exception
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(ClickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

			Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	
		TakeScreenshot.takeScreenshot(m_Driver, "ContractorAdded");

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
	}
}