package _2129pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/931d0ac3-68d2-41ec-aa25-ed4c48035e7b
@TestModellerModule(guid = "931d0ac3-68d2-41ec-aa25-ed4c48035e7b")
public class TaxPayment extends BasePage
{
	
	double TotalAmountDue=0;
	double ActualAmountDue=0;
	
	public TaxPayment (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Tax_Payment_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");

	private By Amount_due_to_HMRCElem = By.xpath("//TD[contains(text(),'Amount due to HMRC')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=15862");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=15862");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=15862");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=15862";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=15862")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Tax Payment 
     * @name Click  Tax Payment 
     */
	public void Click__Tax_Payment_()
	{
        
		WebElement elem = getWebElement(_Tax_Payment_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Tax_Payment_", "Click__Tax_Payment_ failed. Unable to locate object: " + _Tax_Payment_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Tax_Payment_", "Click__Tax_Payment_ failed. Unable to locate object: " + _Tax_Payment_Elem.toString());

			Assert.fail("Unable to locate object: " + _Tax_Payment_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Tax_Payment_");

		TestModellerLogger.PassStep(m_Driver, "Click__Tax_Payment_");
	}

     
	/**
 	 * Click Amount due to HMRC
     * @name Click Amount due to HMRC
     */
	public void Click_Amount_due_to_HMRC()
	{
        
		WebElement elem = getWebElement(Amount_due_to_HMRCElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Amount_due_to_HMRC", "Click_Amount_due_to_HMRC failed. Unable to locate object: " + Amount_due_to_HMRCElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Amount_due_to_HMRC", "Click_Amount_due_to_HMRC failed. Unable to locate object: " + Amount_due_to_HMRCElem.toString());

			Assert.fail("Unable to locate object: " + Amount_due_to_HMRCElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Amount_due_to_HMRC");

		TestModellerLogger.PassStep(m_Driver, "Click_Amount_due_to_HMRC");
	}


	public void verifyAmoutDue() {
		
		int TableLen=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amount due to HMRC')]//following::tr/td[13]")).size();
		
		for(int i=1; i<TableLen; i++)
			
		{
			String Amount=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Amount due to HMRC')]//following::tr["+i+"]/td[13]")).getText();
			Amount=Amount.replaceAll("[£]", "");
			Amount=Amount.replaceAll("[,]", "");
			
			double AmountafterChange=Double.parseDouble(Amount);
			
			TotalAmountDue=TotalAmountDue+AmountafterChange;
			
	//		payment_of_month=(float) (Math.round(payment_of_month *100)/100.0);
			
			TotalAmountDue=(Math.round(TotalAmountDue*100)/100.0);
			
			System.out.println("TotalAmountDue="+TotalAmountDue);
			
		}
			
		String ActualAmount=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Amount due to HMRC')]//following::tr["+TableLen+"]/td[13]")).getText();
		ActualAmount=ActualAmount.replaceAll("[£]", "");
		ActualAmount=ActualAmount.replaceAll("[,]", "");
		
		ActualAmountDue=Double.parseDouble(ActualAmount);
		
		System.out.println("ActualAmountDue="+ActualAmountDue);
		
		Assert.assertEquals(ActualAmountDue, TotalAmountDue);
		
	}
}