package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.reports.ExtentReportManager;

public class P11DPage extends BasePage{
	
	
	
	
	public P11DPage(WebDriver driver) {
		super(driver);
		
			}
	
	
	private By ExpensesAndBenefitsElem= By.xpath("//*[text()='Expenses and Benefits']");
	
	private By makeAndModelElem= By.xpath("//*[@id='txtaddmakemodel']");
	
	private By registrationDateElem= By.xpath("//*[@id='ddlRegDate']");
	
	private By availableToDateElem= By.xpath("//*[@id='txtavailabletodate']");

	private By fuelTypeElem= By.xpath("//*[@id='ddlfuel']");

	private By listPriceElem= By.xpath("//*[@id='txtlistprice']");
	
	private By addCarDetailsElem= By.xpath("//*[@id='btnaddcar']");

	private By taxYearElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpExpensesandBenefits_EmployeeExpensesBenefitsUC_ddl_TaxYear']");

	
    
    
    
    
    public void clickExpensesAndBenefits() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(ExpensesAndBenefitsElem);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + ExpensesAndBenefitsElem.toString());

     		
 			Assert.fail("Unable to locate object: " + ExpensesAndBenefitsElem.toString());
         }


       elem.click();       
 		System.out.println("xyz");  
 		Thread.sleep(8000);

 		ExtentReportManager.passStep(m_Driver, "clickExpensesAndBenefits");
 		Reporter.log("click ExpensesAndBenefits");
 		
 	}
    
    
    
    
    
    public void enterMakeAndModel( ) throws Exception
	{
        
		WebElement elem = getWebElement(makeAndModelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterMakeAndModel", "enterMakeAndModel failed. Unable to locate object: " + makeAndModelElem.toString());


			Assert.fail("Unable to locate object: " + makeAndModelElem.toString());
        }

		
		String MakeAndModel = RandomStringUtils.randomAlphabetic(6);

		elem.sendKeys(MakeAndModel);
//		elem.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "enterMakeAndModel");

		
  		Reporter.log("enterMakeAndModel");

	}
    
    
    
    
    
    
    
    
    public void selectRegistrationDate(String registrationDate) throws Exception
  	{
          
		
  		WebElement elem = getWebElement(registrationDateElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectRegistrationDate", "selectRegistrationDate failed. Unable to locate object: " + registrationDateElem.toString());


  			Assert.fail("Unable to locate object: " + registrationDateElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(registrationDate);
			
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectRegistrationDate");

  		
    	Reporter.log("selectRegistrationDate");

  	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void enterAvailableToDate(String AvailableToDate ) throws Exception
   	{
           
   		WebElement elem = getWebElement(availableToDateElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAvailableToDate", "enterAvailableToDate failed. Unable to locate object: " + availableToDateElem.toString());


   			Assert.fail("Unable to locate object: " + availableToDateElem.toString());
           }

			
			elem.sendKeys(AvailableToDate);
			Thread.sleep(2000);
			elem.sendKeys(Keys.TAB);
			
			ExtentReportManager.passStep(m_Driver, "enterAvailableToDate");

   		
     		Reporter.log("enterAvailableToDate");

   	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void selectFuelType(String fuelType) throws Exception
  	{
          
		
  		WebElement elem = getWebElement(fuelTypeElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectFuelType", "selectFuelType failed. Unable to locate object: " + fuelTypeElem.toString());


  			Assert.fail("Unable to locate object: " + fuelTypeElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(fuelType);
			
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectFuelType");

  		
    	Reporter.log("selectFuelType");

  	}
    
    
    
    
    
    
    
    
    
    
    public void enterListPrice() throws Exception
   	{
           
   		WebElement elem = getWebElement(listPriceElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterListPrice", "enterListPrice failed. Unable to locate object: " + listPriceElem.toString());


   			Assert.fail("Unable to locate object: " + listPriceElem.toString());
           }

			String ListPrice = RandomStringUtils.randomNumeric(6);

			elem.sendKeys(ListPrice);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterListPrice");

   		
     		Reporter.log("enterListPrice");

   	}
      
      
    
    
    
    
    
    
    public void clickAddCarDetails() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(addCarDetailsElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddCarDetails", "clickAddCarDetails failed. Unable to locate object: " + addCarDetailsElem.toString());

      		
  			Assert.fail("Unable to locate object: " + addCarDetailsElem.toString());
          }


  		jsExec.executeScript("arguments[0].click();", elem);
            	
  		Thread.sleep(4000);

  		ExtentReportManager.passStep(m_Driver, "clickAddCarDetails");
  		
  		Reporter.log("click AddCarDetails");
  		
  	}
     
    
    

    public void selectTaxYear(String data) throws Exception
  	{
          
		
  		WebElement elem = getWebElement(taxYearElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + taxYearElem.toString());


  			Assert.fail("Unable to locate object: " + taxYearElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(data);
			
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectTaxYear");

  		
    	Reporter.log("selectTaxYear");

  	}
    
    
    
 	
    
    

}
