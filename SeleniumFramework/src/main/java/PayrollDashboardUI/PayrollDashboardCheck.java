package PayrollDashboardUI;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ExcelData;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/330f063a-3857-480f-ace3-f801421f02e2
@TestModellerModule(guid = "330f063a-3857-480f-ace3-f801421f02e2")
public class PayrollDashboardCheck extends BasePage
{
	
	
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public PayrollDashboardCheck (WebDriver driver)
	{
		super(driver);
	}


	
	private By NomismaLogoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_imgProfile']");

	private By ClientNameElem = By.xpath("//SPAN[contains(text(),'EmailAttachment')]");

	private By selectTaxYearsoptionElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By PayrollDateselectionElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']");

	private By EmployerViewButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");

	private By ClientLogin_LogoutElem = By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul/li[4]/a/div[2]/span");

	private By gotoPayrollDashboardBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By gotoTaxPaymentBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");

	private By gotoFilingManagementBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

	private By gotoLeaveManagementBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefLeaveManagement']");

	private By gotoReportsBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By EditCompanyBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany']");

	private By checkUpcomingLeaveBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefUpcomingLeave']");

	private By chkEmployerNotesBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefNotesHistory']");

	private By chkJournalsBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefJournals']");

	private By FilingStatusTextElem = By.xpath("//LABEL[contains(text(),'Filing Status:')]");

	private By FilingStatusElem = By.xpath("//label[normalize-space()= 'Filing Status:']/../strong/i/span");

	private By TypeTextforPayrollElem = By.xpath("//LABEL[contains(text(),'Type:')]");

	private By TypeofPayrollElem = By.xpath("//label[normalize-space()= 'Type:']/../strong/i");

	private By FrequencyElem = By.xpath("//LABEL[contains(text(),'Frequency:')]");

	private By FrequencyTypeElem = By.xpath("//label[normalize-space()= 'Frequency:']/../strong/i");

	private By Undo_Last_Payroll_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']");

	private By Run_Payroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By search_inputforCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$search_input']");

	private By clickSearchBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By chkEmployeeListBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefEmployeeList']");

	private By chkNew_EmployeeBtnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefAddEmployee']");

	private By ClickOnEmployeeNameElem = By.xpath("//A[contains(text(),'Mr. A last')]");

	private By ClickOnThreeDotElem = By.xpath("//A[@class='report_icon dropdown-toggle el-selection']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12560");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12560");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12560");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12560";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=12560")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click NomismaLogo
     * @name Click NomismaLogo
     */
	public void Click_NomismaLogo()
	{
        
		WebElement elem = getWebElement(NomismaLogoElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NomismaLogo", "Click_NomismaLogo failed. Unable to locate object: " + NomismaLogoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NomismaLogo", "Click_NomismaLogo failed. Unable to locate object: " + NomismaLogoElem.toString());

			Assert.fail("Unable to locate object: " + NomismaLogoElem.toString());
        }

//		String logoText=elem.getText();
//		
//		WebElement i = elem;
			      // Javascript executor to check image
			      Boolean p = (Boolean) jsExec.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", elem);

			      //verify if status is true
			      if (p) {
			         System.out.println("Logo present");
			      } else {
			         System.out.println("Logo not present");
			      }
          	

		ExtentReportManager.passStep(m_Driver, "Click_NomismaLogo");

		TestModellerLogger.PassStep(m_Driver, "Click_NomismaLogo");
	}

     
	/**
 	 * Click ClientName
     * @name Click ClientName
     */
	public void Click_ClientName()
	{
		
		sTestCaseID="TC298";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
		WebElement elem = getWebElement(ClientNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientName", "Click_ClientName failed. Unable to locate object: " + ClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientName", "Click_ClientName failed. Unable to locate object: " + ClientNameElem.toString());

			Assert.fail("Unable to locate object: " + ClientNameElem.toString());
        }

		String getClientName=elem.getText();
		String ExpectedName=data[4];
		System.out.println("Name="+getClientName);
		assertEquals(getClientName, ExpectedName);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClientName");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientName");
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

    
	/**
 	 * Select PayrollDateselection
     * @name Select PayrollDateselection
     */
    public void Select_PayrollDateselection(String PayrollDateselection)
 	{
 	    
 		WebElement elem = getWebElement(PayrollDateselectionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PayrollDateselection", "Select_PayrollDateselection failed. Unable to locate object: " + PayrollDateselectionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PayrollDateselection", "Select_PayrollDateselection failed. Unable to locate object: " + PayrollDateselectionElem.toString());

 			Assert.fail("Unable to locate object: " + PayrollDateselectionElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PayrollDateselection);
 		
 	//	System.out.println(elem.getText());
 		
// 		String ExpectedDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")).getText();
// 		System.out.println(ExpectedDate);
// 		
	//	Assert.assertTrue(ExpectedDate.contains(PayrollDateselection));
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PayrollDateselection " + PayrollDateselection);

 		TestModellerLogger.PassStep(m_Driver, "Select_PayrollDateselection " + PayrollDateselection);
 	}

     
	/**
 	 * Click EmployerViewButton
     * @name Click EmployerViewButton
     */
	public void Click_EmployerViewButton()
	{
        
		WebElement elem = getWebElement(EmployerViewButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmployerViewButton", "Click_EmployerViewButton failed. Unable to locate object: " + EmployerViewButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmployerViewButton", "Click_EmployerViewButton failed. Unable to locate object: " + EmployerViewButtonElem.toString());

			Assert.fail("Unable to locate object: " + EmployerViewButtonElem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);	

		ExtentReportManager.passStep(m_Driver, "Click_EmployerViewButton");

		TestModellerLogger.PassStep(m_Driver, "Click_EmployerViewButton");
	}
	
	
	/**
	 * Verify Employer View button
	 */
	public void EmployerViewverification()
	{
		
		String Expected="Employers View";
		String Actual=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2")).getText();
		System.out.println("Actual="+Actual);
		assertEquals(Actual, Expected);
	}

     
	/**
 	 * Click ClientLogin_Logout
     * @name Click ClientLogin_Logout
     */
	public void Click_ClientLogin_Logout()
	{
        
		WebElement elem = getWebElement(ClientLogin_LogoutElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientLogin_Logout", "Click_ClientLogin_Logout failed. Unable to locate object: " + ClientLogin_LogoutElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientLogin_Logout", "Click_ClientLogin_Logout failed. Unable to locate object: " + ClientLogin_LogoutElem.toString());

			Assert.fail("Unable to locate object: " + ClientLogin_LogoutElem.toString());
        }

		elem.click();
//		elem.sendKeys(Keys.ARROW_DOWN);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefInbox']")).click();
//		ChangeWindow.tabswitch(m_Driver);
		
//		Actions ac=new Actions(m_Driver);
//		ac.keyDown();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClientLogin_Logout");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientLogin_Logout");
	}
	
	
	/**
	 * Verify Email log button
	 */
	public void EmailLog()
	{
		
		String Expected=" Email Log";
		String Actual=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2")).getText();
		System.out.println("Actual="+Actual);
		assertEquals(Actual, Expected);
	}
	
	
	
	/**
 	 * Click ClientLogin_Logout
     * @name Click ClientLogin_Logout
     */
	public void Click_ClientLogin_Logout1()
	{
        
		WebElement elem = getWebElement(ClientLogin_LogoutElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientLogin_Logout", "Click_ClientLogin_Logout failed. Unable to locate object: " + ClientLogin_LogoutElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientLogin_Logout", "Click_ClientLogin_Logout failed. Unable to locate object: " + ClientLogin_LogoutElem.toString());

			Assert.fail("Unable to locate object: " + ClientLogin_LogoutElem.toString());
        }

		elem.click();
//		elem.sendKeys(Keys.ARROW_DOWN);
		m_Driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/main/header/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		ChangeWindow.tabswitch(m_Driver);
		
//		Actions ac=new Actions(m_Driver);
//		ac.keyDown();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClientLogin_Logout");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientLogin_Logout");
	}
	
	
	/**
	 * Verify Email log button
	 * @throws Exception 
	 */
	public void changePSWDScreenShot() throws Exception
	{
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "Change pswd window");
	}
	
	
	
	/**
 	 * Click ClientLogin_Logout
     * @name Click ClientLogin_Logout
     */
	public void Click_ClientLogin_Logout2()
	{
        
		WebElement elem = getWebElement(ClientLogin_LogoutElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientLogin_Logout", "Click_ClientLogin_Logout failed. Unable to locate object: " + ClientLogin_LogoutElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientLogin_Logout", "Click_ClientLogin_Logout failed. Unable to locate object: " + ClientLogin_LogoutElem.toString());

			Assert.fail("Unable to locate object: " + ClientLogin_LogoutElem.toString());
        }

		elem.click();
//		elem.sendKeys(Keys.ARROW_DOWN);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefLogout']")).click();
//		ChangeWindow.tabswitch(m_Driver);
		
//		Actions ac=new Actions(m_Driver);
//		ac.keyDown();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClientLogin_Logout");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientLogin_Logout");
	}

     
	/**
 	 * Click gotoPayrollDashboardBtn
     * @name Click gotoPayrollDashboardBtn
     */
	public void Click_gotoPayrollDashboardBtn()
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboardBtn", "Click_gotoPayrollDashboardBtn failed. Unable to locate object: " + gotoPayrollDashboardBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboardBtn", "Click_gotoPayrollDashboardBtn failed. Unable to locate object: " + gotoPayrollDashboardBtnElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboardBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboardBtn");
	}

     
	/**
 	 * Click gotoTaxPaymentBtn
     * @name Click gotoTaxPaymentBtn
     */
	public void Click_gotoTaxPaymentBtn()
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPaymentBtn", "Click_gotoTaxPaymentBtn failed. Unable to locate object: " + gotoTaxPaymentBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPaymentBtn", "Click_gotoTaxPaymentBtn failed. Unable to locate object: " + gotoTaxPaymentBtnElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPaymentBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPaymentBtn");
	}

     
	/**
 	 * Click gotoFilingManagementBtn
     * @name Click gotoFilingManagementBtn
     */
	public void Click_gotoFilingManagementBtn()
	{
        
		WebElement elem = getWebElement(gotoFilingManagementBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFilingManagementBtn", "Click_gotoFilingManagementBtn failed. Unable to locate object: " + gotoFilingManagementBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFilingManagementBtn", "Click_gotoFilingManagementBtn failed. Unable to locate object: " + gotoFilingManagementBtnElem.toString());

			Assert.fail("Unable to locate object: " + gotoFilingManagementBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagementBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFilingManagementBtn");
	}

     
	/**
 	 * Click gotoLeaveManagementBtn
     * @name Click gotoLeaveManagementBtn
     */
	public void Click_gotoLeaveManagementBtn()
	{
        
		WebElement elem = getWebElement(gotoLeaveManagementBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoLeaveManagementBtn", "Click_gotoLeaveManagementBtn failed. Unable to locate object: " + gotoLeaveManagementBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoLeaveManagementBtn", "Click_gotoLeaveManagementBtn failed. Unable to locate object: " + gotoLeaveManagementBtnElem.toString());

			Assert.fail("Unable to locate object: " + gotoLeaveManagementBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoLeaveManagementBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoLeaveManagementBtn");
	}

     
	/**
 	 * Click gotoReportsBtn
     * @name Click gotoReportsBtn
     */
	public void Click_gotoReportsBtn()
	{
        
		WebElement elem = getWebElement(gotoReportsBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReportsBtn", "Click_gotoReportsBtn failed. Unable to locate object: " + gotoReportsBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReportsBtn", "Click_gotoReportsBtn failed. Unable to locate object: " + gotoReportsBtnElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReportsBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReportsBtn");
	}

     
	/**
 	 * Click EditCompanyBtn
     * @name Click EditCompanyBtn
     */
	public void Click_EditCompanyBtn()
	{
        
		WebElement elem = getWebElement(EditCompanyBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditCompanyBtn", "Click_EditCompanyBtn failed. Unable to locate object: " + EditCompanyBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditCompanyBtn", "Click_EditCompanyBtn failed. Unable to locate object: " + EditCompanyBtnElem.toString());

			Assert.fail("Unable to locate object: " + EditCompanyBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EditCompanyBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_EditCompanyBtn");
	}

     
	/**
 	 * Click checkUpcomingLeaveBtn
     * @name Click checkUpcomingLeaveBtn
     */
	public void Click_checkUpcomingLeaveBtn()
	{
        
		WebElement elem = getWebElement(checkUpcomingLeaveBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkUpcomingLeaveBtn", "Click_checkUpcomingLeaveBtn failed. Unable to locate object: " + checkUpcomingLeaveBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkUpcomingLeaveBtn", "Click_checkUpcomingLeaveBtn failed. Unable to locate object: " + checkUpcomingLeaveBtnElem.toString());

			Assert.fail("Unable to locate object: " + checkUpcomingLeaveBtnElem.toString());
        }

		elem.click();
		
//		ChangeWindow.tabswitch(m_Driver);
		
		String EmployeeeaveHeader=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span")).getText();
		
		String HeaderExpected="Employee's Leave";
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_checkUpcomingLeaveBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_checkUpcomingLeaveBtn");
	}

     
	/**
 	 * Click chkEmployerNotesBtn
     * @name Click chkEmployerNotesBtn
     */
	public void Click_chkEmployerNotesBtn()
	{
        
		WebElement elem = getWebElement(chkEmployerNotesBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkEmployerNotesBtn", "Click_chkEmployerNotesBtn failed. Unable to locate object: " + chkEmployerNotesBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkEmployerNotesBtn", "Click_chkEmployerNotesBtn failed. Unable to locate object: " + chkEmployerNotesBtnElem.toString());

			Assert.fail("Unable to locate object: " + chkEmployerNotesBtnElem.toString());
        }

		elem.click();
		
		String ERNoteBtn=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2")).getText();
		
		String HeaderExpected="Employer Notes ";
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_chkEmployerNotesBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_chkEmployerNotesBtn");
	}

     
	/**
 	 * Click chkJournalsBtn
     * @name Click chkJournalsBtn
     */
	public void Click_chkJournalsBtn()
	{
        
		WebElement elem = getWebElement(chkJournalsBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkJournalsBtn", "Click_chkJournalsBtn failed. Unable to locate object: " + chkJournalsBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkJournalsBtn", "Click_chkJournalsBtn failed. Unable to locate object: " + chkJournalsBtnElem.toString());

			Assert.fail("Unable to locate object: " + chkJournalsBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_chkJournalsBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_chkJournalsBtn");
	}

     
	/**
 	 * Click FilingStatusText
     * @name Click FilingStatusText
     */
	public void Click_FilingStatusText()
	{
        
		WebElement elem = getWebElement(FilingStatusTextElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_FilingStatusText", "Click_FilingStatusText failed. Unable to locate object: " + FilingStatusTextElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_FilingStatusText", "Click_FilingStatusText failed. Unable to locate object: " + FilingStatusTextElem.toString());

			Assert.fail("Unable to locate object: " + FilingStatusTextElem.toString());
        }

		String finalStatustext=elem.getText();
		
		System.out.println("final status="+finalStatustext);
		
		String Expected="Filing Status:";
		
	
          	

		ExtentReportManager.passStep(m_Driver, "Click_FilingStatusText");

		TestModellerLogger.PassStep(m_Driver, "Click_FilingStatusText");
	}

     
	/**
 	 * Click FilingStatus
     * @name Click FilingStatus
     */
	public void Click_FilingStatus()
	{
        
		WebElement elem = getWebElement(FilingStatusElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_FilingStatus", "Click_FilingStatus failed. Unable to locate object: " + FilingStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_FilingStatus", "Click_FilingStatus failed. Unable to locate object: " + FilingStatusElem.toString());

			Assert.fail("Unable to locate object: " + FilingStatusElem.toString());
        }

		String finalStatustext=elem.getText();
		
		System.out.println("final status="+finalStatustext);
		
		String Expected="Draft";
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_FilingStatus");

		TestModellerLogger.PassStep(m_Driver, "Click_FilingStatus");
	}

     
	/**
 	 * Click TypeTextforPayroll
     * @name Click TypeTextforPayroll
     */
	public void Click_TypeTextforPayroll()
	{
        
		WebElement elem = getWebElement(TypeTextforPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TypeTextforPayroll", "Click_TypeTextforPayroll failed. Unable to locate object: " + TypeTextforPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TypeTextforPayroll", "Click_TypeTextforPayroll failed. Unable to locate object: " + TypeTextforPayrollElem.toString());

			Assert.fail("Unable to locate object: " + TypeTextforPayrollElem.toString());
        }

		String payrollTypetxt=elem.getText();
		
		System.out.println("Payroll type text="+payrollTypetxt);
		
		String Expected="Type:";
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_TypeTextforPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_TypeTextforPayroll");
	}

     
	/**
 	 * Click TypeofPayroll
     * @name Click TypeofPayroll
     */
	public void Click_TypeofPayroll()
	{
        
		WebElement elem = getWebElement(TypeofPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TypeofPayroll", "Click_TypeofPayroll failed. Unable to locate object: " + TypeofPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TypeofPayroll", "Click_TypeofPayroll failed. Unable to locate object: " + TypeofPayrollElem.toString());

			Assert.fail("Unable to locate object: " + TypeofPayrollElem.toString());
        }

		String payrollType=elem.getText();
		
		System.out.println("Payroll type="+payrollType);
		
		String Expected="Manual";
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_TypeofPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_TypeofPayroll");
	}

     
	/**
 	 * Click Frequency
     * @name Click Frequency
     */
	public void Click_Frequency()
	{
        
		WebElement elem = getWebElement(FrequencyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Frequency", "Click_Frequency failed. Unable to locate object: " + FrequencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Frequency", "Click_Frequency failed. Unable to locate object: " + FrequencyElem.toString());

			Assert.fail("Unable to locate object: " + FrequencyElem.toString());
        }

		String frequencyText=elem.getText();
		
		System.out.println("Frequency Text="+frequencyText);
		
		String Expected="Frequency:";
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_Frequency");

		TestModellerLogger.PassStep(m_Driver, "Click_Frequency");
	}

     
	/**
 	 * Click FrequencyType
     * @name Click FrequencyType
     */
	public void Click_FrequencyType()
	{
        
		WebElement elem = getWebElement(FrequencyTypeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_FrequencyType", "Click_FrequencyType failed. Unable to locate object: " + FrequencyTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_FrequencyType", "Click_FrequencyType failed. Unable to locate object: " + FrequencyTypeElem.toString());

			Assert.fail("Unable to locate object: " + FrequencyTypeElem.toString());
        }

		String frequencyType=elem.getText();
		
		System.out.println("Frequency Type="+frequencyType);
		
		String Expected="Monthly";
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_FrequencyType");

		TestModellerLogger.PassStep(m_Driver, "Click_FrequencyType");
	}

     
	/**
 	 * Click Undo Last Payroll 
     * @name Click Undo Last Payroll 
     */
	public void Click_Undo_Last_Payroll_()
	{
        
		WebElement elem = getWebElement(Undo_Last_Payroll_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Undo_Last_Payroll_", "Click_Undo_Last_Payroll_ failed. Unable to locate object: " + Undo_Last_Payroll_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Undo_Last_Payroll_", "Click_Undo_Last_Payroll_ failed. Unable to locate object: " + Undo_Last_Payroll_Elem.toString());

			Assert.fail("Unable to locate object: " + Undo_Last_Payroll_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Undo_Last_Payroll_");

		TestModellerLogger.PassStep(m_Driver, "Click_Undo_Last_Payroll_");
	}

     
	/**
 	 * Click Run Payroll1
     * @name Click Run Payroll1
     */
	public void Click_Run_Payroll1()
	{
        
		WebElement elem = getWebElement(Run_Payroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Run_Payroll1", "Click_Run_Payroll1 failed. Unable to locate object: " + Run_Payroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Run_Payroll1", "Click_Run_Payroll1 failed. Unable to locate object: " + Run_Payroll1Elem.toString());

			Assert.fail("Unable to locate object: " + Run_Payroll1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll1");
	}

      
	/**
 	 * Enter search_inputforCompany
     * @name Enter search_inputforCompany
     */
 	public void Enter_search_inputforCompany(String search_inputforCompany)
 	{
 	    
 		WebElement elem = getWebElement(search_inputforCompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_search_inputforCompany", "Enter_search_inputforCompany failed. Unable to locate object: " + search_inputforCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_search_inputforCompany", "Enter_search_inputforCompany failed. Unable to locate object: " + search_inputforCompanyElem.toString());

 			Assert.fail("Unable to locate object: " + search_inputforCompanyElem.toString());
         }

 		elem.sendKeys(search_inputforCompany);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_search_inputforCompany " + search_inputforCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_search_inputforCompany " + search_inputforCompany);
 	}
 	
 	
 	/**
	 * Verify Input for search Employee is working
	 */
	public void getEmpName()
	{
		
		String ActualString= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a")).getText();
		
		System.out.println(ActualString);
		
		String Expected="Mr. A last";
		
	
		
	}

     
	/**
 	 * Click clickSearchBtn
     * @name Click clickSearchBtn
     */
	public void Click_clickSearchBtn()
	{
        
		WebElement elem = getWebElement(clickSearchBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSearchBtn", "Click_clickSearchBtn failed. Unable to locate object: " + clickSearchBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSearchBtn", "Click_clickSearchBtn failed. Unable to locate object: " + clickSearchBtnElem.toString());

			Assert.fail("Unable to locate object: " + clickSearchBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSearchBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSearchBtn");
	}

     
	/**
 	 * Click chkEmployeeListBtn
     * @name Click chkEmployeeListBtn
     */
	public void Click_chkEmployeeListBtn()
	{
        
		WebElement elem = getWebElement(chkEmployeeListBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkEmployeeListBtn", "Click_chkEmployeeListBtn failed. Unable to locate object: " + chkEmployeeListBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkEmployeeListBtn", "Click_chkEmployeeListBtn failed. Unable to locate object: " + chkEmployeeListBtnElem.toString());

			Assert.fail("Unable to locate object: " + chkEmployeeListBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_chkEmployeeListBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_chkEmployeeListBtn");
	}
	
	
	/**
	 * Verify Employee List Btn
	 */
	public void EmplListWindow()
	{
		
		String ActualString= m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span")).getText();
		
		String Expected="Employee Details List";
		
	
		
	}

     
	/**
 	 * Click chkNew EmployeeBtn
     * @name Click chkNew EmployeeBtn
     */
	public void Click_chkNew_EmployeeBtn()
	{
        
		WebElement elem = getWebElement(chkNew_EmployeeBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkNew_EmployeeBtn", "Click_chkNew_EmployeeBtn failed. Unable to locate object: " + chkNew_EmployeeBtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkNew_EmployeeBtn", "Click_chkNew_EmployeeBtn failed. Unable to locate object: " + chkNew_EmployeeBtnElem.toString());

			Assert.fail("Unable to locate object: " + chkNew_EmployeeBtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_chkNew_EmployeeBtn");

		TestModellerLogger.PassStep(m_Driver, "Click_chkNew_EmployeeBtn");
	}
	
	
	/**
	 * Verify New Employee Add Btn
	 */
	public void AddEmplWindow()
	{
		
		String ActualString= m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span")).getText();
		
		System.out.println(ActualString);
		
		String Expected="Add Employee  ";
		
		
		
	}

     
	/**
 	 * Click ClickOnEmployeeName
     * @name Click ClickOnEmployeeName
     */
	public void Click_ClickOnEmployeeName()
	{
        
		WebElement elem = getWebElement(ClickOnEmployeeNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnEmployeeName", "Click_ClickOnEmployeeName failed. Unable to locate object: " + ClickOnEmployeeNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnEmployeeName", "Click_ClickOnEmployeeName failed. Unable to locate object: " + ClickOnEmployeeNameElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnEmployeeNameElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnEmployeeName");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnEmployeeName");
	}

     
	/**
 	 * Click ClickOnThreeDot
     * @name Click ClickOnThreeDot
     */
	public void Click_ClickOnThreeDot()
	{
        
		WebElement elem = getWebElement(ClickOnThreeDotElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnThreeDot", "Click_ClickOnThreeDot failed. Unable to locate object: " + ClickOnThreeDotElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnThreeDot", "Click_ClickOnThreeDot failed. Unable to locate object: " + ClickOnThreeDotElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnThreeDotElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnThreeDot");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnThreeDot");
	}
}