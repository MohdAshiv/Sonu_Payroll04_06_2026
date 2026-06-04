package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a50235a3-00f3-427c-9b57-7357800017da
@TestModellerModule(guid = "a50235a3-00f3-427c-9b57-7357800017da")
public class NomismaStartDate extends BasePage
{
	public NomismaStartDate (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickPayrollSettingsElem = By.xpath("//A[contains(text(),'Payroll Settings')]");

	private By EnterNomismaStartDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtSwitchDate']");

	private By ClickSaveElem = By.xpath("//*[@id='btnSave']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By gotoEditCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By clickPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By PayrollSettings2Elem = By.xpath("//A[contains(text(),'Payroll Settings')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickPayrollSettings
     * @name Click ClickPayrollSettings
     */
	public void Click_ClickPayrollSettings()
	{
        
		WebElement elem = getWebElement(ClickPayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickPayrollSettings", "Click_ClickPayrollSettings failed. Unable to locate object: " + ClickPayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayrollSettings", "Click_ClickPayrollSettings failed. Unable to locate object: " + ClickPayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + ClickPayrollSettingsElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayrollSettings");
	}

      
	/**
 	 * Enter EnterNomismaStartDate
	 * @throws InterruptedException 
     * @name Enter EnterNomismaStartDate
     */
 	public void Enter_EnterNomismaStartDate(String EnterNomismaStartDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EnterNomismaStartDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNomismaStartDate", "Enter_EnterNomismaStartDate failed. Unable to locate object: " + EnterNomismaStartDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNomismaStartDate", "Enter_EnterNomismaStartDate failed. Unable to locate object: " + EnterNomismaStartDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterNomismaStartDateElem.toString());
         }

 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 			Thread.sleep(2000);
 			
 		//	m_Driver.findElement(By.xpath("//*[@id='PayrollSettings']/div[2]/label")).click();
 			
 		elem.sendKeys(EnterNomismaStartDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNomismaStartDate " + EnterNomismaStartDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNomismaStartDate " + EnterNomismaStartDate);
 	}

     
	/**
 	 * Click ClickSave
     * @name Click ClickSave
     */
	public void Click_ClickSave()
	{
        
		WebElement elem = getWebElement(ClickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

			Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
	}

     
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
		TakeScreenshot.takeScreenshot(m_Driver, "RunPayrollOption");
          	

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
 	 * Click gotoEditCompany
     * @name Click gotoEditCompany
     */
	public void Click_gotoEditCompany()
	{
        
		WebElement elem = getWebElement(gotoEditCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoEditCompany", "Click_gotoEditCompany failed. Unable to locate object: " + gotoEditCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoEditCompany", "Click_gotoEditCompany failed. Unable to locate object: " + gotoEditCompanyElem.toString());

			Assert.fail("Unable to locate object: " + gotoEditCompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoEditCompany");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoEditCompany");
	}

     
	/**
 	 * Click clickPayrollDetails
     * @name Click clickPayrollDetails
     */
	public void Click_clickPayrollDetails()
	{
        
		WebElement elem = getWebElement(clickPayrollDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollDetails", "Click_clickPayrollDetails failed. Unable to locate object: " + clickPayrollDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollDetails", "Click_clickPayrollDetails failed. Unable to locate object: " + clickPayrollDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollDetailsElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollDetails");
	}

     
	/**
 	 * Click PayrollSettings2
	 * @throws Exception 
     * @name Click PayrollSettings2
     */
	public void Click_PayrollSettings2() throws Exception
	{
        
		WebElement elem = getWebElement(PayrollSettings2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollSettings2", "Click_PayrollSettings2 failed. Unable to locate object: " + PayrollSettings2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayrollSettings2", "Click_PayrollSettings2 failed. Unable to locate object: " + PayrollSettings2Elem.toString());

			Assert.fail("Unable to locate object: " + PayrollSettings2Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);	
		TakeScreenshot.takeScreenshot(m_Driver, "Unclickable NomismaStartDate");
          	

		ExtentReportManager.passStep(m_Driver, "Click_PayrollSettings2");

		TestModellerLogger.PassStep(m_Driver, "Click_PayrollSettings2");
	}
}