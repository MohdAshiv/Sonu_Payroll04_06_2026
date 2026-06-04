package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;

public class LeaveManagement  extends BasePage{

	public LeaveManagement(WebDriver driver) {
		super(driver);
		
	}
	

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
	private By actualBirthDateElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtDOB']");
	
	

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
	private By historyLeavesElem1= By.xpath("//*[contains(text(),'History Leave')]");

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
	
	
	
	public void enterNote() throws Exception
	{
        
		WebElement elem = getWebElement(NoteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNote", "enterNote failed. Unable to locate object: " + NoteElem.toString());


			Assert.fail("Unable to locate object: " + NoteElem.toString());
        }

 		String s = RandomStringUtils.randomAlphabetic(50); 

		elem.sendKeys(s);
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
	
	
	public void Enter_AWE(String AWE) throws Exception
 	{
 	    
		
 		WebElement elem = getWebElement(AWE_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ExpectedBirthDate", "Enter_ExpectedBirthDate failed. Unable to locate object: " + AWE_Elem.toString());

    		Assert.fail("Unable to locate object: " + AWE_Elem.toString());
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
	
	
	public void Enter_LeaverStartDateSick(String LeaverStartDate) throws Exception
	{
	    
		
		WebElement elem = getWebElement(LeaverStartDateSickLeaveElem);

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LeaverStartDateSick", "Enter_LeaverStartDateSick failed. Unable to locate object: " + LeaverStartDateSickLeaveElem.toString());

  		Assert.fail("Unable to locate object: " + LeaverStartDateSickLeaveElem.toString());
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
		ExtentReportManager.passStep(m_Driver, "Enter_LeaverStartDateSick " + LeaverStartDate);

		
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
}

