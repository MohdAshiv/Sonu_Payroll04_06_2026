package page.factory;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/88f20342-ca67-4d75-91ef-9df47489ed68
@TestModellerModule(guid = "88f20342-ca67-4d75-91ef-9df47489ed68")
public class EmployeeAddition_Deduction_AOE_Page extends BasePage
{
	public EmployeeAddition_Deduction_AOE_Page (WebDriver driver)
	{
		super(driver);
	}


	
	private By AOE_Elem = By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanelAOE']");
	
	private By DeleteAOEElem = By.xpath("//input[@type='checkbox' and @id='chAllAOE']");

	private By ClickAddButtonElem = By.xpath("//input[@type='button']");

	private By SelectAOEOptionElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanelAOE_DropdownAoeList']");

//	private By EnterLeavingDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLeavingDate']");
//
//	private By SaveButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
//
//	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");
//
//	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");
//
//	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");




     
	/**
 	 * Click ClickAOE
     * @name Click ClickAOE
     */
	public void ClickAOE()
	{
        
		WebElement elem = getWebElement(AOE_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickAOE", "ClickAOE failed. Unable to locate object: " + AOE_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickAOE", "ClickAOE failed. Unable to locate object: " + AOE_Elem.toString());

			Assert.fail("Unable to locate object: " + AOE_Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
//		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "ClickAOE");

		TestModellerLogger.PassStep(m_Driver, "ClickAOE");
	}

     
	/**
 	 * Click ClickAddButton
	 * @throws InterruptedException 
     * @name Click ClickAddButton
     */
	public void ClickAddButton() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickAddButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickAddButton", "ClickAddButton failed. Unable to locate object: " + ClickAddButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickAddButton", "ClickAddButton failed. Unable to locate object: " + ClickAddButtonElem.toString());

			Assert.fail("Unable to locate object: " + ClickAddButtonElem.toString());
        }

		elem.click();
		
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "ClickAddButton");

		TestModellerLogger.PassStep(m_Driver, "ClickAddButton");
	}

     
	/**
 	 * Click SelectAOEOption
	 * @throws InterruptedException 
     * @name Select SelectAOEOption
     */
	public void SelectAOEOption(String SelectAOEChildSupport) throws InterruptedException
	{
        
		WebElement elem = getWebElement(SelectAOEOptionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "SelectAOEOption", "SelectAOEOption failed. Unable to locate object: " + SelectAOEOptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "SelectAOEOption", "SelectAOEOption failed. Unable to locate object: " + SelectAOEOptionElem.toString());

			Assert.fail("Unable to locate object: " + SelectAOEOptionElem.toString());
        }

		Select option=new Select(elem);
		
		option.selectByVisibleText(SelectAOEChildSupport);
		
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "SelectAOEOption");

		TestModellerLogger.PassStep(m_Driver, "SelectAOEOption");
	}


	/**
 	 * Click 	DeleteAOE
	 * @throws InterruptedException 
     * @name Select DeleteAOECheckbox
     */
	
	public void DeleteAOE() throws InterruptedException 
	{
		
		WebElement elem = getWebElement(DeleteAOEElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "DeleteAOE", "DeleteAOE failed. Unable to locate object: " + DeleteAOEElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "DeleteAOE", "DeleteAOE failed. Unable to locate object: " + DeleteAOEElem.toString());

			Assert.fail("Unable to locate object: " + DeleteAOEElem.toString());
        }

		int Tablesize=m_Driver.findElements(By.xpath("//table[@id='tblAoe']/tbody/tr/td[1]")).size();
		if(Tablesize>0)
		{
		elem.click();
		m_Driver.findElement(By.xpath("//input[@type='submit' and @value='Delete']")).click();
		
		m_Driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		}
          	

		ExtentReportManager.passStep(m_Driver, "DeleteAOE");

		TestModellerLogger.PassStep(m_Driver, "DeleteAOE");
		
		
	}


	public void verifyCSPopup(String popname) throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "This is"+popname);
		
	}

      
	
}