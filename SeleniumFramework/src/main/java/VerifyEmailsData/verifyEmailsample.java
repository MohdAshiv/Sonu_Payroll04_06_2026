package VerifyEmailsData;

import pages.BasePage;

import static org.testng.Assert.assertTrue;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import utilities.read_PDF_fromurl;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/af0d506c-3608-46ae-87a3-e0bed5c5747e
@TestModellerModule(guid = "af0d506c-3608-46ae-87a3-e0bed5c5747e")
public class verifyEmailsample extends BasePage
{
	
	String PDFtext="";
	
	public verifyEmailsample (WebDriver driver)
	{
		super(driver);
	}


	
	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By SelecttoMainContactElem = By.xpath("//label[contains(.,'Send Payslips:')]/../select");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By openPayrollSummaryElem = By.xpath("//label[contains(.,'Payroll Summary')]/a");

	private By clickSendElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickPayrollSummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefPayrollSummary']");

	private By getPaymentsElem = By.xpath("//DIV[@style='width:24.10mm;min-width: 24.10mm;']");

	private By getTaxElem = By.xpath("//DIV[@style='width:17.55mm;min-width: 17.55mm;']");

	private By getStudentloanElem = By.xpath("//DIV[@style='width:23.54mm;min-width: 23.54mm;']");

	private By getPGloanElem = By.xpath("//DIV[@style='width:23.24mm;min-width: 23.24mm;']");

	private By getEE_NIElem = By.xpath("//DIV[@style='width:24.76mm;min-width: 24.76mm;']");

	private By getNetPayElem = By.xpath("//DIV[@style='width:21.85mm;min-width: 21.85mm;']");

	private By getER_NIElem = By.xpath("//DIV[@style='width:25.55mm;min-width: 25.55mm;']");

	private By getEE_NISummaryElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[2]/td[5]/div/div");

	private By getHMRC_over_PaymentElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[3]/td[6]/div/div");

	private By getER_NISummaryElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[6]/td[4]/div/div");

	private By getB_FElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[7]/td[4]/div/div");

	private By getNIC_EMP_AllowanceElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[9]/td[4]/div/div");

	private By getC_FElem = By.xpath("//DIV[@style='width:35.83mm;min-width: 35.83mm;']");

	private By getSMPSSPRecoveryElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[14]/td[4]/div/div");

	private By getSMPSPPCompensationElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[19]/td[3]/div/div");

	private By getFunding_RecElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[22]/td[5]/div/div");

	private By getTotalNIElem = By.xpath("(//*[@type='text']//following::div)[141]");

	private By getNETPAIDtoStaffElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[28]/td[5]/div/div");

	private By getPAYE_TaxElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[30]/td[3]/div/div");

	private By PayeNIDueHMRCElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[33]/td[6]/div/div");

	private By getTax_Refund_FundingElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[35]/td[3]/div/div");

	private By getPayment_for_MonthElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[38]/td[8]/div/div");

	private By getStudent_Loan_RepayElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[41]/td[3]/div/div");

	private By getTotalCostforthePeriodElem = By.xpath("(//*[@type='text']//following::div)[169]");

	private By getPG_loan_RepayElem = By.xpath("//DIV[@style='width:23.81mm;min-width: 23.81mm;']");

	private By getTotal_TaxElem = By.xpath("//DIV[@style='width:23.59mm;min-width: 23.59mm;']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12261");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12261");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12261");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12261";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12261")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click RunPayroll1
     * @name Click RunPayroll1
     */
	public void Click_RunPayroll1()
	{
        
		WebElement elem = getWebElement(RunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll1");
	}

    
	/**
 	 * Select SelecttoMainContact
     * @name Select SelecttoMainContact
     */
    public void Select_SelecttoMainContact(String SelecttoMainContact)
 	{
 	    
 		WebElement elem = getWebElement(SelecttoMainContactElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelecttoMainContact", "Select_SelecttoMainContact failed. Unable to locate object: " + SelecttoMainContactElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelecttoMainContact", "Select_SelecttoMainContact failed. Unable to locate object: " + SelecttoMainContactElem.toString());

 			Assert.fail("Unable to locate object: " + SelecttoMainContactElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelecttoMainContact);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelecttoMainContact " + SelecttoMainContact);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelecttoMainContact " + SelecttoMainContact);
 	}

     
	/**
 	 * Click RunPayroll2
     * @name Click RunPayroll2
     */
	public void Click_RunPayroll2()
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}

     
	/**
 	 * Click openPayrollSummary
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click openPayrollSummary
     */
	public void Click_openPayrollSummary() throws InterruptedException, IOException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(openPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_openPayrollSummary", "Click_openPayrollSummary failed. Unable to locate object: " + openPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_openPayrollSummary", "Click_openPayrollSummary failed. Unable to locate object: " + openPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + openPayrollSummaryElem.toString());
        }

		elem.click();
//		
//		String getURL=m_Driver.getCurrentUrl();
//		System.out.println("PDF URL="+getURL);
		
////		Thread.sleep(3000);
////		
////		String currentURL="http://sandbox4.nomismasolution.co.uk/PayrollUI/AccessFiles.aspx?type=paysummary&id=1105014&PayrollCompanyCode=12261";
////		
////		String data=read_PDF_fromurl.readPDFInURL(currentURL);
////		
////		System.out.println("data="+data);
//		
		
		
//		session().keyDownNative("17"); // Stands for CTRL key
//
//	    session().keyPressNative("65"); // Stands for A "ascii code for A"
//
//	    session().keyUpNative("17"); //Releases CTRL key
//
//	    Thread.sleep(1000);
//
//	    session().keyDownNative("17"); // Stands for CTRL key
//
//	    session().keyPressNative("67"); // Stands for C "ascii code for C"
//
//	    session().keyUpNative("17"); //Releases CTRL key
//
//	    TextTransfer textTransfer = new TextTransfer();
		
//		
//		Actions builder = new Actions(m_Driver);
//		
//	//	builder.keyDown("17");
//		builder.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
//		builder.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
//		
//		builder.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
//	
//		
		
		//Loading an existing document
	      File file = new File("D://1.pdf");
	      PDDocument document = PDDocument.load(file);
	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();
	      //Retrieving text from PDF document
	      String text = pdfStripper.getText(document);
	      System.out.println(text);
	      //Closing the document
	      document.close();
	   

		
		
		Thread.sleep(5000);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_openPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_openPayrollSummary");
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
 	 * Click clickPayrollSummary
	 * @throws IOException 
     * @name Click clickPayrollSummary
     */
	public void Click_clickPayrollSummary() throws IOException
	{
        
		WebElement elem = getWebElement(clickPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSummaryElem.toString());
        }

		elem.click();
		
		
		//Loading an existing document
	      File file = new File("D://1.pdf");
	      PDDocument document = PDDocument.load(file);
	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();
	      //Retrieving text from PDF document
	       PDFtext = pdfStripper.getText(document);
	//      System.out.println(PDFtext);
	      //Closing the document
	      document.close();
	   
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSummary");
	}

     
	/**
 	 * Click getPayments
     * @name Click getPayments
     */
	public void Click_getPayments()
	{
        
		WebElement elem = getWebElement(getPaymentsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPayments", "Click_getPayments failed. Unable to locate object: " + getPaymentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPayments", "Click_getPayments failed. Unable to locate object: " + getPaymentsElem.toString());

			Assert.fail("Unable to locate object: " + getPaymentsElem.toString());
        }

		String Payments=elem.getText();
		System.out.println("Payments="+Payments);
          	
		Assert.assertTrue(PDFtext.contains(Payments));

		ExtentReportManager.passStep(m_Driver, "Click_getPayments");

		TestModellerLogger.PassStep(m_Driver, "Click_getPayments");
	}

     
	/**
 	 * Click getTax
     * @name Click getTax
     */
	public void Click_getTax()
	{
        
		WebElement elem = getWebElement(getTaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTax", "Click_getTax failed. Unable to locate object: " + getTaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTax", "Click_getTax failed. Unable to locate object: " + getTaxElem.toString());

			Assert.fail("Unable to locate object: " + getTaxElem.toString());
        }

		String Tax=elem.getText();
		System.out.println("Tax="+Tax); 	
		Assert.assertTrue(PDFtext.contains(Tax));

		ExtentReportManager.passStep(m_Driver, "Click_getTax");

		TestModellerLogger.PassStep(m_Driver, "Click_getTax");
	}

     
	/**
 	 * Click getStudentloan
     * @name Click getStudentloan
     */
	public void Click_getStudentloan()
	{
        
		WebElement elem = getWebElement(getStudentloanElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getStudentloan", "Click_getStudentloan failed. Unable to locate object: " + getStudentloanElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getStudentloan", "Click_getStudentloan failed. Unable to locate object: " + getStudentloanElem.toString());

			Assert.fail("Unable to locate object: " + getStudentloanElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_getStudentloan");

		TestModellerLogger.PassStep(m_Driver, "Click_getStudentloan");
	}

     
	/**
 	 * Click getPGloan
     * @name Click getPGloan
     */
	public void Click_getPGloan()
	{
        
		WebElement elem = getWebElement(getPGloanElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPGloan", "Click_getPGloan failed. Unable to locate object: " + getPGloanElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPGloan", "Click_getPGloan failed. Unable to locate object: " + getPGloanElem.toString());

			Assert.fail("Unable to locate object: " + getPGloanElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPGloan");

		TestModellerLogger.PassStep(m_Driver, "Click_getPGloan");
	}

     
	/**
 	 * Click getEE_NI
     * @name Click getEE_NI
     */
	public void Click_getEE_NI()
	{
        
		WebElement elem = getWebElement(getEE_NIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getEE_NI", "Click_getEE_NI failed. Unable to locate object: " + getEE_NIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getEE_NI", "Click_getEE_NI failed. Unable to locate object: " + getEE_NIElem.toString());

			Assert.fail("Unable to locate object: " + getEE_NIElem.toString());
        }

		String EE_NI=elem.getText();
		System.out.println("EE_NI="+EE_NI); 
		Assert.assertTrue(PDFtext.contains(EE_NI));

		ExtentReportManager.passStep(m_Driver, "Click_getEE_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_getEE_NI");
	}

     
	/**
 	 * Click getNetPay
     * @name Click getNetPay
     */
	public void Click_getNetPay()
	{
        
		WebElement elem = getWebElement(getNetPayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getNetPay", "Click_getNetPay failed. Unable to locate object: " + getNetPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getNetPay", "Click_getNetPay failed. Unable to locate object: " + getNetPayElem.toString());

			Assert.fail("Unable to locate object: " + getNetPayElem.toString());
        }

		String NetPay=elem.getText();
		System.out.println("NetPay="+NetPay);
		Assert.assertTrue(PDFtext.contains(NetPay));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getNetPay");

		TestModellerLogger.PassStep(m_Driver, "Click_getNetPay");
	}

     
	/**
 	 * Click getER_NI
     * @name Click getER_NI
     */
	public void Click_getER_NI()
	{
        
		WebElement elem = getWebElement(getER_NIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getER_NI", "Click_getER_NI failed. Unable to locate object: " + getER_NIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getER_NI", "Click_getER_NI failed. Unable to locate object: " + getER_NIElem.toString());

			Assert.fail("Unable to locate object: " + getER_NIElem.toString());
        }

		String ER_NI=elem.getText();
		System.out.println("ER_NI="+ER_NI);
		Assert.assertTrue(PDFtext.contains(ER_NI));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getER_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_getER_NI");
	}

     
	/**
 	 * Click getEE_NISummary
     * @name Click getEE_NISummary
     */
	public void Click_getEE_NISummary()
	{
        
		WebElement elem = getWebElement(getEE_NISummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getEE_NISummary", "Click_getEE_NISummary failed. Unable to locate object: " + getEE_NISummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getEE_NISummary", "Click_getEE_NISummary failed. Unable to locate object: " + getEE_NISummaryElem.toString());

			Assert.fail("Unable to locate object: " + getEE_NISummaryElem.toString());
        }

		String EE_NI_Summary=elem.getText();
		System.out.println("EE_NI_Summary="+EE_NI_Summary);
		Assert.assertTrue(PDFtext.contains(EE_NI_Summary));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getEE_NISummary");

		TestModellerLogger.PassStep(m_Driver, "Click_getEE_NISummary");
	}

     
	/**
 	 * Click getHMRC over Payment
     * @name Click getHMRC over Payment
     */
	public void Click_getHMRC_over_Payment()
	{
        
		WebElement elem = getWebElement(getHMRC_over_PaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getHMRC_over_Payment", "Click_getHMRC_over_Payment failed. Unable to locate object: " + getHMRC_over_PaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getHMRC_over_Payment", "Click_getHMRC_over_Payment failed. Unable to locate object: " + getHMRC_over_PaymentElem.toString());

			Assert.fail("Unable to locate object: " + getHMRC_over_PaymentElem.toString());
        }

		String HMRC_over_Payment=elem.getText();
		System.out.println("HMRC_over_Payment="+HMRC_over_Payment);
		Assert.assertTrue(PDFtext.contains(HMRC_over_Payment));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getHMRC_over_Payment");

		TestModellerLogger.PassStep(m_Driver, "Click_getHMRC_over_Payment");
	}

     
	/**
 	 * Click getER_NISummary
     * @name Click getER_NISummary
     */
	public void Click_getER_NISummary()
	{
        
		WebElement elem = getWebElement(getER_NISummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getER_NISummary", "Click_getER_NISummary failed. Unable to locate object: " + getER_NISummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getER_NISummary", "Click_getER_NISummary failed. Unable to locate object: " + getER_NISummaryElem.toString());

			Assert.fail("Unable to locate object: " + getER_NISummaryElem.toString());
        }

		String ER_NI_Summary=elem.getText();
		System.out.println("ER_NI_Summary="+ER_NI_Summary);
		Assert.assertTrue(PDFtext.contains(ER_NI_Summary));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getER_NISummary");

		TestModellerLogger.PassStep(m_Driver, "Click_getER_NISummary");
	}

     
	/**
 	 * Click getB_F
     * @name Click getB_F
     */
	public void Click_getB_F()
	{
        
		WebElement elem = getWebElement(getB_FElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getB_F", "Click_getB_F failed. Unable to locate object: " + getB_FElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getB_F", "Click_getB_F failed. Unable to locate object: " + getB_FElem.toString());

			Assert.fail("Unable to locate object: " + getB_FElem.toString());
        }

		String B_F=elem.getText();
		System.out.println("B_F="+B_F);
		Assert.assertTrue(PDFtext.contains(B_F));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getB_F");

		TestModellerLogger.PassStep(m_Driver, "Click_getB_F");
	}

     
	/**
 	 * Click getNIC EMP Allowance
     * @name Click getNIC EMP Allowance
     */
	public void Click_getNIC_EMP_Allowance()
	{
        
		WebElement elem = getWebElement(getNIC_EMP_AllowanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getNIC_EMP_Allowance", "Click_getNIC_EMP_Allowance failed. Unable to locate object: " + getNIC_EMP_AllowanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getNIC_EMP_Allowance", "Click_getNIC_EMP_Allowance failed. Unable to locate object: " + getNIC_EMP_AllowanceElem.toString());

			Assert.fail("Unable to locate object: " + getNIC_EMP_AllowanceElem.toString());
        }

		String NIC_EMP_Allowance=elem.getText();
		System.out.println("NIC_EMP_Allowance="+NIC_EMP_Allowance);
		Assert.assertTrue(PDFtext.contains(NIC_EMP_Allowance));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getNIC_EMP_Allowance");

		TestModellerLogger.PassStep(m_Driver, "Click_getNIC_EMP_Allowance");
	}

     
	/**
 	 * Click £getC_F
     * @name Click £getC_F
     */
	public void Click_getC_F()
	{
        
		WebElement elem = getWebElement(getC_FElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getC_F", "Click_getC_F failed. Unable to locate object: " + getC_FElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getC_F", "Click_getC_F failed. Unable to locate object: " + getC_FElem.toString());

			Assert.fail("Unable to locate object: " + getC_FElem.toString());
        }

		String C_F=elem.getText();
		System.out.println("C_F="+C_F);
		Assert.assertTrue(PDFtext.contains(C_F));
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_getC_F");

		TestModellerLogger.PassStep(m_Driver, "Click_getC_F");
	}

     
	/**
 	 * Click getSMP/SSPRecovery
     * @name Click getSMP/SSPRecovery
     */
	public void Click_getSMPSSPRecovery()
	{
        
		WebElement elem = getWebElement(getSMPSSPRecoveryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getSMPSSPRecovery", "Click_getSMPSSPRecovery failed. Unable to locate object: " + getSMPSSPRecoveryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getSMPSSPRecovery", "Click_getSMPSSPRecovery failed. Unable to locate object: " + getSMPSSPRecoveryElem.toString());

			Assert.fail("Unable to locate object: " + getSMPSSPRecoveryElem.toString());
        }

		String SMPSSPRecovery=elem.getText();
		System.out.println("SMPSSPRecovery="+SMPSSPRecovery);
		Assert.assertTrue(PDFtext.contains(SMPSSPRecovery));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getSMPSSPRecovery");

		TestModellerLogger.PassStep(m_Driver, "Click_getSMPSSPRecovery");
	}

     
	/**
 	 * Click getSMP/SPPCompensation
     * @name Click getSMP/SPPCompensation
     */
	public void Click_getSMPSPPCompensation()
	{
        
		WebElement elem = getWebElement(getSMPSPPCompensationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getSMPSPPCompensation", "Click_getSMPSPPCompensation failed. Unable to locate object: " + getSMPSPPCompensationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getSMPSPPCompensation", "Click_getSMPSPPCompensation failed. Unable to locate object: " + getSMPSPPCompensationElem.toString());

			Assert.fail("Unable to locate object: " + getSMPSPPCompensationElem.toString());
        }

		String SMPSPPCompensation=elem.getText();
		System.out.println("SMPSPPCompensation="+SMPSPPCompensation);
		Assert.assertTrue(PDFtext.contains(SMPSPPCompensation));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getSMPSPPCompensation");

		TestModellerLogger.PassStep(m_Driver, "Click_getSMPSPPCompensation");
	}

     
	/**
 	 * Click getFunding Rec
     * @name Click getFunding Rec
     */
	public void Click_getFunding_Rec()
	{
        
		WebElement elem = getWebElement(getFunding_RecElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getFunding_Rec", "Click_getFunding_Rec failed. Unable to locate object: " + getFunding_RecElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getFunding_Rec", "Click_getFunding_Rec failed. Unable to locate object: " + getFunding_RecElem.toString());

			Assert.fail("Unable to locate object: " + getFunding_RecElem.toString());
        }


		String Funding_Rec=elem.getText();
		System.out.println("Funding_Rec="+Funding_Rec);
		Assert.assertTrue(PDFtext.contains(Funding_Rec));
          	
          	

		ExtentReportManager.passStep(m_Driver, "Click_getFunding_Rec");

		TestModellerLogger.PassStep(m_Driver, "Click_getFunding_Rec");
	}

     
	/**
 	 * Click getTotalNI
     * @name Click getTotalNI
     */
	public void Click_getTotalNI()
	{
        
		WebElement elem = getWebElement(getTotalNIElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotalNI", "Click_getTotalNI failed. Unable to locate object: " + getTotalNIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotalNI", "Click_getTotalNI failed. Unable to locate object: " + getTotalNIElem.toString());

			Assert.fail("Unable to locate object: " + getTotalNIElem.toString());
        }


		String TotalNI=elem.getText();
		System.out.println("TotalNI="+TotalNI);
		Assert.assertTrue(PDFtext.contains(TotalNI));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getTotalNI");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotalNI");
	}

     
	/**
 	 * Click getNETPAIDtoStaff
     * @name Click getNETPAIDtoStaff
     */
	public void Click_getNETPAIDtoStaff()
	{
        
		WebElement elem = getWebElement(getNETPAIDtoStaffElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getNETPAIDtoStaff", "Click_getNETPAIDtoStaff failed. Unable to locate object: " + getNETPAIDtoStaffElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getNETPAIDtoStaff", "Click_getNETPAIDtoStaff failed. Unable to locate object: " + getNETPAIDtoStaffElem.toString());

			Assert.fail("Unable to locate object: " + getNETPAIDtoStaffElem.toString());
        }


		String NETPAIDtoStaff=elem.getText();
		System.out.println("NETPAIDtoStaff="+NETPAIDtoStaff);
		Assert.assertTrue(PDFtext.contains(NETPAIDtoStaff));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getNETPAIDtoStaff");

		TestModellerLogger.PassStep(m_Driver, "Click_getNETPAIDtoStaff");
	}

     
	/**
 	 * Click getPAYE Tax
     * @name Click getPAYE Tax
     */
	public void Click_getPAYE_Tax()
	{
        
		WebElement elem = getWebElement(getPAYE_TaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPAYE_Tax", "Click_getPAYE_Tax failed. Unable to locate object: " + getPAYE_TaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPAYE_Tax", "Click_getPAYE_Tax failed. Unable to locate object: " + getPAYE_TaxElem.toString());

			Assert.fail("Unable to locate object: " + getPAYE_TaxElem.toString());
        }

		String PAYE_Tax=elem.getText();
		System.out.println("PAYE_Tax="+PAYE_Tax);
		Assert.assertTrue(PDFtext.contains(PAYE_Tax));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPAYE_Tax");

		TestModellerLogger.PassStep(m_Driver, "Click_getPAYE_Tax");
	}

     
	/**
 	 * Click Paye&NIDueHMRC
     * @name Click Paye&NIDueHMRC
     */
	public void Click_PayeNIDueHMRC()
	{
        
		WebElement elem = getWebElement(PayeNIDueHMRCElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayeNIDueHMRC", "Click_PayeNIDueHMRC failed. Unable to locate object: " + PayeNIDueHMRCElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayeNIDueHMRC", "Click_PayeNIDueHMRC failed. Unable to locate object: " + PayeNIDueHMRCElem.toString());

			Assert.fail("Unable to locate object: " + PayeNIDueHMRCElem.toString());
        }

		String PayeNIDueHMRC=elem.getText();
		System.out.println("PayeNIDueHMRC="+PayeNIDueHMRC);
		Assert.assertTrue(PDFtext.contains(PayeNIDueHMRC));
          	
          	

		ExtentReportManager.passStep(m_Driver, "Click_PayeNIDueHMRC");

		TestModellerLogger.PassStep(m_Driver, "Click_PayeNIDueHMRC");
	}

     
	/**
 	 * Click getTax Refund Funding
     * @name Click getTax Refund Funding
     */
	public void Click_getTax_Refund_Funding()
	{
        
		WebElement elem = getWebElement(getTax_Refund_FundingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTax_Refund_Funding", "Click_getTax_Refund_Funding failed. Unable to locate object: " + getTax_Refund_FundingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTax_Refund_Funding", "Click_getTax_Refund_Funding failed. Unable to locate object: " + getTax_Refund_FundingElem.toString());

			Assert.fail("Unable to locate object: " + getTax_Refund_FundingElem.toString());
        }

		String Tax_Refund_Funding=elem.getText();
		System.out.println("Tax_Refund_Funding="+Tax_Refund_Funding);
		Assert.assertTrue(PDFtext.contains(Tax_Refund_Funding));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getTax_Refund_Funding");

		TestModellerLogger.PassStep(m_Driver, "Click_getTax_Refund_Funding");
	}

     
	/**
 	 * Click getPayment for Month
     * @name Click getPayment for Month
     */
	public void Click_getPayment_for_Month()
	{
        
		WebElement elem = getWebElement(getPayment_for_MonthElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPayment_for_Month", "Click_getPayment_for_Month failed. Unable to locate object: " + getPayment_for_MonthElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPayment_for_Month", "Click_getPayment_for_Month failed. Unable to locate object: " + getPayment_for_MonthElem.toString());

			Assert.fail("Unable to locate object: " + getPayment_for_MonthElem.toString());
        }

		String Payment_for_Month=elem.getText();
		System.out.println("Payment_for_Month="+Payment_for_Month);
		Assert.assertTrue(PDFtext.contains(Payment_for_Month));
          	
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPayment_for_Month");

		TestModellerLogger.PassStep(m_Driver, "Click_getPayment_for_Month");
	}

     
	/**
 	 * Click getStudent Loan Repay
     * @name Click getStudent Loan Repay
     */
	public void Click_getStudent_Loan_Repay()
	{
        
		WebElement elem = getWebElement(getStudent_Loan_RepayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getStudent_Loan_Repay", "Click_getStudent_Loan_Repay failed. Unable to locate object: " + getStudent_Loan_RepayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getStudent_Loan_Repay", "Click_getStudent_Loan_Repay failed. Unable to locate object: " + getStudent_Loan_RepayElem.toString());

			Assert.fail("Unable to locate object: " + getStudent_Loan_RepayElem.toString());
        }

		String Student_Loan_Repay=elem.getText();
		System.out.println("Student_Loan_Repay="+Student_Loan_Repay);
		Assert.assertTrue(PDFtext.contains(Student_Loan_Repay));
          	
          	

		ExtentReportManager.passStep(m_Driver, "Click_getStudent_Loan_Repay");

		TestModellerLogger.PassStep(m_Driver, "Click_getStudent_Loan_Repay");
	}

     
	/**
 	 * Click getTotalCostforthePeriod
     * @name Click getTotalCostforthePeriod
     */
	public void Click_getTotalCostforthePeriod()
	{
        
		WebElement elem = getWebElement(getTotalCostforthePeriodElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotalCostforthePeriod", "Click_getTotalCostforthePeriod failed. Unable to locate object: " + getTotalCostforthePeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotalCostforthePeriod", "Click_getTotalCostforthePeriod failed. Unable to locate object: " + getTotalCostforthePeriodElem.toString());

			Assert.fail("Unable to locate object: " + getTotalCostforthePeriodElem.toString());
        }

		String TotalCostforthePeriod=elem.getText();
		System.out.println("TotalCostforthePeriod="+TotalCostforthePeriod);
		Assert.assertTrue(PDFtext.contains(TotalCostforthePeriod));
          	
          	

		ExtentReportManager.passStep(m_Driver, "Click_getTotalCostforthePeriod");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotalCostforthePeriod");
	}

     
	/**
 	 * Click getPG_loan_Repay
     * @name Click getPG_loan_Repay
     */
	public void Click_getPG_loan_Repay()
	{
        
		WebElement elem = getWebElement(getPG_loan_RepayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPG_loan_Repay", "Click_getPG_loan_Repay failed. Unable to locate object: " + getPG_loan_RepayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPG_loan_Repay", "Click_getPG_loan_Repay failed. Unable to locate object: " + getPG_loan_RepayElem.toString());

			Assert.fail("Unable to locate object: " + getPG_loan_RepayElem.toString());
        }

		String PG_loan_Repay=elem.getText();
		System.out.println("PG_loan_Repay="+PG_loan_Repay);
		Assert.assertTrue(PDFtext.contains(PG_loan_Repay));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPG_loan_Repay");

		TestModellerLogger.PassStep(m_Driver, "Click_getPG_loan_Repay");
	}

     
	/**
 	 * Click getTotal Tax
     * @name Click getTotal Tax
     */
	public void Click_getTotal_Tax()
	{
        
		WebElement elem = getWebElement(getTotal_TaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotal_Tax", "Click_getTotal_Tax failed. Unable to locate object: " + getTotal_TaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotal_Tax", "Click_getTotal_Tax failed. Unable to locate object: " + getTotal_TaxElem.toString());

			Assert.fail("Unable to locate object: " + getTotal_TaxElem.toString());
        }

		String Total_Tax=elem.getText();
		System.out.println("Total_Tax"+Total_Tax);
		Assert.assertTrue(PDFtext.contains(Total_Tax));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getTotal_Tax");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotal_Tax");
	}
}