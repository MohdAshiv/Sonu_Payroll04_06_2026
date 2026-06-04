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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9fd5ada3-9bf4-4110-a640-156208700151
@TestModellerModule(guid = "9fd5ada3-9bf4-4110-a640-156208700151")
public class CISDashboard extends BasePage
{
	public CISDashboard (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickCISElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_CIS']/A");

	private By gotoCISDashboardElem = By.xpath("//A[contains(text(),'CIS Dashboard')]");


	
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
 	 * Click clickCIS
     * @name Click clickCIS
     */
	public void Click_clickCIS()
	{
        
		WebElement elem = getWebElement(clickCISElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickCIS", "Click_clickCIS failed. Unable to locate object: " + clickCISElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickCIS", "Click_clickCIS failed. Unable to locate object: " + clickCISElem.toString());

			Assert.fail("Unable to locate object: " + clickCISElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickCIS");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCIS");
	}

     
	/**
 	 * Click gotoCISDashboard
     * @name Click gotoCISDashboard
     */
	public void Click_gotoCISDashboard()
	{
        
		WebElement elem = getWebElement(gotoCISDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoCISDashboard", "Click_gotoCISDashboard failed. Unable to locate object: " + gotoCISDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoCISDashboard", "Click_gotoCISDashboard failed. Unable to locate object: " + gotoCISDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoCISDashboardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoCISDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoCISDashboard");
	}
}