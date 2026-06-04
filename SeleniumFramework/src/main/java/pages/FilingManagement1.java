package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3d9edbf9-7b03-43a8-b213-e301c594d313
@TestModellerModule(guid = "3d9edbf9-7b03-43a8-b213-e301c594d313")
public class FilingManagement1 extends BasePage
{
	public FilingManagement1 (WebDriver driver)
	{
		super(driver);
	}


	
	private By selectTaxYearsElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']");

	private By StatusSearchElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$ddlStatusSearch']");

	private By EnterNotesElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtNotes']");

	private By Not_to_submitElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']");

	private By SubmitReasonElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$ddlSubmitReason']");

	private By checkFileElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkStatus']");

	private By UndoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl00$btnUndo']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=15604");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=15604");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=15604");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=15604";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=15604")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select selectTaxYears
     * @name Select selectTaxYears
     */
    public void Select_selectTaxYears(String selectTaxYears)
 	{
 	    
 		WebElement elem = getWebElement(selectTaxYearsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectTaxYears", "Select_selectTaxYears failed. Unable to locate object: " + selectTaxYearsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectTaxYears", "Select_selectTaxYears failed. Unable to locate object: " + selectTaxYearsElem.toString());

 			Assert.fail("Unable to locate object: " + selectTaxYearsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectTaxYears);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectTaxYears " + selectTaxYears);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectTaxYears " + selectTaxYears);
 	}

    
	/**
 	 * Select StatusSearch
	 * @throws InterruptedException 
     * @name Select StatusSearch
     */
    public void Select_StatusSearch(String StatusSearch) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(StatusSearchElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_StatusSearch", "Select_StatusSearch failed. Unable to locate object: " + StatusSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_StatusSearch", "Select_StatusSearch failed. Unable to locate object: " + StatusSearchElem.toString());

 			Assert.fail("Unable to locate object: " + StatusSearchElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(StatusSearch);
 		
 		Thread.sleep(2000);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_StatusSearch " + StatusSearch);

 		TestModellerLogger.PassStep(m_Driver, "Select_StatusSearch " + StatusSearch);
 	}

      
	/**
 	 * Enter EnterNotes
     * @name Enter EnterNotes
     */
 	public void Enter_EnterNotes(String EnterNotes)
 	{
 	    
 		WebElement elem = getWebElement(EnterNotesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNotes", "Enter_EnterNotes failed. Unable to locate object: " + EnterNotesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNotes", "Enter_EnterNotes failed. Unable to locate object: " + EnterNotesElem.toString());

 			Assert.fail("Unable to locate object: " + EnterNotesElem.toString());
         }

 		elem.sendKeys(EnterNotes);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNotes " + EnterNotes);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNotes " + EnterNotes);
 	}

     
	/**
 	 * Click Not to submit
     * @name Click Not to submit
     */
	public void Click_Not_to_submit()
	{
        
		WebElement elem = getWebElement(Not_to_submitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Not_to_submit", "Click_Not_to_submit failed. Unable to locate object: " + Not_to_submitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Not_to_submit", "Click_Not_to_submit failed. Unable to locate object: " + Not_to_submitElem.toString());

			Assert.fail("Unable to locate object: " + Not_to_submitElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Not_to_submit");

		TestModellerLogger.PassStep(m_Driver, "Click_Not_to_submit");
	}
	
	
	/**
 	 * Click Not to submit
     * @name Click Not to submit
     */
	public void Click_Not_to_submit1()
	{
        
		WebElement elem = getWebElement(Not_to_submitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Not_to_submit", "Click_Not_to_submit failed. Unable to locate object: " + Not_to_submitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Not_to_submit", "Click_Not_to_submit failed. Unable to locate object: " + Not_to_submitElem.toString());

			Assert.fail("Unable to locate object: " + Not_to_submitElem.toString());
        }

		elem.click();
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_Not_to_submit");

		TestModellerLogger.PassStep(m_Driver, "Click_Not_to_submit");
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
 	 * Click checkFile
     * @name Click checkFile
     */
	public void Click_checkFile()
	{
        
		WebElement elem = getWebElement(checkFileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkFile", "Click_checkFile failed. Unable to locate object: " + checkFileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkFile", "Click_checkFile failed. Unable to locate object: " + checkFileElem.toString());

			Assert.fail("Unable to locate object: " + checkFileElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_checkFile");

		TestModellerLogger.PassStep(m_Driver, "Click_checkFile");
	}

     
	/**
 	 * Click Undo
     * @name Click Undo
     */
	public void Click_Undo()
	{
        
		WebElement elem = getWebElement(UndoElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Undo", "Click_Undo failed. Unable to locate object: " + UndoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Undo", "Click_Undo failed. Unable to locate object: " + UndoElem.toString());

			Assert.fail("Unable to locate object: " + UndoElem.toString());
        }

		elem.click();
		
		m_Driver.switchTo().alert().accept();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Undo");

		TestModellerLogger.PassStep(m_Driver, "Click_Undo");
	}


	public void selectMonth() {
		// TODO Auto-generated method stub
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect']")).click();
		
	}
}