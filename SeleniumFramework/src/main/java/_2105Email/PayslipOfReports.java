package _2105Email;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ecf693ff-2a54-4ca2-b214-b6b99d4be3a3
@TestModellerModule(guid = "ecf693ff-2a54-4ca2-b214-b6b99d4be3a3")
public class PayslipOfReports extends BasePage
{
	public PayslipOfReports (WebDriver driver)
	{
		super(driver);
	}


	
	private By PayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");
	
	private By PeriodDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']");

	private By EmailToElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$EmailType']");

	private By Email_PayslipsbuttonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
	
	private By OtherEmailElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEmail']");

	private By Payroll_SummaryElem = By.xpath("//label[normalize-space()= 'Payroll Summary']/../input");

	private By _Send_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12959");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12959");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12959");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12959";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12959")) {
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
 	 * Select EmailTo
     * @name Select EmailTo
     */
    public void Select_EmailTo(String EmailTo)
 	{
 	    
 		WebElement elem = getWebElement(EmailToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_EmailTo", "Select_EmailTo failed. Unable to locate object: " + EmailToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_EmailTo", "Select_EmailTo failed. Unable to locate object: " + EmailToElem.toString());

 			Assert.fail("Unable to locate object: " + EmailToElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(EmailTo);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_EmailTo " + EmailTo);

 		TestModellerLogger.PassStep(m_Driver, "Select_EmailTo " + EmailTo);
 	}

     
	/**
 	 * Click Email Payslipsbutton
     * @name Click Email Payslipsbutton
     */
	public void Click_Email_Payslipsbutton()
	{
        
		WebElement elem = getWebElement(Email_PayslipsbuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Email_Payslipsbutton", "Click_Email_Payslipsbutton failed. Unable to locate object: " + Email_PayslipsbuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Email_Payslipsbutton", "Click_Email_Payslipsbutton failed. Unable to locate object: " + Email_PayslipsbuttonElem.toString());

			Assert.fail("Unable to locate object: " + Email_PayslipsbuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Email_Payslipsbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Email_Payslipsbutton");
	}

     
	/**
 	 * Click Payroll Summary
     * @name Click Payroll Summary
     */
	public void Click_Payroll_Summary()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Payroll_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Summary", "Click_Payroll_Summary failed. Unable to locate object: " + Payroll_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Summary", "Click_Payroll_Summary failed. Unable to locate object: " + Payroll_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_SummaryElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Summary");
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


	public void TakeSCInReportPayslip() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "Payslip Template at report");
		
		
	}


	public void Select_PeriodDate(String PeriodDate) 
	{
		WebElement elem = getWebElement(PeriodDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PeriodDateElem", "Select_PayrollDate1 failed. Unable to locate object: " + PeriodDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PeriodDateElem", "Select_PayrollDate1 failed. Unable to locate object: " + PeriodDateElem.toString());

 			Assert.fail("Unable to locate object: " + PeriodDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PeriodDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PeriodDateElem " + PeriodDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_PeriodDateElem " + PeriodDate);
		
	}


	public void EnterOtherEmail(String OtherEmail) throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		
		WebElement elem = getWebElement(OtherEmailElem);
		
		Thread.sleep(1000);
		
		elem.sendKeys(OtherEmail);
		
		m_Driver.switchTo().defaultContent();
		
		
		
	}


//	}
}