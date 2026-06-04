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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c3119c1b-72e7-4746-91e4-32d6e64a1b1e
@TestModellerModule(guid = "c3119c1b-72e7-4746-91e4-32d6e64a1b1e")
public class verifypage2 extends BasePage
{
	public verifypage2 (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By _Company_DeRegistered_MessageElem = By.xpath("//SPAN[@id='ctl00_ctl00_ParentContent_cpHeading_lblDeregister']");

	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11949&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11949&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11949&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11949&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=11949&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

     
	/**
 	 * Click - Company De-Registered Message
	 * @throws Exception 
     * @name Click - Company De-Registered Message
     */
	public void Click__Company_DeRegistered_Message() throws Exception
	{
        
		WebElement elem = getWebElement(_Company_DeRegistered_MessageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Company_DeRegistered_Message", "Click__Company_DeRegistered_Message failed. Unable to locate object: " + _Company_DeRegistered_MessageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Company_DeRegistered_Message", "Click__Company_DeRegistered_Message failed. Unable to locate object: " + _Company_DeRegistered_MessageElem.toString());

			Assert.fail("Unable to locate object: " + _Company_DeRegistered_MessageElem.toString());
        }

		TakeScreenshot.takeScreenshot(m_Driver, "De-register_MessageWithEmployee");
		elem.click();
		
		String Expected="- Company De-Registered on 24-Jun-20";
		
		String Actual= elem.getText();
 		Assert.assertEquals(Actual, Expected,"words does not match please report a bug");
          	

		ExtentReportManager.passStep(m_Driver, "Click__Company_DeRegistered_Message");

		TestModellerLogger.PassStep(m_Driver, "Click__Company_DeRegistered_Message");
	}

     
	/**
 	 * Click gotoFilingManagement
	 * @throws Exception 
     * @name Click gotoFilingManagement
     */
	public void Click_gotoFilingManagement() throws Exception
	{
        
		WebElement elem = getWebElement(gotoFilingManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFilingManagementElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "FinalFPS and EPS Generate");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagement");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFilingManagement");
	}


	public void undoSubmission() {
		// TODO Auto-generated method stub
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_btnUndo']")).click();
		
		m_Driver.switchTo().alert().accept();
		
	}
}