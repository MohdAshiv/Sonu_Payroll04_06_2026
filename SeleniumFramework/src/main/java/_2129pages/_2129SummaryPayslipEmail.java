package _2129pages;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/451d78ae-42c6-4677-97bb-935f31c7f78e
@TestModellerModule(guid = "451d78ae-42c6-4677-97bb-935f31c7f78e")
public class _2129SummaryPayslipEmail extends BasePage
{
	public _2129SummaryPayslipEmail (WebDriver driver)
	{
		super(driver);
	}


	
	private By PayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By PayrollDateElem = By.xpath("//label[normalize-space()= 'Period End:']/../select");

	private By _Email_PayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By TickCompany_email_addressElem = By.xpath("//label[normalize-space()= 'Company email address']/../input[1]");

	private By TickPayroll_SummaryElem = By.xpath("//label[normalize-space()= 'Payroll Summary']/../input");

	private By _Send_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=15862");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=15862");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=15862");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=15862";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=15862")) {
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
 	 * Select PayrollDate
     * @name Select PayrollDate
     */
    public void Select_PayrollDate(String PayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(PayrollDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PayrollDate", "Select_PayrollDate failed. Unable to locate object: " + PayrollDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PayrollDate", "Select_PayrollDate failed. Unable to locate object: " + PayrollDateElem.toString());

 			Assert.fail("Unable to locate object: " + PayrollDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PayrollDate " + PayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_PayrollDate " + PayrollDate);
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
 	 * Click TickCompany email address
     * @name Click TickCompany email address
     */
	public void Click_TickCompany_email_address()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(TickCompany_email_addressElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TickCompany_email_address", "Click_TickCompany_email_address failed. Unable to locate object: " + TickCompany_email_addressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TickCompany_email_address", "Click_TickCompany_email_address failed. Unable to locate object: " + TickCompany_email_addressElem.toString());

			Assert.fail("Unable to locate object: " + TickCompany_email_addressElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_TickCompany_email_address");

		TestModellerLogger.PassStep(m_Driver, "Click_TickCompany_email_address");
	}

     
	/**
 	 * Click TickPayroll Summary
     * @name Click TickPayroll Summary
     */
	public void Click_TickPayroll_Summary()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(TickPayroll_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TickPayroll_Summary", "Click_TickPayroll_Summary failed. Unable to locate object: " + TickPayroll_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TickPayroll_Summary", "Click_TickPayroll_Summary failed. Unable to locate object: " + TickPayroll_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + TickPayroll_SummaryElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_TickPayroll_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_TickPayroll_Summary");
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