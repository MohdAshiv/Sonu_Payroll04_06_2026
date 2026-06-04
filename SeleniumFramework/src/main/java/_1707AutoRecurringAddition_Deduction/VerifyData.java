package _1707AutoRecurringAddition_Deduction;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData extends BasePage {

	public VerifyData(WebDriver driver) {
		super(driver);
		
	}
	SoftAssert soft= new SoftAssert();
	
	

	public void GrossPay(String GrossTillJuly, String GrossFromAug)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]"));
		
		
		for(int i=1;i<list.size()-1;i++)
		{
			
			 if(i<=4)
			 {
			 String actualGross = list.get(i).getText();
			 
			 soft. assertEquals(actualGross, GrossTillJuly );
			 }
			 
			 else
			 {
				 String Gross = list.get(i).getText();	
				 soft. assertEquals(Gross, GrossFromAug ); 
		    }
		
		}
		
	   	Reporter.log("Verify Gross Till July and From Aug");
		
	}
	
	
	public void RecurringAddition(String GrossJulytoSep, String GrossFromOct)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]"));
		
		
		for(int i=4;i<list.size()-1;i++)
		{
			
			 if(i<=6)
			 {
			 String actualGross = list.get(i).getText();
			 
			 soft. assertEquals(actualGross, GrossJulytoSep );
			 }
			 
			 else
			 {
				 String Gross = list.get(i).getText();	
				 soft. assertEquals(Gross, GrossFromOct ); 
		    }
		
		}
		
	   	Reporter.log("Verify Gross Should Auto Stop from Oct");
		
	}
	
	public void GrossPay1(String GrossTillJunetoSep, String GrossOctToMarch)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]"));
		
		
		for(int i=1;i<list.size()-1;i++)
		{
			
			 if(i<=3)
			 {
			 String actualGross = list.get(i).getText();
			 
			 soft. assertEquals(actualGross, GrossTillJunetoSep );
			 }
			 
			 else
			 {
				 String Gross = list.get(i).getText();	
				 soft. assertEquals(Gross, GrossOctToMarch ); 
		    }
		
		}
		
	   	Reporter.log("Verify Gross Till July and From Aug");
		
	}

	public void employeePaySchedule(String GrossTillAug, String GrossFromSep)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/div/table/tbody/tr/td[5]"));
		
		
		for(int i=0;i<list.size()-1;i++)
		{
			
		
			if(i==12)
			{
				
			break;	
			}
			
			 if(i<=4)
			 {
			 String actualGross = list.get(i).getText();
			 
			 soft. assertEquals(actualGross, GrossTillAug );
			 }
			 
			 else
			 {
				 String Gross = list.get(i).getText();	
				 soft. assertEquals(Gross, GrossFromSep ); 
		    }
		
		}
		
	   	Reporter.log("Verify Gross Till Aug and From Sep under EmployeePaySchedule");
		
	}
	
	
	
	public void payrollDashboard(String Gross,String Tax,String employeeNI,String employeePension,String employerNI,String employerPension)
	{
		
		
		
		List<WebElement> data = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[contains(text(),'£')]"));
		  
		
		       String actualGross = data.get(0).getText();
		       soft. assertEquals(actualGross, Gross, "Gross not as expected"); 
		       
		       String actualTax = data.get(1).getText();
		       soft. assertEquals(actualTax, Tax, "Tax not as expected"); 
		       
		       String actualemployeeNI= data.get(2).getText();
		       soft. assertEquals(actualemployeeNI, employeeNI, "Ee Ni not as Expected" ); 
		       
		       String actualemployeePension = data.get(3).getText();
		       soft. assertEquals(actualemployeePension, employeePension,  "Ee pension Not as expected");
		       
		       String actualemployerNI = data.get(4).getText();
		       soft. assertEquals(actualemployerNI, employerNI,"ER NI not as expected" ); 
		       
		       String actualemployerPension = data.get(5).getText();
		       soft. assertEquals(actualemployerPension, employerPension," ER pension Not as Expected" ); 
		
		       Reporter.log("Verify PayrollDashboard");
		
	}
	
	public void PensionAmount(String employeePension,String employerPension)
	{
		
		
		List<WebElement> data = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[contains(text(),'£')]"));
		  
		
		       
		       
		       String actualemployeePension = data.get(3).getText();
		       System.out.println("Employee Pension= "+ actualemployeePension);
		       soft. assertEquals(actualemployeePension, employeePension,  "Ee pension Not as expected");
		       
		       
		       String actualemployerPension = data.get(5).getText();
		       System.out.println("Employer Pension= "+ actualemployerPension);
		       soft. assertEquals(actualemployerPension, employerPension," ER pension Not as Expected" ); 
		
		       Reporter.log("Verify Pension");
		
	}
	
	
	public void verifyEmployeeScheduleReport(String gross,String tax, String employeeNI,String employeePension,String employerNI,String employerPension)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class=\"rowFinal\"]/td[contains(text(),'£')]"));
		
		   String grossYtd = list.get(0).getText();
		   assertEquals(grossYtd, gross, "Gross not as expected"); 
		   
		   String taxYtd = list.get(2).getText();
		   assertEquals(taxYtd, tax, "Tax not as expected"); 
		   
		   
		   String employeeNiYtd = list.get(3).getText();
		   assertEquals(employeeNiYtd, employeeNI, "employeeNI not as expected"); 
		   

		   String employeePensionYtd = list.get(4).getText();
		   assertEquals(employeePensionYtd, employeePension, "employeePension not as expected"); 
		   
		   
		   String employerNiYtd = list.get(8).getText();
		   assertEquals(employerNiYtd, employerNI, "employerNI not as expected");
		   
		   
		   String employerPensionYtd = list.get(9).getText();
		   assertEquals(employerPensionYtd, employerPension, "employerPension not as expected"); 
		   
	}
	
	public void EmployerPension(String value)
	{
		
		String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr[6]/td[7]")).getText();
		
		 assertEquals(data, value, "Employer pension not as expected ");
		
		Reporter.log("Verify Employer Pension");
		
	}
	
	
	public void verifyAlert(String Alert)
	{
		
		String alertMsg = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_dvDeleteAlert']")).getText();
		
		System.out.println(alertMsg);
		soft.assertEquals(alertMsg, Alert, "messege Not as Expected");
		
		Reporter.log("Verify Alert Messege");
	}
	
	public void verifyAlert1()
	{
		String  expectedMsg="Success! Details Saved Successfully";
		String alertMsg = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]")).getText();
		
		System.out.println(alertMsg);
		soft.assertEquals(alertMsg, expectedMsg , "messege Not as Expected");
		
		Reporter.log("Verify Alert Messege");
	}
	
	
	public void additionInProcessPay(String bonous)
	{
		
		String actualBonous = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']")).getAttribute("value");
		System.out.println("Bonous Amount is ="+ actualBonous);
		soft.assertEquals(actualBonous, bonous, "Bonous  Not as Expected");
		Reporter.log("Verify ProcessPay added Bonous");
	}
	
	
	public void assertAll()
	{
		soft.assertAll();
		
		
	}
	
}
