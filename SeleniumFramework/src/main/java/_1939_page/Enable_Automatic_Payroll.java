package _1939_page;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/0b95b60e-d2aa-477d-8b26-84b123b4279d
@TestModellerModule(guid = "0b95b60e-d2aa-477d-8b26-84b123b4279d")
public class Enable_Automatic_Payroll extends BasePage
{
	public Enable_Automatic_Payroll (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickEnableAutorunElem = By.xpath("//label[normalize-space()= 'Automatic Payroll:']/../div[1]/a");

	private By ClickContinueElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_LinkButtonContinue']");

	private By SelectEmailModeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_EmailMode']");

	private By SelectYesElem = By.xpath("//label[normalize-space()= 'Yes']/../input");
	
	private By Continue2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By Enable2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_BtnSaveMode']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8");

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
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12287&TaxYearCode=8")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickEnableAutorun
     * @name Click ClickEnableAutorun
     */
	public void Click_ClickEnableAutorun()
	{
        
		WebElement elem = getWebElement(ClickEnableAutorunElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickEnableAutorun", "Click_ClickEnableAutorun failed. Unable to locate object: " + ClickEnableAutorunElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickEnableAutorun", "Click_ClickEnableAutorun failed. Unable to locate object: " + ClickEnableAutorunElem.toString());

			Assert.fail("Unable to locate object: " + ClickEnableAutorunElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickEnableAutorun");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickEnableAutorun");
	}

     
	/**
 	 * Click ClickContinue
	 * @throws InterruptedException 
     * @name Click ClickContinue
     */
	public void Click_ClickContinue() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ClickContinueElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickContinue", "Click_ClickContinue failed. Unable to locate object: " + ClickContinueElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickContinue", "Click_ClickContinue failed. Unable to locate object: " + ClickContinueElem.toString());

			Assert.fail("Unable to locate object: " + ClickContinueElem.toString());
        }

		//elem.click();
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		System.out.println("I'm switch");
		Thread.sleep(2000);
		m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Continue')]")).get(0).click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ClickContinue");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickContinue");
	}

    
	/**
 	 * Select SelectEmailMode
     * @name Select SelectEmailMode
     */
    public void Select_SelectEmailMode(String SelectEmailMode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(SelectEmailModeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectEmailMode", "Select_SelectEmailMode failed. Unable to locate object: " + SelectEmailModeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectEmailMode", "Select_SelectEmailMode failed. Unable to locate object: " + SelectEmailModeElem.toString());

 			//Assert.fail("Unable to locate object: " + SelectEmailModeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectEmailMode);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectEmailMode " + SelectEmailMode);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectEmailMode " + SelectEmailMode);
 	}

     
	/**
 	 * Click SelectYes
     * @name Click SelectYes
     */
	public void Click_SelectYes()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(SelectYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectYes", "Click_SelectYes failed. Unable to locate object: " + SelectYesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectYes", "Click_SelectYes failed. Unable to locate object: " + SelectYesElem.toString());

			Assert.fail("Unable to locate object: " + SelectYesElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SelectYes");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectYes");
	}
	
	
	/**
 	 * Click Continue2
     * @name Click Continue2
     */
	public void Click_Continue2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Continue2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Continue2", "Click_Continue2 failed. Unable to locate object: " + Continue2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Continue2", "Click_Continue2 failed. Unable to locate object: " + Continue2Elem.toString());

			Assert.fail("Unable to locate object: " + Continue2Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Continue2");

		TestModellerLogger.PassStep(m_Driver, "Click_Continue2");
	}
	
	
	
	/**
 	 * Click Enable2
	 * @throws InterruptedException 
     * @name Click Enable2
     */
	public void Click_Enable2() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Enable2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable2", "Click_Enable2 failed. Unable to locate object: " + Enable2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable2", "Click_Enable2 failed. Unable to locate object: " + Enable2Elem.toString());

			Assert.fail("Unable to locate object: " + Enable2Elem.toString());
        }

		elem.click();
        
		//Thread.sleep(3000);
		
		//m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Enable2");

		TestModellerLogger.PassStep(m_Driver, "Click_Enable2");
	}
	
}