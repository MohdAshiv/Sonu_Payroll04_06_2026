package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;

public class PayrollRun extends BasePage {

	public PayrollRun(WebDriver driver) {
		super(driver);
		
	}


	private By oneOffPaymentElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnOneOff']");

	private By checkEmployeeAElem = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_grdLeaverList_ctl02_chkSelect']");

    private By oneOffPmntSaveBtnElem = By.xpath("//div[@class='col-sm-12 col-xs-12']/a");
	
	private By payrollDahboardElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']/span");
	
	private By journalsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefJournals']");

	private By pensionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPension']/span");

	private By cancelElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnCancel']");
	
	private By runPayroll2Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");
	private By sendApproval= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSandforApproval']");
	private By sendBtn =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	
	private By closePopuElem= By.xpath("//*[@id='PopUpClose1']");
	
	private By selectPayrollSummaryElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ChkCompanySummary']");
	
	private By sendPayslip= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlPaySlipTemplate']");

	private By selectPayslipElem=By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_ChkPaySlip']");

	private By selectTaxYear=By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']");

	private By selectEmployee=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']");

    private By selectPeriodEnd=By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']");
    
    
    private By employerNoteElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefNotesHistory']/span");
    private By agentDashboard=By.xpath("//*[@id='payrollMenu']/a/span");

    private By agentPayrollDashboard=By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[1]/a");

    private By nextPageElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_PageUC1_rptrPager_ctl02_lnkPage']");
    
    private By NavigatenextPageElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_PageUC1_rptrPager_ctl06_lnkNext']");
    
    private By requestHrsElem=  By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRequestHours']");
	public void Click_PayrollDashboard() throws Exception
	{
		Thread.sleep(6000);

		WebElement elem = getWebElement(payrollDahboardElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PayrollDashboard", "Click_PayrollDashboard failed. Unable to locate object: " + payrollDahboardElem.toString());
    	Assert.fail("Unable to locate object: " + payrollDahboardElem.toString());
        }

		elem.click();
		Thread.sleep(7000);
		
		ClosePopup.ValidateAndPopUp(m_Driver);

		
		ExtentReportManager.passStep(m_Driver, "Click_PayrollDashboard");
		 Reporter.log("Click PayrollDashBoard");
	
	}
	
	
	
	
	
	public void ClickJournalsTab() throws Exception
	{
        
		WebElement elem = getWebElement(journalsElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickJournals", "ClickJournals failed. Unable to locate object: " + journalsElem.toString());
    	Assert.fail("Unable to locate object: " + journalsElem.toString());
        }

		elem.click();
		Thread.sleep(4000);
		
		ExtentReportManager.passStep(m_Driver, "ClickJournals");
		 Reporter.log("Click ClickJournals");
	
	}
	
	
	public void clickRequestHrs() throws Exception
	{
        
		WebElement elem = getWebElement(requestHrsElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRequestHrs", "clickRequestHrs failed. Unable to locate object: " + requestHrsElem.toString());
    	Assert.fail("Unable to locate object: " + requestHrsElem.toString());
        }

		elem.click();
		Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "clickRequestHrs");
		Reporter.log("clickRequestHrs");
	
	}
	
	public void SelectTaxYear(String data) throws Exception
	{
        
		WebElement elem = getWebElement(selectTaxYear);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "SelectTaxYear", "SelectTaxYear failed. Unable to locate object: " + selectTaxYear.toString());
    	Assert.fail("Unable to locate object: " + selectTaxYear.toString());
        }

		Thread.sleep(3000);
		Select sel = new Select(elem);
		sel.selectByVisibleText(data);
		Thread.sleep(4000);
		
		ExtentReportManager.passStep(m_Driver, "SelectTaxYear");
	   Reporter.log("SelectTaxYear");
	
	}
	
	
	public void SelectEmployee(String data) throws Exception
	{
        
		WebElement elem = getWebElement(selectEmployee);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "SelectEmployee", "SelectEmployee failed. Unable to locate object: " + selectEmployee.toString());
    	Assert.fail("Unable to locate object: " + selectEmployee.toString());
        }

		Thread.sleep(3000);
		Select sel = new Select(elem);
		sel.selectByVisibleText(data);
		Thread.sleep(4000);
		
		ExtentReportManager.passStep(m_Driver, "SelectEmployee");
	   Reporter.log("SelectEmployee");
	
	}
	
	
	
	public void SelecPeriodEndDate(String data) throws Exception
	{
        
		WebElement elem = getWebElement(selectPeriodEnd);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "SelecPeriodEndDate", "SelecPeriodEndDate failed. Unable to locate object: " + selectPeriodEnd.toString());
    	Assert.fail("Unable to locate object: " + selectPeriodEnd.toString());
        }

		Thread.sleep(3000);
		Select sel = new Select(elem);
		sel.selectByVisibleText(data);
		Thread.sleep(4000);
		ClosePopup.ValidateAndPopUp(m_Driver);

		ExtentReportManager.passStep(m_Driver, "SelecPeriodEndDate");
	   Reporter.log("SelecPeriodEndDate");
	
	}
	
	
	public void Click_PensionDashboard() throws Exception
	{
        
		WebElement elem = getWebElement(pensionElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PensionDashboard", "Click_PensionDashboard failed. Unable to locate object: " + pensionElem.toString());
    	Assert.fail("Unable to locate object: " + pensionElem.toString());
        }

		Thread.sleep(4000);
		elem.click();
		Thread.sleep(4000);
		
		ExtentReportManager.passStep(m_Driver, "Click_PensionDashboard");
		 Reporter.log("Click_PensionDashboard");
	
	}
	public void clickCancel()
	{
        
		WebElement elem = getWebElement(cancelElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCancel", "clickCancel failed. Unable to locate object: " + cancelElem.toString());
    	Assert.fail("Unable to locate object: " + cancelElem.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickCancel");
		 Reporter.log("Click Cancel");
	
	}
	
	
	public void clickViewDraftPayslip() throws InterruptedException
	{
        
		WebElement elem = getWebElement(By.xpath("//*[@id='hrefPreviewPayslips']"));

	

		elem.click();
		
		Thread.sleep(3000);
		
		ExtentReportManager.passStep(m_Driver, "clickCancel");
		 Reporter.log("clickViewDraftPayslip");
	
	}
	
	
	
	public void selectNumberOfEmployess(int num ,String xpath) throws InterruptedException
	{
        
		WebElement elem = getWebElement(By.xpath(xpath));

		elem.click();
		
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "selectNumberOfEmployess");
		Reporter.log("selectNumberOfEmployess");
	
	}
	
	

public void selectRequiredEmployeesAndUntickRest(int employeeCount) {

    List<WebElement> checkboxes = m_Driver.findElements(
            By.xpath("//span[contains(@class,'rowCheckbox')]//input[@type='checkbox']"));

    Assert.assertTrue(checkboxes.size() > 0,
            "No checkboxes found.");

    Assert.assertTrue(employeeCount <= checkboxes.size(),
            "Requested employee count is greater than available checkboxes.");

    Reporter.log("Total Checkboxes Found : " + checkboxes.size(), true);
    Reporter.log("Employees To Keep Selected : " + employeeCount, true);

    for (int i = 0; i < checkboxes.size(); i++) {

        WebElement checkbox = checkboxes.get(i);

        if (i < employeeCount) {

            // Keep selected
            if (!checkbox.isSelected()) {
                ((JavascriptExecutor) m_Driver)
                        .executeScript("arguments[0].click();", checkbox);
            }

            Reporter.log("Selected Employee : " + (i + 1), true);

        } else {

            // Untick remaining
            if (checkbox.isSelected()) {
                ((JavascriptExecutor) m_Driver)
                        .executeScript("arguments[0].click();", checkbox);
            }

            Reporter.log("Unticked Employee : " + (i + 1), true);
        }}
    }
	
	
	
	
	public void Run_Payroll() throws InterruptedException
	{
		ClosePopup.ValidateAndPopUp(m_Driver);

	    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']"));
	    
	    elem.click();
	    Thread.sleep(1000);
	    
	    WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']"));
	     elem1.click();
	    Thread.sleep(1000);
		ClosePopup.ValidateAndPopUp(m_Driver);

	    Reporter.log("Click Run Payroll");
	}
	
	public void runPayroll() throws InterruptedException
	{
		
		ClosePopup.ValidateAndPopUp(m_Driver);

	    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']"));
	    
	    elem.click();
	    Thread.sleep(5000);
	    
	    Reporter.log("Click Run Payroll");
	}
	
	public void selectPreviousPayrollPeriod() {

	    Select payrollDate = new Select(m_Driver.findElement(
	            By.xpath("//select[contains(@id,'ddlPayrollDate')]")));

	    List<WebElement> options = payrollDate.getOptions();

	    String selectedValue = payrollDate.getFirstSelectedOption().getText().trim();

	    for (int i = 0; i < options.size(); i++) {

	        if (options.get(i).getText().trim().equals(selectedValue)) {

	            Assert.assertTrue(i < options.size() - 1,
	                    "No previous payroll period available.");

	            String previousPeriod = options.get(i + 1).getText().trim();

	            payrollDate.selectByIndex(i + 1);

	            Reporter.log("Current Period  : " + selectedValue, true);
	            Reporter.log("Previous Period Selected : " + previousPeriod, true);

	            return;
	        }
	    }

	    Assert.fail("Unable to find currently selected payroll period.");
	}
	public void Undo_LastPayroll() throws InterruptedException
	{
		ClosePopup.ValidateAndPopUp(m_Driver);

		  WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(20));

	        WebElement quickAction = wait.until(
	        	    ExpectedConditions.elementToBeClickable(
	        	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/div/div[2]/button")
	        	    )
	        	);

	        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);
	        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);

		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']"));
		
		elem.click();
		Thread.sleep(3000);
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

		getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnUndo']")).click();
		 
		m_Driver.switchTo().alert().accept();
	    Thread.sleep(3000);
		m_Driver.switchTo().defaultContent();
		ClosePopup.ValidateAndPopUp(m_Driver);

	    Reporter.log("Click UndoLast Payroll");
	}
	
	
	public void Undo_LastPayrollWithSubmission() throws InterruptedException
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']"));
		
		elem.click();
		Thread.sleep(1000);
		
		m_Driver.switchTo().alert().accept();

		Thread.sleep(3000);
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

		getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnUndo']")).click();
		 
		m_Driver.switchTo().alert().accept();
	    Thread.sleep(3000);
		m_Driver.switchTo().defaultContent();

	    Reporter.log("Click UndoLast Payroll");
	}
	
	
	
	public void UndoPayroll() throws Exception
	{
		ClosePopup.ValidateAndPopUp(m_Driver);
		System.out.println("popup closed");
		  WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(20));

	        WebElement quickAction = wait.until(
	        	    ExpectedConditions.elementToBeClickable(
	        	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/div/div[2]/button")
	        	    )
	        	);

	        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);
	        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);

		//List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnUndoPayroll']"));
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnUndoPayroll']"));

		boolean condition = list.isEmpty();
		if(false==condition)
		{
			//WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnUndoPayroll']"));
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnUndoPayroll']"));

			elem.click();
			Thread.sleep(2000);
			 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

			getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnUndo']")).click();
			 
			m_Driver.switchTo().alert().accept();
		    Thread.sleep(1000);
			m_Driver.switchTo().defaultContent();

			m_Driver.navigate().refresh();
		    Thread.sleep(5000);
		    
			ClosePopup.ValidateAndPopUp(m_Driver);


			}
		
		else {
		System.out.println("Undo Btn not present");
		

	        WebElement quickAction1 = wait.until(
	        	    ExpectedConditions.elementToBeClickable(
	        	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/div/div[2]/button")
	        	    )
	        	);

	        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction1);
	        //	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction1);

	      
		}
	}
	
	
	public void UndoPayrollTillLast() throws Exception {
	    ClosePopup.ValidateAndPopUp(m_Driver);
	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(20));

	    while (true) {

	        ClosePopup.ValidateAndPopUp(m_Driver);

	        WebElement quickAction = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/div/div[2]/button")));

	        ((JavascriptExecutor) m_Driver).executeScript("arguments[0].click();", quickAction);

	        List<WebElement> list = m_Driver.findElements(
	                By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnUndoPayroll']"));

	        // Exit loop when Undo button is not present
	        if (list.isEmpty()) {
	            System.out.println("Undo Button not present. Exiting loop.");
	            break;
	        }

	        WebElement elem = list.get(0);
	        ((JavascriptExecutor) m_Driver).executeScript("arguments[0].click();", elem);

	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
	                By.id("PopUndoPayrollFrame")));

	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.id("ctl00_ctl00_ParentContent_cphFooter_btnUndo"))).click();

	        wait.until(ExpectedConditions.alertIsPresent()).accept();

	        m_Driver.switchTo().defaultContent();

	        m_Driver.navigate().refresh();

	        Thread.sleep(5000);
	    }
	}
	
	public void runPayroll2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(runPayroll2Elem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "runPayroll2", "runPayroll2 failed. Unable to locate object: " + runPayroll2Elem.toString());
    	Assert.fail("Unable to locate object: " + runPayroll2Elem.toString());
        }

		elem.click();
		Thread.sleep(6000);
		
		ClosePopup.ValidateAndPopUp(m_Driver);

		ExtentReportManager.passStep(m_Driver, "runPayroll2");
		Reporter.log("Click Run Payroll2");
	
		
	
}
	

	public void runPayroll_2() throws InterruptedException
	{
        
		WebElement elem = getWebElement(runPayroll2Elem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "runPayroll2", "runPayroll2 failed. Unable to locate object: " + runPayroll2Elem.toString());
    	Assert.fail("Unable to locate object: " + runPayroll2Elem.toString());
        }

		elem.click();Thread.sleep(12000);
		
		
		ExtentReportManager.passStep(m_Driver, "runPayroll2");
		Reporter.log("Click Run Payroll2");
	
	
}
	
	
	public void clickSendApprovalBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(sendApproval);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSendApprovalBtn", "clickSendApprovalBtn failed. Unable to locate object: " + sendApproval.toString());
    	Assert.fail("Unable to locate object: " + sendApproval.toString());
        }

		elem.click();
		Thread.sleep(6000);
		
		ExtentReportManager.passStep(m_Driver, "clickSendApprovalBtn");
		Reporter.log("clickSendApprovalBtn");
	
}
	
	public void selectPayrollSummaryAndSend() throws Exception
	{
		//  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(selectPayrollSummaryElem);

			if (elem == null) {
	    	ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPayrollSummary", "selectPayrollSummary failed. Unable to locate object: " + selectPayrollSummaryElem.toString());
	    	Assert.fail("Unable to locate object: " + selectPayrollSummaryElem.toString());
	        }

//			Thread.sleep(2000);
//			elem.click();
	//		Thread.sleep(3000);
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

			Thread.sleep(5000);
			
			ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
		
		 
		    Reporter.log("Select PayrollSummary And Send Btn");
		    m_Driver.switchTo().defaultContent();
	        Reporter.log("Select Payroll Summary checkbox and Click Send");
		
	}
	
	
	public void sendEmailFromRunPayroll() throws Exception
	{
		    m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

			Thread.sleep(5000);
		
			ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
		    m_Driver.switchTo().defaultContent();
		    
	        Reporter.log("sendEmailToMainContact");
		
	}
	
	public void sendEmailFromRunPayroll1() throws Exception
	{
		    m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmployee']")));

			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

			Thread.sleep(5000);
		
			ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
		    m_Driver.switchTo().defaultContent();
		    
	        Reporter.log("sendEmailToMainContact");
		
	}
	
	public void additionalEmail(String data) throws Exception
	{
		    m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

              WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEmail']"));
		    
              elem.sendKeys(data);
			Thread.sleep(5000);
		
			ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
		    m_Driver.switchTo().defaultContent();
		    
	        Reporter.log("sendEmailToMainContact");
		
	}
	
	
	public void additionalEmail1(String data) throws Exception
	{
	    m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmployee']")));

              WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEmail']"));
		    
              elem.sendKeys(data);
			Thread.sleep(5000);
		
			ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
		    m_Driver.switchTo().defaultContent();
		    
	        Reporter.log("sendEmailToMainContact");
		
	}
	
	
	public void CancelEmail() throws Exception
	{
		    m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

              WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		    
              elem.click();
			Thread.sleep(5000);
		
			ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
		    m_Driver.switchTo().defaultContent();
		    
	        Reporter.log("sendEmailToMainContact");
		
	}
	
	
	
	
	public void uncheckPayrollSummaryAndSend() throws Exception
	{
		//  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(selectPayrollSummaryElem);

			if (elem == null) {
	    	ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPayrollSummary", "selectPayrollSummary failed. Unable to locate object: " + selectPayrollSummaryElem.toString());
	    	Assert.fail("Unable to locate object: " + selectPayrollSummaryElem.toString());
	        }

			Thread.sleep(2000);
			jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

			elem.click();
			Thread.sleep(3000);
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

			Thread.sleep(5000);
			
			ExtentReportManager.passStep(m_Driver, "uncheckPayrollSummaryAndSend");
		
		 
		    Reporter.log("uncheckPayrollSummaryAndSend");
		    m_Driver.switchTo().defaultContent();
	        Reporter.log("Click Send Btn");
		
	}
	
	
	public void uncheckPayrollSummary() throws Exception
	{
		//  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement elem = getWebElement(selectPayrollSummaryElem);

			if (elem == null) {
	    	ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPayrollSummary", "selectPayrollSummary failed. Unable to locate object: " + selectPayrollSummaryElem.toString());
	    	Assert.fail("Unable to locate object: " + selectPayrollSummaryElem.toString());
	        }

			Thread.sleep(2000);
			jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

			elem.click();
			Thread.sleep(3000);
			
		
		 
		    Reporter.log("uncheckPayrollSummary");
		    m_Driver.switchTo().defaultContent();
	        Reporter.log("Click Send Btn");
		
	}
	
	
	public void uncheckPayslipAndSend() throws Exception
	{
		//  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		
			WebElement elem = getWebElement(selectPayslipElem);

			if (elem == null) {
	    	ExtentReportManager.failStepWithScreenshot(m_Driver, "uncheckPayslipAndSend", "uncheckPayslipAndSend failed. Unable to locate object: " + selectPayslipElem.toString());
	    	Assert.fail("Unable to locate object: " + selectPayslipElem.toString());
	        }

			Thread.sleep(3000);
			
			jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
            elem.click();
			Thread.sleep(3000);
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

			Thread.sleep(5000);
			
			ExtentReportManager.passStep(m_Driver, "uncheckPayrollSummaryAndSend");
		
		 
		    Reporter.log("uncheckPayslipAndSend");
		    m_Driver.switchTo().defaultContent();
	        Reporter.log("Click Send Btn");
		
	}
	
	public void clickPayrollSummary()
	{
		  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		  
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_dvsummary']/div[2]/table/tbody/tr[1]/td[2]/label/a"));
		 elem.click();
		
		 
		Reporter.log("Click PayrollSummary");
		 m_Driver.switchTo().defaultContent();
	
		
	}
	
	public void closePopup() throws Exception
	{
        
		WebElement elem = getWebElement(closePopuElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "closePopup", "closePopup failed. Unable to locate object: " + closePopuElem.toString());
    	Assert.fail("Unable to locate object: " + closePopuElem.toString());
        }

		elem.click();
		 Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "closePopup");
		 Reporter.log("Click ClosePopup");
	
	}
	
	public void clickNextPage() throws Exception
	{
		
        
		WebElement elem = getWebElement(nextPageElem);

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNextPage", "clickNextPage failed. Unable to locate object: " + nextPageElem.toString());
    	Assert.fail("Unable to locate object: " + nextPageElem.toString());
        }

		elem.click();
		 Thread.sleep(7000);
		ExtentReportManager.passStep(m_Driver, "closePopup");
		 Reporter.log("clickNextPage");
	
	}
	
	
	

	public void NavigateNextPage() throws Exception
	{
		
        
		WebElement elem = getWebElement(NavigatenextPageElem);

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "NavigateNextPage", "NavigateNextPage failed. Unable to locate object: " + NavigatenextPageElem.toString());
    	Assert.fail("Unable to locate object: " + NavigatenextPageElem.toString());
        }

		elem.click();
		 Thread.sleep(7000);
		ExtentReportManager.passStep(m_Driver, "closePopup");
		 Reporter.log("NavigateNextPage");
	
	}
	
	public void scrollClickPayrollDashboard() throws Exception
	{
        
		ClosePopup.ValidateAndPopUp(m_Driver);

		WebElement elem = getWebElement(payrollDahboardElem);

		if (elem == null) {
    	ExtentReportManager.failStepWithScreenshot(m_Driver, "scrollClickPayrollDashboard", "scrollClickPayrollDashboard failed. Unable to locate object: " + payrollDahboardElem.toString());
    	Assert.fail("Unable to locate object: " + payrollDahboardElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
		Thread.sleep(3000);
		
		ClosePopup.ValidateAndPopUp(m_Driver);

		ExtentReportManager.passStep(m_Driver, "scrollClickPayrollDashboard");
		 Reporter.log("Click PayrollDashBoard");
}

	
	 public void selectType(String Value) throws Exception
	 {
	    

	    	WebElement elem = getWebElement(sendPayslip);
			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectType", "selectType failed. Unable to locate object: " + sendPayslip.toString());

				Assert.fail("Unable to locate object: " + sendPayslip.toString());
	        }

			elem.sendKeys(Value);
			
			Thread.sleep(5000);
			
			ExtentReportManager.passStep(m_Driver, "selectType");
		
			   Reporter.log("selectType"+Value);
	    }
	 
	 
	 public void Click_SendBtnEmployee () throws InterruptedException
		{
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmployee']")));
			WebElement elem = getWebElement(sendBtn);
			
			elem.click();
			m_Driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			
			
			Reporter.log("Click_SendBtnEmployee");
		
	}

	 
	    public void ClickEmployerNote() throws InterruptedException
		{
			WebElement elem = getWebElement(employerNoteElem);
			
			elem.click();
			m_Driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			
			
			Reporter.log("Click_SendBtnEmployee");
		
	}
	    
	    

		public void clickAgentPayroll() throws Exception
		{
	        
			ClosePopup.ValidateAndPopUp(m_Driver);

			WebElement elem = getWebElement(agentDashboard);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAgentPayroll", "clickAgentPayroll failed. Unable to locate object: " + agentDashboard.toString());


				Assert.fail("Unable to locate object: " + agentDashboard.toString());
	        }

			elem.click();
	          	
			Thread.sleep(3000);
			Reporter.log("clickAgentPayroll");

		}
		
		

		public void clickAgentPayrollDashboad() throws Exception
		{
			//Temprory
//			
//			try {
//				WebElement elem = m_Driver.findElement(By.xpath("//*[@id='19914081-03c1-e69e-5942-c385d35d5c71']"));
//				elem.click();
//				
//				Thread.sleep(2000);
//				WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='88365c97-7e23-bf56-b4cd-256c596ca206']"));
//
//				elem1.click();
//
//				
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				System.out.println("Popup not found"+e);
//			}
			
			WebElement elem = getWebElement(agentPayrollDashboard);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAgentPayrollDashboad", "clickAgentPayrollDashboad failed. Unable to locate object: " + agentPayrollDashboard.toString());

				Assert.fail("Unable to locate object: " + agentPayrollDashboard.toString());
	        }

			elem.click();
	          	
			Thread.sleep(3000);
			Reporter.log("clickAgentPayrollDashboad");

		}
		
		

		/**

		      * Click click_OneOffPayment

		     * @throws InterruptedException 

		     * @name Click click_OneOffPayment

		     */

		   public void click_OneOffPayment() throws InterruptedException {


		        WebElement elem = getWebElement(oneOffPaymentElem);


		        if (elem == null) {

		             ExtentReportManager.failStepWithScreenshot(m_Driver, "click_OneOffPayment", "click_OneOffPayment failed. Unable to locate object: " + oneOffPaymentElem.toString());

		 


		 

		                 Assert.fail("Unable to locate object: " + oneOffPaymentElem.toString());


		    }

		        elem.click();

		        Reporter.log("Clicked One Off Payment");

		          Thread.sleep(4000);

		        ExtentReportManager.passStep(m_Driver, "click_OneOffPayment");

		 


		    }



		  /**

		     * Click check_EmployeeAFromList

		     * @throws Exception 

		    * @name Click check_EmployeeAFromList

		    */

		  public void check_EmployeeAFromList() throws Exception {

		       m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFramemd']")));



		       WebElement elem = getWebElement(checkEmployeeAElem);


		        if (elem == null) {

		             ExtentReportManager.failStepWithScreenshot(m_Driver, "check_EmployeeAFromList", "check_EmployeeAFromList failed. Unable to locate object: " + checkEmployeeAElem.toString());

		 


		 

		                 Assert.fail("Unable to locate object: " + checkEmployeeAElem.toString());


		    }


		        elem.click();

		        Reporter.log("Checked Employee A.");




		        Thread.sleep(2000);


		        ExtentReportManager.passStep(m_Driver, "check_EmployeeAFromList");

		 





		       m_Driver.switchTo().defaultContent();

		  }
		

		  /**

		       * Click click_OneOffPmntSaveBtn

		       * @throws Exception 

		       * @name Click click_OneOffPmntSaveBtn

		    */

		  public void click_OneOffPmntSaveBtn() throws Exception {

		         m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFramemd']")));



		         WebElement elem = getWebElement(oneOffPmntSaveBtnElem);


		          if (elem == null) {

		               ExtentReportManager.failStepWithScreenshot(m_Driver, "click_OneOffPmntSaveBtn", "click_OneOffPmntSaveBtn failed. Unable to locate object: " + oneOffPmntSaveBtnElem.toString());

		   


		   

		                   Assert.fail("Unable to locate object: " + oneOffPmntSaveBtnElem.toString());


		      }

		          jsExec.executeScript("arguments[0].scrollIntoView();", elem);

		          jsExec.executeScript("arguments[0].click();", elem);

		          //elem.click();

		          Reporter.log("Clicked Save Button of OneOffPayment.");

		          Thread.sleep(2000);


		          ExtentReportManager.passStep(m_Driver, "click_OneOffPmntSaveBtn");

		 



		         m_Driver.switchTo().defaultContent();

		  }
		
		
}