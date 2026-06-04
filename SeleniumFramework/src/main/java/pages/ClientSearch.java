package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6b0f6663-dfe9-466f-bbfc-c0189ddf4b13
@TestModellerModule(guid = "6b0f6663-dfe9-466f-bbfc-c0189ddf4b13")
public class ClientSearch extends BasePage
{
	public ClientSearch (WebDriver driver)
	{
		super(driver);
	}


	
	private By SearchClientElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ClickSearchButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ClickOnClientWorkbookElem = By.xpath("//TR[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/TD/SPAN[@class='border-btm-dotted']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52653&CompanyCode=13420&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52653&CompanyCode=13420&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52653&CompanyCode=13420&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52653&CompanyCode=13420&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52653&CompanyCode=13420&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter SearchClient
     * @name Enter SearchClient
     */
 	public void Enter_SearchClient(String SearchClient)
 	{
 	    
 		WebElement elem = getWebElement(SearchClientElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchClient", "Enter_SearchClient failed. Unable to locate object: " + SearchClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchClient", "Enter_SearchClient failed. Unable to locate object: " + SearchClientElem.toString());

 			Assert.fail("Unable to locate object: " + SearchClientElem.toString());
         }

 		elem.sendKeys(SearchClient);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchClient " + SearchClient);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchClient " + SearchClient);
 	}

     
	/**
 	 * Click ClickSearchButton
     * @name Click ClickSearchButton
     */
	public void Click_ClickSearchButton()
	{
        
		WebElement elem = getWebElement(ClickSearchButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSearchButton", "Click_ClickSearchButton failed. Unable to locate object: " + ClickSearchButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSearchButton", "Click_ClickSearchButton failed. Unable to locate object: " + ClickSearchButtonElem.toString());

			Assert.fail("Unable to locate object: " + ClickSearchButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSearchButton");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSearchButton");
	}

     
	/**
 	 * Click ClickOnClientWorkbook
     * @name Click ClickOnClientWorkbook
     */
	public void Click_ClickOnClientWorkbook()
	{
        
		WebElement elem = getWebElement(ClickOnClientWorkbookElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnClientWorkbook", "Click_ClickOnClientWorkbook failed. Unable to locate object: " + ClickOnClientWorkbookElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnClientWorkbook", "Click_ClickOnClientWorkbook failed. Unable to locate object: " + ClickOnClientWorkbookElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnClientWorkbookElem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnClientWorkbook");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnClientWorkbook");
	}
}