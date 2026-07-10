package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7815bfc3-7a70-43d6-a994-342f3e78874d
@TestModellerModule(guid = "7815bfc3-7a70-43d6-a994-342f3e78874d")
public class OpenClient extends BasePage
{
	public OpenClient (WebDriver driver)
	{
		super(driver); 
	}


	
	private By ClientsClickElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By EnterClientNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ClickSearchElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	//private By ClickClientElem = By.xpath("//TR[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/TD/SPAN[@class='border-btm-dotted']");
	private By ClickClientElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_hrefCompany']");

	private By ClickClientElem2= By.xpath("//*[@id='rptCompanies']/tr[1]/td[2]/ul/li[3]/a");
	private By ClickClientElem3= By.xpath("//*[@id='rptCompanies']/tr/td[2]/ul/li[3]/a");
	private By ClickClientPayroll= By.xpath("//*[@id='rptCompanies']/tr/td[2]/ul/li/a");

	private By ClickClientElem1 = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_hrefCompany']");

	private By statusElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddStatus']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClientsClick
	 * @throws InterruptedException 
     * @name Click ClientsClick
     */
	public void Click_ClientsClick() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClientsClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

			Assert.fail("Unable to locate object: " + ClientsClickElem.toString());
        }

		//Thread.sleep(10000);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		
		jsExec.executeScript("arguments[0].click();", elem);
	
		
		 
	//	Thread.sleep(20000);
	//	ClosePopup.ValidateAndPopUp1(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click_ClientsClick");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientsClick");
		
		Reporter.log("Click_ClientsClick");
	}

      
	/**
 	 * Enter EnterClientName
	 * @throws Exception 
     * @name Enter EnterClientName
     */
 	public void Enter_EnterClientName(String EnterClientName) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(EnterClientNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
         }
 		
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "AgentPageError");

 		elem.sendKeys(EnterClientName);
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterClientName " + EnterClientName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterClientName " + EnterClientName);
  		
  		Reporter.log("Enter_EnterClientName - "+EnterClientName);
 	}
 	
 	
 	
 	public void Enter_EnterClientName1() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(EnterClientNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
         }
 		
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "AgentPageError");
 		ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
 		
 		String data = abc.client;
 		elem.sendKeys(data);
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  
  		Reporter.log("Enter_EnterClientName - "+data);
 	}
 	
 	public void Enter_EnterClientName2() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(EnterClientNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
         }
 		
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "AgentPageError");
 		pages.CreateClient abc= new 	pages.CreateClient(m_Driver);
 		
 		String data = abc.client;
 		elem.sendKeys(data);
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  
  		Reporter.log("Enter_EnterClientName - "+data);
 	}
 	
 	
	


     
	/**
 	 * Click ClickSearch
	 * @throws InterruptedException 
     * @name Click ClickSearch
     */
	public void Click_ClickSearch() throws InterruptedException
	{
        Thread.sleep(3000);
		WebElement elem = getWebElement(ClickSearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSearch", "Click_ClickSearch failed. Unable to locate object: " + ClickSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSearch", "Click_ClickSearch failed. Unable to locate object: " + ClickSearchElem.toString());

			Assert.fail("Unable to locate object: " + ClickSearchElem.toString());
        }
		

		elem.click();
		Thread.sleep(3000);


		ExtentReportManager.passStep(m_Driver, "Click_ClickSearch");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSearch");
		
		Reporter.log("Click_ClickSearch");
	}

     
	/**
 	 * Click ClickClient
	 * @throws InterruptedException 
     * @name Click ClickClient
     */
	public void Click_ClickClient() throws InterruptedException
	{
        
		Thread.sleep(5000);
WebElement elem = getWebElement(ClickClientElem3);
//  WebElement elem = getWebElement(ClickClientPayroll);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickClient", "Click_ClickClient failed. Unable to locate object: " + ClickClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickClient", "Click_ClickClient failed. Unable to locate object: " + ClickClientElem.toString());

			Assert.fail("Unable to locate object: " + ClickClientElem.toString());
        }

		elem.click();
          	
		ChangeWindow.tabswitch(m_Driver);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickClient");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickClient");
		Reporter.log("Click_ClickClient");
	}
	
	
	public void Click_ClickClientPayroll() throws InterruptedException
	{
		
		Thread.sleep(10000);
        
	//	WebElement elem = getWebElement(By.xpath("(//*[contains(text(),'Payroll')])[4]"));

		WebElement elem = getWebElement(By.xpath("//*[@id=\"rptCompanies\"]/tr/td[2]/ul/li[3]/a"));

		elem.click();
          	
		ChangeWindow.tabswitch(m_Driver);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickClient");

		Reporter.log("Click_ClickClientPayroll");
	}
	
	
	public void Click_ClickClientPayroll1() throws InterruptedException
	{
		
		Thread.sleep(10000);
        
	//	WebElement elem = getWebElement(By.xpath("(//*[contains(text(),'Payroll')])[4]"));

		WebElement elem = getWebElement(By.xpath("//*[@id=\"rptCompanies\"]/tr/td[2]/ul/li[2]/a"));

		elem.click();
          	
		ChangeWindow.tabswitch(m_Driver);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickClient");

		Reporter.log("Click_ClickClientPayroll");
	}
	
	
	public void Click_ClickClientBK() throws Exception
	{
        
		WebElement elem = getWebElement(By.xpath("(//*[contains(text(),'BK')])"));

		elem.click();
          	
		Thread.sleep(2000);
		ChangeWindow.tabswitch(m_Driver);
		Thread.sleep(5000);
		
        m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_Button1']")).click();
		Thread.sleep(5000);

		ExtentReportManager.passStep(m_Driver, "Click_ClickClient");

		Reporter.log("Click_ClickClientBK");
	}
	
	
	

	
	
	public void Click_ClickClient2()
	{
        
		WebElement elem = getWebElement(ClickClientElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickClient", "Click_ClickClient failed. Unable to locate object: " + ClickClientElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickClient", "Click_ClickClient failed. Unable to locate object: " + ClickClientElem2.toString());

			Assert.fail("Unable to locate object: " + ClickClientElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
          	
		ChangeWindow.tabswitch(m_Driver);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickClient");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickClient");
	}
	
	

	public void Click_ClickClient3()
	{
        
		WebElement elem = getWebElement(ClickClientElem3);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickClient3", "Click_ClickClient3 failed. Unable to locate object: " + ClickClientElem3.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickClient3", "Click_ClickClient3 failed. Unable to locate object: " + ClickClientElem3.toString());

			Assert.fail("Unable to locate object: " + ClickClientElem3.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
          	
		ChangeWindow.tabswitch(m_Driver);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickClient3");

		Reporter.log("Click_ClickClient3");
	}
	
	
	
	
	
	

	
	
	public void Click_ClickClient1()
	{
        
		WebElement elem = getWebElement(ClickClientElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickClient1", "Click_ClickClient1 failed. Unable to locate object: " + ClickClientElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickClient1", "Click_ClickClient1 failed. Unable to locate object: " + ClickClientElem1.toString());

			Assert.fail("Unable to locate object: " + ClickClientElem1.toString());
        }
		jsExec.executeScript("arguments[0].click();",elem);

       
		ChangeWindow.tabswitch(m_Driver);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickClient1");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickClient1");
	}
	
	
	public void selectStatusType(String value) throws Exception
	{

		WebElement elem = getWebElement(statusElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStatusType", "selectStatusType failed. Unable to locate object: " + statusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "selectStatusType", "selectStatusType failed. Unable to locate object: " + statusElem.toString());

			Assert.fail("Unable to locate object: " + statusElem.toString());
        }
		 Select sel= new Select(elem);
		sel.selectByVisibleText(value);
		Thread.sleep(1000);
		Reporter.log("selectStatusType");


		ExtentReportManager.passStep(m_Driver, "selectStatusType");

	}
	
	
	
	
	public void click(String A)
	{
		
		 WebElement Client = m_Driver.findElement(By.xpath("//*[@class='table-responsive']/table/tbody/tr/td/span/a[text()='"+A+"']"));

	}
	

}