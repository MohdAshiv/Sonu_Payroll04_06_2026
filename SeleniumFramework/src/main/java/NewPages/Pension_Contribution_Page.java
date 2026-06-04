package NewPages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/01795f33-710c-4eaf-8b92-d1004b3a316d
@TestModellerModule(guid = "01795f33-710c-4eaf-8b92-d1004b3a316d")
public class Pension_Contribution_Page extends BasePage
{
	public Pension_Contribution_Page (WebDriver driver)
	{
		super(driver);
	}


	
	private By _AccountManagerElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddPrimaryUser']");

	private By CompanyNameTextBoxElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtCompanyName']");

	private By UpdateButtonElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By SelectStatusElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatusSearch']");

	private By Submit_P11DElem = By.xpath("//A[contains(text(),'Submit P11D')]");

	private By Submit_Pension_ContributionElem = By.xpath("//A[contains(text(),'Submit Pension Contribution')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Select__AccountManager
	 * @throws InterruptedException 
     * @name Select__AccountManager 
     */
	public void Select__AccountManager(String AccountManagerName) throws InterruptedException
	{
        
		WebElement elem = getWebElement(_AccountManagerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select__AccountManager", "Select__AccountManager failed. Unable to locate object: " + _AccountManagerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select__AccountManager", "Select__AccountManager failed. Unable to locate object: " + _AccountManagerElem.toString());

			Assert.fail("Unable to locate object: " + _AccountManagerElem.toString());
        }

		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(AccountManagerName);
 		
 		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Payroll_");

		TestModellerLogger.PassStep(m_Driver, "Click__Payroll_");
	}

     
	/**
 	 * Enter Company Name
	 * @throws InterruptedException 
     * @name Company Name
     */
	public void Enter_CompanyNameTextBox(String companyName) throws InterruptedException
	{
        
		WebElement elem = getWebElement(CompanyNameTextBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CompanyNameTextBox", "Enter_CompanyNameTextBox failed. Unable to locate object: " + CompanyNameTextBoxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CompanyNameTextBox", "Enter_CompanyNameTextBox failed. Unable to locate object: " + CompanyNameTextBoxElem.toString());

			Assert.fail("Unable to locate object: " + CompanyNameTextBoxElem.toString());
        }

		elem.sendKeys(companyName);
 		
 		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Enter_CompanyNameTextBox");

		TestModellerLogger.PassStep(m_Driver, "Enter_CompanyNameTextBox");
	}

     
	/**
 	 * Click_UpdateButton
	 * @throws InterruptedException 
     * @name Click_UpdateButton
     */
	public void Click_UpdateButton() throws InterruptedException
	{
        
		WebElement elem = getWebElement(UpdateButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UpdateButton", "Click_UpdateButton failed. Unable to locate object: " + UpdateButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UpdateButton", "Click_UpdateButton failed. Unable to locate object: " + UpdateButtonElem.toString());

			Assert.fail("Unable to locate object: " + UpdateButtonElem.toString());
        }

		elem.click();
		
	//	Thread.sleep(30000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Run_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Run_Payroll");
	}

     
	/**
 	 * SelectStatus
	 * @throws InterruptedException 
     * @name SelectStatus
     */
	public void SelectStatus(String status) throws InterruptedException
	{
        
		WebElement elem = getWebElement(SelectStatusElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "SelectStatus", "SelectStatus failed. Unable to locate object: " + SelectStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "SelectStatus", "SelectStatus failed. Unable to locate object: " + SelectStatusElem.toString());

			Assert.fail("Unable to locate object: " + SelectStatusElem.toString());
        }

		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(status);
 		
 		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_RTI");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_RTI");
	}

     
	/**
 	 * Click Submit P11D
     * @name Click Submit P11D
     */
	public void Click_Submit_P11D()
	{
        
		WebElement elem = getWebElement(Submit_P11DElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_P11D", "Click_Submit_P11D failed. Unable to locate object: " + Submit_P11DElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_P11D", "Click_Submit_P11D failed. Unable to locate object: " + Submit_P11DElem.toString());

			Assert.fail("Unable to locate object: " + Submit_P11DElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_P11D");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_P11D");
	}

     
	/**
 	 * Click Submit Pension Contribution
     * @name Click Submit Pension Contribution
     */
	public void Click_Submit_Pension_Contribution()
	{
        
		WebElement elem = getWebElement(Submit_Pension_ContributionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_Pension_Contribution", "Click_Submit_Pension_Contribution failed. Unable to locate object: " + Submit_Pension_ContributionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_Pension_Contribution", "Click_Submit_Pension_Contribution failed. Unable to locate object: " + Submit_Pension_ContributionElem.toString());

			Assert.fail("Unable to locate object: " + Submit_Pension_ContributionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_Pension_Contribution");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_Pension_Contribution");
	}


	public void PensionTableContentSC() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Pention Contribution Table Content");
		
	}


	public void AccountManagerSC() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Account Manager Option Verify on Pension Contribution");
		
	}


	public void CompanyNameSerchSC() throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Verify Company Search on Pension Contribution");
		
	}


	


	public void StatusSelectionSShot(String statusValue) throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "Filing Status "+statusValue+"");
		
	}


	public void submitContributionButton() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebElement submitContribution=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSubmitContributionToPS']"));
		
		jsExec.executeScript("arguments[0].scrollIntoView();", submitContribution);
		
		Thread.sleep(2000);
		
		//submitContribution.click();
		
	}


	public void SelectAccountManager(String mngr) throws Exception 
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddPrimaryUser']"));
		
		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(mngr);
 		
 		Thread.sleep(1000);
 		
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")).click();
 		
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "RTI By Account Manager");
		
	}


	public void verifyPendingRTICount() throws Exception 
	{
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[2]/div/table/tbody/tr/td[1]/b"));
		
		jsExec.executeScript("arguments[0].scrollIntoView();", elem);
		
		TakeScreenshot.takeScreenshot(m_Driver, "RTI pending Count");
		
		System.out.println(elem.getText());
		
	}


	public void submitRTI(String reason) throws InterruptedException 
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect']")).click();
		
		jsExec.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(1000);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNotes']")).sendKeys("Test");
		
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlSubmitReason']"));
		
		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(reason);
 		
 		Thread.sleep(1000);
 		
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']")).click();
 		
 		Thread.sleep(5000);
 		
 	
		
	}


	

	
}