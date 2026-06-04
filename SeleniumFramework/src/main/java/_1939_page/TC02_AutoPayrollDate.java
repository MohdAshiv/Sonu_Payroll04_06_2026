package _1939_page;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
public class TC02_AutoPayrollDate extends BasePage
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public TC02_AutoPayrollDate (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickPayrollSettingsElem = By.xpath("//A[contains(text(),'Payroll Settings')]");
	
	private By AutoRunDateElem = By.xpath("//label[contains(.,'Next Auto Payroll Run Date:')]/../div/div/input");

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
	//	TakeScreenshot.takeScreenshot(m_Driver, "selectedfreq");
		
		System.out.println("Hii");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
	}
	
	
	/**
	 * Verify auto run date error message
	 * 
	 */
	
	public void verify_error()
	{
		
		String Actualerrormsg=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]//following::strong")).get(0).getText();
//		jsExec.executeScript("arguments[0].", data)
		
		System.out.println("msg="+Actualerrormsg);
		
		String Expectedmsg="Error!";
		
		assertEquals(Actualerrormsg, Expectedmsg);
		
	}
	
	
	/**
 	 * Click clickPayrollSettings
	 * @throws Exception 
     * @name Click clickPayrollSettings
     */
	public void Click_clickPayrollSettings3() throws Exception
	{
        
		WebElement elem = getWebElement(clickPayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSettingsElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
		TakeScreenshot.takeScreenshot(m_Driver, "Blank Auto Run");
		
		String str=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtAutoRunDate']")).getAttribute("value");
		System.out.println("str="+str);
		
		String Expected="";
		
		assertEquals(str, Expected);
		
//		System.out.println("Hii");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
	}
	
	
	
	
	
	/**
 	 * Click clickPayrollSettings
	 * @throws Exception 
     * @name Click clickPayrollSettings
     */
	public void Click_clickPayrollSettings1() throws Exception
	{
		
		sTestCaseID="TC127";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
		WebElement elem = getWebElement(clickPayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSettingsElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
//		TakeScreenshot.takeScreenshot(m_Driver, "selectedfreq");
		
		String getAutoRunDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtAutoRunDate']")).getAttribute("value");
		System.out.println("getAutoRunDate="+getAutoRunDate);
		
		String ExpectedDate=data[4];
		System.out.println("ExpectedDate="+ExpectedDate);
		
		assertEquals(getAutoRunDate, ExpectedDate,"Auto run pay date not matched");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
	}
	
	
	/**
 	 * Click clickPayrollSettings
	 * @throws Exception 
     * @name Click clickPayrollSettings
     */
	public void Click_clickPayrollSettings2(String expDate) throws Exception
	{
		
		sTestCaseID="TC127";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
		WebElement elem = getWebElement(clickPayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSettingsElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
//		TakeScreenshot.takeScreenshot(m_Driver, "selectedfreq");
		
		String getAutoRunDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtAutoRunDate']")).getAttribute("value");
		System.out.println("getAutoRunDate="+getAutoRunDate);
		
		String ExpectedDate=expDate;
		System.out.println("ExpectedDate="+ExpectedDate);
		
		assertEquals(getAutoRunDate, ExpectedDate,"Auto run pay date not matched");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
	}
	
	
	
	
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAutoRunDate
     * @name Enter ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAutoRunDate
     */
 	public void Enter_AutoRunDate(String AutoRunDate)
 	{
 	    
 		WebElement elem = getWebElement(AutoRunDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AutoRunDate", "Enter_AutoRunDate failed. Unable to locate object: " + AutoRunDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AutoRunDate", "Enter_AutoRunDate failed. Unable to locate object: " + AutoRunDateElem.toString());

 			Assert.fail("Unable to locate object: " + AutoRunDateElem.toString());
         }
 		
 		elem.clear();

 		elem.sendKeys(AutoRunDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AutoRunDate " + AutoRunDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AutoRunDate " + AutoRunDate);
 	}
	
 	
 	
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAutoRunDate
     * @name Enter ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAutoRunDate
     */
 	public void Enter_AutoRunDate1()
 	{
 	    
// 		WebElement elem = getWebElement(AutoRunDateElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AutoRunDate", "Enter_AutoRunDate failed. Unable to locate object: " + AutoRunDateElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AutoRunDate", "Enter_AutoRunDate failed. Unable to locate object: " + AutoRunDateElem.toString());
//
// 			Assert.fail("Unable to locate object: " + AutoRunDateElem.toString());
//         }
 		
 		System.out.println("Hello");
 		
 		try
 		{
 		
 		m_Driver.findElement(By.xpath("//label[contains(.,'Next Auto Payroll Run Date:')]/../div/div/input")).isDisplayed();
 		}
 		catch(Exception e)
 		{
 			System.out.println("The type is Manual so Auto run will not be displayed ");
 		}
 		
 		
 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_AutoRunDate " + AutoRunDateElem);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_AutoRunDate " + AutoRunDateElem);
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

		Thread.sleep(3000);
		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(3000);

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