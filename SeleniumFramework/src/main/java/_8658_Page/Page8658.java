package _8658_Page;

import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pages.BasePage;

public class Page8658 extends BasePage {
                 
	public Page8658(WebDriver driver) {
		super(driver);
	}

	
	
	
	public void SelectFirstEmployeeFromEveryPage() throws Exception
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkGenerate']")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

		
		 boolean con=list.isEmpty();
	     assertFalse(con);
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
       
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkGenerate']")).click();
			
			Thread.sleep(1000);
			}
			else
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkGenerate']")).click();
				
				Thread.sleep(1000); 
			}
		}
		
		Reporter.log("SelectFirstEmployeeFromEveryPage");
	}
	
	
	public void SelectFirstEmployeeFromEveryPageP45() throws Exception
	{
		
		m_Driver.findElement(By.xpath("(//*[@class='table table-head-bg']/tbody/tr/td/input)[1]")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
		
		 boolean con=list.isEmpty();
	     assertFalse(con);
		  for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
       
			m_Driver.findElement(By.xpath("(//*[@class='table table-head-bg']/tbody/tr/td/input)[1]")).click();
			
			Thread.sleep(1000);
			}
			else
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				m_Driver.findElement(By.xpath("(//*[@class='table table-head-bg']/tbody/tr/td/input)[1]")).click();
				
				Thread.sleep(1000); 
			}
		}
		
		Reporter.log("SelectFirstEmployeeFromEveryPageP45");
	}
	
	
	public void SelectFirstEmployeeFromEveryPageP11D() throws Exception
	{
		
		m_Driver.findElement(By.xpath("(//*[@id='chkemailP11D'])[1]")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='paginationInner clearfix'])[2]/ul/li/a"));
		
		 boolean con=list.isEmpty();
	     assertFalse(con);
		  for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("(//*[@class='paginationInner clearfix'])[2]/ul/li/a"));
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
       
			m_Driver.findElement(By.xpath("(//*[@id='chkemailP11D'])[1]")).click();
			
			Thread.sleep(1000);
			}
			else
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				m_Driver.findElement(By.xpath("(//*[@id='chkemailP11D'])[1]")).click();
				
				Thread.sleep(1000); 
			}
		}
		
		Reporter.log("SelectFirstEmployeeFromEveryPageP11D");
	}
	
	
	public void SelectFirstEmployeeFromEveryPageP11DEmployerView() throws Exception
	{
		
		m_Driver.findElement(By.xpath("(//*[@id='chkemailP11D'])[1]")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='paginationInner clearfix'])[3]/ul/li/a"));
		
		 boolean con=list.isEmpty();
	     assertFalse(con);
		  for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("(//*[@class='paginationInner clearfix'])[3]/ul/li/a"));
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
       
			m_Driver.findElement(By.xpath("(//*[@id='chkemailP11D'])[1]")).click();
			
			Thread.sleep(1000);
			}
			else
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				m_Driver.findElement(By.xpath("(//*[@id='chkemailP11D'])[1]")).click();
				
				Thread.sleep(1000); 
			}
		}
		
		Reporter.log("SelectFirstEmployeeFromEveryPageP11D");
	}
	
	
	public void untickFirstEmployee() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkGenerate']"));
		
		elem.click();
		
		Thread.sleep(1000);
		
	}
	
	
	public void untickFirstEmployeeP45() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("(//*[@class='table table-head-bg']/tbody/tr/td/input)[1]"));
		
		elem.click();
		
		Thread.sleep(1000);
		
	}
	

	
	
	public void untickFirstEmployeeP11D() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("(//*[@id='chkemailP11D'])[1]"));
		
		elem.click();
		
		Thread.sleep(1000);
		
	}
	
	
}
