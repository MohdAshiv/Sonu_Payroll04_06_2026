package VerifyEmailsData;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cbd70e76-974d-4ac0-aa13-de9f8306d905
@TestModellerModule(guid = "cbd70e76-974d-4ac0-aa13-de9f8306d905")
public class PayrollSummaryEmail extends BasePage
{
	
	String Tax;
	String EmployeeNI;
	String EmployerNI;
	String PAYE_NI;
	String BalanceOwed;
	String Balancecarry;
	String TotalPayment;
	String SPP_SMP_Recovery;
	String NIC_Emp_Allowance;
	String SMP_SPP_Compensation;
	String SMP_SSP_Funding_Rec;
	String HMRCOverPayment;
	String CISSuffered;
	
	
	static String PDFtext="";
	
	static String getHeader;
	
	public PayrollSummaryEmail (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickEmailElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By Check_uncheck_CompanyemailaddressElem = By.xpath("//label[normalize-space()= 'Company email address']/../input[1]");

	private By SendEmailtoOtherElem = By.xpath("(.//label[normalize-space()= ''])[1]/../../div[2]/input");

	private By check_unchek_EmployeePayslipElem = By.xpath("//label[normalize-space()= 'Employee Payslip']/../input");

	private By chek_unchek_PayrollSummaryElem = By.xpath("//label[normalize-space()= 'Payroll Summary']/../input");

	private By getEmailBodyHeaderElem = By.xpath("/html/body/p[2]/i/span");

	private By clickSendElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12506");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12506");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12506");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12506";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12506")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickEmail
     * @name Click clickEmail
     */
	public void Click_clickEmail()
	{
        
		WebElement elem = getWebElement(clickEmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEmail", "Click_clickEmail failed. Unable to locate object: " + clickEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEmail", "Click_clickEmail failed. Unable to locate object: " + clickEmailElem.toString());

			Assert.fail("Unable to locate object: " + clickEmailElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEmail");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEmail");
	}
	
	
	/**
	 * Email is clicked
	 * @throws Exception 
	 */
	public void emailBtnClicked() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		String Expected=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_dvsummary']/div[2]/table/tbody/tr[1]/td[3]/label/a")).getText();
		System.out.println("Expected"+Expected);
		String Actual="Payroll Summary";
		assertEquals(Actual, Expected);
		System.out.println("I'm Clicked");
	 
	 Thread.sleep(3000);
	 TakeScreenshot.takeScreenshot(m_Driver, "Email btn Clicked"); 
	 
	 m_Driver.switchTo().defaultContent();
		
	}
	
	
	
	
	/**
	 * Get summary Data
	 * 
	 */
	public void getSummaryData() throws InterruptedException
	{
		

				  		 
		//Tax Finding
      	
      	 Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Employee NI')]//following::td/div/div")).get(4).getText();

  		System.out.println("This is Tax amount="+Tax);
      	
		 
		 

//Employee NI Finding
  		
  		 EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Employee NI')]//following::td/div/div")).get(7).getText();
       		  		
  		System.out.println("This is EmployeeNI amount="+EmployeeNI);
  		
  		
  		
  		
//Employer NI Finding
      	
      	 EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Employee NI')]//following::td/div/div")).get(9).getText();
        		  	
  		System.out.println("This is EmployerNI amount="+EmployerNI);
      	
  		
//Balance owed (b/f)
  		
  		 BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
    		  	
  		System.out.println("This is Balance owed="+BalanceOwed);
  		
  		
//Balance c/f 
  		
  		 Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
  	        		  	
  		System.out.println("This is Balance c/f="+Balancecarry);
  		
  		

//Payment DUE to HMRC				  		 
  		 PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
  
		 System.out.println("PAYE_NIValue="+PAYE_NI);
		 
		 
		 
//Getting payment done in month
		 
  		 TotalPayment=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div")).getText();

  		System.out.println("TotalAmount="+TotalPayment);
  		
  		
  	//NIC Emp Allowance
  		 NIC_Emp_Allowance=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'NIC Emp Allowance')]//following::td/div/div")).get(0).getText();
       		  	
  		System.out.println("This is NIC_Emp_Allowancevalue amount="+NIC_Emp_Allowance);

  		
//SMP/SPP Recovery
  		SPP_SMP_Recovery=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SPP Recovery')]//following::td/div/div")).get(0).getText();
	        		  	
  		System.out.println("This is SMP_SPP_Recoveryvalue amount="+SPP_SMP_Recovery);
  		
  		
  		
//SMP/SPP Compensation
  		 SMP_SPP_Compensation=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SPP Compensation')]//following::td/div/div")).get(0).getText();
	        		  	
  		System.out.println("This is SMP_SPP_Compensationvalue amount="+SMP_SPP_Compensation);
  		
  		
  		
//SMP/SSP Funding Rec.
  		 SMP_SSP_Funding_Rec=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(0).getText();
         		  	
  		System.out.println("This is SMP_SSP_Funding_Recvalue amount="+SMP_SSP_Funding_Rec);
  		
  		
//HMRC Over Payment
  		HMRCOverPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'HMRC Over Payment')]//following::td/div/div")).get(0).getText();
        		  	
 		System.out.println("This is HMRC over payment amount="+HMRCOverPayment);
     		  		

		
	}	
	
	
	/**
	 * Get CIS Suffered from summary Data
	 * 
	 */
	public void getCISfromSummaryData() throws InterruptedException
	{
//CIS Suffred
		CISSuffered=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
        		  	
 		System.out.println("This is CIS suffered value="+CISSuffered);
	}
	
	
	
	/**
	 * Take screenshot for company email check box status when Main contact not Available
	 * @throws Exception 
	 * 
	 */
	public void companycheckboxStatus() throws Exception
	{
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "Status of checkbox when Main contact not available");
		
	}
	
	
	
	/**
	 * Take screenshot for company email check box status when Main contact Available
	 * @throws Exception 
	 * 
	 */
	public void companycheckboxStatus1() throws Exception
	{
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "Status of checkbox when Main contact available");
		
	}

     
	/**
 	 * Click Check_uncheck_Companyemailaddress
     * @name Click Check_uncheck_Companyemailaddress
     */
	public void Click_Check_uncheck_Companyemailaddress()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Check_uncheck_CompanyemailaddressElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Check_uncheck_Companyemailaddress", "Click_Check_uncheck_Companyemailaddress failed. Unable to locate object: " + Check_uncheck_CompanyemailaddressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Check_uncheck_Companyemailaddress", "Click_Check_uncheck_Companyemailaddress failed. Unable to locate object: " + Check_uncheck_CompanyemailaddressElem.toString());

			Assert.fail("Unable to locate object: " + Check_uncheck_CompanyemailaddressElem.toString());
        }

		String checkboxStatus=elem.getAttribute("value");
		
		System.out.println("Companyemailaddress value="+checkboxStatus);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Check_uncheck_Companyemailaddress");

		TestModellerLogger.PassStep(m_Driver, "Click_Check_uncheck_Companyemailaddress");
	}
	
	
	/**
 	 * Click Check_uncheck_Companyemailaddress
     * @name Click Check_uncheck_Companyemailaddress
     */
	public void Click_Check_uncheck_Companyemailaddress1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Check_uncheck_CompanyemailaddressElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Check_uncheck_Companyemailaddress", "Click_Check_uncheck_Companyemailaddress failed. Unable to locate object: " + Check_uncheck_CompanyemailaddressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Check_uncheck_Companyemailaddress", "Click_Check_uncheck_Companyemailaddress failed. Unable to locate object: " + Check_uncheck_CompanyemailaddressElem.toString());

			Assert.fail("Unable to locate object: " + Check_uncheck_CompanyemailaddressElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Check_uncheck_Companyemailaddress");

		TestModellerLogger.PassStep(m_Driver, "Click_Check_uncheck_Companyemailaddress");
	}

      
	/**
 	 * Enter SendEmailtoOther
     * @name Enter SendEmailtoOther
     */
 	public void Enter_SendEmailtoOther(String SendEmailtoOther)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(SendEmailtoOtherElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SendEmailtoOther", "Enter_SendEmailtoOther failed. Unable to locate object: " + SendEmailtoOtherElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SendEmailtoOther", "Enter_SendEmailtoOther failed. Unable to locate object: " + SendEmailtoOtherElem.toString());

 			Assert.fail("Unable to locate object: " + SendEmailtoOtherElem.toString());
         }

 		elem.sendKeys(SendEmailtoOther);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SendEmailtoOther " + SendEmailtoOther);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SendEmailtoOther " + SendEmailtoOther);
 	}

     
	/**
 	 * Click check_unchek_EmployeePayslip
     * @name Click check_unchek_EmployeePayslip
     */
	public void Click_check_unchek_EmployeePayslip()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(check_unchek_EmployeePayslipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_check_unchek_EmployeePayslip", "Click_check_unchek_EmployeePayslip failed. Unable to locate object: " + check_unchek_EmployeePayslipElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_check_unchek_EmployeePayslip", "Click_check_unchek_EmployeePayslip failed. Unable to locate object: " + check_unchek_EmployeePayslipElem.toString());

			Assert.fail("Unable to locate object: " + check_unchek_EmployeePayslipElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_check_unchek_EmployeePayslip");

		TestModellerLogger.PassStep(m_Driver, "Click_check_unchek_EmployeePayslip");
	}

     
	/**
 	 * Click chek_unchek_PayrollSummary
     * @name Click chek_unchek_PayrollSummary
     */
	public void Click_chek_unchek_PayrollSummary()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(chek_unchek_PayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chek_unchek_PayrollSummary", "Click_chek_unchek_PayrollSummary failed. Unable to locate object: " + chek_unchek_PayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chek_unchek_PayrollSummary", "Click_chek_unchek_PayrollSummary failed. Unable to locate object: " + chek_unchek_PayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + chek_unchek_PayrollSummaryElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_chek_unchek_PayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_chek_unchek_PayrollSummary");
	}

     
	/**
 	 * Click getEmailBodyHeader
	 * @throws InterruptedException 
     * @name Click getEmailBodyHeader
     */
	public void Click_getEmailBodyHeader() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[1]/div[6]/div[2]/div/table/tbody/tr[2]/td/div/iframe[1]")));

		WebElement elem = getWebElement(getEmailBodyHeaderElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getEmailBodyHeader", "Click_getEmailBodyHeader failed. Unable to locate object: " + getEmailBodyHeaderElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getEmailBodyHeader", "Click_getEmailBodyHeader failed. Unable to locate object: " + getEmailBodyHeaderElem.toString());

			Assert.fail("Unable to locate object: " + getEmailBodyHeaderElem.toString());
        }

		Thread.sleep(3000);
		
		 getHeader=elem.getText();
		 
		 System.out.println("Header="+getHeader);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getEmailBodyHeader");

		TestModellerLogger.PassStep(m_Driver, "Click_getEmailBodyHeader");
	}
	
	
	
	/**
	 * verify Email header when main contact available
	 * 
	 */
	public void verifyMainContactNameinHeader()
	{
		
		String Expected="Dear Vikas Kumar";
		
		assertEquals(getHeader, Expected);
		
	}
	
	
	/**
	 * verify Email header when main contact available
	 * 
	 */
	public void verifyMainContactNameinHeader2()
	{
		
		String Expected="Dear Vikash";
		
		assertEquals(getHeader, Expected);
		
	}
	
	
	/**
	 * verify Email header when main contact not available
	 * 
	 */
	public void verifyMainContactNameinHeader1()
	{
		
		String Expected="Dear Client";
		
		assertEquals(getHeader, Expected);
		
	}
	
	
	
	/**
	 * Take screenshot for Email Header  when Main contact Available
	 * @throws Exception 
	 * 
	 */
	public void EmailHeaderSC() throws Exception
	{
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "Email Header when main contact Email");
		
	}
	
	
	
	/**
	 * Take screenshot for Email Header  when Main contact not Available
	 * @throws Exception 
	 * 
	 */
	public void EmailHeaderSC1() throws Exception
	{
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "Email Header when no main contact Email");
		
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

		elem.click();
		
		Thread.sleep(2000);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSend");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSend");
	}
	
	
	/**
	 * Verify Error msg
	 * @throws Exception 
	 * 
	 */
	public void validateError() throws Exception
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		
		String ActualMsg=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/strong")).getText();
		System.out.println("Actual Msg="+ActualMsg);
		
		String ExpectedMsg="Error!";
		
		assertEquals(ActualMsg, ExpectedMsg);
		
		TakeScreenshot.takeScreenshot(m_Driver, "when user uncheck Company Email checkbox");
		
		m_Driver.switchTo().defaultContent();
		
		
	}
	
	
	/**
	 * Verify Error msg
	 * @throws Exception 
	 * 
	 */
	public void validateError1() throws Exception
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		
		String ActualMsg=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/strong")).getText();
		System.out.println("Actual Msg="+ActualMsg);
		
		String ExpectedMsg="Error!";
		
		assertEquals(ActualMsg, ExpectedMsg);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Error when no Email in main contact");
		
		m_Driver.switchTo().defaultContent();
		
		
	}
	
	
	/**
	 * click Summary Attachment
	 * @throws InterruptedException 
	 * 
	 */
	public void summaryAttachment() throws InterruptedException
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		System.out.println("I'm switched also");
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_dvsummary']/div[2]/table/tbody/tr[1]/td[3]/label/a")).click();
		ChangeWindow.tabswitch(m_Driver);
		Thread.sleep(2000);
		
		
		m_Driver.switchTo().defaultContent();
		
	}
	
	
	/**
	 * Taking SC for Summary attachment data
	 * @throws Exception 
	 * 
	 */
	public void takeSCforSummary() throws Exception
	{
		
		 Thread.sleep(3000);
		 TakeScreenshot.takeScreenshot(m_Driver, "Summary Email Attached data"); 
		
	}
	
	
	/**
	 * Read PDF
	 * @throws IOException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void readPDF() throws IOException, AWTException, InterruptedException
	{
		
		try {
			
			
			//Download PDF
//		m_Driver.findElement(By.xpath("//*[@id='icon']/iron-icon"));
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
					Thread.sleep(1000);
					robot.keyRelease(KeyEvent.VK_ENTER);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_B);
					Thread.sleep(1000);
					robot.keyRelease(KeyEvent.VK_B);
					Thread.sleep(1000);
					robot.keyPress(KeyEvent.VK_ENTER); 
					
					robot.keyRelease(KeyEvent.VK_ENTER);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_TAB);
					Thread.sleep(1000);
					robot.keyRelease(KeyEvent.VK_TAB);
					
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_ENTER); 
					Thread.sleep(1000);
					robot.keyRelease(KeyEvent.VK_ENTER);
					Thread.sleep(2000);
//					robot.keyPress(KeyEvent.VK_ENTER); 
//					robot.keyRelease(KeyEvent.VK_ENTER);
			
			//Loading an existing document
			File file = new File("C://Users//Administrator//Downloads//b.pdf");
			PDDocument document = PDDocument.load(file);
			//Instantiate PDFTextStripper class
			PDFTextStripper pdfStripper = new PDFTextStripper();
			//Retrieving text from PDF document
			 PDFtext = pdfStripper.getText(document);
			 
    //    System.out.println(PDFtext);
			//Closing the document
			document.close();
			
			
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * Validate Attached document data		23
	 */
	public void validateAttachment()
	{
		
		String[] splitedString= PDFtext.split(" ");
		//		 String[] splitedString=new String[1];
				 System.out.println(splitedString.length);
				 for(int i=0; i<splitedString.length;i++)
				 {
					 System.out.println(splitedString[i]);
				 }
		System.out.println("Hello17="+splitedString[17]);
		assertEquals(Tax, splitedString[17]);
		
		System.out.println("Hello20="+splitedString[20]);
		assertEquals(EmployeeNI, splitedString[20]);
		
		System.out.println("Hello22="+splitedString[22]);
		Assert.assertTrue(splitedString[22].contains(EmployerNI));
		
		System.out.println("Hello33="+splitedString[33]);
		Assert.assertTrue(splitedString[33].contains(NIC_Emp_Allowance));
		
		System.out.println("Hello54="+splitedString[54]);
		Assert.assertTrue(splitedString[54].contains(HMRCOverPayment));
		
		System.out.println("Hello45="+splitedString[45]);
		Assert.assertTrue(splitedString[45].contains(BalanceOwed));
		
		System.out.println("Hello45="+splitedString[45]);
		Assert.assertTrue(splitedString[45].contains(Balancecarry));
		
		System.out.println("Hello59="+splitedString[59]);
		Assert.assertTrue(splitedString[59].contains(PAYE_NI));
		
		System.out.println("Hello68="+splitedString[68]);
		Assert.assertTrue(splitedString[68].contains(TotalPayment));
		
	}
	
	
	
	/**
	 * Validate Attached document data		23
	 * @throws IOException 
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public void validateAttachmentWhenCIS() throws IOException, InterruptedException, AWTException
	{
		
		
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
				Thread.sleep(2000);
//				robot.keyPress(KeyEvent.VK_ENTER); 
//				robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Loading an existing document
		File file = new File("C://Users//Administrator//Downloads//Employer's Summary - 2021-07-31.pdf");
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
		System.out.println("Hello94="+splitedString[87]);
		Assert.assertTrue(splitedString[87].contains(Tax));
		System.out.println("Pass1");
		System.out.println("Hello90="+splitedString[90]);
		Assert.assertTrue(splitedString[90].contains(EmployeeNI));
		System.out.println("Pass2");
		System.out.println("Hello92="+splitedString[92]);
		Assert.assertTrue(splitedString[92].contains(EmployerNI));
		System.out.println("Pass3");
		System.out.println("Hello7="+splitedString[7]);
		Assert.assertTrue(splitedString[7].contains(NIC_Emp_Allowance));
		System.out.println("Pass4");
		System.out.println("Hello34="+splitedString[34]);
		Assert.assertTrue(splitedString[34].contains(HMRCOverPayment));
		System.out.println("Pass5");
		System.out.println("Hello25="+splitedString[25]);
		Assert.assertTrue(splitedString[25].contains(BalanceOwed));
		
		System.out.println("Hello25="+splitedString[25]);
		Assert.assertTrue(splitedString[25].contains(Balancecarry));
		
		System.out.println("Hello21="+splitedString[21]);
		Assert.assertTrue(splitedString[21].contains(PAYE_NI));
		
		System.out.println("Hello42="+splitedString[42]);
		Assert.assertTrue(splitedString[42].contains(TotalPayment));
		
		System.out.println("Hello41="+splitedString[41]);
		Assert.assertTrue(splitedString[41].contains(CISSuffered));
		
	}
	
	
	/**
	 * Verify Error msg
	 * @throws Exception 
	 * 
	 */
	public void validateErrorwhenWrongRecipient() throws Exception
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		
		String ActualMsg=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/strong")).getText();
		System.out.println("Actual Msg="+ActualMsg);
		
		String ExpectedMsg="Error!";
		
		assertEquals(ActualMsg, ExpectedMsg);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Error when wrong Email of Recipient");
		
		m_Driver.switchTo().defaultContent();
		
		
	}


	public void TakefromSummary() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Summary Report Template");
		
	}
}