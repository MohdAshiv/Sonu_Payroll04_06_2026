package pages1;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/46854a4b-f0f4-45a9-b0e7-ce52bf9c4a21
@TestModellerModule(guid = "46854a4b-f0f4-45a9-b0e7-ce52bf9c4a21")
public class P11D extends BasePage
{
	public P11D (WebDriver driver)
	{
		super(driver);
	}


	
	private By YesElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbP11D_0']");

	private By _SaveElem = By.xpath("//*[@id='btnSave']");

	private By _Payroll_Dashboard_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By Mr_sumit_jhaElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");

	private By _Edit_employee_details_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");

	private By Expenses_and_BenefitsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpExpensesandBenefits']");

	private By _Filing_Management_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

	private By ctl00ctl00ParentContentcpHeadingddlPayrollFrequencyElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeading$ddlPayrollFrequency']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Yes
	 * @throws InterruptedException 
     * @name Click Yes
     */
	public void Click_Yes() throws InterruptedException
	{
        
		WebElement elem = getWebElement(YesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Yes", "Click_Yes failed. Unable to locate object: " + YesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Yes", "Click_Yes failed. Unable to locate object: " + YesElem.toString());

			Assert.fail("Unable to locate object: " + YesElem.toString());
        }

		elem.click();
          	Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "Click_Yes");

		TestModellerLogger.PassStep(m_Driver, "Click_Yes");
	}

     
	/**
 	 * Click  Save
	 * @throws InterruptedException 
     * @name Click  Save
     */
	public void Click__Save() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

			Assert.fail("Unable to locate object: " + _SaveElem.toString());
        }

		elem.click();
          Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click__Save");

		TestModellerLogger.PassStep(m_Driver, "Click__Save");
	}

     
	/**
 	 * Click  Payroll Dashboard 
	 * @throws InterruptedException 
     * @name Click  Payroll Dashboard 
     */
	public void Click__Payroll_Dashboard_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Payroll_Dashboard_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Payroll_Dashboard_", "Click__Payroll_Dashboard_ failed. Unable to locate object: " + _Payroll_Dashboard_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Payroll_Dashboard_", "Click__Payroll_Dashboard_ failed. Unable to locate object: " + _Payroll_Dashboard_Elem.toString());

			Assert.fail("Unable to locate object: " + _Payroll_Dashboard_Elem.toString());
        }
		Thread.sleep(2000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Payroll_Dashboard_");

		TestModellerLogger.PassStep(m_Driver, "Click__Payroll_Dashboard_");
	}

     
	/**
 	 * Click Mr. sumit jha
     * @name Click Mr. sumit jha
     */
	public void Click_Mr_sumit_jha()
	{
        
		WebElement elem = getWebElement(Mr_sumit_jhaElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Mr_sumit_jha", "Click_Mr_sumit_jha failed. Unable to locate object: " + Mr_sumit_jhaElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Mr_sumit_jha", "Click_Mr_sumit_jha failed. Unable to locate object: " + Mr_sumit_jhaElem.toString());

			Assert.fail("Unable to locate object: " + Mr_sumit_jhaElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Mr_sumit_jha");

		TestModellerLogger.PassStep(m_Driver, "Click_Mr_sumit_jha");
	}

     
	/**
 	 * Click  Edit employee details 
     * @name Click  Edit employee details 
     */
	public void Click__Edit_employee_details_()
	{
        
		WebElement elem = getWebElement(_Edit_employee_details_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Edit_employee_details_", "Click__Edit_employee_details_ failed. Unable to locate object: " + _Edit_employee_details_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Edit_employee_details_", "Click__Edit_employee_details_ failed. Unable to locate object: " + _Edit_employee_details_Elem.toString());

			Assert.fail("Unable to locate object: " + _Edit_employee_details_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Edit_employee_details_");

		TestModellerLogger.PassStep(m_Driver, "Click__Edit_employee_details_");
	}

     
	/**
 	 * Click Expenses and Benefits
	 * @throws Exception 
     * @name Click Expenses and Benefits
     */
	public void Click_Expenses_and_Benefits() throws Exception
	{
        
		WebElement elem = getWebElement(Expenses_and_BenefitsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenses_and_Benefits", "Click_Expenses_and_Benefits failed. Unable to locate object: " + Expenses_and_BenefitsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenses_and_Benefits", "Click_Expenses_and_Benefits failed. Unable to locate object: " + Expenses_and_BenefitsElem.toString());

			Assert.fail("Unable to locate object: " + Expenses_and_BenefitsElem.toString());
        }

		elem.click();
          	TakeScreenshot.takeScreenshot(m_Driver, "ExpensesansBenifits");

		ExtentReportManager.passStep(m_Driver, "Click_Expenses_and_Benefits");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenses_and_Benefits");
	}

     
	/**
 	 * Click  Filing Management 
     * @name Click  Filing Management 
     */
	public void Click__Filing_Management_()
	{
        
		WebElement elem = getWebElement(_Filing_Management_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Filing_Management_", "Click__Filing_Management_ failed. Unable to locate object: " + _Filing_Management_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Filing_Management_", "Click__Filing_Management_ failed. Unable to locate object: " + _Filing_Management_Elem.toString());

			Assert.fail("Unable to locate object: " + _Filing_Management_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Filing_Management_");

		TestModellerLogger.PassStep(m_Driver, "Click__Filing_Management_");
	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cpHeading$ddlPayrollFrequency
	 * @throws Exception 
     * @name Select ctl00$ctl00$ParentContent$cpHeading$ddlPayrollFrequency
     */
    public void Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency(String ctl00ctl00ParentContentcpHeadingddlPayrollFrequency) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcpHeadingddlPayrollFrequencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency", "Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency failed. Unable to locate object: " + ctl00ctl00ParentContentcpHeadingddlPayrollFrequencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency", "Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency failed. Unable to locate object: " + ctl00ctl00ParentContentcpHeadingddlPayrollFrequencyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcpHeadingddlPayrollFrequencyElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcpHeadingddlPayrollFrequency);
 		TakeScreenshot.takeScreenshot(m_Driver, "P11D");
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency " + ctl00ctl00ParentContentcpHeadingddlPayrollFrequency);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcpHeadingddlPayrollFrequency " + ctl00ctl00ParentContentcpHeadingddlPayrollFrequency);
 	}
}