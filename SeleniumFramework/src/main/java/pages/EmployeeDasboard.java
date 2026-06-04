package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c787a5f5-d9bd-4a8c-8f29-4c8e3005c27b
@TestModellerModule(guid = "c787a5f5-d9bd-4a8c-8f29-4c8e3005c27b")
public class EmployeeDasboard extends BasePage
{
	public EmployeeDasboard (WebDriver driver)
	{
		super(driver);
	}


	
	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By search_imployeeElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$search_input']");

	private By _SearchElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSearch']");

	private By ClickOnEmployeeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");

	private By _Employee_Dashboard_Elem = By.xpath("//SPAN[contains(text(),'Employee Dashboard')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/EmployeePayHistory.aspx?PayrollCompanyCode=15604&PayrollEmployeeCode=22200")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
        
		ChangeWindow.tabswitch(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_Employer_View");

		TestModellerLogger.PassStep(m_Driver, "Click_Employer_View");
	}

      
	/**
 	 * Enter search_imployee
     * @name Enter search_imployee
     */
 	public void Enter_search_imployee(String search_imployee)
 	{
 	    
 		WebElement elem = getWebElement(search_imployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_search_imployee", "Enter_search_imployee failed. Unable to locate object: " + search_imployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_search_imployee", "Enter_search_imployee failed. Unable to locate object: " + search_imployeeElem.toString());

 			Assert.fail("Unable to locate object: " + search_imployeeElem.toString());
         }

 		elem.sendKeys(search_imployee);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_search_imployee " + search_imployee);

  		TestModellerLogger.PassStep(m_Driver, "Enter_search_imployee " + search_imployee);
 	}

     
	/**
 	 * Click  Search
     * @name Click  Search
     */
	public void Click__Search()
	{
        
		WebElement elem = getWebElement(_SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Search", "Click__Search failed. Unable to locate object: " + _SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Search", "Click__Search failed. Unable to locate object: " + _SearchElem.toString());

			Assert.fail("Unable to locate object: " + _SearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Search");

		TestModellerLogger.PassStep(m_Driver, "Click__Search");
	}

     
	/**
 	 * Click ClickOnEmployee
     * @name Click ClickOnEmployee
     */
	public void Click_ClickOnEmployee()
	{
        
		WebElement elem = getWebElement(ClickOnEmployeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnEmployee", "Click_ClickOnEmployee failed. Unable to locate object: " + ClickOnEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnEmployee", "Click_ClickOnEmployee failed. Unable to locate object: " + ClickOnEmployeeElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnEmployeeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnEmployee");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnEmployee");
	}

     
	/**
 	 * Click  Employee Dashboard 
     * @name Click  Employee Dashboard 
     */
	public void Click__Employee_Dashboard_()
	{
        
		WebElement elem = getWebElement(_Employee_Dashboard_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Employee_Dashboard_", "Click__Employee_Dashboard_ failed. Unable to locate object: " + _Employee_Dashboard_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Employee_Dashboard_", "Click__Employee_Dashboard_ failed. Unable to locate object: " + _Employee_Dashboard_Elem.toString());

			Assert.fail("Unable to locate object: " + _Employee_Dashboard_Elem.toString());
        }

		String getTitle= elem.getText();
		
		System.out.println("Current page is: "+getTitle);
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Employee_Dashboard_");

		TestModellerLogger.PassStep(m_Driver, "Click__Employee_Dashboard_");
	}
}