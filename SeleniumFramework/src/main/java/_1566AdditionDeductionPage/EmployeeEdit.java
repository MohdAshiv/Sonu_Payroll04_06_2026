package _1566AdditionDeductionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.WaitUtility;
import utilities.reports.ExtentReportManager;

public class EmployeeEdit extends BasePage {
	WaitUtility wt=new WaitUtility();
	public EmployeeEdit(WebDriver driver) {
		super(driver);
	
	}

	
	private By clickEmployeeElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
	private By editEmployeeElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");
	
	private By payDetailsElem= By.xpath("//*[@id='lipayd']/a");
	
	private By basicSalaryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtBasicSalary']");
	
	private By saveBtnElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	private By MandatoryPayrollInfo=By.xpath("//*[@id='limpi']/a");
	
	private By taxCodeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtTaxCode']");
	
	
	
	public void clickEmployeeName()
	{
		WebElement elem = getWebElement(clickEmployeeElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Employee for Edit");
		
	}
	
	public void editEmployeeDetails()
	{
		WebElement elem = getWebElement(editEmployeeElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Edit Btn");
		
	}
	
	public void clickPaydetails()
	{
		WebElement elem = getWebElement(payDetailsElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click pay details");
		
	}
	
	public void enterBasicSalary(String BasicSalary)
	{
		WebElement elem = getWebElement(basicSalaryElem);
		elem.clear();
		m_Driver.switchTo().alert().accept();
		elem.sendKeys(BasicSalary);
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	public void enterBasicSalary2(String BasicSalary) throws Exception
	{
		WebElement elem = getWebElement(basicSalaryElem);
		elem.clear();
		
		elem.sendKeys(BasicSalary);
		m_Driver.findElement(By.xpath("//*[@id='PayDetails']/div[6]/label")).click();
		Thread.sleep(1000);
		m_Driver.switchTo().alert().accept();
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	public void enterBasicSalary1(String BasicSalary)
	{
		WebElement elem = getWebElement(basicSalaryElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		
		elem.sendKeys(BasicSalary);
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	 public void clickSaveBtn() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(saveBtnElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveBtnElem.toString());

				Assert.fail("Unable to locate object: " + saveBtnElem.toString());
	        }
			jsExec.executeScript("arguments[0].click();",elem);
		
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "clickSaveBtn");
			
			 Reporter.log("Click SaveBtn");
	}
	
	 
	 public void enterTaxCode(String Value)
	 {
	    

	    	WebElement elem = getWebElement(taxCodeElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterTaxCode", "enterTaxCode failed. Unable to locate object: " + taxCodeElem.toString());

				Assert.fail("Unable to locate object: " + taxCodeElem.toString());
	        }
            
		    elem.clear();
			elem.sendKeys(Value);
			
			ExtentReportManager.passStep(m_Driver, "enterTaxCode");
		
			   Reporter.log("Enter taxCode");
	    }
	 
	 public void clickMandotoryPayroll() throws Exception
	 {
	    

	    	WebElement elem = getWebElement(MandatoryPayrollInfo);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMandotoryPayroll", "clickMandotoryPayroll failed. Unable to locate object: " + MandatoryPayrollInfo.toString());

				Assert.fail("Unable to locate object: " + MandatoryPayrollInfo.toString());
	        }
            
		    elem.click();
		    Thread.sleep(2000);
		 
			ExtentReportManager.passStep(m_Driver, "clickMandotoryPayroll");
		
			  Reporter.log("click Mandotorypayroll");
	    }
	 
	 
	 
}
