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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/45647912-58a3-4564-ae30-eab355281c35
@TestModellerModule(guid = "45647912-58a3-4564-ae30-eab355281c35")
public class clickContinue extends BasePage
{
	public clickContinue (WebDriver driver)
	{
		super(driver);
	}


	
	private By YesElem = By.xpath("//label[contains(.,'Yes')]/../input");

	private By clickContinueElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Yes
     * @name Click Yes
     */
	public void Click_Yes()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(YesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Yes", "Click_Yes failed. Unable to locate object: " + YesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Yes", "Click_Yes failed. Unable to locate object: " + YesElem.toString());

			Assert.fail("Unable to locate object: " + YesElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Yes");

		TestModellerLogger.PassStep(m_Driver, "Click_Yes");
	}

     
	/**
 	 * Click clickContinue
     * @name Click clickContinue
     */
	public void Click_clickContinue()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(clickContinueElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickContinue", "Click_clickContinue failed. Unable to locate object: " + clickContinueElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickContinue", "Click_clickContinue failed. Unable to locate object: " + clickContinueElem.toString());

			Assert.fail("Unable to locate object: " + clickContinueElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickContinue");

		TestModellerLogger.PassStep(m_Driver, "Click_clickContinue");
	}
}