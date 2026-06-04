package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/39cba1ca-ba69-40ff-8983-ed2e9b25543b
@TestModellerModule(guid = "39cba1ca-ba69-40ff-8983-ed2e9b25543b")
public class loginpage4 extends BasePage
{
	public loginpage4 (WebDriver driver)
	{
		super(driver);
	}


	
	private By EnterUsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By EnterpasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By LoginButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");


	
//	public void GoToUrl()
//	{
//		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce");
//		
//		Reporter.log("lunch Url Suss");
//
//		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce");
//		
//		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce");
//	}

     
	
	public void GoToUrl() throws InterruptedException
	{
//		   m_Driver.get("chrome://settings/clearBrowserData");  
//	        Thread.sleep(2000);
//
//		   WebElement clearBtn = (WebElement) jsExec.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(9) > settings-privacy-page\").shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\").shadowRoot.querySelector(\"#clearBrowsingDataConfirm\")");
//
//	        ((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", clearBtn);
//	        
//	        Thread.sleep(3000);
		   // m_Driver.get("https://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=04d50e08-2a4b-4e93-90e1-27712d9500e4");
		
	  //  m_Driver.get("https://sandbox.nomismasolution.co.uk");

	    m_Driver.get("https://sandbox.nomi.co.uk");


		Reporter.log("lunch Url Suss");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=5990780c-d62d-4265-8623-59373b364ae3&cc=AutoMation");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=5990780c-d62d-4265-8623-59373b364ae3&cc=AutoMation");
	}

	/**
 	 * AssertUrl
     * @name AssertUrl
     */
	
   public void AssertUrl()
    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "https://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=04d50e08-2a4b-4e93-90e1-27712d9500e4";
//
//        if (!currentUrl.equals("https://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=04d50e08-2a4b-4e93-90e1-27712d9500e4")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
    }

      
	/**
 	 * Enter EnterUsername
     * @name Enter EnterUsername
     */
 	public void Enter_EnterUsername(String EnterUsername)
 	{
 	    
 		WebElement elem = getWebElement(EnterUsernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterUsername", "Enter_EnterUsername failed. Unable to locate object: " + EnterUsernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterUsername", "Enter_EnterUsername failed. Unable to locate object: " + EnterUsernameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterUsernameElem.toString());
         }

 		elem.sendKeys(EnterUsername);
 		
 		Reporter.log("EnterUsername = "+EnterUsername);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterUsername " + EnterUsername);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterUsername " + EnterUsername);
 	}

      
	/**
 	 * Enter Enterpassword
     * @name Enter Enterpassword
     */
 	public void Enter_Enterpassword(String Enterpassword)
 	{
 	    
 		WebElement elem = getWebElement(EnterpasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enterpassword", "Enter_Enterpassword failed. Unable to locate object: " + EnterpasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enterpassword", "Enter_Enterpassword failed. Unable to locate object: " + EnterpasswordElem.toString());

 			Assert.fail("Unable to locate object: " + EnterpasswordElem.toString());
         }

 		elem.sendKeys(Enterpassword);
 		
 		Reporter.log("Enter_Enterpassword = "+Enterpassword);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enterpassword " + Enterpassword);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enterpassword " + Enterpassword);
 	}

     
	/**
 	 * Click LoginButton
	 * @throws InterruptedException 
     * @name Click LoginButton
     */
	public void Click_LoginButton() throws InterruptedException
	{
        
		WebElement elem = getWebElement(LoginButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

			Assert.fail("Unable to locate object: " + LoginButtonElem.toString());
        }

		elem.click();
          	
		Reporter.log("Login Successful");

		ExtentReportManager.passStep(m_Driver, "Click_LoginButton");

		TestModellerLogger.PassStep(m_Driver, "Click_LoginButton");
		
		Reporter.log("Click_LoginButton");
		
//		Thread.sleep(7000);
// 		m_Driver.findElement(By.xpath("//*[@id='border-521ab2e9-19e7-ab9d-efd5-c686816f14b8']")).click();


	}
}