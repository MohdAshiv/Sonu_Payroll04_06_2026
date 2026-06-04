package _2081_RecurringAddition_Deductions_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class PayrollPage extends BasePage {

	public PayrollPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	private By payrollDahboardElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']/span");

	public void Click_PayrollDashboard()
	{
        
		WebElement elem = getWebElement(payrollDahboardElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollDashboard", "Click_PayrollDashboard failed. Unable to locate object: " + payrollDahboardElem.toString());
    	Assert.fail("Unable to locate object: " + payrollDahboardElem.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "Click_PayrollDashboard");
		 Reporter.log("Click PayrollDashBoard");
	
	}
	
	public void Run_Payroll() throws InterruptedException
	{
	    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']"));
	    
	    elem.click();
	    Thread.sleep(1000);
	    
	    WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']"));
	     elem1.click();
	    Thread.sleep(1000);
	    Reporter.log("Click Run Payroll");
	}
	
	public void Undo_LastPayroll() throws InterruptedException
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']"));
		
		elem.click();
		m_Driver.switchTo().alert().accept();
	    Thread.sleep(1000);
	    
	    Reporter.log("Click UndoLast Payroll");
	}
	
	public void ScrollClick_PayrollDashboard()
	{
        
		WebElement elem = getWebElement(payrollDahboardElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollDashboard", "Click_PayrollDashboard failed. Unable to locate object: " + payrollDahboardElem.toString());
    	Assert.fail("Unable to locate object: " + payrollDahboardElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView();",elem);
		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "Click_PayrollDashboard");
		 Reporter.log("Click PayrollDashBoard");
	
	}
}
