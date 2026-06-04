package _1399subContr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import pages.BasePage;
import pages.Library;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import utilities.ClosePopup;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6ad2cfda-e4ca-4d4d-af45-e78001fb1127
@TestModellerModule(guid = "6ad2cfda-e4ca-4d4d-af45-e78001fb1127")
public class AgentSearch extends BasePage
{
	Library s1;
	public AgentSearch (WebDriver driver)
	{
		super(driver);
		s1=new Library(m_Driver);
	}
	//@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany

	private By AgentsElem = By.xpath("//LI[@class='dashboard_nav active']/A/SPAN[@class='side_nav_text']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//*[@id='ctl00_cPHFilter_txtAgentName']");

	private By SearchElem = By.xpath("//*[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nidhi1_Elem = By.xpath("//TD[@style='cursor: pointer;']");

	//private By _Nidhi1_Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[1]/span");
	//private By status_dropdownElem = By.xpath("//label[normalize-space()= 'Status:']/../div/select");

	//private By Trial_dropdownElem = By.xpath("//label[normalize-space()= 'Trial:']/../div/select");

 


	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx");
	}
	

     
	/**
 	 * AssertUrl
     * @name AssertUrl
   */
// public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//       }
//    }

     
	/**
 	 * Click Agents
     * @name Click Agents
     */
	public void Click_Agents()
	{
        
		WebElement elem = getWebElement(AgentsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Agents", "Click_Agents failed. Unable to locate object: " + AgentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Agents", "Click_Agents failed. Unable to locate object: " + AgentsElem.toString());

			Assert.fail("Unable to locate object: " + AgentsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Agents");

		TestModellerLogger.PassStep(m_Driver, "Click_Agents");
	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtAgentName
	 * @throws InterruptedException 
     * @name Enter ctl00$cPHFilter$txtAgentName
     */
 	public void Enter_ctl00cPHFiltertxtAgentName(String ctl00cPHFiltertxtAgentName) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFiltertxtAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());
         }
 //		ClosePopup.ValidateAndPopUp(m_Driver);
 		//jse. executeScript("arguments[0]. value='---your email id---';", email);
  		
jsExec.executeScript("arguments[0].value='"+ctl00cPHFiltertxtAgentName+"';",elem);
 		//elem.sendKeys(ctl00cPHFiltertxtAgentName);
 		System.out.println("hi");
 		
 		ClosePopup.ValidateAndPopUp(m_Driver);
 	
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);
  		
  	
  		
 	}
 	
 	
 	
 
 	
 	
/**
 	 * Select status_dropdown
     * @name Select status_dropdown
     */
//    public void Select_status_dropdown(String status_dropdown)
// 	{
// 	    
// 		WebElement elem = getWebElement(status_dropdownElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_status_dropdown", "Select_status_dropdown failed. Unable to locate object: " + status_dropdownElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_status_dropdown", "Select_status_dropdown failed. Unable to locate object: " + status_dropdownElem.toString());
//
// 			Assert.fail("Unable to locate object: " + status_dropdownElem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(status_dropdown);
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_status_dropdown " + status_dropdown);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_status_dropdown " + status_dropdown);
// 	}

    
	/**
 	 * Select Trial_dropdown
     * @name Select Trial_dropdown
     */
//    public void Select_Trial_dropdown(String Trial_dropdown)
// 	{
// 	    
// 		WebElement elem = getWebElement(Trial_dropdownElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Trial_dropdown", "Select_Trial_dropdown failed. Unable to locate object: " + Trial_dropdownElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Trial_dropdown", "Select_Trial_dropdown failed. Unable to locate object: " + Trial_dropdownElem.toString());
//
// 			Assert.fail("Unable to locate object: " + Trial_dropdownElem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(Trial_dropdown);
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_Trial_dropdown " + Trial_dropdown);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_Trial_dropdown " + Trial_dropdown);
// 	}


     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
          	
		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}
   
	/**
 	 * Click  Nidhi1 
	 * @throws InterruptedException 
     * @name Click  Nidhi1 
     */
	public void Click__Nidhi1_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Nidhi1_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nidhi1_", "Click__Nidhi1_ failed. Unable to locate object: " + _Nidhi1_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nidhi1_", "Click__Nidhi1_ failed. Unable to locate object: " + _Nidhi1_Elem.toString());

			Assert.fail("Unable to locate object: " + _Nidhi1_Elem.toString());
	          }

		elem.click();
		Thread.sleep(1000);
          	
	    Library.Switchwindow(1, m_Driver);
	    
	    ClosePopup.ValidateAndPopUp(m_Driver);
	    
	    
	    
	    
//		ExtentReportManager.passStep(m_Driver, "Click__Nidhi1_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Nidhi1_");
	    
		
	}
//	public boolean handlepopup2()
//    {
//        boolean data=false;
//        try
//        {
//        	
//        	
//        	//Thread.sleep(9000);
//            WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"53116807-e35f-4327-8588-7bcee00c209d\"]"));
//        	
//        	
//            WebDriverWait wait = new WebDriverWait(m_Driver, 180);
//            wait.until(ExpectedConditions.visibilityOf(ele));
//            ele.click();
//            System.out.println(true);
//            return true;
//        } catch (Exception e)
//        {
//            System.out.println(false);
//            return data;
//        }
//    }
}