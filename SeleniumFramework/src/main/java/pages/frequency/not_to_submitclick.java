package pages.frequency;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2087e80a-3bdd-4072-9e86-55dbc9e7ae5f
@TestModellerModule(guid = "2087e80a-3bdd-4072-9e86-55dbc9e7ae5f")
public class not_to_submitclick extends BasePage
{
	public not_to_submitclick (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickNot_to_submitElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11951");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11951");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11951");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11951";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11951")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickNot to submit
     * @name Click clickNot to submit
     */
	public void Click_clickNot_to_submit()
	{
        
		WebElement elem = getWebElement(clickNot_to_submitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickNot_to_submit", "Click_clickNot_to_submit failed. Unable to locate object: " + clickNot_to_submitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickNot_to_submit", "Click_clickNot_to_submit failed. Unable to locate object: " + clickNot_to_submitElem.toString());

			Assert.fail("Unable to locate object: " + clickNot_to_submitElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickNot_to_submit");

		TestModellerLogger.PassStep(m_Driver, "Click_clickNot_to_submit");
	}
}