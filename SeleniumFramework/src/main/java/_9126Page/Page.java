package _9126Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class Page extends BasePage {

	public Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	private By selectFinancialYearElam= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlTaxYears']");
	
	private By reportTypeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlReportType']");

	private By periodEndElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlPeriodEnd']");

	
	private By frequencyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlFrequency']");

	private By departmentElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlDepartment']");

	private By searchElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	
	/**
 	 * selectFinancialYear
	 * @throws Exception 
	 * @name selectFinancialYear
     */
    public void selectFinancialYear(String data) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(selectFinancialYearElam);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectFinancialYear", "selectFinancialYear failed. Unable to locate object: " + selectFinancialYearElam.toString());


 			Assert.fail("Unable to locate object: " + selectFinancialYearElam.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(data);
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "selectFinancialYear");
 		
 		ExtentReportManager.passStep(m_Driver, "selectFinancialYear " + selectFinancialYearElam);

 	}
    
    
    
    /**
 	 * selectReportType
	 * @throws Exception 
	 * @name selectReportType
     */
    public void selectReportType(String data) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(reportTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectReportType", "selectReportType failed. Unable to locate object: " + reportTypeElem.toString());


 			Assert.fail("Unable to locate object: " + reportTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(data);
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "selectReportType");
 		
 		ExtentReportManager.passStep(m_Driver, "selectReportType " + reportTypeElem);

 	}
    
    
    
    /**
 	 * selectPeriodEnd
	 * @throws Exception 
	 * @name selectPeriodEnd
     */
    public void selectPeriodEnd(String data) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(periodEndElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPeriodEnd", "selectPeriodEnd failed. Unable to locate object: " + periodEndElem.toString());


 			Assert.fail("Unable to locate object: " + periodEndElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(data);
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "selectPeriodEnd");
 		
 		ExtentReportManager.passStep(m_Driver, "selectPeriodEnd " + periodEndElem);

 	}
    
    
    

    /**
 	 * selectFrequency
	 * @throws Exception 
	 * @name selectFrequency
     */
    public void selectFrequency(String data) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(frequencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectFrequency", "selectFrequency failed. Unable to locate object: " + frequencyElem.toString());


 			Assert.fail("Unable to locate object: " + frequencyElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(data);
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "selectFrequency");
 		
 		ExtentReportManager.passStep(m_Driver, "selectFrequency " + frequencyElem);

 	}
    
    

    /**
 	 * selectDepartment
	 * @throws Exception 
	 * @name selectDepartment
     */
    public void selectDepartment(String data) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(departmentElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectDepartment", "selectDepartment failed. Unable to locate object: " + departmentElem.toString());


 			Assert.fail("Unable to locate object: " + departmentElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(data);
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "selectDepartment");
 		
 		ExtentReportManager.passStep(m_Driver, "selectDepartment " + departmentElem);

 	}
}
