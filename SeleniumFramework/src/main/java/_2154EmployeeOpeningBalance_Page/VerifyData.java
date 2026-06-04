package _2154EmployeeOpeningBalance_Page;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData  extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
	
	}
	
	SoftAssert soft= new SoftAssert();
	
	public void NegativeTax(String expectedTax)

	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		String ActualTax=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtYtdTaxDeducted']")).getAttribute("value");
		
	    assertEquals(ActualTax, expectedTax, "Tax Not as Expected");
	   
	    m_Driver.switchTo().defaultContent();

	    
	    Reporter.log("Verify Negative Tax");
	}
	
	
	public void NegativeEmployeeNI(String employeeNI)

	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		String actualEmployeeNI=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_RegularExpressionValidator2']")).getText();
		
	    assertEquals(actualEmployeeNI, employeeNI, "Employee NI not as Expected");
	    
	    m_Driver.switchTo().defaultContent();

	    
	    Reporter.log("Verify validation Negative EmployeeNI ");
	}
	
	
	public void NegativeEmployerNI(String employerNI)

	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		String actualEmployerNI=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_RegularExpressionValidator3']")).getAttribute("value");
		
	    assertEquals(actualEmployerNI, employerNI);
	    
	    m_Driver.switchTo().defaultContent();

	    Reporter.log("Verify validation Negative EmployerNI ");
	}
	
	public void NegativeEmployeePension(String employeePension)

	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		String actualEmployeePension=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_RegularExpressionValidator10']")).getText();
		
	    assertEquals(actualEmployeePension, employeePension);
	    
	    m_Driver.switchTo().defaultContent();

	    
	    Reporter.log("Verify validation Negative Employee Pension ");
	}
	
	public void NegativeEmployerPension(String employerPension)

	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[3]/div/div/div[2]/iframe")));

		String actualEmployerPension=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_RegularExpressionValidator12']")).getText();
		
	    assertEquals(actualEmployerPension, employerPension);
	    
	    m_Driver.switchTo().defaultContent();

	    
	    Reporter.log("Verify validation Negative Employer Pension ");
	}
	
	
	public void taxPayement ( String employeeNI,String employerNi,String tax) throws Exception
	{		
		
		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[1]/td[contains(text(),'£')]"));
		   
		 
		    String actualemployeeNi = list.get(0).getText();
			actualemployeeNi = actualemployeeNi.replaceAll("£", "");
			actualemployeeNi = actualemployeeNi.replaceAll(",", "");
			soft.assertEquals(actualemployeeNi, employeeNI);
		 
			String actualemployerNi = list.get(1).getText();
			actualemployerNi = actualemployerNi.replaceAll("£", "");
			actualemployerNi = actualemployerNi.replaceAll(",", "");
			soft.assertEquals(actualemployerNi, employerNi);
		 
			
			String actualTax = list.get(8).getText();
			actualTax = actualTax.replaceAll("£", "");
			actualTax = actualTax.replaceAll(",", "");
			soft.assertEquals(actualTax, tax);
		
			
			
			Reporter.log("Verify TaxPaymenty ");
	}
	
	public void taxPayement1( String employeeNI,String employerNi,String tax, String HMRC) throws Exception
	{		
		
		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[4]/td[contains(text(),'£')]"));
		   
		 
		    String actualemployeeNi = list.get(0).getText();
		    actualemployeeNi = actualemployeeNi.replaceAll("£", "");
			actualemployeeNi = actualemployeeNi.replaceAll(",", "");
			System.out.println("Employee NI ="+actualemployeeNi);
		    soft.assertEquals(actualemployeeNi, employeeNI);
		 
			String actualemployerNi = list.get(1).getText();
			actualemployerNi = actualemployerNi.replaceAll("£", "");
			actualemployerNi = actualemployerNi.replaceAll(",", "");
			System.out.println("Employer NI ="+actualemployerNi);

			soft.assertEquals(actualemployerNi, employerNi);
		 
			
			String actualTax = list.get(9).getText();
			actualTax = actualTax.replaceAll("£", "");
			actualTax = actualTax.replaceAll(",", "");
			System.out.println("Tax  ="+actualTax);

		      soft.assertEquals(actualTax, tax);
			
			String actualHmrc = list.get(13).getText();
			actualHmrc = actualHmrc.replaceAll("£", "");
			actualHmrc = actualHmrc.replaceAll(",", "");
			System.out.println("HMRC  ="+actualHmrc);

		    soft. assertEquals(actualHmrc, HMRC);
			
			
          
		
			Reporter.log("Verify TaxPayement");
	}
	
	public void taxPayement2 ( String employeeNI,String employerNi,String tax, String HMRC) throws Exception
	{		
		
		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[3]/td[contains(text(),'£')]"));
		   
		 
		    String actualemployeeNi = list.get(0).getText();
		    actualemployeeNi = actualemployeeNi.replaceAll("£", "");
			actualemployeeNi = actualemployeeNi.replaceAll(",", "");
			System.out.println("Employee NI ="+actualemployeeNi);
		    soft.assertEquals(actualemployeeNi, employeeNI);
		 
			String actualemployerNi = list.get(1).getText();
			actualemployerNi = actualemployerNi.replaceAll("£", "");
			actualemployerNi = actualemployerNi.replaceAll(",", "");
			System.out.println("Employer NI ="+actualemployerNi);

			soft.assertEquals(actualemployerNi, employerNi);
		 
			
			String actualTax = list.get(9).getText();
			actualTax = actualTax.replaceAll("£", "");
			actualTax = actualTax.replaceAll(",", "");
			System.out.println("Tax  ="+actualTax);

		      soft.assertEquals(actualTax, tax);
			
			String actualHmrc = list.get(13).getText();
			actualHmrc = actualHmrc.replaceAll("£", "");
			actualHmrc = actualHmrc.replaceAll(",", "");
			System.out.println("HMRC  ="+actualHmrc);

		    soft. assertEquals(actualHmrc, HMRC);
			
			
          
		
			Reporter.log("Verify TaxPayement");
	}
	
	public void verifyIncomeTax(String total)
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[12]"));
		
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
       Reporter.log("Verify verifyIncomeTax");
        
	}
	
	public void verifyP11( String Lel,String Pt,String Uel, String EmployeeEmployer,String employee)
	{  
		
		
		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[4]/td[contains(text(),'£')]"));
		  
		 
		 
			String actualLel = list.get(0).getText();
			actualLel = actualLel.replaceAll("£", "");
			actualLel = actualLel.replaceAll(",", "");
			assertEquals(actualLel, Lel);

			String actualPT = list.get(1).getText();
			actualPT = actualPT.replaceAll("£", "");
			actualPT = actualPT.replaceAll(",", "");
			assertEquals(actualPT, Pt);

			String actualUel = list.get(2).getText();

			actualUel = actualUel.replaceAll("£", "");
			actualUel = actualUel.replaceAll(",", "");
			assertEquals(actualUel, Uel);

			String actualEeEr = list.get(3).getText();
			actualEeEr = actualEeEr.replaceAll("£", "");
			actualEeEr = actualEeEr.replaceAll(",", "");
			assertEquals(actualEeEr, EmployeeEmployer);

			String actualEENi = list.get(4).getText();
			actualEENi = actualEENi.replaceAll("£", "");
			actualEENi = actualEENi.replaceAll(",", "");
			assertEquals(actualEENi, employee);
			 
		  Reporter.log("Verify P11 ");
		  
		
		
	}
	
	public void verify_P11( String Lel,String Pt,String Uel, String EmployeeEmployer,String employee)
	{  
		
		
		  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='rowFinal'])[2]/td[contains(text(),'£')]"));
		  
		 
		  String actualLel = list.get(0).getText();
			actualLel = actualLel.replaceAll("£", "");
			actualLel = actualLel.replaceAll(",", "");
			soft.assertEquals(actualLel, Lel);

			String actualPT = list.get(1).getText();
			actualPT = actualPT.replaceAll("£", "");
			actualPT = actualPT.replaceAll(",", "");
			soft.assertEquals(actualPT, Pt);

			String actualUel = list.get(2).getText();

			actualUel = actualUel.replaceAll("£", "");
			actualUel = actualUel.replaceAll(",", "");
			soft.assertEquals(actualUel, Uel);

			String actualEeEr = list.get(3).getText();
			actualEeEr = actualEeEr.replaceAll("£", "");
			actualEeEr = actualEeEr.replaceAll(",", "");
			soft.assertEquals(actualEeEr, EmployeeEmployer);

			String actualEENi = list.get(4).getText();
			actualEENi = actualEENi.replaceAll("£", "");
			actualEENi = actualEENi.replaceAll(",", "");
			soft.assertEquals(actualEENi, employee);
			 
		  Reporter.log("Verify P11 ");
			
	  
		
		
	}
	
	
	public void individualEmployeePaySchedule(String grossPay,String tax, String employeeNI,String netPay,String employerNi )
	{		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td[contains(text(),'£')]"));
		   
			String actualgrossPay = list.get(0).getText();
			actualgrossPay = actualgrossPay.replaceAll("£", "");
			actualgrossPay = actualgrossPay.replaceAll(",", "");
			
			System.out.println("GrossPay = "+actualgrossPay);
			soft.assertEquals(actualgrossPay, grossPay);
			
			String actualTax = list.get(2).getText();
			actualTax = actualTax.replaceAll("£", "");
			actualTax = actualTax.replaceAll(",", "");
			System.out.println("IncomeTax = "+actualTax);
			soft.assertEquals(actualTax, tax);
			
			String actualemployeeNi = list.get(3).getText();
			actualemployeeNi = actualemployeeNi.replaceAll("£", "");
			actualemployeeNi = actualemployeeNi.replaceAll(",", "");
			System.out.println("EmployeeNI = "+actualemployeeNi);

			soft.assertEquals(actualemployeeNi, employeeNI);
			
			String actualNetPay = list.get(7).getText();
			actualNetPay = actualNetPay.replaceAll("£", "");
			actualNetPay = actualNetPay.replaceAll(",", "");
			System.out.println("NetPay = "+actualNetPay);

			soft.assertEquals(actualNetPay, netPay);
			
			String actualemployerNi = list.get(8).getText();
			actualemployerNi = actualemployerNi.replaceAll("£", "");
			actualemployerNi = actualemployerNi.replaceAll(",", "");
			System.out.println("EmployerNI = "+actualemployerNi);

			soft.assertEquals(actualemployerNi, employerNi);
			
			Reporter.log("Verify individualEmployeePaySchedule ");
	}
	
	public void individualEmployeePaySchedule1(String grossPay,String tax) {
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td[contains(text(),'£')]"));
		   
			String actualgrossPay = list.get(0).getText();
			actualgrossPay = actualgrossPay.replaceAll("£", "");
			actualgrossPay = actualgrossPay.replaceAll(",", "");
			
			System.out.println("GrossPay = "+actualgrossPay);
			soft.assertEquals(actualgrossPay, grossPay);
			
			String actualTax = list.get(2).getText();
			actualTax = actualTax.replaceAll("£", "");
		 //actualTax = actualTax.replaceAll(",", "");
			System.out.println("IncomeTax = "+actualTax);
			soft.assertEquals(actualTax, tax);
			
		
			Reporter.log("Verify individualEmployeePaySchedule ");
	}
	
	public void taxNIYTD(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI  )
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		 
		String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
		String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
		String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
	//	String gross = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();
		
		 taxYTD=taxYTD.replaceAll("£", "");
		 taxYTD=taxYTD.replaceAll(",", "");
		soft.assertEquals(taxYTD, expextedTax, "expected tax not matched");
		
		employeeNI=employeeNI.replaceAll("£", "");
		employeeNI=employeeNI.replaceAll(",", "");
		soft.assertEquals(employeeNI, expectedEmployeeNI, "expected EE NI not matched");
		
		employerNI=employerNI.replaceAll("£", "");
		employerNI=employerNI.replaceAll(",", "");
		soft.assertEquals(employerNI, expectedEmployerNI, "expected ER NI not matched");
	
		
		m_Driver.switchTo().defaultContent();

		Reporter.log("Verify tax NI figure");
	}
	
	
	public void P11( String Lel,String Pt,String Uel, String EmployeeEmployer,String employee)
	{  
		
		
		  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='rowFinal'])[2]/td[contains(text(),'£')]"));
		  
		 
		  jsExec.executeScript("window.scrollBy(0,300)"); 
			String actualLel = list.get(0).getText();
			actualLel = actualLel.replaceAll("£", "");
			actualLel = actualLel.replaceAll(",", "");
			soft.assertEquals(actualLel, Lel);

			String actualPT = list.get(1).getText();
			actualPT = actualPT.replaceAll("£", "");
			actualPT = actualPT.replaceAll(",", "");

			soft.assertEquals(actualPT, Pt);

			String actualUel = list.get(2).getText();

			actualUel = actualUel.replaceAll("£", "");
			actualUel = actualUel.replaceAll(",", "");
			soft.assertEquals(actualUel, Uel);

			String actualEeEr = list.get(3).getText();
			actualEeEr = actualEeEr.replaceAll("£", "");
			actualEeEr = actualEeEr.replaceAll(",", "");
			soft.assertEquals(actualEeEr, EmployeeEmployer);

			String actualEENi = list.get(4).getText();
			actualEENi = actualEENi.replaceAll("£", "");
			actualEENi = actualEENi.replaceAll(",", "");
			soft.assertEquals(actualEENi, employee);
			 
		     Reporter.log("Verify P11 ");
		  
		
		
	}
	
	
	public void verifyP11Tax(String Tax)
	
	{
		String actualTax = m_Driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/main/div/div[3]/div/div[2]/div/div[11]/div/div/div/div/table/tbody/tr[4]/td[3]")).getText();
		actualTax=actualTax.replaceAll("£", "");
		actualTax=actualTax.replaceAll(",", "");
		System.out.println(actualTax);
		soft.assertEquals(actualTax, Tax);
		
		Reporter.log("VerifyP11 Total PayTax");

	}
	
	
    public void verifyP11Tax1(String Expectedpay,String Tax)
	
	{
		 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[5]/tbody/tr[4]/td"));

		  jsExec.executeScript("window.scrollBy(0,1000)"); 
		 
			String pay = list.get(1).getText();
			pay = pay.replaceAll("£", "");
			pay = pay.replaceAll(",", "");
			System.out.println(pay);
			soft.assertEquals(pay, Expectedpay);

			
			
			
			
			
			
			String actualTax = list.get(2).getText();
			actualTax = actualTax.replaceAll("£", "");
			actualTax = actualTax.replaceAll(",", "");
			System.out.println(actualTax);
			soft.assertEquals(actualTax, Tax);
		
			Reporter.log("VerifyP11 Total PayTax");
		
	}
	public void assertAll()
	{
		soft.assertAll();
		
	}
	
}
