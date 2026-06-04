package Quaterly_Paye_Scheme;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ExcelData;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/aa64b4a7-d36e-424f-9937-db681145bb77
@TestModellerModule(guid = "aa64b4a7-d36e-424f-9937-db681145bb77")
public class CIS_With_Disable_Scheme extends BasePage
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    
    static float Taxvalue=0;
    static float EE_NIvalue=0;
    static float ER_NIvalue=0;
    static float Balance_owedvalue=0;
    static float payment_of_the_monthvalue=0;
    static float CIS_sufferedvalue=0;
    static float Pay_NI_DuetoHMRCvalue=0;
	
	public CIS_With_Disable_Scheme (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickAllowances_SchemesElem = By.xpath("//A[contains(text(),'Allowances & Schemes')]");

	private By markYesElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbQuarterlyPayeScheme_0']");

	private By clickSaveElem = By.xpath("//*[@id='btnSave']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickPayrollSummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefPayrollSummary']");

	private By SelectPayrollMonthDateElem = By.xpath("//label[contains(.,'Period End:')]/../select");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=11992");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=11992");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=11992");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=11992";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=11992")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickAllowances & Schemes
	 * @throws Exception 
     * @name Click clickAllowances & Schemes
     */
	public void Click_clickAllowances_Schemes() throws Exception
	{
        
		WebElement elem = getWebElement(clickAllowances_SchemesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAllowances_Schemes", "Click_clickAllowances_Schemes failed. Unable to locate object: " + clickAllowances_SchemesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAllowances_Schemes", "Click_clickAllowances_Schemes failed. Unable to locate object: " + clickAllowances_SchemesElem.toString());

			Assert.fail("Unable to locate object: " + clickAllowances_SchemesElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "Diable Allowance Scheme");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAllowances_Schemes");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAllowances_Schemes");
	}

     
	/**
 	 * Click markYes
     * @name Click markYes
     */
	public void Click_markYes()
	{
        
		WebElement elem = getWebElement(markYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_markYes", "Click_markYes failed. Unable to locate object: " + markYesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_markYes", "Click_markYes failed. Unable to locate object: " + markYesElem.toString());

			Assert.fail("Unable to locate object: " + markYesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_markYes");

		TestModellerLogger.PassStep(m_Driver, "Click_markYes");
	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
		Thread.sleep(3000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click gotoPayrollDashboard
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard()
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	
          
//          for(int i=0; i<3; i++)
//            {
//           	 
//           	 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']")).click();
//           	 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']")).click();
//            }

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
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
	 * @throws InterruptedException 
     * @name Click clickPayrollSummary
     */
	
//	float TaxAmount=0;
//	float EmployeeNIAmount=0;
//	float EmployerNIAmount=0;
//	float TotalAmount=0;
//	float BalanceOwedAmount=0;
//	float PAYE_NI=0;
	
	public void Click_clickPayrollSummary() throws InterruptedException
	{
        
		sTestCaseID="TC38";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
		
		WebElement elem = getWebElement(clickPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSummaryElem.toString());
        }

		elem.click();
          	
		WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']"));
      	Select year=new Select(PeriodEnd);
      	Thread.sleep(2000);
//      	String n=(data[6]);
//      	System.out.println("value of n="+n);
      	year.selectByVisibleText(data[6]);
      	
//      	String date=data[5];
//      //	System.out.println("date value is :"+date);
//      	String month=date.replaceAll("[^0-9]", "");
//      	String value="30092020";
//      	float monthvalue=0;
//      	String Augvalue="30082020";
//      	if(month==value || month==Augvalue)
//      	{
//		      	 monthvalue =Float.parseFloat(month);
//		      	monthvalue=monthvalue/10000;
//		      	monthvalue=monthvalue%10;
//      	}
//      	else
//      	{
//      		 monthvalue =Float.parseFloat(month);
//	      	monthvalue=monthvalue/10000;
//	      	monthvalue=monthvalue%100;
//      	}
      	
  
//calling value of Tax method from Reports_PayrollSummary page
/*
 * 
 * 		
 */ 		
      	Reports_payrollSummary_table payroll_summary_ob=new Reports_payrollSummary_table(m_Driver);
      	{
      		Taxvalue=payroll_summary_ob.tax();
      		System.out.println("Your Tax value in reports page:"+Taxvalue);
      	}
  		
      	
//calling value of EE_NIReports method from Reports_PayrollSummary page
/*
* 
* 		
*/ 		
      	
      	 EE_NIvalue=payroll_summary_ob.EE_NIReports();
      	    System.out.println("Your EE_NI value in reports page:"+EE_NIvalue);
      	     	
      	
//calling value of ER_NIReports method from Reports_PayrollSummary page    
      	    
      	    ER_NIvalue=payroll_summary_ob.ER_NIReports();
      	    System.out.println("Your ER_NI value in reports page:"+ER_NIvalue);
      	    
 // calling value of balance owed method from Reports_PayrollSummary page 
      	    
      	    Balance_owedvalue=payroll_summary_ob.Balance_Owed();
      	    System.out.println("Your Balance owed value in reports page:"+Balance_owedvalue);
      	    
// calling value of payment of the month method from Reports_PayrollSummary page   
      	    
      	    payment_of_the_monthvalue=payroll_summary_ob.Payment_of_the_Month();
      	    System.out.println("Your payment of the month value in reports page:"+payment_of_the_monthvalue);
      	    
// calling Pay_NI_DuetoHMRCvalue value      	    
      	  
        	Pay_NI_DuetoHMRCvalue=payroll_summary_ob.Paye_NI_Due_to_HMRC();
        	System.out.println("your Pay_NI_Due to HMRC amount in reports page:"+Pay_NI_DuetoHMRCvalue);      	    
      	    
      	    
// calling CIS_Suffered value      	    
      	  Tax_Payment_Table EE_ob=new Tax_Payment_Table(m_Driver); 
      	CIS_sufferedvalue=EE_ob.CIS_SufferedSenttoReports();
      	System.out.println("your CIS_suffered amount in reports page:"+CIS_sufferedvalue);
      	
    
 //verifying Payment of the month value 
      	
      	if(payment_of_the_monthvalue==((Taxvalue+EE_NIvalue+ER_NIvalue)-CIS_sufferedvalue))
      	{
      		System.out.println("Your payment of the month value is correct");
      	
      	}
      	else
      	{
      		System.out.println("Error...Your payment of the month value is incorrect");
      	}
      	

    	
    	
//verifying PAYE & NI DUE TO HMRC value 
    	
    	if(Pay_NI_DuetoHMRCvalue==payment_of_the_monthvalue)
    	{
    		System.out.println("Your Pay_NI_DuetoHMRC value is Matched");
    	}
    	else
    	{
    		System.out.println("Error...Your Pay_NI_DuetoHMRC value did not Matched to payment_of_the_month value ");
    	}
    	
    	      	
      	
      	
  		
		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSummary");
	}

    
	/**
 	 * Select SelectPayrollMonthDate
     * @name Select SelectPayrollMonthDate
     */
    public void Select_SelectPayrollMonthDate(String SelectPayrollMonthDate)
 	{
 	    
 		WebElement elem = getWebElement(SelectPayrollMonthDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectPayrollMonthDate", "Select_SelectPayrollMonthDate failed. Unable to locate object: " + SelectPayrollMonthDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectPayrollMonthDate", "Select_SelectPayrollMonthDate failed. Unable to locate object: " + SelectPayrollMonthDateElem.toString());

 			Assert.fail("Unable to locate object: " + SelectPayrollMonthDateElem.toString());
         }

// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(SelectPayrollMonthDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectPayrollMonthDate " + SelectPayrollMonthDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectPayrollMonthDate " + SelectPayrollMonthDate);
 	}
}