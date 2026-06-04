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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/796dd011-1da4-4273-84a4-568ca1ac7d72
@TestModellerModule(guid = "796dd011-1da4-4273-84a4-568ca1ac7d72")
public class mannualPayroll extends BasePage
{
	public mannualPayroll (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickSettingElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_btnSettings']");

	private By clickDisableElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_BtnDisable']");


	
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
 	 * Click clickSetting
     * @name Click clickSetting
     */
	public void Click_clickSetting()
	{
        
		WebElement elem = getWebElement(clickSettingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSetting", "Click_clickSetting failed. Unable to locate object: " + clickSettingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSetting", "Click_clickSetting failed. Unable to locate object: " + clickSettingElem.toString());

			Assert.fail("Unable to locate object: " + clickSettingElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSetting");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSetting");
	}

     
	/**
 	 * Click clickDisable
     * @name Click clickDisable
     */
	public void Click_clickDisable()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(clickDisableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickDisable", "Click_clickDisable failed. Unable to locate object: " + clickDisableElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickDisable", "Click_clickDisable failed. Unable to locate object: " + clickDisableElem.toString());

			Assert.fail("Unable to locate object: " + clickDisableElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickDisable");

		TestModellerLogger.PassStep(m_Driver, "Click_clickDisable");
	}
}