package _5438_EmployerAllowancesDisable_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.WaitUtility;
import utilities.reports.ExtentReportManager;

public class EmployerAllowancePage extends BasePage {

	public EmployerAllowancePage(WebDriver driver) {
		super(driver);
		
	}

	private By NiLiablitiesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlNi']");
	
	private By eAInputTextElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEmployerNIAllowance']");

	private By epsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']");			
	
	private By lastEpsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl07_lnkTaxReturnType']");			

	private By lastEps1Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl05_lnkTaxReturnType']");			

	private By epsElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']");			

	private By epsJulyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl04_lnkTaxReturnType']");			

	private By epsJulyElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_lnkTaxReturnType']");			

	private By epsJuneElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_lnkTaxReturnType']");
	
	private By epsMayElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_lnkTaxReturnType']");
	private By epsweek29Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl18_lnkTaxReturnType']");

	private By JournalEntryelem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefJournals']");
	
	private By wagesJournalElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl06_lnkPopup']");
	
	private By marchEPS= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl12_lnkTaxReturnType']");

	private By undofornightlyEps= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl09_lnkTaxReturnType']");

	private By epsDec= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl09_lnkTaxReturnType']");

	private By fourWeeklyUndoEps= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_lnkTaxReturnType']");

	public void selectNiLiablitiesOptions(String data) throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EmploymentAllowanceEnableFrame']")));
  
		WebElement elem = getWebElement(NiLiablitiesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectNiLiablitiesOptions", "selectNiLiablitiesOptions failed. Unable to locate object: " + NiLiablitiesElem.toString());


			Assert.fail("Unable to locate object: " + NiLiablitiesElem.toString());
        }

		Select sel = new Select(elem);
		sel.selectByVisibleText(data);
		
		Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
		
		Reporter.log("selectNiLiablitiesOptions");

	}
	
	

	public void enterEmployementAllowance(String data) throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EmploymentAllowanceEnableFrame']")));
  
		WebElement elem = getWebElement(eAInputTextElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterEmployementAllowance", "enterEmployementAllowance failed. Unable to locate object: " + eAInputTextElem.toString());


			Assert.fail("Unable to locate object: " + eAInputTextElem.toString());
        }

		elem.clear();
		elem.sendKeys(data);
		Thread.sleep(2000);
		m_Driver.switchTo().defaultContent();
		
		Reporter.log("enterEmployementAllowance");

	}
	
	public void clickAprilEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEps", "clickEps failed. Unable to locate object: " + epsElem.toString());


			Assert.fail("Unable to locate object: " + epsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		
	

		Reporter.log("clickEps");
	}
	
	
	
	
	public void clickLastEps() throws Exception
	{
        
		WebElement elem = getWebElement(lastEpsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEps", "clickEps failed. Unable to locate object: " + lastEpsElem.toString());


			Assert.fail("Unable to locate object: " + lastEpsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "lastEpsElem");
          	

		ExtentReportManager.passStep(m_Driver, "clickLastEps");

		Reporter.log("clickLastEps");
	}
	
	
	public void clickLast1Eps() throws Exception
	{
        
		WebElement elem = getWebElement(lastEps1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLast1Eps", "clickLast1Eps failed. Unable to locate object: " + lastEps1Elem.toString());


			Assert.fail("Unable to locate object: " + lastEps1Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickLast1Eps");
          	
		ExtentReportManager.passStep(m_Driver, "clickLast1Eps");

		Reporter.log("clickLast1Eps");
	}
	
	
	WaitUtility wt =new WaitUtility();
	
	public void clickEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEps", "clickEps failed. Unable to locate object: " + epsElem.toString());


			Assert.fail("Unable to locate object: " + epsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "epsElem");
          	

		ExtentReportManager.passStep(m_Driver, "epsElem");

		Reporter.log("clickEps");
	}
	
	
	
	
	
	public void clickJulyEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsJulyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEps", "clickEps failed. Unable to locate object: " + epsElem.toString());


			Assert.fail("Unable to locate object: " + epsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "epsElem");
          	

		ExtentReportManager.passStep(m_Driver, "epsElem");

		Reporter.log("clickEps");
	}
	
	public void clickMarchEps() throws Exception
	{
        
		WebElement elem = getWebElement(marchEPS);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMarchEps", "clickMarchEps failed. Unable to locate object: " + marchEPS.toString());


			Assert.fail("Unable to locate object: " + marchEPS.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickMarchEps");

		ExtentReportManager.passStep(m_Driver, "clickMarchEps");

		Reporter.log("clickMarchEps");
	}
	

	
	public void clickJulyEps1() throws Exception
	{
        
		WebElement elem = getWebElement(epsJulyElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickJulyEps1", "clickJulyEps1 failed. Unable to locate object: " + epsJulyElem1.toString());


			Assert.fail("Unable to locate object: " + epsJulyElem1.toString());
        }

		
		
		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickJulyEps1");
          	

		ExtentReportManager.passStep(m_Driver, "clickJulyEps1");

		Reporter.log("clickEps");
	}
	
	

	
	
	public void clickJuneEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsJuneElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickJuneEps", "clickJuneEps failed. Unable to locate object: " + epsJuneElem.toString());


			Assert.fail("Unable to locate object: " + epsJuneElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickJuneEps");
          	

		ExtentReportManager.passStep(m_Driver, "clickJuneEps");

		Reporter.log("clickJuneEps");
	}
	
	
	

	public void clickMayEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsMayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMayEps", "clickMayEps failed. Unable to locate object: " + epsMayElem.toString());


			Assert.fail("Unable to locate object: " + epsMayElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickMayEps");
          	

		ExtentReportManager.passStep(m_Driver, "clickMayEps");

		Reporter.log("clickMayEps");
	}
	
	
	

	public void clicklastweekEps() throws Exception
	{
        
		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_PageUC1_rptrPager_ctl03_liContainer']"));
		elem1.click();
		Thread.sleep(3000);
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_lnkTaxReturnType']"));

		

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickMayEps");
          	

		ExtentReportManager.passStep(m_Driver, "clickMayEps");

		Reporter.log("clicklastweekEps");
	}
	
	public void clickFornightlyUndEps() throws Exception
	{
        
		WebElement elem = getWebElement(undofornightlyEps);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickFornightlyUndEps", "clickMayEps failed. Unable to locate object: " + undofornightlyEps.toString());


			Assert.fail("Unable to locate object: " + undofornightlyEps.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickFornightlyUndEps");
          	

		ExtentReportManager.passStep(m_Driver, "clickFornightlyUndEps");

		Reporter.log("clickFornightlyUndEps");
	}
	
	public void click29WeekEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsweek29Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click29WeekEps", "click29WeekEps failed. Unable to locate object: " + epsweek29Elem.toString());


			Assert.fail("Unable to locate object: " + epsweek29Elem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "click29WeekEps");
          	

		ExtentReportManager.passStep(m_Driver, "click29WeekEps");

		Reporter.log("click29WeekEps");
	}
	
	
	public void clickDecEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsDec);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDecEps", "clickDecEps failed. Unable to locate object: " + epsDec.toString());


			Assert.fail("Unable to locate object: " + epsDec.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickDecEps");
          	

		ExtentReportManager.passStep(m_Driver, "clickDecEps");

		Reporter.log("clickDecEps");
	}
	
	
	public void clickFourWeeklyEps() throws Exception
	{
        
		WebElement elem = getWebElement(fourWeeklyUndoEps);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickFourWeeklyEps", "clickFourWeeklyEps failed. Unable to locate object: " + fourWeeklyUndoEps.toString());


			Assert.fail("Unable to locate object: " + fourWeeklyUndoEps.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickFourWeeklyEps");
          	

		ExtentReportManager.passStep(m_Driver, "clickFourWeeklyEps");

		Reporter.log("clickFourWeeklyEps");
	}
	
	
	public void clickJournalEntry() throws Exception
	{
        
		WebElement elem = getWebElement(JournalEntryelem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickJournalEntry", "clickJournalEntry failed. Unable to locate object: " + JournalEntryelem.toString());


			Assert.fail("Unable to locate object: " + JournalEntryelem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickJournalEntry");
          	

		ExtentReportManager.passStep(m_Driver, "clickJournalEntry");

		Reporter.log("clickJournalEntry");
	}
	
	

	public void clickWagesJournal() throws Exception
	{
      
		WebElement elem = getWebElement(wagesJournalElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickWagesElem", "clickWagesElem failed. Unable to locate object: " + wagesJournalElem.toString());


			Assert.fail("Unable to locate object: " + wagesJournalElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickWagesElem");
          	
		ExtentReportManager.passStep(m_Driver, "clickWagesElem");
	}
	
	
}
	
	
	


