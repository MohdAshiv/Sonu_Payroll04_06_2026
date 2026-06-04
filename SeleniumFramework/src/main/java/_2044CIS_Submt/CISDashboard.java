package _2044CIS_Submt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class CISDashboard extends BasePage {

	public WebElement elem;
	public CISDashboard (WebDriver driver)
	{
		super(driver);
	}

	private By clickCISElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_CIS']/A");

	private By CISDashboard = By.xpath("//a[text()='CIS Dashboard']");
	
	private By clickContractorListElem = By.xpath("//A[contains(text(),'Contractor List')]");



	private By Period  = By.xpath("//span[text()='Period']");
	
    private By PeriodSavebtn = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
 
	private By PeriodClosebtn  = By.xpath("//button[@id='modalhrefAddPeriodClose']");

	private By SelectFinyer  = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPH$ddlTaxYears']");
	
	private By SelectMonth  = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$chkOctober']");
	
	private By New  = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[1]");
	
	private By Newinvoice = By.xpath("//a[text()='New Invoice']");
	
	private By InvoiceNo = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$txtInvoiceNo']");
	
	private By InvoiceDate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$txtInvoiceDate']");
    
    private By LabourAmt = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$rptrInvoiceTransactions$ctl00$txtLabourAmount']");

    private By InvoiceSavebtn = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	/**
 	 * Click clickCIS
     * @name Click clickCIS
     */
	public void Click_clickCIS()
	{
        
		 elem = getWebElement(clickCISElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickCIS", "Click_clickCIS failed. Unable to locate object: " + clickCISElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickCIS", "Click_clickCIS failed. Unable to locate object: " + clickCISElem.toString());

			Assert.fail("Unable to locate object: " + clickCISElem.toString());
        }

		elem.click();
		
		ClosePopup.ValidateAndPopUp(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickCIS");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCIS");
	}
    
    
	/**
	 * Click click CIS Dashboard
    * @name Click CIS Dashboard
    */
    
    public void Click_CISDashboard() 
	{
       elem = getWebElement(CISDashboard);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CISDashboard", "Click_CISDashboard. Unable to locate object: " + CISDashboard.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CISDashboard", "Click_CISDashboard. Unable to locate object: " + CISDashboard.toString());

			Assert.fail("Unable to locate object: " + CISDashboard.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_CISDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_CISDashboard");
	}
    
   	/**
 	 * Click clickContractorList
     * @name Click clickContractorList
     */
	public void Click_clickContractorList()
	{
        
		elem = getWebElement(clickContractorListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickContractorList", "Click_clickContractorList failed. Unable to locate object: " + clickContractorListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickContractorList", "Click_clickContractorList failed. Unable to locate object: " + clickContractorListElem.toString());

			Assert.fail("Unable to locate object: " + clickContractorListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickContractorList");

		TestModellerLogger.PassStep(m_Driver, "Click_clickContractorList");
	}
    
    /**
	 * Click click Period
    * @name Click Period
    */
    
    public void Click_Period() 
	{
       elem = getWebElement(Period);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Period", "Click_Period. Unable to locate object: " + Period.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Period", "Click_Period. Unable to locate object: " + Period.toString());

			Assert.fail("Unable to locate object: " + Period.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Period");

		TestModellerLogger.PassStep(m_Driver, "Click_Period");
	}
   
    /**
	 * Choose click FinacialYear
     * @throws InterruptedException 
    * @name Click FinacialYear
   */
    
    public void Choose_FinacialYer(String Year) throws InterruptedException 
	{
    
      m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddPeriodFrame']")));
      elem = getWebElement(SelectFinyer);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_FinacialYer", "Click_FinacialYer. Unable to locate object: " + SelectFinyer.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_FinacialYer", "Click_FinacialYer. Unable to locate object: " + SelectFinyer.toString());

			Assert.fail("Unable to locate object: " + SelectFinyer.toString());
        }
		Select se = new Select(elem);
		se.selectByVisibleText(Year);
        Thread.sleep(1000);
		
        m_Driver.switchTo().defaultContent();
        
     
		ExtentReportManager.passStep(m_Driver, "Click_FinacialYer");

		TestModellerLogger.PassStep(m_Driver, "Click_FinacialYer");
	}
    
    /**
 	 * Choose click Month
     * @throws InterruptedException 
     * @name Click Month
    */
     
     public void Choose_Month() throws InterruptedException 
 	{
         m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddPeriodFrame']")));

        elem = getWebElement(SelectMonth);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_Month", "Choose_Month. Unable to locate object: " + SelectMonth.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_Month", "Choose_Month. Unable to locate object: " + SelectMonth.toString());

 			Assert.fail("Unable to locate object: " + SelectMonth.toString());
         }

 		elem.click(); //october click
        Thread.sleep(1000);
 	
        m_Driver.switchTo().defaultContent();

 		ExtentReportManager.passStep(m_Driver, "Choose_Month");

 		TestModellerLogger.PassStep(m_Driver, "Choose_Month");
 	}
     
     /**
 	 * Click PeriodSavebtn
     * @throws InterruptedException 
     * @name Savebtn
    */
     
     public void Click_PeriodSavebtn() throws InterruptedException 
 	{
         m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddPeriodFrame']")));

        elem = getWebElement(PeriodSavebtn);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PeriodSavebtn", "Click_PeriodSavebtn. Unable to locate object: " + PeriodSavebtn.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PeriodSavebtn", "Click_PeriodSavebtn. Unable to locate object: " + PeriodSavebtn.toString());

 			Assert.fail("Unable to locate object: " + PeriodSavebtn.toString());
         }

 		elem.click();
        Thread.sleep(2000);
        m_Driver.switchTo().defaultContent(); 

 		ExtentReportManager.passStep(m_Driver, "Click_PeriodSavebtn");

 		TestModellerLogger.PassStep(m_Driver, "Click_PeriodSavebtn");
 	}
     
     /**
 	 * Click Period close
     * @throws InterruptedException 
     * @name Close btn
  */
     
     public void Click_PeriodClosebtn() throws InterruptedException 
     
 	{

        elem = getWebElement(PeriodClosebtn);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PeriodClosebtn", "Click_PeriodClosebtn. Unable to locate object: " + PeriodClosebtn.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PeriodClosebtn", "Click_PeriodClosebtn. Unable to locate object: " + PeriodClosebtn.toString());

 			Assert.fail("Unable to locate object: " + PeriodClosebtn.toString());
         }

 		elem.click();
 		Thread.sleep(1000);
         

 		ExtentReportManager.passStep(m_Driver, "Click_PeriodClosebtn");

 		TestModellerLogger.PassStep(m_Driver, "Click_PeriodClosebtn");
 	}
   
     /**
 	 * Click New
     * @throws InterruptedException 
     * @name New
    
     
    */ 
     public void Click_New() throws InterruptedException 
 	{
        elem = getWebElement(New);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New", "Click_New. Unable to locate object: " + New.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New", "Click_New. Unable to locate object: " + New.toString());

 			Assert.fail("Unable to locate object: " + New.toString());
         }
        
 		Thread.sleep(2000);
 		elem.click();
         

 		ExtentReportManager.passStep(m_Driver, "Click_New");

 		TestModellerLogger.PassStep(m_Driver, "Click_New");
 	}
     
     /**
 	 * Click NewInvoice
     * @name NewInvoice
     */
     
     public void Click_NewInvoice() 
 	{
        elem = getWebElement(Newinvoice);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewInvoice", "Click_NewInvoice. Unable to locate object: " + Newinvoice.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewInvoice", "Click_NewInvoice. Unable to locate object: " + Newinvoice.toString());

 			Assert.fail("Unable to locate object: " + Newinvoice.toString());
         }

 		elem.click();
         

 		ExtentReportManager.passStep(m_Driver, "Click_NewInvoice");

 		TestModellerLogger.PassStep(m_Driver, "Click_NewInvoice");
 	}
     
  
     /**
 	 * Enter InvoiceDate
     * @throws InterruptedException 
     * @name InvoiceDate
     */
     
     public void Enter_InvoiceDate(String date) throws InterruptedException 
 	{


        elem = getWebElement(InvoiceDate);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate. Unable to locate object: " + InvoiceDate.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_InvoiceDate", "Enter_InvoiceDate. Unable to locate object: " + InvoiceDate.toString());

 			Assert.fail("Unable to locate object: " + InvoiceDate.toString());
         }
        for(int i=0;i<=12;i++){
         elem.sendKeys(Keys.BACK_SPACE);
        }
 		elem.sendKeys(date);
         
        Thread.sleep(1000);
 		ExtentReportManager.passStep(m_Driver, "Enter_InvoiceDate");

 		TestModellerLogger.PassStep(m_Driver, "Enter_InvoiceDate");
 	}
     utilities.GernateRandomNumber rdm = new utilities.GernateRandomNumber();
     public void Select_InvoiceNo() throws InterruptedException 
 	{
    	 
        elem = getWebElement(InvoiceNo);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_InvoiceNo", "Select_InvoiceNo. Unable to locate object: " + InvoiceNo.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_InvoiceNo", "Select_InvoiceNo. Unable to locate object: " + InvoiceNo.toString());

 			Assert.fail("Unable to locate object: " + InvoiceNo.toString());
         }
        for(int j=0;j<=10;j++)
        {
        	elem.sendKeys(Keys.BACK_SPACE);
        }	
 		elem.sendKeys(rdm.gernateRandom()); // random number
        Thread.sleep(1000);

 		ExtentReportManager.passStep(m_Driver, "Select_InvoiceNo");

 		TestModellerLogger.PassStep(m_Driver, "Select_InvoiceNo");
 	}
     
     /**
 	 * Enter LabourAmt
     * @throws InterruptedException 
     * @name LabourAmt
     */
     
     public void Enter_LabourAmt(String Amt) throws InterruptedException 
 	{

        elem = getWebElement(LabourAmt);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LabourAmt", "Enter_LabourAmt. Unable to locate object: " + LabourAmt.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LabourAmt", "Enter_LabourAmt. Unable to locate object: " + LabourAmt.toString());

 			Assert.fail("Unable to locate object: " + LabourAmt.toString());
         }

 		elem.sendKeys(Amt);
        
        Thread.sleep(1000);
         

 		ExtentReportManager.passStep(m_Driver, "Enter_LabourAmt");

 		TestModellerLogger.PassStep(m_Driver, "Enter_LabourAmt");
 	}
   
     /**
 	 * Click Savebtn
     * @throws InterruptedException 
     * @name Savebtn
     */
     
     public void Click_InvoiceSavebtn() throws InterruptedException 
 	{

        elem = getWebElement(InvoiceSavebtn);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PeriodSavebtn", "Click_PeriodSavebtn. Unable to locate object: " + InvoiceSavebtn.toString());

     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PeriodSavebtn", "Click_PeriodSavebtn. Unable to locate object: " + InvoiceSavebtn.toString());

 			Assert.fail("Unable to locate object: " + InvoiceSavebtn.toString());
         }
 		
 		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
 		Thread.sleep(1000);
 		jsExec.executeScript("arguments[0].click();", elem);

        

 		ExtentReportManager.passStep(m_Driver, "Click_InvoiceSavebtn");

 		TestModellerLogger.PassStep(m_Driver, "Click_InvoiceSavebtn");
 	}
     
     
     public void clickCisFailedReport() throws Exception {
    	 
    	 
    	 
    	  elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_Ul1']/li[4]/a"));
    	  
    		Thread.sleep(1000);
     		jsExec.executeScript("arguments[0].click();", elem);
    		Thread.sleep(3000);

     		Reporter.log("clickCisFailedReport");
     		
     		
     		
     }

     
     
     public void clickCisFailedStatus() throws Exception {
    	 
    	 
    	 
   	  elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionStatus']"));
   	  
   		Thread.sleep(1000);
    		jsExec.executeScript("arguments[0].click();", elem);
   		Thread.sleep(3000);

    		Reporter.log("clickCisFailedStatus");
    		
    		
    		
    }

 
}
