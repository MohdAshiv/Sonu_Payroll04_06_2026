package _1566AdditionDeductionPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;

public class PayrollRun extends BasePage {

	public PayrollRun(WebDriver driver) {
		super(driver);
		
	}

	
	private By payrollDahboardElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']/span");
	
	private By cancelElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnCancel']");
	
	private By runPayroll2Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");
	
	private By closePopuElem= By.xpath("//*[@id='PopUpClose1']");
	
	private By selectPayrollSummaryElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ChkCompanySummary']");

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
	public void clickCancel()
	{
        
		WebElement elem = getWebElement(cancelElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCancel", "clickCancel failed. Unable to locate object: " + cancelElem.toString());
    	Assert.fail("Unable to locate object: " + cancelElem.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickCancel");
		 Reporter.log("Click Cancel");
	
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
	
	public void runPayroll() throws InterruptedException
	{
	    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']"));
	    
	    elem.click();
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
	
	
	
	
	public void UndoPayroll() throws Exception
	{
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']"));
		
		boolean condition = list.isEmpty();
		if(false==condition)
		{
			WebElement undoBtn= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']"));
			undoBtn.click();
		    m_Driver.switchTo().alert().accept();
		}
		System.out.println("Undo Btn not present");
		
	}
	
	public void runPayroll2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(runPayroll2Elem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "runPayroll2", "runPayroll2 failed. Unable to locate object: " + runPayroll2Elem.toString());
    	Assert.fail("Unable to locate object: " + runPayroll2Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		ExtentReportManager.passStep(m_Driver, "runPayroll2");
		Reporter.log("Click Run Payroll2");
	
	
}
	
	public void selectPayrollSummaryAndSend() throws Exception
	{
		  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			WebElement elem = getWebElement(selectPayrollSummaryElem);

			if (elem == null) {
	    	ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPayrollSummary", "selectPayrollSummary failed. Unable to locate object: " + selectPayrollSummaryElem.toString());
	    	Assert.fail("Unable to locate object: " + selectPayrollSummaryElem.toString());
	        }

			elem.click();
			Thread.sleep(1000);
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

			Thread.sleep(3000);
			
			ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
		
		 
		    Reporter.log("Select PayrollSummary And Send Btn");
		    m_Driver.switchTo().defaultContent();
	        Reporter.log("Select Payroll Summary checkbox and Click Send");
		
	}
	
	public void clickPayrollSummary() throws Exception
	{
		  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		  
		  Thread.sleep(3000); 
		 WebElement elem = m_Driver.findElement(By.linkText("Payroll Summary"));
		 Thread.sleep(1000);
		 elem.click();
		
		 
		Reporter.log("Click PayrollSummary");
		 m_Driver.switchTo().defaultContent();
	
		
	}
	
	public void closePopup() throws Exception
	{
        
		WebElement elem = getWebElement(closePopuElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "closePopup", "closePopup failed. Unable to locate object: " + closePopuElem.toString());
    	Assert.fail("Unable to locate object: " + closePopuElem.toString());
        }

		elem.click();
		 Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "closePopup");
		 Reporter.log("Click ClosePopup");
	
	}
	
	public void scrollClickPayrollDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(payrollDahboardElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "scrollClickPayrollDashboard", "scrollClickPayrollDashboard failed. Unable to locate object: " + payrollDahboardElem.toString());
    	Assert.fail("Unable to locate object: " + payrollDahboardElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "scrollClickPayrollDashboard");
		 Reporter.log("Click PayrollDashBoard");
}

}