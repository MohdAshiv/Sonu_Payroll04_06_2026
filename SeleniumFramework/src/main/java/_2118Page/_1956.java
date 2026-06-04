package _2118Page;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4d8300f0-2cc4-465d-81f6-2950b6e80c5b
@TestModellerModule(guid = "4d8300f0-2cc4-465d-81f6-2950b6e80c5b")
public class _1956 extends BasePage
{
	
	float TotalLeaveAlloted1;
	float TotalLeaveConsumed1;
	float TotalLeaveBalance1;
	
	static String PDFtext;
	static WebElement endDate;
	public _1956 (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Add_Leave_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_herfAddleave']");
	
	private By clickRun_Payroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By clickRun_Payroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By selectEmployeeElem = By.xpath("//label[normalize-space()= 'Employee:']/../div/select");

	private By selectLeaveTypeElem = By.xpath("//label[normalize-space()= 'Leave Type:']/../div/select");

	private By LeaveStartDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDate']");

	private By LeaveEndDateElem = By.xpath("//label[normalize-space()= 'Leave End Date:']/../div/div/input");

	private By SaveElem = By.xpath("//label[normalize-space()= '']/../div/a[1]");

	private By Leave_ReportElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefleavereport']");

	private By PeriodElem = By.xpath("//label[normalize-space()= 'Period:']/../div/select");

	private By Select_EmployeeElem = By.xpath("//label[normalize-space()= 'Employee:']/../div/input");

	private By SearchElem = By.xpath("//label[normalize-space()= '']/../div/a");

	private By getLeaveBalanceElem = By.xpath("//*[starts-with(text(), 'Total Allotted')]//following::td[8]");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By PayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");
	
	private By ctl00ctl00ParentContentcPHtxtExpectedDueDateElem = By.xpath("//label[normalize-space()= 'Expected Due Date:']/../div/div/input");

	private By ctl00ctl00ParentContentcPHtxtDOBElem = By.xpath("//label[normalize-space()= 'Actual Birth Date:']/../div/div/input");

	private By ctl00ctl00ParentContentcPHtxtAWEMaternityElem = By.xpath("//label[normalize-space()= 'Average Weekly Earnings:']/../div[1]/input");



	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportEmployeeLeaves.aspx?PayrollCompanyCode=15291");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportEmployeeLeaves.aspx?PayrollCompanyCode=15291");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportEmployeeLeaves.aspx?PayrollCompanyCode=15291");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportEmployeeLeaves.aspx?PayrollCompanyCode=15291";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportEmployeeLeaves.aspx?PayrollCompanyCode=15291")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }
   
   
   /**
	 * Click clickRun Payroll1
	 * @throws Exception 
    * @name Click clickRun Payroll1
    */
	public void Click_clickRun_Payroll1() throws Exception
	{
       
		WebElement elem = getWebElement(clickRun_Payroll1Elem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickRun_Payroll1", "Click_clickRun_Payroll1 failed. Unable to locate object: " + clickRun_Payroll1Elem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickRun_Payroll1", "Click_clickRun_Payroll1 failed. Unable to locate object: " + clickRun_Payroll1Elem.toString());

			Assert.fail("Unable to locate object: " + clickRun_Payroll1Elem.toString());
       }

		elem.click();
		
		
         	

		ExtentReportManager.passStep(m_Driver, "Click_clickRun_Payroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_clickRun_Payroll1");
	}
	
	
	
	/**
 	 * Click clickRun Payroll2
     * @name Click clickRun Payroll2
     */
	public void Click_clickRun_Payroll2()
	{
        
		WebElement elem = getWebElement(clickRun_Payroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickRun_Payroll2", "Click_clickRun_Payroll2 failed. Unable to locate object: " + clickRun_Payroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickRun_Payroll2", "Click_clickRun_Payroll2 failed. Unable to locate object: " + clickRun_Payroll2Elem.toString());

			Assert.fail("Unable to locate object: " + clickRun_Payroll2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickRun_Payroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_clickRun_Payroll2");
	}

     
	/**
 	 * Click  Add Leave 
     * @name Click  Add Leave 
     */
	public void Click__Add_Leave_()
	{
        
		WebElement elem = getWebElement(_Add_Leave_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Add_Leave_", "Click__Add_Leave_ failed. Unable to locate object: " + _Add_Leave_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Add_Leave_", "Click__Add_Leave_ failed. Unable to locate object: " + _Add_Leave_Elem.toString());

			Assert.fail("Unable to locate object: " + _Add_Leave_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Add_Leave_");

		TestModellerLogger.PassStep(m_Driver, "Click__Add_Leave_");
	}
    
	/**
 	 * Select selectEmployee
	 * @throws InterruptedException 							
	 * 
	 * 
	 * 
     * @name Select selectEmployee
     */
    public void Select_selectEmployee(String selectEmployee) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(selectEmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectEmployee", "Select_selectEmployee failed. Unable to locate object: " + selectEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectEmployee", "Select_selectEmployee failed. Unable to locate object: " + selectEmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + selectEmployeeElem.toString());
         }

 		Thread.sleep(2000);
 		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectEmployee);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_selectEmployee " + selectEmployee);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectEmployee " + selectEmployee);
 	}
    
	/**
 	 * Select selectLeaveType
     * @name Select selectLeaveType
     */
    public void Select_selectLeaveType(String selectLeaveType)
 	{
 	    
 		WebElement elem = getWebElement(selectLeaveTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectLeaveType", "Select_selectLeaveType failed. Unable to locate object: " + selectLeaveTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectLeaveType", "Select_selectLeaveType failed. Unable to locate object: " + selectLeaveTypeElem.toString());

 			Assert.fail("Unable to locate object: " + selectLeaveTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectLeaveType);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_selectLeaveType " + selectLeaveType);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectLeaveType " + selectLeaveType);
 	}
      
	/**
 	 * Enter LeaveStartDate
	 * @throws InterruptedException 
     * @name Enter LeaveStartDate
     */
 	public void Enter_LeaveStartDate(String LeaveStartDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(LeaveStartDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaveStartDate", "Enter_LeaveStartDate failed. Unable to locate object: " + LeaveStartDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LeaveStartDate", "Enter_LeaveStartDate failed. Unable to locate object: " + LeaveStartDateElem.toString());

 			Assert.fail("Unable to locate object: " + LeaveStartDateElem.toString());
         }

 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(LeaveStartDate);
 		elem.sendKeys(Keys.ENTER);
 		Thread.sleep(2000);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		
// 		endDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLeaveEndDate']"));
// 		for(int i=0;i<10;i++)
//	 		{
// 			endDate.sendKeys(Keys.BACK_SPACE);
//	 		}
// 		endDate.sendKeys("12/08/2021");
// 		endDate.sendKeys(Keys.ENTER);
//	 		Thread.sleep(1000);

  		ExtentReportManager.passStep(m_Driver, "Enter_LeaveStartDate " + LeaveStartDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LeaveStartDate " + LeaveStartDate);
 	}
      
 	/**
 	 * Enter LeaveEndDate
 	 * @throws InterruptedException 
     * @name Enter LeaveEndDate
     */
 	public void Enter_LeaveEndDate(String LeaveEndDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(LeaveEndDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaveEndDate", "Enter_LeaveEndDate failed. Unable to locate object: " + LeaveEndDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LeaveEndDate", "Enter_LeaveEndDate failed. Unable to locate object: " + LeaveEndDateElem.toString());

 			Assert.fail("Unable to locate object: " + LeaveEndDateElem.toString());
         }

 elem.sendKeys(Keys.TAB);
 		
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LeaveEndDate " + LeaveEndDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LeaveEndDate " + LeaveEndDate);
 	}
     
	/**
 	 * Click Save
	 * @throws InterruptedException 
     * @name Click Save
     */
	public void Click_Save() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

			Assert.fail("Unable to locate object: " + SaveElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
        
		Thread.sleep(4000);

		ExtentReportManager.passStep(m_Driver, "Click_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Save");
	}
     
	/**
 	 * Click Leave Report
	 * @throws Exception 
     * @name Click Leave Report
     */
	public void Click_Leave_Report() throws Exception
	{
        
		WebElement elem = getWebElement(Leave_ReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Leave_Report", "Click_Leave_Report failed. Unable to locate object: " + Leave_ReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Leave_Report", "Click_Leave_Report failed. Unable to locate object: " + Leave_ReportElem.toString());

			Assert.fail("Unable to locate object: " + Leave_ReportElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "Taken Leaves");
        

		ExtentReportManager.passStep(m_Driver, "Click_Leave_Report");

		TestModellerLogger.PassStep(m_Driver, "Click_Leave_Report");
	}
	
	
	
    
	/**
 	 * Select Period
     * @name Select Period
     */
    public void Select_Period(String Period)
 	{
 	    
 		WebElement elem = getWebElement(PeriodElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Period", "Select_Period failed. Unable to locate object: " + PeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Period", "Select_Period failed. Unable to locate object: " + PeriodElem.toString());

 			Assert.fail("Unable to locate object: " + PeriodElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Period);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Period " + Period);

 		TestModellerLogger.PassStep(m_Driver, "Select_Period " + Period);
 	}
      
	/**
 	 * Enter Select Employee
     * @name Enter Select Employee
     */
 	public void Enter_Select_Employee(String Select_Employee)
 	{
 	    
 		WebElement elem = getWebElement(Select_EmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Select_Employee", "Enter_Select_Employee failed. Unable to locate object: " + Select_EmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Select_Employee", "Enter_Select_Employee failed. Unable to locate object: " + Select_EmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + Select_EmployeeElem.toString());
         }

 		elem.sendKeys(Select_Employee);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Select_Employee " + Select_Employee);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Select_Employee " + Select_Employee);
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
 	 * Click Search
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click Search
     */
	public void Click_Search1() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
		
		String TotalLeaveAlloted=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Total Allotted')]//following::td[8]")).getText();
		 TotalLeaveAlloted1=Float.parseFloat(TotalLeaveAlloted);
		
		System.out.println("Total Alloted Leave= "+TotalLeaveAlloted1);
		
		String TotalLeaveConsumed=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Total Allotted')]//following::td[2]")).getText();
		 TotalLeaveConsumed1=Float.parseFloat(TotalLeaveConsumed);
		
		System.out.println("Total consumed Leave= "+TotalLeaveConsumed1);
		
		String TotalLeaveBalance=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Total Allotted')]//following::td[10]")).getText();
		 TotalLeaveBalance1=Float.parseFloat(TotalLeaveBalance);
		
		System.out.println("Total Balance Leave= "+TotalLeaveBalance1);
		
		float Expected=TotalLeaveAlloted1-TotalLeaveConsumed1;
		System.out.println(Expected);
		
		assertEquals(TotalLeaveBalance1, Expected,"leave balance not matched");
		
		Thread.sleep(3000);
		
		File file = new File("D://vikash//Employee Payslip - Robert Sailon[21991] - 2021-05-31.pdf");
		PDDocument document = PDDocument.load(file);
		//Instantiate PDFTextStripper class
		PDFTextStripper pdfStripper = new PDFTextStripper();
		//Retrieving text from PDF document
		 PDFtext = pdfStripper.getText(document);
		 
//    System.out.println(PDFtext);
		//Closing the document
		document.close();
		
		String[] splitedString= PDFtext.split(" ");
		//		 String[] splitedString=new String[1];
				 System.out.println(splitedString.length);
				 for(int i=0; i<splitedString.length;i++)
				 {
					 System.out.println(i+"+="+splitedString[i]);
				 }
				 splitedString[2]= splitedString[2].replaceAll("[,]", "");
				 splitedString[4]= splitedString[4].replaceAll("[Pay]", "");
				 
				 float expectedTakenleaves=Float.parseFloat(splitedString[2]);
				 float expectedBalnce=Float.parseFloat(splitedString[4]);
				 
				 assertEquals(expectedTakenleaves, TotalLeaveConsumed1);
				 
				 assertEquals(expectedBalnce, TotalLeaveBalance1);
        

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}
     
	/**
 	 * Click getLeaveBalance
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click getLeaveBalance
     */
	public void Click_getLeaveBalance() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(getLeaveBalanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getLeaveBalance", "Click_getLeaveBalance failed. Unable to locate object: " + getLeaveBalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getLeaveBalance", "Click_getLeaveBalance failed. Unable to locate object: " + getLeaveBalanceElem.toString());

			Assert.fail("Unable to locate object: " + getLeaveBalanceElem.toString());
        }

		//elem.click();
		
		String TotalLeaveAlloted=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Total Allotted')]//following::td[8]")).getText();
		 TotalLeaveAlloted1=Float.parseFloat(TotalLeaveAlloted);
		
		System.out.println("Total Alloted Leave= "+TotalLeaveAlloted1);
		
		String TotalLeaveConsumed=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Total Allotted')]//following::td[2]")).getText();
		 TotalLeaveConsumed1=Float.parseFloat(TotalLeaveConsumed);
		
		System.out.println("Total consumed Leave= "+TotalLeaveConsumed1);
		
		String TotalLeaveBalance=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Total Allotted')]//following::td[10]")).getText();
		 TotalLeaveBalance1=Float.parseFloat(TotalLeaveBalance);
		
		System.out.println("Total Balance Leave= "+TotalLeaveBalance1);
		
		float Expected=TotalLeaveAlloted1-TotalLeaveConsumed1;
		System.out.println(Expected);
		
		assertEquals(TotalLeaveBalance1, Expected,"leave balance not matched");
		

        

		ExtentReportManager.passStep(m_Driver, "Click_getLeaveBalance");

		TestModellerLogger.PassStep(m_Driver, "Click_getLeaveBalance");
	}
     
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}
     
	/**
 	 * Click Payslips
     * @name Click Payslips
     */
	public void Click_Payslips()
	{
        
		WebElement elem = getWebElement(PayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payslips", "Click_Payslips failed. Unable to locate object: " + PayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payslips", "Click_Payslips failed. Unable to locate object: " + PayslipsElem.toString());

			Assert.fail("Unable to locate object: " + PayslipsElem.toString());
        }

		elem.click();
		
		
		
        

		ExtentReportManager.passStep(m_Driver, "Click_Payslips");

		TestModellerLogger.PassStep(m_Driver, "Click_Payslips");
	}
	
	
	/**
	 * Open Payslip
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public void openPayslip() throws InterruptedException, AWTException
	{
		
		m_Driver.findElement(By.xpath("//a[@data-original-title='Payslip download']")).click();
		ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(2000);
		Robot robot = new Robot(); 
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
				
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_ENTER); 
		
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(2000);

				robot.keyPress(KeyEvent.VK_ENTER); 
				
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_ENTER); 
				Thread.sleep(500);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
		
	}
	
	
	/**
	 * Get Leave datail on payslip
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public void getPayslip() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		
		File file = new File("D://vikash//Employee Payslip - A last[21990] - 2021-04-30.pdf");
		PDDocument document = PDDocument.load(file);
		//Instantiate PDFTextStripper class
		PDFTextStripper pdfStripper = new PDFTextStripper();
		//Retrieving text from PDF document
		 PDFtext = pdfStripper.getText(document);
		 
//    System.out.println(PDFtext);
		//Closing the document
		document.close();
		
		String[] splitedString= PDFtext.split(" ");
		//		 String[] splitedString=new String[1];
				 System.out.println(splitedString.length);
				 for(int i=0; i<splitedString.length;i++)
				 {
					 System.out.println(i+"+="+splitedString[i]);
				 }
				 splitedString[2]= splitedString[2].replaceAll("[,]", "");
				 splitedString[4]= splitedString[4].replaceAll("[Pay]", "");
				 
				 float expectedTakenleaves=Float.parseFloat(splitedString[2]);
				 float expectedBalnce=Float.parseFloat(splitedString[4]);
				 
				 assertEquals(expectedTakenleaves, TotalLeaveConsumed1);
				 
				 assertEquals(expectedBalnce, TotalLeaveBalance1);
				
	//			 ChangeWindow.tabswitch(m_Driver);
				 
		
	}
	
	
	/**
	 * Verify leaves
	 * @throws Exception 
	 */
	public void leavesverifyScreenshot() throws Exception
	{
		
		
			m_Driver.findElement(By.xpath("//a[@data-original-title='Payslip download']")).click();
			ChangeWindow.tabswitch(m_Driver);
			Thread.sleep(6000);
			
			
		
			TakeScreenshot.takeScreenshot(m_Driver, "Leaves Displaying on payslip");
		
	}
	
	
	/**
	 * Verify leaves
	 * @throws Exception 
	 */
	public void leavesverifyScreenshot1() throws Exception
	{
		
		
			m_Driver.findElement(By.xpath("//a[@data-original-title='Payslip download']")).click();
			ChangeWindow.tabswitch(m_Driver);
			Thread.sleep(6000);
			
			
		
			TakeScreenshot.takeScreenshot(m_Driver, "NegativeLeaves Displaying on payslip");
		
	}
	
	
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$txtExpectedDueDate
     * @name Enter ctl00$ctl00$ParentContent$cPH$txtExpectedDueDate
     */
 	public void Enter_ctl00ctl00ParentContentcPHtxtExpectedDueDate(String ctl00ctl00ParentContentcPHtxtExpectedDueDate)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHtxtExpectedDueDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtExpectedDueDate", "Enter_ctl00ctl00ParentContentcPHtxtExpectedDueDate failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtExpectedDueDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtExpectedDueDate", "Enter_ctl00ctl00ParentContentcPHtxtExpectedDueDate failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtExpectedDueDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHtxtExpectedDueDateElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHtxtExpectedDueDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtExpectedDueDate " + ctl00ctl00ParentContentcPHtxtExpectedDueDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtExpectedDueDate " + ctl00ctl00ParentContentcPHtxtExpectedDueDate);
 	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$txtDOB
     * @name Enter ctl00$ctl00$ParentContent$cPH$txtDOB
     */
 	public void Enter_ActualDOB()
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHtxtDOBElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtDOB", "Enter_ctl00ctl00ParentContentcPHtxtDOB failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtDOBElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtDOB", "Enter_ctl00ctl00ParentContentcPHtxtDOB failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtDOBElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHtxtDOBElem.toString());
         }

 		elem.clear();
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtDOB " + ctl00ctl00ParentContentcPHtxtAWEMaternityElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtDOB " + ctl00ctl00ParentContentcPHtxtAWEMaternityElem);
 	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$txtAWEMaternity
     * @name Enter ctl00$ctl00$ParentContent$cPH$txtAWEMaternity
     */
 	public void Enter_Amount(String ctl00ctl00ParentContentcPHtxtAWEMaternity)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHtxtAWEMaternityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtAWEMaternity", "Enter_ctl00ctl00ParentContentcPHtxtAWEMaternity failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtAWEMaternityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtAWEMaternity", "Enter_ctl00ctl00ParentContentcPHtxtAWEMaternity failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtAWEMaternityElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHtxtAWEMaternityElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHtxtAWEMaternity);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtAWEMaternity " + ctl00ctl00ParentContentcPHtxtAWEMaternity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtAWEMaternity " + ctl00ctl00ParentContentcPHtxtAWEMaternity);
 	}
	
	
	
	
}