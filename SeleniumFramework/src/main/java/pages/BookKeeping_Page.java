package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class BookKeeping_Page extends BasePage{

	public BookKeeping_Page(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickExpenditure() throws Exception {
		
		 m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a/span")).click();
		
		 Thread.sleep(3000);
		 
		 Reporter.log("clickExpenditure");
	}

	
	
	

	public void clickAdvisorTool() throws Exception {
		
		 m_Driver.findElement(By.xpath("//*[@id='ctl00_btnAdvisorTools']")).click();
		
		 Thread.sleep(3000);
		 
		 Reporter.log("clickAdvisorTool");
	}
	
	
	public void clickDepartmentalEnteries() throws Exception {
		
		 m_Driver.findElement(By.xpath("//*[@id='ctl00_liDerpartmental']/a")).click();
		
		 Thread.sleep(3000);
		 
		 Reporter.log("clickDepartmentalEnteries");
	}
	
	
	public void selectTransaction() throws Exception {
		
		 m_Driver.findElement(By.xpath("//*[@id='selAll']")).click();
		
		 Thread.sleep(3000);
		 
		 Reporter.log("selectTransaction");
	}
	
	
	public void selectDepartment(String data) throws Exception {
		
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddDept']"));
		
		Select sel = new Select(elem);
		
		sel.selectByVisibleText(data);
		 Thread.sleep(3000);

		
		Reporter.log("selectDepartment");
		
	}
	
	
	
	public void clickBulkAllocate() throws Exception {
		
		 m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnBulkAllocate']")).click();
		
		 Thread.sleep(3000);
		 
		 Reporter.log("clickBulkAllocate");
	}
	
	
	
	public void clickBulkUnallocate() throws Exception {
		
		 m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrAllocated_ctl00_lnkUnAllocate']/i")).click();
		
		 Thread.sleep(3000);
		 
	    m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));

		 m_Driver.findElement(By.xpath("//*[@id='ctl00_cphFooter_btnSave']")).click();
		 Thread.sleep(2000);
		 
		 m_Driver.switchTo().defaultContent();

		 Reporter.log("clickBulkUnallocate");
	}
	

}
