package Quaterly_Paye_Scheme;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Window;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import org.openqa.selenium.WebDriver.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ExcelData;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import utilities.CalculateDatesRange;



// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/aa64b4a7-d36e-424f-9937-db681145bb77
@TestModellerModule(guid = "aa64b4a7-d36e-424f-9937-db681145bb77")
public class MulfreqQPSdisable extends BasePage
{
	String eDate="05/04/2023";
	double PAYE_NIValue=0;
	
	double TotalAmount=0;

	int i=0;
	
	int size=0;
	
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
    SimpleDateFormat ob=new SimpleDateFormat("dd/MM/yyyy");
	
	public MulfreqQPSdisable (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickAllowances_SchemesElem = By.xpath("//A[contains(text(),'Allowances & Schemes')]");

	private By markYesElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbQuarterlyPayeScheme_1']");

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
     * @name Click clickAllowances & Schemes
     */
	public void Click_clickAllowances_Schemes()
	{
        
		WebElement elem = getWebElement(clickAllowances_SchemesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAllowances_Schemes", "Click_clickAllowances_Schemes failed. Unable to locate object: " + clickAllowances_SchemesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAllowances_Schemes", "Click_clickAllowances_Schemes failed. Unable to locate object: " + clickAllowances_SchemesElem.toString());

			Assert.fail("Unable to locate object: " + clickAllowances_SchemesElem.toString());
        }

		elem.click();
          	

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
	 * @throws ParseException 
     * @name Click clickPayrollSummary
     */
	
	
	public void Click_clickPayrollSummary() throws InterruptedException, ParseException
	{
        
		sTestCaseID="TC53";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
		
		WebElement elem = getWebElement(clickPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSummaryElem.toString());
        }

		elem.click();
		
		
		String data2=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")).getText();
		
		 
		


  		
  		
  		
		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSummary");
	}

    
	
	
/*select date one by one
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
		

				        for(i=1;i<=size;i++)
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
		  		
		  			String sDate=a[i-1];
		  			System.out.println("sDate="+sDate);
		  			System.out.println("eDate="+eDate);
		  			
		  		int Range=	CalculateDatesRange.getDatesBetweenUsingJava7(sDate, eDate);
		  		
		  		System.out.println("Range is="+Range);
		  		int limit=7;
		  		boolean b=false;
		  		if(Range>=limit)
		  		{
		  			b=true;
		  		}
		  		else
		  		{
		  			System.out.println("Amount due to HMRC sent two times ");
		  		}
		  		
		  		assertTrue(b);
		          	
		  		eDate=sDate;
		  			
		  			
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