package pages;

import pages.BasePage;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d11931fc-f9f3-4063-9b8f-88b7f3403c27
@TestModellerModule(guid = "d11931fc-f9f3-4063-9b8f-88b7f3403c27")
public class EEIndividualPay extends BasePage
{
	public EEIndividualPay (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Reports_Elem = By.xpath("//span[text()='Reports']");

	private By Individual_Employee_Pay_ScheduleElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportEmployeePayHistoryDeatils']");
	
	private By Individual_Employee_P60Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");

	private By chooseEmployeeElem = By.xpath("//label[normalize-space()= 'Employee :']/../div/select");

	private By Download_PayslipbuttonElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$btnDownloadPayslips']");

	private By EmailButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By ChooseEE_ERElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cpHeaderRight$EmailType']");

	private By PDFViewElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_A1']");

	private By DownloadOptionElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=15604&IsEmployer=True");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=15604&IsEmployer=True");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=15604&IsEmployer=True");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=15604&IsEmployer=True";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/ReportEmployeePayHistoryDeatils.aspx?PayrollCompanyCode=15604&IsEmployer=True")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Reports 
     * @name Click  Reports 
     */
	public void Click__Reports_()
	{
        
		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
	}

     
	/**
 	 * Click Individual Employee Pay Schedule
     * @name Click Individual Employee Pay Schedule
     */
	public void Click_Individual_Employee_Pay_Schedule()
	{
        
		WebElement elem = getWebElement(Individual_Employee_Pay_ScheduleElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Individual_Employee_Pay_Schedule", "Click_Individual_Employee_Pay_Schedule failed. Unable to locate object: " + Individual_Employee_Pay_ScheduleElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Individual_Employee_Pay_Schedule", "Click_Individual_Employee_Pay_Schedule failed. Unable to locate object: " + Individual_Employee_Pay_ScheduleElem.toString());

			Assert.fail("Unable to locate object: " + Individual_Employee_Pay_ScheduleElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Individual_Employee_Pay_Schedule");

		TestModellerLogger.PassStep(m_Driver, "Click_Individual_Employee_Pay_Schedule");
	}
	
	
	/**
 	 * Click Click Individual Employee P60
     * @name Click Individual Employee P60
     */
	public void Click_Individual_Employee_P60()
	{
        
		WebElement elem = getWebElement(Individual_Employee_P60Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Individual_Employee_P60", "Click_Individual_Employee_P60Elem. Unable to locate object: " + Individual_Employee_P60Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Individual_Employee_P60", "Click_Individual_Employee_P60Elem. Unable to locate object: " + Individual_Employee_P60Elem.toString());

			Assert.fail("Unable to locate object: " + Individual_Employee_P60Elem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Individual_Employee_P60Elem");

		TestModellerLogger.PassStep(m_Driver, "Click_Individual_Employee_P60Elem");
	}

    
	/**
 	 * Select chooseEmployee
     * @name Select chooseEmployee
     */
    public void Select_chooseEmployee(String chooseEmployee)
 	{
 	    
 		WebElement elem = getWebElement(chooseEmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_chooseEmployee", "Select_chooseEmployee failed. Unable to locate object: " + chooseEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_chooseEmployee", "Select_chooseEmployee failed. Unable to locate object: " + chooseEmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + chooseEmployeeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(chooseEmployee);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_chooseEmployee " + chooseEmployee);

 		TestModellerLogger.PassStep(m_Driver, "Select_chooseEmployee " + chooseEmployee);
 	}
    
    
    /**
 	 * Select chooseEmployee
     * @name Select chooseEmployee
     */
    public void Select_chooseEmployee1(String chooseEmployee)
 	{
 	    
 		WebElement elem = getWebElement(chooseEmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_chooseEmployee", "Select_chooseEmployee failed. Unable to locate object: " + chooseEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_chooseEmployee", "Select_chooseEmployee failed. Unable to locate object: " + chooseEmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + chooseEmployeeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(chooseEmployee);
 		
 		ChangeWindow.tabswitch(m_Driver);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_chooseEmployee " + chooseEmployee);

 		TestModellerLogger.PassStep(m_Driver, "Select_chooseEmployee " + chooseEmployee);
 	}

     
	/**
 	 * Click Download Payslipbutton
     * @name Click Download Payslipbutton
     */
	public void Click_Download_Payslipbutton()
	{
        
		WebElement elem = getWebElement(Download_PayslipbuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Download_Payslipbutton", "Click_Download_Payslipbutton failed. Unable to locate object: " + Download_PayslipbuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Download_Payslipbutton", "Click_Download_Payslipbutton failed. Unable to locate object: " + Download_PayslipbuttonElem.toString());

			Assert.fail("Unable to locate object: " + Download_PayslipbuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Download_Payslipbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Download_Payslipbutton");
	}

     
	/**
 	 * Click EmailButton
     * @name Click EmailButton
     */
	public void Click_EmailButton()
	{
        
		WebElement elem = getWebElement(EmailButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailButton", "Click_EmailButton failed. Unable to locate object: " + EmailButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailButton", "Click_EmailButton failed. Unable to locate object: " + EmailButtonElem.toString());

			Assert.fail("Unable to locate object: " + EmailButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EmailButton");

		TestModellerLogger.PassStep(m_Driver, "Click_EmailButton");
	}

    
	/**
 	 * Select ChooseEE_ER
     * @name Select ChooseEE_ER
     */
    public void Select_ChooseEE_ER(String ChooseEE_ER)
 	{
 	    
 		WebElement elem = getWebElement(ChooseEE_ERElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ChooseEE_ER", "Select_ChooseEE_ER failed. Unable to locate object: " + ChooseEE_ERElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ChooseEE_ER", "Select_ChooseEE_ER failed. Unable to locate object: " + ChooseEE_ERElem.toString());

 			Assert.fail("Unable to locate object: " + ChooseEE_ERElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ChooseEE_ER);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ChooseEE_ER " + ChooseEE_ER);

 		TestModellerLogger.PassStep(m_Driver, "Select_ChooseEE_ER " + ChooseEE_ER);
 	}

     
	/**
 	 * Click PDFView
     * @name Click PDFView
     */
	public void Click_PDFView()
	{
        
		WebElement elem = getWebElement(PDFViewElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PDFView", "Click_PDFView failed. Unable to locate object: " + PDFViewElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PDFView", "Click_PDFView failed. Unable to locate object: " + PDFViewElem.toString());

			Assert.fail("Unable to locate object: " + PDFViewElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_PDFView");

		TestModellerLogger.PassStep(m_Driver, "Click_PDFView");
	}

     
	/**
 	 * Click DownloadOption
     * @name Click DownloadOption
     */
	public void Click_DownloadOption()
	{
        
		WebElement elem = getWebElement(DownloadOptionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownloadOption", "Click_DownloadOption failed. Unable to locate object: " + DownloadOptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownloadOption", "Click_DownloadOption failed. Unable to locate object: " + DownloadOptionElem.toString());

			Assert.fail("Unable to locate object: " + DownloadOptionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_DownloadOption");

		TestModellerLogger.PassStep(m_Driver, "Click_DownloadOption");
	}
}