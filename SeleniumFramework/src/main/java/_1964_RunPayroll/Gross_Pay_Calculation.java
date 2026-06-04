package _1964_RunPayroll;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d2be9dcb-f267-4248-b2f0-4b1ca61c1f9a
@TestModellerModule(guid = "d2be9dcb-f267-4248-b2f0-4b1ca61c1f9a")
public class Gross_Pay_Calculation extends BasePage
{
//	static List<WebElement> list1=new ArrayList<WebElement>();
//	static List<String> str1=new ArrayList<String>();
//	static float[] gross;
//	float TotalgrossPayatDashboard=0;
//	float ActualGros=0;
	public Gross_Pay_Calculation (WebDriver driver)
	{
		super(driver);
	}


	
	private By EE_GrossPayElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header");

	private By clickRun_Payroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By clickRun_Payroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");
	
	private By PayslipsclickElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By clickPayroll_Reporting_Period_SummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportPeriodTotal']");

	private By getTotalBasicPayElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/div/div/div/div/table/tbody/tr[12]/td[4]");
	
	private By clickEmployerViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By clickERDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployerDashboard']");

	private By clickERReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployerDashboardReports']");

	private By clickERPayslipsElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployerDashboardReports']");

	


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12196");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12196");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12196");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12196";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPeriodTotal.aspx?PayrollCompanyCode=12196")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click EE_GrossPay
     * @name Click EE_GrossPay
     */
	public void Click_EE_GrossPay()
	{
        
		WebElement elem = getWebElement(EE_GrossPayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EE_GrossPay", "Click_EE_GrossPay failed. Unable to locate object: " + EE_GrossPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EE_GrossPay", "Click_EE_GrossPay failed. Unable to locate object: " + EE_GrossPayElem.toString());

			Assert.fail("Unable to locate object: " + EE_GrossPayElem.toString());
        }

		elem.click();
		
//		int Tablelength=m_Driver.findElements(By.xpath("//tbody/tr/td[4]")).size();
		
//		 list1=m_Driver.findElements(By.xpath("//tbody/tr/td[4]"));
//		 
//		 
//		 
//		 int list1Size=list1.size();
//		 
//		 System.out.println("Dashboard table="+list1Size);
//		 
//		 for(WebElement l3:list1)
//		 {
//			 String str3=l3.getText();
//			 
//			 System.out.println(str3);
//			 
//			 str1.add(str3);
//			 
//			 
//			 
//		 }
//		 
//		 for(String s1:str1)
//		 {
//			 System.out.println("String of list1="+s1);
//		 }
//		
//		
		
		
//		float[] EmpGross=new float[Tablelength];
//		
//		for(int i=2;i<=Tablelength+1;i++)
//		{
//			int j=i-2;
//			String EEgrossPay=m_Driver.findElement(By.xpath("//tbody/tr["+i+"]/td[4]")).getText();
//			EEgrossPay=EEgrossPay.replaceAll("[£]", "");
//			EEgrossPay=EEgrossPay.replaceAll("[,]", "");
//			
//			float EEgrossPayvalue=Float.parseFloat(EEgrossPay);
//			
//			EmpGross[j]=EEgrossPayvalue;
//			System.out.println("+++"+EmpGross[j]);
//			
//			 gross =new float[Tablelength];
//			gross[j]=EmpGross[j];
//			
//			System.out.println("==="+gross[j]);
//			
//			TotalgrossPayatDashboard=TotalgrossPayatDashboard+EEgrossPayvalue;
//			
//			
//		}
//		
//		System.out.println("TotalgrossPayatDashboard="+TotalgrossPayatDashboard);

		ExtentReportManager.passStep(m_Driver, "Click_EE_GrossPay");

		TestModellerLogger.PassStep(m_Driver, "Click_EE_GrossPay");
	}

     
	/**
 	 * Click clickRun Payroll1
	 * @throws Exception 
     * @name Click clickRun Payroll1
     */
	public void Click_clickRun_Payroll1() throws Exception
	{
        
		WebElement elem = getWebElement(clickRun_Payroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickRun_Payroll1", "Click_clickRun_Payroll1 failed. Unable to locate object: " + clickRun_Payroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickRun_Payroll1", "Click_clickRun_Payroll1 failed. Unable to locate object: " + clickRun_Payroll1Elem.toString());

			Assert.fail("Unable to locate object: " + clickRun_Payroll1Elem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "Payroll Over due");
		
		
		String Expected="Over-due pay";
		
		String Actual=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tblheading']")).getText();
		
		System.out.println("Actual="+Actual);
		
		assertTrue(Actual.contains(Expected));
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickRun_Payroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_clickRun_Payroll1");
	}
	
	
	
	/**
 	 * Click clickRun Payroll1
	 * @throws Exception 
     * @name Click clickRun Payroll1
     */
	public void Click_clickRun_Payroll1B() throws Exception
	{
        
		WebElement elem = getWebElement(clickRun_Payroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickRun_Payroll1", "Click_clickRun_Payroll1 failed. Unable to locate object: " + clickRun_Payroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickRun_Payroll1", "Click_clickRun_Payroll1 failed. Unable to locate object: " + clickRun_Payroll1Elem.toString());

			Assert.fail("Unable to locate object: " + clickRun_Payroll1Elem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "Payroll date");
		
		
		String Expected="Due pay date";
		
		String Actual=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tblheading']")).getText();
		
		System.out.println("Actual="+Actual);
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickRun_Payroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_clickRun_Payroll1");
	}

     
	/**
 	 * Click clickRun Payroll2
     * @name Click clickRun Payroll2
     */
	public void Click_clickRun_Payroll2()
	{
        
		WebElement elem = getWebElement(clickRun_Payroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickRun_Payroll2", "Click_clickRun_Payroll2 failed. Unable to locate object: " + clickRun_Payroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickRun_Payroll2", "Click_clickRun_Payroll2 failed. Unable to locate object: " + clickRun_Payroll2Elem.toString());

			Assert.fail("Unable to locate object: " + clickRun_Payroll2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickRun_Payroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_clickRun_Payroll2");
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
 	 * Click Payslipsclick
	 * @throws Exception 
     * @name Click Payslipsclick
     */
	public void Click_Payslipsclick() throws Exception
	{
        
		WebElement elem = getWebElement(PayslipsclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payslipsclick", "Click_Payslipsclick failed. Unable to locate object: " + PayslipsclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payslipsclick", "Click_Payslipsclick failed. Unable to locate object: " + PayslipsclickElem.toString());

			Assert.fail("Unable to locate object: " + PayslipsclickElem.toString());
        }
	//	System.out.println("HelloPayslip");

		elem.click();
	//	TakeScreenshot.takeScreenshot(m_Driver, "PayslipClick");
		
		
		
//		int len=m_Driver.findElements(By.xpath("//main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr/td[8]")).size();
		
//		List<WebElement> list2=m_Driver.findElements(By.xpath("//main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr/td[8]"));
//		 
//		 int list1Size2=list2.size();
//		 
//		 System.out.println("Dashboard table2="+list1Size2);
//		 
//		 for(WebElement l2:list2)
//		 {
//			 String str2=l2.getText();
//			 System.out.println(str2+"=str2");
//		 }
//		
//		 int length=list1.size();
//		 System.out.println("length="+length);
//		 for(String s1:str1)
//		 {
//		//	 System.out.println("Hello");
//		//	 String str1=list1.get(0).getText();
//		//	 String str1=s1.getText();
//			 System.out.println("str1=="+s1);
//		 }
//		 
//		
//		 
////		 boolean isEqual = list1.equals(list2);
////	        System.out.println(isEqual);
//		
//		 int i=0;
//		 for(WebElement l2:list2)
//		 {
//		//	System.out.println(l2);
//			 String d1=l2.getText();
//	//		 for(WebElement l2:list2)
//	//		 {
//				 String d2=str1.get(i);
//				 System.out.println(d1+"=="+d2);
//				 assertEquals(d1, d2, "String not match");
//				 
//				 i++;
//				 
////				 System.out.println("d1="+d1);
////				 System.out.println("d2="+d2);
////				 assertEquals(d2, d1);
////				 i++;
////				 System.out.println("value of i="+i);
////				 break;
////				 
////				 if(d1.equalsIgnoreCase(d2))
////				 {
////					 
////				 }
//			
//		 }
		
	
		
//		float[] grossarr=new float[len];
//		
//		for(int i=2;i<=len+1;i++)
//		{
//			int j=i-2;
//			
//			String GrossinReport=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr["+i+"]/td[8]")).getText();
//			GrossinReport=GrossinReport.replaceAll("[£]", "");
//			GrossinReport=GrossinReport.replaceAll("[,]", "");
//			
//			float grossPayvalueinTax=Float.parseFloat(GrossinReport);
//			grossarr[i-2]=grossPayvalueinTax;
//			
//			System.out.println("...."+grossarr[j]);
//			System.out.println(",,,,"+gross[j]);
//			assertEquals(grossarr[j], gross[j]);
//			
//		}
//          	

		ExtentReportManager.passStep(m_Driver, "Click_Payslipsclick");

		TestModellerLogger.PassStep(m_Driver, "Click_Payslipsclick");
	}
	
     
	/**
 	 * Click clickPayroll Reporting Period Summary
     * @name Click clickPayroll Reporting Period Summary
     */
	public void Click_clickPayroll_Reporting_Period_Summary()
	{
        
		WebElement elem = getWebElement(clickPayroll_Reporting_Period_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayroll_Reporting_Period_Summary", "Click_clickPayroll_Reporting_Period_Summary failed. Unable to locate object: " + clickPayroll_Reporting_Period_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayroll_Reporting_Period_Summary", "Click_clickPayroll_Reporting_Period_Summary failed. Unable to locate object: " + clickPayroll_Reporting_Period_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + clickPayroll_Reporting_Period_SummaryElem.toString());
        }

		elem.click();
		
		
			
//			String Grosspay=m_Driver.findElement(By.xpath("//table/tbody/tr[14]/td[4]")).getText();
//			Grosspay=Grosspay.replaceAll("[£]", "");
//			Grosspay=Grosspay.replaceAll("[,]", "");
//			
//			ActualGros=Float.parseFloat(Grosspay);
//			
//		
//          	
//		assertEquals(ActualGros, TotalgrossPayatDashboard);

		ExtentReportManager.passStep(m_Driver, "Click_clickPayroll_Reporting_Period_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayroll_Reporting_Period_Summary");
	}

     
	/**
 	 * Click getTotalBasicPay
     * @name Click getTotalBasicPay
     */
	public void Click_getTotalBasicPay()
	{
        
		WebElement elem = getWebElement(getTotalBasicPayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getTotalBasicPay", "Click_getTotalBasicPay failed. Unable to locate object: " + getTotalBasicPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getTotalBasicPay", "Click_getTotalBasicPay failed. Unable to locate object: " + getTotalBasicPayElem.toString());

			Assert.fail("Unable to locate object: " + getTotalBasicPayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_getTotalBasicPay");

		TestModellerLogger.PassStep(m_Driver, "Click_getTotalBasicPay");
	}
	
	
	
	/**
 	 * Click clickEmployerView
     * @name Click clickEmployerView
     */
	public void Click_clickEmployerView()
	{
        
		WebElement elem = getWebElement(clickEmployerViewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEmployerView", "Click_clickEmployerView failed. Unable to locate object: " + clickEmployerViewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEmployerView", "Click_clickEmployerView failed. Unable to locate object: " + clickEmployerViewElem.toString());

			Assert.fail("Unable to locate object: " + clickEmployerViewElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEmployerView");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEmployerView");
	}

     
	/**
 	 * Click clickERDashboard
	 * @throws InterruptedException 
     * @name Click clickERDashboard
     */
	public void Click_clickERDashboard() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickERDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickERDashboard", "Click_clickERDashboard failed. Unable to locate object: " + clickERDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickERDashboard", "Click_clickERDashboard failed. Unable to locate object: " + clickERDashboardElem.toString());

			Assert.fail("Unable to locate object: " + clickERDashboardElem.toString());
        }

		elem.click();
		
		Thread.sleep(1000);
		
		
//		List<WebElement> list3=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[4]"));
//		 
//		 int list1Size3=list3.size();
//		 
//		 System.out.println("Dashboard table3="+list1Size3);
//		 
//		 for(WebElement l3:list3)
//		 {
//			 String str3=l3.getText();
//			 System.out.println(str3+"=str3");
//		 }
//		
//		 int length=list1.size();
//		 System.out.println("length="+length);
//		 for(String s1:str1)
//		 {
//		//	 System.out.println("Hello");
//		//	 String str1=list1.get(0).getText();
//		//	 String str1=s1.getText();
//			 System.out.println("str1=="+s1);
//		 }
//		 
//		
//		 
////		 boolean isEqual = list1.equals(list2);
////	        System.out.println(isEqual);
//		
//		 int i=0;
//		 for(WebElement l3:list3)
//		 {
//		//	System.out.println(l2);
//			 String d1=l3.getText();
//	//		 for(WebElement l2:list2)
//	//		 {
//				 String d2=str1.get(i);
//				 System.out.println(d1+"=="+d2);
//				 assertEquals(d1, d2, "String not match");
//				 
//				 i++;
//				 
//
//			
//		 }
//          	

		ExtentReportManager.passStep(m_Driver, "Click_clickERDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_clickERDashboard");
	}

     
	/**
 	 * Click clickERReports
     * @name Click clickERReports
     */
	public void Click_clickERReports()
	{
        
		WebElement elem = getWebElement(clickERReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickERReports", "Click_clickERReports failed. Unable to locate object: " + clickERReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickERReports", "Click_clickERReports failed. Unable to locate object: " + clickERReportsElem.toString());

			Assert.fail("Unable to locate object: " + clickERReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickERReports");

		TestModellerLogger.PassStep(m_Driver, "Click_clickERReports");
	}

     
	/**
 	 * Click clickERPayslips
	 * @throws InterruptedException 
     * @name Click clickERPayslips
     */
	public void Click_clickERPayslips() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickERPayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickERPayslips", "Click_clickERPayslips failed. Unable to locate object: " + clickERPayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickERPayslips", "Click_clickERPayslips failed. Unable to locate object: " + clickERPayslipsElem.toString());

			Assert.fail("Unable to locate object: " + clickERPayslipsElem.toString());
        }

		elem.click();
		
		Thread.sleep(1000);
		
		
//		List<WebElement> list4=m_Driver.findElements(By.xpath("//*[@id='myTable2']/tbody/tr/td[8]"));
//		 
//		 int list1Size4=list4.size();
//		 
//		 System.out.println("Dashboard table4="+list1Size4);
//		 
//		 for(WebElement l4:list4)
//		 {
//			 String str4=l4.getText();
//			 System.out.println(str4+"=str4");
//		 }
//		
//		 int length=list1.size();
//		 System.out.println("length="+length);
//		 for(String s1:str1)
//		 {
//		//	 System.out.println("Hello");
//		//	 String str1=list1.get(0).getText();
//		//	 String str1=s1.getText();
//			 System.out.println("str1=="+s1);
//		 }
//		 
//		
//		 
////		 boolean isEqual = list1.equals(list2);
////	        System.out.println(isEqual);
//		
//		 int i=0;
//		 for(WebElement l4:list4)
//		 {
//		//	System.out.println(l2);
//			 String d1=l4.getText();
//	//		 for(WebElement l2:list2)
//	//		 {
//				 String d2=str1.get(i);
//				 System.out.println(d1+"=="+d2);
//				 assertEquals(d1, d2, "String not match");
//				 
//				 i++;
//				 
//
//			
//		 }
//          	

		ExtentReportManager.passStep(m_Driver, "Click_clickERPayslips");

		TestModellerLogger.PassStep(m_Driver, "Click_clickERPayslips");
	}
}