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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cc7cc460-6887-4a34-8ffa-a6790e9d64e9
@TestModellerModule(guid = "cc7cc460-6887-4a34-8ffa-a6790e9d64e9")
public class Reports_payrollSummary_table extends BasePage
{
	
	public Reports_payrollSummary_table (WebDriver driver)
	{
		super(driver);
	}
	
	
//Fetching Tax value from payroll summary Page
  	
	
	public float tax()
	{
		  	String Tax=m_Driver.findElement(By.xpath("(//*[text()='Tax']//following::tr//following-sibling::td[2])[1]")).getText();
		  	
		  	String Taxstr=Tax.replaceAll("[^0-9]", "");
		  	
				float TaxInt = Float.parseFloat(Taxstr);
				TaxInt=TaxInt/100;
				
				System.out.println("Your Tax amount in Reports Page"+TaxInt);
				return TaxInt;
	}
	
	
//Fetching EE_NI value from payroll summary Page	
	public float EE_NIReports()
	{
  		
  		String EmployeeNI=m_Driver.findElement(By.xpath("(//*[text()='Tax']//following::tr//following-sibling::td[5])[1]")).getText();
      	
  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
      	
  		float EmployeeNIInt = Float.parseFloat(EmployeeNIstr);
  		EmployeeNIInt=EmployeeNIInt/100;
  		
  		System.out.println("Your EE_NI amount in Reports Page"+EmployeeNIInt);
  		
  		return EmployeeNIInt;
      	
		
	}

	
//Fetching ER_NI value from payroll summary Page
	public float ER_NIReports()
	{
		
      	
      	String EmployerNI=m_Driver.findElement(By.xpath("(//*[text()='Tax']//following::tr//following-sibling::td[7])[1]")).getText();
      	
      	String EmployerNIstr=EmployerNI.replaceAll("[^0-9]", "");
      	
  		float EmployerNIInt = Float.parseFloat(EmployerNIstr);
  		EmployerNIInt=EmployerNIInt/100;
  		
  		System.out.println("Your ER_NI amount in Reports Page"+EmployerNIInt);
		return EmployerNIInt;		
	}
	
	
//Fetching Balance owed value from payroll summary Page
	
	public float Balance_Owed()
	{
				
				String BalanceOwed=m_Driver.findElement(By.xpath("(//*[text()='Balance owed (b/f)']//following::td)[2]")).getText();
		  	
		  	String BalanceOwedstr=BalanceOwed.replaceAll("[^0-9]", "");
		  	
				float BalanceOwedInt = Float.parseFloat(BalanceOwedstr);
				BalanceOwedInt=BalanceOwedInt/100;
				System.out.println("Your Balance owed amount in Reports Page"+BalanceOwedInt);
				return BalanceOwedInt;	
	}
	
	
	
//Fetching Payment of the month value from payroll summary Page	
	
	public float Payment_of_the_Month()
	{
		float TotalPaymentInt=0;
//Calling CIS value
		
		 Tax_Payment_Table EE_ob=new Tax_Payment_Table(m_Driver); 
	    float  	CIS_sufferedvalue=EE_ob.CIS_SufferedSenttoReports();
	      	System.out.println("your CIS_suffered amount in reports page:"+CIS_sufferedvalue);
		if(CIS_sufferedvalue==0.0)
		{
				String TotalPayment=m_Driver.findElement(By.xpath("(//*[starts-with(text(), 'Payment For')]//following::td)[2]")).getText();
			  	
			  	String TotalPaymentstr=TotalPayment.replaceAll("[^0-9]", "");
			  	
					 TotalPaymentInt = Float.parseFloat(TotalPaymentstr);
					 TotalPaymentInt=TotalPaymentInt/100;
		}
		
		else
		{
			String TotalPayment=m_Driver.findElement(By.xpath("(//*[starts-with(text(), 'Payment For')]//following::td)[1]")).getText();
		  	
		  	String TotalPaymentstr=TotalPayment.replaceAll("[^0-9]", "");
		  	
				 TotalPaymentInt = Float.parseFloat(TotalPaymentstr);
				 TotalPaymentInt=TotalPaymentInt/100;
		}
					 return TotalPaymentInt;
		
	}
	
//Fetching Paye_NI DUE TO HMRC value from payroll summary Page		
	
	public float Paye_NI_Due_to_HMRC()
	{
		String PAYE_NI=m_Driver.findElement(By.xpath("(//*[text()='PAYE & NI DUE TO HMRC']//following::td)[1]")).getText();
      
      	String PAYE_NIstr=PAYE_NI.replaceAll("[^0-9]", "");
      	
  		float PAYE_NIInt = Float.parseFloat(PAYE_NIstr);
  		PAYE_NIInt=PAYE_NIInt/100;
  		return PAYE_NIInt;
	}
	
	
	
	
	
	
	
	
	
	
}
