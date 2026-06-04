package _1939_page;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/019a5098-65bc-4672-89be-7bc609ee51e0
@TestModellerModule(guid = "019a5098-65bc-4672-89be-7bc609ee51e0")
public class AgentsSetting extends BasePage
{
	public AgentsSetting (WebDriver driver)
	{
		super(driver); 
	}


	
	private By ClickAgentSettingsElem = By.xpath("//A[@href='AgentSetup.aspx']");

	private By clickPayrollElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpnPayroll']");

	private By ClicktoAddDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpnPayroll']/div/div/div/table/tbody/tr[6]/td[4]/a/i");

	private By EnterAutoRunDateElem = By.xpath("//label[contains(.,'Key Value (Date)')]/../../div[2]/input");

	private By ClickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/agentsetup.aspx?g=Advisor&mopt=11");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/agentsetup.aspx?g=Advisor&mopt=11");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/agentsetup.aspx?g=Advisor&mopt=11");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/agentsetup.aspx?g=Advisor&mopt=11";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/agentsetup.aspx?g=Advisor&mopt=11")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickAgentSettings
	 * @throws InterruptedException 
     * @name Click ClickAgentSettings
     */
	public void Click_ClickAgentSettings() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickAgentSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickAgentSettings", "Click_ClickAgentSettings failed. Unable to locate object: " + ClickAgentSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickAgentSettings", "Click_ClickAgentSettings failed. Unable to locate object: " + ClickAgentSettingsElem.toString());

			Assert.fail("Unable to locate object: " + ClickAgentSettingsElem.toString());
        }
	//	Thread.sleep(15000);
		ClosePopup.ValidateAndPopUp(m_Driver);

		elem.click();
		
		ClosePopup.ValidateAndPopUp(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickAgentSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickAgentSettings");
	}

     
	/**
 	 * Click clickPayroll
     * @name Click clickPayroll
     */
	public void Click_clickPayroll()
	{
        
		WebElement elem = getWebElement(clickPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayroll", "Click_clickPayroll failed. Unable to locate object: " + clickPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayroll", "Click_clickPayroll failed. Unable to locate object: " + clickPayrollElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayroll");
	}

     
	/**
 	 * Click ClicktoAddDate
     * @name Click ClicktoAddDate
     */
	public void Click_ClicktoAddDate()
	{
        
		WebElement elem = getWebElement(ClicktoAddDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClicktoAddDate", "Click_ClicktoAddDate failed. Unable to locate object: " + ClicktoAddDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClicktoAddDate", "Click_ClicktoAddDate failed. Unable to locate object: " + ClicktoAddDateElem.toString());

			Assert.fail("Unable to locate object: " + ClicktoAddDateElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClicktoAddDate");

		TestModellerLogger.PassStep(m_Driver, "Click_ClicktoAddDate");
	}

      
	/**
 	 * Enter EnterAutoRunDate
     * @name Enter EnterAutoRunDate
     */
 	public void Enter_EnterAutoRunDate(String EnterAutoRunDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(EnterAutoRunDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterAutoRunDate", "Enter_EnterAutoRunDate failed. Unable to locate object: " + EnterAutoRunDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterAutoRunDate", "Enter_EnterAutoRunDate failed. Unable to locate object: " + EnterAutoRunDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterAutoRunDateElem.toString());
         }
 		
 		elem.clear();

 		elem.sendKeys(EnterAutoRunDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterAutoRunDate " + EnterAutoRunDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterAutoRunDate " + EnterAutoRunDate);
 	}
 	
 	
 	
	/**
 	 * Enter EnterAutoRunDate
     * @name Enter EnterAutoRunDate
     */
 	public void Enter_EnterAutoRunDate2(String EnterAutoRunDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(EnterAutoRunDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterAutoRunDate", "Enter_EnterAutoRunDate failed. Unable to locate object: " + EnterAutoRunDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterAutoRunDate", "Enter_EnterAutoRunDate failed. Unable to locate object: " + EnterAutoRunDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterAutoRunDateElem.toString());
         }
 		
 		elem.clear();

 		elem.sendKeys(EnterAutoRunDate);
 		
 		elem.clear();
 		

 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterAutoRunDate " + EnterAutoRunDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterAutoRunDate " + EnterAutoRunDate);
 	}

     
	/**
 	 * Click ClickSave
     * @name Click ClickSave
     */
	public void Click_ClickSave()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ClickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

			Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		
	//	TakeScreenshot.takeScreenshot(m_Driver, "Blank Auto Run");
  	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
	}
	
	
	
	/**
 	 * Click ClickSave
	 * @throws Exception 
     * @name Click ClickSave
     */
	public void Click_ClickSave1() throws Exception
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ClickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

			Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		
		TakeScreenshot.takeScreenshot(m_Driver, "Blank Auto Run at Agent");
  	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
	}
}