package pages1;

import pages.BasePage;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.w3c.dom.Document;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import pages1.reports;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/46854a4b-f0f4-45a9-b0e7-ce52bf9c4a21
@TestModellerModule(guid = "46854a4b-f0f4-45a9-b0e7-ce52bf9c4a21")
public class CompareLEL extends BasePage
{
	public CompareLEL (WebDriver driver)
	{
		super(driver);
	}


	
	private By YesElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbP11D_0']");

	private By _SaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By _Payroll_Dashboard_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By Mr_sumit_jhaElem = By.xpath("//A[contains(text(),'Mr. sumit jha')]");

	private By _Edit_employee_details_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");

	private By Expenses_and_BenefitsElem = By.xpath("//SPAN[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpExpensesandBenefits']");

	private By _Filing_Management_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

	private By ctl00ctl00ParentContentcpHeadingddlPayrollFrequencyElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeading$ddlPayrollFrequency']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagmentP11D.aspx?PayrollCompanyCode=11980")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	
     
	/**
 	 * Click  Filing Management 
	 * @throws Exception 
	 * @name Click  Filing Management 
     */
	public void Click__Filing_Management_() throws Exception
	{
        
		WebElement elem = getWebElement(_Filing_Management_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Filing_Management_", "Click__Filing_Management_ failed. Unable to locate object: " + _Filing_Management_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Filing_Management_", "Click__Filing_Management_ failed. Unable to locate object: " + _Filing_Management_Elem.toString());

			Assert.fail("Unable to locate object: " + _Filing_Management_Elem.toString());
        }
		
		
		

		jsExec.executeScript("arguments[0].click();", elem);
          	WebElement TaxYear=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']"));
          	Select year=new Select(TaxYear);
          	Thread.sleep(2000);
          	year.selectByVisibleText("2020-2021");
          	Thread.sleep(2000);
          	
          	reports ob=new reports(m_Driver);
          	double obtainedLEL=ob.getLEL();
          	System.out.println("After return"+obtainedLEL);
          	
          	
          	//Reading XML files
          	
          	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
          	DocumentBuilder builder=factory.newDocumentBuilder();
          	
          	Document DOC=builder.parse("");
          	System.out.println();
         
          	
          	
          	
          	 
		ExtentReportManager.passStep(m_Driver, "Click__Filing_Management_");

		TestModellerLogger.PassStep(m_Driver, "Click__Filing_Management_");
	}

    
	
}