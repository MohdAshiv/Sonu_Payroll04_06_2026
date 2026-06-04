package _2054CISRpt_VerfCertifcate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class VerificationCertificate extends BasePage {

	public WebElement elem;
	public static String getTemplate;
	public VerificationCertificate (WebDriver driver)
	{
		super(driver);
	}

	private By FincYer = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYears']");
	
	private By Period = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlPeriod']");
	
	private By Name = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlsubcontractor']");
	
	private By Selectcontactor = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cpHeaderRight$ddlSelectEmail']");
	
	private By Fromdate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPHFilter$txtDateFrom']");
	
	private By Todate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPHFilter$txtDateTo']");
	
	private By Chkboxlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr//input[@type='checkbox']");

	private By Updatebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By Email = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");
	
	private By Sendbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSave']");
	
	private By VerifyMsg = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]");
	
	private By Exportcsv = By.xpath("//i[@title='Export Employee Pay Details']");
			
	private By Exportpdf = 	By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[2]/i[1]");	
	
	private By Logo = By.xpath("//body[1]/form[1]/main[1]/header[1]/div[1]/div[2]/ul[1]/li[8]/a[1]/div[2]/span[1]/img[1]");
	
    private By Emaillog = By.xpath("//a[text()='Email Log']");
    
    private By AgntSetting = By.xpath("//span[text()='Settings']");
    
    private By Emaillist = By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/aside[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[2]");
    
    private By VerfCertifcTemplate = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TPnlEmailTemplate_rptrDisplayRecordsEmail_ctl31_lnkEdit']");
    
    private By EmailParagrph = By.xpath("/html[1]/body[1]/p[1]");
    
    private By TmplteSavebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	
    /**
     * Select Contractor
     * @throws InterruptedException 
     * @name Contractor
     */
    public void Choose_Type(String type) throws InterruptedException
    {
        
    	 elem = getWebElement(Selectcontactor);

    	if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_Type", "Choose_Type failed. Unable to locate object: " + Selectcontactor.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_Type", "Choose_Type failed. Unable to locate object: " + Selectcontactor.toString());

    		Assert.fail("Unable to locate object: " + Selectcontactor.toString());
        }

    		Select sel = new Select(elem);
    		sel.selectByVisibleText(type);
    		Thread.sleep(2000);

    	ExtentReportManager.passStep(m_Driver, "Choose_Type");

    	TestModellerLogger.PassStep(m_Driver, "Choose_Type");
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
	 * Select Period
	 * @throws InterruptedException 
	 * @name Period
	 */	
	public void Select_Period(String prd) throws InterruptedException
	{
	    
		 elem = getWebElement(Period);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Period", "Select_Period failed. Unable to locate object: " + FincYer.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Period", "Select_Period failed. Unable to locate object: " + FincYer.toString());

			Assert.fail("Unable to locate object: " + FincYer.toString());
	    }

			Select sele = new Select(elem);
			sele.selectByVisibleText(prd);
			Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Select_Period");

		TestModellerLogger.PassStep(m_Driver, "Select_Period");
	}

    /**
	 * Select Fromdate
     * @throws InterruptedException 
     * @name Fromdate
     */	
     public void Enter_FromDate(String Fdate) throws InterruptedException
     {
    
	  elem = getWebElement(Fromdate);

	  if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FromDate", "Enter_FromDate failed. Unable to locate object: " + Fromdate.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FromDate", "Enter_FromDate failed. Unable to locate object: " + Fromdate.toString());

		Assert.fail("Unable to locate object: " + Fromdate.toString());
     }

      elem.sendKeys(Fdate);

	  ExtentReportManager.passStep(m_Driver, "Enter_FromDate");

	  TestModellerLogger.PassStep(m_Driver, "Enter_FromDate");
    }

     /**
      * Select Todate
      * @throws InterruptedException 
      * @name Todate
     */	
     public void Enter_Todate(String Tdate) throws InterruptedException
     {
       
   	 elem = getWebElement(Todate);

   	 if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Todate", "Enter_Todate failed. Unable to locate object: " + Todate.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Todate", "Enter_Todate failed. Unable to locate object: " + Todate.toString());

   		Assert.fail("Unable to locate object: " + Todate.toString());
       }

       elem.sendKeys(Tdate);

   	  ExtentReportManager.passStep(m_Driver, "Enter_Todate");

   	  TestModellerLogger.PassStep(m_Driver, "Enter_Todate");
   	  
     }

	
	/**
 	 * Click Updatebtn
     * @name Click Updatebtn
     */
	public void Click_Updatebtn()
	{
        
		 elem = getWebElement(Updatebtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Updatebtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Updatebtn.toString());

			Assert.fail("Unable to locate object: " + Updatebtn.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_Searchbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbtn");
	}

    /**
     * Choose Name Checkbox
     * @throws InterruptedException 
     * @name Checkbox
     */
    public void Choose_NameCheckbox(int NoOfNames) throws InterruptedException
    {
        
    	 List<WebElement> chkbxlist = getWebElements(Chkboxlist);

    	if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

    		Assert.fail("Unable to locate object: " + chkbxlist.toString());
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
   public void Click_PayslipreptTemplate() throws InterruptedException
   {
   // To get this element Manually click Active+ icon then save for first time for every new client
   elem = getWebElement(VerfCertifcTemplate);

   if (elem == null) {
   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayslipreptTemplate", "Click_PayslipreptTemplate failed. Unable to locate object: " + VerfCertifcTemplate.toString());

   	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayslipreptTemplate", "Click_PayslipreptTemplate failed. Unable to locate object: " + VerfCertifcTemplate.toString());

   	Assert.fail("Unable to locate object: " + VerfCertifcTemplate.toString());
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

    elem = getWebElement(TmplteSavebtn);

   if (elem == null) {
   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Savebtn", "Click_Savebtn failed. Unable to locate object: " + TmplteSavebtn.toString());

   	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Savebtn", "Click_Savebtn failed. Unable to locate object: " + TmplteSavebtn.toString());

   	Assert.fail("Unable to locate object: " + TmplteSavebtn.toString());
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
	 * Click click on Click_VerfCertfcreptTemplate
	 * @throws InterruptedException 
	* @name VerificationCertificate ReportTemplate
	*/
	public void Click_VerfCertfcreptTemplate() throws InterruptedException
	{
	// To get this element Manually click Active+ icon then save for first time for every new client
	elem = getWebElement(VerfCertifcTemplate);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VerfCertfcreptTemplate", "Click_VerfCertfcreptTemplate failed. Unable to locate object: " + VerfCertifcTemplate.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VerfCertfcreptTemplate", "Click_VerfCertfcreptTemplate failed. Unable to locate object: " + VerfCertifcTemplate.toString());

		Assert.fail("Unable to locate object: " + VerfCertifcTemplate.toString());
	}
	jsExec.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(1000);
	elem.click();
	  	

	ExtentReportManager.passStep(m_Driver, "Click_VerfCertfcreptTemplate");

	TestModellerLogger.PassStep(m_Driver, "Click_VerfCertfcreptTemplate");
	}

	
	/**
	 * View Email Content
	 * 
	 */
	public void Choose_Emaillist(int Emailindex)
	{
	 List<WebElement> emailsubject = getWebElements(Emaillist);	
 	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_Emaillist", "Choose_Emaillist failed. Unable to locate object: " + Emaillist.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_Emaillist", "Choose_Emaillist failed. Unable to locate object: " + Emaillist.toString());

		Assert.fail("Unable to locate object: " + Emaillist.toString());
    }


     if(Emailindex<emailsubject.size())
     {	 
      WebElement ele = emailsubject.get(Emailindex);
      ele.click();
      
    }	
   	else
    {
      System.out.println("Invalid count of Emails");	
    }	
  
  	ExtentReportManager.passStep(m_Driver, "Choose_Emaillist");

	TestModellerLogger.PassStep(m_Driver, "Choose_Emaillist");

	}
	
	/**
	 * Get Verfication Certification EmailTemplate from Agent Page
	*/
	public void Get_VCEmailTemplate() 
	{
	 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));

	 elem = getWebElement(EmailParagrph);
	 if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_VCEmailTemplate", "Get_VCEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_VCEmailTemplate", "Get_VCEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			Assert.fail("Unable to locate object: " + EmailParagrph.toString());
	}
	 getTemplate = elem.getText();
	 System.out.println(getTemplate);

	 m_Driver.switchTo().defaultContent();

	 ExtentReportManager.passStep(m_Driver, "Get_VCEmailTemplate");

	 TestModellerLogger.PassStep(m_Driver, "Get_VCEmailTemplate");
	 
	}

	/**
	 * Verify VC EmailTemplate 
	 * @name Verfication Certification EmailTemplate 
		*/
	public void Verify_VCEmailTemplate() 
	{
	 m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cpHeaderRight_txtBody_ctl02_ctl00']")));

	 elem = getWebElement(EmailParagrph);
	 if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_VCEmailTemplate", "Verify_VCEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_VCEmailTemplate", "Verify_VCEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			Assert.fail("Unable to locate object: " + EmailParagrph.toString());
	}
	 String Actualtemplate = elem.getText();
	 String Expectedtemplate = getTemplate;
	 Assert.assertEquals(Actualtemplate, Expectedtemplate, "Email Templates are not matched");

	 m_Driver.switchTo().defaultContent();

	 ExtentReportManager.passStep(m_Driver, "Verify_VCEmailTemplate");

	 TestModellerLogger.PassStep(m_Driver, "Verify_VCEmailTemplate");
	 
	}
	
 	/**
 	 * Take Screen shot of Page
	*/
 	public void TakeShot(String name) throws Exception
 	{
 		TakeScreenshot.takeScreenshot(m_Driver, name);	
 	}




	

}
