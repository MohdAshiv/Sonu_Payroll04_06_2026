package _1747page;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import Quaterly_Paye_Scheme.CIS_With_Enable_PayScheme;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/be536fa3-5262-4481-9953-c2851d0b9b2e
@TestModellerModule(guid = "be536fa3-5262-4481-9953-c2851d0b9b2e")
public class payslip_Blueforfrequency extends BasePage
{
	
//	String ExpectedDate="01/05/2020";
//	String ActualDate="";
	
	static int i;
	
	public payslip_Blueforfrequency (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By gotoEditCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By clickPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By clickPayrollSettingsElem = By.xpath("//A[contains(text(),'Payroll Settings')]");

	private By TemplateColorElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ddlPaySlipTemplate']");

	private By ClickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By ClickPayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By clickReGenerateElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']");

	private By downloadPaySlipElem = By.xpath("//A[@data-original-title='Payslip download']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");
	
	private By gotoTaxPaymentElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");
	
	private By ClickCISSufferedElem = By.xpath("//label[contains(.,'Quarter:')]/../../../../../../../div[3]/div/a[4]");
	
	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickPayroll
     * @name Click ClickPayroll
     */
	public void Click_ClickPayroll()
	{
        
		WebElement elem = getWebElement(ClickPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

			Assert.fail("Unable to locate object: " + ClickPayrollElem.toString());
        }
		
		ClosePopup.ValidateAndPopUp(m_Driver);

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayroll");
	}
	
	
	/**
	 * RunPayroll
	 * @throws InterruptedException 
	 * 
	 */
	public void runPayroll() throws InterruptedException
	{
//		String paydate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[1]")).getAttribute("value");
//		System.out.println("paydate="+paydate);
//		
//		String[] li=paydate.split("-");
//		System.out.println("li"+li[1]);
//		
//		
//		if(li[1]=="01" || li[1]=="02" || li[1]=="03")
//		{
//			int value=Integer.parseInt(li[1]);
//			i=4-value;
//		}
		
		
		for(int i=0;i<4;i++)
		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']")).click();
			Thread.sleep(1000);
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']")).click();
			Thread.sleep(1000);
		}
	}
	
	
	
	/**
	 * RunPayroll
	 * @throws InterruptedException 
	 * 
	 */
	public void runPayroll2() throws InterruptedException
	{

		
		
//		for(int i=0;i<4;i++)
//		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']")).click();
			Thread.sleep(1000);
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']")).click();
			Thread.sleep(1000);
//		}
	}
	
	
	
	/**
	 * RunPayroll
	 * @throws InterruptedException 
	 * 
	 */
	public void runPayroll1() throws InterruptedException
	{
//		String paydate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[1]")).getAttribute("value");
//		System.out.println("paydate="+paydate);
//		
//		String[] li=paydate.split("-");
//		System.out.println("li"+li[1]);
//		
//		
//		if(li[1]=="01" || li[1]=="02" || li[1]=="03")
//		{
//			int value=Integer.parseInt(li[1]);
//			i=4-value;
//		}
		
		
		for(int i=0;i<3;i++)
		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']")).click();
			Thread.sleep(1000);
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']")).click();
			Thread.sleep(1000);
		}
	}
	

     
	/**
 	 * Click gotoEditCompany
     * @name Click gotoEditCompany
     */
	public void Click_gotoEditCompany()
	{
        
		WebElement elem = getWebElement(gotoEditCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoEditCompany", "Click_gotoEditCompany failed. Unable to locate object: " + gotoEditCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoEditCompany", "Click_gotoEditCompany failed. Unable to locate object: " + gotoEditCompanyElem.toString());

			Assert.fail("Unable to locate object: " + gotoEditCompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoEditCompany");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoEditCompany");
	}

     
	/**
 	 * Click clickPayrollDetails
     * @name Click clickPayrollDetails
     */
	public void Click_clickPayrollDetails()
	{
        
		WebElement elem = getWebElement(clickPayrollDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollDetails", "Click_clickPayrollDetails failed. Unable to locate object: " + clickPayrollDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollDetails", "Click_clickPayrollDetails failed. Unable to locate object: " + clickPayrollDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollDetailsElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollDetails");
	}

     
	/**
 	 * Click clickPayrollSettings
	 * @throws Exception 
     * @name Click clickPayrollSettings
     */
	public void Click_clickPayrollSettings() throws Exception
	{
        
		WebElement elem = getWebElement(clickPayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSettingsElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "Weekly pay EMP added to Company");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
	}

    
	/**
 	 * Select TemplateColor
     * @name Select TemplateColor
     */
    public void Select_TemplateColor(String TemplateColor)
 	{
 	    
 		WebElement elem = getWebElement(TemplateColorElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_TemplateColor", "Select_TemplateColor failed. Unable to locate object: " + TemplateColorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_TemplateColor", "Select_TemplateColor failed. Unable to locate object: " + TemplateColorElem.toString());

 			Assert.fail("Unable to locate object: " + TemplateColorElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(TemplateColor);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_TemplateColor " + TemplateColor);

 		TestModellerLogger.PassStep(m_Driver, "Select_TemplateColor " + TemplateColor);
 	}

     
	/**
 	 * Click ClickSave
     * @name Click ClickSave
     */
	public void Click_ClickSave()
	{
        
		WebElement elem = getWebElement(ClickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSave", "Click_ClickSave failed. Unable to locate object: " + ClickSaveElem.toString());

			Assert.fail("Unable to locate object: " + ClickSaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSave");
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

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click ClickPayslips
     * @name Click ClickPayslips
     */
	public void Click_ClickPayslips()
	{
        
		WebElement elem = getWebElement(ClickPayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickPayslips", "Click_ClickPayslips failed. Unable to locate object: " + ClickPayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayslips", "Click_ClickPayslips failed. Unable to locate object: " + ClickPayslipsElem.toString());

			Assert.fail("Unable to locate object: " + ClickPayslipsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayslips");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayslips");
	}

     
	/**
 	 * Click clickRe-Generate
     * @name Click clickRe-Generate
     */
	public void Click_clickReGenerate()
	{
        
		WebElement elem = getWebElement(clickReGenerateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickReGenerate", "Click_clickReGenerate failed. Unable to locate object: " + clickReGenerateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickReGenerate", "Click_clickReGenerate failed. Unable to locate object: " + clickReGenerateElem.toString());

			Assert.fail("Unable to locate object: " + clickReGenerateElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickReGenerate");

		TestModellerLogger.PassStep(m_Driver, "Click_clickReGenerate");
	}

     
	/**
 	 * Click downloadPaySlip
	 * @throws Exception 
     * @name Click downloadPaySlip
     */
	public void Click_downloadPaySlip() throws Exception
	{
        
		WebElement elem = getWebElement(downloadPaySlipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_downloadPaySlip", "Click_downloadPaySlip failed. Unable to locate object: " + downloadPaySlipElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_downloadPaySlip", "Click_downloadPaySlip failed. Unable to locate object: " + downloadPaySlipElem.toString());

			Assert.fail("Unable to locate object: " + downloadPaySlipElem.toString());
        }

		elem.click();
		String winHandleBefore=m_Driver.getWindowHandle();
		ChangeWindow.tabswitch(m_Driver);
		//System.out.println("Blue");
		TakeScreenshot.takeScreenshot(m_Driver, "Blue_Payslip");
		
		m_Driver.switchTo().window(winHandleBefore);
        //  m_Driver.navigate().back();	

		ExtentReportManager.passStep(m_Driver, "Click_downloadPaySlip");

		TestModellerLogger.PassStep(m_Driver, "Click_downloadPaySlip");
	}

     
	/**
 	 * Click gotoPayrollDashboard
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard()
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
	
	
	/**
	 * Click gotoTaxPayment
	 * @throws Exception 
	 * @name Click gotoTaxPayment
    */
	public void Click_gotoTaxPayment() throws Exception
	{
       
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
       }

		elem.click();
		
//		EPS.gototaxPayment CISob=new EPS.gototaxPayment(m_Driver);
//		CISob.Click_ClickCISSuffered();
//		
//		System.out.println("before switch");
//		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUp']/div/div/div[2]/iframe")));
//		
//		System.out.println("after switch");
//		int length=m_Driver.findElements(By.xpath("//*[@disabled='disabled']")).size();
//		System.out.println("Size="+length);
//		
//		m_Driver.switchTo().defaultContent();
//		CISob.Click_clickSave();
//		
//		int j=3;	
//		
//	for(int i=0;i<length;i++)
//	{
//		//Thread.sleep(2000);
//		if(i!=0)
//		{
//		m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']")).click();
//		}
//		Thread.sleep(1000);
//		CISob.Click_ClickCISSuffered();
//		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUp']/div/div/div[2]/iframe")));
//		String str=m_Driver.findElement(By.xpath("//*[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl0"+i+"$txtCISSufferedAmount']")).getAttribute("value");
//		System.out.println("value=="+str);
//		
//		m_Driver.switchTo().defaultContent();
//		CISob.Click_clickSave();
//		
//		CISob.Click_gotoFilingManagement();
//		if(!str.equalsIgnoreCase("0.00"))
//		{
//			
//					i=i+j;
//					System.out.println("value of i="+i);
//					String EPSvalue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[5]")).getText();
//					//System.out.println("EPS="+EPSvalue);
//					
//					assertEquals(EPSvalue, "EPS");
//					if(EPSvalue.equalsIgnoreCase("EPS"))
//					{
//						
//						String Datevalue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();
//						System.out.println("Datevalue"+Datevalue);
//						ActualDate=Datevalue;
//						assertNotSame(ActualDate, ExpectedDate);
//						
//					}
//					i=i-j;
//					j++;
//		}
//					
//					
//					ExpectedDate=ActualDate;
//					System.out.println("ExpectedDate="+ExpectedDate);
//					
//     
//	}

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}
	
	
	/**
 	 * Click ClickCISSuffered
     * @name Click ClickCISSuffered
     */
	public void Click_ClickCISSuffered()
	{
        
		WebElement elem = getWebElement(ClickCISSufferedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickCISSuffered", "Click_ClickCISSuffered failed. Unable to locate object: " + ClickCISSufferedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickCISSuffered", "Click_ClickCISSuffered failed. Unable to locate object: " + ClickCISSufferedElem.toString());

			Assert.fail("Unable to locate object: " + ClickCISSufferedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickCISSuffered");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickCISSuffered");
	}
	
	
	
	/**
	 * Enter CIS Amount
	 * 
	 */
	public void Enter_CIS_Amount(String CISamount)
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUp']/div/div/div[2]/iframe")));
		
		int length=m_Driver.findElements(By.xpath("//*[@disabled='disabled']")).size();
		System.out.println("Size="+length);
		
		m_Driver.findElement(By.xpath("//*[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl0"+length+"$txtCISSufferedAmount']")).clear();
		
		m_Driver.findElement(By.xpath("//*[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl0"+length+"$txtCISSufferedAmount']")).sendKeys(CISamount);
		
		m_Driver.switchTo().defaultContent();
		
		
	}
	
	
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave1() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUp']/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
	
				
		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
	
}