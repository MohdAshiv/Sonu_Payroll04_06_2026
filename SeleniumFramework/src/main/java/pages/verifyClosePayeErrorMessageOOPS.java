package pages;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.RunPayroll;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/78980c01-9415-49c6-aca9-b300804a56d6
@TestModellerModule(guid = "78980c01-9415-49c6-aca9-b300804a56d6")
public class verifyClosePayeErrorMessageOOPS extends BasePage
{
	public verifyClosePayeErrorMessageOOPS (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By gotoEditCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By gotoPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By ClosePAYEtoYesElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblClosePayee_0']");

	private By EnterDeRegistrationDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtDeRegistrationDate']");

	private By ErrorMessageElem = By.xpath("//DIV[@class='alert alert-danger alert-dismissible']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11983&TaxYearCode=8");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11983&TaxYearCode=8");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11983&TaxYearCode=8");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11983&TaxYearCode=8";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11983&TaxYearCode=8")) {
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

	//	Thread.sleep(15000);
		ClosePopup.ValidateAndPopUp(m_Driver);
		elem.click();
          	
		ChangeWindow.tabswitch(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayroll");
	}
	
	/**
	 * Calling run payroll
	 * @throws Exception 
	 * 
	 */
	public void runpayroll() throws Exception
	{
		RunPayroll.runpayroll(m_Driver);
	}
	
	
	
	/**
	 * Verify Client Pay Method is Auto/Manual
	 * 
	 */
	public void verifyType_Manual()
	{
		
		String Paytype=m_Driver.findElement(By.xpath("//label[contains(.,'Type:')]/../strong/i")).getText();
		
		String Expected="Manual";
		
		assertEquals(Paytype, Expected, "Pay Type of client is not manual ");
		
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
 	 * Click gotoPayrollDetails
     * @name Click gotoPayrollDetails
     */
	public void Click_gotoPayrollDetails()
	{
		System.out.println("Click_gotoPayrollDetails");
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
 	 * Click ClosePAYEtoYes
     * @name Click ClosePAYEtoYes
     */
	public void Click_ClosePAYEtoYes()
	{
        
		WebElement elem = getWebElement(ClosePAYEtoYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClosePAYEtoYes", "Click_ClosePAYEtoYes failed. Unable to locate object: " + ClosePAYEtoYesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClosePAYEtoYes", "Click_ClosePAYEtoYes failed. Unable to locate object: " + ClosePAYEtoYesElem.toString());

			Assert.fail("Unable to locate object: " + ClosePAYEtoYesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClosePAYEtoYes");

		TestModellerLogger.PassStep(m_Driver, "Click_ClosePAYEtoYes");
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
 		
 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		
 		

 		elem.sendKeys(EnterDeRegistrationDate);
 		
 		elem.sendKeys(Keys.TAB);
 		String name="123";
 //		System.out.println("Enter_EnterDeRegistrationDate");
 		TakeScreenshot.takeScreenshot(m_Driver, name);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterDeRegistrationDate " + EnterDeRegistrationDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterDeRegistrationDate " + EnterDeRegistrationDate);
 	}
 	
 	
 	/**
 	 * Enter EnterDeRegistrationDate
	 * @throws Exception 
     * @name Enter EnterDeRegistrationDate
     */
 	public void Enter_EnterDeRegistrationDate1(String EnterDeRegistrationDate) throws Exception
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(EnterDeRegistrationDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterDeRegistrationDate", "Enter_EnterDeRegistrationDate failed. Unable to locate object: " + EnterDeRegistrationDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterDeRegistrationDate", "Enter_EnterDeRegistrationDate failed. Unable to locate object: " + EnterDeRegistrationDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterDeRegistrationDateElem.toString());
         }
 		
 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		
 		

 		elem.sendKeys(EnterDeRegistrationDate);
 		
 		elem.sendKeys(Keys.TAB);
 //		String name="123";
 //		System.out.println("Enter_EnterDeRegistrationDate");
 //		TakeScreenshot.takeScreenshot(m_Driver, name);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterDeRegistrationDate " + EnterDeRegistrationDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterDeRegistrationDate " + EnterDeRegistrationDate);
 	}

     
	/**
 	 * Click ErrorMessage
     * @name Click ErrorMessage
     */
	public void Click_ErrorMessage()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ErrorMessageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ErrorMessage", "Click_ErrorMessage failed. Unable to locate object: " + ErrorMessageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ErrorMessage", "Click_ErrorMessage failed. Unable to locate object: " + ErrorMessageElem.toString());

			Assert.fail("Unable to locate object: " + ErrorMessageElem.toString());
        }

		String ErrorMsg=elem.getText();
		
		System.out.println(ErrorMsg);
		
		String Expected="Error! Oops !!! It seems previous payrolls are pending. Please run all the pending payrolls.";
		
		Assert.assertTrue(ErrorMsg.contains(Expected));
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ErrorMessage");

		TestModellerLogger.PassStep(m_Driver, "Click_ErrorMessage");
	}


	public void ClickScreenshot(String input) throws Exception {
		
		Thread.sleep(1000);
		TakeScreenshot.takeScreenshot(m_Driver, input);
		
		
	}


	public void createScheduleverify() throws Exception 
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "PayrollDsbd");
		
		
	}
}