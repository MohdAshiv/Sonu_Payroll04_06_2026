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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c6761173-08e5-46a4-8776-932478edae7e
@TestModellerModule(guid = "c6761173-08e5-46a4-8776-932478edae7e")
public class fillingVerification extends BasePage
{
	public fillingVerification (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickSUBMITTEDElem = By.xpath("//A[contains(text(),'SUBMITTED')]");

	private By DownloadPDFElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnExport']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11970");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11970");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11970");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11970";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=11970")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickSUBMITTED
     * @name Click ClickSUBMITTED
     */
	public void Click_ClickSUBMITTED()
	{
        
		WebElement elem = getWebElement(ClickSUBMITTEDElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSUBMITTED", "Click_ClickSUBMITTED failed. Unable to locate object: " + ClickSUBMITTEDElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSUBMITTED", "Click_ClickSUBMITTED failed. Unable to locate object: " + ClickSUBMITTEDElem.toString());

			Assert.fail("Unable to locate object: " + ClickSUBMITTEDElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSUBMITTED");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSUBMITTED");
	}

     
	/**
 	 * Click DownloadPDF
     * @name Click DownloadPDF
     */
	public void Click_DownloadPDF()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(DownloadPDFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownloadPDF", "Click_DownloadPDF failed. Unable to locate object: " + DownloadPDFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownloadPDF", "Click_DownloadPDF failed. Unable to locate object: " + DownloadPDFElem.toString());

			Assert.fail("Unable to locate object: " + DownloadPDFElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_DownloadPDF");

		TestModellerLogger.PassStep(m_Driver, "Click_DownloadPDF");
	}
}