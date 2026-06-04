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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/0a48a6a4-cde2-4c4f-86ce-2a899ca1eb01
@TestModellerModule(guid = "0a48a6a4-cde2-4c4f-86ce-2a899ca1eb01")
public class _2129BSummaryDsbEmail extends BasePage
{
	public _2129BSummaryDsbEmail (WebDriver driver)
	{
		super(driver);
	}


	
	private By Run_Payroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By PaySlipTemplateElem = By.xpath("//label[normalize-space()= 'Send Payslips:']/../select");

	private By Run_Payroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By TickCompany_email_addressElem = By.xpath("//label[normalize-space()= 'Company email address']/../input[1]");

	private By OtherEmailElem = By.xpath("(.//label[normalize-space()= ''])[1]/../../div[2]/input");

	private By TickPayroll_SummaryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ChkCompanySummary']");

	private By _Send_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12928");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12928");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12928");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12928";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12928")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Run Payroll1
     * @name Click Run Payroll1
     */
	public void Click_Run_Payroll1()
	{
        
		WebElement elem = getWebElement(Run_Payroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll1", "Click_Run_Payroll1 failed. Unable to locate object: " + Run_Payroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll1", "Click_Run_Payroll1 failed. Unable to locate object: " + Run_Payroll1Elem.toString());

			Assert.fail("Unable to locate object: " + Run_Payroll1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll1");
	}

    
	/**
 	 * Select PaySlipTemplate
     * @name Select PaySlipTemplate
     */
    public void Select_PaySlipTemplate(String PaySlipTemplate)
 	{
 	    
 		WebElement elem = getWebElement(PaySlipTemplateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PaySlipTemplate", "Select_PaySlipTemplate failed. Unable to locate object: " + PaySlipTemplateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PaySlipTemplate", "Select_PaySlipTemplate failed. Unable to locate object: " + PaySlipTemplateElem.toString());

 			Assert.fail("Unable to locate object: " + PaySlipTemplateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PaySlipTemplate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PaySlipTemplate " + PaySlipTemplate);

 		TestModellerLogger.PassStep(m_Driver, "Select_PaySlipTemplate " + PaySlipTemplate);
 	}

     
	/**
 	 * Click Run Payroll2
     * @name Click Run Payroll2
     */
	public void Click_Run_Payroll2()
	{
        
		WebElement elem = getWebElement(Run_Payroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll2", "Click_Run_Payroll2 failed. Unable to locate object: " + Run_Payroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll2", "Click_Run_Payroll2 failed. Unable to locate object: " + Run_Payroll2Elem.toString());

			Assert.fail("Unable to locate object: " + Run_Payroll2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll2");
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
 	 * Enter OtherEmail
     * @name Enter OtherEmail
     */
 	public void Enter_OtherEmail(String OtherEmail)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(OtherEmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_OtherEmail", "Enter_OtherEmail failed. Unable to locate object: " + OtherEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_OtherEmail", "Enter_OtherEmail failed. Unable to locate object: " + OtherEmailElem.toString());

 			Assert.fail("Unable to locate object: " + OtherEmailElem.toString());
         }

 		elem.sendKeys(OtherEmail);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_OtherEmail " + OtherEmail);

  		TestModellerLogger.PassStep(m_Driver, "Enter_OtherEmail " + OtherEmail);
 	}

     
	/**
 	 * Click TickPayroll Summary
	 * @throws InterruptedException 
     * @name Click TickPayroll Summary
     */
	public void Click_TickPayroll_Summary() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(TickPayroll_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TickPayroll_Summary", "Click_TickPayroll_Summary failed. Unable to locate object: " + TickPayroll_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TickPayroll_Summary", "Click_TickPayroll_Summary failed. Unable to locate object: " + TickPayroll_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + TickPayroll_SummaryElem.toString());
        }

		Thread.sleep(3000);
		
		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_TickPayroll_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_TickPayroll_Summary");
	}

     
	/**
 	 * Click  Send 
	 * @throws InterruptedException 
     * @name Click  Send 
     */
	public void Click__Send_() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(_Send_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Send_", "Click__Send_ failed. Unable to locate object: " + _Send_Elem.toString());

			Assert.fail("Unable to locate object: " + _Send_Elem.toString());
        }
		
	//	Thread.sleep(3000);

		elem.click();
		
	//	jsExec.executeScript("arguments[0].click();", elem);
        
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
  	

		ExtentReportManager.passStep(m_Driver, "Click__Send_");

		TestModellerLogger.PassStep(m_Driver, "Click__Send_");
	}
}