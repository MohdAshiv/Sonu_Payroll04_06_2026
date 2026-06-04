package XML_SMP_Page;

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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/165b8725-40a3-4d1e-8e09-38faf2a09db9
@TestModellerModule(guid = "165b8725-40a3-4d1e-8e09-38faf2a09db9")
public class PayslipEmail extends BasePage
{
	public PayslipEmail (WebDriver driver)
	{
		super(driver);
	}


	
	private By PayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By DownloadElem = By.xpath("//A[@data-original-title='Payslip download']");

	private By _Email_PayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By Company_email_addressElem = By.xpath("//label[normalize-space()= 'Company email address']/../input[1]");

	private By _Send_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12841");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12841");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12841");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12841";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12841")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Payslips
     * @name Click Payslips
     */
	public void Click_Payslips()
	{
        
		WebElement elem = getWebElement(PayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payslips", "Click_Payslips failed. Unable to locate object: " + PayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payslips", "Click_Payslips failed. Unable to locate object: " + PayslipsElem.toString());

			Assert.fail("Unable to locate object: " + PayslipsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payslips");

		TestModellerLogger.PassStep(m_Driver, "Click_Payslips");
	}

     
	/**
 	 * Click Download
	 * @throws Exception 
     * @name Click Download
     */
	public void Click_Download() throws Exception
	{
        
		WebElement elem = getWebElement(DownloadElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Download", "Click_Download failed. Unable to locate object: " + DownloadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Download", "Click_Download failed. Unable to locate object: " + DownloadElem.toString());

			Assert.fail("Unable to locate object: " + DownloadElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "SMPPayslip");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Download");

		TestModellerLogger.PassStep(m_Driver, "Click_Download");
	}

     
	/**
 	 * Click  Email Payslips
     * @name Click  Email Payslips
     */
	public void Click__Email_Payslips()
	{
        
		WebElement elem = getWebElement(_Email_PayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Email_Payslips", "Click__Email_Payslips failed. Unable to locate object: " + _Email_PayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Email_Payslips", "Click__Email_Payslips failed. Unable to locate object: " + _Email_PayslipsElem.toString());

			Assert.fail("Unable to locate object: " + _Email_PayslipsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Email_Payslips");

		TestModellerLogger.PassStep(m_Driver, "Click__Email_Payslips");
	}

     
	/**
 	 * Click Company email address
     * @name Click Company email address
     */
	public void Click_Company_email_address()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Company_email_addressElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Company_email_address", "Click_Company_email_address failed. Unable to locate object: " + Company_email_addressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Company_email_address", "Click_Company_email_address failed. Unable to locate object: " + Company_email_addressElem.toString());

			Assert.fail("Unable to locate object: " + Company_email_addressElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Company_email_address");

		TestModellerLogger.PassStep(m_Driver, "Click_Company_email_address");
	}

     
	/**
 	 * Click  Send 
     * @name Click  Send 
     */
	public void Click__Send_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(_Send_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

			Assert.fail("Unable to locate object: " + _Send_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Send_");

		TestModellerLogger.PassStep(m_Driver, "Click__Send_");
	}
}