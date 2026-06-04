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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6c99d45d-0677-4cea-810e-6f676f4903ed
@TestModellerModule(guid = "6c99d45d-0677-4cea-810e-6f676f4903ed")
public class P11 extends BasePage
{
	public P11 (WebDriver driver)
	{
		super(driver);
	}


	
	private By P11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");

	private By ctl00ctl00ParentContentcPHFilterddlEmployeeElem = By.xpath("//label[normalize-space()= 'Employee :']/../div/select");

	private By _Export_to_CSV_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExport']");

	private By _Export_to_PDF_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By ctl00ctl00ParentContentddlTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By National_Insurance_Contributions_and_StudentPostgraduate_Loan_DeductionsElem = By.xpath("//H4[contains(text(),'National Insurance Contributions and Student/Postgraduate Loan Deductions')]");

	private By PeriodElem = By.xpath("//TH[@class='text-left el-selection']");

	private By _Month_1Elem = By.xpath("//TD[@class='text-left el-selection']");

	private By TableElem = By.xpath("//TH[@class='text-left el-selection']");

	private By Statutory_PaymentsElem = By.xpath("//H4[contains(text(),'Statutory Payments')]");

	private By _Month_1_Elem = By.xpath("//TD[@class='text-left el-selection']");

	private By PAYE_Income_TaxElem = By.xpath("//H4[contains(text(),'PAYE Income Tax')]");

	private By Period_1Elem = By.xpath("//TH[@class='text-left el-selection']");

	private By _Month_1_1Elem = By.xpath("//TD[@class='text-left el-selection']");

	private By End_of_Year_SummaryElem = By.xpath("//H4[contains(text(),'End of Year Summary')]");

	private By NI_Contribution_table_totalsElem = By.xpath("//H5[contains(text(),'NI Contribution table totals')]");

	private By Table_1Elem = By.xpath("//TH[@class='text-left el-selection']");

	private By _A_Elem = By.xpath("//TD[@class='text-left el-selection']");

	private By Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LELElem = By.xpath("//TH[@class='text-right el-selection']");

	private By Pay_and_tax_totalElem = By.xpath("//H5[contains(text(),'Pay and tax total')]");

	private By TotalElem = By.xpath("//TH[@style='width: 35%']");

	private By In_previous_employment_Elem = By.xpath("//TD[contains(text(),'In previous employment')]");

	private By In_current_employmentElem = By.xpath("//TD[contains(text(),'In current employment')]");

	private By Total_for_year_Elem = By.xpath("//TD[contains(text(),'Total for year')]");

	private By PayElem = By.xpath("//TH[@style='width: 10%']");

	private By Tax_deductedElem = By.xpath("//TH[@style='width: 55%']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click P11
     * @name Click P11
     */
	public void Click_P11()
	{
        
		WebElement elem = getWebElement(P11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_P11", "Click_P11 failed. Unable to locate object: " + P11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_P11", "Click_P11 failed. Unable to locate object: " + P11Elem.toString());

			Assert.fail("Unable to locate object: " + P11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_P11");

		TestModellerLogger.PassStep(m_Driver, "Click_P11");
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
 	 * Click National Insurance Contributions and Student/Postgraduate Loan Deductions
     * @name Click National Insurance Contributions and Student/Postgraduate Loan Deductions
     */
	public void Click_National_Insurance_Contributions_and_StudentPostgraduate_Loan_Deductions()
	{
        
		WebElement elem = getWebElement(National_Insurance_Contributions_and_StudentPostgraduate_Loan_DeductionsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_National_Insurance_Contributions_and_StudentPostgraduate_Loan_Deductions", "Click_National_Insurance_Contributions_and_StudentPostgraduate_Loan_Deductions failed. Unable to locate object: " + National_Insurance_Contributions_and_StudentPostgraduate_Loan_DeductionsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_National_Insurance_Contributions_and_StudentPostgraduate_Loan_Deductions", "Click_National_Insurance_Contributions_and_StudentPostgraduate_Loan_Deductions failed. Unable to locate object: " + National_Insurance_Contributions_and_StudentPostgraduate_Loan_DeductionsElem.toString());

			Assert.fail("Unable to locate object: " + National_Insurance_Contributions_and_StudentPostgraduate_Loan_DeductionsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_National_Insurance_Contributions_and_StudentPostgraduate_Loan_Deductions");

		TestModellerLogger.PassStep(m_Driver, "Click_National_Insurance_Contributions_and_StudentPostgraduate_Loan_Deductions");
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
 	 * Click  Month 1
     * @name Click  Month 1
     */
	public void Click__Month_1()
	{
        
		WebElement elem = getWebElement(_Month_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Month_1", "Click__Month_1 failed. Unable to locate object: " + _Month_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Month_1", "Click__Month_1 failed. Unable to locate object: " + _Month_1Elem.toString());

			Assert.fail("Unable to locate object: " + _Month_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Month_1");

		TestModellerLogger.PassStep(m_Driver, "Click__Month_1");
	}

     
	/**
 	 * Click Table
     * @name Click Table
     */
	public void Click_Table()
	{
        
		WebElement elem = getWebElement(TableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Table", "Click_Table failed. Unable to locate object: " + TableElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Table", "Click_Table failed. Unable to locate object: " + TableElem.toString());

			Assert.fail("Unable to locate object: " + TableElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Table");

		TestModellerLogger.PassStep(m_Driver, "Click_Table");
	}

     
	/**
 	 * Click Statutory Payments
     * @name Click Statutory Payments
     */
	public void Click_Statutory_Payments()
	{
        
		WebElement elem = getWebElement(Statutory_PaymentsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Statutory_Payments", "Click_Statutory_Payments failed. Unable to locate object: " + Statutory_PaymentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Statutory_Payments", "Click_Statutory_Payments failed. Unable to locate object: " + Statutory_PaymentsElem.toString());

			Assert.fail("Unable to locate object: " + Statutory_PaymentsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Statutory_Payments");

		TestModellerLogger.PassStep(m_Driver, "Click_Statutory_Payments");
	}

     
	/**
 	 * Click  Month 1 
     * @name Click  Month 1 
     */
	public void Click__Month_1_()
	{
        
		WebElement elem = getWebElement(_Month_1_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Month_1_", "Click__Month_1_ failed. Unable to locate object: " + _Month_1_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Month_1_", "Click__Month_1_ failed. Unable to locate object: " + _Month_1_Elem.toString());

			Assert.fail("Unable to locate object: " + _Month_1_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Month_1_");

		TestModellerLogger.PassStep(m_Driver, "Click__Month_1_");
	}

     
	/**
 	 * Click PAYE Income Tax
     * @name Click PAYE Income Tax
     */
	public void Click_PAYE_Income_Tax()
	{
        
		WebElement elem = getWebElement(PAYE_Income_TaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PAYE_Income_Tax", "Click_PAYE_Income_Tax failed. Unable to locate object: " + PAYE_Income_TaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PAYE_Income_Tax", "Click_PAYE_Income_Tax failed. Unable to locate object: " + PAYE_Income_TaxElem.toString());

			Assert.fail("Unable to locate object: " + PAYE_Income_TaxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_PAYE_Income_Tax");

		TestModellerLogger.PassStep(m_Driver, "Click_PAYE_Income_Tax");
	}

     
	/**
 	 * Click Period
     * @name Click Period
     */
	public void Click_Period_1()
	{
        
		WebElement elem = getWebElement(Period_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Period_1", "Click_Period_1 failed. Unable to locate object: " + Period_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Period_1", "Click_Period_1 failed. Unable to locate object: " + Period_1Elem.toString());

			Assert.fail("Unable to locate object: " + Period_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Period_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Period_1");
	}

     
	/**
 	 * Click  Month 1
     * @name Click  Month 1
     */
	public void Click__Month_1_1()
	{
        
		WebElement elem = getWebElement(_Month_1_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Month_1_1", "Click__Month_1_1 failed. Unable to locate object: " + _Month_1_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Month_1_1", "Click__Month_1_1 failed. Unable to locate object: " + _Month_1_1Elem.toString());

			Assert.fail("Unable to locate object: " + _Month_1_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Month_1_1");

		TestModellerLogger.PassStep(m_Driver, "Click__Month_1_1");
	}

     
	/**
 	 * Click End of Year Summary
     * @name Click End of Year Summary
     */
	public void Click_End_of_Year_Summary()
	{
        
		WebElement elem = getWebElement(End_of_Year_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_End_of_Year_Summary", "Click_End_of_Year_Summary failed. Unable to locate object: " + End_of_Year_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_End_of_Year_Summary", "Click_End_of_Year_Summary failed. Unable to locate object: " + End_of_Year_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + End_of_Year_SummaryElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_End_of_Year_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_End_of_Year_Summary");
	}

     
	/**
 	 * Click NI Contribution table totals
     * @name Click NI Contribution table totals
     */
	public void Click_NI_Contribution_table_totals()
	{
        
		WebElement elem = getWebElement(NI_Contribution_table_totalsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NI_Contribution_table_totals", "Click_NI_Contribution_table_totals failed. Unable to locate object: " + NI_Contribution_table_totalsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NI_Contribution_table_totals", "Click_NI_Contribution_table_totals failed. Unable to locate object: " + NI_Contribution_table_totalsElem.toString());

			Assert.fail("Unable to locate object: " + NI_Contribution_table_totalsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NI_Contribution_table_totals");

		TestModellerLogger.PassStep(m_Driver, "Click_NI_Contribution_table_totals");
	}

     
	/**
 	 * Click Table
     * @name Click Table
     */
	public void Click_Table_1()
	{
        
		WebElement elem = getWebElement(Table_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Table_1", "Click_Table_1 failed. Unable to locate object: " + Table_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Table_1", "Click_Table_1 failed. Unable to locate object: " + Table_1Elem.toString());

			Assert.fail("Unable to locate object: " + Table_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Table_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Table_1");
	}

     
	/**
 	 * Click  A 
     * @name Click  A 
     */
	public void Click__A_()
	{
        
		WebElement elem = getWebElement(_A_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__A_", "Click__A_ failed. Unable to locate object: " + _A_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__A_", "Click__A_ failed. Unable to locate object: " + _A_Elem.toString());

			Assert.fail("Unable to locate object: " + _A_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__A_");

		TestModellerLogger.PassStep(m_Driver, "Click__A_");
	}

     
	/**
 	 * Click Earnings at the LEL (where earnings are equal to or exceed the LEL)
     * @name Click Earnings at the LEL (where earnings are equal to or exceed the LEL)
     */
	public void Click_Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LEL()
	{
        
		WebElement elem = getWebElement(Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LELElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LEL", "Click_Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LEL failed. Unable to locate object: " + Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LELElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LEL", "Click_Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LEL failed. Unable to locate object: " + Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LELElem.toString());

			Assert.fail("Unable to locate object: " + Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LELElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LEL");

		TestModellerLogger.PassStep(m_Driver, "Click_Earnings_at_the_LEL_where_earnings_are_equal_to_or_exceed_the_LEL");
	}

     
	/**
 	 * Click Pay and tax total
     * @name Click Pay and tax total
     */
	public void Click_Pay_and_tax_total()
	{
        
		WebElement elem = getWebElement(Pay_and_tax_totalElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pay_and_tax_total", "Click_Pay_and_tax_total failed. Unable to locate object: " + Pay_and_tax_totalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pay_and_tax_total", "Click_Pay_and_tax_total failed. Unable to locate object: " + Pay_and_tax_totalElem.toString());

			Assert.fail("Unable to locate object: " + Pay_and_tax_totalElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pay_and_tax_total");

		TestModellerLogger.PassStep(m_Driver, "Click_Pay_and_tax_total");
	}

     
	/**
 	 * Click Total
     * @name Click Total
     */
	public void Click_Total()
	{
        
		WebElement elem = getWebElement(TotalElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Total", "Click_Total failed. Unable to locate object: " + TotalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Total", "Click_Total failed. Unable to locate object: " + TotalElem.toString());

			Assert.fail("Unable to locate object: " + TotalElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Total");

		TestModellerLogger.PassStep(m_Driver, "Click_Total");
	}

     
	/**
 	 * Click In previous employment 
     * @name Click In previous employment 
     */
	public void Click_In_previous_employment_()
	{
        
		WebElement elem = getWebElement(In_previous_employment_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_In_previous_employment_", "Click_In_previous_employment_ failed. Unable to locate object: " + In_previous_employment_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_In_previous_employment_", "Click_In_previous_employment_ failed. Unable to locate object: " + In_previous_employment_Elem.toString());

			Assert.fail("Unable to locate object: " + In_previous_employment_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_In_previous_employment_");

		TestModellerLogger.PassStep(m_Driver, "Click_In_previous_employment_");
	}

     
	/**
 	 * Click In current employment
     * @name Click In current employment
     */
	public void Click_In_current_employment()
	{
        
		WebElement elem = getWebElement(In_current_employmentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_In_current_employment", "Click_In_current_employment failed. Unable to locate object: " + In_current_employmentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_In_current_employment", "Click_In_current_employment failed. Unable to locate object: " + In_current_employmentElem.toString());

			Assert.fail("Unable to locate object: " + In_current_employmentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_In_current_employment");

		TestModellerLogger.PassStep(m_Driver, "Click_In_current_employment");
	}

     
	/**
 	 * Click Total for year 
     * @name Click Total for year 
     */
	public void Click_Total_for_year_()
	{
        
		WebElement elem = getWebElement(Total_for_year_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Total_for_year_", "Click_Total_for_year_ failed. Unable to locate object: " + Total_for_year_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Total_for_year_", "Click_Total_for_year_ failed. Unable to locate object: " + Total_for_year_Elem.toString());

			Assert.fail("Unable to locate object: " + Total_for_year_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Total_for_year_");

		TestModellerLogger.PassStep(m_Driver, "Click_Total_for_year_");
	}

     
	/**
 	 * Click Pay
     * @name Click Pay
     */
	public void Click_Pay()
	{
        
		WebElement elem = getWebElement(PayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pay", "Click_Pay failed. Unable to locate object: " + PayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pay", "Click_Pay failed. Unable to locate object: " + PayElem.toString());

			Assert.fail("Unable to locate object: " + PayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pay");

		TestModellerLogger.PassStep(m_Driver, "Click_Pay");
	}

     
	/**
 	 * Click Tax deducted
     * @name Click Tax deducted
     */
	public void Click_Tax_deducted()
	{
        
		WebElement elem = getWebElement(Tax_deductedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tax_deducted", "Click_Tax_deducted failed. Unable to locate object: " + Tax_deductedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tax_deducted", "Click_Tax_deducted failed. Unable to locate object: " + Tax_deductedElem.toString());

			Assert.fail("Unable to locate object: " + Tax_deductedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tax_deducted");

		TestModellerLogger.PassStep(m_Driver, "Click_Tax_deducted");
	}
}