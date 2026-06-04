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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2b1e582f-2d79-476d-bb05-a21200cc06ec
@TestModellerModule(guid = "2b1e582f-2d79-476d-bb05-a21200cc06ec")
public class clickEmployee extends BasePage
{
	public clickEmployee (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickEmployeeElem = By.xpath("//A[contains(text(),'joe')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickEmployee
     * @name Click ClickEmployee
     */
	public void Click_ClickEmployee()
	{
        
		WebElement elem = getWebElement(ClickEmployeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickEmployee", "Click_ClickEmployee failed. Unable to locate object: " + ClickEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickEmployee", "Click_ClickEmployee failed. Unable to locate object: " + ClickEmployeeElem.toString());

			Assert.fail("Unable to locate object: " + ClickEmployeeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickEmployee");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickEmployee");
	}
}