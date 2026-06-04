package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class EmailPage extends BasePage {

	public EmailPage(WebDriver driver) {
		super(driver);
		
	}

	private By emailPayslip = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
	
	private By selecttype=By.xpath("//*[@id='EmailType']");
	
	private By sendBtn =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By dropIcon= By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul/li[4]/a");
	
	private By emailLog= By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefInbox']");
	private By recivedpayrollElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail']");

	
	public void Click_Email()
	{
        
		WebElement elem = getWebElement(emailPayslip);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Email", "Click_Email failed. Unable to locate object: " + emailPayslip.toString());

			Assert.fail("Unable to locate object: " + emailPayslip.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "Click_Email");
	
	
		   Reporter.log("Click to Email ");
	
}
	
	public void Select_Type(String value)
	{
        
		WebElement elem = getWebElement(selecttype);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + selecttype.toString());

			Assert.fail("Unable to locate object: " + selecttype.toString());
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Select_Type");
	
		   Reporter.log("Select Type = "+value);
	
}
	
	public void Click_SendBtn () throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		WebElement elem = getWebElement(sendBtn);
		
		elem.click();
		m_Driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		m_Driver.findElement(By.xpath("//*[@id='cboxClose']")).click();
		Thread.sleep(2000);
		
		
		Reporter.log("Send Email");
	
}
	
	public void Click_SendBtn1 () throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		WebElement elem = getWebElement(sendBtn);
		
		elem.click();
		Thread.sleep(4000);
		m_Driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		
		Reporter.log("Send Email");
	
}
	
	public void Click_EmailLog() throws InterruptedException
	{
		WebElement elem = getWebElement(dropIcon);
		elem.click();
		Thread.sleep(1000);
		WebElement elem1 = getWebElement(emailLog);
		elem1.click();
		
		Reporter.log("Click Email Log");
		
	}
	
	public void Select_Employee() throws InterruptedException
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='SelectAllRecord']"));
		elem.click();
		Thread.sleep(1000);
		
		WebElement elem1= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_EmployeeEmail']"));
		elem1.click();
		Reporter.log("Select Employee");
	}
	
	public void verifyEmailLog(String expeccted, String expected2 ) throws InterruptedException
	{
	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail']"));
		
	 elem.click();
	 
      Thread.sleep(1000);
      
      String employer = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div[3]/p[2]/i/span")).getText();
	 
      System.out.println(employer);
      assertEquals(employer, expeccted);
      
      utilities.TakeScreenshot.Getscreenshot("TC041_ Verify Email Accessiable employer", "2081", m_Driver);
      m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lbtn_ViewEmail']")).click();
      
      
      WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl01_lbtnViewEmail']"));
      
      elem1.click();
      
      Thread.sleep(1000);
      
      String employee = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div[3]/p[2]/i/span")).getText();
      
      System.out.println(employee);
      
      assertEquals(employee, expected2);
      utilities.TakeScreenshot.Getscreenshot("TC041_ Verify Email Accessiable employee", "2081", m_Driver);
      
      System.out.println("pass");
      
      Reporter.log("Verify Email Logs");
      

	}
	
	
	public void clickRecievedEmail() throws Exception
	{
        
		WebElement elem = getWebElement(recivedpayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRecievedPayroll", "clickRecievedPayroll failed. Unable to locate object: " + recivedpayrollElem.toString());

			Assert.fail("Unable to locate object: " + recivedpayrollElem.toString());
        }
         Thread.sleep(1000);
		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickRecievedPayroll");
	
	
		   Reporter.log("Click  recievd payroll details ");
	
}
	

}