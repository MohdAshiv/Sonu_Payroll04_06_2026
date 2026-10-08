package pages;

import pages.BasePage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ca9ecadd-4bb2-4a51-aa90-ae7678b43455
@TestModellerModule(guid = "ca9ecadd-4bb2-4a51-aa90-ae7678b43455")
public class agentpage extends BasePage
{
	public WebElement elem;
	public agentpage (WebDriver driver)
	{
		super(driver);
	}

    private By PayrollElem= By.xpath("//*[@id='payrollMenu']/a/span");
    
    private By runPayrollElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[2]/a");
    
	private By SearchAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By ClickSearchElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

//	private By ClickAgentElem = By.xpath("//TD[contains(text(),'VikasDemo')]");
	private By ClickAgentElem = By.xpath("//*[@id=\"tblReportData\"]/tbody/tr/td[1]/span");

	//private By ClickAgentElem = By.xpath("//*[@id=\"tblReportData\"]/tbody/tr[2]/td[1]/span");
	//private By ClickAgentElem = By.xpath("//*[@id=\"tblReportData\"]/tbody/tr/td[1]/span");
	private By AgntSetting = By.xpath("//span[text()='Settings']");
		
	private By EmailTmplate = By.xpath("//span[text()='Email Template']");
	    
	private By PayrollCis = By.xpath("//a[text()='Payroll & CIS']");
	    
	private By Editbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnEdit']");

	private By submitPensionContributionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[5]/a");

	private By submitRti=By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[3]/a");
	
	private By agentReport=By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_reportsMenu']/a");

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter SearchAgentName
	 * @throws InterruptedException 
     * @name Enter SearchAgentName
     */
   
 	public void Enter_SearchAgentName(String SearchAgentName) throws InterruptedException
 	{
 	    
 		//m_Driver.findElement(By.xpath("//*[@id='border-88836c01-9ee9-295d-2bfc-1f15b015af92']")).click();
 		WebElement elem = getWebElement(SearchAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchAgentNameElem.toString());
         }
 		
 		Thread.sleep(2000);

 		elem.sendKeys(SearchAgentName);
 		Reporter.log("Search Agent Name ="+SearchAgentName);
 		//Thread.sleep(150000);
 		
// 		ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);
  		Reporter.log("Enter_SearchAgentName");
 	}

     
	/**
 	 * Click ClickSearch
     * @name Click ClickSearch
     */
	public void Click_ClickSearch()
	{
        
		WebElement elem = getWebElement(ClickSearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSearch", "Click_ClickSearch failed. Unable to locate object: " + ClickSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSearch", "Click_ClickSearch failed. Unable to locate object: " + ClickSearchElem.toString());

			Assert.fail("Unable to locate object: " + ClickSearchElem.toString());
        }

		elem.click();
		Reporter.log("Click Search Btn");
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSearch");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSearch");
		
  		Reporter.log("Click_ClickSearch");

	}
	
	
	public void clickPayroll() throws Exception
	{
        
		WebElement elem = getWebElement(PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayroll", "clickPayroll failed. Unable to locate object: " + PayrollElem.toString());


			Assert.fail("Unable to locate object: " + PayrollElem.toString());
        }

		elem.click();
		Thread.sleep(2000);          	

		ExtentReportManager.passStep(m_Driver, "clickPayroll");

		
  		Reporter.log("clickPayroll");

	}

	
	public void clickAgentDashboard() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[1]/a"));

		elem.click();
		Thread.sleep(2000);          	

		ExtentReportManager.passStep(m_Driver, "clickAgentDashboard");

		
  		Reporter.log("clickAgentDashboard");

	}
	
	public void clickP11D() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div[2]/div/div/div[4]/div/div/a[1]"));

		elem.click();
		Thread.sleep(3000);          	

		ExtentReportManager.passStep(m_Driver, "clickP11D");

		
  		Reporter.log("clickP11D");

	}
	
	
	public void clickTotalClients() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div[2]/div/div/div[5]/div/div/a[1]"));

		elem.click();
		Thread.sleep(3000);          	

		ExtentReportManager.passStep(m_Driver, "clickTotalClients");

		
  		Reporter.log("clickTotalClients");

	}
	
	
	

	public void clickImportCompany() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnlBtnImportCompanies']"));

		elem.click();
		Thread.sleep(2000);          	

		ExtentReportManager.passStep(m_Driver, "clickImportCompany");

		
  		Reporter.log("clickImportCompany");

	}
	
	
	
	
	

	public void clickImportEmployee() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnImportEmployees']"));

		elem.click();
		Thread.sleep(2000);          	

		ExtentReportManager.passStep(m_Driver, "clickImportEmployee");

		
  		Reporter.log("clickImportEmployee");

	}
	
	
	public void createCrmInstance() throws Exception
	{
		
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_btnCreateCRMInstance']"));

		elem.click();
		Thread.sleep(2000);          	

		ExtentReportManager.passStep(m_Driver, "createCrmInstance");
		
  		Reporter.log("createCrmInstance");

	}
	
	
	public void createNewClient() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_btnAdd']"));

		elem.click();
		Thread.sleep(2000);          	

		ExtentReportManager.passStep(m_Driver, "createCrmInstance");
		
  		Reporter.log("createNewClient");

	}
	
	
	public void clickAutoPayrolls() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div[2]/div/div/div[1]/div/div/a[1]"));

		elem.click();
		Thread.sleep(3000);          	

		ExtentReportManager.passStep(m_Driver, "createAutoPayrolls");
		
  		Reporter.log("clickAutoPayrolls");

	}
	
	
	public void clickManualPayrolls() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div[2]/div/div/div[2]/div/div/a[1]"));

		elem.click();
		Thread.sleep(3000);          	

		ExtentReportManager.passStep(m_Driver, "createAutoPayrolls");
		
  		Reporter.log("clickManualPayrolls");

	}
	
	
	public void clickPension() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div[2]/div/div/div[3]/div/div/a[1]"));

		elem.click();
		Thread.sleep(3000);          	

		ExtentReportManager.passStep(m_Driver, "clickPension");
		
  		Reporter.log("clickPension");

	}
	
	
	public void clickAssign() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='tblReportData']/tbody/tr/td[3]/a"));

		elem.click();
		Thread.sleep(3000);          	

		ExtentReportManager.passStep(m_Driver, "clickAssign");
		
  		Reporter.log("clickAssign");

	}
	
	
	public void clickNotStarted() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='tblReportData']/tbody/tr/td[4]/a"));

		elem.click();
		Thread.sleep(3000);          	

		ExtentReportManager.passStep(m_Driver, "clickNotStarted");
		
  		Reporter.log("clickNotStarted");

	}
	

	
	public void clickPensionSubmitBtn() throws Exception
	{
        
		WebElement elem = getWebElement(submitPensionContributionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPensionSubmitBtn", "clickPensionSubmitBtn failed. Unable to locate object: " + submitPensionContributionElem.toString());


			Assert.fail("Unable to locate object: " + submitPensionContributionElem.toString());
        }

		elem.click();
		Thread.sleep(5000);          	

		ExtentReportManager.passStep(m_Driver, "clickPensionSubmitBtn");

		
  		Reporter.log("clickPensionSubmitBtn");

	}
	
	public void clickSubmitRtiBtn() throws Exception
	{
        
		WebElement elem = getWebElement(submitRti);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickubmitRtiBtn", "clickubmitRtiBtn failed. Unable to locate object: " + submitRti.toString());


			Assert.fail("Unable to locate object: " + submitRti.toString());
        }

		elem.click();
		Thread.sleep(5000);          	

		ExtentReportManager.passStep(m_Driver, "clickubmitRtiBtn");

		
  		Reporter.log("clickubmitRtiBtn");

	}
	public void clickSubmitP11DBtn() throws Exception
	{
        
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[4]/a"));


		elem.click();
		Thread.sleep(5000);          	

		ExtentReportManager.passStep(m_Driver, "clickSubmitP11DBtn");

		
  		Reporter.log("clickSubmitP11DBtn");

	}
	
	
     public void BrokenLink() {
    	 
    	    List<WebElement> links = m_Driver.findElements(By.tagName("a"));

    	    System.err.println(links.size());
            for (WebElement link : links) {
                String url = link.getAttribute("href");
                System.out.println(url);

                if (url == null || url.isEmpty() || !url.startsWith("http")) {
                    continue;
                }
                try {
                    HttpURLConnection connection =
                            (HttpURLConnection) new URL(url).openConnection();
                    connection.setConnectTimeout(5000);
                    connection.connect();

                    int statusCode = connection.getResponseCode();
System.err.println(statusCode);
                    if (statusCode >= 400) {
                        System.out.println("❌ Broken link: " + url +
                                           " | Status: " + statusCode);
                    }
                    

                } catch (Exception e) {
                    System.out.println("❌ Error link: " + url);
                }
            }

        }
     
     

 	
     public boolean BrokenLinkPdf() {
    	 
    	 WebElement pdfLink = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl03_lbtnFileName\"]"));
    	 String pdfUrl = pdfLink.getAttribute("href");
 
    	  try {
    	        HttpURLConnection connection =
    	                (HttpURLConnection) new URL(pdfUrl).openConnection();

    	        connection.setRequestMethod("HEAD");
    	        connection.setConnectTimeout(5000);
    	        connection.connect();

    	        int responseCode = connection.getResponseCode();
    	        String contentType = connection.getContentType();

    	        if (responseCode != 200) {
    	            System.out.println("❌ PDF response code: " + responseCode);
    	            return false;
    	        }

    	        if (contentType == null || !contentType.contains("pdf")) {
    	            System.out.println("❌ Not a PDF. Content-Type: " + contentType);
    	            return false;
    	        }

    	        System.out.println("✅ PDF response OK (200)");
    	        return true;

    	    } catch (Exception e) {
    	        System.out.println("❌ Exception checking PDF: " + e.getMessage());
    	        return false; // NO crash
    	    }


        }


     
	
	public void clickRunPayroll() throws Exception
	{
        
		WebElement elem = getWebElement(runPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRunPayroll", "clickRunPayroll failed. Unable to locate object: " + runPayrollElem.toString());


			Assert.fail("Unable to locate object: " + runPayrollElem.toString());
        }

		elem.click();
		Thread.sleep(5000);
		
		ExtentReportManager.passStep(m_Driver, "clickRunPayroll");

		
  		Reporter.log("clickRunPayroll");

	}
	
//	public void searchCompanyName(String data) throws Exception
// 	{
// 	    
// 		WebElement elem = getWebElement(By.xpath("//*[@id='search_input']"));
//
//	    ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
// 		
// 		String data = abc.client;
// 		elem.sendKeys(data);
// 		Reporter.log("searchCompanyName");
// 	}
	
	
	public void searchCompanyName() throws Exception
	{
	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(10));

	    // Step 1: Get company name from CreateClient (static, no new object)
	    String data = pages.CreateClient.client;

	    // Step 2: Fail fast if value was never set
	    if (data == null || data.isEmpty()) {
	        throw new IllegalStateException("CreateClient.client is null - client creation step did not set it");
	    }

	    // Step 3: Wait for the input and clear old text
	    WebElement elem = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search_input']")));
	    elem.clear();

	    // Step 4: Type the company name
	    elem.sendKeys(data);
	    Reporter.log("Typed company name: " + data, true);

	    // Step 5: Select the autocomplete suggestion
	    WebElement suggestion = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//*[contains(@class,'dropdown') or contains(@class,'suggest') or contains(@class,'autocomplete')]//*[normalize-space()='" + data + "']")));
	    suggestion.click();

	    // Step 6: Click Search
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnSearch']"))).click();
	    Reporter.log("searchCompanyName completed", true);
	}
	
	public void searchCompanyName1(String data) throws Exception
	{
	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(10));

	    // Step 1: Fail fast if value was not passed
	    if (data == null || data.isEmpty()) {
	        throw new IllegalStateException("searchCompanyName: data parameter is null/empty");
	    }

	    // Step 2: Wait for the input and clear old text
	    WebElement elem = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search_input']")));
	    elem.clear();

	    // Step 3: Type the company name
	    elem.sendKeys(data);
	    Reporter.log("Typed company name: " + data, true);

	    // Step 4: Select the autocomplete suggestion
	    WebElement suggestion = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//*[contains(@class,'dropdown') or contains(@class,'suggest') or contains(@class,'autocomplete')]//*[normalize-space()='" + data + "']")));
	    suggestion.click();

	    // Step 5: Click Search
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnSearch']"))).click();
	    Reporter.log("searchCompanyName completed", true);
	}
	public void clickSearchButton() throws Exception {
	    // Step 1: Wait until the Search button is clickable
	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(30));
	    WebElement btnSearch = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnSearch']")));

	    try {
	        // Step 2: Normal click
	        btnSearch.click();
	    } catch (ElementClickInterceptedException e) {
	        // Step 3: Fallback to JS click if another element overlays the button
	        ((JavascriptExecutor) m_Driver).executeScript("arguments[0].click();", btnSearch);
	    }

	    // Step 4: Wait for the page to reload (old button goes stale). If the page does not reload (AJAX), ignore
	    try {
	        new WebDriverWait(m_Driver, Duration.ofSeconds(30))
	                .until(ExpectedConditions.stalenessOf(btnSearch));
	    } catch (TimeoutException e) {
	        Reporter.log("Page did not reload, continuing with readyState wait", true);
	    }

	    // Step 5: Wait until the page is fully loaded
	    new WebDriverWait(m_Driver, Duration.ofSeconds(30)).until(d ->
	            ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));

	    Reporter.log("Clicked on Search button and page loaded", true);
	}
     
	/**
 	 * Click ClickAgent
	 * @throws InterruptedException 
     * @name Click ClickAgent
     */
//	public void Click_ClickAgent() throws InterruptedException
//	{
//		WebElement elem = getWebElement(ClickAgentElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickAgent", "Click_ClickAgent failed. Unable to locate object: " + ClickAgentElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickAgent", "Click_ClickAgent failed. Unable to locate object: " + ClickAgentElem.toString());
//
//			Assert.fail("Unable to locate object: " + ClickAgentElem.toString());
//        }
//
//		Thread.sleep(3000);
//
//		elem.click();
//	    Reporter.log("Click Searched Agen");
//		
//		ChangeWindow.tabswitch(m_Driver);
//		
//		Thread.sleep(1000);
// 
//		ExtentReportManager.passStep(m_Driver, "Click_ClickAgent");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_ClickAgent");
//  		Reporter.log("Click_ClickAgent");
//
//	}
	
	
	public void Click_ClickAgent() throws InterruptedException 
	{
	    int maxAttempts = 3;

	    for (int attempt = 1; attempt <= maxAttempts; attempt++) 
	    {
	        try 
	        {
	            WebElement elem = getWebElement(ClickAgentElem);

	            if (elem == null) 
	            {
	                ExtentReportManager.failStepWithScreenshot(
	                        m_Driver,
	                        "Click_ClickAgent",
	                        "Click_ClickAgent failed. Unable to locate object: "
	                                + ClickAgentElem.toString());

	                TestModellerLogger.FailStepWithScreenshot(
	                        m_Driver,
	                        "Click_ClickAgent",
	                        "Click_ClickAgent failed. Unable to locate object: "
	                                + ClickAgentElem.toString());

	                Assert.fail("Unable to locate object: " + ClickAgentElem.toString());
	            }

	            Thread.sleep(3000);

	            // Re-locate element just before click
	            elem = getWebElement(ClickAgentElem);

	            if (elem == null) {
	                throw new StaleElementReferenceException("Element not available");
	            }

	            elem.click();

	            Reporter.log("Click Searched Agent");

	            ChangeWindow.tabswitch(m_Driver);

	            Thread.sleep(1000);

	            ExtentReportManager.passStep(m_Driver, "Click_ClickAgent");
	            TestModellerLogger.PassStep(m_Driver, "Click_ClickAgent");
	            Reporter.log("Click_ClickAgent");

	            return; // Click successful
	        } 
	        catch (StaleElementReferenceException e) 
	        {
	            Reporter.log("Stale element while clicking Agent. Retry: "
	                    + attempt + "/" + maxAttempts);

	            if (attempt == maxAttempts) 
	            {
	                ExtentReportManager.failStepWithScreenshot(
	                        m_Driver,
	                        "Click_ClickAgent",
	                        "Click failed after " + maxAttempts
	                                + " attempts due to stale element.");

	                TestModellerLogger.FailStepWithScreenshot(
	                        m_Driver,
	                        "Click_ClickAgent",
	                        "Click failed after " + maxAttempts
	                                + " attempts due to stale element.");

	                Assert.fail("Click_ClickAgent failed due to StaleElementReferenceException.");
	            }

	            Thread.sleep(1000);
	        }
	    }
	}
	
	
	public void Click_ClickAgent1() throws InterruptedException
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='tblReportData']/tbody/tr[2]/td[1]/span"));
		
		elem.click();

		Thread.sleep(3000);
		
	ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(1000);
		
  		Reporter.log("Click_ClickAgent");

	}
	
	/**
	 * Click click on AgentSetting
 * @name AgntSettings
 */
public void Click_AgentSetting()
{
    
	elem = getWebElement(AgntSetting);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AgentSetting", "Click_AgentSetting failed. Unable to locate object: " + AgntSetting.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AgentSetting", "Click_AgentSetting failed. Unable to locate object: " + AgntSetting.toString());

		Assert.fail("Unable to locate object: " + AgntSetting.toString());
    }

	elem.click();
      	

	ExtentReportManager.passStep(m_Driver, "Click_AgentSetting");

	TestModellerLogger.PassStep(m_Driver, "Click_AgentSetting");
}

/**
 * Click click on PayrollandCis
* @name PayrollCiss
*/
public void Click_PayrollandCis()
{

elem = getWebElement(PayrollCis);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollandCis", "Click_PayrollandCis failed. Unable to locate object: " + PayrollCis.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayrollandCis", "Click_PayrollandCis failed. Unable to locate object: " + PayrollCis.toString());

	Assert.fail("Unable to locate object: " + PayrollCis.toString());
}

elem.click();
  	

ExtentReportManager.passStep(m_Driver, "Click_PayrollandCis");

TestModellerLogger.PassStep(m_Driver, "Click_PayrollandCis");
}

/**
 * Click click on EmailTemplate
* @name EmailTmplates
*/
public void Click_EmailTemplate()
{

elem = getWebElement(EmailTmplate);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailTemplate", "Click_EmailTemplate failed. Unable to locate object: " + EmailTmplate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailTemplate", "Click_EmailTemplate failed. Unable to locate object: " + EmailTmplate.toString());

	Assert.fail("Unable to locate object: " + EmailTmplate.toString());
}

elem.click();
  	

ExtentReportManager.passStep(m_Driver, "Click_EmailTemplate");

TestModellerLogger.PassStep(m_Driver, "Click_EmailTemplate");
}

/**
 * Click on Click_EditButton
* @name Edit button
*/
public void Click_EditButton()
{

elem = getWebElement(Editbtn);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + Editbtn.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + Editbtn.toString());

	Assert.fail("Unable to locate object: " + Editbtn.toString());
}

elem.click();
  	

ExtentReportManager.passStep(m_Driver, "Click_EditButton");

TestModellerLogger.PassStep(m_Driver, "Click_EditButton");
}




/**
 * Click on Click_AgentReport
* @name Edit button
*/
public void ClickAgentReport()
{

elem = getWebElement(agentReport);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickAgentReport", "ClickAgentReport failed. Unable to locate object: " + agentReport.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickAgentReport", "ClickAgentReport failed. Unable to locate object: " + agentReport.toString());

	Assert.fail("Unable to locate object: " + agentReport.toString());
}

elem.click();
  	

ExtentReportManager.passStep(m_Driver, "ClickAgentReport");

TestModellerLogger.PassStep(m_Driver, "ClickAgentReport");
}


public void ClickReportsName(int index) throws InterruptedException
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='Reports']/table/tbody/tr["+index+"]/td/a"));


	elem.click();
	
	
	Thread.sleep(3000);

	Reporter.log("ClickReportsName");
}

  public void enterCompanyName() {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtCompanyName']"));
	  
	  pages.CreateClient abc= new pages.CreateClient(m_Driver);
 		
 		String data = abc.client;
 		element.sendKeys(data);
 		
 		Reporter.log("enterCompanyName");
  }
  
  

  public void enterCompanyName1(String data) throws Exception {
	  
	  
		

	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='search_input']"));
	  
	  
//	  pages.CreateClient abc= new pages.CreateClient(m_Driver);
// 		
// 		String data = abc.client;
	  
 		element.sendKeys(data);
 		
 		Thread.sleep(2000);
 		

 		m_Driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")).click();

 		Thread.sleep(2000);
 		
 		Reporter.log("enterCompanyName1");
  }
  
  

  public void enterCompanyName2(String data) throws Exception {
	  
	  
		

	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='search_input']"));
	  
	  
//	  pages.CreateClient abc= new pages.CreateClient(m_Driver);
// 		
// 		String data = abc.client;
	  
 		element.sendKeys(data);
 		
 		

 		//m_Driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")).click();

 		Thread.sleep(2000);
 		
 		Reporter.log("enterCompanyName2");
  }
  
  
  
  public void updateName() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']"));
	  element.click();
	  
	  Thread.sleep(5000);
	  
	  Reporter.log("updateName");
	  
  }
  
  
public void clickRunPayroll2() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSubmitOnline']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickRunPayroll2");
	  
  }


public void clicKSendEmail() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnlBtnEmailOverDues']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clicKSendEmail");
	  
}



public void clicKCheckBox() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='rowChkhd']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clicKCheckBox");
	  
}


public void clicKSelectCompany() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnlBtnEmailOverDues']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clicKSendEmail");
	  
}



public void clicKSubmitRti() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[3]/a"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clicKSubmitRti");
	  
}

public void updateName1() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']"));
	  element.click();
	  
	  Thread.sleep(9000);
	  
	  Reporter.log("updateName1");
	  
  }
  

public void clicKUndoPayroll() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_btnUndoPayroll']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clicKUndoPayroll");
	  
}
  

public void clickFPS() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickFPS");
	  
}


public void clickEPS() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_lnkTaxReturnType']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickEPS");
	  
}


public void clickInlineDropDown() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_DotsDropDown']/a"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickInlineDropDown");
	  
}


public void clickValidateSubmitHmrc() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSubmitRTI']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickValidateSubmitHmrc");
	  
}



public void clickPending() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionReport']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickPending");
	  
}


public void clickNotToSubmit() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickNotToSubmit");
	  
}



public void clickSubmitRtiCheckBox() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickSubmitRtiCheckBox");
	  
}



public void clickSendEmailSubmitRti() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionReport']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickPending");
	  
}


public void clicKSubmitP11D() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[4]/a"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clicKSubmitP11D");
	  
}



public void clickP11DSubmitToHmrc() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSubmitToHmrc']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickP11DSubmitToHmrc");
	  
}



public void clickP11DNotToSubmit() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickP11DNotToSubmit");
	  
}



public void clickP11Dxml() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_XML']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickP11Dxml");
	  
}



public void clickP11DSelectEmolyee() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickP11DSendEmail");
	  
}

public void clickP11DSendEmail() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnlBtnEmailOverDues']"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickP11DSendEmail");
	  
}



public void clickP11DCompany() throws Exception {
	  
	  WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_tdltCompanyName']/a"));
	  element.click();
	  
	  Thread.sleep(3000);
	  
	  Reporter.log("clickP11DCompany");
	  
}


public void clickSubmitPensionCotribution() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[5]/a"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotribution");

	
	Reporter.log("clickSubmitPensionCotribution");

}



public void clickSubmitPensionCotributionSubmitBtn() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSubmitContributionToPS']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionSubmitBtn");

	
	Reporter.log("clickSubmitPensionCotributionSubmitBtn");

}


public void clickSubmitPensionCotributionNotToSubmit() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionNotToSubmit");

	
	Reporter.log("clickSubmitPensionCotributionNotToSubmit");

}



public void clickSubmitPensionCotributionAssign() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkAcct']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionAssign");

	
	Reporter.log("clickSubmitPensionCotributionAssign");

}



public void clickSubmitPensionCotributionNotStarted() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkStatus']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionNotStarted");

	
	Reporter.log("clickSubmitPensionCotributionNotStarted");

}



public void clickSubmitPensionCotributionInlineDropdown() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_DotsDropDown']/a"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionInlineDropdown");

	
	Reporter.log("clickSubmitPensionCotributionInlineDropdown");

}



public void clickSubmitPensionCotributionxml() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkXMLPopup']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionxml");

	
	Reporter.log("clickSubmitPensionCotributionxml");

}



public void clickSubmitPensionCotributionEdit() throws Exception
{
    
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkEdit1']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionEdit");

	
	Reporter.log("clickSubmitPensionCotributionEdit");

}



public void clickSubmitPensionCotributionOpen() throws Exception
{
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkOpen']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionOpen");

	
	Reporter.log("clickSubmitPensionCotributionOpen");

}



public void selectSubmitPensionCotributionCompany() throws Exception
{
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect']"));


	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "selectSubmitPensionCotributionCompany");
	
	Reporter.log("selectSubmitPensionCotributionCompany");

}



public void ClickSubmitPensionCotributionSendEmail() throws Exception
{
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnlBtnEmailOverDues']"));

	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "selectSubmitPensionCotributionSendEmail");
	
	Reporter.log("selectSubmitPensionCotributionSendEmail");

}



public void clickSubmitPensionCotributionCompany() throws Exception
{
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnlBtnEmailOverDues']"));

	elem.click();
	Thread.sleep(3000);          	

	ExtentReportManager.passStep(m_Driver, "clickSubmitPensionCotributionCompany");
	
	Reporter.log("clickSubmitPensionCotributionCompany");

}



}