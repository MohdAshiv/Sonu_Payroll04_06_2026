package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class EmployerView extends BasePage {

	public EmployerView(WebDriver driver) {
		super(driver);
	}

	
	
	private By taxpayment= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP32']");
	private By _Reports_Elem = By.linkText("Reports");

    private By employerView= By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");
	
    private By employeeName= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
    private By notificationLeave= By.xpath("//*[@id='aspnetForm']/main/header/div/div[3]/ul/li[3]/div/div/a/i");

    private By employeeName1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[1]/a");

    private By paydateElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_ViewEmployeeSalaryDetails']");
	
    private By approvePayrollElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayrollApprove']/span");
    
    private By approveElem=By.xpath("//*[@id='btnApprove']");
    
    private By submitElem= By.xpath("//*[@id='btnSave']");
    private By submitQueryElem= By.xpath("//*[@id='lnkSubmitQuery']");

    private By QueryElem= By.xpath("//*[@id='btnQuery']");
    
    private By queryNoteElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtQuery']");
    private By historyElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnHistory']");

    private By dashBoardElem= By.xpath("//a[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployerDashboard']");
    
	public void Click_EmployerView() throws InterruptedException
	{
		WebElement elem = getWebElement(employerView);
		ClosePopup.ValidateAndPopUp(m_Driver);

		elem.click();
		Thread.sleep(3000);
		Reporter.log("click Employer View");
		utilities.ChangeWindow.tabswitch(m_Driver);
		Thread.sleep(2000);
		
	}

	/**
 	 * Click  Reports 
	 * @throws InterruptedException 
     * @name Click  Reports 
     */
	public void Click__Reports_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
		
		Reporter.log("Click Report Section");
	}
	
	
	public void clickPayslip() throws InterruptedException
	{
        
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']"));
		elem.click();
		Thread.sleep(2000);
      
		Reporter.log("clickPayslip");
	}
	
	
	public void clickDashBoard() throws InterruptedException
	{
        
		WebElement elem = getWebElement(dashBoardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + dashBoardElem.toString());


			Assert.fail("Unable to locate object: " + dashBoardElem.toString());
        }

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickDashBoard");
		
		Reporter.log("Click Report Section");
	}
	
	
	public void clickEmployee() throws InterruptedException
	{
        
		WebElement elem = getWebElement(employeeName);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployee", "clickEmployee failed. Unable to locate object: " + employeeName.toString());


			Assert.fail("Unable to locate object: " + employeeName.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "clickEmployee");

		
		Reporter.log("Click EmployeeName");
	}
	
	
	public void clickLeaveNotification() throws InterruptedException
	{
        
		WebElement elem = getWebElement(notificationLeave);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeaveNotification", "clickLeaveNotification failed. Unable to locate object: " + notificationLeave.toString());


			Assert.fail("Unable to locate object: " + notificationLeave.toString());
        }
		
		
	//	String ele = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lblMessageCount']")).getText();
         WebElement subMenu = m_Driver.findElement(By.xpath("//*[text()='Leave']"));
		
		   Actions action =    new Actions(m_Driver);
	        action.moveToElement(elem).perform();
	        Thread.sleep(1000);
	        action.click(subMenu).perform();
	        Thread.sleep(2000);
	        


		ExtentReportManager.passStep(m_Driver, "clickLeaveNotification");

		
		Reporter.log("clickLeaveNotification");
	}
	
	
	public void clickEmployee1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(employeeName1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployee1", "clickEmployee1 failed. Unable to locate object: " + employeeName1.toString());


			Assert.fail("Unable to locate object: " + employeeName1.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "clickEmployee1");

		
		Reporter.log("Click clickEmployee1");
	}

	public void clickTaxPayment() throws InterruptedException
	{
        
		WebElement elem = getWebElement(taxpayment);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTaxPayment", "clickTaxPayment failed. Unable to locate object: " + taxpayment.toString());


			Assert.fail("Unable to locate object: " + employeeName.toString());
        }

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickTaxPayment");

		
		Reporter.log("Click TaxPayment");
	}
	
	
	
	public void clickPayDate() throws InterruptedException
	{
        
		WebElement elem = getWebElement(paydateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayDate", "clickPayDate failed. Unable to locate object: " + paydateElem.toString());


			Assert.fail("Unable to locate object: " + paydateElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickPayDate");

		
		Reporter.log("Click PayDate");
	}
	
	
	
	
	public void clickApprovePayroll() throws InterruptedException
	{
        
		WebElement elem = getWebElement(approvePayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApprovePayroll", "clickApprovePayroll failed. Unable to locate object: " + approvePayrollElem.toString());


			Assert.fail("Unable to locate object: " + approvePayrollElem.toString());
        }

	//	jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickApprovePayroll");

		
		Reporter.log("clickApprovePayroll");
	}
	
	
	
	
	public void clickApprovBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(approveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApprovBtn", "clickApprovBtn failed. Unable to locate object: " + approveElem.toString());


			Assert.fail("Unable to locate object: " + approveElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickApprovBtn");

		
		Reporter.log("clickApprovBtn");
	}
	
	
	
	public void clickSubmitBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(submitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSubmitBtn", "clickSubmitBtn failed. Unable to locate object: " + submitElem.toString());


			Assert.fail("Unable to locate object: " + submitElem.toString());
        }

		//jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickSubmitBtn");

		
		Reporter.log("clickSubmitBtn");
	}
	
	public void clickSubmitQueryBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(submitQueryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSubmitQueryBtn", "clickSubmitQueryBtn failed. Unable to locate object: " + submitQueryElem.toString());


			Assert.fail("Unable to locate object: " + submitQueryElem.toString());
        }

		//jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickSubmitQueryBtn");

		
		Reporter.log("clickSubmitQueryBtn");
	}
	
	
	

	public void clickQueryBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(QueryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickQueryBtn", "clickQueryBtn failed. Unable to locate object: " + QueryElem.toString());


			Assert.fail("Unable to locate object: " + QueryElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickQueryBtn");

		
		Reporter.log("clickQueryBtn");
	}
	
	

	public void enterQueryNote() throws InterruptedException
	{
        
		WebElement elem = getWebElement(queryNoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterQueryNote", "enterQueryNote failed. Unable to locate object: " + queryNoteElem.toString());


			Assert.fail("Unable to locate object: " + queryNoteElem.toString());
        }

		//jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
 		String s = RandomStringUtils.randomAlphabetic(50); 

//	 	String s = RandomStringUtils.randomNumeric(5); 
//
//	 	System.out.println(s);
		elem.sendKeys(s);
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "enterQueryNote");

		
		Reporter.log("enterQueryNote");
	}
	
	

	public void clickHistoryBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(historyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickHistoryBtn", "clickHistoryBtn failed. Unable to locate object: " + historyElem.toString());


			Assert.fail("Unable to locate object: " + historyElem.toString());
        }

		//jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
 	//	String s = RandomStringUtils.randomAlphabetic(50); 

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickHistoryBtn");

		
		Reporter.log("clickHistoryBtn");
	}
	
	
	
	
}
