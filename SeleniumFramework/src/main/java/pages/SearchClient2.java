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
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d12caecf-93fa-44c3-bb99-f59752ceb900
@TestModellerModule(guid = "d12caecf-93fa-44c3-bb99-f59752ceb900")
public class SearchClient2 extends BasePage
{
	public SearchClient2 (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClientsClickElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By EnterClientNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By SearchButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ClickOnClientElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClientsClick
     * @name Click ClientsClick
     */
	public void Click_ClientsClick()
	{
        
		WebElement elem = getWebElement(ClientsClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

			Assert.fail("Unable to locate object: " + ClientsClickElem.toString());
        }

		ClosePopup.ValidateAndPopUp(m_Driver);
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClientsClick");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientsClick");
	}

      
	/**
 	 * Enter EnterClientName
     * @name Enter EnterClientName
     */
 	public void Enter_EnterClientName(String EnterClientName)
 	{
 	    
 		WebElement elem = getWebElement(EnterClientNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
         }

 		elem.sendKeys(EnterClientName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterClientName " + EnterClientName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterClientName " + EnterClientName);
 	}

     
	/**
 	 * Click SearchButton
     * @name Click SearchButton
     */
	public void Click_SearchButton()
	{
        
		WebElement elem = getWebElement(SearchButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

			Assert.fail("Unable to locate object: " + SearchButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SearchButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchButton");
	}

     
	/**
 	 * Click ClickOnClient
     * @name Click ClickOnClient
     */
	public void Click_ClickOnClient()
	{
        
		WebElement elem = getWebElement(ClickOnClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnClient", "Click_ClickOnClient failed. Unable to locate object: " + ClickOnClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnClient", "Click_ClickOnClient failed. Unable to locate object: " + ClickOnClientElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnClientElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickOnClient");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnClient");
	}
}