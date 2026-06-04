package NewPages;

import pages.BasePage;

import java.util.List;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/01795f33-710c-4eaf-8b92-d1004b3a316d
@TestModellerModule(guid = "01795f33-710c-4eaf-8b92-d1004b3a316d")
public class Agent_Payroll_RunPayroll extends BasePage
{
	public Agent_Payroll_RunPayroll(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	

	
	private By SelectDueDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollDate']");
	
	private By SelectAccountManagerElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddPrimaryUser']");

	private By UpdateBtnElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By Run_PayrollElem = By.xpath("//a[@onclick='runPayrollValidation();']");

	private By SendPayslipDropdown = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_ddlPayslip']");
	
	private By YesToFileWithHMRCElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_rdoFileHmrc_0']");

	private By Run_PayrollElem2 = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRunPayroll']");


	
	
     
	/**
 	 * Click  Payroll 
     * @name Click  Payroll 
     */
	public void SelectDueDate(String DueD_Date)
	{
        
		WebElement elem = getWebElement(SelectDueDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "SelectDueDateElem", "SelectDueDateElem failed. Unable to locate object: " + SelectDueDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "SelectDueDateElem", "SelectDueDateElem failed. Unable to locate object: " + SelectDueDateElem.toString());

			Assert.fail("Unable to locate object: " + SelectDueDateElem.toString());
        }

		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(DueD_Date);
          	

		ExtentReportManager.passStep(m_Driver, "SelectDueDate");

		TestModellerLogger.PassStep(m_Driver, "SelectDueDate");
	}

     
	/**
 	 * Click Dashboard
     * @name Click Dashboard
     */
	public void Click_UpdateBtn()
	{
        
		WebElement elem = getWebElement(UpdateBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "UpdateBtn", "UpdateBtnElem failed. Unable to locate object: " + UpdateBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "UpdateBtn", "UpdateBtnElem failed. Unable to locate object: " + UpdateBtnElem.toString());

			Assert.fail("Unable to locate object: " + UpdateBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "UpdateBtn");

		TestModellerLogger.PassStep(m_Driver, "UpdateBtn");
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
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll");
	}

     
	/**
 	 * Click Submit RTI
	 * @throws InterruptedException 
     * @name Click Submit RTI
     */
	public void Select_SendPayslipDropdown(String SendPayslipTo) throws InterruptedException
	{
        
		WebElement elem = getWebElement(SendPayslipDropdown);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SendPayslipDropdown", "Select_SendPayslipDropdown failed. Unable to locate object: " + SendPayslipDropdown.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SendPayslipDropdown", "Select_SendPayslipDropdown failed. Unable to locate object: " + SendPayslipDropdown.toString());

			Assert.fail("Unable to locate object: " + SendPayslipDropdown.toString());
        }

		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SendPayslipTo);
 		
 		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Select_SendPayslipDropdown");

		TestModellerLogger.PassStep(m_Driver, "Select_SendPayslipDropdown");
	}

     
	/**
 	 * Click Submit P11D
     * @name Click Submit P11D
     */
	public void Click_YesToFileWithHMRC()
	{
        
		WebElement elem = getWebElement(YesToFileWithHMRCElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_YesToFileWithHMRC", "Click_YesToFileWithHMRC failed. Unable to locate object: " + YesToFileWithHMRCElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_YesToFileWithHMRC", "Click_YesToFileWithHMRC failed. Unable to locate object: " + YesToFileWithHMRCElem.toString());

			Assert.fail("Unable to locate object: " + YesToFileWithHMRCElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_YesToFileWithHMRC");

		TestModellerLogger.PassStep(m_Driver, "Click_YesToFileWithHMRC");
	}

     
	/**
 	 * Click Submit Pension Contribution
	 * @throws InterruptedException 
     * @name Click Submit Pension Contribution
     */
	public void Click_Run_Payroll2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Run_PayrollElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll2", "Click_Run_Payroll2 failed. Unable to locate object: " + Run_PayrollElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll2", "Click_Run_Payroll2 failed. Unable to locate object: " + Run_PayrollElem2.toString());

			Assert.fail("Unable to locate object: " + Run_PayrollElem2.toString());
        }

		elem.click();
       
		

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll2");
	}


	public void checkClient(String getClientName) throws InterruptedException {
		List<WebElement> clientOptions=m_Driver.findElements(By.xpath("//span[@id='myid']"));
		
		int count=1;
		
		for(WebElement clientOption:clientOptions)
		{
			count++;
			String clientName=clientOption.getText();
			if(clientName.equalsIgnoreCase(getClientName))
			{
				m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr["+count+"]/td[1]/div/input[1]")).click();
				
				Thread.sleep(2000);
				
				break;
				
			}
			
			
		}
		
	}


	public void gotoWait() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(10000);
		
	}
	
	public void gotoWait1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(35000);
		
	}


	public void SCforNoToFileHMRC() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "No to FileHMRC");
		
	}

	/**
 	 * Select Account Manager
	 * @throws InterruptedException 
     * @name Select Account Manager
     */
	public void selectAccountMngr(String AccMngrName) throws InterruptedException {


		
		
			WebElement elem = getWebElement(SelectAccountManagerElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectAccountMngr", "selectAccountMngr failed. Unable to locate object: " + SelectAccountManagerElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "selectAccountMngr", "selectAccountMngr failed. Unable to locate object: " + SelectAccountManagerElem.toString());

				Assert.fail("Unable to locate object: " + SelectAccountManagerElem.toString());
	        }

			Select dropdown = new Select(elem);

	 		dropdown.selectByVisibleText(AccMngrName);
	 		
	 		Thread.sleep(1000);
	          	

			ExtentReportManager.passStep(m_Driver, "SelectAccountManagerElem");

			TestModellerLogger.PassStep(m_Driver, "SelectAccountManagerElem");
		}
		
	
}