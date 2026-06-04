package page.factory;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/88f20342-ca67-4d75-91ef-9df47489ed68
@TestModellerModule(guid = "88f20342-ca67-4d75-91ef-9df47489ed68")
public class AOE_ChildSupportPopup extends BasePage
{
	public AOE_ChildSupportPopup (WebDriver driver)
	{
		super(driver);
	}


	
	private By referenceElem = By.xpath("//*[@id='txtRef']");

	private By DescriptionElem = By.xpath("//*[@id='txtDescription']");

	private By DateMadeElem = By.xpath("//*[@id='txtDatemade']");

	private By DateAppliedForElem = By.xpath("//*[@id='txtDate2applyFrom']");

	private By Date2StopElem = By.xpath("//*[@id='txtDate2Stop']");

	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");
	
	private By CheckPriorityElem=By.xpath("//input[@id='chkPriority']");
	
	private By EnterMonthlyAmtElem=By.xpath("//input[@id='txtMonthlyAmt']");
	
	private By EnterProtectedAmtElem=By.xpath("//input[@id='txtProtectedEarning']");
	
	private By getYrToDateElem=By.xpath("//input[@id='txtYearToDateDeduction']");
	
	private By checkAdminChargeElem=By.xpath("//input[@id='chkAdminCharge']");

	private By EnterAttachmentShortfallAtStartElem=By.xpath("//input[@id='txtAttachmentShortfallStart']");
	
	private By EnterCumulatvAmntPaidStartElem=By.xpath("//input[@id='txtCumulatvAmntPaidStart']");
	
	private By EnterNotesElem=By.xpath("//input[@id='txtNotes']");
	
	private By ClickSavebtnElem=By.xpath("//a[@id='btnSave']");
	
	private By closePopupElem=By.xpath("//button[@id='cboxClose']");


     
	/**
 	 * Click Enter referenceElem
	 * @throws InterruptedException 
     * @name Enter referenceElem
     */
	public void Enter_referenceElem(String EnterReference) throws InterruptedException
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
        
		WebElement elem = getWebElement(referenceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_referenceElem", "Enter_referenceElem failed. Unable to locate object: " + referenceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_referenceElem", "Enter_referenceElem failed. Unable to locate object: " + referenceElem.toString());

			Assert.fail("Unable to locate object: " + referenceElem.toString());
        }

		
		elem.sendKeys(EnterReference);
		
		Thread.sleep(1000);
		
	//	ChangeWindow.tabswitch(m_Driver);
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "Enter_referenceElem");

		TestModellerLogger.PassStep(m_Driver, "Enter_referenceElem");
	}

     
	/**
 	 * Click Enter DescriptionElem
	 * @throws InterruptedException 
     * @name Enter DescriptionElem
     */
	public void Enter_Description(String Description) throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
        
		WebElement elem = getWebElement(DescriptionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
        }

		elem.sendKeys(Description);
		
		Thread.sleep(1000);
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "Enter_Description");

		TestModellerLogger.PassStep(m_Driver, "Enter_Description");
	}

     
	/**
 	 * Click Enter DateMade
	 * @throws InterruptedException 
     * @name Enter DateMade
     */
	public void Enter_DateMade(String DateMade) throws InterruptedException
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
        
		WebElement elem = getWebElement(DateMadeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateMade", "Enter_DateMade failed. Unable to locate object: " + DateMadeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateMade", "Enter_DateMade failed. Unable to locate object: " + DateMadeElem.toString());

			Assert.fail("Unable to locate object: " + DateMadeElem.toString());
        }

		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(DateMade);
 		
 		elem.sendKeys(Keys.ENTER);
		
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Enter_DateMade");

		TestModellerLogger.PassStep(m_Driver, "Enter_DateMade");
	}

      
	/**
 	 * Enter EnterDateAppliedFor
	 * @throws Exception 
     * @name Enter EnterDateAppliedFor
     */
 	public void Enter_DateAppliedFor(String EnterDateApply) throws Exception
 	{
 	    
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));

 		WebElement elem = getWebElement(DateAppliedForElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateAppliedFor", "Enter_DateAppliedFor failed. Unable to locate object: " + DateAppliedForElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DateAppliedFor", "Enter_DateAppliedFor failed. Unable to locate object: " + DateAppliedForElem.toString());

 			Assert.fail("Unable to locate object: " + DateAppliedForElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(EnterDateApply);
 		
 		elem.sendKeys(Keys.ENTER);
 		
 		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(1000);

		
		

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DateAppliedFor " + EnterDateApply);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DateAppliedFor " + EnterDateApply);
 	}
 	
 	
 	
     
	/**
 	 * Click Date2Stop
	 * @throws Exception 
	 * @name Enter Date2StopElem
     */
	public void Enter_Date2Stop(String Date2Stop) throws Exception
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));

		WebElement elem = getWebElement(Date2StopElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date2Stop", "Enter_Date2Stop failed. Unable to locate object: " + Date2StopElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date2Stop", "Enter_Date2Stop failed. Unable to locate object: " + Date2StopElem.toString());

			Assert.fail("Unable to locate object: " + Date2StopElem.toString());
        }

		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Date2Stop);
 		
 		elem.sendKeys(Keys.ENTER);
 		
 		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Enter_Date2Stop" +Date2Stop);

		TestModellerLogger.PassStep(m_Driver, "Enter_Date2Stop" +Date2Stop);
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

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
		//m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll\"]")).click();
          	

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

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}

     
	/**
 	 * Click gotoFilingManagement
	 * @throws Exception 
     * @name Click gotoFilingManagement
     */
	public void Click_gotoFilingManagement() throws Exception
	{
        
		WebElement elem = getWebElement(gotoFilingManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFilingManagementElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "FPS File_1");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagement");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFilingManagement");
	}


	public void CheckPriority() throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(CheckPriorityElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "CheckPriority", "CheckPriority failed. Unable to locate object: " + CheckPriorityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "CheckPriority", "CheckPriority failed. Unable to locate object: " + CheckPriorityElem.toString());

			Assert.fail("Unable to locate object: " + CheckPriorityElem.toString());
        }

		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.click();
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "CheckPriority");

		TestModellerLogger.PassStep(m_Driver, "CheckPriority");
		
	}
	
	
	
	/*
	 * Enter Monthly amount
	 * 
	 */
	public void Enter_MonthlyAmount(String monthlyAmt) throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(EnterMonthlyAmtElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_MonthlyAmount", "Enter_MonthlyAmount failed. Unable to locate object: " + EnterMonthlyAmtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_MonthlyAmount", "Enter_MonthlyAmount failed. Unable to locate object: " + EnterMonthlyAmtElem.toString());

			Assert.fail("Unable to locate object: " + EnterMonthlyAmtElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.clear();
		
		elem.sendKeys(monthlyAmt);
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "Enter_MonthlyAmount"+ monthlyAmt);

		TestModellerLogger.PassStep(m_Driver, "Enter_MonthlyAmount" +monthlyAmt);
		
	}
	
	
	/*
	 * Enter Protected amount
	 * 
	 */
	public void getYrToDate() throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(getYrToDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "getYrToDate", "getYrToDate failed. Unable to locate object: " + getYrToDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "getYrToDate", "getYrToDate failed. Unable to locate object: " + getYrToDateElem.toString());

			Assert.fail("Unable to locate object: " + getYrToDateElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		System.out.println("Year to date amount="+elem.getText());
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "Enter_ProtectedAmt");

		TestModellerLogger.PassStep(m_Driver, "Enter_ProtectedAmt");
		
	}
	
	
	/*
	 * Get Year to Date amount
	 * 
	 */
	public void Enter_ProtectedAmt(String protectedAmt) throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(EnterProtectedAmtElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ProtectedAmt", "Enter_ProtectedAmt failed. Unable to locate object: " + EnterProtectedAmtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ProtectedAmt", "Enter_ProtectedAmt failed. Unable to locate object: " + EnterProtectedAmtElem.toString());

			Assert.fail("Unable to locate object: " + EnterProtectedAmtElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.clear();
		
		elem.sendKeys(protectedAmt);
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "Enter_ProtectedAmt"+ protectedAmt);

		TestModellerLogger.PassStep(m_Driver, "Enter_ProtectedAmt" +protectedAmt);
		
	}
	
	
	/**
	 * check Admin charge check box
	 * 
	 */
	public void CheckAdminChargeBox() throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(checkAdminChargeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "CheckAdminChargeBox", "CheckAdminChargeBox failed. Unable to locate object: " + checkAdminChargeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "CheckAdminChargeBox", "CheckAdminChargeBox failed. Unable to locate object: " + checkAdminChargeElem.toString());

			Assert.fail("Unable to locate object: " + checkAdminChargeElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.click();
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "CheckAdminChargeBox");

		TestModellerLogger.PassStep(m_Driver, "CheckAdminChargeBox");
		
	}
	
	
	/*
	 * Enter AttachmentShortfallAmtatStart amount
	 * 
	 */
	public void EnterAttachmentShortfallAtStart(String ShortfallAmtAtStart) throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(EnterAttachmentShortfallAtStartElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "EnterAttachmentShortfallAtStart", "EnterAttachmentShortfallAtStart failed. Unable to locate object: " + EnterAttachmentShortfallAtStartElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "EnterAttachmentShortfallAtStart", "EnterAttachmentShortfallAtStart failed. Unable to locate object: " + EnterAttachmentShortfallAtStartElem.toString());

			Assert.fail("Unable to locate object: " + EnterAttachmentShortfallAtStartElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.clear();
		
		elem.sendKeys(ShortfallAmtAtStart);
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "EnterAttachmentShortfallAtStart"+ ShortfallAmtAtStart);

		TestModellerLogger.PassStep(m_Driver, "EnterAttachmentShortfallAtStart" +ShortfallAmtAtStart);
		
	}
	
	
	/*
	 * Enter EnterCumulatvAmntPaidStartElem amount
	 * 
	 */
	public void EnterCumulatvAmntPaidStart(String ComulativePaidStart) throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(EnterCumulatvAmntPaidStartElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "EnterCumulatvAmntPaidStart", "EnterCumulatvAmntPaidStart failed. Unable to locate object: " + EnterCumulatvAmntPaidStartElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "EnterCumulatvAmntPaidStart", "EnterCumulatvAmntPaidStart failed. Unable to locate object: " + EnterCumulatvAmntPaidStartElem.toString());

			Assert.fail("Unable to locate object: " + EnterCumulatvAmntPaidStartElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.clear();
		
		elem.sendKeys(ComulativePaidStart);
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "EnterCumulatvAmntPaidStart"+ ComulativePaidStart);

		TestModellerLogger.PassStep(m_Driver, "EnterCumulatvAmntPaidStart" +ComulativePaidStart);
		
	}
	
	
	/*
	 * Enter EnterNotesElem
	 * 
	 */
	public void EnterNotes(String enterNotes) throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(EnterNotesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "EnterNotes", "EnterNotes failed. Unable to locate object: " + EnterNotesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "EnterNotes", "EnterNotes failed. Unable to locate object: " + EnterNotesElem.toString());

			Assert.fail("Unable to locate object: " + EnterNotesElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.clear();
		
		elem.sendKeys(enterNotes);
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "EnterNotes"+ enterNotes);

		TestModellerLogger.PassStep(m_Driver, "EnterNotes" +enterNotes);
		
	}
	
	
	/**
	 * check ClickSavebtnElem
	 * 
	 */
	public void ClickSavebtn() throws InterruptedException 
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(ClickSavebtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickSavebtn", "CheckAdminChargeBox failed. Unable to locate object: " + ClickSavebtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "CheckAdminChargeBox", "CheckAdminChargeBox failed. Unable to locate object: " + ClickSavebtnElem.toString());

			Assert.fail("Unable to locate object: " + ClickSavebtnElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.click();
		
		Thread.sleep(1000);
		
		
		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "CheckAdminChargeBox");

		TestModellerLogger.PassStep(m_Driver, "CheckAdminChargeBox");
		
	}
	
	
	/**
	 * check closePopupElem
	 * 
	 */
	public void closePopup() throws InterruptedException 
	{
		
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		
		WebElement elem = getWebElement(closePopupElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "closePopup", "closePopup failed. Unable to locate object: " + closePopupElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "closePopup", "closePopup failed. Unable to locate object: " + closePopupElem.toString());

			Assert.fail("Unable to locate object: " + closePopupElem.toString());
        }

//		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		elem.click();
		
		Thread.sleep(1000);
		
		
//		m_Driver.switchTo().defaultContent();
          	

		ExtentReportManager.passStep(m_Driver, "closePopup");

		TestModellerLogger.PassStep(m_Driver, "closePopup");
		
	}
	
}