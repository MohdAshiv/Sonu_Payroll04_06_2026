package PayrollDashboardUI;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2f7ea6c3-c017-41e1-8dfa-47825a385621
@TestModellerModule(guid = "2f7ea6c3-c017-41e1-8dfa-47825a385621")
public class EditCompanyPage extends BasePage
{
	public EditCompanyPage (WebDriver driver)
	{
		super(driver);
	}


	
	private By InformationElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany']");

	private By Payroll_DetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By Opening_BalancesElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances']");

	private By General_TermsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement']");

	private By Company_DetailsElem = By.xpath("//A[@href='#CompanyDetails']");

	private By Contact_DetailsElem = By.xpath("//A[contains(text(),'Contact Details')]");

	private By ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNoElem = By.xpath("//label[normalize-space()= 'Internal Reference:']/../div/input");

	private By Address1Elem = By.xpath("//label[normalize-space()= 'Address:']/../div/input");

	private By Address2Elem = By.xpath("(.//label[normalize-space()= ''])[1]/../div/input");

	private By Address3Elem = By.xpath("(.//label[normalize-space()= ''])[1]/../div/input");

	private By Address4Elem = By.xpath("(.//label[normalize-space()= ''])[1]/../div/input");

	private By PostCodeElem = By.xpath("//label[normalize-space()= 'Postcode:']/../div/input");

	private By _SaveElem = By.xpath("//A[@id='btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=15256&TaxYearCode=8");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=15256&TaxYearCode=8");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=15256&TaxYearCode=8");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=15256&TaxYearCode=8";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=15256&TaxYearCode=8")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Information
     * @name Click Information
     */
	public void Click_Information()
	{
        
		WebElement elem = getWebElement(InformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Information", "Click_Information failed. Unable to locate object: " + InformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Information", "Click_Information failed. Unable to locate object: " + InformationElem.toString());

			Assert.fail("Unable to locate object: " + InformationElem.toString());
        }

		waitForVisible(elem, Address1Elem, 5000);
		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Information");

		TestModellerLogger.PassStep(m_Driver, "Click_Information");
	}
	
	
	/**
	 * Verify Information page
	 */
	public void verifyInfopage()
	{
		
		String getverify=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Active')]")).getText();
		System.out.println("URL="+getverify);
		String Expected="Active";
		assertEquals(getverify, Expected);
		
		
	}

     
	/**
 	 * Click Payroll Details
     * @name Click Payroll Details
     */
	public void Click_Payroll_Details()
	{
        
		WebElement elem = getWebElement(Payroll_DetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Details", "Click_Payroll_Details failed. Unable to locate object: " + Payroll_DetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Details", "Click_Payroll_Details failed. Unable to locate object: " + Payroll_DetailsElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_DetailsElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Details");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Details");
	}
	
	
	/**
	 * Verify PayrollDetail page
	 */
	public void verifyPayrollDetail()
	{
		WebElement elem=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Registration Date')]"));
	//	waitForVisible(elem, Address1Elem, 5000);
		String getverify=elem.getText();
		System.out.println("Text="+getverify);
		String Expected="Registration Date:";
		assertEquals(getverify, Expected);
		
		
	}

     
	/**
 	 * Click Opening Balances
     * @name Click Opening Balances
     */
	public void Click_Opening_Balances()
	{
        
		WebElement elem = getWebElement(Opening_BalancesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Opening_Balances", "Click_Opening_Balances failed. Unable to locate object: " + Opening_BalancesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Opening_Balances", "Click_Opening_Balances failed. Unable to locate object: " + Opening_BalancesElem.toString());

			Assert.fail("Unable to locate object: " + Opening_BalancesElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Opening_Balances");

		TestModellerLogger.PassStep(m_Driver, "Click_Opening_Balances");
	}
	
	
	/**
	 * Verify Opening Balance page
	 */
	public void verifyOpeningBal()
	{
		
		String getverify=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Opening Balances')]")).get(1).getText();
		System.out.println("URL="+getverify);
		String Expected="Opening Balances";
		assertEquals(getverify, Expected);
		
		
	}

     
	/**
 	 * Click General Terms
     * @name Click General Terms
     */
	public void Click_General_Terms()
	{
        
		WebElement elem = getWebElement(General_TermsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_General_Terms", "Click_General_Terms failed. Unable to locate object: " + General_TermsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_General_Terms", "Click_General_Terms failed. Unable to locate object: " + General_TermsElem.toString());

			Assert.fail("Unable to locate object: " + General_TermsElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_General_Terms");

		TestModellerLogger.PassStep(m_Driver, "Click_General_Terms");
	}
	
	
	/**
	 * Verify General Term page
	 */
	public void verifyGeneralTerm()
	{
		
		String getverify=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Bank Details')]")).get(1).getText();
		System.out.println("URL="+getverify);
		String Expected="Bank Details";
		assertEquals(getverify, Expected);
		
		
	}

     
	/**
 	 * Click Company Details
     * @name Click Company Details
     */
	public void Click_Company_Details()
	{
        
		WebElement elem = getWebElement(Company_DetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Company_Details", "Click_Company_Details failed. Unable to locate object: " + Company_DetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Company_Details", "Click_Company_Details failed. Unable to locate object: " + Company_DetailsElem.toString());

			Assert.fail("Unable to locate object: " + Company_DetailsElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Company_Details");

		TestModellerLogger.PassStep(m_Driver, "Click_Company_Details");
	}

     
	/**
 	 * Click Contact Details
     * @name Click Contact Details
     */
	public void Click_Contact_Details()
	{
        
		WebElement elem = getWebElement(Contact_DetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Contact_Details", "Click_Contact_Details failed. Unable to locate object: " + Contact_DetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Contact_Details", "Click_Contact_Details failed. Unable to locate object: " + Contact_DetailsElem.toString());

			Assert.fail("Unable to locate object: " + Contact_DetailsElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Contact_Details");

		TestModellerLogger.PassStep(m_Driver, "Click_Contact_Details");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollCompany$txtCustomerRefNo
     * @name Enter ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollCompany$txtCustomerRefNo
     */
 	public void Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo(String ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo", "Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo", "Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNoElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNoElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo " + ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo " + ctl00ctl00ParentContentcPHtbContainertpPayrollCompanytxtCustomerRefNo);
 	}

      
	/**
 	 * Enter Address1
     * @name Enter Address1
     */
 	public void Enter_Address1(String Address1)
 	{
 	    
 		WebElement elem = getWebElement(Address1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

 			Assert.fail("Unable to locate object: " + Address1Elem.toString());
         }

 		elem.sendKeys(Address1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address1 " + Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address1 " + Address1);
 	}

      
	/**
 	 * Enter Address2
     * @name Enter Address2
     */
 	public void Enter_Address2(String Address2)
 	{
 	    
 		WebElement elem = getWebElement(Address2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

 			Assert.fail("Unable to locate object: " + Address2Elem.toString());
         }

 		elem.sendKeys(Address2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address2 " + Address2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address2 " + Address2);
 	}

      
	/**
 	 * Enter Address3
     * @name Enter Address3
     */
 	public void Enter_Address3(String Address3)
 	{
 	    
 		WebElement elem = getWebElement(Address3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

 			Assert.fail("Unable to locate object: " + Address3Elem.toString());
         }

 		elem.sendKeys(Address3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address3 " + Address3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address3 " + Address3);
 	}

      
	/**
 	 * Enter Address4
     * @name Enter Address4
     */
 	public void Enter_Address4(String Address4)
 	{
 	    
 		WebElement elem = getWebElement(Address4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

 			Assert.fail("Unable to locate object: " + Address4Elem.toString());
         }

 		elem.sendKeys(Address4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address4 " + Address4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address4 " + Address4);
 	}

      
	/**
 	 * Enter PostCode
     * @name Enter PostCode
     */
 	public void Enter_PostCode(String PostCode)
 	{
 	    
 		WebElement elem = getWebElement(PostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + PostCodeElem.toString());
         }

 		elem.sendKeys(PostCode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode " + PostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode " + PostCode);
 	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save()
	{
        
		WebElement elem = getWebElement(_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

			Assert.fail("Unable to locate object: " + _SaveElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save");

		TestModellerLogger.PassStep(m_Driver, "Click__Save");
	}
}