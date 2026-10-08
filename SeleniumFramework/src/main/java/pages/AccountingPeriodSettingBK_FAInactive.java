package pages;

import java.awt.event.FocusEvent.Cause;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class AccountingPeriodSettingBK_FAInactive extends BasePage{
	
	
	
	public AccountingPeriodSettingBK_FAInactive (WebDriver driver)
	{
		super(driver);
	}



	private By BookKeepingClienElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_hrefCompany']");

	private By SettingElem = By.xpath("//*[@id='ctl00_SideMenu1_settingMenu']/a");

	private By ClickBKEditElem = By.xpath("//a[normalize-space()='BK']");

	private By ClickAccountingPeriodElem = By.xpath("//*[@id='__tab_ctl00_cPH_tbContainer_TbAccPeriod']");

	private By AddAccountingPeriodElem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbAccPeriod_btnPreiodEdit']");

	private By NewStartDateElem = By.xpath("//input[@id='ctl00_cPH_rptrDisplayRecords_ctl00_txtStartDate']");

	private By NewEndDateElem = By.xpath("//input[@id='ctl00_cPH_rptrDisplayRecords_ctl00_txtEndDate']");

	private By AccPeriodSaveElem = By.xpath("//a[@id='ctl00_cpHeaderRight_btnSave']");

	private By servicesElem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_ddlService']");

	private By ClickEditElem = By.xpath("//a[@id='ctl00_cpHeaderRight_btnEdit']");

	private By CompanyAddLine1Elem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_txtAddress1']");

	
	private By SaveElem = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");
	
	private By SaveElem2 = By.xpath("//*[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");


   
   
   
   
   
   /**
	 * Click Click_BookKeepingClient
	 * @throws Exception 
    * @name Click Click_BookKeepingClient
    */
	public void Click_BookKeepingClient(String status) throws Exception
	{
       
		WebElement elem = getWebElement(BookKeepingClienElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BookKeepingClient", "Click_BookKeepingClient failed. Unable to locate object: " + BookKeepingClienElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BookKeepingClient", "Click_BookKeepingClient failed. Unable to locate object: " + BookKeepingClienElem.toString());

			Assert.fail("Unable to locate object: " + BookKeepingClienElem.toString());
       }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);
     	Thread.sleep(2000);
     	
     	
         	

		
		TestModellerLogger.PassStep(m_Driver, "Click_BookKeepingClient");
	}
   
   
     
	/**
 	 * Click Click_Setting
	 * @throws InterruptedException 
     * @name Click Click_Setting
     */
	public void Click_Setting() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SettingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Setting", "Click_Setting failed. Unable to locate object: " + SettingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + SettingElem.toString());

			Assert.fail("Unable to locate object: " + SettingElem.toString());
        }
		
		elem.click();
		Thread.sleep(3000);
		
          	

		

		TestModellerLogger.PassStep(m_Driver, "ChangeWindow.tabswitch(m_Driver);");
	}

     
	/**
 	 * Click Click_BKEdit
	 * @throws InterruptedException 
     * @name Click Click_BKEdit
     */
	public void Click_BKEdit() throws InterruptedException
	{
        
	
//		WebElement elem = getWebElement(ClickBKEditElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BKEdit", "Click_BKEdit failed. Unable to locate object: " + ClickBKEditElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BKEdit", "Click_BKEdit failed. Unable to locate object: " + ClickBKEditElem.toString());
//
//			Assert.fail("Unable to locate object: " + ClickBKEditElem.toString());
//        }
//
//		elem.click();
//        Thread.sleep(3000); 	
//        utilities.ChangeWindow.tabswitch(m_Driver);
//		
//        
//        try {
//        	
//            WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_Button1']"));
//			
//			elem1.click();
//			
//			
//			Thread.sleep(2000);
//			
//		} catch (Exception e) {
//			
////			System.err.println("_____element Not found_____");
//		}
//			
//			
//
//        WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_settingMenu']/a"));
//			
//    	elem2.click();
//        Thread.sleep(2000); 
//        
//        
//        WebElement elem3 = m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']"));
//		
//    	elem3.click();
//        Thread.sleep(2000); 
//		
//		
//
//		ExtentReportManager.passStep(m_Driver, "Click_BKEdit");

	}

     
	

     
	/**
 	 * Click Click_AccountingPeriod
	 * @throws InterruptedException 
     * @name Click Click_AccountingPeriod
     */
	public void Click_AccountingPeriod() throws InterruptedException
	{
        
//		WebElement elem = getWebElement(ClickAccountingPeriodElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AccountingPeriod", "Click_AccountingPeriod failed. Unable to locate object: " + ClickAccountingPeriodElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AccountingPeriod", "Click_AccountingPeriod failed. Unable to locate object: " + ClickAccountingPeriodElem.toString());
//
//			Assert.fail("Unable to locate object: " + ClickAccountingPeriodElem.toString());
//        }
//
//		elem.click();
//		Thread.sleep(2000);
//
//		ExtentReportManager.passStep(m_Driver, "Click_AccountingPeriod");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_AccountingPeriod");
	}

      
	
	
	
	/**
 	 * Click Click_AddAccountingPeriod
	 * @throws InterruptedException 
     * @name Click Click_AddAccountingPeriod
     */
	public void Click_AddAccountingPeriod() throws InterruptedException
	{
        
//		WebElement elem = getWebElement(AddAccountingPeriodElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddAccountingPeriod", "Click_AddAccountingPeriod failed. Unable to locate object: " + AddAccountingPeriodElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AddAccountingPeriod", "Click_AddAccountingPeriod failed. Unable to locate object: " + AddAccountingPeriodElem.toString());
//
//			Assert.fail("Unable to locate object: " + AddAccountingPeriodElem.toString());
//        }
//		Thread.sleep(2000);
//		
//		 
//        WebElement elem3 = m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']"));
//		
//    	elem3.click();
//        Thread.sleep(2000); 
//
//		elem.click();
//		Thread.sleep(2000);
//		ExtentReportManager.passStep(m_Driver, "Click_AddAccountingPeriod");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_AddAccountingPeriod");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
 	 * Enter Enter_NewStartDate
	 * @throws InterruptedException 
     * @name Enter Enter_NewStartDate
     */
 	public void Enter_NewStartDate(String NewStartDate) throws InterruptedException
 	{
 	    
// 		WebElement elem = getWebElement(NewStartDateElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NewStartDate", "Enter_NewStartDate failed. Unable to locate object: " + NewStartDateElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NewStartDate", "Enter_NewStartDate failed. Unable to locate object: " + NewStartDateElem.toString());
//
// 			Assert.fail("Unable to locate object: " + NewStartDateElem.toString());
//         }
//
// 		elem.clear();
// 		Thread.sleep(2000);
// 		elem.sendKeys(NewStartDate);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_NewStartDate " + NewStartDate);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_NewStartDate " + NewStartDate);
 	}

    
 	
 	
 	
 	
 	
 	
 	
 	/**
 	 * Enter Enter_NewEndDate
	 * @throws InterruptedException 
     * @name Enter Enter_NewEndDate
     */
 	public void Enter_NewEndDate(String NewEndDate) throws InterruptedException
 	{
// 	    
// 		WebElement elem = getWebElement(NewEndDateElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NewEndDate", "Enter_NewEndDate failed. Unable to locate object: " + NewEndDateElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NewEndDate", "Enter_NewEndDate failed. Unable to locate object: " + NewEndDateElem.toString());
//
// 			Assert.fail("Unable to locate object: " + NewEndDateElem.toString());
//         }
//
// 		elem.clear();
// 		Thread.sleep(2000);
// 		elem.sendKeys(NewEndDate);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_NewEndDate " + NewEndDate);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_NewEndDate " + NewEndDate);
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	/**
 	 * Click Click_AccPeriodSave
	 * @throws InterruptedException 
     * @name Click Click_AccPeriodSave
     */
	public void Click_AccPeriodSave() throws InterruptedException
	{
        
//		WebElement elem = getWebElement(AccPeriodSaveElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AccPeriodSave", "Click_AccPeriodSave failed. Unable to locate object: " + AccPeriodSaveElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AccPeriodSave", "Click_AccPeriodSave failed. Unable to locate object: " + AccPeriodSaveElem.toString());
//
//			Assert.fail("Unable to locate object: " + AccPeriodSaveElem.toString());
//        }
//
//		elem.click();
//		Thread.sleep(2000);
//
//		utilities.ChangeWindow.Switchwindow(1, m_Driver);
//		ExtentReportManager.passStep(m_Driver, "Click_AccPeriodSave");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_AccPeriodSave");
	}

      
 	
 	
 	
 	
 	
 	
	/**
 	 * Click Click_Edit
	 * @throws InterruptedException 
     * @name Click Click_Edit
     */
	public void Click_Edit() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickEditElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit", "Click_Edit failed. Unable to locate object: " + ClickEditElem.toString());

    		
			Assert.fail("Unable to locate object: " + ClickEditElem.toString());
        }

		elem.click();
         Thread.sleep(2000); 	

		ExtentReportManager.passStep(m_Driver, "Click_BKEdit");

	}

 	
 	
 	
 	
 	
	
 	/**
 	 * Select Select_services
	 * @throws InterruptedException 
     * @name Select Select_services
     */
    public void Select_services(String Service) throws InterruptedException
 	{
 	    
// 		WebElement elem = getWebElement(servicesElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_services", "Select_services failed. Unable to locate object: " + servicesElem.toString());
//
//    		
// 			Assert.fail("Unable to locate object: " + servicesElem.toString());
//         }
// 		
// 		Select dropdown = new Select(elem);
// 		dropdown.selectByVisibleText(Service);
// 		Thread.sleep(3000);
// 		Reporter.log("Select_services.");
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_services " + Service);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_services " + Service);
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
    /**
 	 * Enter Enter_CompanyAddressLine1
	 * @throws InterruptedException 
     * @name Enter Enter_CompanyAddressLine1
     */
 	public void Enter_CompanyAddressLine1(String CompanyAddLine1) throws InterruptedException
 	{
// 	    
// 		WebElement elem = getWebElement(CompanyAddLine1Elem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CompanyAddressLine1", "Enter_CompanyAddressLine1 failed. Unable to locate object: " + CompanyAddLine1Elem.toString());
//
//    		
// 			Assert.fail("Unable to locate object: " + CompanyAddLine1Elem.toString());
//         }
//
// 		elem.clear();
// 		Thread.sleep(2000);
// 		elem.sendKeys(CompanyAddLine1);
// 		
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_CompanyAddressLine1 " + CompanyAddLine1);

  		
 	}

 	
 	/**
 	 * Click Click_Save
	 * @throws InterruptedException 
     * @name Click Click_Save
     */
	public void Click_Save() throws InterruptedException
	{
        
//
//		WebElement elem = getWebElement(SaveElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());
//
//    		
//			Assert.fail("Unable to locate object: " + SaveElem.toString());
//        }
//
//		jsExec.executeScript("arguments[0].click();", elem);
//          	
//		Thread.sleep(2000);
//
//		ExtentReportManager.passStep(m_Driver, "Click_Save");

		
	}

	
	public void Click_Save2() throws InterruptedException
	{
        
		jsExec.executeScript("window.scrollBy(0,250)");

		WebElement elem = getWebElement(SaveElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save2", "Click_Save failed. Unable to locate object: " + SaveElem2.toString());

    		
			Assert.fail("Unable to locate object: " + SaveElem2.toString());
        }

//		elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_Save2");

		
	}

 	
 	
	/**
 	 * Enter PayeRefNo1
     * @name Enter PayeRefNo1
     */
}
