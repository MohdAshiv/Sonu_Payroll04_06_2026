package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.reports.ExtentReportManager;

public class AgentLevelEmailLog extends BasePage {

	public AgentLevelEmailLog(WebDriver driver) {
		super(driver);
	
	}
	
	
	
	private By emailDropDownIcnElem=By.xpath("//*[@id='aspnetForm']/main/header/div[2]/div[3]/div/ul/li[9]/a");
	
	private By emailLogElem =By.xpath("//*[@id='CommunicationInbox']");

	
	//private By recievedEmailElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrAll_ctl00_lbtnViewEmail']");
	private By recievedEmailElem= By.xpath("//*[@id='FillTable']/tbody/tr[1]/td[2]/a");

	private By recievedEmailElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl01_lbtnViewEmail']");

	private By payrollSummary=By.xpath("//*[contains(text(),'Payroll Summary')]");
	
	
	public void clickEmailDropDown() throws Exception
	{
        
		utilities.ChangeWindow.Switchwindow(1, m_Driver);
		Thread.sleep(5000);
		WebElement elem = getWebElement(emailDropDownIcnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailDropDown", "clickEmailDropDown failed. Unable to locate object: " + emailDropDownIcnElem.toString());

			Assert.fail("Unable to locate object: " + emailDropDownIcnElem.toString());
        }
		
       Thread.sleep(3000);
		elem.click();
		
	Thread.sleep(2000);
	Reporter.log("clickEmailDropDown");
	
}
	
	public void clickEmailDropDown1() throws Exception
	{
        
		WebElement elem = getWebElement(emailDropDownIcnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailDropDown", "clickEmailDropDown failed. Unable to locate object: " + emailDropDownIcnElem.toString());

			Assert.fail("Unable to locate object: " + emailDropDownIcnElem.toString());
        }
		
       Thread.sleep(2000);
		elem.click();
		
		
	Thread.sleep(2000);
	Reporter.log("clickEmailDropDown");
	
}
	
	

	public void clickEmailLog() throws Exception
	{
        
		WebElement elem = getWebElement(emailLogElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailLog", "clickEmailLog failed. Unable to locate object: " + emailLogElem.toString());

			Assert.fail("Unable to locate object: " + emailLogElem.toString());
        }
		
      
		elem.click();
	 Thread.sleep(5000);
		
	
	Reporter.log("clickEmailLog");
	
}
	
	

	public void clickPayrollSummary() throws Exception
	{
        
		WebElement elem = getWebElement(payrollSummary);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayrollSummary", "clickPayrollSummary failed. Unable to locate object: " + payrollSummary.toString());

			Assert.fail("Unable to locate object: " + payrollSummary.toString());
        }
		
      
		elem.click();
	 Thread.sleep(4000);
		
	
	Reporter.log("payrollSummary");
	
}
	
	
	public void clickRecievedEmail() throws Exception
	{
        
		WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(300));

		wait.until(ExpectedConditions.presenceOfElementLocated(
		    By.xpath("//*[@id='FillTable']/tbody/tr[1]/td[2]/a")));

		WebElement elem = getWebElement(recievedEmailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRecievedEmail", "clickRecievedEmail failed. Unable to locate object: " + recievedEmailElem.toString());

			Assert.fail("Unable to locate object: " + recievedEmailElem.toString());
        }
		
		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(3000);
		utilities.ChangeWindow.Switchwindow(3, m_Driver);

		
	 Thread.sleep(2000);
		
	
	Reporter.log("clickRecievedEmail");
	
}
	
	
	public void clickRecievedEmail2() throws Exception
	{
        
		WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(300));

		wait.until(ExpectedConditions.presenceOfElementLocated(
		    By.xpath("//*[@id='FillTable']/tbody/tr[2]/td[2]/a")));
		
		WebElement elem = getWebElement(By.xpath("//*[@id='FillTable']/tbody/tr[2]/td[2]/a"));

	
		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(2000);
		utilities.ChangeWindow.Switchwindow(4, m_Driver);

		
	 Thread.sleep(2000);
		
	
	Reporter.log("clickRecievedEmail");
	
}
	
	public void clickBackBtn() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='parentElement']/div/a"));
		elem.click();
		Thread.sleep(2000);
		
	}
	
	public void clickRecievedEmail1() throws Exception
	{
        
		WebElement elem = getWebElement(recievedEmailElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRecievedEmail1", "clickRecievedEmail1 failed. Unable to locate object: " + recievedEmailElem1.toString());

			Assert.fail("Unable to locate object: " + recievedEmailElem1.toString());
        }
		
		jsExec.executeScript("arguments[0].click();", elem);

		
	 Thread.sleep(2000);
	
	
	Reporter.log("clickRecievedEmail1");
	
}
	

}