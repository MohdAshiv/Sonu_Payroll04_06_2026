package pages1;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5024ee00-dcf3-4fd1-98ff-dbcc61ced512
@TestModellerModule(guid = "5024ee00-dcf3-4fd1-98ff-dbcc61ced512")
public class selectontractor extends BasePage
{
	public selectontractor (WebDriver driver)
	{
		super(driver);
	}


	
	private By SelectContractorElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlContractor']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11989&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11989&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11989&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11989&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11989&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select SelectContractor
	 * @throws InterruptedException 
     * @name Select SelectContractor
     */
    public void Select_SelectContractor(String SelectContractor) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@name='1619077926659']")));

 		WebElement elem = getWebElement(SelectContractorElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectContractor", "Select_SelectContractor failed. Unable to locate object: " + SelectContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectContractor", "Select_SelectContractor failed. Unable to locate object: " + SelectContractorElem.toString());

 			Assert.fail("Unable to locate object: " + SelectContractorElem.toString());
         }
 		Thread.sleep(1000);
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectContractor);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectContractor " + SelectContractor);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectContractor " + SelectContractor);
 	}
}