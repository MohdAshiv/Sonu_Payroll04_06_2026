package volentry_Pension;

import pages.BasePage;

import static org.testng.Assert.assertNotEquals;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/bdeee1f2-5046-4775-b087-3226e6169b21
@TestModellerModule(guid = "bdeee1f2-5046-4775-b087-3226e6169b21")
public class VC_Pension extends BasePage
{
	String old_EE_Pension;
	String old_ER_Pension;
	
	public VC_Pension (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoPension_DashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPension']");

	private By click_three_dotsElem = By.xpath("//A[@class='report_icon dropdown-toggle']");

	private By clickEditElem = By.xpath("//A[contains(text(),'Edit')]");

	private By clickAutoEnrolmentElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee']");

	private By EEChosenContributionElem = By.xpath("//label[contains(.,'EE Chosen Contribution %:\n                                *')]/../div/input");

	private By ERChosenContributionElem = By.xpath("//label[contains(.,'ER Chosen Contribution %:\n                                *')]/../div/input");

	private By EEVoluntaryContributionElem = By.xpath("//label[contains(.,'EE Voluntary Contribution:\n                                *')]/../div[1]/input");

	private By ERVoluntaryContributionElem = By.xpath("//label[contains(.,'ER Voluntary Contribution:*')]/../div[1]/input");

	private By gotoPayroll_DashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By getPayrollDateElem = By.xpath("//label[contains(.,'Period End:')]/../select");

	private By Run_Payroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By Run_Payroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickPayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");
	
	private By clickPayslipsElem2 = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By get_EE_PensionElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[11]");

	private By get_ER_pensionElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[15]");
	
	private By get_EE_PensionElem2 = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[11]");

	private By get_ER_pensionElem2 = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[15]");

	private By gotoReportsElem2 = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12176");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12176");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12176");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12176";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12176")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoPension Dashboard
     * @name Click gotoPension Dashboard
     */
	public void Click_gotoPension_Dashboard()
	{
        
		WebElement elem = getWebElement(gotoPension_DashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPension_Dashboard", "Click_gotoPension_Dashboard failed. Unable to locate object: " + gotoPension_DashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPension_Dashboard", "Click_gotoPension_Dashboard failed. Unable to locate object: " + gotoPension_DashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPension_DashboardElem.toString());
        }

		elem.click();
          	System.out.println("1");

		ExtentReportManager.passStep(m_Driver, "Click_gotoPension_Dashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPension_Dashboard");
	}

     
	/**
 	 * Click click three dots
     * @name Click click three dots
     */
	public void Click_click_three_dots()
	{
        
		WebElement elem = getWebElement(click_three_dotsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_click_three_dots", "Click_click_three_dots failed. Unable to locate object: " + click_three_dotsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_click_three_dots", "Click_click_three_dots failed. Unable to locate object: " + click_three_dotsElem.toString());

			Assert.fail("Unable to locate object: " + click_three_dotsElem.toString());
        }

		elem.click();
          	
		System.out.println("2");
		ExtentReportManager.passStep(m_Driver, "Click_click_three_dots");

		TestModellerLogger.PassStep(m_Driver, "Click_click_three_dots");
	}

     
	/**
 	 * Click clickEdit
     * @name Click clickEdit
     */
	public void Click_clickEdit()
	{
        
		WebElement elem = getWebElement(clickEditElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEdit", "Click_clickEdit failed. Unable to locate object: " + clickEditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEdit", "Click_clickEdit failed. Unable to locate object: " + clickEditElem.toString());

			Assert.fail("Unable to locate object: " + clickEditElem.toString());
        }

		elem.click();
		System.out.println("3"); 	

		ExtentReportManager.passStep(m_Driver, "Click_clickEdit");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEdit");
	}

     
	/**
 	 * Click clickAutoEnrolment
	 * @throws InterruptedException 
     * @name Click clickAutoEnrolment
     */
	public void Click_clickAutoEnrolment() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickAutoEnrolmentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAutoEnrolment", "Click_clickAutoEnrolment failed. Unable to locate object: " + clickAutoEnrolmentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAutoEnrolment", "Click_clickAutoEnrolment failed. Unable to locate object: " + clickAutoEnrolmentElem.toString());

			Assert.fail("Unable to locate object: " + clickAutoEnrolmentElem.toString());
        }

		Thread.sleep(2000);
		elem.click();
		
		Thread.sleep(4000);
		
		elem=m_Driver.findElement(By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee']"));
		
		elem.click();
		System.out.println("4");	

		ExtentReportManager.passStep(m_Driver, "Click_clickAutoEnrolment");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAutoEnrolment");
	}

      
	/**
 	 * Enter EEChosenContribution
     * @name Enter EEChosenContribution
     */
 	public void Enter_EEChosenContribution(String EEChosenContribution)
 	{
 	    
 		WebElement elem = getWebElement(EEChosenContributionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EEChosenContribution", "Enter_EEChosenContribution failed. Unable to locate object: " + EEChosenContributionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EEChosenContribution", "Enter_EEChosenContribution failed. Unable to locate object: " + EEChosenContributionElem.toString());

 			Assert.fail("Unable to locate object: " + EEChosenContributionElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EEChosenContribution);
 		System.out.println("5");
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EEChosenContribution " + EEChosenContribution);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EEChosenContribution " + EEChosenContribution);
 	}

      
	/**
 	 * Enter ERChosenContribution
     * @name Enter ERChosenContribution
     */
 	public void Enter_ERChosenContribution(String ERChosenContribution)
 	{
 	    
 		WebElement elem = getWebElement(ERChosenContributionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ERChosenContribution", "Enter_ERChosenContribution failed. Unable to locate object: " + ERChosenContributionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ERChosenContribution", "Enter_ERChosenContribution failed. Unable to locate object: " + ERChosenContributionElem.toString());

 			Assert.fail("Unable to locate object: " + ERChosenContributionElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(ERChosenContribution);
 		System.out.println("6");
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ERChosenContribution " + ERChosenContribution);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ERChosenContribution " + ERChosenContribution);
 	}

      
	/**
 	 * Enter EEVoluntaryContribution
     * @name Enter EEVoluntaryContribution
     */
 	public void Enter_EEVoluntaryContribution(String EEVoluntaryContribution)
 	{
 	    
 		WebElement elem = getWebElement(EEVoluntaryContributionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EEVoluntaryContribution", "Enter_EEVoluntaryContribution failed. Unable to locate object: " + EEVoluntaryContributionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EEVoluntaryContribution", "Enter_EEVoluntaryContribution failed. Unable to locate object: " + EEVoluntaryContributionElem.toString());

 			Assert.fail("Unable to locate object: " + EEVoluntaryContributionElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EEVoluntaryContribution);
 		
 		System.out.println("7");
  		ExtentReportManager.passStep(m_Driver, "Enter_EEVoluntaryContribution " + EEVoluntaryContribution);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EEVoluntaryContribution " + EEVoluntaryContribution);
 	}

      
	/**
 	 * Enter ERVoluntaryContribution
     * @name Enter ERVoluntaryContribution
     */
 	public void Enter_ERVoluntaryContribution(String ERVoluntaryContribution)
 	{
 	    
 		WebElement elem = getWebElement(ERVoluntaryContributionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ERVoluntaryContribution", "Enter_ERVoluntaryContribution failed. Unable to locate object: " + ERVoluntaryContributionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ERVoluntaryContribution", "Enter_ERVoluntaryContribution failed. Unable to locate object: " + ERVoluntaryContributionElem.toString());

 			Assert.fail("Unable to locate object: " + ERVoluntaryContributionElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(ERVoluntaryContribution);
 		
 		WebElement savebtn=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSaveAEEmployee']"));
 		jsExec.executeScript("arguments[0].scrollIntoView();", savebtn);
 		jsExec.executeScript("arguments[0].click();", savebtn);
 		
 		System.out.println("8");
  		ExtentReportManager.passStep(m_Driver, "Enter_ERVoluntaryContribution " + ERVoluntaryContribution);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ERVoluntaryContribution " + ERVoluntaryContribution);
 	}

     
	/**
 	 * Click gotoPayroll Dashboard
     * @name Click gotoPayroll Dashboard
     */
	public void Click_gotoPayroll_Dashboard()
	{
        
		WebElement elem = getWebElement(gotoPayroll_DashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayroll_Dashboard", "Click_gotoPayroll_Dashboard failed. Unable to locate object: " + gotoPayroll_DashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayroll_Dashboard", "Click_gotoPayroll_Dashboard failed. Unable to locate object: " + gotoPayroll_DashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayroll_DashboardElem.toString());
        }

		elem.click();
		System.out.println("9");
	//	String date=m_Driver.findElement(By.xpath("//label[contains(.,'Period End:')]/../select")).getAttribute("value");
	//	String date=elem.getAttribute("value");
 	//	System.out.println("date="+date);
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayroll_Dashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayroll_Dashboard");
	}

    
	/**
 	 * Select getPayrollDate
     * @name Select getPayrollDate
     */
    public void Select_getPayrollDate(String getPayrollDate)
 	{
 	    
 		WebElement elem = getWebElement(getPayrollDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_getPayrollDate", "Select_getPayrollDate failed. Unable to locate object: " + getPayrollDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_getPayrollDate", "Select_getPayrollDate failed. Unable to locate object: " + getPayrollDateElem.toString());

 			Assert.fail("Unable to locate object: " + getPayrollDateElem.toString());
         }

 		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(getPayrollDate);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_getPayrollDate " + getPayrollDate);

 		TestModellerLogger.PassStep(m_Driver, "Select_getPayrollDate " + getPayrollDate);
 	}

     
	/**
 	 * Click Run Payroll1
     * @name Click Run Payroll1
     */
	public void Click_Run_Payroll1()
	{
        
		WebElement elem = getWebElement(Run_Payroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll1", "Click_Run_Payroll1 failed. Unable to locate object: " + Run_Payroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll1", "Click_Run_Payroll1 failed. Unable to locate object: " + Run_Payroll1Elem.toString());

			Assert.fail("Unable to locate object: " + Run_Payroll1Elem.toString());
        }

		elem.click();
          	
		System.out.println("10");
		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll1");
	}

     
	/**
 	 * Click Run Payroll2
     * @name Click Run Payroll2
     */
	public void Click_Run_Payroll2()
	{
        
		WebElement elem = getWebElement(Run_Payroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll2", "Click_Run_Payroll2 failed. Unable to locate object: " + Run_Payroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll2", "Click_Run_Payroll2 failed. Unable to locate object: " + Run_Payroll2Elem.toString());

			Assert.fail("Unable to locate object: " + Run_Payroll2Elem.toString());
        }

		elem.click();
		System.out.println("11"); 	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll2");
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
		System.out.println("12");  	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click clickPayslips
     * @name Click clickPayslips
     */
	public void Click_clickPayslips()
	{
        
		WebElement elem = getWebElement(clickPayslipsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayslips", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayslips", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayslipsElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
		 old_EE_Pension=m_Driver.findElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[11]")).getText();
		System.out.println("old EE_Pension="+old_EE_Pension);
		 old_ER_Pension=m_Driver.findElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[15]")).getText();
		System.out.println("old ER_Pension="+old_ER_Pension);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayslips");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayslips");
	}

     
	/**
 	 * Click get EE Pension
     * @name Click get EE Pension
     */
	public void Click_get_EE_Pension()
	{
        
		WebElement elem = getWebElement(get_EE_PensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_get_EE_Pension", "Click_get_EE_Pension failed. Unable to locate object: " + get_EE_PensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_get_EE_Pension", "Click_get_EE_Pension failed. Unable to locate object: " + get_EE_PensionElem.toString());

			Assert.fail("Unable to locate object: " + get_EE_PensionElem.toString());
        }

		 old_EE_Pension=elem.getAttribute("value");
		
		System.out.println("old EE_Pension="+old_EE_Pension);
          	

		ExtentReportManager.passStep(m_Driver, "Click_get_EE_Pension");

		TestModellerLogger.PassStep(m_Driver, "Click_get_EE_Pension");
	}

     
	/**
 	 * Click get ER pension
     * @name Click get ER pension
     */
	public void Click_get_ER_pension()
	{
        
		WebElement elem = getWebElement(get_ER_pensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_get_ER_pension", "Click_get_ER_pension failed. Unable to locate object: " + get_ER_pensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_get_ER_pension", "Click_get_ER_pension failed. Unable to locate object: " + get_ER_pensionElem.toString());

			Assert.fail("Unable to locate object: " + get_ER_pensionElem.toString());
        }

		//elem.click();
		String old_ER_Pension=elem.getAttribute("value");
		
		System.out.println("Old ER_Pension="+old_ER_Pension);
          	

		ExtentReportManager.passStep(m_Driver, "Click_get_ER_pension");

		TestModellerLogger.PassStep(m_Driver, "Click_get_ER_pension");
	}
	
	
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports2()
	{
        
		WebElement elem = getWebElement(gotoReportsElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports2", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports2", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem2.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem2.toString());
        }

		elem.click();
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports2");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports2");
	}
	
	
	
	public void Click_clickPayslips2()
	{
        
		WebElement elem = getWebElement(clickPayslipsElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayslips2", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayslips2", "Click_clickPayslips failed. Unable to locate object: " + clickPayslipsElem2.toString());

			Assert.fail("Unable to locate object: " + clickPayslipsElem2.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		

		String new_EE_Pension=m_Driver.findElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[11]")).getText();
		System.out.println("EE_Pension2="+new_EE_Pension);
		String new_ER_Pension=m_Driver.findElement(By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[15]")).getText();
		System.out.println("ER_Pension2="+new_ER_Pension);
		
		 assertNotEquals(new_EE_Pension , old_EE_Pension,""+new_EE_Pension);
		 assertNotEquals(new_ER_Pension , old_ER_Pension);
		 System.out.println("13");	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayslips2");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayslips2");
	}

	
	
	public void Click_get_EE_Pension2()
	{
        
		WebElement elem = getWebElement(get_EE_PensionElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_get_EE_Pension2", "Click_get_EE_Pension failed. Unable to locate object: " + get_EE_PensionElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_get_EE_Pension2", "Click_get_EE_Pension failed. Unable to locate object: " + get_EE_PensionElem2.toString());

			Assert.fail("Unable to locate object: " + get_EE_PensionElem2.toString());
        }

		String new_EE_Pension=elem.getAttribute("value");
		
		System.out.println("EE_Pension2="+new_EE_Pension);
          	

		ExtentReportManager.passStep(m_Driver, "Click_get_EE_Pension2");

		TestModellerLogger.PassStep(m_Driver, "Click_get_EE_Pension2");
	}

     
	/**
 	 * Click get ER pension
     * @name Click get ER pension2
     */
	public void Click_get_ER_pension2()
	{
        
		WebElement elem = getWebElement(get_ER_pensionElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_get_ER_pension2", "Click_get_ER_pension failed. Unable to locate object: " + get_ER_pensionElem2.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_get_ER_pension2", "Click_get_ER_pension failed. Unable to locate object: " + get_ER_pensionElem2.toString());

			Assert.fail("Unable to locate object: " + get_ER_pensionElem2.toString());
        }

		//elem.click();
		String new_ER_Pension=elem.getAttribute("value");
		
		System.out.println("ER_Pension2="+new_ER_Pension);
          	

		ExtentReportManager.passStep(m_Driver, "Click_get_ER_pension2");

		TestModellerLogger.PassStep(m_Driver, "Click_get_ER_pension2");
	}
	
	
/*Verify EE and ER pension in xml
 * 
 * 
 * 
 * 	
 */
	
	public void verifyxml() throws InterruptedException
	{
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']")).click();
		WebElement pension=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']"));
		Select year=new Select(pension);
      	Thread.sleep(2000);
      	year.selectByVisibleText("Pension");
      	
      	int length=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdPensionFilling']/tbody/tr/td[4]")).size();
      	System.out.println("size="+length);
      	for(int i=length; i<=length;i++)
      	{
      		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdPensionFilling']/tbody/tr["+i+"]/td[10]")).click();
//      		WebElement textEditor=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtData']"));
//      		//WebElement textEditor = driver.findElement(By method);
//      		String text = textEditor.getText();
//      		System.out.println("str"+text);
      	}
      	
      	System.out.println("14");
	}
	
	
	
}