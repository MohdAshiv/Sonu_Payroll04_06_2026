package Quaterly_Paye_Scheme;

import pages.BasePage;
import pages1.PaymentManagementForQtrPaye;

import org.openqa.selenium.By;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/aa64b4a7-d36e-424f-9937-db681145bb77
@TestModellerModule(guid = "aa64b4a7-d36e-424f-9937-db681145bb77")
public class AllowenceSchemewithpaymentMangmnt extends BasePage
{
	float TaxAmount=0;
	float EmployeeNIAmount=0;
	float EmployerNIAmount=0;
	float TotalAmount=0;
	float BalanceOwedAmount=0;
	float PAYE_NI=0;
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public AllowenceSchemewithpaymentMangmnt (WebDriver driver)
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
	
	
	
	public void Click_clickPayrollSummary() throws InterruptedException
	{
        
		sTestCaseID="TC37";
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
      	year.selectByVisibleText(data[6]);
      	
      	String date=data[6];
      //	System.out.println("date value is :"+date);
      	String month=date.replaceAll("[^0-9]", "");
      	String value="30092020";
      	int monthvalue=0;
      	String Augvalue="30082020";
      	if(month==value || month==Augvalue)
      	{
		      	 monthvalue =Integer.parseInt(month);
		      	monthvalue=monthvalue/10000;
		      	monthvalue=monthvalue%10;
      	}
      	else
      	{
      		 monthvalue =Integer.parseInt(month);
	      	monthvalue=monthvalue/10000;
	      	monthvalue=monthvalue%100;
	      	System.out.println("Month u entered"+monthvalue);
      	}
      	
  
// PAYE & NI DUE TO HMRC converting to int value
     	
      	
      	String PAYE_NI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[7]/td[2]/table/tbody/tr/td/table/tbody/tr[31]/td[6]/div/div")).getText();
      	//System.out.println(Tax);
      	String PAYE_NIstr=PAYE_NI.replaceAll("[^0-9]", "");
      	
  		float PAYE_NIValue = Float.parseFloat(PAYE_NIstr);
  		PAYE_NIValue=PAYE_NIValue/100;
    
      
      	
      	
//Tax Finding  converting to int value
      	
      	String Tax=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td[3]/div/div")).getText();
      	//System.out.println(Tax);
      	String str=Tax.replaceAll("[^0-9]", "");
      	
  		float number = Float.parseFloat(str);
  		number=number/100;
  		
  		TaxAmount=TaxAmount+number;
  		System.out.println("This is Tax amount"+TaxAmount);
      	
  		
//Employee NI Finding converting to int value
  		
  		String EmployeeNI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td[6]/div/div")).getText();
      	//System.out.println(EmployeeNI);
  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
      	
  		float number1 = Float.parseFloat(EmployeeNIstr);
  		number1=number1/100;
  		
  		EmployeeNIAmount=EmployeeNIAmount+number1;
  		System.out.println("This is EmployeeNI amount"+EmployeeNIAmount);
      	
      	
//Employer NI Finding converting to int value
      	
      	String EmployerNI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td[8]/div/div")).getText();
      	//System.out.println(EmployerNI);
      	String EmployerNIstr=EmployerNI.replaceAll("[^0-9]", "");
      	
  		float number2 = Float.parseFloat(EmployerNIstr);
  		number2=number2/100;
  		
  		EmployerNIAmount=EmployerNIAmount+number2;
  		System.out.println("This is EmployerNI amount"+EmployerNIAmount);
  		
  		
//Balance owed (b/f) converting to int value
  		
  		String BalanceOwed=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[5]/td[5]/div/div")).getText();
      	//System.out.println(EmployerNI);
      	String BalanceOwedstr=BalanceOwed.replaceAll("[^0-9]", "");
      	
  		float number3 = Float.parseFloat(BalanceOwedstr);
  		number3=number3/100;
  		
  		BalanceOwedAmount=BalanceOwedAmount+number3;
  		System.out.println("This is Balance owed"+BalanceOwedAmount);
  		
  		
 //Tax Paid Amount
  		
  		PaymentManagementForQtrPaye ob=new PaymentManagementForQtrPaye(m_Driver);
  		float ToalPaidTax=ob.PaidtaxAmount();
  		System.out.println("Returned value of tax in new page="+ToalPaidTax);
      
  		
  		
//calculating Payment For Month payroll 2020
  		
  		float payment_of_month=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
  		System.out.println("This is total amount for month"+payment_of_month);


 //Total Payment till Month  converting to int value		
  		
  		String TotalPayment=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[36]/td[7]/div/div")).getText();
      	//System.out.println(EmployerNI);
      	String TotalPaymentstr=TotalPayment.replaceAll("[^0-9]", "");
      	
  		float Total = Float.parseFloat(TotalPaymentstr);
  		Total=Total/100;
  	
  		
  		
		  		TotalAmount=TotalAmount+Total;
		  		System.out.println("This is total amount paid in the month"+TotalAmount);
		  		
//verifying Payment For month 	
		  		
		  		float obtainedmonthtax=ob.monthtaxamount();
	          	System.out.println("After return"+obtainedmonthtax);
	          	
		  		
		  		if(monthvalue==06 || monthvalue==9 || monthvalue==12 || monthvalue==03 )
		      	{
		  		
		  			if(TotalAmount==obtainedmonthtax)
		  			{
		  				System.out.println("Total Payment For month amount is Ok "+TotalAmount);
		  			}
		  			else
		  			{
		  				System.out.println("Error!!! month amount and tax amount din't match"+monthvalue);
		  		
		  			}	
		      	}
		  		
		  		else
		  		{
		  			
		  			
		  			if(TotalAmount==((BalanceOwedAmount+payment_of_month)-obtainedmonthtax))
			  		{
			  			System.out.println("Total Payment For month amount is Ok "+TotalAmount);
			  		}
			  		else
			  		{
			  			System.out.println(payment_of_month+"Error!!! month amount and tax amount din't match"+TotalAmount);
			  		}
		  		}
  		
 //Verifying PAYE_NI to HMRC and Payment For Month		
  		
  		
  		if(monthvalue==06 || monthvalue==9 || monthvalue==12 || monthvalue==03 )
      	{
      		
      		if(PAYE_NIValue==(payment_of_month+BalanceOwedAmount))
      		{
      			System.out.println("PAYE & NI DUE TO HMRC amunt paid is ok");
      		}
      		else
      		{
      			System.out.println("Error!!! Somthing is wrong. The month is end of quarter and PAYE_NI is not expected one ");
      		}
      		
      	}
  		else
  		{
  			if(PAYE_NIValue==0)
  			{
  				System.out.println("PAYE & NI DUE TO HMRC amount paid is 0."+PAYE_NIValue);
  			}
  			else
  			{
  				System.out.println("Error!!! Some tax amount is paid to HMRC:"+PAYE_NIValue);
  			}
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