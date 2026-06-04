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
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7c6bf7c0-915d-4044-85be-6d2fcd1089c8
@TestModellerModule(guid = "7c6bf7c0-915d-4044-85be-6d2fcd1089c8")
public class gotoPayrollSetting extends BasePage
{
	public gotoPayrollSetting (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By clickEditCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By gotoPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By PayrollSettingsElem = By.xpath("//A[contains(text(),'Payroll Settings')]");


	
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
 	 * Click clickPayroll
     * @name Click clickPayroll
     */
	public void Click_clickPayroll()
	{
        
		WebElement elem = getWebElement(clickPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayroll", "Click_clickPayroll failed. Unable to locate object: " + clickPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayroll", "Click_clickPayroll failed. Unable to locate object: " + clickPayrollElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollElem.toString());
        }
		
		ClosePopup.ValidateAndPopUp(m_Driver);

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayroll");
	}

     
	/**
 	 * Click clickEditCompany
     * @name Click clickEditCompany
     */
	public void Click_clickEditCompany()
	{
        
		WebElement elem = getWebElement(clickEditCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEditCompany", "Click_clickEditCompany failed. Unable to locate object: " + clickEditCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEditCompany", "Click_clickEditCompany failed. Unable to locate object: " + clickEditCompanyElem.toString());

			Assert.fail("Unable to locate object: " + clickEditCompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEditCompany");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEditCompany");
	}

     
	/**
 	 * Click gotoPayrollDetails
     * @name Click gotoPayrollDetails
     */
	public void Click_gotoPayrollDetails()
	{
        
		WebElement elem = getWebElement(gotoPayrollDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDetails", "Click_gotoPayrollDetails failed. Unable to locate object: " + gotoPayrollDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDetails", "Click_gotoPayrollDetails failed. Unable to locate object: " + gotoPayrollDetailsElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDetailsElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDetails");
	}

     
	/**
 	 * Click PayrollSettings
     * @name Click PayrollSettings
     */
	public void Click_PayrollSettings()
	{
        
		WebElement elem = getWebElement(PayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollSettings", "Click_PayrollSettings failed. Unable to locate object: " + PayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayrollSettings", "Click_PayrollSettings failed. Unable to locate object: " + PayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + PayrollSettingsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_PayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_PayrollSettings");
	}
}