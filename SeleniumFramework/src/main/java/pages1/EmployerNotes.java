package pages1;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/47268d40-0c25-4e8c-af46-3e445b940583
@TestModellerModule(guid = "47268d40-0c25-4e8c-af46-3e445b940583")
public class EmployerNotes extends BasePage
{
	public EmployerNotes (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoEmployerNotesElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefNotesHistory']");

	private By YearEndNotesElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtYearEndNotes']");

	private By Month1Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl00$txtNotesHistory']");

	private By Month2Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl01$txtNotesHistory']");

	private By Month3Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl02$txtNotesHistory']");

	private By Month4Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl03$txtNotesHistory']");

	private By Month5Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl04$txtNotesHistory']");

	private By Month6Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl05$txtNotesHistory']");

	private By Month7Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl06$txtNotesHistory']");

	private By Month8Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl07$txtNotesHistory']");

	private By Month9Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl08$txtNotesHistory']");

	private By Month10Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl09$txtNotesHistory']");

	private By Month11Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl10$txtNotesHistory']");

	private By Month12Elem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl11$txtNotesHistory']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/NotesHistory.aspx?PayrollCompanyCode=11980");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/NotesHistory.aspx?PayrollCompanyCode=11980");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/NotesHistory.aspx?PayrollCompanyCode=11980");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/NotesHistory.aspx?PayrollCompanyCode=11980";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/NotesHistory.aspx?PayrollCompanyCode=11980")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoEmployerNotes
	 * @throws InterruptedException 
     * @name Click gotoEmployerNotes
     */
	public void Click_gotoEmployerNotes() throws InterruptedException
	{
        
		WebElement elem = getWebElement(gotoEmployerNotesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoEmployerNotes", "Click_gotoEmployerNotes failed. Unable to locate object: " + gotoEmployerNotesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoEmployerNotes", "Click_gotoEmployerNotes failed. Unable to locate object: " + gotoEmployerNotesElem.toString());

			Assert.fail("Unable to locate object: " + gotoEmployerNotesElem.toString());
        }

		elem.click();
		Thread.sleep(2000);
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYearEndNotes']")).sendKeys("Hello");
// 		elem.clear();

		ExtentReportManager.passStep(m_Driver, "Click_gotoEmployerNotes");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoEmployerNotes");
	}

      
	/**
 	 * Enter YearEndNotes
     * @name Enter YearEndNotes
     */
 	public void Enter_YearEndNotes(String YearEndNotes)
 	{
 	    
 		WebElement elem = getWebElement(YearEndNotesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_YearEndNotes", "Enter_YearEndNotes failed. Unable to locate object: " + YearEndNotesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_YearEndNotes", "Enter_YearEndNotes failed. Unable to locate object: " + YearEndNotesElem.toString());

 			Assert.fail("Unable to locate object: " + YearEndNotesElem.toString());
         }
// 		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYearEndNotes']")).click();
	elem.clear();
 		elem.sendKeys(YearEndNotes);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_YearEndNotes " + YearEndNotes);

  		TestModellerLogger.PassStep(m_Driver, "Enter_YearEndNotes " + YearEndNotes);
 	}

      
	/**
 	 * Enter Month1
     * @name Enter Month1
     */
 	public void Enter_Month1(String Month1)
 	{
 	    
 		WebElement elem = getWebElement(Month1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month1", "Enter_Month1 failed. Unable to locate object: " + Month1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month1", "Enter_Month1 failed. Unable to locate object: " + Month1Elem.toString());

 			Assert.fail("Unable to locate object: " + Month1Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month1 " + Month1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month1 " + Month1);
 	}

      
	/**
 	 * Enter Month2
     * @name Enter Month2
     */
 	public void Enter_Month2(String Month2)
 	{
 	    
 		WebElement elem = getWebElement(Month2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month2", "Enter_Month2 failed. Unable to locate object: " + Month2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month2", "Enter_Month2 failed. Unable to locate object: " + Month2Elem.toString());

 			Assert.fail("Unable to locate object: " + Month2Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month2 " + Month2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month2 " + Month2);
 	}

      
	/**
 	 * Enter Month3
     * @name Enter Month3
     */
 	public void Enter_Month3(String Month3)
 	{
 	    
 		WebElement elem = getWebElement(Month3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month3", "Enter_Month3 failed. Unable to locate object: " + Month3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month3", "Enter_Month3 failed. Unable to locate object: " + Month3Elem.toString());

 			Assert.fail("Unable to locate object: " + Month3Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month3 " + Month3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month3 " + Month3);
 	}

      
	/**
 	 * Enter Month4
     * @name Enter Month4
     */
 	public void Enter_Month4(String Month4)
 	{
 	    
 		WebElement elem = getWebElement(Month4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month4", "Enter_Month4 failed. Unable to locate object: " + Month4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month4", "Enter_Month4 failed. Unable to locate object: " + Month4Elem.toString());

 			Assert.fail("Unable to locate object: " + Month4Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month4 " + Month4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month4 " + Month4);
 	}

      
	/**
 	 * Enter Month5
     * @name Enter Month5
     */
 	public void Enter_Month5(String Month5)
 	{
 	    
 		WebElement elem = getWebElement(Month5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month5", "Enter_Month5 failed. Unable to locate object: " + Month5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month5", "Enter_Month5 failed. Unable to locate object: " + Month5Elem.toString());

 			Assert.fail("Unable to locate object: " + Month5Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month5);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month5 " + Month5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month5 " + Month5);
 	}

      
	/**
 	 * Enter Month6
     * @name Enter Month6
     */
 	public void Enter_Month6(String Month6)
 	{
 	    
 		WebElement elem = getWebElement(Month6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month6", "Enter_Month6 failed. Unable to locate object: " + Month6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month6", "Enter_Month6 failed. Unable to locate object: " + Month6Elem.toString());

 			Assert.fail("Unable to locate object: " + Month6Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month6);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month6 " + Month6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month6 " + Month6);
 	}

      
	/**
 	 * Enter Month7
     * @name Enter Month7
     */
 	public void Enter_Month7(String Month7)
 	{
 	    
 		WebElement elem = getWebElement(Month7Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month7", "Enter_Month7 failed. Unable to locate object: " + Month7Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month7", "Enter_Month7 failed. Unable to locate object: " + Month7Elem.toString());

 			Assert.fail("Unable to locate object: " + Month7Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month7);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month7 " + Month7);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month7 " + Month7);
 	}

      
	/**
 	 * Enter Month8
     * @name Enter Month8
     */
 	public void Enter_Month8(String Month8)
 	{
 	    
 		WebElement elem = getWebElement(Month8Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month8", "Enter_Month8 failed. Unable to locate object: " + Month8Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month8", "Enter_Month8 failed. Unable to locate object: " + Month8Elem.toString());

 			Assert.fail("Unable to locate object: " + Month8Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month8);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month8 " + Month8);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month8 " + Month8);
 	}

      
	/**
 	 * Enter Month9
     * @name Enter Month9
     */
 	public void Enter_Month9(String Month9)
 	{
 	    
 		WebElement elem = getWebElement(Month9Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month9", "Enter_Month9 failed. Unable to locate object: " + Month9Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month9", "Enter_Month9 failed. Unable to locate object: " + Month9Elem.toString());

 			Assert.fail("Unable to locate object: " + Month9Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month9);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month9 " + Month9);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month9 " + Month9);
 	}

      
	/**
 	 * Enter Month10
     * @name Enter Month10
     */
 	public void Enter_Month10(String Month10)
 	{
 	    
 		WebElement elem = getWebElement(Month10Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month10", "Enter_Month10 failed. Unable to locate object: " + Month10Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month10", "Enter_Month10 failed. Unable to locate object: " + Month10Elem.toString());

 			Assert.fail("Unable to locate object: " + Month10Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month10);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month10 " + Month10);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month10 " + Month10);
 	}

      
	/**
 	 * Enter Month11
     * @name Enter Month11
     */
 	public void Enter_Month11(String Month11)
 	{
 	    
 		WebElement elem = getWebElement(Month11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month11", "Enter_Month11 failed. Unable to locate object: " + Month11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month11", "Enter_Month11 failed. Unable to locate object: " + Month11Elem.toString());

 			Assert.fail("Unable to locate object: " + Month11Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month11);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month11 " + Month11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month11 " + Month11);
 	}

      
	/**
 	 * Enter Month12
     * @name Enter Month12
     */
 	public void Enter_Month12(String Month12)
 	{
 	    
 		WebElement elem = getWebElement(Month12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Month12", "Enter_Month12 failed. Unable to locate object: " + Month12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Month12", "Enter_Month12 failed. Unable to locate object: " + Month12Elem.toString());

 			Assert.fail("Unable to locate object: " + Month12Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(Month12);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Month12 " + Month12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Month12 " + Month12);
 	}

     
	/**
 	 * Click clickSave
     * @name Click clickSave
     */
	public void Click_clickSave()
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
          	TakeScreenshot.takeScreenshot(m_Driver, "EmployerNotes");
          	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_lnkViewNotes']/img")).click();
          	Thread.sleep(1000);
          	TakeScreenshot.takeScreenshot(m_Driver, "PDFEmployerNotes");
          	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefDownload']")).click();
          	
          	
          	
		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
}