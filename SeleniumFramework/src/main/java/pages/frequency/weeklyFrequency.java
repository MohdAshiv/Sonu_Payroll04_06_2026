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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e57e93ce-d234-4955-803f-f2ea8fe414ed
@TestModellerModule(guid = "e57e93ce-d234-4955-803f-f2ea8fe414ed")
public class weeklyFrequency extends BasePage
{
	public weeklyFrequency (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickAdditionalFrequecyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ButtonLoadMoreFrequecy1']");

	private By selectpayModeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$payMode1']");

	private By WeeklyPayrollEndDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtWeeklyPayrollEndDate']");

	private By clickSaveElem = By.xpath("//*[@id='btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12033&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12033&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12033&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12033&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12033&TaxYearCode=7")) {
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
 	 * Select selectpayMode
     * @name Select selectpayMode
     */
    public void Select_selectpayMode(String selectpayMode)
 	{
 	    
 		WebElement elem = getWebElement(selectpayModeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectpayMode", "Select_selectpayMode failed. Unable to locate object: " + selectpayModeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectpayMode", "Select_selectpayMode failed. Unable to locate object: " + selectpayModeElem.toString());

 			Assert.fail("Unable to locate object: " + selectpayModeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectpayMode);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectpayMode " + selectpayMode);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectpayMode " + selectpayMode);
 	}

      
	/**
 	 * Enter WeeklyPayrollEndDate
     * @name Enter WeeklyPayrollEndDate
     */
 	public void Enter_WeeklyPayrollEndDate(String WeeklyPayrollEndDate)
 	{
 	    
 		WebElement elem = getWebElement(WeeklyPayrollEndDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_WeeklyPayrollEndDate", "Enter_WeeklyPayrollEndDate failed. Unable to locate object: " + WeeklyPayrollEndDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_WeeklyPayrollEndDate", "Enter_WeeklyPayrollEndDate failed. Unable to locate object: " + WeeklyPayrollEndDateElem.toString());

 			Assert.fail("Unable to locate object: " + WeeklyPayrollEndDateElem.toString());
         }

 		elem.sendKeys(WeeklyPayrollEndDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_WeeklyPayrollEndDate " + WeeklyPayrollEndDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_WeeklyPayrollEndDate " + WeeklyPayrollEndDate);
 	}

     
	/**
 	 * Click clickSave
     * @name Click clickSave
     */
	public void Click_clickSave()
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
}