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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/71484d5d-c422-4c0d-b9ab-e2e1c4fcff61
@TestModellerModule(guid = "71484d5d-c422-4c0d-b9ab-e2e1c4fcff61")
public class Employee_details_list extends BasePage
{
	public Employee_details_list (WebDriver driver)
	{
		super(driver);
	}


	
	private By Employee_Details_ListElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportEmployeeListByCompany']");

	private By Employee_Status_Elem = By.xpath("//LABEL[contains(text(),'Employee Status :')]");

	private By ctl00ctl00ParentContentcPHFilterddlEmployeeStatusElem = By.xpath("//label[normalize-space()= 'Employee Status :']/../select");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchElem = By.xpath("//label[normalize-space()= 'Employee Status :']/../../div[2]/input");

	private By _SearchElem = By.xpath("//label[normalize-space()= 'Employee Status :']/../../div[2]/a");

	private By _Miss_Elem = By.xpath("//TD[contains(text(),'Miss')]");

	private By _Deepika_Elem = By.xpath("//A[contains(text(),'Deepika')]");

	private By _Arora_Elem = By.xpath("//TD[contains(text(),'Arora')]");

	private By Annually_Elem = By.xpath("//TD[contains(text(),'Annually')]");

	private By Daily_Elem = By.xpath("//TD[contains(text(),'Daily')]");

	private By _1800000Elem = By.xpath("//TD[contains(text(),'£18,000.00')]");

	private By _6923Elem = By.xpath("//TD[contains(text(),'£69.23')]");

	private By _06081989_Elem = By.xpath("//TD[contains(text(),'06/08/1989')]");

	private By _06042014_Elem = By.xpath("//TD[contains(text(),'06/04/2014')]");

	private By _Elem = By.xpath("//TD[@class='align-center el-selection']");

	private By __1Elem = By.xpath("//TD[@class='align-right el-selection']");

	private By __2Elem = By.xpath("//label[normalize-space()= 'Employee Status :']/../../../../../../div[2]/div/a[1]");

	private By __3Elem = By.xpath("//label[normalize-space()= 'Employee Status :']/../../../../../../div[2]/div/a[2]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeeListByCompany.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeeListByCompany.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeeListByCompany.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeeListByCompany.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeeListByCompany.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Employee Details List
     * @name Click Employee Details List
     */
	public void Click_Employee_Details_List()
	{
        
		WebElement elem = getWebElement(Employee_Details_ListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employee_Details_List", "Click_Employee_Details_List failed. Unable to locate object: " + Employee_Details_ListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employee_Details_List", "Click_Employee_Details_List failed. Unable to locate object: " + Employee_Details_ListElem.toString());

			Assert.fail("Unable to locate object: " + Employee_Details_ListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employee_Details_List");

		TestModellerLogger.PassStep(m_Driver, "Click_Employee_Details_List");
	}

     
	/**
 	 * Click Employee Status :
     * @name Click Employee Status :
     */
	public void Click_Employee_Status_()
	{
        
		WebElement elem = getWebElement(Employee_Status_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employee_Status_", "Click_Employee_Status_ failed. Unable to locate object: " + Employee_Status_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employee_Status_", "Click_Employee_Status_ failed. Unable to locate object: " + Employee_Status_Elem.toString());

			Assert.fail("Unable to locate object: " + Employee_Status_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employee_Status_");

		TestModellerLogger.PassStep(m_Driver, "Click_Employee_Status_");
	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployeeStatus
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployeeStatus
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlEmployeeStatus(String ctl00ctl00ParentContentcPHFilterddlEmployeeStatus)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlEmployeeStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployeeStatus", "Select_ctl00ctl00ParentContentcPHFilterddlEmployeeStatus failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployeeStatus", "Select_ctl00ctl00ParentContentcPHFilterddlEmployeeStatus failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeStatusElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlEmployeeStatus);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployeeStatus " + ctl00ctl00ParentContentcPHFilterddlEmployeeStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployeeStatus " + ctl00ctl00ParentContentcPHFilterddlEmployeeStatus);
 	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearch
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearch
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtSearch(String ctl00ctl00ParentContentcPHFiltertxtSearch)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtSearchElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearch", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearch failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearch", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearch failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtSearch);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearch " + ctl00ctl00ParentContentcPHFiltertxtSearch);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearch " + ctl00ctl00ParentContentcPHFiltertxtSearch);
 	}

     
	/**
 	 * Click  Search
     * @name Click  Search
     */
	public void Click__Search()
	{
        
		WebElement elem = getWebElement(_SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Search", "Click__Search failed. Unable to locate object: " + _SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Search", "Click__Search failed. Unable to locate object: " + _SearchElem.toString());

			Assert.fail("Unable to locate object: " + _SearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Search");

		TestModellerLogger.PassStep(m_Driver, "Click__Search");
	}

     
	/**
 	 * Click  Miss 
     * @name Click  Miss 
     */
	public void Click__Miss_()
	{
        
		WebElement elem = getWebElement(_Miss_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Miss_", "Click__Miss_ failed. Unable to locate object: " + _Miss_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Miss_", "Click__Miss_ failed. Unable to locate object: " + _Miss_Elem.toString());

			Assert.fail("Unable to locate object: " + _Miss_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Miss_");

		TestModellerLogger.PassStep(m_Driver, "Click__Miss_");
	}

     
	/**
 	 * Click  Deepika 
     * @name Click  Deepika 
     */
	public void Click__Deepika_()
	{
        
		WebElement elem = getWebElement(_Deepika_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Deepika_", "Click__Deepika_ failed. Unable to locate object: " + _Deepika_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Deepika_", "Click__Deepika_ failed. Unable to locate object: " + _Deepika_Elem.toString());

			Assert.fail("Unable to locate object: " + _Deepika_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Deepika_");

		TestModellerLogger.PassStep(m_Driver, "Click__Deepika_");
	}

     
	/**
 	 * Click  Arora 
     * @name Click  Arora 
     */
	public void Click__Arora_()
	{
        
		WebElement elem = getWebElement(_Arora_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Arora_", "Click__Arora_ failed. Unable to locate object: " + _Arora_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Arora_", "Click__Arora_ failed. Unable to locate object: " + _Arora_Elem.toString());

			Assert.fail("Unable to locate object: " + _Arora_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Arora_");

		TestModellerLogger.PassStep(m_Driver, "Click__Arora_");
	}

     
	/**
 	 * Click Annually 
     * @name Click Annually 
     */
	public void Click_Annually_()
	{
        
		WebElement elem = getWebElement(Annually_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Annually_", "Click_Annually_ failed. Unable to locate object: " + Annually_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Annually_", "Click_Annually_ failed. Unable to locate object: " + Annually_Elem.toString());

			Assert.fail("Unable to locate object: " + Annually_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Annually_");

		TestModellerLogger.PassStep(m_Driver, "Click_Annually_");
	}

     
	/**
 	 * Click Daily 
     * @name Click Daily 
     */
	public void Click_Daily_()
	{
        
		WebElement elem = getWebElement(Daily_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Daily_", "Click_Daily_ failed. Unable to locate object: " + Daily_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Daily_", "Click_Daily_ failed. Unable to locate object: " + Daily_Elem.toString());

			Assert.fail("Unable to locate object: " + Daily_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Daily_");

		TestModellerLogger.PassStep(m_Driver, "Click_Daily_");
	}

     
	/**
 	 * Click  £18,000.00
     * @name Click  £18,000.00
     */
	public void Click__1800000()
	{
        
		WebElement elem = getWebElement(_1800000Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__1800000", "Click__1800000 failed. Unable to locate object: " + _1800000Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__1800000", "Click__1800000 failed. Unable to locate object: " + _1800000Elem.toString());

			Assert.fail("Unable to locate object: " + _1800000Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__1800000");

		TestModellerLogger.PassStep(m_Driver, "Click__1800000");
	}

     
	/**
 	 * Click £69.23
     * @name Click £69.23
     */
	public void Click__6923()
	{
        
		WebElement elem = getWebElement(_6923Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__6923", "Click__6923 failed. Unable to locate object: " + _6923Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__6923", "Click__6923 failed. Unable to locate object: " + _6923Elem.toString());

			Assert.fail("Unable to locate object: " + _6923Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__6923");

		TestModellerLogger.PassStep(m_Driver, "Click__6923");
	}

     
	/**
 	 * Click  06/08/1989 
     * @name Click  06/08/1989 
     */
	public void Click__06081989_()
	{
        
		WebElement elem = getWebElement(_06081989_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__06081989_", "Click__06081989_ failed. Unable to locate object: " + _06081989_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__06081989_", "Click__06081989_ failed. Unable to locate object: " + _06081989_Elem.toString());

			Assert.fail("Unable to locate object: " + _06081989_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__06081989_");

		TestModellerLogger.PassStep(m_Driver, "Click__06081989_");
	}

     
	/**
 	 * Click  06/04/2014 
     * @name Click  06/04/2014 
     */
	public void Click__06042014_()
	{
        
		WebElement elem = getWebElement(_06042014_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__06042014_", "Click__06042014_ failed. Unable to locate object: " + _06042014_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__06042014_", "Click__06042014_ failed. Unable to locate object: " + _06042014_Elem.toString());

			Assert.fail("Unable to locate object: " + _06042014_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__06042014_");

		TestModellerLogger.PassStep(m_Driver, "Click__06042014_");
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
 	 * Click  
     * @name Click  
     */
	public void Click___1()
	{
        
		WebElement elem = getWebElement(__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

			Assert.fail("Unable to locate object: " + __1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click___1");

		TestModellerLogger.PassStep(m_Driver, "Click___1");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click___2()
	{
        
		WebElement elem = getWebElement(__2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click___2", "Click___2 failed. Unable to locate object: " + __2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click___2", "Click___2 failed. Unable to locate object: " + __2Elem.toString());

			Assert.fail("Unable to locate object: " + __2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click___2");

		TestModellerLogger.PassStep(m_Driver, "Click___2");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click___3()
	{
        
		WebElement elem = getWebElement(__3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click___3", "Click___3 failed. Unable to locate object: " + __3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click___3", "Click___3 failed. Unable to locate object: " + __3Elem.toString());

			Assert.fail("Unable to locate object: " + __3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click___3");

		TestModellerLogger.PassStep(m_Driver, "Click___3");
	}
}