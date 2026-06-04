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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cc7cc460-6887-4a34-8ffa-a6790e9d64e9
@TestModellerModule(guid = "cc7cc460-6887-4a34-8ffa-a6790e9d64e9")
public class EPSWhenCISSuffered extends BasePage
{
	
	String ExpectedDate="01/05/2020";
	String ActualDate="";
	
	public EPSWhenCISSuffered (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickCISSufferedElem = By.xpath("//label[contains(.,'Quarter:')]/../../../../../../../div[3]/div/a[4]");

	private By EnterAmountElem = By.xpath("//label[contains(.,'Jan-2021:')]/../../div[2]/input");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By gotoTaxPaymentElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");
	
	


	
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
		
		Thread.sleep(2000);
		EPS.gototaxPayment CISob=new EPS.gototaxPayment(m_Driver);
		CISob.Click_ClickCISSuffered();
		
		System.out.println("before switch");
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUp']/div/div/div[2]/iframe")));
		
		System.out.println("after switch");
		int length=m_Driver.findElements(By.xpath("//*[@disabled='disabled']")).size();
		System.out.println("Size="+length);
		
		m_Driver.switchTo().defaultContent();
		CISob.Click_clickSave();
		
		int j=3;	
		
	for(int i=0;i<length;i++)
	{
		//Thread.sleep(2000);
		if(i!=0)
		{
		m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']")).click();
		}
		Thread.sleep(1000);
		CISob.Click_ClickCISSuffered();
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUp']/div/div/div[2]/iframe")));
		String str=m_Driver.findElement(By.xpath("//*[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayRecords$ctl0"+i+"$txtCISSufferedAmount']")).getAttribute("value");
		System.out.println("value=="+str);
		
		m_Driver.switchTo().defaultContent();
		CISob.Click_clickSave();
		
		CISob.Click_gotoFilingManagement();
		if(!str.equalsIgnoreCase("0.00"))
		{
			
					i=i+j;
					System.out.println("value of i="+i);
					String EPSvalue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[5]")).getText();
					//System.out.println("EPS="+EPSvalue);
					
					assertEquals(EPSvalue, "EPS");
					if(EPSvalue.equalsIgnoreCase("EPS"))
					{
						
						String Datevalue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();
						System.out.println("Datevalue"+Datevalue);
						ActualDate=Datevalue;
						assertNotSame(ActualDate, ExpectedDate);
						
					}
					i=i-j;
					j++;
		}
					
					
					ExpectedDate=ActualDate;
					System.out.println("ExpectedDate="+ExpectedDate);
					
     
	}

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}
   
     
	

	
	
	
}