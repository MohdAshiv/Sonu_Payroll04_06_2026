package PaymentMmgt;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ExcelData;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2aa8a2b5-cf25-40e4-98e0-3ce30fed49f0
@TestModellerModule(guid = "2aa8a2b5-cf25-40e4-98e0-3ce30fed49f0")
public class PaymentMmgt extends BasePage
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public PaymentMmgt (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickPayrollSettingsElem = By.xpath("//A[contains(text(),'Payroll Settings')]");

	private By clickCompanyDetailsElem = By.xpath("//A[@href='#CompanyDetails1']");

	private By MarkYestoPaymentMmgtElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbPaymentManagement_0']");

	private By clickSaveElem = By.xpath("//A[@id='btnSave']");

	private By getmsgElem = By.xpath("//DIV[@class='alert alert-success']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12139&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12139&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12139&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12139&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12139&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickPayrollSettings
	 * @throws Exception 
     * @name Click clickPayrollSettings
     */
	public void Click_clickPayrollSettings() throws Exception
	{
        
		WebElement elem = getWebElement(clickPayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSettingsElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
		TakeScreenshot.takeScreenshot(m_Driver, "selectedfreq");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
	}
	
	

	
	

     
	/**
 	 * Click clickCompanyDetails
	 * @throws InterruptedException 
     * @name Click clickCompanyDetails
     */
	public void Click_clickCompanyDetails() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickCompanyDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickCompanyDetails", "Click_clickCompanyDetails failed. Unable to locate object: " + clickCompanyDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickCompanyDetails", "Click_clickCompanyDetails failed. Unable to locate object: " + clickCompanyDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickCompanyDetailsElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickCompanyDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCompanyDetails");
	}
	
	/**
 	 * Click clickCompanyDetails
	 * @throws Exception 
	 * @name Click clickCompanyDetails
     */
	public void Click_clickCompanyDetails1() throws Exception
	{
        
		WebElement elem = getWebElement(clickCompanyDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickCompanyDetails", "Click_clickCompanyDetails failed. Unable to locate object: " + clickCompanyDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickCompanyDetails", "Click_clickCompanyDetails failed. Unable to locate object: " + clickCompanyDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickCompanyDetailsElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Payment_Management_Visibilty");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickCompanyDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCompanyDetails");
	}

     
	/**
 	 * Click MarkYestoPaymentMmgt
	 * @throws InterruptedException 
     * @name Click MarkYestoPaymentMmgt
     */
	public void Click_MarkYestoPaymentMmgt() throws InterruptedException
	{
        
		WebElement elem = getWebElement(MarkYestoPaymentMmgtElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MarkYestoPaymentMmgt", "Click_MarkYestoPaymentMmgt failed. Unable to locate object: " + MarkYestoPaymentMmgtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MarkYestoPaymentMmgt", "Click_MarkYestoPaymentMmgt failed. Unable to locate object: " + MarkYestoPaymentMmgtElem.toString());

			Assert.fail("Unable to locate object: " + MarkYestoPaymentMmgtElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_MarkYestoPaymentMmgt");

		TestModellerLogger.PassStep(m_Driver, "Click_MarkYestoPaymentMmgt");
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

	//	elem.click();
	jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click getmsg
     * @name Click getmsg
     */
	public void Click_getmsg()
	{
        
		WebElement elem = getWebElement(getmsgElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getmsg", "Click_getmsg failed. Unable to locate object: " + getmsgElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getmsg", "Click_getmsg failed. Unable to locate object: " + getmsgElem.toString());

			Assert.fail("Unable to locate object: " + getmsgElem.toString());
        }

		//elem.click();
		
		String Actual=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]")).getText();
		
		String Ecpectedmessage="Success! Company record is updated successfully.";
				
		assertEquals(Actual, Ecpectedmessage);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getmsg");

		TestModellerLogger.PassStep(m_Driver, "Click_getmsg");
	}
}