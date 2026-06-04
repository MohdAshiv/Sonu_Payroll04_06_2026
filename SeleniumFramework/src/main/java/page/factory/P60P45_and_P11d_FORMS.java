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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/739234b0-b2c8-41e5-b44b-a1e76acbd505
@TestModellerModule(guid = "739234b0-b2c8-41e5-b44b-a1e76acbd505")
public class P60P45_and_P11d_FORMS extends BasePage
{
	public P60P45_and_P11d_FORMS (WebDriver driver)
	{
		super(driver);
	}


	
	private By P60P45P11D_FormsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");

	private By ctl00ctl00ParentContentcPHFilterddlFormElem = By.xpath("//label[normalize-space()= 'Form :']/../div/select");

	private By ctl00ctl00ParentContentcPHchkSelectAllElem = By.xpath("//INPUT[@id='chkSelectAll']");

	private By TitleElem = By.xpath("//TH[@class='text-left el-selection']");

	private By First_NameElem = By.xpath("//TH[@class='text-left el-selection']");

	private By Last_NameElem = By.xpath("//TH[@class='text-left el-selection']");

	private By Payroll_IDElem = By.xpath("//TH[@class='text-left el-selection']");

	private By National_Insurance_NoElem = By.xpath("//TH[@class='text-left el-selection']");

	private By _EmailElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkPayslips']");

	private By GenerateElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnGenerateP60']");

	private By ctl00ctl00ParentContentcpHeaderRightEmailTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$EmailType']");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By ctl00ctl00ParentContentddlTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By Title_1Elem = By.xpath("//TH[@class='align-left el-selection']");

	private By First_Name_1Elem = By.xpath("//TH[@class='align-left el-selection']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP60.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP60.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP60.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP60.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP60.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click P60/P45/P11D Forms
     * @name Click P60/P45/P11D Forms
     */
	public void Click_P60P45P11D_Forms()
	{
        
		WebElement elem = getWebElement(P60P45P11D_FormsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_P60P45P11D_Forms", "Click_P60P45P11D_Forms failed. Unable to locate object: " + P60P45P11D_FormsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_P60P45P11D_Forms", "Click_P60P45P11D_Forms failed. Unable to locate object: " + P60P45P11D_FormsElem.toString());

			Assert.fail("Unable to locate object: " + P60P45P11D_FormsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_P60P45P11D_Forms");

		TestModellerLogger.PassStep(m_Driver, "Click_P60P45P11D_Forms");
	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlForm
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlForm
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlForm(String ctl00ctl00ParentContentcPHFilterddlForm)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlFormElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlForm", "Select_ctl00ctl00ParentContentcPHFilterddlForm failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlFormElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlForm", "Select_ctl00ctl00ParentContentcPHFilterddlForm failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlFormElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlFormElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlForm);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlForm " + ctl00ctl00ParentContentcPHFilterddlForm);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlForm " + ctl00ctl00ParentContentcPHFilterddlForm);
 	}

     
	/**
 	 * Click ctl00$ctl00$ParentContent$cPH$chkSelectAll
     * @name Click ctl00$ctl00$ParentContent$cPH$chkSelectAll
     */
	public void Click_ctl00ctl00ParentContentcPHchkSelectAll()
	{
        
		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHchkSelectAllElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ctl00ctl00ParentContentcPHchkSelectAll", "Click_ctl00ctl00ParentContentcPHchkSelectAll failed. Unable to locate object: " + ctl00ctl00ParentContentcPHchkSelectAllElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ctl00ctl00ParentContentcPHchkSelectAll", "Click_ctl00ctl00ParentContentcPHchkSelectAll failed. Unable to locate object: " + ctl00ctl00ParentContentcPHchkSelectAllElem.toString());

			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHchkSelectAllElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ctl00ctl00ParentContentcPHchkSelectAll");

		TestModellerLogger.PassStep(m_Driver, "Click_ctl00ctl00ParentContentcPHchkSelectAll");
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
 	 * Click Payroll ID
     * @name Click Payroll ID
     */
	public void Click_Payroll_ID()
	{
        
		WebElement elem = getWebElement(Payroll_IDElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_ID", "Click_Payroll_ID failed. Unable to locate object: " + Payroll_IDElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_ID", "Click_Payroll_ID failed. Unable to locate object: " + Payroll_IDElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_IDElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_ID");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_ID");
	}

     
	/**
 	 * Click National Insurance No
     * @name Click National Insurance No
     */
	public void Click_National_Insurance_No()
	{
        
		WebElement elem = getWebElement(National_Insurance_NoElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_National_Insurance_No", "Click_National_Insurance_No failed. Unable to locate object: " + National_Insurance_NoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_National_Insurance_No", "Click_National_Insurance_No failed. Unable to locate object: " + National_Insurance_NoElem.toString());

			Assert.fail("Unable to locate object: " + National_Insurance_NoElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_National_Insurance_No");

		TestModellerLogger.PassStep(m_Driver, "Click_National_Insurance_No");
	}

     
	/**
 	 * Click  Email
     * @name Click  Email
     */
	public void Click__Email()
	{
        
		WebElement elem = getWebElement(_EmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Email", "Click__Email failed. Unable to locate object: " + _EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Email", "Click__Email failed. Unable to locate object: " + _EmailElem.toString());

			Assert.fail("Unable to locate object: " + _EmailElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Email");

		TestModellerLogger.PassStep(m_Driver, "Click__Email");
	}

     
	/**
 	 * Click Generate
     * @name Click Generate
     */
	public void Click_Generate()
	{
        
		WebElement elem = getWebElement(GenerateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Generate", "Click_Generate failed. Unable to locate object: " + GenerateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Generate", "Click_Generate failed. Unable to locate object: " + GenerateElem.toString());

			Assert.fail("Unable to locate object: " + GenerateElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Generate");

		TestModellerLogger.PassStep(m_Driver, "Click_Generate");
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
 	 * Click Title
     * @name Click Title
     */
	public void Click_Title_1()
	{
        
		WebElement elem = getWebElement(Title_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Title_1", "Click_Title_1 failed. Unable to locate object: " + Title_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Title_1", "Click_Title_1 failed. Unable to locate object: " + Title_1Elem.toString());

			Assert.fail("Unable to locate object: " + Title_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Title_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Title_1");
	}

     
	/**
 	 * Click First Name
     * @name Click First Name
     */
	public void Click_First_Name_1()
	{
        
		WebElement elem = getWebElement(First_Name_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_First_Name_1", "Click_First_Name_1 failed. Unable to locate object: " + First_Name_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_First_Name_1", "Click_First_Name_1 failed. Unable to locate object: " + First_Name_1Elem.toString());

			Assert.fail("Unable to locate object: " + First_Name_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_First_Name_1");

		TestModellerLogger.PassStep(m_Driver, "Click_First_Name_1");
	}
}