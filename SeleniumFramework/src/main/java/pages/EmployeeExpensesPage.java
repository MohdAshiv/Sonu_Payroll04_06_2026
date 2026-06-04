package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class EmployeeExpensesPage extends BasePage{
	
	
	
	
	public EmployeeExpensesPage (WebDriver driver)
	{
		super(driver);
	}


	
	private By Employer_ViewElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By expensesElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployeeExpense']");

	private By AddElem = By.xpath("//*[text()='Add']");

	private By ClickOnEmployeeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");

	private By descriptionElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDesc']");

	private By expenseTypeElem = By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_ltAdditionAccount']");
	
	private By amountElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAmount']");
	
	private By dateElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDate']");
	
	private By Add2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkDraft']");
	
	private By checkboxElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkHeader']");
	
	private By applyForApprovalElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnApproval']");
	
	private By employeeDasboardElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployeeDashboard']");

	private By employerDasboardElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefMyDashboard']");
		
	private By cancelElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkCancel']");
	
	private By upload_fileElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_FileUploadSlip']");
	
	private By uploadElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkUpload']");
	
	private By NotificationExpenseElem = By.xpath("//div[@class='dropdown dashOpt-e0 search_filter_each']/a");
		
	private By emaillog = By.xpath("//li[@class='dropdown profile_dropdown']/a/div/img");
	
	private By emaillogselect = By.xpath("//a[@id='hrefInbox']");
	
	private By emaillogfirstsubj = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail_sub']");
	
	private By expenseElem = By.xpath("//div[@class='dropdown-content drp-border']/ul/li[2]/a");
	
	private By deleteBtnElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrExpnseDetails_ctl00_lnkDelete']");
	
	private By DeleteBtn2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkDelete']");
	
	
	private By cancelBtn2Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkCancel']");
	
	private By emailelemforP45 = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkP45Email']");
	
	private By selectEmployeeElem = By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']");
	
	private By UnCheckPeriodElem = By.xpath("//input[@id='SelectAllRecord']");
	
	private By CheckAprElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportEmployeePayHistoryDeatilsUC_rptrDisplayRecords_ctl00_chkGenerate']");
	
	
	private By IndividualEmpPayscheduleElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
	
	private By checkJulyPeriodElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportEmployeePayHistoryDeatilsUC_rptrDisplayRecords_ctl01_chkGenerate']");
	
	private By FirstEmployeeElem = By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
	
	private By EmployeeReports_Elem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployeeDashboardReports']");
	
	private By EmailP45EmployeeDashBoardElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkP45Email']");
	
	
	private By Individual_Employee_Pay_ScheduleEEDashBoardElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_hrefReportEmployeePayHistoryDeatils']");
	
	private By EmailIEPSEmployeeDashBoardElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
	
	private By EEDashBoardP60P45P11D_FormsElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");
	
	private By selectp60p45p11d_FormsEEDashBoardElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_ddlForm']");
	
	private By EmailP60EmployeeDashBoardElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LinkButtonEx1']");
	
	
	private By EmailP11DEmployeeDashBoardElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkP11DEmail']");
	
	private By TaxYearElem = By.xpath("//select[@id='ctl00_ctl00_ParentContent_ddlTaxYears']");
	
	private By ExpensesFlow = By.xpath("//a[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefEmployerDashboardExpenses']");
	
	utilities.WaitUtility _wait = new utilities.WaitUtility();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

     
	/**
 	 * Click Employer View
     * @name Click Employer View
     */
	public void Click_Employer_View()
	{
        
		WebElement elem = getWebElement(Employer_ViewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employer_View", "Click_Employer_View failed. Unable to locate object: " + Employer_ViewElem.toString());

			Assert.fail("Unable to locate object: " + Employer_ViewElem.toString());
        }

		elem.click();
        
		ChangeWindow.tabswitch(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_Employer_View");

		TestModellerLogger.PassStep(m_Driver, "Click_Employer_View");
	}

      
	
	
	
	
	/**
 	 * Click_OnFirstEmployee
	 * @throws InterruptedException 
     * @name Click_OnFirstEmployee
     */
	public void Click_OnFirstEmployee() throws InterruptedException
	{
        
		WebElement elem = getWebElement(FirstEmployeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_OnFirstEmployee", "Click_OnFirstEmployee failed. Unable to locate object: " + FirstEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_OnFirstEmployee", "Click_OnFirstEmployee failed. Unable to locate object: " + FirstEmployeeElem.toString());

			Assert.fail("Unable to locate object: " + FirstEmployeeElem.toString());
        }

		elem.click();
        
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_OnFirstEmployee");

		TestModellerLogger.PassStep(m_Driver, "Click_OnFirstEmployee");
	}

	
	
	
	
	
	
	
	
	
	/**
 	 * Click ClickOnEmployee
     * @name Click ClickOnEmployee
     */
	public void Click_ClickOnEmployee()
	{
        
		WebElement elem = getWebElement(ClickOnEmployeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnEmployee", "Click_ClickOnEmployee failed. Unable to locate object: " + ClickOnEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnEmployee", "Click_ClickOnEmployee failed. Unable to locate object: " + ClickOnEmployeeElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnEmployeeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnEmployee");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnEmployee");
	}

     
	public void SwitchToAgentTab() 
	{
		
		ChangeWindow.Switchwindow(1, m_Driver);
		
	}
	public void SwitchToClientTab() 
	{
		
		ChangeWindow.Switchwindow(2, m_Driver);
		
	}
	
	
	public void SwitchToClientTab1() 
	{
		
		ChangeWindow.Switchwindow(3, m_Driver);
		
	}
	
	
	
	public void SwitchToERViewTab1() 
	{
		
		ChangeWindow.Switchwindow(4, m_Driver);
		
	}
	
	public void click_ToMailLog() {
		
		
		
		WebElement elem = getWebElement(emaillog);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_ToMailLog", "click_ToMailLog failed. Unable to locate object: " + emaillog.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "click_ToMailLog", "click_ToMailLog failed. Unable to locate object: " + emaillog.toString());

			Assert.fail("Unable to locate object: " + emaillog.toString());
	    }
		
		System.out.println("click_ToMailLog_1");

		elem.click();
	      	

		ExtentReportManager.passStep(m_Driver, "click_ToMailLog");

		TestModellerLogger.PassStep(m_Driver, "click_ToMailLog");
		
	}
	
	
	
	
	
	
	public void click_onMailLog() throws InterruptedException {
		
		
		
		WebElement elem = getWebElement(emaillogselect);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_onMailLog", "click_onMailLog failed. Unable to locate object: " + emaillogselect.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "click_onMailLog", "click_onMailLog failed. Unable to locate object: " + emaillogselect.toString());

			Assert.fail("Unable to locate object: " + emaillogselect.toString());
	    }

		elem.click();
		System.out.println("click_onMailLog");

		ExtentReportManager.passStep(m_Driver, "click_onMailLog");

		TestModellerLogger.PassStep(m_Driver, "click_onMailLog");
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	

public void clickon_firstemailsub() throws InterruptedException {
	
	WebElement elem = getWebElement(emaillogfirstsubj);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickon_firstemailsub", "clickon_firstemailsub failed. Unable to locate object: " + emaillogfirstsubj.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "clickon_firstemailsub", "clickon_firstemailsub failed. Unable to locate object: " + emaillogfirstsubj.toString());

		Assert.fail("Unable to locate object: " + emaillogfirstsubj.toString());
    }
	System.out.println("clickon_firstemailsub");
	elem.click();
	
	System.out.println("I am clicked");
	Thread.sleep(3000);
      	
	Reporter.log("Go to mail log and click firstmailsub");
	ExtentReportManager.passStep(m_Driver, "clickon_firstemailsub");

	TestModellerLogger.PassStep(m_Driver, "clickon_firstemailsub");
	
	
	
}
	
	
	
	
	
	

	public void click_Expenses() {
		
		
		
		WebElement elem = getWebElement(expensesElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_Expenses", "click_Expenses failed. Unable to locate object: " + expensesElem.toString());

			
			Assert.fail("Unable to locate object: " + expensesElem.toString());
	    }
		
		System.out.println("click_Expenses");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, expensesElem);
		elem.click();
	      	

		ExtentReportManager.passStep(m_Driver, "click_ToMailLog");

		TestModellerLogger.PassStep(m_Driver, "click_ToMailLog");
		
	}
	
	
	
	
	
	
	
	
	
	
	public void click_Add() {
		
		
		
		WebElement elem = getWebElement(AddElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_Add", "click_Add failed. Unable to locate object: " + AddElem.toString());

			
			Assert.fail("Unable to locate object: " + AddElem.toString());
	    }
		
		System.out.println("click_Expenses");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, AddElem);
		elem.click();
	      	

		ExtentReportManager.passStep(m_Driver, "click_Add");

		TestModellerLogger.PassStep(m_Driver, "click_ToMailLog");
		
	}
	
	
	
	
	
	
	
	
	
	public void click_DeleteButton() {
		
		
		
		WebElement elem = getWebElement(deleteBtnElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_DeleteButton", "click_DeleteButton failed. Unable to locate object: " + deleteBtnElem.toString());

			
			Assert.fail("Unable to locate object: " + deleteBtnElem.toString());
	    }
		
		System.out.println("click_DeleteButton");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, deleteBtnElem);
		elem.click();
	      	

		ExtentReportManager.passStep(m_Driver, "click_DeleteButton");

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
 	 * Select Select_ExpenseType
     * @name Select Select_ExpenseType
     */
    public void Select_ExpenseType(String ExpenseType)
 	{
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
 		WebElement elem = getWebElement(expenseTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + expenseTypeElem.toString());

    		
 			Assert.fail("Unable to locate object: " + expenseTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ExpenseType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ExpenseType " + ExpenseType);
 		m_Driver.switchTo().defaultContent();
 		
 	}
	
	
	
	
	
	/**
 	 * Enter Enter_Description
     * @name Enter Enter_Description
     */
 	public void Enter_Description(String Description)
 	{
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
 		WebElement elem = getWebElement(descriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + descriptionElem.toString());

    		
 			Assert.fail("Unable to locate object: " + descriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);
  		m_Driver.switchTo().defaultContent();
  		
 	}

     
	
 	
 	
 	
 	
 	
 	
 	
	/**
 	 * Enter Enter_Amount
     * @name Enter Enter_Amount
     */
 	public void Enter_Amount(String Amount)
 	{
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
 		WebElement elem = getWebElement(amountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + amountElem.toString());

    		
 			Assert.fail("Unable to locate object: " + amountElem.toString());
         }

 		elem.sendKeys(Amount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Amount " + Amount);
  		m_Driver.switchTo().defaultContent();
  		
 	}
	
 	
 	
 	
 	
 	
 	
 	
 	
 	/**
	 * Enter Enter_Date
	 * @throws Exception 
    * @name Enter Enter_Date
    */
	public void Enter_Date(String Date) throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
		
		WebElement elem = getWebElement(dateElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + dateElem.toString());

   		Assert.fail("Unable to locate object: " + dateElem.toString());
        }
		

		elem.sendKeys(Date);
		Thread.sleep(1000);
		
		elem.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);
  		m_Driver.switchTo().defaultContent();
 		
 			}
	
	
	
	
	
	
	
	
	
	
	
	
public void click_UploadFile() throws Exception {
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
		WebElement elem = getWebElement(upload_fileElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_UploadFile", "click_UploadFile failed. Unable to locate object: " + upload_fileElem.toString());

			
			Assert.fail("Unable to locate object: " + upload_fileElem.toString());
	    }
		
		System.out.println("click_Add2");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, upload_fileElem);
		elem.sendKeys("E:\\vikash\\Employee Payslip - A last[21990] - 2021-04-30.pdf");
	    Thread.sleep(5000);
	     Reporter.log("click_UploadFile");
		ExtentReportManager.passStep(m_Driver, "click_UploadFile");

		m_Driver.switchTo().defaultContent();
		
	}
	
	
	
	
	
	
	
	
	
	
	public void click_Add2() throws Exception {
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
		WebElement elem = getWebElement(Add2Elem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_Add2", "click_Add2 failed. Unable to locate object: " + Add2Elem.toString());

			
			Assert.fail("Unable to locate object: " + Add2Elem.toString());
	    }
		
		System.out.println("click_Add2");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, Add2Elem);
		elem.click();
	     Thread.sleep(5000);

		ExtentReportManager.passStep(m_Driver, "click_Add");

		m_Driver.switchTo().defaultContent();
		
	}
	
	
	
	
	
	
	
public void click_Upload() throws Exception {
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
		WebElement elem = getWebElement(uploadElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_Upload", "click_Upload failed. Unable to locate object: " + uploadElem.toString());

			
			Assert.fail("Unable to locate object: " + uploadElem.toString());
	    }
		
		System.out.println("click_Upload");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, uploadElem);
		elem.click();
	     Thread.sleep(5000);

		ExtentReportManager.passStep(m_Driver, "click_Upload");

		m_Driver.switchTo().defaultContent();
		
	}
	
	
	
	
	
	
	
	public void click_Cancel() throws Exception {
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddExpensesModalFrame']")));
		WebElement elem = getWebElement(cancelElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "click_Cancel", "click_Cancel failed. Unable to locate object: " + cancelElem.toString());

			
			Assert.fail("Unable to locate object: " + cancelElem.toString());
	    }
		
		System.out.println("click_Cancel");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, cancelElem);
		elem.click();
	    Thread.sleep(5000);
	    Reporter.log("Click Cancel button.");
		ExtentReportManager.passStep(m_Driver, "click_Cancel");

		m_Driver.switchTo().defaultContent();
		
	}
	
	
	
	
	
	
	
public void Check_Expenses() {
		
		
		
		WebElement elem = getWebElement(checkboxElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Check_Expenses", "Check_Expenses failed. Unable to locate object: " + checkboxElem.toString());

			
			Assert.fail("Unable to locate object: " + checkboxElem.toString());
	    }
		
		System.out.println("click_Expenses");
		_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, checkboxElem);
		elem.click();
	      	

		ExtentReportManager.passStep(m_Driver, "Check_Expenses");
		
	}
	








public void Click_ApplyForApproval() {
	
	
	
	WebElement elem = getWebElement(applyForApprovalElem);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ApplyForApproval", "Click_ApplyForApproval failed. Unable to locate object: " + applyForApprovalElem.toString());

		
		Assert.fail("Unable to locate object: " + applyForApprovalElem.toString());
    }
	
	System.out.println("Click_ApplyForApproval");
	_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, applyForApprovalElem);
	elem.click();
      	

	ExtentReportManager.passStep(m_Driver, "Click_ApplyForApproval");
	
}
	










public void Click_EmployeeDasboard() {
	
	
	
	WebElement elem = getWebElement(employeeDasboardElem);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmployeeDasboard", "Click_EmployeeDasboard failed. Unable to locate object: " + employeeDasboardElem.toString());

		
		Assert.fail("Unable to locate object: " + employeeDasboardElem.toString());
    }
	
	System.out.println("Click_ApplyForApproval");
	_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, employeeDasboardElem);
	elem.click();
      	

	ExtentReportManager.passStep(m_Driver, "Click_EmployeeDasboard");
	
}


















public void Click_EmployerDasboard() {
	
	
	
	WebElement elem = getWebElement(employerDasboardElem);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmployerDasboard", "Click_EmployerDasboard failed. Unable to locate object: " + employerDasboardElem.toString());

		
		Assert.fail("Unable to locate object: " + employerDasboardElem.toString());
    }
	
	System.out.println("Click_EmployerDasboard");
	_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, employerDasboardElem);
	elem.click();
      	

	ExtentReportManager.passStep(m_Driver, "Click_EmployerDasboard");
	
}









public void Click_NotificationExpense() {
	
	
	
	WebElement elem = getWebElement(NotificationExpenseElem);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NotificationExpense", "Click_NotificationExpense failed. Unable to locate object: " + NotificationExpenseElem.toString());

		
		Assert.fail("Unable to locate object: " + NotificationExpenseElem.toString());
    }
	
	
	

        Actions actions = new Actions(m_Driver);
        actions.doubleClick(elem ).perform();

	
	
	
	
//	System.out.println("Click_NotificationExpense");
//	_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, NotificationExpenseElem);
//	elem.click();
    Reporter.log("Click_NotificationExpense");

	ExtentReportManager.passStep(m_Driver, "Click_NotificationExpense");
	
}







public void Click_Expense() {
	
	
	
	WebElement elem = getWebElement(expenseElem);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expense", "Click_Expense failed. Unable to locate object: " + expenseElem.toString());

		
		Assert.fail("Unable to locate object: " + expenseElem.toString());
    }
	
	
	
	WebElement element = m_Driver.findElement(By.xpath("//div[@class='dropdown dashOpt-e0 search_filter_each']/a"));
        Actions actions = new Actions(m_Driver);
        actions.doubleClick(element ).perform();




	
	
	
	
	System.out.println("Click_Expense");
	_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, expenseElem);
	elem.click();
    Reporter.log("Click_Expense");

	ExtentReportManager.passStep(m_Driver, "Click_Expense");
	
}





public void click_DeleteBtn2() throws Exception {
	
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EditExpensesModalFrame']")));
	WebElement elem = getWebElement(DeleteBtn2Elem);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "click_DeleteBtn2", "click_DeleteBtn2 failed. Unable to locate object: " + DeleteBtn2Elem.toString());

		
		Assert.fail("Unable to locate object: " + DeleteBtn2Elem.toString());
    }
	
	System.out.println("click_DeleteBtn2");
	_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, DeleteBtn2Elem);
	elem.click();
     Thread.sleep(5000);

	ExtentReportManager.passStep(m_Driver, "click_DeleteBtn2");

	m_Driver.switchTo().defaultContent();
	
}





public void click_CancelBtn() throws Exception {
	
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EditExpensesModalFrame']")));
	WebElement elem = getWebElement(cancelBtn2Elem);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "click_CancelBtn", "click_CancelBtn failed. Unable to locate object: " + cancelBtn2Elem.toString());

		
		Assert.fail("Unable to locate object: " + cancelBtn2Elem.toString());
    }
	
	System.out.println("click_CancelBtn");
	_wait.explicitiWait_presenceOfElementLocated(m_Driver, 3, cancelBtn2Elem);
	elem.click();
     Thread.sleep(5000);

	ExtentReportManager.passStep(m_Driver, "click_CancelBtn");

	m_Driver.switchTo().defaultContent();
	
}













}
