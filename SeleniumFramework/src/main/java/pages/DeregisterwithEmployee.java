package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4fd2626b-0087-4165-a5c2-cba368eb59e4
@TestModellerModule(guid = "4fd2626b-0087-4165-a5c2-cba368eb59e4")
public class DeregisterwithEmployee extends BasePage
{
	public DeregisterwithEmployee (WebDriver driver)
	{
		super(driver);
	}


	
	private By StatusSearch1Elem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$ddlStatusSearch']");

	private By SelectCheckBoxElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$chAllRTI']");

	private By SubmitReasonElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$ddlSubmitReason']");

	private By SubmitToHMRCElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSubmitRTI']");

	private By PayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12018&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12018&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12018&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12018&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12018&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select StatusSearch1
     * @name Select StatusSearch1
     */
    public void Select_StatusSearch1(String StatusSearch1)
 	{
 	    
 		WebElement elem = getWebElement(StatusSearch1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_StatusSearch1", "Select_StatusSearch1 failed. Unable to locate object: " + StatusSearch1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_StatusSearch1", "Select_StatusSearch1 failed. Unable to locate object: " + StatusSearch1Elem.toString());

 			Assert.fail("Unable to locate object: " + StatusSearch1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(StatusSearch1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_StatusSearch1 " + StatusSearch1);

 		TestModellerLogger.PassStep(m_Driver, "Select_StatusSearch1 " + StatusSearch1);
 	}

     
	/**
 	 * Click SelectCheckBox
     * @name Click SelectCheckBox
     */
	public void Click_SelectCheckBox()
	{
        
		WebElement elem = getWebElement(SelectCheckBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectCheckBox", "Click_SelectCheckBox failed. Unable to locate object: " + SelectCheckBoxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectCheckBox", "Click_SelectCheckBox failed. Unable to locate object: " + SelectCheckBoxElem.toString());

			Assert.fail("Unable to locate object: " + SelectCheckBoxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectCheckBox");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectCheckBox");
	}

    
	/**
 	 * Select SubmitReason
     * @name Select SubmitReason
     */
    public void Select_SubmitReason(String SubmitReason)
 	{
 	    
 		WebElement elem = getWebElement(SubmitReasonElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SubmitReason", "Select_SubmitReason failed. Unable to locate object: " + SubmitReasonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SubmitReason", "Select_SubmitReason failed. Unable to locate object: " + SubmitReasonElem.toString());

 			Assert.fail("Unable to locate object: " + SubmitReasonElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SubmitReason);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SubmitReason " + SubmitReason);

 		TestModellerLogger.PassStep(m_Driver, "Select_SubmitReason " + SubmitReason);
 	}

     
	/**
 	 * Click SubmitToHMRC
	 * @throws InterruptedException 
     * @name Click SubmitToHMRC
     */
	public void Click_SubmitToHMRC() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SubmitToHMRCElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SubmitToHMRC", "Click_SubmitToHMRC failed. Unable to locate object: " + SubmitToHMRCElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SubmitToHMRC", "Click_SubmitToHMRC failed. Unable to locate object: " + SubmitToHMRCElem.toString());

			Assert.fail("Unable to locate object: " + SubmitToHMRCElem.toString());
        }

		elem.click();
//		
//		int tableSize2=m_Driver.findElements(By.xpath("//*[@id='aspnetForm\']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr")).size();
//		System.out.println(tableSize2);
		
		
//		WebElement undo=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_btnUndo']"));
//		if(!undo.isDisplayed())
//		{
//			m_Driver.wait();
//		}
//		WebDriverWait wait=new WebDriverWait(m_Driver, 70);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_btnUndo']")));
		Thread.sleep(100000);
		m_Driver.navigate().refresh();
		
		Thread.sleep(10000);

		m_Driver.navigate().refresh();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SubmitToHMRC");

		TestModellerLogger.PassStep(m_Driver, "Click_SubmitToHMRC");
	}

     
	/**
 	 * Click PayrollDashboard
     * @name Click PayrollDashboard
     */
	public void Click_PayrollDashboard()
	{
        
		WebElement elem = getWebElement(PayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollDashboard", "Click_PayrollDashboard failed. Unable to locate object: " + PayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayrollDashboard", "Click_PayrollDashboard failed. Unable to locate object: " + PayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + PayrollDashboardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_PayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_PayrollDashboard");
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
}