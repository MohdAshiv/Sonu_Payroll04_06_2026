package _1918NMWPage;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/46ff7003-9aa3-441d-8192-ec3f9c5f5667
@TestModellerModule(guid = "46ff7003-9aa3-441d-8192-ec3f9c5f5667")
public class _1918NMWAlert extends BasePage
{
	public _1918NMWAlert (WebDriver driver)
	{
		super(driver);
	}


	
	private By EmpHourRateElem = By.xpath("(//label[normalize-space()= 'Hourly Rate:']/../div[1]/input)[1]");
	
	private By PayMethodElem = By.xpath("//label[normalize-space()= 'How is pay worked out?:']/../div/select");


	private By ClickMandatoryPayrollInformationElem = By.xpath("//A[contains(text(),'Mandatory Payroll Information')]");

	private By EmpJoiningDateElem = By.xpath("//*[@id='txtJoiningDate']");

	private By EmpNICategoryCodeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlNICategoryCode']");

	private By clickPersonalDetailsElem = By.xpath("//A[contains(text(),'Personal Details')]");

	private By EmpDOBElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDOB']");

	private By Alert_at_EmpEditPageElem = By.xpath("//DIV[@class='alert alert-warning']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By Alert_at_PayrollDashboardElem = By.xpath("//DIV[@id='ctl00_ctl00_ParentContent_cphError_dvWageAlert']");

	private By Alert_at_PayrollElem = By.xpath("//DIV[@id='ctl00_ctl00_ParentContent_cPH_dvWageAlert']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12346");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12346");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12346");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12346";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyRunPayroll.aspx?PayrollCompanyCode=12346")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

   
   
   /**
    * Click Edit Employee Detail
    * @throws InterruptedException 
    * 
    */
   public void EditEmployeeDetail() throws InterruptedException
   {
	   
	   m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']")).click();
	   
	   Thread.sleep(1000);
	   
   }
   
   
   
   /**
    * Click Edit Employee Detail
    * @throws InterruptedException 
    * 
    */
   public void clickPayDetail() throws InterruptedException
   {
	   
	   jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span")));
	   Thread.sleep(1000);
	   m_Driver.findElement(By.xpath("//*[@id='lipayd']/a")).click();
	   
	   Thread.sleep(1000);
	   
   }
   
   
   
      
	/**
 	 * Enter EmpHourRate
	 * @throws InterruptedException 
     * @name Enter EmpHourRate
     */
 	public void Enter_EmpHourRate(String EmpHourRate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EmpHourRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmpHourRate", "Enter_EmpHourRate failed. Unable to locate object: " + EmpHourRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmpHourRate", "Enter_EmpHourRate failed. Unable to locate object: " + EmpHourRateElem.toString());

 			Assert.fail("Unable to locate object: " + EmpHourRateElem.toString());
         }
 		
 		Thread.sleep(1000);
 		
 		for(int i=0;i<4;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}

 		elem.sendKeys(EmpHourRate);
 		
 		Thread.sleep(2000);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmpHourRate " + EmpHourRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmpHourRate " + EmpHourRate);
 	}

     
	/**
 	 * Click ClickMandatoryPayrollInformation
	 * @throws InterruptedException 
     * @name Click ClickMandatoryPayrollInformation
     */
	public void Click_ClickMandatoryPayrollInformation() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickMandatoryPayrollInformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickMandatoryPayrollInformation", "Click_ClickMandatoryPayrollInformation failed. Unable to locate object: " + ClickMandatoryPayrollInformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickMandatoryPayrollInformation", "Click_ClickMandatoryPayrollInformation failed. Unable to locate object: " + ClickMandatoryPayrollInformationElem.toString());

			Assert.fail("Unable to locate object: " + ClickMandatoryPayrollInformationElem.toString());
        }

 		Thread.sleep(1000);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickMandatoryPayrollInformation");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickMandatoryPayrollInformation");
	}

      
	/**
 	 * Enter EmpJoiningDate
	 * @throws InterruptedException 
     * @name Enter EmpJoiningDate
     */
 	public void Enter_EmpJoiningDate(String EmpJoiningDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EmpJoiningDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmpJoiningDate", "Enter_EmpJoiningDate failed. Unable to locate object: " + EmpJoiningDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmpJoiningDate", "Enter_EmpJoiningDate failed. Unable to locate object: " + EmpJoiningDateElem.toString());

 			Assert.fail("Unable to locate object: " + EmpJoiningDateElem.toString());
         }
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(2000);
 		elem.sendKeys(EmpJoiningDate);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		Thread.sleep(3000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmpJoiningDate " + EmpJoiningDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmpJoiningDate " + EmpJoiningDate);
 	}

    
	/**
 	 * Select EmpNICategoryCode
	 * @throws InterruptedException 
     * @name Select EmpNICategoryCode
     */
    public void Select_EmpNICategoryCode(String EmpNICategoryCode) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EmpNICategoryCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_EmpNICategoryCode", "Select_EmpNICategoryCode failed. Unable to locate object: " + EmpNICategoryCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_EmpNICategoryCode", "Select_EmpNICategoryCode failed. Unable to locate object: " + EmpNICategoryCodeElem.toString());

 			Assert.fail("Unable to locate object: " + EmpNICategoryCodeElem.toString());
         }
 		System.out.println("Hi1");
 		jsExec.executeScript("window.scrollTo(0, document.body.scrollHeight)");
// 		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_UpdatePanel1']/h3")).click();
 		Thread.sleep(3000);
 		System.out.println("Hi2");
 		elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlNICategoryCode']"));
 		System.out.println("Hi3");
 		Select dropdown = new Select(elem);
 		System.out.println("Hi4");
 		dropdown.selectByVisibleText(EmpNICategoryCode);
 		System.out.println("Hi5");
 		Thread.sleep(1000);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_EmpNICategoryCode " + EmpNICategoryCode);

 		TestModellerLogger.PassStep(m_Driver, "Select_EmpNICategoryCode " + EmpNICategoryCode);
 	}

     
	/**
 	 * Click clickPersonalDetails
	 * @throws InterruptedException 
     * @name Click clickPersonalDetails
     */
	public void Click_clickPersonalDetails() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickPersonalDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPersonalDetails", "Click_clickPersonalDetails failed. Unable to locate object: " + clickPersonalDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPersonalDetails", "Click_clickPersonalDetails failed. Unable to locate object: " + clickPersonalDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickPersonalDetailsElem.toString());
        }

		elem.click();
		
 		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPersonalDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPersonalDetails");
	}

      
	/**
 	 * Enter EmpDOB
	 * @throws InterruptedException 
     * @name Enter EmpDOB
     */
 	public void Enter_EmpDOB(String EmpDOB) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EmpDOBElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmpDOB", "Enter_EmpDOB failed. Unable to locate object: " + EmpDOBElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmpDOB", "Enter_EmpDOB failed. Unable to locate object: " + EmpDOBElem.toString());

 			Assert.fail("Unable to locate object: " + EmpDOBElem.toString());
         }
 		
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		
 		elem.sendKeys(EmpDOB);
 		m_Driver.findElement(By.xpath("//*[@id='PersonalDetails']/div[6]/label")).click();
 		
 		Thread.sleep(1000);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmpDOB " + EmpDOB);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmpDOB " + EmpDOB);
 	}
 	
 	
 	/**
 	 * Enter Apprentice date
 	 * @throws InterruptedException 
 	 * 
 	 */
 	public void Enter_ApprenticeDate(String ApprenticeDate) throws InterruptedException
 	{
 		
 		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtApprenticeship']"));
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(ApprenticeDate);

		m_Driver.findElement(By.xpath("//*[@id='PayDetails']/div[10]/label")).click();
 		
		Thread.sleep(1000);
 		
 	}
 	
 	
	/**
 	 * Enter Apprentice date
 	 * @throws InterruptedException 
 	 * 
 	 */
 	public void Remove_ApprenticeDate() throws InterruptedException
 	{
 		
 		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtApprenticeship']"));
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 	//	elem.sendKeys(ApprenticeDate);

		m_Driver.findElement(By.xpath("//*[@id='PayDetails']/div[10]/label")).click();
 		
		Thread.sleep(1000);
 		
 	}

 	
 	/**
 	 * Select PayMethod
     * @name Select PayMethod
     */
    public void Select_PayMethod(String PayMethod)
 	{
 	    
 		WebElement elem = getWebElement(PayMethodElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PayMethod", "Select_PayMethod failed. Unable to locate object: " + PayMethodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PayMethod", "Select_PayMethod failed. Unable to locate object: " + PayMethodElem.toString());

 			Assert.fail("Unable to locate object: " + PayMethodElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PayMethod);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PayMethod " + PayMethod);

 		TestModellerLogger.PassStep(m_Driver, "Select_PayMethod " + PayMethod);
 	}
 	
     
	/**
 	 * Click Alert_at_EmpEditPage
     * @name Click Alert_at_EmpEditPage
     */
	public void Click_Alert_at_EmpEditPage()
	{
        
		WebElement elem = getWebElement(Alert_at_EmpEditPageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Alert_at_EmpEditPage", "Click_Alert_at_EmpEditPage failed. Unable to locate object: " + Alert_at_EmpEditPageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Alert_at_EmpEditPage", "Click_Alert_at_EmpEditPage failed. Unable to locate object: " + Alert_at_EmpEditPageElem.toString());

			Assert.fail("Unable to locate object: " + Alert_at_EmpEditPageElem.toString());
        }

		System.out.println("Hello Alert");
		String ActualAlert1=elem.getText();
		
		System.out.println("ActualAlert1="+ActualAlert1);
		
		String ExpectedAlert1="Important! Employee is currently paid less than National Minimum Wage. Please check!";
		
		assertEquals(ActualAlert1, ExpectedAlert1,"Expected alert is not shown at Emp Edit page");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Alert_at_EmpEditPage");

		TestModellerLogger.PassStep(m_Driver, "Click_Alert_at_EmpEditPage");
	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

 		Thread.sleep(1000);
	//	elem.click();
 		jsExec.executeScript("arguments[0].click();", elem);
 		
 		Thread.sleep(3000);
 		
 		System.out.println("save clicked");

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
	
	
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboardA() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
		
//		TakeScreenshot.takeScreenshot(m_Driver, "No alert of NMW");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
	
	
	
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboardB() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
		
//		String Alertmsg=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_dvWageAlert']")).getText();
//		
//		assertTrue(Alertmsg==null);
		
//		TakeScreenshot.takeScreenshot(m_Driver, "No alert of NMW");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
	
	
	/**
	 * Screenshot for Alert
	 * @throws Exception 
	 * 
	 */
	
	public void scForalert() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "Alert for Emp in apprentice and in 2nd yr");
		
	}
	
	
	/**
	 * Screenshot for Alert
	 * @throws Exception 
	 * 
	 */
	
	public void scForalert1() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "Alert for Emp over 22age and in apprentice and in 2nd yr");
		
	}
	
	
	/**
	 * Screenshot for Alert
	 * @throws Exception 
	 * 
	 */
	
	public void scForalert2() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "No Alert for Emp over 25 in apprentice and in 2nd yr");
		
	}
	
	
	/**
	 * Screenshot for Alert
	 * @throws Exception 
	 * 
	 */
	
	public void scForalert3() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "No Alert for Emp over 19 in apprentice and in 1st yr");
		
	}

     
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "No alert of NMW");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
	
	
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard1() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "No alert of NMW under19 and apprentice");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
	
	
	
	/**
 	 * Click gotoPayrollDashboard
	 * @throws Exception 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard2() throws Exception
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
		
		TakeScreenshot.takeScreenshot(m_Driver, "No alert of NMW when over19 and apprentice");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

	
	/**
	 * 
	 * 
	 */
     public void refreshpage()
     {
    	 m_Driver.navigate().refresh();
     }
	/**
 	 * Click Alert_at_PayrollDashboard
     * @name Click Alert_at_PayrollDashboard
     */
	public void Click_Alert_at_PayrollDashboard()
	{
        
		WebElement elem = getWebElement(Alert_at_PayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Alert_at_PayrollDashboard", "Click_Alert_at_PayrollDashboard failed. Unable to locate object: " + Alert_at_PayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Alert_at_PayrollDashboard", "Click_Alert_at_PayrollDashboard failed. Unable to locate object: " + Alert_at_PayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + Alert_at_PayrollDashboardElem.toString());
        }

		String ActualAlert2=elem.getText();
		
		System.out.println("ActualAlert2="+ActualAlert2);
		
		String ExpectedAert="Important! One or more employee is currently paid under the national minimum wage. Please review!";
		
		assertEquals(ActualAlert2, ExpectedAert,"Expected Alert at dashboard page is not there");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Alert_at_PayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_Alert_at_PayrollDashboard");
	}

     
	/**
 	 * Click Alert_at_Payroll
     * @name Click Alert_at_Payroll
     */
	public void Click_Alert_at_Payroll()
	{
        
		WebElement elem = getWebElement(Alert_at_PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Alert_at_Payroll", "Click_Alert_at_Payroll failed. Unable to locate object: " + Alert_at_PayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Alert_at_Payroll", "Click_Alert_at_Payroll failed. Unable to locate object: " + Alert_at_PayrollElem.toString());

			Assert.fail("Unable to locate object: " + Alert_at_PayrollElem.toString());
        }

		String ActualAlert3=elem.getText();
		
		System.out.println("ActualAlert3="+ActualAlert3);
		
		String ExpectedAlert3="Important! One or more employee is currently paid under the national minimum wage. Please review!";
		
		assertEquals(ActualAlert3, ExpectedAlert3,"Expected alert during payroll is not there");

		ExtentReportManager.passStep(m_Driver, "Click_Alert_at_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Alert_at_Payroll");
	}
	
	
	/**
	 * Success Message
	 * 
	 * 
	 */
	public void successmsg()
	{
		
		String Actualmsg=m_Driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/main/div/div[3]/div/div[1]")).getText();
		System.out.println("Actualmsg="+Actualmsg);
		String Expectedmsg="Success! Employee record is updated successfully";
		
		assertEquals(Actualmsg, Expectedmsg);
		
	}
	
}