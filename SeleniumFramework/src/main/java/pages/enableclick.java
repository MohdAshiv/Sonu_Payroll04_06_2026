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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/42730067-2b2d-463e-9ccb-1b664d9acb28
@TestModellerModule(guid = "42730067-2b2d-463e-9ccb-1b664d9acb28")
public class enableclick extends BasePage
{
	public enableclick (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickEnableElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_BtnSaveMode']");


	
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
 	 * Click clickEnable
	 * @throws InterruptedException 
     * @name Click clickEnable
     */
	public void Click_clickEnable() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(clickEnableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEnable", "Click_clickEnable failed. Unable to locate object: " + clickEnableElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEnable", "Click_clickEnable failed. Unable to locate object: " + clickEnableElem.toString());

			Assert.fail("Unable to locate object: " + clickEnableElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickEnable");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEnable");
	}
}