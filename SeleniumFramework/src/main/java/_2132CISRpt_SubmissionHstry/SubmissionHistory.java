package _2132CISRpt_SubmissionHstry;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class SubmissionHistory extends BasePage {

	public WebElement elem;
	public static String getTemplate;
	public SubmissionHistory (WebDriver driver)
	{
		super(driver);
	}

	private By FincYer = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYears']");
	
	private By FilingPrd = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlFilingPeriod']");

	private By Updatebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
	
	private By Email = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");
	
	private By DownloadCIS300 = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkDownloadCIS300']");
	
	private By TaxYer = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYear']");
	
	private By Period = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlPeriod']");
	
	private By Serchbtn = By.xpath("//a[text()='Search']");
	
	private By DownloadCIS300pdf= By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]/i[1]");

	private By Checkboxlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr//input[@type='checkbox']");

	private By Sendbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSave']");
	
	private By VerifyMsg = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]");
	
	private By Exportpdf= By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[3]");
			
	private By Exportcsv  = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[2]/i[1]");	
	
	private By Undoicon = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnUndo']");
	
	private By Savebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	
	private By IndividualXml = By.xpath("//i[@class='fa fa-file-excel-o']");

	private By RegernateXml = By.xpath("//a[text()='Regenerate Rti Xml']");
	
    private By SubmissionHstryTemplate = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TPnlEmailTemplate_rptrDisplayRecordsEmail_ctl33_lnkEdit']");
    
    private By EmailParagrph = By.xpath("//*[contains(text(),'Dear')]");
	
	
	private By Logo = By.xpath("//body[1]/form[1]/main[1]/header[1]/div[1]/div[2]/ul[1]/li[8]/a[1]/div[2]/span[1]/img[1]");
	
    private By Emaillog = By.xpath("//a[text()='Email Log']");
    
	/**
	 * Select FinancialYear
	 * @throws InterruptedException 
	 * @name FinancialYear
	 */	
	public void Select_FinancialYear(String Fyear) throws InterruptedException
	{

	  elem = getWebElement(FincYer);

	  if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FinancialYear", "Select_FinancialYear failed. Unable to locate object: " + FincYer.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FinancialYear", "Select_FinancialYear failed. Unable to locate object: " + FincYer.toString());

		Assert.fail("Unable to locate object: " + FincYer.toString());
	}

		Select sele = new Select(elem);
		sele.selectByVisibleText(Fyear);
		Thread.sleep(2000);

	ExtentReportManager.passStep(m_Driver, "Select_FinancialYear");

	TestModellerLogger.PassStep(m_Driver, "Select_FinancialYear");

	}
	
	/**
	 * Select FilingPeriod
	 * @throws InterruptedException 
	 * @name FilingPeriod
	 */	
	public void Select_FilingPeriod(String Fperiod) throws InterruptedException
	{

	  elem = getWebElement(FilingPrd);

	  if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FilingPeriod", "Select_FilingPeriod failed. Unable to locate object: " + FilingPrd.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FilingPeriod", "Select_FilingPeriod failed. Unable to locate object: " + FilingPrd.toString());

		Assert.fail("Unable to locate object: " + FilingPrd.toString());
	}

		Select sele = new Select(elem);
		sele.selectByVisibleText(Fperiod);
		Thread.sleep(2000);

	ExtentReportManager.passStep(m_Driver, "Select_FilingPeriod");

	TestModellerLogger.PassStep(m_Driver, "Select_FilingPeriod");

	}
	
    /**
 	 * Click Updatebtn
     * @name Click Updatebtn
     */
	public void Click_Updatebtn()
	{
        
		 elem = getWebElement(Updatebtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Updatebtn", "Click_Updatebtn failed. Unable to locate object: " + Updatebtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Updatebtn", "Click_Updatebtn failed. Unable to locate object: " + Updatebtn.toString());

			Assert.fail("Unable to locate object: " + Updatebtn.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_Updatebtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Updatebtn");
	}
	
	/**
	 * Click XML Icon
	 * @name XMl Icon
	 */
	public void Gernate_XMLReport()
	{
	    
		 elem = getWebElement(IndividualXml);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Gernate_XMLReport", "Gernate_XMLReport failed. Unable to locate object: " + IndividualXml.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Gernate_XMLReport", "Gernate_XMLReport failed. Unable to locate object: " + IndividualXml.toString());

			Assert.fail("Unable to locate object: " + IndividualXml.toString());
	    }

		elem.click();
		
		
	    ExtentReportManager.passStep(m_Driver, "Gernate_XMLReport");

		TestModellerLogger.PassStep(m_Driver, "Gernate_XMLReport");
	}
	
	/**
	 * Click Regernate XML
	 * @throws InterruptedException 
	 * @name Regernate XML
	 */
	public void Regernate_XMLReport() throws InterruptedException
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/iframe[1]")));
  
		 elem = getWebElement(RegernateXml);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Regernate_XMLReport", "Regernate_XMLReport failed. Unable to locate object: " + RegernateXml.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Regernate_XMLReport", "Regernate_XMLReport failed. Unable to locate object: " + RegernateXml.toString());

			Assert.fail("Unable to locate object: " + RegernateXml.toString());
	    }

		elem.click();
		
		Thread.sleep(2000);
		
		m_Driver.switchTo().defaultContent();

	    ExtentReportManager.passStep(m_Driver, "Regernate_XMLReport");

		TestModellerLogger.PassStep(m_Driver, "Regernate_XMLReport");
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
			Thread.sleep(2000);
			
		    ExtentReportManager.passStep(m_Driver, "Click_ExptoPDF");

			TestModellerLogger.PassStep(m_Driver, "Click_ExptoPDF");
	}
	
	/**
	 * Click_ UndoSubmissionHistory
	 * @throws InterruptedException 
	* @name Undo icon
	*/
	public void Click_UndoSubmissionHistory(String ExpMsg) throws InterruptedException
	{

	 elem = getWebElement(Undoicon);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UndoSubmissionHistory", "Click_UndoSubmissionHistory failed. Unable to locate object: " + Undoicon.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UndoSubmissionHistory", "Click_UndoSubmissionHistory failed. Unable to locate object: " + Undoicon.toString());

		Assert.fail("Unable to locate object: " + Undoicon.toString());
	}

	elem.click();
	Thread.sleep(2000);
	WebElement ele = m_Driver.findElement(By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]"));
	String SucessMsg = ele.getText();
	System.out.println("The success message ="+SucessMsg);
	System.out.println("The expected message ="+ExpMsg);
	Assert.assertEquals(SucessMsg,ExpMsg,"Messages are not matched");

	ExtentReportManager.passStep(m_Driver, "Click_UndoSubmissionHistory");

	TestModellerLogger.PassStep(m_Driver, "Click_UndoSubmissionHistory");

	}
	

	/**
	 * Click_ DownloadCIS300
	* @name Undo icon
	*/
	public void Click_DownloadCIS300()
	{

	 elem = getWebElement(DownloadCIS300);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownloadCIS300", "Click_DownloadCIS300 failed. Unable to locate object: " + DownloadCIS300.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownloadCIS300", "Click_DownloadCIS300 failed. Unable to locate object: " + DownloadCIS300.toString());

		Assert.fail("Unable to locate object: " + DownloadCIS300.toString());
	}

	elem.click();

	ExtentReportManager.passStep(m_Driver, "Click_DownloadCIS300");

	TestModellerLogger.PassStep(m_Driver, "Click_DownloadCIS300");

	}
	
	/**
	 * Select TaxYear
	 * @throws InterruptedException 
	 * @name TaxYear
	 */	
	public void Select_TaxYear(String Tyear) throws InterruptedException
	{

	  elem = getWebElement(TaxYer);

	  if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_TaxYear", "Select_TaxYear failed. Unable to locate object: " + TaxYer.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_TaxYear", "Select_TaxYear failed. Unable to locate object: " + TaxYer.toString());

		Assert.fail("Unable to locate object: " + TaxYer.toString());
	}

		Select sele = new Select(elem);
		sele.selectByVisibleText(Tyear);
		Thread.sleep(2000);

	ExtentReportManager.passStep(m_Driver, "Select_TaxYear");

	TestModellerLogger.PassStep(m_Driver, "Select_TaxYear");

	}
	
	/**
	 * Select Period
	 * @throws InterruptedException 
	 * @name Period
	 */	
	public void Select_Period(String Tyear) throws InterruptedException
	{

	  elem = getWebElement(Period);

	  if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Period", "Select_Period failed. Unable to locate object: " + Period.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Period", "Select_Period failed. Unable to locate object: " + Period.toString());

		Assert.fail("Unable to locate object: " + Period.toString());
	}

		Select sele = new Select(elem);
		sele.selectByVisibleText(Tyear);
		Thread.sleep(2000);

	ExtentReportManager.passStep(m_Driver, "Select_Period");

	TestModellerLogger.PassStep(m_Driver, "Select_Period");

	}
	
	/**
	 * Click Searchbtn
	 * @name Click Searchbtn
	 */
	public void Click_Searchbtn()
	{
	    
		 elem = getWebElement(Serchbtn);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Serchbtn.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Serchbtn.toString());

			Assert.fail("Unable to locate object: " + Serchbtn.toString());
	    }

		elem.click();
		
		
	    ExtentReportManager.passStep(m_Driver, "Click_Searchbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbtn");
	}

	/**
	 * Click ExprtDownloadCISPDF
	 * @name ExprttoPDF
	 */
	public void Click_ExprtDownloadCISPDF()
	{
	    
		 elem = getWebElement(DownloadCIS300pdf);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExprtDownloadCISPDF", "Click_ExprtDownloadCISPDF failed. Unable to locate object: " + DownloadCIS300pdf.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExprtDownloadCISPDF", "Click_ExprtDownloadCISPDF failed. Unable to locate object: " + DownloadCIS300pdf.toString());

			Assert.fail("Unable to locate object: " + DownloadCIS300pdf.toString());
	    }

		elem.click();
		
		
	    ExtentReportManager.passStep(m_Driver, "Click_ExprtDownloadCISPDF");

		TestModellerLogger.PassStep(m_Driver, "Click_ExprtDownloadCISPDF");
	}
	
	/**
	 * Choose Name Checkbox
	 * @throws InterruptedException 
	 * @name Checkbox
	 */
	public void Choose_NameCheckbox(int NoOfNames) throws InterruptedException
	{
	    
		 List<WebElement> chkbxlist = getWebElements(Checkboxlist);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

			Assert.fail("Unable to locate object: " + Checkboxlist.toString());
	    }


	     if(NoOfNames<chkbxlist.size())
	     {	 
	      WebElement ele = chkbxlist.get(NoOfNames);
	      ele.click();
	      
	    }	
	   	else
	    {
	      System.out.println("Invalid count of Names");	
	    }	
	  
	    

		ExtentReportManager.passStep(m_Driver, "Choose_NameCheckbox");

		TestModellerLogger.PassStep(m_Driver, "Choose_NameCheckbox");
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
	 * Get Submission History EmailTemplate from Agent Page
	*/
	public void Get_SubmissionHstryEmailTemplate() 
	{
	 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));

	 elem = getWebElement(EmailParagrph);
	 if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "SubmissionHstryEmailTemplate", "SubmissionHstryEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "SubmissionHstryEmailTemplate", "SubmissionHstryEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			Assert.fail("Unable to locate object: " + EmailParagrph.toString());
	  }
	 getTemplate = elem.getText();
	 System.out.println(getTemplate);

	 m_Driver.switchTo().defaultContent();

	 ExtentReportManager.passStep(m_Driver, "Get_SubmissionHstryEmailTemplate");

	 TestModellerLogger.PassStep(m_Driver, "Get_SubmissionHstryEmailTemplate");
	 
	}

	/**
	 * Verify Submission History EmailTemplate 
	 * @throws InterruptedException 
	 * @name Submission History EmailTemplate 
		*/
	public void Verify_SubmissionHstryEmailTemplate() throws InterruptedException 
	{
	  m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));


	 elem = getWebElement(EmailParagrph);
	 if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_SubmissionHstryEmailTemplate", "Verify_SubmissionHstryEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_SubmissionHstryEmailTemplate", "Verify_SubmissionHstryEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			Assert.fail("Unable to locate object: " + EmailParagrph.toString());
	}
	 String Actualtemplate = elem.getText();
	 String Expectedtemplate = getTemplate;
	 Assert.assertEquals(Actualtemplate, Expectedtemplate, "Email Templates are not matched");

	 m_Driver.switchTo().defaultContent();

	 ExtentReportManager.passStep(m_Driver, "Verify_SubmissionHstryEmailTemplate");

	 TestModellerLogger.PassStep(m_Driver, "Verify_SubmissionHstryEmailTemplate");
	 
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
		
		String actMsg = elem.getText();
		String AcualMsg= actMsg.replaceAll("×", "");
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
    * Click click on Click_SummaryPayreptTemplate
    * @throws InterruptedException 
   * @name SummaryPayReportTemplate
   */
   public void Click_SubmissionHstryEmailTemplate() throws InterruptedException
   {
   // To get this element Manually click Active+ icon then save for first time for every new client
   elem = getWebElement(SubmissionHstryTemplate);

   if (elem == null) {
   	ExtentReportManager.failStepWithScreenshot(m_Driver, "SubmissionHstryEmailTemplate", "SubmissionHstryEmailTemplate failed. Unable to locate object: " + SubmissionHstryTemplate.toString());

   	TestModellerLogger.FailStepWithScreenshot(m_Driver, "SubmissionHstryEmailTemplate", "SubmissionHstryEmailTemplate failed. Unable to locate object: " + SubmissionHstryTemplate.toString());

   	Assert.fail("Unable to locate object: " + SubmissionHstryTemplate.toString());
   }
   Thread.sleep(1000);
   elem.click();
     	

   ExtentReportManager.passStep(m_Driver, "Click_PayslipreptTemplate");

   TestModellerLogger.PassStep(m_Driver, "Click_PayslipreptTemplate");
   }

   /**
    * Click Savebtn
   * @name Click Savebtn
   */
   public void Click_Savebtn()
   {

    elem = getWebElement(Savebtn);

   if (elem == null) {
   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Savebtn", "Click_Savebtn failed. Unable to locate object: " + Savebtn.toString());

   	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Savebtn", "Click_Savebtn failed. Unable to locate object: " + Savebtn.toString());

   	Assert.fail("Unable to locate object: " + Savebtn.toString());
   }

   elem.click();


   ExtentReportManager.passStep(m_Driver, "Click_Savebtn");

   TestModellerLogger.PassStep(m_Driver, "Click_Savebtn");
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
 	 * Take Screen shot of Page
	*/
 	public void TakeShot(String name) throws Exception
 	{
 		TakeScreenshot.takeScreenshot(m_Driver, name);	
 	}

}
