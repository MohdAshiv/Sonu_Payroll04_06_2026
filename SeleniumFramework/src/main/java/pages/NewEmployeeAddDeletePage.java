package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class NewEmployeeAddDeletePage extends BasePage
{
	
	
	
	public NewEmployeeAddDeletePage (WebDriver driver)
	{
		super(driver);
	}


	
	private By newEmployeeElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefAddEmployee']");

	private By FirstNameElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtFirstName']");

	private By LastNameElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLastName']");

	private By DateOfBirthElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDOB']");

	private By AddressLine1Elem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress1']");

	private By AddressLine2Elem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress2']");

	private By PostcodeElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtPostCode']");

	private By saveElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	private By JoiningDateElem = By.xpath("//input[@id='txtJoiningDate']");
	
	private By taxCodeElem = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtTaxCode']");

	
	
	
	
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click_NewEmployee
	 * @throws InterruptedException 
     * @name Click_NewEmployee
     */
	public void Click_NewEmployee() throws InterruptedException
	{
        
		WebElement elem = getWebElement(newEmployeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + newEmployeeElem.toString());

    		Assert.fail("Unable to locate object: " + newEmployeeElem.toString());
        }

		elem.click();
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click_NewEmployee");

	}

      
	/**
 	 * Enter Enter_FirstName
     * @name Enter Enter_FirstName
     */
 	public void Enter_FirstName(String FirstName)
 	{
 	    
 		WebElement elem = getWebElement(FirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FirstName", "Enter_search_imployee failed. Unable to locate object: " + FirstNameElem.toString());

    		
 			Assert.fail("Unable to locate object: " + FirstNameElem.toString());
         }

 		elem.sendKeys(FirstName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FirstName " + FirstName);

  		
 	}

     
 	
 	
 	/**
 	 * Enter Enter_LastName
     * @name Enter Enter_LastName
     */
 	public void Enter_LastName(String LastName)
 	{
 	    
 		WebElement elem = getWebElement(LastNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

    		
 			Assert.fail("Unable to locate object: " + LastNameElem.toString());
         }

 		elem.sendKeys(LastName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LastName " + LastName);

  		
 	}

 	
 	
 	/**
 	 * Enter Enter_DateOfBirth
	 * @throws Exception 
     * @name Enter Enter_DateOfBirth
     */
 	public void Enter_DateOfBirth(String DateOfBirth) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(DateOfBirthElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateOfBirth", "Enter_DateOfBirth failed. Unable to locate object: " + DateOfBirthElem.toString());

    		Assert.fail("Unable to locate object: " + DateOfBirthElem.toString());
         }
 		
 		jsExec.executeScript("window.scrollBy(0,800)");
 		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(DateOfBirth);
 		Thread.sleep(1000);
 		
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(3000);
 		
   		ExtentReportManager.passStep(m_Driver, "Enter_DateOfBirth " + DateOfBirth);

  		
  			}
 	
 	
 	
	/**
 	 * Enter Enter_AddressLine1
     * @name Enter Enter_AddressLine1
     */
 	public void Enter_AddressLine1(String AddressLine1)
 	{
 	    
 		WebElement elem = getWebElement(AddressLine1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AddressLine1", "Enter_LastName failed. Unable to locate object: " + AddressLine1Elem.toString());

    		
 			Assert.fail("Unable to locate object: " + AddressLine1Elem.toString());
         }

 		elem.sendKeys(AddressLine1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AddressLine1 " + AddressLine1);

  		
 	}
     
 	
 	
 	
 	/**
 	 * Enter Enter_AddressLine2
     * @name Enter Enter_AddressLine2
     */
 	public void Enter_AddressLine2(String AddressLine2)
 	{
 	    
 		WebElement elem = getWebElement(AddressLine2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AddressLine2", "Enter_AddressLine2 failed. Unable to locate object: " + AddressLine2Elem.toString());

    		
 			Assert.fail("Unable to locate object: " + AddressLine2Elem.toString());
         }

 		elem.sendKeys(AddressLine2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "AddressLine2Elem " + AddressLine2);

  		
 	}

 	
 	
 	
	/**
 	 * Enter Enter_Postcode
     * @name Enter Enter_Postcode
     */
 	public void Enter_Postcode(String Postcode)
 	{
 	    
 		WebElement elem = getWebElement(PostcodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Postcode", "Enter_Postcode failed. Unable to locate object: " + PostcodeElem.toString());

    		
 			Assert.fail("Unable to locate object: " + PostcodeElem.toString());
         }

 		elem.sendKeys(Postcode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Postcode " + Postcode);

  		
 	}
 	
 	
 	
 	
 	
 	/**
 	 * Click_saveElem
	 * @throws InterruptedException 
     * @name Click_saveElem
     */
	public void Click_saveElem() throws InterruptedException
	{
        
		WebElement elem = getWebElement(saveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_saveElem", "Click_saveElem failed. Unable to locate object: " + saveElem.toString());

    		Assert.fail("Unable to locate object: " + saveElem.toString());
        }

		elem.click();
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click_saveElem");

	}
	
	
	
	
	/**
 	 * Enter Enter_JoiningDate
	 * @throws Exception 
     * @name Enter Enter_JoiningDate
     */
 	public void Enter_JoiningDate(String JoiningDate) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(JoiningDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_JoiningDate", "Enter_JoiningDate failed. Unable to locate object: " + JoiningDateElem.toString());

    		Assert.fail("Unable to locate object: " + JoiningDateElem.toString());
         }
 		
 		jsExec.executeScript("window.scrollBy(0,800)");
 		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(JoiningDate);
 		Thread.sleep(1000);
 		
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(3000);
 		
   		ExtentReportManager.passStep(m_Driver, "Enter_JoiningDate " + JoiningDate);

  		
  			}
 	
 	/**
 	 * Enter enter_TaxCode
	 * @throws InterruptedException 
     * @name Enter enter_TaxCode
     */
 	public void enter_TaxCode(String taxCode) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(taxCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enter_TaxCode", "enter_TaxCode failed. Unable to locate object: " + taxCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "enter_TaxCode", "enter_TaxCode failed. Unable to locate object: " + taxCodeElem.toString());

 			Assert.fail("Unable to locate object: " + taxCodeElem.toString());
         }
 		
 		Thread.sleep(1000);
 		
 		for(int i=0;i<5;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}

 		elem.sendKeys(taxCode);
 		//m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_dvcompanydirector']/div[1]/label")).click();
 		Reporter.log("Taxcode Changed.");
 		
 		Thread.sleep(2000);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "enter_TaxCode " + taxCode);

  		TestModellerLogger.PassStep(m_Driver, "enter_TaxCode " + taxCode);
 	}
 	
 	
 	
}
