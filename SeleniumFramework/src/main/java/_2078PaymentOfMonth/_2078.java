package _2078PaymentOfMonth;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8031722d-f17f-4ee1-ba07-0f6584864044
@TestModellerModule(guid = "8031722d-f17f-4ee1-ba07-0f6584864044")
public class _2078 extends BasePage
{
	
	int i;
	int size;
	static int monthcount=1;

	public _2078 (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Reports_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By Payroll_SummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefPayrollSummary']");
	
	private By ctl00ctl00ParentContentddlTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By ctl00ctl00ParentContentddlPayrollDateElem = By.xpath("//label[normalize-space()= 'Period End:']/../select");



	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15436");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15436");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15436");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15436";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=15436")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Reports 
     * @name Click  Reports 
     */
	public void Click__Reports_()
	{
        
		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
	}

     
	/**
 	 * Click Payroll Summary
     * @name Click Payroll Summary
     */
	public void Click_Payroll_Summary()
	{
        
		WebElement elem = getWebElement(Payroll_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Summary", "Click_Payroll_Summary failed. Unable to locate object: " + Payroll_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Summary", "Click_Payroll_Summary failed. Unable to locate object: " + Payroll_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_SummaryElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Summary");
	}
	
	
	
	/**
 	 * Select ctl00$ctl00$ParentContent$ddlTaxYears
     * @name Select ctl00$ctl00$ParentContent$ddlTaxYears
     */
    public void Select_ctl00ctl00ParentContentddlTaxYears(String ctl00ctl00ParentContentddlTaxYears)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentddlTaxYearsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears", "Select_ctl00ctl00ParentContentddlTaxYears failed. Unable to locate object: " + ctl00ctl00ParentContentddlTaxYearsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears", "Select_ctl00ctl00ParentContentddlTaxYears failed. Unable to locate object: " + ctl00ctl00ParentContentddlTaxYearsElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentddlTaxYearsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentddlTaxYears);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears " + ctl00ctl00ParentContentddlTaxYears);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentddlTaxYears " + ctl00ctl00ParentContentddlTaxYears);
 	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$ddlPayrollDate
     * @name Select ctl00$ctl00$ParentContent$ddlPayrollDate
     */
    public void Select_ctl00ctl00ParentContentddlPayrollDate(String ctl00ctl00ParentContentddlPayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentddlPayrollDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate", "Select_ctl00ctl00ParentContentddlPayrollDate failed. Unable to locate object: " + ctl00ctl00ParentContentddlPayrollDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate", "Select_ctl00ctl00ParentContentddlPayrollDate failed. Unable to locate object: " + ctl00ctl00ParentContentddlPayrollDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentddlPayrollDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentddlPayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate " + ctl00ctl00ParentContentddlPayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentddlPayrollDate " + ctl00ctl00ParentContentddlPayrollDate);
 	}
    
    /**
     * Weekly check Payment of the month text
     */
    public void POTMwhenWeekly()
    {
    	//Getting payment done in month
 		 
	  		String PaymentOfMonth=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Payment For')]")).getText();
    	
	  		System.out.println("Expected output="+PaymentOfMonth);
	  		
	  		assertEquals(PaymentOfMonth, "Payment For Apr 2021");
    }
	
	
	/**
	 * Verify payment of the month
	 * 
	 */
	public void checkTextofPaymentofTheMonth() throws InterruptedException
	{
		
		try {
		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
	//	System.out.println(data1.get(i).getText());

		
		
		System.out.println("xyr");
		size=data1.size();
		
		String[] a=new String [size];
		
		for(i=size-1;i>=0;i--)
		{
			
		//	System.out.println("i=="+i);
		a[i]=data1.get(i).getText();
		System.out.println("date is="+a[i]);
		}
		

				        for(i=size-1;i>=0;i--)
				        {
				     //   	System.out.println("value of i="+i);
				        

				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
				  	
				  		 Select date=new Select(PeriodEnd); 
				  		 Thread.sleep(1000);
				  
				  		  date.selectByVisibleText(a[i]);
				  		 Thread.sleep(1000);
				  		 
				  		 
				  		 
				  		
				  		 
//Getting payment done in month
    			  		 
      			  		String PaymentOfMonth=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Payment For')]")).getText();
      		      	
      			  		System.out.println("Expected output="+PaymentOfMonth);
      			  		
 //Verify payment of the month
      			  		
      			  		if(monthcount==1)
      			  		{
      			  			assertEquals(PaymentOfMonth, "Payment For Apr 2021");
      			  		System.out.println(monthcount);
      			  		}
      			  		
      			  		else if(monthcount==2)
  			  		{
  			  			assertEquals(PaymentOfMonth, "Payment For May 2021");
  			  		System.out.println(monthcount);
  			  		}
      			  		
      			  	else if(monthcount==3)
  			  		{
  			  			assertEquals(PaymentOfMonth, "Payment For Jun 2021");
  			  		System.out.println(monthcount);
  			  		}
      			  		
      			  else if(monthcount==4)
			  		{
			  			assertEquals(PaymentOfMonth, "Payment For Jul 2021");
			  			System.out.println(monthcount);
			  		}
      			  		
      			else if(monthcount==5)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Aug 2021");
		  			System.out.println(monthcount);
		  		}
      			  	
      			else if(monthcount==6)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Sep 2021");
		  			System.out.println(monthcount);
		  		}
      			  		
      			  		
      			else if(monthcount==7)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Oct 2021");
		  			System.out.println(monthcount);
		  		}
      			  		
      			  		
      			else if(monthcount==8)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Nov 2021");
		  			System.out.println(monthcount);
		  		}
      			  		
      			else if(monthcount==9)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Dec 2021");
		  			System.out.println(monthcount);
		  		}
      			  		
      			  		
      			else if(monthcount==10)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Jan 2022");
		  			System.out.println(monthcount);
		  		}
      			  		
      			  		
      			else if(monthcount==11)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Feb 2022");
		  			System.out.println(monthcount);
		  		}
      			  		
      			  		
      			else if(monthcount==12)
		  		{
		  			assertEquals(PaymentOfMonth, "Payment For Mar 2022");
		  			System.out.println(monthcount);
		  		}
      			  		
      			else
      			{
      				assertEquals(monthcount, "15");
      				System.out.println(monthcount);
      			}
      			  		
      			  	monthcount++;
      			  		
				  		 
				        }
				        
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}
	

	
	
}