package frequency;

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
import utilities.ExcelData;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5a9af039-6dfe-455a-8889-b14f920eb54f
@TestModellerModule(guid = "5a9af039-6dfe-455a-8889-b14f920eb54f")
public class Empfrqchange extends BasePage
{
	
	String grosssalary="";
	String Expectedgrosssal="";
	String Actualgrosssalary="";
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	public Empfrqchange (WebDriver driver)
	{
		super(driver);
	}


	
	private By getgrosssalaryElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr[3]/td[1]");

	private By clickEditemployeedetailsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");

	private By gotoMandatoryPayrollInformationElem = By.xpath("//A[contains(text(),'Mandatory Payroll Information')]");

	private By selectPayrollFrequencyCodeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlPayrollFrequencyCode']");

	private By gotoPayDetailsElem = By.xpath("//A[contains(text(),'Pay Details')]");

	private By EnterAnnualSalaryElem = By.xpath("//label[contains(.,'Annual Salary:')]/../div/input");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=12106&PayrollEmployeeCode=18708&AEJobHolderTypeId=2")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click getgrosssalary
     * @name Click getgrosssalary
     */
	public void Click_getgrosssalary()
	{
		sTestCaseID="TC49";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
		WebElement elem = getWebElement(getgrosssalaryElem); 

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getgrosssalary", "Click_getgrosssalary failed. Unable to locate object: " + getgrosssalaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getgrosssalary", "Click_getgrosssalary failed. Unable to locate object: " + getgrosssalaryElem.toString());

			Assert.fail("Unable to locate object: " + getgrosssalaryElem.toString());
        }
		System.out.println("grosssalary");
		int length=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[3]/div[2]/div/div/table/tbody/tr/td[1]/span/img")).size();
		for(int j=length+2;j<=length+2;j++)
		{
			System.out.println(j);
			 grosssalary=m_Driver.findElement(By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr["+j+"]/td[1]")).getText();
			System.out.println("grosssalary"+grosssalary);
		}
		
		elem.click();
		
		
		
//		 grosssal=m_Driver.findElement(By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr[3]/td[1]")).getText();
//		System.out.println("gross salary = "+grosssal);
		
		
		ChngfrqMtoW ob=new ChngfrqMtoW(m_Driver);
		String getpayrolldate=ob.senddate();
		//System.out.println("getpayrolldate="+getpayrolldate);
//		String freqDate=data[9];
//		System.out.println("freqDate="+freqDate);
//		String[] splitdate=freqDate.split("/");
//		System.out.println("splitdate"+splitdate[1]);
//		for(int i=3;i<3;i++)
//		{
//		
//				 foundSal=m_Driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]")).getText();          	
//
//		}
		
		ExtentReportManager.passStep(m_Driver, "Click_getgrosssalary");

		TestModellerLogger.PassStep(m_Driver, "Click_getgrosssalary");
	}

	
	
	public void afterchange() 
	{
		int length2=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[3]/div[2]/div/div/table/tbody/tr/td[1]/span/img")).size();
		for(int j=length2+2;j<=length2+2;j++)
		{
			 Actualgrosssalary=m_Driver.findElement(By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr["+j+"]/td[1]")).getText();
			System.out.println("grosssalary"+grosssalary);
		}
		
		
		Expectedgrosssal=grosssalary;
		
		System.out.println("Actualgrosssalary==="+Actualgrosssalary);
		System.out.println("Expectedgrosssal==="+Expectedgrosssal);
		
//		assertEquals(Actualgrosssalary, Expectedgrosssal);
		
	}
	
     
	/**
 	 * Click clickEditemployeedetails
     * @name Click clickEditemployeedetails
     */
	public void Click_clickEditemployeedetails()
	{
        
		WebElement elem = getWebElement(clickEditemployeedetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickEditemployeedetails", "Click_clickEditemployeedetails failed. Unable to locate object: " + clickEditemployeedetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickEditemployeedetails", "Click_clickEditemployeedetails failed. Unable to locate object: " + clickEditemployeedetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickEditemployeedetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickEditemployeedetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickEditemployeedetails");
	}

     
	/**
 	 * Click gotoMandatoryPayrollInformation
     * @name Click gotoMandatoryPayrollInformation
     */
	public void Click_gotoMandatoryPayrollInformation()
	{
        
		WebElement elem = getWebElement(gotoMandatoryPayrollInformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoMandatoryPayrollInformation", "Click_gotoMandatoryPayrollInformation failed. Unable to locate object: " + gotoMandatoryPayrollInformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoMandatoryPayrollInformation", "Click_gotoMandatoryPayrollInformation failed. Unable to locate object: " + gotoMandatoryPayrollInformationElem.toString());

			Assert.fail("Unable to locate object: " + gotoMandatoryPayrollInformationElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoMandatoryPayrollInformation");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoMandatoryPayrollInformation");
	}

    
	/**
 	 * Select selectPayrollFrequencyCode
     * @name Select selectPayrollFrequencyCode
     */
    public void Select_selectPayrollFrequencyCode(String selectPayrollFrequencyCode)
 	{
 	    
 		WebElement elem = getWebElement(selectPayrollFrequencyCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectPayrollFrequencyCode", "Select_selectPayrollFrequencyCode failed. Unable to locate object: " + selectPayrollFrequencyCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectPayrollFrequencyCode", "Select_selectPayrollFrequencyCode failed. Unable to locate object: " + selectPayrollFrequencyCodeElem.toString());

 			Assert.fail("Unable to locate object: " + selectPayrollFrequencyCodeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectPayrollFrequencyCode);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectPayrollFrequencyCode " + selectPayrollFrequencyCode);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectPayrollFrequencyCode " + selectPayrollFrequencyCode);
 	}

     
	/**
 	 * Click gotoPayDetails
     * @name Click gotoPayDetails
     */
	public void Click_gotoPayDetails()
	{
        
		WebElement elem = getWebElement(gotoPayDetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayDetails", "Click_gotoPayDetails failed. Unable to locate object: " + gotoPayDetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayDetails", "Click_gotoPayDetails failed. Unable to locate object: " + gotoPayDetailsElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayDetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayDetails");
	}

      
	/**
 	 * Enter EnterAnnualSalary
	 * @throws InterruptedException 
     * @name Enter EnterAnnualSalary
     */
 	public void Enter_EnterAnnualSalary(String EnterAnnualSalary) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EnterAnnualSalaryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterAnnualSalary", "Enter_EnterAnnualSalary failed. Unable to locate object: " + EnterAnnualSalaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterAnnualSalary", "Enter_EnterAnnualSalary failed. Unable to locate object: " + EnterAnnualSalaryElem.toString());

 			Assert.fail("Unable to locate object: " + EnterAnnualSalaryElem.toString());
         }
 		
 		for(int i=0;i<20; i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}

 		elem.sendKeys(EnterAnnualSalary);
 		
 		elem.sendKeys(Keys.TAB);
 		
 		Thread.sleep(2000);
 		
 		m_Driver.switchTo().alert().accept();
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterAnnualSalary " + EnterAnnualSalary);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterAnnualSalary " + EnterAnnualSalary);
 	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
		
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
}