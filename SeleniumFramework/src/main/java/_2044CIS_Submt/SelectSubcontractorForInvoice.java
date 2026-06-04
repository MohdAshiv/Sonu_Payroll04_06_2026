package _2044CIS_Submt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class SelectSubcontractorForInvoice extends BasePage {

	public SelectSubcontractorForInvoice(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebElement elem;
	private By Subcontractor = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPH$ddlSubcontractor']");
    
	_2044CIS_Submt.CISDashboard CisDshbd = new _2044CIS_Submt.CISDashboard(m_Driver);
	 
    /**
	 * Click Subcontractor
    * @throws InterruptedException 
    * @name Subcontractor
    */
    
    public void Select_SubcontractorName(String Amt) throws InterruptedException 
	{
        m_Driver.switchTo().frame(getWebElement(By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/iframe[1]")));

    elem = getWebElement(Subcontractor);  
    Select selc = new Select(elem);
   

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SubcontractorName", "Select_SubcontractorName. Unable to locate object: " + Subcontractor.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SubcontractorName", "Select_SubcontractorName. Unable to locate object: " + Subcontractor.toString());

			Assert.fail("Unable to locate object: " + Subcontractor.toString());
        }

		List<WebElement> SCdd = selc.getOptions();
		System.out.println("Size of dropdown :"+ SCdd.size());
		 m_Driver.switchTo().defaultContent();
		 
		for(int i=0;i<SCdd.size();i++)
		{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//body/div[@id='colorbox']/div[@id='cboxWrapper']/div[2]/div[2]/div[1]/iframe[1]")));
		 List<WebElement> SCdd2 =m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlSubcontractor']/Option"));
		 String Dro=SCdd2.get(i).getText();
		 System.out.println(Dro);
         SCdd2.get(i).click();
		 
		 CisDshbd.Select_InvoiceNo();
		 AddCISInvoiceForContractor ob=new AddCISInvoiceForContractor(m_Driver);
		 String DDate=ob.GetDate;
		 CisDshbd.Enter_InvoiceDate(DDate);
		 CisDshbd.Enter_LabourAmt(Amt);
		 CisDshbd.Click_InvoiceSavebtn();
		// Thread.sleep(1000);
	     m_Driver.switchTo().defaultContent();
/**
 * Here we need OR Operator if we add new Subcontractor from 2
 */
		 Thread.sleep(2000);
		 if(i==0 || i==1 || i==2 || i==3 )
		 {
		 CisDshbd.Click_New();
	         CisDshbd.Click_NewInvoice();
		 }

		}

		m_Driver.switchTo().defaultContent();
		ExtentReportManager.passStep(m_Driver, "Select_SubcontractorName");

		TestModellerLogger.PassStep(m_Driver, "Select_SubcontractorName");
	}
    
}
