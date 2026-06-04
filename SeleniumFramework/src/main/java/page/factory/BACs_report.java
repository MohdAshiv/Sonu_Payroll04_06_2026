package page.factory;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4f2df354-1d30-45d5-8e10-72237506974b
@TestModellerModule(guid = "4f2df354-1d30-45d5-8e10-72237506974b")
public class BACs_report extends BasePage
{
	public BACs_report (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00ctl00ParentContentddlTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By ctl00ctl00ParentContentddlPayrollDateElem = By.xpath("//label[normalize-space()= 'Period End:']/../select");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By _Export_to_CSV_Elem = By.xpath("//label[normalize-space()= 'Export Format :']/../../a[1]");

	private By _Export_to_PDF_Elem = By.xpath("//label[normalize-space()= 'Export Format :']/../../a[2]");

	private By Employee_Bank_DetailsElem = By.xpath("//TH[contains(text(),'Employee Bank Details')]");

	private By Employer_Bank_DetailsElem = By.xpath("//TH[contains(text(),'Employer Bank Details')]");

	private By Net_PayElem = By.xpath("//TH[contains(text(),'Net Pay')]");

	private By Employer_Name_Elem = By.xpath("//TH[contains(text(),'Employer Name')]");

	private By Employee_NameElem = By.xpath("//TH[contains(text(),'Employee Name')]");

	private By BACs_Payment_Upload_FileElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefBankAccountDetails']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select ctl00$ctl00$ParentContent$ddlTaxYears
     * @name Select ctl00$ctl00$ParentContent$ddlTaxYears
     */
    public void Select_ctl00ctl00ParentContentddlTaxYears(String ctl00ctl00ParentContentddlTaxYears)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentddlTaxYearsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears", "Select_ctl00ctl00ParentContentddlTaxYears failed. Unable to locate object: " + ctl00ctl00ParentContentddlTaxYearsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears", "Select_ctl00ctl00ParentContentddlTaxYears failed. Unable to locate object: " + ctl00ctl00ParentContentddlTaxYearsElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentddlTaxYearsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentddlTaxYears);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears " + ctl00ctl00ParentContentddlTaxYears);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears " + ctl00ctl00ParentContentddlTaxYears);
 	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$ddlPayrollDate
     * @name Select ctl00$ctl00$ParentContent$ddlPayrollDate
     */
    public void Select_ctl00ctl00ParentContentddlPayrollDate(String ctl00ctl00ParentContentddlPayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentddlPayrollDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate", "Select_ctl00ctl00ParentContentddlPayrollDate failed. Unable to locate object: " + ctl00ctl00ParentContentddlPayrollDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate", "Select_ctl00ctl00ParentContentddlPayrollDate failed. Unable to locate object: " + ctl00ctl00ParentContentddlPayrollDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentddlPayrollDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentddlPayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate " + ctl00ctl00ParentContentddlPayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate " + ctl00ctl00ParentContentddlPayrollDate);
 	}

     
	/**
 	 * Click Employer View
     * @name Click Employer View
     */
	public void Click_Employer_View()
	{
        
		WebElement elem = getWebElement(Employer_ViewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

			Assert.fail("Unable to locate object: " + Employer_ViewElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employer_View");

		TestModellerLogger.PassStep(m_Driver, "Click_Employer_View");
	}

     
	/**
 	 * Click  Export to CSV 
     * @name Click  Export to CSV 
     */
	public void Click__Export_to_CSV_()
	{
        
		WebElement elem = getWebElement(_Export_to_CSV_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Export_to_CSV_", "Click__Export_to_CSV_ failed. Unable to locate object: " + _Export_to_CSV_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Export_to_CSV_", "Click__Export_to_CSV_ failed. Unable to locate object: " + _Export_to_CSV_Elem.toString());

			Assert.fail("Unable to locate object: " + _Export_to_CSV_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Export_to_CSV_");

		TestModellerLogger.PassStep(m_Driver, "Click__Export_to_CSV_");
	}

     
	/**
 	 * Click  Export to PDF 
     * @name Click  Export to PDF 
     */
	public void Click__Export_to_PDF_()
	{
        
		WebElement elem = getWebElement(_Export_to_PDF_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Export_to_PDF_", "Click__Export_to_PDF_ failed. Unable to locate object: " + _Export_to_PDF_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Export_to_PDF_", "Click__Export_to_PDF_ failed. Unable to locate object: " + _Export_to_PDF_Elem.toString());

			Assert.fail("Unable to locate object: " + _Export_to_PDF_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Export_to_PDF_");

		TestModellerLogger.PassStep(m_Driver, "Click__Export_to_PDF_");
	}

     
	/**
 	 * Click Employee Bank Details
     * @name Click Employee Bank Details
     */
	public void Click_Employee_Bank_Details()
	{
        
		WebElement elem = getWebElement(Employee_Bank_DetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employee_Bank_Details", "Click_Employee_Bank_Details failed. Unable to locate object: " + Employee_Bank_DetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employee_Bank_Details", "Click_Employee_Bank_Details failed. Unable to locate object: " + Employee_Bank_DetailsElem.toString());

			Assert.fail("Unable to locate object: " + Employee_Bank_DetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employee_Bank_Details");

		TestModellerLogger.PassStep(m_Driver, "Click_Employee_Bank_Details");
	}

     
	/**
 	 * Click Employer Bank Details
     * @name Click Employer Bank Details
     */
	public void Click_Employer_Bank_Details()
	{
        
		WebElement elem = getWebElement(Employer_Bank_DetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_Bank_Details", "Click_Employer_Bank_Details failed. Unable to locate object: " + Employer_Bank_DetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employer_Bank_Details", "Click_Employer_Bank_Details failed. Unable to locate object: " + Employer_Bank_DetailsElem.toString());

			Assert.fail("Unable to locate object: " + Employer_Bank_DetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employer_Bank_Details");

		TestModellerLogger.PassStep(m_Driver, "Click_Employer_Bank_Details");
	}

     
	/**
 	 * Click Net Pay
     * @name Click Net Pay
     */
	public void Click_Net_Pay()
	{
        
		WebElement elem = getWebElement(Net_PayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Net_Pay", "Click_Net_Pay failed. Unable to locate object: " + Net_PayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Net_Pay", "Click_Net_Pay failed. Unable to locate object: " + Net_PayElem.toString());

			Assert.fail("Unable to locate object: " + Net_PayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Net_Pay");

		TestModellerLogger.PassStep(m_Driver, "Click_Net_Pay");
	}

     
	/**
 	 * Click Employer Name 
     * @name Click Employer Name 
     */
	public void Click_Employer_Name_()
	{
        
		WebElement elem = getWebElement(Employer_Name_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_Name_", "Click_Employer_Name_ failed. Unable to locate object: " + Employer_Name_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employer_Name_", "Click_Employer_Name_ failed. Unable to locate object: " + Employer_Name_Elem.toString());

			Assert.fail("Unable to locate object: " + Employer_Name_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employer_Name_");

		TestModellerLogger.PassStep(m_Driver, "Click_Employer_Name_");
	}

     
	/**
 	 * Click Employee Name
     * @name Click Employee Name
     */
	public void Click_Employee_Name()
	{
        
		WebElement elem = getWebElement(Employee_NameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employee_Name", "Click_Employee_Name failed. Unable to locate object: " + Employee_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employee_Name", "Click_Employee_Name failed. Unable to locate object: " + Employee_NameElem.toString());

			Assert.fail("Unable to locate object: " + Employee_NameElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employee_Name");

		TestModellerLogger.PassStep(m_Driver, "Click_Employee_Name");
	}

     
	/**
 	 * Click BACs Payment Upload File
     * @name Click BACs Payment Upload File
     */
	public void Click_BACs_Payment_Upload_File()
	{
        
		WebElement elem = getWebElement(BACs_Payment_Upload_FileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BACs_Payment_Upload_File", "Click_BACs_Payment_Upload_File failed. Unable to locate object: " + BACs_Payment_Upload_FileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BACs_Payment_Upload_File", "Click_BACs_Payment_Upload_File failed. Unable to locate object: " + BACs_Payment_Upload_FileElem.toString());

			Assert.fail("Unable to locate object: " + BACs_Payment_Upload_FileElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_BACs_Payment_Upload_File");

		TestModellerLogger.PassStep(m_Driver, "Click_BACs_Payment_Upload_File");
	}
}