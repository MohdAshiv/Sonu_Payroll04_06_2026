package _1706Page;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7bc0c139-8253-4957-8500-6575091154b7
@TestModellerModule(guid = "7bc0c139-8253-4957-8500-6575091154b7")
public class _1706P11DeductionReport extends BasePage
{
	static float grossvalue;
	static float Taxvalue;
	public _1706P11DeductionReport (WebDriver driver)
	{
		super(driver);
	}


	
	private By getGrossElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[5]");
	
	private By getTaxElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[6]");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickP11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");

	private By scrollToPAYE_Income_TaxElem = By.xpath("//*[contains(text(),'PAYE Income Tax')]");

	//private By scrollToPAYE_Income_TaxElem = By.xpath("//*[contains(text(),'Total for year')]");

	private By MatchDataElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[4]/table/tbody/tr[1]/th[4]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=15456");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=15456");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=15456");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=15456";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=15456")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click getGross
     * @name Click getGross
     */
	public void Click_getGross()
	{
        
		WebElement elem = getWebElement(getGrossElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getGross", "Click_getGross failed. Unable to locate object: " + getGrossElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getGross", "Click_getGross failed. Unable to locate object: " + getGrossElem.toString());

			Assert.fail("Unable to locate object: " + getGrossElem.toString());
        }

		String gross=elem.getText();
		gross=gross.replaceAll("[£]", "");
		gross=gross.replaceAll("[,]", "");
		
		grossvalue=Float.parseFloat(gross);
		System.out.println(grossvalue);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getGross");

		TestModellerLogger.PassStep(m_Driver, "Click_getGross");
	}
	
	
	/**
 	 * Click getTax
     * @name Click getGross
     */
	public void Click_getTax()
	{
        
		WebElement elem = getWebElement(getTaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTax", "Click_getTax failed. Unable to locate object: " + getTaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTax", "Click_getTax failed. Unable to locate object: " + getTaxElem.toString());

			Assert.fail("Unable to locate object: " + getTaxElem.toString());
        }

		String Tax=elem.getText();
		Tax=Tax.replaceAll("[£]", "");
		Tax=Tax.replaceAll("[,]", "");
		
		Taxvalue=Float.parseFloat(Tax);
		System.out.println(Taxvalue);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getTax");

		TestModellerLogger.PassStep(m_Driver, "Click_getTax");
	}

     
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click clickP11
     * @name Click clickP11
     */
	public void Click_clickP11()
	{
        
		WebElement elem = getWebElement(clickP11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP11", "Click_clickP11 failed. Unable to locate object: " + clickP11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP11", "Click_clickP11 failed. Unable to locate object: " + clickP11Elem.toString());

			Assert.fail("Unable to locate object: " + clickP11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP11");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP11");
	}

     
	/**
 	 * Click scrollToPAYE Income Tax
     * @name Click scrollToPAYE Income Tax
     */
	public void Click_scrollToPAYE_Income_Tax()
	{
        
		WebElement elem = getWebElement(scrollToPAYE_Income_TaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_scrollToPAYE_Income_Tax", "Click_scrollToPAYE_Income_Tax failed. Unable to locate object: " + scrollToPAYE_Income_TaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_scrollToPAYE_Income_Tax", "Click_scrollToPAYE_Income_Tax failed. Unable to locate object: " + scrollToPAYE_Income_TaxElem.toString());

			Assert.fail("Unable to locate object: " + scrollToPAYE_Income_TaxElem.toString());
        }

//		elem.click();
		
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_scrollToPAYE_Income_Tax");

		TestModellerLogger.PassStep(m_Driver, "Click_scrollToPAYE_Income_Tax");
	}

     
	/**
 	 * Click MatchData
     * @name Click MatchData
     */
	public void Click_MatchData()
	{
//        
//		WebElement elem = getWebElement(MatchDataElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MatchData", "Click_MatchData failed. Unable to locate object: " + MatchDataElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MatchData", "Click_MatchData failed. Unable to locate object: " + MatchDataElem.toString());
//
//			Assert.fail("Unable to locate object: " + MatchDataElem.toString());
//        }

//		elem.click();
		
	//	int size=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[4]/table/tbody/tr/td[4]")).size();


		System.out.println("xyz");
		int size=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[7]/div/div/div/div/table/tbody/tr/td[4]")).size();

		for(int i=2;i<=size+1;i++)
		{
			
			//String TotalPay=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[4]")).getText();
			
			String TotalPay=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[7]/div/div/div/div/table/tbody/tr["+i+"]/td[4]")).getText();

			TotalPay=TotalPay.replaceAll("[£]", "");
			TotalPay=TotalPay.replaceAll("[,]", "");
			
			float TotalPayAmount=Float.parseFloat(TotalPay);
			int j=i-1;
			float Expected=grossvalue*j;
			//float Expected=grossvalue;

			assertEquals(TotalPayAmount, Expected);
			
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_MatchData");

		TestModellerLogger.PassStep(m_Driver, "Click_MatchData");
	}
	
	
	/**
 	 * Click MatchData
     * @name Click MatchData
     */
	public void Click_MatchDataTotalTaxablePay()
	{
        
//		WebElement elem = getWebElement(MatchDataElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MatchData", "Click_MatchData failed. Unable to locate object: " + MatchDataElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MatchData", "Click_MatchData failed. Unable to locate object: " + MatchDataElem.toString());
//
//			Assert.fail("Unable to locate object: " + MatchDataElem.toString());
//        }

//		elem.click();
		
	//	int size=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[4]/table/tbody/tr/td[6]")).size();
		
		
		int size=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[7]/div/div/div/div/table/tbody/tr/td[6]")).size();

		for(int i=2;i<=size+1;i++)
		{
			
			//String TotalTaxablePay=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[6]")).getText();
			String TotalTaxablePay=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[7]/div/div/div/div/table/tbody/tr["+i+"]/td[6]")).getText();

			TotalTaxablePay=TotalTaxablePay.replaceAll("[£]", "");
			TotalTaxablePay=TotalTaxablePay.replaceAll("[,]", "");
			
			float TotalTaxablePayAmount=Float.parseFloat(TotalTaxablePay);
			int j=i-1;
			float Expected=grossvalue*j;
			
			assertEquals(TotalTaxablePayAmount, Expected);
			
			
			
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_MatchData");

		TestModellerLogger.PassStep(m_Driver, "Click_MatchData");
	}
	
	
	/**
 	 * Click MatchData
     * @name Click MatchData
     */
	public void Click_MatchDataTaxDue()
	{
        
//		WebElement elem = getWebElement(MatchDataElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MatchData", "Click_MatchData failed. Unable to locate object: " + MatchDataElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MatchData", "Click_MatchData failed. Unable to locate object: " + MatchDataElem.toString());
//
//			Assert.fail("Unable to locate object: " + MatchDataElem.toString());
//        }

//		elem.click();
		
	
		
		int size=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[7]/div/div/div/div/table/tbody/tr/td[7]")).size();
		
		System.out.println(size);
		
		for(int i=2;i<=size+1;i++)
		{
			
			//String TotalTaxDue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[7]")).getText();
			String TotalTaxDue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[7]/div/div/div/div/table/tbody/tr["+i+"]/td[7]")).getText();

			TotalTaxDue=TotalTaxDue.replaceAll("[£]", "");
			TotalTaxDue=TotalTaxDue.replaceAll("[,]", "");
			System.out.println(TotalTaxDue);
			float TotalTaxDuevalue=Float.parseFloat(TotalTaxDue);
			int j=i-1;
			float Expected=Taxvalue*j;
			
			assertEquals(TotalTaxDuevalue, Expected);
			
			
			
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_MatchData");

		TestModellerLogger.PassStep(m_Driver, "Click_MatchData");
	}
	
	
	/**
	 * Goto Dashboard
	 * @throws InterruptedException 
	 */
	public void gotoDashboard() throws InterruptedException
	{
		
		WebElement hedder=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']/span"));
		
		jsExec.executeScript("arguments[0].scrollIntoView();", hedder );
		
		
		
		m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']")).click();
		
		Thread.sleep(2000);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']/span")).click();
		
	}
	
	
	/**
	 * Take ScreenShot
	 * @throws Exception 
	 */
	public void TakeScreenshot1() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "P11 Deduction Report");
		
	}
}