package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.reports.ExtentReportManager;

public class CreateClient extends BasePage {

	public CreateClient(WebDriver driver) {
		super(driver);
	}
	
	public static String client;

	
	private By newClientElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_btnAdd']");
	
	private By limitedCompanyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']");

	private By manuallyLimitedElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By buisnessNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCompanyName']");
	private By registrationNoElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtRegNo']");

	private By registrationDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCRegDate']");

	private By registrationDatePartnershipElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel1_txtCRegDate']");

	private By firstNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtFirstName1']");

	private By firstNameElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtFirstName2']");

	private By LasttNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLastName1']");
	
	private By LasttNameElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLastName2']");

	private By saveBtnElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By soleTraderElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSoleTrader']");

	private By partnershipElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnPartnership']");
	
	private By  partnershipNameElem  = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel1_txtCompanyName']");
	
	private By  partnershipUtrElem  = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel1_txtUTR']");

	private By  addressLine1Elem  = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel1_txtAddress1']");
	
	private By  addressLine2Elem  = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel1_txtAddress2']");

	private By nextElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel1_btnNext']");
	
	private By addPartnerElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel2_btnAddPartner']");
	
	private By firstNameAddPartnerElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtFirstName']");
	private By LasttNameAddPartnerElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLastName']");

	private By  addressLine1AddPartnerElem  = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAddress1']");
	private By  addressLine2AddPartnerElem  = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtAddress2']");

	private By saveBtnAddPartnerElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	private By liablityPartnershipElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnLLP']");
	
	private By LiablitypartnershipUtrElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUTRNo_LLP']");
	
	private By registrationDateLimitedLiablityElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCRegDate']");
	
	private By publicLimitedCompanyElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnPLC']");
	
	private By payrollElem= By.xpath("//*[@id='payrollMenu']");
	
	private By dashBoardElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[1]/a");

	private By searchElem= By.xpath("//*[@id='search_input']");

	public void clickNewClient() throws Exception
	{
        
		Thread.sleep(5000);

		WebElement elem = getWebElement(newClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNewClient", "clickNewClient failed. Unable to locate object: " + newClientElem.toString());


			Assert.fail("Unable to locate object: " + newClientElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click_ClickSearch");

		
  		Reporter.log("clickNewClient");

	}
	
	
	
	
	public void clickLimitedCompany() throws Exception
	{
        
		WebElement elem = getWebElement(limitedCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickLimitedCompany", "clickLimitedCompany failed. Unable to locate object: " + limitedCompanyElem.toString());


			Assert.fail("Unable to locate object: " + limitedCompanyElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickLimitedCompany");

		
  		Reporter.log("clickLimitedCompany");

	}
	
	
	public void clickSoleTrader() throws Exception
	{
        
		WebElement elem = getWebElement(soleTraderElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSoleTrader", "clickSoleTrader failed. Unable to locate object: " + soleTraderElem.toString());


			Assert.fail("Unable to locate object: " + soleTraderElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickSoleTrader");

		
  		Reporter.log("clickSoleTrader");

	}
	
	
	
	public void clickLimitedLiablityPartnership() throws Exception
	{
        
		WebElement elem = getWebElement(liablityPartnershipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSoleTrader", "clickSoleTrader failed. Unable to locate object: " + liablityPartnershipElem.toString());


			Assert.fail("Unable to locate object: " + liablityPartnershipElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickLimitedLiablityPartnership");

		
  		Reporter.log("clickLimitedLiablityPartnership");

	}
	
	
	public void clickPublicLimitedCompany() throws Exception
	{
        
		WebElement elem = getWebElement(publicLimitedCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPublicLimitedCompany", "clickPublicLimitedCompany failed. Unable to locate object: " + publicLimitedCompanyElem.toString());


			Assert.fail("Unable to locate object: " + publicLimitedCompanyElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickPublicLimitedCompany");

		
  		Reporter.log("clickPublicLimitedCompany");

	}
	

	public void clickPartnership() throws Exception
	{
        
		WebElement elem = getWebElement(partnershipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPartnership", "clickPartnership failed. Unable to locate object: " + partnershipElem.toString());


			Assert.fail("Unable to locate object: " + partnershipElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickPartnership");

		
  		Reporter.log("clickPartnership");

	}
	public void clickMnualyLimitedCompany() throws Exception
	{
        
		WebElement elem = getWebElement(manuallyLimitedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickMnualyLimitedCompany", "clickMnualyLimitedCompany failed. Unable to locate object: " + manuallyLimitedElem.toString());


			Assert.fail("Unable to locate object: " + manuallyLimitedElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickMnualyLimitedCompany");

		
  		Reporter.log("clickMnualyLimitedCompany");

	}
	
	
	
	public void enterBuisnessName() throws Exception
	{
        
		WebElement elem = getWebElement(buisnessNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickBuisnessName", "clickBuisnessName failed. Unable to locate object: " + buisnessNameElem.toString());


			Assert.fail("Unable to locate object: " + buisnessNameElem.toString());
        }

	    client = RandomStringUtils.randomAlphabetic(9); 

		elem.sendKeys(client);
		System.out.println(client);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickBuisnessName");

		
  		Reporter.log("clickBuisnessName");

	}
	
	
	public void enterPartnership() throws Exception
	{
        
		WebElement elem = getWebElement(partnershipNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPartnership", "enterPartnership failed. Unable to locate object: " + partnershipNameElem.toString());


			Assert.fail("Unable to locate object: " + partnershipNameElem.toString());
        }

	    client = RandomStringUtils.randomAlphabetic(9); 

		elem.sendKeys(client);
		System.out.println(client);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterPartnership");

		
  		Reporter.log("enterPartnership");

	}
	
	public void enterBuisnessName1(String data) throws Exception
	{
        
		WebElement elem = getWebElement(buisnessNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickBuisnessName", "clickBuisnessName failed. Unable to locate object: " + buisnessNameElem.toString());


			Assert.fail("Unable to locate object: " + buisnessNameElem.toString());
        }

	   elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickBuisnessName");

		
  		Reporter.log("clickBuisnessName");

	}
	
	

	public void enterRegistrationNo() throws Exception
	{
        
		WebElement elem = getWebElement(registrationNoElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRegistrationNo", "enterRegistrationNo failed. Unable to locate object: " + registrationNoElem.toString());


			Assert.fail("Unable to locate object: " + registrationNoElem.toString());
        }
	   String  value = RandomStringUtils.randomNumeric(8); 

		elem.sendKeys(value);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterRegistrationNo");

		
  		Reporter.log("enterRegistrationNo");

	}
	
	

	public void enterUtrNo() throws Exception
	{
        
		WebElement elem = getWebElement(registrationNoElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterUtrNo", "enterUtrNo failed. Unable to locate object: " + registrationNoElem.toString());


			Assert.fail("Unable to locate object: " + registrationNoElem.toString());
        }
	   String  value = RandomStringUtils.randomNumeric(10); 

		elem.sendKeys(value);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterUtrNo");

		
  		Reporter.log("enterUtrNo");

	}
	
	

	public void enterPartnershipUtrNo() throws Exception
	{
        
		WebElement elem = getWebElement(partnershipUtrElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPartnershipUtrNo", "enterPartnershipUtrNo failed. Unable to locate object: " + partnershipUtrElem.toString());


			Assert.fail("Unable to locate object: " + partnershipUtrElem.toString());
        }
	   String  value = RandomStringUtils.randomNumeric(10); 

		elem.sendKeys(value);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterPartnershipUtrNo");

		
  		Reporter.log("enterPartnershipUtrNo");

	}
	

	public void enterLiablityPartnershipUtrNo() throws Exception
	{
        
		WebElement elem = getWebElement(LiablitypartnershipUtrElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterLiablityPartnershipUtrNo", "enterLiablityPartnershipUtrNo failed. Unable to locate object: " + LiablitypartnershipUtrElem.toString());


			Assert.fail("Unable to locate object: " + LiablitypartnershipUtrElem.toString());
        }
	   String  value = RandomStringUtils.randomNumeric(10); 

		elem.sendKeys(value);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterLiablityPartnershipUtrNo");

		
  		Reporter.log("enterLiablityPartnershipUtrNo");

	}
	
	
	
	public void enterRegistrationDate(String data) throws Exception
	{
        
		WebElement elem = getWebElement(registrationDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRegistrationDate", "enterRegistrationDate failed. Unable to locate object: " + registrationDateElem.toString());


			Assert.fail("Unable to locate object: " + registrationDateElem.toString());
        }

		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterRegistrationDate");

		
  		Reporter.log("enterRegistrationDate");

	}
	
	
	
	public void enterRegistrationDateLimitedLiablity(String data) throws Exception
	{
        
		WebElement elem = getWebElement(registrationDateLimitedLiablityElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRegistrationDateLimitedLiablity", "enterRegistrationDateLimitedLiablity failed. Unable to locate object: " + registrationDateLimitedLiablityElem.toString());


			Assert.fail("Unable to locate object: " + registrationDateLimitedLiablityElem.toString());
        }

		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterRegistrationDateLimitedLiablity");

		
  		Reporter.log("enterRegistrationDateLimitedLiablity");

	}
	
	public void enterRegistrationDatePartnership(String data) throws Exception
	{
        
		WebElement elem = getWebElement(registrationDatePartnershipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRegistrationDatePartnership", "enterRegistrationDatePartnership failed. Unable to locate object: " + registrationDatePartnershipElem.toString());


			Assert.fail("Unable to locate object: " + registrationDatePartnershipElem.toString());
        }

		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterRegistrationDatePartnership");

		
  		Reporter.log("enterRegistrationDatePartnership");

	}
	
	public void enterFirstName() throws Exception
	{
        
		WebElement elem = getWebElement(firstNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFirstName", "enterFirstName failed. Unable to locate object: " + firstNameElem.toString());


			Assert.fail("Unable to locate object: " + firstNameElem.toString());
        }
	    String  data = RandomStringUtils.randomAlphabetic(5); 

		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterFirstName");

  		Reporter.log("enterFirstName");

	}
	
	
	
	public void enterFirstName1() throws Exception
	{
        
		WebElement elem = getWebElement(firstNameElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFirstName", "enterFirstName failed. Unable to locate object: " + firstNameElem1.toString());


			Assert.fail("Unable to locate object: " + firstNameElem1.toString());
        }
	    String  data = RandomStringUtils.randomAlphabetic(5); 

		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterFirstName");

  		Reporter.log("enterFirstName");

	}
	
	
	
	public void enterAddressLine1() throws Exception
	{
        
		WebElement elem = getWebElement(addressLine1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAddressLine1", "enterAddressLine1 failed. Unable to locate object: " + addressLine1Elem.toString());


			Assert.fail("Unable to locate object: " + addressLine1Elem.toString());
        }
	    String  data = RandomStringUtils.randomAlphabetic(5); 

		Thread.sleep(2000);
	  //  elem.sendKeys(Keys.ENTER);
		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterAddressLine1");

  		Reporter.log("enterAddressLine1");

	}
	
	
	public void enterAddressLine2() throws Exception
	{
        
		WebElement elem = getWebElement(addressLine2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAddressLine2", "enterAddressLine2 failed. Unable to locate object: " + addressLine2Elem.toString());

			Assert.fail("Unable to locate object: " + addressLine2Elem.toString());
        }
	    String  data = RandomStringUtils.randomAlphabetic(9); 

		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterAddressLine2");

  		Reporter.log("enterAddressLine2");

	}
	
	
	public void enterLastName() throws Exception
	{
		WebElement elem = getWebElement(LasttNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterLastName", "enterLastName failed. Unable to locate object: " + LasttNameElem.toString());


			Assert.fail("Unable to locate object: " + LasttNameElem.toString());
        }

		String  data = RandomStringUtils.randomAlphabetic(5); 

		elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterLastName");

  		Reporter.log("enterLastName");
  		
  		
  		//select Module Name As Active
  		
  		
  		elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddBKStatus']"));
  		
  		Select sel= new Select(elem);
  		
  		sel.selectByVisibleText("Active");
  		
  		
  		Thread.sleep(1000);
        WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddFAStatus']"));
  		
  		Select sel1= new Select(elem1);
  		
  		sel1.selectByVisibleText("Active");

  		Thread.sleep(1000);

        WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddpayrollStatus']"));
  		
  		Select sel2= new Select(elem2);
  		
  		sel2.selectByVisibleText("Active");
  		Thread.sleep(1000);


	}
	
	
	
	
	

	public void enterLastName1() throws Exception
	{
        
		WebElement elem = getWebElement(LasttNameElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterLastName", "enterLastName failed. Unable to locate object: " + LasttNameElem1.toString());


			Assert.fail("Unable to locate object: " + LasttNameElem1.toString());
        }

		String  data = RandomStringUtils.randomAlphabetic(5); 

		elem.sendKeys(data);


		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterLastName");

  		Reporter.log("enterLastName");

	}
	
	public void clickSaveBtn() throws Exception
	{
        
		WebElement elem = getWebElement(saveBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveBtnElem.toString());


			Assert.fail("Unable to locate object: " + saveBtnElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");

		
  		Reporter.log("clickSaveBtn");

	}
	
	
	public void clickNextBtn() throws Exception
	{
        

		WebElement elem = getWebElement(nextElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNextBtn", "clickNextBtn failed. Unable to locate object: " + nextElem.toString());


			Assert.fail("Unable to locate object: " + nextElem.toString());
        }

       //  elem.click();
         
 		jsExec.executeScript("arguments[0].click();",elem);

		Thread.sleep(5000);
		ExtentReportManager.passStep(m_Driver, "clickNextBtn");

		
  		Reporter.log("clickNextBtn");

	}
	
	
	public void clickAddPartnerBtn() throws Exception
	{
        
		WebElement elem = getWebElement(addPartnerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddPartnerBtn", "clickAddPartnerBtn failed. Unable to locate object: " + addPartnerElem.toString());


			Assert.fail("Unable to locate object: " + addPartnerElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickAddPartnerBtn");

		
  		Reporter.log("clickAddPartnerBtn");

	}
	
	
	public void enterAddPartnerFirstName() throws Exception
	{
        
		WebElement elem = getWebElement(firstNameAddPartnerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddPartnerFirstName", "clickAddPartnerFirstName failed. Unable to locate object: " + firstNameAddPartnerElem.toString());


			Assert.fail("Unable to locate object: " + firstNameAddPartnerElem.toString());
        }
		 String  data = RandomStringUtils.randomAlphabetic(5); 

			elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickAddPartnerFirstName");

		
  		Reporter.log("clickAddPartnerFirstName");

	}
	
	public void enterAddPartnerLastName() throws Exception
	{
        
		WebElement elem = getWebElement(LasttNameAddPartnerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddPartnerLastName", "clickAddPartnerLastName failed. Unable to locate object: " + LasttNameAddPartnerElem.toString());


			Assert.fail("Unable to locate object: " + LasttNameAddPartnerElem.toString());
        }

		 String  data = RandomStringUtils.randomAlphabetic(5); 

			elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickAddPartnerLastName");

		
  		Reporter.log("clickAddPartnerFirstName");

	}
	
	
	public void enterAddress1() throws Exception
	{
        
		WebElement elem = getWebElement(addressLine1AddPartnerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAddress1", "enterAddress1 failed. Unable to locate object: " + addressLine1AddPartnerElem.toString());


			Assert.fail("Unable to locate object: " + addressLine1AddPartnerElem.toString());
        }

		 String  data = RandomStringUtils.randomAlphabetic(9); 

			elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterAddress1");

		
  		Reporter.log("enterAddress1");

	}
	
	public void enterAddress2() throws Exception
	{
        
		WebElement elem = getWebElement(addressLine2AddPartnerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAddress2", "enterAddress2 failed. Unable to locate object: " + addressLine2AddPartnerElem.toString());


			Assert.fail("Unable to locate object: " + addressLine2AddPartnerElem.toString());
        }
		 String  data = RandomStringUtils.randomAlphabetic(9); 

			elem.sendKeys(data);

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterAddress2");

		
  		Reporter.log("enterAddress2");

	}
	
	
	public void goToInsideFrame() throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel2_btnempAddIframe']")));

        
	}
	
	
	public void switchToDefaultContent() throws InterruptedException
	{

		m_Driver.switchTo().defaultContent();
        
	}
	
	
	
	public void clickSaveBtnAddPartner() throws Exception
	{
        
		WebElement elem = getWebElement(saveBtnAddPartnerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtnAddPartner", "clickSaveBtnAddPartner failed. Unable to locate object: " + saveBtnAddPartnerElem.toString());


			Assert.fail("Unable to locate object: " + saveBtnAddPartnerElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickSaveBtnAddPartner");

		
  		Reporter.log("clickSaveBtnAddPartner");

	}
	
	

	public void clickPayroll() throws Exception
	{
        
		WebElement elem = getWebElement(payrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayroll", "clickPayroll failed. Unable to locate object: " + payrollElem.toString());


			Assert.fail("Unable to locate object: " + payrollElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickPayroll");

		
  		Reporter.log("clickPayroll");

	}
	
	

	public void clickDashBoard() throws Exception
	{
        
		WebElement elem = getWebElement(dashBoardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDashBoard", "clickDashBoard failed. Unable to locate object: " + dashBoardElem.toString());


			Assert.fail("Unable to locate object: " + dashBoardElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickDashBoard");

		
  		Reporter.log("clickDashBoard");

	}
	
	
	public void searchClient() throws Exception
	{
        
		WebElement elem = getWebElement(searchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "searchClient", "searchClient failed. Unable to locate object: " + searchElem.toString());


			Assert.fail("Unable to locate object: " + searchElem.toString());
        }

		elem.sendKeys(client);

		Thread.sleep(2000);

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ui-id-1']/li//a[normalize-space()='"+client+"']"));
		
		elem1.click();
		
		utilities.ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "searchClient");

		
  		Reporter.log("searchClient");

	}
	
	
	public void searchClient1() throws Exception
	{
        
		WebElement elem = getWebElement(searchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "searchClient", "searchClient failed. Unable to locate object: " + searchElem.toString());


			Assert.fail("Unable to locate object: " + searchElem.toString());
        }

		elem.sendKeys("MGKEYOUTZ");

		Thread.sleep(2000);

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ui-id-1']/li//a[normalize-space()='MGkEyOUtZ']"));
		
		elem1.click();
		
		utilities.ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "searchClient");

		
  		Reporter.log("searchClient");

	}
	
	
	
	public void SaveBtnAddPartnerShip() throws Exception {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TabPanel2_btnSave']"));
		
		elem.click();
		
		Thread.sleep(5000);
	}
}
