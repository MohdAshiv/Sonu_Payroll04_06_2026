package EPS;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cc7cc460-6887-4a34-8ffa-a6790e9d64e9
@TestModellerModule(guid = "cc7cc460-6887-4a34-8ffa-a6790e9d64e9")
public class EPSWhenApperentice extends BasePage
{
	double grosssalary;
	String ExpectedDate="01/05/2020";
	String ActualDate="";
	
	public EPSWhenApperentice (WebDriver driver)
	{
		super(driver);
	}


	private By ClickPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");
	
	private By ClickCISSufferedElem = By.xpath("//label[contains(.,'Quarter:')]/../../../../../../../div[3]/div/a[4]");

	private By EnterAmountElem = By.xpath("//label[contains(.,'Jan-2021:')]/../../div[2]/input");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By gotoTaxPaymentElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");
	
	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");
	
	


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=12072")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

   
	/**
	 * Click ClickPayroll
	 * @throws Exception 
    * @name Click ClickPayroll
    */
	public void Click_ClickPayroll() throws Exception
	{
       
		WebElement elem = getWebElement(ClickPayrollElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

			Assert.fail("Unable to locate object: " + ClickPayrollElem.toString());
       }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);
		String grosssalarystr=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[4]")).getText();
		
		System.out.println("grosssalarystr="+grosssalarystr);
		
		String grossSalarynumber=grosssalarystr.replaceAll("[£]", "");
		grossSalarynumber=grossSalarynumber.replaceAll("[,]", "");
		
      	
  		//System.out.println("grossSalarynumber="+grossSalarynumber);
  		double number2 = Double.parseDouble(grossSalarynumber);
  		grosssalary=number2;
  		System.out.println("grosssalary=="+grosssalary);
	
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
		

					
     


		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
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

		elem.click();
		
		//TakeScreenshot.takeScreenshot(m_Driver, "Different FPS for different frequency");
		if(grosssalary>300000)
		{
						int length=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[6]")).size();
						
						for(int i=2;i<=length+1;i++)
						{
							
								String EPSvalue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[5]")).getText();
								//System.out.println("EPS="+EPSvalue);
								
								if(EPSvalue.equalsIgnoreCase("EPS"))
								{
									String Datevalue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();
									System.out.println("Datevalue"+Datevalue);
									ActualDate=Datevalue;
									
									assertNotSame(ActualDate, ExpectedDate);
									ExpectedDate=ActualDate;
									
								}
								
								
								
								System.out.println("ExpectedDate="+ExpectedDate);
								
								//assertEquals(ActualDate, ExpectedDate);
							
						}
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagement");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFilingManagement");
	}

	
	
	
}