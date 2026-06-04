package _2087EmailLogPage;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/90829270-81dc-4a88-aa38-386c1f10a9ce
@TestModellerModule(guid = "90829270-81dc-4a88-aa38-386c1f10a9ce")
public class _2087EmailLogP60 extends BasePage
{
	public _2087EmailLogP60 (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By P60P45P11D_FormsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");

	private By selectEmailToElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$EmailType']");

	private By clickEmailElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkPayslips']");

	private By _Send_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By clickElem = By.cssSelector("BUTTON[aria-label='Close']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15458&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15458&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15458&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15458&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15458&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click P60/P45/P11D Forms
     * @name Click P60/P45/P11D Forms
     */
	public void Click_P60P45P11D_Forms()
	{
        
		WebElement elem = getWebElement(P60P45P11D_FormsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_P60P45P11D_Forms", "Click_P60P45P11D_Forms failed. Unable to locate object: " + P60P45P11D_FormsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_P60P45P11D_Forms", "Click_P60P45P11D_Forms failed. Unable to locate object: " + P60P45P11D_FormsElem.toString());

			Assert.fail("Unable to locate object: " + P60P45P11D_FormsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_P60P45P11D_Forms");

		TestModellerLogger.PassStep(m_Driver, "Click_P60P45P11D_Forms");
	}

    
	/**
 	 * Select selectEmailTo
     * @name Select selectEmailTo
     */
    public void Select_selectEmailTo(String selectEmailTo)
 	{
 	    
 		WebElement elem = getWebElement(selectEmailToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectEmailTo", "Select_selectEmailTo failed. Unable to locate object: " + selectEmailToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectEmailTo", "Select_selectEmailTo failed. Unable to locate object: " + selectEmailToElem.toString());

 			Assert.fail("Unable to locate object: " + selectEmailToElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectEmailTo);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectEmailTo " + selectEmailTo);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectEmailTo " + selectEmailTo);
 	}

     
	/**
 	 * Click clickEmail
     * @name Click clickEmail
     */
	public void Click_clickEmail()
	{
        
		WebElement elem = getWebElement(clickEmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEmail", "Click_clickEmail failed. Unable to locate object: " + clickEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEmail", "Click_clickEmail failed. Unable to locate object: " + clickEmailElem.toString());

			Assert.fail("Unable to locate object: " + clickEmailElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEmail");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEmail");
	}

     
	/**
 	 * Click  Send 
     * @name Click  Send 
     */
	public void Click__Send_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[7]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Send_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

			Assert.fail("Unable to locate object: " + _Send_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Send_");

		TestModellerLogger.PassStep(m_Driver, "Click__Send_");
	}

     
	/**
 	 * Click click×
     * @name Click click×
     */
	public void Click_click()
	{
        
		WebElement elem = getWebElement(clickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_click", "Click_click failed. Unable to locate object: " + clickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_click", "Click_click failed. Unable to locate object: " + clickElem.toString());

			Assert.fail("Unable to locate object: " + clickElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_click");

		TestModellerLogger.PassStep(m_Driver, "Click_click");
	}
}