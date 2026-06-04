package PaymentMmgt;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.CalculateDatesRange;
import utilities.ExcelData;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/008d2344-02fb-481f-bcf5-c1f03d61926e
@TestModellerModule(guid = "008d2344-02fb-481f-bcf5-c1f03d61926e")
public class TS01PM extends BasePage
{
	float PayeDuetoHMRC=0;
	int len;
	String eDate="05/04/2023";
	double PAYE_NIValue=0;
	
	double TotalAmount=0;

	int i=0;
	
	int size=0;
	
	

    SimpleDateFormat ob=new SimpleDateFormat("dd/MM/yyyy");
	
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public TS01PM (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoTaxPaymentElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");

	private By gotoPayrollDashboardElem1 = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickHMRCPaymentsMadeElem = By.xpath("//label[contains(.,'Quarter:')]/../../../../../../../div[3]/div/a[5]");

	private By EnterNICActualPaidAmountElem = By.cssSelector("INPUT[value='\\30 ']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By clickPayrollSummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefPayrollSummary']");

	private By getPaymentofMonthElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[33]/td[6]/div/div");

	private By getPayeDuetoHMRCElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[38]/td[8]/div/div");

	private By getBFElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[11]/td[4]/div/div");

	private By getBalCFElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[7]/td[4]/div/div");

	private By getTaxElem = By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[3]/table/tbody/tr[3]/td[3]/div");

	private By getEE_NIElem = By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[3]/table/tbody/tr[3]/td[6]/div");

	private By getER_NIElem = By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[3]/table/tbody/tr[3]/td[8]/div");
	
	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By ClickRunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By ClickRunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12259");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12259");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12259");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12259";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12259")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }
   
   
	/**
	 * Click gotoPayrollDashboard
	 * @throws InterruptedException 
    * @name Click gotoPayrollDashboard
    */
	public void Click_gotoPayrollDashboard1() throws InterruptedException
	{
       
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
       }

		Thread.sleep(2000);
		elem.click();
         	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

    
	/**
	 * Click ClickRunPayroll1
    * @name Click ClickRunPayroll1
    */
	public void Click_ClickRunPayroll1()
	{
       
		WebElement elem = getWebElement(ClickRunPayroll1Elem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRunPayroll1", "Click_ClickRunPayroll1 failed. Unable to locate object: " + ClickRunPayroll1Elem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRunPayroll1", "Click_ClickRunPayroll1 failed. Unable to locate object: " + ClickRunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + ClickRunPayroll1Elem.toString());
       }

		elem.click();
         	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRunPayroll1");
	}

    
	/**
	 * Click ClickRunPayroll2
	 * @throws Exception 
    * @name Click ClickRunPayroll2
    */
	public void Click_ClickRunPayroll2() throws Exception
	{
       
		WebElement elem = getWebElement(ClickRunPayroll2Elem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickRunPayroll2", "Click_ClickRunPayroll2 failed. Unable to locate object: " + ClickRunPayroll2Elem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickRunPayroll2", "Click_ClickRunPayroll2 failed. Unable to locate object: " + ClickRunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + ClickRunPayroll2Elem.toString());
       }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "Annual_Frequency");
         	

		ExtentReportManager.passStep(m_Driver, "Click_ClickRunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickRunPayroll2");
	}

     
	/**
 	 * Click gotoTaxPayment
	 * @throws InterruptedException 
     * @name Click gotoTaxPayment
     */
	public void Click_gotoTaxPayment() throws InterruptedException
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
        }

	Thread.sleep(2000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}
	
	
	/**
 	 * Click gotoTaxPayment
	 * @throws Exception 
	 * @name Click gotoTaxPayment
     */
	public void Click_gotoTaxPayment1() throws Exception
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
        }

	Thread.sleep(3000);
		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "HMRC Payments made tab visibility");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}

	
	/**
 	 * Click gotoTaxPayment
	 * @throws Exception 
	 * @name Click gotoTaxPayment
     */
	public void Click_gotoTaxPayment2() throws Exception
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
        }

	Thread.sleep(3000);
		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "HMRC Payments made tab visibilityforMidYear");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}
	
	
	/**
 	 * Click gotoTaxPayment
	 * @throws Exception 
	 * @name Click gotoTaxPayment
     */
	public void Click_gotoTaxPayment3() throws Exception
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
        }

	Thread.sleep(3000);
		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "HMRC Payments made tab visibilityforMulFreq");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}
	
	
	/**
 	 * Click gotoTaxPayment
	 * @throws Exception 
	 * @name Click gotoTaxPayment
     */
	public void Click_gotoTaxPayment4() throws Exception
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
        }

	Thread.sleep(3000);
		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "HMRC Payments made tab visibilityforFortnight");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
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

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

     
	/**
 	 * Click gotoFilingManagement
     * @name Click gotoFilingManagement
     */
	public void Click_gotoFilingManagement()
	{
        
		WebElement elem = getWebElement(gotoFilingManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFilingManagementElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagement");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFilingManagement");
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
 	 * Click clickHMRCPaymentsMade
     * @name Click clickHMRCPaymentsMade
     */
	public void Click_clickHMRCPaymentsMade()
	{
        
		WebElement elem = getWebElement(clickHMRCPaymentsMadeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickHMRCPaymentsMade", "Click_clickHMRCPaymentsMade failed. Unable to locate object: " + clickHMRCPaymentsMadeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickHMRCPaymentsMade", "Click_clickHMRCPaymentsMade failed. Unable to locate object: " + clickHMRCPaymentsMadeElem.toString());

			Assert.fail("Unable to locate object: " + clickHMRCPaymentsMadeElem.toString());
        }

		elem.click();
          	
		

		ExtentReportManager.passStep(m_Driver, "Click_clickHMRCPaymentsMade");

		TestModellerLogger.PassStep(m_Driver, "Click_clickHMRCPaymentsMade");
	}
	
	
	/**
 	 * Enter EnterNICActualPaidAmount
     * @name Enter EnterNICActualPaidAmount
     */
 	public void Enter_EnterNICActualPaidAmount2(String EnterNICActualPaidAmount)
 	{
 	 
 		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
 		
 		int len=m_Driver.findElements(By.xpath("//*[@type='text']")).size();
 		System.out.println("len"+len);
 		if(len>1)
 		{
 			for(int i=len;i<=len;i++)
 			{
 				int j=i-1;
 				WebElement newElem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+j+"_txtNICActualPaidAmount']"));
 				
 				System.out.println(newElem+"===elem");
 				newElem.clear();

 				newElem.sendKeys(EnterNICActualPaidAmount);
 			}
 		}
 		
 		
 		m_Driver.switchTo().defaultContent();
 		
 	}

      
	/**
 	 * Enter EnterNICActualPaidAmount
     * @name Enter EnterNICActualPaidAmount
     */
 	public void Enter_EnterNICActualPaidAmount(String EnterNICActualPaidAmount)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterNICActualPaidAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

 			Assert.fail("Unable to locate object: " + EnterNICActualPaidAmountElem.toString());
         }
 		
 		int len=m_Driver.findElements(By.xpath("//*[@type='text']")).size();
 		System.out.println("len"+len);
 		if(len>=1)
 		{
 			for(int i=len;i<=len;i++)
 			{
 				int j=i-1;
 				WebElement newElem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+j+"_txtNICActualPaidAmount']"));
 				elem=newElem;
 				System.out.println(elem+"===elem");
 					elem.clear();

 					elem.sendKeys(EnterNICActualPaidAmount);
 			}
 		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);
 	}
 	
 	/**
 	 * Enter EnterNICActualPaidAmount
     * @name Enter EnterNICActualPaidAmount
     */
 	public void Enter_EnterNICActualPaidAmount1(String EnterNICActualPaidAmount)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterNICActualPaidAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

 			Assert.fail("Unable to locate object: " + EnterNICActualPaidAmountElem.toString());
         }
 		
 		
 		if(len==1)
 		{
 		elem.clear();

 		elem.sendKeys(EnterNICActualPaidAmount);
 		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);
 	}

     
	/**
 	 * Click clickSave
     * @name Click clickSave
     */
	public void Click_clickSave()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click clickPayrollSummary
     * @name Click clickPayrollSummary
     */
	public void Click_clickPayrollSummary()
	{
        
		WebElement elem = getWebElement(clickPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSummaryElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSummary");
	}

	
/*select date one by one
 * 
 *  
 * 	
*/
	
		
		public void iteratedate() throws InterruptedException
		{
			
			try {
			List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
		//	System.out.println(data1.get(i).getText());

			
			
			size=data1.size();
			String[] a=new String [size];
			
			for(i=0;i<size;i++)
			{
			a[i]=data1.get(i).getText();
			}
			

					        for(i=size;i<=size;i++)
					        {
					       

					            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
					  	
					  		 Select date=new Select(PeriodEnd); 
					  		 Thread.sleep(1000);
					  
					  		  date.selectByVisibleText(a[i-1]);
					  		 Thread.sleep(1000);

	//Payment DUE to HMRC				  		 
					  		String PAYE_NI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[33]/td[6]/div/div")).getText();
				      	
				      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
				      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
				      	
				  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
				  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
				  		 
	//Getting payment done in month
				  		 
				  		String TotalPayment=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[38]/td[8]/div/div")).getText();
			      	
			      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
			      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
			      	
			  		 TotalAmount = Double.parseDouble(TotalPaymentstr);
			  		System.out.println("TotalAmount="+TotalAmount);
			  		
			  		assertEquals(PAYE_NIValue, TotalAmount);
			  		
			  		if(PAYE_NIValue!=0.0)
			  		{
			  			
			  			
			  			
			  		
//			  			String sDate=a[i-1];
//			  			System.out.println("sDate="+sDate);
//			  			System.out.println("eDate="+eDate);
//			  			
//			  		int Range=	CalculateDatesRange.getDatesBetweenUsingJava7(sDate, eDate);
//			  		
//			  		System.out.println("Range is="+Range);
//			  		int limit=7;
//			  		boolean b=false;
//			  		if(Range>=limit)
//			  		{
//			  			b=true;
//			  		}
//			  		else
//			  		{
//			  			System.out.println("Amount due to HMRC sent two times ");
//			  		}
//			  		
//			  		assertTrue(b);
//			          	
//			  		eDate=sDate;
			  			
			  			
			  		}
				  		 
				  		 
					 
					  	System.out.println(a[i-1]);
					  		
					  	
					        }
			}
							

			
			catch(Exception e)
			{

				System.out.println(e);
			}
		}
     
	/**
 	 * Click getPaymentofMonth
     * @name Click getPaymentofMonth
     */
	public void Click_getPayeDuetoHMRC()
	{
        
		WebElement elem = getWebElement(getPaymentofMonthElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPaymentofMonth", "Click_getPaymentofMonth failed. Unable to locate object: " + getPaymentofMonthElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPaymentofMonth", "Click_getPaymentofMonth failed. Unable to locate object: " + getPaymentofMonthElem.toString());

			Assert.fail("Unable to locate object: " + getPaymentofMonthElem.toString());
        }

		String PayeDueToHMRC=elem.getText();
		
		PayeDueToHMRC=PayeDueToHMRC.replaceAll("[£]", "");
		PayeDueToHMRC=PayeDueToHMRC.replaceAll("[,]", "");
		
		float PayeDueToHMRCAmount=Float.parseFloat(PayeDueToHMRC);
		
		PayeDuetoHMRC=PayeDueToHMRCAmount;
		
		System.out.println("PayeDuetoHMRC+="+PayeDueToHMRCAmount);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPaymentofMonth");

		TestModellerLogger.PassStep(m_Driver, "Click_getPaymentofMonth");
	}

     
	/**
 	 * Click getPayeDuetoHMRC
     * @name Click getPayeDuetoHMRC
     */
	public void Click_getPaymentoftheMonth()
	{
        
		WebElement elem = getWebElement(getPayeDuetoHMRCElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPayeDuetoHMRC", "Click_getPayeDuetoHMRC failed. Unable to locate object: " + getPayeDuetoHMRCElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPayeDuetoHMRC", "Click_getPayeDuetoHMRC failed. Unable to locate object: " + getPayeDuetoHMRCElem.toString());

			Assert.fail("Unable to locate object: " + getPayeDuetoHMRCElem.toString());
        }

		String PaymentofMonth=elem.getText();
		
		System.out.println("PaymentOftheMonth+="+PaymentofMonth);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPayeDuetoHMRC");

		TestModellerLogger.PassStep(m_Driver, "Click_getPayeDuetoHMRC");
	}

     
	/**
 	 * Click getB/F
     * @name Click getB/F
     */
	public void Click_getCF()
	{
		
		sTestCaseID="TC118";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
		WebElement elem = getWebElement(getBFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getBF", "Click_getBF failed. Unable to locate object: " + getBFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getBF", "Click_getBF failed. Unable to locate object: " + getBFElem.toString());

			Assert.fail("Unable to locate object: " + getBFElem.toString());
        }

		String C_F=elem.getText();
		C_F=C_F.replaceAll("[£]", "");
		C_F=C_F.replaceAll("[,]", "");
		
		float C_FAmount=Float.parseFloat(C_F);
		
		String paid_amount=data[5];
		paid_amount=paid_amount.replaceAll("[£]", "");
		paid_amount=paid_amount.replaceAll("[,]", "");
		
		float paidTaxamount=Float.parseFloat(paid_amount);
		System.out.println(paidTaxamount+"++++");
		float ExpectedAmount=PayeDuetoHMRC-paidTaxamount;
		ExpectedAmount=(float) (Math.round(ExpectedAmount *100)/100.0);
		assertEquals(C_FAmount, ExpectedAmount);
		
		System.out.println("Bal C_F="+C_F);

		ExtentReportManager.passStep(m_Driver, "Click_getBF");

		TestModellerLogger.PassStep(m_Driver, "Click_getBF");
	}
	
	
	
	/**
 	 * Click getB/F
     * @name Click getB/F
     */
	public void Click_getCF1()
	{
		
		sTestCaseID="TC110";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
		WebElement elem = getWebElement(getBFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getBF", "Click_getBF failed. Unable to locate object: " + getBFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getBF", "Click_getBF failed. Unable to locate object: " + getBFElem.toString());

			Assert.fail("Unable to locate object: " + getBFElem.toString());
        }

		String C_F=elem.getText();
		C_F=C_F.replaceAll("[£]", "");
		C_F=C_F.replaceAll("[,]", "");
		
		float C_FAmount=Float.parseFloat(C_F);
		
		String paid_amount=data[5];
		paid_amount=paid_amount.replaceAll("[£]", "");
		paid_amount=paid_amount.replaceAll("[,]", "");
		
		float paidTaxamount=Float.parseFloat(paid_amount);
		System.out.println("Paid Tax="+paidTaxamount);
		float ExpectedAmount=PayeDuetoHMRC-paidTaxamount;
		ExpectedAmount=(float) (Math.round(ExpectedAmount *100)/100.0);
		assertEquals(C_FAmount, ExpectedAmount);
		
		System.out.println("Bal C_F="+C_F);

		ExtentReportManager.passStep(m_Driver, "Click_getBF");

		TestModellerLogger.PassStep(m_Driver, "Click_getBF");
	}

	

     
	/**
 	 * Click getBalC/F
     * @name Click getBalC/F
     */
	public void Click_getBalBF()
	{
        
		WebElement elem = getWebElement(getBalCFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getBalCF", "Click_getBalCF failed. Unable to locate object: " + getBalCFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getBalCF", "Click_getBalCF failed. Unable to locate object: " + getBalCFElem.toString());

			Assert.fail("Unable to locate object: " + getBalCFElem.toString());
        }

		String B_F=elem.getText();
		
		System.out.println("Bal B_F"+B_F);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getBalCF");

		TestModellerLogger.PassStep(m_Driver, "Click_getBalCF");
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
          	

		ExtentReportManager.passStep(m_Driver, "Click_getTax");

		TestModellerLogger.PassStep(m_Driver, "Click_getTax");
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
		
		System.out.println("EE_NI"+EE_NI);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getEE_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_getEE_NI");
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
		
		System.out.println("ER_NI"+ER_NI);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getER_NI");

		TestModellerLogger.PassStep(m_Driver, "Click_getER_NI");
	}
}