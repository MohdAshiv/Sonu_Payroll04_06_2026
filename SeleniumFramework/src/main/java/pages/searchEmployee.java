package pages;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/774330e8-455c-4995-93ab-9dd72beba8ed
@TestModellerModule(guid = "774330e8-455c-4995-93ab-9dd72beba8ed")
public class searchEmployee extends BasePage
{
	public searchEmployee (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickEmployeeListElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefEmployeeList']");

	private By SelectEmployeeStatusElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlEmployeeStatus']");

	private By EnterEmployeeNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearch']");

	private By clickSearchElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By clickonEmpNameElem = By.xpath("//*[@id='tblContribution']/div/table/tbody/tr/td[3]/a");
	//th[starts-with(text(),'First Name')]//following::tr[1]/td[2]
	
	private By selectTaxYearsoptionElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");
	
	private By Click_EditEmployeeElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");
	
	private By Click_OpeningBalanceElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefBroughtForward']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickEmployeeList
     * @name Click clickEmployeeList
     */
	public void Click_clickEmployeeList()
	{
        
		WebElement elem = getWebElement(clickEmployeeListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEmployeeList", "Click_clickEmployeeList failed. Unable to locate object: " + clickEmployeeListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEmployeeList", "Click_clickEmployeeList failed. Unable to locate object: " + clickEmployeeListElem.toString());

			Assert.fail("Unable to locate object: " + clickEmployeeListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEmployeeList");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEmployeeList");
	}

    
	/**
 	 * Select SelectEmployeeStatus
     * @name Select SelectEmployeeStatus
     */
    public void Select_SelectEmployeeStatus(String SelectEmployeeStatus)
 	{
 	    
 		WebElement elem = getWebElement(SelectEmployeeStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectEmployeeStatus", "Select_SelectEmployeeStatus failed. Unable to locate object: " + SelectEmployeeStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectEmployeeStatus", "Select_SelectEmployeeStatus failed. Unable to locate object: " + SelectEmployeeStatusElem.toString());

 			Assert.fail("Unable to locate object: " + SelectEmployeeStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectEmployeeStatus);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectEmployeeStatus " + SelectEmployeeStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectEmployeeStatus " + SelectEmployeeStatus);
 	}

      
	/**
 	 * Enter EnterEmployeeName
     * @name Enter EnterEmployeeName
     */
 	public void Enter_EnterEmployeeName(String EnterEmployeeName)
 	{
 	    
 		WebElement elem = getWebElement(EnterEmployeeNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterEmployeeName", "Enter_EnterEmployeeName failed. Unable to locate object: " + EnterEmployeeNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterEmployeeName", "Enter_EnterEmployeeName failed. Unable to locate object: " + EnterEmployeeNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterEmployeeNameElem.toString());
         }

 		elem.sendKeys(EnterEmployeeName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterEmployeeName " + EnterEmployeeName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterEmployeeName " + EnterEmployeeName);
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
		
		//m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]")).click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSearch");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSearch");
	}

     
	/**
 	 * Click clickonEmpName
	 * @throws InterruptedException 
     * @name Click clickonEmpName
     */
	public void Click_clickonEmpName() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickonEmpNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickonEmpName", "Click_clickonEmpName failed. Unable to locate object: " + clickonEmpNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickonEmpName", "Click_clickonEmpName failed. Unable to locate object: " + clickonEmpNameElem.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem.toString());
        }
		
		Thread.sleep(2000);

		elem=m_Driver.findElement(By.xpath("//*[@id='tblContribution']/div/table/tbody/tr/td[3]/a"));
		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickonEmpName");

		TestModellerLogger.PassStep(m_Driver, "Click_clickonEmpName");
	}
	
	/**
 	 * Select selectTaxYearsoption
     * @name Select selectTaxYearsoption
     */
    public void Select_selectTaxYearsoption(String selectTaxYearsoption)
 	{
 	    
 		WebElement elem = getWebElement(selectTaxYearsoptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectTaxYearsoption", "Select_selectTaxYearsoption failed. Unable to locate object: " + selectTaxYearsoptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectTaxYearsoption", "Select_selectTaxYearsoption failed. Unable to locate object: " + selectTaxYearsoptionElem.toString());

 			Assert.fail("Unable to locate object: " + selectTaxYearsoptionElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectTaxYearsoption);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectTaxYearsoption " + selectTaxYearsoption);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectTaxYearsoption " + selectTaxYearsoption);
 	}

    public void verifyData(String expectedData)
    {
    	
    	
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table-responsive'])[2]/table/tbody/tr/td[1]"));
    		
    		
    		for(int i=1;i<=list.size()-1;i++)
    		{

            String data= list.get(i).getText();
            System.out.println(data);
            
            assertEquals(data, expectedData);
            
    			
    		}
	
    	
    	Reporter.log("Verify previos Year data");
    }
    
    

	public void verifyPreviousYrData() throws Exception {
		// TODO Auto-generated method stub
		
		TakeScreenshot.takeScreenshot(m_Driver, "Previous Yr Data of Employee");
		
	}


	public void verifyCurrentYrData() throws Exception {
		// TODO Auto-generated method stub
		
		TakeScreenshot.takeScreenshot(m_Driver, "Current Yr Data of Employee");
		
	}


	public void verifyEE() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "EE imported Successful");
		
	}


	public void Click_EditEE() throws InterruptedException 
	{
		WebElement elem = getWebElement(Click_EditEmployeeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditEE", "Click_EditEE failed. Unable to locate object: " + Click_EditEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditEE", "Click_EditEE failed. Unable to locate object: " + Click_EditEmployeeElem.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem.toString());
        }
		
		Thread.sleep(2000);


		elem.click();
		          	

		ExtentReportManager.passStep(m_Driver, "Click_EditEE");

		TestModellerLogger.PassStep(m_Driver, "Click_EditEE");
		
	}


	public void verifyJobTitle() throws Exception 
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDesignation']"));
		
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
		
		Thread.sleep(1000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Job Title Verification");
		
	}


	public void verifyGender() throws Exception 
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlGender']"));
		
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
		
		Thread.sleep(1000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Gender Verification");
		
	}


	public void verifyDOB() throws Exception 
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//Input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDOB']"));
		
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
		
		Thread.sleep(1000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "DOB Verification");
		
	}


	public void verifyAddress() throws Exception 
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//Input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress1']"));
		
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
		
		Thread.sleep(1000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Address Verification");
		
	}


	public void verifyDOJ() throws Exception 
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//Input[@id='txtJoiningDate']"));
		
		jsExec.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
		
		Thread.sleep(1000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "DOJ Verification");
		
	}


	public void Click_OpeningBalance() throws InterruptedException 
	{
		
		WebElement elem = getWebElement(Click_OpeningBalanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_OpeningBalance", "Click_OpeningBalance failed. Unable to locate object: " + Click_OpeningBalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_OpeningBalance", "Click_OpeningBalance failed. Unable to locate object: " + Click_OpeningBalanceElem.toString());

			Assert.fail("Unable to locate object: " + Click_OpeningBalanceElem.toString());
        }
		
		Thread.sleep(2000);


		elem.click();
		          	

		ExtentReportManager.passStep(m_Driver, "Click_OpeningBalance");

		TestModellerLogger.PassStep(m_Driver, "Click_OpeningBalance");
		
	}
	
}