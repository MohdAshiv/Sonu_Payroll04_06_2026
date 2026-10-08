package pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class EditCompany extends BasePage {

	public EditCompany(WebDriver driver) {
		super(driver);
		
	}
	SoftAssert soft=new SoftAssert();
	
	private By nomismaStartDateElem = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$txtSwitchDate']");
	private By ClickPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");
	private By OpeningBalanceElem = By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances']");

	private By gotoEditCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By clickPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By clickPayrollSettingsElem = By.xpath("//A[contains(text(),'Payroll Settings')]");


	private By ClickSaveElem = By.xpath("//*[@id='btnSave']");

	private By disableElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_hrefEnableDisableEmailAutorun']");
	
	private By tagsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlPwdPfr']");
	
	private By employeeTagElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlPwdPfr']");
	
	private By inputTextElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtNewPassword']");
	
	private By inputTextEmployeeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_textPassword']");

	private By createElem = By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[2]/div[2]/div[1]/div[6]/div/a[3]");
	
	
	private By createEmployeeElem = By.xpath("//*[@id=\"dvPasswordProtectionPopup2\"]/div/div/div[2]/div[2]/div[1]/div[6]/div/a[3]");

	private By employerNO= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmplrPwd_1']");
	
	private By employeeNo =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmpPwd_1']");
	private By ClickEnableAutorunElem = By.xpath("//label[normalize-space()= 'Automatic Payroll:']/../div[1]/a");

	private By ClickContinueElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LinkButtonContinue']");

	private By SelectEmailModeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_EmailMode']");

	private By SelectYesElem = By.xpath("//label[normalize-space()= 'Yes']/../input");
	
	private By Continue2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By Enable2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_BtnSaveMode']");
	
	private By ClickEmailSettingsElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_btnSettings']");

	private By ClickDisableElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_BtnDisable']");
	
	private By SelectPaswdProtectionFormatElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$chkPwdProtectPaySlips1']");
	
	private By enabledPassProtectionElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmplrPwd_0']");

	private By EmployeeenabledPassProtectionElem=By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmpPwd_0\"]");

	private By inputTextPasswordElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_textPassword2']");

	
	private By createBtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_LinkButtonEx1']");
	
	 private By iconElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_A4']");
	 
	 private By iconEmployeeElem= By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/div/button");

	 private By changepasswordElem= By.xpath("//*[@text='Change Password']");
	 
	private By registerdCisElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblRegforCis_0']");
	 private By linkedwithAccount= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_lnkLinkWithAccount']");
	 
	 private By departmentElem= By.xpath("//*[@id='btnNewDept']");
	 
	 private By departmentNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDepartmentName']");
	
	 private By departmentSaveElem= By.xpath("//*[@id='btnSaveDept']");
	 
	 private By closePayeSchemeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblClosePayee_0']");
	 
	 private By payslipTemplateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_Videolink']");
	 
	 private By requestPayrollElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rdbRequestPayrollInformation_0']");
	 
	 private By editEmailSettingElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_BtnEdit']");
	 
	 private By continueBtnelem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	 
	 private By allowancesSchemeElem=By.xpath("//*[@id='liAllowancesSchemes']/a");
	 
	 private By noEmployementAllowanceElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_1']");
	 
	 private By yesEmployementAllowanceElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_0']");
	 
	 private By department= By.xpath("//*[@id='lidept']/a");
	 
	 private By P11DElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbP11D_0']");

	 
	 private By staffElem= By.xpath("//*[@id='adddeptpayroll']/div/div/div[2]/div/table/tbody/tr[2]/td[2]");
	 private By enableElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	 
	 private By NoEmployementAllowanceElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_1']");

	 
	 private By deletDepartmentElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrDepartmentDetails_ctl00_lnkDelete']");
	 private By deletDepartmentElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnDelete']");

	 private By editElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrDepartmentDetails_ctl00_lnkEdit']");
	 
	 
	 private By FourWeeklyPeriodEndDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtFourWeeklyPayrollEndDate']");
	 
	 private By WeeklyPeriodEndDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtWeeklyPayrollEndDate']");

	 private By updateElem= By.xpath("//*[@id='btnSaveDept']");
	 
	 private By generalTermasElem= By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement']");

	 private By commanContractualTermasElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_liCon']/a");

	 
	 private By BankDetailsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_liBank']");
	 private By informationElem= By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany']");
	 private By pensionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_tab']");
	 private By contactElem= By.xpath("//*[@id='licontact']/a");

	 private By pensionYesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_CompanyPensionYesNo_0']");

	 private By payeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtOfficeNo']");

	 private By payeRefrenceElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtPayeRefNo']");

	 private By accountOfficeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtAORef']");

	 
	 private By firstNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtContactFN']");
	 
	 private By contactEmailElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtContactEmail']");
	 
	 private By addContactElem= By.xpath("//*[@id='btnsavecontact']");

	 private By updateContactElem= By.xpath("//*[@id='btnupdatecontact']");

	 private By quarterlyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbQuarterlyPayeScheme_0']");
	 
	 private By updateRequestPayInfoElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnUpdate']");
	 
	 private By leaveStartdateElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtStartDate']");
	 
	 private By holidayPayRateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtHourlyRate']");
	 private By weeklyWorkingHrsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtWorkingHoursWeekly']");
	 private By maxCarryOverElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtCarryForward']");
	 private By monthlyPayeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlMonthlyPayDay']");
	 
	 private By leaveDaysComapny= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtAnnualLeaveDays']");
	 
	 private By maxSickDays=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtPaySicknessDaysMax']");

	 private By noticePeriod= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtNoticeWeeks']");
	 
	 private By AccruedPay = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_chkAccPay']");
	 
	 private By payOverTime= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_chkPayOvertime']");
	 
	 private By LeavesOvertime= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_chkLeavesOvertime']");
	 
	 private By RetirementAgeMale= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtRetirementAgeMale']");
	 
	 private By RetirementAgeMaleFemale= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtRetirementAgeFemale']");
	 
	 private By displayOnLeave=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RadioLeaveOnPayslip_0']");

	 private By companyStatusElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_ddlCompanyActive']");
	 
	 private By saveBtnAgentElem= By.xpath("//*[@id='btnSave']");
	 private By requestHrsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rdbRequestPayrollInformation_0']");

	 
	/**
 	 * Click gotoEditCompany
	 * @throws InterruptedException 
     * @name Click gotoEditCompany
     */
	 
	 public void enterleaveDays(String value) throws Exception
 	{
 		
         
 		WebElement elem = getWebElement(leaveDaysComapny);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterleaveStartDateCompany", "enterleaveStartDateCompany failed. Unable to locate object: " + leaveDaysComapny.toString());

 			Assert.fail("Unable to locate object: " + leaveDaysComapny.toString());
         }
 		elem.clear();
 		elem.sendKeys(value);
 	
 		Thread.sleep(2000);

 		TakeScreenshot.takeScreenshot(m_Driver, "enterleaveDaysComapny");

 		ExtentReportManager.passStep(m_Driver, "enterleaveDaysComapny");

 		Reporter.log("enterleaveDaysComapny");
 	}
	 
	 
	 
	 public void enterMaxSickDays(String value) throws Exception
	 	{
	         
	 		WebElement elem = getWebElement(maxSickDays);

	 		if (elem == null) {
	     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterMaxSickDays", "enterMaxSickDays failed. Unable to locate object: " + maxSickDays.toString());

	 			Assert.fail("Unable to locate object: " + maxSickDays.toString());
	         }
	 		elem.clear();
	 		elem.sendKeys(value);
	 	
	 		Thread.sleep(2000);

	 		TakeScreenshot.takeScreenshot(m_Driver, "enterMaxSickDays");

	 		ExtentReportManager.passStep(m_Driver, "enterMaxSickDays");

	 		Reporter.log("enterMaxSickDays");
	 	}
	 
	 
	 
	 public void enterNoticePeriod(String value) throws Exception
	 	{
	         
	 		WebElement elem = getWebElement(noticePeriod);

	 		if (elem == null) {
	     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNoticePeriod", "enterNoticePeriod failed. Unable to locate object: " + noticePeriod.toString());

	 			Assert.fail("Unable to locate object: " + noticePeriod.toString());
	         }
	 		elem.clear();

	 		elem.sendKeys(value);
	 	
	 		Thread.sleep(2000);

	 		TakeScreenshot.takeScreenshot(m_Driver, "enterNoticePeriod");

	 		ExtentReportManager.passStep(m_Driver, "enterNoticePeriod");

	 		Reporter.log("enterNoticePeriod");
	 	}
	 
	 
	 public void clickAccruedPay() throws Exception
	 	{
	         
	 		WebElement elem = getWebElement(AccruedPay);

	 		if (elem == null) {
	     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAccruedPay", "enterAccruedPay failed. Unable to locate object: " + AccruedPay.toString());

	 			Assert.fail("Unable to locate object: " + AccruedPay.toString());
	         }
	 		elem.click();


	 		TakeScreenshot.takeScreenshot(m_Driver, "enterAccruedPay");

	 		ExtentReportManager.passStep(m_Driver, "enterAccruedPay");

	 		Reporter.log("enterAccruedPay");
	 	}
	 
	 public void Click_OverwriteExistingEmployees() throws Exception
		{
	        
			WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cpHFooter_btnOverwrite']"));

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

				Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
	        }
			elem.click();
			
			Thread.sleep(11000);
			
			Reporter.log("Click_ClickSave");


			ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		}
	 

	 
	 public void clickPayOverTime() throws Exception
	 	{
	         
	 		WebElement elem = getWebElement(payOverTime);

	 		if (elem == null) {
	     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayOverTime", "clickPayOverTime failed. Unable to locate object: " + payOverTime.toString());

	 			Assert.fail("Unable to locate object: " + payOverTime.toString());
	         }
	 		elem.click();


	 		TakeScreenshot.takeScreenshot(m_Driver, "clickPayOverTime");

	 		ExtentReportManager.passStep(m_Driver, "clickPayOverTime");

	 		Reporter.log("clickPayOverTime");
	 	}
	 
	 

	 public void clickLeavesOverTime() throws Exception
	 	{
	         
	 		WebElement elem = getWebElement(LeavesOvertime);

	 		if (elem == null) {
	     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLeavesOverTime", "clickLeavesOverTime failed. Unable to locate object: " + LeavesOvertime.toString());

	 			Assert.fail("Unable to locate object: " + LeavesOvertime.toString());
	         }
	 		elem.click();

	 		TakeScreenshot.takeScreenshot(m_Driver, "clickLeavesOverTime");

	 		ExtentReportManager.passStep(m_Driver, "clickLeavesOverTime");

	 		Reporter.log("clickLeavesOverTime");
	 	}
	 
	 
	 public void enterRetirementAgeMale(String value) throws Exception
	 	{
	         
	 		WebElement elem = getWebElement(RetirementAgeMale);

	 		if (elem == null) {
	     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRetirementAgeMale", "enterRetirementAgeMale failed. Unable to locate object: " + RetirementAgeMale.toString());

	 			Assert.fail("Unable to locate object: " + RetirementAgeMale.toString());
	         }
	 		elem.clear();

	 		elem.sendKeys(value);
	 	
	 		Thread.sleep(2000);

	 		TakeScreenshot.takeScreenshot(m_Driver, "enterRetirementAgeMale");

	 		ExtentReportManager.passStep(m_Driver, "enterRetirementAgeMale");

	 		Reporter.log("enterRetirementAgeMale");
	 	}
	 
	 
	 public void enterRetirementAgeFeMale(String value) throws Exception
	 	{
	         
	 		WebElement elem = getWebElement(RetirementAgeMaleFemale);

	 		if (elem == null) {
	     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRetirementAgeFeMale", "enterRetirementAgeFeMale failed. Unable to locate object: " + RetirementAgeMaleFemale.toString());

	 			Assert.fail("Unable to locate object: " + RetirementAgeMaleFemale.toString());
	         }
	 		elem.clear();

	 		elem.sendKeys(value);
	 	
	 		Thread.sleep(2000);

	 		TakeScreenshot.takeScreenshot(m_Driver, "enterRetirementAgeFeMale");

	 		ExtentReportManager.passStep(m_Driver, "enterRetirementAgeFeMale");

	 		Reporter.log("enterRetirementAgeFeMale");
	 	}
	 
	 
	public void Click_gotoEditCompany() throws InterruptedException
	{
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(20));

        WebElement quickAction = wait.until(
        	    ExpectedConditions.elementToBeClickable(
        	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/div/div[2]/button")
        	    )
        	);

        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);
       	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);

		WebElement elem = getWebElement(gotoEditCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoEditCompany", "Click_gotoEditCompany failed. Unable to locate object: " + gotoEditCompanyElem.toString());

			Assert.fail("Unable to locate object: " + gotoEditCompanyElem.toString());
        }
		elem.click();
		
		Reporter.log("Click_gotoEditCompany");
          	
        Thread.sleep(5000);
		ExtentReportManager.passStep(m_Driver, "Click_gotoEditCompany");
	}
	
	
	public void clickAddContact() throws InterruptedException
	{
		WebElement elem = getWebElement(addContactElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddContact", "clickAddContact failed. Unable to locate object: " + addContactElem.toString());

			Assert.fail("Unable to locate object: " + addContactElem.toString());
        }
		elem.click();
		
		Reporter.log("clickAddContact");
          	
        Thread.sleep(5000);
		ExtentReportManager.passStep(m_Driver, "clickAddContact");

	}
	
	

	public void clickUpdateContact() throws InterruptedException
	{
        
		WebElement elem = getWebElement(updateContactElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUpdateContact", "clickUpdateContact failed. Unable to locate object: " + updateContactElem.toString());


			Assert.fail("Unable to locate object: " + updateContactElem.toString());
        }
		elem.click();
		
		Reporter.log("clickUpdateContact");
          	
        Thread.sleep(5000);
		ExtentReportManager.passStep(m_Driver, "clickUpdateContact");

	}
	
	
	
	
	public void enterPayeNumber(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(payeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPayeNumber", "enterPayeNumber failed. Unable to locate object: " + payeElem.toString());


			Assert.fail("Unable to locate object: " + payeElem.toString());
        }
		elem.sendKeys(Data);
		
		Reporter.log("enterPayeNumber");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterPayeNumber");

	}
	

	public void enterRegistrationDate(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtPayeRegDate']"));

		elem.sendKeys(Data);
		
		Reporter.log("enterRegistrationDate");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterRegistrationDate");

	}
	
	
	public void enterHolidayPayRate(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(holidayPayRateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterHolidayPayRate", "enterHolidayPayRate failed. Unable to locate object: " + holidayPayRateElem.toString());


			Assert.fail("Unable to locate object: " + holidayPayRateElem.toString());
        }
		elem.sendKeys(Data);
		
          	
        Thread.sleep(1000);
		Reporter.log("enterHolidayPayRate");

	}
	
	public void enterMaxCarryOver(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(maxCarryOverElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterMaxCarryOver", "enterMaxCarryOver failed. Unable to locate object: " + maxCarryOverElem.toString());


			Assert.fail("Unable to locate object: " + maxCarryOverElem.toString());
        }
		elem.sendKeys(Data);
		
		Reporter.log("enterMaxCarryOver");
          	
        Thread.sleep(1000);

	}
	
	
	public void enterWeeklyWorkingHrs(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(weeklyWorkingHrsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterWeeklyWorkingHrs", "enterWeeklyWorkingHrs failed. Unable to locate object: " + weeklyWorkingHrsElem.toString());


			Assert.fail("Unable to locate object: " + weeklyWorkingHrsElem.toString());
        }
		elem.sendKeys(Data);
		
		Reporter.log("enterWeeklyWorkingHrs");
          	
        Thread.sleep(1000);

	}
	
	
	
	
	public void enterFirstName(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(firstNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFirstName", "enterFirstName failed. Unable to locate object: " + firstNameElem.toString());


			Assert.fail("Unable to locate object: " + firstNameElem.toString());
        }
		elem.sendKeys(Data);
		
		Reporter.log("enterFirstName");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterFirstName");

	}
	
	public void enterEmail(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(contactEmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterEmail", "enterEmail failed. Unable to locate object: " + contactEmailElem.toString());


			Assert.fail("Unable to locate object: " + contactEmailElem.toString());
        }
		elem.sendKeys(Data);
		
		Reporter.log("enterEmail");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterEmail");

	}
	
	
	public void enterRefrenceNumber(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(payeRefrenceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRefrenceNumber", "enterRefrenceNumber failed. Unable to locate object: " + payeRefrenceElem.toString());


			Assert.fail("Unable to locate object: " + payeRefrenceElem.toString());
        }
		elem.sendKeys(Data);
		
		Reporter.log("enterRefrenceNumber");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterRefrenceNumber");

	}
	
	
	public void accountOfficeReffrence(String Data) throws InterruptedException
	{
        
		WebElement elem = getWebElement(accountOfficeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "accountOfficeReffrence", "accountOfficeReffrence failed. Unable to locate object: " + accountOfficeElem.toString());


			Assert.fail("Unable to locate object: " + accountOfficeElem.toString());
        }
		elem.sendKeys(Data);
		
		Reporter.log("accountOfficeReffrence");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "accountOfficeReffrence");

	}
	
	public void clickYesPension() throws InterruptedException
	{
        
		WebElement elem = getWebElement(pensionYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickYesPension", "clickYesPension failed. Unable to locate object: " + pensionYesElem.toString());


			Assert.fail("Unable to locate object: " + pensionYesElem.toString());
        }
	    Thread.sleep(2000);
		elem.click();
		
		Reporter.log("clickYesPension");
          	
        Thread.sleep(5000);
		ExtentReportManager.passStep(m_Driver, "Click_gotoEditCompany");

	}
	
	
	public void ClickInformation() throws InterruptedException
	{
        
		WebElement elem = getWebElement(informationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickInformation", "ClickInformation failed. Unable to locate object: " + informationElem.toString());


			Assert.fail("Unable to locate object: " + gotoEditCompanyElem.toString());
        }
		elem.click();
		
		Reporter.log("ClickInformation");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "ClickInformation");

	}
	
	
	public void GoToFrame() throws Exception
	{
		
		Thread.sleep(2000);
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EditPayrollFrame']")));

		Thread.sleep(3000);
		
	}

	public void ClickContactDetails() throws InterruptedException
	{
        
		WebElement elem = getWebElement(contactElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickContactDetails", "ClickInformation failed. Unable to locate object: " + contactElem.toString());


			Assert.fail("Unable to locate object: " + contactElem.toString());
        }
		elem.click();
		
		Reporter.log("ClickContactDetails");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "ClickContactDetails");

	}
	
	
	public void ClickPensionDetails() throws InterruptedException
	{
        
		WebElement elem = getWebElement(pensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickInformation", "ClickInformation failed. Unable to locate object: " + pensionElem.toString());


			Assert.fail("Unable to locate object: " + pensionElem.toString());
        }
		elem.click();
		
		Reporter.log("ClickPensionDetails");
          	
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "ClickPensionDetails");

	}
	
	
	public void clickNoEmployementAllownaces() throws InterruptedException
	{
        
		WebElement elem = getWebElement(noEmployementAllowanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNoEmployementAllownacesElem", "clickNoEmployementAllownacesElem failed. Unable to locate object: " + noEmployementAllowanceElem.toString());


			Assert.fail("Unable to locate object: " + noEmployementAllowanceElem.toString());
        }

		elem.click();
		
		Thread.sleep(3000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EmploymentAllowanceFrame']")));

		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkDisableEmploymentAllowance']")).click();
		
		m_Driver.switchTo().defaultContent();
		Reporter.log("clickNoEmployementAllownacesElem");
          	
        Thread.sleep(8000);
		ExtentReportManager.passStep(m_Driver, "clickNoEmployementAllownacesElem");

	}
	
	
	

	public void clickYesEmployementAllownaces() throws InterruptedException
	{
        
		WebElement elem = getWebElement(yesEmployementAllowanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickYesEmployementAllownacesElem", "clickNoEmployementAllownacesElem failed. Unable to locate object: " + yesEmployementAllowanceElem.toString());


			Assert.fail("Unable to locate object: " + yesEmployementAllowanceElem.toString());
        }

		elem.click();
		
          	
        Thread.sleep(9000);
		ExtentReportManager.passStep(m_Driver, "clickYesEmployementAllownacesElem");
		Reporter.log("clickYesEmployementAllownaces");

	}
	
	
	
	
	public void clickEnabledEmployementAllownaces() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EmploymentAllowanceEnableFrame']")));

		WebElement elem = getWebElement(enableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEnabledEmployementAllownaces", "clickEnabledEmployementAllownaces failed. Unable to locate object: " + enableElem.toString());


			Assert.fail("Unable to locate object: " + enableElem.toString());
        }

		elem.click();
		
          	
		m_Driver.switchTo().defaultContent();
        Thread.sleep(7000);
		ExtentReportManager.passStep(m_Driver, "clickEnabledEmployementAllownaces");

		Reporter.log("clickEnabledEmployementAllownaces");
	}
	
	public void clickRequestPayroll() throws InterruptedException
	{
        
		WebElement elem = getWebElement(requestPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRequestPayroll", "clickRequestPayroll failed. Unable to locate object: " + requestPayrollElem.toString());


			Assert.fail("Unable to locate object: " + requestPayrollElem.toString());
        }

		elem.click();
		
		Reporter.log("clickRequestPayroll");
          	
        Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "clickRequestPayroll");

	}
	
	
	public void clickDisplayLeaveOnPayslip() throws InterruptedException
	{
        
		WebElement elem = getWebElement(displayOnLeave);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDisplayLeaveOnPayslip", "clickDisplayLeaveOnPayslip failed. Unable to locate object: " + displayOnLeave.toString());


			Assert.fail("Unable to locate object: " + displayOnLeave.toString());
        }

		elem.click();
		
		Reporter.log("clickDisplayLeaveOnPayslip");
          	
        Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "clickDisplayLeaveOnPayslip");

	}
	
	
	
	
	public void clickDisable() throws InterruptedException
	{
        
		WebElement elem = getWebElement(disableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRequestPayroll", "clickRequestPayroll failed. Unable to locate object: " + disableElem.toString());


			Assert.fail("Unable to locate object: " + disableElem.toString());
        }

		elem.click();
		
		Reporter.log("clickDisable");
          	
        Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "clickDisable");

	}
	
	
	public void clickRegisterdCis() throws InterruptedException
	{
        
		WebElement elem = getWebElement(registerdCisElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRegisterdCis", "clickRegisterdCis failed. Unable to locate object: " + registerdCisElem.toString());


			Assert.fail("Unable to locate object: " + registerdCisElem.toString());
        }

		elem.click();
		
		Thread.sleep(3000);
		Reporter.log("clickRegisterdCis");
          	
        Thread.sleep(3000);
		ExtentReportManager.passStep(m_Driver, "clickRegisterdCis");

	}
	
	/**
 	 * Click clickPayrollDetails
	 * @throws Exception 
	 * @throws  
     * @name Click clickPayrollDetails
     */
	public void Click_clickPayrollDetails() throws Exception  
	{
        
		
		WebElement elem = getWebElement(clickPayrollDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollDetails", "Click_clickPayrollDetails failed. Unable to locate object: " + clickPayrollDetailsElem.toString());


			Assert.fail("Unable to locate object: " + clickPayrollDetailsElem.toString());
        }

		//elem.click();
		

		jsExec.executeScript("arguments[0].click();", elem);
		
		 Thread.sleep(15000);
          	
			Reporter.log("Click_clickPayrollDetails");

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollDetails");

	}
	
	
	public void clickGeneralTerms() throws Exception  
	{
        
		WebElement elem = getWebElement(generalTermasElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickGeneralTerms", "clickGeneralTerms failed. Unable to locate object: " + generalTermasElem.toString());


			Assert.fail("Unable to locate object: " + generalTermasElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
		 Thread.sleep(5000);
          	
			Reporter.log("clickGeneralTerms");

		ExtentReportManager.passStep(m_Driver, "clickGeneralTerms");

	}
	
	
	
	public void ClickOpeningBalance() throws Exception  
	{
        
		WebElement elem = getWebElement(OpeningBalanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickOpeningBalance", "Click_clickPayrollDetails failed. Unable to locate object: " + OpeningBalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickOpeningBalance", "Click_clickPayrollDetails failed. Unable to locate object: " + OpeningBalanceElem.toString());

			Assert.fail("Unable to locate object: " + OpeningBalanceElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
		 Thread.sleep(5000);
          	
			Reporter.log("ClickOpeningBalance");

		ExtentReportManager.passStep(m_Driver, "ClickOpeningBalance");

	}
	
	
	public void Click_clickDepartments() throws Exception  
	{
        
		Thread.sleep(6000);
		WebElement elem = getWebElement(department);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickDepartments", "Click_clickDepartments failed. Unable to locate object: " + department.toString());


			Assert.fail("Unable to locate object: " + department.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
		 Thread.sleep(5000);
          	
	      Reporter.log("Click_clickDepartments");


	}
	
	
	public void ClickP11D() throws Exception  
	{
        
		Thread.sleep(4000);
		WebElement elem = getWebElement(P11DElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickP11D", "ClickP11D failed. Unable to locate object: " + P11DElem.toString());


			Assert.fail("Unable to locate object: " + P11DElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
		 Thread.sleep(5000);
          	
	      Reporter.log("ClickP11D");


	}
	
	   
		/**
	 	 * Click clickPayrollSettings
		 * @throws Exception 
	     * @name Click clickPayrollSettings
	     */
		public void Click_clickPayrollSettings() throws Exception
		{
	        
			WebElement elem = getWebElement(clickPayrollSettingsElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

				Assert.fail("Unable to locate object: " + clickPayrollSettingsElem.toString());
	        }

			elem.click();
			Reporter.log("Click_clickPayrollSettings");

	          	
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		}

		
		
		public void updateRequestPayInfo() throws Exception
		{
	        
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

			WebElement elem = getWebElement(updateRequestPayInfoElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "updateRequestPayInfo", "updateRequestPayInfo failed. Unable to locate object: " + updateRequestPayInfoElem.toString());


				Assert.fail("Unable to locate object: " + updateRequestPayInfoElem.toString());
	        }

			elem.click();
			Reporter.log("updateRequestPayInfo");

	          	m_Driver.switchTo().defaultContent();
			Thread.sleep(3000);
			ExtentReportManager.passStep(m_Driver, "updateRequestPayInfo");

		}

		
		public void clickCommanContractualTerms() throws Exception
		{
	        
			WebElement elem = getWebElement(commanContractualTermasElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCommanContractualTerms", "clickCommanContractualTerms failed. Unable to locate object: " + commanContractualTermasElem.toString());


				Assert.fail("Unable to locate object: " + commanContractualTermasElem.toString());
	        }

			elem.click();
			Reporter.log("clickCommanContractualTerms");

	          	
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "clickCommanContractualTerms");

		}

		
		 public void enterLeaveStartDate(String data) throws Exception
		    {

				WebElement elem = getWebElement(leaveStartdateElem);

				if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterJoiningDate", "enterJoiningDate failed. Unable to locate object: " + leaveStartdateElem.toString());

					Assert.fail("Unable to locate object: " + leaveStartdateElem.toString());
		        }

				elem.sendKeys(data);
				
				m_Driver.findElement(By.xpath("//*[@id='CommonContractualTerms']/div/div/div[1]/label")).click();
				Thread.sleep(2000);

				ExtentReportManager.passStep(m_Driver, "enterLeaveStartDate");

				Reporter.log("enterLeaveStartDate");
		    }
	
		
		public void clickBankDetails() throws Exception
		{
	        
			WebElement elem = getWebElement(BankDetailsElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickBankDetails", "clickBankDetails failed. Unable to locate object: " + BankDetailsElem.toString());


				Assert.fail("Unable to locate object: " + BankDetailsElem.toString());
	        }

			elem.click();
			Reporter.log("clickBankDetails");

	          	
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "clickBankDetails");

		}
		
		
		
		
		
		
		public void Click_AllowancesSchemes() throws Exception
		{
	        
			WebElement elem = getWebElement(allowancesSchemeElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AllowancesSchemes", "Click_AllowancesSchemes failed. Unable to locate object: " + allowancesSchemeElem.toString());


				Assert.fail("Unable to locate object: " + allowancesSchemeElem.toString());
	        }

			elem.click();
			Reporter.log("Click_AllowancesSchemes");

	          	
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "Click_AllowancesSchemes");

		}
		

		public void enableQuarterlyPayeScheme() throws Exception
		{
	        
			WebElement elem = getWebElement(quarterlyElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enableQuarterlyPayeScheme", "enableQuarterlyPayeScheme failed. Unable to locate object: " + quarterlyElem.toString());


				Assert.fail("Unable to locate object: " + quarterlyElem.toString());
	        }

			elem.click();
			Reporter.log("enableQuarterlyPayeScheme");

	          	
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enableQuarterlyPayeScheme");

		}
		
		/**
	 	 * Click ClickSave
		 * @throws Exception 
	     * @name Click ClickSave
	     */
		public void Click_ClickSave() throws Exception
		{
			
			Thread.sleep(11000);

			WebElement elem = getWebElement(ClickSaveElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

				Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
	        }
			elem.click();
			
			Thread.sleep(11000);
			
			Reporter.log("Click_ClickSave");


			ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		}

		public void Click_ClickSaveAgent() throws Exception
		{
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EditPayrollFrame']")));

			WebElement elem = getWebElement(saveBtnAgentElem);
			

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSaveAgent", "Click_ClickSaveAgent failed. Unable to locate object: " + saveBtnAgentElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSaveAgent", "Click_ClickSaveAgent failed. Unable to locate object: " + saveBtnAgentElem.toString());

				Assert.fail("Unable to locate object: " + saveBtnAgentElem.toString());
	        }
			elem.click();
			
			Thread.sleep(11000);
			
			m_Driver.switchTo().defaultContent();
			Reporter.log("Click_ClickSaveAgent");


			ExtentReportManager.passStep(m_Driver, "Click_ClickSaveAgent");

		}
		
		public void clickCloseBtn() throws Exception {
			
			
			m_Driver.findElement(By.xpath("//*[@id='EditPayrollPopUpClose']/span")).click();
			Thread.sleep(1000);
			
		}
		
	
		public void selectTag(String value) throws Exception
		{
	        
			WebElement elem = getWebElement(tagsElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTag", "selectTag failed. Unable to locate object: " + tagsElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "selectTag", "selectTag failed. Unable to locate object: " + tagsElem.toString());

				Assert.fail("Unable to locate object: " + tagsElem.toString());
	        }
			 Select sel= new Select(elem);
			sel.selectByVisibleText(value);
			Thread.sleep(1000);
			Reporter.log("selectTag");


			ExtentReportManager.passStep(m_Driver, "selectTag");

		}
		
		public void enterPassword(String password) {
		    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(10));

		    WebElement newPassword = wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtNewPassword']")));

		    WebElement confirmPassword = wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtConfirmPassword']")));

		    newPassword.clear();
		    newPassword.sendKeys(password);

		    confirmPassword.clear();
		    confirmPassword.sendKeys(password);
		}
		
		
		public void selectCompanyActiveInactiveStatus(String value) throws Exception
		{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EditPayrollFrame']")));

			WebElement elem = getWebElement(companyStatusElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectCompanyActiveInactiveStatus", "selectCompanyActiveInactiveStatus failed. Unable to locate object: " + companyStatusElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "selectCompanyActiveInactiveStatus", "selectCompanyActiveInactiveStatus failed. Unable to locate object: " + companyStatusElem.toString());

				Assert.fail("Unable to locate object: " + companyStatusElem.toString());
	        }
			 Select sel= new Select(elem);
			sel.selectByVisibleText(value);
			Thread.sleep(1000);
			Reporter.log("selectTag");

			m_Driver.switchTo().defaultContent();

			ExtentReportManager.passStep(m_Driver, "selectCompanyActiveInactiveStatus");

		}
		
		

		
		public void enterInputTxt(String value)
		{
	        
			WebElement elem = getWebElement(inputTextElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterInputTxt", "enterInputTxt failed. Unable to locate object: " + inputTextElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "enterInputTxt", "enterInputTxt failed. Unable to locate object: " + inputTextElem.toString());

				Assert.fail("Unable to locate object: " + inputTextElem.toString());
	        }

			elem.sendKeys(value);
			Reporter.log("enterInputTxt");


			ExtentReportManager.passStep(m_Driver, "enterInputTxt");

		}
		
		
		
		public void clickCreateBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(createElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCreateBtn", "clickCreateBtn failed. Unable to locate object: " + createElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "clickCreateBtn", "clickCreateBtn failed. Unable to locate object: " + createElem.toString());

				Assert.fail("Unable to locate object: " + createElem.toString());
	        }

			elem.click();
			Thread.sleep(3000);
			Reporter.log("clickCreateBtn");

			ExtentReportManager.passStep(m_Driver, "clickCreateBtn");

		}
		
		
		public void clickSendLink() throws Exception
		{
	        
			WebElement elem = getWebElement(By.xpath("//*[@id=\"dvPasswordProtectionPopup2\"]/div/div/div[2]/div[2]/div[1]/div[6]/div/a[2]"));


			elem.click();
			Thread.sleep(3000);

			WebElement elem1 = getWebElement(By.xpath("//*[@id='CDPControls']/div/div[4]/div/a[2]"));


			elem1.click();
			
			Thread.sleep(9000);
			Reporter.log("clickSendLink");


		}
		public void clickCreateBtnEmployee() throws Exception
		{
	        
			WebElement elem = getWebElement(createEmployeeElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCreateBtnEmployee", "clickCreateBtnEmployee failed. Unable to locate object: " + createEmployeeElem.toString());


				Assert.fail("Unable to locate object: " + createEmployeeElem.toString());
	        }

			elem.click();
			Thread.sleep(3000);
			Reporter.log("clickCreateBtnEmployee");

			ExtentReportManager.passStep(m_Driver, "clickCreateBtnEmployee");

		}
		
		public void PasswordNotEnabled() throws Exception
		{
			WebElement elem = getWebElement(employerNO);

			boolean enabled = elem.isSelected();
			
            assertTrue(enabled,"Element is disable");
            Thread.sleep(3000);
			Reporter.log("Password Protection Is Not Enabled");
      
          
			
		}
		
		public void clickPasswordNoEmployer() throws Exception
		{
			WebElement elem = getWebElement(employerNO);

			
			elem.click();
			
			Thread.sleep(2000);
			Reporter.log("clickPasswordNoEmployer");

          
			
		}
		
		
		public void clickPasswordNoEmployee() throws Exception
		{
			WebElement elem = getWebElement(employeeNo);

			
			elem.click();
			
			Thread.sleep(2000);
			Reporter.log("clickPasswordNoEmployee");

          
			
		}
		
		
		
		  
		/**
	 	 * Click ClickEnableAutorun
	     * @name Click ClickEnableAutorun
	     */
		public void Click_ClickEnableAutorun()
		{
	        
			WebElement elem = getWebElement(ClickEnableAutorunElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickEnableAutorun", "Click_ClickEnableAutorun failed. Unable to locate object: " + ClickEnableAutorunElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickEnableAutorun", "Click_ClickEnableAutorun failed. Unable to locate object: " + ClickEnableAutorunElem.toString());

				Assert.fail("Unable to locate object: " + ClickEnableAutorunElem.toString());
	        }

			elem.click();
			Reporter.log("Click_ClickEnableAutorun");
	

			ExtentReportManager.passStep(m_Driver, "Click_ClickEnableAutorun");

		}
		
		
		public void clickLinkedwithAccountBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(linkedwithAccount);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLinkedwithAccountBtn", "clickLinkedwithAccountBtn failed. Unable to locate object: " + linkedwithAccount.toString());


				Assert.fail("Unable to locate object: " + linkedwithAccount.toString());
	        }

			elem.click();
			
			Thread.sleep(3000);
			Reporter.log("clickLinkedwithAccountBtn");
	

			ExtentReportManager.passStep(m_Driver, "clickLinkedwithAccountBtn");

		}

	     
		/**
	 	 * Click ClickContinue
		 * @throws InterruptedException 
	     * @name Click ClickContinue
	     */
		public void Click_ClickContinue() throws InterruptedException
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(ClickContinueElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickContinue", "Click_ClickContinue failed. Unable to locate object: " + ClickContinueElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickContinue", "Click_ClickContinue failed. Unable to locate object: " + ClickContinueElem.toString());

				Assert.fail("Unable to locate object: " + ClickContinueElem.toString());
	        }

			//elem.click();
		//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
			System.out.println("I'm switch");
			Thread.sleep(2000);
			m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Continue')]")).get(0).click();
	        
			m_Driver.switchTo().defaultContent();
	  	
			Reporter.log("Click_ClickContinue");

			ExtentReportManager.passStep(m_Driver, "Click_ClickContinue");

		}

		
		
		public void clickContinue3() throws InterruptedException
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_AutorunPayrollFrame']")));

			WebElement elem = getWebElement(continueBtnelem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickContinue3", "clickContinue3 failed. Unable to locate object: " + continueBtnelem.toString());


				Assert.fail("Unable to locate object: " + continueBtnelem.toString());
	        }

			elem.click();
		
		
			m_Driver.switchTo().defaultContent();
			Thread.sleep(2000);

	  	
			Reporter.log("Click_ClickContinue");

			ExtentReportManager.passStep(m_Driver, "Click_ClickContinue");

		}

	    
		/**
	 	 * Select SelectEmailMode
	     * @name Select SelectEmailMode
	     */
	    public void Select_SelectEmailMode(String SelectEmailMode)
	 	{
	 	    
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

	 		WebElement elem = getWebElement(SelectEmailModeElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectEmailMode", "Select_SelectEmailMode failed. Unable to locate object: " + SelectEmailModeElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectEmailMode", "Select_SelectEmailMode failed. Unable to locate object: " + SelectEmailModeElem.toString());

	 			//Assert.fail("Unable to locate object: " + SelectEmailModeElem.toString());
	         }

	 		Select dropdown = new Select(elem);

	 		dropdown.selectByVisibleText(SelectEmailMode);
	 		
			m_Driver.switchTo().defaultContent();

			Reporter.log("Select_SelectEmailMode");

	 		ExtentReportManager.passStep(m_Driver, "Select_SelectEmailMode " + SelectEmailMode);

	 	}

	    
	    public void saveLinkedWithBtn() throws Exception
	 	{
	 	    
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

	 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']"));

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "saveLinkedWithBtn", "saveLinkedWithBtn failed. Unable to locate object: " + SelectEmailModeElem.toString());


	 			//Assert.fail("Unable to locate object: " + SelectEmailModeElem.toString());
	         }

	 		elem.click();
	 		Thread.sleep(6000);
			m_Driver.switchTo().defaultContent();

			Reporter.log("saveLinkedWithBtn");


	 	}

	     
		/**
	 	 * Click SelectYes
	     * @name Click SelectYes
	     */
		public void Click_SelectYes()
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(SelectYesElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectYes", "Click_SelectYes failed. Unable to locate object: " + SelectYesElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectYes", "Click_SelectYes failed. Unable to locate object: " + SelectYesElem.toString());

				Assert.fail("Unable to locate object: " + SelectYesElem.toString());
	        }

			elem.click();
	        
			m_Driver.switchTo().defaultContent();
	  	
			Reporter.log("Click_SelectYes");


			ExtentReportManager.passStep(m_Driver, "Click_SelectYes");

		}
		
		
		/**
	 	 * Click Continue2
	     * @name Click Continue2
	     */
		public void Click_Continue2()
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(Continue2Elem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Continue2", "Click_Continue2 failed. Unable to locate object: " + Continue2Elem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Continue2", "Click_Continue2 failed. Unable to locate object: " + Continue2Elem.toString());

				Assert.fail("Unable to locate object: " + Continue2Elem.toString());
	        }

			elem.click();
	        
			m_Driver.switchTo().defaultContent();
	  	
			Reporter.log("Click_Continue2");

			ExtentReportManager.passStep(m_Driver, "Click_Continue2");
			
		}
		
		
		public void clickEditEmailSetting()
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_AutorunPayrollFrame']")));

			WebElement elem = getWebElement(editEmailSettingElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditEmailSetting", "clickEditEmailSetting failed. Unable to locate object: " + editEmailSettingElem.toString());


				Assert.fail("Unable to locate object: " + editEmailSettingElem.toString());
	        }

			elem.click();
	        
			m_Driver.switchTo().defaultContent();
	  	
			Reporter.log("clickEditEmailSetting");

			ExtentReportManager.passStep(m_Driver, "clickEditEmailSetting");
			
		}
		
		
		/**
	 	 * Click Enable2
		 * @throws InterruptedException 
	     * @name Click Enable2
	     */
		public void Click_Enable2() throws InterruptedException
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(Enable2Elem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable2", "Click_Enable2 failed. Unable to locate object: " + Enable2Elem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable2", "Click_Enable2 failed. Unable to locate object: " + Enable2Elem.toString());

				Assert.fail("Unable to locate object: " + Enable2Elem.toString());
	        }

			elem.click();
	        
			Thread.sleep(5000);
			
			//m_Driver.switchTo().defaultContent();
	  	
			Reporter.log("Click_Enable2");

			ExtentReportManager.passStep(m_Driver, "Click_Enable2");

		}
		
		
		public void Click_Enable3() throws InterruptedException
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(Enable2Elem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enable2", "Click_Enable2 failed. Unable to locate object: " + Enable2Elem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enable2", "Click_Enable2 failed. Unable to locate object: " + Enable2Elem.toString());

				Assert.fail("Unable to locate object: " + Enable2Elem.toString());
	        }

			elem.click();
	        
			Thread.sleep(5000);
			
			m_Driver.switchTo().defaultContent();
	  	
			Reporter.log("Click_Enable2");

			ExtentReportManager.passStep(m_Driver, "Click_Enable2");

		}
		
	
		  
		/**
	 	 * Click ClickEmailSettings
		 * @throws InterruptedException 
	     * @name Click ClickEmailSettings
	     */
		public void Click_ClickEmailSettings() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(ClickEmailSettingsElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickEmailSettings", "Click_ClickEmailSettings failed. Unable to locate object: " + ClickEmailSettingsElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickEmailSettings", "Click_ClickEmailSettings failed. Unable to locate object: " + ClickEmailSettingsElem.toString());

				Assert.fail("Unable to locate object: " + ClickEmailSettingsElem.toString());
	        }

			System.out.println("Hi1");
			elem.click();
			System.out.println("Hi1");
//			m_Driver.switchTo().alert().accept();
			Thread.sleep(5000);
	          	
			Reporter.log("Click_ClickEmailSettings");

			ExtentReportManager.passStep(m_Driver, "Click_ClickEmailSettings");

		}

	     
		/**
	 	 * Click ClickDisable
		 * @throws InterruptedException 
	     * @name Click ClickDisable
	     */
		public void Click_ClickDisable() throws InterruptedException
		{
	        
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_AutorunPayrollFrame']")));

			WebElement elem = getWebElement(ClickDisableElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickDisable", "Click_ClickDisable failed. Unable to locate object: " + ClickDisableElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickDisable", "Click_ClickDisable failed. Unable to locate object: " + ClickDisableElem.toString());

				Assert.fail("Unable to locate object: " + ClickDisableElem.toString());
	        }

			System.out.println("HI1");
			elem=m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_BtnDisable']"));
			System.out.println("HI2");
			elem.click();
			System.out.println("HI3");
		
			
			Thread.sleep(3000);
	        
			m_Driver.switchTo().defaultContent();
			
			Reporter.log("Click_ClickDisable");


			ExtentReportManager.passStep(m_Driver, "Click_ClickDisable");

		}


//		public void Click_EnableToDisable() throws InterruptedException {
//			// TODO Auto-generated method stub
//			
//			Thread.sleep(1000);
//			
//		
//		}
	
		
		 public void selectFileTypeViaEmail(String FileType) throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(SelectPaswdProtectionFormatElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectFileTypeViaEmail", "selectFileTypeViaEmail failed. Unable to locate object: " + SelectPaswdProtectionFormatElem.toString());


		 			Assert.fail("Unable to locate object: " + SelectPaswdProtectionFormatElem.toString());
		         }

		 		Thread.sleep(3000);
		 		
		 		Select dropdown = new Select(elem);

		 		dropdown.selectByVisibleText(FileType);
		 		
				Reporter.log("selectFileTypeViaEmail");

		 		
		 		
		 		ExtentReportManager.passStep(m_Driver, "Select_SelectPaswdProtectionFormat " + SelectPaswdProtectionFormatElem);

		 	}
		 
		 
		 public void selectMonthlyPayeDate(String FileType) throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(monthlyPayeElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectMonthlyPayeDate", "selectMonthlyPayeDate failed. Unable to locate object: " + monthlyPayeElem.toString());


		 			Assert.fail("Unable to locate object: " + monthlyPayeElem.toString());
		         }

		 		
		 		Select dropdown = new Select(elem);

		 		dropdown.selectByVisibleText(FileType);
		 		
		 		Thread.sleep(6000);

				Reporter.log("selectMonthlyPayeDate");

		 		
		 		

		 	}
		 
		 
		 

		 public void clickEnabledPassProtectionEmployer() throws Exception
			{
		        

				WebElement elem = getWebElement(enabledPassProtectionElem);

				if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enabledPassProtection", "enabledPassProtection failed. Unable to locate object: " + enabledPassProtectionElem.toString());

		    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "enabledPassProtection", "enabledPassProtection failed. Unable to locate object: " + enabledPassProtectionElem.toString());

					Assert.fail("Unable to locate object: " + enabledPassProtectionElem.toString());
		        }

				elem.click();
		        Thread.sleep(3000);
		  	
				Reporter.log("enabledPassProtection");

				ExtentReportManager.passStep(m_Driver, "enabledPassProtection");
				
			}
		 
		 public void clickEnabledPassProtectionEmployee() throws Exception
			{
		        

				WebElement elem = getWebElement(EmployeeenabledPassProtectionElem);

				if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEnabledPassProtectionEmployee", "clickEnabledPassProtectionEmployee failed. Unable to locate object: " + EmployeeenabledPassProtectionElem.toString());


					Assert.fail("Unable to locate object: " + EmployeeenabledPassProtectionElem.toString());
		        }

				elem.click();
		        Thread.sleep(1000);
		  	
				Reporter.log("clickEnabledPassProtectionEmployee");

				ExtentReportManager.passStep(m_Driver, "clickEnabledPassProtectionEmployee");
				
			}
		 
		 public void enterInputTextPassword(String value) throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(inputTextElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterInputText", "enterInputText failed. Unable to locate object: " + inputTextElem.toString());


		 			Assert.fail("Unable to locate object: " + inputTextElem.toString());
		         }

		 		
		 		elem.clear();
		 		elem.sendKeys(value);
		 		
		 		Thread.sleep(1000);
		 		
		 		WebElement elem1 = getWebElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtConfirmPassword\"]"));

		 		elem1.clear();
		 		elem1.sendKeys(value);
		 		
		 		Thread.sleep(1000);
		 		
				Reporter.log("enterInputText");

		 		
		 		
		 		ExtentReportManager.passStep(m_Driver, "enterInputText " );

		 	}
		 
		 public void enterInputTextPasswordEmployee(String value) throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(inputTextEmployeeElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterInputTextPasswordEmployee", "enterInputTextPasswordEmployee failed. Unable to locate object: " + inputTextEmployeeElem.toString());


		 			Assert.fail("Unable to locate object: " + inputTextEmployeeElem.toString());
		         }

		 		
		 		elem.clear();
		 		elem.sendKeys(value);
		 		Thread.sleep(1000);
				Reporter.log("enterInputTextPasswordEmployee");

		 		
		 		
		 		ExtentReportManager.passStep(m_Driver, "enterInputTextPasswordEmployee " );

		 	}
		 
		 
		 
		 
		 public void clearInputText() throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(inputTextElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clearInputText", "clearInputText failed. Unable to locate object: " + inputTextElem.toString());


		 			Assert.fail("Unable to locate object: " + inputTextElem.toString());
		         }

		 		

		 		elem.clear();
		 	
		 		Thread.sleep(2000);
				Reporter.log("clearInputText");

		 		
		 		
		 		ExtentReportManager.passStep(m_Driver, "clearInputText " );

		 	}
		 
		 
		 
		 
		 public void clearInputTextEmployee() throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(inputTextEmployeeElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clearInputTextEmployee", "clearInputTextEmployee failed. Unable to locate object: " + inputTextEmployeeElem.toString());


		 			Assert.fail("Unable to locate object: " + inputTextEmployeeElem.toString());
		         }

		 		elem.clear();
		 	
		 		Thread.sleep(2000);
				Reporter.log("clearInputTextEmployee");

		 		
		 		
		 		ExtentReportManager.passStep(m_Driver, "clearInputTextEmployee " );

		 	}
		 
		 public void clickIcn() throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(iconElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickIcn", "clickCreateBtn failed. Unable to locate object: " + iconElem.toString());


		 			Assert.fail("Unable to locate object: " + iconElem.toString());
		         }
		 	 Thread.sleep(2000);
		 	    elem.click();
		 	   Thread.sleep(2000);
				Reporter.log("clickIcn");

		 		
		 		
		 		ExtentReportManager.passStep(m_Driver, "clickIcn " );

		 	}
		 
		 
		
		 
		 public void clickIcnEmployee() throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(iconEmployeeElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickIcnEmployee", "clickIcnEmployee failed. Unable to locate object: " + iconEmployeeElem.toString());


		 			Assert.fail("Unable to locate object: " + iconEmployeeElem.toString());
		         }

		 	    elem.click();
		 	   Thread.sleep(2000);
				Reporter.log("clickIcnEmployee");

		 		ExtentReportManager.passStep(m_Driver, "clickIcnEmployee " );

		 	}
		 
		
		 
		 public void clickChangePassword() throws InterruptedException
		 	{
		 	    
		 		WebElement elem = getWebElement(changepasswordElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickChangePassword", "clickChangePassword failed. Unable to locate object: " + changepasswordElem.toString());


		 			Assert.fail("Unable to locate object: " + changepasswordElem.toString());
		         }

		 	    elem.click();
		 	   Thread.sleep(2000);
				Reporter.log("clickChangePassword");

		 		
		 		
		 		ExtentReportManager.passStep(m_Driver, "clickChangePassword " );

		 	}
		 
		 
		 
		 public void clickChangePasswordEmployee() throws InterruptedException
		 	{
		 	    
		 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_EmployerShow1']/div/a/strong"));


		 	    elem.click();
		 	   Thread.sleep(4000);
				Reporter.log("clickChangePasswordEmployee");

		 		
		 		

		 	}
		 
		 public void clickChangePasswordEmployer() throws InterruptedException
		 	{
		 	    
		 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_EmployerShow']/div/a/strong"));


		 	    elem.click();
		 	   Thread.sleep(4000);
				Reporter.log("clickChangePasswordEmployer");

		 		
		 		

		 	}
		 
			public void selectTagEmployee(String value) throws Exception
			{
		        
				WebElement elem = getWebElement(employeeTagElem);

				if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTagEmployee", "selectTagEmployee failed. Unable to locate object: " + employeeTagElem.toString());


					Assert.fail("Unable to locate object: " + employeeTagElem.toString());
		        }
                Select sel= new Select(elem);
				sel.selectByVisibleText(value);
				Thread.sleep(1000);
				Reporter.log("selectTagEmployee");


				ExtentReportManager.passStep(m_Driver, "selectTagEmployee");

			}
		 
		
			  
		       public void inputTextUTR(String Utr) throws InterruptedException
		       {

		    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtUtrNo']"));
		    	   Thread.sleep(3000);
		    	   elem.sendKeys(Utr);
			    	m_Driver.switchTo().defaultContent();

		    	   Reporter.log("enterd UTR");
		    	   
		       }
		       
		       public void enterUtrNumber() throws InterruptedException
		       {

		    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtUtrNo']"));
		    	   Thread.sleep(3000);
		    	   
		    		String s = RandomStringUtils.randomNumeric(10); 

//			 		Random random= new Random();
//			 		int randomint = random.nextInt(5);
			 	    elem.sendKeys(s);
		    	  

		    	   Reporter.log("enterUtrNumber= "+s);
		    	   
		       }
		       
		       
				 public void clickDepartment() throws InterruptedException
				 	{
				 	    
				 		WebElement elem = getWebElement(departmentElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDepartment", "clickDepartment failed. Unable to locate object: " + departmentElem.toString());


				 			Assert.fail("Unable to locate object: " + departmentElem.toString());
				         }
					 	   Thread.sleep(3000);

				 	    elem.click();
				 	   Thread.sleep(2000);
						Reporter.log("clickDepartment");

				 		ExtentReportManager.passStep(m_Driver, "clickDepartment " );

				 	}
	
				 
				 
				 public void clickDeletDepartment() throws InterruptedException
				 	{
				 	    
				 		WebElement elem = getWebElement(deletDepartmentElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletDepartment", "clickDeletDepartment failed. Unable to locate object: " + deletDepartmentElem.toString());


				 			Assert.fail("Unable to locate object: " + deletDepartmentElem.toString());
				         }

				 	    elem.click();
				 	   Thread.sleep(2000);
						Reporter.log("clickDeletDepartment");

				 		ExtentReportManager.passStep(m_Driver, "clickDeletDepartment " );

				 	}
				 
				 
			 	 public void clickDeletDepartment1() throws InterruptedException
				 	{
						m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

				 		WebElement elem = getWebElement(deletDepartmentElem1);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletDepartment1", "clickDeletDepartment1 failed. Unable to locate object: " + deletDepartmentElem1.toString());

				 			Assert.fail("Unable to locate object: " + deletDepartmentElem1.toString());
				         }

				 	    elem.click();
				 	    m_Driver.switchTo().defaultContent();
				 	   Thread.sleep(2000);
						Reporter.log("clickDeletDepartment1");

				 		ExtentReportManager.passStep(m_Driver, "clickDeletDepartment1 " );

				 	}
				 
				 
				 
				 public void clickNoOffStaff() throws InterruptedException
				 	{
				 	    
				 		WebElement elem = getWebElement(staffElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNoOffStaff", "clickNoOffStaff failed. Unable to locate object: " + staffElem.toString());


				 			Assert.fail("Unable to locate object: " + staffElem.toString());
				         }

				 	    elem.click();
				 	   Thread.sleep(2000);
						Reporter.log("clickNoOffStaff");

				 		ExtentReportManager.passStep(m_Driver, "clickNoOffStaff " );

				 	}

				 
				 
				 public void clickEditDepartment() throws InterruptedException
				 	{
				 	    
				 		WebElement elem = getWebElement(editElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditDepartment", "clickEditDepartment failed. Unable to locate object: " + editElem.toString());


				 			Assert.fail("Unable to locate object: " + editElem.toString());
				         }

				 	    elem.click();
				 	   Thread.sleep(2000);
						Reporter.log("clickEditDepartment");

				 		ExtentReportManager.passStep(m_Driver, "clickEditDepartment " );

				 	}
				 
				 
				 

				   public void enterDepartmentName() throws InterruptedException
				 	{
						m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

				 		WebElement elem = getWebElement(departmentNameElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDepartmentElem", "enterDepartmentElem failed. Unable to locate object: " + departmentNameElem.toString());


				 			Assert.fail("Unable to locate object: " + departmentNameElem.toString());
				         }
				 		String s = RandomStringUtils.randomAlphabetic(8); 

//				 		Random random= new Random();
//				 		int randomint = random.nextInt(5);
				 	    elem.sendKeys(s);
				 	    m_Driver.switchTo().defaultContent();
				 	   Thread.sleep(2000);
						Reporter.log("enterDepartmentElem");

				 		ExtentReportManager.passStep(m_Driver, "enterDepartmentElem " );

				 	}
	
				   
				   
				   public void enterDepartmentName1(String data) throws InterruptedException
				 	{
						m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

				 		WebElement elem = getWebElement(departmentNameElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDepartmentElem", "enterDepartmentElem failed. Unable to locate object: " + departmentNameElem.toString());


				 			Assert.fail("Unable to locate object: " + departmentNameElem.toString());
				         }
				 	//	String s = RandomStringUtils.randomAlphabetic(8); 

//				 		Random random= new Random();
//				 		int randomint = random.nextInt(5);
				 		elem.clear();
				 	    elem.sendKeys(data);
				 	    m_Driver.switchTo().defaultContent();
				 	   Thread.sleep(2000);
						Reporter.log("enterDepartmentElem");

				 		ExtentReportManager.passStep(m_Driver, "enterDepartmentElem " );

				 	}
	
				   
				   
				   
				   
				   public void clickDepatrmentSaveBtn() throws InterruptedException
				 	{
					m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));
 
				 		WebElement elem = getWebElement(departmentSaveElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDepatrmentSaveBtn", "clickDepatrmentSaveBtn failed. Unable to locate object: " + departmentSaveElem.toString());


				 			Assert.fail("Unable to locate object: " + departmentSaveElem.toString());
				         }

				 	    elem.click();
				 	   m_Driver.switchTo().defaultContent();
				 	   
				 	   Thread.sleep(2000);
				 	
						Reporter.log("clickDepatrmentSaveBtn");

				 		ExtentReportManager.passStep(m_Driver, "clickDepatrmentSaveBtn" );

				 	}
				   
		
				   public void clickUpdateDepatrmentBtn() throws InterruptedException
				 	{
					m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

				 		WebElement elem = getWebElement(updateElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUpdateDepatrmentBtn", "clickUpdateDepatrmentBtn failed. Unable to locate object: " + updateElem.toString());


				 			Assert.fail("Unable to locate object: " + updateElem.toString());
				         }

				 	    elem.click();
				 	   m_Driver.switchTo().defaultContent();
				 	   
				 	   Thread.sleep(9000);
				 	
						Reporter.log("clickUpdateDepatrmentBtn");

				 		ExtentReportManager.passStep(m_Driver, "clickUpdateDepatrmentBtn" );

				 	}			   
				   
				 
				 
				 public void clickClosePayeScheme() throws InterruptedException
				 
				 	{
				 	    
				 		WebElement elem = getWebElement(closePayeSchemeElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickClosePayeScheme", "clickClosePayeScheme failed. Unable to locate object: " + closePayeSchemeElem.toString());


				 			Assert.fail("Unable to locate object: " + closePayeSchemeElem.toString());
				         }

				 	    elem.click();
				 	   Thread.sleep(9000);
						Reporter.log("clickClosePayeScheme");

				 		ExtentReportManager.passStep(m_Driver, "clickClosePayeScheme " );

				 	}	
				 
				 
				 public void clickPayslipTemplateIcn() throws InterruptedException
				 	{
				 	    
				 		WebElement elem = getWebElement(payslipTemplateElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayslipTemplate", "clickPayslipTemplate failed. Unable to locate object: " + payslipTemplateElem.toString());


				 			Assert.fail("Unable to locate object: " + payslipTemplateElem.toString());
				         }

				 	    elem.click();
				 	   Thread.sleep(2000);
						Reporter.log("clickPayslipTemplate");

				 		ExtentReportManager.passStep(m_Driver, "clickPayslipTemplate " );

				 	}	 
				 
					public void Enter_NomismaStartDate(String nomismaStartDate) throws InterruptedException
				 	{
				 		WebElement elem = getWebElement(nomismaStartDateElem);

				 		if (elem == null) {
				    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NomismaStartDate", "Enter_NomismaStartDate failed. Unable to locate object: " + nomismaStartDateElem.toString());

				    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NomismaStartDate", "Enter_NomismaStartDate failed. Unable to locate object: " + nomismaStartDateElem.toString());
				 			Assert.fail("Unable to locate object: " + nomismaStartDateElem.toString());
				         }
				 		for(int i=0;i<10;i++)
				 		{
				 		elem.sendKeys(Keys.BACK_SPACE);
				 		}
				 		Thread.sleep(2000);
				 		elem.sendKeys(nomismaStartDate);
				 		
				 		elem.sendKeys(Keys.TAB);
				 		
				 		Reporter.log("Entered Nomisma Start date.");
				 		
				 		Thread.sleep(5000);
				 		
				  		ExtentReportManager.passStep(m_Driver, "Enter_EmpJoiningDate " + nomismaStartDate);

				  		TestModellerLogger.PassStep(m_Driver, "Enter_EmpJoiningDate " + nomismaStartDate);
				 	}
				 
					
					
					 public void Enter_FourWeeklyPeriodEndDate(String PeriodEndDate) throws InterruptedException
				     {

				         WebElement elem = getWebElement(FourWeeklyPeriodEndDateElem);

				 

				         if (elem == null) {
				            ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FourWeeklyPeriodEndDate", "Enter_FortnightlyPeriodEndDate failed. Unable to locate object: " + FourWeeklyPeriodEndDateElem.toString());

				 

				            Assert.fail("Unable to locate object: " + FourWeeklyPeriodEndDateElem.toString());
				         }
				         for(int i=0;i<10;i++)
				         {
				         elem.sendKeys(Keys.BACK_SPACE);
				         }
				         Thread.sleep(2000);
				         elem.sendKeys(PeriodEndDate);

				         elem.sendKeys(Keys.TAB);

				         Reporter.log("Entered Period EndDate.");

				         Thread.sleep(3000);

				          ExtentReportManager.passStep(m_Driver, "Enter_FourWeeklyPeriodEndDate " + PeriodEndDate);

				 

				     }
					 
					 
					 
						
					 public void Enter_WeeklyPeriodEndDate(String PeriodEndDate) throws InterruptedException
				     {

				         WebElement elem = getWebElement(WeeklyPeriodEndDateElem);

				 

				         if (elem == null) {
				            ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FourWeeklyPeriodEndDate", "Enter_FortnightlyPeriodEndDate failed. Unable to locate object: " + FourWeeklyPeriodEndDateElem.toString());

				 

				            Assert.fail("Unable to locate object: " + FourWeeklyPeriodEndDateElem.toString());
				         }
				         for(int i=0;i<10;i++)
				         {
				         elem.sendKeys(Keys.BACK_SPACE);
				         }
				         Thread.sleep(2000);
				         elem.sendKeys(PeriodEndDate);

				         elem.sendKeys(Keys.TAB);

				         Reporter.log("Entered Period EndDate.");

				         Thread.sleep(3000);

				          ExtentReportManager.passStep(m_Driver, "Enter_FourWeeklyPeriodEndDate " + PeriodEndDate);

				 

				     }
					 
					 
	   public void clickYesPaymentManagementBtn() throws Exception {
		   
		   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbPaymentManagement_0']"));
		   
		   elem.click();
		   
		   Thread.sleep(5000);
		   
		   Reporter.log("clickYesPaymentManagementBtn");
	
	   }
	   
	   
	   public void clickYesRequestHrsBtn() throws InterruptedException {
		   
		    
	 		WebElement elem = getWebElement(requestHrsElem);

	 		elem.click();
	 	
	 		Thread.sleep(2000);
	 		
			 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

			 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnUpdate']")).click();
		 		Thread.sleep(6000);
		 		
		 	m_Driver.switchTo().defaultContent();

			Reporter.log("clickYesRequestHrsBtn");	 
			   
		   
	   }
	   
	   
	   public void clickNoRequestPayrollInfo() throws InterruptedException {
		   
		    
	 		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rdbRequestPayrollInformation_1']"));

	 		elem.click();
	 	
	 		Thread.sleep(2000);		

			Reporter.log("clickNoRequestPayrollInfo");	 
			   
		   
	   }
	   
	   
	   public void clickYesFreePort() throws InterruptedException {
		   
		    
	 		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rdoFreeportRegion_0']"));

	 		elem.click();
	 	
	 		Thread.sleep(2000);	
	 		
          WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlFreeportRegion']"));
          
          Select sel= new Select(elem1);
          sel.selectByVisibleText("East Midland");
          
		  Reporter.log("clickYesFreePort");	 
			   
		   
	   }
	   
	   
	   
	   public void clickYesInvesmentZone() throws InterruptedException {
		   
		    
	 		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rdoInvestmentZone_0']"));

	 		elem.click();
	 	
	 		Thread.sleep(2000);	
	 		
          WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlInvestmentZone']"));
          
          Select sel= new Select(elem1);
          sel.selectByVisibleText("Greater Manchester Combined Authority (GMCA)");
          
		  Reporter.log("clickYesInvesmentZone");	 
			   
		   
	   }
	   
	   public void verifyLeaveStartDateBoxDisible() throws Exception
	    {

			WebElement elem = getWebElement(leaveStartdateElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterJoiningDate", "enterJoiningDate failed. Unable to locate object: " + leaveStartdateElem.toString());

				Assert.fail("Unable to locate object: " + leaveStartdateElem.toString());
	        }

			boolean con = elem.isEnabled();
			soft.assertFalse(con, "start date in edit employee section is not disable");
			
			System.out.println("verify Leave Start Date Box Disible in edit employee section");
			Reporter.log("verify Leave Start Date Box Disible in edit employee section");
			ExtentReportManager.passStep(m_Driver, "verify Leave Start Date Box Disible in edit employee section");

	    }
	   
	   public void verifyLeaveStartDate(String data) throws Exception
	    {

			WebElement elem = getWebElement(leaveStartdateElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterJoiningDate", "enterJoiningDate failed. Unable to locate object: " + leaveStartdateElem.toString());

				Assert.fail("Unable to locate object: " + leaveStartdateElem.toString());
	        }

			String Name = elem.getAttribute("value");
			soft.assertEquals(data, Name);
			System.out.println("verifyLeaveStartDate : "+Name+"  =  "+data);
			Reporter.log("verifyLeaveStartDate In Edit Employee Page : "+data);

			ExtentReportManager.passStep(m_Driver, "enterLeaveStartDate");

	    }
	 
	   
	 
	   
	   public void verifyHolidayPayRate(String data) throws InterruptedException
		{
	        
			WebElement elem = getWebElement(holidayPayRateElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterHolidayPayRate", "enterHolidayPayRate failed. Unable to locate object: " + holidayPayRateElem.toString());


				Assert.fail("Unable to locate object: " + holidayPayRateElem.toString());
	        }
			
			String Name = elem.getAttribute("value");
			soft.assertEquals(data, Name);
			System.out.println("verifyHolidayPayRate : "+Name+"  =  "+data);
			Reporter.log("verifyHolidayPayRate In Edit Employee Page : "+data);
			
	          	
	      

		}
	   
	   public void verifyMaxCarryOver(String data) throws InterruptedException
		{
	        
			WebElement elem = getWebElement(maxCarryOverElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterMaxCarryOver", "enterMaxCarryOver failed. Unable to locate object: " + maxCarryOverElem.toString());


				Assert.fail("Unable to locate object: " + maxCarryOverElem.toString());
	        }
			String Name = elem.getAttribute("value");
			soft.assertEquals(data, Name);
			System.out.println("verifyMaxCarryOver : "+Name+"  =  "+data);
			Reporter.log("verifyMaxCarryOver In Edit Employee Page : "+data);
		}
	   
		 private By weeklyWorkingHrsElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtWorkingHoursWeekly']");

		public void verifyWeeklyWorkingHrs(String Data) throws InterruptedException
		{
	        
			WebElement elem = getWebElement(weeklyWorkingHrsElem2);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterWeeklyWorkingHrs", "enterWeeklyWorkingHrs failed. Unable to locate object: " + weeklyWorkingHrsElem.toString());


				Assert.fail("Unable to locate object: " + weeklyWorkingHrsElem.toString());
	        }
			String Name = elem.getAttribute("value");
			soft.assertEquals(Data, Name);
			Reporter.log("verifyWeeklyWorkingHrs In Edit Employee Page : "+Data);

		}
		
		
		 public void chkNormalWorkingDays(String dayName)
		 {
			 WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"']"));
			 
			 if ( !m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"")).isSelected() )
			 {
				 m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"")).click();
				 System.out.println("Click On Chk Option of the "+dayName);
				 Reporter.log("Click On Chk Option of the "+dayName);
			 }
			 else
			 {
				 System.out.println("already Chk Option of the "+dayName);
				 Reporter.log("already Chk Option of the "+dayName);
			 }
		 }
		 public void unChkNormalWorkingDays(String dayName)
		 {
			 WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"']"));
			 
			 if ( m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"")).isSelected() )
			 {
				 m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"")).click();
				 System.out.println("Click On UnChk Option of the "+dayName);
				 Reporter.log("Click On UnChk Option of the "+dayName);
			 }
			 else
			 {
				 System.out.println("already UnChk Option of the "+dayName);
				 Reporter.log("already UnChk Option of the "+dayName);
			 }
		 }
		
		 
		 public void verifychkedNormalWorkingDays(String dayName)
		 {
			 WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"']"));
			 
			 if ( m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"")).isSelected() )
			 {
				 System.out.println("alreday Chked Option of the "+dayName);
				 Reporter.log("alreday Chked Option of the "+dayName);
			 }
			 else
			 {
				 soft.assertFalse(true, "NormalWorkingDays is not working as expected :"+dayName);
				
			 }
		 }
		 
		 public void verifyUnChkedNormalWorkingDays(String dayName)
		 {
			 WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"']"));
			 
			 if ( !m_Driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cb"+dayName+"")).isSelected() )
			 {
				 System.out.println("alreday UnChked Option of the "+dayName);
				 Reporter.log("alreday UnChked Option of the "+dayName);
			 }
			 else
			 {
				 soft.assertFalse(true, "NormalWorkingDays is not working as expected :"+dayName);
				
			 }
		 }
		
		
		 public void AssertALL()
		    {
		    	soft.assertAll();
		    }
		 
		 
		 
		 public void QuickDropdown()
		 {
			 getWebElement(By.xpath("class='btn qa-toggle dropdown-toggle"));
		 }
		 
		 
		  public void clickOnSaveBtnInEditEmp() throws Exception
		 	{
		 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']"));

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "saveLinkedWithBtn", "saveLinkedWithBtn failed. Unable to locate object: " + SelectEmailModeElem.toString());


		 			//Assert.fail("Unable to locate object: " + SelectEmailModeElem.toString());
		         }
		 		jsExec.executeScript("arguments[0].click();", elem);
		 		Thread.sleep(2000);
				Reporter.log("saveLinkedWithBtn");


		 	}

		  public void verifyLeaveDays(String value) throws Exception
		 	{
		 		
		         
		 		WebElement elem = getWebElement(leaveDaysComapny);

		 		if (elem == null) {
		     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterleaveStartDateCompany", "enterleaveStartDateCompany failed. Unable to locate object: " + leaveDaysComapny.toString());

		 			Assert.fail("Unable to locate object: " + leaveDaysComapny.toString());
		         }
		 		String AnnualLeave = elem.getAttribute("value").trim();
		 		soft.assertEquals(value, AnnualLeave,"Annual Leave is not getting matched");
		 		System.out.println("verifyHolidayPayRate : "+AnnualLeave+"  =  "+value);
		 		TakeScreenshot.takeScreenshot(m_Driver, "enterleaveDaysComapny");
		 		ExtentReportManager.passStep(m_Driver, "enterleaveDaysComapny");

		 		Reporter.log("enterleaveDaysComapny");
		 	}


		   public void clickOnResetWithCompanyStdInEditEmp() throws Exception
		 	{
		 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_btnResetCompanyStd']"));

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "saveLinkedWithBtn", "saveLinkedWithBtn failed. Unable to locate object: " + SelectEmailModeElem.toString());


		 			//Assert.fail("Unable to locate object: " + SelectEmailModeElem.toString());
		         }
		 		elem.click();
		 		Thread.sleep(2000);
				Reporter.log("saveLinkedWithBtn");


		 	}

		   public void verifyMaxSickDays(String value) throws Exception
		 	{
		         
		 		WebElement elem = getWebElement(maxSickDays);

		 		if (elem == null) {
		     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterMaxSickDays", "enterMaxSickDays failed. Unable to locate object: " + maxSickDays.toString());

		 			Assert.fail("Unable to locate object: " + maxSickDays.toString());
		         }
		 		String MaxSickDays = elem.getAttribute("value").trim();
		 		soft.assertEquals(value, MaxSickDays,"Max Sick Days is not getting matched");
		 		
		 		System.out.println("verifyMaxSickDays : "+MaxSickDays+"  =  "+value);
		 		TakeScreenshot.takeScreenshot(m_Driver, "verifyMaxSickDays");
		 		ExtentReportManager.passStep(m_Driver, "verifyMaxSickDays");
		 	}
		   
		   public void verifyNoticePeriod(String value) throws Exception
		 	{
		         
		 		WebElement elem = getWebElement(noticePeriod);

		 		if (elem == null) {
		     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNoticePeriod", "enterNoticePeriod failed. Unable to locate object: " + noticePeriod.toString());

		 			Assert.fail("Unable to locate object: " + noticePeriod.toString());
		         }
		 		String NoticePeriod = elem.getAttribute("value").trim();
		 		soft.assertEquals(value, NoticePeriod,"Notice Period is not getting matched");
		 		
		 		System.out.println("verfiyNoticePeriod : "+NoticePeriod+"  =  "+value);
		 		TakeScreenshot.takeScreenshot(m_Driver, "verfiyNoticePeriod");
		 		ExtentReportManager.passStep(m_Driver, "verfiyNoticePeriod");
		 	}

		   public void verifyRetirementAgeMale(String value) throws Exception
		 	{
		         
		 		WebElement elem = getWebElement(RetirementAgeMale);

		 		if (elem == null) {
		     		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRetirementAgeMale", "enterRetirementAgeMale failed. Unable to locate object: " + RetirementAgeMale.toString());

		 			Assert.fail("Unable to locate object: " + RetirementAgeMale.toString());
		         }
		 		String RetirementAgeMale = elem.getAttribute("value").trim();
		 		soft.assertEquals(value, RetirementAgeMale,"Retirement Age is not getting matched");
		 		
		 		System.out.println("verifyRetirementAgeMale : "+RetirementAgeMale+"  =  "+value);
		 		TakeScreenshot.takeScreenshot(m_Driver, "verifyRetirementAgeMale");
		 		ExtentReportManager.passStep(m_Driver, "verifyRetirementAgeMale");
		 	}

			 
			 public void SelectedPatslipTemplete(String TempName)
			 {
				 WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlPaySlipTemplate']"));
				 Select sel= new Select(elem);
					sel.selectByVisibleText(TempName);
					System.out.println("Payslip Templete : "+TempName);
					Reporter.log("Payslip Templete : "+TempName);
				 
				 
			 }


}
