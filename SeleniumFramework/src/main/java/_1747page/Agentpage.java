package _1747page;

import pages.BasePage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1aec4437-81df-4808-9416-880acf2b7ff6
@TestModellerModule(guid = "1aec4437-81df-4808-9416-880acf2b7ff6")
public class Agentpage extends BasePage
{
	public Agentpage (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By SearchElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Demo_Elem = By.xpath("//*[@id='ctl00_divSubContent']/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter ctl00$cPHFilter$txtAgentName
	 * @throws InterruptedException 
     * @name Enter ctl00$cPHFilter$txtAgentName
     */
 	public void Enter_ctl00cPHFiltertxtAgentName(String ctl00cPHFiltertxtAgentName) throws InterruptedException
 	{

 		WebElement elem = getWebElement(ctl00cPHFiltertxtAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());
         }
 		
 		
 		elem.sendKeys(ctl00cPHFiltertxtAgentName);
// 		m_Driver.navigate().refresh();
 		
 		Thread.sleep(1000);
 		
 		ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);
 	}

     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
         	

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}

     
	/**
 	 * Click  Demo 
     * @name Click  Demo 
     */
	public void Click__Demo_()
	{
        
		WebElement elem = getWebElement(_Demo_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Demo_", "Click__Demo_ failed. Unable to locate object: " + _Demo_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Demo_", "Click__Demo_ failed. Unable to locate object: " + _Demo_Elem.toString());

			Assert.fail("Unable to locate object: " + _Demo_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Demo_");

		TestModellerLogger.PassStep(m_Driver, "Click__Demo_");
	}


	public void Switch_Tab()
    {
        ArrayList<String> tabs = new ArrayList<String>(m_Driver.getWindowHandles());

        m_Driver.switchTo().window(tabs.get(tabs.size() - 1));
    }}