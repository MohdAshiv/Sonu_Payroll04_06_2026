package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.reports.ExtentReportManager;

public class PensionSetup extends BasePage {

	public PensionSetup(WebDriver driver) {
		super(driver);
		
			}
	
	
	private By pensionSchemeNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtPensionName']");
	
	private By pensionProviderElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlPensionProvider']");
	
	private By eEcontributionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEEContribution']");
	
	private By eRcontributionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtERContribution']");

	private By subGroupElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtSubGroupName']");

	private By GroupIdElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtGroupId']");
	
	private By subGroupIdElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtSubGroupId']");

	private By PensionDashboardElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPension']/span");
	
	private By viewScheme= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefViewScheme']");

	private By editSchemeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkEdit']");

    private By calculationBasisElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlCalculationBasis']");

    private By calculationMethodElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlTrNetRas']");

    private By saveMethodElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
    
    
    private By stagingDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtStagingDate']");

    private By reEnrollmentDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtNextCyclicalEnrolDate']");
    private By signatoryTitleElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtSignatoryTitle']");

    private By signatoryNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtSignatoryName']");

    private By emailAddresElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtEmailAE']");

    private By phoneNumberElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtContactNumber']");

    private By pensionIDElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtPSEmployerID']");

    private By pensionDetailsSave= By.xpath("//*[@id='btnSave']");
    

    private By workerTypeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddl_workerType']");

    private By StatusElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlEmpEligiblestatus']");

    private By SchemeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlPensionScheme']");

    private By EnrollmentDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtEnrolledDate']");

    private By postponeStartDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtPostponeStartDate']");
    private By optOutElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtOptOutDate']");
    private By eeChoosenElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtEEChosenContribution']");

    private By erChoosenElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtERChosenContribution']");

    
    private By postponeEndDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtPostponeEndDate']");
    private By eeVoluntaryElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtEEVoluntaryContribution']");

    
    private By eRVoluntaryElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtERVoluntaryContribution']");

    private By autoEnrollmentSveElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSaveAEEmployee']");

    private By cessionDateElen= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtCessationDate']");
    
    
    
    
    public void enterPensionStagingDate(String data) throws Exception
	{
        
		WebElement elem = getWebElement(stagingDateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPensionStagingDate", "enterPensionStagingDate failed. Unable to locate object: " + stagingDateElem.toString());


			Assert.fail("Unable to locate object: " + stagingDateElem.toString());
        }

		elem.sendKeys(data);

		 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment']/div[3]/label")).click();
		
		Thread.sleep(4000);
		ExtentReportManager.passStep(m_Driver, "enterPensionStagingDate");

		
  		Reporter.log("enterPensionStagingDate");

	}
    
    
    public void enterSignatoryTitle() throws Exception
   	{
           
   		WebElement elem = getWebElement(signatoryTitleElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterSignatoryTitle", "enterSignatoryTitle failed. Unable to locate object: " + signatoryTitleElem.toString());


   			Assert.fail("Unable to locate object: " + signatoryTitleElem.toString());
           }

			String title = RandomStringUtils.randomAlphabetic(6);

			elem.sendKeys(title);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterSignatoryTitle");

   		
     		Reporter.log("enterSignatoryTitle");

   	}
    
    
    public void enterSignatoryName() throws Exception
   	{
           
   		WebElement elem = getWebElement(signatoryNameElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterSignatoryName", "enterSignatoryName failed. Unable to locate object: " + signatoryNameElem.toString());


   			Assert.fail("Unable to locate object: " + signatoryNameElem.toString());
           }

			String name = RandomStringUtils.randomAlphabetic(6);

			elem.sendKeys(name);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterSignatoryName");

   		
     		Reporter.log("enterSignatoryName");

   	}
      
      
    
    public void enterEmailAddress(String data) throws Exception
   	{
           
   		WebElement elem = getWebElement(emailAddresElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterEmailAddress", "enterEmailAddress failed. Unable to locate object: " + emailAddresElem.toString());


   			Assert.fail("Unable to locate object: " + emailAddresElem.toString());
           }

	     	elem.sendKeys(data);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterEmailAddress");

   		
     		Reporter.log("enterEmailAddress");

   	}
    
    public void enterPhoneNumber() throws Exception
   	{
           
   		WebElement elem = getWebElement(phoneNumberElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPhoneNumber", "enterPhoneNumber failed. Unable to locate object: " + phoneNumberElem.toString());


   			Assert.fail("Unable to locate object: " + phoneNumberElem.toString());
           }

			String phoneNumber = RandomStringUtils.randomNumeric(10);

			elem.sendKeys(phoneNumber);
			Thread.sleep(1000);
			ExtentReportManager.passStep(m_Driver, "enterPhoneNumber");

   		
     		Reporter.log("enterPhoneNumber");

   	}
      
    public void enterPensionId(String data) throws Exception
   	{
           
   		WebElement elem = getWebElement(pensionIDElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPensionId", "enterPensionId failed. Unable to locate object: " + pensionIDElem.toString());


   			Assert.fail("Unable to locate object: " + pensionIDElem.toString());
           }

	     	elem.sendKeys(data);
			Thread.sleep(1000);
			ExtentReportManager.passStep(m_Driver, "enterPensionId");

   		
     	Reporter.log("enterPensionId");

   	}
    
    
    
  
    
    
    
 	public void clickPensonDetailsSave() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(pensionDetailsSave);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPensonDetailsSave", "clickPensonDetailsSave failed. Unable to locate object: " + pensionDetailsSave.toString());

     		
 			Assert.fail("Unable to locate object: " + pensionDetailsSave.toString());
         }


 		jsExec.executeScript("arguments[0].click();", elem);
           	
 		Thread.sleep(4000);

 		ExtentReportManager.passStep(m_Driver, "clickPensonDetailsSave");

 		
 	}
    
    
 	
 	public void addSchemeManually() throws Exception
 	{
 		
 		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/div/div/div/a"));
 		  Actions action =    new Actions(m_Driver);
 	        action.moveToElement(elem).perform();
 	        Thread.sleep(2000);
 	        
 	       WebElement  SUBMenu = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkAddManually']"));
 	        action.click(SUBMenu).perform();
 	}
    
    public void clickPensionDashBoard() throws Exception
	{
        
		WebElement elem = getWebElement(PensionDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPensionDashBoar", "clickPensionDashBoar failed. Unable to locate object: " + PensionDashboardElem.toString());


			Assert.fail("Unable to locate object: " + PensionDashboardElem.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickPensionDashBoar");

		
  		Reporter.log("clickPensionDashBoar");

	}
    
    

    public void clickViewScheme() throws Exception
	{
        
		WebElement elem = getWebElement(viewScheme);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickViewScheme", "clickViewScheme failed. Unable to locate object: " + viewScheme.toString());


			Assert.fail("Unable to locate object: " + viewScheme.toString());
        }

		elem.click();

		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "clickViewScheme");

		
  		Reporter.log("clickViewScheme");

	}
    
    
    public void clickEditScheme() throws Exception
  	{
          
  		WebElement elem = getWebElement(editSchemeElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditScheme", "clickEditScheme failed. Unable to locate object: " + editSchemeElem.toString());


  			Assert.fail("Unable to locate object: " + editSchemeElem.toString());
          }

  		elem.click();

  		Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "clickEditScheme");

  		
    	Reporter.log("clickEditScheme");

  	}
    
    public void enterPensionSchemeName(String value) throws Exception
  	{
          
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

  		WebElement elem = getWebElement(pensionSchemeNameElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPensionSchemeName", "enterPensionSchemeName failed. Unable to locate object: " + pensionSchemeNameElem.toString());


  			Assert.fail("Unable to locate object: " + pensionSchemeNameElem.toString());
          }

			elem.sendKeys(value);
			m_Driver.switchTo().defaultContent();
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterPensionSchemeName");

  		
    	Reporter.log("enterPensionSchemeName");

  	}
    
    
    public void selectPensionProvider(String value) throws Exception
  	{
          
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

  		WebElement elem = getWebElement(pensionProviderElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPensionProvider", "selectPensionProvider failed. Unable to locate object: " + pensionProviderElem.toString());


  			Assert.fail("Unable to locate object: " + pensionProviderElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);
			
			m_Driver.switchTo().defaultContent();
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectPensionProvider");

  		
    	Reporter.log("selectPensionProvider");

  	}
    
    
    
    public void selectCalculationBasis(String value) throws Exception
  	{
          
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

  		WebElement elem = getWebElement(calculationBasisElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectCalculationBasis", "selectCalculationBasis failed. Unable to locate object: " + calculationBasisElem.toString());


  			Assert.fail("Unable to locate object: " + calculationBasisElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);
			
			m_Driver.switchTo().defaultContent();
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectCalculationBasis");

  		
    	Reporter.log("selectCalculationBasis");

  	}
    

    public void selectCalculationBasis1(String value) throws Exception
  	{
          
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

  		WebElement elem = getWebElement(calculationBasisElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectCalculationBasis", "selectCalculationBasis failed. Unable to locate object: " + calculationBasisElem.toString());


  			Assert.fail("Unable to locate object: " + calculationBasisElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);
			
			m_Driver.switchTo().defaultContent();
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectCalculationBasis");

  		
    	Reporter.log("selectCalculationBasis");

  	}
    
    
    public void selectCalculationMethod(String value) throws Exception
  	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

  		WebElement elem = getWebElement(calculationMethodElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectCalculationMethod", "selectCalculationMethod failed. Unable to locate object: " + calculationMethodElem.toString());


  			Assert.fail("Unable to locate object: " + calculationMethodElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);
			m_Driver.switchTo().defaultContent();

			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectCalculationMethod");

  		
    	Reporter.log("selectCalculationMethod");

  	}
    
    public void selectCalculationMethod1(String value) throws Exception
  	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

  		WebElement elem = getWebElement(calculationMethodElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectCalculationMethod", "selectCalculationMethod failed. Unable to locate object: " + calculationMethodElem.toString());


  			Assert.fail("Unable to locate object: " + calculationMethodElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);
			m_Driver.switchTo().defaultContent();

			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectCalculationMethod");

  		
    	Reporter.log("selectCalculationMethod");

  	}
    
    
    
    public void eeContribution(String value) throws Exception
  	{
          
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

  		WebElement elem = getWebElement(eEcontributionElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "eeContribution", "eeContribution failed. Unable to locate object: " + eEcontributionElem.toString());


  			Assert.fail("Unable to locate object: " + eEcontributionElem.toString());
          }

			elem.sendKeys(value);
			elem.sendKeys(Keys.TAB);
			m_Driver.switchTo().defaultContent();
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "eeContribution");

  		
    	Reporter.log("eeContribution");

  	}
    
    
    
    public void enterErContribution(String value) throws Exception
   	{
           
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

   		WebElement elem = getWebElement(eRcontributionElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterErContribution", "enterErContribution failed. Unable to locate object: " + eEcontributionElem.toString());


   			Assert.fail("Unable to locate object: " + eEcontributionElem.toString());
           }

 			elem.sendKeys(value);
			elem.sendKeys(Keys.TAB);

 			m_Driver.switchTo().defaultContent();
 			Thread.sleep(2000);
 			ExtentReportManager.passStep(m_Driver, "enterErContribution");

   		
     	Reporter.log("enterErContribution");

   	}
     
    
    
    public void enterSubgroupName() throws Exception
   	{
           
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

   		WebElement elem = getWebElement(subGroupElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterSubgroupName", "enterSubgroupName failed. Unable to locate object: " + subGroupElem.toString());


   			Assert.fail("Unable to locate object: " + subGroupElem.toString());
           }

   		String groupname = RandomStringUtils.randomAlphabetic(5);

		 elem.sendKeys(groupname);
		Thread.sleep(1000);
 			 m_Driver.switchTo().defaultContent();
 			Thread.sleep(2000);
 			ExtentReportManager.passStep(m_Driver, "enterSubgroupName");

   		
     	Reporter.log("enterSubgroupName");

   	}
     
    
    public void enterGroupId() throws Exception
   	{
           
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

   		WebElement elem = getWebElement(GroupIdElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterSubgroupId", "enterSubgroupId failed. Unable to locate object: " + GroupIdElem.toString());


   			Assert.fail("Unable to locate object: " + GroupIdElem.toString());
           }

			String groupname = RandomStringUtils.randomAlphabetic(5);

			elem.sendKeys(groupname);
			Thread.sleep(1000);
			m_Driver.switchTo().defaultContent();
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterSubgroupId");

			Reporter.log("enterSubgroupId");

   	}
    
    
    
    public void enterSubGroupId() throws Exception
   	{
           
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

   		WebElement elem = getWebElement(subGroupIdElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterSubGroupId", "enterSubGroupId failed. Unable to locate object: " + subGroupIdElem.toString());


   			Assert.fail("Unable to locate object: " + subGroupIdElem.toString());
           }

			String groupId = RandomStringUtils.randomNumeric(5);

			elem.sendKeys(groupId);
			Thread.sleep(1000);
			m_Driver.switchTo().defaultContent();
			Thread.sleep(3000);
			ExtentReportManager.passStep(m_Driver, "enterSubGroupId");

			Reporter.log("enterSubGroupId");

   	}
    
    public void clickSaveBtn() throws Exception
  	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));

          
  		WebElement elem = getWebElement(saveMethodElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveMethodElem.toString());


  			Assert.fail("Unable to locate object: " + saveMethodElem.toString());
          }
  		Thread.sleep(3000);

  		elem.click();
		m_Driver.switchTo().defaultContent();


  		Thread.sleep(3000);
  		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");

  		
    	Reporter.log("clickSaveBtn");

  	}
    
    
    public void clickSaveBtn1() throws Exception
   	{
 		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

           
   		WebElement elem = getWebElement(saveMethodElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveMethodElem.toString());


   			Assert.fail("Unable to locate object: " + saveMethodElem.toString());
           }
   		Thread.sleep(3000);

   		elem.click();
 		m_Driver.switchTo().defaultContent();


   		Thread.sleep(3000);
   		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");

   		
     	Reporter.log("clickSaveBtn");

   	}
     
    
    
    public void selectWorkerType(String value) throws Exception
  	{

  		WebElement elem = getWebElement(workerTypeElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectWorkerType", "selectWorkerType failed. Unable to locate object: " + workerTypeElem.toString());


  			Assert.fail("Unable to locate object: " + workerTypeElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);

			Thread.sleep(5000);
			ExtentReportManager.passStep(m_Driver, "selectWorkerType");

  		
    	Reporter.log("selectWorkerType");

  	}
    
    

    public void selectStatus(String value) throws Exception
  	{

  		WebElement elem = getWebElement(StatusElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStatus", "selectStatus failed. Unable to locate object: " + StatusElem.toString());


  			Assert.fail("Unable to locate object: " + StatusElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);

			Thread.sleep(5000);
			ExtentReportManager.passStep(m_Driver, "selectStatus");

  		
    	Reporter.log("selectStatus");

  	}
    
    public void selectScheme(String value) throws Exception
  	{

  		WebElement elem = getWebElement(SchemeElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectScheme", "selectScheme failed. Unable to locate object: " + SchemeElem.toString());


  			Assert.fail("Unable to locate object: " + SchemeElem.toString());
          }

			Select sel = new Select(elem);
			sel.selectByVisibleText(value);

			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "selectScheme");

  		
    	Reporter.log("selectScheme");

  	}
    
    
    
    public void enterEnrollmentDate(String value) throws Exception
  	{

  		WebElement elem = getWebElement(EnrollmentDateElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterEnrollmentDate", "enterEnrollmentDate failed. Unable to locate object: " + EnrollmentDateElem.toString());


  			Assert.fail("Unable to locate object: " + EnrollmentDateElem.toString());
          }

			elem.sendKeys(value);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterEnrollmentDate");

  		
    	Reporter.log("enterEnrollmentDate");

  	}
    
    
    public void enterCessionDate(String value) throws Exception
  	{

  		WebElement elem = getWebElement(cessionDateElen);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterCessionDate", "enterCessionDate failed. Unable to locate object: " + cessionDateElen.toString());


  			Assert.fail("Unable to locate object: " + cessionDateElen.toString());
          }

			elem.sendKeys(value);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterCessionDate");

  		
    	Reporter.log("enterCessionDate");

  	}
    
    
    
    
    public void enterPostponeStartDate(String value) throws Exception
  	{

  		WebElement elem = getWebElement(postponeStartDateElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPostponeStartDate", "enterPostponeStartDate failed. Unable to locate object: " + postponeStartDateElem.toString());


  			Assert.fail("Unable to locate object: " + postponeStartDateElem.toString());
          }

			elem.sendKeys(value);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterPostponeStartDate");

  		
    	Reporter.log("enterPostponeStartDate");

  	}
    
    
    public void enterPostponeEndDate(String value) throws Exception
  	{

  		WebElement elem = getWebElement(postponeEndDateElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterPostponeEndDate", "enterPostponeEndDate failed. Unable to locate object: " + postponeEndDateElem.toString());


  			Assert.fail("Unable to locate object: " + postponeEndDateElem.toString());
          }

			elem.sendKeys(value);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterPostponeEndDate");

  		
    	Reporter.log("enterPostponeEndDate");

  	}
    
    
    public void enterOptOutDate(String value) throws Exception
  	{

  		WebElement elem = getWebElement(optOutElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterOptOutDate", "enterOptOutDate failed. Unable to locate object: " + optOutElem.toString());


  			Assert.fail("Unable to locate object: " + optOutElem.toString());
          }

			elem.sendKeys(value);
			Thread.sleep(2000);
			ExtentReportManager.passStep(m_Driver, "enterOptOutDate");

  		
    	Reporter.log("enterOptOutDate");

  	}
    
    public void eeChoosenContribution(String value) throws Exception
  	{
          
    	
    	// it is autoselected now so commented

//  		WebElement elem = getWebElement(eeChoosenElem);
//
//  		if (elem == null) {
//      		ExtentReportManager.failStepWithScreenshot(m_Driver, "eeChoosenContribution", "eeChoosenContribution failed. Unable to locate object: " + eeChoosenElem.toString());
//
//
//  			Assert.fail("Unable to locate object: " + eeChoosenElem.toString());
//          }
//
//			//elem.sendKeys(value);
//			Thread.sleep(2000);
//			ExtentReportManager.passStep(m_Driver, "eeChoosenContribution");

  		
    	Reporter.log("eeChoosenContribution");

  	}
    
    
    
    public void erChoosenContribution(String value) throws Exception
  	{
    	//  // it is autoselected now so commented

          
//
//  		WebElement elem = getWebElement(erChoosenElem);
//
//  		if (elem == null) {
//      		ExtentReportManager.failStepWithScreenshot(m_Driver, "erChoosenContribution", "erChoosenContribution failed. Unable to locate object: " + erChoosenElem.toString());
//
//
//  			Assert.fail("Unable to locate object: " + erChoosenElem.toString());
//          }
//
//			//elem.sendKeys(value);
//			Thread.sleep(2000);
//			ExtentReportManager.passStep(m_Driver, "erChoosenContribution");

  		
    	Reporter.log("erChoosenContribution");

  	}
    
    
    public void eeVoluntaryContribution(String value) throws Exception
   	{
           

   		WebElement elem = getWebElement(eeVoluntaryElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "eeVoluntaryContribution", "eeVoluntaryContribution failed. Unable to locate object: " + eeVoluntaryElem.toString());


   			Assert.fail("Unable to locate object: " + eeVoluntaryElem.toString());
           }

 			elem.sendKeys(value);
 			Thread.sleep(2000);
 			ExtentReportManager.passStep(m_Driver, "eeVoluntaryContribution");

   		
     	Reporter.log("eeVoluntaryContribution");

   	}
    
    
    public void eRVoluntaryContribution(String value) throws Exception
   	{
           

   		WebElement elem = getWebElement(eRVoluntaryElem);

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "eRVoluntaryContribution", "eRVoluntaryContribution failed. Unable to locate object: " + eRVoluntaryElem.toString());


   			Assert.fail("Unable to locate object: " + eRVoluntaryElem.toString());
           }

 			elem.sendKeys(value);
 			Thread.sleep(2000);
 			ExtentReportManager.passStep(m_Driver, "eRVoluntaryContribution");

   		
     	Reporter.log("eRVoluntaryContribution");

   	}
    
    public void clickAutoEnrollmentSaveBtn() throws Exception
  	{

          
  		WebElement elem = getWebElement(autoEnrollmentSveElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAutoEnrollmentSaveBtn", "clickAutoEnrollmentSaveBtn failed. Unable to locate object: " + autoEnrollmentSveElem.toString());


  			Assert.fail("Unable to locate object: " + autoEnrollmentSveElem.toString());
          }

  		elem.click();


  		Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "clickAutoEnrollmentSaveBtn");
  		
    	Reporter.log("clickAutoEnrollmentSaveBtn");

  	}
}

