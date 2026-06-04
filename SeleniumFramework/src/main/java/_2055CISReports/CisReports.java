package _2055CISReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class CisReports extends BasePage {

	public WebElement elem;
	public CisReports (WebDriver driver)
	{
		super(driver);
	}

	private By Report = By.xpath("//span[text()='Reports']");
	
	private By SubconcRptlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
	
	private By ConcRptlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
	
	private By Payslips = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_hrefReportPaySlip']");
	
	private By Detailpaytotal = By.xpath("//a[contains(text(),'Detailed')]");
	
	private By Summarypaytotal = By.xpath("//a[contains(text(),'Summarised')]");
	
	private By SubconcList = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_hrefReportSubcontractorList']");

	private By PandDstmt = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]");
	
	private By VerificationCertifc = By.xpath("//a[contains(text(),' Verification')]");

	private By SubmissionHstry = By.xpath("//a[contains(text(),' Submission')]");

	private By Pagetitle = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/h2[1]");

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
 	 * Get Subcontractor Report List
     * @name Report list
     */
	public void Get_SubconcRptlist()
	{
        
		elem = getWebElement(SubconcRptlist);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_SubconcRptlist", "Get_SubconcRptlist failed. Unable to locate object: " + SubconcRptlist.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_SubconcRptlist", "Get_SubconcRptlist failed. Unable to locate object: " + SubconcRptlist.toString());

			Assert.fail("Unable to locate object: " + SubconcRptlist.toString());
        }

		System.out.println(elem.getText());
          	
		ExtentReportManager.passStep(m_Driver, "Get_SubconcRptlist");

		TestModellerLogger.PassStep(m_Driver, "Get_SubconcRptlist");
	}
	

  /**
    * Get Contractor Report List
    * @name Report list
    */
    public void Get_ContractorRptlist()
    {
    
	  elem = getWebElement(ConcRptlist);

	  if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_ContractorRptlist", "Get_ContractorRptlist failed. Unable to locate object: " + ConcRptlist.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_ContractorRptlist", "Get_ContractorRptlist failed. Unable to locate object: " + ConcRptlist.toString());

		Assert.fail("Unable to locate object: " + ConcRptlist.toString());
        
        }
	  
		System.out.println(elem.getText());
      	
		ExtentReportManager.passStep(m_Driver, "Get_ContractorRptlist");

		TestModellerLogger.PassStep(m_Driver, "Get_ContractorRptlist");
   
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
	 * Click  on SubcontractorList
	* @name SubcontractorList
	*/
	public void Click_SubcontractorList()
	{

	elem = getWebElement(SubconcList);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SubcontractorList", "Click_SubcontractorList failed. Unable to locate object: " + SubconcList.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SubcontractorList", "Click_SubcontractorList failed. Unable to locate object: " + SubconcList.toString());

		Assert.fail("Unable to locate object: " + SubconcList.toString());
	}

	elem.click();
	  	

	ExtentReportManager.passStep(m_Driver, "Click_SubcontractorList");

	TestModellerLogger.PassStep(m_Driver, "Click_SubcontractorList");
	
   }
	
	/**
	 * Click  on SummarisedPayTotal
	 * @name SummarisedPayTotal
	 */
	public void Click_SummarisedPayTotal()
	{
	    
		elem = getWebElement(Summarypaytotal);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SummarisedPayTotal", "Click_SummarisedPayTotal failed. Unable to locate object: " + Summarypaytotal.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SummarisedPayTotal", "Click_SummarisedPayTotal failed. Unable to locate object: " + Summarypaytotal.toString());

			Assert.fail("Unable to locate object: " + Summarypaytotal.toString());
	    }

		elem.click();
	      	

		ExtentReportManager.passStep(m_Driver, "Click_SummarisedPayTotal");

		TestModellerLogger.PassStep(m_Driver, "Click_SummarisedPayTotal");
	}
	
	/**
	 * Click  on DetailedPayTotal
     * @name DetailedPayTotal
     */
     public void Click_DetailedPayTotal()
     {
    
	  elem = getWebElement(Detailpaytotal);

	  if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DetailedPayTotal", "Click_DetailedPayTotal failed. Unable to locate object: " + Detailpaytotal.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DetailedPayTotal", "Click_DetailedPayTotal failed. Unable to locate object: " + Detailpaytotal.toString());

		Assert.fail("Unable to locate object: " + Detailpaytotal.toString());
    }

	elem.click();
      	

	ExtentReportManager.passStep(m_Driver, "Click_DetailedPayTotal");

	TestModellerLogger.PassStep(m_Driver, "Click_DetailedPayTotal");
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
      * Click  on VerificationCertificate
      *  @name VerificationCertificate
      */
      public void Click_VerificationCertificate()
      {

       elem = getWebElement(VerificationCertifc);

       if (elem == null) {
     	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VerificationCertificate", "Click_VerificationCertificate failed. Unable to locate object: " + VerificationCertifc.toString());

     	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VerificationCertificate", "Click_VerificationCertificate failed. Unable to locate object: " + VerificationCertifc.toString());

     	Assert.fail("Unable to locate object: " + VerificationCertifc.toString());
     }

     elem.click();
       	

     ExtentReportManager.passStep(m_Driver, "Click_VerificationCertificate");

     TestModellerLogger.PassStep(m_Driver, "Click_VerificationCertificate");
     }

     /**
      * Click  on SubmissionHistory
      *  @name SubmissionHistory
      */
      public void Click_SubmissionHistory()
      {

       elem = getWebElement(SubmissionHstry);

       if (elem == null) {
     	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SubmissionHistory", "Click_SubmissionHistory failed. Unable to locate object: " + SubmissionHstry.toString());

     	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SubmissionHistory", "Click_SubmissionHistory failed. Unable to locate object: " + SubmissionHstry.toString());

     	Assert.fail("Unable to locate object: " + SubmissionHstry.toString());
     }

     elem.click();
       	

     ExtentReportManager.passStep(m_Driver, "Click_SubmissionHistory");

     TestModellerLogger.PassStep(m_Driver, "Click_SubmissionHistory");
     }
    
    /**
     * Verify Report Page 
     * @name Page title
     */
 	public void Verify_PageTitle(String Exptitle)
 	{
     
 		elem = getWebElement(Pagetitle);

 		if (elem == null) {
 		ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_PageTitle", "Verify_PageTitle failed. Unable to locate object: " + Pagetitle.toString());

 		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_PageTitle", "Verify_PageTitle failed. Unable to locate object: " + Pagetitle.toString());

 		Assert.fail("Unable to locate object: " + Pagetitle.toString());
 		
         }
 		
 		String Acttitle = elem.getText();
  		System.out.println("The actual page title : "+ Acttitle);	
  		
  		System.out.println("The expected page title : "+ Exptitle);
  		
  		Assert.assertEquals(Acttitle, Exptitle, "Page Titles are not matched");
       	
 		ExtentReportManager.passStep(m_Driver, "Verify_PageTitle");

 		TestModellerLogger.PassStep(m_Driver, "Verify_PageTitle");
 	}
 	
	/**
	 * Take Screen shot of Email Alert

	*/
	public void TakeShot(String name) throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, name);	
	}
}
