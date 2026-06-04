package page.factory;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/88f20342-ca67-4d75-91ef-9df47489ed68
@TestModellerModule(guid = "88f20342-ca67-4d75-91ef-9df47489ed68")
public class EmployeeThreeDotOption extends BasePage
{
	public EmployeeThreeDotOption (WebDriver driver)
	{
		super(driver);
	}


	
	

	private By ClickThreeDotElem = By.xpath("//A[@class='report_icon dropdown-toggle']");
	
	private By selectEditElem = By.xpath("(//A[contains(text(),'Edit')])[1]");

	private By SelectLeaverElem = By.xpath("//A[contains(text(),'Leaver')]");

	private By SelectProceddPayElem = By.xpath("(//A[contains(text(),'Process Pay')])[1]");

	private By SelectAddLeaveElem = By.xpath("(//A[contains(text(),'Add Leave')])[1]");

	private By SelectAddition_DeductionElem = By.xpath("(//A[contains(text(),'Addition')])[1]");

	

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	

     
	/**
 	 * Click ClickThreeDot
     * @name Click ClickThreeDot
     */
	public void Click_ClickThreeDot()
	{
        
		WebElement elem = getWebElement(ClickThreeDotElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickThreeDot", "Click_ClickThreeDot failed. Unable to locate object: " + ClickThreeDotElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickThreeDot", "Click_ClickThreeDot failed. Unable to locate object: " + ClickThreeDotElem.toString());

			Assert.fail("Unable to locate object: " + ClickThreeDotElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickThreeDot");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickThreeDot");
	}

     
	/**
 	 * Click SelectLeaver
     * @name Click SelectLeaver
     */
	public void Click_SelectLeaver()
	{
        
		WebElement elem = getWebElement(SelectLeaverElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectLeaver", "Click_SelectLeaver failed. Unable to locate object: " + SelectLeaverElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectLeaver", "Click_SelectLeaver failed. Unable to locate object: " + SelectLeaverElem.toString());

			Assert.fail("Unable to locate object: " + SelectLeaverElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectLeaver");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectLeaver");
	}

      
	/**
 	 * Enter SelectEdit
	 * @throws Exception 
     * @name Enter SelectEdit
     */
 	public void selectEdit() throws Exception
 	{
 	    
//		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='LeaverPopUp']/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(selectEditElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectEdit", "selectEdit failed. Unable to locate object: " + selectEditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "selectEdit", "selectEdit failed. Unable to locate object: " + selectEditElem.toString());

 			Assert.fail("Unable to locate object: " + selectEditElem.toString());
         }
 		
 		elem.click();
 		
 
//	m_Driver.switchTo().defaultContent();

  		ExtentReportManager.passStep(m_Driver, "selectEdit ");

  		TestModellerLogger.PassStep(m_Driver, "selectEdit ");
 	}
 	
 	
 	/**
 	 * Enter SelectProceddPayElem
	 * @throws Exception 
     * @name Enter SelectProceddPayElem
     */
 	public void SelectProceddPay() throws Exception
 	{
 	    
//		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='LeaverPopUp']/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(SelectProceddPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "SelectProceddPay", "SelectProceddPay failed. Unable to locate object: " + SelectProceddPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "SelectProceddPay", "SelectProceddPay failed. Unable to locate object: " + SelectProceddPayElem.toString());

 			Assert.fail("Unable to locate object: " + SelectProceddPayElem.toString());
         }

 		
 		elem.click();
 		
 		
//	m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "SelectProceddPay ");

  		TestModellerLogger.PassStep(m_Driver, "SelectProceddPay " );
 	}

     
	/**
 	 * Click SelectAddLeave
	 * @throws Exception 
	 * @name Click SelectAddLeave
     */
	public void Click_SelectAddLeave() throws Exception
	{
        
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='LeaverPopUp']/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SelectAddLeaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectAddLeave", "Click_SelectAddLeave failed. Unable to locate object: " + SelectAddLeaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectAddLeave", "Click_SelectAddLeave failed. Unable to locate object: " + SelectAddLeaveElem.toString());

			Assert.fail("Unable to locate object: " + SelectAddLeaveElem.toString());
        }

		elem.click();
		

//		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SelectAddLeave");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectAddLeave");
	}

     
	/**
 	 * Click SelectAddition_Deduction
     * @name Click RunPayroll1
     */
	public void Click_SelectAddition_Deduction()
	{
        
		WebElement elem = getWebElement(SelectAddition_DeductionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectAddition_Deduction", "Click_SelectAddition_Deduction failed. Unable to locate object: " + SelectAddition_DeductionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectAddition_Deduction", "Click_SelectAddition_Deduction failed. Unable to locate object: " + SelectAddition_DeductionElem.toString());

			Assert.fail("Unable to locate object: " + SelectAddition_DeductionElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectAddition_Deduction");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectAddition_Deduction");
	}

     

}