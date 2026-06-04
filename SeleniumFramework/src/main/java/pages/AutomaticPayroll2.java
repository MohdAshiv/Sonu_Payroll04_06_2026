package pages;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/07b20257-ce3c-4132-ae4a-9ca394d8c2d5
@TestModellerModule(guid = "07b20257-ce3c-4132-ae4a-9ca394d8c2d5")
public class AutomaticPayroll2 extends BasePage
{
	public AutomaticPayroll2 (WebDriver driver)
	{
		super(driver);
	}


	
	private By BtnEnableAutorunElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$BtnEnableDisableEmailAutorun']");

	private By Continue1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_LinkButtonContinue']");

	private By SelectEmailModeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$EmailMode']");

	private By tapYesElem = By.xpath("//label[contains(.,'Yes')]/../input");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11909&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click BtnEnableAutorun
     * @name Click BtnEnableAutorun
     */
	public void Click_BtnEnableAutorun()
	{
        
		WebElement elem = getWebElement(BtnEnableAutorunElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BtnEnableAutorun", "Click_BtnEnableAutorun failed. Unable to locate object: " + BtnEnableAutorunElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BtnEnableAutorun", "Click_BtnEnableAutorun failed. Unable to locate object: " + BtnEnableAutorunElem.toString());

			Assert.fail("Unable to locate object: " + BtnEnableAutorunElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_BtnEnableAutorun");

		TestModellerLogger.PassStep(m_Driver, "Click_BtnEnableAutorun");
	}

     
	/**
 	 * Click Continue1
     * @name Click Continue1
     */
	public void Click_Continue1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Continue1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Continue1", "Click_Continue1 failed. Unable to locate object: " + Continue1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Continue1", "Click_Continue1 failed. Unable to locate object: " + Continue1Elem.toString());

			Assert.fail("Unable to locate object: " + Continue1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Continue1");

		TestModellerLogger.PassStep(m_Driver, "Click_Continue1");
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

 			Assert.fail("Unable to locate object: " + SelectEmailModeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectEmailMode);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectEmailMode " + SelectEmailMode);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectEmailMode " + SelectEmailMode);
 	}

     
	/**
 	 * Click tapYes
     * @name Click tapYes
     */
	public void Click_tapYes()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(tapYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_tapYes", "Click_tapYes failed. Unable to locate object: " + tapYesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_tapYes", "Click_tapYes failed. Unable to locate object: " + tapYesElem.toString());

			Assert.fail("Unable to locate object: " + tapYesElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_tapYes");

		TestModellerLogger.PassStep(m_Driver, "Click_tapYes");
	}
	
	
	
	
	/**
 	 * Click Continue1
     * @name Click Continue1
     */
	public void Click_Continue2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Continue1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Continue1", "Click_Continue1 failed. Unable to locate object: " + Continue1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Continue1", "Click_Continue1 failed. Unable to locate object: " + Continue1Elem.toString());

			Assert.fail("Unable to locate object: " + Continue1Elem.toString());
        }

		String str="//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']";
			//	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']"));
		//elem.click();
        jsExec.executeScript("arguments[0].click();", str);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Continue1");

		TestModellerLogger.PassStep(m_Driver, "Click_Continue1");
	}
	
	
	
	/**
 	 * Click BtnEnableAutorun
     * @name Click BtnEnableAutorun
     */
	public void Click_BtnEnableAutorun2()
	{
        
		WebElement elem = getWebElement(BtnEnableAutorunElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BtnEnableAutorun", "Click_BtnEnableAutorun failed. Unable to locate object: " + BtnEnableAutorunElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BtnEnableAutorun", "Click_BtnEnableAutorun failed. Unable to locate object: " + BtnEnableAutorunElem.toString());

			Assert.fail("Unable to locate object: " + BtnEnableAutorunElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_BtnEnableAutorun");

		TestModellerLogger.PassStep(m_Driver, "Click_BtnEnableAutorun");
	}

     
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }
		
		Thread.sleep(2000);

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "MannualPayroll");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
}