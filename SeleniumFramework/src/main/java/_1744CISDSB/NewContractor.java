package _1744CISDSB;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/957e46d8-916a-455a-8026-42592e6788e2
@TestModellerModule(guid = "957e46d8-916a-455a-8026-42592e6788e2")
public class NewContractor extends BasePage
{
	public NewContractor (WebDriver driver)
	{
		super(driver);
	}


	
	private By _New_ContractorElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");

	private By ContractorNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtContractorName']");

	private By PhoneNoElem = By.xpath("//label[normalize-space()= 'Phone Number']/../../div[2]/input");

	private By ContractoeFirstNameElem = By.xpath("//label[normalize-space()= 'First Name']/../../div[2]/input");

	private By EmailIdElem = By.xpath("//label[normalize-space()= 'Email Address']/../../div[2]/input");

	private By ContractorSurNameElem = By.xpath("//label[normalize-space()= 'Last Name']/../../div[2]/input");

	private By Address1Elem = By.xpath("//label[normalize-space()= 'Postal Address']/../../div[2]/input");

	private By OfficeNoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtOfficeNo']");

	private By ContractorRefNo2Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtContractorRefNo']");

	private By Address2Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtAddress2']");

	private By AccountOffRefNoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAccountOffRefNo']");

	private By Address3Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtAddress3']");

	private By UtrNoElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUtrNo']");

	private By PostCodeElem = By.xpath("//label[normalize-space()= 'Post Code']/../../div[2]/input");

	private By SubmitElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By CancelElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnCancel']");

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/CISDashboard.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  New Contractor
     * @name Click  New Contractor
     */
	public void Click__New_Contractor()
	{
        
		WebElement elem = getWebElement(_New_ContractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Contractor", "Click__New_Contractor failed. Unable to locate object: " + _New_ContractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Contractor", "Click__New_Contractor failed. Unable to locate object: " + _New_ContractorElem.toString());

			Assert.fail("Unable to locate object: " + _New_ContractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Contractor");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Contractor");
		Reporter.log("Click__New_Contractor");
	}

      
	/**
 	 * Enter ContractorName
     * @name Enter ContractorName
     */
 	public void Enter_ContractorName(String ContractorName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(ContractorNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorName", "Enter_ContractorName failed. Unable to locate object: " + ContractorNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorName", "Enter_ContractorName failed. Unable to locate object: " + ContractorNameElem.toString());

 			Assert.fail("Unable to locate object: " + ContractorNameElem.toString());
         }

 		elem.sendKeys(ContractorName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorName " + ContractorName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorName " + ContractorName);
 	}

      
	/**
 	 * Enter PhoneNo
     * @name Enter PhoneNo
     */
 	public void Enter_PhoneNo(String PhoneNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(PhoneNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PhoneNo", "Enter_PhoneNo failed. Unable to locate object: " + PhoneNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PhoneNo", "Enter_PhoneNo failed. Unable to locate object: " + PhoneNoElem.toString());

 			Assert.fail("Unable to locate object: " + PhoneNoElem.toString());
         }

 		elem.sendKeys(PhoneNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PhoneNo " + PhoneNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PhoneNo " + PhoneNo);
 	}

      
	/**
 	 * Enter ContractoeFirstName
     * @name Enter ContractoeFirstName
     */
 	public void Enter_ContractoeFirstName(String ContractoeFirstName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

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
 	 * Enter EmailId
     * @name Enter EmailId
     */
 	public void Enter_EmailId(String EmailId)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(EmailIdElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EmailId", "Enter_EmailId failed. Unable to locate object: " + EmailIdElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EmailId", "Enter_EmailId failed. Unable to locate object: " + EmailIdElem.toString());

 			Assert.fail("Unable to locate object: " + EmailIdElem.toString());
         }

 		elem.sendKeys(EmailId);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EmailId " + EmailId);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EmailId " + EmailId);
 	}

      
	/**
 	 * Enter ContractorSurName
     * @name Enter ContractorSurName
     */
 	public void Enter_ContractorSurName(String ContractorSurName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

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
 	 * Enter Address1
     * @name Enter Address1
     */
 	public void Enter_Address1(String Address1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(Address1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

 			Assert.fail("Unable to locate object: " + Address1Elem.toString());
         }

 		elem.sendKeys(Address1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address1 " + Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address1 " + Address1);
 	}

      
	/**
 	 * Enter OfficeNo
     * @name Enter OfficeNo
     */
 	public void Enter_OfficeNo(String OfficeNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

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
 	 * Enter ContractorRefNo2
     * @name Enter ContractorRefNo2
     */
 	public void Enter_ContractorRefNo2(String ContractorRefNo2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(ContractorRefNo2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContractorRefNo2", "Enter_ContractorRefNo2 failed. Unable to locate object: " + ContractorRefNo2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContractorRefNo2", "Enter_ContractorRefNo2 failed. Unable to locate object: " + ContractorRefNo2Elem.toString());

 			Assert.fail("Unable to locate object: " + ContractorRefNo2Elem.toString());
         }

 		elem.sendKeys(ContractorRefNo2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContractorRefNo2 " + ContractorRefNo2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContractorRefNo2 " + ContractorRefNo2);
 	}

      
	/**
 	 * Enter Address2
     * @name Enter Address2
     */
 	public void Enter_Address2(String Address2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(Address2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

 			Assert.fail("Unable to locate object: " + Address2Elem.toString());
         }

 		elem.sendKeys(Address2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address2 " + Address2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address2 " + Address2);
 	}

      
	/**
 	 * Enter AccountOffRefNo
     * @name Enter AccountOffRefNo
     */
 	public void Enter_AccountOffRefNo(String AccountOffRefNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

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
 	 * Enter Address3
     * @name Enter Address3
     */
 	public void Enter_Address3(String Address3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(Address3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

 			Assert.fail("Unable to locate object: " + Address3Elem.toString());
         }

 		elem.sendKeys(Address3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address3 " + Address3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address3 " + Address3);
 	}

      
	/**
 	 * Enter UtrNo
     * @name Enter UtrNo
     */
 	public void Enter_UtrNo(String UtrNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_AddContractorFrame']")));

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
  		Reporter.log("Enter_UtrNo");
 	}

 	
	public void Enter_UtrNo1(String UtrNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='StatusPopUpFrame']")));

 		WebElement elem = getWebElement(UtrNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UtrNo", "Enter_UtrNo failed. Unable to locate object: " + UtrNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UtrNo", "Enter_UtrNo failed. Unable to locate object: " + UtrNoElem.toString());

 			Assert.fail("Unable to locate object: " + UtrNoElem.toString());
         }
 		
 		for(int i=0;i<=4;i++)
 				{
 			elem.sendKeys(Keys.BACK_SPACE);
 			}
 		elem.sendKeys(UtrNo);
 		
		m_Driver.switchTo().defaultContent();
       
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UtrNo " + UtrNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UtrNo " + UtrNo);
 	}

      
	/**
 	 * Enter PostCode
     * @name Enter PostCode
     */
 	public void Enter_PostCode(String PostCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

 		WebElement elem = getWebElement(PostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + PostCodeElem.toString());
         }

 		elem.sendKeys(PostCode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode " + PostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode " + PostCode);
 	}

     
	/**
 	 * Click Submit
     * @name Click Submit
     */
	public void Click_Submit()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_AddContractorFrame']")));

		WebElement elem = getWebElement(SubmitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

			Assert.fail("Unable to locate object: " + SubmitElem.toString());
        }

		elem.click();
		
	
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Submit");

	}

	
	public void Click_Submit1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='StatusPopUpFrame']")));

		WebElement elem = getWebElement(SubmitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

			Assert.fail("Unable to locate object: " + SubmitElem.toString());
        }

		elem.click();
		
	
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Submit");

	}

     
	/**
 	 * Click Cancel
     * @name Click Cancel
     */
	public void Click_Cancel()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_addcontratormodal1Iframe1']")));

		WebElement elem = getWebElement(CancelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cancel", "Click_Cancel failed. Unable to locate object: " + CancelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cancel", "Click_Cancel failed. Unable to locate object: " + CancelElem.toString());

			Assert.fail("Unable to locate object: " + CancelElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Cancel");

		TestModellerLogger.PassStep(m_Driver, "Click_Cancel");
	}
	
	
	
	
	public void subContractorUTR(String utr)
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUTR']"));

		

		elem.sendKeys(utr);
        
		m_Driver.switchTo().defaultContent();
  	

	
	}
	
	
	public void clickSubContractorSumbmit()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']"));

		

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

	
	}
	
	
	
	
	
	
}