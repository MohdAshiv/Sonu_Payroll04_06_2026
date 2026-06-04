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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cc7cc460-6887-4a34-8ffa-a6790e9d64e9
@TestModellerModule(guid = "cc7cc460-6887-4a34-8ffa-a6790e9d64e9")
public class Tax_Payment_Table1 extends BasePage
{
	static int monthvalue=0;
	//static int i=0;
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	
	static float CIS_Sufferedvalue=0;
	static float CIS_SufferedAmountInt=0;
	static int i=0;
	public Tax_Payment_Table1 (WebDriver driver)
	{
		super(driver);
	}
	
	public void monthvaluemethod()
	{
				sTestCaseID="TC39";
			    Sheet="Sheet1";
			 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
				
				String date=data[6];
			    //	System.out.println("date value is :"+date);
			    	String month=date.replaceAll("[^0-9]", "");
			    	String value="30092020";
			    	monthvalue=0;
			    	String Augvalue="30082020";
			    	if(month==value || month==Augvalue)
			    	{
					      	 monthvalue =Integer.parseInt(month);
					      	monthvalue=monthvalue/10000;
					      	monthvalue=monthvalue%10;
					      //	System.out.println("monthvalue in if condition"+monthvalue);
			    	}
			    	else
			    	{
			    		 monthvalue =Integer.parseInt(month);
				      	monthvalue=monthvalue/10000;
				      	monthvalue=monthvalue%100;
				     // 	System.out.println("monthvalue in else condition+"+monthvalue);
			    	}
					//return monthvalue;
			    	
			    if(monthvalue==1)	
			    {
			    	i=monthvalue+9;
			    }
			    else if(monthvalue==2)	
			    {
			    	i=monthvalue+10;
			    }
			    else if(monthvalue==3)	
			    {
			    	i=monthvalue+11;
			    }
			    else
			    {
			    	i=monthvalue-3;
			    }
	}
	 
	 
	
//Fetching value from EE_NI	
	public float EE_NI()
	{
		//System.out.println("i value :"+i);
		String EE_NIAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[3]")).getText();
      	
      	String EE_NIAmountStr=EE_NIAmount.replaceAll("[^0-9]", "");
      	
  		float EE_NIInt = Float.parseFloat(EE_NIAmountStr);
  		EE_NIInt=EE_NIInt/100;
		
  		return EE_NIInt;
		
	}

	
//Fetching value from ER_NI		
	public float ER_NI()
	{
		
		String ER_NIAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[4]")).getText();
      	
      	String ER_NIAmountStr=ER_NIAmount.replaceAll("[^0-9]", "");
      	
  		float ER_NIInt = Float.parseFloat(ER_NIAmountStr);
  		ER_NIInt=ER_NIInt/100;
		
  		return ER_NIInt;
		
	}
	
	
//Fetching value from Income Tax amount	
	public float Income_Tax()
	{
		
		String Income_TaxAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[11]")).getText();
      	
      	String Income_TaxAmountStr=Income_TaxAmount.replaceAll("[^0-9]", "");
      	
  		float Income_TaxAmountInt = Float.parseFloat(Income_TaxAmountStr);
  		Income_TaxAmountInt=Income_TaxAmountInt/100;
		
  		return Income_TaxAmountInt;
		
	}
	
	
	
//Fetching value from CIS_Suffered amount	
	public float CIS_Suffered()
	{
			
		String CIS_SufferedAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[14]")).getText();
	      	
	     String CIS_SufferedStr=CIS_SufferedAmount.replaceAll("[^0-9]", "");
	      	
	   CIS_SufferedAmountInt = Float.parseFloat(CIS_SufferedStr);
	  	CIS_SufferedAmountInt=CIS_SufferedAmountInt/100;
			
	  	CIS_Sufferedvalue=CIS_SufferedAmountInt;
	  	System.out.println("CIS value in tac payment page:"+CIS_Sufferedvalue);
	  	return CIS_SufferedAmountInt;
			
		}	
	public float CIS_SufferedSenttoReports() 
	{
		System.out.println("CIS value in tac payment page after return:"+CIS_Sufferedvalue);
		return CIS_Sufferedvalue;
		
	}
	
	
//Fetching value from  Amount_Due_to_HMRC amount	
	public float Amount_Due_to_HMRC()
		{
				//System.out.println("value of i in amount due to hmrc="+i);
			String Amount_Due_to_HMRCAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[15]")).getText();
		      	
		     String Amount_Due_to_HMRCStr=Amount_Due_to_HMRCAmount.replaceAll("[^0-9]", "");
		      	
		  	float Amount_Due_to_HMRCInt = Float.parseFloat(Amount_Due_to_HMRCStr);
		  	Amount_Due_to_HMRCInt=Amount_Due_to_HMRCInt/100;
				
		  	return Amount_Due_to_HMRCInt;
				
		}	
	
	
	
//Fetching value from Paid Amount amount	
		public float AmountPaid()
			{
					
				String AmountPaidAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[16]")).getText();
			      	
			     String AmountPaidStr=AmountPaidAmount.replaceAll("[^0-9]", "");
			      	
			  	float AmountPaidInt = Float.parseFloat(AmountPaidStr);
			  	AmountPaidInt=AmountPaidInt/100;
					
			  	return AmountPaidInt;
					
			}		
		
		
//Fetching value from Balance due to HMRC 	
		public float Balance_Due_to_HMRC()
			{
							
				String Balance_Due_to_HMRCAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[17]")).getText();
					      	
				 String Balance_Due_to_HMRCStr=Balance_Due_to_HMRCAmount.replaceAll("[^0-9]", "");
					      	
				 float Balance_Due_to_HMRCInt = Float.parseFloat(Balance_Due_to_HMRCStr);
				 Balance_Due_to_HMRCInt=Balance_Due_to_HMRCInt/100;
							
				return Balance_Due_to_HMRCInt;
							
			}		
	
		
//Fetching previous value from Balance due to HMRC 	
				public float preBalance_Due_to_HMRC()
					{
									
						String preBalance_Due_to_HMRCAmount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+(i-1)+"]/td[17]")).getText();
							System.out.println("preBalance_Due_to_HMRCAmount:"+preBalance_Due_to_HMRCAmount);      	
						 String preBalance_Due_to_HMRCStr=preBalance_Due_to_HMRCAmount.replaceAll("[^0-9]", "");
							      	
						 float preBalance_Due_to_HMRCInt = Float.parseFloat(preBalance_Due_to_HMRCStr);
						 preBalance_Due_to_HMRCInt=preBalance_Due_to_HMRCInt/100;
									
						return preBalance_Due_to_HMRCInt;
									
					}		
					
	
}
