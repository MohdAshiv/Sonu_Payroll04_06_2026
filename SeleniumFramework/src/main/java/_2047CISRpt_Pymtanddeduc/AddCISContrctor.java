package _2047CISRpt_Pymtanddeduc;

import pages.BasePage;
import org.openqa.selenium.By;
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


	
	private By clickCISElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_CIS']/A");

	private By clickContractorListElem = By.xpath("//A[contains(text(),'Contractor List')]");

	private By SearchContractorNameElem = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlSearch']");

	private By EnterContractorNameElem = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearch']");

	private By Updatebtn = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ClickoncontractorName = By.xpath("(//a[@target='_blank'])[3]");
	
	private By clickNameElem= By.xpath("//*[@id='tblContribution']/tbody/tr[2]/td[2]/a");

	private By click3DotsElem= By.xpath("//*[@class='report_icon dropdown-toggle']");
	
	private By clickEditElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkEditContractor']");
	
	private By subcontractorElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkNewSubcontractor']");

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
 	 * Click clickCIS
     * @name Click clickCIS
     */
	public void Click_clickCIS()
	{
        
		 elem = getWebElement(clickCISElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickCIS", "Click_clickCIS failed. Unable to locate object: " + clickCISElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickCIS", "Click_clickCIS failed. Unable to locate object: " + clickCISElem.toString());

			Assert.fail("Unable to locate object: " + clickCISElem.toString());
        }

		elem.click();
		
		ClosePopup.ValidateAndPopUp(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickCIS");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCIS");
		
		Reporter.log("Click_clickCIS");
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
		
		Reporter.log("Click_clickContractorList");

	}
	
	public void click3Dots()
	{
        
		elem = getWebElement(click3DotsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots", "click3Dots failed. Unable to locate object: " + click3DotsElem.toString());


			Assert.fail("Unable to locate object: " + clickContractorListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "click3Dots");

	}

	
	public void clickEditBtn()
	{
        
		elem = getWebElement(clickEditElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditBtn", "clickEditBtn failed. Unable to locate object: " + clickEditElem.toString());


			Assert.fail("Unable to locate object: " + clickEditElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "clickEditBtn");

	}

	

	public void clickSubContractor()
	{
        
		elem = getWebElement(subcontractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditBtn", "clickEditBtn failed. Unable to locate object: " + subcontractorElem.toString());


			Assert.fail("Unable to locate object: " + subcontractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "clickSubContractor");

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
	
	
	
	public void Click_ContractorName1()
	{
		 elem = getWebElement(clickNameElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ContractorName1", "Click_ContractorName1 failed. Unable to locate object: " + clickNameElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ContractorName1", "Click_ContractorName1 failed. Unable to locate object: " + clickNameElem.toString());

				Assert.fail("Unable to locate object: " + clickNameElem.toString());
	        }

			elem.click();
			ChangeWindow.tabswitch(m_Driver);
			
		ExtentReportManager.passStep(m_Driver, "Click_ContractorName1");

			TestModellerLogger.PassStep(m_Driver, "Click_ContractorName1");
			
			Reporter.log("Click_ContractorName1");
				
	}
	
	
	
}