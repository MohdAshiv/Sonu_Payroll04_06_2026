package _2044CIS_Submt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class AddCISInvoiceForContractor extends BasePage
{

	public AddCISInvoiceForContractor(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static String GetDate;
	public WebElement elem;
	
	private By ContractorNmeList = By.xpath("//a[@class='border-btm-dotted']");
	
	private By PeriodEndDate = By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPeriodEnd']/option[1]");
	
	
	_2044CIS_Submt.CISDashboard CisDsbd = new _2044CIS_Submt.CISDashboard(m_Driver);
	_2044CIS_Submt.SelectSubcontractorForInvoice SubconcInvoice = new _2044CIS_Submt.SelectSubcontractorForInvoice(m_Driver);

	public void Click_ContractorNameList(String Amt) throws InterruptedException
	{
	    
		List<WebElement> element = getWebElements(ContractorNmeList);
		 for(WebElement elemt:element) 	
		 {
		  elemt.click();
		  System.out.println("Get Name List :"+elemt.getText());
		  ChangeWindow.tabswitch(m_Driver);
		  Thread.sleep(2000);
		  elem = getWebElement(PeriodEndDate);
		  GetDate=elem.getAttribute("value");
		  CisDsbd.Click_New();
		  Thread.sleep(1000);
		  CisDsbd.Click_NewInvoice();
		  SubconcInvoice.Select_SubcontractorName(Amt);
		  ChangeWindow.tabswitch(m_Driver);
		 }
		if (element == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ContractorNameList", "Click_ContractorNameList failed. Unable to locate object: " + ContractorNmeList.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ContractorNameList", "Click_ContractorNameList failed. Unable to locate object: " + ContractorNmeList.toString());

			Assert.fail("Unable to locate object: " + ContractorNmeList.toString());
	    }
		
		ExtentReportManager.passStep(m_Driver, "Click_ContractorNameList");

		TestModellerLogger.PassStep(m_Driver, "Click_ContractorNameList");

}
}