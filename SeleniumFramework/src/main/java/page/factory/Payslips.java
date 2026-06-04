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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/0248f1c1-93d8-44f8-bba2-177c3a3b9bf6
@TestModellerModule(guid = "0248f1c1-93d8-44f8-bba2-177c3a3b9bf6")
public class Payslips extends BasePage
{
	public Payslips (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_idSelectAllRecordElem = By.xpath("//INPUT[@id='SelectAllRecord']");

	private By TitleElem = By.xpath("//TH[contains(text(),'Title')]");

	private By First_NameElem = By.xpath("//TH[contains(text(),'First Name')]");

	private By Last_NameElem = By.xpath("//TH[contains(text(),'Last Name')]");

	private By Gross_PayElem = By.xpath("//TH[contains(text(),'Gross Pay')]");

	private By Income_TaxElem = By.xpath("//TH[contains(text(),'Income Tax')]");

	private By EE_NIElem = By.xpath("//TH[contains(text(),'EE NI')]");

	private By EE_PensionElem = By.xpath("//TH[contains(text(),'EE Pension')]");

	private By Loan_RepaymentElem = By.xpath("//TH[contains(text(),'Loan Repayment')]");

	private By Net_PayElem = By.xpath("//TH[contains(text(),'Net Pay')]");

	private By ER_NIElem = By.xpath("//TH[contains(text(),'ER NI')]");

	private By ER_PensionElem = By.xpath("//TH[contains(text(),'ER Pension')]");

	private By _Elem = By.xpath("//A[@data-original-title='Payslip download']");

	private By ctl00ctl00ParentContentcpHeaderRightEmailTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$EmailType']");

	private By _Email_PayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By ReGenerateElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By ctl00ctl00ParentContentddlTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By ctl00ctl00ParentContentddlPayrollDateElem = By.xpath("//label[normalize-space()= 'Period End:']/../select");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click xPath: '//*[@id="SelectAllRecord"]'
     * @name Click xPath: '//*[@id="SelectAllRecord"]'
     */
	public void Click_xPath_idSelectAllRecord()
	{
        
		WebElement elem = getWebElement(xPath_idSelectAllRecordElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_idSelectAllRecord", "Click_xPath_idSelectAllRecord failed. Unable to locate object: " + xPath_idSelectAllRecordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_idSelectAllRecord", "Click_xPath_idSelectAllRecord failed. Unable to locate object: " + xPath_idSelectAllRecordElem.toString());

			Assert.fail("Unable to locate object: " + xPath_idSelectAllRecordElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_idSelectAllRecord");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_idSelectAllRecord");
	}

     
	/**
 	 * Click Title
     * @name Click Title
     */
	public void Click_Title()
	{
        
		WebElement elem = getWebElement(TitleElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Title", "Click_Title failed. Unable to locate object: " + TitleElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Title", "Click_Title failed. Unable to locate object: " + TitleElem.toString());

			Assert.fail("Unable to locate object: " + TitleElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Title");

		TestModellerLogger.PassStep(m_Driver, "Click_Title");
	}

     
	/**
 	 * Click First Name
     * @name Click First Name
     */
	public void Click_First_Name()
	{
        
		WebElement elem = getWebElement(First_NameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_First_Name", "Click_First_Name failed. Unable to locate object: " + First_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_First_Name", "Click_First_Name failed. Unable to locate object: " + First_NameElem.toString());

			Assert.fail("Unable to locate object: " + First_NameElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_First_Name");

		TestModellerLogger.PassStep(m_Driver, "Click_First_Name");
	}

     
	/**
 	 * Click Last Name
     * @name Click Last Name
     */
	public void Click_Last_Name()
	{
        
		WebElement elem = getWebElement(Last_NameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Last_Name", "Click_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Last_Name", "Click_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

			Assert.fail("Unable to locate object: " + Last_NameElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Last_Name");

		TestModellerLogger.PassStep(m_Driver, "Click_Last_Name");
	}

     
	/**
 	 * Click Gross Pay
     * @name Click Gross Pay
     */
	public void Click_Gross_Pay()
	{
        
		WebElement elem = getWebElement(Gross_PayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Gross_Pay", "Click_Gross_Pay failed. Unable to locate object: " + Gross_PayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Gross_Pay", "Click_Gross_Pay failed. Unable to locate object: " + Gross_PayElem.toString());

			Assert.fail("Unable to locate object: " + Gross_PayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Gross_Pay");

		TestModellerLogger.PassStep(m_Driver, "Click_Gross_Pay");
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
 	 * Click Loan Repayment
     * @name Click Loan Repayment
     */
	public void Click_Loan_Repayment()
	{
        
		WebElement elem = getWebElement(Loan_RepaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Loan_Repayment", "Click_Loan_Repayment failed. Unable to locate object: " + Loan_RepaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Loan_Repayment", "Click_Loan_Repayment failed. Unable to locate object: " + Loan_RepaymentElem.toString());

			Assert.fail("Unable to locate object: " + Loan_RepaymentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Loan_Repayment");

		TestModellerLogger.PassStep(m_Driver, "Click_Loan_Repayment");
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
 	 * Select ctl00$ctl00$ParentContent$cpHeaderRight$EmailType
     * @name Select ctl00$ctl00$ParentContent$cpHeaderRight$EmailType
     */
    public void Select_ctl00ctl00ParentContentcpHeaderRightEmailType(String ctl00ctl00ParentContentcpHeaderRightEmailType)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcpHeaderRightEmailTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType", "Select_ctl00ctl00ParentContentcpHeaderRightEmailType failed. Unable to locate object: " + ctl00ctl00ParentContentcpHeaderRightEmailTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType", "Select_ctl00ctl00ParentContentcpHeaderRightEmailType failed. Unable to locate object: " + ctl00ctl00ParentContentcpHeaderRightEmailTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcpHeaderRightEmailTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcpHeaderRightEmailType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType " + ctl00ctl00ParentContentcpHeaderRightEmailType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType " + ctl00ctl00ParentContentcpHeaderRightEmailType);
 	}

     
	/**
 	 * Click  Email Payslips
     * @name Click  Email Payslips
     */
	public void Click__Email_Payslips()
	{
        
		WebElement elem = getWebElement(_Email_PayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Email_Payslips", "Click__Email_Payslips failed. Unable to locate object: " + _Email_PayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Email_Payslips", "Click__Email_Payslips failed. Unable to locate object: " + _Email_PayslipsElem.toString());

			Assert.fail("Unable to locate object: " + _Email_PayslipsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Email_Payslips");

		TestModellerLogger.PassStep(m_Driver, "Click__Email_Payslips");
	}

     
	/**
 	 * Click Re-Generate
     * @name Click Re-Generate
     */
	public void Click_ReGenerate()
	{
        
		WebElement elem = getWebElement(ReGenerateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ReGenerate", "Click_ReGenerate failed. Unable to locate object: " + ReGenerateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ReGenerate", "Click_ReGenerate failed. Unable to locate object: " + ReGenerateElem.toString());

			Assert.fail("Unable to locate object: " + ReGenerateElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ReGenerate");

		TestModellerLogger.PassStep(m_Driver, "Click_ReGenerate");
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
}