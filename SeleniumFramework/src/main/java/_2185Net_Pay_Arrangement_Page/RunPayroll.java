package _2185Net_Pay_Arrangement_Page;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class RunPayroll extends BasePage {

	public RunPayroll(WebDriver driver) {
		super(driver);
		
	
	}
	
	private By payrollDahboardElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']/span");

	private By clickRunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");
	
	private By undoPayroll=  By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']");

	
	public void Click_clickRunPayroll1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickRunPayroll1Elem);
		elem.click();
		Reporter.log("Click Run Payroll");
          Thread.sleep(1000);
	
	}
	
	public void Click_RunPayroll2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);
		elem.click();
		Reporter.log("Run Payroll");
		Thread.sleep(1000);
	}
	
	public void Click_RunpayrollFrequently() throws InterruptedException
	{
		
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(4000);
			String value=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[10]")).getText();
			if(!value.equals("£0.00"))
			{
				break;
			}
			WebElement elem = getWebElement(clickRunPayroll1Elem);
			elem.click();
			Reporter.log("Click Run Payroll = "+i);
			Thread.sleep(2000);
			WebElement elem1 = getWebElement(RunPayroll2Elem);
			elem1.click();
			Reporter.log("Run Payroll = "+i);
			
			
		}
		
	}
	
	public void verifyEmployeeEmployerNI(String actualEE,String actualER)
	{
		   List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[@class='text-right']"));
		      int size = list.size();
		      String data = null;
		      for(int i=1;i<=size;i++)
				{
		    	     
					List<WebElement>list1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[@class='text-right']"));
				     String expectedEE = list1.get(2).getText().replaceAll("£", "");
				     System.out.println("Employee NI= "+expectedEE);
				     String expectedER = list1.get(5).getText().replaceAll("£", "");
				     System.out.println("Employer NI= "+expectedER);
				     assertEquals(actualEE,expectedEE);
				     assertEquals(actualER,expectedER);
				     break;
				    
				}
		      Reporter.log("Verify EmployeeEmployerNI");
	}
	
	
	public void Click_UndoLastPayroll() throws InterruptedException
	{
		
		for(int i=1;i<=4;i++)
		{
			WebElement elem = getWebElement(undoPayroll);
			Thread.sleep(1000);
			elem.click();
			m_Driver.switchTo().alert().accept();
		    Reporter.log("Undo Last Payroll ="+ i);
		 
		}
	}
		public void Click_UndoLastPayroll12() throws InterruptedException
		{
			
			for(int i=1;i<=12;i++)
			{
				WebElement elem = getWebElement(undoPayroll);
				Thread.sleep(1000);
				elem.click();
				m_Driver.switchTo().alert().accept();
			    Reporter.log("Undo Last Payroll ="+ i);
			 
			}
		
		
	}
	public void Click_UndoPayroll() throws InterruptedException
	{
		WebElement elem = getWebElement(undoPayroll);
		Thread.sleep(200);
		elem.click();
		m_Driver.switchTo().alert().accept();
		 Reporter.log("Undo Last Payroll");
	}
	
	public void Click_Runpayroll12() throws InterruptedException
	{
		
		for(int i=1;i<=12;i++)
		{

			WebElement elem = getWebElement(clickRunPayroll1Elem);
			elem.click();
			Reporter.log("Click Run Payroll = "+i);
			Thread.sleep(2000);
			WebElement elem1 = getWebElement(RunPayroll2Elem);
			elem1.click();
			Reporter.log("Run Payroll = "+i);
			
			
		}
		
}
	
	public void Undo_LastPayroll() throws InterruptedException
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']"));
		
		elem.click();
		m_Driver.switchTo().alert().accept();
	    Thread.sleep(1000);
	    
	    Reporter.log("Click UndoLast Payroll");
	}
	
	
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

