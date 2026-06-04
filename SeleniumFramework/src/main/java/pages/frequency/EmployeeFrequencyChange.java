package pages.frequency;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b4eeb47e-92e2-4c4b-86cb-17371782fe9b
@TestModellerModule(guid = "b4eeb47e-92e2-4c4b-86cb-17371782fe9b")
public class EmployeeFrequencyChange extends BasePage
{
	public EmployeeFrequencyChange (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickEditemployeedetailsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");

	private By clickMandatoryPayrollInformationElem = By.xpath("//A[contains(text(),'Mandatory Payroll Information')]");

	private By SelectPayrollFrequencyElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$ddlPayrollFrequencyCode']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=11972&PayrollEmployeeCode=18652&AEJobHolderTypeId=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickEditemployeedetails
     * @name Click clickEditemployeedetails
     */
	public void Click_clickEditemployeedetails()
	{
        
		WebElement elem = getWebElement(clickEditemployeedetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEditemployeedetails", "Click_clickEditemployeedetails failed. Unable to locate object: " + clickEditemployeedetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEditemployeedetails", "Click_clickEditemployeedetails failed. Unable to locate object: " + clickEditemployeedetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickEditemployeedetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEditemployeedetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEditemployeedetails");
	}

     
	/**
 	 * Click clickMandatoryPayrollInformation
     * @name Click clickMandatoryPayrollInformation
     */
	public void Click_clickMandatoryPayrollInformation()
	{
        
		WebElement elem = getWebElement(clickMandatoryPayrollInformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickMandatoryPayrollInformation", "Click_clickMandatoryPayrollInformation failed. Unable to locate object: " + clickMandatoryPayrollInformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickMandatoryPayrollInformation", "Click_clickMandatoryPayrollInformation failed. Unable to locate object: " + clickMandatoryPayrollInformationElem.toString());

			Assert.fail("Unable to locate object: " + clickMandatoryPayrollInformationElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickMandatoryPayrollInformation");

		TestModellerLogger.PassStep(m_Driver, "Click_clickMandatoryPayrollInformation");
	}

    
	/**
 	 * Select SelectPayrollFrequency
     * @name Select SelectPayrollFrequency
     */
    public void Select_SelectPayrollFrequency(String SelectPayrollFrequency)
 	{
 	    
 		WebElement elem = getWebElement(SelectPayrollFrequencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectPayrollFrequency", "Select_SelectPayrollFrequency failed. Unable to locate object: " + SelectPayrollFrequencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectPayrollFrequency", "Select_SelectPayrollFrequency failed. Unable to locate object: " + SelectPayrollFrequencyElem.toString());

 			Assert.fail("Unable to locate object: " + SelectPayrollFrequencyElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectPayrollFrequency);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectPayrollFrequency " + SelectPayrollFrequency);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectPayrollFrequency " + SelectPayrollFrequency);
 	}

     
	/**
 	 * Click clickSave
     * @name Click clickSave
     */
	public void Click_clickSave()
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
}