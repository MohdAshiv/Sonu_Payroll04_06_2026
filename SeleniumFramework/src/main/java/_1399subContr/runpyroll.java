package _1399subContr;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/58edab86-144a-46d3-8855-48bea30bdd35
@TestModellerModule(guid = "58edab86-144a-46d3-8855-48bea30bdd35")
public class runpyroll extends BasePage
{
	public runpyroll (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Payroll_Elem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By Run_PayrollElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By Run_Payroll_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=15267");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=15267");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=15267");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=15267";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=15267")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Payroll 
     * @name Click  Payroll 
     */
	public void Click__Payroll_()
	{
        
		WebElement elem = getWebElement(_Payroll_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Payroll_", "Click__Payroll_ failed. Unable to locate object: " + _Payroll_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Payroll_", "Click__Payroll_ failed. Unable to locate object: " + _Payroll_Elem.toString());

			Assert.fail("Unable to locate object: " + _Payroll_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Payroll_");

		TestModellerLogger.PassStep(m_Driver, "Click__Payroll_");
	}

     
	/**
 	 * Click Run Payroll
     * @name Click Run Payroll
     */
	public void Click_Run_Payroll()
	{
        
		WebElement elem = getWebElement(Run_PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll", "Click_Run_Payroll failed. Unable to locate object: " + Run_PayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll", "Click_Run_Payroll failed. Unable to locate object: " + Run_PayrollElem.toString());

			Assert.fail("Unable to locate object: " + Run_PayrollElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll");
	}

     
	/**
 	 * Click Run Payroll
     * @name Click Run Payroll
     */
	public void Click_Run_Payroll_1()
	{
        
		WebElement elem = getWebElement(Run_Payroll_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll_1", "Click_Run_Payroll_1 failed. Unable to locate object: " + Run_Payroll_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll_1", "Click_Run_Payroll_1 failed. Unable to locate object: " + Run_Payroll_1Elem.toString());

			Assert.fail("Unable to locate object: " + Run_Payroll_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll_1");
	}
}