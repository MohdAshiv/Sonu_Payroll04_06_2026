package _4943OpeningBalancePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData extends BasePage {

	public VerifyData(WebDriver driver) {
		super(driver);
		
	}

	
	SoftAssert soft= new SoftAssert();

	
	public void verifyOpeningBalance(String Gross, String EmployeeNI,String netPay,String lelToPT,String taxdeducted,String employerNI,String Lel,String uap )
	{
		
     m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		
		String actualGross=m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdGross']")).getAttribute("value");
		
		
		 System.out.println("actual gross  ="+actualGross);
		 soft.assertEquals(actualGross, Gross);

		 
		 
		String actualEmployeeNi=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYtdEmployeeNI']")).getAttribute("value");
			
		System.out.println("actualEmployeeNi ="+actualEmployeeNi);
		soft.assertEquals(actualEmployeeNi, EmployeeNI);

		
		 
	    String actualNetPay=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYtdNetPay']")).getAttribute("value");
				
				
		System.out.println("actualNetPay ="+actualNetPay);
		soft.assertEquals(actualNetPay, netPay);

		
		 
	    String actualELtoPT=m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtYtdELtoPT']")).getAttribute("value");
				
		System.out.println("actualELtoPT ="+actualELtoPT);
		soft.assertEquals(actualELtoPT, lelToPT);

		
		String actualTaxDeducted=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYtdTaxDeducted']")).getAttribute("value");
			
			
	    System.out.println("actualTaxDeducted ="+actualTaxDeducted);
		soft.assertEquals(actualTaxDeducted, taxdeducted);

		 
	    String actualEmployerNI=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYtdEmployerNI']")).getAttribute("value");
		
		
	    System.out.println("actualEmployerNI ="+actualEmployerNI);
		soft.assertEquals(actualEmployerNI, employerNI);

	    
	     
       String actualLEL=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYtdLEL']")).getAttribute("value");
		
		
	    System.out.println("actualLEL ="+actualLEL);
		soft.assertEquals(actualLEL, Lel);

	    
        String actualUAP=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYtdPTtoUAP']")).getAttribute("value");
		
		
	    System.out.println("actualUAP ="+actualUAP);
		soft.assertEquals(actualUAP, uap);
		
		
		Reporter.log("Verify OpeningBalance");

		m_Driver.switchTo().defaultContent();

		 
		 
	}
	
	
	
	public void verifyEmployerAllowances(String total)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
		
		double AllowanceSum = 0;
		 String totalSum = null;
        for(int i=0; i<list.size()-1;i++)
        {
            String value=list.get(i).getText();
            value= value.replaceAll("[£]", "");
            value =value.replaceAll("[,]", "");
           
            AllowanceSum=AllowanceSum + Double.parseDouble(value);
            System.out.println(AllowanceSum);
          totalSum = String.format("%.2f",AllowanceSum);
		
        }
		soft.assertEquals(totalSum, total);

		Reporter.log("Verify Employer Allowances");
        
	}
	
	public void verifyEmployerAllowances1(String total)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
		
		double AllowanceSum = 0;
		 String totalSum = null;
        for(int i=0; i<list.size()-1;i++)
        {
            String value=list.get(i).getText();
            value= value.replaceAll("[£]", "");
            value =value.replaceAll("[,]", "");
           
            AllowanceSum=AllowanceSum + Double.parseDouble(value);
            System.out.println(AllowanceSum);
          totalSum = String.format("%.2f",AllowanceSum);
		
        }
        
		soft.assertEquals(totalSum, total);
       Reporter.log("Verify Employer Allowances");
        
	}
	
	
	public void assertAll()
	{
		soft.assertAll();
		
	}
}
