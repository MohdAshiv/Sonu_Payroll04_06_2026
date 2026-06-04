package _1760ER_Allow;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/36360816-b763-4076-bb63-0679367e5510
@TestModellerModule(guid = "36360816-b763-4076-bb63-0679367e5510")
public class OpeningBalanceEntry extends BasePage
{
	
	static float openingBal;
	
	public OpeningBalanceEntry (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoOpeningBalancesElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefBroughtForward']");

	private By EnterTaxCodeElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtTaxCode']");

	private By EnterGrosspayElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdGross']");

	private By EnterEmployeeNIElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdEmployeeNI']");

	private By EnterNetPayElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdNetPay']");

	private By EnterELtoPTElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdELtoPT']");

	private By EnterEmployeePensionElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdEmployeePension']");

	private By EmployerPensionElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdEmployerPension']");

	private By PayrollGivingElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtPayrollGiving']");

	private By StatutorySickPayElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtStatutorySickPay']");

	private By StatutoryMaternityPayElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtStatutoryMaternityPay']");

	private By StatutoryPaternityPayElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtStatutoryPaternityPay']");

	private By NICategoryCodeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$ddlNICategoryCode']");

	private By TaxDeductedElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdTaxDeducted']");

	private By EmployerNIElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdEmployerNI']");

	private By LELElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdLEL']");

	private By PTtoUAPElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdPTtoUAP']");

	private By StudentLoan1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdStudentLoan']");

	private By StudentLoan2Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdStudentLoan2']");

	private By StudentLoan4Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdStudentLoan4']");

	private By PostgradLoanElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdPostgradLoan']");

	private By SharedParentingPayElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtSharedParentingPay']");

	private By StatutoryAdoptionPayElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtStatutoryAdoptionPay']");

	private By PayrolledBIKClass1aElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtPayrolledBIKClass1a']");

	private By PayrolledBIKNotClass1aElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtPayrolledBIKNotClass1a']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By clickSaveElem1 = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643")) {
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

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoOpeningBalances");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoOpeningBalances");
	}

      
	/**
 	 * Enter EnterTaxCode
     * @name Enter EnterTaxCode
     */
 	public void Enter_EnterTaxCode(String EnterTaxCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterTaxCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterTaxCode", "Enter_EnterTaxCode failed. Unable to locate object: " + EnterTaxCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterTaxCode", "Enter_EnterTaxCode failed. Unable to locate object: " + EnterTaxCodeElem.toString());

 			Assert.fail("Unable to locate object: " + EnterTaxCodeElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EnterTaxCode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterTaxCode " + EnterTaxCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterTaxCode " + EnterTaxCode);
 	}

      
	/**
 	 * Enter EnterGrosspay
     * @name Enter EnterGrosspay
     */
 	public void Enter_EnterGrosspay(String EnterGrosspay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterGrosspayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterGrosspay", "Enter_EnterGrosspay failed. Unable to locate object: " + EnterGrosspayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterGrosspay", "Enter_EnterGrosspay failed. Unable to locate object: " + EnterGrosspayElem.toString());

 			Assert.fail("Unable to locate object: " + EnterGrosspayElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EnterGrosspay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterGrosspay " + EnterGrosspay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterGrosspay " + EnterGrosspay);
 	}

      
	/**
 	 * Enter EnterEmployeeNI
     * @name Enter EnterEmployeeNI
     */
 	public void Enter_EnterEmployeeNI(String EnterEmployeeNI)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterEmployeeNIElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterEmployeeNI", "Enter_EnterEmployeeNI failed. Unable to locate object: " + EnterEmployeeNIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterEmployeeNI", "Enter_EnterEmployeeNI failed. Unable to locate object: " + EnterEmployeeNIElem.toString());

 			Assert.fail("Unable to locate object: " + EnterEmployeeNIElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EnterEmployeeNI);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterEmployeeNI " + EnterEmployeeNI);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterEmployeeNI " + EnterEmployeeNI);
 	}

      
	/**
 	 * Enter EnterNetPay
     * @name Enter EnterNetPay
     */
 	public void Enter_EnterNetPay(String EnterNetPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterNetPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNetPay", "Enter_EnterNetPay failed. Unable to locate object: " + EnterNetPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNetPay", "Enter_EnterNetPay failed. Unable to locate object: " + EnterNetPayElem.toString());

 			Assert.fail("Unable to locate object: " + EnterNetPayElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EnterNetPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNetPay " + EnterNetPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNetPay " + EnterNetPay);
 	}

      
	/**
 	 * Enter EnterELtoPT
     * @name Enter EnterELtoPT
     */
 	public void Enter_EnterELtoPT(String EnterELtoPT)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterELtoPTElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterELtoPT", "Enter_EnterELtoPT failed. Unable to locate object: " + EnterELtoPTElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterELtoPT", "Enter_EnterELtoPT failed. Unable to locate object: " + EnterELtoPTElem.toString());

 			Assert.fail("Unable to locate object: " + EnterELtoPTElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EnterELtoPT);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterELtoPT " + EnterELtoPT);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterELtoPT " + EnterELtoPT);
 	}

      
	/**
 	 * Enter EnterEmployeePension
     * @name Enter EnterEmployeePension
     */
 	public void Enter_EnterEmployeePension(String EnterEmployeePension)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterEmployeePensionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterEmployeePension", "Enter_EnterEmployeePension failed. Unable to locate object: " + EnterEmployeePensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterEmployeePension", "Enter_EnterEmployeePension failed. Unable to locate object: " + EnterEmployeePensionElem.toString());

 			Assert.fail("Unable to locate object: " + EnterEmployeePensionElem.toString());
         }

 		elem.sendKeys(EnterEmployeePension);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterEmployeePension " + EnterEmployeePension);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterEmployeePension " + EnterEmployeePension);
 	}

      
	/**
 	 * Enter EmployerPension
     * @name Enter EmployerPension
     */
 	public void Enter_EmployerPension(String EmployerPension)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EmployerPensionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmployerPension", "Enter_EmployerPension failed. Unable to locate object: " + EmployerPensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmployerPension", "Enter_EmployerPension failed. Unable to locate object: " + EmployerPensionElem.toString());

 			Assert.fail("Unable to locate object: " + EmployerPensionElem.toString());
         }

 		elem.sendKeys(EmployerPension);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmployerPension " + EmployerPension);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmployerPension " + EmployerPension);
 	}

      
	/**
 	 * Enter PayrollGiving
     * @name Enter PayrollGiving
     */
 	public void Enter_PayrollGiving(String PayrollGiving)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PayrollGivingElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PayrollGiving", "Enter_PayrollGiving failed. Unable to locate object: " + PayrollGivingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PayrollGiving", "Enter_PayrollGiving failed. Unable to locate object: " + PayrollGivingElem.toString());

 			Assert.fail("Unable to locate object: " + PayrollGivingElem.toString());
         }

 		elem.sendKeys(PayrollGiving);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PayrollGiving " + PayrollGiving);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PayrollGiving " + PayrollGiving);
 	}

      
	/**
 	 * Enter StatutorySickPay
     * @name Enter StatutorySickPay
     */
 	public void Enter_StatutorySickPay(String StatutorySickPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(StatutorySickPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StatutorySickPay", "Enter_StatutorySickPay failed. Unable to locate object: " + StatutorySickPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StatutorySickPay", "Enter_StatutorySickPay failed. Unable to locate object: " + StatutorySickPayElem.toString());

 			Assert.fail("Unable to locate object: " + StatutorySickPayElem.toString());
         }

 		elem.sendKeys(StatutorySickPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StatutorySickPay " + StatutorySickPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StatutorySickPay " + StatutorySickPay);
 	}

      
	/**
 	 * Enter StatutoryMaternityPay
     * @name Enter StatutoryMaternityPay
     */
 	public void Enter_StatutoryMaternityPay(String StatutoryMaternityPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(StatutoryMaternityPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StatutoryMaternityPay", "Enter_StatutoryMaternityPay failed. Unable to locate object: " + StatutoryMaternityPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StatutoryMaternityPay", "Enter_StatutoryMaternityPay failed. Unable to locate object: " + StatutoryMaternityPayElem.toString());

 			Assert.fail("Unable to locate object: " + StatutoryMaternityPayElem.toString());
         }

 		elem.sendKeys(StatutoryMaternityPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StatutoryMaternityPay " + StatutoryMaternityPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StatutoryMaternityPay " + StatutoryMaternityPay);
 	}

      
	/**
 	 * Enter StatutoryPaternityPay
     * @name Enter StatutoryPaternityPay
     */
 	public void Enter_StatutoryPaternityPay(String StatutoryPaternityPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(StatutoryPaternityPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StatutoryPaternityPay", "Enter_StatutoryPaternityPay failed. Unable to locate object: " + StatutoryPaternityPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StatutoryPaternityPay", "Enter_StatutoryPaternityPay failed. Unable to locate object: " + StatutoryPaternityPayElem.toString());

 			Assert.fail("Unable to locate object: " + StatutoryPaternityPayElem.toString());
         }

 		elem.sendKeys(StatutoryPaternityPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StatutoryPaternityPay " + StatutoryPaternityPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StatutoryPaternityPay " + StatutoryPaternityPay);
 	}

    
	/**
 	 * Select NICategoryCode
     * @name Select NICategoryCode
     */
    public void Select_NICategoryCode(String NICategoryCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(NICategoryCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_NICategoryCode", "Select_NICategoryCode failed. Unable to locate object: " + NICategoryCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_NICategoryCode", "Select_NICategoryCode failed. Unable to locate object: " + NICategoryCodeElem.toString());

 			Assert.fail("Unable to locate object: " + NICategoryCodeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		
 		dropdown.selectByVisibleText(NICategoryCode);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_NICategoryCode " + NICategoryCode);

 		TestModellerLogger.PassStep(m_Driver, "Select_NICategoryCode " + NICategoryCode);
 	}

      
	/**
 	 * Enter TaxDeducted
     * @name Enter TaxDeducted
     */
 	public void Enter_TaxDeducted(String TaxDeducted)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(TaxDeductedElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_TaxDeducted", "Enter_TaxDeducted failed. Unable to locate object: " + TaxDeductedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_TaxDeducted", "Enter_TaxDeducted failed. Unable to locate object: " + TaxDeductedElem.toString());

 			Assert.fail("Unable to locate object: " + TaxDeductedElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(TaxDeducted);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_TaxDeducted " + TaxDeducted);

  		TestModellerLogger.PassStep(m_Driver, "Enter_TaxDeducted " + TaxDeducted);
 	}

      
	/**
 	 * Enter EmployerNI
     * @name Enter EmployerNI
     */
 	public void Enter_EmployerNI()
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EmployerNIElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmployerNI", "Enter_EmployerNI failed. Unable to locate object: " + EmployerNIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmployerNI", "Enter_EmployerNI failed. Unable to locate object: " + EmployerNIElem.toString());

 			Assert.fail("Unable to locate object: " + EmployerNIElem.toString());
         }

 		
 	//	elem.click();
 		 String str=elem.getAttribute("value");
 		
 		
 		openingBal=Float.parseFloat(str);
 		System.out.println("openingBal="+openingBal);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmployerNI " + EmployerNIElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmployerNI " + EmployerNIElem);
 	}
 	
 	
 	
 	/**
 	 * Return Opening Bal
 	 * 
 	 * 
 	 */
 	public float returnOpeningBal()
 	{
 		
 		
 		System.out.println("opening Bal="+openingBal);
		return openingBal;
 		
 	}

      
	/**
 	 * Enter LEL
     * @name Enter LEL
     */
 	public void Enter_LEL(String LEL)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(LELElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LEL", "Enter_LEL failed. Unable to locate object: " + LELElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LEL", "Enter_LEL failed. Unable to locate object: " + LELElem.toString());

 			Assert.fail("Unable to locate object: " + LELElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(LEL);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LEL " + LEL);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LEL " + LEL);
 	}

      
	/**
 	 * Enter PTtoUAP
     * @name Enter PTtoUAP
     */
 	public void Enter_PTtoUAP(String PTtoUAP)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PTtoUAPElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PTtoUAP", "Enter_PTtoUAP failed. Unable to locate object: " + PTtoUAPElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PTtoUAP", "Enter_PTtoUAP failed. Unable to locate object: " + PTtoUAPElem.toString());

 			Assert.fail("Unable to locate object: " + PTtoUAPElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(PTtoUAP);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PTtoUAP " + PTtoUAP);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PTtoUAP " + PTtoUAP);
 	}

      
	/**
 	 * Enter StudentLoan1
     * @name Enter StudentLoan1
     */
 	public void Enter_StudentLoan1(String StudentLoan1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(StudentLoan1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StudentLoan1", "Enter_StudentLoan1 failed. Unable to locate object: " + StudentLoan1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StudentLoan1", "Enter_StudentLoan1 failed. Unable to locate object: " + StudentLoan1Elem.toString());

 			Assert.fail("Unable to locate object: " + StudentLoan1Elem.toString());
         }

 		elem.clear();
 		elem.sendKeys(StudentLoan1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StudentLoan1 " + StudentLoan1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StudentLoan1 " + StudentLoan1);
 	}

      
	/**
 	 * Enter StudentLoan2
     * @name Enter StudentLoan2
     */
 	public void Enter_StudentLoan2(String StudentLoan2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(StudentLoan2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StudentLoan2", "Enter_StudentLoan2 failed. Unable to locate object: " + StudentLoan2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StudentLoan2", "Enter_StudentLoan2 failed. Unable to locate object: " + StudentLoan2Elem.toString());

 			Assert.fail("Unable to locate object: " + StudentLoan2Elem.toString());
         }

 		elem.clear();
 		elem.sendKeys(StudentLoan2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StudentLoan2 " + StudentLoan2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StudentLoan2 " + StudentLoan2);
 	}

      
	/**
 	 * Enter StudentLoan4
     * @name Enter StudentLoan4
     */
 	public void Enter_StudentLoan4(String StudentLoan4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(StudentLoan4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StudentLoan4", "Enter_StudentLoan4 failed. Unable to locate object: " + StudentLoan4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StudentLoan4", "Enter_StudentLoan4 failed. Unable to locate object: " + StudentLoan4Elem.toString());

 			Assert.fail("Unable to locate object: " + StudentLoan4Elem.toString());
         }

 		elem.clear();
 		elem.sendKeys(StudentLoan4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StudentLoan4 " + StudentLoan4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StudentLoan4 " + StudentLoan4);
 	}

      
	/**
 	 * Enter PostgradLoan
     * @name Enter PostgradLoan
     */
 	public void Enter_PostgradLoan(String PostgradLoan)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PostgradLoanElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostgradLoan", "Enter_PostgradLoan failed. Unable to locate object: " + PostgradLoanElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostgradLoan", "Enter_PostgradLoan failed. Unable to locate object: " + PostgradLoanElem.toString());

 			Assert.fail("Unable to locate object: " + PostgradLoanElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(PostgradLoan);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostgradLoan " + PostgradLoan);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostgradLoan " + PostgradLoan);
 	}

      
	/**
 	 * Enter SharedParentingPay
     * @name Enter SharedParentingPay
     */
 	public void Enter_SharedParentingPay(String SharedParentingPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(SharedParentingPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SharedParentingPay", "Enter_SharedParentingPay failed. Unable to locate object: " + SharedParentingPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SharedParentingPay", "Enter_SharedParentingPay failed. Unable to locate object: " + SharedParentingPayElem.toString());

 			Assert.fail("Unable to locate object: " + SharedParentingPayElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(SharedParentingPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SharedParentingPay " + SharedParentingPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SharedParentingPay " + SharedParentingPay);
 	}

      
	/**
 	 * Enter StatutoryAdoptionPay
     * @name Enter StatutoryAdoptionPay
     */
 	public void Enter_StatutoryAdoptionPay(String StatutoryAdoptionPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(StatutoryAdoptionPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_StatutoryAdoptionPay", "Enter_StatutoryAdoptionPay failed. Unable to locate object: " + StatutoryAdoptionPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_StatutoryAdoptionPay", "Enter_StatutoryAdoptionPay failed. Unable to locate object: " + StatutoryAdoptionPayElem.toString());

 			Assert.fail("Unable to locate object: " + StatutoryAdoptionPayElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(StatutoryAdoptionPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_StatutoryAdoptionPay " + StatutoryAdoptionPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_StatutoryAdoptionPay " + StatutoryAdoptionPay);
 	}

      
	/**
 	 * Enter PayrolledBIKClass1a
     * @name Enter PayrolledBIKClass1a
     */
 	public void Enter_PayrolledBIKClass1a(String PayrolledBIKClass1a)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PayrolledBIKClass1aElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PayrolledBIKClass1a", "Enter_PayrolledBIKClass1a failed. Unable to locate object: " + PayrolledBIKClass1aElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PayrolledBIKClass1a", "Enter_PayrolledBIKClass1a failed. Unable to locate object: " + PayrolledBIKClass1aElem.toString());

 			Assert.fail("Unable to locate object: " + PayrolledBIKClass1aElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(PayrolledBIKClass1a);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PayrolledBIKClass1a " + PayrolledBIKClass1a);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PayrolledBIKClass1a " + PayrolledBIKClass1a);
 	}

      
	/**
 	 * Enter PayrolledBIKNotClass1a
     * @name Enter PayrolledBIKNotClass1a
     */
 	public void Enter_PayrolledBIKNotClass1a(String PayrolledBIKNotClass1a)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PayrolledBIKNotClass1aElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PayrolledBIKNotClass1a", "Enter_PayrolledBIKNotClass1a failed. Unable to locate object: " + PayrolledBIKNotClass1aElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PayrolledBIKNotClass1a", "Enter_PayrolledBIKNotClass1a failed. Unable to locate object: " + PayrolledBIKNotClass1aElem.toString());

 			Assert.fail("Unable to locate object: " + PayrolledBIKNotClass1aElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(PayrolledBIKNotClass1a);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PayrolledBIKNotClass1a " + PayrolledBIKNotClass1a);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PayrolledBIKNotClass1a " + PayrolledBIKNotClass1a);
 	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		//elem.click();
        jsExec.executeScript("arguments[0].click();", elem);
		m_Driver.switchTo().defaultContent();
//		System.out.println("backtowindow");
//		String str=m_Driver.getTitle();
//		System.out.println(str);
		Thread.sleep(3000);
		

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
	
	
	
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void clickCancel() throws InterruptedException 
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']")).click();



		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		


	}
}