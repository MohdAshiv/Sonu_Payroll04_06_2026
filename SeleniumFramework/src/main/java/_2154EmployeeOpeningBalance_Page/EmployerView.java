package _2154EmployeeOpeningBalance_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class EmployerView extends BasePage  {

	public EmployerView(WebDriver driver) {
		super(driver);
	
	}
	
	private By taxpayment= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP32']");
	private By _Reports_Elem = By.linkText("Reports");

    private By employerView= By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");
	
    private By employeeName= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
    private By employeeName1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[1]/a");

    private By paydateElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_ViewEmployeeSalaryDetails']");
	
    
    private By SelectP45FormElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_ddlForm']");
	public void Click_EmployerView() throws InterruptedException
	{
		WebElement elem = getWebElement(employerView);
		
		elem.click();
		Thread.sleep(2000);
		Reporter.log("click Employer View");
		utilities.ChangeWindow.tabswitch(m_Driver);
		Thread.sleep(2000);
		
	}

	/**
 	 * Click  Reports 
	 * @throws InterruptedException 
     * @name Click  Reports 
     */
	public void Click__Reports_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
		
		Reporter.log("Click Report Section");
	}
	
	
	
	/**
 	 * Select SelectP45Form
	 * @throws Exception 
	 * @name Select SelectP45Form
     */
    public void Select_SelectP45Form(String SelectP45Form) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(SelectP45FormElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectP45Form", "Select_SelectP45Form failed. Unable to locate object: " + SelectP45FormElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectP45Form", "Select_SelectP45Form failed. Unable to locate object: " + SelectP45FormElem.toString());

 			Assert.fail("Unable to locate object: " + SelectP45FormElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectP45Form);
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "SelectP45Form");
 		
 		m_Driver.switchTo().defaultContent();
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectP45Form " + SelectP45Form);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectP45Form " + SelectP45Form);
 	}

	
	public void clickEmployee() throws InterruptedException
	{
        
		WebElement elem = getWebElement(employeeName);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployee", "clickEmployee failed. Unable to locate object: " + employeeName.toString());


			Assert.fail("Unable to locate object: " + employeeName.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "clickEmployee");

		
		Reporter.log("Click EmployeeName");
	}
	
	
	public void clickEmployee1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(employeeName1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployee1", "clickEmployee1 failed. Unable to locate object: " + employeeName1.toString());


			Assert.fail("Unable to locate object: " + employeeName1.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "clickEmployee1");

		
		Reporter.log("Click clickEmployee1");
	}

	public void clickTaxPayment() throws InterruptedException
	{
        
		WebElement elem = getWebElement(taxpayment);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTaxPayment", "clickTaxPayment failed. Unable to locate object: " + taxpayment.toString());


			Assert.fail("Unable to locate object: " + employeeName.toString());
        }

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickTaxPayment");

		
		Reporter.log("Click TaxPayment");
	}
	
	
	
	public void clickPayDate() throws InterruptedException
	{
        
		WebElement elem = getWebElement(paydateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayDate", "clickPayDate failed. Unable to locate object: " + paydateElem.toString());


			Assert.fail("Unable to locate object: " + paydateElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickPayDate");

		
		Reporter.log("Click PayDate");
	}
	
}
