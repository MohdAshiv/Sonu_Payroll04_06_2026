package _2134;

import pages.BasePage;
import pages1.PaymentManagementForQtrPaye;

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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1a39efdb-1039-4c43-afeb-fce794ce691a
@TestModellerModule(guid = "1a39efdb-1039-4c43-afeb-fce794ce691a")
public class QuarteryDataCheckforSummary extends BasePage
{
	int i;
	int size;
	int j=4;
	double PAYE_NIValue=0;
	static double prevTax=0.0;
	static double prevBalowed=0.0;
	double TaxAmount=0;
	double EmployeeNIAmount=0;
	double EmployerNIAmount=0;
	double TotalAmount=0;
	double BalanceOwedAmount=0;
	double NIC_Emp_Allowancevalue=0;
	double SMP_SPP_Recoveryvalue=0;
	double SMP_SPP_Compensationvalue=0;
	double SMP_SSP_Funding_Recvalue=0;
	static double totalNIC_Emp_Allowancevalue=0;
	double totalTaxCompensation=0;
	double totalTaxtoHMRC=0;
	static String[] calledOverpayment =new String[12];
	double HMRC_Over_Paymentvalue=0;
	double Totalamount=0;
	
	double BalancecarryAmount=0;
	

	public QuarteryDataCheckforSummary (WebDriver driver)
	{
		super(driver);
	}


	
	private By selectTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By selectPayrollDateElem = By.xpath("//label[normalize-space()= 'Period End:']/../select");
	
	private By vrfyStarterElem = By.xpath("//*[starts-with(text(),'Starter')]//following::tr[2]/td[3]/div");
	
	private By vrfyLeaverElem = By.xpath("//*[starts-with(text(),'Leaver')]//following::tr[2]/td[3]/div");

	
	
	
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
    	        		      	
    	        		      	
    	        		      	
//NIC Emp Allowance
    	        		  		String NIC_Emp_Allowance=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'NIC Emp Allowance')]//following::td/div/div")).get(0).getText();
    	        		      	//System.out.println(EmployerNI);
    	        		  		NIC_Emp_Allowance=NIC_Emp_Allowance.replaceAll("[£]", "");
    	        		  		NIC_Emp_Allowance=NIC_Emp_Allowance.replaceAll("[,]", "");
    	        		      	
    	        		  		NIC_Emp_Allowancevalue = Double.parseDouble(NIC_Emp_Allowance);    	        		  	
    	        		  		System.out.println("This is NIC_Emp_Allowancevalue amount="+NIC_Emp_Allowancevalue);
    	        		  		
    	        		  		totalNIC_Emp_Allowancevalue=totalNIC_Emp_Allowancevalue+NIC_Emp_Allowancevalue;
  //1  	        		  		assertTrue(totalNIC_Emp_Allowancevalue<=4000);
    	        		  		
 
    	        		  		
//SMP/SPP Recovery
    	        		  		String SMP_SPP_Recovery=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SPP Recovery')]//following::td/div/div")).get(0).getText();
    	        		      	//System.out.println(EmployerNI);
    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[£]", "");
    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[,]", "");
    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[-]", "");
    	        		      	
    	        		  		SMP_SPP_Recoveryvalue = Double.parseDouble(SMP_SPP_Recovery);    	        		  	
    	        		  		System.out.println("This is SMP_SPP_Recoveryvalue amount="+SMP_SPP_Recoveryvalue);
    	        		  		
    	        		  		
    	        		  		
//SMP/SPP Compensation
    	        		  		String SMP_SPP_Compensation=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[7]/td[2]/table/tbody/tr/td/table/tbody/tr[16]/td[2]/div")).getText();
    	        		      	//System.out.println(EmployerNI);
    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[£]", "");
    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[,]", "");
    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[-]", "");
    	        		      	
    	        		  		SMP_SPP_Compensationvalue = Double.parseDouble(SMP_SPP_Compensation);    	        		  	
    	        		  		System.out.println("This is SMP_SPP_Compensationvalue amount="+SMP_SPP_Compensationvalue);
    	        		  		
    	        		  		
    	        		  		
 //SMP/SSP Funding Rec.
    	        		  		String SMP_SSP_Funding_Rec=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(0).getText();
    	        		      	//System.out.println(EmployerNI);
    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[£]", "");
    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[,]", "");
    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[-]", "");
    	        		      	
    	        		  		SMP_SSP_Funding_Recvalue = Double.parseDouble(SMP_SSP_Funding_Rec);    	        		  	
    	        		  		System.out.println("This is SMP_SSP_Funding_Recvalue amount="+SMP_SSP_Funding_Recvalue);
    	        		  		
    	        		  		
    	        		  		
//Total Compensation calculation
    	        		  		
    	        		  		totalTaxCompensation=NIC_Emp_Allowancevalue+SMP_SPP_Recoveryvalue+SMP_SPP_Compensationvalue+SMP_SSP_Funding_Recvalue;
    	        		  		totalTaxCompensation=(double) (Math.round(totalTaxCompensation*100)/100.0);
    	        		  		
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
 //1   							assertEquals(Totalamount, PAYE_NIValue);
    						}
    						else
    						{
    							double actual=0.0;
 //1   							assertEquals(actual, PAYE_NIValue);
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
							    		  			
						//	    	double ExpectedBalanceOwed=0.0;
							    	double Expectedcarry=BalanceOwedAmount+TaxAmount+EmployeeNIAmount+EmployerNIAmount-totalTaxCompensation;
							    	Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
							    	System.out.println("total tax+="+Expectedcarry);
							    	System.out.println("BalanceOwedAmount==="+BalanceOwedAmount); 
							    	System.out.println("BalancecarryAmount==="+BalancecarryAmount); 
							    		  			
//	1						    	assertEquals(BalanceOwedAmount, prevBalowed ,"Balanced owed not matched");
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
							    	if(totalTaxCompensation!=0)
							    	{
							    		Expectedcarry=Expectedcarry-totalTaxCompensation;
							    		Expectedcarry=(double) (Math.round(Expectedcarry*100)/100.0);
							    	}
							    	prevBalowed=Expectedcarry;
							    		  			
//	1						    	assertEquals(BalanceOwedAmount, prevTax , "Balanced owed not matched");
//	1						    	assertEquals(BalancecarryAmount, Expectedcarry, "balance carry did not matched");
							    		  			
							    }
							    		  		
							else
							    {
							    		  			
							    	double totalTax=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
							    	totalTax=(double) (Math.round(totalTax *100)/100.0);
							    	System.out.println("total tax==="+totalTax);
							    	//	double ExpectedBalanceOwed=totalTax*2;
							    	double Expectedcarry=0.0;
							    	if(totalTaxCompensation!=0 && totalTaxCompensation>totalTax)
							    	{
							    		Expectedcarry=totalTax+BalanceOwedAmount-totalTaxCompensation;
							    		Expectedcarry=(double) (Math.round(Expectedcarry*100)/100.0);
							    	}
							    		  			
//	1						    	assertEquals(BalanceOwedAmount, prevBalowed);
//	1						    	assertEquals(BalancecarryAmount, Expectedcarry);
							    	prevBalowed=BalancecarryAmount;	  			
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
    	    	
    public void checkbalanceOwedMntly() throws InterruptedException
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
    	    	        		      	
    	
 //NIC Emp Allowance
    	    	        		  		String NIC_Emp_Allowance=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'NIC Emp Allowance')]//following::td/div/div")).get(0).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		  		NIC_Emp_Allowance=NIC_Emp_Allowance.replaceAll("[£]", "");
    	    	        		  		NIC_Emp_Allowance=NIC_Emp_Allowance.replaceAll("[,]", "");
    	    	        		      	
    	    	        		  		NIC_Emp_Allowancevalue = Double.parseDouble(NIC_Emp_Allowance);    	        		  	
    	    	        		  		System.out.println("This is NIC_Emp_Allowancevalue amount="+NIC_Emp_Allowancevalue);
    	    	        		  		
    	    	        		  		
    	    	        		  		totalNIC_Emp_Allowancevalue=totalNIC_Emp_Allowancevalue+NIC_Emp_Allowancevalue;
  //1  	    	        		  		assertTrue(totalNIC_Emp_Allowancevalue<=4000);
    	    	        		  		
    	    	        		  		if(NIC_Emp_Allowancevalue!=0)
    	    	        		  		{
    	    	        		  			if(NIC_Emp_Allowancevalue>=EmployerNIAmount)
    	    	        		  			{
    	    	        		  			NIC_Emp_Allowancevalue=NIC_Emp_Allowancevalue-EmployerNIAmount;
    	    	        		  			EmployerNIAmount=0;
    	    	        		  			}
    	    	        		  			else
    	    	        		  			{
    	    	        		  				NIC_Emp_Allowancevalue=EmployerNIAmount-NIC_Emp_Allowancevalue;
        	    	        		  			EmployerNIAmount=0;
    	    	        		  			}
    	    	        		  		}
    	    	        		  		
    	    	        		  		
    	    	        		  		
    	 
    	    	        		  		
    	//SMP/SPP Recovery
    	    	        		  		String SMP_SPP_Recovery=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SPP Recovery')]//following::td/div/div")).get(0).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[£]", "");
    	    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[,]", "");
    	    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[-]", "");
    	    	        		      	
    	    	        		  		SMP_SPP_Recoveryvalue = Double.parseDouble(SMP_SPP_Recovery);    	        		  	
    	    	        		  		System.out.println("This is SMP_SPP_Recoveryvalue amount="+SMP_SPP_Recoveryvalue);
    	    	        		  		
    	    	        		  		
    	    	        		  		
    	//SMP/SPP Compensation
    	    	        		  		String SMP_SPP_Compensation=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[19]/td[3]/div/div")).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[£]", "");
    	    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[,]", "");
    	    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[-]", "");
    	    	        		      	
    	    	        		  		SMP_SPP_Compensationvalue = Double.parseDouble(SMP_SPP_Compensation);    	        		  	
    	    	        		  		System.out.println("This is SMP_SPP_Compensationvalue amount="+SMP_SPP_Compensationvalue);
    	    	        		  		
    	    	        		  		
    	    	        		  		
    	 //SMP/SSP Funding Rec.
    	    	        		  		String SMP_SSP_Funding_Rec=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(0).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[£]", "");
    	    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[,]", "");
    	    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[-]", "");
    	    	        		  		
    	    	        		  		SMP_SSP_Funding_Recvalue = Double.parseDouble(SMP_SSP_Funding_Rec);    	        		  	
    	    	        		  		System.out.println("This is SMP_SSP_Funding_Recvalue amount="+SMP_SSP_Funding_Recvalue);
    	    	        		  		
    	    	        
    	  //get HMRC Over Payment   	        		  		
    	
    	    	        		  		String HMRC_Over_Payment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'HMRC Over Payment')]//following::td/div/div")).get(0).getText();
    	    	        		      	//System.out.println(EmployerNI);
    	    	        		  		HMRC_Over_Payment=HMRC_Over_Payment.replaceAll("[£]", "");
    	    	        		  		HMRC_Over_Payment=HMRC_Over_Payment.replaceAll("[,]", "");
    	    	        		  //		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[-]", "");
    	    	        		  		
    	    	        		  		HMRC_Over_Paymentvalue = Double.parseDouble(HMRC_Over_Payment);    	        		  	
    	    	        		  		System.out.println("This is HMRC_Over_Paymentvalue amount="+HMRC_Over_Paymentvalue);
    	    	        		  		
    	    	        		  		
    	 //call HMRC overpayment value   	        		  		
    	    	        		  		PaymentManagementForQtrPaye calledOverpaymentValue=new PaymentManagementForQtrPaye(m_Driver);
    	    	        		  		
    	    	        		  		calledOverpayment=calledOverpaymentValue.returnValue();
    	    	        		  		for(int i=0; i<=11;i++ )
    	    	        		  		{
    	    	        		  			System.out.println("after calledOverpayment="+calledOverpayment[i]);
    	    	        		  		}
    	    	        		  		
    	//Total Compensation calculation
    	    	        		  		
    	    	        		  		totalTaxCompensation=NIC_Emp_Allowancevalue+SMP_SPP_Recoveryvalue+SMP_SPP_Compensationvalue+SMP_SSP_Funding_Recvalue+HMRC_Over_Paymentvalue;
    	    	        		  		totalTaxCompensation=(double) (Math.round(totalTaxCompensation*100)/100.0);  
    	    	        		  		System.out.println("totalTaxCompensation="+totalTaxCompensation);
    	
    	//Total Tax calculation to be paid to HMRC
    	    	        		  		
    	    	        		  		totalTaxtoHMRC=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
    	    	        		  		totalTaxtoHMRC=(double) (Math.round(totalTaxtoHMRC *100)/100.0);
    	    	        		  		System.out.println("totalTaxtoHMRC="+totalTaxtoHMRC);
    	    	        		  		
    	    	        		  		
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
    	        		  			
    	        		  				System.out.println("HMRC_Over_Paymentvalue="+HMRC_Over_Paymentvalue);
    	        		  				if (HMRC_Over_Paymentvalue!=0) 
    	        		  				{
    	        		  					System.out.println("HMRC_Over_Paymentvalue="+HMRC_Over_Paymentvalue);
    	        		  					HMRC_Over_Paymentvalue=HMRC_Over_Paymentvalue*-1;
  //1  	        		  					assertEquals(BalanceOwedAmount, HMRC_Over_Paymentvalue, "Balanced owed not matched");
										}
    	        		  				else
    	        		  				{
    	        		  				System.out.println("BalanceOwedAmount===" + BalanceOwedAmount);
	//1									assertEquals(BalanceOwedAmount, prevTax, "Balanced owed not matched");
    	        		  				}
										double Expectedcarry=0.0;
    	        		  				
    	        		  				System.out.println(i);
    	        		  			
    	        		  				if(NIC_Emp_Allowancevalue!=0  || prevTax+totalTaxtoHMRC<0 || SMP_SPP_Recoveryvalue!=0 || HMRC_Over_Paymentvalue!=0)
    	        		  				{
    	        		  					System.out.println("totalTaxCompensation="+totalTaxCompensation);
    	        		  					System.out.println("totalTaxtoHMRC="+totalTaxtoHMRC);
    	        		  					System.out.println("prevTax="+prevTax);
    	        		  					Expectedcarry=totalTaxtoHMRC+prevTax-totalTaxCompensation;
    	        		  					Expectedcarry=(double) (Math.round(Expectedcarry *100)/100.0);
    	        		  				}
    	        		  				if(i==1 )
    	        		  				{
    	        		  					Expectedcarry=0;
    	        		  				}
    	        		  				
  //1  	        		  				assertEquals(BalancecarryAmount, Expectedcarry,"balance carry did not matched");
    	        		  				
    	        		  				double ExpectedPayeNI=TaxAmount+EmployeeNIAmount+EmployerNIAmount-totalTaxCompensation;
    	        		  				ExpectedPayeNI=(double) (Math.round(ExpectedPayeNI *100)/100.0);
								    	System.out.println("total tax+="+ExpectedPayeNI);
    	        		  				if(BalancecarryAmount<0 || BalanceOwedAmount<0)
    	        		  				{
    	        		  					ExpectedPayeNI=0;
    	        		  					System.out.println("Hello HMRC");
//    	        		  					assertEquals(ExpectedPayeNI, PAYE_NIValue,"paye NI did not matched");
//    								    	
//        	    							assertEquals(Totalamount, PAYE_NIValue,"payment of the month did not matched");
    	        		  				}
    	        		  				
    	        		  				
//1								    	assertEquals(ExpectedPayeNI, PAYE_NIValue,"value not matched");
								    	
 //1   	    							assertEquals(Totalamount, PAYE_NIValue);
    	    							
    	    							prevTax=BalancecarryAmount;
    	    							prevBalowed=BalanceOwedAmount;
    	    						
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


	public void VrfyStarter() {
		// TODO Auto-generated method stub
		
		WebElement elem = getWebElement(vrfyStarterElem);
		
		boolean value=elem.isDisplayed();
		
		System.out.println("Starter Elem visibility is:"+value);
		Assert.assertTrue(value);
		
	}


	public void VrfyLeaver() {
		// TODO Auto-generated method stub
		
		WebElement elem = getWebElement(vrfyLeaverElem);
		
		boolean value=elem.isDisplayed();
		
		System.out.println("Leaver Elem visibility is:"+value);
		Assert.assertTrue(value);
		
	}	    	
    	

}