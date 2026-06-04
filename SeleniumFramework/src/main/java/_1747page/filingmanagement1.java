package _1747page;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.util.List;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/88f20342-ca67-4d75-91ef-9df47489ed68
@TestModellerModule(guid = "88f20342-ca67-4d75-91ef-9df47489ed68")
public class filingmanagement1 extends BasePage
{
	public filingmanagement1 (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By ClickThreeDotElem = By.xpath("//A[@class='report_icon dropdown-toggle']");

	private By SelectLeaverElem = By.xpath("//A[contains(text(),'Leaver')]");

	private By EnterLeavingDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLeavingDate']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoPayroll
     * @name Click gotoPayroll
     */
	public void Click_gotoPayroll()
	{
        
		WebElement elem = getWebElement(gotoPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayroll", "Click_gotoPayroll failed. Unable to locate object: " + gotoPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayroll", "Click_gotoPayroll failed. Unable to locate object: " + gotoPayrollElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayroll");
	}

     
	/**
 	 * Click ClickThreeDot
     * @name Click ClickThreeDot
     */
	public void Click_ClickThreeDot()
	{
        
		WebElement elem = getWebElement(ClickThreeDotElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickThreeDot", "Click_ClickThreeDot failed. Unable to locate object: " + ClickThreeDotElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickThreeDot", "Click_ClickThreeDot failed. Unable to locate object: " + ClickThreeDotElem.toString());

			Assert.fail("Unable to locate object: " + ClickThreeDotElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickThreeDot");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickThreeDot");
	}

     
	/**
 	 * Click SelectLeaver
     * @name Click SelectLeaver
     */
	public void Click_SelectLeaver()
	{
        
		WebElement elem = getWebElement(SelectLeaverElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectLeaver", "Click_SelectLeaver failed. Unable to locate object: " + SelectLeaverElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectLeaver", "Click_SelectLeaver failed. Unable to locate object: " + SelectLeaverElem.toString());

			Assert.fail("Unable to locate object: " + SelectLeaverElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectLeaver");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectLeaver");
	}

      
	/**
 	 * Enter EnterLeavingDate
	 * @throws Exception 
     * @name Enter EnterLeavingDate
     */
 	public void Enter_EnterLeavingDate(String EnterLeavingDate) throws Exception
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(EnterLeavingDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterLeavingDate", "Enter_EnterLeavingDate failed. Unable to locate object: " + EnterLeavingDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterLeavingDate", "Enter_EnterLeavingDate failed. Unable to locate object: " + EnterLeavingDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterLeavingDateElem.toString());
         }

 		elem.sendKeys(EnterLeavingDate);
 		
 	//	m_Driver.switchTo().defaultContent();
 		
	//TakeScreenshot.takeScreenshot(m_Driver, "LeavingDateError");
//		
// 		Thread.sleep(5000);
//		elem.clear();
// 		elem.sendKeys("28/05/2020");
 		
 		
	m_Driver.switchTo().defaultContent();
//		
//		m_Driver.navigate().refresh();
//		elem.sendKeys("28/05/2020");
//		

		
		

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterLeavingDate " + EnterLeavingDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterLeavingDate " + EnterLeavingDate);
 	}

     
	/**
 	 * Click SaveButton
	 * @throws Exception 
	 * @name Click SaveButton
     */
	public void Click_SaveButton() throws Exception
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
//		Thread.sleep(3000);
//		TakeScreenshot.takeScreenshot(m_Driver, "LeavingDateError");
//        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}

     
	/**
 	 * Click RunPayroll1
     * @name Click RunPayroll1
     */
	public void Click_RunPayroll1()
	{
        
		WebElement elem = getWebElement(RunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll1Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
		//m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll\"]")).click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll1");
	}

     
	/**
 	 * Click RunPayroll2
     * @name Click RunPayroll2
     */
	public void Click_RunPayroll2()
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll2Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}

     
	/**
 	 * Click gotoFilingManagement
	 * @throws Exception 
     * @name Click gotoFilingManagement
     */
	public void Click_gotoFilingManagement() throws Exception
	{
        
		WebElement elem = getWebElement(gotoFilingManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFilingManagementElem.toString());
        }

	//	System.out.println("Hi");
		elem.click();
		
//		String str=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr[13]/td[4]")).getText();
//		String str2=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr[15]/td[4]")).getText();
////		System.out.println("str2hello "+str2);
////		System.out.println("strhello "+str);
//		
//		String Expected="?";
//		//int a=Integer.parseInt(Expected);
//	//	System.out.println("This is a "+a);
//		int length=str2.length();
//		//System.out.println("  Hi  "+length);
//		char tic[]=str2.toCharArray();
//		char a=tic[0];
//		int asci=a;
//		int asciNumber=(int)a;
//		int Expected1=10003;
//		System.out.println("Tic ascii "+asciNumber);
//		String Actual=str2;
//		assertEquals(asciNumber, Expected1);
//		
//		TakeScreenshot.takeScreenshot(m_Driver, "FInal EPS Generation");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagement");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFilingManagement");
	}
	
	/**
	 * Verify that EPS is generating only when first payroll and last payroll of the Tax year
	 * 
	 */
	public void verifyEPSgen_1st_last()
	{
		
		List<WebElement> EPSlist=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[5]/div"));
		int len=EPSlist.size();
		for(int i=0;i<len;i++)
		{
			int lastEPS=len-1;
			if(i==1 || i==lastEPS)
			{
				String value1=EPSlist.get(i).getText();
				assertEquals(value1, "EPS","Wrong value, EPS is not generated as expected");
				System.out.println("Value="+value1);
			}
			
			else
			{
				String value2=EPSlist.get(i).getText();
				assertEquals(value2, "FPS","Wrong value, EPS is not generated as expected");
			}
			

		}
		
	}
	
	
	/**
	 * Verify that EPS is generating every month when client having no Employee
	 * 
	 */
	public void verifyEPSgenWhenNoEmp()
	{
		
		List<WebElement> EPSlist=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[5]/div"));
//		int len=EPSlist.size();
//		for(int i=0;i<len;i++)
//		{
//			int lastEPS=len-1;
//			if(i==1 || i==lastEPS)
//			{
		for(WebElement li:EPSlist)
		{
				String value1=li.getText();
				assertEquals(value1, "EPS","Wrong value, EPS is not generated as expected");
				System.out.println("Value="+value1);
		}
//			}
//			
//			else
//			{
//				String value2=EPSlist.get(i).getText();
//				assertEquals(value2, "FPS","Wrong value, EPS is not generated as expected");
//			}
//			
//
//		}
		
	}
	
	
	/**
	 * Verify that EPS is generating  when last payroll of the Tax year is done 
	 * 
	 */
	public void LastPayrollEPS()
	{
		
		List<WebElement> EPSlist=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[5]/div"));
		int len=EPSlist.size();
		for(int i=len;i<=len;i++)
		{
			int lastEPS=len-1;
//			if(i==1 || i==lastEPS)
//			{
				String value1=EPSlist.get(lastEPS).getText();
				assertEquals(value1, "EPS","Wrong value, EPS is not generated when last payroll run");
				System.out.println("Value="+value1);
//			}
//			
//			else
//			{
//				String value2=EPSlist.get(i).getText();
//				assertEquals(value2, "FPS","Wrong value, EPS is not generated as expected");
//			}
			

		}
		
	}
	
	
}