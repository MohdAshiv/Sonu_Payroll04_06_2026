package _1743Agent_Dashboard;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cf0c31aa-4196-4af0-9528-7c8d0343eec9
@TestModellerModule(guid = "cf0c31aa-4196-4af0-9528-7c8d0343eec9")
public class AgentDsbPayroll extends BasePage
{
	static int DSBCount;
	static int Actualcount;
	
	
	public AgentDsbPayroll (WebDriver driver)
	{
		super(driver);
	}


	
	private By Search_ClientElem = By.xpath("//INPUT[@placeholder='Search...']");

	private By Auto_PayrollElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[2]/div/div/div[1]/div/div/a[1]/div[1]/h3");

	private By Manual_PayrollElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[2]/div/div/div[2]/div/div/a[1]/div[1]/h3");

	private By PensionElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[2]/div/div/div[3]/div/div/a[1]/div[1]/h3");

	private By P11DElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[2]/div/div/div[4]/div/div/a[1]/div[1]/h3");

	private By Total_ClientElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[2]/div/div/div[5]/div/div/a[1]/div[1]/h3");

	private By _Import_CompaniesElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_lnlBtnImportCompanies']");

	private By _Import_EmployeesElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnImportEmployees']");

	private By Payroll_TableElem = By.xpath("//A[@href='/AgentUI/RunPayroll.aspx?isAc=True&dur=0&IsPayrollDashboard=true&type=Payroll&Dtype=Not Started']");

	private By Pension_TableElem = By.xpath("//A[@href='/AgentUI/SubmitPensionContribution.aspx?isAc=True&dur=0&IsPayrollDashboard=true&type=Pension&Dtype=Not Started']");

	private By PayrollAccountantSearchElem = By.xpath("(.//label[normalize-space()= 'Accountant:'])[1]/../div/div/input[2]");

	private By PensionAcctSearchElem = By.xpath("(.//label[normalize-space()= 'Accountant:'])[1]/../div/div/input[2]");

	private By Payroll_Deadlines_by_AccountantElem = By.xpath("//A[@href='/AgentUI/RunPayroll.aspx?isAc=True&dur=0&IsPayrollDashboard=true&type=PayrollbyAcct&UserCode=0']");

	private By Pension_Dedlines_by_AccountantElem = By.xpath("//A[contains(text(),'35')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AgentUI/PayrollDashboard.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/PayrollDashboard.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/PayrollDashboard.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AgentUI/PayrollDashboard.aspx";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AgentUI/PayrollDashboard.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Search Client
     * @name Enter Search Client
     */
 	public void Enter_Search_Client(String Search_Client)
 	{
 	    
 		WebElement elem = getWebElement(Search_ClientElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_Client", "Enter_Search_Client failed. Unable to locate object: " + Search_ClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_Client", "Enter_Search_Client failed. Unable to locate object: " + Search_ClientElem.toString());

 			Assert.fail("Unable to locate object: " + Search_ClientElem.toString());
         }

 		elem.sendKeys(Search_Client);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Search_Client " + Search_Client);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_Client " + Search_Client);
 	}

     
	/**
 	 * Click Auto Payroll
     * @name Click Auto Payroll
     */
	public void Click_Auto_Payroll()
	{
        
		WebElement elem = getWebElement(Auto_PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Auto_Payroll", "Click_Auto_Payroll failed. Unable to locate object: " + Auto_PayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Auto_Payroll", "Click_Auto_Payroll failed. Unable to locate object: " + Auto_PayrollElem.toString());

			Assert.fail("Unable to locate object: " + Auto_PayrollElem.toString());
        }

		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Auto_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Auto_Payroll");
	}

     
	/**
 	 * Click Manual Payroll
     * @name Click Manual Payroll
     */
	public void Click_Manual_Payroll()
	{
        
		WebElement elem = getWebElement(Manual_PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Manual_Payroll", "Click_Manual_Payroll failed. Unable to locate object: " + Manual_PayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Manual_Payroll", "Click_Manual_Payroll failed. Unable to locate object: " + Manual_PayrollElem.toString());

			Assert.fail("Unable to locate object: " + Manual_PayrollElem.toString());
        }

		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Manual_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Manual_Payroll");
	}

     
	/**
 	 * Click Pension
     * @name Click Pension
     */
	public void Click_Pension()
	{
        
		WebElement elem = getWebElement(PensionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pension", "Click_Pension failed. Unable to locate object: " + PensionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pension", "Click_Pension failed. Unable to locate object: " + PensionElem.toString());

			Assert.fail("Unable to locate object: " + PensionElem.toString());
        }

		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pension");

		TestModellerLogger.PassStep(m_Driver, "Click_Pension");
	}

     
	/**
 	 * Click P11D
     * @name Click P11D
     */
	public void Click_P11D()
	{
        
		WebElement elem = getWebElement(P11DElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_P11D", "Click_P11D failed. Unable to locate object: " + P11DElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_P11D", "Click_P11D failed. Unable to locate object: " + P11DElem.toString());

			Assert.fail("Unable to locate object: " + P11DElem.toString());
        }

		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_P11D");

		TestModellerLogger.PassStep(m_Driver, "Click_P11D");
	}

     
	/**
 	 * Click Total Client
     * @name Click Total Client
     */
	public void Click_Total_Client()
	{
        
		WebElement elem = getWebElement(Total_ClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Total_Client", "Click_Total_Client failed. Unable to locate object: " + Total_ClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Total_Client", "Click_Total_Client failed. Unable to locate object: " + Total_ClientElem.toString());

			Assert.fail("Unable to locate object: " + Total_ClientElem.toString());
        }

		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Total_Client");

		TestModellerLogger.PassStep(m_Driver, "Click_Total_Client");
	}

     
	/**
 	 * Click  Import Companies
     * @name Click  Import Companies
     */
	public void Click__Import_Companies()
	{
        
		WebElement elem = getWebElement(_Import_CompaniesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Import_Companies", "Click__Import_Companies failed. Unable to locate object: " + _Import_CompaniesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Import_Companies", "Click__Import_Companies failed. Unable to locate object: " + _Import_CompaniesElem.toString());

			Assert.fail("Unable to locate object: " + _Import_CompaniesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Import_Companies");

		TestModellerLogger.PassStep(m_Driver, "Click__Import_Companies");
	}

     
	/**
 	 * Click  Import Employees
	 * @throws InterruptedException 
     * @name Click  Import Employees
     */
	public void Click__Import_Employees() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Import_EmployeesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Import_Employees", "Click__Import_Employees failed. Unable to locate object: " + _Import_EmployeesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Import_Employees", "Click__Import_Employees failed. Unable to locate object: " + _Import_EmployeesElem.toString());

			Assert.fail("Unable to locate object: " + _Import_EmployeesElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(3000);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Import_Employees");

		TestModellerLogger.PassStep(m_Driver, "Click__Import_Employees");
	}

     
	/**
 	 * Click Payroll Table
     * @name Click Payroll Table
     */
	public void Click_Payroll_Table()
	{
        
		WebElement elem = getWebElement(Payroll_TableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Table", "Click_Payroll_Table failed. Unable to locate object: " + Payroll_TableElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Table", "Click_Payroll_Table failed. Unable to locate object: " + Payroll_TableElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_TableElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Table");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Table");
	}

     
	/**
 	 * Click Pension Table
     * @name Click Pension Table
     */
	public void Click_Pension_Table()
	{
        
		WebElement elem = getWebElement(Pension_TableElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pension_Table", "Click_Pension_Table failed. Unable to locate object: " + Pension_TableElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pension_Table", "Click_Pension_Table failed. Unable to locate object: " + Pension_TableElem.toString());

			Assert.fail("Unable to locate object: " + Pension_TableElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pension_Table");

		TestModellerLogger.PassStep(m_Driver, "Click_Pension_Table");
	}

      
	/**
 	 * Enter PayrollAccountantSearch
     * @name Enter PayrollAccountantSearch
     */
 	public void Enter_PayrollAccountantSearch(String PayrollAccountantSearch)
 	{
 	    
 		WebElement elem = getWebElement(PayrollAccountantSearchElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PayrollAccountantSearch", "Enter_PayrollAccountantSearch failed. Unable to locate object: " + PayrollAccountantSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PayrollAccountantSearch", "Enter_PayrollAccountantSearch failed. Unable to locate object: " + PayrollAccountantSearchElem.toString());

 			Assert.fail("Unable to locate object: " + PayrollAccountantSearchElem.toString());
         }

 		elem.sendKeys(PayrollAccountantSearch);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PayrollAccountantSearch " + PayrollAccountantSearch);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PayrollAccountantSearch " + PayrollAccountantSearch);
 	}

      
	/**
 	 * Enter PensionAcctSearch
     * @name Enter PensionAcctSearch
     */
 	public void Enter_PensionAcctSearch(String PensionAcctSearch)
 	{
 	    
 		WebElement elem = getWebElement(PensionAcctSearchElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PensionAcctSearch", "Enter_PensionAcctSearch failed. Unable to locate object: " + PensionAcctSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PensionAcctSearch", "Enter_PensionAcctSearch failed. Unable to locate object: " + PensionAcctSearchElem.toString());

 			Assert.fail("Unable to locate object: " + PensionAcctSearchElem.toString());
         }

 		elem.sendKeys(PensionAcctSearch);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PensionAcctSearch " + PensionAcctSearch);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PensionAcctSearch " + PensionAcctSearch);
 	}

     
	/**
 	 * Click Payroll Deadlines by Accountant
     * @name Click Payroll Deadlines by Accountant
     */
	public void Click_Payroll_Deadlines_by_Accountant()
	{
        
		WebElement elem = getWebElement(Payroll_Deadlines_by_AccountantElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Deadlines_by_Accountant", "Click_Payroll_Deadlines_by_Accountant failed. Unable to locate object: " + Payroll_Deadlines_by_AccountantElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Deadlines_by_Accountant", "Click_Payroll_Deadlines_by_Accountant failed. Unable to locate object: " + Payroll_Deadlines_by_AccountantElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_Deadlines_by_AccountantElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Deadlines_by_Accountant");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Deadlines_by_Accountant");
	}

     
	/**
 	 * Click Pension Dedlines by Accountant
     * @name Click Pension Dedlines by Accountant
     */
	public void Click_Pension_Dedlines_by_Accountant()
	{
        
		WebElement elem = getWebElement(Pension_Dedlines_by_AccountantElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pension_Dedlines_by_Accountant", "Click_Pension_Dedlines_by_Accountant failed. Unable to locate object: " + Pension_Dedlines_by_AccountantElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pension_Dedlines_by_Accountant", "Click_Pension_Dedlines_by_Accountant failed. Unable to locate object: " + Pension_Dedlines_by_AccountantElem.toString());

			Assert.fail("Unable to locate object: " + Pension_Dedlines_by_AccountantElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pension_Dedlines_by_Accountant");

		TestModellerLogger.PassStep(m_Driver, "Click_Pension_Dedlines_by_Accountant");
	}


	public void getTableCountofAutoPayroll() throws InterruptedException {
		
		String count=m_Driver.findElement(By.xpath("//*[starts-with(text(),'Total Record')]/b")).getText();
		System.out.println(count);
		 Actualcount=Integer.parseInt(count);
		
		System.out.println(Actualcount);
		
		Thread.sleep(5000);
		
	}
	
	
		public void getTableCountofAutoPayroll1() {
		
		String count=m_Driver.findElement(By.xpath("//*[starts-with(text(),'Total record')]/b")).getText();
		System.out.println(count);
		 Actualcount=Integer.parseInt(count);
		
		System.out.println(Actualcount);
		
	}
		
		
		
		//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/h2


	public void verifyAutoPayrollCount() {
		// TODO Auto-generated method stub
		assertEquals(DSBCount, Actualcount);
		
	}


	public void getTableClientCount() {
		// TODO Auto-generated method stub
		
		String count=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/h2")).getText();
		count=count.replaceAll("[^0-9]", "");
		System.out.println(count);
		 Actualcount=Integer.parseInt(count);
		
		System.out.println(Actualcount);
		
	}


	public void getCountPayroll_Overdue_NotStarted(String indexValue) {
		// TODO Auto-generated method stub
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[1]/td[2]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1week_NotStarted(String indexValue) {
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[1]/td[3]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1Month_NotStarted(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_3Month_NotStarted(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_3_6Month_NotStarted(String indexValue) {
		// TODO Auto-generated method stub
		
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[1]/td[6]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_6plusMonth_NotStarted(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[1]/td[7]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_Overdue_Inprogress(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[2]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1week_Inprogress(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[3]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1Month_Inprogress(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[4]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_2Month_Inprogress(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[5]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_3_6Month_Inprogress(String indexValue) {
		// TODO Auto-generated method stub
		
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[6]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_6plusMonth_InProgress(String indexValue) {
		// TODO Auto-generated method stub
		
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[7]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_Overdue_OnHold(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[3]/td[2]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1week_OnHold(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[3]/td[3]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1Month_OnHold(String indexValue) {
		// TODO Auto-generated method stub
		
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[3]/td[4]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_2Month_OnHold(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[3]/td[5]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_3_6Month_OnHold(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[3]/td[6]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_6plusMonth_OnHold(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[3]/td[7]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_Overdue_AwaitingReview(String indexValue) {
		// TODO Auto-generated method stub
		
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[4]/td[2]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1week_AwaitingReview(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[4]/td[3]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1Month_AwaitingReview(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[4]/td[4]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_2Month_AwaitingReview(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[4]/td[5]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_3_6Month_AwaitingReview(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[4]/td[6]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_6plusMonth_AwaitingReview(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[4]/td[7]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_Overdue_AwaitingApproval(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[5]/td[2]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1week_AwaitingApproval(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[5]/td[3]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1Month_AwaitingApproval(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[5]/td[4]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_2Month_AwaitingApproval(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[5]/td[5]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_3_6Month_AwaitingApproval(String indexValue) {
		// TODO Auto-generated method stub
		
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[5]/td[6]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_6plusMonth_AwaitingApproval(String indexValue) {
		// TODO Auto-generated method stub
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[5]/td[7]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_Overdue_Deffered(String indexValue) {
		// TODO Auto-generated method stub
		
		jsExec.executeScript("window.scrollBy(0,250)", "");
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[6]/td[2]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1week_Deffered(String indexValue) {
		// TODO Auto-generated method stub
		jsExec.executeScript("window.scrollBy(0,250)", "");
		//jsExec.executeScript("argiments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div[1]/div[1]/div/h3")));
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[6]/td[3]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_1Month_Deffered(String indexValue) {
		// TODO Auto-generated method stub
		jsExec.executeScript("window.scrollBy(0,250)", "");
	//	jsExec.executeScript("argiments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div[1]/div[1]/div/h3")));
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[6]/td[4]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_2Month_Deffered(String indexValue) {
		// TODO Auto-generated method stub
		jsExec.executeScript("window.scrollBy(0,250)", "");
	//	jsExec.executeScript("argiments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div[1]/div[1]/div/h3")));
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[6]/td[5]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_3_6Month_Deffered(String indexValue) {
		// TODO Auto-generated method stub
		jsExec.executeScript("window.scrollBy(0,250)", "");
	//	jsExec.executeScript("argiments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div[1]/div[1]/div/h3")));
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[6]/td[6]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void getCountPayroll_6plusMonth_Deffered(String indexValue) {
		// TODO Auto-generated method stub
		jsExec.executeScript("window.scrollBy(0,250)", "");
	//	jsExec.executeScript("argiments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div[1]/div[1]/div/h3")));
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div[3]/div["+indexValue+"]/div[3]/div/div/div/div/table/tbody/tr[6]/td[7]/span/a"));
		String txt=elem.getText();
		
		DSBCount=Integer.parseInt(txt);
		System.out.println(txt);
		elem.click();
		
	}


	public void verifyAscendingOrder(String tdValue) {
		// TODO Auto-generated method stub
		jsExec.executeScript("window.scrollBy(0,350)", "");
		int count=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[1]/div[4]/div/div[1]/div/div/table/tbody/tr/td[2]/span/a")).size();
		
		for(int i=1; i<count;i++)
		{
			int k=i+1;
			for(int j=k; j<=count; j++)
			{
				
				jsExec.executeScript("window.scrollBy(0,350)", "");
				String prevText=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[1]/div[4]/div/div[1]/div/div/table/tbody/tr["+i+"]/td["+tdValue+"]/span/a")).getText();
				int prevTextVal=Integer.parseInt(prevText);
				
				String NextText=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[1]/div[4]/div/div[1]/div/div/table/tbody/tr["+j+"]/td["+tdValue+"]/span/a")).getText();
				int nextTextVal=Integer.parseInt(NextText);
				System.out.println(prevTextVal+">"+nextTextVal);
				
				assertTrue(prevTextVal>=nextTextVal);
			}
		}
		
	}


	public void verifyAscendingOrderPension(String tdValue) 
	{
		
		jsExec.executeScript("window.scrollBy(0,350)", "");
		int count=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[2]/div[4]/div/div[1]/div/div/table/tbody/tr/td[2]/span/a")).size();
		
		for(int i=2; i<count;i++)
		{
			int k=i+1;
			for(int j=k; j<=count; j++)
			{
				
				jsExec.executeScript("window.scrollBy(0,350)", "");
				String prevText=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[2]/div[4]/div/div[1]/div/div/table/tbody/tr["+i+"]/td["+tdValue+"]/span/a")).getText();
				int prevTextVal=Integer.parseInt(prevText);
				
				String NextText=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[2]/div[4]/div/div[1]/div/div/table/tbody/tr["+j+"]/td["+tdValue+"]/span/a")).getText();
				int nextTextVal=Integer.parseInt(NextText);
				System.out.println(prevTextVal+">"+nextTextVal);
				
				assertTrue(prevTextVal>=nextTextVal);
			}
		}
		
	}


	public void Click_UploadEEDetailFile() {
		// TODO Auto-generated method stub
		
		System.out.println("1");
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_FileUpload1']")).click();
		
		System.out.println("2");
		
	}


	
}