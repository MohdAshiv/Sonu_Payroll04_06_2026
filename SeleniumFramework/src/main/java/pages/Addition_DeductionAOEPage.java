package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class Addition_DeductionAOEPage extends BasePage{

	
	
	WebElement elem;
	public Addition_DeductionAOEPage (WebDriver driver)
	{
		super(driver);
	}
	
	
	
	
	private By click_three_dotsElem = By.xpath("//A[@class='report_icon dropdown-toggle']");
	
	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");
	
	private By AdditionDeductionAOEElem = By.xpath("//a[contains(text(),'Additions / Deductions / AOE')]");
	
	private By AOEelem = By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanelAOE']");

	private By AddMoreElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanelAOE_AddAoePanel']");
	
	private By AOEDropDownListElem = By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanelAOE_DropdownAoeList']");
	
	private By DatetoApplyFromElem = By.xpath("//input[@id='txtDate2applyFrom']");

	private By MonthlyAmountElem = By.xpath("//input[@id='txtMonthlyAmt']");
	
	private By TotalAmountToBePaidElem = By.xpath("//input[@id='txtTotalAmountToBePaid']");

	private By ProtectedEarningElem = By.xpath("//input[@id='txtProtectedEarning']");

	private By saveElement = By.xpath("//a[@id='btnSave']");

	private By closeButtonElem = By.xpath("//*[@id='PopUpClose1']");
	
	private By checkBoxElem = By.xpath("//input[@id='chAllAOE']");
			
	private By deleteBtnElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']");
	
	private By Enter_DateMadeElem = By.xpath("//input[@id='txtDatemade']");

	private By get_ER_pensionElem2 = By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[13]");
	
	
	
	
	
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
		 * Click click three dots
		 * @throws Exception 
	    * @name Click click three dots
	    */
		public void Click_click_three_dots() throws Exception
		{
	       
			WebElement elem = getWebElement(click_three_dotsElem);

			if (elem == null) {
	   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_click_three_dots", "Click_click_three_dots failed. Unable to locate object: " + click_three_dotsElem.toString());

	   		Assert.fail("Unable to locate object: " + click_three_dotsElem.toString());
	       }

			elem.click();
			Reporter.log("Clicked three dots. ");
			Thread.sleep(2000);
		
			ExtentReportManager.passStep(m_Driver, "Click_click_three_dots");

		}

	
	/**
 	 * Click Click_clickAdditionDeductionAOE
     * @name Click Click_clickAdditionDeductionAOE
     */
	public void Click_clickAdditionDeductionAOE()
	{
        
		WebElement elem = getWebElement(AdditionDeductionAOEElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAdditionDeductionAOE", "Click_clickAdditionDeductionAOE failed. Unable to locate object: " + AdditionDeductionAOEElem.toString());

    		
			Assert.fail("Unable to locate object: " + AdditionDeductionAOEElem.toString());
        }

		elem.click();
		Reporter.log("Addition/Deduction/AOE clicked.");
		ExtentReportManager.passStep(m_Driver, "Click_clickAdditionDeductionAOE");

		}
	
	
	/**
 	 * Click Click_Check_toDeleteAdditionPayment
	 * @throws Exception 
     * @name Click Click_Check_toDeleteAdditionPayment
     */
	public void Click_Check_toDeleteAOE() throws Exception
	{
        
		WebElement elem = getWebElement(checkBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Check_toDeleteAOE", "Click_Check_toDeleteAOE failed. Unable to locate object: " + checkBoxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Check_toDeleteAOE", "Click_Check_toDeleteAOE failed. Unable to locate object: " + checkBoxElem.toString());

			Assert.fail("Unable to locate object: " + checkBoxElem.toString());
        }
		
		elem.click();
		System.out.println("3"); 	
		Thread.sleep(2000);
		Reporter.log("Check to Delete Addition Payment");
		ExtentReportManager.passStep(m_Driver, "Click_Check_toDeleteAOE");

		TestModellerLogger.PassStep(m_Driver, "Click_Check_toDeleteAOE");
	} 
	
	
	
	/**
 	 * Click Click_DeleteBtnAOE
	 * @throws Exception 
     * @name Click Click_DeleteBtnAOE
     */
	public void Click_DeleteBtnAOE() throws Exception
	{
        
		WebElement elem = getWebElement(deleteBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DeleteBtnAOE", "Click_DeleteBtnAOE failed. Unable to locate object: " + deleteBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DeleteBtnAOE", "Click_DeleteBtnAOE failed. Unable to locate object: " + deleteBtnElem.toString());

			Assert.fail("Unable to locate object: " + deleteBtnElem.toString());
        }
		
//		JavascriptExecutor js =(JavascriptExecutor)m_Driver;
//////    js.executeScript("window.scrollBy(0, 500)","");
//		js.executeScript("window.scrollBy(0, document.body.scrollHeight)","");
		Thread.sleep(2000);
		elem.click();
		Thread.sleep(2000);
		m_Driver.switchTo().alert().accept();
		System.out.println("deleted"); 	
		Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "Click_DeleteBtnAOE");

		TestModellerLogger.PassStep(m_Driver, "Click_DeleteBtnAOE");
	} 
	
	
	
	
	
	
	/**
 	 * Click Click_clickAOE
	 * @throws InterruptedException 
     * @name Click Click_clickAOE
     */
	public void Click_clickAOE() throws InterruptedException
	{
        
		WebElement elem = getWebElement(AOEelem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAOE", "Click_clickAOE failed. Unable to locate object: " + AOEelem.toString());

    		
			Assert.fail("Unable to locate object: " + AOEelem.toString());
        }

			elem.click();
		
 			Thread.sleep(1000);
 			Reporter.log("Clicked AOE.");

		ExtentReportManager.passStep(m_Driver, "Click_clickAOE");

		}

	
	
	
	/**
 	 * Click Click_clickAddMore
	 * @throws InterruptedException 
     * @name Click Click_clickAddMore
     */
	public void Click_clickAddMore() throws InterruptedException
	{
        
		WebElement elem = getWebElement(AddMoreElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAddMore", "Click_clickAddMore failed. Unable to locate object: " + AddMoreElem.toString());

    		
			Assert.fail("Unable to locate object: " + AddMoreElem.toString());
        }

			elem.click();
		
 			Thread.sleep(1000);
 			Reporter.log("Clicked AddMore.");

		ExtentReportManager.passStep(m_Driver, "Click_clickAddMore");

		}
	
	
	
      
	
 	
 	
 	
 	
 	
 	
 	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
 		
		WebElement elem = getWebElement(saveElement);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + saveElement.toString());

    		Assert.fail("Unable to locate object: " + saveElement.toString());
        }

 		Thread.sleep(1000);
	//	elem.click();
 		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
 		jsExec.executeScript("arguments[0].click();", elem);
 		
 		Thread.sleep(15000);
 		
 		Reporter.log("save clicked");

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");
		m_Driver.switchTo().defaultContent();
	}
	
	
	

 	/**
 	 * Click Click_closeButton
	 * @throws InterruptedException 
     * @name Click Click_closeButton
     */
	public void Click_closeButton() throws InterruptedException
	{
        
		WebElement elem = getWebElement(closeButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_closeButton", "Click_closeButton failed. Unable to locate object: " + closeButtonElem.toString());

    		Assert.fail("Unable to locate object: " + closeButtonElem.toString());
        }

 	
		elem.click();
 		
 		Thread.sleep(1000);
 		
 		Reporter.log("Pop Up Closed.");

		ExtentReportManager.passStep(m_Driver, "Click_closeButton");
	
	}
	
	
	
	
	
	/**
	    * Click click_MandatoryPayrollInformation
	    * @throws InterruptedException 
	    * 
	    */
	   public void click_MandatoryPayrollInformation() throws InterruptedException
	   {
		   
		   jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span")));
		   Reporter.log("Click Mandatory Payroll Information");
		   m_Driver.findElement(By.xpath("//li[@id='limpi']/a")).click();
		  // jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtDirectorStartDate']")));
		   Thread.sleep(1000);
		   
	   }
	   
	   
	   
	   
	   /**
	 	 * Enter Enter_DatetoApplyFrom
		 * @throws InterruptedException 
	     * @name Enter Enter_DatetoApplyFrom
	     */
	 	public void Enter_DatetoApplyFrom(String DatetoApplyFrom) throws InterruptedException
	 	{
	 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
	 		System.out.println("inframe");
	 		WebElement elem = getWebElement(DatetoApplyFromElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DatetoApplyFrom", "Enter_DatetoApplyFrom failed. Unable to locate object: " + DatetoApplyFromElem.toString());

	    		Assert.fail("Unable to locate object: " + DatetoApplyFromElem.toString());
	         }
//	 		List<WebElement>list=m_Driver.findElements(By.xpath("//input[@id='txtDate2applyFrom']"));
//	 		
//	 		System.out.println(list.size());
//	 		WebElement elem1 = list.get(0);
//	 		System.out.println("frame");
	 			 
	 			elem.sendKeys(DatetoApplyFrom);

	 		Thread.sleep(2000);
//	 		elem.click();
	 		Reporter.log("Entered Dateto Apply From.");
	 		Thread.sleep(3000);
	 		
	  		ExtentReportManager.passStep(m_Driver, "Enter_DatetoApplyFrom " + DatetoApplyFrom);
	  		m_Driver.switchTo().defaultContent();
	 		
	  		
	 	}
	 	
	   
	   
	   
	   
	   
	   /**
	 	 * Enter Enter_DateMade
		 * @throws InterruptedException 
	     * @name Enter Enter_DateMade
	     */
	 	public void Enter_DateMade(String Enter_DateMade) throws InterruptedException
	 	{
	 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
	 		System.out.println("inframe");
	 		WebElement elem = getWebElement(Enter_DateMadeElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DateMade", "Enter_DateMade failed. Unable to locate object: " + Enter_DateMadeElem.toString());

	    		Assert.fail("Unable to locate object: " + Enter_DateMadeElem.toString());
	         }
//	 		List<WebElement>list=m_Driver.findElements(By.xpath("//input[@id='txtDate2applyFrom']"));
//	 		
//	 		System.out.println(list.size());
//	 		WebElement elem1 = list.get(0);
//	 		System.out.println("frame");
	 			 
	 			elem.sendKeys(Enter_DateMade);

	 		Thread.sleep(2000);
//	 		elem.click();
	 		Reporter.log("Entered DateMade.");
	 		Thread.sleep(3000);
	 		
	  		ExtentReportManager.passStep(m_Driver, "Enter_DateMade " + Enter_DateMade);
	  		m_Driver.switchTo().defaultContent();
	 		
	  		
	 	}
	 	
	 	
	 	
	 	
	 	 /**
	 	 * Enter Enter_MonthlyAmount
		 * @throws InterruptedException 
	     * @name Enter Enter_MonthlyAmount
	     */
	 	public void Enter_MonthlyAmount(String MonthlyAmount) throws InterruptedException
	 	{
	 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
	 		
	 		WebElement elem = getWebElement(MonthlyAmountElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_MonthlyAmount", "Enter_MonthlyAmount failed. Unable to locate object: " + MonthlyAmountElem.toString());

	    		Assert.fail("Unable to locate object: " + MonthlyAmountElem.toString());
	         }
	 		jsExec.executeScript("arguments[0].scrollIntoView();",elem);
	 		
	 		elem.sendKeys(MonthlyAmount);
	 		
	 		
	 		Reporter.log("Entered MonthlyAmount.");
	 		Thread.sleep(3000);
	 		
	  		ExtentReportManager.passStep(m_Driver, "Enter_MonthlyAmount " + MonthlyAmount);
	  		m_Driver.switchTo().defaultContent();
	  		
	 	}
	 	
	 	
	 	
	 	
	 	
	 	 /**
	 	 * Enter Enter_MonthlyAmount
		 * @throws InterruptedException 
	     * @name Enter Enter_MonthlyAmount
	     */
	 	public void Enter_TotalAmountToBePaid(String TotalAmountToBePaid) throws InterruptedException
	 	{
	 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
	 		
	 		WebElement elem = getWebElement(TotalAmountToBePaidElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_TotalAmountToBePaid", "Enter_TotalAmountToBePaid failed. Unable to locate object: " + TotalAmountToBePaidElem.toString());

	    		Assert.fail("Unable to locate object: " + TotalAmountToBePaidElem.toString());
	         }
	 		jsExec.executeScript("arguments[0].scrollIntoView();",elem);
	 		
	 		elem.sendKeys(TotalAmountToBePaid);
	 		
	 		
	 		Reporter.log("Entered MonthlyAmount.");
	 		Thread.sleep(3000);
	 		
	  		ExtentReportManager.passStep(m_Driver, "Enter_TotalAmountToBePaid " + TotalAmountToBePaid);
	  		m_Driver.switchTo().defaultContent();
	  		
	 	}
	 	
	 	
	 	
	 	
	 	
	 	/**
	 	 * Enter Enter_ProtectedEarning
		 * @throws InterruptedException 
	     * @name Enter Enter_ProtectedEarning
	     */
	 	public void Enter_ProtectedEarning(String protectedEarning) throws InterruptedException
	 	{
	 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
	 		
	 		WebElement elem = getWebElement(ProtectedEarningElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ProtectedEarning", "Enter_ProtectedEarning failed. Unable to locate object: " + ProtectedEarningElem.toString());

	    		Assert.fail("Unable to locate object: " + ProtectedEarningElem.toString());
	         }
	 		

	 		elem.sendKeys(protectedEarning);
	 		
	 		
	 		Reporter.log("Entered Protected Earning.");
	 		Thread.sleep(3000);
	 		
	  		ExtentReportManager.passStep(m_Driver, "Enter_ProtectedEarning " + protectedEarning);
	  		m_Driver.switchTo().defaultContent();
	  		
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	/**
	 	 * Select Select_AOEDropDownList
	     * @name Select Select_AOEDropDownList
	     */
	    public void Select_AOEDropDownList(String SelectAOEList)
	 	{
	 	    
	 		WebElement elem = getWebElement(AOEDropDownListElem);

	 		if (elem == null) 
	 		{
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_AOEDropDownList", "Select_AOEDropDownList failed. Unable to locate object: " + AOEDropDownListElem.toString());

	    		Assert.fail("Unable to locate object: " + AOEDropDownListElem.toString());
	         }
	 		elem.click();
	 		Select dropdown = new Select(elem);

	 		dropdown.selectByVisibleText(SelectAOEList);
	 		
	 		Reporter.log("AOE DropDown List Selected.");
	 		
	 		ExtentReportManager.passStep(m_Driver, "Select_AOEDropDownList " + SelectAOEList);

	 		}
	    
	    
	    
	    /**
	 	 * Click gotoPayrollDashboard
		 * @throws InterruptedException 
	     * @name Click gotoPayrollDashboard
	     */
		public void Click_gotoPayrollDashboard() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(gotoPayrollDashboardElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

				Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
	        }
			
			Thread.sleep(2000);
			
			jsExec.executeScript("arguments[0].scrollIntoView();", elem);
			jsExec.executeScript("arguments[0].click();", elem);

			Reporter.log("Payroll DashBoard.");
			          	

			ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

			TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
		}
	 	
	 	
}
