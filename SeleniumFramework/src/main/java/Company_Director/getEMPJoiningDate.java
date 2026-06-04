package Company_Director;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import frequency.ChngfrqMtoW;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.CalculateDatesRange;
import utilities.ExcelData;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import utilities.HMRC_Tax;
import utilities.TakeScreenshot;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5a9af039-6dfe-455a-8889-b14f920eb54f
@TestModellerModule(guid = "5a9af039-6dfe-455a-8889-b14f920eb54f")
public class getEMPJoiningDate extends BasePage
{
	static double AnnualPay=0.0;
	static int[] LEL_PT_UEL;

	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	public getEMPJoiningDate (WebDriver driver)
	{
		super(driver);
	}


	
	private By getgrosssalaryElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr[3]/td[1]");

	private By clickEditemployeedetailsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");

	private By gotoMandatoryPayrollInformationElem = By.xpath("//A[contains(text(),'Mandatory Payroll Information')]");

	private By selectPayrollFrequencyCodeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlPayrollFrequencyCode']");

	private By gotoPayDetailsElem = By.xpath("//A[contains(text(),'Pay Details')]");

	private By EnterAnnualSalaryElem = By.xpath("//label[contains(.,'Annual Salary:')]/../div/input");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	private By clickPayDetailsElem = By.xpath("//A[contains(text(),'Pay Details')]");

	private By getAnnualSalaryElem = By.xpath("//label[contains(.,'Annual Salary:')]/../div/input");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By click_P60P45P11D_FormsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");

	private By clickP60_PDF_DocumentIconElem = By.xpath("//*[@id='dvP60']/div/div/div/div/div/table/tbody/tr[2]/td[7]/a/i");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	
		

     
	/**
 	 * Click clickEditemployeedetails
     * @name Click clickEditemployeedetails
     */
	public void Click_clickEditemployeedetails()
	{
        
		WebElement elem = getWebElement(clickEditemployeedetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEditemployeedetails", "Click_clickEditemployeedetails failed. Unable to locate object: " + clickEditemployeedetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEditemployeedetails", "Click_clickEditemployeedetails failed. Unable to locate object: " + clickEditemployeedetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickEditemployeedetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEditemployeedetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEditemployeedetails");
	}

     
	/**
 	 * Click gotoMandatoryPayrollInformation
     * @name Click gotoMandatoryPayrollInformation
     */
	public void Click_gotoMandatoryPayrollInformation()
	{
        
		WebElement elem = getWebElement(gotoMandatoryPayrollInformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoMandatoryPayrollInformation", "Click_gotoMandatoryPayrollInformation failed. Unable to locate object: " + gotoMandatoryPayrollInformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoMandatoryPayrollInformation", "Click_gotoMandatoryPayrollInformation failed. Unable to locate object: " + gotoMandatoryPayrollInformationElem.toString());

			Assert.fail("Unable to locate object: " + gotoMandatoryPayrollInformationElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoMandatoryPayrollInformation");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoMandatoryPayrollInformation");
	}

	
	public void getjoiningdate()
	{
		
		String sDate="06/04/2021";
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDirectorStartDate']"));
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		String eDate=elem.getAttribute("value");
	//	System.out.println(eDate);
		
		int DaysCount=CalculateDatesRange.getDatesBetweenUsingJava7(sDate, eDate);
		//System.out.println(DaysCount);
		int weekCount=DaysCount/7;
		int remainingweek=52-weekCount;
		System.out.println(remainingweek);
		
		int[] getliability=new int[3];
		
		getliability=HMRC_Tax.HMRC_Taxes(remainingweek);
		for(int i=0;i<getliability.length;i++)
		{
			System.out.println(getliability[i]);
		}
		
		LEL_PT_UEL=getliability;
		for(int i=0;i<3;i++)
		{
		System.out.println("before return"+LEL_PT_UEL[i]);
		}
		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2")));
		
	}
	
	public int[] sendTaxes()
	{
		for(int i=0;i<3;i++)
		{
		System.out.println("in return"+LEL_PT_UEL[i]);
		}
		return LEL_PT_UEL;
		
	}
	
	
	/**
 	 * Click clickPayDetails
     * @name Click clickPayDetails
     */
	public void Click_clickPayDetails()
	{
        
		WebElement elem = getWebElement(clickPayDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayDetails", "Click_clickPayDetails failed. Unable to locate object: " + clickPayDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayDetails", "Click_clickPayDetails failed. Unable to locate object: " + clickPayDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayDetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayDetails");
	}

      
	/**
 	 * Enter getAnnualSalary
     * @name Enter getAnnualSalary
     */
 	public void Enter_getAnnualSalary()
 	{
 	    
 		WebElement elem = getWebElement(getAnnualSalaryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getAnnualSalary", "Enter_getAnnualSalary failed. Unable to locate object: " + getAnnualSalaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getAnnualSalary", "Enter_getAnnualSalary failed. Unable to locate object: " + getAnnualSalaryElem.toString());

 			Assert.fail("Unable to locate object: " + getAnnualSalaryElem.toString());
         }

 		String AnnualSalary=elem.getAttribute("value");
 		
 		System.out.println("Annual Salary="+AnnualSalary);
 		
 		AnnualPay=Double.parseDouble(AnnualSalary);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getAnnualSalary " + getAnnualSalaryElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getAnnualSalary " + getAnnualSalaryElem);
 	}
 	
 	
 	/**
 	 * Send Annual Salary
 	 * 
 	 */
 	
 	public double sendAnnualPay()
 	{
		return AnnualPay;
 		
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
 	 * Click click_P60/P45/P11D Forms
     * @name Click click_P60/P45/P11D Forms
     */
	public void Click_click_P60P45P11D_Forms()
	{
        
		WebElement elem = getWebElement(click_P60P45P11D_FormsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_click_P60P45P11D_Forms", "Click_click_P60P45P11D_Forms failed. Unable to locate object: " + click_P60P45P11D_FormsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_click_P60P45P11D_Forms", "Click_click_P60P45P11D_Forms failed. Unable to locate object: " + click_P60P45P11D_FormsElem.toString());

			Assert.fail("Unable to locate object: " + click_P60P45P11D_FormsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_click_P60P45P11D_Forms");

		TestModellerLogger.PassStep(m_Driver, "Click_click_P60P45P11D_Forms");
	}

     
	/**
 	 * Click clickP60 PDF DocumentIcon
	 * @throws Exception 
	 * @name Click clickP60 PDF DocumentIcon
     */
	public void Click_clickP60_PDF_DocumentIcon() throws Exception
	{
        
		WebElement elem = getWebElement(clickP60_PDF_DocumentIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

			Assert.fail("Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
		
		ArrayList<String> tabs2 = new ArrayList<String> (m_Driver.getWindowHandles());
	    m_Driver.switchTo().window(tabs2.get(3));
	    
	    Thread.sleep(4000);
	    
	  //  waitForVisible(EnterAnnualSalaryElem, 0);
		
		TakeScreenshot.takeScreenshot(m_Driver, "P60_Pic");
		
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");
	}
	
	public void Click_clickP60_PDF_DocumentIcon1() throws Exception
	{
        
		WebElement elem = getWebElement(clickP60_PDF_DocumentIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

			Assert.fail("Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
		
		ArrayList<String> tabs2 = new ArrayList<String> (m_Driver.getWindowHandles());
	    m_Driver.switchTo().window(tabs2.get(3));
	    
	    Thread.sleep(4000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "P60_forTC7");
		
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");
	}
	
	
	public void Click_clickP60_PDF_DocumentIcon2() throws Exception
	{
        
		WebElement elem = getWebElement(clickP60_PDF_DocumentIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

			Assert.fail("Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
		
		ArrayList<String> tabs2 = new ArrayList<String> (m_Driver.getWindowHandles());
	    m_Driver.switchTo().window(tabs2.get(3));
	    
	    Thread.sleep(5000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "P60_forTC11");
		
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");
	}
	
	
	public void Click_clickP60_PDF_DocumentIcon3() throws Exception
	{
        
		WebElement elem = getWebElement(clickP60_PDF_DocumentIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

			Assert.fail("Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
		
		ArrayList<String> tabs2 = new ArrayList<String> (m_Driver.getWindowHandles());
	    m_Driver.switchTo().window(tabs2.get(3));
	    
	    Thread.sleep(5000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "P60_forTC19");
		
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");
	}
	
	public void Click_clickP60_PDF_DocumentIcon4() throws Exception
	{
        
		WebElement elem = getWebElement(clickP60_PDF_DocumentIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

			Assert.fail("Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());
        }
//		int len=m_Driver.findElements(By.xpath("//main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr/td[3]")).size();
//		System.out.println("size="+len);
		for(int i=2;i<=3;i++)
		{
			System.out.println("value of i="+i);
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='dvP60']/div/div/div/div/div/table/tbody/tr["+i+"]/td[7]/a/i")));
		Thread.sleep(2000);
			ArrayList<String> tabs2 = new ArrayList<String> (m_Driver.getWindowHandles());
			Thread.sleep(2000);
			m_Driver.switchTo().window(tabs2.get(4));
	    
			Thread.sleep(5000);
		
			TakeScreenshot.takeScreenshot(m_Driver, "P60_forTC29 for emp "+i+"");
			Thread.sleep(2000);
			m_Driver.close();
		    m_Driver.switchTo().window(tabs2.get(3));
		
		}
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");
	}
	
    
	
}