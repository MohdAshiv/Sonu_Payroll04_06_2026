package _1995subContractorPayreport;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ee676919-b8c5-4417-9a6b-41a77655e1dd
@TestModellerModule(guid = "ee676919-b8c5-4417-9a6b-41a77655e1dd")
public class _1995subcontractorPayReport extends BasePage
{
	List<String> strlist=new ArrayList<String>();
	
	public _1995subcontractorPayReport (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoCISReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickAll_Subcontractors_Pay_TotalsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportAllSubcontractorsPayTotals']");

	private By selectPeriodElem = By.xpath("//label[normalize-space()= 'Period :']/../select");

	private By getsubContractorListElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr[2]/td[1]");

	private By clickCIS300_Monthly_Return_ReportElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCISNilReturn']");

	private By clickSearchElem = By.xpath("//A[contains(text(),'Search')]");

	private By mtchsubContractorElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportCISNilReturnUC_pldisplayresult']/div/table[2]/tbody/tr[2]/td[1]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CISNilRetrunReport.aspx?ContractorCode=407");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CISNilRetrunReport.aspx?ContractorCode=407");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CISNilRetrunReport.aspx?ContractorCode=407");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CISNilRetrunReport.aspx?ContractorCode=407";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CISNilRetrunReport.aspx?ContractorCode=407")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoCISReports
     * @name Click gotoCISReports
     */
	public void Click_gotoCISReports()
	{
        
		WebElement elem = getWebElement(gotoCISReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoCISReports", "Click_gotoCISReports failed. Unable to locate object: " + gotoCISReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoCISReports", "Click_gotoCISReports failed. Unable to locate object: " + gotoCISReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoCISReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoCISReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoCISReports");
	}

     
	/**
 	 * Click clickAll Subcontractors Pay Totals
     * @name Click clickAll Subcontractors Pay Totals
     */
	public void Click_clickAll_Subcontractors_Pay_Totals()
	{
        
		WebElement elem = getWebElement(clickAll_Subcontractors_Pay_TotalsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAll_Subcontractors_Pay_Totals", "Click_clickAll_Subcontractors_Pay_Totals failed. Unable to locate object: " + clickAll_Subcontractors_Pay_TotalsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAll_Subcontractors_Pay_Totals", "Click_clickAll_Subcontractors_Pay_Totals failed. Unable to locate object: " + clickAll_Subcontractors_Pay_TotalsElem.toString());

			Assert.fail("Unable to locate object: " + clickAll_Subcontractors_Pay_TotalsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAll_Subcontractors_Pay_Totals");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAll_Subcontractors_Pay_Totals");
	}

    
	/**
 	 * Select selectPeriod
     * @name Select selectPeriod
     */
    public void Select_selectPeriod(String selectPeriod)
 	{
 	    
 		WebElement elem = getWebElement(selectPeriodElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectPeriod", "Select_selectPeriod failed. Unable to locate object: " + selectPeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectPeriod", "Select_selectPeriod failed. Unable to locate object: " + selectPeriodElem.toString());

 			Assert.fail("Unable to locate object: " + selectPeriodElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectPeriod);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectPeriod " + selectPeriod);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectPeriod " + selectPeriod);
 	}

 //   List<WebElement> list1;  
	/**
 	 * Click getsubContractorList
     * @name Click getsubContractorList
     */
	public void Click_getsubContractorList()
	{
        
		WebElement elem = getWebElement(getsubContractorListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getsubContractorList", "Click_getsubContractorList failed. Unable to locate object: " + getsubContractorListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getsubContractorList", "Click_getsubContractorList failed. Unable to locate object: " + getsubContractorListElem.toString());

			Assert.fail("Unable to locate object: " + getsubContractorListElem.toString());
        }

	//	elem.click();
		
		List<WebElement> list1=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr/td[1]"));
		int list1Size=list1.size();
		System.out.println("List1 size=="+list1Size);
		

	//	int i=0;
        for(WebElement l1:list1)
        {
            String str1=l1.getText();
            System.out.println("str1="+str1);
            strlist.add(str1);
        }
      
 
               
          	

		ExtentReportManager.passStep(m_Driver, "Click_getsubContractorList");

		TestModellerLogger.PassStep(m_Driver, "Click_getsubContractorList");
	}

     
	/**
 	 * Click clickCIS300 Monthly Return Report
     * @name Click clickCIS300 Monthly Return Report
     */
	public void Click_clickCIS300_Monthly_Return_Report()
	{
        
		WebElement elem = getWebElement(clickCIS300_Monthly_Return_ReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickCIS300_Monthly_Return_Report", "Click_clickCIS300_Monthly_Return_Report failed. Unable to locate object: " + clickCIS300_Monthly_Return_ReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickCIS300_Monthly_Return_Report", "Click_clickCIS300_Monthly_Return_Report failed. Unable to locate object: " + clickCIS300_Monthly_Return_ReportElem.toString());

			Assert.fail("Unable to locate object: " + clickCIS300_Monthly_Return_ReportElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickCIS300_Monthly_Return_Report");

		TestModellerLogger.PassStep(m_Driver, "Click_clickCIS300_Monthly_Return_Report");
	}

     
	/**
 	 * Click clickSearch
     * @name Click clickSearch
     */
	public void Click_clickSearch()
	{
        
		WebElement elem = getWebElement(clickSearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSearch", "Click_clickSearch failed. Unable to locate object: " + clickSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSearch", "Click_clickSearch failed. Unable to locate object: " + clickSearchElem.toString());

			Assert.fail("Unable to locate object: " + clickSearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSearch");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSearch");
	}

     
	/**
 	 * Click mtchsubContractor
     * @name Click mtchsubContractor
     */
	public void Click_mtchsubContractor()
	{
        
		WebElement elem = getWebElement(mtchsubContractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_mtchsubContractor", "Click_mtchsubContractor failed. Unable to locate object: " + mtchsubContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_mtchsubContractor", "Click_mtchsubContractor failed. Unable to locate object: " + mtchsubContractorElem.toString());

			Assert.fail("Unable to locate object: " + mtchsubContractorElem.toString());
        }

//		elem.click();
		
		List<WebElement> list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportCISNilReturnUC_pldisplayresult']/div/table[2]/tbody/tr/td[1]"));
		int list2Size=list2.size();
		System.out.println("List2 size=="+list2Size);
		
		list2.remove(list2Size-1);
		
		System.out.println(list2.size());
		
int i=0;
        for(WebElement l2:list2)
        {
            String str2=l2.getText();
            String str3=strlist.get(i);
            System.out.println("str3="+str3);
            System.out.println("str2="+str2);
            i++;
            
            assertEquals(str2, str3, "String not match");
            
        }
        
        
        
        
          	

		ExtentReportManager.passStep(m_Driver, "Click_mtchsubContractor");

		TestModellerLogger.PassStep(m_Driver, "Click_mtchsubContractor");
	}
	
	/**
	 * Take screenshot for paid subcontractor  list
	 * @throws Exception 
	 * 
	 */
	public void scforPaidsubcontractor() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "List of schedule paid subcontractor");
		
	}
	
	
	/**
	 * Take screenshot for paid subcontractor  list
	 * @throws Exception 
	 * 
	 */
	public void scforNon_Paidsubcontractor() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "When non of subcontractor is paid");
		
	}
	
}