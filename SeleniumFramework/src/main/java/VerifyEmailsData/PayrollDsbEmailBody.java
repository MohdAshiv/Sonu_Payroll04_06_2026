package VerifyEmailsData;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/52f50f6e-73ba-447b-b145-2acdc1ea75fb
@TestModellerModule(guid = "52f50f6e-73ba-447b-b145-2acdc1ea75fb")
public class PayrollDsbEmailBody extends BasePage
{
	static String Emailheader;
	static String EmpEmailheader;
	static String ErrormsgWhenNoCheck;
	static String AlertWhenNoMainContactMail;
	static String AlertWhenNoEMPMail;
	
	
	public PayrollDsbEmailBody (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickRunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By selectPaySlipTemplateElem = By.xpath("//label[normalize-space()= 'Send Payslips:']/../select");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By clickCompany_email_addressElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkCustomerEmail']");

	private By checkboxMyselfEmailElem = By.xpath("//label[normalize-space()= 'Myself ( siva@nomisma.co.uk )']/../input[2]");

	private By checkboxPayrollSummaryElem = By.xpath("//label[normalize-space()= 'Payroll Summary']/../input");

	private By verifyPayrollSummaryElem = By.xpath("//label[normalize-space()= 'Payroll Summary']/a");

	private By getHeaderofEmailElem = By.xpath("//P[@style='font-size: 13.3333px; text-align: justify; line-height: normal;']");
	
	private By getEmpEmailHeaderElem = By.xpath("/html/body/p[1]/i/span");

	private By clickSendElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By getErrorMsgWhenNoCheckElem = By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/strong");
	
	private By Alert_MsgWhenNoMainContactElem = By.xpath("//DIV[@id='ctl00_ctl00_ParentContent_cPH_dvCompanyEmailMissingAlert']");

	private By Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_sameElem = By.xpath("//DIV[@id='ctl00_ctl00_ParentContent_cPH_dvEmployeesEmailMissingAlert']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12494");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12494");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12494");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12494";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12494")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickRunPayroll1
     * @name Click clickRunPayroll1
     */
	public void Click_clickRunPayroll1()
	{
        
		WebElement elem = getWebElement(clickRunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickRunPayroll1", "Click_clickRunPayroll1 failed. Unable to locate object: " + clickRunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickRunPayroll1", "Click_clickRunPayroll1 failed. Unable to locate object: " + clickRunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + clickRunPayroll1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickRunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_clickRunPayroll1");
	}

    
	/**
 	 * Select selectPaySlipTemplate
     * @name Select selectPaySlipTemplate
     */
    public void Select_selectPaySlipTemplate(String selectPaySlipTemplate)
 	{
 	    
 		WebElement elem = getWebElement(selectPaySlipTemplateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectPaySlipTemplate", "Select_selectPaySlipTemplate failed. Unable to locate object: " + selectPaySlipTemplateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectPaySlipTemplate", "Select_selectPaySlipTemplate failed. Unable to locate object: " + selectPaySlipTemplateElem.toString());

 			Assert.fail("Unable to locate object: " + selectPaySlipTemplateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectPaySlipTemplate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectPaySlipTemplate " + selectPaySlipTemplate);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectPaySlipTemplate " + selectPaySlipTemplate);
 	}
    
    
	/**
 	 * Click Alert_MsgWhenNoMainContact
     * @name Click Alert_MsgWhenNoMainContact
     */
	public void Click_Alert_MsgWhenNoMainContact()
	{
        
		WebElement elem = getWebElement(Alert_MsgWhenNoMainContactElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Alert_MsgWhenNoMainContact", "Click_Alert_MsgWhenNoMainContact failed. Unable to locate object: " + Alert_MsgWhenNoMainContactElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Alert_MsgWhenNoMainContact", "Click_Alert_MsgWhenNoMainContact failed. Unable to locate object: " + Alert_MsgWhenNoMainContactElem.toString());

			Assert.fail("Unable to locate object: " + Alert_MsgWhenNoMainContactElem.toString());
        }

		AlertWhenNoMainContactMail=elem.getText();
		
		System.out.println("Alert msg when no contain email="+AlertWhenNoMainContactMail);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Alert_MsgWhenNoMainContact");

		TestModellerLogger.PassStep(m_Driver, "Click_Alert_MsgWhenNoMainContact");
	}
	
	
	/**
 	 * Click Important! Some of the employee email address not registered to send payslip, Please add the same.
     * @name Click Important! Some of the employee email address not registered to send payslip, Please add the same.
     */
	public void Click_Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_same()
	{
        
		WebElement elem = getWebElement(Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_sameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_same", "Click_Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_same failed. Unable to locate object: " + Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_sameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_same", "Click_Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_same failed. Unable to locate object: " + Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_sameElem.toString());

			Assert.fail("Unable to locate object: " + Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_sameElem.toString());
        }

		AlertWhenNoEMPMail=elem.getText();
		
		System.out.println("Alert when no emp="+AlertWhenNoEMPMail);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_same");

		TestModellerLogger.PassStep(m_Driver, "Click_Important_Some_of_the_employee_email_address_not_registered_to_send_payslip_Please_add_the_same");
	}
	
	
	
	/**
	 * verify Alert Msg When no main Contact Email
	 * 
	 */
	public void verifyAlertWhenNoMainContactEmail()
	
	{
		
		String Expected="Important! Company Main Contact email address not registered to send payroll reports to employer, Please add the same.";
		
		Assert.assertTrue(AlertWhenNoMainContactMail.contains(Expected));
		
		
	}
	
	
	
	
	
	
	/**
	 * verify Alert Msg When no Emp Email
	 * 
	 */
	public void verifyAlertWhenNoEmpEmail()
	
	{
		
		String Expected="Important! Some of the employee email address not registered to send payslip, Please add the same.";
		
		Assert.assertTrue(AlertWhenNoEMPMail.contains(Expected));
		
		
	}
	
	
	
	/**
	 * Take Dump of Alert msg when No email of main contact
	 * @throws Exception 
	 */
	public void TakeSCofAlert() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "Alert msg when No Email for Main contact");
		
	}
	
	
	
	/**
	 * Take Dump of Alert msg when No email of Employee
	 * @throws Exception 
	 */
	public void TakeSCofAlertwhenNoEmp() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "Alert msg when No Email for Employee");
		
	}
	
	

     
	/**
 	 * Click RunPayroll2
	 * @throws InterruptedException 
     * @name Click RunPayroll2
     */
	public void Click_RunPayroll2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll2Elem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}

     
	/**
 	 * Click clickCompany email address
     * @name Click clickCompany email address
     */
	public void Click_clickCompany_email_address()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(clickCompany_email_addressElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickCompany_email_address", "Click_clickCompany_email_address failed. Unable to locate object: " + clickCompany_email_addressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickCompany_email_address", "Click_clickCompany_email_address failed. Unable to locate object: " + clickCompany_email_addressElem.toString());

			Assert.fail("Unable to locate object: " + clickCompany_email_addressElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickCompany_email_address");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCompany_email_address");
	}

     
	/**
 	 * Click checkboxMyselfEmail
     * @name Click checkboxMyselfEmail
     */
	public void Click_checkboxMyselfEmail()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(checkboxMyselfEmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkboxMyselfEmail", "Click_checkboxMyselfEmail failed. Unable to locate object: " + checkboxMyselfEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkboxMyselfEmail", "Click_checkboxMyselfEmail failed. Unable to locate object: " + checkboxMyselfEmailElem.toString());

			Assert.fail("Unable to locate object: " + checkboxMyselfEmailElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_checkboxMyselfEmail");

		TestModellerLogger.PassStep(m_Driver, "Click_checkboxMyselfEmail");
	}

     
	/**
 	 * Click checkboxPayrollSummary
     * @name Click checkboxPayrollSummary
     */
	public void Click_checkboxPayrollSummary()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(checkboxPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkboxPayrollSummary", "Click_checkboxPayrollSummary failed. Unable to locate object: " + checkboxPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkboxPayrollSummary", "Click_checkboxPayrollSummary failed. Unable to locate object: " + checkboxPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + checkboxPayrollSummaryElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_checkboxPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_checkboxPayrollSummary");
	}

     
	/**
 	 * Click verifyPayrollSummary
     * @name Click verifyPayrollSummary
     */
	public void Click_verifyPayrollSummary()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(verifyPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_verifyPayrollSummary", "Click_verifyPayrollSummary failed. Unable to locate object: " + verifyPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_verifyPayrollSummary", "Click_verifyPayrollSummary failed. Unable to locate object: " + verifyPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + verifyPayrollSummaryElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_verifyPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_verifyPayrollSummary");
	}
	
	
	
	/**
 	 * Click getEmpEmailHeader
     * @name Click getEmpEmailHeader
     */
	public void Click_getEmpEmailHeader()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[1]/div[5]/div[2]/div/table/tbody/tr[2]/td/div/iframe[1]")));

		WebElement elem = getWebElement(getEmpEmailHeaderElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getEmpEmailHeader", "Click_getEmpEmailHeader failed. Unable to locate object: " + getEmpEmailHeaderElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getEmpEmailHeader", "Click_getEmpEmailHeader failed. Unable to locate object: " + getEmpEmailHeaderElem.toString());

			Assert.fail("Unable to locate object: " + getEmpEmailHeaderElem.toString());
        }

		EmpEmailheader=elem.getText();
		
		System.out.println("Email header="+EmpEmailheader);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getEmpEmailHeader");

		TestModellerLogger.PassStep(m_Driver, "Click_getEmpEmailHeader");
	}

     
	/**
 	 * Click getHeaderofEmail
     * @name Click getHeaderofEmail
     */
	public void Click_getHeaderofEmail()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[1]/div[6]/div[2]/div/table/tbody/tr[2]/td/div/iframe[1]")));

		WebElement elem = getWebElement(getHeaderofEmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getHeaderofEmail", "Click_getHeaderofEmail failed. Unable to locate object: " + getHeaderofEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getHeaderofEmail", "Click_getHeaderofEmail failed. Unable to locate object: " + getHeaderofEmailElem.toString());

			Assert.fail("Unable to locate object: " + getHeaderofEmailElem.toString());
        }

		 Emailheader=elem.getText();
		
		System.out.println("Email header="+Emailheader);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getHeaderofEmail");

		TestModellerLogger.PassStep(m_Driver, "Click_getHeaderofEmail");
	}
	
	
	/**
	 * Verify Email header
	 * 
	 */
	public void VerifyemailHeader()
	{
		
		String Expected="Dear Vikash Kumar";
		
		assertEquals(Emailheader, Expected, "Email header did not matched ");
		
	}
	
	
	/**
	 * Verify Email header
	 * 
	 */
	public void VerifyEmpemailHeader()
	{
		
		String Expected="Dear Vikas";
		
		assertEquals(EmpEmailheader, Expected, "Email header did not matched ");
		
	}

     
	/**
 	 * Click clickSend
	 * @throws InterruptedException 
     * @name Click clickSend
     */
	public void Click_clickSend() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(clickSendElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSend", "Click_clickSend failed. Unable to locate object: " + clickSendElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSend", "Click_clickSend failed. Unable to locate object: " + clickSendElem.toString());

			Assert.fail("Unable to locate object: " + clickSendElem.toString());
        }
		Thread.sleep(1000);
jsExec.executeScript("arguments[0].click();", elem);
//		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSend");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSend");
	}
	
	
	
	
	/**
 	 * Click getErrorMsgWhenNoCheck
     * @name Click getErrorMsgWhenNoCheck
     */
	public void Click_getErrorMsgWhenNoCheck()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(getErrorMsgWhenNoCheckElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getErrorMsgWhenNoCheck", "Click_getErrorMsgWhenNoCheck failed. Unable to locate object: " + getErrorMsgWhenNoCheckElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getErrorMsgWhenNoCheck", "Click_getErrorMsgWhenNoCheck failed. Unable to locate object: " + getErrorMsgWhenNoCheckElem.toString());

			Assert.fail("Unable to locate object: " + getErrorMsgWhenNoCheckElem.toString());
        }

		ErrormsgWhenNoCheck= elem.getText();
		
//		ErrormsgWhenNoCheck=ErrormsgWhenNoCheck.replaceAll("[×]", "");
//		ErrormsgWhenNoCheck=ErrormsgWhenNoCheck.replaceAll("[ ]", "");
		
		System.out.println("Error msg when No check to Main Contact="+ErrormsgWhenNoCheck);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getErrorMsgWhenNoCheck");

		TestModellerLogger.PassStep(m_Driver, "Click_getErrorMsgWhenNoCheck");
	}
	
	
	/**
	 * verify Error Msg When no Check to company Email
	 * 
	 */
	public void verifyErrormsgWhenNoCheckToComp()
	
	{
		
		String Expected="Error!";
		
		Assert.assertTrue(ErrormsgWhenNoCheck.contains(Expected));
		
		
	}


	public void TakeSConDSB() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "DSB Template");
		
	}
}