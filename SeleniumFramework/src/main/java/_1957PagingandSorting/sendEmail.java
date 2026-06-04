package _1957PagingandSorting;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6c077dc7-c199-4a61-b8e7-c129fed379ea
@TestModellerModule(guid = "6c077dc7-c199-4a61-b8e7-c129fed379ea")
public class sendEmail extends BasePage
{
	public sendEmail (WebDriver driver)
	{
		super(driver);
	}


	
	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By chooseSentoptionElem = By.xpath("//label[normalize-space()= 'Send Payslips:']/../select");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");
	
	private By clickSend1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickPayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By chooseEmailTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$EmailType']");

	private By clickEmailPayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By clickSendElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12395");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12395");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12395");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12395";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12395")) {
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
 	 * Select chooseSentoption
     * @name Select chooseSentoption
     */
    public void Select_chooseSentoption(String chooseSentoption)
 	{
 	    
 		WebElement elem = getWebElement(chooseSentoptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_chooseSentoption", "Select_chooseSentoption failed. Unable to locate object: " + chooseSentoptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_chooseSentoption", "Select_chooseSentoption failed. Unable to locate object: " + chooseSentoptionElem.toString());

 			Assert.fail("Unable to locate object: " + chooseSentoptionElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(chooseSentoption);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_chooseSentoption " + chooseSentoption);

 		TestModellerLogger.PassStep(m_Driver, "Select_chooseSentoption " + chooseSentoption);
 	}

     
	/**
 	 * Click RunPayroll2
	 * @throws InterruptedException 
     * @name Click RunPayroll2
     */
	public void Click_RunPayroll2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll2Elem.toString());
        }

		elem.click();
		
		Thread.sleep(3000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}
	
	
	
	/**
 	 * Click clickSend1
	 * @throws InterruptedException 
     * @name Click clickSend1
     */
	public void Click_clickSend1() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem = getWebElement(clickSend1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSend1", "Click_clickSend1 failed. Unable to locate object: " + clickSend1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSend1", "Click_clickSend1 failed. Unable to locate object: " + clickSend1Elem.toString());

			Assert.fail("Unable to locate object: " + clickSend1Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSend1");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSend1");
	}

     
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click clickPayslips
     * @name Click clickPayslips
     */
	public void Click_clickPayslips()
	{
        
		WebElement elem = getWebElement(clickPayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayslips", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayslips", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayslipsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayslips");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayslips");
	}

    
	/**
 	 * Select chooseEmailType
     * @name Select chooseEmailType
     */
    public void Select_chooseEmailType(String chooseEmailType)
 	{
 	    
 		WebElement elem = getWebElement(chooseEmailTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_chooseEmailType", "Select_chooseEmailType failed. Unable to locate object: " + chooseEmailTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_chooseEmailType", "Select_chooseEmailType failed. Unable to locate object: " + chooseEmailTypeElem.toString());

 			Assert.fail("Unable to locate object: " + chooseEmailTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(chooseEmailType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_chooseEmailType " + chooseEmailType);

 		TestModellerLogger.PassStep(m_Driver, "Select_chooseEmailType " + chooseEmailType);
 	}

     
	/**
 	 * Click clickEmailPayslips
     * @name Click clickEmailPayslips
     */
	public void Click_clickEmailPayslips()
	{
        
		WebElement elem = getWebElement(clickEmailPayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEmailPayslips", "Click_clickEmailPayslips failed. Unable to locate object: " + clickEmailPayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEmailPayslips", "Click_clickEmailPayslips failed. Unable to locate object: " + clickEmailPayslipsElem.toString());

			Assert.fail("Unable to locate object: " + clickEmailPayslipsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEmailPayslips");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEmailPayslips");
	}

     
	/**
 	 * Click clickSend
     * @name Click clickSend
     */
	public void Click_clickSend()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(clickSendElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSend", "Click_clickSend failed. Unable to locate object: " + clickSendElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSend", "Click_clickSend failed. Unable to locate object: " + clickSendElem.toString());

			Assert.fail("Unable to locate object: " + clickSendElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSend");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSend");
	}
}