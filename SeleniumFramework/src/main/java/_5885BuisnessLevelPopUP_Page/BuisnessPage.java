package _5885BuisnessLevelPopUP_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class BuisnessPage extends BasePage{

	public BuisnessPage(WebDriver driver) {
		super(driver);
		
	}								
  
	private By payDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl00_lnkViewEmployeeSalaryDetails']");
	private By sendSMS = By.xpath("//*[@data-original-title='Send SMS']");
	private By email= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
	
	private By addOneOffElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnOneOff']");
	
	private By CisSufferd=  By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkCISSuffered']");
	
	private By hmrcElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkHMRCAdjustments']");
	
	private By statutoryElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkStatutoryPayFunding']");
	
	private By taxRefundElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkTaxRefund']");
	
	private By leaveManagementElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefLeaveManagement']/span");
	
	private By leaveReport= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_herfAddleave']");
	
	private By viewAllElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_lnkDepartment']");
	
	
	private By createElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnCreate']");
	
	private By LinkBtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnLink']");
	
	private By mayCisSufferdElem= (By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_txtCISSufferedAmount']"));
	
	private By juneCisSufferdElem= (By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_txtCISSufferedAmount']"));

	private By AprilCisSufferdElem= (By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_txtCISSufferedAmount']"));

	private By sepCisSufferdElem= (By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl06_txtCISSufferedAmount']"));
	private By febCisSufferdElem= (By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl10_txtCISSufferedAmount']"));

	private By julyCisSufferdElem= (By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_txtCISSufferedAmount']"));

	private By octCisSufferdElem= (By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl06_txtCISSufferedAmount']"));

	
	private By saveElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	
	public void clickSendSms() throws Exception
	{
        
		WebElement elem = getWebElement(sendSMS);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSendSms", "clickSendSms failed. Unable to locate object: " + sendSMS.toString());


			Assert.fail("Unable to locate object: " + sendSMS.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickSendSms");

		ExtentReportManager.passStep(m_Driver, "clickSendSms");

		
		Reporter.log("clickSendSms");
	}
	
	
	
	public void clickAddOneOff() throws Exception
	{
        
		WebElement elem = getWebElement(addOneOffElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSendSms", "clickSendSms failed. Unable to locate object: " + addOneOffElem.toString());


			Assert.fail("Unable to locate object: " + addOneOffElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickAddOneOff");

		ExtentReportManager.passStep(m_Driver, "clickAddOneOff");

		
		Reporter.log("clickAddOneOff");
	}
	
	
	public void clickHmrcAdjustments() throws Exception
	{
        
		WebElement elem = getWebElement(hmrcElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickHmrcAdjustments", "clickHmrcAdjustments failed. Unable to locate object: " + hmrcElem.toString());


			Assert.fail("Unable to locate object: " + hmrcElem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickHmrcAdjustments");

		ExtentReportManager.passStep(m_Driver, "clickHmrcAdjustments");

		
		Reporter.log("clickHmrcAdjustments");
	}
	
	
	
	
	public void clickStatutoryPayFunding() throws Exception
	{
        
		WebElement elem = getWebElement(statutoryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickStatutoryPayFunding", "clickStatutoryPayFunding failed. Unable to locate object: " + statutoryElem.toString());


			Assert.fail("Unable to locate object: " + statutoryElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "clickStatutoryPayFunding");

		ExtentReportManager.passStep(m_Driver, "clickStatutoryPayFunding");

		
		Reporter.log("clickStatutoryPayFunding");
	}
	
	
	
	
	public void clickTaxRefund() throws Exception
	{
        
		WebElement elem = getWebElement(taxRefundElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickStatutoryPayFunding", "clickStatutoryPayFunding failed. Unable to locate object: " + taxRefundElem.toString());


			Assert.fail("Unable to locate object: " + taxRefundElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickTaxFunding");

		ExtentReportManager.passStep(m_Driver, "clickTaxFunding");

		
		Reporter.log("clickTaxFunding");
	}
	
	public void clickCisSufferd() throws Exception
	{
        
		WebElement elem = getWebElement(CisSufferd);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCisSufferd", "clickCisSufferd failed. Unable to locate object: " + CisSufferd.toString());


			Assert.fail("Unable to locate object: " + CisSufferd.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickCisSufferd");

		ExtentReportManager.passStep(m_Driver, "clickCisSufferd");

		
		Reporter.log("clickCisSufferd");
	}
	
	
	
	public void clickEmailBtn() throws Exception
	{
        
		WebElement elem = getWebElement(email);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + email.toString());


			Assert.fail("Unable to locate object: " + email.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickEmailBtn");

		ExtentReportManager.passStep(m_Driver, "clickEmailBtn");

		
		Reporter.log("clickEmailBtn");
	}
	
	
	
	public void clickPayDate() throws Exception
	{
        
		WebElement elem = getWebElement(payDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayDate", "clickPayDate failed. Unable to locate object: " + payDateElem.toString());


			Assert.fail("Unable to locate object: " + payDateElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickPayDate");

		ExtentReportManager.passStep(m_Driver, "clickPayDate");

		
		Reporter.log("clickPayDate");
	}
	
	

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
	
	
	
	public void clickAddLeaveReport() throws Exception
	{
        
		WebElement elem = getWebElement(leaveReport);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddLeave", "clickAddLeave failed. Unable to locate object: " + leaveReport.toString());


			Assert.fail("Unable to locate object: " + leaveReport.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickAddLeave");

		ExtentReportManager.passStep(m_Driver, "clickAddLeave");

		
		Reporter.log("clickAddLeave");
		
		
		
	}
	
	public void clickEmployeeName() throws Exception
	{
		
		
       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkEmployeeName']")).click();
		
		Thread.sleep(3000);
		
		Reporter.log("clickEmployeeName");
	}
	
	
	
	public void clickViewAll() throws Exception
	{
        
		WebElement elem = getWebElement(viewAllElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayDate", "clickPayDate failed. Unable to locate object: " + viewAllElem.toString());


			Assert.fail("Unable to locate object: " + viewAllElem.toString());
        }

		elem.click();
		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickViewAll");

		ExtentReportManager.passStep(m_Driver, "clickViewAll");

		
		Reporter.log("clickViewAll");
	}
	
	
	
	public void clickEditDepatmentList() throws Exception
	{

		
       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrDepartmentDetails_ctl00_lnkEdit']")).click();
		
       
		Thread.sleep(3000);
		
		Reporter.log("clickEmployeeName");
	}
	
	
	public void clickDelettDepatmentList() throws Exception
	{
	 //  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

		
       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrDepartmentDetails_ctl00_lnkDelete']")).click();
		
       
       //m_Driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		Reporter.log("clickEmployeeName");
	}
	
	
	
	public void clickCreateBtn() throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

		WebElement elem = getWebElement(createElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCreateBtn", "clickCreateBtn failed. Unable to locate object: " + createElem.toString());


			Assert.fail("Unable to locate object: " + createElem.toString());
        }

		elem.click();

		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickCreateBtn");

		ExtentReportManager.passStep(m_Driver, "clickCreateBtn");

		
		Reporter.log("clickViewAll");
	}
	
	
	

	public void enterMayCIS(String data) throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(mayCisSufferdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterMayCIS", "enterMayCIS failed. Unable to locate object: " + mayCisSufferdElem.toString());


			Assert.fail("Unable to locate object: " + mayCisSufferdElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);

		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "enterMayCIS");

		ExtentReportManager.passStep(m_Driver, "enterMayCIS");

		
		Reporter.log("enterMayCIS");
	}
	
	
	
	public void enterJuneCIS(String data) throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(juneCisSufferdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterJuneCIS", "enterJuneCIS failed. Unable to locate object: " + juneCisSufferdElem.toString());


			Assert.fail("Unable to locate object: " + juneCisSufferdElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);

		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "enterJuneCIS");

		ExtentReportManager.passStep(m_Driver, "enterJuneCIS");

		
		Reporter.log("enterJuneCIS");
	}
	
	
	
	public void enterAprilCIS(String data) throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(AprilCisSufferdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAprilCIS", "enterAprilCIS failed. Unable to locate object: " + AprilCisSufferdElem.toString());


			Assert.fail("Unable to locate object: " + AprilCisSufferdElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);

		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "enterAprilCIS");

		ExtentReportManager.passStep(m_Driver, "enterAprilCIS");

		
		Reporter.log("enterAprilCIS");
	}
	
	
	public void enterOctCIS1(String data) throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(sepCisSufferdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterSepCIS", "enterSepCIS failed. Unable to locate object: " + sepCisSufferdElem.toString());


			Assert.fail("Unable to locate object: " + sepCisSufferdElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);

		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "enterSepCIS");

		ExtentReportManager.passStep(m_Driver, "enterSepCIS");

		
		Reporter.log("enterSepCIS");
	}
	
	
	public void enterFebCis(String data) throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(febCisSufferdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFebCis", "enterFebCis failed. Unable to locate object: " + febCisSufferdElem.toString());


			Assert.fail("Unable to locate object: " + febCisSufferdElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);

		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "enterFebCis");

		ExtentReportManager.passStep(m_Driver, "enterFebCis");

		
		Reporter.log("enterFebCis");
	}
	
	
	public void enterJulyCIS(String data) throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(julyCisSufferdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterJulyCIS", "enterJulyCIS failed. Unable to locate object: " + julyCisSufferdElem.toString());


			Assert.fail("Unable to locate object: " + julyCisSufferdElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);

		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "enterJulyCIS");

		ExtentReportManager.passStep(m_Driver, "enterJulyCIS");

		
		Reporter.log("enterJulyCIS");
	}
	
	public void enterOctCIS(String data) throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(octCisSufferdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterOctCIS", "enterOctCIS failed. Unable to locate object: " + octCisSufferdElem.toString());


			Assert.fail("Unable to locate object: " + octCisSufferdElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);

		Thread.sleep(2000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "enterOctCIS");

		ExtentReportManager.passStep(m_Driver, "enterOctCIS");

		
		Reporter.log("enterOctCIS");
	}
	
	public void clickLinkBtn() throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

		 WebElement elem = getWebElement(LinkBtnElem);
		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLinkBtn", "clickLinkBtn failed. Unable to locate object: " + LinkBtnElem.toString());


			Assert.fail("Unable to locate object: " + LinkBtnElem.toString());
        }

		elem.click();

		Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickLinkBtn");

		ExtentReportManager.passStep(m_Driver, "clickLinkBtn");

		
		Reporter.log("clickViewAll");
	}
	
	
	
	
	public void saveCIS() throws Exception
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement elem = getWebElement(saveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "saveCIS", "saveCIS failed. Unable to locate object: " + saveElem.toString());


			Assert.fail("Unable to locate object: " + saveElem.toString());
        }

		elem.click();

		Thread.sleep(8000);

		m_Driver.switchTo().defaultContent();
		TakeScreenshot.takeScreenshot(m_Driver, "saveCIS");

		ExtentReportManager.passStep(m_Driver, "saveCIS");

		Reporter.log("saveCIS");
	}
	
	
}
