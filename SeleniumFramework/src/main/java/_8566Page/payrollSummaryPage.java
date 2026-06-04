package _8566Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;

public class payrollSummaryPage extends BasePage{

	public payrollSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	
	private By refreshBtn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rvReport_ctl09_ctl05_ctl00_ctl00_ctl00']");
	public void clickRefreshBtn() throws Exception
	{
        
		WebElement elem = getWebElement(refreshBtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRefreshBtn", "clickRefreshBtn failed. Unable to locate object: " + refreshBtn.toString());


			Assert.fail("Unable to locate object: " + refreshBtn.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickRefreshBtn");
          	

		ExtentReportManager.passStep(m_Driver, "clickRefreshBtn");
		Reporter.log("clickRefreshBtn");


	}

}
