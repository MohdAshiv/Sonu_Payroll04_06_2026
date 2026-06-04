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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8406b23c-8f10-4b36-b184-922cf9c6bd31
@TestModellerModule(guid = "8406b23c-8f10-4b36-b184-922cf9c6bd31")
public class EmployerOpeningBalance extends BasePage
{
	public EmployerOpeningBalance (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoOpeningBalancesElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances']");

	private By ApprenticeshipLevyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtApprenticeshipLevy']");

	private By CISSufferedElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtCISSuffered']");

	private By CISTaxElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtCISTax']");

	private By TaxRefundFundingElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtTaxRefundFunding']");

	private By StatutoryPayRecoveryElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtStatutoryPayRecovery']");

	private By ActualPaidToHMRCElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtActualPaidToHMRC']");

	private By SMPRecoveredElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtSMPRecovered']");

	private By NICCompensationOnSMPElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtNICCompensationOnSMP']");

	private By SPPRecoveredElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtSPPRecovered']");

	private By NICCompensationOnSPPElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpOpeningBalances$txtNICCompensationOnSPP']");

	private By clickSaveElem = By.xpath("//*[@id='btnSave']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12030&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12030&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12030&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12030&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=12030&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoOpeningBalances
     * @name Click gotoOpeningBalances
     */
	public void Click_gotoOpeningBalances()
	{
        
		WebElement elem = getWebElement(gotoOpeningBalancesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoOpeningBalances", "Click_gotoOpeningBalances failed. Unable to locate object: " + gotoOpeningBalancesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoOpeningBalances", "Click_gotoOpeningBalances failed. Unable to locate object: " + gotoOpeningBalancesElem.toString());

			Assert.fail("Unable to locate object: " + gotoOpeningBalancesElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_gotoOpeningBalances");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoOpeningBalances");
	}

      
	/**
 	 * Enter ApprenticeshipLevy
     * @name Enter ApprenticeshipLevy
     */
 	public void Enter_ApprenticeshipLevy(String ApprenticeshipLevy)
 	{
 	    
 		WebElement elem = getWebElement(ApprenticeshipLevyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ApprenticeshipLevy", "Enter_ApprenticeshipLevy failed. Unable to locate object: " + ApprenticeshipLevyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ApprenticeshipLevy", "Enter_ApprenticeshipLevy failed. Unable to locate object: " + ApprenticeshipLevyElem.toString());

 			Assert.fail("Unable to locate object: " + ApprenticeshipLevyElem.toString());
         }
 			elem.clear();
 		elem.sendKeys(ApprenticeshipLevy);
 	
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ApprenticeshipLevy " + ApprenticeshipLevy);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ApprenticeshipLevy " + ApprenticeshipLevy);
 	}

      
	/**
 	 * Enter CISSuffered
     * @name Enter CISSuffered
     */
 	public void Enter_CISSuffered(String CISSuffered)
 	{
 	    
 		WebElement elem = getWebElement(CISSufferedElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CISSuffered", "Enter_CISSuffered failed. Unable to locate object: " + CISSufferedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CISSuffered", "Enter_CISSuffered failed. Unable to locate object: " + CISSufferedElem.toString());

 			Assert.fail("Unable to locate object: " + CISSufferedElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(CISSuffered);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CISSuffered " + CISSuffered);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CISSuffered " + CISSuffered);
 	}

      
	/**
 	 * Enter CISTax
     * @name Enter CISTax
     */
 	public void Enter_CISTax(String CISTax)
 	{
 	    
 		WebElement elem = getWebElement(CISTaxElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CISTax", "Enter_CISTax failed. Unable to locate object: " + CISTaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CISTax", "Enter_CISTax failed. Unable to locate object: " + CISTaxElem.toString());

 			Assert.fail("Unable to locate object: " + CISTaxElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(CISTax);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CISTax " + CISTax);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CISTax " + CISTax);
 	}

      
	/**
 	 * Enter TaxRefundFunding
     * @name Enter TaxRefundFunding
     */
 	public void Enter_TaxRefundFunding(String TaxRefundFunding)
 	{
 	    
 		WebElement elem = getWebElement(TaxRefundFundingElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_TaxRefundFunding", "Enter_TaxRefundFunding failed. Unable to locate object: " + TaxRefundFundingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_TaxRefundFunding", "Enter_TaxRefundFunding failed. Unable to locate object: " + TaxRefundFundingElem.toString());

 			Assert.fail("Unable to locate object: " + TaxRefundFundingElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(TaxRefundFunding);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_TaxRefundFunding " + TaxRefundFunding);

  		TestModellerLogger.PassStep(m_Driver, "Enter_TaxRefundFunding " + TaxRefundFunding);
 	}

      
	/**
 	 * Enter StatutoryPayRecovery
     * @name Enter StatutoryPayRecovery
     */
 	public void Enter_StatutoryPayRecovery(String StatutoryPayRecovery)
 	{
 	    
 		WebElement elem = getWebElement(StatutoryPayRecoveryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StatutoryPayRecovery", "Enter_StatutoryPayRecovery failed. Unable to locate object: " + StatutoryPayRecoveryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StatutoryPayRecovery", "Enter_StatutoryPayRecovery failed. Unable to locate object: " + StatutoryPayRecoveryElem.toString());

 			Assert.fail("Unable to locate object: " + StatutoryPayRecoveryElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(StatutoryPayRecovery);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StatutoryPayRecovery " + StatutoryPayRecovery);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StatutoryPayRecovery " + StatutoryPayRecovery);
 	}

      
	/**
 	 * Enter ActualPaidToHMRC
     * @name Enter ActualPaidToHMRC
     */
 	public void Enter_ActualPaidToHMRC(String ActualPaidToHMRC)
 	{
 	    
 		WebElement elem = getWebElement(ActualPaidToHMRCElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ActualPaidToHMRC", "Enter_ActualPaidToHMRC failed. Unable to locate object: " + ActualPaidToHMRCElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ActualPaidToHMRC", "Enter_ActualPaidToHMRC failed. Unable to locate object: " + ActualPaidToHMRCElem.toString());

 			Assert.fail("Unable to locate object: " + ActualPaidToHMRCElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(ActualPaidToHMRC);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ActualPaidToHMRC " + ActualPaidToHMRC);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ActualPaidToHMRC " + ActualPaidToHMRC);
 	}

      
	/**
 	 * Enter SMPRecovered
     * @name Enter SMPRecovered
     */
 	public void Enter_SMPRecovered(String SMPRecovered)
 	{
 	    
 		WebElement elem = getWebElement(SMPRecoveredElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SMPRecovered", "Enter_SMPRecovered failed. Unable to locate object: " + SMPRecoveredElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SMPRecovered", "Enter_SMPRecovered failed. Unable to locate object: " + SMPRecoveredElem.toString());

 			Assert.fail("Unable to locate object: " + SMPRecoveredElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(SMPRecovered);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SMPRecovered " + SMPRecovered);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SMPRecovered " + SMPRecovered);
 	}

      
	/**
 	 * Enter NICCompensationOnSMP
     * @name Enter NICCompensationOnSMP
     */
 	public void Enter_NICCompensationOnSMP(String NICCompensationOnSMP)
 	{
 	    
 		WebElement elem = getWebElement(NICCompensationOnSMPElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NICCompensationOnSMP", "Enter_NICCompensationOnSMP failed. Unable to locate object: " + NICCompensationOnSMPElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NICCompensationOnSMP", "Enter_NICCompensationOnSMP failed. Unable to locate object: " + NICCompensationOnSMPElem.toString());

 			Assert.fail("Unable to locate object: " + NICCompensationOnSMPElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(NICCompensationOnSMP);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_NICCompensationOnSMP " + NICCompensationOnSMP);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NICCompensationOnSMP " + NICCompensationOnSMP);
 	}

      
	/**
 	 * Enter SPPRecovered
     * @name Enter SPPRecovered
     */
 	public void Enter_SPPRecovered(String SPPRecovered)
 	{
 	    
 		WebElement elem = getWebElement(SPPRecoveredElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SPPRecovered", "Enter_SPPRecovered failed. Unable to locate object: " + SPPRecoveredElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SPPRecovered", "Enter_SPPRecovered failed. Unable to locate object: " + SPPRecoveredElem.toString());

 			Assert.fail("Unable to locate object: " + SPPRecoveredElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(SPPRecovered);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SPPRecovered " + SPPRecovered);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SPPRecovered " + SPPRecovered);
 	}

      
	/**
 	 * Enter NICCompensationOnSPP
     * @name Enter NICCompensationOnSPP
     */
 	public void Enter_NICCompensationOnSPP(String NICCompensationOnSPP)
 	{
 	    
 		WebElement elem = getWebElement(NICCompensationOnSPPElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NICCompensationOnSPP", "Enter_NICCompensationOnSPP failed. Unable to locate object: " + NICCompensationOnSPPElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NICCompensationOnSPP", "Enter_NICCompensationOnSPP failed. Unable to locate object: " + NICCompensationOnSPPElem.toString());

 			Assert.fail("Unable to locate object: " + NICCompensationOnSPPElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(NICCompensationOnSPP);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_NICCompensationOnSPP " + NICCompensationOnSPP);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NICCompensationOnSPP " + NICCompensationOnSPP);
 	}

     
	/**
 	 * Click clickSave
     * @name Click clickSave
     */
	public void Click_clickSave()
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }
		
		elem.click();
          	

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
}