package EPS;

import pages.BasePage;

import static org.testng.Assert.assertNotSame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import frequency.gotofilingmanagement1;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/be536fa3-5262-4481-9953-c2851d0b9b2e
@TestModellerModule(guid = "be536fa3-5262-4481-9953-c2851d0b9b2e")
public class getrequiredDateforMaternity extends BasePage
{
	String ExpectedDate="05/04/2021";
	String ActualDate="";
	
	String startDate="";
	String endDate="";
	String requiredDate="";
	boolean b=false;
	
//	static String requiredDate="";
	public getrequiredDateforMaternity (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By gotoEditCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By clickPayrollDetailsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");

	private By clickPayrollSettingsElem = By.xpath("//A[contains(text(),'Payroll Settings')]");

	private By TemplateColorElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tppayrollDetails$ddlPaySlipTemplate']");

	private By ClickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By ClickPayslipsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By clickReGenerateElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']");

	private By downloadPaySlipElem = By.xpath("//A[@data-original-title='Payslip download']");

	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");
	
	
	private By clickEmployeeListElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefEmployeeList']");

	private By selectEmployeeStatusElem = By.xpath("//label[contains(.,'Employee Status :')]/../select");

	private By SearchEmployeFirstNameElem = By.xpath("//label[contains(.,'Employee Status :')]/../../div[2]/input");

	private By clickSearchElem = By.xpath("//label[contains(.,'Employee Status :')]/../../div[2]/a");

	private By clickonEmpNameElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/a");

	private By clickAddLeaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefSMP']");

	private By getStartDatePaternityElem = By.xpath("//label[contains(.,'Leave Start Date:')]/../div[1]/div/input");

	private By getEndDatePaternityElem = By.xpath("//label[contains(.,'Leave End Date:')]/../div/div/input");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportCompanyPayHistory.aspx?PayrollCompanyCode=12008")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickPayroll
     * @name Click ClickPayroll
     */
	public void Click_ClickPayroll()
	{
        
		WebElement elem = getWebElement(ClickPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickPayroll", "Click_ClickPayroll failed. Unable to locate object: " + ClickPayrollElem.toString());

			Assert.fail("Unable to locate object: " + ClickPayrollElem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);
		
		requiredDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[1]")).getText();
		System.out.println("requiredDate="+requiredDate);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickPayroll");
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
 	 * Select selectEmployeeStatus
     * @name Select selectEmployeeStatus
     */
    public void Select_selectEmployeeStatus(String selectEmployeeStatus)
 	{
 	    
 		WebElement elem = getWebElement(selectEmployeeStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectEmployeeStatus", "Select_selectEmployeeStatus failed. Unable to locate object: " + selectEmployeeStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectEmployeeStatus", "Select_selectEmployeeStatus failed. Unable to locate object: " + selectEmployeeStatusElem.toString());

 			Assert.fail("Unable to locate object: " + selectEmployeeStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectEmployeeStatus);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectEmployeeStatus " + selectEmployeeStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectEmployeeStatus " + selectEmployeeStatus);
 	}

      
	/**
 	 * Enter SearchEmployeFirstName
     * @name Enter SearchEmployeFirstName
     */
 	public void Enter_SearchEmployeFirstName(String SearchEmployeFirstName)
 	{
 	    
 		WebElement elem = getWebElement(SearchEmployeFirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchEmployeFirstName", "Enter_SearchEmployeFirstName failed. Unable to locate object: " + SearchEmployeFirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchEmployeFirstName", "Enter_SearchEmployeFirstName failed. Unable to locate object: " + SearchEmployeFirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchEmployeFirstNameElem.toString());
         }

 		elem.sendKeys(SearchEmployeFirstName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchEmployeFirstName " + SearchEmployeFirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchEmployeFirstName " + SearchEmployeFirstName);
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
 	 * Click clickonEmpName
     * @name Click clickonEmpName
     */
	public void Click_clickonEmpName()
	{
        
		WebElement elem = getWebElement(clickonEmpNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickonEmpName", "Click_clickonEmpName failed. Unable to locate object: " + clickonEmpNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickonEmpName", "Click_clickonEmpName failed. Unable to locate object: " + clickonEmpNameElem.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickonEmpName");

		TestModellerLogger.PassStep(m_Driver, "Click_clickonEmpName");
	}

     
	/**
 	 * Click clickAddLeave
     * @name Click clickAddLeave
     */
	public void Click_clickAddLeave()
	{
        
		WebElement elem = getWebElement(clickAddLeaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAddLeave", "Click_clickAddLeave failed. Unable to locate object: " + clickAddLeaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAddLeave", "Click_clickAddLeave failed. Unable to locate object: " + clickAddLeaveElem.toString());

			Assert.fail("Unable to locate object: " + clickAddLeaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAddLeave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAddLeave");
	}
	
	public void start_and_end_date() throws Exception
	{
		  jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDate']")));
		    
		   startDate= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDate']")).getAttribute("value");
		   System.out.println("startdate="+startDate);
		   
		   
		   
		   
		    endDate= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEndDate']")).getAttribute("value");
		    System.out.println("enddate="+endDate);
		    
		    
		    
		    SimpleDateFormat ob=new SimpleDateFormat("dd/MM/yyyy");
			Date sDate=ob.parse(startDate);
			System.out.println("sDate="+sDate);
			Date eDate=ob.parse(endDate);
			System.out.println("eDate="+eDate);
			Date rDate=ob.parse(requiredDate);
			System.out.println("rDate="+rDate);
			
			

			if(rDate.after(sDate) && rDate.before(eDate))
			{
				 b=true;
				 System.out.println("b=+"+b);
				 Thread.sleep(2000);
				
				 
				// m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']")).click();
				WebElement elem=m_Driver.findElement(By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']"));
				 
				 jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
				 jsExec.executeScript("arguments[0].click();", elem);
				 
//				 gotofilingmanagement1 singleEPS=new gotofilingmanagement1(m_Driver);
//				 singleEPS.Click_gotoFilingManagement();
//				 

	int length=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[6]")).size();
					
					for(int i=2;i<=length+1;i++)
					{
						String out=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[5]")).getText();
						//System.out.println("i="+out);
						
						if(out.equalsIgnoreCase("EPS"))
						{
								String Datevalue=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();
								System.out.println("Datevalue"+Datevalue);
								ActualDate=Datevalue;
								assertNotSame(ActualDate, ExpectedDate);
								
							}
							
							
							ExpectedDate=ActualDate;
							System.out.println("ExpectedDate="+ExpectedDate);
							
							//assertEquals(ActualDate, ExpectedDate);
						
					}
					
				 
			}
			else {
				System.out.println("b=="+b);
			}
			
			
	}

      
	/**
 	 * Enter getStartDatePaternity
     * @name Enter getStartDatePaternity
     */
 	public void Enter_getStartDatePaternity(String getStartDatePaternity)
 	{
 	    
 		WebElement elem = getWebElement(getStartDatePaternityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getStartDatePaternity", "Enter_getStartDatePaternity failed. Unable to locate object: " + getStartDatePaternityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getStartDatePaternity", "Enter_getStartDatePaternity failed. Unable to locate object: " + getStartDatePaternityElem.toString());

 			Assert.fail("Unable to locate object: " + getStartDatePaternityElem.toString());
         }

 		elem.getText();
 		System.out.println("elemstartdate ="+elem);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getStartDatePaternity " + getStartDatePaternity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getStartDatePaternity " + getStartDatePaternity);
 	}

      
	/**
 	 * Enter getEndDatePaternity
	 * @throws InterruptedException 
     * @name Enter getEndDatePaternity
     */
 	public void Enter_getEndDatePaternity(String getEndDatePaternity) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(getEndDatePaternityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getEndDatePaternity", "Enter_getEndDatePaternity failed. Unable to locate object: " + getEndDatePaternityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getEndDatePaternity", "Enter_getEndDatePaternity failed. Unable to locate object: " + getEndDatePaternityElem.toString());

 			Assert.fail("Unable to locate object: " + getEndDatePaternityElem.toString());
         }

 		Thread.sleep(3000);
 		elem.getAttribute("value");
 		System.out.println("elemenddate ="+elem);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getEndDatePaternity " + getEndDatePaternity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getEndDatePaternity " + getEndDatePaternity);
 	}
	
	
	
	
     
	/**
 	 * Click gotoEditCompany
     * @name Click gotoEditCompany
     */
	public void Click_gotoEditCompany()
	{
        
		WebElement elem = getWebElement(gotoEditCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoEditCompany", "Click_gotoEditCompany failed. Unable to locate object: " + gotoEditCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoEditCompany", "Click_gotoEditCompany failed. Unable to locate object: " + gotoEditCompanyElem.toString());

			Assert.fail("Unable to locate object: " + gotoEditCompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoEditCompany");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoEditCompany");
	}

     
	/**
 	 * Click clickPayrollDetails
     * @name Click clickPayrollDetails
     */
	public void Click_clickPayrollDetails()
	{
        
		WebElement elem = getWebElement(clickPayrollDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollDetails", "Click_clickPayrollDetails failed. Unable to locate object: " + clickPayrollDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollDetails", "Click_clickPayrollDetails failed. Unable to locate object: " + clickPayrollDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollDetailsElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollDetails");
	}

     
	/**
 	 * Click clickPayrollSettings
	 * @throws Exception 
     * @name Click clickPayrollSettings
     */
	public void Click_clickPayrollSettings() throws Exception
	{
        
		WebElement elem = getWebElement(clickPayrollSettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSettings", "Click_clickPayrollSettings failed. Unable to locate object: " + clickPayrollSettingsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSettingsElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "Weekly pay EMP added to Company");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSettings");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSettings");
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

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     

     
	/**
 	 * Click gotoPayrollDashboard
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard()
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
}