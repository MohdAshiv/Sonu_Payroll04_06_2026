package NewPages;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/92942ed6-da59-4fb1-8f0d-e5f45721a14f
@TestModellerModule(guid = "92942ed6-da59-4fb1-8f0d-e5f45721a14f")
public class Statutory_report extends BasePage
{
	public Statutory_report (WebDriver driver)
	{
		super(driver);
	}


	
	private By Statutory_Maternity_Paternity_PayElem = By.xpath("//SPAN[contains(text(),'Statutory Maternity & Paternity Pay')]");

	private By ctl00ctl00ParentContentcPHFilterddlStatutorypaytypeElem = By.xpath("//label[normalize-space()= 'Type :']/../div/select");

	private By ctl00ctl00ParentContentcPHFilterddlEmployeeElem = By.xpath("//label[normalize-space()= 'Employee :']/../div/select");

	private By SearchElem = By.xpath("//label[normalize-space()= '']/../div/a");

	private By StatusElem = By.xpath("//TH[contains(text(),'Status')]");

	private By SMP_Payment_PeriodElem = By.xpath("//TH[contains(text(),'SMP Payment Period')]");

	private By SMP_AmountElem = By.xpath("//TH[contains(text(),'SMP Amount')]");

	private By Pay_periodElem = By.xpath("//TH[contains(text(),'Pay period')]");

	private By _Export_to_PDF_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By ctl00ctl00ParentContentddlTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By Total_SMPElem = By.xpath("//TD[contains(text(),'Total SMP')]");

	private By Statutory_Maternity_PaternityElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportStatutorySPPandParentingPay']");


	
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
 	 * Click Statutory Maternity & Paternity Pay
     * @name Click Statutory Maternity & Paternity Pay
     */
	public void Click_Statutory_Maternity_Paternity_Pay()
	{
        
		WebElement elem = getWebElement(Statutory_Maternity_Paternity_PayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Statutory_Maternity_Paternity_Pay", "Click_Statutory_Maternity_Paternity_Pay failed. Unable to locate object: " + Statutory_Maternity_Paternity_PayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Statutory_Maternity_Paternity_Pay", "Click_Statutory_Maternity_Paternity_Pay failed. Unable to locate object: " + Statutory_Maternity_Paternity_PayElem.toString());

			Assert.fail("Unable to locate object: " + Statutory_Maternity_Paternity_PayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Statutory_Maternity_Paternity_Pay");

		TestModellerLogger.PassStep(m_Driver, "Click_Statutory_Maternity_Paternity_Pay");
	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlStatutorypaytype
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlStatutorypaytype
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlStatutorypaytype(String ctl00ctl00ParentContentcPHFilterddlStatutorypaytype)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlStatutorypaytypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlStatutorypaytype", "Select_ctl00ctl00ParentContentcPHFilterddlStatutorypaytype failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlStatutorypaytypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlStatutorypaytype", "Select_ctl00ctl00ParentContentcPHFilterddlStatutorypaytype failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlStatutorypaytypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlStatutorypaytypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlStatutorypaytype);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlStatutorypaytype " + ctl00ctl00ParentContentcPHFilterddlStatutorypaytype);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlStatutorypaytype " + ctl00ctl00ParentContentcPHFilterddlStatutorypaytype);
 	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployee
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployee
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlEmployee(String ctl00ctl00ParentContentcPHFilterddlEmployee)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlEmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee", "Select_ctl00ctl00ParentContentcPHFilterddlEmployee failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee", "Select_ctl00ctl00ParentContentcPHFilterddlEmployee failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlEmployee);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee " + ctl00ctl00ParentContentcPHFilterddlEmployee);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee " + ctl00ctl00ParentContentcPHFilterddlEmployee);
 	}

     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}

     
	/**
 	 * Click Status
     * @name Click Status
     */
	public void Click_Status()
	{
        
		WebElement elem = getWebElement(StatusElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Status", "Click_Status failed. Unable to locate object: " + StatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Status", "Click_Status failed. Unable to locate object: " + StatusElem.toString());

			Assert.fail("Unable to locate object: " + StatusElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Status");

		TestModellerLogger.PassStep(m_Driver, "Click_Status");
	}

     
	/**
 	 * Click SMP Payment Period
     * @name Click SMP Payment Period
     */
	public void Click_SMP_Payment_Period()
	{
        
		WebElement elem = getWebElement(SMP_Payment_PeriodElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SMP_Payment_Period", "Click_SMP_Payment_Period failed. Unable to locate object: " + SMP_Payment_PeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SMP_Payment_Period", "Click_SMP_Payment_Period failed. Unable to locate object: " + SMP_Payment_PeriodElem.toString());

			Assert.fail("Unable to locate object: " + SMP_Payment_PeriodElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SMP_Payment_Period");

		TestModellerLogger.PassStep(m_Driver, "Click_SMP_Payment_Period");
	}

     
	/**
 	 * Click SMP Amount
     * @name Click SMP Amount
     */
	public void Click_SMP_Amount()
	{
        
		WebElement elem = getWebElement(SMP_AmountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SMP_Amount", "Click_SMP_Amount failed. Unable to locate object: " + SMP_AmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SMP_Amount", "Click_SMP_Amount failed. Unable to locate object: " + SMP_AmountElem.toString());

			Assert.fail("Unable to locate object: " + SMP_AmountElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SMP_Amount");

		TestModellerLogger.PassStep(m_Driver, "Click_SMP_Amount");
	}

     
	/**
 	 * Click Pay period
     * @name Click Pay period
     */
	public void Click_Pay_period()
	{
        
		WebElement elem = getWebElement(Pay_periodElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pay_period", "Click_Pay_period failed. Unable to locate object: " + Pay_periodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pay_period", "Click_Pay_period failed. Unable to locate object: " + Pay_periodElem.toString());

			Assert.fail("Unable to locate object: " + Pay_periodElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pay_period");

		TestModellerLogger.PassStep(m_Driver, "Click_Pay_period");
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
 	 * Click Total SMP
     * @name Click Total SMP
     */
	public void Click_Total_SMP()
	{
        
		WebElement elem = getWebElement(Total_SMPElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Total_SMP", "Click_Total_SMP failed. Unable to locate object: " + Total_SMPElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Total_SMP", "Click_Total_SMP failed. Unable to locate object: " + Total_SMPElem.toString());

			Assert.fail("Unable to locate object: " + Total_SMPElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Total_SMP");

		TestModellerLogger.PassStep(m_Driver, "Click_Total_SMP");
	}

     
	/**
 	 * Click Statutory Maternity & Paternity
     * @name Click Statutory Maternity & Paternity
     */
	public void Click_Statutory_Maternity_Paternity()
	{
        
		WebElement elem = getWebElement(Statutory_Maternity_PaternityElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Statutory_Maternity_Paternity", "Click_Statutory_Maternity_Paternity failed. Unable to locate object: " + Statutory_Maternity_PaternityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Statutory_Maternity_Paternity", "Click_Statutory_Maternity_Paternity failed. Unable to locate object: " + Statutory_Maternity_PaternityElem.toString());

			Assert.fail("Unable to locate object: " + Statutory_Maternity_PaternityElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Statutory_Maternity_Paternity");

		TestModellerLogger.PassStep(m_Driver, "Click_Statutory_Maternity_Paternity");
	}
}