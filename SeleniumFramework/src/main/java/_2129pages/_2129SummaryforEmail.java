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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4afcb538-3c58-44fd-84ba-788401164097
@TestModellerModule(guid = "4afcb538-3c58-44fd-84ba-788401164097")
public class _2129SummaryforEmail extends BasePage
{
	public _2129SummaryforEmail (WebDriver driver)
	{
		super(driver);
	}


	
	private By PayrollDateElem = By.xpath("//label[normalize-space()= 'Period End:']/../select");

	private By EmailElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By TickCompany_email_addressElem = By.xpath("//label[normalize-space()= 'Company email address']/../input[1]");

	private By TickEmployee_PayslipElem = By.xpath("//label[normalize-space()= 'Employee Payslip']/../input");

	private By TickPayroll_SummaryElem = By.xpath("//label[normalize-space()= 'Payroll Summary']/../input");

	private By EmailHeaderElem = By.xpath("//SPAN[contains(text(),'Dear Vikas Kumar')]");

	private By ClickSendElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15862");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15862");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15862");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15862";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15862")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
 	 * Click Email
     * @name Click Email
     */
	public void Click_Email()
	{
        
		WebElement elem = getWebElement(EmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Email", "Click_Email failed. Unable to locate object: " + EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Email", "Click_Email failed. Unable to locate object: " + EmailElem.toString());

			Assert.fail("Unable to locate object: " + EmailElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Email");

		TestModellerLogger.PassStep(m_Driver, "Click_Email");
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
 	 * Click TickEmployee Payslip
     * @name Click TickEmployee Payslip
     */
	public void Click_TickEmployee_Payslip()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(TickEmployee_PayslipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TickEmployee_Payslip", "Click_TickEmployee_Payslip failed. Unable to locate object: " + TickEmployee_PayslipElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TickEmployee_Payslip", "Click_TickEmployee_Payslip failed. Unable to locate object: " + TickEmployee_PayslipElem.toString());

			Assert.fail("Unable to locate object: " + TickEmployee_PayslipElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_TickEmployee_Payslip");

		TestModellerLogger.PassStep(m_Driver, "Click_TickEmployee_Payslip");
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
 	 * Click EmailHeader
     * @name Click EmailHeader
     */
	public void Click_EmailHeader()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[1]/div[6]/div[2]/div/table/tbody/tr[2]/td/div/iframe[1]")));

		WebElement elem = getWebElement(EmailHeaderElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailHeader", "Click_EmailHeader failed. Unable to locate object: " + EmailHeaderElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailHeader", "Click_EmailHeader failed. Unable to locate object: " + EmailHeaderElem.toString());

			Assert.fail("Unable to locate object: " + EmailHeaderElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_EmailHeader");

		TestModellerLogger.PassStep(m_Driver, "Click_EmailHeader");
	}

     
	/**
 	 * Click ClickSend
     * @name Click ClickSend
     */
	public void Click_ClickSend()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ClickSendElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSend", "Click_ClickSend failed. Unable to locate object: " + ClickSendElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSend", "Click_ClickSend failed. Unable to locate object: " + ClickSendElem.toString());

			Assert.fail("Unable to locate object: " + ClickSendElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSend");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSend");
	}
}