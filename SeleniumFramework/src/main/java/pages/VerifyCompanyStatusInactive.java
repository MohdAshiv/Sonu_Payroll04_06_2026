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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/131943ec-8d14-454b-9b4f-f6e4cb811de6
@TestModellerModule(guid = "131943ec-8d14-454b-9b4f-f6e4cb811de6")
public class VerifyCompanyStatusInactive extends BasePage
{
	public VerifyCompanyStatusInactive (WebDriver driver)
	{
		super(driver);
	}


	
	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By PayrollgeneratedMessageElem = By.xpath("//DIV[@class='alert alert-success']");

	private By EditCompanyClickElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12006");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12006");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12006");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12006";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12006")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click RunPayroll1
     * @name Click RunPayroll1
     */
	public void Click_RunPayroll1()
	{
        
		WebElement elem = getWebElement(RunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll1");
	}

     
	/**
 	 * Click RunPayroll2
     * @name Click RunPayroll2
     */
	public void Click_RunPayroll2()
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}

     
	/**
 	 * Click PayrollgeneratedMessage
	 * @throws Exception 
     * @name Click PayrollgeneratedMessage
     */
	public void Click_PayrollgeneratedMessage() throws Exception
	{
        
		WebElement elem = getWebElement(PayrollgeneratedMessageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollgeneratedMessage", "Click_PayrollgeneratedMessage failed. Unable to locate object: " + PayrollgeneratedMessageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayrollgeneratedMessage", "Click_PayrollgeneratedMessage failed. Unable to locate object: " + PayrollgeneratedMessageElem.toString());

			Assert.fail("Unable to locate object: " + PayrollgeneratedMessageElem.toString());
        }

		TakeScreenshot.takeScreenshot(m_Driver, "PayrollIsRunning");
		elem.click();
		
		String actual=elem.getText();
		String Expected="Success! Payroll generated successfully.";
		Assert.assertEquals(actual, Expected);
          	

		ExtentReportManager.passStep(m_Driver, "Click_PayrollgeneratedMessage");

		TestModellerLogger.PassStep(m_Driver, "Click_PayrollgeneratedMessage");
	}

     
	/**
 	 * Click EditCompanyClick
	 * @throws Exception 
     * @name Click EditCompanyClick
     */
	public void Click_EditCompanyClick() throws Exception
	{
        
		WebElement elem = getWebElement(EditCompanyClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditCompanyClick", "Click_EditCompanyClick failed. Unable to locate object: " + EditCompanyClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditCompanyClick", "Click_EditCompanyClick failed. Unable to locate object: " + EditCompanyClickElem.toString());

			Assert.fail("Unable to locate object: " + EditCompanyClickElem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "CompanyStatusInactive");
          	

		ExtentReportManager.passStep(m_Driver, "Click_EditCompanyClick");

		TestModellerLogger.PassStep(m_Driver, "Click_EditCompanyClick");
	}
}