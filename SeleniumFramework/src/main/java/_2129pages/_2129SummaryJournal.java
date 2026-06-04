package _2129pages;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a40bd0ca-82dd-4ffb-8742-bc09dd888f25
@TestModellerModule(guid = "a40bd0ca-82dd-4ffb-8742-bc09dd888f25")
public class _2129SummaryJournal extends BasePage
{
	
	static WebElement TransactionNo;
	
	public _2129SummaryJournal (WebDriver driver)
	{
		super(driver);
	}


	
	private By ReportsElem = By.xpath("//A[@href='AdminReports.aspx']");

	private By Wages_JournalAgentElem = By.xpath("//*[@id='Reports']/table/tbody/tr[4]/td/a");

	private By TaxYearElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']");

	private By PayrollDateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollDate']");
	
	private By PayrollDateElem1 = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxMonth']");

	private By _2129_Summary_Elem = By.xpath("//TD[contains(text(),'2129_Summary')]");

	private By click_on_companyAgentLevelElem = By.xpath("//A[@class='linkingwithaccountreport cboxElement el-selection']");

	private By getTotalAtAgent1Elem = By.xpath("//*[starts-with(text(), 'TOTAL')]//following-sibling::td[1]");

	private By getTotalAtAgent2Elem = By.xpath("//*[starts-with(text(), 'TOTAL')]//following-sibling::td[2]");

	private By closepopupElem = By.xpath("//BUTTON[@id='cboxClose']");

	private By JournalsAtDSBElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefJournals']");

	private By ClickOnEyeElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']");

	private By getTotalFromDSB1Elem = By.xpath("//*[starts-with(text(), 'Total')]//following-sibling::td[1]");

	private By getTotalFromDSB2Elem = By.xpath("//*[starts-with(text(), 'Total')]//following-sibling::td[2]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportAccountTranByCompany.aspx?PayrollCompanyCode=15862");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportAccountTranByCompany.aspx?PayrollCompanyCode=15862");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportAccountTranByCompany.aspx?PayrollCompanyCode=15862");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportAccountTranByCompany.aspx?PayrollCompanyCode=15862";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportAccountTranByCompany.aspx?PayrollCompanyCode=15862")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Reports
	 * @throws InterruptedException 
     * @name Click Reports
     */
	public void Click_Reports() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

			Assert.fail("Unable to locate object: " + ReportsElem.toString());
        }

		Thread.sleep(5000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reports");

		TestModellerLogger.PassStep(m_Driver, "Click_Reports");
	}

     
	/**
 	 * Click Wages JournalAgent
     * @name Click Wages JournalAgent
     */
	public void Click_Wages_JournalAgent()
	{
        
		WebElement elem = getWebElement(Wages_JournalAgentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Wages_JournalAgent", "Click_Wages_JournalAgent failed. Unable to locate object: " + Wages_JournalAgentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Wages_JournalAgent", "Click_Wages_JournalAgent failed. Unable to locate object: " + Wages_JournalAgentElem.toString());

			Assert.fail("Unable to locate object: " + Wages_JournalAgentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Wages_JournalAgent");

		TestModellerLogger.PassStep(m_Driver, "Click_Wages_JournalAgent");
	}

    
	/**
 	 * Select TaxYear
     * @name Select TaxYear
     */
    public void Select_TaxYear(String TaxYear)
 	{
 	    
 		WebElement elem = getWebElement(TaxYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_TaxYear", "Select_TaxYear failed. Unable to locate object: " + TaxYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_TaxYear", "Select_TaxYear failed. Unable to locate object: " + TaxYearElem.toString());

 			Assert.fail("Unable to locate object: " + TaxYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(TaxYear);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_TaxYear " + TaxYear);

 		TestModellerLogger.PassStep(m_Driver, "Select_TaxYear " + TaxYear);
 	}

    
	/**
 	 * Select PayrollDate
     * @name Select PayrollDate
     */
    public void Select_PayrollDate(String PayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(PayrollDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PayrollDate", "Select_PayrollDate failed. Unable to locate object: " + PayrollDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PayrollDate", "Select_PayrollDate failed. Unable to locate object: " + PayrollDateElem.toString());

 			Assert.fail("Unable to locate object: " + PayrollDateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PayrollDate " + PayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_PayrollDate " + PayrollDate);
 	}

     
	/**
 	 * Click  2129_Summary 
     * @name Click  2129_Summary 
     */
	public void Click__2129_Summary_()
	{
        
		WebElement elem = getWebElement(_2129_Summary_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__2129_Summary_", "Click__2129_Summary_ failed. Unable to locate object: " + _2129_Summary_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__2129_Summary_", "Click__2129_Summary_ failed. Unable to locate object: " + _2129_Summary_Elem.toString());

			Assert.fail("Unable to locate object: " + _2129_Summary_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__2129_Summary_");

		TestModellerLogger.PassStep(m_Driver, "Click__2129_Summary_");
	}

     
	/**
 	 * Click click on companyAgentLevel
     * @name Click click on companyAgentLevel
     */
	public void Click_click_on_companyAgentLevel()
	{
        
		WebElement elem = getWebElement(click_on_companyAgentLevelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_click_on_companyAgentLevel", "Click_click_on_companyAgentLevel failed. Unable to locate object: " + click_on_companyAgentLevelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_click_on_companyAgentLevel", "Click_click_on_companyAgentLevel failed. Unable to locate object: " + click_on_companyAgentLevelElem.toString());

			Assert.fail("Unable to locate object: " + click_on_companyAgentLevelElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_click_on_companyAgentLevel");

		TestModellerLogger.PassStep(m_Driver, "Click_click_on_companyAgentLevel");
	}

     
	/**
 	 * Click getTotalAtAgent1
     * @name Click getTotalAtAgent1
     */
	public void Click_getTotalAtAgent1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(getTotalAtAgent1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotalAtAgent1", "Click_getTotalAtAgent1 failed. Unable to locate object: " + getTotalAtAgent1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotalAtAgent1", "Click_getTotalAtAgent1 failed. Unable to locate object: " + getTotalAtAgent1Elem.toString());

			Assert.fail("Unable to locate object: " + getTotalAtAgent1Elem.toString());
        }

		System.out.println("Total1AtAgent"+elem.getText());
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getTotalAtAgent1");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotalAtAgent1");
	}

     
	/**
 	 * Click getTotalAtAgent2
     * @name Click getTotalAtAgent2
     */
	public void Click_getTotalAtAgent2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(getTotalAtAgent2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotalAtAgent2", "Click_getTotalAtAgent2 failed. Unable to locate object: " + getTotalAtAgent2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotalAtAgent2", "Click_getTotalAtAgent2 failed. Unable to locate object: " + getTotalAtAgent2Elem.toString());

			Assert.fail("Unable to locate object: " + getTotalAtAgent2Elem.toString());
        }

		System.out.println("Total1AtAgent"+elem.getText());
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getTotalAtAgent2");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotalAtAgent2");
	}

     
	/**
 	 * Click closepopup
     * @name Click closepopup
     */
	public void Click_closepopup()
	{
        
		WebElement elem = getWebElement(closepopupElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_closepopup", "Click_closepopup failed. Unable to locate object: " + closepopupElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_closepopup", "Click_closepopup failed. Unable to locate object: " + closepopupElem.toString());

			Assert.fail("Unable to locate object: " + closepopupElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_closepopup");

		TestModellerLogger.PassStep(m_Driver, "Click_closepopup");
	}

     
	/**
 	 * Click JournalsAtDSB
     * @name Click JournalsAtDSB
     */
	public void Click_JournalsAtDSB()
	{
        
		WebElement elem = getWebElement(JournalsAtDSBElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_JournalsAtDSB", "Click_JournalsAtDSB failed. Unable to locate object: " + JournalsAtDSBElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_JournalsAtDSB", "Click_JournalsAtDSB failed. Unable to locate object: " + JournalsAtDSBElem.toString());

			Assert.fail("Unable to locate object: " + JournalsAtDSBElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_JournalsAtDSB");

		TestModellerLogger.PassStep(m_Driver, "Click_JournalsAtDSB");
	}

     
	/**
 	 * Click ClickOnEye
     * @name Click ClickOnEye
     */
	public void Click_ClickOnEye()
	{
        
		WebElement elem = getWebElement(ClickOnEyeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnEye", "Click_ClickOnEye failed. Unable to locate object: " + ClickOnEyeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnEye", "Click_ClickOnEye failed. Unable to locate object: " + ClickOnEyeElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnEyeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnEye");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnEye");
	}

     
	/**
 	 * Click getTotalFromDSB1
     * @name Click getTotalFromDSB1
     */
	public void Click_getTotalFromDSB1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(getTotalFromDSB1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotalFromDSB1", "Click_getTotalFromDSB1 failed. Unable to locate object: " + getTotalFromDSB1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotalFromDSB1", "Click_getTotalFromDSB1 failed. Unable to locate object: " + getTotalFromDSB1Elem.toString());

			Assert.fail("Unable to locate object: " + getTotalFromDSB1Elem.toString());
        }

		System.out.println("Total1AtAgent"+elem.getText());
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getTotalFromDSB1");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotalFromDSB1");
	}

     
	/**
 	 * Click getTotalFromDSB2
     * @name Click getTotalFromDSB2
     */
	public void Click_getTotalFromDSB2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(getTotalFromDSB2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotalFromDSB2", "Click_getTotalFromDSB2 failed. Unable to locate object: " + getTotalFromDSB2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotalFromDSB2", "Click_getTotalFromDSB2 failed. Unable to locate object: " + getTotalFromDSB2Elem.toString());

			Assert.fail("Unable to locate object: " + getTotalFromDSB2Elem.toString());
        }

		System.out.println("Total1AtAgent"+elem.getText());
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_getTotalFromDSB2");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotalFromDSB2");
	}


	public void CreateTransactionNo(String company) 
	{
		
		List<WebElement> CompanyinJournalReports=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Company')]//following::tr/td[3]"));
		int count=0;
		for(WebElement Company:CompanyinJournalReports)
		{
			count+=1;
			String CompanyName=Company.getText();
			System.out.println("CompanyName="+CompanyName);
			
			
			if(CompanyName.equalsIgnoreCase(company))
			{
				System.out.println("sucess");
				System.out.println("count value="+count);
				m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Company')]//following::tr["+count+"]/td[1]/a")).click();
				
				break;
				
			}
			
		}
		
		
	}


	public void TakeJournalScreenshotAgent() throws Exception {
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
		
		Thread.sleep(1000);
		TakeScreenshot.takeScreenshot(m_Driver, "Journal Report in AgentPage");
		
		m_Driver.switchTo().defaultContent();
		
	}


	public void TakeJournalScreenshotDsb() throws Exception {
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[4]/div/div/div[2]/iframe")));
		
		Thread.sleep(1000);
		TakeScreenshot.takeScreenshot(m_Driver, "Journal Report in PayrollDSBPage");
		
		m_Driver.switchTo().defaultContent();
		
	}


	public void ClickPayeNIonAgent() 
	{
		
				m_Driver.findElement(By.xpath("//*[@id='Reports']/table/tbody/tr[10]/td/a")).click();
				
			
		
	}


	public void TakePayeNIScreenShot() throws Exception {
		
		Thread.sleep(1000);
		TakeScreenshot.takeScreenshot(m_Driver, "Paye_NI on Agent");
		// TODO Auto-generated method stub
		
	}


	public void Select_PayrollDate1(String PayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(PayrollDateElem1);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PayrollDate1", "Select_PayrollDate1 failed. Unable to locate object: " + PayrollDateElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PayrollDate1", "Select_PayrollDate1 failed. Unable to locate object: " + PayrollDateElem1.toString());

 			Assert.fail("Unable to locate object: " + PayrollDateElem1.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PayrollDate1 " + PayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_PayrollDate1 " + PayrollDate);
 	}
}