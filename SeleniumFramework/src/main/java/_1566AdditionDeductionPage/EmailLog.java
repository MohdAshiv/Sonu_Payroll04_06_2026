package _1566AdditionDeductionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class EmailLog extends BasePage {

	public EmailLog(WebDriver driver) {
		super(driver);
		
	}
	
	
     private By emailPayslip = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
	
	private By selecttype=By.xpath("//*[@id='EmailType']");
	
	private By sendBtn =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By dropIcon= By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul/li[4]/a");
	
	private By emailLog= By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefInbox']");
	
	private By recivedpayrollElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail']");
	

	
	
	public void clickEmailLog() throws InterruptedException
	{
		WebElement elem = getWebElement(dropIcon);
		elem.click();
		Thread.sleep(1000);
		WebElement elem1 = getWebElement(emailLog);
		elem1.click();
		
		Reporter.log("Click Email Log");
}
	
	public void clickRecievedPayroll() throws Exception
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