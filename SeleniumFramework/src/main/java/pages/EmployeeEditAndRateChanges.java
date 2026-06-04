package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.WaitUtility;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class EmployeeEditAndRateChanges extends BasePage {
	WaitUtility wt=new WaitUtility();
	public EmployeeEditAndRateChanges(WebDriver driver) {
		super(driver);
	
	}
	
	
	private By DirectoryesElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rbIsDirector_0']");
	private By DirectorNoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rbIsDirector_1']");
	private By directorFromElem = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtDirectorStartDate']");
	

	private By selectNI_CalculationMethodElem = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$ddlDirectorMethod']");
	

	
	private By clickEmployeeElem=By.xpath("//*[@id='tblReportData']/tbody/tr[1]/td[1]");
	private By clickEmployeeElem1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[1]/a");
	private By clickEmployeeElem2=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[1]/a");
	private By clickEmployeeElem3=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[5]/td[1]/a");
	private By clickEmployeeElem4=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[6]/td[1]/a");
	private By clickEmployeeElem5=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[7]/td[1]/a");
	private By clickEmployeeElem6=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[8]/td[1]/a");
	private By clickEmployeeElem7=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[9]/td[1]/a");
	private By clickEmployeeElem8=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[10]/td[1]/a");
	private By clickEmployeeElem9=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[11]/td[1]/a");

	private By editEmployeeElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");
	
	private By payDetailsElem= By.xpath("//*[@id='lipayd']/a");
	
	private By basicSalaryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtBasicSalary']");
	
	private By saveBtnElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	private By MandatoryPayrollInfo=By.xpath("//*[@id='limpi']/a");
	
	private By taxCodeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtTaxCode']");
	
	private By threeDots= By.xpath("(//*[@id='tblReportData']/tbody/tr[1]//td[last()]//a)[1]");
	
    private By editElem= By.xpath("/html/body/ul/li[1]/a");

    private By editElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrEditButton_ctl00_PayUnits']");

    private By paydetails = By.xpath("//a[text()='Pay Details']");
    
    private By useEmailElem = By.xpath("//*[@id='chkUseEmail']");

    
    private By taxYear=By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']");
    private By periodElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']");

    private By howpayworkout = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$ddlPayMethod']");
    private By AnnualSal = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtAnnualSalary']");
    private By MonthlySal = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtBasicSalary']");
    private By Weekrate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtWeeklyRate']");
    private By Dayrate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtDayRate']");
    private By Hourrate = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_RptrHourlyPayType_ctl00_txtRate']");
    private By Savebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

    private By NiElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtNINumber']");
    
    private By offPayrollElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rblOffPayWorker_0']");
    
    private By noOffPayrollElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rblOffPayWorker_1']");
    private By noElem=By.xpath("//*[@id='dvOffPayrollWorkerPopup']/div/div/div[2]/div/div/div/div/button[2]");
    
    private By YesElem= By.xpath("//*[@id='lnkYes']");
    
    private By autoEnrolement=By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee']");
    
    private By  schemeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlPensionScheme']");
    
    private By pensionsaveElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSaveAEEmployee']");
    
    private By NiCatogryElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlNICategoryCode']");

    private By NoEmployerNICLiablityElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_chkIsEmployerNICLiable']");
    
    private By firstNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtFirstName']");
    
    private By lastNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLastName']");
    
    private By DobElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDOB']");

    private By AddressLine1Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress1']");

    private By AddressLine2Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress2']");

    private By postCodeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtPostCode']");

    private By JoiningDateElem= By.xpath("//*[@id='txtJoiningDate']");
	private By newEmployeeElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefAddEmployee']");

	private By titleElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlTitle']");
	
	private By emailElem= By.xpath("//*[@id='txtEmail']");
	
	private By leaveDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLeavingDate']");
	
	private By studentLoanElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlStudentLoan']");
	private By postGraduateLoanElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlPostGraduateLoan']");

	private By w1m1BasisElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_cbW1M1']");
	
	private By starterDeclarationElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlStarterDecl']");

	private By p45SalaryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtTotalSalaryP45']");

	private By incomeTaxElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtTotalTaxP45']");

	private By leaveDate = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLeavingDateP45']");
	private By enableP45Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rbP45_0']");

	private By disableP45Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rbP45_1']");

	private By workHourRangeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlHoursWorked']");

	
	private By nextPageElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_PageUC1_rptrPager_ctl03_lnkNext']");
	
	
	private By payFrequencyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlPayrollFrequencyCode']");
	
	private By deletBtnElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnDelete']");
	
	private By viewAdditonDeductionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefphRecuringAdditionDeduction']");
	
	private By newEmployeeElem1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkAddNewEmployee']");
	
	private By cancelElm=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnCancel']");

	private By niNumberElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtNINumber']");

	public void clickNewEmployee() throws InterruptedException
	{
        
		WebElement elem = getWebElement(newEmployeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + newEmployeeElem.toString());

    		Assert.fail("Unable to locate object: " + newEmployeeElem.toString());
        }

		elem.click();
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click_NewEmployee");
		
		Reporter.log("clickNewEmployee");

	}
	
	
	
	public void clickNewEmployee1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(newEmployeeElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNewEmployee1", "clickNewEmployee1 failed. Unable to locate object: " + newEmployeeElem1.toString());

    		Assert.fail("Unable to locate object: " + newEmployeeElem1.toString());
        }

		jsExec.executeScript("arguments[0].click();",elem);

        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickNewEmployee1");
		
		Reporter.log("clickNewEmployee1");

	}
	
	

	public void clickSaveNextBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSaveNext']"));

		

		jsExec.executeScript("arguments[0].click();",elem);

        Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "clickSaveNextBtn");
		
		Reporter.log("clickSaveNextBtn");

	}
	
	
	public void clickCancelBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(cancelElm);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCancelBtn", "clickCancelBtn failed. Unable to locate object: " + cancelElm.toString());

    		Assert.fail("Unable to locate object: " + cancelElm.toString());
        }

		jsExec.executeScript("arguments[0].click();",elem);

        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickCancelBtn");
		
		Reporter.log("clickCancelBtn");

	}
	
	
	public void clickViewAdditionDeduction() throws InterruptedException
	{
        
		WebElement elem = getWebElement(viewAdditonDeductionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickViewAdditionDeduction", "clickViewAdditionDeduction failed. Unable to locate object: " + viewAdditonDeductionElem.toString());

    		Assert.fail("Unable to locate object: " + viewAdditonDeductionElem.toString());
        }

		elem.click();
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickViewAdditionDeduction");
		
		Reporter.log("clickViewAdditionDeduction");

	}
	
	public void clickNextPage() throws InterruptedException
	{
		jsExec.executeScript("window.scrollBy(0,500)");

		WebElement elem = getWebElement(nextPageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNextPage", "clickNextPage failed. Unable to locate object: " + nextPageElem.toString());

    		Assert.fail("Unable to locate object: " + nextPageElem.toString());
        }

		elem.click();
        Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickNextPage");
		
		Reporter.log("clickNextPage");

	}
    
    public void enterFirstName(String data) throws Exception
    {

		WebElement elem = getWebElement(firstNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFirstName", "enterFirstName failed. Unable to locate object: " + firstNameElem.toString());

			Assert.fail("Unable to locate object: " + firstNameElem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterFirstName");

		Reporter.log("enterFirstName");
    }
    
    
    public void enterFirstName1(String data) throws Exception
    {

		WebElement elem = getWebElement(firstNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFirstName", "enterFirstName failed. Unable to locate object: " + firstNameElem.toString());

			Assert.fail("Unable to locate object: " + firstNameElem.toString());
        }
		elem.clear();
		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterFirstName");

		Reporter.log("enterFirstName");
    }
    
    
    public void enterNationalInsuranceNumber(String data) throws Exception
    {

		WebElement elem = getWebElement(niNumberElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNationalInsuranceNumber", "enterNationalInsuranceNumber failed. Unable to locate object: " + niNumberElem.toString());

			Assert.fail("Unable to locate object: " + niNumberElem.toString());
        }
		elem.clear();
		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterNationalInsuranceNumber");

		Reporter.log("enterNationalInsuranceNumber");
    }
    
    
    public void enterLeaveDateSalary(String data) throws Exception
    {

		WebElement elem = getWebElement(p45SalaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterLeaveDateSalary", "enterLeaveDateSalary failed. Unable to locate object: " + p45SalaryElem.toString());

			Assert.fail("Unable to locate object: " + p45SalaryElem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterLeaveDateSalary");

		Reporter.log("enterLeaveDateSalary");
    }
    
    public void enableP45() throws Exception
    {

		WebElement elem = getWebElement(enableP45Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enableP45", "enableP45 failed. Unable to locate object: " + enableP45Elem.toString());

			Assert.fail("Unable to locate object: " + enableP45Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enableP45");

		Reporter.log("enableP45");
    }
    
    public void DisableP45() throws Exception
    {

		WebElement elem = getWebElement(disableP45Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "DisableP45", "DisableP45 failed. Unable to locate object: " + disableP45Elem.toString());

			Assert.fail("Unable to locate object: " + disableP45Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "DisableP45");

		Reporter.log("DisableP45");
    }
    
    
    
    public void enterIncomeTax(String data) throws Exception
    {

		WebElement elem = getWebElement(incomeTaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterIncomeTax", "enterIncomeTax failed. Unable to locate object: " + incomeTaxElem.toString());

			Assert.fail("Unable to locate object: " + incomeTaxElem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterIncomeTax");

		Reporter.log("enterIncomeTax");
    }
    
    public void enterLastName(String data) throws Exception
    {

		WebElement elem = getWebElement(lastNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterLastName", "enterLastName failed. Unable to locate object: " + lastNameElem.toString());

			Assert.fail("Unable to locate object: " + lastNameElem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterLastName");

		Reporter.log("enterLastName");
    }
    
    
    public void enterDateOfBirth(String data) throws Exception
    {

		WebElement elem = getWebElement(DobElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDateOfBirth", "enterDateOfBirth failed. Unable to locate object: " + DobElem.toString());

			Assert.fail("Unable to locate object: " + DobElem.toString());
        }

		elem.sendKeys(data);
		
		m_Driver.findElement(By.xpath("//*[@id='PersonalDetails']/div[7]/label")).click();
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterDateOfBirth");

		Reporter.log("enterDateOfBirth");
    }
    
    
    
    public void enterAddressLine(String data) throws Exception
    {

		WebElement elem = getWebElement(AddressLine1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAddressLine", "enterAddressLine failed. Unable to locate object: " + AddressLine1Elem.toString());

			Assert.fail("Unable to locate object: " + AddressLine1Elem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterAddressLine");

		Reporter.log("enterAddressLine");
    }
    
    
    public void enterAddressLine3(String data) throws Exception
    {

		WebElement elem = getWebElement(AddressLine1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAddressLine", "enterAddressLine failed. Unable to locate object: " + AddressLine1Elem.toString());

			Assert.fail("Unable to locate object: " + AddressLine1Elem.toString());
        }

		elem.clear();
		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterAddressLine");

		Reporter.log("enterAddressLine");
    }
    
    public void enterAddressLine2(String data) throws Exception
    {

		WebElement elem = getWebElement(AddressLine2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAddressLine2", "enterAddressLine2 failed. Unable to locate object: " + AddressLine2Elem.toString());

			Assert.fail("Unable to locate object: " + AddressLine2Elem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterAddressLine2");

		Reporter.log("enterAddressLine2");
    }
    
    public void enterPostCode(String data) throws Exception
    {

		WebElement elem = getWebElement(postCodeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPostCode", "enterPostCode failed. Unable to locate object: " + postCodeElem.toString());

			Assert.fail("Unable to locate object: " + postCodeElem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterPostCode");

		Reporter.log("enterPostCode");
    }
    
    
    public void enterWorkPlacePostCode(String data) throws Exception
    {

		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtWorkplacePostcode']"));

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPostCode", "enterPostCode failed. Unable to locate object: " + postCodeElem.toString());

			Assert.fail("Unable to locate object: " + postCodeElem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterPostCode");

		Reporter.log("enterWorkPlacePostCode");
    }
    
    
    public void enterEmailAddress(String data) throws Exception
    {

		WebElement elem = getWebElement(emailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterEmailAddress", "enterEmailAddress failed. Unable to locate object: " + emailElem.toString());

			Assert.fail("Unable to locate object: " + emailElem.toString());
        }

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterEmailAddress");

		Reporter.log("enterEmailAddress");
    }
    
    public void enterEmailAddress1(String data) throws Exception
    {

		WebElement elem = getWebElement(emailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterEmailAddress", "enterEmailAddress failed. Unable to locate object: " + emailElem.toString());

			Assert.fail("Unable to locate object: " + emailElem.toString());
        }
		elem.clear();

		elem.sendKeys(data);
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "enterEmailAddress");

		Reporter.log("enterEmailAddress");
    }
    
    public void enterJoiningDate(String data) throws Exception
    {

		WebElement elem = getWebElement(JoiningDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterJoiningDate", "enterJoiningDate failed. Unable to locate object: " + JoiningDateElem.toString());

			Assert.fail("Unable to locate object: " + JoiningDateElem.toString());
        }

		elem.sendKeys(data);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_UpdatePanel1']/div[2]/label")).click();
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "enterJoiningDate");

		Reporter.log("enterJoiningDate");
    }
    
    
    
    public void enterJoiningDate1(String data) throws Exception
    {

		WebElement elem = getWebElement(JoiningDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterJoiningDate", "enterJoiningDate failed. Unable to locate object: " + JoiningDateElem.toString());

			Assert.fail("Unable to locate object: " + JoiningDateElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_UpdatePanel1']/div[2]/label")).click();
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "enterJoiningDate");

		Reporter.log("enterJoiningDate");
    }
    
    
    
    
    
	  public void click3Dots()
	    {

			WebElement elem = getWebElement(threeDots);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots", "click3Dots failed. Unable to locate object: " + threeDots.toString());

				Assert.fail("Unable to locate object: " + threeDots.toString());
	        }

			elem.click();
			
			ExtentReportManager.passStep(m_Driver, "click3Dots");
		
			   Reporter.log("Click 3 dots");
	    }
	
	  
	  public void clickNoBtn() throws Exception
	    {

			WebElement elem = getWebElement(noElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNoBtn", "clickNoBtn failed. Unable to locate object: " + noElem.toString());

				Assert.fail("Unable to locate object: " + noElem.toString());
	        }

			elem.click();
			Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "clickNoBtn");
		
			   Reporter.log("clickNoBtn");
	    }
	
	  
	  
	  public void clickYesBt() throws Exception
	    {

			WebElement elem = getWebElement(YesElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickYesBtn", "clickYesBtn failed. Unable to locate object: " + YesElem.toString());

				Assert.fail("Unable to locate object: " + YesElem.toString());
	        }

			elem.click();
			Thread.sleep(3000);
			ExtentReportManager.passStep(m_Driver, "clickYesBtn");
		
			Reporter.log("clickYesBtn");
	    }
	
	  
	  
	  
	   public void clickYesOffPayWorker() throws Exception
	    {
			WebElement elem = getWebElement(offPayrollElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickOffPayroll", "clickOffPayroll failed. Unable to locate object: " + offPayrollElem.toString());

				Assert.fail("Unable to locate object: " + offPayrollElem.toString());
	        }

			elem.click();
			
			Thread.sleep(3000);
			
			m_Driver.findElement(By.xpath("//*[@id='lnkYes']")).click();
			Thread.sleep(3000);
			ExtentReportManager.passStep(m_Driver, "clickOffPayroll");
		
			 Reporter.log("clickYesOffPayWorker");
	    }
	  
	   
	   public void clickOffPayWorker() throws Exception
	    {
			WebElement elem = getWebElement(offPayrollElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickOffPayroll", "clickOffPayroll failed. Unable to locate object: " + offPayrollElem.toString());

				Assert.fail("Unable to locate object: " + offPayrollElem.toString());
	        }

			elem.click();
			
			Thread.sleep(3000);
			
		
			ExtentReportManager.passStep(m_Driver, "clickOffPayroll");
		
			 Reporter.log("clickYesOffPayWorker");
	    }
	  
	  
	  
	  public void clickNoOffPayWorker() throws Exception
	    {

			WebElement elem = getWebElement(noOffPayrollElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNoOffPayroll", "clickNoOffPayroll failed. Unable to locate object: " + noOffPayrollElem.toString());

				Assert.fail("Unable to locate object: " + noOffPayrollElem.toString());
	        }

			elem.click();
			
			Thread.sleep(3000);
			ExtentReportManager.passStep(m_Driver, "clickNoOffPayroll");
		
			   Reporter.log("clickNoOffPayroll");
	    }
	  
	  
	  
	  
	  public void clickEditBtn()
	    {
	    	
	    	WebElement elem = getWebElement(editElem);
	    	

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay", "clickProcessPay failed. Unable to locate object: " + editElem.toString());

				Assert.fail("Unable to locate object: " + editElem.toString());
	        }

			elem.click();
			
			ExtentReportManager.passStep(m_Driver, "clickeditElem");
		
			   Reporter.log("Click Edit ");
	    }
	
	  
	  
	  public void clickEditBtn1()
	    {
	    	
	    	WebElement elem = getWebElement(editElem1);
	    	
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditBtn1", "clickEditBtn1 failed. Unable to locate object: " + editElem1.toString());

				Assert.fail("Unable to locate object: " + editElem1.toString());
	        }

			elem.click();
			
			ExtentReportManager.passStep(m_Driver, "clickEditBtn1");
		
			Reporter.log("clickEditBtn1");
	    }
	
	
	  
	  /**
	   * Click Pay Details under Edit Employee
	 * @throws InterruptedException 
	  * @name Pay Details
	  */ 
	   public void click_Paydetails() throws InterruptedException
	  	{
	       
	  	WebElement	 elem = getWebElement(paydetails);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "click_Paydetails", "click_Paydetails failed. Unable to locate object: " + paydetails.toString());

	   	
	  			Assert.fail("Unable to locate object: " + paydetails.toString());
	       }
	  		
	  		Thread.sleep(4000);

	  		elem.click();
	         	

	  		ExtentReportManager.passStep(m_Driver, "click_Paydetails");

	  		Reporter.log("click PayDetails");
	  }
	   
	   
	   public void clickUseEmail() throws InterruptedException
	  	{
	       
	  	WebElement	 elem = getWebElement(useEmailElem);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUseEmail", "clickUseEmail failed. Unable to locate object: " + useEmailElem.toString());

	   	
	  			Assert.fail("Unable to locate object: " + useEmailElem.toString());
	       }
	  		
	  		Thread.sleep(3000);

	  		elem.click();
	         	

	  		ExtentReportManager.passStep(m_Driver, "clickUseEmail");

	  		Reporter.log("clickUseEmail");
	  }
	   
	   
	   
	   public void clickNoEmployerNIC()
	  	{
	       
	  	WebElement	 elem = getWebElement(NoEmployerNICLiablityElem);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNoEmployerNIC", "clickNoEmployerNIC failed. Unable to locate object: " + NoEmployerNICLiablityElem.toString());

	   	
	  			Assert.fail("Unable to locate object: " + NoEmployerNICLiablityElem.toString());
	       }

	  		elem.click();
	         	

	  		ExtentReportManager.passStep(m_Driver, "clickNoEmployerNIC");

	  		Reporter.log("clickNoEmployerNIC");
	  }
	   
	   
	   
	   
	   public void workHourRange(String workHourRange) throws InterruptedException
	   {
	     
	   		WebElement elem = getWebElement(workHourRangeElem);

	   		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "workHourRange", "workHourRange failed. Unable to locate object: " + workHourRangeElem.toString());

	
	   			Assert.fail("Unable to locate object: " + workHourRangeElem.toString());
	        }

	   		Select payrate =  new Select(elem);
	   	    payrate.selectByVisibleText(workHourRange);
//	   	    Thread.sleep(3000);
//	   	     Alert act = m_Driver.switchTo().alert();
//	   
//	       	act.accept();
	   	    
	   	   
	   		ExtentReportManager.passStep(m_Driver, "workHourRange");
          Reporter.log("workHourRange");
	   }
	   
	   
	   public void Click_howpayworkout(String Payworkout) throws InterruptedException
	   {
	     
	   		WebElement elem = getWebElement(howpayworkout);

	   		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_howpayworkout", "Click_howpayworkout failed. Unable to locate object: " + howpayworkout.toString());

	
	   			Assert.fail("Unable to locate object: " + howpayworkout.toString());
	        }

	   		Select payrate =  new Select(elem);
	   	    payrate.selectByVisibleText(Payworkout);
	   	    Thread.sleep(3000);
//	   	     Alert act = m_Driver.switchTo().alert();
//	   
//	       	act.accept();
	   	    
	  // 	  m_Driver.switchTo().alert().accept();
	     	 Thread.sleep(1000);
	   		ExtentReportManager.passStep(m_Driver, "Click_howpayworkout");
          Reporter.log("Select PayworkOut");
	   }
	   
	   
	   /**
	    * Enter Annual Salry Details under Pay Details
	   * @name Annual Salary
	   */
	   public void Enter_Annualsal(String Anulrte)
	   {

	   	WebElement elem = getWebElement(AnnualSal);

	   	if (elem == null) {
	   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Annualsal", "Enter_Annualsal failed. Unable to locate object: " + AnnualSal.toString());

	   		Assert.fail("Unable to locate object: " + AnnualSal.toString());
	   }

	   	for(int i=0;i<=4;i++)
	   	{
	   		elem.sendKeys(Keys.BACK_SPACE);
	   	}
	   	elem.sendKeys(Anulrte);
	   	

	   	ExtentReportManager.passStep(m_Driver, "Enter_Annualsal");
        Reporter.log("Enter_Annual salary");
	   }

	   /**
	    * Enter Day Rate Details under Pay Details
	   * @name Day Rate
	   */
	   public void Enter_DayRate(String Dayrte)
	   {

	   WebElement	 elem = getWebElement(Dayrate);

	   	if (elem == null) {
	   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DayRate", "Enter_DayRate failed. Unable to locate object: " + Dayrate.toString());

	   	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DayRate", "Enter_DayRate failed. Unable to locate object: " + Dayrate.toString());

	   		Assert.fail("Unable to locate object: " + Dayrate.toString());
	   }

	 	for(int i=0;i<=4;i++)
	   	{
	   		elem.sendKeys(Keys.BACK_SPACE);
	   	}
	  
	   	elem.sendKeys(Dayrte);
	   	

	   	ExtentReportManager.passStep(m_Driver, "Enter_DayRate");

	   	TestModellerLogger.PassStep(m_Driver, "Enter_DayRate");
	   }

	   /**
	    * Enter Hour Rate Details under Pay Details
	    * @throws InterruptedException 
	   * @name Week Rate
	   */
	   public void Enter_HourRate(String Hourrte) throws InterruptedException
	   {
	        
	   	WebElement elem = getWebElement(Hourrate);

	   	if (elem == null) {
	   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HourRate", "Enter_HourRate failed. Unable to locate object: " + Hourrate.toString());

	  Assert.fail("Unable to locate object: " + Hourrate.toString());
	   }
	   	for(int i=0;i<=4;i++)
	   	{
	   		elem.sendKeys(Keys.BACK_SPACE);
	   	}
	
	
	   	elem.sendKeys(Hourrte);
	   	
	   	Thread.sleep(2000);
	   	
	   	ExtentReportManager.passStep(m_Driver, "Enter_HourRate");
         
	   	Reporter.log("Enter Hourly salary");
	   }
	   
	   public void clickTab() throws Exception {
		   
		   	WebElement elem = getWebElement(Hourrate);

		   	elem.sendKeys(Keys.TAB);
		   	
		   	Thread.sleep(2000);
	   }
	   
	   
	   public void Enter_HourRate1(String Hourrte) throws InterruptedException
	   {
	        
	   	WebElement elem = getWebElement(Hourrate);

	   	if (elem == null) {
	   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HourRate", "Enter_HourRate failed. Unable to locate object: " + Hourrate.toString());

	     Assert.fail("Unable to locate object: " + Hourrate.toString());
	   }
	   	for(int i=0;i<=6;i++)
	   	{
	   		elem.sendKeys(Keys.BACK_SPACE);
	   	}
	
	
	   	elem.sendKeys(Hourrte);
	   	
	   	ExtentReportManager.passStep(m_Driver, "Enter_HourRate");
         
	   	Reporter.log("Enter Hourly salary");
	   }
	   
	   
	public void clickEmployeeName() throws Exception
	{        Thread.sleep(5000);

		WebElement elem = getWebElement(clickEmployeeElem);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("clickEmployeeName");
		
		Thread.sleep(1000);
	}
	
	
	
	public void clickIndividualEmployeeYtd() throws Exception
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkYTD']"));
		elem.click();
		 
		Thread.sleep(3000);
		
		Reporter.log("clickIndividualEmployeeYtd");
		 
		 
	}
	
	   
	public void clickOpeningBalance() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnOpeningBalances']"));
       Thread.sleep(2000);
		elem.click();
		
		Reporter.log("clickOpeningBalance");
		
		Thread.sleep(1000);
	}
	
	
	public void clickEmployeeName1() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem1);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	
	public void clickEmployeeName2() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem2);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	
	public void clickEmployeeName3() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem3);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	
	public void clickEmployeeName4() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem4);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	public void clickEmployeeName5() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem5);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	public void clickEmployeeName6() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem6);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	public void clickEmployeeName7() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem7);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	public void clickEmployeeName8() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem8);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	public void clickEmployeeName9() throws Exception
	{
		WebElement elem = getWebElement(clickEmployeeElem9);
        Thread.sleep(2000);
		elem.click();
		
		Reporter.log("Click Employee for Edit");
		
		Thread.sleep(1000);
	}
	
	
	
	public void editEmployeeDetails()
	{
		WebElement elem = getWebElement(editEmployeeElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Edit Btn");
		
	}
	
	
	public void editPayDetailsExtra()
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddAddition']"));
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("editPayDetailsExtra");
		
	}
	
	
	public void editgeneralTerms()
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement']"));
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Edit Btn");
		
	}
	
	
	public void clickResetWithCompany()
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_btnResetCompanyStd']"));
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Edit Btn");
		
	}
	
	
	public void enterCarryForward(String Value)
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtCarryForward']"));
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.sendKeys(Value);
		Reporter.log("enterCarryForward");
		
	}
	

	public void enterAnnualLeaveDays(String Value)
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtAnnualLeaveDays']"));
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		elem.sendKeys(Value);
		Reporter.log("enterAnnualLeaveDays");
		
	}
	
	public void editEmployeeDetails1()
	
	        
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee']"));
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Edit Btn");
		
	}
	
	public void clickPaydetails()
	{
		WebElement elem = getWebElement(payDetailsElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click pay details");
		
	}
	
	public void clickPaydate()
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkViewEmployeeSalaryDetails']"));
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("clickPaydate");
		
	}
	
	
	public void exportToCsv() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/div/div/a[5]"));
		elem.click();
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);

	     Thread.sleep(5000);
		Reporter.log("exportToCsv");
		
	}
	
	

	public void exportToPayslipPdf() throws Exception
	{
		WebElement elem = getWebElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[3]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[2]/a"));
		elem.click();
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);

	     Thread.sleep(5000);
		Reporter.log("exportToPayslipPdf");
		
	}
	
	
	
	public void enterBasicSalary(String BasicSalary)
	{
		WebElement elem = getWebElement(basicSalaryElem);
		elem.clear();
		
		m_Driver.switchTo().alert().accept();
		elem.sendKeys(BasicSalary);
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	
	
	public void enterBasicSalary2(String BasicSalary) throws Exception
	{
		WebElement elem = getWebElement(basicSalaryElem);
		elem.clear();
		
		elem.sendKeys(BasicSalary);
		m_Driver.findElement(By.xpath("//*[@id='PayDetails']/div[6]/label")).click();
		Thread.sleep(1000);
		m_Driver.switchTo().alert().accept();
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	public void enterBasicSalary1(String BasicSalary) throws Exception
	{
		WebElement elem = getWebElement(basicSalaryElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		
		elem.sendKeys(BasicSalary);
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	public void enterBasicSalary3(String BasicSalary) throws Exception
	{
		WebElement elem = getWebElement(basicSalaryElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		
		elem.sendKeys(BasicSalary);
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		m_Driver.switchTo().alert().accept();
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	
	

	public void enterBasicSalaryChanged(String BasicSalary) throws Exception
	{
		WebElement elem = getWebElement(basicSalaryElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		m_Driver.switchTo().alert().accept();

		elem.sendKeys(BasicSalary);
		elem.sendKeys(Keys.TAB);
		m_Driver.switchTo().alert().accept();

		Thread.sleep(2000);
		Reporter.log("enterBasicSalaryChanged= "+BasicSalary);
		
	}
	
	public void enterSalary(String BasicSalary) throws Exception
	{
		WebElement elem = getWebElement(basicSalaryElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		
		elem.sendKeys(BasicSalary);
	
		Thread.sleep(2000);
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	
	public void enterBasicSalary4(String BasicSalary) throws Exception
	{
		WebElement elem = getWebElement(basicSalaryElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		
		elem.sendKeys(BasicSalary);
		elem.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		m_Driver.switchTo().alert().accept();
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	
	 public void clickSaveBtn() throws InterruptedException
		{
			WebElement elem = getWebElement(saveBtnElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveBtnElem.toString());

				Assert.fail("Unable to locate object: " + saveBtnElem.toString());
	        }
			Thread.sleep(1000);
			jsExec.executeScript("arguments[0].click();",elem);
		
			Thread.sleep(5000);
			ExtentReportManager.passStep(m_Driver, "clickSaveBtn");
			
			 Reporter.log("Click SaveBtn");
	}
	 
	 
	 public void clickDeletBtn() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(deletBtnElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletBtn", "clickDeletBtn failed. Unable to locate object: " + deletBtnElem.toString());

				Assert.fail("Unable to locate object: " + deletBtnElem.toString());
	        }
			Thread.sleep(1000);
			jsExec.executeScript("arguments[0].click();",elem);
		
			Thread.sleep(5000);
			ExtentReportManager.passStep(m_Driver, "clickDeletBtn");
			
			Reporter.log("clickDeletBtn");
	}
	 
	 
	 public void enterLeavingDate(String data) throws InterruptedException
		{
	        
		   jsExec.executeScript("window.scrollBy(0,500)");
			WebElement elem = getWebElement(leaveDateElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterLeavingDate", "enterLeavingDate failed. Unable to locate object: " + leaveDateElem.toString());

				Assert.fail("Unable to locate object: " + leaveDateElem.toString());
	        }
			
			elem.sendKeys(data);
			elem.sendKeys(Keys.TAB);
			
			Thread.sleep(5000);
			ExtentReportManager.passStep(m_Driver, "enterLeavingDate");
			
			 Reporter.log("enterLeavingDate");
	}
	 

	 
	 public void enterP45LeavingDate(String data) throws InterruptedException
		{
	        
		   jsExec.executeScript("window.scrollBy(0,500)");
			WebElement elem = getWebElement(leaveDate);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterP45LeavingDate", "enterP45LeavingDate failed. Unable to locate object: " + leaveDate.toString());

				Assert.fail("Unable to locate object: " + leaveDate.toString());
	        }
			

			elem.sendKeys(data);
			elem.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			ExtentReportManager.passStep(m_Driver, "enterP45LeavingDate");
			
			 Reporter.log("enterP45LeavingDate");
	}

	 
	 public void clickAutoEnrolmentSaveBtn() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(pensionsaveElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAutoEnrolmentSaveBtn", "clickAutoEnrolmentSaveBtn failed. Unable to locate object: " + pensionsaveElem.toString());

				Assert.fail("Unable to locate object: " + pensionsaveElem.toString());
	        }
			jsExec.executeScript("arguments[0].click();",elem);
		
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "clickAutoEnrolmentSaveBtn");
			
			 Reporter.log("clickAutoEnrolmentSaveBtn");
	}
	
	 
	 public void clickM1W1Basis() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(w1m1BasisElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickM1W1Basis", "clickM1W1Basis failed. Unable to locate object: " + w1m1BasisElem.toString());

				Assert.fail("Unable to locate object: " + w1m1BasisElem.toString());
	        }
			jsExec.executeScript("arguments[0].click();",elem);
		
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "clickM1W1Basis");
			
			 Reporter.log("clickM1W1Basis");
	}
	
	 
	 public void enterTaxCode(String Value) throws Exception
	 {
	    
//		 jsExec.executeScript("window.scrollBy(0,250)");
	    	WebElement elem = getWebElement(taxCodeElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterTaxCode", "enterTaxCode failed. Unable to locate object: " + taxCodeElem.toString());

				Assert.fail("Unable to locate object: " + taxCodeElem.toString());
	        }
            
		    elem.clear();
			elem.sendKeys(Value);
			
			Thread.sleep(2000);
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_UpdatePanel1']/div[13]/label")).click();
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterTaxCode");
		
			 Reporter.log("Enter taxCode");
	    }
	 
	 
	 public void enterTaxCode1(String Value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(taxCodeElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterTaxCode", "enterTaxCode failed. Unable to locate object: " + taxCodeElem.toString());

				Assert.fail("Unable to locate object: " + taxCodeElem.toString());
	        }
            
			elem.sendKeys(Value);
			
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterTaxCode");
		
			   Reporter.log("Enter taxCode");
	    }
	 
	 
	 public void enterNI(String Value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(NiElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNI", "enterNI failed. Unable to locate object: " + NiElem.toString());

				Assert.fail("Unable to locate object: " + NiElem.toString());
	        }
            
			elem.sendKeys(Value);
			
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterNI");
		     Reporter.log("Enter NI Number");
	    }
	 
	 
	 public void clickMandotoryPayroll() throws Exception
	 {
		    Thread.sleep(2000);


	    	WebElement elem = getWebElement(MandatoryPayrollInfo);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMandotoryPayroll", "clickMandotoryPayroll failed. Unable to locate object: " + MandatoryPayrollInfo.toString());

				Assert.fail("Unable to locate object: " + MandatoryPayrollInfo.toString());
	        }
            
		    Thread.sleep(3000);

		    elem.click();
		    Thread.sleep(2000);
		 
			ExtentReportManager.passStep(m_Driver, "clickMandotoryPayroll");
		
			  Reporter.log("click Mandotorypayroll");
	    }
	 
	 
	 public void enterNICategory(String value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(NiCatogryElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNICategory", "enterNICategory failed. Unable to locate object: " + NiCatogryElem.toString());

				Assert.fail("Unable to locate object: " + NiCatogryElem.toString());
	        }
            
	     	Select sel= new Select(elem);
		    
	     	sel.selectByValue(value);
		    Thread.sleep(7000);
		 
			ExtentReportManager.passStep(m_Driver, "enterNICategory");
		
			  Reporter.log("enterNICategory");
	    }
	 
	 
	 public void enterPayFrequency(String value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(payFrequencyElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPayFrequency", "enterPayFrequency failed. Unable to locate object: " + payFrequencyElem.toString());

				Assert.fail("Unable to locate object: " + payFrequencyElem.toString());
	        }
            
	     	Select sel= new Select(elem);
		    
	     	sel.selectByVisibleText(value);
		    Thread.sleep(3000);
		 
			ExtentReportManager.passStep(m_Driver, "enterPayFrequency");
		
			  Reporter.log("enterPayFrequency");
	    }
	 
	 
	 public void selectStudentLone(String value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(studentLoanElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStudentLone", "selectStudentLone failed. Unable to locate object: " + studentLoanElem.toString());

				Assert.fail("Unable to locate object: " + studentLoanElem.toString());
	        }
            
	     	Select sel= new Select(elem);
		    
	     	sel.selectByVisibleText(value);
		    Thread.sleep(3000);
		 
			ExtentReportManager.passStep(m_Driver, "selectStudentLone");
		
			  Reporter.log("selectStudentLone");
	    }
	 
	 
	 
	 public void selectPostGraduateLone(String value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(postGraduateLoanElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPostGraduateLone", "selectPostGraduateLone failed. Unable to locate object: " + postGraduateLoanElem.toString());

				Assert.fail("Unable to locate object: " + postGraduateLoanElem.toString());
	        }
            
	     	Select sel= new Select(elem);
		    
	     	sel.selectByVisibleText(value);
		    Thread.sleep(3000);
		 
			ExtentReportManager.passStep(m_Driver, "selectPostGraduateLone");
		
			  Reporter.log("selectPostGraduateLone");
	    }
	 public void selectStarterDeclaration(String value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(starterDeclarationElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStarterDeclaration", "selectStarterDeclaration failed. Unable to locate object: " + starterDeclarationElem.toString());

				Assert.fail("Unable to locate object: " + starterDeclarationElem.toString());
	        }
            
	     	Select sel= new Select(elem);
		    
	     	sel.selectByVisibleText(value);
		    Thread.sleep(5000);
		 
			ExtentReportManager.passStep(m_Driver, "selectStarterDeclaration");
		
			  Reporter.log("selectStarterDeclaration");
	    }
	 
	 
	 
	 public void enterTitle(String value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(titleElem);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterTitle", "enterTitle failed. Unable to locate object: " + titleElem.toString());

				Assert.fail("Unable to locate object: " + titleElem.toString());
	        }
            
	     	Select sel= new Select(elem);
		    
	     	sel.selectByVisibleText(value);
		    Thread.sleep(2000);
		 
			ExtentReportManager.passStep(m_Driver, "enterTitle");
		
			  Reporter.log("enterTitle");
	    }
	 
	 
	 
	 public void clickAutoEnrolment() throws Exception
	 {
	    

	    	WebElement elem = getWebElement(autoEnrolement);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAutoEnrolment", "clickAutoEnrolment failed. Unable to locate object: " + autoEnrolement.toString());

				Assert.fail("Unable to locate object: " + autoEnrolement.toString());
	        }
            
		    elem.click();
		    Thread.sleep(2000);
		 
			ExtentReportManager.passStep(m_Driver, "clickAutoEnrolment");
		
			  Reporter.log("click clickAutoEnrolment");
	    }
	 
	 
	  public void selectTaxYear(String Value) throws Exception
	  	{
	       
		
	    	WebElement	 elem = getWebElement(taxYear);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + taxYear.toString());

	   	
	  			Assert.fail("Unable to locate object: " + taxYear.toString());
	       }
	  		
	  	Thread.sleep(1000);
	     Select sel = new Select(elem);
	  		
	     sel.selectByVisibleText(Value);

	         	
	  		Thread.sleep(2000);

	  		ExtentReportManager.passStep(m_Driver, "selectTaxYear");

	  		Reporter.log("Select TaxYear");
	  }
	  
	  
	  
	  
	  public void selectPeriodEndDate(String Value) throws Exception
	  	{
	       
		
	    	WebElement	 elem = getWebElement(periodElem);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPeriodEndDate", "selectPeriodEndDate failed. Unable to locate object: " + periodElem.toString());

	   	
	  			Assert.fail("Unable to locate object: " + periodElem.toString());
	       }
	  		
	  	Thread.sleep(1000);
	     Select sel = new Select(elem);
	  		
	     sel.selectByVisibleText(Value);

	         	
	  		Thread.sleep(2000);

	  		ExtentReportManager.passStep(m_Driver, "selectPeriodEndDate");

	  		Reporter.log("selectPeriodEndDate");
	  }
	  
	  
	  
	  public void selectPensionScheme(String Value) throws Exception
	  	{
	       
		
	    	WebElement	 elem = getWebElement(schemeElem);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPensionScheme", "selectPensionScheme failed. Unable to locate object: " + schemeElem.toString());

	   	
	  			Assert.fail("Unable to locate object: " + schemeElem.toString());
	       }
	  		
	  	Thread.sleep(1000);
	     Select sel = new Select(elem);
	  		
	     sel.selectByVisibleText(Value);

	         	
	  		Thread.sleep(2000);

	  		ExtentReportManager.passStep(m_Driver, "selectPensionScheme");

	  		Reporter.log("selectPensionScheme");
	  }
	   
	 
	  
	  

		
	  public void clickYesDirector() throws Exception
	  	{
	       
	  	WebElement	 elem = getWebElement(DirectoryesElem);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickYesDirector", "clickYesDirector failed. Unable to locate object: " + DirectoryesElem.toString());

	   	
	  			Assert.fail("Unable to locate object: " + DirectoryesElem.toString());
	       }

	  		elem.click();
	         	
	  		Thread.sleep(2000);

	  		ExtentReportManager.passStep(m_Driver, "clickYesDirector");

	  		Reporter.log("click clickYesDirector");
	  }
	  
	  
	  
	  public void clickNoDirector() throws Exception
	  	{
	       
	  	WebElement	 elem = getWebElement(DirectorNoElem);

	  		if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNoDirector", "clickNoDirector failed. Unable to locate object: " + DirectorNoElem.toString());

	   	
	  			Assert.fail("Unable to locate object: " + DirectorNoElem.toString());
	       }

	  		elem.click();
	         	
	  		Thread.sleep(2000);

	  		ExtentReportManager.passStep(m_Driver, "clickNoDirector");

	  		Reporter.log("click clickNoDirector");
	  }
	  
	 /**
     * Enter enter_DirectorFromDate
    * @throws InterruptedException
    * @name Enter enter_DirectorFromDate
    */
	
	
    public void enter_DirectorFromDate(String fromDate) throws InterruptedException
    {
        
        WebElement elem = getWebElement(directorFromElem);



       if (elem == null) {
           ExtentReportManager.failStepWithScreenshot(m_Driver, "enter_DirectorFromDate", "enter_DirectorFromDate failed. Unable to locate object: " + directorFromElem.toString());



          TestModellerLogger.FailStepWithScreenshot(m_Driver, "enter_DirectorFromDate", "enter_DirectorFromDate failed. Unable to locate object: " + directorFromElem.toString());



           Assert.fail("Unable to locate object: " + directorFromElem.toString());
        }
        
        
//        
//        for(int i=0;i<10;i++)
//        {
//        elem.sendKeys(Keys.BACK_SPACE);
//        }
//        Thread.sleep(2000);
//         
         
        elem.sendKeys(fromDate);
        Thread.sleep(2000);
        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_dvcompanydirector']/div[3]/label")).click();
        Reporter.log("Enter Director From Date.");
        
        Thread.sleep(2000);
        
        
         ExtentReportManager.passStep(m_Driver, "enter_DirectorFromDate " + fromDate);



        TestModellerLogger.PassStep(m_Driver, "enter_DirectorFromDate " + fromDate);
        
        Reporter.log("enter_DirectorFromDate");
    }

    
    
	
    public void select_NI_CalculationMethod(String calculationMethodElem) throws InterruptedException
    {
        
      WebElement  elem = getWebElement(selectNI_CalculationMethodElem);



       if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "select_NI_CalculationMethod", "select_NI_CalculationMethod failed. Unable to locate object: " + selectNI_CalculationMethodElem.toString());



           TestModellerLogger.FailStepWithScreenshot(m_Driver, "select_NI_CalculationMethod", "select_NI_CalculationMethod failed. Unable to locate object: " + selectNI_CalculationMethodElem.toString());



           Assert.fail("Unable to locate object: " + selectNI_CalculationMethodElem.toString());
        }



       
        Select select =new Select(elem);
        select.selectByVisibleText(calculationMethodElem);
        
        Thread.sleep(4000);
        Reporter.log("Select calculation Method");
        ExtentReportManager.passStep(m_Driver, "select_NI_CalculationMethod");



       TestModellerLogger.PassStep(m_Driver, "select_NI_CalculationMethod");
       Reporter.log("select_NI_CalculationMethod");
    }
	 
    public void enterRegularAmount(String data) throws InterruptedException {
    	
    	
    	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_RptrHourlyPayType_ctl00_txtRate']"));
    	
    	elem.sendKeys(data);
    	
    	elem.sendKeys(Keys.TAB);
    	
    	Thread.sleep(2000);
    	m_Driver.switchTo().alert().accept();
    	Reporter.log(" enterRegularAmount");
    }
    
    
    public void clickP11DEmployeeBtn() throws Exception {
    	
    	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_rptrDisplayRecords_ctl00_lblFullName']"));
    	
    	elem.click();
    	
    	Thread.sleep(3000);
    	
    	
    	Reporter.log("clickP11DEmployeeBtn");

    	
    }
    
    public void clickOnDeletBtn() throws InterruptedException {
    	
    	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkEmpDelete']")).click();
    	
    	Thread.sleep(3000);

    	Reporter.log("clickOnDeletBtn");
    	
    	
    }
    
  public void clickOnLeveBtn() throws InterruptedException {
    	
    	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkLeaver']")).click();
    	
    	Thread.sleep(3000);

    	Reporter.log("clickOnLeveBtn");
    	
    	
    }
  
  
  public void enterLeaveDate(String data) throws InterruptedException {
	  
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='LeaverPopUpFrame']")));

  	
  	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLeavingDate']"));
  	
  	elem.sendKeys(data);
  	Thread.sleep(2000);
  	m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[1]/label")).click();


  	
  	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']")).click();
  	Thread.sleep(5000);

  	m_Driver.switchTo().defaultContent();
  	

  	Reporter.log("enterLeaveDate");
  	
  	
  }
  
  
  
  
  public void enterRtiSubmission() {
	  
	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtEmployeePayId']"));
	  
	  
	    String rtiSubmission = RandomStringUtils.randomAlphabetic(40); 

	    elem.sendKeys(rtiSubmission);
	   
	   Reporter.log("enterRtiSubmission");
	  
	   
  }
  
  
  
}
