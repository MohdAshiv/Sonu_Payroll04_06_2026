package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/39cba1ca-ba69-40ff-8983-ed2e9b25543b
@TestModellerModule(guid = "39cba1ca-ba69-40ff-8983-ed2e9b25543b")
public class loginpageSandbox4 extends BasePage
{
	public loginpageSandbox4 (WebDriver driver)
	{
		super(driver);
	}


	
	private By EnterUsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By EnterpasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By LoginButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=1334a10c-1776-4af5-9671-c847532d91ce")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enterpassword " + Enterpassword);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enterpassword " + Enterpassword);
 	}

     
	/**
 	 * Click LoginButton
     * @name Click LoginButton
     */
	public void Click_LoginButton()
	{
        
		WebElement elem = getWebElement(LoginButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

			Assert.fail("Unable to locate object: " + LoginButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LoginButton");

		TestModellerLogger.PassStep(m_Driver, "Click_LoginButton");
	}
}