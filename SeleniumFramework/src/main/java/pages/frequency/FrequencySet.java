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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/44e73009-a8a2-44ce-ab07-32b7cb9fe943
@TestModellerModule(guid = "44e73009-a8a2-44ce-ab07-32b7cb9fe943")
public class FrequencySet extends BasePage
{
	public FrequencySet (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickAdditionalFrequecyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ButtonLoadMoreFrequecy1']");

	private By payModeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$payMode1']");

	private By SelectFrequencyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAnnualyPayDate']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickAdditionalFrequecy
     * @name Click ClickAdditionalFrequecy
     */
	public void Click_ClickAdditionalFrequecy()
	{
        
		WebElement elem = getWebElement(ClickAdditionalFrequecyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickAdditionalFrequecy", "Click_ClickAdditionalFrequecy failed. Unable to locate object: " + ClickAdditionalFrequecyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickAdditionalFrequecy", "Click_ClickAdditionalFrequecy failed. Unable to locate object: " + ClickAdditionalFrequecyElem.toString());

			Assert.fail("Unable to locate object: " + ClickAdditionalFrequecyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickAdditionalFrequecy");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickAdditionalFrequecy");
	}

    
	/**
 	 * Select payMode
     * @name Select payMode
     */
    public void Select_payMode(String payMode)
 	{
 	    
 		WebElement elem = getWebElement(payModeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_payMode", "Select_payMode failed. Unable to locate object: " + payModeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_payMode", "Select_payMode failed. Unable to locate object: " + payModeElem.toString());

 			Assert.fail("Unable to locate object: " + payModeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(payMode);
 		
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtWeeklyPayrollEndDate']")).sendKeys("");
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_payMode " + payMode);

 		TestModellerLogger.PassStep(m_Driver, "Select_payMode " + payMode);
 	}

      
	/**
 	 * Enter SelectFrequency
     * @name Enter SelectFrequency
     */
 	public void Enter_SelectFrequency(String SelectFrequency)
 	{
 	    
 		WebElement elem = getWebElement(SelectFrequencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SelectFrequency", "Enter_SelectFrequency failed. Unable to locate object: " + SelectFrequencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SelectFrequency", "Enter_SelectFrequency failed. Unable to locate object: " + SelectFrequencyElem.toString());

 			Assert.fail("Unable to locate object: " + SelectFrequencyElem.toString());
         }

 		//elem.sendKeys(SelectFrequency);
 		jsExec.executeScript("arguments[0].sendKeys(SelectFrequency);", elem);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SelectFrequency " + SelectFrequency);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SelectFrequency " + SelectFrequency);
 	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
}