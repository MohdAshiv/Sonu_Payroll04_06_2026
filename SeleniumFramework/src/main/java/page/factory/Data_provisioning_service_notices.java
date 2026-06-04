package page.factory;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6f11256b-3ae9-4384-b9da-39018717a9eb
@TestModellerModule(guid = "6f11256b-3ae9-4384-b9da-39018717a9eb")
public class Data_provisioning_service_notices extends BasePage
{
	public Data_provisioning_service_notices (WebDriver driver)
	{
		super(driver);
	}


	
	private By Data_Provisioning_Service_DPS_noticesElem = By.xpath("//SPAN[contains(text(),'Data Provisioning Service (DPS) notices')]");

	private By ctl00ctl00ParentContentcPHFilterddlPayrollDateElem = By.xpath("//label[normalize-space()= 'Notification:']/../div/select");

	private By ctl00ctl00ParentContentcPHFiltertxtCompanyElem = By.xpath("//label[normalize-space()= 'Company:']/../div/input");

	private By ctl00ctl00ParentContentcPHFiltertxtDateFromElem = By.xpath("//label[normalize-space()= 'Date Range:']/../div/div/input[1]");

	private By ctl00ctl00ParentContentcPHFiltertxtDateToElem = By.xpath("//label[normalize-space()= 'Date Range:']/../div/div/input[2]");

	private By SearchElem = By.xpath("//label[normalize-space()= '']/../div/a");

	private By No_Records_FoundElem = By.xpath("//TD[contains(text(),'No Records Found')]");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportSLNotifications.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportSLNotifications.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportSLNotifications.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportSLNotifications.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportSLNotifications.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Data Provisioning Service (DPS) notices
     * @name Click Data Provisioning Service (DPS) notices
     */
	public void Click_Data_Provisioning_Service_DPS_notices()
	{
        
		WebElement elem = getWebElement(Data_Provisioning_Service_DPS_noticesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Data_Provisioning_Service_DPS_notices", "Click_Data_Provisioning_Service_DPS_notices failed. Unable to locate object: " + Data_Provisioning_Service_DPS_noticesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Data_Provisioning_Service_DPS_notices", "Click_Data_Provisioning_Service_DPS_notices failed. Unable to locate object: " + Data_Provisioning_Service_DPS_noticesElem.toString());

			Assert.fail("Unable to locate object: " + Data_Provisioning_Service_DPS_noticesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Data_Provisioning_Service_DPS_notices");

		TestModellerLogger.PassStep(m_Driver, "Click_Data_Provisioning_Service_DPS_notices");
	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlPayrollDate
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlPayrollDate
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlPayrollDate(String ctl00ctl00ParentContentcPHFilterddlPayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlPayrollDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlPayrollDate", "Select_ctl00ctl00ParentContentcPHFilterddlPayrollDate failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlPayrollDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlPayrollDate", "Select_ctl00ctl00ParentContentcPHFilterddlPayrollDate failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlPayrollDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlPayrollDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlPayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlPayrollDate " + ctl00ctl00ParentContentcPHFilterddlPayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlPayrollDate " + ctl00ctl00ParentContentcPHFilterddlPayrollDate);
 	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtCompany
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtCompany
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtCompany(String ctl00ctl00ParentContentcPHFiltertxtCompany)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtCompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtCompanyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtCompanyElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtCompany);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtCompany " + ctl00ctl00ParentContentcPHFiltertxtCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtCompany " + ctl00ctl00ParentContentcPHFiltertxtCompany);
 	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtDateFrom
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtDateFrom
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtDateFrom(String ctl00ctl00ParentContentcPHFiltertxtDateFrom)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtDateFromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateFrom", "Enter_ctl00ctl00ParentContentcPHFiltertxtDateFrom failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtDateFromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateFrom", "Enter_ctl00ctl00ParentContentcPHFiltertxtDateFrom failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtDateFromElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtDateFromElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtDateFrom);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateFrom " + ctl00ctl00ParentContentcPHFiltertxtDateFrom);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateFrom " + ctl00ctl00ParentContentcPHFiltertxtDateFrom);
 	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtDateTo
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtDateTo
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtDateTo(String ctl00ctl00ParentContentcPHFiltertxtDateTo)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtDateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateTo", "Enter_ctl00ctl00ParentContentcPHFiltertxtDateTo failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtDateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateTo", "Enter_ctl00ctl00ParentContentcPHFiltertxtDateTo failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtDateToElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtDateToElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtDateTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateTo " + ctl00ctl00ParentContentcPHFiltertxtDateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtDateTo " + ctl00ctl00ParentContentcPHFiltertxtDateTo);
 	}

     
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
 	 * Click No Records Found
     * @name Click No Records Found
     */
	public void Click_No_Records_Found()
	{
        
		WebElement elem = getWebElement(No_Records_FoundElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_No_Records_Found", "Click_No_Records_Found failed. Unable to locate object: " + No_Records_FoundElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_No_Records_Found", "Click_No_Records_Found failed. Unable to locate object: " + No_Records_FoundElem.toString());

			Assert.fail("Unable to locate object: " + No_Records_FoundElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_No_Records_Found");

		TestModellerLogger.PassStep(m_Driver, "Click_No_Records_Found");
	}

     
	/**
 	 * Click Employer View
     * @name Click Employer View
     */
	public void Click_Employer_View()
	{
        
		WebElement elem = getWebElement(Employer_ViewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

			Assert.fail("Unable to locate object: " + Employer_ViewElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employer_View");

		TestModellerLogger.PassStep(m_Driver, "Click_Employer_View");
	}
}