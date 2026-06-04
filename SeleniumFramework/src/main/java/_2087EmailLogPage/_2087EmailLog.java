package _2087EmailLogPage;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/780e5b80-fe4e-4933-a9ba-99d145aa2d2d
@TestModellerModule(guid = "780e5b80-fe4e-4933-a9ba-99d145aa2d2d")
public class _2087EmailLog extends BasePage
{
	
	static String monthdate;
	static String[] d;
	
	public _2087EmailLog (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickOnPersonElem = By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul/li[4]/a");
	
	private By clickOnPersonOnAgentPgElem = By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul[1]/li[6]/a[1]/div[1]/img[1]");
	
	

	private By Email_LogElem = By.xpath("//A[text()='Email Log']");

	private By getLogCountElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail_sub']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15457&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15457&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15457&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15457&menuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/Inbox.aspx?PayrollCompanyCode=15457&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickOnPerson
	 * @throws InterruptedException 
     * @name Click clickOnPerson
     */
	public void Click_clickOnPerson() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickOnPersonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickOnPerson", "Click_clickOnPerson failed. Unable to locate object: " + clickOnPersonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickOnPerson", "Click_clickOnPerson failed. Unable to locate object: " + clickOnPersonElem.toString());

			Assert.fail("Unable to locate object: " + clickOnPersonElem.toString());
        }

		Thread.sleep(1000);
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickOnPerson");

		TestModellerLogger.PassStep(m_Driver, "Click_clickOnPerson");
	}
	
	/**
 	 * Click clickOnPerson
	 * @throws InterruptedException 
     * @name Click clickOnPerson
     */
	public void Click_clickOnPersonAgentpge() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickOnPersonOnAgentPgElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickOnPersonAgentpge", "Click_clickOnPersonAgentpge failed. Unable to locate object: " + clickOnPersonOnAgentPgElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickOnPersonAgentpge", "Click_clickOnPersonAgentpge failed. Unable to locate object: " + clickOnPersonOnAgentPgElem.toString());

			Assert.fail("Unable to locate object: " + clickOnPersonOnAgentPgElem.toString());
        }

		Thread.sleep(1000);
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickOnPersonAgentpge");

		TestModellerLogger.PassStep(m_Driver, "Click_clickOnPersonAgentpge");
	}
	
	/**
	 * Get Payroll Months Date
	 */
	public void payrollMonthsDate()
	{
		
		int tableSize=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr/td[1]")).size();
		
		tableSize=tableSize-1;
		System.out.println(tableSize);
		
		 monthdate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr["+tableSize+"]/td[1]")).getText();
		System.out.println(monthdate);
		
	}

     
	/**
 	 * Click Email Log
     * @name Click Email Log
     */
	public void Click_Email_Log()
	{
        
		WebElement elem = getWebElement(Email_LogElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Email_Log", "Click_Email_Log failed. Unable to locate object: " + Email_LogElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Email_Log", "Click_Email_Log failed. Unable to locate object: " + Email_LogElem.toString());

			Assert.fail("Unable to locate object: " + Email_LogElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Email_Log");

		TestModellerLogger.PassStep(m_Driver, "Click_Email_Log");
	}

     
	/**
 	 * Click getLogCount
     * @name Click getLogCount
     */
	public void Click_getLogCount()
	{
        
		WebElement elem = getWebElement(getLogCountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

			Assert.fail("Unable to locate object: " + getLogCountElem.toString());
        }

		String Actual=elem.getText();
		
		String Expected="2087EmailLog-Payroll for the month of "+d[0]+" "+monthdate;
		
		System.out.println(Actual);
		
		System.out.println(Expected);
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_getLogCount");

		TestModellerLogger.PassStep(m_Driver, "Click_getLogCount");
	}
	
	
	/**
 	 * Click getLogCount
     * @name Click getLogCount
     */
	public void Click_getLogCount1()
	{
        
		WebElement elem = getWebElement(getLogCountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

			Assert.fail("Unable to locate object: " + getLogCountElem.toString());
        }

		String Actual=elem.getText();
		
		String Expected="Company-Payroll for the month of 31 May 2021";
		
		System.out.println(Actual);
		
		System.out.println(Expected);
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_getLogCount");

		TestModellerLogger.PassStep(m_Driver, "Click_getLogCount");
	}
	
	
	
	/**
 	 * Click getLogCount
     * @name Click getLogCount
     */
	public void Click_getLogCount2()
	{
        
		WebElement elem = getWebElement(getLogCountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

			Assert.fail("Unable to locate object: " + getLogCountElem.toString());
        }

		String Actual=elem.getText();
		
		
		System.out.println(Actual);

		Assert.assertNotNull(Actual);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getLogCount");

		TestModellerLogger.PassStep(m_Driver, "Click_getLogCount");
	}
	
	
	/**
 	 * Click getLogCount
     * @name Click getLogCount
     */
	public void Click_getLogCount3()
	{
        
		WebElement elem = getWebElement(getLogCountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

			Assert.fail("Unable to locate object: " + getLogCountElem.toString());
        }

		String Actual=elem.getText();
		
		String Expected="A LastA Form P60 for the tax year 2021-2022";
		
		System.out.println(Actual);
		
		System.out.println(Expected);
		
		assertEquals(Actual, Expected);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getLogCount");

		TestModellerLogger.PassStep(m_Driver, "Click_getLogCount");
	}
	
	
	/**
 	 * Click getLogCount
     * @name Click getLogCount
     */
	public void Click_getLogCount4()
	{
        
		WebElement elem = getWebElement(getLogCountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getLogCount", "Click_getLogCount failed. Unable to locate object: " + getLogCountElem.toString());

			Assert.fail("Unable to locate object: " + getLogCountElem.toString());
        }

		String Actual=elem.getText();
		
		String Expected="Form P60 for the tax year 2021-2022";
		
		System.out.println(Actual);
		
		System.out.println(Expected);
		
		assertEquals(Actual, Expected);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getLogCount");

		TestModellerLogger.PassStep(m_Driver, "Click_getLogCount");
	}
	
	
	/**
	 * Get Date
	 */
	public void getDate()
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")).click();
		String Date=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[1]")).getText();
		System.out.println(Date);
		 d= Date.split("/");
		
		System.out.println(d[0]);
		
	}
	
	
	/**
	 * Take Screenshot
	 * @throws Exception 
	 */
	public void scshot() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "Email Log When Main Contact");
	}
	
	
	/**
	 * Take Screenshot
	 * @throws Exception 
	 */
	public void scshot1() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "Email Log When Email to Employee");
	}
	
	
	/**
	 * Take Screenshot
	 * @throws Exception 
	 */
	public void scshot2() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "Email Log When Email From Summary");
	}
	
	
	/**
	 * Take Screenshot
	 * @throws Exception 
	 */
	public void scshot3() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "Email Log on Agent");
	}
	
	/**
	 * Agent Level Email Log click
	 */
	public void clickEmailLog()
	{
		m_Driver.findElement(By.xpath("//a[contains(text(),'Email Log')]")).click();
	}
	
}