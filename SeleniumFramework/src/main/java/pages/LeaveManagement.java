package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.zerodep.shaded.org.apache.hc.core5.http.ParseException;

import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;

public class LeaveManagement  extends BasePage{

	public LeaveManagement(WebDriver driver) {
		super(driver);
		
	}
	
	public static String FileName;
	public static String enterNote;
	SoftAssert soft=new SoftAssert();

	private By LeaverStartDateElem = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$txtStartDate']");
	private By LeaverStartDateSPPElem = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$txtStartDatePaternity']");

	private By LeaverStartDateSickLeaveElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDateSick']");

	private By LeaverStartHolidayDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLeaveStartDate']");

	private By LeaverEndDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEndDate']");

	private By LeaverEndDateSickLeaveElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEndDateSick']");

	private By LeaverEndDateHolidayElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLeaveEndDate']");

	private By leaveManagementElem= By.xpath("//*[text()='Leave Management']");

	private By addleaveElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_herfAddleave']");
	
	private By leaveType=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlLeaveType']");
	
	private By employeeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlEmployee']");
	
	private By saveBtn= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	
	private By deletIcnElem =By.xpath("//*[@data-original-title='Delete']");
	
	private By deletBtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']");
	private By actualBirthDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDOBPater']");
	
	

	private By ExpectedBirthDateElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtExpectedDueDate']");
	
	private By AWE_Elem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtAWEMaternity']");
	
	private By AWE_ElemSick = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAWESick']");

	private By approvedLeavesElem= By.xpath("//*[text()='Approved Leaves']");
	
	private By rejectedLeaveElem = By.xpath("//*[text()='Rejected Leaves']");
	
	private By manageLeavesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefManageLeaves']");

	private By totalLeaveTaken= By.xpath("//*[@id='aspnetForm']/main/div/div[4]/div/div[2]/div/div[4]/a");

	private By pendingLeaves= By.xpath("//*[text()='Pending Leaves']");

	private By applyLeavesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefApplyLeaves']");

	private By leaveReportElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefleavereport']");
	private By cancelLeavesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefCancelLeaves']");

	private By historyLeavesElem= By.xpath("//*[text()='Leaves History']");
	private By historyLeavesElem1= By.xpath("//*[contains(text(),'Leave History')]");

	private By resonElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtReason']");

	private By pendingForApprovalElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefLeavesPendingApproval']");
	
	private By checkBoxElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkHeader']");
	
	private By employeeName1Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rprtLeaveInfo_ctl00_HrefLeaveApproval']");
	
	private By leaveApproveBtnELem= By .xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkApprove']");
	
	private By deletIcnCancelLeaveElem = By.xpath("//*[@data-original-title='Delete']");
	
	private By deletIcnCancelLeaveElem1 = By.xpath("//*[@data-original-title='Delete']");

	private By goBackElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkBtnBack']");
	
	private By cancelBtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']");
	
	private By aweElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAWEPaternity']");
	
	private By aweElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAWEMaternity']");

	private By NoteElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtComments']");
	
	private By rejectBtn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkReject']");
	private By goBackBtnElem= By.xpath("//*[text()='Go Back']");

	private By expectedBirthElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtExpectedDueDate']");
	private By actualBirthElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDOB']");

	private By actualBirthSSPElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDOBPater']");

	private By fromDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDate']");
	
	private By mToDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEndDate']");
	private By employeeAElem= By.xpath("//*[contains(text(),'Mr.')]");
	private By employeeBElem= By.xpath("//*[contains(text(),'Employee B')]");
	private By applyLeaveLinkElem= By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[2]/a/div/div[3]/h2");
	private By leaveBalanceElem= By.xpath("//*[text()='Leave Balance']");

	private By halfDayCheckBoxElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_cbHalfday']");
	private By statusFilterElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlStatus']");
    private By dateFromFilterElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDateFrom']");
    private By dateToFilterElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDateTo']");
    private By updateBtnElem= By.xpath("//a[text()='Update']");
    private By employeeNameElem= By.xpath("//*[@type='search']");

	private By statusFilterElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatus']");

	private By leaveStartDateCompany= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtStartDate']");
	
	private By leaveDaysComapny= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtAnnualLeaveDays']");
	
	private By holidayPayRateCompany=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtHourlyRate']");
	
	private By MaxCarryOveCompany=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtCarryForward']");
	
	private By WeeklyWorkingHrsCompany= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtWorkingHoursWeekly']");
	
	private By periodElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPeriod']");
	public void clickLeaveManagement() throws Exception
	{
        
		WebElement elem = getWebElement(leaveManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeaveManagement", "clickLeaveManagement failed. Unable to locate object: " + leaveManagementElem.toString());


			Assert.fail("Unable to locate object: " + leaveManagementElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickLeaveManagement");

		ExtentReportManager.passStep(m_Driver, "clickLeaveManagement");

		
		Reporter.log("clickLeaveManagement");
	}
	
	public void clickUpdateBtn() throws Exception
	{
        
		WebElement elem = getWebElement(updateBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUpdateBtn", "clickUpdateBtn failed. Unable to locate object: " + updateBtnElem.toString());


			Assert.fail("Unable to locate object: " + updateBtnElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickUpdateBtn");

		ExtentReportManager.passStep(m_Driver, "clickUpdateBtn");

		
		Reporter.log("clickUpdateBtn");
	}
	
	
	public void selectStatus(String value) throws Exception
	{
        
		WebElement elem = getWebElement(statusFilterElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStatus", "selectStatus failed. Unable to locate object: " + statusFilterElem.toString());


			Assert.fail("Unable to locate object: " + statusFilterElem.toString());
        }

		Select sel= new Select(elem);
		
		sel.selectByVisibleText(value);
				
	
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "selectStatus");

		ExtentReportManager.passStep(m_Driver, "selectStatus");

		
		Reporter.log("selectStatus");
	}
	

	public void selectStatus1(String value) throws Exception
	{
        
		WebElement elem = getWebElement(statusFilterElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStatus1", "selectStatus1 failed. Unable to locate object: " + statusFilterElem1.toString());


			Assert.fail("Unable to locate object: " + statusFilterElem1.toString());
        }

		Select sel= new Select(elem);
		
		sel.selectByVisibleText(value);
				
	
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "selectStatus1");

		ExtentReportManager.passStep(m_Driver, "selectStatus1");

		
		Reporter.log("selectStatus1");
	}
	
	public void selectEmployeeName(String value) throws Exception
	{
       getWebElement(By.xpath("//*[@id='select2-ddlEmployee-container']")).click();
		
       Thread.sleep(2000);
        
		WebElement elem = getWebElement(employeeNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectEmployeeName", "selectEmployeeName failed. Unable to locate object: " + employeeNameElem.toString());


			Assert.fail("Unable to locate object: " + employeeNameElem.toString());
        }
		
		elem.sendKeys(value);
		elem.sendKeys(Keys.ENTER);
	
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "selectEmployeeName");

		ExtentReportManager.passStep(m_Driver, "selectEmployeeName");

		Reporter.log("selectEmployeeName");
	}
	
	public void enterFromDateFilter(String value) throws Exception
	{
		
        
		WebElement elem = getWebElement(dateFromFilterElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFromDateFilter", "enterFromDateFilter failed. Unable to locate object: " + dateFromFilterElem.toString());


			Assert.fail("Unable to locate object: " + dateFromFilterElem.toString());
        }
		
		elem.sendKeys(value);
	
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "enterFromDateFilter");

		ExtentReportManager.passStep(m_Driver, "enterFromDateFilter");

		Reporter.log("enterFromDateFilter");
	}
	
	public void enterToDateFilter(String value) throws Exception
	{
		WebElement elem = getWebElement(dateToFilterElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterToDateFilter", "enterToDateFilter failed. Unable to locate object: " + dateToFilterElem.toString());


			Assert.fail("Unable to locate object: " + dateToFilterElem.toString());
        }
		
		elem.sendKeys(value);
	
		getWebElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[2]/div/div/div[5]/label")).click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "enterToDateFilter");

		ExtentReportManager.passStep(m_Driver, "enterToDateFilter");

		Reporter.log("enterToDateFilter");
	}
	
	
	
	
	public void clickLeaveReport() throws Exception
	{
        
		WebElement elem = getWebElement(leaveReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeaveReport", "clickLeaveReport failed. Unable to locate object: " + leaveReportElem.toString());


			Assert.fail("Unable to locate object: " + leaveReportElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickLeaveReport");

		ExtentReportManager.passStep(m_Driver, "clickLeaveReport");

		
		Reporter.log("clickLeaveReport");
	}
	
	
	
	public void clickEmplyeeA() throws Exception
	{
        
		WebElement elem = getWebElement(employeeAElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeaveManagement", "clickLeaveManagement failed. Unable to locate object: " + employeeAElem.toString());


			Assert.fail("Unable to locate object: " + employeeAElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickEmplyeeA");

		ExtentReportManager.passStep(m_Driver, "clickEmplyeeA");

		
		Reporter.log("clickEmplyeeA");
	}
	
	

	public void clickHalfDayChekBox() throws Exception
	{
        
		WebElement elem = getWebElement(halfDayCheckBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickHalfDayChekBox", "clickHalfDayChekBox failed. Unable to locate object: " + halfDayCheckBoxElem.toString());


			Assert.fail("Unable to locate object: " + halfDayCheckBoxElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickHalfDayChekBox");

		ExtentReportManager.passStep(m_Driver, "clickHalfDayChekBox");

		
		Reporter.log("clickHalfDayChekBox");
	}
	
	public void clickEmplyeeB() throws Exception
	{
        
		WebElement elem = getWebElement(employeeBElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeaveManagement", "clickLeaveManagement failed. Unable to locate object: " + employeeBElem.toString());


			Assert.fail("Unable to locate object: " + employeeBElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickEmplyeeB");

		ExtentReportManager.passStep(m_Driver, "clickEmplyeeB");

		
		Reporter.log("clickEmplyeeB");
	}
	
	public void clickApprovedLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(approvedLeavesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApprovedLeaves", "clickApprovedLeaves failed. Unable to locate object: " + approvedLeavesElem.toString());


			Assert.fail("Unable to locate object: " + approvedLeavesElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickApprovedLeaves");

		ExtentReportManager.passStep(m_Driver, "clickApprovedLeaves");

		
		Reporter.log("clickApprovedLeaves");
	}
	
	
	public void clcikSearchBtn() throws Exception {
		
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']"));
		elem.click();
		Thread.sleep(2000);
		Reporter.log("clcikSearchBtn");
		
	}
	
	
	
	public void clickRejectedLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(rejectedLeaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApprovedLeaves", "clickApprovedLeaves failed. Unable to locate object: " + rejectedLeaveElem.toString());


			Assert.fail("Unable to locate object: " + rejectedLeaveElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickRejectedLeaves");

		ExtentReportManager.passStep(m_Driver, "clickRejectedLeaves");

		
		Reporter.log("clickRejectedLeaves");
	}
	
	
	public void clickDeletIcnCancelLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(deletIcnCancelLeaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletIcnCancelLeaves", "clickDeletIcnCancelLeavess failed. Unable to locate object: " + deletIcnCancelLeaveElem.toString());


			Assert.fail("Unable to locate object: " + deletIcnCancelLeaveElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickDeletIcnCancelLeaves");

		ExtentReportManager.passStep(m_Driver, "clickDeletIcnCancelLeaves");

		
		Reporter.log("clickDeletIcnCancelLeaves");
	}
	
	
	public void clickDeletIcnCancelLeaves1() throws Exception
	{
        
		WebElement elem = getWebElement(deletIcnCancelLeaveElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletIcnCancelLeaves1", "clickDeletIcnCancelLeaves1 failed. Unable to locate object: " + deletIcnCancelLeaveElem1.toString());


			Assert.fail("Unable to locate object: " + deletIcnCancelLeaveElem1.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickDeletIcnCancelLeaves1");

		ExtentReportManager.passStep(m_Driver, "clickDeletIcnCancelLeaves1");

		
		Reporter.log("clickDeletIcnCancelLeaves1");
	}
	
	
	
	public void clickGoBackBtn() throws Exception
	{
        
		WebElement elem = getWebElement(goBackElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickGoBackBtn", "clickGoBackBtn failed. Unable to locate object: " + goBackElem.toString());


			Assert.fail("Unable to locate object: " + goBackElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickGoBackBtn");

		ExtentReportManager.passStep(m_Driver, "clickGoBackBtn");

		
		Reporter.log("clickGoBackBtn");
	}
	
	

	public void enterAwe() throws Exception
	{
        
		WebElement elem = getWebElement(aweElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAwe", "enterAwe failed. Unable to locate object: " + aweElem.toString());


			Assert.fail("Unable to locate object: " + aweElem.toString());
        }

		elem.sendKeys("548");

		elem.sendKeys(Keys.TAB);
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "enterAwe");

		ExtentReportManager.passStep(m_Driver, "enterAwe");

		
		Reporter.log("enterAwe");
	}
	
	public void enterAwe1() throws Exception
	{
        
		WebElement elem = getWebElement(aweElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAwe", "enterAwe failed. Unable to locate object: " + aweElem1.toString());


			Assert.fail("Unable to locate object: " + aweElem1.toString());
        }

		for(int i=0;i<=5;i++)
		{
			elem.sendKeys(Keys.BACK_SPACE);
			
		}
		
		System.out.println("ncknc");
		elem.sendKeys("548");

		elem.sendKeys(Keys.TAB);
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "enterAwe");

		ExtentReportManager.passStep(m_Driver, "enterAwe");

		
		Reporter.log("enterAwe");
	}
	
	
	public void enterAweAdoption() throws Exception 
	{
	    By aweLocator = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAWEAdoption']");

	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(15));

	    // Clear existing value - fresh element every time
	    for (int i = 0; i <= 5; i++)
	    {
	        boolean success = false;

	        for (int attempt = 1; attempt <= 3; attempt++)
	        {
	            try
	            {
	                WebElement elem = wait.until(
	                        ExpectedConditions.presenceOfElementLocated(aweLocator)
	                );

	                elem.sendKeys(Keys.BACK_SPACE);
	                success = true;
	                break;
	            }
	            catch (StaleElementReferenceException e)
	            {
	                Thread.sleep(500);
	            }
	        }

	        if (!success)
	        {
	            Assert.fail("Unable to send BACK_SPACE to AWE Adoption field.");
	        }
	    }

	    // Fresh element before ENTER
	    WebElement elem = wait.until(
	            ExpectedConditions.elementToBeClickable(aweLocator)
	    );

	    elem.sendKeys(Keys.ENTER);

	    // Fresh element before entering value
	    elem = wait.until(
	            ExpectedConditions.elementToBeClickable(aweLocator)
	    );

	    elem.sendKeys("548");

	    // Fresh element before TAB
	    elem = wait.until(
	            ExpectedConditions.elementToBeClickable(aweLocator)
	    );

	    elem.sendKeys(Keys.TAB);

	    Thread.sleep(3000);

	    TakeScreenshot.takeScreenshot(m_Driver, "enterAwe");

	    ExtentReportManager.passStep(m_Driver, "enterAwe");
	    Reporter.log("enterAwe");
	}
	
	
	public void enterNote() throws Exception
	{
        
		WebElement elem = getWebElement(NoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNote", "enterNote failed. Unable to locate object: " + NoteElem.toString());


			Assert.fail("Unable to locate object: " + NoteElem.toString());
        }
		enterNote = RandomStringUtils.randomAlphabetic(50); 

		elem.sendKeys(enterNote);
		Thread.sleep(1000);

		TakeScreenshot.takeScreenshot(m_Driver, "enterNote");

		ExtentReportManager.passStep(m_Driver, "enterNote");

		
		Reporter.log("enterNote");
	}
	
	public void enterComment(String comment) throws Exception
	{
        
		WebElement elem = getWebElement(NoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNote", "enterNote failed. Unable to locate object: " + NoteElem.toString());


			Assert.fail("Unable to locate object: " + NoteElem.toString());
        }
		elem.sendKeys(comment);

		TakeScreenshot.takeScreenshot(m_Driver, "enterNote");

		ExtentReportManager.passStep(m_Driver, "enterNote");

		
		Reporter.log("enterComment");
	}
	public void clickCnacelBtn() throws Exception
	{
        
		WebElement elem = getWebElement(cancelBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCnacelBtn", "clickCnacelBtn failed. Unable to locate object: " + cancelBtnElem.toString());


			Assert.fail("Unable to locate object: " + cancelBtnElem.toString());
        }

		elem.click();
		Thread.sleep(1000);

		m_Driver.switchTo().alert().accept();
		TakeScreenshot.takeScreenshot(m_Driver, "clickCnacelBtn");

		ExtentReportManager.passStep(m_Driver, "clickCnacelBtn");

		
		Reporter.log("clickCnacelBtn");
	}
	
	
	public void Enter_StartBOLDate(String StartBOLDate) throws Exception 
	{
	    WebElement elem = getWebElement(
	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPBOLStartDate']")
	    );

	    if (elem == null) {
	        ExtentReportManager.failStepWithScreenshot(
	            m_Driver,
	            "Enter_StartBOLDate",
	            "Enter_StartBOLDate failed. Unable to locate object: "
	            + "//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPBOLStartDate']"
	        );

	        Assert.fail(
	            "Unable to locate object: //*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPBOLStartDate']"
	        );
	    }

	    jsExec.executeScript("window.scrollBy(0,800)");

	    for (int i = 0; i <= 9; i++) {
	        elem.sendKeys(Keys.BACK_SPACE);
	    }

	    elem.sendKeys(StartBOLDate);

	    Thread.sleep(1000);

	    elem.sendKeys(Keys.TAB);

	    Thread.sleep(3000);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Enter_StartBOLDate " + StartBOLDate
	    );
	}
	
	public void clickCheckBox() throws Exception
	{
        
		WebElement elem = getWebElement(checkBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCheckBox", "clickCheckBox failed. Unable to locate object: " + checkBoxElem.toString());


			Assert.fail("Unable to locate object: " + checkBoxElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickCheckBox");

		ExtentReportManager.passStep(m_Driver, "clickCheckBox");

		
		Reporter.log("clickCheckBox");
	}
	
	
	public void Select_BOLLength(String BOLLength) throws Exception 
	{
	    WebElement elem = getWebElement(
	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlNCPBOLLength']")
	    );

	    if (elem == null) {
	        ExtentReportManager.failStepWithScreenshot(
	            m_Driver,
	            "Select_BOLLength",
	            "Select_BOLLength failed. Unable to locate object: "
	            + "//*[@id='ctl00_ctl00_ParentContent_cPH_ddlNCPBOLLength']"
	        );

	        Assert.fail(
	            "Unable to locate object: //*[@id='ctl00_ctl00_ParentContent_cPH_ddlNCPBOLLength']"
	        );
	    }

	    Select select = new Select(elem);
	    select.selectByVisibleText(BOLLength);

	    Thread.sleep(2000);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Select_BOLLength " + BOLLength
	    );
	}
	
	public void Click_AddBOL() throws Exception 
	{
	    WebElement elem = getWebElement(
	        By.xpath("//*[@id='btnAddBOL']")
	    );

	    if (elem == null) {
	        ExtentReportManager.failStepWithScreenshot(
	            m_Driver,
	            "Click_AddBOL",
	            "Click_AddBOL failed. Unable to locate object: //*[@id='btnAddBOL']"
	        );

	        Assert.fail("Unable to locate object: //*[@id='btnAddBOL']");
	    }

	    elem.click();

	    Thread.sleep(2000);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Click_AddBOL"
	    );
	}
	
	
	public void clickCheckBox2() throws Exception
	{
        
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rprtLeaveInfo_ctl01_chkSelect']"));

		 WebElement elem2 = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rprtLeaveInfo_ctl02_chkSelect']"));
		elem.click();
		elem2.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickCheckBox");

		ExtentReportManager.passStep(m_Driver, "clickCheckBox");

		
		Reporter.log("clickCheckBox");
	}
	
	
	
	
	public void clickTotalLeaveTaken() throws Exception
	{
        
		WebElement elem = getWebElement(totalLeaveTaken);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTotalLeaveTaken", "clickTotalLeaveTaken failed. Unable to locate object: " + totalLeaveTaken.toString());


			Assert.fail("Unable to locate object: " + totalLeaveTaken.toString());
        }

		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickTotalLeaveTaken");

		ExtentReportManager.passStep(m_Driver, "clickTotalLeaveTaken");
		
		Reporter.log("clickTotalLeaveTaken");
	}
	
	
	
	public void clickPendingLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(pendingLeaves);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPendingLeaves", "clickPendingLeaves failed. Unable to locate object: " + pendingLeaves.toString());


			Assert.fail("Unable to locate object: " + pendingLeaves.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickPendingLeaves");

		ExtentReportManager.passStep(m_Driver, "clickPendingLeaves");

		Reporter.log("clickPendingLeaves");
	}
	
	public void clickApplyLeaveLink() throws Exception
	{
        
		WebElement elem = getWebElement(applyLeaveLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApplyLeaveLink", "clickApplyLeaveLink failed. Unable to locate object: " + applyLeaveLinkElem.toString());


			Assert.fail("Unable to locate object: " + applyLeaveLinkElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickApplyLeaveLink");

		ExtentReportManager.passStep(m_Driver, "clickApplyLeaveLink");

		Reporter.log("clickApplyLeaveLink");
	}
	
	public void clickLeaveBalance() throws Exception
	{
        
		WebElement elem = getWebElement(leaveBalanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeaveBalance", "clickLeaveBalance failed. Unable to locate object: " + leaveBalanceElem.toString());


			Assert.fail("Unable to locate object: " + leaveBalanceElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickLeaveBalance");

		ExtentReportManager.passStep(m_Driver, "clickLeaveBalance");

		Reporter.log("clickLeaveBalance");
	}
	
	
	public void clickApproveBtn() throws Exception
	{
        
		WebElement elem = getWebElement(leaveApproveBtnELem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCheckBox", "clickCheckBox failed. Unable to locate object: " + leaveApproveBtnELem.toString());


			Assert.fail("Unable to locate object: " + leaveApproveBtnELem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickApproveBtn");

		ExtentReportManager.passStep(m_Driver, "clickApproveBtn");

		
		Reporter.log("clickApproveBtn");
	}
	
	
	public void changeWindow() {
		
		
		
//		utilities.ChangeWindow.Switchwindow(3, m_Driver);
//
//		System.out.println("nndnnffn");
		
	}
	
	public void clickRejectBtn() throws Exception
	{
        
		WebElement elem = getWebElement(rejectBtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRejectBtn", "clickRejectBtn failed. Unable to locate object: " + rejectBtn.toString());


			Assert.fail("Unable to locate object: " + rejectBtn.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickRejectBtn");

		ExtentReportManager.passStep(m_Driver, "clickRejectBtn");

		
		Reporter.log("clickRejectBtn");
	}
	
	
	public void clickGoBack() throws Exception
	{
        
		WebElement elem = getWebElement(goBackBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickGoBack", "clickGoBack failed. Unable to locate object: " + goBackBtnElem.toString());


			Assert.fail("Unable to locate object: " + goBackBtnElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickGoBack");

		ExtentReportManager.passStep(m_Driver, "clickGoBack");

		
		Reporter.log("clickGoBack");
	}
	
	
	public void clickEmployeeNameOnLeaveCancelPage() throws Exception
	{
        
		WebElement elem = getWebElement(employeeName1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeNameOnLeaveCancelPage", "clickEmployeeNameOnLeaveCancelPage failed. Unable to locate object: " + employeeName1Elem.toString());


			Assert.fail("Unable to locate object: " + employeeName1Elem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickEmployeeNameOnLeaveCancelPage");

		ExtentReportManager.passStep(m_Driver, "clickEmployeeNameOnLeaveCancelPage");

		
		Reporter.log("clickEmployeeNameOnLeaveCancelPage");
	}
	
	
	
	
	
	public void clickPendingForApproval() throws Exception
	{
        
		WebElement elem = getWebElement(pendingForApprovalElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPendingForApproval", "clickPendingForApproval failed. Unable to locate object: " + pendingForApprovalElem.toString());


			Assert.fail("Unable to locate object: " + pendingForApprovalElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickPendingForApproval");

		ExtentReportManager.passStep(m_Driver, "clickPendingForApproval");

		
		Reporter.log("clickPendingForApproval");
	}
	
	public void clickManageLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(manageLeavesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickManageLeaves", "clickManageLeaves failed. Unable to locate object: " + manageLeavesElem.toString());


			Assert.fail("Unable to locate object: " + manageLeavesElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickManageLeaves");

		ExtentReportManager.passStep(m_Driver, "clickManageLeaves");

		
		Reporter.log("clickManageLeaves");
	}
	
	
	public void clickApplyLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(applyLeavesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApplyLeaves", "clickApplyLeaves failed. Unable to locate object: " + applyLeavesElem.toString());


			Assert.fail("Unable to locate object: " + applyLeavesElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickApplyLeaves");

		ExtentReportManager.passStep(m_Driver, "clickApplyLeaves");

		
		Reporter.log("clickApplyLeaves");
	}
	
	
	public void clickCancelLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(cancelLeavesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCancelLeaves", "clickCancelLeaves failed. Unable to locate object: " + cancelLeavesElem.toString());


			Assert.fail("Unable to locate object: " + cancelLeavesElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickCancelLeaves");

		ExtentReportManager.passStep(m_Driver, "clickCancelLeaves");

		
		Reporter.log("clickCancelLeaves");
	}
	
	
	public void clickHistoryLeaves() throws Exception
	{
        
		WebElement elem = getWebElement(historyLeavesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickHistoryLeaves", "clickHistoryLeaves failed. Unable to locate object: " + historyLeavesElem.toString());


			Assert.fail("Unable to locate object: " + historyLeavesElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickHistoryLeaves");

		ExtentReportManager.passStep(m_Driver, "clickHistoryLeaves");

		
		Reporter.log("clickHistoryLeaves");
	}
	
	public void clickHistoryLeaves1() throws Exception
	{
        
		WebElement elem = getWebElement(historyLeavesElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickHistoryLeaves1", "clickHistoryLeaves1 failed. Unable to locate object: " + historyLeavesElem1.toString());


			Assert.fail("Unable to locate object: " + historyLeavesElem1.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickHistoryLeaves1");

		ExtentReportManager.passStep(m_Driver, "clickHistoryLeaves1");

		
		Reporter.log("clickHistoryLeaves1");
	}
	public void enterLeaveReson(String data) throws Exception
	{
        
		jsExec.executeScript("window.scrollBy(0,800)");

		WebElement elem = getWebElement(resonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterLeaveReson", "enterLeaveReson failed. Unable to locate object: " + resonElem.toString());


			Assert.fail("Unable to locate object: " + resonElem.toString());
        }
		elem.clear();
		elem.sendKeys(data);
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "enterLeaveReson");

		ExtentReportManager.passStep(m_Driver, "enterLeaveReson");

		
		Reporter.log("enterLeaveReson");
	}
	
	public void clickDeletBtn() throws Exception
	{
        
		WebElement elem = getWebElement(deletBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeaveManagement", "clickLeaveManagement failed. Unable to locate object: " + deletBtnElem.toString());


			Assert.fail("Unable to locate object: " + deletBtnElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickDeletBtn");

		ExtentReportManager.passStep(m_Driver, "clickDeletBtn");

		
		Reporter.log("clickDeletBtn");
	}
	
	
	
	public void clickDeletIcn() throws Exception
	{
        
		WebElement elem = getWebElement(deletIcnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletIcn", "clickDeletIcn failed. Unable to locate object: " + deletIcnElem.toString());


			Assert.fail("Unable to locate object: " + deletIcnElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickDeletIcn");

		ExtentReportManager.passStep(m_Driver, "clickDeletIcn");

		
		Reporter.log("clickDeletIcn");
	}
	
	
	
	public void clickSaveBtn() throws Exception
	{

		WebElement elem = getWebElement(saveBtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveBtn.toString());


			Assert.fail("Unable to locate object: " + saveBtn.toString());
        }

	      jsExec.executeScript("arguments[0].scrollIntoView();", elem);
			Thread.sleep(2000);

		elem.click();
		Thread.sleep(5000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickSaveBtn");

		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");

		
		Reporter.log("clickSaveBtn");
	}
	
	
	public void clickSaveBtn5() throws Exception
	{


		WebElement elem = getWebElement(saveBtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveBtn.toString());


			Assert.fail("Unable to locate object: " + saveBtn.toString());
        }

		
		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_txtAWEPaternity\"]"));
		
		
		Robot rb= new Robot();
		
	for(int i=1;i<=20;i++)
	{
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
	}
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	System.out.println("vvh");
//		elem1.sendKeys(Keys.ENTER);
//		Actions act= new Actions(m_Driver) ;
//
//		act.moveToElement(elem).perform();
//		act.click().perform();
//	
		
//		jsExec.executeScript("window.scrollBy(0,00)");
//
//		Thread.sleep(9000);
//		elem.click();
//		System.out.println("ldm");
//
// 		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
//
//		TakeScreenshot.takeScreenshot(m_Driver, "clickSaveBtn");
//
//		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");
//
//		
//		Reporter.log("clickSaveBtn");
	}
	
	
	public void clickAddLeave() throws Exception
	{
        
		WebElement elem = getWebElement(addleaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddLeave", "clickAddLeave failed. Unable to locate object: " + addleaveElem.toString());


			Assert.fail("Unable to locate object: " + addleaveElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickAddLeave");

		ExtentReportManager.passStep(m_Driver, "clickAddLeave");

		
		Reporter.log("clickAddLeave");
	}
	
	
	public void selectLeaveType(String value) throws Exception
	{
        
		WebElement elem = getWebElement(leaveType);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectLeaveType", "selectLeaveType failed. Unable to locate object: " + leaveType.toString());


			Assert.fail("Unable to locate object: " + leaveType.toString());
        }

		Select sel= new Select(elem);
		sel.selectByVisibleText(value);
	
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "selectLeaveType");

		ExtentReportManager.passStep(m_Driver, "selectLeaveType");

		
		Reporter.log("selectLeaveType");
	}
	
	
	public void selectEmployee(String value) throws Exception
	{
        
		WebElement elem = getWebElement(employeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectEmployee", "selectEmployee failed. Unable to locate object: " + employeeElem.toString());


			Assert.fail("Unable to locate object: " + employeeElem.toString());
        }

		Select sel= new Select(elem);
		sel.selectByVisibleText(value);
	
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "selectEmployee");

		ExtentReportManager.passStep(m_Driver, "selectEmployee");

		
		Reporter.log("selectEmployee");
	}
	
	
	public void Enter_ActualBirthDate(String actualBirthDate) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(actualBirthDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ExpectedBirthDate", "Enter_ExpectedBirthDate failed. Unable to locate object: " + actualBirthDateElem.toString());

    		Assert.fail("Unable to locate object: " + actualBirthDateElem.toString());
         }
 		
 		
 		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
 		
 		for(int i=0;i<=9;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		
 		elem.sendKeys(actualBirthDate);
 		Thread.sleep(3000);
 		elem.sendKeys(Keys.TAB);
 		Reporter.log("Enter Actual BirthDate");
 		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
 		Thread.sleep(3000);
  		ExtentReportManager.passStep(m_Driver, "Enter_ActualBirthDate " + actualBirthDate);

  		
  			}
	
	
	
	public void Enter_ExpectedBirthDate(String ExpectedBirthDate) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(ExpectedBirthDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ExpectedBirthDate", "Enter_ExpectedBirthDate failed. Unable to locate object: " + ExpectedBirthDateElem.toString());

    		Assert.fail("Unable to locate object: " + ExpectedBirthDateElem.toString());
         }
 		
 		jsExec.executeScript("window.scrollBy(0,800)");
 		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
 		for(int i=0;i<=9;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(ExpectedBirthDate);
 		Thread.sleep(1000);
 		
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(3000);
 		
   		ExtentReportManager.passStep(m_Driver, "Enter_ExpectedBirthDate " + ExpectedBirthDate);

  		
  			}
	
	public void Enter_NeonatalActualBirthDate(String ActualBirthDate) throws Exception 
	{
	    WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPActualBirthDate']"));

	    if (elem == null) {
	        ExtentReportManager.failStepWithScreenshot(
	            m_Driver,
	            "Enter_NeonatalActualBirthDate",
	            "Enter_NeonatalActualBirthDate failed. Unable to locate object: " 
	            + "//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPActualBirthDate']"
	        );

	        Assert.fail("Unable to locate object: //*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPActualBirthDate']");
	    }

	    jsExec.executeScript("window.scrollBy(0,800)");

	    for (int i = 0; i <= 9; i++) {
	        elem.sendKeys(Keys.BACK_SPACE);
	    }

	    elem.sendKeys(ActualBirthDate);

	    Thread.sleep(1000);

	    elem.sendKeys(Keys.TAB);

	    Thread.sleep(3000);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Enter_NeonatalActualBirthDate " + ActualBirthDate
	    );
	}
	
	public void Enter_ChildEntersCareDate(String ChildEntersCare) throws Exception 
	{
	    WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPChildEntersCare']"));

	    if (elem == null) {
	        ExtentReportManager.failStepWithScreenshot(
	            m_Driver,
	            "Enter_ChildEntersCareDate",
	            "Enter_ChildEntersCareDate failed. Unable to locate object: "
	            + "//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPChildEntersCare']"
	        );

	        Assert.fail("Unable to locate object: //*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPChildEntersCare']");
	    }

	    jsExec.executeScript("window.scrollBy(0,800)");

	    for (int i = 0; i <= 9; i++) {
	        elem.sendKeys(Keys.BACK_SPACE);
	    }

	    elem.sendKeys(ChildEntersCare);

	    Thread.sleep(1000);

	    elem.sendKeys(Keys.TAB);

	    Thread.sleep(3000);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Enter_ChildEntersCareDate " + ChildEntersCare
	    );
	}
	
	
	public void Enter_ChildLeavesCareDate(String ChildLeavesCare) throws Exception 
	{
	    WebElement elem = getWebElement(
	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPChildEntersCare']")
	    );

	    if (elem == null) {
	        ExtentReportManager.failStepWithScreenshot(
	            m_Driver,
	            "Enter_ChildLeavesCareDate",
	            "Enter_ChildLeavesCareDate failed. Unable to locate object: "
	            + "//*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPChildEntersCare']"
	        );

	        Assert.fail("Unable to locate object: //*[@id='ctl00_ctl00_ParentContent_cPH_txtNCPChildEntersCare']");
	    }

	    jsExec.executeScript("window.scrollBy(0,800)");

	    for (int i = 0; i <= 9; i++) {
	        elem.sendKeys(Keys.BACK_SPACE);
	    }

	    elem.sendKeys(ChildLeavesCare);

	    Thread.sleep(1000);

	    elem.sendKeys(Keys.TAB);

	    Thread.sleep(3000);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Enter_ChildLeavesCareDate " + ChildLeavesCare
	    );
	}
	public void Enter_AWE(String AWE) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(AWE_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ExpectedBirthDate", "Enter_ExpectedBirthDate failed. Unable to locate object: " + AWE_Elem.toString());

    		Assert.fail("Unable to locate object: " + AWE_Elem.toString());
         }
 		jsExec.executeScript("window.scrollBy(0,800)");
 		
 		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
// 		elem.clear();
// 		Thread.sleep(2000);
// 		jsExec.executeScript("window.scrollBy(0,800)");
 		Reporter.log("Enter AWE");
 		elem.sendKeys(AWE);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(1000);
  		ExtentReportManager.passStep(m_Driver, "Enter_ActualBirthDate " + AWE);

  		
  			}
	
	public void Enter_AWENeonatal(String AWENeonatal) throws Exception 
	{
	    WebElement elem = getWebElement(
	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAWENeonatal']")
	    );

	    if (elem == null) {
	        ExtentReportManager.failStepWithScreenshot(
	            m_Driver,
	            "Enter_AWENeonatal",
	            "Enter_AWENeonatal failed. Unable to locate object: "
	            + "//*[@id='ctl00_ctl00_ParentContent_cPH_txtAWENeonatal']"
	        );

	        Assert.fail(
	            "Unable to locate object: //*[@id='ctl00_ctl00_ParentContent_cPH_txtAWENeonatal']"
	        );
	    }

	    jsExec.executeScript("window.scrollBy(0,800)");

	    for (int i = 0; i <= 9; i++) {
	        elem.sendKeys(Keys.BACK_SPACE);
	    }

	    elem.sendKeys(AWENeonatal);

	    Thread.sleep(1000);

	    elem.sendKeys(Keys.TAB);

	    Thread.sleep(3000);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Enter_AWENeonatal " + AWENeonatal
	    );
	}
	
	
	
	
	public void Enter_AweAdoption(String AWE) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAWEAdoption']"));

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ExpectedBirthDate", "Enter_ExpectedBirthDate failed. Unable to locate object: " + AWE_Elem.toString());
//
//    		Assert.fail("Unable to locate object: " + AWE_Elem.toString());
//         }
 		jsExec.executeScript("window.scrollBy(0,800)");
 		
 		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
// 		elem.clear();
// 		Thread.sleep(2000);
// 		jsExec.executeScript("window.scrollBy(0,800)");
 		Reporter.log("Enter AWE");
 		elem.sendKeys(AWE);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(1000);
  		ExtentReportManager.passStep(m_Driver, "Enter_ActualBirthDate " + AWE);

  			}
	
	
	public void Enter_AWESick(String AWE) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(AWE_ElemSick);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AWESick", "Enter_ExpectedBirthDate failed. Unable to locate object: " + AWE_ElemSick.toString());

    		Assert.fail("Unable to locate object: " + AWE_ElemSick.toString());
         }
 		jsExec.executeScript("window.scrollBy(0,800)");
 		for(int i=0;i<=4;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
// 		elem.clear();
// 		Thread.sleep(2000);
// 		jsExec.executeScript("window.scrollBy(0,800)");
 		Reporter.log("Enter AWE");
 		elem.sendKeys(AWE);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(1000);
  		ExtentReportManager.passStep(m_Driver, "Enter_ActualBirthDate " + AWE);

  		
  			}
	
	

	public void Enter_LeaverStartDate(String LeaverStartDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(LeaverStartDateElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDate", "Enter_LeaverStartDate failed. Unable to locate object: " + LeaverStartDateElem.toString());

  		Assert.fail("Unable to locate object: " + LeaverStartDateElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverStartDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		jsExec.executeScript("window.scrollBy(0,800)");
		Reporter.log("Enter Leaver StartDate");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDate " + LeaverStartDate);

		
			}
	
	
	public void Enter_LeaverStartDateAdoption(String LeaverStartDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtSAPStartDate']"));

//		if (elem == null) {
//  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDate", "Enter_LeaverStartDate failed. Unable to locate object: " + LeaverStartDateElem.toString());
//
//  		Assert.fail("Unable to locate object: " + LeaverStartDateElem.toString());
//       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverStartDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		jsExec.executeScript("window.scrollBy(0,800)");
		Reporter.log("Enter Leaver StartDate");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDate " + LeaverStartDate);

		
			}
	
	

	public void Enter_MatchingDatetDateAdoption(String LeaverStartDate) throws Exception 
	{
	    By matchingDateLocator = By.xpath(
	        "//*[@id='ctl00_ctl00_ParentContent_cPH_txtMatchingDate']"
	    );

	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(15));

	    jsExec.executeScript("window.scrollBy(0,800)");
	    Thread.sleep(1000);

	    // Clear existing date
	    for (int i = 0; i <= 9; i++)
	    {
	        boolean success = false;

	        for (int attempt = 1; attempt <= 3; attempt++)
	        {
	            try
	            {
	                WebElement elem = wait.until(
	                    ExpectedConditions.elementToBeClickable(matchingDateLocator)
	                );

	                elem.sendKeys(Keys.BACK_SPACE);
	                success = true;
	                break;
	            }
	            catch (StaleElementReferenceException e)
	            {
	                Thread.sleep(500);
	            }
	        }

	        if (!success)
	        {
	            Assert.fail("Unable to clear Matching Date field.");
	        }
	    }

	    // Enter date - fresh element
	    WebElement elem = wait.until(
	        ExpectedConditions.elementToBeClickable(matchingDateLocator)
	    );

	    elem.sendKeys(LeaverStartDate);

	    Thread.sleep(2000);

	    // TAB with retry
	    boolean tabSuccess = false;

	    for (int attempt = 1; attempt <= 3; attempt++)
	    {
	        try
	        {
	            elem = wait.until(
	                ExpectedConditions.elementToBeClickable(matchingDateLocator)
	            );

	            elem.sendKeys(Keys.TAB);
	            tabSuccess = true;
	            break;
	        }
	        catch (StaleElementReferenceException e)
	        {
	            Thread.sleep(500);
	        }
	    }

	    if (!tabSuccess)
	    {
	        Assert.fail("Unable to press TAB on Matching Date field.");
	    }

	    Thread.sleep(2000);

	    jsExec.executeScript("window.scrollBy(0,800)");

	    Reporter.log("Enter Matching Date: " + LeaverStartDate);

	    ExtentReportManager.passStep(
	        m_Driver,
	        "Enter_MatchingDateAdoption " + LeaverStartDate
	    );
	}
	
	public void Enter_PlacementDatetDateAdoption(String LeaverStartDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtPlacementDate']"));

//		if (elem == null) {
//  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDate", "Enter_LeaverStartDate failed. Unable to locate object: " + LeaverStartDateElem.toString());
//
//  		Assert.fail("Unable to locate object: " + LeaverStartDateElem.toString());
//       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverStartDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		jsExec.executeScript("window.scrollBy(0,800)");
		Reporter.log("Enter Leaver StartDate");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDate " + LeaverStartDate);

			}
	
	
	
	
	
	
	public void Enter_LeaverStartDateClient(String LeaverStartDate) throws Exception
	{
	    
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDateSick']"));

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDate", "Enter_LeaverStartDate failed. Unable to locate object: " + elem.toString());

  		Assert.fail("Unable to locate object: " + elem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverStartDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		jsExec.executeScript("window.scrollBy(0,800)");
		Reporter.log("Enter Leaver StartDate");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDate " + LeaverStartDate);

		
			}
	
	public void clickDaysRadioBtns()
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rbUnit_0']"));
		
		elem.click();
		
       Reporter.log("clickDaysRadioBtns");
	}
	
	
	
	
	
	
	
	public void Enter_LeaverStartDateHoliday(String LeaverStartDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(LeaverStartHolidayDateElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDateHoliday", "Enter_LeaverStartDateHoliday failed. Unable to locate object: " + LeaverStartHolidayDateElem.toString());

  		Assert.fail("Unable to locate object: " + LeaverStartHolidayDateElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverStartDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		jsExec.executeScript("window.scrollBy(0,800)");
		Reporter.log("Enter Leaver StartDate");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDateHoliday " + LeaverStartDate);

		
			}
	
	
//	public void Enter_LeaverStartDateSick(String LeaverStartDate) throws Exception
//	{
//	    
//		
//		WebElement elem = getWebElement(LeaverStartDateSickLeaveElem);
//
//		if (elem == null) {
//  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDateSick", "Enter_LeaverStartDateSick failed. Unable to locate object: " + LeaverStartDateSickLeaveElem.toString());
//
//  		Assert.fail("Unable to locate object: " + LeaverStartDateSickLeaveElem.toString());
//       }
//		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
//		jsExec.executeScript("window.scrollBy(0,800)");
//		for(int i=0;i<=9;i++)
// 		{
//			//System.out.println("yz");
//		    elem = getWebElement(LeaverStartDateSickLeaveElem);
//	
//			//elem.sendKeys(Keys.TAB);
//			//Thread.sleep(5000);
// 			elem.sendKeys(Keys.BACK_SPACE);
// 			
// 		}
//		//elem.clear();
//		elem.sendKeys(LeaverStartDate);
//		Thread.sleep(2000);
//		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
//	    elem = getWebElement(LeaverStartDateSickLeaveElem);
//
//		elem.sendKeys(Keys.TAB);
//		Thread.sleep(2000);
//		jsExec.executeScript("window.scrollBy(0,800)");
//		Reporter.log("Enter Leaver StartDate");
//		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDateSick " + LeaverStartDate);
//
//		
//			}
	
	
	public void Enter_LeaverStartDateSick(String LeaverStartDate) throws Exception 
	{
	    int maxAttempts = 3;

	    for (int attempt = 1; attempt <= maxAttempts; attempt++)
	    {
	        try
	        {
	            jsExec.executeScript("window.scrollBy(0,800)");
	            Thread.sleep(1000);

	            // Fresh element
	            WebElement elem = getWebElement(LeaverStartDateSickLeaveElem);

	            if (elem == null)
	            {
	                ExtentReportManager.failStepWithScreenshot(
	                        m_Driver,
	                        "Enter_LeaverStartDateSick",
	                        "Unable to locate object: "
	                                + LeaverStartDateSickLeaveElem.toString());

	                Assert.fail("Unable to locate object: "
	                        + LeaverStartDateSickLeaveElem.toString());
	            }

	            // Clear existing value - fresh element every time
	            for (int i = 0; i < 10; i++)
	            {
	                try
	                {
	                    elem = getWebElement(LeaverStartDateSickLeaveElem);

	                    if (elem == null)
	                        throw new StaleElementReferenceException("Element not found");

	                    elem.sendKeys(Keys.BACK_SPACE);
	                }
	                catch (StaleElementReferenceException e)
	                {
	                    Thread.sleep(500);
	                    i--; // retry same iteration
	                }
	            }

	            // Fresh element before entering date
	            elem = getWebElement(LeaverStartDateSickLeaveElem);

	            if (elem == null)
	                throw new StaleElementReferenceException("Element not found");

	            elem.sendKeys(LeaverStartDate);

	            Thread.sleep(2000);

	            // Fresh element before TAB
	            elem = getWebElement(LeaverStartDateSickLeaveElem);

	            if (elem == null)
	                throw new StaleElementReferenceException("Element not found");

	            elem.sendKeys(Keys.TAB);

	            Thread.sleep(2000);

	            jsExec.executeScript("window.scrollBy(0,800)");

	            Reporter.log("Enter Leaver StartDate");

	            ExtentReportManager.passStep(
	                    m_Driver,
	                    "Enter_LeaverStartDateSick " + LeaverStartDate);

	            return;
	        }
	        catch (StaleElementReferenceException e)
	        {
	            Reporter.log(
	                    "StaleElementReferenceException - Retry "
	                    + attempt + "/" + maxAttempts);

	            if (attempt == maxAttempts)
	            {
	                ExtentReportManager.failStepWithScreenshot(
	                        m_Driver,
	                        "Enter_LeaverStartDateSick",
	                        "Failed after " + maxAttempts
	                                + " attempts due to stale element.");

	                Assert.fail(
	                        "Enter_LeaverStartDateSick failed due to StaleElementReferenceException.");
	            }

	            Thread.sleep(1000);
	        }
	    }
	}
	
	
	public void Enter_LeaverStartDateSSP(String LeaverStartDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(LeaverStartDateSPPElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDateSSP", "Enter_LeaverStartDateSSP failed. Unable to locate object: " + LeaverStartDateSPPElem.toString());

  		Assert.fail("Unable to locate object: " + LeaverStartDateSPPElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
//		Thread.sleep(5000);
//
		elem.sendKeys(Keys.TAB);

		Thread.sleep(5000);
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
		    //elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}

		jsExec.executeScript("window.scrollBy(0,800)");

		elem.sendKeys(LeaverStartDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Reporter.log("Enter_LeaverStartDateSSP");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDateSSP " + LeaverStartDate);

		
			}
	

	public void Enter_LeaverEndDate(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(LeaverEndDateElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDate", "Enter_LeaverEndDate failed. Unable to locate object: " + LeaverEndDateElem.toString());

  		Assert.fail("Unable to locate object: " + LeaverEndDateElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		jsExec.executeScript("window.scrollBy(0,800)");
		Reporter.log("Enter Leaver StartDate");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverEndDate " + LeaverEndDate);

		
			}
	
	
	public void Enter_LeaverEndDateHoliday(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(LeaverEndDateHolidayElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverEndDateHoliday", "Enter_LeaverEndDateHoliday failed. Unable to locate object: " + LeaverEndDateHolidayElem.toString());

  		Assert.fail("Unable to locate object: " + LeaverEndDateHolidayElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Reporter.log("Enter_LeaverEndDateHoliday");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverEndDateHoliday " + LeaverEndDate);

		
			}
	
	
	public void Enter_LeaverEndDateSick(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(LeaverEndDateSickLeaveElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverEndDateSick", "Enter_LeaverEndDateSick failed. Unable to locate object: " + LeaverEndDateSickLeaveElem.toString());

  		Assert.fail("Unable to locate object: " + LeaverEndDateSickLeaveElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Reporter.log("Enter_LeaverEndDateSick");
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverEndDateSick " + LeaverEndDate);

		
			}
	
	public void enterExpectedBirthDate(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(expectedBirthElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterExpectedBirthDate", "enterExpectedBirthDate failed. Unable to locate object: " + expectedBirthElem.toString());

  		Assert.fail("Unable to locate object: " + expectedBirthElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Reporter.log("enterExpectedBirthDate");
		ExtentReportManager.passStep(m_Driver, "enterExpectedBirthDate " + LeaverEndDate);
		
			}
	
	
	public void enterActualBirthDate(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(actualBirthElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterActualBirthDate", "enterActualBirthDate failed. Unable to locate object: " + actualBirthElem.toString());

  		Assert.fail("Unable to locate object: " + actualBirthElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Reporter.log("enterActualBirthDate");
		ExtentReportManager.passStep(m_Driver, "enterActualBirthDate " + LeaverEndDate);
		
			}
	
	
	
	public void enterActualBirthDateSSP(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(actualBirthSSPElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterActualBirthDateSSP", "enterActualBirthDateSSP failed. Unable to locate object: " + actualBirthSSPElem.toString());

  		Assert.fail("Unable to locate object: " + actualBirthSSPElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Reporter.log("enterActualBirthDate");
		ExtentReportManager.passStep(m_Driver, "enterActualBirthDateSSP " + LeaverEndDate);
		
			}
	
	
	public void enterFromDate(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(fromDateElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFromDate", "enterFromDate failed. Unable to locate object: " + fromDateElem.toString());

  		Assert.fail("Unable to locate object: " + fromDateElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(2000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		Reporter.log("enterFromDate");
		ExtentReportManager.passStep(m_Driver, "enterFromDate " + LeaverEndDate);
		
			}
	
	
	public void mToDate(String LeaverEndDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(mToDateElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "mToDate", "mToDate failed. Unable to locate object: " + mToDateElem.toString());

  		Assert.fail("Unable to locate object: " + mToDateElem.toString());
       }
		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		jsExec.executeScript("window.scrollBy(0,800)");
		for(int i=0;i<=9;i++)
 		{
			//System.out.println("yz");
			
			//elem.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
 			elem.sendKeys(Keys.BACK_SPACE);
 			
 		}
		//elem.clear();
		elem.sendKeys(LeaverEndDate);
		Thread.sleep(4000);
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div[9]/label")).click();
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		Reporter.log("mToDate");
		ExtentReportManager.passStep(m_Driver, "mToDate " + LeaverEndDate);
		
			}
 	
	             
	
	         public void chooseFileSmp() throws InterruptedException
	         {
	        	   WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_fileUploadLettermidwife']"));
	        	 
	        	   elem.sendKeys("E:\\SeleniumFramework\\SonuPayrollNew\\SeleniumFramework\\Attachements\\Employee-Payslip-Mr. Employee A-30_04_2023.pdf");
	        	   
	        	   Thread.sleep(3000);
	        	   Reporter.log("chooseFileSmp");
	         }
	         
	         
	     
	         
	         public void chooseFileSmp1() throws InterruptedException
	         {
	        	   WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_fileUploadMATB1']"));
	        	 
	        	   elem.sendKeys("E:\\SeleniumFramework\\SonuPayrollNew\\SeleniumFramework\\Attachements\\Employee-Payslip-Mr. Employee A-30_04_2023.pdf");
	        	   
	        	   Thread.sleep(3000);
	        	   Reporter.log("chooseFileSmp");
	         }
	
	         
	         public void chooseFileSickLeave() throws InterruptedException
	         {
	        	   WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_fileUploadSick']"));
	        	 
	        	   elem.sendKeys("E:\\SeleniumFramework\\SonuPayrollNew\\SeleniumFramework\\Attachements\\Employee-Payslip-Mr. Employee A-30_04_2023.pdf");
	        	   
	        	   Thread.sleep(3000);
	        	   Reporter.log("chooseFileSmp");
	         }
	         
	         public void chooseFileSickLeave(String Loc) throws InterruptedException
	         {
	        	   WebElement elem = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_attachDocumentLinkSick']"));
	        	   elem.click();
	        	   WebElement elem2 = getWebElement(By.xpath("//input[@id='fileInput']"));
	        	   elem2.sendKeys(Loc);
	        	   Thread.sleep(3000);
	        	   WebElement Uploaded = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_startButton']"));
	        	   Uploaded.click();
	        	   
	        	   Thread.sleep(3000);
	        	   Reporter.log("chooseFileSmp");
	         }

	         
	     	public void enterleaveStartDateCompany(String value) throws Exception
	    	{
	    		
	            
	    		WebElement elem = getWebElement(leaveStartDateCompany);

	    		if (elem == null) {
	        		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterleaveStartDateCompany", "enterleaveStartDateCompany failed. Unable to locate object: " + leaveStartDateCompany.toString());


	    			Assert.fail("Unable to locate object: " + leaveStartDateCompany.toString());
	            }
	    		
	    		elem.sendKeys(value);
	    	
	    		Thread.sleep(2000);

	    		TakeScreenshot.takeScreenshot(m_Driver, "enterleaveStartDateCompany");

	    		ExtentReportManager.passStep(m_Driver, "enterleaveStartDateCompany");

	    		Reporter.log("enterleaveStartDateCompany");
	    	}
	     	
	     	
	    	public void enterleaveDaysComapny(String value) throws Exception
	    	{
	    		
	            
	    		WebElement elem = getWebElement(leaveDaysComapny);

	    		if (elem == null) {
	        		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterleaveStartDateCompany", "enterleaveStartDateCompany failed. Unable to locate object: " + leaveDaysComapny.toString());

	    			Assert.fail("Unable to locate object: " + leaveDaysComapny.toString());
	            }
	    		
	    		elem.sendKeys(value);
	    	
	    		Thread.sleep(2000);

	    		TakeScreenshot.takeScreenshot(m_Driver, "enterleaveDaysComapny");

	    		ExtentReportManager.passStep(m_Driver, "enterleaveDaysComapny");

	    		Reporter.log("enterleaveDaysComapny");
	    	}
	    	
	    	
	    	public void enterholidayPayRateCompany(String value) throws Exception
	    	{
	    		
	            
	    		WebElement elem = getWebElement(holidayPayRateCompany);

	    		if (elem == null) {
	        		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterleaveStartDateCompany", "enterleaveStartDateCompany failed. Unable to locate object: " + holidayPayRateCompany.toString());

	    			Assert.fail("Unable to locate object: " + holidayPayRateCompany.toString());
	            }
	    		
	    		elem.sendKeys(value);
	    	
	    		Thread.sleep(2000);

	    		TakeScreenshot.takeScreenshot(m_Driver, "enterholidayPayRateCompany");

	    		ExtentReportManager.passStep(m_Driver, "enterholidayPayRateCompany");

	    		Reporter.log("enterholidayPayRateCompany");
	    	}
	    	
	    	
	    	public void enterMaxCarryOveCompany(String value) throws Exception
	    	{
	    		
	    		WebElement elem = getWebElement(MaxCarryOveCompany);

	    		if (elem == null) {
	        		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterMaxCarryOveCompany", "enterMaxCarryOveCompany failed. Unable to locate object: " + MaxCarryOveCompany.toString());

	    			Assert.fail("Unable to locate object: " + MaxCarryOveCompany.toString());
	            }
	    		
	    		elem.sendKeys(value);
	    	
	    		Thread.sleep(2000);

	    		TakeScreenshot.takeScreenshot(m_Driver, "enterMaxCarryOveCompany");

	    		ExtentReportManager.passStep(m_Driver, "enterMaxCarryOveCompany");

	    		Reporter.log("enterMaxCarryOveCompany");
	    	}
	    	
	    	
	    	public void enterWeeklyWorkingHrsCompany(String value) throws Exception
	    	{
	    		
	    		WebElement elem = getWebElement(WeeklyWorkingHrsCompany);

	    		if (elem == null) {
	        		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterWeeklyWorkingHrsCompany", "enterWeeklyWorkingHrsCompany failed. Unable to locate object: " + WeeklyWorkingHrsCompany.toString());

	    			Assert.fail("Unable to locate object: " + WeeklyWorkingHrsCompany.toString());
	            }
	    		
	    		elem.sendKeys(value);
	    	
	    		Thread.sleep(2000);

	    		TakeScreenshot.takeScreenshot(m_Driver, "enterWeeklyWorkingHrsCompany");

	    		ExtentReportManager.passStep(m_Driver, "enterWeeklyWorkingHrsCompany");

	    		Reporter.log("enterWeeklyWorkingHrsCompany");
	    	}
	    	
	    	
	    	  public void selectPeriodEnd(String data) throws InterruptedException
	   	   {
	   	     
	   	   		WebElement elem = getWebElement(periodElem);

	   	   		if (elem == null) {
	   	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPeriodEnd", "selectPeriodEnd failed. Unable to locate object: " + periodElem.toString());

	   	
	   	   			Assert.fail("Unable to locate object: " + periodElem.toString());
	   	        }

	   	   		Select payrate =  new Select(elem);
	   	   	    payrate.selectByVisibleText(data);
//	   	   	    Thread.sleep(3000);
//	   	   	     Alert act = m_Driver.switchTo().alert();
//	   	   
//	   	       	act.accept();
	   	   	    
	   	   	   
	             Reporter.log("Select PayworkOut");
	   	   }
	    	  
	    	  
	    	  public void verfyAvailablePeriodInDropdown(String data) throws InterruptedException
	    	  	{
	    		  String Option = "";
	   	   		WebElement elem = getWebElement(periodElem);

	   	   		if (elem == null) {
	   	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPeriodEnd", "selectPeriodEnd failed. Unable to locate object: " + periodElem.toString());

	   	   			Assert.fail("Unable to locate object: " + periodElem.toString());
	   	        }

	   	   		Select payrate =  new Select(elem);
	   	   	    List<WebElement> list = payrate.getOptions();
	   	   	    for(int i=0;i<=list.size()-1;i++)
	   	   	    {
	   	   	    	String Option1=list.get(i).getText().trim();
	   	   	    	Option=Option1+" & "+Option;
	   	   	    }
	   	   	    
	   	   	    soft.assertEquals(data, Option);
	   	   	    System.out.println("verify leave date in Period dropdown : "+Option+" = "+data);
	   	   	    Thread.sleep(3000);

	             Reporter.log("Select PayworkOut");
	   	   }
	    	  
	    	  public void clickAddLeaves() throws Exception
	    		{
	    			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_herfAddleave']"));

	    			boolean con=elem.isDisplayed();
	    			
	    			if (con == false) 
	    			{
	    				clickLeaveManagement();
	    	        }

	    			WebElement elem2 = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_herfAddleave']"));
	    			
	    			jsExec.executeScript("arguments[0].click();", elem2);
	    			Thread.sleep(2000);

	    			TakeScreenshot.takeScreenshot(m_Driver, "clickApplyLeaves");

	    			ExtentReportManager.passStep(m_Driver, "clickApplyLeaves");

	    			
	    			Reporter.log("clickApplyLeaves");
	    		}
	    	  
	    	  
	    		public void selectEmployeeNameInApprovedLeavesPage(String value) throws Exception
	    		{
	    	       getWebElement(By.xpath("(//*[@class='multiselect dropdown-toggle btn btn-default'])[1]")).click();
	    	       Thread.sleep(2000);
	    	       getWebElement(By.xpath("//div[@class='btn-group open']//input[@value='multiselect-all']")).click();
	    	        
	    			WebElement elem = getWebElement(By.xpath("//label[contains(text(),'"+value+"')]"));

	    			if (elem == null) {
	    	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectEmployeeName", "selectEmployeeName failed. Unable to locate object: " + employeeNameElem.toString());


	    				Assert.fail("Unable to locate object: " + employeeNameElem.toString());
	    	        }
	    			
	    			elem.click();
	    		
	    			Thread.sleep(2000);

	    			getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")).click();
	    			
	    			TakeScreenshot.takeScreenshot(m_Driver, "selectEmployeeName");

	    			ExtentReportManager.passStep(m_Driver, "selectEmployeeName");

	    			Reporter.log("selectEmployeeName");
	    		}
	    		
	    		public void verifyLeaveApprovedData(String Header,String Value,int Tr,int Td)
	    		{
	    			List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr["+Tr+"]/td"));
	    			String Data = list.get(Td).getText().trim();
	    			soft.assertEquals(Data, Value,Header+" data is not matched In Leave Approved Page");
	    			
	    			Reporter.log("verifyLeaveApprovedData"+ Header +" : "+Value);
	    			System.out.println("verify Leave Approved Data "+Header+" expected : "+Value+" : actual : "+Data);
	    			
	    		}
	    		
	    		
	    		public void verifyAttechmentLeaveApprovedData(String Header,String Value,int Tr,int Td)
	    		{
	    			List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td/a[@target='_blank']"));
	    			String Data = list.get(0).getAttribute("data-original-title").trim();
	    			
	    			soft.assertEquals(Data.contentEquals(Value),"data is not matched In Leave Approved Page");
	    			
	    			Reporter.log("verifyLeaveApprovedData"+ Header +" : "+Value);
	    			System.out.println("verify Leave Approved Data "+Header+" expected : "+Value+" : actual : "+Data);
	    			
	    			
	    		}
	    		
	    		public void verifyLeaveDataInEmployeeLeaveDetailsPage(String Header,String Value,int Td)
	    		{
	    			List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td"));
	    			String Data = list.get(Td).getText().trim();
	    			soft.assertEquals(Data, Value,Header+" Data is not matched In Employee Leave Details Page");
	    			Reporter.log("verifyLeaveDataInEmployeeLeaveDetailsPag"+ Header +" : "+Value);
	    			System.out.println("verify Leave Details "+Header+" expected : "+Value+" : actual : "+Data);
	    			
	    			
	    		}
	    		
	    		public void verifyLeaveDataInEmployeePage(String Header,String Value,int Tr,int Td)
	    		{
	    			List<WebElement> list = getWebElements(By.xpath("//div[@class='col-md-12 col-sm-12']//table[@class='table table-head-bg']/tbody/tr["+Tr+"]/td"));
	    			String Data = list.get(Td).getText().trim();
	    			soft.assertEquals(Data, Value, Header+" Data is not matched In Employee Page");
	    			
	    			Reporter.log("verifyLeaveApprovedData"+ Header +" : "+Value);
	    			System.out.println("verify Leave Approved Data "+Header+" expected : "+Value+" : actual : "+Data);
	    			
	    			
	    		}
	    		
	    		public void clickDeletAllInLeaveApprovedPage(String value) throws Exception
	    		{
	    	        
	    			List<WebElement> list = getWebElements(By.xpath("//*[@data-original-title='Delete']/i"));

	    		 for(int i=0;i<=list.size()-1;i++)
	    		 {
	    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@data-original-title='Delete']/i")); 
	    			 list2.get(0).click();
	    			 Thread.sleep(2000);
		    		getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']")).click();
		    		 Thread.sleep(2000);
		    		getWebElement(By.xpath("(//*[@class='multiselect dropdown-toggle btn btn-default'])[1]")).click();
		    	       Thread.sleep(2000);
		    	       getWebElement(By.xpath("//div[@class='btn-group open']//input[@value='multiselect-all']")).click();
		    			WebElement elem = getWebElement(By.xpath("//label[contains(text(),'"+value+"')]"));
		    			elem.click();
		    			Thread.sleep(2000);
		    			getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")).click();
	    		 }
	    			
	    			Reporter.log("DeletedAllLeaves");
	    			System.out.println("DeletedAllLeaves");
	    		}
	    		
	    		
	    		public void clickDeletBtnInLeaveApprovedPage() throws Exception
	    		{
	    	        
	    			List<WebElement> list2 = getWebElements(By.xpath("//*[@data-original-title='Delete']/i"));
	    			boolean con=list2.isEmpty();
	    			
	    			if(con==true)
	    			{
	    				System.out.println("No Leaves to Delete");
	    				Reporter.log("No Leaves to Delete");
	    			}
	    			else
	    			{
	    				List<WebElement> list3 = getWebElements(By.xpath("//*[@data-original-title='Delete']/i"));
	    				 list3.get(0).click();
	    				 Thread.sleep(2000);
		    		getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']")).click();
	    			
	    			Reporter.log("DeletedAllLeaves");
	    			System.out.println("DeletedAllLeaves");
	    		}
	    		
	    		
	    			soft.assertAll();
	    			
	    		}
	    		
	    		
	    		public String ChangeDateFormat(String Date)
	    		{
	    			String date2 = null;
	    			try {
	    				System.out.println("aa");
	    				String date=Date.replaceAll("/", "-");
	    				//String oldstring = "2011-01-18 00:00:00.0";
	    				Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
	    				
		    			String newstring = new SimpleDateFormat("dd-MMM-yyyy").format(date1);
		    			
		    			 date2=newstring.replaceAll("-", " ");
						
						
					} catch (Exception e) {
						System.out.println(e);
					}
					
					return date2;
	    		}
	    		
	    		
	    		public void enterTotalWeeks(String weeks) throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtNoOfWeekPaternity']"));
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	 		elem.sendKeys(weeks);
	    	 		elem.sendKeys(Keys.TAB);
	    			System.out.println("enterTotalWeeks : "+weeks);
	    			Reporter.log("enterTotalWeeks : "+weeks);
	    			
	    		}
	    		
	    		public void enterTotalWeeksSick(String weeks) throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtNoOfWeeksSick']"));
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	 		elem.sendKeys(weeks);
	    	 		elem.sendKeys(Keys.TAB);
	    			System.out.println("enterTotalWeeks : "+weeks);
	    			Reporter.log("enterTotalWeeks : "+weeks);
	    			
	    		}
	    		
	    		public void enterMaternityTotalWeeks(String weeks) throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtNoOfWeek']"));
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	 		elem.sendKeys(weeks);
	    	 		elem.sendKeys(Keys.TAB);
	    			System.out.println("enterTotalWeeks : "+weeks);
	    			Reporter.log("enterTotalWeeks : "+weeks);
	    			
	    		}
	    		
	    		
	    		public void enterMaternityTotalWeeksAdoption(String weeks) throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNoOfWeekSAP']"));
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	 		elem.sendKeys(weeks);
	    	 		elem.sendKeys(Keys.TAB);
	    			System.out.println("enterTotalWeeks : "+weeks);
	    			Reporter.log("enterTotalWeeks : "+weeks);
	    			
	    		}
	    		
	    		public String GetLastDate() throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			String date = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtEndDatePaternity']")).getAttribute("value");
	    			String date2 = date.trim();
	    			System.out.println("GetLastDate : "+date2);
	    			Reporter.log("GetLastDate : "+date2);
					return date2;
					
	    			
	    		}
	    		
	    		public String GetMaternityLastDate() throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			String date = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtEndDate']")).getAttribute("value");
	    			String date2 = date.trim();
	    			System.out.println("GetLastDate : "+date2);
	    			Reporter.log("GetLastDate : "+date2);
					return date2;
					
	    			
	    		}
	    		
	    		
	    		public String GetNeonatalLastDate() throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			String date = getWebElement(By.xpath("//*[@id='tblNCPBOLBody']/tr/td[4]")).getText();
	    			String date2 = date.trim();
	    			System.out.println("GetLastDate : "+date2);
	    			Reporter.log("GetLastDate : "+date2);
					return date2;
					
	    			
	    		}
	    		
	    		
	    		public String GetAdoptionLastDate() throws InterruptedException
	    		{
	    			Thread.sleep(2000);
	    			String date = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtSAPEndDate']")).getAttribute("value");
	    			String date2 = date.trim();
	    			System.out.println("GetLastDate : "+date2);
	    			Reporter.log("GetLastDate : "+date2);
					return date2;
					
	    			
	    		}
	    		public void verifyValidationMsg(String Msg,String Value)
	    		{
	    			String Vali = null;
	    			try {
	    				WebElement elem = getWebElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	    				
	    			     String Act = elem.getText();
	    			     String Valid2=Act.replaceAll("\n", "");
	    				 String Valid3 = Valid2
	    			               .replaceAll("\\u00D7", "")        // remove ×
	    			               .replaceAll("[^\\p{Print}]", "")  // remove hidden chars
	    			               .trim();
	    				     Act=Valid3;
	    				     
	    				     
		    			soft.assertEquals(Act.trim(), Msg.trim(),"Enter Value : "+Value);
		    			System.out.println("verifyValidationMsg : "+Act);
		    			Reporter.log("verifyValidationMsg : "+Act);
		    			
		    		//	m_Driver.navigate().refresh();
						
					} catch (Exception e) {
						soft.assertEquals(Vali, Msg,"Enter Value : "+Value);
						e.getStackTrace();
					}
	    			
	    		}
	    		
	    		public void verifyWarningValidationMsg(String Msg,String value)
	    		{
	    			String Vali=null;
	    			try {
	    				
	    				WebElement elem = getWebElement(By.xpath("//div[@class='alert alert-warning']"));
		    			Vali = elem.getText().replaceAll("\\n", "");
		    			soft.assertEquals(Vali.trim(), Msg.trim(),"Enter Value : "+value);
		    			System.out.println("verifyValidationMsg : "+Vali);
		    			Reporter.log("verifyValidationMsg : "+Vali);
						
					} catch (Exception e) {
						soft.assertEquals(Vali, Msg,"Enter Value : "+value);
						e.getStackTrace();
					}
	    		
	    		}
	    		 public String VerifyDateAccrodingToWeeks(String EnterDate,int Weeks) 
	    		    { 
	    			 String newstring=null;
	    		  try {
	    			  
	    			  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					    String dt = EnterDate;
					//	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						 Calendar c = Calendar.getInstance();
						 c.setTime(sdf.parse(dt));
						 c.add(Calendar.WEEK_OF_YEAR, Weeks);  // number of days to add
						 c.add(Calendar.DAY_OF_YEAR, -1);
						 newstring = sdf.format(c.getTime());
						System.out.println(newstring);
					
				} catch (Exception e) {
					System.out.println(e);
				}
						return newstring; 
	    		    } 
	    		 
	    		
	    		 public void chk_EligiblForSSPInSick() throws Exception
	    			     {
	    				WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_chkEligibleForSSP']"));
	    				elem.click();
	    				Thread.sleep(2000);
	    				Reporter.log("chk_EligiblForSSPInSick");
	    				ExtentReportManager.passStep(m_Driver, "chk_EligiblForSSPInSick ");
	    				
	    			    }		 
	    		 
	    		 
	    		 
	    		 public void enter_NoticePeriodDayesInSick(String LeaverEndDate) throws Exception
			     {
				WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtNoticePeriod']"));
				String selectAll = Keys.chord(Keys.CONTROL, "a");
		 		elem.sendKeys(selectAll);
				elem.sendKeys(LeaverEndDate);
				elem.sendKeys(Keys.TAB);
				Thread.sleep(2000);
				System.out.println("enter_NoticePeriodDayesInSick : "+LeaverEndDate);
				Reporter.log("enter_NoticePeriodDayesInSick : "+LeaverEndDate);
				ExtentReportManager.passStep(m_Driver, "enter_NoticePeriodDayesInSick " + LeaverEndDate);
				
			    }	
	    		 
	    		 
	    		 
	    		 public void enter_Discription(String Dis)
	    		 {
	    			 WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtOtherLeaveDesc']"));
	    			 elem.sendKeys(Dis);
	    			 Reporter.log("enter_Discription : "+Dis);
	    			 System.out.println("enter_Discription : "+Dis);
	    		 }
	    		 
	    		 
	    		 
	    		 public String rendomCustomerName()
	    		 {
	    			 
	    			 String  CusName = RandomStringUtils.randomAlphabetic(10);
	    			 return CusName;
	    			 
	    			 
	    		 }
	    		 
	    		 public void verifyNewOtherOptionInLeaveType(String value) throws Exception
	    			{
	    			 boolean con=false;
	    				Thread.sleep(2000);
	    				 List<WebElement> list = getWebElements(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_ddlLeaveType']/option"));

	    				for(int i=0;i<=list.size()-1;i++)
	    				{
	    					
	    					 List<WebElement> list2 = getWebElements(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_ddlLeaveType']/option"));	
	    					 String optionName = list2.get(i).getText().trim();
	    					 if(optionName.equals(value))
	    					 {
	    						con=true; 
	    						Reporter.log("verifyselectedLeaveType : "+optionName);
	    		    			 System.out.println("verifyselectedLeaveType : "+optionName);
	    					 }
	    					
	    				}
	    				soft.assertTrue(con, "New Other Option is not getting visible in leave type dropdown");
	    			}
	    		 
	    		 public void VerifyAllLeaveType(String LeaveType)
	    		 {
	    			 try {
						
	    				 String[] expected = LeaveType.split("-");
	    				 List<WebElement> allOptions = m_Driver.findElements(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_ddlLeaveType']/option"));

		    			 // make sure you found the right number of elements
		    			 if (expected.length != allOptions.size()) {
		    			     System.out.println("fail, wrong number of elements found");
		    			 }
		    			 // make sure that the value of every <option> element equals the expected value
		    			 for (int i = 0; i < expected.length; i++) {
		    			     String optionValue = allOptions.get(i).getText();
		    			     if (optionValue.equals(expected[i])) {
		    			         System.out.println("Verify leave type option - passed on: " + optionValue);
		    			        
		    			     } else {
		    			         System.out.println("Verify leave type option - failed on: " + optionValue);
		    			     }
		    			     soft.assertEquals(expected[i], optionValue,"Leave type option is matched");
		    			 }
	    				 
					} catch (Exception e) {
						System.out.println(e);
					}
	    			
	    		 }
	    		 
	    		 
	    		 public void verifyChkAndUnChkedNormalWorkingDays(String dayName,String option)
	    		 {
	    			// WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"']"));
	    			 if("checked".equals(option))
	    			 {
	    				 if ( m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_cb"+dayName+"")).isSelected() )
		    			 {
		    				 System.out.println("alreday Chked Option of the "+dayName);
		    				 Reporter.log("alreday Chked Option of the "+dayName);
		    			 }
		    			 else
		    			 {
		    				 soft.assertFalse(true, "NormalWorkingDays is not working as expected :"+dayName);
		    				
		    			 } 
	    			 }
	    			 if("Unchecked".equals(option))
	    			 {
	    				 if ( !m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_cb"+dayName+"")).isSelected() )
		    			 {
		    				 System.out.println("alreday UnChked Option of the "+dayName);
		    				 Reporter.log("alreday UnChked Option of the "+dayName);
		    			 }
		    			 else
		    			 {
		    				 soft.assertFalse(true, "NormalWorkingDays is not working as expected :"+dayName);
		    				
		    			 } 
	    			 }
	    			
	    		 }
	    		 
	    		 
	    			public void verifyLeaveDataInPendingForApprovalPage(String Header,String Value,int Tr,int Td)
		    		{
		    			List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr["+Tr+"]/td"));
		    			String Data = list.get(Td).getText().trim();
		    			soft.assertEquals(Data, Value,Header+" data is not matched In Pending For Approval Page");
		    			
		    			Reporter.log("verify Leave Data In Pending For Approval Page "+ Header +" : "+Value);
		    			System.out.println("verify Leave Data In Pending For Approval Page "+Header+" expected : "+Value+" : actual : "+Data);
		    			
		    			
		    		}
	    			
	    			public void verifyLeaveAttachmentInPendingForApprovalPage(String Header,String Value,int Tr,int Td)
		    		{
	    			
	    					List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr["+Tr+"]/td/a[@target='_blank']"));
			    			String Data = list.get(Td).getAttribute("data-original-title").trim();
			    			
			    			boolean con=Data.contains(Value);
			    			soft.assertTrue(Data.contains(Value),Header+" data is not matched In Pending For Approval Page");
			    			
			    			Reporter.log("verify Leave Data In Pending For Approval Page "+ Header +" : "+Value);
			    			System.out.println("verify Leave Data In Pending For Approval Page "+Header+" expected : "+Value+" : actual : "+Data);
						
		    		}
	    		
	    		 
	    			public void VerifyUserPersonalAndEmploymentDetailsInDashboard(String CName,String Data)
	    			{
	    				WebElement elem = getWebElement(By.xpath("//label[normalize-space()='"+CName+":']/parent::div/div"));
	    				String ColumnData = elem.getText().trim();
	    				soft.assertEquals(Data, ColumnData, CName+" is not match in User Dashboard");
	    				Reporter.log("Verify User Personal & Employment Details of "+CName+" expected : "+Data+" : actual : "+ColumnData);
		    			System.out.println("Verify User Personal & Employment Details "+CName+" expected : "+Data+" : actual : "+ColumnData);
	    			}
	    			
	    			public void VerifyPayrollDataInDashboard(String CName,String Data)
	    			{
	    				WebElement elem = getWebElement(By.xpath("//label[normalize-space()='"+CName+":']/parent::div/div/span"));
	    				String ColumnData = elem.getText().trim();
	    				soft.assertEquals(Data, ColumnData, CName+" is not match in User Dashboard");
	    				Reporter.log("Verify User Personal & Employment Details of "+CName+" expected : "+Data+" : actual : "+ColumnData);
		    			System.out.println("Verify User Personal & Employment Details "+CName+" expected : "+Data+" : actual : "+ColumnData);
	    			}
	    			
	    			
	    			public void verifyLeaveBalance(String Balance)
	    			{
	    				String UiBalance = getWebElement(By.xpath("//*[@class='col-md-4 no-padding']/div/div/h3")).getText().trim();
	    				soft.assertEquals(Balance, UiBalance);
	    				Reporter.log("verify Leave Balance : expexted = "+Balance+" : actual = "+UiBalance);
		    			System.out.println("verify Leave Balance : expexted = "+Balance+" : actual = "+UiBalance);
	    			}
	    			
	    			public void verify_0ApplyLeaves_1PendingLeaves_2TotalLeavesTaken(String Balance,int Index)
	    			{
	    				 List<WebElement> UiBalance = getWebElements(By.xpath("//*[@class='col-md-4 no-padding']/a/div/div[@class='box_inner1']"));
	    				 String UiBalance2 = UiBalance.get(Index).getText().trim();	    				 
	    				 soft.assertEquals(Balance, UiBalance2);
	    				Reporter.log("verify Leave Balance : expexted = "+Balance+" : actual = "+UiBalance2);
		    			System.out.println("verify Leave Balance : expexted = "+Balance+" : actual = "+UiBalance2);
	    			}
	    			
	    			
	    			public void verifyLeaveDataInCancelLeavePage(String Header,String Value,int Tr,int Td)
		    		{
		    			List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr["+Tr+"]/td"));
		    			String Data = list.get(Td).getText().trim();
		    			soft.assertEquals(Data, Value,Header+" data is not matched In Leave Approved Page");
		    			
		    			Reporter.log("verify Leave Data In Cancel Leave Page "+ Header +" : "+Value);
		    			System.out.println("verify Leave Data In Cancel Leave Page "+Header+" expected : "+Value+" : actual : "+Data);
		    			
		    			
		    		}
	    			
	    			
	    			public void verifyLeaveHistoryUserEnd(String Note,String Header,String Value,int Td)
		    		{
		    			WebElement list = getWebElement(By.xpath("//td[normalize-space()='"+Note+"']/preceding::td["+Td+"]"));
		    			String Data = list.getText().trim();
		    			soft.assertEquals(Data, Value,Header+"  In Leave History User End");
		    			
		    			Reporter.log("verify Leave History User End "+ Header +" : "+Value);
		    			System.out.println("verify Leave History User End "+Header+" expected : "+Value+" : actual : "+Data);
		    			
		    			
		    		}
	    			
	    			public void DeleteCSv_PDF()
	    			{
	    				try
	    				{

	    					File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
	    					//List the files on that folder
	    					File[] listOfFiles = folder.listFiles();
	    					boolean found = false;
	    					File f = null;
	    					     //Look for the file in the files
	    					     // You should write smart REGEX according to the filename
	    					     for (File listOfFile : listOfFiles) {
	    					         if (listOfFile.isFile()) {
	    					              String fileName = listOfFile.getName();
	    					               System.out.println("File " + listOfFile.getName());
	    					               Thread.sleep(2000);
	    					               if ((new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+ listOfFile.getName())).delete()) {
	    					                   System.out.println("Delete");     
	    					               } 
	    					            }
	    					        }
	    				Assert.assertFalse(found, "Delete document is not found");
	    				}
	    				catch (Exception e)
	    				{
	    				System.out.println("Issue in Delete CSV = "+e);
	    				}
	    			}
	    			
	    			public String downloadPayShipByIndexPDF(String Index)
	    			{
	    			
	    				try
	    				{
	    					
//	    						WebElement iFrame = getWebElement(By.xpath("//iframe[@id='EditModalFrame1']"));
//	    						sl.switchFrameNew(m_Driver, iFrame);			
	    						WebElement DownButton = getWebElement(By.xpath("(//i[@class='fa fa-file-pdf-o'])["+Index+"]"));
	    						DownButton.click();
	    						System.out.println("Click On Payslip Download Button");
	    						Reporter.log("Click On Payslip Download Button");
	    						Thread.sleep(20000);
	    					System.out.println("Download PDF File");
	    					Reporter.log("Download PDF File");
	    					File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
	    					//List the files on that folder
	    					//Thread.sleep(5000);
	    					File[] listOfFiles = folder.listFiles();
	    					boolean found = false;
	    					File f = null;
	    					     //Look for the file in the files
	    					     // You should write smart REGEX according to the filename
	    					     for (File listOfFile : listOfFiles) {
	    					         if (listOfFile.isFile()) {
	    					              String fileName = listOfFile.getName();
	    					               System.out.println("File " + listOfFile.getName());
	    					               if (fileName.equals(fileName)) {
	    					                   f = new File(fileName);
	    					                   found = true;
	    					                  FileName=fileName;
	    					                }
	    					            }
	    					        }
	    					     Assert.assertTrue(found, "Downloaded document is not found");
	    					f.deleteOnExit();
	    					Thread.sleep(10000);
	    					
	    				}
	    				catch (Exception e)
	    				{
	    					System.out.println("Issue in DwonloadCSv = "+e);
	    				}
	    				return FileName;
	    				
	    				}
	    			
	    			public void ReadFull_FilletedPDFReportofDividentVoucher(int StartPg,int EndPg, int LineNo, String Amount,int Array) throws Exception
	    			{
	    				Thread.sleep(4000);
	    			    File file = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+FileName);
	    			 //   File file = new File("C:\\Jmeter\\down\\Ashish-INVOICE#INV-10253_3.pdf");
	    			  
	    			    PDDocument document = PDDocument.load(file);
	    			    PDFTextStripper pdfStripper = new PDFTextStripper();
	    			    pdfStripper.setStartPage(StartPg);
	    			    pdfStripper.setEndPage(EndPg);

	    			   //load all lines into a string
	    			    String pages = pdfStripper.getText(document);

	    				
	    				System.out.println(pages);
	    			   ///split by detecting newline
	    			    String[] lines = pages.split("\r\n|\r|\n");

	    			   int count=0;   //Just to indicate line number
	    			    for(String temp:lines)
	    			    {
	    			        System.out.println(count+" "+temp);
	    			        count++;
	    			    }    
	    			    String Actvalue[] = lines[LineNo].split(" ");
	    			    String Act1=Actvalue[Array].replaceAll(" ", "");
	    			    String aa1=Act1.trim();
	    			  //  String aa2=Act1[3].trim();
	    			    System.out.println(aa1);
	    			    String InPDFAmount = aa1;
	    			    //System.out.println(ActDividentamt);
//	    			    double EnterAmount = Double.parseDouble(Amount);
//	    				DecimalFormat df = new DecimalFormat("0.00");
//	    				String AcualAmount = df.format(EnterAmount);
	    			   Assert.assertEquals(InPDFAmount, Amount, "Data is not matched in PDF");
	    			    document.close();
	    			    Thread.sleep(5000);
//	    			    if(file.delete()==true);
//	    			    {    
//	    			     System.out.println("Test PDF File is deleted");
//	    			    }
	    			}
	    			
	    			public void ReadFullHours_FilletedPDFReportofDividentVoucher(int StartPg,int EndPg, int LineNo, String Amount) throws Exception
	    			{
	    				Thread.sleep(5000);
	    			    File file = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+FileName);
	    			 //   File file = new File("C:\\Jmeter\\down\\Ashish-INVOICE#INV-10253_3.pdf");
	    			  
	    			    PDDocument document = PDDocument.load(file);
	    			    PDFTextStripper pdfStripper = new PDFTextStripper();
	    			    pdfStripper.setStartPage(StartPg);
	    			    pdfStripper.setEndPage(EndPg);

	    			   //load all lines into a string
	    			    String pages = pdfStripper.getText(document);

	    				
	    				System.out.println(pages);
	    			   //split by detecting newline
	    			    String[] lines = pages.split("\r\n|\r|\n");

	    			   int count=0;   //Just to indicate line number
	    			    for(String temp:lines)
	    			    {
	    			        System.out.println(count+" "+temp);
	    			        count++;
	    			    }    
	    			    String Actvalue3[] = lines[LineNo].split(" : ");
	    			   String Actvalue2 = Actvalue3[1].trim();
	    			  String Actvalue[] = Actvalue2.split(" ");
	    			    String Act1=Actvalue[0]+":"+Actvalue[2].replaceAll(" ", "");
	    			    String aa1=Act1.trim();
	    			  //  String aa2=Act1[3].trim();
	    			    System.out.println(aa1);
	    			    String InPDFAmount = aa1;
	    			    //System.out.println(ActDividentamt);
//	    			    double EnterAmount = Double.parseDouble(Amount);
//	    				DecimalFormat df = new DecimalFormat("0.00");
//	    				String AcualAmount = df.format(EnterAmount);
	    			   Assert.assertEquals(InPDFAmount, Amount, "Data is not matched in PDF");
	    			    document.close();
	    			    Thread.sleep(2000);
//	    			    if(file.delete()==true);
//	    			    {    
//	    			     System.out.println("Test PDF File is deleted");
//	    			    }
	    			}
	    			
	    			public void clickOnReportSectionInUserEnd()
	    			{
	    				WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployeeDashboardReports']/span"));
	    				elem.click();
	    				System.out.println("click On Report Section In User End");
	    				Reporter.log("click On Report Section In User End");
	    				
	    			}
	    			
	    			public void clickOnReportSection()
	    			{
	    				WebElement elem = getWebElement(By.xpath("//span[normalize-space()='Reports']"));
	    				elem.click();
	    				System.out.println("click On Report Section");
	    				Reporter.log("click On Report Section");
	    				
	    			}
	    			
	    			
	    			public void clickOnAnyEmployeeReportByName(String rName)
	    			{
	    				
	    				WebElement elem = getWebElement(By.xpath("//span[@class='rc-title' and contains(normalize-space(.),'" + rName + "')]"));
	    				elem.click();
	    				System.out.println("click On Any Employee Report By Name : "+rName);
	    				Reporter.log("click On Any Employee Report By Name : "+rName);
	    			}
	    			
	    			
	    			public void selectAnyOptionInTypeDropdownUnderTheStatutoryMaternityPaternity(String option,String OptionEmp)
	    			{
	    				WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatutorypaytype']"));
	    				Select sel= new Select(elem);
	    				sel.selectByVisibleText(option);
	    				System.out.println("selected Option In Type Dropdown Under The Statutory Maternity Paternity : "+option);
	    				Reporter.log("selected Option In Type Dropdown Under The Statutory Maternity Paternity : "+option);
	    				
	    				WebElement elem2 = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']"));
	    				Select sel2= new Select(elem2);
	    				sel2.selectByVisibleText(OptionEmp);
	    				System.out.println("selected Option In Employee Dropdown Under The Statutory Maternity Paternity : "+OptionEmp);
	    				Reporter.log("selected Option In Employee Dropdown Under The Statutory Maternity Paternity : "+OptionEmp);
	    				
	    			}
	    			
	    			
	    			public String GetStatutoryThresholdAmount(String SelectYear)
	    			{
	    				getWebElement(By.xpath("//span[normalize-space()='Reports']")).click();
	    				System.out.println("click Agent Report");
	    				Reporter.log("click Agent Report");
	    				WebElement TaxReport = getWebElement(By.xpath("//td[@class='text-left pb-0 lineheight']//a[@href='TaxYearConfiguration.aspx'][normalize-space()='Tax Rate Tables']"));
	    				jsExec.executeScript("arguments[0].scrollIntoView();", TaxReport);
	    				jsExec.executeScript("arguments[0].click();", TaxReport);
	    				System.out.println("click Tax Rate Tables");
	    				Reporter.log("click Tax Rate Tables");
	    				getWebElement(By.xpath("//span[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpStatutoryThreshold']")).click();
	    				System.out.println("click Statutory Threshold Report");
	    				Reporter.log("click Statutory Threshold Report");
	    				WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']"));
	    				Select sel= new Select(elem);
	    				sel.selectByVisibleText(SelectYear);
	    				String WeeklySMP_SPPRate=getWebElement(By.xpath("//td[normalize-space()='Weekly SMP/SPP Rate']//following-sibling::td[1]")).getText().trim();
	    				String WeeklySMP_SPPRateWithoutsymbol = WeeklySMP_SPPRate.substring(1);
						return WeeklySMP_SPPRateWithoutsymbol;
	    			}
	    			
	    			public String GetSSPAmount(String SelectYear)
	    			{
	    				getWebElement(By.xpath("//span[normalize-space()='Reports']")).click();
	    				System.out.println("click Agent Report");
	    				Reporter.log("click Agent Report");
	    				WebElement TaxReport = getWebElement(By.xpath("//td[@class='text-left pb-0 lineheight']//a[@href='TaxYearConfiguration.aspx'][normalize-space()='Tax Rate Tables']"));
	    				jsExec.executeScript("arguments[0].scrollIntoView();", TaxReport);
	    				jsExec.executeScript("arguments[0].click();", TaxReport);
	    				System.out.println("click Tax Rate Tables");
	    				Reporter.log("click Tax Rate Tables");
	    				getWebElement(By.xpath("//span[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpStatutoryThreshold']")).click();
	    				System.out.println("click Statutory Threshold Report");
	    				Reporter.log("click Statutory Threshold Report");
	    				WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']"));
	    				Select sel= new Select(elem);
	    				sel.selectByVisibleText(SelectYear);
	    				String WeeklySMP_SPPRate=getWebElement(By.xpath("//td[normalize-space()='Weekly SSP Rate']//following-sibling::td[1]")).getText().trim();
	    				String WeeklySMP_SPPRateWithoutsymbol = WeeklySMP_SPPRate.substring(1);
						return WeeklySMP_SPPRateWithoutsymbol;
	    			}
	    			
	    			public void verifyPaternityLeaveCalucationInReport(String TotalWeeklyAmount,String EnterAmount,double days)
	    			{
	    				
	    					
	    					double EnterAmount1=Double.parseDouble(EnterAmount);
	    					double EnterAmount2=EnterAmount1*90/100;
	    					
	    					
	    					String Total = getWebElement(By.xpath("//td[normalize-space()='Total SPP']//following-sibling::td[1]")).getText().trim();
		    				String TotalWithoutsymbol = Total.substring(1).replaceAll(",", "");
		    				double TotalAmount=Double.parseDouble(TotalWithoutsymbol);
		    				
		    			//	String TotalAmountInAgentLevel = TotalWeeklyAmount.substring(1);
		    				
		    					String AM=TotalWeeklyAmount;
		    				double TotalA=Double.parseDouble(AM);
		    				
		    				if(EnterAmount2>=TotalA)
		    				{
		    					double onedaypay=TotalA/7;
		    					double TotalAMountCal=onedaypay*days;
		    					 BigDecimal salary3 = new BigDecimal(TotalAMountCal).setScale(2, RoundingMode.HALF_UP);
		    				      double salary4 = salary3.doubleValue();
		    					DecimalFormat dfSharp = new DecimalFormat("#.##");
		    					String VTotal = dfSharp.format(salary4);
		    					String UITotal = dfSharp.format(TotalAmount);
		    					
		    					soft.assertEquals(UITotal, VTotal,"Paternity Leave Amount is not getting mateched");
		    					
		    				}
		    				
		    				else
		    				{
		    					
		    					double onedaypay=EnterAmount2/7;
		    					double TotalAMountCal=onedaypay*days;
		    					 BigDecimal salary3 = new BigDecimal(TotalAMountCal).setScale(2, RoundingMode.HALF_UP);
		    				      double salary4 = salary3.doubleValue();
		    					DecimalFormat dfSharp = new DecimalFormat("0.00");
		    					String VTotal = dfSharp.format(salary4);
		    					String UITotal = dfSharp.format(TotalAmount);
		    					
		    					soft.assertEquals(UITotal, VTotal,"Paternity Leave Amount is not getting mateched");
		    					
		    				}
	    			}
	    			
	    			public void verifyMaternityLeaveCalucationInReport(String TotalWeeklyAmount,String EnterAmount,double week)
	    			{
	    				
	    					
	    					double EnterAmount1=Double.parseDouble(EnterAmount);
	    					double EnterAmount2=EnterAmount1*90/100;
	    					
	    					
	    					String Total = getWebElement(By.xpath("//td[normalize-space()='Total SMP']//following-sibling::td[1]")).getText().trim();
		    				String TotalWithoutsymbol = Total.substring(1).replaceAll(",", "");
		    				double TotalAmount=Double.parseDouble(TotalWithoutsymbol);
		    				
		    			//	String TotalAmountInAgentLevel = TotalWeeklyAmount.substring(1);
		    				
		    					String AM=TotalWeeklyAmount;
		    				double TotalA=Double.parseDouble(AM);
		    				double days=week*7;
							if(week>6)
		    				{
								double onedaypay=EnterAmount2/7;
		    					double TotalAMountCal=onedaypay*42;
		    					 BigDecimal salary3 = new BigDecimal(TotalAMountCal).setScale(2, RoundingMode.HALF_UP);
		    				      double salary4 = salary3.doubleValue();
		    				      
		    				      
		    					double onedaypay2=TotalA/7;
		    					double days2=days-42;
		    					double TotalAMountCal2=onedaypay2*days2;
		    					 
		    					 BigDecimal salary4A = new BigDecimal(TotalAMountCal2).setScale(2, RoundingMode.HALF_UP);
		    				      double salary5 = salary4A.doubleValue();
		    				     double totalMaternityAmount = salary5+salary4;
		    				      
		    					DecimalFormat dfSharp = new DecimalFormat("#.##");
		    					String VTotal = dfSharp.format(totalMaternityAmount);
		    					String UITotal = dfSharp.format(TotalAmount);
		    					
		    					soft.assertEquals(UITotal, VTotal,"Paternity Leave Amount is not getting mateched");
		    					
		    				}
		    				
		    				else
		    				{
		    					
		    					double onedaypay=EnterAmount2/7;
		    					double TotalAMountCal=onedaypay*days;
		    					 BigDecimal salary3 = new BigDecimal(TotalAMountCal).setScale(2, RoundingMode.HALF_UP);
		    				      double salary4 = salary3.doubleValue();
		    					DecimalFormat dfSharp = new DecimalFormat("0.00");
		    					String VTotal = dfSharp.format(salary4);
		    					String UITotal = dfSharp.format(TotalAmount);
		    					
		    					soft.assertEquals(UITotal, VTotal,"Paternity Leave Amount is not getting mateched");
		    					
		    				}
	    			}
	    			
	    			public void verifyMaternityLeaveCalucationInReportAdoption(String TotalWeeklyAmount,String EnterAmount,double week)
	    			{
	    				
	    					
	    					double EnterAmount1=Double.parseDouble(EnterAmount);
	    					double EnterAmount2=EnterAmount1*90/100;
	    					
	    					
	    					String Total = getWebElement(By.xpath("//td[normalize-space()='Total SAP']//following-sibling::td[1]")).getText().trim();
		    				String TotalWithoutsymbol = Total.substring(1).replaceAll(",", "");
		    				double TotalAmount=Double.parseDouble(TotalWithoutsymbol);
		    				
		    			//	String TotalAmountInAgentLevel = TotalWeeklyAmount.substring(1);
		    				
		    					String AM=TotalWeeklyAmount;
		    				double TotalA=Double.parseDouble(AM);
		    				double days=week*7;
							if(week>6)
		    				{
								double onedaypay=EnterAmount2/7;
		    					double TotalAMountCal=onedaypay*42;
		    					 BigDecimal salary3 = new BigDecimal(TotalAMountCal).setScale(2, RoundingMode.HALF_UP);
		    				      double salary4 = salary3.doubleValue();
		    				      
		    				      
		    					double onedaypay2=TotalA/7;
		    					double days2=days-42;
		    					double TotalAMountCal2=onedaypay2*days2;
		    					 
		    					 BigDecimal salary4A = new BigDecimal(TotalAMountCal2).setScale(2, RoundingMode.HALF_UP);
		    				      double salary5 = salary4A.doubleValue();
		    				     double totalMaternityAmount = salary5+salary4;
		    				      
		    					DecimalFormat dfSharp = new DecimalFormat("#.##");
		    					String VTotal = dfSharp.format(totalMaternityAmount);
		    					String UITotal = dfSharp.format(TotalAmount);
		    					
		    					soft.assertEquals(UITotal, VTotal,"Paternity Leave Amount is not getting mateched");
		    					
		    				}
		    				
		    				else
		    				{
		    					
		    					double onedaypay=EnterAmount2/7;
		    					double TotalAMountCal=onedaypay*days;
		    					 BigDecimal salary3 = new BigDecimal(TotalAMountCal).setScale(2, RoundingMode.HALF_UP);
		    				      double salary4 = salary3.doubleValue();
		    					DecimalFormat dfSharp = new DecimalFormat("0.00");
		    					String VTotal = dfSharp.format(salary4);
		    					String UITotal = dfSharp.format(TotalAmount);
		    					
		    					soft.assertEquals(UITotal, VTotal,"Paternity Leave Amount is not getting mateched");
		    					
		    				}
	    			}
	    			
	    			public void verifyAmountForMaternityLeaveInReport(String TotalWeeklyAmount)
	    			{
	    					String Total = getWebElement(By.xpath("//td[normalize-space()='Total SMP']//following-sibling::td[1]")).getText().trim();
		    				String TotalWithoutsymbol = Total.substring(1).replaceAll(",", "");
		    						String TotalAmount=TotalWithoutsymbol.substring(0, TotalWithoutsymbol.length()-3);
		    				soft.assertEquals(TotalAmount, TotalAmount,"Paternity Leave Amount is not getting mateched");
		    			
	    			}
	    			
	    			public void verifyAmountForPaternityLeaveInReport(String TotalWeeklyAmount)
	    			{
	    					
	    					String Total = getWebElement(By.xpath("//td[normalize-space()='Total SPP']//following-sibling::td[1]")).getText().trim();
	    					String TotalWithoutsymbol = Total.substring(1).replaceAll(",", "");
  						String TotalAmount=TotalWithoutsymbol.substring(0, TotalWithoutsymbol.length()-3);
		    				soft.assertEquals(TotalWeeklyAmount, TotalAmount,"Paternity Leave Amount is not getting mateched");
		    			
	    			}
	    			

	    			public void verifyAmountForSickLeaveInReport(String TotalWeeklyAmount,String StartDate,String EndDate) throws Exception 
	    			{
	    				
	    			 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
	    			    Date date1 = df.parse(StartDate);
	    			    Date date2 = df.parse(EndDate);
	    			    Calendar cal1 = Calendar.getInstance();
	    			    Calendar cal2 = Calendar.getInstance();
	    			    cal1.setTime(date1);
	    			    cal2.setTime(date2);

	    			    int numberOfDays = 0;
	    			    while (cal1.before(cal2)) {
	    			        if ((Calendar.SATURDAY != cal1.get(Calendar.DAY_OF_WEEK))
	    			           &&(Calendar.SUNDAY != cal1.get(Calendar.DAY_OF_WEEK))) {
	    			            numberOfDays++;
	    			        }
	    			        cal1.add(Calendar.DATE,1);
	    			    }
	    			    System.out.println(numberOfDays);
	    					
	    			    double TotalAmount=0;
	    					List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td[4][contains(text(),'£')]"));
	    					for(int i = 0;i<=list.size()-1;i++)
	    					{
	    						List<WebElement> list2 = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td[4][contains(text(),'£')]"));
	    						String TotalOfSSP=list2.get(i).getText().trim();
			    				String TotalWithoutsymbol = TotalOfSSP.substring(1).replaceAll(",", "");
			    				double TotalAmount2=Double.parseDouble(TotalWithoutsymbol);
			    				TotalAmount=TotalAmount2+TotalAmount;
	    					}
		    					    					
		    					soft.assertEquals(TotalAmount, TotalWeeklyAmount,"Paternity Leave Amount is not getting mateched");
		    					
		    			
		    				
		    				
	    			}
	    			public void SSPSelectTaxYear(String taxYear) throws Exception {

	    			    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(60));

	    			    WebElement taxYearDropdown = wait.until(
	    			            ExpectedConditions.elementToBeClickable(
	    			                    By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	    			            )
	    			    );

	    			    // Select Tax Year
	    			    Select select = new Select(taxYearDropdown);
	    			    select.selectByVisibleText(taxYear);

	    			    // Wait until selected value is updated
	    			    wait.until(driver -> {
	    			        Select updatedSelect = new Select(
	    			                driver.findElement(
	    			                        By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	    			                )
	    			        );
	    			        return updatedSelect.getFirstSelectedOption()
	    			                .getText()
	    			                .trim()
	    			                .equals(taxYear);
	    			    });

	    			    // Wait for page/postback processing to complete
	    			    wait.until(driver ->
	    			            ((JavascriptExecutor) driver)
	    			                    .executeScript("return document.readyState")
	    			                    .equals("complete")
	    			    );
	    			}
	    			
	    			public void verifySSPLeaveCalucationInReport(String TotalWeeklyAmount,String StartDate,String EndDate) throws Exception 
	    			{
	    				
	    				
	    				System.out.println("");
	    			 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
	    			    Date date1 = df.parse(StartDate);
	    			    Date date2 = df.parse(EndDate);
	    			    Calendar cal1 = Calendar.getInstance();
	    			    Calendar cal2 = Calendar.getInstance();
	    			    cal1.setTime(date1);
	    			    cal2.setTime(date2);

	    			    int numberOfDays = 0;
	    			    while (cal1.before(cal2)) {
	    			        if ((Calendar.SATURDAY != cal1.get(Calendar.DAY_OF_WEEK))
	    			           &&(Calendar.SUNDAY != cal1.get(Calendar.DAY_OF_WEEK))) {
	    			            numberOfDays++;
	    			        }
	    			        cal1.add(Calendar.DATE,1);
	    			    }
	    			    System.out.println(numberOfDays);
	    					
	    			    double TotalAmount=0;
	    					List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td[4][contains(text(),'£')]"));
	    					for(int i = 0;i<=list.size()-1;i++)
	    					{
	    						List<WebElement> list2 = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td[4][contains(text(),'£')]"));
	    						String TotalOfSSP=list2.get(i).getText().trim();
			    				String TotalWithoutsymbol = TotalOfSSP.substring(1).replaceAll(",", "");
			    				double TotalAmount2=Double.parseDouble(TotalWithoutsymbol);
			    				TotalAmount=TotalAmount2+TotalAmount;
	    					}
		    				double THoldValue=Double.parseDouble(TotalWeeklyAmount);			      
		    				      
		    					double onedaypay2=THoldValue/5;
		    					double days2=numberOfDays-3;
		    					double TotalAMountCal2=onedaypay2*days2;
		    					 
		    					 BigDecimal salary4A = new BigDecimal(TotalAMountCal2).setScale(2, RoundingMode.HALF_UP);
		    				      double salary5 = salary4A.doubleValue();
		    				      
		    					DecimalFormat dfSharp = new DecimalFormat("#.##");
		    					String VTotal = dfSharp.format(salary5);
		    					String UITotal = dfSharp.format(TotalAmount);
		    					
		    					soft.assertEquals(UITotal, VTotal,"Paternity Leave Amount is not getting mateched");
		    					
		    			
		    				
		    				
	    			}
	    			
	    			
	    			public void enter_LeaveDate(String Date)
	    			{
	    				WebElement elem = getWebElement(By.xpath("//input[@id='txtLeaveDate']"));
	    				elem.sendKeys(Date);
	    				elem.sendKeys(Keys.TAB);
	    				System.out.println("enter_LeaveDate");
	    				Reporter.log("enter_LeaveDate");
	    			}
	    			
	    			public void enter_LeaveEndDate(String Date)
	    			{
	    				WebElement elem = getWebElement(By.xpath("//input[@id='txtToDate']"));
	    				elem.sendKeys(Date);
	    				elem.sendKeys(Keys.TAB);
	    				System.out.println("enter_LeaveDate");
	    				Reporter.log("enter_LeaveDate");
	    			}
	    			
	    			public void enter_LeaveHour(String Date) throws InterruptedException
	    			{
	    				Thread.sleep(2000);
	    				WebElement elem = getWebElement(By.xpath("//input[@id='TxtTime']"));
	    				elem.sendKeys(Date);
	    				elem.sendKeys(Keys.TAB);
	    				System.out.println("enter_LeaveHour");
	    				Reporter.log("enter_LeaveHour");
	    			}
	    			
	    			
	    			public void clickOnAddMultipleLeaveButton()
	    			{
	    				WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_btnAddDate']"));
	    				elem.click();
	    				System.out.println("clickOnAddMultipleLeaveButton");
	    				Reporter.log("clickOnAddMultipleLeaveButton");
	    			}
	    			
	    			public void enter_LeaveDate2(String Date)
	    			{
	    				WebElement elem = getWebElement(By.xpath("//input[@id='txtLeaveDate2']"));
	    				elem.sendKeys(Date);
	    				elem.sendKeys(Keys.TAB);
	    				System.out.println("enter_LeaveDate");
	    				Reporter.log("enter_LeaveDate");
	    			}
	    			
	    			public void enter_LeaveHour2(String Date) throws InterruptedException
	    			{
	    				Thread.sleep(2000);
	    				WebElement elem = getWebElement(By.xpath("//input[@id='TxtTime2']"));
	    				elem.sendKeys(Date);
	    				elem.sendKeys(Keys.TAB);
	    				System.out.println("enter_LeaveHour");
	    				Reporter.log("enter_LeaveHour");
	    			}
	    			
	    			
	    			public void assertAll()
	    			{
	    				soft.assertAll();
	    			}
	    			
	    			
	    			
	    			
	    			
	    			public String GetApprovedAndRejectNote()
	    			{
						return enterNote;
	    				
	    			}
	    			
	    			public void clickOnDownloadSPP1From()
	    			{
	    				WebElement elem = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeading_btnSPP']"));
	    					elem.click();
	    					System.out.println("clickOnDownloadSPP1From");
		    				Reporter.log("clickOnDownloadSPP1From");
	    			}

	    			public void emter_SelectDateInSPP1From(String date) throws InterruptedException
	    			{
	    				Thread.sleep(2000);
	    				m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='DownloadSPPFormFrame']")));
	    				WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtSelectDate']"));
	    				String selectAll = Keys.chord(Keys.CONTROL, "a");
		    	 		elem.sendKeys(selectAll);
		    	 		elem.sendKeys(date);
		    	 		elem.sendKeys(Keys.TAB);
		    	 		System.out.println("emter_SelectDateInSPP1From : "+date);
	    				Reporter.log("emter_SelectDateInSPP1From : "+date);
	    				m_Driver.switchTo().defaultContent();
	    			}
	    			public void emter_WorkedOnDateInSPP1From(String date) throws InterruptedException
	    			{
	    				Thread.sleep(2000);
	    				m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='DownloadSPPFormFrame']")));
	    				WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtWorkedOn']"));
	    				String selectAll = Keys.chord(Keys.CONTROL, "a");
		    	 		elem.sendKeys(selectAll);
		    	 		elem.sendKeys(date);
		    	 		elem.sendKeys(Keys.TAB);
		    	 		System.out.println("emter_WorkedOnDateInSPP1From : "+date);
	    				Reporter.log("emter_WorkedOnDateInSPP1From : "+date);
	    				m_Driver.switchTo().defaultContent();
	    			}
	    			public void emter_legalCustodyOnDateInSPP1From(String date) throws InterruptedException
	    			{
	    				Thread.sleep(2000);
	    				m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='DownloadSPPFormFrame']")));
	    				WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtLegalCus']"));
	    				String selectAll = Keys.chord(Keys.CONTROL, "a");
		    	 		elem.sendKeys(selectAll);
		    	 		elem.sendKeys(date);
		    	 		elem.sendKeys(Keys.TAB);
		    	 		System.out.println("emter_legalCustodyOnDateInSPP1From : "+date);
	    				Reporter.log("emter_legalCustodyOnDateInSPP1From : "+date);
	    				m_Driver.switchTo().defaultContent();
	    			}

	    			public void click_chkboxByName(String Name) throws InterruptedException
	    			{
	    				Thread.sleep(2000);
	    				m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='DownloadSPPFormFrame']")));
	    				WebElement elem = getWebElement(By.xpath("//label[normalize-space()='"+Name+"']//parent::td/input"));
	    				elem.click();
	    				System.out.println("click_chkboxByName : "+Name);
	    				Reporter.log("click_chkboxByName : "+Name);
	    				m_Driver.switchTo().defaultContent();
	    			}
	    			public String clickOnCreateButton()
	    			{
	    				try
	    				{
	    						m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='DownloadSPPFormFrame']")));	
	    						WebElement DownButton = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnCreate']"));
	    						DownButton.click();
	    						m_Driver.switchTo().defaultContent();
	    						System.out.println("Click On Payslip Download Button");
	    						Reporter.log("Click On Payslip Download Button");
	    						Thread.sleep(20000);
	    					System.out.println("Download PDF File");
	    					Reporter.log("Download PDF File");
	    					File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
	    					//List the files on that folder
	    					//Thread.sleep(5000);
	    					File[] listOfFiles = folder.listFiles();
	    					boolean found = false;
	    					File f = null;
	    					     //Look for the file in the files
	    					     // You should write smart REGEX according to the filename
	    					     for (File listOfFile : listOfFiles) {
	    					         if (listOfFile.isFile()) {
	    					              String fileName = listOfFile.getName();
	    					               System.out.println("File " + listOfFile.getName());
	    					               if (fileName.matches(fileName)) {
	    					                   f = new File(fileName);
	    					                   found = true;
	    					                  FileName=fileName;
	    					                }
	    					            }
	    					        }
	    					     Assert.assertTrue(found, "Downloaded document is not found");
	    					f.deleteOnExit();
	    					Thread.sleep(10000);
	    				
	    					
	    				}
	    				catch (Exception e)
	    				{
	    					System.out.println("Issue in DwonloadCSv = "+e);
	    				}
	    				return FileName;
	    				
	    				}
					
	    			
	    			public void ReadFullDownloadedFroms(int StartPg,int EndPg, int LineNo, String Amount,int Array) throws Exception
	    			{
	    				Thread.sleep(5000);
	    			    File file = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+FileName);
	    			 //   File file = new File("C:\\Jmeter\\down\\Ashish-INVOICE#INV-10253_3.pdf");
	    			  
	    			    PDDocument document = PDDocument.load(file);
	    			    PDFTextStripper pdfStripper = new PDFTextStripper();
	    			    pdfStripper.setStartPage(StartPg);
	    			    pdfStripper.setEndPage(EndPg);

	    			   //load all lines into a string
	    			    String pages = pdfStripper.getText(document);

	    				
	    				System.out.println(pages);
	    			   //split by detecting newline
	    			    String[] lines = pages.split("\r\n|\r|\n");

	    			   int count=0;   //Just to indicate line number
	    			    for(String temp:lines)
	    			    {
	    			        System.out.println(count+" "+temp);
	    			        count++;
	    			    }    
	    			    String Actvalue[] = lines[LineNo].split(" ");
	    			    String Act1=Actvalue[Array].replaceAll(" ", "");
	    			    String aa1=Act1.trim();
	    			  //  String aa2=Act1[3].trim();
	    			    System.out.println(aa1);
	    			    String InPDFAmount = aa1;
	    			    //System.out.println(ActDividentamt);
//	    			    double EnterAmount = Double.parseDouble(Amount);
//	    				DecimalFormat df = new DecimalFormat("0.00");
//	    				String AcualAmount = df.format(EnterAmount);
	    			   Assert.assertEquals(InPDFAmount, Amount, "Data is not matched in PDF");
	    			    document.close();
	    			    Thread.sleep(2000);
//	    			    if(file.delete()==true);
//	    			    {    
//	    			     System.out.println("Test PDF File is deleted");
//	    			    }
	    			}
	    			
	    			public String GetStudentAndPostGraduateLoanThreshold(String SelectYear,int index,int index2)
	    			{
	    				getWebElement(By.xpath("//span[normalize-space()='Reports']")).click();
	    				System.out.println("click Agent Report");
	    				Reporter.log("click Agent Report");
	    				WebElement TaxReport = getWebElement(By.xpath("//td[@class='text-left pb-0 lineheight']//a[@href='TaxYearConfiguration.aspx'][normalize-space()='Tax Rate Tables']"));
	    				jsExec.executeScript("arguments[0].scrollIntoView();", TaxReport);
	    				jsExec.executeScript("arguments[0].click();", TaxReport);
	    				System.out.println("click Tax Rate Tables");
	    				Reporter.log("click Tax Rate Tables");
	    				getWebElement(By.xpath("//span[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpStudentPostGraduateLoanThreshold']")).click();
	    				System.out.println("click Student Post Graduate Loan Threshold Report");
	    				Reporter.log("click Student Post Graduate Loan Threshold Report");
	    				WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']"));
	    				Select sel= new Select(elem);
	    				sel.selectByVisibleText(SelectYear);
	    				String Amount=getWebElement(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpStudentPostGraduateLoanThreshold']//table[@class='table table-head-bg']/tbody/tr["+index+"]/td[2]")).getText().trim();
	    				String Per=getWebElement(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpStudentPostGraduateLoanThreshold']//table[@class='table table-head-bg']/tbody/tr["+index2+"]/td[2]")).getText().trim();
	    				String AP = Amount+"="+Per;
						return AP;
	    			}

	    			
	    			public void verifyAnnualLeaveSchedule(String Entitlement,String CarriedForward,String FullDaysTaken,String HalfDayTaken,String Deducted,String Balance)
	    			{
	    				List<WebElement> list = getWebElements(By.xpath("//div[@class='table-responsive']//table[@class='table table-head-bg']/tbody/tr/td/input"));
	    						String Data = list.get(0).getAttribute("value").trim();
	    						soft.assertEquals(Data,Entitlement, "Entitlement is not matched");
	    						Reporter.log("Entitlement in AnnualLeaveSchedule :"+Entitlement+" = "+Data);
	    						
	    						String Data1 = list.get(1).getAttribute("value").trim();
	    						soft.assertEquals(Data1,CarriedForward, "CarriedForward is not matched");
	    						Reporter.log("CarriedForward in AnnualLeaveSchedule :"+CarriedForward+" = "+Data1);
	    						
	    						String Data2 = list.get(2).getAttribute("value").trim();
	    						soft.assertEquals(Data2,FullDaysTaken, "FullDaysTaken is not matched");
	    						Reporter.log("FullDaysTaken in AnnualLeaveSchedule :"+FullDaysTaken+" = "+Data2);
	    						
	    						String Data3 = list.get(3).getAttribute("value").trim();
	    						soft.assertEquals(Data3,HalfDayTaken, "HalfDayTaken is not matched");
	    						Reporter.log("HalfDayTaken in AnnualLeaveSchedule :"+HalfDayTaken+" = "+Data3);
	    						
	    					//	String Data4 = list.get(4).getAttribute("value").trim();
	    					//	soft.assertEquals(Unknown, Data4);
	    					
	    						String Data5 = list.get(5).getAttribute("value").trim();
	    						soft.assertEquals(Data5,Deducted, "Deducted is not matched");
	    						Reporter.log("Deducted in AnnualLeaveSchedule :"+Deducted+" = "+Data5);
	    						
	    						String Data6 = list.get(6).getAttribute("value").trim();
	    						soft.assertEquals(Data6,Balance, "Balance is not matched");
	    						Reporter.log("Balance in AnnualLeaveSchedule :"+Balance+" = "+Data6);
	    					
	    				}
	    				
	    			public void clickonEmpbyIndex(int index)
	    			{
	    				WebElement elem = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+index+"_lnkEmployeeName']"));
	    				elem.click();
	    				System.out.println("clickonEmpbyIndex");
	    			}
	    			
	    				
	    		public void verifyEmpLeaveDataInEmployeeLeaveDetailsPopUnderTheLeaveReport(String columnName,String data)
	    		{
	    			m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
	    			
	    			WebElement elem = getWebElement(By.xpath("//*[normalize-space()='"+columnName+"']/parent::div/div/input"));
	    			String UiData = elem.getAttribute("value").trim();
	    			soft.assertEquals(data, UiData);
	    			System.out.println(columnName +" : "+UiData);
	    			
	    		}
	    			
	    		
	    		
	    		public String GetEMPNameOnDashboardByPage(int pageNo) throws InterruptedException
	    		{
					
	    			WebElement Page = getWebElement(By.xpath("//a[normalize-space()='"+pageNo+"']"));
	    			Page.click();
	    			Thread.sleep(5000);
	    			
	    			String Name1=getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkEditEmp']")).getText().trim();
	    			String Name2=getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl03_lnkEditEmp']")).getText().trim();
	    			String Name3=getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_lnkEditEmp']")).getText().trim();
	    			String Name4=getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl05_lnkEditEmp']")).getText().trim();
	    			
	    			return Name1+"~"+Name2+"~+"+Name3+"~"+Name4;
	    			
	    		}
	    		
	    		
	    		
	    		public String selectEmployeeByIndex(int Index) throws Exception
	    		{
	    	        
	    			WebElement elem = getWebElement(employeeElem);

	    			if (elem == null) {
	    	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectEmployee", "selectEmployee failed. Unable to locate object: " + employeeElem.toString());


	    				Assert.fail("Unable to locate object: " + employeeElem.toString());
	    	        }

	    			Select sel= new Select(elem);
	    			sel.selectByIndex(Index);
	    			Thread.sleep(5000);
	    			ExtentReportManager.passStep(m_Driver, "selectEmployee");
	    			WebElement elem2 = getWebElement(employeeElem);
	    			Select sel2= new Select(elem2);
	    			WebElement  EMPName=sel2.getFirstSelectedOption();
	    			String EMPNAME = EMPName.getText();
	    			Reporter.log("selectEmployee");
					return EMPNAME;
	    		}

	    		public void Enter_ActualBirthDateInMaternity(String ExpectedBirthDate) throws Exception
	    	 	{
	    	 	    
	    			
	    	 		WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtDOB']"));

	    	 		if (elem == null) {
	    	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ExpectedBirthDate", "Enter_ExpectedBirthDate failed. Unable to locate object: " + ExpectedBirthDateElem.toString());

	    	    		Assert.fail("Unable to locate object: " + ExpectedBirthDateElem.toString());
	    	         }
	    	 		
	    	 		jsExec.executeScript("window.scrollBy(0,800)");
	    	 		//jsExec.executeScript("arguments[0].scrollIntoView();", elem);
	    	 		for(int i=0;i<=9;i++)
	    	 		{
	    	 			elem.sendKeys(Keys.BACK_SPACE);
	    	 		}
	    	 		elem.sendKeys(ExpectedBirthDate);
	    	 		Thread.sleep(1000);
	    	 		
	    	 		elem.sendKeys(Keys.TAB);
	    	 		Thread.sleep(3000);
	    	 		
	    	   		ExtentReportManager.passStep(m_Driver, "Enter_ExpectedBirthDate " + ExpectedBirthDate);

	    	  		
	    	  			}

	    		
	    		public void enterAwe(String Amount) throws Exception
	    		{
	    			Thread.sleep(3000);
	    			WebElement elem = getWebElement(aweElem);

	    			if (elem == null) {
	    	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAwe", "enterAwe failed. Unable to locate object: " + aweElem.toString());
	    				Assert.fail("Unable to locate object: " + aweElem.toString());
	    	        }
	    			
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	 		elem.sendKeys(Amount);
	    	 		elem.sendKeys(Keys.TAB);
	    	 		
	    			TakeScreenshot.takeScreenshot(m_Driver, "enterAwe");
	    			ExtentReportManager.passStep(m_Driver, "enterAwe");
	    			
	    			System.out.println("enterAwe : "+Amount);
	    			Reporter.log("enterAwe : "+Amount);
	    		}

	    	
	    		public void CopyPaste_ActualBirthDate() throws Exception
	    	 	{
	    	 	    
	    			
	    	 	
	    	 		jsExec.executeScript("window.scrollBy(0,800)");
	    			Thread.sleep(2000);
	    			jsExec.executeScript(
	    					"let copyText = document.querySelector(\"[name='ctl00$ctl00$ParentContent$cPH$txtDOBPater']\");\n" +
	    					"copyText.select();\n" +
	    					"document.execCommand(\"copy\");");
	    			
	    			WebElement elem = getWebElement(actualBirthDateElem);
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	        elem.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	    	        elem.sendKeys(Keys.TAB);
	    	        System.out.println("CopyPaste_ActualBirthDate ");
	    			Reporter.log("CopyPaste_ActualBirthDate ");
	    	  		
	    	  }

    			
	    		public void CopyPaste_LeaverStartDateSSP() throws Exception
	    		{
	    		    
	    			jsExec.executeScript("window.scrollBy(0,800)");
	    			Thread.sleep(2000);
	    			jsExec.executeScript(
	    					"let copyText = document.querySelector(\"[name='ctl00$ctl00$ParentContent$cPH$txtStartDatePaternity']\");\n" +
	    					"copyText.select();\n" +
	    					"document.execCommand(\"copy\");");
	    			
	    			WebElement elem = getWebElement(LeaverStartDateSPPElem);
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	        elem.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	    	        elem.sendKeys(Keys.TAB);
	    	        System.out.println("Copy Paste Leave Start Date In SSP");
	    			Reporter.log("Copy Paste Leave Start Date In SSP");
	    			
	    		}

    			
	    		public void CopyPaste_LeaverStartDateSick() throws Exception
	    		{
	    			jsExec.executeScript("window.scrollBy(0,820)");
	    			Thread.sleep(2000);
	    			jsExec.executeScript(
	    					"let copyText = document.querySelector(\"[id='ctl00_ctl00_ParentContent_cPH_txtStartDateSick']\");\n" +
	    					"copyText.select();\n" +
	    					"document.execCommand(\"copy\");");
	    			
	    			WebElement elem = getWebElement(LeaverStartDateSickLeaveElem);
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	        elem.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	    	        elem.sendKeys(Keys.TAB);
	    	        System.out.println("Copy Paste Leave Start Date In Sick");
	    			Reporter.log("Copy Paste Leave Start Date In Sick");

	    			
	    				}
	    		
	    		public void CopyPaste_LeaverEndDateSick() throws Exception
	    		{
	    			jsExec.executeScript("window.scrollBy(0,820)");
	    			Thread.sleep(2000);
	    			jsExec.executeScript(
	    					"let copyText = document.querySelector(\"[id='ctl00_ctl00_ParentContent_cPH_txtStartDateSick']\");\n" +
	    					"copyText.select();\n" +
	    					"document.execCommand(\"copy\");");
	    			
	    			WebElement elem = getWebElement(LeaverEndDateSickLeaveElem);
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	        elem.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	    	        elem.sendKeys(Keys.TAB);
	    	        System.out.println("Copy Paste Leave Start Date In Sick");
	    			Reporter.log("Copy Paste Leave Start Date In Sick");

	    			
	    				}

	    		public void CopyPaste_LeaverStartDateHoliday() throws Exception
	    		{
	    		    
	    				jsExec.executeScript("window.scrollBy(0,800)");
	    				
	    				Thread.sleep(2000);
	    				jsExec.executeScript(
	    						"let copyText = document.querySelector(\"[name='ctl00$ctl00$ParentContent$cPH$txtLeaveStartDate']\");\n" +
	    						"copyText.select();\n" +
	    						"document.execCommand(\"copy\");");
	    				
	    				WebElement elem = getWebElement(LeaverStartHolidayDateElem);
	    				String selectAll = Keys.chord(Keys.CONTROL, "a");
	    		 		elem.sendKeys(selectAll);
	    		        elem.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	    		        elem.sendKeys(Keys.TAB);
//	    		        JavascriptExecutor js = (JavascriptExecutor) m_Driver;
//	    				js.executeScript("document.querySelector('.ui-datepicker').style.display='none';");
	    		        System.out.println("Copy Paste Leave StartDate ");
	    				Reporter.log("Copy Paste Leave StartDate ");
	    				
	    				}
	    		
	    		public void CopyPaste_LeaverEndDateHoliday() throws Exception
	    		{

	    			jsExec.executeScript("window.scrollBy(0,800)");
	    			Thread.sleep(2000);
	    			jsExec.executeScript(
	    					"let copyText = document.querySelector(\"[name='ctl00$ctl00$ParentContent$cPH$txtLeaveStartDate']\");\n" +
	    					"copyText.select();\n" +
	    					"document.execCommand(\"copy\");");
	    			
	    			WebElement elem = getWebElement(LeaverEndDateHolidayElem);
	    			String selectAll = Keys.chord(Keys.CONTROL, "a");
	    	 		elem.sendKeys(selectAll);
	    	        elem.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	    	        elem.sendKeys(Keys.TAB);
	    	        System.out.println("Copy Paste Leave End Date ");
	    			Reporter.log("Copy Paste Leave End Date ");
	    			
	    				}


	    	  
}

