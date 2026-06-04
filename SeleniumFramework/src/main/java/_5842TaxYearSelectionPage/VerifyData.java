package _5842TaxYearSelectionPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData  extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
		
	}

	SoftAssert soft= new SoftAssert();

	
	private By leaveType=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatutorypaytype']");
	
	
	private  By employerNoteElem= By.xpath("//*[contains(text(),'Notes')]");
	public void verifySelectedTaxYear(String expectedTaxYear)
	{
		
		try {
			
		
	
       WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']/option[@selected='selected']"));
     
		String actualTaxYear=elem.getText();
		
		System.out.println(actualTaxYear);
		soft.assertEquals(actualTaxYear, expectedTaxYear,"TaxYear selection not as expected");
		
		} catch (Exception e) {
			
			System.out.println("Issue in verifySelectedTaxYear"+e);
			soft.assertFalse(true,"welcome to catch block");
		}
		Reporter.log("verifySelectedTaxYear");
		
	}
	
	
	
	
	
	public void verifySelectedTaxYear1(String expectedTaxYear)
	{
		try {
			
       WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']/option[@selected='selected']"));
     
		String actualTaxYear=elem.getText();
		
		
		System.err.println(actualTaxYear);
		soft.assertEquals(actualTaxYear, expectedTaxYear,"TaxYear selection not as expected");
		Reporter.log("verifySelectedTaxYear1");

		} catch (Exception e) {
			System.out.println("Issue In verifySelectedTaxYear1"+e);
			
	    soft.assertFalse(true,"welcome to catch block");

		}
		
		System.out.println("xyz");
	
	}
	public void verifySelectedTaxYearAndPeriodEnd(String expectedTaxYear,String expectedPeriodEnd)
	{
		
	
			
       WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']/option[@selected='selected']"));
     
		String actualTaxYear=elem.getText();
		
		
		System.out.println(actualTaxYear);
		soft.assertEquals(actualTaxYear, expectedTaxYear,"TaxYear selection not as expected");
		
		 WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[@selected='selected']"));
	     
		String actualPeriodEnd=elem1.getText();
			
			
		System.out.println(actualPeriodEnd);
		soft.assertEquals(actualPeriodEnd, expectedPeriodEnd,"PeriodEnd selection not as expected");
		Reporter.log("verifySelectedTaxYearAndPeriodEnd");
	
		
	}
	
	
	
	public void verifySelectedPeriodEnd(String expectedPeriodEnd)
	{
		
	
		 WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[@selected='selected']"));
	     
		String actualPeriodEnd=elem1.getText();
			
			
		System.out.println(actualPeriodEnd);
		soft.assertEquals(actualPeriodEnd, expectedPeriodEnd,"PeriodEnd selection not as expected");
		Reporter.log("verifySelectedPeriodEnd");
	
		
	}

	
	
	public void verifySelectedTaxYearAndPeriodEnd1(String expectedTaxYear,String expectedPeriodEnd)
	{
		
	
       WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']/option[@selected='selected']"));
     
		String actualTaxYear=elem.getText();
		
		System.out.println(actualTaxYear);
		soft.assertNotEquals(actualTaxYear, expectedTaxYear,"TaxYear selection not as expected");
		
		 WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[@selected='selected']"));
	     
		String actualPeriodEnd=elem1.getText().trim();
			
		System.out.println(actualPeriodEnd);
		soft.assertNotEquals(actualPeriodEnd, expectedPeriodEnd,"PeriodEnd selection not as expected");
		Reporter.log("verifySelectedTaxYearAndPeriodEnd");
	
		
	}
	
	public void verifyPeriodEnd(String value1,String value2)
	{
		
      List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));	
      
      
      for(int i=0;i<=list.size()-1;i++)
      {
    	  
       String data=list.get(i).getText();
       System.out.println(data);
      
       
       if (i<=2)
       {
           soft.assertTrue(data.contains(value1));
  
    	   
       }
       else
       {
           soft.assertTrue(data.contains(value2));

       }

      }
      
      
      
      
      
	}
	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
	 
	 public void selectLeaveType(String Text) throws Exception
		{
			
			WebElement elem = getWebElement(leaveType);
			
			Thread.sleep(2000);
			Select sel = new Select(elem);
			sel.selectByVisibleText(Text);

			Thread.sleep(2000);

			Reporter.log("selectEmployee -"+Text);

		}
	 
	 
	 public void clickEmployerNote() throws Exception
		{
			
			WebElement elem = getWebElement(employerNoteElem);
			
			 elem.click();

			Thread.sleep(2000);

			Reporter.log("clickEmployerNote");

		}
}
