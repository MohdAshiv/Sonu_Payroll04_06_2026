package _2105Email;


import pages.BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b6a74d07-8921-41d3-b46c-f9bf8d8ddb8a
@TestModellerModule(guid = "b6a74d07-8921-41d3-b46c-f9bf8d8ddb8a")


public class OpenOutlook extends BasePage
{

	public OpenOutlook(WebDriver driver) {
		super(driver);
	
	}
	
	
	private By OutlookEmailElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2");


	
	
	/**
 	 * Click AgentSettings
	 * @throws InterruptedException 
     * @name Click AgentSettings
     */
	public void OutlookEmail() throws InterruptedException
	{
        
		WebElement elem = getWebElement(OutlookEmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AgentSettings", "Click_AgentSettings failed. Unable to locate object: " + OutlookEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AgentSettings", "Click_AgentSettings failed. Unable to locate object: " + OutlookEmailElem.toString());

			Assert.fail("Unable to locate object: " + OutlookEmailElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
		String url = "https://login.microsoftonline.com/";
		Thread.sleep(1000);
        m_Driver.get(url);
        Thread.sleep(1000);
        m_Driver.findElement(By.name("loginfmt")).sendKeys("Vikas.Kumar@nomisma.co.uk"); 

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      

 //       WebDriverWait wait=new WebDriverWait(m_Driver, 20);               

        m_Driver.findElement(By.xpath("//input[@type='submit']")).click();         

        m_Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        

        m_Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("EPFO@vik12345");        
        
        Thread.sleep(2000);

        m_Driver.findElement(By.xpath("//input[@type='submit']")).click(); 
          	

		ExtentReportManager.passStep(m_Driver, "OutlookEmail");

		TestModellerLogger.PassStep(m_Driver, "OutlookEmail");
	}
	
	

}
