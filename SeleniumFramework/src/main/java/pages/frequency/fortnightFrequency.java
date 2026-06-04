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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/76f3118b-de49-4a0d-8275-74b47471f5de
@TestModellerModule(guid = "76f3118b-de49-4a0d-8275-74b47471f5de")
public class fortnightFrequency extends BasePage
{
	public fortnightFrequency (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickAdditionalFrequecyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ButtonLoadMoreFrequecy1']");

	private By selectpayMode1Elem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$payMode1']");

	private By FortnightlyPayrollEndDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtFortnightlyPayrollEndDate']");

	private By clickSaveElem = By.xpath("//*[@id='btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11977&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11977&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11977&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11977&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11977&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickAdditionalFrequecy
     * @name Click clickAdditionalFrequecy
     */
	public void Click_clickAdditionalFrequecy()
	{
        
		WebElement elem = getWebElement(clickAdditionalFrequecyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAdditionalFrequecy", "Click_clickAdditionalFrequecy failed. Unable to locate object: " + clickAdditionalFrequecyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAdditionalFrequecy", "Click_clickAdditionalFrequecy failed. Unable to locate object: " + clickAdditionalFrequecyElem.toString());

			Assert.fail("Unable to locate object: " + clickAdditionalFrequecyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAdditionalFrequecy");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAdditionalFrequecy");
	}

    
	/**
 	 * Select selectpayMode1
     * @name Select selectpayMode1
     */
    public void Select_selectpayMode1(String selectpayMode1)
 	{
 	    
 		WebElement elem = getWebElement(selectpayMode1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectpayMode1", "Select_selectpayMode1 failed. Unable to locate object: " + selectpayMode1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectpayMode1", "Select_selectpayMode1 failed. Unable to locate object: " + selectpayMode1Elem.toString());

 			Assert.fail("Unable to locate object: " + selectpayMode1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectpayMode1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectpayMode1 " + selectpayMode1);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectpayMode1 " + selectpayMode1);
 	}

      
	/**
 	 * Enter FortnightlyPayrollEndDate
     * @name Enter FortnightlyPayrollEndDate
     */
 	public void Enter_FortnightlyPayrollEndDate(String FortnightlyPayrollEndDate)
 	{
 	    
 		WebElement elem = getWebElement(FortnightlyPayrollEndDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FortnightlyPayrollEndDate", "Enter_FortnightlyPayrollEndDate failed. Unable to locate object: " + FortnightlyPayrollEndDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FortnightlyPayrollEndDate", "Enter_FortnightlyPayrollEndDate failed. Unable to locate object: " + FortnightlyPayrollEndDateElem.toString());

 			Assert.fail("Unable to locate object: " + FortnightlyPayrollEndDateElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(FortnightlyPayrollEndDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FortnightlyPayrollEndDate " + FortnightlyPayrollEndDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FortnightlyPayrollEndDate " + FortnightlyPayrollEndDate);
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