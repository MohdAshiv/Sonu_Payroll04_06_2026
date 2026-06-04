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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/97108381-04a5-4b1b-92a1-e1af7a1d5b3a
@TestModellerModule(guid = "97108381-04a5-4b1b-92a1-e1af7a1d5b3a")
public class Apprenticeship_levy_report extends BasePage
{
	public Apprenticeship_levy_report (WebDriver driver)
	{
		super(driver);
	}


	
	private By Apprenticeship_Levy_ReportElem = By.xpath("//SPAN[contains(text(),'Apprenticeship Levy Report')]");

	private By ctl00ctl00ParentContentcPHFiltertxtAnnualAllowanceElem = By.xpath("//label[normalize-space()= 'Annual Allowance:']/../div/input[1]");

	private By ctl00ctl00ParentContentcPHFiltertxtLevyRateElem = By.xpath("//label[normalize-space()= 'Levy Rate:']/../div/input");

	private By PeriodElem = By.xpath("//TH[@class='el-selection']");

	private By April_2020Elem = By.xpath("//TD[contains(text(),'April 2020')]");

	private By Period_WagesElem = By.xpath("//TH[contains(text(),'Period Wages')]");

	private By _150000Elem = By.xpath("//TD[@class='text-right el-selection']");

	private By Cumulative_WagesElem = By.xpath("//TH[contains(text(),'Cumulative Wages')]");

	private By Cumulative_Levy_DueElem = By.xpath("//TH[contains(text(),'Cumulative Levy Due')]");

	private By Cumulative_AllowanceElem = By.xpath("//TH[contains(text(),'Cumulative Allowance')]");

	private By Levy_PayableElem = By.xpath("//TH[contains(text(),'Levy Payable')]");

	private By _150000_1Elem = By.xpath("//TD[@class='text-right el-selection']");

	private By _750Elem = By.xpath("//TD[contains(text(),'£7.50')]");

	private By _125000Elem = By.xpath("//TD[contains(text(),'£1,250.00')]");

	private By _000Elem = By.xpath("//TD[contains(text(),'£0.00')]");

	private By _Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");

	private By __1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By ctl00ctl00ParentContentddlTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By Apprenticeship_LevyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefApprenticeshipLevy']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportApprenticeshipLevy.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportApprenticeshipLevy.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportApprenticeshipLevy.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportApprenticeshipLevy.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportApprenticeshipLevy.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Apprenticeship Levy Report
     * @name Click Apprenticeship Levy Report
     */
	public void Click_Apprenticeship_Levy_Report()
	{
        
		WebElement elem = getWebElement(Apprenticeship_Levy_ReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Apprenticeship_Levy_Report", "Click_Apprenticeship_Levy_Report failed. Unable to locate object: " + Apprenticeship_Levy_ReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Apprenticeship_Levy_Report", "Click_Apprenticeship_Levy_Report failed. Unable to locate object: " + Apprenticeship_Levy_ReportElem.toString());

			Assert.fail("Unable to locate object: " + Apprenticeship_Levy_ReportElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Apprenticeship_Levy_Report");

		TestModellerLogger.PassStep(m_Driver, "Click_Apprenticeship_Levy_Report");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtAnnualAllowance
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtAnnualAllowance
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance(String ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtAnnualAllowanceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance", "Enter_ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtAnnualAllowanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance", "Enter_ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtAnnualAllowanceElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtAnnualAllowanceElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance " + ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance " + ctl00ctl00ParentContentcPHFiltertxtAnnualAllowance);
 	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtLevyRate
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtLevyRate
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtLevyRate(String ctl00ctl00ParentContentcPHFiltertxtLevyRate)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtLevyRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtLevyRate", "Enter_ctl00ctl00ParentContentcPHFiltertxtLevyRate failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtLevyRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtLevyRate", "Enter_ctl00ctl00ParentContentcPHFiltertxtLevyRate failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtLevyRateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtLevyRateElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtLevyRate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtLevyRate " + ctl00ctl00ParentContentcPHFiltertxtLevyRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtLevyRate " + ctl00ctl00ParentContentcPHFiltertxtLevyRate);
 	}

     
	/**
 	 * Click Period
     * @name Click Period
     */
	public void Click_Period()
	{
        
		WebElement elem = getWebElement(PeriodElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Period", "Click_Period failed. Unable to locate object: " + PeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Period", "Click_Period failed. Unable to locate object: " + PeriodElem.toString());

			Assert.fail("Unable to locate object: " + PeriodElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Period");

		TestModellerLogger.PassStep(m_Driver, "Click_Period");
	}

     
	/**
 	 * Click April 2020
     * @name Click April 2020
     */
	public void Click_April_2020()
	{
        
		WebElement elem = getWebElement(April_2020Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_April_2020", "Click_April_2020 failed. Unable to locate object: " + April_2020Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_April_2020", "Click_April_2020 failed. Unable to locate object: " + April_2020Elem.toString());

			Assert.fail("Unable to locate object: " + April_2020Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_April_2020");

		TestModellerLogger.PassStep(m_Driver, "Click_April_2020");
	}

     
	/**
 	 * Click Period Wages
     * @name Click Period Wages
     */
	public void Click_Period_Wages()
	{
        
		WebElement elem = getWebElement(Period_WagesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Period_Wages", "Click_Period_Wages failed. Unable to locate object: " + Period_WagesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Period_Wages", "Click_Period_Wages failed. Unable to locate object: " + Period_WagesElem.toString());

			Assert.fail("Unable to locate object: " + Period_WagesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Period_Wages");

		TestModellerLogger.PassStep(m_Driver, "Click_Period_Wages");
	}

     
	/**
 	 * Click £1,500.00
     * @name Click £1,500.00
     */
	public void Click__150000()
	{
        
		WebElement elem = getWebElement(_150000Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__150000", "Click__150000 failed. Unable to locate object: " + _150000Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__150000", "Click__150000 failed. Unable to locate object: " + _150000Elem.toString());

			Assert.fail("Unable to locate object: " + _150000Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__150000");

		TestModellerLogger.PassStep(m_Driver, "Click__150000");
	}

     
	/**
 	 * Click Cumulative Wages
     * @name Click Cumulative Wages
     */
	public void Click_Cumulative_Wages()
	{
        
		WebElement elem = getWebElement(Cumulative_WagesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cumulative_Wages", "Click_Cumulative_Wages failed. Unable to locate object: " + Cumulative_WagesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cumulative_Wages", "Click_Cumulative_Wages failed. Unable to locate object: " + Cumulative_WagesElem.toString());

			Assert.fail("Unable to locate object: " + Cumulative_WagesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cumulative_Wages");

		TestModellerLogger.PassStep(m_Driver, "Click_Cumulative_Wages");
	}

     
	/**
 	 * Click Cumulative Levy Due
     * @name Click Cumulative Levy Due
     */
	public void Click_Cumulative_Levy_Due()
	{
        
		WebElement elem = getWebElement(Cumulative_Levy_DueElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cumulative_Levy_Due", "Click_Cumulative_Levy_Due failed. Unable to locate object: " + Cumulative_Levy_DueElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cumulative_Levy_Due", "Click_Cumulative_Levy_Due failed. Unable to locate object: " + Cumulative_Levy_DueElem.toString());

			Assert.fail("Unable to locate object: " + Cumulative_Levy_DueElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cumulative_Levy_Due");

		TestModellerLogger.PassStep(m_Driver, "Click_Cumulative_Levy_Due");
	}

     
	/**
 	 * Click Cumulative Allowance
     * @name Click Cumulative Allowance
     */
	public void Click_Cumulative_Allowance()
	{
        
		WebElement elem = getWebElement(Cumulative_AllowanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cumulative_Allowance", "Click_Cumulative_Allowance failed. Unable to locate object: " + Cumulative_AllowanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cumulative_Allowance", "Click_Cumulative_Allowance failed. Unable to locate object: " + Cumulative_AllowanceElem.toString());

			Assert.fail("Unable to locate object: " + Cumulative_AllowanceElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cumulative_Allowance");

		TestModellerLogger.PassStep(m_Driver, "Click_Cumulative_Allowance");
	}

     
	/**
 	 * Click Levy Payable
     * @name Click Levy Payable
     */
	public void Click_Levy_Payable()
	{
        
		WebElement elem = getWebElement(Levy_PayableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Levy_Payable", "Click_Levy_Payable failed. Unable to locate object: " + Levy_PayableElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Levy_Payable", "Click_Levy_Payable failed. Unable to locate object: " + Levy_PayableElem.toString());

			Assert.fail("Unable to locate object: " + Levy_PayableElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Levy_Payable");

		TestModellerLogger.PassStep(m_Driver, "Click_Levy_Payable");
	}

     
	/**
 	 * Click £1,500.00
     * @name Click £1,500.00
     */
	public void Click__150000_1()
	{
        
		WebElement elem = getWebElement(_150000_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__150000_1", "Click__150000_1 failed. Unable to locate object: " + _150000_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__150000_1", "Click__150000_1 failed. Unable to locate object: " + _150000_1Elem.toString());

			Assert.fail("Unable to locate object: " + _150000_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__150000_1");

		TestModellerLogger.PassStep(m_Driver, "Click__150000_1");
	}

     
	/**
 	 * Click £7.50
     * @name Click £7.50
     */
	public void Click__750()
	{
        
		WebElement elem = getWebElement(_750Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__750", "Click__750 failed. Unable to locate object: " + _750Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__750", "Click__750 failed. Unable to locate object: " + _750Elem.toString());

			Assert.fail("Unable to locate object: " + _750Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__750");

		TestModellerLogger.PassStep(m_Driver, "Click__750");
	}

     
	/**
 	 * Click £1,250.00
     * @name Click £1,250.00
     */
	public void Click__125000()
	{
        
		WebElement elem = getWebElement(_125000Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__125000", "Click__125000 failed. Unable to locate object: " + _125000Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__125000", "Click__125000 failed. Unable to locate object: " + _125000Elem.toString());

			Assert.fail("Unable to locate object: " + _125000Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__125000");

		TestModellerLogger.PassStep(m_Driver, "Click__125000");
	}

     
	/**
 	 * Click £0.00
     * @name Click £0.00
     */
	public void Click__000()
	{
        
		WebElement elem = getWebElement(_000Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__000", "Click__000 failed. Unable to locate object: " + _000Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__000", "Click__000 failed. Unable to locate object: " + _000Elem.toString());

			Assert.fail("Unable to locate object: " + _000Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__000");

		TestModellerLogger.PassStep(m_Driver, "Click__000");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click___1()
	{
        
		WebElement elem = getWebElement(__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

			Assert.fail("Unable to locate object: " + __1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click___1");

		TestModellerLogger.PassStep(m_Driver, "Click___1");
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
 	 * Click Apprenticeship Levy
     * @name Click Apprenticeship Levy
     */
	public void Click_Apprenticeship_Levy()
	{
        
		WebElement elem = getWebElement(Apprenticeship_LevyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Apprenticeship_Levy", "Click_Apprenticeship_Levy failed. Unable to locate object: " + Apprenticeship_LevyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Apprenticeship_Levy", "Click_Apprenticeship_Levy failed. Unable to locate object: " + Apprenticeship_LevyElem.toString());

			Assert.fail("Unable to locate object: " + Apprenticeship_LevyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Apprenticeship_Levy");

		TestModellerLogger.PassStep(m_Driver, "Click_Apprenticeship_Levy");
	}
}