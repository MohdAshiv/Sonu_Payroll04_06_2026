package frequency;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/be536fa3-5262-4481-9953-c2851d0b9b2e
@TestModellerModule(guid = "be536fa3-5262-4481-9953-c2851d0b9b2e")
public class getfrequencylist extends BasePage
{
	static String[] frequencyName;
	
	public getfrequencylist (WebDriver driver)
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

		elem.click();
		ChangeWindow.tabswitch(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayroll");
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
		
		int payfrequencylistsize=m_Driver.findElements(By.xpath("//*[@onchange='SortDiv(this);' and @style='display: block;']")).size();
		System.out.println("length "+payfrequencylistsize);
		 frequencyName=new String[payfrequencylistsize];
		for(int i=1;i<=payfrequencylistsize; i++)
		{
			//System.out.println("i value in for loop"+i);
			frequencyName[i-1]=m_Driver.findElement(By.xpath("(//*[@onchange='SortDiv(this);' and @style='display: block;'])["+i+"]")).getAttribute("value");
			System.out.println("str  = "+frequencyName[i-1]);
			
		}
//		for(WebElement dd:payfrequencylist)
//		{
//			String out=dd.getAttribute("value");
//			//System.out.println(out);
//			String[] FrequencyName=out.split(":");
//			System.out.println("hi  = "+FrequencyName);
//		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
		
	}
	
	
//	public  String[] getfreq() throws Exception
//	{
//		String[] getvalue;
//		getvalue=Click_clickPayrollSettings();
//		for(int j=0;j<getvalue.length;j++)
//		{
//		System.out.println("....."+getvalue);
//		}
//		return null;
//		
//		
//	}

    
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
//		for(int j=0; j<=4; j++)
//		{
		int lengthofString=frequencyName.length;
		
		System.out.println("lengthofString =="+lengthofString);
		
		for(int k=0;k<=frequencyName.length-1;k++)
		{
			System.out.println("frequencyName+++=="+frequencyName[k]);
		}
		int[] counter=new int[frequencyName.length];
		for(int h=0;h<frequencyName.length;h++)
		{
			counter[h]=0;
		}
		int weeklycount=0;
		int monthlycount=0;
		int annuallycount=0;
		int fortnightlycount=0;
		int fourweeklycount=0;
		for(int p=0; p<=4;p++)
		{
			 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']")).click();
			 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']")).click();
				String visiblefrequency=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div[1]/div[1]/h5/div/div[3]/strong/i")).getText();
				
				visiblefrequency=visiblefrequency.replaceAll("[,]", "");
				visiblefrequency=visiblefrequency.replaceAll("[&]", "");
				String[] visiblefrequency1=visiblefrequency.split(" ");
				int value=visiblefrequency1.length;
//				System.out.println("Value "+value);
				
				for(int k=0;k<visiblefrequency1.length;k++)
				{
//					System.out.println("Value of k "+k);
//					System.out.println("visiblefrequency "+visiblefrequency1[k]);
					if(visiblefrequency1[k].equalsIgnoreCase("Weekly"))
					{
						weeklycount=1;
						System.out.println("This is weekly");
					}
					else if(visiblefrequency1[k].equalsIgnoreCase("Monthly"))
					{
						monthlycount=1;
						System.out.println("This is Monthly");
					}
					else if(visiblefrequency1[k].equalsIgnoreCase("Annually"))
					{
						annuallycount=1;
						System.out.println("This is Anually");
					}
					else if(visiblefrequency1[k].equalsIgnoreCase("Fortnightly"))
					{
						fortnightlycount=1;
						System.out.println("This is Fortnightly");
					}
					else if(visiblefrequency1[k].equalsIgnoreCase("Fourweekly"))
					{
						fourweeklycount=1;
						System.out.println("This is Fourweekly");
					}
				}
//				int sum=weeklycount+monthlycount+annuallycount+fortnightlycount+fourweeklycount;
//				System.out.println("Sum="+sum);
				
//				for(int a=0;a<frequencyName.length;a++)
//				{
//					for(int b=0;b<visiblefrequency1.length;b++)
//					{
//						if(frequencyName[0].equalsIgnoreCase(visiblefrequency1[b]))
//						{
//							counter[a]+=1;
//							System.out.println("no of count="+counter[a]);
//						}
//					}
//				}
				
		}	
		int sum=weeklycount+monthlycount+annuallycount+fortnightlycount+fourweeklycount;
		System.out.println("Sum="+sum);
		
		int Actualcount=sum;
		int Expectedcount=lengthofString;
		assertEquals(Actualcount, Expectedcount);
//		for(int c=0;c<frequencyName.length;c++)
//		{
//			if(counter[c]==0)
//			{
//				assertEquals(c, 1);
//			}
//		}

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
}