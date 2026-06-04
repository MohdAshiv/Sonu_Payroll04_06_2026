package _2105Email;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b6a74d07-8921-41d3-b46c-f9bf8d8ddb8a
@TestModellerModule(guid = "b6a74d07-8921-41d3-b46c-f9bf8d8ddb8a")
public class AgentEmailSetting extends BasePage
{
	public AgentEmailSetting (WebDriver driver)
	{
		super(driver);
	}


	
	private By AgentSettingsElem = By.xpath("//A[@href='AgentSetup.aspx']");

	private By Email_SettingsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_TbpnlEmailSetting']");

	private By SMTPConfigCodeElem = By.xpath("//label[normalize-space()= 'SMTP Config Code:']/../../div[2]/select");

	private By SaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TbpnlEmailSetting_btnSaveSMTP']");

	private By SMTPServerElem = By.xpath("//label[normalize-space()= 'SMTP Server: *']/../../div[2]/input");

	private By SMTPPortElem = By.xpath("//label[normalize-space()= 'SMTP Port: *']/../../div[2]/input");

	private By SMTPNameElem = By.xpath("//label[normalize-space()= 'SMTP Username: *']/../../div[2]/input");

	private By SMTPPassElem = By.xpath("//label[normalize-space()= 'SMTP Password: *']/../../div[2]/input");

	private By EmailFromElem = By.xpath("//label[normalize-space()= 'Email From Address: *']/../../div[2]/input");

	private By EmailReplyToElem = By.xpath("//label[normalize-space()= 'Email Reply to Address: *']/../../div[2]/input");

	private By SSLElem = By.xpath("//label[normalize-space()= 'SSL:']/../../div[2]/select");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandboxpre.nomismasolution.co.uk/AgentUI/AgentSetup.aspx?mopt=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AgentUI/AgentSetup.aspx?mopt=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandboxpre.nomismasolution.co.uk/AgentUI/AgentSetup.aspx?mopt=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandboxpre.nomismasolution.co.uk/AgentUI/AgentSetup.aspx?mopt=3";

        if (!currentUrl.equals("http://sandboxpre.nomismasolution.co.uk/AgentUI/AgentSetup.aspx?mopt=3")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click AgentSettings
     * @name Click AgentSettings
     */
	public void Click_AgentSettings()
	{
        
		WebElement elem = getWebElement(AgentSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AgentSettings", "Click_AgentSettings failed. Unable to locate object: " + AgentSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AgentSettings", "Click_AgentSettings failed. Unable to locate object: " + AgentSettingsElem.toString());

			Assert.fail("Unable to locate object: " + AgentSettingsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AgentSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_AgentSettings");
	}

     
	/**
 	 * Click Email Settings
     * @name Click Email Settings
     */
	public void Click_Email_Settings()
	{
        
		WebElement elem = getWebElement(Email_SettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Email_Settings", "Click_Email_Settings failed. Unable to locate object: " + Email_SettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Email_Settings", "Click_Email_Settings failed. Unable to locate object: " + Email_SettingsElem.toString());

			Assert.fail("Unable to locate object: " + Email_SettingsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Email_Settings");

		TestModellerLogger.PassStep(m_Driver, "Click_Email_Settings");
	}

    
	/**
 	 * Select SMTPConfigCode
	 * @throws InterruptedException 
     * @name Select SMTPConfigCode
     */
    public void Select_SMTPConfigCode(String SMTPConfigCode) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SMTPConfigCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SMTPConfigCode", "Select_SMTPConfigCode failed. Unable to locate object: " + SMTPConfigCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SMTPConfigCode", "Select_SMTPConfigCode failed. Unable to locate object: " + SMTPConfigCodeElem.toString());

 			Assert.fail("Unable to locate object: " + SMTPConfigCodeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SMTPConfigCode);
 		
 		Thread.sleep(2000);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SMTPConfigCode " + SMTPConfigCode);

 		TestModellerLogger.PassStep(m_Driver, "Select_SMTPConfigCode " + SMTPConfigCode);
 	}

     
	/**
 	 * Click Save
     * @name Click Save
     */
	public void Click_Save()
	{
        
		WebElement elem = getWebElement(SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

			Assert.fail("Unable to locate object: " + SaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Save");
	}

      
	/**
 	 * Enter SMTPServer
     * @name Enter SMTPServer
     */
 	public void Enter_SMTPServer(String SMTPServer)
 	{
 	    
 		WebElement elem = getWebElement(SMTPServerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SMTPServer", "Enter_SMTPServer failed. Unable to locate object: " + SMTPServerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SMTPServer", "Enter_SMTPServer failed. Unable to locate object: " + SMTPServerElem.toString());

 			Assert.fail("Unable to locate object: " + SMTPServerElem.toString());
         }

 		elem.sendKeys(SMTPServer);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SMTPServer " + SMTPServer);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SMTPServer " + SMTPServer);
 	}

      
	/**
 	 * Enter SMTPPort
     * @name Enter SMTPPort
     */
 	public void Enter_SMTPPort(String SMTPPort)
 	{
 	    
 		WebElement elem = getWebElement(SMTPPortElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SMTPPort", "Enter_SMTPPort failed. Unable to locate object: " + SMTPPortElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SMTPPort", "Enter_SMTPPort failed. Unable to locate object: " + SMTPPortElem.toString());

 			Assert.fail("Unable to locate object: " + SMTPPortElem.toString());
         }

 		elem.sendKeys(SMTPPort);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SMTPPort " + SMTPPort);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SMTPPort " + SMTPPort);
 	}

      
	/**
 	 * Enter SMTPName
     * @name Enter SMTPName
     */
 	public void Enter_SMTPName(String SMTPName)
 	{
 	    
 		WebElement elem = getWebElement(SMTPNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SMTPName", "Enter_SMTPName failed. Unable to locate object: " + SMTPNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SMTPName", "Enter_SMTPName failed. Unable to locate object: " + SMTPNameElem.toString());

 			Assert.fail("Unable to locate object: " + SMTPNameElem.toString());
         }

 		elem.sendKeys(SMTPName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SMTPName " + SMTPName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SMTPName " + SMTPName);
 	}

      
	/**
 	 * Enter SMTPPass
     * @name Enter SMTPPass
     */
 	public void Enter_SMTPPass(String SMTPPass)
 	{
 	    
 		WebElement elem = getWebElement(SMTPPassElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SMTPPass", "Enter_SMTPPass failed. Unable to locate object: " + SMTPPassElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SMTPPass", "Enter_SMTPPass failed. Unable to locate object: " + SMTPPassElem.toString());

 			Assert.fail("Unable to locate object: " + SMTPPassElem.toString());
         }

 		elem.sendKeys(SMTPPass);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SMTPPass " + SMTPPass);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SMTPPass " + SMTPPass);
 	}

      
	/**
 	 * Enter EmailFrom
     * @name Enter EmailFrom
     */
 	public void Enter_EmailFrom(String EmailFrom)
 	{
 	    
 		WebElement elem = getWebElement(EmailFromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmailFrom", "Enter_EmailFrom failed. Unable to locate object: " + EmailFromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmailFrom", "Enter_EmailFrom failed. Unable to locate object: " + EmailFromElem.toString());

 			Assert.fail("Unable to locate object: " + EmailFromElem.toString());
         }

 		elem.sendKeys(EmailFrom);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmailFrom " + EmailFrom);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmailFrom " + EmailFrom);
 	}

      
	/**
 	 * Enter EmailReplyTo
     * @name Enter EmailReplyTo
     */
 	public void Enter_EmailReplyTo(String EmailReplyTo)
 	{
 	    
 		WebElement elem = getWebElement(EmailReplyToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmailReplyTo", "Enter_EmailReplyTo failed. Unable to locate object: " + EmailReplyToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmailReplyTo", "Enter_EmailReplyTo failed. Unable to locate object: " + EmailReplyToElem.toString());

 			Assert.fail("Unable to locate object: " + EmailReplyToElem.toString());
         }

 		elem.sendKeys(EmailReplyTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmailReplyTo " + EmailReplyTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmailReplyTo " + EmailReplyTo);
 	}

    
	/**
 	 * Select SSL
     * @name Select SSL
     */
    public void Select_SSL(String SSL)
 	{
 	    
 		WebElement elem = getWebElement(SSLElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SSL", "Select_SSL failed. Unable to locate object: " + SSLElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SSL", "Select_SSL failed. Unable to locate object: " + SSLElem.toString());

 			Assert.fail("Unable to locate object: " + SSLElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SSL);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SSL " + SSL);

 		TestModellerLogger.PassStep(m_Driver, "Select_SSL " + SSL);
 	}
}