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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c0ae019b-eac8-4527-9a6c-e3c107380f16
@TestModellerModule(guid = "c0ae019b-eac8-4527-9a6c-e3c107380f16")
public class TaxAndReport extends BasePage
{
	public TaxAndReport (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By gotoTaxPaymentElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");

	//private By clickExporttoPDFElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnpdf']");
	
	private By clickExporttoPDFElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_Lnkbtnpdf\"]  ");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickP11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");

	private By ExporttoPDF2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']");

	private By clickPayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By downloadPayslipElem = By.xpath("//A[@data-original-title='Payslip download']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12024");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12024");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12024");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12024";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12024")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

     
	/**
 	 * Click RunPayroll1
     * @name Click RunPayroll1
     */
	public void Click_RunPayroll1()
	{
        
		WebElement elem = getWebElement(RunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll1");
	}

     
	/**
 	 * Click RunPayroll2
     * @name Click RunPayroll2
     */
	public void Click_RunPayroll2()
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}

     
	/**
 	 * Click gotoTaxPayment
     * @name Click gotoTaxPayment
     */
	public void Click_gotoTaxPayment()
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}

     
	/**
 	 * Click clickExporttoPDF
     * @name Click clickExporttoPDF
     */
	public void Click_clickExporttoPDF()
	{
        
		WebElement elem = getWebElement(clickExporttoPDFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickExporttoPDF", "Click_clickExporttoPDF failed. Unable to locate object: " + clickExporttoPDFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickExporttoPDF", "Click_clickExporttoPDF failed. Unable to locate object: " + clickExporttoPDFElem.toString());

			Assert.fail("Unable to locate object: " + clickExporttoPDFElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickExporttoPDF");

		TestModellerLogger.PassStep(m_Driver, "Click_clickExporttoPDF");
	}

     
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click clickP11
     * @name Click clickP11
     */
	public void Click_clickP11()
	{
        
		WebElement elem = getWebElement(clickP11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP11", "Click_clickP11 failed. Unable to locate object: " + clickP11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP11", "Click_clickP11 failed. Unable to locate object: " + clickP11Elem.toString());

			Assert.fail("Unable to locate object: " + clickP11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP11");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP11");
	}

     
	/**
 	 * Click ExporttoPDF2
     * @name Click ExporttoPDF2
     */
	public void Click_ExporttoPDF2()
	{
        
		WebElement elem = getWebElement(ExporttoPDF2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExporttoPDF2", "Click_ExporttoPDF2 failed. Unable to locate object: " + ExporttoPDF2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExporttoPDF2", "Click_ExporttoPDF2 failed. Unable to locate object: " + ExporttoPDF2Elem.toString());

			Assert.fail("Unable to locate object: " + ExporttoPDF2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ExporttoPDF2");

		TestModellerLogger.PassStep(m_Driver, "Click_ExporttoPDF2");
	}

     
	/**
 	 * Click clickPayslips
     * @name Click clickPayslips
     */
	public void Click_clickPayslips()
	{
        
		WebElement elem = getWebElement(clickPayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayslips", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayslips", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayslipsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayslips");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayslips");
	}

     
	/**
 	 * Click downloadPayslip
	 * @throws Exception 
	 * @name Click downloadPayslip
     */
	public void Click_downloadPayslip() throws Exception
	{
        
		WebElement elem = getWebElement(downloadPayslipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_downloadPayslip", "Click_downloadPayslip failed. Unable to locate object: " + downloadPayslipElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_downloadPayslip", "Click_downloadPayslip failed. Unable to locate object: " + downloadPayslipElem.toString());

			Assert.fail("Unable to locate object: " + downloadPayslipElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		TakeScreenshot.takeScreenshot(m_Driver, "OpeningBalancePayslip");
		Thread.sleep(3000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_downloadPayslip");

		TestModellerLogger.PassStep(m_Driver, "Click_downloadPayslip");
	}
}