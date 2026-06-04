package _2053CISRpt_Payslips;

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

public class SubcontractorPayslips extends BasePage {

	public WebElement elem;
	public static String getTemplate;
	public SubcontractorPayslips (WebDriver driver)
	{
		super(driver);
	}

	private By Report = By.xpath("//span[text()='Reports']");
	
	private By Payslips = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_hrefReportPaySlip']");
	
	private By Taxyear = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYears']");
	
	private By Fromdate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPHFilter$txtDateFrom']");
	
	private By Todate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPHFilter$txtDateTo']");
	
	private By Name = By.xpath("//label[text()='Name']");

	private By NameFilter = By.xpath("//b[@class='caret']");
	
	private By Updatebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");	
	
	private By Chkboxlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr//input[@type='checkbox']");
	
	private By Emailpayslips = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkbtnPaySlip']");
	
	private By Sendbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By Exportcsv = By.xpath("//i[@title='Export Employee Pay Details']");
	
	private By Exportpdf = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']");
	
	private By Exportzip = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnCreateZip']");

	private By IndividualpayslipPDF = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td/a");

	private By VerifyMsg = By.xpath("//body[1]/form[1]/div[3]/div[1]");

	private By Logo = By.xpath("//body[1]/form[1]/main[1]/header[1]/div[1]/div[2]/ul[1]/li[8]/a[1]/div[2]/span[1]/img[1]");
	
    private By Emaillog = By.xpath("//a[text()='Email Log']");
    
    private By PayslipTemplate = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TPnlEmailTemplate_rptrDisplayRecordsEmail_ctl08_lnkEdit']");
  
    private By TmplteSavebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
    
    private By EmailParagrph = By.xpath("//*[contains(text(),'Dear')]");


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
	 * Click  on SubcontractorPayslips
	* @name Payslips
	*/
	public void Click_SubcontractorPayslips()
	{

	elem = getWebElement(Payslips);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SubcontractorPayslips", "Click_SubcontractorPayslips failed. Unable to locate object: " + Payslips.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SubcontractorPayslips", "Click_SubcontractorPayslips failed. Unable to locate object: " + Payslips.toString());

		Assert.fail("Unable to locate object: " + Payslips.toString());
	}

	elem.click();
	  	

	ExtentReportManager.passStep(m_Driver, "Click_SubcontractorPayslips");

	TestModellerLogger.PassStep(m_Driver, "Click_SubcontractorPayslips");
	}

	/**
	 * Select TaxYear
     * @throws InterruptedException 
     * @name TaxYear
     */	
    public void Select_TaxYear(String year) throws InterruptedException
    {
    
	 elem = getWebElement(Taxyear);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_TaxYear", "Select_TaxYear failed. Unable to locate object: " + Taxyear.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_TaxYear", "Select_TaxYear failed. Unable to locate object: " + Taxyear.toString());

		Assert.fail("Unable to locate object: " + Taxyear.toString());
    }

		Select sele = new Select(elem);
		sele.selectByVisibleText(year);
		Thread.sleep(2000);

	ExtentReportManager.passStep(m_Driver, "Select_TaxYear");

	TestModellerLogger.PassStep(m_Driver, "Select_TaxYear");
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
 	 * Click  Element Name Text
 	 * @throws InterruptedException 
 	 * @name Element Name 
 	 */
 	public void Click_ElementNameText() throws InterruptedException
 	{
 	    
 		elem = getWebElement(Name);

 		if (elem == null) {
 			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ElementNameText", "Click_ElementNameText failed. Unable to locate object: " + Name.toString());

 			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ElementNameText", "Click_ElementNameText failed. Unable to locate object: " + Name.toString());

 			Assert.fail("Unable to locate object: " + Name.toString());
 	    }

 	    elem.click();

 		ExtentReportManager.passStep(m_Driver, "Click_ElementNameText");

 		TestModellerLogger.PassStep(m_Driver, "Click_ElementNameText");
 	}

     /**
      * Select All in Name Filter By default
     * @throws InterruptedException 
     * @name Name Filter
     */
     public void MultipleSubConc_Selected(int NoOfSubConc) throws InterruptedException
     {

      elem = getWebElement(NameFilter);
      elem.click();

     if (elem == null) {
     	ExtentReportManager.failStepWithScreenshot(m_Driver, "VerifyAllSelected", "VerifyAllSelected failed. Unable to locate object: " + NameFilter.toString());

     	TestModellerLogger.FailStepWithScreenshot(m_Driver, "VerifyAllSelected", "VerifyAllSelected failed. Unable to locate object: " + NameFilter.toString());

     	Assert.fail("Unable to locate object: " + NameFilter.toString());
     }

     List<WebElement> SClist = m_Driver.findElements(By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/ul[1]/li/a[1]/label[1]/input[1]"));
     System.out.println(SClist.size());
     
     if(NoOfSubConc<SClist.size())
     {	 
      WebElement ele0 = SClist.get(0);
      ele0.click();
      for(int i=1;i<NoOfSubConc;i++)
      {
     	 SClist.get(i).click();
      }

      }	
     else 
     {
      System.out.println("Invalid count of Sub-Contractor");	
     }	
     	

     ExtentReportManager.passStep(m_Driver, "VerifyAllSelected");

     TestModellerLogger.PassStep(m_Driver, "VerifyAllSelected");
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
	 * Click Export to ZIP icon
     * @name Zip icon
    */
    public void Click_ExptoZIP() throws InterruptedException
    {
	 elem = getWebElement(Exportzip);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExptoZIP", "Click_ExptoZIP failed. Unable to locate object: " + Exportzip.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExptoZIP", "Click_ExptoZIP failed. Unable to locate object: " + Exportzip.toString());

			Assert.fail("Unable to locate object: " + Exportzip.toString());
        }

		elem.click();
		
		System.out.println("Zip icon Clicked? "+ elem.isEnabled());
		
		Thread.sleep(2000);
		
	    ExtentReportManager.passStep(m_Driver, "Click_ExptoZIP");

		TestModellerLogger.PassStep(m_Driver, "Click_ExptoZIP");
			
    }

   /**
   * Click DownloadIndividualPayslip icon
   * @name IndividualPayslip icon
   */
   public void Click_DownloadIndividualPayslip() throws InterruptedException
   {
	 elem = getWebElement(IndividualpayslipPDF);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExptoPDF", "Click_ExptoPDF failed. Unable to locate object: " + IndividualpayslipPDF.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExptoPDF", "Click_ExptoPDF failed. Unable to locate object: " + IndividualpayslipPDF.toString());

			Assert.fail("Unable to locate object: " + IndividualpayslipPDF.toString());
        }

		elem.click();
		System.out.println("PDF icon Clicked? "+ elem.isEnabled());
		Thread.sleep(1000);
		
	    ExtentReportManager.passStep(m_Driver, "Click_ExptoPDF");

		TestModellerLogger.PassStep(m_Driver, "Click_ExptoPDF");
			
    }

	/**
	 * Click Email btn
    * @name Email
   */
	public void Click_EmailPayslipbtn()
	{
        elem = getWebElement(Emailpayslips);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailPayslipbtn", "Click_EmailPayslipbtn failed. Unable to locate object: " + Emailpayslips.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailPayslipbtn", "Click_EmailPayslipbtn failed. Unable to locate object: " + Emailpayslips.toString());

			Assert.fail("Unable to locate object: " + Emailpayslips.toString());
       }

		elem.click();
		
	ExtentReportManager.passStep(m_Driver, "Click_EmailPayslipbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_EmailPayslipbtn");
		
	}
	
    /**
	 * Click Send btn
     * @name Send
    */
	public void Click_Sendbtn() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/iframe[1]")));

		 elem = getWebElement(Sendbtn);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

				Assert.fail("Unable to locate object: " + Sendbtn.toString());
	        }

			elem.click();
			Thread.sleep(2000);
			m_Driver.switchTo().defaultContent();

		ExtentReportManager.passStep(m_Driver, "Click_Sendbtn");

			TestModellerLogger.PassStep(m_Driver, "Click_Sendbtn");
				
	}
	
	/**
 	 * Verify Sent Email Alert
	 * @throws Exception 
     * @name Sent Email Alert
    */
	
	public void Verify_SentEmailAlert(String ExpMessage) throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/iframe[1]")));

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
	    
		m_Driver.switchTo().defaultContent();

		
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
   elem = getWebElement(PayslipTemplate);

   if (elem == null) {
   	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayslipreptTemplate", "Click_PayslipreptTemplate failed. Unable to locate object: " + PayslipTemplate.toString());

   	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PayslipreptTemplate", "Click_PayslipreptTemplate failed. Unable to locate object: " + PayslipTemplate.toString());

   	Assert.fail("Unable to locate object: " + PayslipTemplate.toString());
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
	 * Get SubcontractorPayslips EmailTemplate from Agent Page
	*/
	public void Get_SCPayslipsEmailTemplate() 
	{
	 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));

	 elem = getWebElement(EmailParagrph);
	 if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_SCPayslipsEmailTemplate", "Get_SCPayslipsEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_Get_SCPayslipsEmailTemplate", "Get_SCPayslipsEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			Assert.fail("Unable to locate object: " + EmailParagrph.toString());
	  }
	 getTemplate = elem.getText();
	 System.out.println(getTemplate);

	 m_Driver.switchTo().defaultContent();

	 ExtentReportManager.passStep(m_Driver, "Get_SCPayslipsEmailTemplate");

	 TestModellerLogger.PassStep(m_Driver, "Get_SCPayslipsEmailTemplate");
	 
	}

	/**
	 * Verify SubcontractorPayslips EmailTemplate 
	 * @throws InterruptedException 
	 * @name SubcontractorPayslips EmailTemplate 
		*/
	public void Verify_SCPayslipsEmailTemplate() throws InterruptedException 
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/iframe[1]")));
		Thread.sleep(1000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));


	 elem = getWebElement(EmailParagrph);
	 if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_SCPayslipsEmailTemplate", "Verify_SCPayslipsEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_SCPayslipsEmailTemplate", "Verify_SCPayslipsEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

			Assert.fail("Unable to locate object: " + EmailParagrph.toString());
	}
	 String Actualtemplate = elem.getText();
	 System.out.println(Actualtemplate);
	 String Expectedtemplate = getTemplate;
	 Assert.assertEquals(Actualtemplate, Expectedtemplate, "Email Templates are not matched");

	 m_Driver.switchTo().defaultContent();

	 ExtentReportManager.passStep(m_Driver, "Verify_SCPayslipsEmailTemplate");

	 TestModellerLogger.PassStep(m_Driver, "Verify_SCPayslipsEmailTemplate");
	 
	}
	
 	/**
 	 * Take Screen shot of Page
	*/
 	public void TakeShot(String name) throws Exception
 	{
 		TakeScreenshot.takeScreenshot(m_Driver, name);	
 	}
 	



}
