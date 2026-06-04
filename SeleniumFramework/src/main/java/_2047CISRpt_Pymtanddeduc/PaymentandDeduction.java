package _2047CISRpt_Pymtanddeduc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class PaymentandDeduction extends BasePage {

	public WebElement elem;
	public PaymentandDeduction (WebDriver driver)
	{
		super(driver);
	}

	private By Report = By.xpath("//span[text()='Reports']");
	
	private By PandDstmt = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]");
	
	private By Selectcontactor = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cpHeaderRight$ddlEmail']");
	
	private By FincYer = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYears']");
	
	private By Subconc = By.xpath("//Select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlsubcontractor']");
	
	private By Filpriod = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlFilingPeriod']");
	
	private By Email = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");
	
	private By Sendbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSave']");
	
	private By VerifyMsg = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]");
	
	private By Exportcsv = By.xpath("//i[@title='Export Employee Pay Details']");
			
	private By Exportpdf = 	By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[2]/i[1]");	
	
	private By Logo = By.xpath("//body[1]/form[1]/main[1]/header[1]/div[1]/div[2]/ul[1]/li[8]/a[1]/div[2]/span[1]/img[1]");
	
    private By Emaillog = By.xpath("//a[text()='Email Log']");
	
	
	

	/**
 	 * Click click on CIS Reports
     * @name Reports
     */
	public void Click_CISReport()
	{
        
		elem = getWebElement(Report);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CISReport", "Click_CISReport failed. Unable to locate object: " + Report.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CISReport", "Click_CISReport failed. Unable to locate object: " + Report.toString());

			Assert.fail("Unable to locate object: " + Report.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_CISReport");

		TestModellerLogger.PassStep(m_Driver, "Click_CISReport");
	}
	
	/**
 	 * Click PymtandDedc
     * @name Click PymtandDedc
     */
	public void Click_PymtandDedc()
	{
        
		 elem = getWebElement(PandDstmt);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PymtandDedc", "Click_PymtandDedc failed. Unable to locate object: " + PandDstmt.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PymtandDedc", "Click_PymtandDedc failed. Unable to locate object: " + PandDstmt.toString());

			Assert.fail("Unable to locate object: " + PandDstmt.toString());
        }

		elem.click();
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_PymtandDedc");

		TestModellerLogger.PassStep(m_Driver, "Click_PymtandDedc");
	}
	
	/**
 	 * Select Contractor
	 * @throws InterruptedException 
     * @name Contractor
     */
	public void Select_Contractor(String type) throws InterruptedException
	{
        
		 elem = getWebElement(Selectcontactor);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Contractor", "Select_Contractor failed. Unable to locate object: " + Selectcontactor.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Contractor", "Select_Contractor failed. Unable to locate object: " + Selectcontactor.toString());

			Assert.fail("Unable to locate object: " + Selectcontactor.toString());
        }

 		Select sel = new Select(elem);
 		sel.selectByVisibleText(type);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Select_Contractor");

		TestModellerLogger.PassStep(m_Driver, "Select_Contractor");
	}
	/**
 	 * Select FinacialYear
	 * @throws InterruptedException 
     * @name FinacialYear
     */	
	public void Select_FinacialYear(String year) throws InterruptedException
	{
        
		 elem = getWebElement(FincYer);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FinacialYear", "Select_FinacialYear failed. Unable to locate object: " + FincYer.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FinacialYear", "Select_FinacialYear failed. Unable to locate object: " + FincYer.toString());

			Assert.fail("Unable to locate object: " + FincYer.toString());
        }

 		Select sele = new Select(elem);
 		sele.selectByVisibleText(year);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Select_FinacialYear");

		TestModellerLogger.PassStep(m_Driver, "Select_FinacialYear");
	}
	/**
 	 * Select Subcontractor
	 * @throws InterruptedException 
     * @name Subcontractor
     */		
	public void Select_Subcontractorname(String name) throws InterruptedException
	{
        
		 elem = getWebElement(Subconc);


		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Subcontractorname", "Select_Subcontractorname failed. Unable to locate object: " + Subconc.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Subcontractorname", "Select_Subcontractorname failed. Unable to locate object: " + Subconc.toString());

			Assert.fail("Unable to locate object: " + Subconc.toString());
        }

 		Select sele = new Select(elem);
 		sele.selectByVisibleText(name);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Select_Subcontractorname");

		TestModellerLogger.PassStep(m_Driver, "Select_Subcontractorname");
	}
	/**
 	 * Select FilingPeriod
	 * @throws InterruptedException 
     * @name FilingPeriod
     */		
	public void Choose_FilingPeriod(String prd) throws InterruptedException
	{
        
		 elem = getWebElement(Filpriod);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_FilingPeriod", "Choose_FilingPeriod failed. Unable to locate object: " + Filpriod.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_FilingPeriod", "Choose_FilingPeriod failed. Unable to locate object: " + Filpriod.toString());

			Assert.fail("Unable to locate object: " + Filpriod.toString());
        }

 		Select sele = new Select(elem);
 		sele.selectByVisibleText(prd);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Choose_FilingPeriod");

		TestModellerLogger.PassStep(m_Driver, "Choose_FilingPeriod");
	}
	
	/**
 	 * Click Email btn
     * @name Email
    */
	public void Click_Emailbtn()
	{
        
		 elem = getWebElement(Email);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Emailbtn", "Click_Emailbtn failed. Unable to locate object: " + Email.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Emailbtn", "Click_Emailbtn failed. Unable to locate object: " + Email.toString());

			Assert.fail("Unable to locate object: " + Email.toString());
        }

		elem.click();
		
	ExtentReportManager.passStep(m_Driver, "Click_Emailbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Emailbtn");
		
	}
/**
 	 * Click Send btn
     * @name Send
    */
	public void Click_Sendbtn() throws InterruptedException
	{
		 elem = getWebElement(Sendbtn);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

				Assert.fail("Unable to locate object: " + Sendbtn.toString());
	        }

			elem.click();
			Thread.sleep(2000);
			
		ExtentReportManager.passStep(m_Driver, "Click_Sendbtn");

			TestModellerLogger.PassStep(m_Driver, "Click_Sendbtn");
				
	}
	
	/**
 	 * Click Export to CSV icon
     * @name Download icon
    */
	public void Click_ExptoCSV() throws InterruptedException
	{
		 elem = getWebElement(Exportcsv);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExptoCSV", "Click_ExptoCSV failed. Unable to locate object: " + Exportcsv.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExptoCSV", "Click_ExptoCSV failed. Unable to locate object: " + Exportcsv.toString());

				Assert.fail("Unable to locate object: " + Exportcsv.toString());
	        }

			elem.click();
			System.out.println("CSV icon Clicked? "+ elem.isEnabled());
			Thread.sleep(3000);
		ExtentReportManager.passStep(m_Driver, "Click_ExptoCSV");

			TestModellerLogger.PassStep(m_Driver, "Click_ExptoCSV");
				
	}
	
	/**
 	 * Click Export to PDF icon
     * @name PDF icon
    */
	public void Click_ExptoPDF() throws InterruptedException
	{
		 elem = getWebElement(Exportpdf);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExptoPDF", "Click_ExptoPDF failed. Unable to locate object: " + Exportpdf.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExptoPDF", "Click_ExptoPDF failed. Unable to locate object: " + Exportpdf.toString());

				Assert.fail("Unable to locate object: " + Exportpdf.toString());
	        }

			elem.click();
			System.out.println("PDF icon Clicked? "+ elem.isEnabled());
			Thread.sleep(3000);
		ExtentReportManager.passStep(m_Driver, "Click_ExptoPDF");

			TestModellerLogger.PassStep(m_Driver, "Click_ExptoPDF");
				
	}
	
	
	
	/**
 	 * Verify Sent Email Alert
	 * @throws Exception 
     * @name Sent Email Alert
    */
	
	public void Verify_SentEmailAlert(String ExpMessage) throws Exception
	{
		 elem = getWebElement(VerifyMsg);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_SentEmailAlert", "Get_SentEmailAlert failed. Unable to locate object: " + VerifyMsg.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_SentEmailAlert", "Get_SentEmailAlert failed. Unable to locate object: " + VerifyMsg.toString());

				Assert.fail("Unable to locate object: " + VerifyMsg.toString());
	        }
		
		String actmsg = elem.getText();
		String AcualMsg=actmsg.replaceAll("×", "");
		String AA=AcualMsg.trim();
	    System.out.println("The Actual Message is ="+AA);
	    System.out.println("The Expected Message is ="+ExpMessage);
		
	    Assert.assertEquals(AA,ExpMessage,"Alert Message are not matched");
			
		ExtentReportManager.passStep(m_Driver, "Get_SentEmailAlert");

			TestModellerLogger.PassStep(m_Driver, "Get_SentEmailAlert");
				
	}
	
	/**
	 * Click_ Profile Icon
 * @name Profile Icon
 */
public void Click_ProfileIcon()
{
    
	 elem = getWebElement(Logo);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ProfileIcon", "Click_ProfileIcon failed. Unable to locate object: " + Logo.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ProfileIcon", "Click_ProfileIcon failed. Unable to locate object: " + Logo.toString());

		Assert.fail("Unable to locate object: " + Logo.toString());
    }

	elem.click();
	
	
    ExtentReportManager.passStep(m_Driver, "Click_ProfileIcon");

	TestModellerLogger.PassStep(m_Driver, "Click_ProfileIcon");
}

/**
 * Click_ EmailLogs
* @name Email Logs
*/
public void Click_EmailLogs()
{

 elem = getWebElement(Emaillog);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailLogs", "Click_EmailLogs failed. Unable to locate object: " + Emaillog.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailLogs", "Click_EmailLogs failed. Unable to locate object: " + Emaillog.toString());

	Assert.fail("Unable to locate object: " + Emaillog.toString());
}

elem.click();


ExtentReportManager.passStep(m_Driver, "Click_EmailLogs");

TestModellerLogger.PassStep(m_Driver, "Click_EmailLogs");
}
	
	/**
	 * Take Screen shot of Email Alert

	*/
	public void TakeShot(String name) throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, name);	
	}
	
}
