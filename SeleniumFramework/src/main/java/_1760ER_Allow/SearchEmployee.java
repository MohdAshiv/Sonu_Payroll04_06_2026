package _1760ER_Allow;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/774330e8-455c-4995-93ab-9dd72beba8ed
@TestModellerModule(guid = "774330e8-455c-4995-93ab-9dd72beba8ed")
public class SearchEmployee extends BasePage
{
	public SearchEmployee (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickEmployeeListElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefEmployeeList']");

	private By SelectEmployeeStatusElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlEmployeeStatus']");

	private By EnterEmployeeNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearch']");

	private By clickSearchElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By clickonEmpNameElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickEmployeeList
	 * @throws Exception 
     * @name Click clickEmployeeList
     */
	public void Click_clickEmployeeList() throws Exception
	{
        
		WebElement elem = getWebElement(clickEmployeeListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEmployeeList", "Click_clickEmployeeList failed. Unable to locate object: " + clickEmployeeListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEmployeeList", "Click_clickEmployeeList failed. Unable to locate object: " + clickEmployeeListElem.toString());

			Assert.fail("Unable to locate object: " + clickEmployeeListElem.toString());
        }
        Thread.sleep(1000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEmployeeList");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEmployeeList");
	}

    
	/**
 	 * Select SelectEmployeeStatus
     * @name Select SelectEmployeeStatus
     */
    public void Select_SelectEmployeeStatus(String SelectEmployeeStatus)
 	{
 	    
 		WebElement elem = getWebElement(SelectEmployeeStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectEmployeeStatus", "Select_SelectEmployeeStatus failed. Unable to locate object: " + SelectEmployeeStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectEmployeeStatus", "Select_SelectEmployeeStatus failed. Unable to locate object: " + SelectEmployeeStatusElem.toString());

 			Assert.fail("Unable to locate object: " + SelectEmployeeStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectEmployeeStatus);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectEmployeeStatus " + SelectEmployeeStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectEmployeeStatus " + SelectEmployeeStatus);
 	}

      
	/**
 	 * Enter EnterEmployeeName
     * @name Enter EnterEmployeeName
     */
 	public void Enter_EnterEmployeeName(String EnterEmployeeName)
 	{
 	    
 		WebElement elem = getWebElement(EnterEmployeeNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterEmployeeName", "Enter_EnterEmployeeName failed. Unable to locate object: " + EnterEmployeeNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterEmployeeName", "Enter_EnterEmployeeName failed. Unable to locate object: " + EnterEmployeeNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterEmployeeNameElem.toString());
         }

 		elem.sendKeys(EnterEmployeeName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterEmployeeName " + EnterEmployeeName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterEmployeeName " + EnterEmployeeName);
 	}

     
	/**
 	 * Click clickSearch
     * @name Click clickSearch
     */
	public void Click_clickSearch()
	{
        
		WebElement elem = getWebElement(clickSearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSearch", "Click_clickSearch failed. Unable to locate object: " + clickSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSearch", "Click_clickSearch failed. Unable to locate object: " + clickSearchElem.toString());

			Assert.fail("Unable to locate object: " + clickSearchElem.toString());
        }

		elem.click();
		
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]")).click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSearch");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSearch");
	}

     
	/**
 	 * Click clickonEmpName
     * @name Click clickonEmpName
     */
	public void Click_clickonEmpName()
	{
        
		WebElement elem = getWebElement(clickonEmpNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickonEmpName", "Click_clickonEmpName failed. Unable to locate object: " + clickonEmpNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickonEmpName", "Click_clickonEmpName failed. Unable to locate object: " + clickonEmpNameElem.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickonEmpName");

		TestModellerLogger.PassStep(m_Driver, "Click_clickonEmpName");
	}
}