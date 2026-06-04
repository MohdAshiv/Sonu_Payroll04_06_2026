package _1743Agent_Dashboard;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/01795f33-710c-4eaf-8b92-d1004b3a316d
@TestModellerModule(guid = "01795f33-710c-4eaf-8b92-d1004b3a316d")
public class Agent_Payroll_DSB extends BasePage
{
	public Agent_Payroll_DSB (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Payroll_Elem = By.xpath("//span[starts-with(text(),'Payroll')]");

	private By DashboardElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[1]/a");

	private By Run_PayrollElem = By.xpath("//A[contains(text(),'Run Payroll')]");

	private By Submit_RTIElem = By.xpath("//A[contains(text(),'Submit RTI')]");

	private By Submit_P11DElem = By.xpath("//A[contains(text(),'Submit P11D')]");

	private By Submit_Pension_ContributionElem = By.xpath("//A[contains(text(),'Submit Pension Contribution')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Payroll 
	 * @throws InterruptedException 
     * @name Click  Payroll 
     */
	public void Click__Payroll_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Payroll_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Payroll_", "Click__Payroll_ failed. Unable to locate object: " + _Payroll_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Payroll_", "Click__Payroll_ failed. Unable to locate object: " + _Payroll_Elem.toString());

			Assert.fail("Unable to locate object: " + _Payroll_Elem.toString());
        }

		elem.click();
		
		ClosePopup.ValidateAndPopUp(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Payroll_");

		TestModellerLogger.PassStep(m_Driver, "Click__Payroll_");
	}

     
	/**
 	 * Click Dashboard
     * @name Click Dashboard
     */
	public void Click_Dashboard()
	{
        
		WebElement elem = getWebElement(DashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Dashboard", "Click_Dashboard failed. Unable to locate object: " + DashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Dashboard", "Click_Dashboard failed. Unable to locate object: " + DashboardElem.toString());

			Assert.fail("Unable to locate object: " + DashboardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Dashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_Dashboard");
	}

     
	/**
 	 * Click Run Payroll
     * @name Click Run Payroll
     */
	public void Click_Run_Payroll()
	{
        
		WebElement elem = getWebElement(Run_PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll", "Click_Run_Payroll failed. Unable to locate object: " + Run_PayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll", "Click_Run_Payroll failed. Unable to locate object: " + Run_PayrollElem.toString());

			Assert.fail("Unable to locate object: " + Run_PayrollElem.toString());
        }

		elem.click();
		
		System.out.println("Done");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll");
	}

     
	/**
 	 * Click Submit RTI
     * @name Click Submit RTI
     */
	public void Click_Submit_RTI()
	{
        
		WebElement elem = getWebElement(Submit_RTIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_RTI", "Click_Submit_RTI failed. Unable to locate object: " + Submit_RTIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_RTI", "Click_Submit_RTI failed. Unable to locate object: " + Submit_RTIElem.toString());

			Assert.fail("Unable to locate object: " + Submit_RTIElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_RTI");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_RTI");
	}

     
	/**
 	 * Click Submit P11D
     * @name Click Submit P11D
     */
	public void Click_Submit_P11D()
	{
        
		WebElement elem = getWebElement(Submit_P11DElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_P11D", "Click_Submit_P11D failed. Unable to locate object: " + Submit_P11DElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_P11D", "Click_Submit_P11D failed. Unable to locate object: " + Submit_P11DElem.toString());

			Assert.fail("Unable to locate object: " + Submit_P11DElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_P11D");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_P11D");
	}

     
	/**
 	 * Click Submit Pension Contribution
     * @name Click Submit Pension Contribution
     */
	public void Click_Submit_Pension_Contribution()
	{
        
		WebElement elem = getWebElement(Submit_Pension_ContributionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_Pension_Contribution", "Click_Submit_Pension_Contribution failed. Unable to locate object: " + Submit_Pension_ContributionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_Pension_Contribution", "Click_Submit_Pension_Contribution failed. Unable to locate object: " + Submit_Pension_ContributionElem.toString());

			Assert.fail("Unable to locate object: " + Submit_Pension_ContributionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_Pension_Contribution");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_Pension_Contribution");
	}


	public void popUpScreenshot() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "runPayrollPopup on AgentDsb");
		
	}


	public void RunpayrollSC() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "runPayrollTable on AgentDsb");
		
	}


	public void RunpayrollSCAlphabetPriority() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "runPayrollTable Alphabetic view");
		
	}


	public void getSCforAccountMangrClientList() throws Exception {
		// TODO Auto-generated method stub
		
Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "runPayrollTable Alphabetic view");
		
	}
}