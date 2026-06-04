package pages;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/44e73009-a8a2-44ce-ab07-32b7cb9fe943
@TestModellerModule(guid = "44e73009-a8a2-44ce-ab07-32b7cb9fe943")
public class FrequencySet extends BasePage
{
	public FrequencySet (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickAdditionalFrequecyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ButtonLoadMoreFrequecy1']");

	private By payModeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$payMode1']");

	private By SelectFreqElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$payMode1']");

	private By SelectFrequencyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAnnualyPayDate']");
	
	private By AnnualPayDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAnnualyPayDate']");
	
	private By PayDateweeklyElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtWeeklyPayrollEndDate']");
	
	private By PayDateFortnightlyElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtFortnightlyPayrollEndDate']");
	
	private By PayDateFourweeklyElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtFourWeeklyPayrollEndDate']");
		
	private By clickSaveElem = By.xpath("//*[@id='btnSave']");

	private By FortnightlyPeriodEndDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtFourNightlyPayDate']");
	
	private By FourWeeklyPeriodEndDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtFourWeeklyPayDate']");

	private By DeleteMontholyElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_BtnCloseMonthly']");

	private By SelectFreq3Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_payMode2']");

	private By SelectFreq4Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_payMode3']");

	private By SelectFreq5Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_payMode4']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12019&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickAdditionalFrequecy
     * @name Click ClickAdditionalFrequecy
     */
	public void Click_ClickAdditionalFrequecy()
	{
        
		WebElement elem = getWebElement(ClickAdditionalFrequecyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickAdditionalFrequecy", "Click_ClickAdditionalFrequecy failed. Unable to locate object: " + ClickAdditionalFrequecyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickAdditionalFrequecy", "Click_ClickAdditionalFrequecy failed. Unable to locate object: " + ClickAdditionalFrequecyElem.toString());

			Assert.fail("Unable to locate object: " + ClickAdditionalFrequecyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickAdditionalFrequecy");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickAdditionalFrequecy");
		Reporter.log("Click_ClickAdditionalFrequecy");
	}

    
	/**
 	 * Select payMode
     * @name Select payMode
     */
    public void Select_payMode(String payMode)
 	{
 	    
 		WebElement elem = getWebElement(payModeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_payMode", "Select_payMode failed. Unable to locate object: " + payModeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_payMode", "Select_payMode failed. Unable to locate object: " + payModeElem.toString());

 			Assert.fail("Unable to locate object: " + payModeElem.toString());
         }
 		
 	

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(payMode);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_payMode " + payMode);

 		TestModellerLogger.PassStep(m_Driver, "Select_payMode " + payMode);
 	}

    
    
    
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
 	 * Select Select_F2
     * @name Select Select_F2
     */
    public void Select_F2(String frequency)
 	{
 	    
 		WebElement elem = getWebElement(SelectFreqElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_F2", "Select_F2 failed. Unable to locate object: " + SelectFreqElem.toString());

    		
 			Assert.fail("Unable to locate object: " + SelectFreqElem.toString());
         }
 		
 	

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(frequency);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_F2 " + frequency);
		Reporter.log("Select_F2"+frequency);

 		
 	}

    
    
    /**
 	 * Select Select_F3
     * @name Select Select_F3
     */
    public void Select_F3(String frequency)
 	{
 	    
 		WebElement elem = getWebElement(SelectFreq3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_F3", "Select_F3 failed. Unable to locate object: " + SelectFreqElem.toString());

    		
 			Assert.fail("Unable to locate object: " + SelectFreqElem.toString());
         }
 		
 	

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(frequency);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_F3 " + frequency);
		Reporter.log("Select_F3"+frequency);

 		
 	}
    
    
    
    /**
 	 * Select Select_F4
     * @name Select Select_F4
     */
    public void Select_F4(String frequency)
 	{
 	    
 		WebElement elem = getWebElement(SelectFreq4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_F4", "Select_F4 failed. Unable to locate object: " + SelectFreq4Elem.toString());

    		
 			Assert.fail("Unable to locate object: " + SelectFreq4Elem.toString());
         }
 		
 	

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(frequency);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_F4 " + frequency);
		Reporter.log("Select_F4"+frequency);

 		
 	}
    
    
    
    
    /**
 	 * Select Select_F5
     * @name Select Select_F5
     */
    public void Select_F5(String frequency)
 	{
 	    
 		WebElement elem = getWebElement(SelectFreq5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_F5", "Select_F5 failed. Unable to locate object: " + SelectFreq5Elem.toString());

    		
 			Assert.fail("Unable to locate object: " + SelectFreq5Elem.toString());
         }
 		
 	

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(frequency);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_F5 " + frequency);
		Reporter.log("Select_F5"+frequency);

 		
 	}
      
	/**
 	 * Enter SelectFrequency
     * @name Enter SelectFrequency
     */
 	public void Enter_SelectFrequency(String SelectFrequency)
 	{
 	    
 		WebElement elem = getWebElement(SelectFrequencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SelectFrequency", "Enter_SelectFrequency failed. Unable to locate object: " + SelectFrequencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SelectFrequency", "Enter_SelectFrequency failed. Unable to locate object: " + SelectFrequencyElem.toString());

 			Assert.fail("Unable to locate object: " + SelectFrequencyElem.toString());
         }

 		elem.sendKeys(SelectFrequency);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SelectFrequency " + SelectFrequency);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SelectFrequency " + SelectFrequency);
 	}

 	
	public void clickDeletBtn() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(DeleteMontholyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SelectFrequency", "Enter_SelectFrequency failed. Unable to locate object: " + DeleteMontholyElem.toString());


 			Assert.fail("Unable to locate object: " + SelectFrequencyElem.toString());
         }

 		elem.click();
 		
 		m_Driver.switchTo().alert().accept();
 		
 		Thread.sleep(7000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SelectFrequency " + DeleteMontholyElem);

 	}

 	
 	
 	
 	
 	
 	
 	
 	
 	
 
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	

	
	
	public void Enter_WeeklyPayDate(String PayDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(PayDateweeklyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_WeeklyPayDate", "Enter_WeeklyPayDate failed. Unable to locate object: " + PayDateweeklyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_WeeklyPayDate", "Enter_WeeklyPayDate failed. Unable to locate object: " + PayDateweeklyElem.toString());

 			Assert.fail("Unable to locate object: " + PayDateweeklyElem.toString());
         }
// 		for(int i=0;i<10;i++)
// 		{
// 		elem.sendKeys(Keys.BACK_SPACE);
// 		}
// 		Thread.sleep(2000);
 		elem.sendKeys(PayDate);
 		
 		//elem.sendKeys(Keys.TAB);
 		
 		Reporter.log("Entered PayDate."+PayDate);
 		
 		Thread.sleep(3000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_WeeklyPayDate " + PayDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_WeeklyPayDate " + PayDate);
  		
  		
 	}
	
	
	

	
	
	
	
	
	public void Enter_FortnightlyPeriodEndDate(String PeriodEndDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(FortnightlyPeriodEndDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FortnightlyPeriodEndDate", "Enter_FortnightlyPeriodEndDate failed. Unable to locate object: " + FortnightlyPeriodEndDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FortnightlyPeriodEndDate", "Enter_FortnightlyPeriodEndDate failed. Unable to locate object: " + FortnightlyPeriodEndDateElem.toString());

 			Assert.fail("Unable to locate object: " + FortnightlyPeriodEndDateElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(2000);
 		elem.sendKeys(PeriodEndDate);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		Reporter.log("Entered Period EndDate.");
 		
 		Thread.sleep(3000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FortnightlyPeriodEndDate " + PeriodEndDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FortnightlyPeriodEndDate " + PeriodEndDate);
 	}
	

	public void Enter_FortnightlyPayDate(String FortnightlyPayDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(PayDateFortnightlyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NomismaStartDate", "Enter_NomismaStartDate failed. Unable to locate object: " + PayDateFortnightlyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NomismaStartDate", "Enter_NomismaStartDate failed. Unable to locate object: " + PayDateFortnightlyElem.toString());

 			Assert.fail("Unable to locate object: " + PayDateFortnightlyElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(2000);
 		elem.sendKeys(FortnightlyPayDate);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		Reporter.log("Entered PayDate.");
 		
 		Thread.sleep(3000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmpJoiningDate " + FortnightlyPayDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmpJoiningDate " + FortnightlyPayDate);
 	}
	
	
	
	
	
	
	
	
	
	
	
	public void Enter_AnnualPayDate(String AnnualPayDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(AnnualPayDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AnnualPayDate", "Enter_AnnualPayDate failed. Unable to locate object: " + AnnualPayDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AnnualPayDate", "Enter_AnnualPayDate failed. Unable to locate object: " + AnnualPayDateElem.toString());

 			Assert.fail("Unable to locate object: " + AnnualPayDateElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(2000);
 		elem.sendKeys(AnnualPayDate);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		Reporter.log( AnnualPayDate+"  Annual PayDate Entered.");
 		
 		Thread.sleep(3000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AnnualPayDate " + AnnualPayDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AnnualPayDate " + AnnualPayDate);
 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	public void Enter_FourWeeklyPeriodEndDate(String PeriodEndDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(FourWeeklyPeriodEndDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FourWeeklyPeriodEndDate", "Enter_FortnightlyPeriodEndDate failed. Unable to locate object: " + FourWeeklyPeriodEndDateElem.toString());

    		Assert.fail("Unable to locate object: " + FourWeeklyPeriodEndDateElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 			
 			elem.sendKeys(Keys.BACK_SPACE);

 		}
 		Thread.sleep(2000);
 		elem.sendKeys(PeriodEndDate);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		Reporter.log("Entered Period EndDate.");
 		
 		Thread.sleep(3000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FourWeeklyPeriodEndDate " + PeriodEndDate);

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

		Thread.sleep(1000);
		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
	
	/**
	 * Verify Error message
	 * @throws Exception 
	 * 
	 */
	public void errormsg() throws Exception
	{
		
		String Actualmsg=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]/strong")).getText();
		System.out.println("msg="+Actualmsg);
		
		String Expectedmsg="Error!";
		assertEquals(Actualmsg, Expectedmsg);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Error msg when no Frequency");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Enter_FourWeeklyPayDate(String FourweeklyPayDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(PayDateFourweeklyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FourWeeklyPayDate", "Enter_FourWeeklyPayDate failed. Unable to locate object: " + PayDateFourweeklyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FourWeeklyPayDate", "Enter_FourWeeklyPayDate failed. Unable to locate object: " + PayDateFourweeklyElem.toString());

 			Assert.fail("Unable to locate object: " + PayDateFourweeklyElem.toString());
         }
 		
 		elem.sendKeys(FourweeklyPayDate);
 		
 	
 		
 		Reporter.log("Entered PayDate.");
 		
 		Thread.sleep(3000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmpJoiningDate " + FourweeklyPayDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmpJoiningDate " + FourweeklyPayDate);
 	}
	
}