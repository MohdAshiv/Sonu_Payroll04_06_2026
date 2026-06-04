package CIS_DashboardPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	
	public void clickOnCisIcn() throws InterruptedException {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_CIS']"));
		
		elem.click();
		
		
		Thread.sleep(null);
	}

	
}
