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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8c958bb9-e221-4f21-92ce-4a15dfab73aa
@TestModellerModule(guid = "8c958bb9-e221-4f21-92ce-4a15dfab73aa")
public class Payroll_reporting_period_summary extends BasePage
{
	public Payroll_reporting_period_summary (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00ctl00ParentContentcPHFilterddlTaxYearElem = By.xpath("//label[normalize-space()= 'Tax Year :']/../div/select");

	private By PeriodElem = By.xpath("//TH[contains(text(),'Period')]");

	private By Basic_PayElem = By.xpath("//TH[@class='text-left el-selection']");

	private By AdditionsElem = By.xpath("//TH[@class='text-left el-selection']");

	private By DeductionsElem = By.xpath("//TH[@class='text-left el-selection']");

	private By Income_TaxElem = By.xpath("//TH[@class='text-left el-selection']");

	private By EE_NIElem = By.xpath("//TH[@class='text-left el-selection']");

	private By EE_PensionElem = By.xpath("//TH[contains(text(),'EE Pension')]");

	private By Student_LoanElem = By.xpath("//TH[@class='text-left el-selection']");

	private By Post_Grad_LoanElem = By.xpath("//TH[contains(text(),'Post Grad Loan')]");

	private By Net_PayElem = By.xpath("//TH[@class='text-left el-selection']");

	private By ER_NIElem = By.xpath("//TH[@class='text-left el-selection']");

	private By ER_PensionElem = By.xpath("//TH[contains(text(),'ER Pension')]");

	private By _Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");

	private By __1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By Payroll_Reporting_Period_SummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportPeriodTotal']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYear
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYear
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlTaxYear(String ctl00ctl00ParentContentcPHFilterddlTaxYear)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlTaxYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlTaxYear", "Select_ctl00ctl00ParentContentcPHFilterddlTaxYear failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTaxYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlTaxYear", "Select_ctl00ctl00ParentContentcPHFilterddlTaxYear failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTaxYearElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTaxYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlTaxYear);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlTaxYear " + ctl00ctl00ParentContentcPHFilterddlTaxYear);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlTaxYear " + ctl00ctl00ParentContentcPHFilterddlTaxYear);
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
 	 * Click Basic Pay
     * @name Click Basic Pay
     */
	public void Click_Basic_Pay()
	{
        
		WebElement elem = getWebElement(Basic_PayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Basic_Pay", "Click_Basic_Pay failed. Unable to locate object: " + Basic_PayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Basic_Pay", "Click_Basic_Pay failed. Unable to locate object: " + Basic_PayElem.toString());

			Assert.fail("Unable to locate object: " + Basic_PayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Basic_Pay");

		TestModellerLogger.PassStep(m_Driver, "Click_Basic_Pay");
	}

     
	/**
 	 * Click Additions
     * @name Click Additions
     */
	public void Click_Additions()
	{
        
		WebElement elem = getWebElement(AdditionsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Additions", "Click_Additions failed. Unable to locate object: " + AdditionsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Additions", "Click_Additions failed. Unable to locate object: " + AdditionsElem.toString());

			Assert.fail("Unable to locate object: " + AdditionsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Additions");

		TestModellerLogger.PassStep(m_Driver, "Click_Additions");
	}

     
	/**
 	 * Click Deductions
     * @name Click Deductions
     */
	public void Click_Deductions()
	{
        
		WebElement elem = getWebElement(DeductionsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Deductions", "Click_Deductions failed. Unable to locate object: " + DeductionsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Deductions", "Click_Deductions failed. Unable to locate object: " + DeductionsElem.toString());

			Assert.fail("Unable to locate object: " + DeductionsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Deductions");

		TestModellerLogger.PassStep(m_Driver, "Click_Deductions");
	}

     
	/**
 	 * Click Income Tax
     * @name Click Income Tax
     */
	public void Click_Income_Tax()
	{
        
		WebElement elem = getWebElement(Income_TaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Tax", "Click_Income_Tax failed. Unable to locate object: " + Income_TaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Tax", "Click_Income_Tax failed. Unable to locate object: " + Income_TaxElem.toString());

			Assert.fail("Unable to locate object: " + Income_TaxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Tax");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Tax");
	}

     
	/**
 	 * Click EE NI
     * @name Click EE NI
     */
	public void Click_EE_NI()
	{
        
		WebElement elem = getWebElement(EE_NIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EE_NI", "Click_EE_NI failed. Unable to locate object: " + EE_NIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EE_NI", "Click_EE_NI failed. Unable to locate object: " + EE_NIElem.toString());

			Assert.fail("Unable to locate object: " + EE_NIElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EE_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_EE_NI");
	}

     
	/**
 	 * Click EE Pension
     * @name Click EE Pension
     */
	public void Click_EE_Pension()
	{
        
		WebElement elem = getWebElement(EE_PensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EE_Pension", "Click_EE_Pension failed. Unable to locate object: " + EE_PensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EE_Pension", "Click_EE_Pension failed. Unable to locate object: " + EE_PensionElem.toString());

			Assert.fail("Unable to locate object: " + EE_PensionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EE_Pension");

		TestModellerLogger.PassStep(m_Driver, "Click_EE_Pension");
	}

     
	/**
 	 * Click Student Loan
     * @name Click Student Loan
     */
	public void Click_Student_Loan()
	{
        
		WebElement elem = getWebElement(Student_LoanElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Student_Loan", "Click_Student_Loan failed. Unable to locate object: " + Student_LoanElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Student_Loan", "Click_Student_Loan failed. Unable to locate object: " + Student_LoanElem.toString());

			Assert.fail("Unable to locate object: " + Student_LoanElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Student_Loan");

		TestModellerLogger.PassStep(m_Driver, "Click_Student_Loan");
	}

     
	/**
 	 * Click Post Grad Loan
     * @name Click Post Grad Loan
     */
	public void Click_Post_Grad_Loan()
	{
        
		WebElement elem = getWebElement(Post_Grad_LoanElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Post_Grad_Loan", "Click_Post_Grad_Loan failed. Unable to locate object: " + Post_Grad_LoanElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Post_Grad_Loan", "Click_Post_Grad_Loan failed. Unable to locate object: " + Post_Grad_LoanElem.toString());

			Assert.fail("Unable to locate object: " + Post_Grad_LoanElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Post_Grad_Loan");

		TestModellerLogger.PassStep(m_Driver, "Click_Post_Grad_Loan");
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
 	 * Click ER NI
     * @name Click ER NI
     */
	public void Click_ER_NI()
	{
        
		WebElement elem = getWebElement(ER_NIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ER_NI", "Click_ER_NI failed. Unable to locate object: " + ER_NIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ER_NI", "Click_ER_NI failed. Unable to locate object: " + ER_NIElem.toString());

			Assert.fail("Unable to locate object: " + ER_NIElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ER_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_ER_NI");
	}

     
	/**
 	 * Click ER Pension
     * @name Click ER Pension
     */
	public void Click_ER_Pension()
	{
        
		WebElement elem = getWebElement(ER_PensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ER_Pension", "Click_ER_Pension failed. Unable to locate object: " + ER_PensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ER_Pension", "Click_ER_Pension failed. Unable to locate object: " + ER_PensionElem.toString());

			Assert.fail("Unable to locate object: " + ER_PensionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ER_Pension");

		TestModellerLogger.PassStep(m_Driver, "Click_ER_Pension");
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
 	 * Click Payroll Reporting Period Summary
     * @name Click Payroll Reporting Period Summary
     */
	public void Click_Payroll_Reporting_Period_Summary()
	{
        
		WebElement elem = getWebElement(Payroll_Reporting_Period_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Reporting_Period_Summary", "Click_Payroll_Reporting_Period_Summary failed. Unable to locate object: " + Payroll_Reporting_Period_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Reporting_Period_Summary", "Click_Payroll_Reporting_Period_Summary failed. Unable to locate object: " + Payroll_Reporting_Period_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_Reporting_Period_SummaryElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Reporting_Period_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Reporting_Period_Summary");
	}
}