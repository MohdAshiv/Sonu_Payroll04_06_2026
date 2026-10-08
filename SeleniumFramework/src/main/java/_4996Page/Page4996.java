package _4996Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class Page4996  extends BasePage{

	public Page4996(WebDriver driver) {
		super(driver);
	}

	
	private By undoLastPayrollElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnUndoPayroll']");
	
	
	private By nameCheckBoxElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkSelectAll']");

	
	private By undoBtnElme= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnUndo']");
	
	private By employee3Elem  = By.xpath("//*[contains(text(),'C')]/parent::tr/td/span/input");
	
	private By employee2Elem  = By.xpath("//*[contains(text(),'B')]/parent::tr/td/span/input");
	private By employee1Elem  = By.xpath("//*[contains(text(),'A')]/parent::tr/td/span/input");
	private By employeeGrayElem  = By.xpath("//*[contains(text(),'Gray')]/parent::tr/td/span/input");
	private By employeeKeithElem  = By.xpath("//*[contains(text(),'Keith')]/parent::tr/td/span/input");
	private By employeePaulElem  = By.xpath("//*[contains(text(),'Paul')]/parent::tr/td/span/input");
	private By employeeAndrewElem  = By.xpath("//*[contains(text(),'Andrew')]/parent::tr/td/span/input");
	private By employeePensionElem  = By.xpath("//*[contains(text(),'Employee Pension')]/parent::tr/td/span/input");

	private By employeeMathewElem  = By.xpath("//*[contains(text(),'Mathew')]/parent::tr/td/span/input");

	private By employeeAnanthalkasElem  = By.xpath("//*[contains(text(),'Ananthalkas')]/parent::tr/td/span/input");

	private By employeeGuillaumeElem  = By.xpath("//*[contains(text(),'Guillaume')]/parent::tr/td/span/input");
	private By employeeCostelElem  = By.xpath("//*[contains(text(),'Costel')]/parent::tr/td/span/input");
	private By employeeAlexElem  = By.xpath("//*[contains(text(),'Alex')]/parent::tr/td/span/input");

	private By employeeAdamElem  = By.xpath("//*[contains(text(),'Adam')]/parent::tr/td/span/input");
	private By employeeJohnElem  = By.xpath("//*[contains(text(),'John')]/parent::tr/td/span/input");

	private By closeBtnElem= By.xpath("//*[@id='btnPopUpClose']");
	
	private By threeDot3= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_dvDropDownMenu']");
	private By threeDot4= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl05_dvDropDownMenu']");
	private By threeDot5= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl06_dvDropDownMenu']");

	private By threeDot6= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl07_dvDropDownMenu']");

	private By threeDot7= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl08_dvDropDownMenu']");

	private By threeDot2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl03_dvDropDownMenu']");

	private By deletElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_lnkEmpDelete']");

	private By employeeOneElem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[1]/td[1]/span/input");

	private By employeetwoElem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[2]/td/span/input");

	private By employee5Elem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[5]/td/span/input");

	private By employee7Elem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[7]/td/span/input");
	private By employee9Elem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[9]/td/span/input");

	private By employee10Elem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[10]/td/span/input");

	private By employee4Elem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[4]/td/span/input");
	private By employee6Elem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[6]/td/span/input");
	private By employeethreeElem  = By.xpath("(//*[@class='panel panel-default'])[2]/div/div/div/table/tbody/tr[3]/td/span/input");

	/**
 	 * Click  Undo Last Payroll 
	 * @throws InterruptedException 
     * @name Undo Last Payroll 
     */
	public void clickUndoLastPayrollBtn() throws InterruptedException
	{
        

		  WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(20));

	        WebElement quickAction = wait.until(
	        	    ExpectedConditions.elementToBeClickable(
	        	        By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/div/div[2]/button")
	        	    )
	        	);

	        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);
	        	((JavascriptExecutor)m_Driver).executeScript("arguments[0].click();", quickAction);
		WebElement elem = getWebElement(undoLastPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + undoLastPayrollElem.toString());


			Assert.fail("Unable to locate object: " + undoLastPayrollElem.toString());
        }

		elem.click();
		Thread.sleep(3000);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		
		Reporter.log("clickUndoLastPayroll");
	}
	
	
	

	/**
 	 * clickCloseBtn 
	 * @throws InterruptedException 
     * @name clickCloseBtn 
     */
	public void clickCloseBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(closeBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCloseBtn", "clickCloseBtn failed. Unable to locate object: " + closeBtnElem.toString());


			Assert.fail("Unable to locate object: " + closeBtnElem.toString());
        }

		elem.click();
		Thread.sleep(3000);
          	

		ExtentReportManager.passStep(m_Driver, "clickCloseBtn");

		
		Reporter.log("clickCloseBtn");
	}
	
	
	
	

	/**
 	 * clickUndoBtn 
	 * @throws InterruptedException 
     * @name clickUndoBtn 
     */
	public void clickUndoBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(undoBtnElme);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndoBtn", "clickUndoBtn failed. Unable to locate object: " + undoBtnElme.toString());


			Assert.fail("Unable to locate object: " + undoBtnElme.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	
		m_Driver.switchTo().alert().accept();

		ExtentReportManager.passStep(m_Driver, "clickUndoBtn");

		
		Reporter.log("clickUndoBtn");
	}
	
	
	
	
	
	
	public void clickUndoBtn1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(undoBtnElme);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndoBtn", "clickUndoBtn failed. Unable to locate object: " + undoBtnElme.toString());


			Assert.fail("Unable to locate object: " + undoBtnElme.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		m_Driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		m_Driver.navigate().refresh();

          	

		ExtentReportManager.passStep(m_Driver, "clickUndoBtn");

		
		Reporter.log("clickUndoBtn");
	}
	
	
	
	/**
 	 * clickNameCheckBox 
	 * @throws InterruptedException 
     * @name clickNameCheckBoxl 
     */
	public void clickNameCheckBox() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(nameCheckBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNameCheckBox", "clickNameCheckBox failed. Unable to locate object: " + nameCheckBoxElem.toString());


			Assert.fail("Unable to locate object: " + nameCheckBoxElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "clickNameCheckBox");

		
		Reporter.log("clickNameCheckBox");
	}
	
	
	/**
 	 * UntickEmployee3CheckBox 
	 * @throws InterruptedException 
     * @name UntickEmployee3CheckBox 
     */
	public void UntickEmployeeCCheckBox() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employee3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "UntickEmployee3CheckBox", "UntickEmployee3CheckBox failed. Unable to locate object: " + employee3Elem.toString());


			Assert.fail("Unable to locate object: " + employee3Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "UntickEmployee3CheckBox");

		
		Reporter.log("UntickEmployee3CheckBox");
	}
	
	
	
	public void UntickEmployeeTestingCheckBox() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(By.xpath("//*[contains(text(),'Testing')]/parent::tr/td/span/input"));


		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "UntickEmployee3CheckBox");

		
		Reporter.log("UntickEmployeeTestingCheckBox");
	}
	
	
	
	
	public void tickEmployeeCostelCheckBox() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employeeCostelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeCostelCheckBox", "tickEmployeeCostelCheckBox failed. Unable to locate object: " + employeeCostelElem.toString());


			Assert.fail("Unable to locate object: " + employeeCostelElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeCostelCheckBox");

		
		Reporter.log("tickEmployeeCostelCheckBox");
	}
	
	

	public void tickEmployeeAlexCheckBox() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employeeAlexElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeAlexCheckBox", "tickEmployeeAlexCheckBox failed. Unable to locate object: " + employeeAlexElem.toString());


			Assert.fail("Unable to locate object: " + employeeAlexElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeAlexCheckBox");

		
		Reporter.log("tickEmployeeAlexCheckBox");
	}
	public void tickEmployeeAdamCheckBox() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employeeAdamElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeAdamCheckBox", "tickEmployeeAdamCheckBox failed. Unable to locate object: " + employeeAdamElem.toString());


			Assert.fail("Unable to locate object: " + employeeAdamElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeAdamCheckBox");

		
		Reporter.log("tickEmployeeAdamCheckBox");
	}
	
	
	
	public void tickEmployeeJohnCheckBox() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employeeJohnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeJohnCheckBox", "tickEmployeeJohnCheckBox failed. Unable to locate object: " + employeeJohnElem.toString());


			Assert.fail("Unable to locate object: " + employeeJohnElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeJohnCheckBox");

		
		Reporter.log("tickEmployeeJohnCheckBox");
	}
	
	public void UntickEmployeeBCheckBox() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employee2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "UntickEmployee3CheckBox", "UntickEmployee3CheckBox failed. Unable to locate object: " + employee2Elem.toString());


			Assert.fail("Unable to locate object: " + employee2Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "UntickEmployeeBCheckBox");

		
		Reporter.log("UntickEmployee3CheckBox");
	}
	
	
	public void tickEmployeeACheckBox() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employee1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "UntickEmployee3CheckBox", "tickEmployeeACheckBox failed. Unable to locate object: " + employee1Elem.toString());


			Assert.fail("Unable to locate object: " + employee1Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeACheckBox");

		
		Reporter.log("tickEmployeeACheckBox");
	}
	
	
	
	public void tickEmployeeGrayCheckBox() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employeeGrayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeGrayCheckBox", "tickEmployeeGrayCheckBox failed. Unable to locate object: " + employeeGrayElem.toString());


			Assert.fail("Unable to locate object: " + employeeGrayElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeGrayCheckBox");

		
		Reporter.log("tickEmployeeGrayCheckBox");
	}
	
	
	public void tickEmployeeOne() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employeeOneElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeOne", "tickEmployeeOne failed. Unable to locate object: " + employeeOneElem.toString());


			Assert.fail("Unable to locate object: " + employeeOneElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeOne");

		
		Reporter.log("tickEmployeeOne");
	}
	
	
	
	public void tickEmployee5() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employee5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee5", "tickEmployee5 failed. Unable to locate object: " + employee5Elem.toString());


			Assert.fail("Unable to locate object: " + employee5Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee5");

		
		Reporter.log("tickEmployee5");
	}
	
	
	

	public void tickEmployee7() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employee7Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee7", "tickEmployee7 failed. Unable to locate object: " + employee7Elem.toString());


			Assert.fail("Unable to locate object: " + employee7Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee7");

		
		Reporter.log("tickEmployee7");
	}
	
	

	public void tickEmployee9() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employee9Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee9", "tickEmployee9 failed. Unable to locate object: " + employee9Elem.toString());


			Assert.fail("Unable to locate object: " + employee9Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee9");

		
		Reporter.log("tickEmployee9");
	}
	
	
	public void tickEmployee10() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employee10Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee10", "tickEmployee10 failed. Unable to locate object: " + employee10Elem.toString());


			Assert.fail("Unable to locate object: " + employee10Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee10");

		
		Reporter.log("tickEmployee10");
	}
	
	
	public void tickEmployee4() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employee4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee4", "tickEmployee4 failed. Unable to locate object: " + employee4Elem.toString());


			Assert.fail("Unable to locate object: " + employee4Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee4");

		
		Reporter.log("tickEmployee4");
	}
	
	
	public void tickEmployee6() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employee6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee6", "tickEmployee6 failed. Unable to locate object: " + employee6Elem.toString());


			Assert.fail("Unable to locate object: " + employee6Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee6");

		
		Reporter.log("tickEmployee6");
	}
	
	
	
	public void tickEmployee2() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employeetwoElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee2", "tickEmployee2 failed. Unable to locate object: " + employeetwoElem.toString());


			Assert.fail("Unable to locate object: " + employeetwoElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee2");

		
		Reporter.log("tickEmployee2");
	}

	
	
	public void tickEmployee3() throws InterruptedException
	{

        
		WebElement elem = getWebElement(employeethreeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployee3", "tickEmployee3 failed. Unable to locate object: " + employeethreeElem.toString());


			Assert.fail("Unable to locate object: " + employeethreeElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployee3");

		
		Reporter.log("tickEmployee3");
	}
	
	
	
	public void tickEmployeeMathewCheckBox() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employeeMathewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeMathewCheckBox", "tickEmployeeMathewCheckBox failed. Unable to locate object: " + employeeMathewElem.toString());


			Assert.fail("Unable to locate object: " + employeeMathewElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeMathewCheckBox");

		
		Reporter.log("tickEmployeeMathewCheckBox");
	}
	

	public void tickEmployeeKaithCheckBox() throws InterruptedException
	{
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employeeKeithElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeKaithCheckBox", "tickEmployeeKaithCheckBox failed. Unable to locate object: " + employeeKeithElem.toString());


			Assert.fail("Unable to locate object: " + employeeKeithElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeKaithCheckBox");

		
		Reporter.log("tickEmployeeKaithCheckBox");
	}
	
	
	public void tickEmployeePension() throws InterruptedException
	{
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employeePensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeePension", "tickEmployeePension failed. Unable to locate object: " + employeePensionElem.toString());


			Assert.fail("Unable to locate object: " + employeePensionElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeePension");

		
		Reporter.log("tickEmployeePension");
	}
	
	
	public void tickEmployeeAnanthalkasCheckBox() throws InterruptedException
	{
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employeeAnanthalkasElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeAnanthalkasCheckBox", "tickEmployeeAnanthalkasCheckBox failed. Unable to locate object: " + employeeAnanthalkasElem.toString());


			Assert.fail("Unable to locate object: " + employeeAnanthalkasElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeAnanthalkasCheckBox");

		
		Reporter.log("tickEmployeeAnanthalkasCheckBox");
	}

	public void tickEmployeeGuillaumeCheckBox() throws InterruptedException
	{

		WebElement elem = getWebElement(employeeGuillaumeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeGuillaumeCheckBox", "tickEmployeeGuillaumeCheckBox failed. Unable to locate object: " + employeeGuillaumeElem.toString());


			Assert.fail("Unable to locate object: " + employeeGuillaumeElem.toString());
        }

		elem.click();
		Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "tickEmployeeGuillaumeCheckBox");

		
		Reporter.log("tickEmployeeGuillaumeCheckBox");
	}
	
	
	public void tickEmployeeAndrewCheckBox() throws InterruptedException
	{
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employeeAndrewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeeAndrewCheckBox", "tickEmployeeAndrewCheckBox failed. Unable to locate object: " + employeeAndrewElem.toString());


			Assert.fail("Unable to locate object: " + employeeAndrewElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeeAndrewCheckBox");

		
		Reporter.log("tickEmployeeAndrewCheckBox");
	}

	
	public void tickEmployeePaulCheckBox() throws InterruptedException
	{
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

        
		WebElement elem = getWebElement(employeePaulElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "tickEmployeePaulCheckBox", "tickEmployeePaulCheckBox failed. Unable to locate object: " + employeePaulElem.toString());


			Assert.fail("Unable to locate object: " + employeePaulElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "tickEmployeePaulCheckBox");

		
		Reporter.log("tickEmployeePaulCheckBox");
	}
 	
	
	public void goToInsideFrame() throws InterruptedException
	{

		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));
		
		
		Reporter.log("goToInsideFrame");
	}
	
	
	public void SwithToDefault() throws InterruptedException
	{

		m_Driver.switchTo().defaultContent();
		
		
		Reporter.log("SwithToDefault");
	}

	
	public void clickPendingPayrollForPastPeriodIcn()
	{

		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_hrefUndoPayrollAlert']"));
		  elem.click();
		  
		  Reporter.log("clickPendingPayrollForPastPeriodIcn");
		 
	}

	
	 public void clickUndoneEmployee3Dot() throws Exception
	    {

			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_dvDropDownMenu']/a"));

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot3", "click3Dot3 failed. Unable to locate object: " + threeDot3.toString());

				Assert.fail("Unable to locate object: " + threeDot3.toString());
	        }

			elem.click();
		   Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "click3Dots");
		
	        Reporter.log("clickUndoneEmployee3Dot");
	    }
	
	 

	 public void clickUndone2Employee3Dot() throws Exception
	    {

			WebElement elem = getWebElement(threeDot2);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndone2Employee3Dot", "clickUndone2Employee3Dot failed. Unable to locate object: " + threeDot2.toString());

				Assert.fail("Unable to locate object: " + threeDot2.toString());
	        }

			elem.click();
		   Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "clickUndone2Employee3Dot");
		
	        Reporter.log("clickUndone2Employee3Dot");
	    }
	
	 
	 public void clickUndone4Employee3Dot() throws Exception
	    {

			WebElement elem = getWebElement(threeDot4);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndone4Employee3Dot", "clickUndone4Employee3Dot failed. Unable to locate object: " + threeDot4.toString());

				Assert.fail("Unable to locate object: " + threeDot2.toString());
	        }

			elem.click();
		   Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "clickUndone4Employee3Dot");
		
	        Reporter.log("clickUndone4Employee3Dot");
	    }
	 
	 
	 
	 
	 
	 public void clickUndone5Employee3Dot() throws Exception
	    {

			WebElement elem = getWebElement(threeDot5);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndone5Employee3Dot", "clickUndone5Employee3Dot failed. Unable to locate object: " + threeDot5.toString());

				Assert.fail("Unable to locate object: " + threeDot5.toString());
	        }

			elem.click();
		   Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "clickUndone5Employee3Dot");
		
	        Reporter.log("clickUndone5Employee3Dot");
	    }
	 
	 
	 public void clickUndone6Employee3Dot() throws Exception
	    {

			WebElement elem = getWebElement(threeDot6);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndone6Employee3Dot", "clickUndone6Employee3Dot failed. Unable to locate object: " + threeDot6.toString());

				Assert.fail("Unable to locate object: " + threeDot6.toString());
	        }

			elem.click();
		   Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "clickUndone6Employee3Dot");
		
	        Reporter.log("clickUndone6Employee3Dot");
	    }

	 
	 
	 
	 public void clickUndone7Employee3Dot() throws Exception
	    {

			WebElement elem = getWebElement(threeDot7);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndone7Employee3Dot", "clickUndone7Employee3Dot failed. Unable to locate object: " + threeDot7.toString());

				Assert.fail("Unable to locate object: " + threeDot7.toString());
	        }

			elem.click();
		   Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "clickUndone7Employee3Dot");
		
	        Reporter.log("clickUndone7Employee3Dot");
	    }
	 

	 public void clickUndoneDeletEmployeeInlineDropdown() throws Exception
	    {

			WebElement elem = getWebElement(deletElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndoneDeletEmployeeInlineDropdown", "clickUndoneDeletEmployeeInlineDropdown failed. Unable to locate object: " + deletElem.toString());

				Assert.fail("Unable to locate object: " + deletElem.toString());
	        }

			elem.click();
		   Thread.sleep(2000);
			
			ExtentReportManager.passStep(m_Driver, "clickUndoneDeletEmployeeInlineDropdown");
		
	        Reporter.log("clickUndoneDeletEmployeeInlineDropdown");
	    }
	
	



	
}
