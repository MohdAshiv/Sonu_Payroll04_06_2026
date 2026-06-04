package _2106Page;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9804aba0-cb09-4480-b477-3b5cea95f18d
@TestModellerModule(guid = "9804aba0-cb09-4480-b477-3b5cea95f18d")
public class Disable_automatic_Payroll extends BasePage
{
	public Disable_automatic_Payroll (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickEmailSettingsElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_btnSettings']");

	private By ClickDisableElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_BtnDisable']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickEmailSettings
     * @name Click ClickEmailSettings
     */
	public void Click_ClickEmailSettings()
	{
        
		WebElement elem = getWebElement(ClickEmailSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickEmailSettings", "Click_ClickEmailSettings failed. Unable to locate object: " + ClickEmailSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickEmailSettings", "Click_ClickEmailSettings failed. Unable to locate object: " + ClickEmailSettingsElem.toString());

			Assert.fail("Unable to locate object: " + ClickEmailSettingsElem.toString());
        }

		System.out.println("Hi1");
		elem.click();
		System.out.println("Hi1");
//		m_Driver.switchTo().alert().accept();
          	
		
		ExtentReportManager.passStep(m_Driver, "Click_ClickEmailSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickEmailSettings");
	}

     
	/**
 	 * Click ClickDisable
	 * @throws InterruptedException 
     * @name Click ClickDisable
     */
	public void Click_ClickDisable() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[6]/div/div/div/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(ClickDisableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickDisable", "Click_ClickDisable failed. Unable to locate object: " + ClickDisableElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickDisable", "Click_ClickDisable failed. Unable to locate object: " + ClickDisableElem.toString());

			Assert.fail("Unable to locate object: " + ClickDisableElem.toString());
        }

		System.out.println("HI1");
		elem=m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_BtnDisable']"));
		System.out.println("HI2");
		elem.click();
		System.out.println("HI3");
	
		
		Thread.sleep(3000);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ClickDisable");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickDisable");
	}


	public void Click_EnableToDisable() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(1000);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_lblAutorun']")).click();
		
		
	
		
	
		
	}
}