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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/20d7591e-4569-444d-9154-d43be10be2e7
@TestModellerModule(guid = "20d7591e-4569-444d-9154-d43be10be2e7")
public class runpayrollpageEmployeePayFrequency extends BasePage
{
	public runpayrollpageEmployeePayFrequency (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By ClickRunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By ClickRunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11931");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11931");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11931");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11931";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11931")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoPayrollDashboard
	 * @throws InterruptedException 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard() throws InterruptedException
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		Thread.sleep(2000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

     
	/**
 	 * Click ClickRunPayroll1
     * @name Click ClickRunPayroll1
     */
	public void Click_ClickRunPayroll1()
	{
        
		WebElement elem = getWebElement(ClickRunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRunPayroll1", "Click_ClickRunPayroll1 failed. Unable to locate object: " + ClickRunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRunPayroll1", "Click_ClickRunPayroll1 failed. Unable to locate object: " + ClickRunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + ClickRunPayroll1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRunPayroll1");
	}

     
	/**
 	 * Click ClickRunPayroll2
	 * @throws Exception 
     * @name Click ClickRunPayroll2
     */
	public void Click_ClickRunPayroll2() throws Exception
	{
        
		WebElement elem = getWebElement(ClickRunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRunPayroll2", "Click_ClickRunPayroll2 failed. Unable to locate object: " + ClickRunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRunPayroll2", "Click_ClickRunPayroll2 failed. Unable to locate object: " + ClickRunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + ClickRunPayroll2Elem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "EmployeePayFrequencyChange");
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRunPayroll2");
	}
}