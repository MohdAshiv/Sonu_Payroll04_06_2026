package _5671Departments_Page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;

public class DepartmentsPage extends BasePage {

	public DepartmentsPage(WebDriver driver) {
		super(driver);
	}

	
	
	private By employeeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']");
	
	private By selectDepartmentElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlDepartment']");
	

	private By selectFinancialYearElam= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlTaxYears']");
	
	private By reportTypeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlReportType']");

	private By periodEndElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlPeriodEnd']");

	
	private By frequencyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlFrequency']");

	private By departmentElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlDepartment']");

	private By searchElem= By.xpath("//*[@id='btnSearchNew']");

	private By toDateElem= By.xpath("//*[@id='txtCustomTo']");

	private By exportTOpdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");
	private By exportTOcsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");

	
	private By fromDateElem= By.xpath("//*[@id='txtCustomFrom']");
	
	private By fromDateIcn= By.xpath("//*[@id='imgFrom']");
	private By toDateIcn= By.xpath("//*[@id='imgTo']");

	private By chevronUpDownElem= By.xpath("//*[@id='lnkExpand']/i");
	private By checkBoxAttachmentElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ChkDeptReport']");

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
    public void selectDepartmentReport(String data) throws Exception
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
	
	public void selectDefaultDepartment(String data) throws Exception
	{
        
		WebElement elem = getWebElement(selectDepartmentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AllowancesSchemes", "Click_AllowancesSchemes failed. Unable to locate object: " + selectDepartmentElem.toString());


			Assert.fail("Unable to locate object: " + selectDepartmentElem.toString());
        }

		System.out.println("xyz");
		Select sel= new Select(elem);
		
		sel.selectByValue("0");
		
		Reporter.log("Click_AllowancesSchemes");

          	
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click_AllowancesSchemes");

	}
	
	
	public void selectDepartment(String data) throws Exception
	{
        
		WebElement elem = getWebElement(selectDepartmentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AllowancesSchemes", "Click_AllowancesSchemes failed. Unable to locate object: " + selectDepartmentElem.toString());


			Assert.fail("Unable to locate object: " + selectDepartmentElem.toString());
        }

	
		Select sel= new Select(elem);
		
		sel.selectByVisibleText(data);
		
		Reporter.log("Click_AllowancesSchemes");

          	
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click_AllowancesSchemes");

	}
	
	
	
	public void selectDepartmentWithLogic(String data) throws Exception {
		
		
		 // Locate the dropdown
        WebElement dropdownElement = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlDepartment']"));
        Select dropdown = new Select(dropdownElement);

        // Get selected option text
        String selected = dropdown.getFirstSelectedOption().getText();

        // If selected value is "Choose", then select "xyz"
        if ("Choose your department...".equalsIgnoreCase(selected.trim())) {
            dropdown.selectByVisibleText(data); // select the actual option you want
            System.out.println("Default 'Choose your department...' detected. '"+data+"' selected.");
    		Thread.sleep(2000);
  
        } 
        
        else {
            System.out.println("Already selected: " + selected + ". Continuing...");
        }
        
        Reporter.log("selectDepartmentWithLogic");
        }
	

	
	
	public void selectEmployee(String data) throws Exception
	{
        
		WebElement elem = getWebElement(employeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectEmployee", "selectEmployee failed. Unable to locate object: " + employeeElem.toString());


			Assert.fail("Unable to locate object: " + employeeElem.toString());
        }

		System.out.println("selectEmployee" + data);
		Select sel= new Select(elem);
		
		sel.selectByVisibleText(data);
		
		Reporter.log("selectEmployee");

          	
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "selectEmployee");

	}
	
	public void searchBtn() throws Exception
	{
        
		WebElement elem = getWebElement(searchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "searchBtn", "searchBtn failed. Unable to locate object: " + searchElem.toString());


			Assert.fail("Unable to locate object: " + searchElem.toString());
        }
        elem.click();
	
		Reporter.log("searchBtn");

          	
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "searchBtn");

	}

	
	public void enterFromDate(String data) throws Exception
	{
        
		WebElement elem = getWebElement(fromDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFromDate", "enterFromDate failed. Unable to locate object: " + fromDateElem.toString());


			Assert.fail("Unable to locate object: " + fromDateElem.toString());
        }
        elem.sendKeys(data);
	
		Reporter.log("enterFromDate");

          	
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterFromDate");

	}
	
	

	public void enterFromDateIcn() throws Exception
	{
        
		WebElement elem = getWebElement(fromDateIcn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFromDateIcn", "enterFromDateIcn failed. Unable to locate object: " + fromDateIcn.toString());


			Assert.fail("Unable to locate object: " + fromDateIcn.toString());
        }
        elem.click();
	
		Reporter.log("enterFromDateIcn");

          	
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterFromDateIcn");

	}
	
	public void entertoDateIcn() throws Exception
	{
        
		WebElement elem = getWebElement(toDateIcn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "entertoDateIcn", "entertoDateIcn failed. Unable to locate object: " + toDateIcn.toString());


			Assert.fail("Unable to locate object: " + toDateIcn.toString());
        }
        elem.click();
	
		Reporter.log("entertoDateIcn");

          	
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "entertoDateIcn");

	}
	


  	public void enterToDate(String data) throws Exception
       {
		WebElement elem = getWebElement(toDateElem);

		if (elem == null) {
			
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "enterToDate", "enterToDate failed. Unable to locate object: " + toDateElem.toString());

		Assert.fail("Unable to locate object: " + toDateElem.toString());
        }
        elem.sendKeys(data);

		Reporter.log("enterToDate");
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterToDate");
		
	}

  	
  	

  	public void clickExportToPdf() throws Exception
       {
		WebElement elem = getWebElement(exportTOpdfElem);

		if (elem == null) {
			
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExportToPdf", "clickExportToPdf failed. Unable to locate object: " + exportTOpdfElem.toString());

		Assert.fail("Unable to locate object: " + exportTOpdfElem.toString());
        }
        elem.click();

		Reporter.log("clickExportToPdf");
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickExportToPdf");
		
	}

  	

  	public void clickExportToCsv() throws Exception
       {
		WebElement elem = getWebElement(exportTOcsvElem);

		if (elem == null) {
			
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExportToCsv", "clickExportToCsv failed. Unable to locate object: " + exportTOcsvElem.toString());

		Assert.fail("Unable to locate object: " + exportTOcsvElem.toString());
        }
        elem.click();

		Reporter.log("clickExportToCsv");
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickExportToCsv");
		
	}

  	public void clickChevronIcn() throws InterruptedException
  	{
  		WebElement elem = getWebElement(chevronUpDownElem);

		if (elem == null) {
			
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickChevronIcn", "clickChevronIcn failed. Unable to locate object: " + chevronUpDownElem.toString());

		Assert.fail("Unable to locate object: " + chevronUpDownElem.toString());
        }
        elem.click();

		Reporter.log("clickChevronIcn");
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickChevronIcn");
		
  
  		
  	}
  	
  	
	public void untickAttachmentCheckBox() throws InterruptedException
  	{
  		WebElement elem = getWebElement(checkBoxAttachmentElem);

		if (elem == null) {
			
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "untickAttachmentCheckBox", "untickAttachmentCheckBox failed. Unable to locate object: " + checkBoxAttachmentElem.toString());

		Assert.fail("Unable to locate object: " + checkBoxAttachmentElem.toString());
        }
        elem.click();

		Reporter.log("untickAttachmentCheckBox");
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "untickAttachmentCheckBox");
		
  
  		
  	}
  	
  	public void switchInsideFrame()
  	{
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			
  	}
  	
  	
	public void OutInsideFrame()
  	{
		m_Driver.switchTo().defaultContent();
		
  	}
  	
	
}
