package PayrollDashboardUI;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/69cc4977-fbe5-49d8-bd5c-3752d00fca06
@TestModellerModule(guid = "69cc4977-fbe5-49d8-bd5c-3752d00fca06")
public class PayrollDoUndo extends BasePage
{
	public PayrollDoUndo (WebDriver driver)
	{
		super(driver);
	}


	
	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By getSuccessMsgElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]");

	private By Undo_Last_Payroll_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']");

	private By closepopupElem = By.xpath("//A[contains(text(),'Edit')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15256");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15256");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15256");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15256";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15256")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click RunPayroll1
	 * @throws Exception 
     * @name Click RunPayroll1
     */
	public void Click_RunPayroll1() throws Exception
	{
        
		WebElement elem = getWebElement(RunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll1Elem.toString());
        }

		TakeScreenshot.takeScreenshot(m_Driver, "Payroll Date Before Payroll Run");
		
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
 	 * Click getSuccessMsg
     * @name Click getSuccessMsg
     */
	public void Click_getSuccessMsg()
	{
        
		WebElement elem = getWebElement(getSuccessMsgElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getSuccessMsg", "Click_getSuccessMsg failed. Unable to locate object: " + getSuccessMsgElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getSuccessMsg", "Click_getSuccessMsg failed. Unable to locate object: " + getSuccessMsgElem.toString());

			Assert.fail("Unable to locate object: " + getSuccessMsgElem.toString());
        }

		String ActualMsg=elem.getText();
		
		System.out.println(ActualMsg);
		
		String Expected="Success! Payroll generated successfully.";
		
		assertEquals(ActualMsg, Expected);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getSuccessMsg");

		TestModellerLogger.PassStep(m_Driver, "Click_getSuccessMsg");
	}
	
	
	/**
	 * Take screenshot after payroll Run
	 * @throws Exception 
	 */
	public void SCafterpayrollRun() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "Payroll Date After Payroll Run");
		
	}

     
	/**
 	 * Click Undo Last Payroll 
	 * @throws InterruptedException 
     * @name Click Undo Last Payroll 
     */
	public void Click_Undo_Last_Payroll_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Undo_Last_Payroll_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Undo_Last_Payroll_", "Click_Undo_Last_Payroll_ failed. Unable to locate object: " + Undo_Last_Payroll_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Undo_Last_Payroll_", "Click_Undo_Last_Payroll_ failed. Unable to locate object: " + Undo_Last_Payroll_Elem.toString());

			Assert.fail("Unable to locate object: " + Undo_Last_Payroll_Elem.toString());
        }

		elem.click();
		
		 m_Driver.switchTo().alert().accept(); 	
          	

		Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "Click_Undo_Last_Payroll_");

		TestModellerLogger.PassStep(m_Driver, "Click_Undo_Last_Payroll_");
	}

     
	/**
 	 * Click closepopup
	 * @throws InterruptedException 
     * @name Click closepopup
     */
	public void Click_closepopup() throws InterruptedException
	{
        
		WebElement elem = getWebElement(closepopupElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_closepopup", "Click_closepopup failed. Unable to locate object: " + closepopupElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_closepopup", "Click_closepopup failed. Unable to locate object: " + closepopupElem.toString());

			Assert.fail("Unable to locate object: " + closepopupElem.toString());
        }

		// Switching to Alert        
        Alert alert = m_Driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= m_Driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        

		ExtentReportManager.passStep(m_Driver, "Click_closepopup");

		TestModellerLogger.PassStep(m_Driver, "Click_closepopup");
	}


	public void Click_Undo_Deregister() throws Exception 
	{
		// TODO Auto-generated method stub
		m_Driver.findElement(By.xpath("//a[contains(text(),'Undo DeRegist')]")).click();
		
		m_Driver.switchTo().alert().accept();
		
	
		
	}
}