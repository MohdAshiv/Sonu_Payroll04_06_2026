package pages;

import pages.BasePage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e88af30b-0174-4813-aa94-623a5c74eab1
@TestModellerModule(guid = "e88af30b-0174-4813-aa94-623a5c74eab1")
public class paswProtectionPDF extends BasePage
{
	public paswProtectionPDF (WebDriver driver)
	{
		super(driver);
	}


	
	private By SelectPaswdProtectionFormatElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$chkPwdProtectPaySlips1']");

	private By clickSaveElem = By.xpath("//*[@id='btnSave']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By SelectcontactOptionElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$ddlPaySlipTemplate']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By PayrollgeneratedMessageElem = By.xpath("//DIV[@class='alert alert-success']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11978");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11978");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11978");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11978";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11978")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select SelectPaswdProtectionFormat
	 * @throws InterruptedException 
     * @name Select SelectPaswdProtectionFormat
     */
    public void Select_SelectPaswdProtectionFormat(String SelectPaswdProtectionFormat) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SelectPaswdProtectionFormatElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectPaswdProtectionFormat", "Select_SelectPaswdProtectionFormat failed. Unable to locate object: " + SelectPaswdProtectionFormatElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectPaswdProtectionFormat", "Select_SelectPaswdProtectionFormat failed. Unable to locate object: " + SelectPaswdProtectionFormatElem.toString());

 			Assert.fail("Unable to locate object: " + SelectPaswdProtectionFormatElem.toString());
         }

 		Thread.sleep(3000);
 		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectPaswdProtectionFormat);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectPaswdProtectionFormat " + SelectPaswdProtectionFormat);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectPaswdProtectionFormat " + SelectPaswdProtectionFormat);
 	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click()", elem);
		
		Thread.sleep(3000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click gotoPayrollDashboard
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard()
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
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
 	 * Select SelectcontactOption
     * @name Select SelectcontactOption
     */
    public void Select_SelectcontactOption(String SelectcontactOption)
 	{
 	    
 		WebElement elem = getWebElement(SelectcontactOptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectcontactOption", "Select_SelectcontactOption failed. Unable to locate object: " + SelectcontactOptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectcontactOption", "Select_SelectcontactOption failed. Unable to locate object: " + SelectcontactOptionElem.toString());

 			Assert.fail("Unable to locate object: " + SelectcontactOptionElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectcontactOption);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectcontactOption " + SelectcontactOption);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectcontactOption " + SelectcontactOption);
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
     * @name Click PayrollgeneratedMessage
     */
	public void Click_PayrollgeneratedMessage()
	{
        
		WebElement elem = getWebElement(PayrollgeneratedMessageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollgeneratedMessage", "Click_PayrollgeneratedMessage failed. Unable to locate object: " + PayrollgeneratedMessageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayrollgeneratedMessage", "Click_PayrollgeneratedMessage failed. Unable to locate object: " + PayrollgeneratedMessageElem.toString());

			Assert.fail("Unable to locate object: " + PayrollgeneratedMessageElem.toString());
        }

		elem.click();
		String Actual=elem.getText();
		String Expected="Success! Payroll generated successfully.";
		Assert.assertEquals(Actual, Expected);
          	

		ExtentReportManager.passStep(m_Driver, "Click_PayrollgeneratedMessage");

		TestModellerLogger.PassStep(m_Driver, "Click_PayrollgeneratedMessage");
	}


	public void SwitchToAgentPage(int index) throws InterruptedException {
		
		String windowId=null;
		Set<String> windowIds= m_Driver.getWindowHandles();
		Iterator<String> itr=windowIds.iterator();
		
//		String mainWindow=itr.next();
//		String childWindow=itr.next();
		
		for(int i=1; i<=index; i++)
		{
		
			windowId=itr.next();
		
		}
		
		m_Driver.switchTo().window(windowId);
		
		Thread.sleep(1000);
		
		
	}
}