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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8bb4cb74-be7c-4e21-b7f9-57d98677e371
@TestModellerModule(guid = "8bb4cb74-be7c-4e21-b7f9-57d98677e371")
public class deregistercompany extends BasePage
{
	public deregistercompany (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickRunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By ClickRunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By ClickEditCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By gotoPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By selectYesElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblClosePayee_0']");

	private By EnterDeRegistrationDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtDeRegistrationDate']");

	private By ClickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11949&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11949&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11949&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11949&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11949&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickRunPayroll1
     * @name Click ClickRunPayroll1
     */
	public void Click_ClickRunPayroll1()
	{
        
		WebElement elem = getWebElement(ClickRunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRunPayroll1", "Click_ClickRunPayroll1 failed. Unable to locate object: " + ClickRunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRunPayroll1", "Click_ClickRunPayroll1 failed. Unable to locate object: " + ClickRunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + ClickRunPayroll1Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRunPayroll1");
	}

     
	/**
 	 * Click ClickRunPayroll2
     * @name Click ClickRunPayroll2
     */
	public void Click_ClickRunPayroll2()
	{
        
		WebElement elem = getWebElement(ClickRunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRunPayroll2", "Click_ClickRunPayroll2 failed. Unable to locate object: " + ClickRunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRunPayroll2", "Click_ClickRunPayroll2 failed. Unable to locate object: " + ClickRunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + ClickRunPayroll2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRunPayroll2");
	}

     
	/**
 	 * Click ClickEditCompany
     * @name Click ClickEditCompany
     */
	public void Click_ClickEditCompany()
	{
        
		WebElement elem = getWebElement(ClickEditCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickEditCompany", "Click_ClickEditCompany failed. Unable to locate object: " + ClickEditCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickEditCompany", "Click_ClickEditCompany failed. Unable to locate object: " + ClickEditCompanyElem.toString());

			Assert.fail("Unable to locate object: " + ClickEditCompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickEditCompany");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickEditCompany");
	}

     
	/**
 	 * Click gotoPayrollDetails
     * @name Click gotoPayrollDetails
     */
	public void Click_gotoPayrollDetails()
	{
        
		WebElement elem = getWebElement(gotoPayrollDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDetails", "Click_gotoPayrollDetails failed. Unable to locate object: " + gotoPayrollDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDetails", "Click_gotoPayrollDetails failed. Unable to locate object: " + gotoPayrollDetailsElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDetailsElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDetails");
	}

     
	/**
 	 * Click selectYes
     * @name Click selectYes
     */
	public void Click_selectYes()
	{
        
		WebElement elem = getWebElement(selectYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_selectYes", "Click_selectYes failed. Unable to locate object: " + selectYesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_selectYes", "Click_selectYes failed. Unable to locate object: " + selectYesElem.toString());

			Assert.fail("Unable to locate object: " + selectYesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_selectYes");

		TestModellerLogger.PassStep(m_Driver, "Click_selectYes");
	}

      
	/**
 	 * Enter EnterDeRegistrationDate
	 * @throws Exception 
	 * @name Enter EnterDeRegistrationDate
     */
 	public void Enter_EnterDeRegistrationDate(String EnterDeRegistrationDate) throws Exception
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(EnterDeRegistrationDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterDeRegistrationDate", "Enter_EnterDeRegistrationDate failed. Unable to locate object: " + EnterDeRegistrationDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterDeRegistrationDate", "Enter_EnterDeRegistrationDate failed. Unable to locate object: " + EnterDeRegistrationDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterDeRegistrationDateElem.toString());
         }
System.out.println(EnterDeRegistrationDate);
 		//elem.clear();
	for(int i=0;i<10;i++)
	{
		elem.sendKeys(Keys.BACK_SPACE);
	}
 		elem.sendKeys(EnterDeRegistrationDate);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Click_ClickIsActive");

 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterDeRegistrationDate " + EnterDeRegistrationDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterDeRegistrationDate " + EnterDeRegistrationDate);
 	}

     
	/**
 	 * Click ClickSave
	 * @throws Exception 
     * @name Click ClickSave
     */
	public void Click_ClickSave() throws Exception
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ClickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

			Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
        }

		elem.click();
		
//		Thread.sleep(5000);
// 		TakeScreenshot.takeScreenshot(m_Driver, "Company Status After Deregister");
//		
		
        
		m_Driver.switchTo().defaultContent();
		
		
		Thread.sleep(5000);
 		TakeScreenshot.takeScreenshot(m_Driver, "Company Status After Deregister");
		

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
	}
}