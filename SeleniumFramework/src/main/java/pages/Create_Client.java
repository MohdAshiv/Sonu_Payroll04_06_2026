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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2671c791-3e97-41ae-9124-8a4048e0d638
@TestModellerModule(guid = "2671c791-3e97-41ae-9124-8a4048e0d638")
public class Create_Client extends BasePage
{
	public Create_Client (WebDriver driver)
	{
		super(driver);
	}


	
	private By _New_ClientElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");

	private By LimitedElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']");

	private By Limited_CompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By EnterBusinessCompanyNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By EnterRegNoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By RegDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By FirstName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By LastName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Create_Payroll_ProfileElem = By.xpath("//label[text()='Create a payroll profile']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AgentUI/CompanyAdd.aspx?menuid=0&ct=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  New Client
     * @name Click  New Client
     */
	public void Click__New_Client()
	{
        
		WebElement elem = getWebElement(_New_ClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Client", "Click__New_Client failed. Unable to locate object: " + _New_ClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Client", "Click__New_Client failed. Unable to locate object: " + _New_ClientElem.toString());

			Assert.fail("Unable to locate object: " + _New_ClientElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Client");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Client");
	}

     
	/**
 	 * Click Limited
     * @name Click Limited
     */
	public void Click_Limited()
	{
        
		WebElement elem = getWebElement(LimitedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Limited", "Click_Limited failed. Unable to locate object: " + LimitedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Limited", "Click_Limited failed. Unable to locate object: " + LimitedElem.toString());

			Assert.fail("Unable to locate object: " + LimitedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Limited");

		TestModellerLogger.PassStep(m_Driver, "Click_Limited");
	}

     
	/**
 	 * Click Limited Company
     * @name Click Limited Company
     */
	public void Click_Limited_Company()
	{
        
		WebElement elem = getWebElement(Limited_CompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Limited_Company", "Click_Limited_Company failed. Unable to locate object: " + Limited_CompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Limited_Company", "Click_Limited_Company failed. Unable to locate object: " + Limited_CompanyElem.toString());

			Assert.fail("Unable to locate object: " + Limited_CompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Limited_Company");

		TestModellerLogger.PassStep(m_Driver, "Click_Limited_Company");
	}

      
	/**
 	 * Enter EnterBusinessCompanyName
     * @name Enter EnterBusinessCompanyName
     */
 	public void Enter_EnterBusinessCompanyName(String EnterBusinessCompanyName)
 	{
 	    
 		WebElement elem = getWebElement(EnterBusinessCompanyNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterBusinessCompanyName", "Enter_EnterBusinessCompanyName failed. Unable to locate object: " + EnterBusinessCompanyNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterBusinessCompanyName", "Enter_EnterBusinessCompanyName failed. Unable to locate object: " + EnterBusinessCompanyNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterBusinessCompanyNameElem.toString());
         }

 		elem.sendKeys(EnterBusinessCompanyName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterBusinessCompanyName " + EnterBusinessCompanyName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterBusinessCompanyName " + EnterBusinessCompanyName);
 	}

      
	/**
 	 * Enter EnterRegNo
     * @name Enter EnterRegNo
     */
 	public void Enter_EnterRegNo(String EnterRegNo)
 	{
 	    
 		WebElement elem = getWebElement(EnterRegNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterRegNo", "Enter_EnterRegNo failed. Unable to locate object: " + EnterRegNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterRegNo", "Enter_EnterRegNo failed. Unable to locate object: " + EnterRegNoElem.toString());

 			Assert.fail("Unable to locate object: " + EnterRegNoElem.toString());
         }

 		elem.sendKeys(EnterRegNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterRegNo " + EnterRegNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterRegNo " + EnterRegNo);
 	}

      
	/**
 	 * Enter RegDate
     * @name Enter RegDate
     */
 	public void Enter_RegDate(String RegDate)
 	{
 	    
 		WebElement elem = getWebElement(RegDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegDate", "Enter_RegDate failed. Unable to locate object: " + RegDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegDate", "Enter_RegDate failed. Unable to locate object: " + RegDateElem.toString());

 			Assert.fail("Unable to locate object: " + RegDateElem.toString());
         }

 		elem.sendKeys(RegDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegDate " + RegDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegDate " + RegDate);
 	}

      
	/**
 	 * Enter FirstName1
     * @name Enter FirstName1
     */
 	public void Enter_FirstName1(String FirstName1)
 	{
 	    
 		WebElement elem = getWebElement(FirstName1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FirstName1", "Enter_FirstName1 failed. Unable to locate object: " + FirstName1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FirstName1", "Enter_FirstName1 failed. Unable to locate object: " + FirstName1Elem.toString());

 			Assert.fail("Unable to locate object: " + FirstName1Elem.toString());
         }

 		elem.sendKeys(FirstName1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FirstName1 " + FirstName1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FirstName1 " + FirstName1);
 	}

      
	/**
 	 * Enter LastName1
     * @name Enter LastName1
     */
 	public void Enter_LastName1(String LastName1)
 	{
 	    
 		WebElement elem = getWebElement(LastName1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LastName1", "Enter_LastName1 failed. Unable to locate object: " + LastName1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LastName1", "Enter_LastName1 failed. Unable to locate object: " + LastName1Elem.toString());

 			Assert.fail("Unable to locate object: " + LastName1Elem.toString());
         }

 		elem.sendKeys(LastName1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LastName1 " + LastName1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LastName1 " + LastName1);
 	}

     
	/**
 	 * Click Create Payroll Profile
     * @name Click Create Payroll Profile
     */
	public void Click_Create_Payroll_Profile()
	{
        
		WebElement elem = getWebElement(Create_Payroll_ProfileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Create_Payroll_Profile", "Click_Create_Payroll_Profile failed. Unable to locate object: " + Create_Payroll_ProfileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Create_Payroll_Profile", "Click_Create_Payroll_Profile failed. Unable to locate object: " + Create_Payroll_ProfileElem.toString());

			Assert.fail("Unable to locate object: " + Create_Payroll_ProfileElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Create_Payroll_Profile");

		TestModellerLogger.PassStep(m_Driver, "Click_Create_Payroll_Profile");
	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	}
}