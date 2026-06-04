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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/141eaa7d-3639-4ae5-98a8-45db51295543
@TestModellerModule(guid = "141eaa7d-3639-4ae5-98a8-45db51295543")
public class FourWeekly extends BasePage
{
	public FourWeekly (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickAdditionalFrequecyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ButtonLoadMoreFrequecy1']");

	private By SelectpayModeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$payMode1']");

	private By FourWeeklyPayrollEndDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtFourWeeklyPayrollEndDate']");

	private By ClickSaveElem = By.xpath("//*[@id='btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11975&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11975&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11975&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11975&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11975&TaxYearCode=7")) {
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
 	 * Select SelectpayMode
     * @name Select SelectpayMode
     */
    public void Select_SelectpayMode(String SelectpayMode)
 	{
 	    
 		WebElement elem = getWebElement(SelectpayModeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectpayMode", "Select_SelectpayMode failed. Unable to locate object: " + SelectpayModeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectpayMode", "Select_SelectpayMode failed. Unable to locate object: " + SelectpayModeElem.toString());

 			Assert.fail("Unable to locate object: " + SelectpayModeElem.toString());
         }
 		
 		

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectpayMode);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectpayMode " + SelectpayMode);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectpayMode " + SelectpayMode);
 	}

      
	/**
 	 * Enter FourWeeklyPayrollEndDate
     * @name Enter FourWeeklyPayrollEndDate
     */
 	public void Enter_FourWeeklyPayrollEndDate(String FourWeeklyPayrollEndDate)
 	{
 	    
 		WebElement elem = getWebElement(FourWeeklyPayrollEndDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FourWeeklyPayrollEndDate", "Enter_FourWeeklyPayrollEndDate failed. Unable to locate object: " + FourWeeklyPayrollEndDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FourWeeklyPayrollEndDate", "Enter_FourWeeklyPayrollEndDate failed. Unable to locate object: " + FourWeeklyPayrollEndDateElem.toString());

 			Assert.fail("Unable to locate object: " + FourWeeklyPayrollEndDateElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(FourWeeklyPayrollEndDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FourWeeklyPayrollEndDate " + FourWeeklyPayrollEndDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FourWeeklyPayrollEndDate " + FourWeeklyPayrollEndDate);
 	}

     
	/**
 	 * Click ClickSave
	 * @throws InterruptedException 
     * @name Click ClickSave
     */
	public void Click_ClickSave() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

			Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
	}
}