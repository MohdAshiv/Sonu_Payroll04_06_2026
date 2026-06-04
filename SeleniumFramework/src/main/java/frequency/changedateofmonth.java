package frequency;

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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/800ad050-babf-4410-814d-43b1335d431e
@TestModellerModule(guid = "800ad050-babf-4410-814d-43b1335d431e")
public class changedateofmonth extends BasePage
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    
	public changedateofmonth (WebDriver driver)
	{
		super(driver);
	}


	
	private By selectDayofMonthFrequencyElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ddlMonthlyPayDay']");

	private By clickSaveElem = By.xpath("//A[@id='btnSave']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By verifychangedDateElem = By.xpath("//label[contains(.,'Period End:')]/../select");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12082&IsFirstRequest=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12082&IsFirstRequest=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12082&IsFirstRequest=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12082&IsFirstRequest=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12082&IsFirstRequest=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select selectDayofMonthFrequency
	 * @throws InterruptedException 
     * @name Select selectDayofMonthFrequency
     */
    public void Select_selectDayofMonthFrequency(String selectDayofMonthFrequency) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(selectDayofMonthFrequencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectDayofMonthFrequency", "Select_selectDayofMonthFrequency failed. Unable to locate object: " + selectDayofMonthFrequencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectDayofMonthFrequency", "Select_selectDayofMonthFrequency failed. Unable to locate object: " + selectDayofMonthFrequencyElem.toString());

 			Assert.fail("Unable to locate object: " + selectDayofMonthFrequencyElem.toString());
         }
 		elem.click();
 		Thread.sleep(2000); 

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectDayofMonthFrequency);
 		
 		
 		Thread.sleep(2000);
 		
 		jsExec.executeScript("arguments[0].scrollIntoView(true)", m_Driver.findElement(By.xpath("//*[@id='btnSave']")));
 		m_Driver.findElement(By.xpath("//*[@id='btnSave']")).click();
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectDayofMonthFrequency " + selectDayofMonthFrequency);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectDayofMonthFrequency " + selectDayofMonthFrequency);
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

		Thread.sleep(2000);
		elem.click();
		
		Thread.sleep(5000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click gotoPayrollDashboard
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard()
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

    
	/**
 	 * Select verifychangedDate
     * @name Select verifychangedDate
     */
    public void Select_verifychangedDate(String verifychangedDate)
 	{
    	sTestCaseID="TC42";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 	    
 		WebElement elem = getWebElement(verifychangedDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_verifychangedDate", "Select_verifychangedDate failed. Unable to locate object: " + verifychangedDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_verifychangedDate", "Select_verifychangedDate failed. Unable to locate object: " + verifychangedDateElem.toString());

 			Assert.fail("Unable to locate object: " + verifychangedDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(verifychangedDate);
 		
 		System.out.println("verifychangedDate "+verifychangedDate);
 		String monthdate[]=verifychangedDate.split("/");
 		
 		String actual=monthdate[0];
 		String expected=data[5];
 		assertEquals(actual, expected);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_verifychangedDate " + verifychangedDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_verifychangedDate " + verifychangedDate);
 	}
}