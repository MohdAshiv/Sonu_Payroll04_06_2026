package pages1;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ExcelData;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8a5f6c67-7688-4eef-9bb1-6c3e93d422a5
@TestModellerModule(guid = "8a5f6c67-7688-4eef-9bb1-6c3e93d422a5")
public class RegisterCIS extends BasePage
{
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

	public RegisterCIS (WebDriver driver)
	{
		super(driver);
	}
	
	
	


	
	private By SelectYesElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblRegforCis_0']");

	private By clickLinkElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$btnLink']");
	
	private By CreateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$btnCreate']");

	private By SelectContractorElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlContractor']");

	private By clickSave1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By clickSave2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52692&CompanyCode=13459&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52692&CompanyCode=13459&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52692&CompanyCode=13459&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52692&CompanyCode=13459&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52692&CompanyCode=13459&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

   
   public void click_no() throws InterruptedException
   {
	   m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblRegforCis_1']")).click();
		Thread.sleep(3000);
   }
     
	/**
 	 * Click SelectYes
	 * @throws InterruptedException 
     * @name Click SelectYes
     */
	public void Click_SelectYes() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SelectYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectYes", "Click_SelectYes failed. Unable to locate object: " + SelectYesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectYes", "Click_SelectYes failed. Unable to locate object: " + SelectYesElem.toString());

			Assert.fail("Unable to locate object: " + SelectYesElem.toString());
        }

		
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectYes");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectYes");
	}

     
	/**
 	 * Click clickLink
	 * @throws InterruptedException 
     * @name Click clickLink
     */
	public void Click_clickLink() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(clickLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickLink", "Click_clickLink failed. Unable to locate object: " + clickLinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickLink", "Click_clickLink failed. Unable to locate object: " + clickLinkElem.toString());

			Assert.fail("Unable to locate object: " + clickLinkElem.toString());
        }

		elem.click();
		Thread.sleep(2000);
		
		
		  //To check the element exists or not but avoiding any exception, find all the elements with the id and put them in a list. Since id is a unique identifier, it should return only one.
	    List<WebElement> frame = m_Driver.findElements(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe"));


	   //Then check if the list of elements is empty or not. If not, then the frame is present in the DOM
	    if(!frame.isEmpty()) {

	        //Since frame is a list we need to get the element in the index 0
	        m_Driver.switchTo().frame(frame.get(0));
	        System.out.println("Hi");
	        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlContractor']")).click();
	        Thread.sleep(1000);
	    }
	    else {
	            System.out.println("Frame with this id doesn't exists");
	        }
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickLink");

		TestModellerLogger.PassStep(m_Driver, "Click_clickLink");
	}
	
	
	
	
    
	/**
 	 * Click Create
	 * @throws InterruptedException 
     * @name Click Create
     */
	public void Click_Create() throws InterruptedException
	{
		
		sTestCaseID="TC32";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(CreateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Create", "Click_Create failed. Unable to locate object: " + CreateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Create", "Click_Create failed. Unable to locate object: " + CreateElem.toString());

			Assert.fail("Unable to locate object: " + CreateElem.toString());
        }

		elem.click();
		
		
		  //To check the element exists or not but avoiding any exception, find all the elements with the id and put them in a list. Since id is a unique identifier, it should return only one.
	    List<WebElement> frame = m_Driver.findElements(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe"));


	   //Then check if the list of elements is empty or not. If not, then the frame is present in the DOM
	    if(!frame.isEmpty()) {

	        //Since frame is a list we need to get the element in the index 0
	        m_Driver.switchTo().frame(frame.get(0));
	        System.out.println("Hi***");
	        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtContractoeFirstName']")).sendKeys(data[5]);
	        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtContractorSurName']")).sendKeys(data[6]);
	        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUtrNo']")).sendKeys(data[7]);
	        jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']")));
	        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']")).click();
	        Thread.sleep(1000);
	    }
	    else {
	            System.out.println("Frame with this id doesn't exists");
	        }
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Create");

		TestModellerLogger.PassStep(m_Driver, "Click_Create");
	}


    
	/**
 	 * Select SelectContractor
     * @name Select SelectContractor
     */
    public void Select_SelectContractor(String SelectContractor)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@name='1620498448555']")));

 		WebElement elem = getWebElement(SelectContractorElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectContractor", "Select_SelectContractor failed. Unable to locate object: " + SelectContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectContractor", "Select_SelectContractor failed. Unable to locate object: " + SelectContractorElem.toString());

 			Assert.fail("Unable to locate object: " + SelectContractorElem.toString());
         }
 		elem.click();
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText("vikas");
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectContractor " + SelectContractor);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectContractor " + SelectContractor);
 	}

     
	/**
 	 * Click clickSave1
     * @name Click clickSave1
     */
	public void Click_clickSave1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@name='1620498448555']")));

		WebElement elem = getWebElement(clickSave1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave1", "Click_clickSave1 failed. Unable to locate object: " + clickSave1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave1", "Click_clickSave1 failed. Unable to locate object: " + clickSave1Elem.toString());

			Assert.fail("Unable to locate object: " + clickSave1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave1");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave1");
	}

     
	/**
 	 * Click clickSave2
     * @name Click clickSave2
     */
	public void Click_clickSave2()
	{
        
		WebElement elem = getWebElement(clickSave2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave2", "Click_clickSave2 failed. Unable to locate object: " + clickSave2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave2", "Click_clickSave2 failed. Unable to locate object: " + clickSave2Elem.toString());

			Assert.fail("Unable to locate object: " + clickSave2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave2");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave2");
	}
}