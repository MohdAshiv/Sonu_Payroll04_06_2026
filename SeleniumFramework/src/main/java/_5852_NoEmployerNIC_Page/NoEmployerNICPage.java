package _5852_NoEmployerNIC_Page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;

public class NoEmployerNICPage  extends BasePage{

	public NoEmployerNICPage(WebDriver driver) {
		super(driver);
		
	}

	
	private By employeeSalaryDetails= By.xpath("//*[text()='31 Jul 2022']");
	
	private By fpsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']");

	
	 
	  public void clickEmployeeSalaryDetailsJuly() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(employeeSalaryDetails);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeSalaryDetailsJuly", "clickEmployeeSalaryDetailsJuly failed. Unable to locate object: " + employeeSalaryDetails.toString());

				Assert.fail("Unable to locate object: " + employeeSalaryDetails.toString());
	        }
			jsExec.executeScript("arguments[0].click();",elem);
		
		//	m_Driver.navigate().refresh();
			
			//jsExec.executeScript("arguments[0].click();",elem);
		    Thread.sleep(6000);
		
			ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetailsJuly");
			
			 Reporter.log("clickEmployeeSalaryDetailsJuly");
	}
	  
	  
		public void clickFps() throws Exception
		{
	        
			WebElement elem = getWebElement(fpsElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickFps", "clickFps failed. Unable to locate object: " + fpsElem.toString());


				Assert.fail("Unable to locate object: " + fpsElem.toString());
	        }

			elem.click();
			Thread.sleep(3000);
			
			TakeScreenshot.takeScreenshot(m_Driver, "clickFps");
	          	

			ExtentReportManager.passStep(m_Driver, "clickFps");
			Reporter.log("clickFps");


		}

}
