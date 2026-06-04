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
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/dfa3f5f5-3530-4ab6-b0bb-66d03ff64513
@TestModellerModule(guid = "dfa3f5f5-3530-4ab6-b0bb-66d03ff64513")
public class activateclient extends BasePage
{
	public activateclient (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By ClickEditompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By ClickIsActiveElem = By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_ddlCompanyActive']");

	private By ClickPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By PayeRegDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtPayeRegDate']");

	private By PayeRefNo1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtOfficeNo']");

	private By PayeRefNo2Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtPayeRefNo']");

	private By AccountsOfcRefElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtAORef']");

	private By ClickSaveElem = By.xpath("//*[@id='btnSave']");

	private By GotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");


	
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
 	 * Click ClickPayroll
	 * @throws InterruptedException 
     * @name Click ClickPayroll
     */
	public void Click_ClickPayroll() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

			Assert.fail("Unable to locate object: " + ClickPayrollElem.toString());
        }
		Thread.sleep(15000);
		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayroll");
	}

     
	/**
 	 * Click ClickEditompany
     * @name Click ClickEditompany
     */
	public void Click_ClickEditompany()
	{
        
		WebElement elem = getWebElement(ClickEditompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickEditompany", "Click_ClickEditompany failed. Unable to locate object: " + ClickEditompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickEditompany", "Click_ClickEditompany failed. Unable to locate object: " + ClickEditompanyElem.toString());

			Assert.fail("Unable to locate object: " + ClickEditompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickEditompany");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickEditompany");
	}

     
	/**
 	 * Click ClickIsActive
	 * @throws Exception 
     * @name Click ClickIsActive
     */
	public void Click_ClickIsActive(String status) throws Exception
	{
        
		WebElement elem = getWebElement(ClickIsActiveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickIsActive", "Click_ClickIsActive failed. Unable to locate object: " + ClickIsActiveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickIsActive", "Click_ClickIsActive failed. Unable to locate object: " + ClickIsActiveElem.toString());

			Assert.fail("Unable to locate object: " + ClickIsActiveElem.toString());
        }

		Select compStatus=new Select(elem);
      	Thread.sleep(2000);
      	compStatus.selectByVisibleText(status);
		
          	

		
		TestModellerLogger.PassStep(m_Driver, "Click_ClickIsActive");
	}

     
	/**
 	 * Click ClickPayrollDetails
     * @name Click ClickPayrollDetails
     */
	public void Click_ClickPayrollDetails()
	{
        
		WebElement elem = getWebElement(ClickPayrollDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickPayrollDetails", "Click_ClickPayrollDetails failed. Unable to locate object: " + ClickPayrollDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayrollDetails", "Click_ClickPayrollDetails failed. Unable to locate object: " + ClickPayrollDetailsElem.toString());

			Assert.fail("Unable to locate object: " + ClickPayrollDetailsElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayrollDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayrollDetails");
	}

      
	/**
 	 * Enter PayeRegDate
     * @name Enter PayeRegDate
     */
 	public void Enter_PayeRegDate(String PayeRegDate)
 	{
 	    
 		WebElement elem = getWebElement(PayeRegDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PayeRegDate", "Enter_PayeRegDate failed. Unable to locate object: " + PayeRegDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PayeRegDate", "Enter_PayeRegDate failed. Unable to locate object: " + PayeRegDateElem.toString());

 			Assert.fail("Unable to locate object: " + PayeRegDateElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(PayeRegDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PayeRegDate " + PayeRegDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PayeRegDate " + PayeRegDate);
 	}

      
	/**
 	 * Enter PayeRefNo1
     * @name Enter PayeRefNo1
     */
 	public void Enter_PayeRefNo1(String PayeRefNo1)
 	{
 	    
 		WebElement elem = getWebElement(PayeRefNo1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PayeRefNo1", "Enter_PayeRefNo1 failed. Unable to locate object: " + PayeRefNo1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PayeRefNo1", "Enter_PayeRefNo1 failed. Unable to locate object: " + PayeRefNo1Elem.toString());

 			Assert.fail("Unable to locate object: " + PayeRefNo1Elem.toString());
         }

 		elem.clear();
 		elem.sendKeys(PayeRefNo1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PayeRefNo1 " + PayeRefNo1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PayeRefNo1 " + PayeRefNo1);
 	}

      
	/**
 	 * Enter PayeRefNo2
     * @name Enter PayeRefNo2
     */
 	public void Enter_PayeRefNo2(String PayeRefNo2)
 	{
 	    
 		WebElement elem = getWebElement(PayeRefNo2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PayeRefNo2", "Enter_PayeRefNo2 failed. Unable to locate object: " + PayeRefNo2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PayeRefNo2", "Enter_PayeRefNo2 failed. Unable to locate object: " + PayeRefNo2Elem.toString());

 			Assert.fail("Unable to locate object: " + PayeRefNo2Elem.toString());
         }

 		elem.clear();
 		elem.sendKeys(PayeRefNo2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PayeRefNo2 " + PayeRefNo2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PayeRefNo2 " + PayeRefNo2);
 	}

      
	/**
 	 * Enter AccountsOfcRef
     * @name Enter AccountsOfcRef
     */
 	public void Enter_AccountsOfcRef(String AccountsOfcRef)
 	{
 	    
 		WebElement elem = getWebElement(AccountsOfcRefElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AccountsOfcRef", "Enter_AccountsOfcRef failed. Unable to locate object: " + AccountsOfcRefElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AccountsOfcRef", "Enter_AccountsOfcRef failed. Unable to locate object: " + AccountsOfcRefElem.toString());

 			Assert.fail("Unable to locate object: " + AccountsOfcRefElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(AccountsOfcRef);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AccountsOfcRef " + AccountsOfcRef);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AccountsOfcRef " + AccountsOfcRef);
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
		
		//m_Driver.findElement(By.xpath("//*[@id=\"__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany\"]")).click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
	}

     
	/**
 	 * Click GotoPayrollDashboard
	 * @throws Exception 
     * @name Click GotoPayrollDashboard
     */
	public void Click_GotoPayrollDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(GotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_GotoPayrollDashboard", "Click_GotoPayrollDashboard failed. Unable to locate object: " + GotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_GotoPayrollDashboard", "Click_GotoPayrollDashboard failed. Unable to locate object: " + GotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + GotoPayrollDashboardElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
		TakeScreenshot.takeScreenshot(m_Driver, "RunPayrollButtonNotVisible");
          	

		ExtentReportManager.passStep(m_Driver, "Click_GotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_GotoPayrollDashboard");
	}
}