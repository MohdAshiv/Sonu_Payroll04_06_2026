package page.factory;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/0248f1c1-93d8-44f8-bba2-177c3a3b9bf6
@TestModellerModule(guid = "0248f1c1-93d8-44f8-bba2-177c3a3b9bf6")
public class ImportEmployee extends BasePage
{
	public ImportEmployee (WebDriver driver)
	{
		super(driver);
	}


	
	private By UploadEEDetailFileElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/h2");
	
	private By DwnloadFileElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportSample']");

	


	
	

     
	/**
 	 * Click xPath: 'UploadEEDetailFile'
	 * @throws AWTException 
	 * @throws InterruptedException 
     * @name Click xPath: 'UploadEEDetailFile'
     */
	public void Click_UploadEEDetailFile() throws AWTException, InterruptedException
	{
        
		WebElement elem = getWebElement(UploadEEDetailFileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UploadEEDetailFile", "Click_UploadEEDetailFile failed. Unable to locate object: " + UploadEEDetailFileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UploadEEDetailFile", "Click_UploadEEDetailFile failed. Unable to locate object: " + UploadEEDetailFileElem.toString());

			Assert.fail("Unable to locate object: " + UploadEEDetailFileElem.toString());
        }
		
		System.out.println("Hlw");

		elem.click();
		
				
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		
		
		
		
		System.out.println("Hlw");
          	

		ExtentReportManager.passStep(m_Driver, "Click_UploadEEDetailFile");

		TestModellerLogger.PassStep(m_Driver, "Click_UploadEEDetailFile");
	}








	public void Click_DownloadFile() throws Exception 
	{
		
		WebElement elem = getWebElement(DwnloadFileElem);
		
		elem.click();
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Downloaded File");
		
		
		
	}

     
	
}