package _6440_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;

public class fpsPage  extends BasePage{

	public fpsPage(WebDriver driver) {
		super(driver);
	}

	
	private By julyfpsElem= By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr[5]/td[5]/div");
	
	private By March24fpsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_lnkTaxReturnType']");

	private By March24fpsElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl13_lnkTaxReturnType']");

	private By March24fps1Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl12_lnkTaxReturnType']");

	private By March24fps1Elem3= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl13_lnkTaxReturnType']");

	private By AugfpsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl04_lnkTaxReturnType']");
	private By week15Elem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']");

	private By week15Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_lnkTaxReturnType']");
	private By week54Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_lnkTaxReturnType']");

	private By week52Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_lnkTaxReturnType']");

	
	private By aprilFPS= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_lnkTaxReturnType']");

	private By aprilEPS= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']");

	private By epsMonth4Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl04_lnkTaxReturnType']");

	private By epsMonth3Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_lnkTaxReturnType']");

	private By epsMonth2Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_lnkTaxReturnType']");

	public void clickJulyFps() throws Exception
	{
        
		WebElement elem = getWebElement(julyfpsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickJulyFps", "clickJulyFps failed. Unable to locate object: " + julyfpsElem.toString());


			Assert.fail("Unable to locate object: " + julyfpsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickJulyFps");
          	

		ExtentReportManager.passStep(m_Driver, "clickJulyFps");
		Reporter.log("clickJulyFps");


	}
	
	public void clickMonth4Eps() throws Exception
	{
        
		WebElement elem = getWebElement(epsMonth4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMonth4Eps", "clickMonth4Eps failed. Unable to locate object: " + epsMonth4Elem.toString());


			Assert.fail("Unable to locate object: " + epsMonth4Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickMonth4Eps");
          	

		ExtentReportManager.passStep(m_Driver, "clickMonth4Eps");
		Reporter.log("clickMonth4Eps");


	}
	
	public void clickMonth3Eps() throws Exception
	{
        
		WebElement elem = getWebElement(epsMonth3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMonth3Eps", "clickMonth3Eps failed. Unable to locate object: " + epsMonth3Elem.toString());


			Assert.fail("Unable to locate object: " + epsMonth3Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickMonth3Eps");
          	

		ExtentReportManager.passStep(m_Driver, "clickMonth3Eps");
		Reporter.log("clickMonth3Eps");


	}
	
	public void clickMonth2Eps() throws Exception
	{
        
		WebElement elem = getWebElement(epsMonth2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMonth2Eps", "clickMonth2Eps failed. Unable to locate object: " + epsMonth2Elem.toString());


			Assert.fail("Unable to locate object: " + epsMonth2Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickMonth2Eps");
          	

		ExtentReportManager.passStep(m_Driver, "clickMonth2Eps");
		Reporter.log("clickMonth2Eps");


	}
	
	
	
	public void clickMarch3Fps() throws Exception
	{
        
		WebElement elem = getWebElement(March24fpsElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMarch3Fps", "clickMarch3Fps failed. Unable to locate object: " + March24fpsElem2.toString());


			Assert.fail("Unable to locate object: " + March24fpsElem2.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickMarch3Fps");
          	

		ExtentReportManager.passStep(m_Driver, "clickMarch3Fps");
		Reporter.log("clickMarch3Fps");


	}
	
	
	public void clickAprilFps() throws Exception
	{
        
		WebElement elem = getWebElement(aprilFPS);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAprilFps", "clickAprilFps failed. Unable to locate object: " + aprilFPS.toString());


			Assert.fail("Unable to locate object: " + aprilFPS.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickAprilFps");
          	

		ExtentReportManager.passStep(m_Driver, "clickAprilFps");
		Reporter.log("clickAprilFps");


	}
	
	
	public void clickAprilEps() throws Exception
	{
        
		WebElement elem = getWebElement(aprilEPS);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAprilEps", "clickAprilEps failed. Unable to locate object: " + aprilEPS.toString());


			Assert.fail("Unable to locate object: " + aprilEPS.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickAprilEps");
          	

		ExtentReportManager.passStep(m_Driver, "clickAprilEps");
		Reporter.log("clickAprilEps");


	}
	
	

	public void clickWeek54Fps() throws Exception
	{
        
		WebElement elem = getWebElement(week54Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickWeek54Fps", "clickWeek54Fps failed. Unable to locate object: " + week54Elem.toString());


			Assert.fail("Unable to locate object: " + week54Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickWeek54Fps");
          	

		ExtentReportManager.passStep(m_Driver, "clickWeek54Fps");
		Reporter.log("clickWeek54Fps");


	}
	
	
	public void clickWeek52Fps() throws Exception
	{
        
		WebElement elem = getWebElement(week52Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickWeek52Fps", "clickWeek52Fps failed. Unable to locate object: " + week52Elem.toString());


			Assert.fail("Unable to locate object: " + week52Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickWeek52Fps");
          	

		Reporter.log("clickWeek52Fps");


	}
	
	public void clickMarch24Fps() throws Exception
	{
        
		WebElement elem = getWebElement(March24fpsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMarch24Fps", "clickMarch24Fps failed. Unable to locate object: " + March24fpsElem.toString());


			Assert.fail("Unable to locate object: " + March24fpsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickMarch24Fps");
          	

		ExtentReportManager.passStep(m_Driver, "clickMarch24Fps");
		Reporter.log("clickMarch24Fps");


	}
	
	public void clickMarch24Fps1() throws Exception
	{
        
		WebElement elem = getWebElement(March24fps1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMarch24Fps1", "clickMarch24Fps1 failed. Unable to locate object: " + March24fps1Elem.toString());


			Assert.fail("Unable to locate object: " + March24fps1Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickMarch24Fps1");
          	

		ExtentReportManager.passStep(m_Driver, "clickMarch24Fps1");
		Reporter.log("clickMarch24Fps1");


	}
	
	
	public void clickMarch24Fps3() throws Exception
	{
        
		WebElement elem = getWebElement(March24fps1Elem3);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMarch24Fps3", "clickMarch24Fps3 failed. Unable to locate object: " + March24fps1Elem3.toString());


			Assert.fail("Unable to locate object: " + March24fps1Elem3.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickMarch24Fps3");
          	

		ExtentReportManager.passStep(m_Driver, "clickMarch24Fps3");
		Reporter.log("clickMarch24Fps3");


	}
	
	
	public void clickAugFps() throws Exception
	{
        
		WebElement elem = getWebElement(AugfpsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAugFps", "clickAugFps failed. Unable to locate object: " + AugfpsElem.toString());


			Assert.fail("Unable to locate object: " + AugfpsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickAugFps");
          	

		ExtentReportManager.passStep(m_Driver, "clickAugFps");
		Reporter.log("clickAugFps");


	}
	
	public void clickWeek15Fps() throws Exception
	{
        
		WebElement elem = getWebElement(week15Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickWeek15Fps", "clickWeek15Fps failed. Unable to locate object: " + week15Elem.toString());

			Assert.fail("Unable to locate object: " + week15Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickWeek15Fps");
          	

		ExtentReportManager.passStep(m_Driver, "clickWeek15Fps");
		Reporter.log("clickWeek15Fps");


	}
	
	
	public void clickWeek15Fps1() throws Exception
	{
        
		WebElement elem = getWebElement(week15Elem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickWeek15Fps1", "clickWeek15Fps1 failed. Unable to locate object: " + week15Elem1.toString());

			Assert.fail("Unable to locate object: " + week15Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickWeek15Fps1");
          	

		ExtentReportManager.passStep(m_Driver, "clickWeek15Fps1");
		Reporter.log("clickWeek15Fps1");


	}
	
	public void clickNextPage() throws Exception
	{
        
		   jsExec.executeScript("window.scrollBy(0,500)");

		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_PageUC1_rptrPager_ctl03_lnkNext']"));

		

		elem.click();
		Thread.sleep(5000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickNextPage");
          	

		Reporter.log("clickNextPage");


	}
	
}
