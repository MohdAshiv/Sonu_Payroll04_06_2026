package _2047CISRpt_Pymtanddeduc;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f86bd776-7b88-41a6-bf58-d3c662bdfd45
@TestModellerModule(guid = "f86bd776-7b88-41a6-bf58-d3c662bdfd45")
public class AddSubContractor extends BasePage
{
	public WebElement elem;
	public AddSubContractor (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickAddSubcontractorElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddEmployee']");

	private By EnterFirstNameElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtFirstName']");

	private By EnterLastNameElem = By.xpath("//label[normalize-space()= 'Last Name']/../../div[2]/input");

	private By selectBusinessTypeElem = By.xpath("//label[normalize-space()= 'Business Type']/../../div[2]/select");

	private By EnterTradingNameElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtTradingName']");

	private By EnterUTRNoElem = By.xpath("//label[normalize-space()= 'UTR']/../../div[2]/input");
	
	private By EnterNIElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtxNINO']");
	
	private By EnterNIElem1 = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCpnyRegNo']");

	private By EnterCpnyRegNoElem = By.xpath("//label[normalize-space()= 'Company Reg No.']/../../div[2]/input");

	private By getVrrificationStusElem = By.xpath("//label[normalize-space()= 'Verification Status']/../../div[2]/input");

	private By getVryficationDateElem = By.xpath("//label[normalize-space()= 'Verification Date']/../../div[2]/input");

	private By getDeductionRateElem = By.xpath("//label[normalize-space()= 'Deduction Rate']/../../div[2]/select");

	private By clickVerifySubcontractorElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnVerify']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By ImpSubcontractor = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_lnkImportSubcontractor']");
	
	private By ChooseFil = By.xpath("//label[text()='Sub Contractor CSV:']");
	
	private By Uploadbtn = By.xpath("//a[text()='Upload']");
	
	private By Nxtbtn = By.xpath("//a[text()='Next']");
	
	private By Importbtn = By.xpath("//a[text()='Import']");
	
	private By Dashboardbtn = By.xpath("//span[text()='Dashboard']");
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox2.nomismasolution.co.uk/PayrollUI/SubContractor.aspx?ContractorCode=407");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox2.nomismasolution.co.uk/PayrollUI/SubContractor.aspx?ContractorCode=407");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox2.nomismasolution.co.uk/PayrollUI/SubContractor.aspx?ContractorCode=407");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox2.nomismasolution.co.uk/PayrollUI/SubContractor.aspx?ContractorCode=407";

        if (!currentUrl.equals("http://sandbox2.nomismasolution.co.uk/PayrollUI/SubContractor.aspx?ContractorCode=407")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickAddSubcontractor
     * @name Click clickAddSubcontractor
     */
	public void Click_clickAddSubcontractor()
	{
        
		 elem = getWebElement(clickAddSubcontractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAddSubcontractor", "Click_clickAddSubcontractor failed. Unable to locate object: " + clickAddSubcontractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAddSubcontractor", "Click_clickAddSubcontractor failed. Unable to locate object: " + clickAddSubcontractorElem.toString());

			Assert.fail("Unable to locate object: " + clickAddSubcontractorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAddSubcontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAddSubcontractor");
	}

      
	/**
 	 * Enter EnterFirstName
     * @name Enter EnterFirstName
     */
 	public void Enter_EnterFirstName(String EnterFirstName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(EnterFirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterFirstName", "Enter_EnterFirstName failed. Unable to locate object: " + EnterFirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterFirstName", "Enter_EnterFirstName failed. Unable to locate object: " + EnterFirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterFirstNameElem.toString());
         }

 		elem.sendKeys(EnterFirstName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterFirstName " + EnterFirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterFirstName " + EnterFirstName);
 	}

      
	/**
 	 * Enter EnterLastName
     * @name Enter EnterLastName
     */
 	public void Enter_EnterLastName(String EnterLastName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(EnterLastNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterLastName", "Enter_EnterLastName failed. Unable to locate object: " + EnterLastNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterLastName", "Enter_EnterLastName failed. Unable to locate object: " + EnterLastNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterLastNameElem.toString());
         }

 		elem.sendKeys(EnterLastName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterLastName " + EnterLastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterLastName " + EnterLastName);
 	}

    
	/**
 	 * Select selectBusinessType
     * @name Select selectBusinessType
     */
    public void Select_selectBusinessType(String selectBusinessType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(selectBusinessTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectBusinessType", "Select_selectBusinessType failed. Unable to locate object: " + selectBusinessTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectBusinessType", "Select_selectBusinessType failed. Unable to locate object: " + selectBusinessTypeElem.toString());

 			Assert.fail("Unable to locate object: " + selectBusinessTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectBusinessType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectBusinessType " + selectBusinessType);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectBusinessType " + selectBusinessType);
 	}

      
	/**
 	 * Enter EnterTradingName
	 * @throws InterruptedException 
     * @name Enter EnterTradingName
     */
 	public void Enter_EnterTradingName(String EnterTradingName) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(EnterTradingNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterTradingName", "Enter_EnterTradingName failed. Unable to locate object: " + EnterTradingNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterTradingName", "Enter_EnterTradingName failed. Unable to locate object: " + EnterTradingNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterTradingNameElem.toString());
         }

 		elem.sendKeys(EnterTradingName);
 		
		m_Driver.switchTo().defaultContent();
		
		//Thread.sleep(150000);

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterTradingName " + EnterTradingName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterTradingName " + EnterTradingName);
 	}

      
	/**
 	 * Enter EnterUTRNo
     * @name Enter EnterUTRNo
     */
 	public void Enter_EnterUTRNo(String EnterUTRNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(EnterUTRNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterUTRNo", "Enter_EnterUTRNo failed. Unable to locate object: " + EnterUTRNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterUTRNo", "Enter_EnterUTRNo failed. Unable to locate object: " + EnterUTRNoElem.toString());

 			Assert.fail("Unable to locate object: " + EnterUTRNoElem.toString());
         }

 		elem.sendKeys(EnterUTRNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterUTRNo " + EnterUTRNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterUTRNo " + EnterUTRNo);
 	}
 	
 	
 	/**
 	 * Enter EnterUTRNo
     * @name Enter EnterUTRNo
     */
 	public void Enter_EnterNI(String EnterNI)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(EnterNIElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNI", "Enter_EnterNI failed. Unable to locate object: " + EnterNIElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNI", "Enter_EnterNI failed. Unable to locate object: " + EnterNIElem.toString());

 			Assert.fail("Unable to locate object: " + EnterNIElem.toString());
         }

 		elem.sendKeys(EnterNI);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterUTRNo " + EnterNI);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterUTRNo " + EnterNI);
 	}
 	
 	
 	/**
 	 * Enter EnterUTRNo
     * @name Enter EnterUTRNo
     */
 	public void Enter_EnterNI1(String EnterNI)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(EnterNIElem1);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNI", "Enter_EnterNI failed. Unable to locate object: " + EnterNIElem1.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNI", "Enter_EnterNI failed. Unable to locate object: " + EnterNIElem1.toString());

 			Assert.fail("Unable to locate object: " + EnterNIElem1.toString());
         }

 		elem.sendKeys(EnterNI);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterUTRNo " + EnterNI);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterUTRNo " + EnterNI);
 	}

      
	/**
 	 * Enter EnterCpnyRegNo
     * @name Enter EnterCpnyRegNo
     */
 	public void Enter_EnterCpnyRegNo(String EnterCpnyRegNo)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(EnterCpnyRegNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterCpnyRegNo", "Enter_EnterCpnyRegNo failed. Unable to locate object: " + EnterCpnyRegNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterCpnyRegNo", "Enter_EnterCpnyRegNo failed. Unable to locate object: " + EnterCpnyRegNoElem.toString());

 			Assert.fail("Unable to locate object: " + EnterCpnyRegNoElem.toString());
         }

 		elem.sendKeys(EnterCpnyRegNo);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterCpnyRegNo " + EnterCpnyRegNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterCpnyRegNo " + EnterCpnyRegNo);
 	}

      
	/**
 	 * Enter getVrrificationStus
     * @name Enter getVrrificationStus
     */
 	public void Enter_getVrrificationStus()
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(getVrrificationStusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getVrrificationStus", "Enter_getVrrificationStus failed. Unable to locate object: " + getVrrificationStusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getVrrificationStus", "Enter_getVrrificationStus failed. Unable to locate object: " + getVrrificationStusElem.toString());

 			Assert.fail("Unable to locate object: " + getVrrificationStusElem.toString());
         }

 		String Verificationstatus=elem.getAttribute("value");
 		
 		System.out.println("Date="+Verificationstatus);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getVrrificationStus " + getVrrificationStusElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getVrrificationStus " + getVrrificationStusElem);
 	}

      
	/**
 	 * Enter getVryficationDate
     * @name Enter getVryficationDate
     */
 	public void Enter_getVryficationDate()
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(getVryficationDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getVryficationDate", "Enter_getVryficationDate failed. Unable to locate object: " + getVryficationDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getVryficationDate", "Enter_getVryficationDate failed. Unable to locate object: " + getVryficationDateElem.toString());

 			Assert.fail("Unable to locate object: " + getVryficationDateElem.toString());
         }

 		String VerificationDate=elem.getAttribute("value");
 		
 		System.out.println("Date="+VerificationDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getVryficationDate " + getVryficationDateElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getVryficationDate " + getVryficationDateElem);
 	}

    
	/**
 	 * Select getDeductionRate
     * @name Select getDeductionRate
     */
    public void Select_getDeductionRate()
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		 elem = getWebElement(getDeductionRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_getDeductionRate", "Select_getDeductionRate failed. Unable to locate object: " + getDeductionRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_getDeductionRate", "Select_getDeductionRate failed. Unable to locate object: " + getDeductionRateElem.toString());

 			Assert.fail("Unable to locate object: " + getDeductionRateElem.toString());
         }
 		String Rate=elem.getAttribute("value");
 	//	//*[@id="ctl00_ctl00_ParentContent_cPH_ddlDtnRate"]//following::option[@value='2']
 		String rate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlDtnRate']//following::option[@value='"+Rate+"']")).getText();
 		System.out.println("Rate="+rate);

// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(getDeductionRate);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_getDeductionRate " + getDeductionRateElem);

 		TestModellerLogger.PassStep(m_Driver, "Select_getDeductionRate " + getDeductionRateElem);
 	}

     
	/**
 	 * Click clickVerifySubcontractor
     * @name Click clickVerifySubcontractor
     */
	public void Click_clickVerifySubcontractor()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

		 elem = getWebElement(clickVerifySubcontractorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickVerifySubcontractor", "Click_clickVerifySubcontractor failed. Unable to locate object: " + clickVerifySubcontractorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickVerifySubcontractor", "Click_clickVerifySubcontractor failed. Unable to locate object: " + clickVerifySubcontractorElem.toString());

			Assert.fail("Unable to locate object: " + clickVerifySubcontractorElem.toString());
        }

		elem.click();
		
		System.out.println("I'm Clicked");
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickVerifySubcontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_clickVerifySubcontractor");
	}

     
	/**
 	 * Click clickSave
     * @name Click clickSave
     */
	public void Click_clickSave()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/header/div/div[4]/div/div/div[2]/iframe")));
		

		 elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
	
	
	/**
	 * Take screenshot for subcontractor with UTR
	 * @throws Exception 
	 * 
	 */
	public void SCwithUTR() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "subcontractor with UTR");
	}
	
	
	
	/**
	 * Take screenshot for subcontractor with NI
	 * @throws Exception 
	 * 
	 */
	public void SCwithNI() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "subcontractor with NI");
	}
	
	
	
	/**
	 * Take screenshot for subcontractor with wrong UTR
	 * @throws Exception 
	 * 
	 */
	public void SCwithwrongUTR() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "subcontractor with wrong UTR");
	}
	
	
	/**
	 * Take screenshot for subcontractor with wrong NI
	 * @throws Exception 
	 * 
	 */
	public void SCwithwrongNI() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "subcontractor with wrong NI");
	}
	
	public void Click_importSubcontractor() throws InterruptedException
	{
       elem = getWebElement(ImpSubcontractor);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_importSubcontractor", "Click_importSubcontractor. Unable to locate object: " + ImpSubcontractor.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_importSubcontractor", "Click_importSubcontractor. Unable to locate object: " + ImpSubcontractor.toString());

			Assert.fail("Unable to locate object: " + ImpSubcontractor.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_importSubcontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_importSubcontractor");
	}
	
	public void Click_ChooseFile() throws InterruptedException, IOException, AWTException
	{
       elem = getWebElement(ChooseFil);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_importSubcontractor", "Click_importSubcontractor. Unable to locate object: " + ChooseFil.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_importSubcontractor", "Click_importSubcontractor. Unable to locate object: " + ChooseFil.toString());

			Assert.fail("Unable to locate object: " + ChooseFil.toString());
        }
		
		
	//	System.out.println(elem.getText());
		
	
		Robot r = new Robot();
		elem.click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
	//	Runtime.getRuntime().exec("D:\\SampleA.exe");
   	Runtime.getRuntime().exec("C:\\Users\\Shiv\\Documents\\SampleB.exe"); // no emails registered
	  
	/*	for(int i =0;i<2;i++)
		{
          r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_C);
		 Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
	*/
		 Thread.sleep(5000);
	    System.out.println("File Posted");
		ExtentReportManager.passStep(m_Driver, "Click_importSubcontractor");

		TestModellerLogger.PassStep(m_Driver, "Click_importSubcontractor");
	}
	
	public void Click_Uploadbtn()
	{
       elem = getWebElement(Uploadbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Uploadbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Uploadbtn.toString());

			Assert.fail("Unable to locate object: " + Uploadbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_uploadbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_uploadbtn");
	}
	
	public void Click_Nextbtn()
	{
       elem = getWebElement(Nxtbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Nxtbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Nxtbtn.toString());

			Assert.fail("Unable to locate object: " + Nxtbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_uploadbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_uploadbtn");
	}
	
	public void Click_Importbtn()
	{
       elem = getWebElement(Importbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Importbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_uploadbtn", "Click_uploadbtn. Unable to locate object: " + Importbtn.toString());

			Assert.fail("Unable to locate object: " + Importbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_uploadbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_uploadbtn");
	}
	
	public void Click_Dashboardbtn()
	{
       elem = getWebElement(Dashboardbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Dashboardbtn", "Click_Dashboardbtn. Unable to locate object: " + Dashboardbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Dashboardbtn", "Click_Dashboardbtn. Unable to locate object: " + Dashboardbtn.toString());

			Assert.fail("Unable to locate object: " + Dashboardbtn.toString());
        }

		elem.click();

  	

		ExtentReportManager.passStep(m_Driver, "Click_Dashboardbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Dashboardbtn");
	}
	
}