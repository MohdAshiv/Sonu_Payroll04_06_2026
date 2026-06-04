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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3f016eab-d3d5-4ad7-a7bc-cb925975cf58
@TestModellerModule(guid = "3f016eab-d3d5-4ad7-a7bc-cb925975cf58")
public class NotToSubmot extends BasePage
{
	public NotToSubmot (WebDriver driver)
	{
		super(driver);
	}


	
	private By SelectCheckboxElem = By.cssSelector("INPUT[dataval='Y']");

	private By EnterNotesElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtNotes']");

	private By ClickNot_to_submitElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']");

	private By clickNOTTOSUBMIT2Elem = By.xpath("//A[contains(text(),'NOTTOSUBMIT')]");

	private By DownloadPDFElem = By.xpath("//*[@class='green_btn manually_add_btn']");


	
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
 	 * Click SelectCheckbox
     * @name Click SelectCheckbox
     */
	public void Click_SelectCheckbox()
	{
        
		WebElement elem = getWebElement(SelectCheckboxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectCheckbox", "Click_SelectCheckbox failed. Unable to locate object: " + SelectCheckboxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectCheckbox", "Click_SelectCheckbox failed. Unable to locate object: " + SelectCheckboxElem.toString());

			Assert.fail("Unable to locate object: " + SelectCheckboxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectCheckbox");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectCheckbox");
	}

      
	/**
 	 * Enter EnterNotes
     * @name Enter EnterNotes
     */
 	public void Enter_EnterNotes(String EnterNotes)
 	{
 	    
 		WebElement elem = getWebElement(EnterNotesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNotes", "Enter_EnterNotes failed. Unable to locate object: " + EnterNotesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNotes", "Enter_EnterNotes failed. Unable to locate object: " + EnterNotesElem.toString());

 			Assert.fail("Unable to locate object: " + EnterNotesElem.toString());
         }

 		elem.sendKeys(EnterNotes);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNotes " + EnterNotes);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNotes " + EnterNotes);
 	}

     
	/**
 	 * Click ClickNot to submit
     * @name Click ClickNot to submit
     */
	public void Click_ClickNot_to_submit()
	{
        
		WebElement elem = getWebElement(ClickNot_to_submitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickNot_to_submit", "Click_ClickNot_to_submit failed. Unable to locate object: " + ClickNot_to_submitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickNot_to_submit", "Click_ClickNot_to_submit failed. Unable to locate object: " + ClickNot_to_submitElem.toString());

			Assert.fail("Unable to locate object: " + ClickNot_to_submitElem.toString());
        }

		elem.sendKeys("");
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickNot_to_submit");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickNot_to_submit");
	}

     
	/**
 	 * Click clickNOTTOSUBMIT2
	 * @throws Exception 
     * @name Click clickNOTTOSUBMIT2
     */
	public void Click_clickNOTTOSUBMIT2() throws Exception
	{
        
		WebElement elem = getWebElement(clickNOTTOSUBMIT2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickNOTTOSUBMIT2", "Click_clickNOTTOSUBMIT2 failed. Unable to locate object: " + clickNOTTOSUBMIT2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickNOTTOSUBMIT2", "Click_clickNOTTOSUBMIT2 failed. Unable to locate object: " + clickNOTTOSUBMIT2Elem.toString());

			Assert.fail("Unable to locate object: " + clickNOTTOSUBMIT2Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click()", elem);
          	TakeScreenshot.takeScreenshot(m_Driver, "Not To Submit");

		ExtentReportManager.passStep(m_Driver, "Click_clickNOTTOSUBMIT2");

		TestModellerLogger.PassStep(m_Driver, "Click_clickNOTTOSUBMIT2");
	}

     
	/**
 	 * Click DownloadPDF
     * @name Click DownloadPDF
     */
	public void Click_DownloadPDF()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[6]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(DownloadPDFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownloadPDF", "Click_DownloadPDF failed. Unable to locate object: " + DownloadPDFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownloadPDF", "Click_DownloadPDF failed. Unable to locate object: " + DownloadPDFElem.toString());

			Assert.fail("Unable to locate object: " + DownloadPDFElem.toString());
        }

		System.out.println("after switch");
		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_DownloadPDF");

		TestModellerLogger.PassStep(m_Driver, "Click_DownloadPDF");
	}


	public void ClickUndo() throws InterruptedException {
		
		Thread.sleep(3000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl04_btnUndo']")).click();
		
	}
}