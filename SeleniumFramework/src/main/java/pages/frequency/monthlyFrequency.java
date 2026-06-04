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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/383f5c11-1053-43a7-8c27-086bdf7b6b62
@TestModellerModule(guid = "383f5c11-1053-43a7-8c27-086bdf7b6b62")
public class monthlyFrequency extends BasePage
{
	public monthlyFrequency (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickAdditionalFrequecyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ButtonLoadMoreFrequecy1']");

	private By SelectpayModeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$payMode1']");

	private By MonthlyPayDayElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ddlMonthlyPayDay']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11973&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11973&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11973&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11973&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11973&TaxYearCode=7")) {
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
 	 * Select SelectpayMode
	 * @throws InterruptedException 
     * @name Select SelectpayMode
     */
    public void Select_SelectpayMode(String SelectpayMode) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SelectpayModeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectpayMode", "Select_SelectpayMode failed. Unable to locate object: " + SelectpayModeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectpayMode", "Select_SelectpayMode failed. Unable to locate object: " + SelectpayModeElem.toString());

 			Assert.fail("Unable to locate object: " + SelectpayModeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectpayMode);
 		
 		Thread.sleep(3000);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectpayMode " + SelectpayMode);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectpayMode " + SelectpayMode);
 	}

    
	/**
 	 * Select MonthlyPayDay
     * @name Select MonthlyPayDay
     */
    public void Select_MonthlyPayDay(String MonthlyPayDay)
 	{
 	    
 		WebElement elem = getWebElement(MonthlyPayDayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_MonthlyPayDay", "Select_MonthlyPayDay failed. Unable to locate object: " + MonthlyPayDayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_MonthlyPayDay", "Select_MonthlyPayDay failed. Unable to locate object: " + MonthlyPayDayElem.toString());

 			Assert.fail("Unable to locate object: " + MonthlyPayDayElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(MonthlyPayDay);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_MonthlyPayDay " + MonthlyPayDay);

 		TestModellerLogger.PassStep(m_Driver, "Select_MonthlyPayDay " + MonthlyPayDay);
 	}
}