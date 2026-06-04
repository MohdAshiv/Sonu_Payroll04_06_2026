package NewPages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/eeb816f9-930e-49bc-be69-fcfbb31e25b7
@TestModellerModule(guid = "eeb816f9-930e-49bc-be69-fcfbb31e25b7")
public class Individual_employee_pay_schedule extends BasePage
{
	public Individual_employee_pay_schedule (WebDriver driver)
	{
		super(driver);
	}


	
	private By Individual_Employee_Pay_ScheduleElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportEmployeePayHistoryDeatils']");

	private By ctl00ctl00ParentContentcPHFilterddlEmployeeElem = By.xpath("//label[normalize-space()= 'Employee :']/../div/select");

	private By PeriodElem = By.xpath("//TH[contains(text(),'Period')]");

	private By Tax_CodeElem = By.xpath("//TH[contains(text(),'Tax Code')]");

	private By Gross_PayElem = By.xpath("//TH[contains(text(),'Gross Pay')]");

	private By DeductionsElem = By.xpath("//TH[contains(text(),'Deductions')]");

	private By Income_TaxElem = By.xpath("//TH[contains(text(),'Income Tax')]");

	private By EE_NIElem = By.xpath("//TH[contains(text(),'EE NI')]");

	private By EE_PensionElem = By.xpath("//TH[contains(text(),'EE Pension')]");

	private By Student_LoanElem = By.xpath("//TH[contains(text(),'Student Loan')]");

	private By Post_Grad_LoanElem = By.xpath("//TH[contains(text(),'Post Grad Loan')]");

	private By Net_PayElem = By.xpath("//TH[contains(text(),'Net Pay')]");

	private By ER_NIElem = By.xpath("//TH[contains(text(),'ER NI')]");

	private By ER_PensionElem = By.xpath("//TH[contains(text(),'ER Pension')]");

	private By ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecordElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$ReportEmployeePayHistoryDeatilsUC$SelectAllRecord']");

	private By TotalElem = By.xpath("//TD[contains(text(),'Total')]");

	private By _150000_Elem = By.xpath("//TD[@class='text-right el-selection']");

	private By _000Elem = By.xpath("//TD[@class='text-right el-selection']");

	private By _Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");

	private By __1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_A1']");

	private By _EmailElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By Download_PayslipElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$btnDownloadPayslips']");

	private By ctl00ctl00ParentContentcpHeaderRightEmailTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$EmailType']");

	private By Employer_ViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=12070");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=12070");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=12070");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=12070";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=12070")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Individual Employee Pay Schedule
     * @name Click Individual Employee Pay Schedule
     */
	public void Click_Individual_Employee_Pay_Schedule()
	{
        
		WebElement elem = getWebElement(Individual_Employee_Pay_ScheduleElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Individual_Employee_Pay_Schedule", "Click_Individual_Employee_Pay_Schedule failed. Unable to locate object: " + Individual_Employee_Pay_ScheduleElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Individual_Employee_Pay_Schedule", "Click_Individual_Employee_Pay_Schedule failed. Unable to locate object: " + Individual_Employee_Pay_ScheduleElem.toString());

			Assert.fail("Unable to locate object: " + Individual_Employee_Pay_ScheduleElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Individual_Employee_Pay_Schedule");

		TestModellerLogger.PassStep(m_Driver, "Click_Individual_Employee_Pay_Schedule");
	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployee
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployee
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlEmployee(String ctl00ctl00ParentContentcPHFilterddlEmployee)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlEmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee", "Select_ctl00ctl00ParentContentcPHFilterddlEmployee failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee", "Select_ctl00ctl00ParentContentcPHFilterddlEmployee failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlEmployee);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee " + ctl00ctl00ParentContentcPHFilterddlEmployee);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee " + ctl00ctl00ParentContentcPHFilterddlEmployee);
 	}

     
	/**
 	 * Click Period
     * @name Click Period
     */
	public void Click_Period()
	{
        
		WebElement elem = getWebElement(PeriodElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Period", "Click_Period failed. Unable to locate object: " + PeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Period", "Click_Period failed. Unable to locate object: " + PeriodElem.toString());

			Assert.fail("Unable to locate object: " + PeriodElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Period");

		TestModellerLogger.PassStep(m_Driver, "Click_Period");
	}

     
	/**
 	 * Click Tax Code
     * @name Click Tax Code
     */
	public void Click_Tax_Code()
	{
        
		WebElement elem = getWebElement(Tax_CodeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tax_Code", "Click_Tax_Code failed. Unable to locate object: " + Tax_CodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tax_Code", "Click_Tax_Code failed. Unable to locate object: " + Tax_CodeElem.toString());

			Assert.fail("Unable to locate object: " + Tax_CodeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tax_Code");

		TestModellerLogger.PassStep(m_Driver, "Click_Tax_Code");
	}

     
	/**
 	 * Click Gross Pay
     * @name Click Gross Pay
     */
	public void Click_Gross_Pay()
	{
        
		WebElement elem = getWebElement(Gross_PayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Gross_Pay", "Click_Gross_Pay failed. Unable to locate object: " + Gross_PayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Gross_Pay", "Click_Gross_Pay failed. Unable to locate object: " + Gross_PayElem.toString());

			Assert.fail("Unable to locate object: " + Gross_PayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Gross_Pay");

		TestModellerLogger.PassStep(m_Driver, "Click_Gross_Pay");
	}

     
	/**
 	 * Click Deductions
     * @name Click Deductions
     */
	public void Click_Deductions()
	{
        
		WebElement elem = getWebElement(DeductionsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Deductions", "Click_Deductions failed. Unable to locate object: " + DeductionsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Deductions", "Click_Deductions failed. Unable to locate object: " + DeductionsElem.toString());

			Assert.fail("Unable to locate object: " + DeductionsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Deductions");

		TestModellerLogger.PassStep(m_Driver, "Click_Deductions");
	}

     
	/**
 	 * Click Income Tax
     * @name Click Income Tax
     */
	public void Click_Income_Tax()
	{
        
		WebElement elem = getWebElement(Income_TaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Tax", "Click_Income_Tax failed. Unable to locate object: " + Income_TaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Tax", "Click_Income_Tax failed. Unable to locate object: " + Income_TaxElem.toString());

			Assert.fail("Unable to locate object: " + Income_TaxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Tax");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Tax");
	}

     
	/**
 	 * Click EE NI
     * @name Click EE NI
     */
	public void Click_EE_NI()
	{
        
		WebElement elem = getWebElement(EE_NIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EE_NI", "Click_EE_NI failed. Unable to locate object: " + EE_NIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EE_NI", "Click_EE_NI failed. Unable to locate object: " + EE_NIElem.toString());

			Assert.fail("Unable to locate object: " + EE_NIElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EE_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_EE_NI");
	}

     
	/**
 	 * Click EE Pension
     * @name Click EE Pension
     */
	public void Click_EE_Pension()
	{
        
		WebElement elem = getWebElement(EE_PensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EE_Pension", "Click_EE_Pension failed. Unable to locate object: " + EE_PensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EE_Pension", "Click_EE_Pension failed. Unable to locate object: " + EE_PensionElem.toString());

			Assert.fail("Unable to locate object: " + EE_PensionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EE_Pension");

		TestModellerLogger.PassStep(m_Driver, "Click_EE_Pension");
	}

     
	/**
 	 * Click Student Loan
     * @name Click Student Loan
     */
	public void Click_Student_Loan()
	{
        
		WebElement elem = getWebElement(Student_LoanElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Student_Loan", "Click_Student_Loan failed. Unable to locate object: " + Student_LoanElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Student_Loan", "Click_Student_Loan failed. Unable to locate object: " + Student_LoanElem.toString());

			Assert.fail("Unable to locate object: " + Student_LoanElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Student_Loan");

		TestModellerLogger.PassStep(m_Driver, "Click_Student_Loan");
	}

     
	/**
 	 * Click Post Grad Loan
     * @name Click Post Grad Loan
     */
	public void Click_Post_Grad_Loan()
	{
        
		WebElement elem = getWebElement(Post_Grad_LoanElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Post_Grad_Loan", "Click_Post_Grad_Loan failed. Unable to locate object: " + Post_Grad_LoanElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Post_Grad_Loan", "Click_Post_Grad_Loan failed. Unable to locate object: " + Post_Grad_LoanElem.toString());

			Assert.fail("Unable to locate object: " + Post_Grad_LoanElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Post_Grad_Loan");

		TestModellerLogger.PassStep(m_Driver, "Click_Post_Grad_Loan");
	}

     
	/**
 	 * Click Net Pay
     * @name Click Net Pay
     */
	public void Click_Net_Pay()
	{
        
		WebElement elem = getWebElement(Net_PayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Net_Pay", "Click_Net_Pay failed. Unable to locate object: " + Net_PayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Net_Pay", "Click_Net_Pay failed. Unable to locate object: " + Net_PayElem.toString());

			Assert.fail("Unable to locate object: " + Net_PayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Net_Pay");

		TestModellerLogger.PassStep(m_Driver, "Click_Net_Pay");
	}

     
	/**
 	 * Click ER NI
     * @name Click ER NI
     */
	public void Click_ER_NI()
	{
        
		WebElement elem = getWebElement(ER_NIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ER_NI", "Click_ER_NI failed. Unable to locate object: " + ER_NIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ER_NI", "Click_ER_NI failed. Unable to locate object: " + ER_NIElem.toString());

			Assert.fail("Unable to locate object: " + ER_NIElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ER_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_ER_NI");
	}

     
	/**
 	 * Click ER Pension
     * @name Click ER Pension
     */
	public void Click_ER_Pension()
	{
        
		WebElement elem = getWebElement(ER_PensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ER_Pension", "Click_ER_Pension failed. Unable to locate object: " + ER_PensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ER_Pension", "Click_ER_Pension failed. Unable to locate object: " + ER_PensionElem.toString());

			Assert.fail("Unable to locate object: " + ER_PensionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ER_Pension");

		TestModellerLogger.PassStep(m_Driver, "Click_ER_Pension");
	}

     
	/**
 	 * Click ctl00$ctl00$ParentContent$cPH$ReportEmployeePayHistoryDeatilsUC$SelectAllRecord
     * @name Click ctl00$ctl00$ParentContent$cPH$ReportEmployeePayHistoryDeatilsUC$SelectAllRecord
     */
	public void Click_ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecord()
	{
        
		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecordElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecord", "Click_ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecord failed. Unable to locate object: " + ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecord", "Click_ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecord failed. Unable to locate object: " + ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecordElem.toString());

			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecordElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecord");

		TestModellerLogger.PassStep(m_Driver, "Click_ctl00ctl00ParentContentcPHReportEmployeePayHistoryDeatilsUCSelectAllRecord");
	}

     
	/**
 	 * Click Total
     * @name Click Total
     */
	public void Click_Total()
	{
        
		WebElement elem = getWebElement(TotalElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Total", "Click_Total failed. Unable to locate object: " + TotalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Total", "Click_Total failed. Unable to locate object: " + TotalElem.toString());

			Assert.fail("Unable to locate object: " + TotalElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Total");

		TestModellerLogger.PassStep(m_Driver, "Click_Total");
	}

     
	/**
 	 * Click  £1,500.00 
     * @name Click  £1,500.00 
     */
	public void Click__150000_()
	{
        
		WebElement elem = getWebElement(_150000_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__150000_", "Click__150000_ failed. Unable to locate object: " + _150000_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__150000_", "Click__150000_ failed. Unable to locate object: " + _150000_Elem.toString());

			Assert.fail("Unable to locate object: " + _150000_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__150000_");

		TestModellerLogger.PassStep(m_Driver, "Click__150000_");
	}

     
	/**
 	 * Click  £0.00
     * @name Click  £0.00
     */
	public void Click__000()
	{
        
		WebElement elem = getWebElement(_000Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__000", "Click__000 failed. Unable to locate object: " + _000Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__000", "Click__000 failed. Unable to locate object: " + _000Elem.toString());

			Assert.fail("Unable to locate object: " + _000Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__000");

		TestModellerLogger.PassStep(m_Driver, "Click__000");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click___1()
	{
        
		WebElement elem = getWebElement(__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

			Assert.fail("Unable to locate object: " + __1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click___1");

		TestModellerLogger.PassStep(m_Driver, "Click___1");
	}

     
	/**
 	 * Click  Email
     * @name Click  Email
     */
	public void Click__Email()
	{
        
		WebElement elem = getWebElement(_EmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Email", "Click__Email failed. Unable to locate object: " + _EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Email", "Click__Email failed. Unable to locate object: " + _EmailElem.toString());

			Assert.fail("Unable to locate object: " + _EmailElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Email");

		TestModellerLogger.PassStep(m_Driver, "Click__Email");
	}

     
	/**
 	 * Click Download Payslip
     * @name Click Download Payslip
     */
	public void Click_Download_Payslip()
	{
        
		WebElement elem = getWebElement(Download_PayslipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Download_Payslip", "Click_Download_Payslip failed. Unable to locate object: " + Download_PayslipElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Download_Payslip", "Click_Download_Payslip failed. Unable to locate object: " + Download_PayslipElem.toString());

			Assert.fail("Unable to locate object: " + Download_PayslipElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Download_Payslip");

		TestModellerLogger.PassStep(m_Driver, "Click_Download_Payslip");
	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cpHeaderRight$EmailType
     * @name Select ctl00$ctl00$ParentContent$cpHeaderRight$EmailType
     */
    public void Select_ctl00ctl00ParentContentcpHeaderRightEmailType(String ctl00ctl00ParentContentcpHeaderRightEmailType)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcpHeaderRightEmailTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType", "Select_ctl00ctl00ParentContentcpHeaderRightEmailType failed. Unable to locate object: " + ctl00ctl00ParentContentcpHeaderRightEmailTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType", "Select_ctl00ctl00ParentContentcpHeaderRightEmailType failed. Unable to locate object: " + ctl00ctl00ParentContentcpHeaderRightEmailTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcpHeaderRightEmailTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcpHeaderRightEmailType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType " + ctl00ctl00ParentContentcpHeaderRightEmailType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcpHeaderRightEmailType " + ctl00ctl00ParentContentcpHeaderRightEmailType);
 	}

     
	/**
 	 * Click Employer View
     * @name Click Employer View
     */
	public void Click_Employer_View()
	{
        
		WebElement elem = getWebElement(Employer_ViewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

			Assert.fail("Unable to locate object: " + Employer_ViewElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Employer_View");

		TestModellerLogger.PassStep(m_Driver, "Click_Employer_View");
	}
}