package _11552_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import pages.BasePage;

public class AgentToBuisness  extends BasePage{

	public AgentToBuisness(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void clickClientSpeceficReport() throws Exception
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkBtnReport']"));
		
		elem.click();
		
		Thread.sleep(1000);
		
		Reporter.log("clickClientSpeceficReport");
	}
	
	

	  public void selectReportType(String data) {
		  
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ddlPayrollCWRepName']"));
		  
		  Select sel= new  Select(elem);
		  
		  sel.selectByVisibleText(data);
		  
		  Reporter.log("selectReportType");
		  
		  
		  
	  }
	  
	  
	  public void enterComapnay(String data) {
		  
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='search_input']"));
			  Actions act = new Actions(m_Driver);

			 elem.sendKeys(data);
			
			  act.sendKeys(Keys.DOWN).perform();
			    act.sendKeys(Keys.ENTER).perform();
			    
			    System.out.println("sj");
//			 elem.sendKeys(Keys.ENTER);
//			 elem.sendKeys(Keys.ARROW_DOWN);
//			// act.sendKeys(Keys.ARROW_DOWN).click().build();
//			 
//			 WebElement we = m_Driver.findElement(By.xpath("By.xpath('//*[contains(text(),'BrJxeUkMf')]')"));
//			 act.moveToElement(we).build().perform();
			 Reporter.log("enterComapnay");
			  
			  
			  
		  }
	  
	  
	  
	  
}
