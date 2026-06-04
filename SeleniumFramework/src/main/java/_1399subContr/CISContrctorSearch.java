package _1399subContr;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9fb85636-f5c7-4ed4-88ba-a0ed02e0aa2c
@TestModellerModule(guid = "9fb85636-f5c7-4ed4-88ba-a0ed02e0aa2c")
public class CISContrctorSearch extends BasePage
{
	public CISContrctorSearch (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickCISElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_CIS']/A");

	private By clickContractorListElem = By.xpath("//A[contains(text(),'Contractor List')]");

	private By EnterContractorNameElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchContractorName']");

	private By SearchContractornameElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ClickoncontractorElem = By.xpath("//A[contains(text(),'1399')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx")) {
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
		
		ClosePopup.ValidateAndPopUp(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickCIS");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCIS");
	}

     
	/**
 	 * Click clickContractorList
     * @name Click clickContractorList
     */
	public void Click_clickContractorList()
	{
        
		WebElement elem = getWebElement(clickContractorListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickContractorList", "Click_clickContractorList failed. Unable to locate object: " + clickContractorListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickContractorList", "Click_clickContractorList failed. Unable to locate object: " + clickContractorListElem.toString());

			Assert.fail("Unable to locate object: " + clickContractorListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickContractorList");

		TestModellerLogger.PassStep(m_Driver, "Click_clickContractorList");
	}

      
	/**
 	 * Enter EnterContractorName
     * @name Enter EnterContractorName
     */
 	public void Enter_EnterContractorName(String EnterContractorName)
 	{
 	    
 		WebElement elem = getWebElement(EnterContractorNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterContractorName", "Enter_EnterContractorName failed. Unable to locate object: " + EnterContractorNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterContractorName", "Enter_EnterContractorName failed. Unable to locate object: " + EnterContractorNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterContractorNameElem.toString());
         }

 		elem.sendKeys(EnterContractorName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterContractorName " + EnterContractorName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterContractorName " + EnterContractorName);
 	}

     
	/**
 	 * Click SearchContractorname
     * @name Click SearchContractorname
     */
	public void Click_SearchContractorname()
	{
        
		WebElement elem = getWebElement(SearchContractornameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchContractorname", "Click_SearchContractorname failed. Unable to locate object: " + SearchContractornameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchContractorname", "Click_SearchContractorname failed. Unable to locate object: " + SearchContractornameElem.toString());

			Assert.fail("Unable to locate object: " + SearchContractornameElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SearchContractorname");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchContractorname");
	}

     
	/**
 	 * Click Clickoncontractor
     * @name Click Clickoncontractor
     */
	public void Click_Clickoncontractor()
	{
        
		WebElement elem = getWebElement(ClickoncontractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clickoncontractor", "Click_Clickoncontractor failed. Unable to locate object: " + ClickoncontractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clickoncontractor", "Click_Clickoncontractor failed. Unable to locate object: " + ClickoncontractorElem.toString());

			Assert.fail("Unable to locate object: " + ClickoncontractorElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clickoncontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_Clickoncontractor");
	}
}