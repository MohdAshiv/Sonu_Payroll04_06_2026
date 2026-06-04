package EPS;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/23166f65-080a-4e6a-9fa8-7a53e5bea93b
@TestModellerModule(guid = "23166f65-080a-4e6a-9fa8-7a53e5bea93b")
public class EMPSearchAndPaternitypage extends BasePage
{
	public EMPSearchAndPaternitypage (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickEmployeeListElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefEmployeeList']");

	private By selectEmployeeStatusElem = By.xpath("//label[contains(.,'Employee Status :')]/../select");

	private By SearchEmployeFirstNameElem = By.xpath("//label[contains(.,'Employee Status :')]/../../div[2]/input");

	private By clickSearchElem = By.xpath("//label[contains(.,'Employee Status :')]/../../div[2]/a");

	private By clickonEmpNameElem = By.xpath("//A[contains(text(),'Male')]");

	private By clickAddLeaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefSMP']");

	private By getStartDatePaternityElem = By.xpath("//label[contains(.,'Leave Start Date:')]/../div[1]/div/input");

	private By getEndDatePaternityElem = By.xpath("//label[contains(.,'Leave End Date:')]/../div/div/input");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/SMPEditor.aspx?PayrollCompanyCode=12099&PayrollEmployeeCode=18705&action=Add&Location=ED&CompanyLoginName=sandbox4");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/SMPEditor.aspx?PayrollCompanyCode=12099&PayrollEmployeeCode=18705&action=Add&Location=ED&CompanyLoginName=sandbox4");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/SMPEditor.aspx?PayrollCompanyCode=12099&PayrollEmployeeCode=18705&action=Add&Location=ED&CompanyLoginName=sandbox4");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/SMPEditor.aspx?PayrollCompanyCode=12099&PayrollEmployeeCode=18705&action=Add&Location=ED&CompanyLoginName=sandbox4";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/SMPEditor.aspx?PayrollCompanyCode=12099&PayrollEmployeeCode=18705&action=Add&Location=ED&CompanyLoginName=sandbox4")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickEmployeeList
     * @name Click clickEmployeeList
     */
	public void Click_clickEmployeeList()
	{
        
		WebElement elem = getWebElement(clickEmployeeListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEmployeeList", "Click_clickEmployeeList failed. Unable to locate object: " + clickEmployeeListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEmployeeList", "Click_clickEmployeeList failed. Unable to locate object: " + clickEmployeeListElem.toString());

			Assert.fail("Unable to locate object: " + clickEmployeeListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEmployeeList");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEmployeeList");
	}

    
	/**
 	 * Select selectEmployeeStatus
     * @name Select selectEmployeeStatus
     */
    public void Select_selectEmployeeStatus(String selectEmployeeStatus)
 	{
 	    
 		WebElement elem = getWebElement(selectEmployeeStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectEmployeeStatus", "Select_selectEmployeeStatus failed. Unable to locate object: " + selectEmployeeStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectEmployeeStatus", "Select_selectEmployeeStatus failed. Unable to locate object: " + selectEmployeeStatusElem.toString());

 			Assert.fail("Unable to locate object: " + selectEmployeeStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectEmployeeStatus);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectEmployeeStatus " + selectEmployeeStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectEmployeeStatus " + selectEmployeeStatus);
 	}

      
	/**
 	 * Enter SearchEmployeFirstName
     * @name Enter SearchEmployeFirstName
     */
 	public void Enter_SearchEmployeFirstName(String SearchEmployeFirstName)
 	{
 	    
 		WebElement elem = getWebElement(SearchEmployeFirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchEmployeFirstName", "Enter_SearchEmployeFirstName failed. Unable to locate object: " + SearchEmployeFirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchEmployeFirstName", "Enter_SearchEmployeFirstName failed. Unable to locate object: " + SearchEmployeFirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchEmployeFirstNameElem.toString());
         }

 		elem.sendKeys(SearchEmployeFirstName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchEmployeFirstName " + SearchEmployeFirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchEmployeFirstName " + SearchEmployeFirstName);
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

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickonEmpName");

		TestModellerLogger.PassStep(m_Driver, "Click_clickonEmpName");
	}

     
	/**
 	 * Click clickAddLeave
     * @name Click clickAddLeave
     */
	public void Click_clickAddLeave()
	{
        
		WebElement elem = getWebElement(clickAddLeaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAddLeave", "Click_clickAddLeave failed. Unable to locate object: " + clickAddLeaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAddLeave", "Click_clickAddLeave failed. Unable to locate object: " + clickAddLeaveElem.toString());

			Assert.fail("Unable to locate object: " + clickAddLeaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAddLeave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAddLeave");
	}

      
	/**
 	 * Enter getStartDatePaternity
     * @name Enter getStartDatePaternity
     */
 	public void Enter_getStartDatePaternity(String getStartDatePaternity)
 	{
 	    
 		WebElement elem = getWebElement(getStartDatePaternityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getStartDatePaternity", "Enter_getStartDatePaternity failed. Unable to locate object: " + getStartDatePaternityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getStartDatePaternity", "Enter_getStartDatePaternity failed. Unable to locate object: " + getStartDatePaternityElem.toString());

 			Assert.fail("Unable to locate object: " + getStartDatePaternityElem.toString());
         }

 		elem.sendKeys(getStartDatePaternity);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getStartDatePaternity " + getStartDatePaternity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getStartDatePaternity " + getStartDatePaternity);
 	}

      
	/**
 	 * Enter getEndDatePaternity
     * @name Enter getEndDatePaternity
     */
 	public void Enter_getEndDatePaternity(String getEndDatePaternity)
 	{
 	    
 		WebElement elem = getWebElement(getEndDatePaternityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getEndDatePaternity", "Enter_getEndDatePaternity failed. Unable to locate object: " + getEndDatePaternityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getEndDatePaternity", "Enter_getEndDatePaternity failed. Unable to locate object: " + getEndDatePaternityElem.toString());

 			Assert.fail("Unable to locate object: " + getEndDatePaternityElem.toString());
         }

 		elem.sendKeys(getEndDatePaternity);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getEndDatePaternity " + getEndDatePaternity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getEndDatePaternity " + getEndDatePaternity);
 	}
}