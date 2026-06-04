package _2044CIS_Submt;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class CISFiling extends BasePage {

	public WebElement elem;
	public CISFiling (WebDriver driver)
	{
		super(driver);
	}

	private By CisFiling = By.xpath("//a[text()='CIS Filing']");
	
	private By FincYer  = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYears']");
	
	private By Filpriod = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlFilingPeriod']");
	
	private By Serchbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
	
	private By Namechkbx = By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]/span[1]/input[1]");
	
	private By NotestoHMRC = By.xpath("//textarea[@name='ctl00$ctl00$ParentContent$cPH$txtNotes']");
	
	private By SubmitElectronic = By.xpath("//a[text()='Submit Electronically']");
	
	private By MarkasFiled = By.xpath("//a[text()='Mark as Filed']");
	
	private By ViewSubmission = By.xpath("//a[text()='View Submission']");
	
	private By SelectTransc = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$chkHeader']");
	
	private By UndoFiling = By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/a[1]/i[1]");
	
	private By Emailbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LinkButtonEx1']");
	
	private By Sendbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	
	
	
	
	private By Contractor = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlContractor']");
	
	/**
 	 * Click CISFiling
     * @name Click CISFiling
     */
	public void Click_CISFiling()
	{
        
		 elem = getWebElement(CisFiling);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CISFiling", "Click_CISFiling failed. Unable to locate object: " + CisFiling.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CISFiling", "Click_CISFiling failed. Unable to locate object: " + CisFiling.toString());

			Assert.fail("Unable to locate object: " + CisFiling.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_CISFiling");

		TestModellerLogger.PassStep(m_Driver, "Click_CISFiling");
	}
	
	/**
	 * Select  FinacialYear
  * @throws InterruptedException 
 * @name Select FinacialYear
*/
 
 public void Select_FinacialYer(String Year) throws InterruptedException 
	{
 
   elem = getWebElement(FincYer);

		if (elem == null) {
 		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FinacialYer", "Select_FinacialYer. Unable to locate object: " + FincYer.toString());

 		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FinacialYer", "Select_FinacialYer. Unable to locate object: " + FincYer.toString());

			Assert.fail("Unable to locate object: " + FincYer.toString());
     }
		Select se = new Select(elem);
		se.selectByVisibleText(Year);
     Thread.sleep(1000);
		
     m_Driver.switchTo().defaultContent();
     
  
		ExtentReportManager.passStep(m_Driver, "Select_FinacialYer");

		TestModellerLogger.PassStep(m_Driver, "Select_FinacialYer");
	}
 
 /**
	 * Select  Filing Period
* @throws InterruptedException 
* @name Select Filing Period
*/

public void Select_FilePeriod(String Perod) throws InterruptedException 
{
  elem = getWebElement(Filpriod);

		if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FilePeriod", "Select_FilePeriod. Unable to locate object: " + Filpriod.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FilePeriod", "Select_FilePeriod. Unable to locate object: " + Filpriod.toString());

			Assert.fail("Unable to locate object: " + Filpriod.toString());
  }
		Select se = new Select(elem);
		se.selectByVisibleText(Perod);
		
         Thread.sleep(1000);
		
         m_Driver.switchTo().defaultContent();
  

		ExtentReportManager.passStep(m_Driver, "Select_FilePeriod");

		TestModellerLogger.PassStep(m_Driver, "Select_FilePeriod");
	}

 
	/**
 	 * Click Serchbtn
     * @name Click Serchbtn
     */
	public void Click_Searchbtn()
	{
        
		 elem = getWebElement(Serchbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Serchbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Serchbtn.toString());

			Assert.fail("Unable to locate object: " + Serchbtn.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_Searchbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbtn");
	}

	/**
 	 * Click NameCheckBox
     * @name NameCheckBox
     */
	public void Click_NameCheckBox()
	{
        
		 elem = getWebElement(Namechkbx);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NameCheckBox()", "Click_NameCheckBox() failed. Unable to locate object: " + Namechkbx.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CISFiling", "Click_NameCheckBox() failed. Unable to locate object: " + Namechkbx.toString());

			Assert.fail("Unable to locate object: " + Namechkbx.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_NameCheckBox()");

		TestModellerLogger.PassStep(m_Driver, "Click_NameCheckBox()");
	}

/**
 * Choose NameCheckBox
* @name Click NameCheckBox
*/
public void Choose_NameCheckBox(int NoOfNames)
{

 elem = getWebElement(Namechkbx);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NameCheckBox", "Click_NameCheckBox failed. Unable to locate object: " + Namechkbx.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NameCheckBox", "Click_NameCheckBox failed. Unable to locate object: " + Namechkbx.toString());

	Assert.fail("Unable to locate object: " + Namechkbx.toString());
}

List<WebElement> Nmlist = m_Driver.findElements(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td/div/input"));
if(NoOfNames<Nmlist.size())
{	 
 for(int i=0;i<NoOfNames;i++)
 {
	Nmlist.get(i).click();
 }

 }	
	else
{
 System.out.println("Invalid count of Sub-Contractor");	
}	




ExtentReportManager.passStep(m_Driver, "Click_NameCheckBox");

TestModellerLogger.PassStep(m_Driver, "Click_NameCheckBox");
}

	/**
 	 * Click SubmitElectronic
     * @name Click SubmitElectronic
     */
	public void Click_SubmitElectronically()
	{
        
		 elem = getWebElement(SubmitElectronic);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SubmitElectronically", "Click_SubmitElectronically failed. Unable to locate object: " + SubmitElectronic.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SubmitElectronically", "Click_SubmitElectronically failed. Unable to locate object: " + SubmitElectronic.toString());

			Assert.fail("Unable to locate object: " + SubmitElectronic.toString());
        }
		
		elem.getText();

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_SubmitElectronically");

		TestModellerLogger.PassStep(m_Driver, "Click_SubmitElectronically");
	}
	
	/**
 	 * Click MarkasFiled
	 * @throws InterruptedException 
     * @name Click MarkasFiled
     */
	public void Click_MarkasFile() throws InterruptedException
	{
        
		 elem = getWebElement(MarkasFiled);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MarkasFile", "Click_MarkasFile failed. Unable to locate object: " + MarkasFiled.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MarkasFile", "Click_MarkasFile failed. Unable to locate object: " + MarkasFiled.toString());

			Assert.fail("Unable to locate object: " + MarkasFiled.toString());
        }

		elem.click();
		Thread.sleep(14000);
		
        ExtentReportManager.passStep(m_Driver, "Click_MarkasFile");

		TestModellerLogger.PassStep(m_Driver, "Click_MarkasFile");
	}
	
	/**
	 * Add Notes to HMRC
 * @name WriteNotes
 */
  public void Add_NotesToHMRC()
  {
    
	 elem = getWebElement(NotestoHMRC);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Add_NotesToHMRC", "Add_NotesToHMRC failed. Unable to locate object: " + NotestoHMRC.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Add_NotesToHMRC", "Add_NotesToHMRC failed. Unable to locate object: " + NotestoHMRC.toString());

		Assert.fail("Unable to locate object: " + NotestoHMRC.toString());
    }

	elem.click();
	elem.sendKeys("This is a note for CIS Submission");
	
    ExtentReportManager.passStep(m_Driver, "Add_NotesToHMRC");

	TestModellerLogger.PassStep(m_Driver, "Add_NotesToHMRC");
}
 

	/**
 	 * Click ViewSubmission
     * @name Click ViewSubmission
     */
	public void Click_ViewSubmission()
	{
        
		 elem = getWebElement(ViewSubmission);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ViewSubmission", "Click_ViewSubmission failed. Unable to locate object: " + ViewSubmission.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ViewSubmission", "Click_ViewSubmission failed. Unable to locate object: " + ViewSubmission.toString());

			Assert.fail("Unable to locate object: " + ViewSubmission.toString());
        }


		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_ViewSubmission");

		TestModellerLogger.PassStep(m_Driver, "Click_ViewSubmission");
	}
	
	/**
	 * Select_ TranscforUndo
	 * @throws InterruptedException 
 * @name Checkbox
 */
public void Select_TranscforUndo() throws InterruptedException
{
    
	 elem = getWebElement(SelectTransc);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_TranscforUndo", "Select_TranscforUndo failed. Unable to locate object: " + SelectTransc.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_TranscforUndo", "Select_TranscforUndo failed. Unable to locate object: " + SelectTransc.toString());

		Assert.fail("Unable to locate object: " + SelectTransc.toString());
    }

	elem.click();
	Thread.sleep(8000);
	
    ExtentReportManager.passStep(m_Driver, "Select_TranscforUndo");

	TestModellerLogger.PassStep(m_Driver, "Select_TranscforUndo");
}

/**
 * Click_ Undo Icon
 * @throws InterruptedException 
* @name Undo Icon
*/
public void Click_UndoIcon(String ExpMsg) throws InterruptedException
{
 elem = getWebElement(UndoFiling);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UndoIcon", "Click_UndoIcon failed. Unable to locate object: " + UndoFiling.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UndoIcon", "Click_UndoIcon failed. Unable to locate object: " + UndoFiling.toString());

	Assert.fail("Unable to locate object: " + UndoFiling.toString());
}

elem.click();
Alert act = m_Driver.switchTo().alert();
String actalert = act.getText();
System.out.println("The alert message = "+actalert);
act.accept();
Thread.sleep(2000);
WebElement ele = m_Driver.findElement(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[1]"));

String SucessMsg = ele.getText();
Thread.sleep(2000);
System.out.println("The expected alert message ="+ExpMsg);
Assert.assertEquals(SucessMsg,ExpMsg,"Messages are not matched");


ExtentReportManager.passStep(m_Driver, "Click_UndoIcon");

TestModellerLogger.PassStep(m_Driver, "Click_UndoIcon");
}

	
	/**
 	 * Click Emailbtn
     * @name Click Emailbtn
     */
	public void Click_Emailbutton()
	{
        
		 elem = getWebElement(Emailbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Emailbutton", "Click_Emailbutton failed. Unable to locate object: " + Emailbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Emailbutton", "Click_Emailbutton failed. Unable to locate object: " + Emailbtn.toString());

			Assert.fail("Unable to locate object: " + Emailbtn.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_Emailbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Emailbutton");
	}
	
	/**
 	 * Click Send btn
     * @name Send
    */
	public void Click_Sendbtn(String ExpectMsg) throws InterruptedException
	{
		 elem = getWebElement(Sendbtn);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

				Assert.fail("Unable to locate object: " + Sendbtn.toString());
	        }

			elem.click();
			Thread.sleep(2000);
			WebElement ele = m_Driver.findElement(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[1]"));

			String SucessMsg = ele.getText();
			Thread.sleep(2000);
			System.out.println("The expected alert message ="+ExpectMsg);
			Assert.assertEquals(SucessMsg,ExpectMsg,"Messages are not matched");
			
		ExtentReportManager.passStep(m_Driver, "Click_Sendbtn");

			TestModellerLogger.PassStep(m_Driver, "Click_Sendbtn");
				
	}

	/**
 	 * Select Contractor
     * @name Select Contractor
     */
	public void Select_Contractor(String Contrtor)
	{
        
		 elem = getWebElement(Contractor);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Contractor", "Select_Contractor failed. Unable to locate object: " + Contractor.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Contractor", "Select_Contractor failed. Unable to locate object: " + Contractor.toString());

			Assert.fail("Unable to locate object: " + Contractor.toString());
        }

		Select sel = new Select(elem);
		sel.selectByVisibleText(Contrtor);
		
		
        ExtentReportManager.passStep(m_Driver, "Select_Contractor");

		TestModellerLogger.PassStep(m_Driver, "Select_Contractor");
	}
	
	/**
	 * Verify Element is present on CIS Filing Page
	 * @throws Exception 
	 * 
	 */
	public void VerifyFinancialYear() throws Exception
	{
		WebElement ele = m_Driver.findElement(By.xpath("//label[text()='Financial Year:']"));
		
		elem = getWebElement(FincYer);
        if(elem.isDisplayed())
		{
  		 System.out.println("Selected Element is "+ ele.getText() + elem.getText());	
		}
		else
		{
		  System.out.println("Element is not selected");	
		}	
	}
	
	public void VerifyFilingPeriod() throws Exception
	{
		WebElement ele = m_Driver.findElement(By.xpath("//label[text()='Filing Period:']"));
		
		elem = getWebElement(Filpriod);
        if(elem.isDisplayed())
		{
  		 System.out.println("Selected Element is "+ ele.getText() + elem.getText());	
		}
		else
		{
		  System.out.println("Element is not selected");	
		}	
	}
	
	public void VerifyNameCheckbox() throws Exception
	{
		List<WebElement> element = m_Driver.findElements(By.xpath("//input[@class='_rowitem']"));
		int count =0;
		for(WebElement ele:element)
		{
        if(ele.isSelected())
		{
  		 count++;	
		}
		else
		{
		  System.out.println("Element is not selected");	
		}	
	}
		System.out.println("Total CheckBox Selected :" +count);
	}
	
	/**
	 * Take screenshot for CIS Filing
	 * @throws Exception 
	 * 
	 */
	public void GetPicShoot(String name) throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, name);
	}
}
