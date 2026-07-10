package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class OneOffPayment extends BasePage{

	
	WebElement elem;
	public OneOffPayment (WebDriver driver)
	{
		super(driver);
	}
	
	
	
	

	private By oneOffPaymentElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnOneOff']");

	private By OneOffPaymentCloseBtn = By.xpath("(//button[@id='PopUpClose1'])[2]");

	

	private By saveBtnElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSaveAEEmployee']");
	private By saveBtnElem1 = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	

	/**
 	 * Click click_OneOffPayment
	 * @throws InterruptedException 
     * @name Click click_OneOffPayment
     */
   public void click_OneOffPayment() throws InterruptedException {

	   
	   WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(20));

       WebElement quickAction = wait.until(
       	    ExpectedConditions.elementToBeClickable(
       	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/div/div[2]/button")
       	    )
       	);

       	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);
       	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);
		elem = getWebElement(oneOffPaymentElem);
		
		if (elem == null) {
		 	ExtentReportManager.failStepWithScreenshot(m_Driver, "click_OneOffPayment", "click_OneOffPayment failed. Unable to locate object: " + oneOffPaymentElem.toString());

		 	TestModellerLogger.FailStepWithScreenshot(m_Driver, "click_OneOffPayment", "click_OneOffPayment failed. Unable to locate object: " + oneOffPaymentElem.toString());

		 		Assert.fail("Unable to locate object: " + oneOffPaymentElem.toString());
		
	}
		elem.click();
		Reporter.log("Clicked One Off Payment");
      	Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "click_OneOffPayment");

	}
   
   
   
	
   /**
	 * Click click_OneOffPaymentCloseBtn
	 * @throws Exception 
    * @name Click click_OneOffPaymentCloseBtn
    */
  public void click_OneOffPaymentCloseBtn() throws Exception {
		
		elem = getWebElement(OneOffPaymentCloseBtn);
		
		if (elem == null) {
		 	ExtentReportManager.failStepWithScreenshot(m_Driver, "click_OneOffPaymentCloseBtn", "click_OneOffPaymentCloseBtn failed. Unable to locate object: " + OneOffPaymentCloseBtn.toString());

		 	TestModellerLogger.FailStepWithScreenshot(m_Driver, "click_OneOffPaymentCloseBtn", "click_OneOffPaymentCloseBtn failed. Unable to locate object: " + OneOffPaymentCloseBtn.toString());

		 		Assert.fail("Unable to locate object: " + OneOffPaymentCloseBtn.toString());
		
	}
		elem.click();
		Reporter.log("clicked Close Button");
		
		Thread.sleep(4000);
		
		//jsExec.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
     	
		ExtentReportManager.passStep(m_Driver, "click_OneOffPaymentCloseBtn");

	}
  
  
  
  public void selectAllEmployeeAndClickSaveBtn() throws Exception {
	  
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

		elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdLeaverList_ctl01_chkSelectAll']"));

	    elem.click();

		 elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']"));

		  elem.click();
		Thread.sleep(2000);
		
		m_Driver.switchTo().defaultContent();

	    Reporter.log("selectAllEmployeeAndClickSaveBtn");
  }
  
  
  
  public void deletOneOffPayement() throws Exception {
	  
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

		elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnDelete']"));

	    elem.click();
	    
	    m_Driver.switchTo().alert().accept();
		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();

	    Reporter.log("deletOneOffPayement");
}
	
	
  
}
