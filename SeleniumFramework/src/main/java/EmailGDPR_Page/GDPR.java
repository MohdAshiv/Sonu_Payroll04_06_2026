package EmailGDPR_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class GDPR  extends BasePage{

	public GDPR(WebDriver driver) {
		super(driver);
		
	}

	private By assessElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefAEassessEmployee']");
	
	private By selectBoxElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkDlHeader']");
	public void select3Period()
	{
		
		try {
			
		   	m_Driver.findElement(By.xpath("//*[@id='SelectAllRecord']")).click();
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/div/table/tbody/tr/td[1]"));
			
			for(int i =0;i<=2;i++)
			{
				 WebElement elem = list.get(i);
				 elem.click();
				 
			}
		} catch (Exception e) {
			
			
			System.out.println("Issue In select3Period"+e);
		}
		
		Reporter.log("select3Period");
	}
	
	
	public void select2Period()
	{
		
		try {
			
		   	m_Driver.findElement(By.xpath("//*[@id='SelectAllRecord']")).click();
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/div/table/tbody/tr/td[1]"));
			
			for(int i =0;i<=1;i++)
			{
				 WebElement elem = list.get(i);
				 elem.click();
				 
			}
		} catch (Exception e) {
			
			
			System.out.println("Issue In select3Period"+e);
		}
		
		Reporter.log("select2Period");
	}
	
	
	public void clickAssessEmployee() throws Exception
	{
        
		WebElement elem = getWebElement(assessElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAssessEmployee", "clickAssessEmployee failed. Unable to locate object: " + assessElem.toString());

			Assert.fail("Unable to locate object: " + assessElem.toString());
        }
		Thread.sleep(2000);
		elem.click();

		Thread.sleep(5000);
	    Reporter.log("clickAssessEmployee");
	
}
	
	
	public void clickSelectChkBox() throws Exception
	{
        
		WebElement elem = getWebElement(selectBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSelectChkBox", "clickSelectChkBox failed. Unable to locate object: " + selectBoxElem.toString());

			Assert.fail("Unable to locate object: " + selectBoxElem.toString());
        }
		Thread.sleep(2000);
		elem.click();
		
		m_Driver.switchTo().alert().accept();

		Thread.sleep(2000);
	    Reporter.log("clickSelectChkBox");
	
}
	
	public void clickNextBtn() throws Exception
	{
        
		WebElement elem =  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl02_lnkPage']"));
		
	
		Thread.sleep(2000);
		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		elem.click();

		Thread.sleep(2000);
	    Reporter.log("clickNextBtn");
	
}
	
}
