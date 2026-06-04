package Quaterly_Paye_Scheme;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/aa64b4a7-d36e-424f-9937-db681145bb77
@TestModellerModule(guid = "aa64b4a7-d36e-424f-9937-db681145bb77")
public class NoAllowenceScheme extends BasePage
{
	static double EmploymentAllowance=0;
	String eDate="05/04/2023";
	double PAYE_NIValue=0;
	
	static double prevTax=0.0;
	static double prevBalowed=0.0;
	
	double Totalamount=0;
	
	double BalancecarryAmount=0;

	int i=0;
	int j=4;
	int k=7;
	
	int size=0;
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public NoAllowenceScheme (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickAllowances_SchemesElem = By.xpath("//A[contains(text(),'Allowances & Schemes')]");

	private By markYesElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbQuarterlyPayeScheme_0']");

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

		Thread.sleep(3000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAllowances_Schemes");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAllowances_Schemes");
	}
	
	/**
	 * Mark ys or no to Allowence scheme
	 * @throws InterruptedException 
	 */
	public void allowenceYesNo() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean value=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_0']")).isSelected();
		Thread.sleep(2000);
		System.out.println("Value yes="+value);
		
		if(value==true)
		{
			System.out.println("Hi");
			
			EmploymentAllowance=4000;
		}
	
//		Thread.sleep(2000);
//		m_Driver.findElement(By.xpath("//*[@id='btnSave']")).click();
//		Thread.sleep(2000);
//		boolean Novalue=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_1']")).isSelected();
//		Thread.sleep(2000);
//		System.out.println("Value yes="+Novalue);
//		Thread.sleep(2000);
		
		
//		m_Driver.findElement(By.xpath("//*[@id='btnSave']")).click();
	}
	
	
	/**
	 * Sending EmploymentAllowance
	 * @return 
	 */
	public double getEmploymentAllowance()
	{
		System.out.println("EmploymentAllowance before return"+EmploymentAllowance);
		return EmploymentAllowance;
	}
	
	
	/**
	 * Mark No
	 * 
	 */
	public void markNo()
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbQuarterlyPayeScheme_1']")).click();
		
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

		//elem.click();
          	jsExec.executeScript("arguments[0].click();", elem);

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
	 * @throws InterruptedException 
     * @name Click gotoReports
     */
	public void Click_gotoReports() throws InterruptedException
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		Thread.sleep(4000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click clickPayrollSummary
	 * @throws InterruptedException 
     * @name Click clickPayrollSummary
     */
	
	double TaxAmount=0;
	double EmployeeNIAmount=0;
	double EmployerNIAmount=0;
	double TotalAmount=0;
	double BalanceOwedAmount=0;
	int PAYE_NI=0;
	
	public void Click_clickPayrollSummary() throws InterruptedException
	{
        
		sTestCaseID="TC36";
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
      	year.selectByVisibleText(data[5]);
      	
      	String date=data[5];
      	System.out.println("date value is :"+date);
      	String month=date.replaceAll("[^0-9]", "");
      	String value="30092020";
      	double monthvalue=0;
      	if(month==value)
      	{
		      	 monthvalue =Double.parseDouble(month);
		      	monthvalue=monthvalue/10000;
		      	monthvalue=monthvalue%10;
      	}
      	else
      	{
      		 monthvalue =Double.parseDouble(month);
	      	monthvalue=monthvalue/10000;
	      	monthvalue=monthvalue%100;
      	}
      	
      	String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
      	//System.out.println(Tax);
      	String PAYE_NIstr=PAYE_NI.replaceAll("[^0-9]", "");
      	
  		double PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
  		PAYE_NIValue=PAYE_NIValue/100;
    
      
      	
      	
//Tax Finding
      	
      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
      	//System.out.println(Tax);
      	String str=Tax.replaceAll("[^0-9]", "");
      	
  		double number = Double.parseDouble(str);
  		number=number/100;
  		
  		TaxAmount=TaxAmount+number;
  		System.out.println("This is Tax amount"+TaxAmount);
      	
  		
//Employee NI Finding
  		
  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
      	//System.out.println(EmployeeNI);
  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
      	
  		double number1 = Double.parseDouble(EmployeeNIstr);
  		number1=number1/100;
  		
  		EmployeeNIAmount=EmployeeNIAmount+number1;
  		System.out.println("This is EmployeeNI amount"+EmployeeNIAmount);
      	
      	
//Employer NI Finding
      	
      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
      	//System.out.println(EmployerNI);
      	String EmployerNIstr=EmployerNI.replaceAll("[^0-9]", "");
      	
  		double number2 = Double.parseDouble(EmployerNIstr);
  		number2=number2/100;
  		
  		EmployerNIAmount=EmployerNIAmount+number2;
  		System.out.println("This is EmployerNI amount"+EmployerNIAmount);
  		
  		
//Balance owed (b/f)
  		
  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance owed (b/f)')]//following::td/div/div")).get(0).getText();
      	//System.out.println(EmployerNI);
      	String BalanceOwedstr=BalanceOwed.replaceAll("[^0-9]", "");
      	
  		double number3 = Double.parseDouble(BalanceOwedstr);
  		number3=number3/100;
  		
  		BalanceOwedAmount=BalanceOwedAmount+number3;
  		System.out.println("This is Balance owed"+BalanceOwedAmount);
      
  		
  		
//calculating Payment For Month payroll 2020
  		
  		double payment_of_month=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
  		System.out.println("This is total amount for month"+payment_of_month);

 //Total Payment till Month 		
  		
  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div")).get(0).getText();
      	//System.out.println(EmployerNI);
      	String TotalPaymentstr=TotalPayment.replaceAll("[^0-9]", "");
      	
  		double Total = Double.parseDouble(TotalPaymentstr);
  		Total=Total/100;
  		
  		TotalAmount=TotalAmount+Total;
  		System.out.println("This is Total amount"+TotalAmount);
  		
  		if(TotalAmount==(BalanceOwedAmount+payment_of_month))
  		{
  			System.out.println("Amount paid is OK");
  		}
  		else
  		{
  			System.out.println("Error happen");
  		}
  		
  		
 //Verifying PAYE_NI to HMRC and Payment For Month		
  		
  		if(TotalAmount==PAYE_NIValue)
  		{
  			System.out.println("Everything is OK");
  		}
  		
  		else
  		{
  			System.out.println("Somthing is wrong PAYE & NI amount and Payment doesn't match");
  		}
  		
//  		if(monthvalue==06 || monthvalue==9 || monthvalue==12 || monthvalue==03 )
//      	{
//      		
//      		if(PAYE_NIValue==TotalAmount)
//      		{
//      			System.out.println("Everything is OK");
//      		}
//      		else
//      		{
//      			System.out.println("Somthing is wrong please check PAYE & NI amount and Payment done in this month");
//      		}
//      		
//      	}
//  		else
//  		{
//  			if(PAYE_NIValue==0)
//  			{
//  				System.out.println("Everything is OK");
//  			}
//  			else
//  			{
//  				System.out.println("Some tax amount is paid to HMRC:"+PAYE_NIValue);
//  			}
//  		}
  		
  		
  		
  		
		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSummary");
	}
	
	
	/**
 	 * Click clickPayrollSummary
	 * @throws InterruptedException 
     * @name Click clickPayrollSummary
     */
	

	
	public void Click_clickPayrollSummary1() throws InterruptedException
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

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectPayrollMonthDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectPayrollMonthDate " + SelectPayrollMonthDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectPayrollMonthDate " + SelectPayrollMonthDate);
 	}
    
    
    /**
     * Verify payroll summary for monthly frequency when disable quaterly paye scheme
     * @throws Exception 
     * 
     */
    public void verifysummaryformonthly(String eTaxAmount,String  eEmployeeNIAmount,String eEmployerNIAmount, String eBalanceowed,String etotalamount) throws Exception
    {
    	
//Tax Finding
      	
      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
      	//System.out.println(Tax);
      	String str=Tax.replaceAll("[^0-9]", "");
      	
  		double number = Double.parseDouble(str);
  		number=number/100;
  		
  		TaxAmount=TaxAmount+number;
  		System.out.println("This is Tax amount"+TaxAmount);
  		String actualTaxAmount=String.valueOf(TaxAmount);  
        assertEquals(actualTaxAmount, eTaxAmount)  		;
//Employee NI Finding
  		
  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
      	//System.out.println(EmployeeNI);
  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
      	
  		double number1 = Double.parseDouble(EmployeeNIstr);
  		number1=number1/100;
  		
  		EmployeeNIAmount=EmployeeNIAmount+number1;
  		System.out.println("This is EmployeeNI amount"+EmployeeNIAmount);
  		String actualEmployeeNIAmount=String.valueOf(EmployeeNIAmount);  

 		 assertEquals(actualEmployeeNIAmount, eEmployeeNIAmount);

//Employer NI Finding
      	
      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
      	//System.out.println(EmployerNI);
      	String EmployerNIstr=EmployerNI.replaceAll("[^0-9]", "");
      	
  		double number2 = Double.parseDouble(EmployerNIstr);
  		number2=number2/100;
  		
  		EmployerNIAmount=EmployerNIAmount+number2;
  		System.out.println("This is EmployerNI amount"+EmployerNIAmount);
  		
  		String actaulEmployerNIAmount=String.valueOf(EmployerNIAmount);  

		 assertEquals(actaulEmployerNIAmount, eEmployerNIAmount);

  		
//Balance owed (b/f)
  		
  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance owed (b/f)')]//following::td/div/div")).get(0).getText();
      	//System.out.println(EmployerNI);
      	String BalanceOwedstr=BalanceOwed.replaceAll("[^0-9]", "");
      	
  		double number3 = Double.parseDouble(BalanceOwedstr);
  		number3=number3/100;
  		
  		BalanceOwedAmount=BalanceOwedAmount+number3;
  		System.out.println("This is Balance owed"+BalanceOwedAmount);
  	
  		String actaulBalanceOwedAmount=String.valueOf(BalanceOwedAmount);  

		 assertEquals(actaulBalanceOwedAmount, eBalanceowed);

  		
 
      
  		
  		
//calculating Payment For Month payroll 2020
  		
  		
  		double payment_of_month=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
  		System.out.println("This is total  amount for month"+payment_of_month);

 //Total Payment till Month 		
  		
  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div")).get(0).getText();
      	//System.out.println(EmployerNI);
      	String TotalPaymentstr=TotalPayment.replaceAll("[^0-9]", "");
      	
  		double Total = Double.parseDouble(TotalPaymentstr);
  		Total=Total/100;
  		
  		TotalAmount=TotalAmount+Total;
  		System.out.println("This is Total amount"+TotalAmount);
  		String actaulTotalAmount=String.valueOf(TotalAmount);  

		 assertEquals(actaulTotalAmount, etotalamount);

    }
    
    
    
    /**
     * Verify payroll summary for monthly frequency when enable quarterly paye scheme
     * @throws Exception 
     * 
     */
    public void verifysummaryformonthlywhenQuaterly() throws Exception
    {
    	
    	
 //Finding list of payroll run date
    	
    	List<WebElement> datelist=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']"));
    	
    	for(int i=0;i<datelist.size();i++)
    	{
    		System.out.println(datelist.get(i));
    	}
    	
//Tax Finding
      	
      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
      	//System.out.println(Tax);
      	String str=Tax.replaceAll("[£]", "");
      	str=str.replaceAll("[,]", "");
      	
  		double number = Double.parseDouble(str);
  		//number=number/100;
  		
  		TaxAmount=TaxAmount+number;
  		System.out.println("This is Tax amount"+TaxAmount);
      	
  		
//Employee NI Finding
  		
  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
      	//System.out.println(EmployeeNI);
  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
      	
  		double number1 = Double.parseDouble(EmployeeNIstr);
  		//number1=number1/100;
  		
  		EmployeeNIAmount=EmployeeNIAmount+number1;
  		System.out.println("This is EmployeeNI amount"+EmployeeNIAmount);
      	
      	
//Employer NI Finding
      	
      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
      	//System.out.println(EmployerNI);
      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
      	
  		double number2 = Double.parseDouble(EmployerNIstr);
  	//	number2=number2/100;
  		
  		EmployerNIAmount=EmployerNIAmount+number2;
  		System.out.println("This is EmployerNI amount"+EmployerNIAmount);
  		
  		
//Balance owed (b/f)
  		
  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance owed (b/f)')]//following::td/div/div")).get(0).getText();
      	//System.out.println(EmployerNI);
      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
      	
  		double number3 = Double.parseDouble(BalanceOwedstr);
  	//	number3=number3/100;
  		
  		BalanceOwedAmount=BalanceOwedAmount+number3;
  		System.out.println("This is Balance owed"+BalanceOwedAmount);
  //		double Expected=0.0;
  //		assertEquals(BalanceOwedAmount, Expected);
  		
 
      
  		
  		
//calculating Payment For Month payroll 2020
  		
  		double payment_of_month=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
  		payment_of_month=(double) (Math.round(payment_of_month *100)/100.0);
  		
  		System.out.println("This is total amount for month"+payment_of_month);

 //Total Payment till Month 		
  		
  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div")).get(0).getText();
      	//System.out.println(EmployerNI);
      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
      	TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
      	
  		double Total = Double.parseDouble(TotalPaymentstr);
 // 		Total=Total/100;
  		
  		TotalAmount=TotalAmount+Total;
  		System.out.println("This is Total amount"+TotalAmount);
    	
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

    		
    		System.out.println("xyz");
    		
    		size=data1.size();
    		
    		String[] a=new String [size];
    		
    		for(i=0;i<size;i++)
    		{
    		//	System.out.println("i=="+i);
    		a[i]=data1.get(i).getText();
    	//	System.out.println("date is="+a[i]);
    		}
    		

    				        for(i=size;i>=1;i--)
    				        {
    				     //   	System.out.println("value of i="+i);
    				        

    				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
    				  	
    				  		 Select date=new Select(PeriodEnd); 
    				  		 Thread.sleep(1000);
    				  
    				  		  date.selectByVisibleText(a[i-1]);
    				  		 Thread.sleep(1000);

    //Payment DUE to HMRC				  		 
    				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
    			      	
    			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
    			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
    			      	
    			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
    			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
    			  		 
    //Getting payment done in month
    			  		 
    			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div")).get(0).getText();
    		      	
    		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
    		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
    		      	
    		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
    		  		System.out.println("TotalAmount="+Totalamount);
    		  	
    		  		
    		  		
  //Tax Finding
    		      	
    		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
    		      	//System.out.println(Tax);
    		      	String str=Tax.replaceAll("[£]", "");
    		      	str=str.replaceAll("[,]", "");
    		      	
    		      	TaxAmount = Double.parseDouble(str);
    		  		//number=number/100;
    		  		
    		//  		TaxAmount=TaxAmount+number;
    		  		System.out.println("This is Tax amount="+TaxAmount);
    		      	
    		  		
    		  		
  //Employee NI Finding
    		  		
    		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
    		      	//System.out.println(EmployeeNI); 
    		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
    		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
    		      	
    		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);
    		  		//number1=number1/100;
    		  		
    		//  		EmployeeNIAmount=EmployeeNIAmount+number1;
    		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
    		      	
    		      	
    		  		
  //Employer NI Finding
    		      	
    		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
    		      	//System.out.println(EmployerNI);
    		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
    		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
    		      	
    		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);
    		  	//	number2=number2/100;
    		  		
    	//	  		EmployerNIAmount=EmployerNIAmount+number2;
    		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
    		  	
    		  		
    		  		
  //Balance owed (b/f)
    		  		
    		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance owed (b/f)')]//following::td/div/div")).get(0).getText();
    		      	//System.out.println(EmployerNI);
    		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
    		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
    		      	
    		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);
    		  	//	number3=number3/100;
    		  		
    	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
    		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
    		  		
    		  		
    		  		
    		  		
  //Balance c/f 
    		  		
    		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance (c/f)')]//following::td/div/div")).get(0).getText();
    		      	//System.out.println(EmployerNI);
    		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
    		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
    		      	
    		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);
    		  	//	number3=number3/100;
    		  		
    	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
    		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
    		  		
    		  		
    		  		
    		  		
    //verifying Paye Due to HMRC and Payment of the month
    		  		
   
    		  		try {
						if(j%3==0)
						{
							assertEquals(Totalamount, PAYE_NIValue);
						}
						else
						{
							double actual=0.0;
							assertEquals(actual, PAYE_NIValue);
						}
					} catch (Exception e) {
						System.out.println(e);
						e.printStackTrace();
					}
    		  		
    		  	
    		  		
    		  		
    		  		
    		  		
 /*
  * Verifying C/F and B/F balance
  */
    		  		
    		  		if(j==4 || j==7 || j==10 || j==13)
    		  		{
    		  			System.out.println("j="+j);
    		  			
    		  			double ExpectedBalanceOwed=0.0;
    		  			double Expectedcarry=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
    		  			Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
    		  			System.out.println("total tax+="+Expectedcarry);
    		  			System.out.println("BalanceOwedAmount==="+BalanceOwedAmount); 
    		  			System.out.println("BalancecarryAmount==="+BalancecarryAmount); 
    		  			
    		  			assertEquals(BalanceOwedAmount, ExpectedBalanceOwed ,"Balanced owed not matched");
    		  			assertEquals(BalancecarryAmount, Expectedcarry , "balance carry did not matched");
    		  			
    		  			prevTax=Expectedcarry;
    		  		}
    		  		
    		  		else if(j==5 || j==8 || j==11 || j==14)
    		  		{
    		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
    		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
    		  			System.out.println("total tax=+="+totalTax);
    		  //			double ExpectedBalanceOwed=totalTax;
    		  			double Expectedcarry=totalTax+prevTax;
    		  			prevBalowed=Expectedcarry;
    		  			
    		  			assertEquals(BalanceOwedAmount, prevTax);
    		  			assertEquals(BalancecarryAmount, Expectedcarry);
    		  			
    		  		}
    		  		
    		  		else
    		  		{
    		  			
    		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
    		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
    		  			System.out.println("total tax==="+totalTax);
    		  		//	double ExpectedBalanceOwed=totalTax*2;
    		  			double Expectedcarry=0.0;
    		  			
    		  			assertEquals(BalanceOwedAmount, prevBalowed);
    		  			assertEquals(BalancecarryAmount, Expectedcarry);
    		  			
    		  		}
    		  		
   
    		  		j++;		
 
    				  	
    				        }
    		}
    						
    		
    		
    		catch(Exception e)
    		{

    			System.out.println(e);
    		}
    	}
    	
    	
    	
    	/*select date one by one
         * 
         * 	
         */
        	
        	public void iteratedate1() throws InterruptedException
        	{
        		
        		try {
        		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
        	//	System.out.println(data1.get(i).getText());

        		
        		
        		size=data1.size();
        		
        		String[] a=new String [size];
        		
        		for(i=0;i<size;i++)
        		{
        		//	System.out.println("i=="+i);
        		a[i]=data1.get(i).getText();
        	//	System.out.println("date is="+a[i]);
        		}
        		

        				        for(i=size;i>=1;i--)
        				        {
        				     //   	System.out.println("value of i="+i);
        				        

        				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
        				  	
        				  		 Select date=new Select(PeriodEnd); 
        				  		 Thread.sleep(1000);
        				  
        				  		  date.selectByVisibleText(a[i-1]);
        				  		 Thread.sleep(1000);

        //Payment DUE to HMRC				  		 
        				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:29.74mm;min-width: 29.74mm;']")).get(0).getText();
        			      	
        			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
        			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
        			      	
        			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
        			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
        			  		 
        //Getting payment done in month
        			  		 
        			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div")).get(0).getText();
        		      	
        		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
        		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
        		      	
        		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
        		  		System.out.println("TotalAmount="+Totalamount);
        		  	
        		  		
        		  		
      //Tax Finding
        		      	
        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
        		      	//System.out.println(Tax);
        		      	String str=Tax.replaceAll("[£]", "");
        		      	str=str.replaceAll("[,]", "");
        		      	
        		      	TaxAmount = Double.parseDouble(str);
        		  		//number=number/100;
        		  		
        		//  		TaxAmount=TaxAmount+number;
        		  		System.out.println("This is Tax amount="+TaxAmount);
        		      	
        		  		
        		  		
      //Employee NI Finding
        		  		
        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
        		      	//System.out.println(EmployeeNI);
        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
        		      	
        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);
        		  		//number1=number1/100;
        		  		
        		//  		EmployeeNIAmount=EmployeeNIAmount+number1;
        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
        		      	
        		      	
        		  		
      //Employer NI Finding
        		      	
        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
        		      	//System.out.println(EmployerNI);
        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
        		      	
        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);
        		  	//	number2=number2/100;
        		  		
        	//	  		EmployerNIAmount=EmployerNIAmount+number2;
        		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
        		  	
        		  		
        		  		
      //Balance owed (b/f)
        		  		
        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance owed (b/f)')]//following::td/div/div")).get(0).getText();
        		      	//System.out.println(EmployerNI);
        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
        		      	
        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);
        		  	//	number3=number3/100;
        		  		
        	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
        		  		
        		  		
        		  		
        		  		
      //Balance c/f 
        		  		
        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance (c/f)')]//following::td/div/div")).get(0).getText();
        		      	//System.out.println(EmployerNI);
        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
        		      	
        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);
        		  	//	number3=number3/100;
        		  		
        	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
        		  		
        		  		
        		  		
        		  		
        //verifying Paye Due to HMRC and Payment of the month
        		  		
        //		  		System.out.println("value of j="+j);
        		  		if(j%3==0)
        		  		{
        		  			assertEquals(Totalamount, PAYE_NIValue);
        		  			
        		  			
        		  			
        		  		}
        		  		else
        		  		{
        		  			double actual=0.0;
        		  			assertEquals(actual, PAYE_NIValue);
        		  		}
        		  	
        		  		
        		  		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[starts-with(text(), 'PAYE & NI')]")));
        		  		TakeScreenshot.takeScreenshot(m_Driver, "Paye_NI  amount for "+j+ "month");	
        		  		
        		  		
     /*
      * Verifying C/F and B/F balance
      */
        		  		
        		  		if(j==4 || j==7 || j==10 || j==13)
        		  		{
        		  			System.out.println("j="+j);
        		  			
        		  			double ExpectedBalanceOwed=0.0;
        		  			double Expectedcarry=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
        		  			Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
        		  			System.out.println("total tax+="+Expectedcarry);
        		  			System.out.println("BalanceOwedAmount==="+BalanceOwedAmount); 
        		  			System.out.println("BalancecarryAmount==="+BalancecarryAmount); 
        		  			
        		  			assertEquals(BalanceOwedAmount, ExpectedBalanceOwed ,"Balanced owed not matched");
        		  			assertEquals(BalancecarryAmount, Expectedcarry , "balance carry did not matched");
        		  			
        		  			prevTax=Expectedcarry;
        		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of April");
        		  		}
        		  		
        		  		else if(j==5 || j==8 || j==11 || j==14)
        		  		{
        		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
        		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
        		  			System.out.println("total tax=+="+totalTax);
        		  //			double ExpectedBalanceOwed=totalTax;
        		  			double Expectedcarry=totalTax+prevTax;
        		  			Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
        		  			prevBalowed=Expectedcarry;
        		  			
        		  			assertEquals(BalanceOwedAmount, prevTax);
        		  			assertEquals(BalancecarryAmount, Expectedcarry);
        		  			
        		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of May");
        		  		}
        		  		
        		  		else
        		  		{
        		  			
        		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
        		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
        		  			System.out.println("total tax==="+totalTax);
        		  		//	double ExpectedBalanceOwed=totalTax*2;
        		  			double Expectedcarry=0.0;
        		  			
        		  			assertEquals(BalanceOwedAmount, prevBalowed);
        		  			assertEquals(BalancecarryAmount, Expectedcarry);
        		  			
        		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of June");
        		  			
        		  		}
        		  		
       
        		  		j++;		
     
        				  	
        				        }
        		}
        						
        		
        		
        		catch(Exception e)
        		{

        			System.out.println(e);
        		}
        	}
        	
        	
        	
        	/*select date one by one
             * 
             * 	
             */
            	
            	public void iteratedate2() throws InterruptedException
            	{
            		
            		try {
            		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
            	//	System.out.println(data1.get(i).getText());

            		
            		size=data1.size();
            		System.out.println("size="+size);
            		
            		String[] a=new String [size];
            		for(i=0;i<size;i++)
            		{
            		//	System.out.println("i=="+i);
            		a[i]=data1.get(i).getText();
            		System.out.println("date is="+a[i]);
            		}
            		
            		data1.remove(data1.size()-1);
            		data1.remove(data1.size()-1);
            		data1.remove(data1.size()-1);
            		
            		
            		
            		int len=data1.size();
            		System.out.println("len="+len);
            		for(int l=0;l<len;l++)
            		{
            		//	System.out.println("i=="+i);
            		a[l]=data1.get(l).getText();
            		System.out.println("date is="+a[l]);
            		}
            		

            				        for(int n=len;n>=1;n--)
            				        {
            				     //   	System.out.println("value of i="+i);
            				        

            				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
            				  	
            				  		 Select date=new Select(PeriodEnd); 
            				  		 Thread.sleep(1000);
            				  
            				  		  date.selectByVisibleText(a[n-1]);
            				  		 Thread.sleep(1000);

            //Payment DUE to HMRC				  		 
            				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:29.74mm;min-width: 29.74mm;']")).get(0).getText();
            			      	
            			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
            			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
            			      	
            			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
            			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
            			  		 
            //Getting payment done in month
            			  		 
            			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div")).get(0).getText();
            		      	
            		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
            		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
            		      	
            		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
            		  		System.out.println("TotalAmount="+Totalamount);
            		  	
            		  		
            		  		
          //Tax Finding
            		      	
            		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
            		      	//System.out.println(Tax);
            		      	String str=Tax.replaceAll("[£]", "");
            		      	str=str.replaceAll("[,]", "");
            		      	
            		      	TaxAmount = Double.parseDouble(str);
            		  		//number=number/100;
            		  		
            		//  		TaxAmount=TaxAmount+number;
            		  		System.out.println("This is Tax amount="+TaxAmount);
            		      	
            		  		
            		  		
          //Employee NI Finding
            		  		
            		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
            		      	//System.out.println(EmployeeNI);
            		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
            		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
            		      	
            		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);
            		  		//number1=number1/100;
            		  		
            		//  		EmployeeNIAmount=EmployeeNIAmount+number1;
            		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
            		      	
            		      	
            		  		
          //Employer NI Finding
            		      	
            		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
            		      	//System.out.println(EmployerNI);
            		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
            		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
            		      	
            		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);
            		  	//	number2=number2/100;
            		  		
            	//	  		EmployerNIAmount=EmployerNIAmount+number2;
            		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
            		  	
            		  		
            		  		
          //Balance owed (b/f)
            		  		
            		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance owed (b/f)')]//following::td/div/div")).get(0).getText();
            		      	//System.out.println(EmployerNI);
            		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
            		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
            		      	
            		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);
            		  	//	number3=number3/100;
            		  		
            	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
            		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
            		  		
            		  		
            		  		
            		  		
          //Balance c/f 
            		  		
            		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance (c/f)')]//following::td/div/div")).get(0).getText();
            		      	//System.out.println(EmployerNI);
            		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
            		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
            		      	
            		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);
            		  	//	number3=number3/100;
            		  		
            	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
            		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
            		  		
            		  		
            		  		
            		  		
            //verifying Paye Due to HMRC and Payment of the month
            		  		
            //		  		System.out.println("value of j="+j);
            		  		
            	//	 if(j>=k)
            	//	 {
            		  		if(k%3==0)
            		  		{
            		  			assertEquals(Totalamount, PAYE_NIValue);
            		  			
            		  			
            		  			
            		  		}
            		  		else
            		  		{
            		  			double actual=0.0;
            		  			assertEquals(actual, PAYE_NIValue);
            		  		}
            		  	
            		  		
            		  		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[starts-with(text(), 'PAYE & NI')]")));
            		  		TakeScreenshot.takeScreenshot(m_Driver, "Paye_NI  amount for "+j+ "month");	
            		  		
            		  		
         /*
          * Verifying C/F and B/F balance
          */
            		  		
            		  		if(k==4 || k==7 || k==10 || k==13)
            		  		{
            		  			System.out.println("k="+k);
            		  			
            		  			double ExpectedBalanceOwed=0.0;
            		  			double Expectedcarry=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
            		  			Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
            		  			System.out.println("total tax+="+Expectedcarry);
            		  			System.out.println("BalanceOwedAmount==="+BalanceOwedAmount); 
            		  			System.out.println("BalancecarryAmount==="+BalancecarryAmount); 
            		  			
            		  			assertEquals(BalanceOwedAmount, ExpectedBalanceOwed ,"Balanced owed not matched");
            		  			assertEquals(BalancecarryAmount, Expectedcarry , "balance carry did not matched");
            		  			
            		  			prevTax=Expectedcarry;
            		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of April");
            		  		}
            		  		
            		  		else if(k==5 || k==8 || k==11 || k==14)
            		  		{
            		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
            		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
            		  			System.out.println("total tax=+="+totalTax);
            		  //			double ExpectedBalanceOwed=totalTax;
            		  			double Expectedcarry=totalTax+prevTax;
            		  			Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
            		  			prevBalowed=Expectedcarry;
            		  			
            		  			assertEquals(BalanceOwedAmount, prevTax);
            		  			assertEquals(BalancecarryAmount, Expectedcarry);
            		  			
            		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of May");
            		  		}
            		  		
            		  		else
            		  		{
            		  			
            		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
            		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
            		  			System.out.println("total tax==="+totalTax);
            		  		//	double ExpectedBalanceOwed=totalTax*2;
            		  			double Expectedcarry=0.0;
            		  			
            		  			assertEquals(BalanceOwedAmount, prevBalowed);
            		  			assertEquals(BalancecarryAmount, Expectedcarry);
            		  			
            		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of June");
            		  			
            		  		}
            		  		
            	//	 }
            		  		k++;		
         
            				  	
            				        }
            		}
            						
            		
            		
            		catch(Exception e)
            		{

            			System.out.println(e);
            		}
            	}
        	

            	
            	
            	/*select date one by one
                 * 
                 * 	
                 */
                	
                	public void iteratedate3() throws InterruptedException
                	{
                		
                		try {
                		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
                	//	System.out.println(data1.get(i).getText());

                		
                		
                		size=data1.size();
                		
                		String[] a=new String [size];
                		
                		for(i=0;i<size;i++)
                		{
                		//	System.out.println("i=="+i);
                		a[i]=data1.get(i).getText();
                	//	System.out.println("date is="+a[i]);
                		}
                		

                				        for(i=size;i>=1;i--)
                				        {
                				     //   	System.out.println("value of i="+i);
                				        

                				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
                				  	
                				  		 Select date=new Select(PeriodEnd); 
                				  		 Thread.sleep(1000);
                				  
                				  		  date.selectByVisibleText(a[i-1]);
                				  		 Thread.sleep(1000);

                //Payment DUE to HMRC				  		 
                				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:29.74mm;min-width: 29.74mm;']")).get(0).getText();
                			      	
                			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
                			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
                			      	
                			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
                			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
                			  		 
                //Getting payment done in month
                			  		 
                			  		String TotalPayment=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Payment For')]//following::td/div/div[@style='width:29.96mm;min-width: 29.96mm;']")).getText();
                		      	
                		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
                		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
                		      	
                		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
                		  		System.out.println("TotalAmount="+Totalamount);
                		  	
                		  		
                		  		
              //Tax Finding
                		      	
                		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
                		      	//System.out.println(Tax);
                		      	String str=Tax.replaceAll("[£]", "");
                		      	str=str.replaceAll("[,]", "");
                		      	
                		      	TaxAmount = Double.parseDouble(str);
                		  		//number=number/100;
                		  		
                		//  		TaxAmount=TaxAmount+number;
                		  		System.out.println("This is Tax amount="+TaxAmount);
                		      	
                		  		
                		  		
              //Employee NI Finding
                		  		
                		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
                		      	//System.out.println(EmployeeNI);
                		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
                		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
                		      	
                		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);
                		  		//number1=number1/100;
                		  		
                		//  		EmployeeNIAmount=EmployeeNIAmount+number1;
                		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
                		      	
                		      	
                		  		
              //Employer NI Finding
                		      	
                		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
                		      	//System.out.println(EmployerNI);
                		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
                		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
                		      	
                		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);
                		  	//	number2=number2/100;
                		  		
                	//	  		EmployerNIAmount=EmployerNIAmount+number2;
                		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
                		  	
                		  		
                		  		
              //Balance owed (b/f)
                		  		
                		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance owed (b/f)')]//following::td/div/div")).get(0).getText();
                		      	//System.out.println(EmployerNI);
                		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
                		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
                		      	
                		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);
                		  	//	number3=number3/100;
                		  		
                	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
                		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
                		  		
                		  		
                		  		
                		  		
              //Balance c/f 
                		  		
                		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance (c/f)')]//following::td/div/div")).get(0).getText();
                		      	//System.out.println(EmployerNI);
                		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
                		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
                		      	
                		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);
                		  	//	number3=number3/100;
                		  		
                	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
                		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
                		  		
             
                		  		
                		  		
                		  		
                		  		
                		  		
                //verifying Paye Due to HMRC and Payment of the month
                		  		
                //		  		System.out.println("value of j="+j);
                		  		if(j%3==0)
                		  		{
                		  			assertEquals(Totalamount, PAYE_NIValue);
                		  			
                		  		//CIS Suffered
                    		  		
                    		  		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[52]/td[2]/div/div")));
                    		  		String CISAmount=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[53]/td[3]/div/div")).getText();
                    		      	//System.out.println(EmployerNI);
                    		  		CISAmount=CISAmount.replaceAll("[£]", "");
                    		  		CISAmount=CISAmount.replaceAll("[,]", "");
                    		  		CISAmount=CISAmount.replaceAll("[-]", "");
                    		      	
                    		  		double CISEntered = Double.parseDouble(CISAmount);
                    		  	//	number3=number3/100;
                    		  		
                    	//	  		BalanceOwedAmount=BalanceOwedAmount+number3;
                    		  		System.out.println("This is Balance CIS="+CISEntered);
                		  			
                		  		}
                		  		else
                		  		{
                		  			double actual=0.0;
                		  			assertEquals(actual, PAYE_NIValue);
                		  		}
                		  	
                		  		
                		  		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Balance (c/f)')]")));
                		  		TakeScreenshot.takeScreenshot(m_Driver, "Paye_NI  amount for "+j+ "month");	
                		  		
                		  		
             /*
              * Verifying C/F and B/F balance
              */
                		  		
                		  		if(j==4 || j==7 || j==10 || j==13)
                		  		{
                		  			System.out.println("j="+j);
                		  			
                		  			double ExpectedBalanceOwed=0.0;
                		  			double Expectedcarry=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
                		  			Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
                		  			System.out.println("total tax+="+Expectedcarry);
                		  			System.out.println("BalanceOwedAmount==="+BalanceOwedAmount); 
                		  			System.out.println("BalancecarryAmount==="+BalancecarryAmount); 
                		  			
                		  			assertEquals(BalanceOwedAmount, ExpectedBalanceOwed ,"Balanced owed not matched");
                		  			assertEquals(BalancecarryAmount, Expectedcarry , "balance carry did not matched");
                		  			
                		  			prevTax=Expectedcarry;
                		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of April");
                		  		}
                		  		
                		  		else if(j==5 || j==8 || j==11 || j==14)
                		  		{
                		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
                		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
                		  			System.out.println("total tax=+="+totalTax);
                		  //			double ExpectedBalanceOwed=totalTax;
                		  			double Expectedcarry=totalTax+prevTax;
                		  			Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
                		  			prevBalowed=Expectedcarry;
                		  			
                		  			assertEquals(BalanceOwedAmount, prevTax);
                		  			assertEquals(BalancecarryAmount, Expectedcarry);
                		  			
                		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of May");
                		  		}
                		  		
                		  		else
                		  		{
                		  			
                		  			double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
                		  			totalTax=(double) (Math.round(totalTax *100)/100.0);
                		  			System.out.println("total tax==="+totalTax);
                		  		//	double ExpectedBalanceOwed=totalTax*2;
                		  			double Expectedcarry=0.0;
                		  			
                		  			assertEquals(BalanceOwedAmount, prevBalowed);
                		  			assertEquals(BalancecarryAmount, Expectedcarry);
                		  			
                		  			TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of June");
                		  			
                		  		}
                		  		
               
                		  		j++;		
             
                				  	
                				        }
                		}
                						
                		
                		
                		catch(Exception e)
                		{

                			System.out.println(e);
                		}
                	}            	
            	
            	
        	
        	/*
             * Take Dump for Paye Ni Due to HMRC
             * 	
             */
            	
            	public void takeSCforPaye_NI() throws InterruptedException
            	{
            		
            		try {
            		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
            	//	System.out.println(data1.get(i).getText());

            		
            		
            		size=data1.size();
            		
            		String[] a=new String [size];
            		
            		for(i=0;i<size;i++)
            		{
            		//	System.out.println("i=="+i);
            		a[i]=data1.get(i).getText();
            	//	System.out.println("date is="+a[i]);
            		}
            		

            				        for(i=size;i>=1;i--)
            				        {
            				     //   	System.out.println("value of i="+i);
            				        

            				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
            				  	
            				  		 Select date=new Select(PeriodEnd); 
            				  		 Thread.sleep(1000);
            				  
            				  		  date.selectByVisibleText(a[i-1]);
            				  		 Thread.sleep(1000);

 
            		  	
            		  		
            		  		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Balance (c/f)')]")));
            		  		TakeScreenshot.takeScreenshot(m_Driver, "Paye_NI  amount for "+j+ "th month");	
            		  		
  
           
            		  		j++;		
         
            				  	
            				        }
            		}
            						
            		
            		
            		catch(Exception e)
            		{

            			System.out.println(e);
            		}
            	}       	
    	
    	
    	
    	/*select date of april and take dump
         * 
         * 	
         */
        	
        	public void takedumpofApril() throws InterruptedException
        	{
        		
        		try {
        		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
        	//	System.out.println(data1.get(i).getText());

        		
        		
        		size=data1.size();
        		
        		String[] a=new String [size];
        		
        		for(i=0;i<size;i++)
        		{
        		//	System.out.println("i=="+i);
        		a[i]=data1.get(i).getText();
        	//	System.out.println("date is="+a[i]);
        		}
        		

        				        for(i=size;i>=size;i--)
        				        {
        				     //   	System.out.println("value of i="+i);
        				        

        				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
        				  	
        				  		 Select date=new Select(PeriodEnd); 
        				  		 Thread.sleep(1000);
        				  
        				  		  date.selectByVisibleText(a[i-1]);
        				  		 Thread.sleep(1000);	
        				  		 
        				  		TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for month of April");
        				  		 
        				        }
        		}
        		
        		catch(Exception e)
        		{

        			System.out.println(e);
        		}
        	}
    
    
    /**
     * Take Screenshot
     * @throws Exception 
     * 
     */
    public void TakeSCforSummaryforMonth() throws Exception
    {
    	
 		TakeScreenshot.takeScreenshot(m_Driver, "Balance owed amount for monthly freq");
    	
    }
    
    
    /**
     * Take Screenshot when chnaged to monthly from quarterly
     * @throws Exception 
     * 
     */
    public void TakeSCforSummaryforMonthwhenchange() throws Exception
    {
    	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Balance (c/f)')]")));
 		TakeScreenshot.takeScreenshot(m_Driver, "Summary report after change to monthly");
    	
    }
    
    
}