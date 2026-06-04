package _2044CIS_Submt;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9fb85636-f5c7-4ed4-88ba-a0ed02e0aa2c
@TestModellerModule(guid = "9fb85636-f5c7-4ed4-88ba-a0ed02e0aa2c")
public class AddCISContrctor extends BasePage
{
	public WebElement elem;
	public AddCISContrctor (WebDriver driver)
	{
		super(driver);
	}

	private By clickContractorListElem = By.xpath("//A[contains(text(),'Contractor List')]");

	private By SearchContractorNameElem = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlSearch']");

	private By EnterContractorNameElem = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearch']");

	private By Updatebtn = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ClickoncontractorName = By.xpath("(//a[@target='_blank'])[3]");

	private By ImpCIScontractor = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_lnlBtnImportContractor']");
	
	private By ChooseFil = By.xpath("//label[text()='Contractor CSV:']");
	
	private By Uploadbtn = By.xpath("(//a[text()='Upload'])[2]");
	
	private By Nxtbtn = By.xpath("//a[text()='Next']");
	
	private By Importbtn = By.xpath("//a[text()='Import']");
	
	private By Dashboardbtn = By.xpath("//span[text()='Dashboard']");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox2.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox2.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox2.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox2.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx";

        if (!currentUrl.equals("http://sandbox2.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

   	/**
 	 * Click clickContractorList
     * @name Click clickContractorList
     */
	public void Click_clickContractorList()
	{
        
		elem = getWebElement(clickContractorListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickContractorList", "Click_clickContractorList failed. Unable to locate object: " + clickContractorListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickContractorList", "Click_clickContractorList failed. Unable to locate object: " + clickContractorListElem.toString());

			Assert.fail("Unable to locate object: " + clickContractorListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickContractorList");

		TestModellerLogger.PassStep(m_Driver, "Click_clickContractorList");
	}

   /*   
	/**
 	 * Enter Search ContractorName
     * @name Search EnterContractorName
    */
 	public void Search_ContractorName() throws InterruptedException
 	{
 	    
 		 elem = getWebElement(SearchContractorNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Search_ContractorName()", "Search_ContractorName() failed. Unable to locate object: " + SearchContractorNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Search_ContractorName()", "Search_ContractorName() failed. Unable to locate object: " + SearchContractorNameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchContractorNameElem.toString());
         }

 		Select sel = new Select(elem);
 		sel.selectByVisibleText("Name");
 		Thread.sleep(2000);
 		
  		ExtentReportManager.passStep(m_Driver, "Search_ContractorName()");

  		TestModellerLogger.PassStep(m_Driver, "Search_ContractorName()");
 	}

     
	/**
 	 * Click EnterContractorname
     * @name EnterContractorname
     */
 
	public void Enter_Contractorname(String Contactorname)
	{
        
		 elem = getWebElement(EnterContractorNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Contractorname", "Enter_Contractorname failed. Unable to locate object: " + EnterContractorNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Contractorname", "Enter_Contractorname failed. Unable to locate object: " + EnterContractorNameElem.toString());

			Assert.fail("Unable to locate object: " + EnterContractorNameElem.toString());
        }

		elem.sendKeys(Contactorname);
          	

		ExtentReportManager.passStep(m_Driver, "Enter_Contractorname");

		TestModellerLogger.PassStep(m_Driver, "Enter_Contractorname");
	}

     
	/**
 	 * Click Update btn
     * @name Updatebtn
    */
	public void Click_Updatebtn()
	{
        
		 elem = getWebElement(Updatebtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Updatebtn", "Click_Updatebtn failed. Unable to locate object: " + Updatebtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Updatebtn", "Click_Updatebtn failed. Unable to locate object: " + Updatebtn.toString());

			Assert.fail("Unable to locate object: " + Updatebtn.toString());
        }

		elem.click();
		
	ExtentReportManager.passStep(m_Driver, "Click_Updatebtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Updatebtn");
		
	}
	/**
 	 * Click ContractorName
     * @name ContractorName
    */
	
	public void Click_ContractorName()
	{
		 elem = getWebElement(ClickoncontractorName);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ContractorName", "Click_ContractorName failed. Unable to locate object: " + ClickoncontractorName.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ContractorName", "Click_ContractorName failed. Unable to locate object: " + ClickoncontractorName.toString());

				Assert.fail("Unable to locate object: " + ClickoncontractorName.toString());
	        }

			elem.click();
			ChangeWindow.tabswitch(m_Driver);
			
		ExtentReportManager.passStep(m_Driver, "Click_ContractorName");

			TestModellerLogger.PassStep(m_Driver, "Click_ContractorName");
				
	}
	
	public void Click_importCIScontractor() throws InterruptedException
	{
       elem = getWebElement(ImpCIScontractor);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_importCIScontractor", "Click_importCIScontractor. Unable to locate object: " + ImpCIScontractor.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_importCIScontractor", "Click_importCIScontractor. Unable to locate object: " + ImpCIScontractor.toString());

			Assert.fail("Unable to locate object: " + ImpCIScontractor.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_importCIScontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_importCIScontractor");
	}
	
	public void Click_ChooseFile() throws InterruptedException, IOException, AWTException
	{
       elem = getWebElement(ChooseFil);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_importCIScontractor", "Click_importCIScontractor. Unable to locate object: " + ChooseFil.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_importCIScontractor", "Click_importCIScontractor. Unable to locate object: " + ChooseFil.toString());

			Assert.fail("Unable to locate object: " + ChooseFil.toString());
        }
		
		
	//	System.out.println(elem.getText());
		
	
		Robot r = new Robot();
		elem.click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec("C:\\Users\\Shiv\\Documents\\SampleC.exe");
   //	Runtime.getRuntime().exec("D:\\Sample1.exe"); // no emails registered
	  
	/*	for(int i =0;i<2;i++)
		{
          r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_C);
		 Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
	*/
		 Thread.sleep(5000);
	    System.out.println("File Posted");
		ExtentReportManager.passStep(m_Driver, "Click_importCIScontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_importCIScontractor");
	}
	
	public void Click_Uploadbtn()
	{
       elem = getWebElement(Uploadbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Uploadbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Uploadbtn.toString());

			Assert.fail("Unable to locate object: " + Uploadbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_uploadbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_uploadbtn");
	}
	
	public void Click_Nextbtn()
	{
       elem = getWebElement(Nxtbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Nxtbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Nxtbtn.toString());

			Assert.fail("Unable to locate object: " + Nxtbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_uploadbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_uploadbtn");
	}
	
	public void Click_Importbtn()
	{
       elem = getWebElement(Importbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Importbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Importbtn.toString());

			Assert.fail("Unable to locate object: " + Importbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_uploadbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_uploadbtn");
	}
	
	public void Click_Dashboardbtn()
	{
       elem = getWebElement(Dashboardbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Dashboardbtn", "Click_Dashboardbtn. Unable to locate object: " + Dashboardbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Dashboardbtn", "Click_Dashboardbtn. Unable to locate object: " + Dashboardbtn.toString());

			Assert.fail("Unable to locate object: " + Dashboardbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_Dashboardbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Dashboardbtn");
	}
	
}