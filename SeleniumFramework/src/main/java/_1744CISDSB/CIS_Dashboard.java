package _1744CISDSB;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8b870776-28b2-478e-8e3c-7625a0d9aee7
@TestModellerModule(guid = "8b870776-28b2-478e-8e3c-7625a0d9aee7")
public class CIS_Dashboard extends BasePage
{
	int number;
//	static String contractorname;
	public CIS_Dashboard (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoCISElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_CIS']/a/span");
	
	private By selectPeriodElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPH$ddlPeriod']");

	private By CIS_DashboardElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_Ul1']/li[1]/a");

	private By DueSubmissionElem = By.xpath("//A[@href='CISSubmit.aspx?UC=0&IsDash=1']");

	private By OverDueReturnsElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[2]/div/div/div[2]/div/div/a[2]");

	private By UpcomingReturnsElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[2]/div/div/div[3]/div/div/a[2]");

	private By FailedSubmissionElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[2]/div/div/div[4]/div/div/a[2]");

	private By TotalContractorElem = By.xpath("//A[@class='el-selection']");

	private By CompanyNameinDueSubmissionElem = By.xpath("//label[normalize-space()= 'Contractor Name:']/../input");

	private By SearchDueSubmissionElem = By.xpath("//label[normalize-space()= 'Contractor Name:']/../../div[2]/a");

	private By FilingPeriodofOverdueReturnElem = By.xpath("//label[normalize-space()= 'Filing Period:']/../select");

	private By SearchOverdueReturnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ContractorinUpercomingReturnElem = By.xpath("//label[normalize-space()= 'Contractor:']/../select");

	private By SearchupcomingReturnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By SearchContractorNameTotalContractorElem = By.xpath("//label[normalize-space()= 'Contractor Name:']/../input");

	private By Add_ContractorElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");

	private By ContractorNameinAddContractorElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtContractorName']");

	private By OfficeNoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtOfficeNo']");

	private By ContractorRefNoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtContractorRefNo']");

	private By AccountOffRefNoElem = By.xpath("//label[normalize-space()= 'Accounts Office Number  *']/../../div[2]/input");

	private By UtrNoElem = By.xpath("//label[normalize-space()= 'UTR Number  *']/../../div[2]/input");

	private By ContractoeFirstNameElem = By.xpath("//label[normalize-space()= 'First Name']/../../div[2]/input");

	private By ContractorSurNameElem = By.xpath("//label[normalize-space()= 'Last Name']/../../div[2]/input");

	private By SubmitElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	private By Search_a_ContractorElem = By.xpath("//INPUT[@placeholder='Search a Contractor...']");

	private By Edit_ContractorElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditContractor']");

	private By Edit_ContractorFrameElem = By.xpath("//H2[contains(text(),'Edit Contractor')]");
	
	private By ThreeDotElem = By.xpath("//a[@class='report_icon dropdown-toggle']");

	private By Make_InactiveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrContractorList_ctl00_lnkMakeInactive']");

	private By New_SubcontractorElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrContractorList_ctl00_lnkNewSubcontractor']");




	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx?UC=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx?UC=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx?UC=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx?UC=0";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportCISContractorList.aspx?UC=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoCIS
	 * @throws InterruptedException 
     * @name Click gotoCIS
     */
	public void Click_gotoCIS() throws InterruptedException
	{
        
		WebElement elem = getWebElement(gotoCISElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoCIS", "Click_gotoCIS failed. Unable to locate object: " + gotoCISElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoCIS", "Click_gotoCIS failed. Unable to locate object: " + gotoCISElem.toString());

			Assert.fail("Unable to locate object: " + gotoCISElem.toString());
        }

		elem.click();
		
		Thread.sleep(1000);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoCIS");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoCIS");
	}

     
	/**
 	 * Click CIS Dashboard
	 * @throws InterruptedException 
     * @name Click CIS Dashboard
     */
	public void Click_CIS_Dashboard() throws InterruptedException
	{
        
		WebElement elem = getWebElement(CIS_DashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CIS_Dashboard", "Click_CIS_Dashboard failed. Unable to locate object: " + CIS_DashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CIS_Dashboard", "Click_CIS_Dashboard failed. Unable to locate object: " + CIS_DashboardElem.toString());

			Assert.fail("Unable to locate object: " + CIS_DashboardElem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
		
//		contractorname=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[5]/div[3]/div[2]/div[3]/div/div/div/div/table/tbody/tr[1]/td[1]")).getText();

          	

		ExtentReportManager.passStep(m_Driver, "Click_CIS_Dashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_CIS_Dashboard");
	}

     
	/**
 	 * Click DueSubmission
     * @name Click DueSubmission
     */
	public void Click_DueSubmission()
	{
        
		WebElement elem = getWebElement(DueSubmissionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DueSubmission", "Click_DueSubmission failed. Unable to locate object: " + DueSubmissionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DueSubmission", "Click_DueSubmission failed. Unable to locate object: " + DueSubmissionElem.toString());

			Assert.fail("Unable to locate object: " + DueSubmissionElem.toString());
        }

//		String NoOfDueSubmission=elem.getText();
//		System.out.println(NoOfDueSubmission);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_DueSubmission");

		TestModellerLogger.PassStep(m_Driver, "Click_DueSubmission");
	}
	
	/**
	 * Get DueSubmission Count At Display
	 */
	public void countDisplay()
	{
		String DisplayedNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div[2]/div/div/div[1]/div/div/a[1]/div/h3")).getText();
		 number=Integer.parseInt(DisplayedNo);
		System.out.println(number);
	}
	
	
	/**
	 * Verify DueSubmission
	 * @throws Exception 
	 */
	
	public void verifyDueSubmission() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "CIS Displays OverDuePayment");
		int count=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr")).size();
		
		count=count-1;
		
		Assert.assertEquals(count, number,"Due Submission count not matched");
		
		
		
	}

     
	/**
 	 * Click OverDueReturns
     * @name Click OverDueReturns
     */
	public void Click_OverDueReturns()
	{
        
		WebElement elem = getWebElement(OverDueReturnsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_OverDueReturns", "Click_OverDueReturns failed. Unable to locate object: " + OverDueReturnsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_OverDueReturns", "Click_OverDueReturns failed. Unable to locate object: " + OverDueReturnsElem.toString());

			Assert.fail("Unable to locate object: " + OverDueReturnsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_OverDueReturns");

		TestModellerLogger.PassStep(m_Driver, "Click_OverDueReturns");
	}

	
	/**
	 * Get OverDue Return Count At Display
	 */
	public void countOverdueDisplay()
	{
		String DisplayedNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[2]/div/div/div[2]/div/div/a[1]/div/h3")).getText();
		 number=Integer.parseInt(DisplayedNo);
		System.out.println(number);
	}
	
	
	/**
	 * Verify OverDue Return
	 * @throws Exception 
	 */
	
	public void verifyOverduereturn() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "CIS Displays OverDueReturn");
		int count=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr")).size();
		
		count=count-1;
		
//		Assert.assertEquals(count, number,"Due Submission count not matched");
		
		
		
	}
	
     
	/**
 	 * Click UpcomingReturns
     * @name Click UpcomingReturns
     */
	public void Click_UpcomingReturns()
	{
        
		WebElement elem = getWebElement(UpcomingReturnsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UpcomingReturns", "Click_UpcomingReturns failed. Unable to locate object: " + UpcomingReturnsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UpcomingReturns", "Click_UpcomingReturns failed. Unable to locate object: " + UpcomingReturnsElem.toString());

			Assert.fail("Unable to locate object: " + UpcomingReturnsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_UpcomingReturns");

		TestModellerLogger.PassStep(m_Driver, "Click_UpcomingReturns");
	}
	
	
	/**
	 * Verify Upcoming Return
	 * @throws Exception 
	 */
	
	public void verifyUpcomingreturn() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "CIS Displays Upcoming Return");

		
		
		
	}
	
	
	
	/**
	 * Get Upcoming Return Count At Display
	 * @throws InterruptedException 
	 */
	public void UpcomingcountDisplay() throws InterruptedException
	{
		String DisplayedNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[1]/div/div/table/tbody/tr[1]/td[2]/span")).getText();
		 number=Integer.parseInt(DisplayedNo);
		System.out.println(number);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ctl00']/div[1]/div/div/table/tbody/tr[1]/td[3]/a")).click();
		//ChangeWindow.tabswitch(m_Driver);
		Thread.sleep(1000);
	}
	
	
	/**
	 * Verify upcoming return view
	 * @throws Exception 
	 */
	public void verifyviewCount() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "CIS Displays UpcomingReturnView");
		int count=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr")).size();
		
		count=count-1;
		
		Assert.assertEquals(count, number,"View count not matched");
		
	}

     
	/**
 	 * Click FailedSubmission
     * @name Click FailedSubmission
     */
	public void Click_FailedSubmission()
	{
        
		WebElement elem = getWebElement(FailedSubmissionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_FailedSubmission", "Click_FailedSubmission failed. Unable to locate object: " + FailedSubmissionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_FailedSubmission", "Click_FailedSubmission failed. Unable to locate object: " + FailedSubmissionElem.toString());

			Assert.fail("Unable to locate object: " + FailedSubmissionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_FailedSubmission");

		TestModellerLogger.PassStep(m_Driver, "Click_FailedSubmission");
	}
	
	
	
	/**
	 * Get DueSubmission Count At Display
	 */
	public void Failedcount()
	{
		String DisplayedNo=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[2]/div/div/div[4]/div/div/a[1]/div/h3")).getText();
		 number=Integer.parseInt(DisplayedNo);
		System.out.println(number);
	}
	
	
	/**
	 * Verify DueSubmission
	 * @throws Exception 
	 */
	
	public void verifyFailedSubmission() throws Exception
	{
		
		TakeScreenshot.takeScreenshot(m_Driver, "CIS Displays OverDuePayment");
		int count=m_Driver.findElements(By.xpath("//th[starts-with(text(),'Contractor')]/following::tr")).size();
		
		//count=count-1;
		
		Assert.assertEquals(count, number,"Failed Submission count not matched");
		
		
		
	}

     
	/**
 	 * Click TotalContractor
     * @name Click TotalContractor
     */
	public void Click_TotalContractor()
	{
        
		WebElement elem = getWebElement(TotalContractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TotalContractor", "Click_TotalContractor failed. Unable to locate object: " + TotalContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TotalContractor", "Click_TotalContractor failed. Unable to locate object: " + TotalContractorElem.toString());

			Assert.fail("Unable to locate object: " + TotalContractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TotalContractor");

		TestModellerLogger.PassStep(m_Driver, "Click_TotalContractor");
	}

      
	/**
 	 * Enter CompanyNameinDueSubmission
     * @name Enter CompanyNameinDueSubmission
     */
 	public void Enter_CompanyNameinDueSubmission(String CompanyNameinDueSubmission)
 	{
 	    
 		WebElement elem = getWebElement(CompanyNameinDueSubmissionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CompanyNameinDueSubmission", "Enter_CompanyNameinDueSubmission failed. Unable to locate object: " + CompanyNameinDueSubmissionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CompanyNameinDueSubmission", "Enter_CompanyNameinDueSubmission failed. Unable to locate object: " + CompanyNameinDueSubmissionElem.toString());

 			Assert.fail("Unable to locate object: " + CompanyNameinDueSubmissionElem.toString());
         }

 		elem.sendKeys(CompanyNameinDueSubmission);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CompanyNameinDueSubmission " + CompanyNameinDueSubmission);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CompanyNameinDueSubmission " + CompanyNameinDueSubmission);
 	}

     
	/**
 	 * Click SearchDueSubmission
     * @name Click SearchDueSubmission
     */
	public void Click_SearchDueSubmission()
	{
        
		WebElement elem = getWebElement(SearchDueSubmissionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchDueSubmission", "Click_SearchDueSubmission failed. Unable to locate object: " + SearchDueSubmissionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchDueSubmission", "Click_SearchDueSubmission failed. Unable to locate object: " + SearchDueSubmissionElem.toString());

			Assert.fail("Unable to locate object: " + SearchDueSubmissionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SearchDueSubmission");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchDueSubmission");
	}

    
	/**
 	 * Select FilingPeriodofOverdueReturn
     * @name Select FilingPeriodofOverdueReturn
     */
    public void Select_FilingPeriodofOverdueReturn(String FilingPeriodofOverdueReturn)
 	{
 	    
 		WebElement elem = getWebElement(FilingPeriodofOverdueReturnElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FilingPeriodofOverdueReturn", "Select_FilingPeriodofOverdueReturn failed. Unable to locate object: " + FilingPeriodofOverdueReturnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FilingPeriodofOverdueReturn", "Select_FilingPeriodofOverdueReturn failed. Unable to locate object: " + FilingPeriodofOverdueReturnElem.toString());

 			Assert.fail("Unable to locate object: " + FilingPeriodofOverdueReturnElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(FilingPeriodofOverdueReturn);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_FilingPeriodofOverdueReturn " + FilingPeriodofOverdueReturn);

 		TestModellerLogger.PassStep(m_Driver, "Select_FilingPeriodofOverdueReturn " + FilingPeriodofOverdueReturn);
 	}

     
	/**
 	 * Click SearchOverdueReturn
     * @name Click SearchOverdueReturn
     */
	public void Click_SearchOverdueReturn()
	{
        
		WebElement elem = getWebElement(SearchOverdueReturnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchOverdueReturn", "Click_SearchOverdueReturn failed. Unable to locate object: " + SearchOverdueReturnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchOverdueReturn", "Click_SearchOverdueReturn failed. Unable to locate object: " + SearchOverdueReturnElem.toString());

			Assert.fail("Unable to locate object: " + SearchOverdueReturnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SearchOverdueReturn");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchOverdueReturn");
	}

    
	/**
 	 * Select ContractorinUpercomingReturn
     * @name Select ContractorinUpercomingReturn
     */
    public void Select_ContractorinUpercomingReturn(String ContractorinUpercomingReturn)
 	{
 	    
 		WebElement elem = getWebElement(ContractorinUpercomingReturnElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ContractorinUpercomingReturn", "Select_ContractorinUpercomingReturn failed. Unable to locate object: " + ContractorinUpercomingReturnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ContractorinUpercomingReturn", "Select_ContractorinUpercomingReturn failed. Unable to locate object: " + ContractorinUpercomingReturnElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorinUpercomingReturnElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ContractorinUpercomingReturn);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ContractorinUpercomingReturn " + ContractorinUpercomingReturn);

 		TestModellerLogger.PassStep(m_Driver, "Select_ContractorinUpercomingReturn " + ContractorinUpercomingReturn);
 	}

     
	/**
 	 * Click SearchupcomingReturn
     * @name Click SearchupcomingReturn
     */
	public void Click_SearchupcomingReturn()
	{
        
		WebElement elem = getWebElement(SearchupcomingReturnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchupcomingReturn", "Click_SearchupcomingReturn failed. Unable to locate object: " + SearchupcomingReturnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchupcomingReturn", "Click_SearchupcomingReturn failed. Unable to locate object: " + SearchupcomingReturnElem.toString());

			Assert.fail("Unable to locate object: " + SearchupcomingReturnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SearchupcomingReturn");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchupcomingReturn");
	}

      
	/**
 	 * Enter SearchContractorNameTotalContractor
     * @name Enter SearchContractorNameTotalContractor
     */
 	public void Enter_SearchContractorNameTotalContractor(String SearchContractorNameTotalContractor)
 	{
 	    
 		WebElement elem = getWebElement(SearchContractorNameTotalContractorElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchContractorNameTotalContractor", "Enter_SearchContractorNameTotalContractor failed. Unable to locate object: " + SearchContractorNameTotalContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchContractorNameTotalContractor", "Enter_SearchContractorNameTotalContractor failed. Unable to locate object: " + SearchContractorNameTotalContractorElem.toString());

 			Assert.fail("Unable to locate object: " + SearchContractorNameTotalContractorElem.toString());
         }

 		elem.sendKeys(SearchContractorNameTotalContractor);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchContractorNameTotalContractor " + SearchContractorNameTotalContractor);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchContractorNameTotalContractor " + SearchContractorNameTotalContractor);
 	}

     
	/**
 	 * Click Add Contractor
     * @name Click Add Contractor
     */
	public void Click_Add_Contractor()
	{
        
		WebElement elem = getWebElement(Add_ContractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Contractor", "Click_Add_Contractor failed. Unable to locate object: " + Add_ContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Contractor", "Click_Add_Contractor failed. Unable to locate object: " + Add_ContractorElem.toString());

			Assert.fail("Unable to locate object: " + Add_ContractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Contractor");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Contractor");
	}

      
	/**
 	 * Enter ContractorNameinAddContractor
     * @name Enter ContractorNameinAddContractor
     */
 	public void Enter_ContractorNameinAddContractor(String ContractorNameinAddContractor)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ContractorNameinAddContractorElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorNameinAddContractor", "Enter_ContractorNameinAddContractor failed. Unable to locate object: " + ContractorNameinAddContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorNameinAddContractor", "Enter_ContractorNameinAddContractor failed. Unable to locate object: " + ContractorNameinAddContractorElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorNameinAddContractorElem.toString());
         }

 		elem.sendKeys(ContractorNameinAddContractor);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorNameinAddContractor " + ContractorNameinAddContractor);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorNameinAddContractor " + ContractorNameinAddContractor);
 	}

      
	/**
 	 * Enter OfficeNo
     * @name Enter OfficeNo
     */
 	public void Enter_OfficeNo(String OfficeNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(OfficeNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_OfficeNo", "Enter_OfficeNo failed. Unable to locate object: " + OfficeNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_OfficeNo", "Enter_OfficeNo failed. Unable to locate object: " + OfficeNoElem.toString());

 			Assert.fail("Unable to locate object: " + OfficeNoElem.toString());
         }

 		elem.sendKeys(OfficeNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_OfficeNo " + OfficeNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_OfficeNo " + OfficeNo);
 	}

      
	/**
 	 * Enter ContractorRefNo
     * @name Enter ContractorRefNo
     */
 	public void Enter_ContractorRefNo(String ContractorRefNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ContractorRefNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorRefNo", "Enter_ContractorRefNo failed. Unable to locate object: " + ContractorRefNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorRefNo", "Enter_ContractorRefNo failed. Unable to locate object: " + ContractorRefNoElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorRefNoElem.toString());
         }

 		elem.sendKeys(ContractorRefNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorRefNo " + ContractorRefNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorRefNo " + ContractorRefNo);
 	}

      
	/**
 	 * Enter AccountOffRefNo
     * @name Enter AccountOffRefNo
     */
 	public void Enter_AccountOffRefNo(String AccountOffRefNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(AccountOffRefNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AccountOffRefNo", "Enter_AccountOffRefNo failed. Unable to locate object: " + AccountOffRefNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AccountOffRefNo", "Enter_AccountOffRefNo failed. Unable to locate object: " + AccountOffRefNoElem.toString());

 			Assert.fail("Unable to locate object: " + AccountOffRefNoElem.toString());
         }

 		elem.sendKeys(AccountOffRefNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AccountOffRefNo " + AccountOffRefNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AccountOffRefNo " + AccountOffRefNo);
 	}

      
	/**
 	 * Enter UtrNo
     * @name Enter UtrNo
     */
 	public void Enter_UtrNo(String UtrNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(UtrNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UtrNo", "Enter_UtrNo failed. Unable to locate object: " + UtrNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UtrNo", "Enter_UtrNo failed. Unable to locate object: " + UtrNoElem.toString());

 			Assert.fail("Unable to locate object: " + UtrNoElem.toString());
         }

 		elem.sendKeys(UtrNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UtrNo " + UtrNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UtrNo " + UtrNo);
 	}

      
	/**
 	 * Enter ContractoeFirstName
     * @name Enter ContractoeFirstName
     */
 	public void Enter_ContractoeFirstName(String ContractoeFirstName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ContractoeFirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractoeFirstName", "Enter_ContractoeFirstName failed. Unable to locate object: " + ContractoeFirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractoeFirstName", "Enter_ContractoeFirstName failed. Unable to locate object: " + ContractoeFirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + ContractoeFirstNameElem.toString());
         }

 		elem.sendKeys(ContractoeFirstName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractoeFirstName " + ContractoeFirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractoeFirstName " + ContractoeFirstName);
 	}

      
	/**
 	 * Enter ContractorSurName
     * @name Enter ContractorSurName
     */
 	public void Enter_ContractorSurName(String ContractorSurName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ContractorSurNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorSurName", "Enter_ContractorSurName failed. Unable to locate object: " + ContractorSurNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorSurName", "Enter_ContractorSurName failed. Unable to locate object: " + ContractorSurNameElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorSurNameElem.toString());
         }

 		elem.sendKeys(ContractorSurName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorSurName " + ContractorSurName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorSurName " + ContractorSurName);
 	}

     
	/**
 	 * Click Submit
     * @name Click Submit
     */
	public void Click_Submit()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SubmitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

			Assert.fail("Unable to locate object: " + SubmitElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Submit");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit");
	}
	
	
	
	/**
 	 * Select selectPeriod
	 * @throws Exception 
     * @name Select selectPeriod
     */
    public void Select_selectPeriod(String selectPeriod) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(selectPeriodElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectPeriod", "Select_selectPeriod failed. Unable to locate object: " + selectPeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectPeriod", "Select_selectPeriod failed. Unable to locate object: " + selectPeriodElem.toString());

 			Assert.fail("Unable to locate object: " + selectPeriodElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectPeriod);
 		Thread.sleep(3000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "Period selection for CIS Filing");
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectPeriod " + selectPeriod);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectPeriod " + selectPeriod);
 	}
    
    
    /**
 	 * Select selectPeriod
	 * @throws Exception 
     * @name Select selectPeriod
     */
    public void Select_selectPeriodview() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(selectPeriodElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectPeriod", "Select_selectPeriod failed. Unable to locate object: " + selectPeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectPeriod", "Select_selectPeriod failed. Unable to locate object: " + selectPeriodElem.toString());

 			Assert.fail("Unable to locate object: " + selectPeriodElem.toString());
         }

 		elem.click();
 		TakeScreenshot.takeScreenshot(m_Driver, "Period selection Options");
 		Thread.sleep(2000);
 		
 		
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectPeriod " + selectPeriodElem);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectPeriod " + selectPeriodElem);
 	}
    
    
    
    /**
 	 * Enter Search a Contractor...
     * @throws InterruptedException 
     * @name Enter Search a Contractor...
     */
 	public void Enter_Search_a_Contractor(String Search_a_Contractor) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Search_a_ContractorElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_a_Contractor", "Enter_Search_a_Contractor failed. Unable to locate object: " + Search_a_ContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_a_Contractor", "Enter_Search_a_Contractor failed. Unable to locate object: " + Search_a_ContractorElem.toString());

 			Assert.fail("Unable to locate object: " + Search_a_ContractorElem.toString());
         }

 		elem.sendKeys(Search_a_Contractor);
 		
 		Thread.sleep(1000);
 		
 		 List<WebElement> options= m_Driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
 	      
 	     
 	      //2000 2 1998
 	      for(WebElement option:options)
 	      {
 	    	  
 	    	  String text=option.getText();
 	    	  
 	    	  
 	    	  
 	    	if( text.equalsIgnoreCase(Search_a_Contractor))
 	    	{
 	    		option.click();
 	    		break;  
 	    	}
 	    	
 	      }
 	      
 	      ChangeWindow.tabswitch(m_Driver);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Search_a_Contractor " + Search_a_Contractor);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_a_Contractor " + Search_a_Contractor);
 	}
 	
 	
 	
 	 

     
	/**
 	 * Click Edit Contractor
     * @name Click Edit Contractor
     */
	public void Click_Edit_Contractor()
	{
        
		WebElement elem = getWebElement(Edit_ContractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_Contractor", "Click_Edit_Contractor failed. Unable to locate object: " + Edit_ContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_Contractor", "Click_Edit_Contractor failed. Unable to locate object: " + Edit_ContractorElem.toString());

			Assert.fail("Unable to locate object: " + Edit_ContractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_Contractor");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_Contractor");
	}

     
	/**
 	 * Click Edit ContractorFrame
	 * @throws Exception 
	 * @name Click Edit ContractorFrame
     */
	public void Click_Edit_ContractorFrame() throws Exception
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Edit_ContractorFrameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit_ContractorFrame", "Click_Edit_ContractorFrame failed. Unable to locate object: " + Edit_ContractorFrameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit_ContractorFrame", "Click_Edit_ContractorFrame failed. Unable to locate object: " + Edit_ContractorFrameElem.toString());

			Assert.fail("Unable to locate object: " + Edit_ContractorFrameElem.toString());
        }

		Thread.sleep(1000);
		String frameHeader=elem.getText();
		
		System.out.println(frameHeader);
		
		String expected="Edit Contractor";
		
		Assert.assertEquals(frameHeader, expected);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Edit Contractor Page");
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Edit_ContractorFrame");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit_ContractorFrame");
	}
	
	
	/**
 	 * Click ThreeDot
	 * @throws InterruptedException 
     * @name Click ThreeDot
     */
	public void Click_ThreeDot() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ThreeDotElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ThreeDot", "Click_ThreeDot failed. Unable to locate object: " + ThreeDotElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ThreeDot", "Click_ThreeDot failed. Unable to locate object: " + ThreeDotElem.toString());

			Assert.fail("Unable to locate object: " + ThreeDotElem.toString());
        }
		
		
		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_ThreeDot");

		TestModellerLogger.PassStep(m_Driver, "Click_ThreeDot");
	}

     
	/**
 	 * Click Make Inactive
	 * @throws Exception 
	 * @name Click Make Inactive
     */
	public void Click_Make_Inactive() throws Exception
	{
        
		WebElement elem = getWebElement(Make_InactiveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Make_Inactive", "Click_Make_Inactive failed. Unable to locate object: " + Make_InactiveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Make_Inactive", "Click_Make_Inactive failed. Unable to locate object: " + Make_InactiveElem.toString());

			Assert.fail("Unable to locate object: " + Make_InactiveElem.toString());
        }

		elem.click();
		
		Thread.sleep(1000);
		
	//	TakeScreenshot.takeScreenshot(m_Driver, "Alert msg for Inactive Contractor");
          
		m_Driver.switchTo().alert().accept();

		ExtentReportManager.passStep(m_Driver, "Click_Make_Inactive");

		TestModellerLogger.PassStep(m_Driver, "Click_Make_Inactive");
	}
	
	
	/**
 	 * Click Make Inactive
	 * @throws Exception 
	 * @name Click Make Inactive
     */
	public void Click_Keep_Active() throws Exception
	{
        
		WebElement elem = getWebElement(Make_InactiveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Make_Inactive", "Click_Make_Inactive failed. Unable to locate object: " + Make_InactiveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Make_Inactive", "Click_Make_Inactive failed. Unable to locate object: " + Make_InactiveElem.toString());

			Assert.fail("Unable to locate object: " + Make_InactiveElem.toString());
        }

		elem.click();
		
		Thread.sleep(1000);
		
	//	TakeScreenshot.takeScreenshot(m_Driver, "Alert msg for Inactive Contractor");
          
		m_Driver.switchTo().alert().dismiss();

		ExtentReportManager.passStep(m_Driver, "Click_Make_Inactive");

		TestModellerLogger.PassStep(m_Driver, "Click_Make_Inactive");
	}

     
	/**
 	 * Click New Subcontractor
     * @name Click New Subcontractor
     */
	public void Click_New_Subcontractor()
	{
        
		WebElement elem = getWebElement(New_SubcontractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_Subcontractor", "Click_New_Subcontractor failed. Unable to locate object: " + New_SubcontractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_Subcontractor", "Click_New_Subcontractor failed. Unable to locate object: " + New_SubcontractorElem.toString());

			Assert.fail("Unable to locate object: " + New_SubcontractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_Subcontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_New_Subcontractor");
	}
	
	/**
	 * Take Screenshot for inactive contractor Name
	 * @throws Exception 
	 */
	public void verifyInactiveStatusofContractor() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[2]/div/div/div[2]/iframe")));
		TakeScreenshot.takeScreenshot(m_Driver, "Status Inactive of contractor");
		
		
		m_Driver.switchTo().defaultContent();
	}
	
	
	/**
	 * Take Screenshot for inactive contractor Name
	 * @throws Exception 
	 */
	public void verifyActiveStatusofContractor() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[2]/div/div/div[2]/iframe")));
		
		m_Driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Status Active of contractor");
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")).click();
		m_Driver.switchTo().defaultContent();
	}
	
	
	/**
	 * Take Screenshot for inactive contractor Name
	 * @throws Exception 
	 */
	public void verifyActiveStatusofContractor2() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[2]/div/div/div[2]/iframe")));
		
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Status Active of contractor when Alert Dismiss");
		m_Driver.switchTo().defaultContent();
	}


	public void verifyNewContractorIsActive() throws Exception {
		// TODO Auto-generated method stub
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[2]/div/div/div[2]/iframe")));
		
		TakeScreenshot.takeScreenshot(m_Driver, "New contractor Status is Active");
		
		boolean status=m_Driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
		
		System.out.println("Status="+status);
		
		Assert.assertTrue(status);
		
		m_Driver.switchTo().defaultContent();
		
	}


	public void Click_Quickjump() throws Exception {
		// TODO Auto-generated method stub
		m_Driver.findElement(By.xpath("//*[@id='searchkeyList']/li[1]/a")).click();
		
		ChangeWindow.tabswitch(m_Driver);
		Thread.sleep(1000);
		TakeScreenshot.takeScreenshot(m_Driver, "QuickJumpOptionAtCIS");
	}


	public void makeInactive() throws Exception {
m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[2]/div/div/div[2]/iframe")));
		
boolean status=m_Driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();

if(status==true)
{
	
	m_Driver.findElement(By.xpath("//input[@type='checkbox']")).click();

}
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Status Active of contractor");
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")).click();
		m_Driver.switchTo().defaultContent();
		
		 ArrayList<String> switchtab=new ArrayList<String>(m_Driver.getWindowHandles());
	        
	        m_Driver.switchTo().window(switchtab.get(1));
	
		
	}


	public void verifyContractorNameList() {
		
	//	int count=0;
		List<WebElement> options= m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr/td[2]"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("1562 and 1556"))
					{
						m_Driver.findElement(By.xpath("//a[contains(text(),'1562 and 1556')]")).click();
						
						ChangeWindow.tabswitch(m_Driver);
					}
		}
		
	}


	public void verifyContractorNameListOverduereturn() {
List<WebElement> options= m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr/td[2]"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("1562 and 1556"))
					{
						m_Driver.findElement(By.xpath("//a[contains(text(),'1562 and 1556')]")).click();
						
						ChangeWindow.tabswitch(m_Driver);
					}
		}
		
	}


	public void verifyContractorInUpcomingreturn() {
		
List<WebElement> options= m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr/td[2]"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("1562 and 1556"))
					{
						m_Driver.findElement(By.xpath("//a[contains(text(),'1562 and 1556')]")).click();
						
						ChangeWindow.tabswitch(m_Driver);
					}
		}
		
	}


	public void makeActive() {
m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[2]/div/div/div[2]/iframe")));
		
		m_Driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		

		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']")).click();
		m_Driver.switchTo().defaultContent();
		
	}


	public void verifyListofAccountManager() throws InterruptedException {
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='Accountant']"));
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		Thread.sleep(1000);
		
		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[3]/div[1]/div[7]/div/div[1]/div/div/table/tbody/tr[3]/td[2]/span/a"));
		
		String Dsbcount=elem2.getText();
		
		int Dsbcount1=Integer.parseInt(Dsbcount);
		
		System.out.println("Dsb Count="+Dsbcount1);
		
		elem2.click();
		
		Thread.sleep(2000);
		
		List<WebElement> options= m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr/td[2]"));
		int actual=options.size();
		
	//	Assert.assertEquals(actual, Dsbcount1);
	}


	public void verifyNotAllotedListofAccountManager() throws InterruptedException {
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='Accountant']"));
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		Thread.sleep(1000);
		
		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[3]/div[1]/div[7]/div/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a"));
		
		String Dsbcount=elem2.getText();
		
		int Dsbcount1=Integer.parseInt(Dsbcount);
		
		System.out.println("Dsb Count="+Dsbcount1);
		
		elem2.click();
		
		Thread.sleep(2000);
		
		List<WebElement> options= m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr/td[2]"));
		int actual=options.size();
		
	//	Assert.assertEquals(actual, Dsbcount1);
		
	}


	public void verifyNotAllotedListX_AxisofAccountManager() throws InterruptedException {
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='Accountant']"));
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		Thread.sleep(1000);
		
		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/div[4]/div[3]/div[1]/div[7]/div/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a"));
		
		String Dsbcount=elem2.getText();
		
		int Dsbcount1=Integer.parseInt(Dsbcount);
		
		System.out.println("Dsb Count="+Dsbcount1);
		
		elem2.click();
		
		Thread.sleep(2000);
		
		List<WebElement> options= m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/table/tbody/tr/td[2]"));
		int actual=options.size();
		
//		Assert.assertEquals(actual, Dsbcount1);
		
	}
	
}