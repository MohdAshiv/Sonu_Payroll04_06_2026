
package _1908Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class AlertDetails extends BasePage {
	public WebElement elem;
	public AlertDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By howpayworkout = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$ddlPayMethod']");	
	private By AnnualNewSal = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtAnnualSalary']");
	private By DayNewrate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtDayRate']");
	private By HourNewrate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtHourRate']");
	private By WeekNewRate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtWeeklyRate']");
/**
	 * Get Alert Description
 * @throws InterruptedException 
* @name EditEmployeeDetail
*/
 public void VerifyAlertMessage(String Payworkout,String ExpAlert) throws InterruptedException
 {
  elem = getWebElement(howpayworkout);
  if (elem == null) {
  ExtentReportManager.failStepWithScreenshot(m_Driver, "GetAlert_AnnualtoWeekly", "GetAlert_AnnualtoWeekly failed. Unable to locate object: " + howpayworkout.toString());
  TestModellerLogger.FailStepWithScreenshot(m_Driver, "GetAlert_AnnualtoWeekly", "GetAlert_AnnualtoWeekly failed. Unable to locate object: " + howpayworkout.toString());
  Assert.fail("Unable to locate object: " + howpayworkout.toString());
  }

		Select payrate =  new Select(elem);
	    payrate.selectByVisibleText(Payworkout);
	    Thread.sleep(2000);
	   Alert act = m_Driver.switchTo().alert();
	   String actalert = act.getText();
	   System.out.println("The alert message = "+actalert);
       act.accept();
       
       System.out.println("The expected alert message ="+ExpAlert);
       Assert.assertEquals(actalert,ExpAlert,"Alerts are not matched");
		ExtentReportManager.passStep(m_Driver, "Click_editemplydetail");

		TestModellerLogger.PassStep(m_Driver, "Click_editemplydetail");
	}
 /**
  * VerifyChangeWeekAlert under Pay Details
 * @throws InterruptedException 
 * @throws AWTException 
 * @name Week Rate
 */

 public void VerifyChangeWeekAlert(String ExpMessage) throws InterruptedException, AWTException
 {
	 elem = getWebElement(WeekNewRate); 
	 

 	if (elem == null) {
 	ExtentReportManager.failStepWithScreenshot(m_Driver, "VerifyChangeWeekAlert", "VerifyChangeWeekAlert failed. Unable to locate object: " + WeekNewRate.toString());

 	TestModellerLogger.FailStepWithScreenshot(m_Driver, "VerifyChangeWeekAlert", "VerifyChangeWeekAlert failed. Unable to locate object: " + WeekNewRate.toString());

 		Assert.fail("Unable to locate object: " + WeekNewRate.toString());
 }
 	 elem.click();
 	 elem.clear();
 	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_BACK_SPACE);
	 
	 r.keyPress(KeyEvent.VK_ENTER);
  	Alert ac = m_Driver.switchTo().alert();
	   String actalert = ac.getText();
	   System.out.println("The alert message = "+actalert);
  System.out.println("The expected alert message ="+ExpMessage);
  Assert.assertEquals(actalert,ExpMessage,"Alerts are not matched");

 	ExtentReportManager.passStep(m_Driver, "VerifyChangeWeekAlert");

 	TestModellerLogger.PassStep(m_Driver, "VerifyChangeWeekAlert");
 }

 /**
  * VerifyChangeHourAlert under Pay Details
 * @throws InterruptedException 
 * @throws AWTException 
 * @name Week Rate
 */

 public void VerifyChangeHourAlert(String hr ,String ExpMessage) throws InterruptedException, AWTException
 {
	 elem = getWebElement(HourNewrate); 
	 

 	if (elem == null) {
 	ExtentReportManager.failStepWithScreenshot(m_Driver, "VerifyChangeHourAlert", "VerifyChangeHourAlert failed. Unable to locate object: " + HourNewrate.toString());

 	TestModellerLogger.FailStepWithScreenshot(m_Driver, "VerifyChangeHourAlert", "VerifyChangeHourAlert failed. Unable to locate object: " + HourNewrate.toString());

 		Assert.fail("Unable to locate object: " + HourNewrate.toString());
 }
 for(int i=0;i<10;i++) {
 	elem.sendKeys(Keys.BACK_SPACE);
 	}
 	elem.sendKeys(hr);
 	elem.sendKeys(Keys.TAB);

  	Alert ac = m_Driver.switchTo().alert();
	   String actalert = ac.getText();
	   System.out.println("The alert message = "+actalert);
  System.out.println("The expected alert message ="+ExpMessage);
  Assert.assertEquals(actalert,ExpMessage,"Alerts are not matched");

 	ExtentReportManager.passStep(m_Driver, "VerifyChangeHourAlert");

 	TestModellerLogger.PassStep(m_Driver, "VerifyChangeHourAlert");
 }
 
 /**
  * VerifyChangeDayAlert under Pay Details
 * @throws Exception 
 * @name Week Rate
 */

 public void VerifyChangeDayAlert(String ExpMessage) throws Exception
 {
	 elem = getWebElement(DayNewrate); 
	 

 	if (elem == null) {
 	ExtentReportManager.failStepWithScreenshot(m_Driver, "VerifyChangeDayAlert", "VerifyChangeWeekAlert failed. Unable to locate object: " + DayNewrate.toString());

 	TestModellerLogger.FailStepWithScreenshot(m_Driver, "VerifyChangeDayAlert", "VerifyChangeWeekAlert failed. Unable to locate object: " + DayNewrate.toString());

 		Assert.fail("Unable to locate object: " + DayNewrate.toString());
 }
 	 elem.click();
 	 elem.clear();
 	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_BACK_SPACE);
	 
	 r.keyPress(KeyEvent.VK_ENTER);
  	Alert ac = m_Driver.switchTo().alert();
	   String actalert = ac.getText();
	   
	   System.out.println("The alert message = "+actalert);
  System.out.println("The expected alert message ="+ExpMessage);
  
  
  Assert.assertEquals(actalert,ExpMessage,"Alerts are not matched");

 	ExtentReportManager.passStep(m_Driver, "VerifyChangeDayAlert");

 	TestModellerLogger.PassStep(m_Driver, "VerifyChangeDayAlert");
 }
 
 /**
  * VerifyChangeAnnualAlert under Pay Details
 * @throws InterruptedException 
 * @throws AWTException 
 * @name Week Rate
 */

 public void VerifyChangeAnnualAlert(String ExpMessage) throws InterruptedException, AWTException
 {
	 elem = getWebElement(AnnualNewSal); 
	 

 	if (elem == null) {
 	ExtentReportManager.failStepWithScreenshot(m_Driver, "VerifyChangeAnnualAlert", "VerifyChangeAnnualAlert failed. Unable to locate object: " + AnnualNewSal.toString());

 	TestModellerLogger.FailStepWithScreenshot(m_Driver, "VerifyChangeAnnualAlert", "VerifyChangeAnnualAlert failed. Unable to locate object: " + AnnualNewSal.toString());

 		Assert.fail("Unable to locate object: " + AnnualNewSal.toString());
 }
 	 elem.click();
 	 elem.clear();
 	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_BACK_SPACE);
	 
	 r.keyPress(KeyEvent.VK_ENTER);
  	Alert ac = m_Driver.switchTo().alert();
	   String actalert = ac.getText();
	   
	   System.out.println("The alert message = "+actalert);
  System.out.println("The expected alert message ="+ExpMessage);

  Assert.assertEquals(actalert,ExpMessage,"Alerts are not matched");

 	ExtentReportManager.passStep(m_Driver, "VerifyChangeAnnualAlert");

 	TestModellerLogger.PassStep(m_Driver, "VerifyChangeAnnualAlert");
 }


}
