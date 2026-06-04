package verifySummaryReportData;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Quaterly_Paye_Scheme.NoAllowenceScheme;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1a39efdb-1039-4c43-afeb-fce794ce691a
@TestModellerModule(guid = "1a39efdb-1039-4c43-afeb-fce794ce691a")
public class CISinMayWhenQtr extends BasePage
{
	int i;
	int size;
	int j=4;
	int k=4;
	double PAYE_NIValue=0;
	static double prevTax=0.0;
	static double prevBalowed=0.0;
	double TaxAmount=0;
	double EmployeeNIAmount=0;
	double EmployerNIAmount=0;
	double TotalAmount=0;
	double BalanceOwedAmount=0;
	static double CISDeducted=0;
	static double returnedvalueEmploymentAllowance;
double CISSufferedValue=0;

	
	double Totalamount=0;
	
	double BalancecarryAmount=0;
	

	public CISinMayWhenQtr (WebDriver driver)
	{
		super(driver);
	}


	
	private By selectTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By selectPayrollDateElem = By.xpath("//label[normalize-space()= 'Period End:']/../select");

	
	
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12516");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12516");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12516");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12516";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12516")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select selectTaxYears
     * @name Select selectTaxYears
     */
    public void Select_selectTaxYears(String selectTaxYears)
 	{
 	    
 		WebElement elem = getWebElement(selectTaxYearsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectTaxYears", "Select_selectTaxYears failed. Unable to locate object: " + selectTaxYearsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectTaxYears", "Select_selectTaxYears failed. Unable to locate object: " + selectTaxYearsElem.toString());

 			Assert.fail("Unable to locate object: " + selectTaxYearsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectTaxYears);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectTaxYears " + selectTaxYears);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectTaxYears " + selectTaxYears);
 	}

    
	/**
 	 * Select selectPayrollDate
     * @name Select selectPayrollDate
     */
    public void Select_selectPayrollDate(String selectPayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(selectPayrollDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectPayrollDate", "Select_selectPayrollDate failed. Unable to locate object: " + selectPayrollDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectPayrollDate", "Select_selectPayrollDate failed. Unable to locate object: " + selectPayrollDateElem.toString());

 			Assert.fail("Unable to locate object: " + selectPayrollDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectPayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectPayrollDate " + selectPayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectPayrollDate " + selectPayrollDate);
 	}

 /*check checkbalanceOwed
  * 
  * 	
  */
    	
    	public void checkbalanceOwedQtr() throws InterruptedException
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
    				  		 
//Tax Finding
    	        		      	int Taxlen=m_Driver.findElements(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr/td[3]/div/div")).size();
    	        		      	for(int i=Taxlen+1;i<=Taxlen+1;i++)
    	        		      	{
    	        		      	String Tax=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr["+i+"]/td[3]/div/div")).getText();
    	        		      	//System.out.println(Tax);
    	        		      	String str=Tax.replaceAll("[£]", "");
    	        		      	str=str.replaceAll("[,]", "");
    	        		      	
    	        		      	TaxAmount = Double.parseDouble(str);
    	        		  		System.out.println("This is Tax amount="+TaxAmount);
    	        		      	
    				  		 
    				  		 

//Employee NI Finding
    	        		  		
    	        		  		String EmployeeNI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr["+i+"]/td[6]/div/div")).getText();
    	        		      	//System.out.println(EmployeeNI);
    	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
    	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
    	        		      	
    	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
    	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
    	        		  		
    	        		  		
    	        		  		
    	        		  		
//Employer NI Finding
    	        		      	
    	        		      	String EmployerNI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr["+i+"]/td[8]/div/div")).getText();
    	        		      	//System.out.println(EmployerNI);
    	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
    	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
    	        		      	
    	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    	        		  	
    	        		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
    	        		      	}
    	        		  		
//Balance owed (b/f)
    	        		  		
    	        		  		String BalanceOwed=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[7]/td[2]/table/tbody/tr/td/table/tbody/tr[5]/td[5]/div/div")).getText();
    	        		      	//System.out.println(EmployerNI);
    	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
    	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
    	        		      	
    	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
    	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
    	        		  		
    	        		  		
//Balance c/f 
    	        		  		
    	        		  		String Balancecarry=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[7]/td[2]/table/tbody/tr/td/table/tbody/tr[9]/td[3]/div/div")).getText();
    	        		      	//System.out.println(EmployerNI);
    	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
    	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
    	        		      	
    	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
    	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
    	        		  		
    	        		  		
    	        		  		
//Payment DUE to HMRC				  		 
        				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:29.74mm;min-width: 29.74mm;']")).get(0).getText();
        			      	
        			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
        			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
        			      	
        			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
        			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
        			  		 
        			  		 
        			  		 
//Getting payment done in month
        			  		 
         			  		String TotalPayment=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[7]/td[2]/table/tbody/tr/td/table/tbody/tr[36]/td[7]/div/div")).getText();
         		      	
         		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
         		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
         		      	
         		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
         		  		System.out.println("TotalAmount="+Totalamount);
         		  		
         		  		
         		  		
/**
 * verifying Paye Due to HMRC and Payment of the month
 */
        		  		
         		  	   
        		  		try {
    						if(j%3==0)
    						{
  //1  							assertEquals(Totalamount, PAYE_NIValue);
    						}
    						else
    						{
    							double actual=0.0;
  //2  							assertEquals(actual, PAYE_NIValue);
    						}
    					} catch (Exception e) 
        		  		{
    						System.out.println(e);
    						e.printStackTrace();
    					} 
        		  		
        		  		
/*
 * Verifying C/F and B/F balance
*/
        		  		    		  		
        		  		try {
							if(j==4 || j==7 || j==10 || j==13)
							    {
							    	System.out.println("j="+j);
							    		  			
							    	double ExpectedBalanceOwed=0.0;
							    	double Expectedcarry=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
							    	Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
							    	System.out.println("total tax+="+Expectedcarry);
							    	System.out.println("BalanceOwedAmount==="+BalanceOwedAmount); 
							    	System.out.println("BalancecarryAmount==="+BalancecarryAmount); 
							    		  			
//	1						    	assertEquals(BalanceOwedAmount, ExpectedBalanceOwed ,"Balanced owed not matched");
//	1						    	assertEquals(BalancecarryAmount, Expectedcarry , "balance carry did not matched");
							    		  			
							    	prevTax=Expectedcarry;
							    }
							    		  		
							else if(j==5 || j==8 || j==11 || j==14)
							    {
							    	double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
							    	totalTax=(double) (Math.round(totalTax *100)/100.0);
							    	System.out.println("total tax=+="+totalTax);
							    	//double ExpectedBalanceOwed=totalTax;
							    	double Expectedcarry=totalTax+prevTax;
							    	prevBalowed=Expectedcarry;
							    		  			
//	22						    	assertEquals(BalanceOwedAmount, prevTax);
//	22						    	assertEquals(BalancecarryAmount, Expectedcarry);
							    		  			
							    }
							    		  		
							else
							    {
							    		  			
							    	double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
							    	totalTax=(double) (Math.round(totalTax *100)/100.0);
							    	System.out.println("total tax==="+totalTax);
							    	//	double ExpectedBalanceOwed=totalTax*2;
							    	double Expectedcarry=0.0;
							    		  			
//	3						    	assertEquals(BalanceOwedAmount, prevBalowed);
//	3						    	assertEquals(BalancecarryAmount, Expectedcarry);
							    		  			
							    }
						} catch (Exception e) 
        		  		{
							System.out.println(e);
							e.printStackTrace();
						}
        		  		    		  		
        		  		   
        		  		    	j++;		
        		  		 
        		  		    				  	
        		  		    				        
    				        
    			 }
    				        
    				        
    		}
    		
    		catch(Exception e)
    		{

    			System.out.println(e);
    		}
    		
    	}	
    	
    	
    	
/*check checkbalanceOwed Monthly
* 
* 	
*/
    	    	
    public void checkbalanceOwedMntlyWhenCIS() throws InterruptedException
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
    	    				  		 
//Tax Finding
    	    	        		      	
    	    	        		      	String Tax=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[6]/td[2]/table/tbody/tr[2]/td[3]/div/div")).getText();
    	    	        		      	//System.out.println(Tax);
    	    	        		      	String str=Tax.replaceAll("[£]", "");
    	    	        		      	str=str.replaceAll("[,]", "");
    	    	        		      	
    	    	        		      	TaxAmount = Double.parseDouble(str);
    	    	        		  		System.out.println("This is Tax amount="+TaxAmount);
    	    	        		      	
    	    				  		 
    	    				  		 

//Employee NI Finding
    	    	        		  		
    	    	        		  		String EmployeeNI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[6]/td[2]/table/tbody/tr[2]/td[6]/div/div")).getText();
    	    	        		      	//System.out.println(EmployeeNI);
    	    	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
    	    	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
    	    	        		      	
    	    	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
    	    	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
    	    	        		  		
    	    	        		  		
    	    	        		  		
    	    	        		  		
    	//Employer NI Finding
    	    	        		      	
    	    	        		      	String EmployerNI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[6]/td[2]/table/tbody/tr[2]/td[8]/div/div")).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
    	    	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
    	    	        		      	
    	    	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    	        		  	
    	    	        		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
    	    	        		      	
    	    	        		  		
    	//Balance owed (b/f)
    	    	        		  		
    	    	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
    	    	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
    	    	        		      	
    	    	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
    	    	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
    	    	        		  		
    	    	        		  		
    	//Balance c/f 
    	    	        		  		
    	    	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
    	    	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
    	    	        		      	
    	    	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
    	    	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
    	    	        		  		
    	    	        		  		
    	
    	 //Payment DUE to HMRC				  		 
    	        				  		String CISSuffered=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div[@style='width:23.81mm;min-width: 23.81mm;']")).getText();
    	        			      	
    	        			      	 CISSuffered=CISSuffered.replaceAll("[£]", "");
    	        			      	CISSuffered=CISSuffered.replaceAll("[,]", "");
    	        			      	CISSuffered=CISSuffered.replaceAll("[-]", "");
    	        			      	
    	        			      	CISSufferedValue = Double.parseDouble(CISSuffered);
    	        			  		 System.out.println("CISSufferedValue="+CISSufferedValue);    	        		  		
    	    	        		  		
    	    	        		  		
    	    	        		  		
    	//Payment DUE to HMRC				  		 
    	        				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:32.65mm;min-width: 32.65mm;']")).get(0).getText();
    	        			      	
    	        			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
    	        			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
    	        			      	
    	        			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
    	        			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
    	        			  		 
    	        			  		 
    	        			  		 
    	//Getting payment done in month
    	        			  		 
    	         			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:32.65mm;min-width: 32.65mm;']")).get(0).getText();
    	         		      	
    	         		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
    	         		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
    	         		      	
    	         		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
    	         		  		System.out.println("TotalAmount="+Totalamount);
    	         		  		
    	         		  		
    	         		  		
/**
 * verifying Paye Due to HMRC and Payment of the month
 */
    	        		  		
    	         		  	   
    	        		  		try {
    	        		  				double ExpectedBalanceOwed=0.0;
    	        		  				System.out.println("BalanceOwedAmount==="+BalanceOwedAmount); 
 //1   	        		  				assertEquals(BalanceOwedAmount, ExpectedBalanceOwed ,"Balanced owed not matched");
    	        		  				
    	        		  				double TotalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
    	        		  				TotalTax=(double) (Math.round(TotalTax *100)/100.0);
    	        		  				System.out.println("Total tax of month=="+TotalTax);
    	        		  				double Expectedcarry=TotalTax-CISSufferedValue;
    	        		  				Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
    	        		  				System.out.println("Expected Carry="+Expectedcarry);
 //2   	        		  				assertEquals(BalancecarryAmount, Expectedcarry);
    	        		  				
    	        		  				double ExpectedPayeNI=0.0;
//    	        		  				ExpectedPayeNI=(double) (Math.round(ExpectedPayeNI *100)/100.0);
//								    	System.out.println("total tax+="+ExpectedPayeNI);
//	1							    	assertEquals(ExpectedPayeNI, PAYE_NIValue);
//								    	
// 1   	    							assertEquals(Totalamount, PAYE_NIValue);
    	    						
    	        		  			}
 
    	    						
    	    					
    	        		  		catch (Exception e) 
    	        		  		{
    	    						System.out.println(e);
    	    						e.printStackTrace();
    	    					} 
    	        		  		
    	        		  		
    	    		 }
    	    		
    	    		}
 
    	    		catch (Exception e) 
    		  		{
						System.out.println(e);
						e.printStackTrace();
					} 			        
    	    				        
  
    	    		
 
    	    	}	
    
    
    
    /**
     * Get EmploymentAllowance
     * 
     * @throws InterruptedException
     */
    public void setEmploymentAllowance()
    {
    	
    	NoAllowenceScheme ob=new NoAllowenceScheme(m_Driver);
          returnedvalueEmploymentAllowance=ob.getEmploymentAllowance();
          System.out.println("returned value of returnedvalueEmploymentAllowance="+returnedvalueEmploymentAllowance);
    }

    
    /*check checkbalanceOwed Monthly
    * 
    * 	
    */
        	    	
        public void CISforQtrinMay() throws InterruptedException
        	    	{
        	    		
        	    		try {
        	    		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
        	    	//	System.out.println(data1.get(i).getText());

        	    		
        	    		System.out.println(data1.size());
        	    		
        	    		System.out.println("xyzr");
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
        	    				  		 
    //Tax Finding
        	    	        		      	
        	    	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'A last')]//following::td/div/div")).get(1).getText();
        	    	        		      	//System.out.println(Tax);
        	    	        		      	String str=Tax.replaceAll("[£]", "");
        	    	        		      	str=str.replaceAll("[,]", "");
        	    	        		      	
        	    	        		      	TaxAmount = Double.parseDouble(str);
        	    	        		  		System.out.println("This is Tax amount="+TaxAmount);
        	    	        		      	
        	    				  		

    //Employee NI Finding
        	    	        		  		
        	    	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'A last')]//following::td/div/div")).get(4).getText();
        	    	        		      	//System.out.println(EmployeeNI);
        	    	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
        	    	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
        	    	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
        	    	        		  		

        	    	        		  		
        	    	        		  		
        	//Employer NI Finding
        	    	        		      	
        	    	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'A last')]//following::td/div/div")).get(6).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
        	    	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
        	    	        		  		 
        	    	        		  		 if(returnedvalueEmploymentAllowance!=0)
        	    	        		  		 {
        	    	        		  			 if(returnedvalueEmploymentAllowance>EmployerNIAmount)
        	    	        		  			 {
        	    	        		  				EmployerNIAmount=0;
        	    	        		  				returnedvalueEmploymentAllowance=returnedvalueEmploymentAllowance-EmployerNIAmount;
        	    	        		  				returnedvalueEmploymentAllowance=(double) (Math.round(returnedvalueEmploymentAllowance *100)/100.0);
        	    	        		  				
        	    	        		  				
        	    	        		  			 }
        	    	        		  			 else
        	    	        		  			 {
        	    	        		  				EmployerNIAmount=EmployerNIAmount-returnedvalueEmploymentAllowance;
        	    	        		  				EmployerNIAmount=(double) (Math.round(EmployerNIAmount *100)/100.0);
        	    	        		  			 }
        	    	        		  		 }
        	    	        		  		 
        	    	        		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
        	    	        		  		
        	    	        		      	
        	    	        		  		
        	//Balance owed (b/f)
        	    	        		  		
        	    	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
        	    	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
        	    	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
              	    				  	

        	    	        		  		
        	//Balance c/f 
        	    	        		  		
        	    	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
        	    	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
        	    	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
        	    	        		  		
        	    	        		  		double Totaltax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
    								    	Totaltax=(double) (Math.round(Totaltax *100)/100.0);  	        		  		
        	
        	 //Get CIS Amount				
        	    	        		if(k==5)
        	    	        		{
//        	        		//		  		String CISSuffered=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div[@style='width:23.81mm;min-width: 23.81mm;']")).getText();
//        	        			      	
//        	        			      	 CISSuffered=CISSuffered.replaceAll("[£]", "");
//        	        			      	CISSuffered=CISSuffered.replaceAll("[,]", "");
//        	        			      	CISSuffered=CISSuffered.replaceAll("[-]", "");
//        	        			      	
//        	        			      	CISSufferedValue = Double.parseDouble(CISSuffered);
//        	        		 	  		 System.out.println("CISSufferedValue="+CISSufferedValue);    	        		  		
//        	    	        		  		
//        	        		 	  		
//        	        		 	  		 //jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div[@style='width:23.81mm;min-width: 23.81mm;']")));
//        	        		 	  		 
//        	         		  				TakeScreenshot.takeScreenshot(m_Driver, "CIS in May");
        	         		  		
        	        			  		 
        	    	        		} 		
        	    	        		  		
        	//Payment DUE to HMRC				  		 
        	        				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
        	        			      	
        	        			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
        	        			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
        	        			      	
        	        			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
        	        			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
        	        			  		 
        	        			  		 
        	        			  		 
        	//Getting payment done in month
        	        			  		 
        	         			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
        	         		      	
        	         		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
        	         		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
        	         		      	
        	         		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
        	         		  		System.out.println("TotalAmount="+Totalamount);
        	         		  		
        	         		  		
        	         		  		
        	         		  		if(j==4 || j==7 || j==10)
        	         		  		{
        	         		  			
        	         		  			Totaltax=Totaltax-CISDeducted;
        	         		  			System.out.println("Total Tax after Decuted CIS="+Totaltax);
        	         		  			if(CISSufferedValue>Totaltax)
       	        			  		 {
       	        			  			CISDeducted=CISSufferedValue-Totaltax;
       	        			  		 }
        	         		  			
        	         		  			System.out.println("j="+j);
				    		  			
    							    	double ExpectedBalanceOwed=0.0;
   							    	assertEquals(BalanceOwedAmount, ExpectedBalanceOwed ,"Balanced owed not matched");    //verifying balance owed for april
    							    	
    							    	double Expectedcarry=Totaltax-CISSufferedValue;
    							    	Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
    							    	System.out.println("total tax+="+Expectedcarry);
  							    	assertEquals(BalancecarryAmount, Expectedcarry , "balance carry did not matched");    //verifying C/F value in summary report
    							    	prevBalowed=BalancecarryAmount;
    							    	System.out.println(prevBalowed);
    							    	
    							    	if(CISSufferedValue==0)
    							    	{
    							    		
 							    	//	assertEquals(Totalamount, Expectedcarry);
//    							    		
//   1 							    		assertEquals(0, PAYE_NIValue);
    							    	}
        	         		  			
        	         		  		}
        	         		  		
        	         		  		else	if(j==5 || j==8 || j==11)
        	         		  	{
        	         		  			
        	         		  			System.out.println("j="+j);
        	         		  			
 //2       	         		  			assertEquals(prevBalowed, BalanceOwedAmount); 				//verified Balance owed
        	         		  			
        	         		  			double TotalCarry=(Totaltax+prevBalowed)-CISSufferedValue;
        	         		  			System.out.println("TotalCarry="+TotalCarry);
        	         		  			double Expectedcarry=(double) (Math.round(TotalCarry *100)/100.0);
        	         		  			System.out.println("Expectedcarry="+Expectedcarry);
        	         		  			
        	         		  			
        	         		  			
//  1      	         		  			assertEquals(Expectedcarry, BalancecarryAmount); 			//verified Balance carry
//        	         		  			
//        	         		  			
//   1     	         		  			assertEquals(Totalamount, BalancecarryAmount);
//							    		
//	1						    		assertEquals(0, PAYE_NIValue);
							    		
							    		prevBalowed=BalancecarryAmount;
        	         		  		
        	         		  	}
        	         		  	
        	         		  	else
        	         		  	{
        	         		  		
        	         		  		Totaltax=Totaltax-CISDeducted;
    	         		  			System.out.println("Total Tax after Decuted CIS"+Totaltax);
    	         		  			if(CISSufferedValue>Totaltax)
   	        			  		 {
   	        			  			CISDeducted=CISSufferedValue-Totaltax;
   	        			  		 }
    	         		  			else
    	         		  			{
    	         		  				CISDeducted=0;
    	         		  			}
    	         		  			
 //1       	         		  		assertEquals(BalanceOwedAmount, prevBalowed ,"Balanced owed not matched");    //verifying balance owed
        	         		  		
        	         		  		double Expectedcarry=0;
							    //	Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
							    //	System.out.println("total tax+="+Expectedcarry);
//1							    	assertEquals(BalancecarryAmount, Expectedcarry , "balance carry did not matched");    //verifying C/F value in summary report
							    	prevBalowed=BalancecarryAmount;
        	         		  		
//1							    	assertEquals(Totalamount, PAYE_NIValue);
        	         		  	}
        	         		  		
        	         		j++;  
        	         		k++;
        	         		  		
        	         		  		
        	  }

      }

        	    	catch (Exception e) 
        	    		{
						// TODO: handle exception
        	    		System.out.println(e);
					    }			        
        	 }	    				        
        	    				        
}