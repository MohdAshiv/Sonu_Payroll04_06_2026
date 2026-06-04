package DeleteAddEmpPage;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/747035bd-587c-4445-ba38-fe56f5ffa9c6
@TestModellerModule(guid = "747035bd-587c-4445-ba38-fe56f5ffa9c6")
public class Add_Delete_Employee extends BasePage
{
	public Add_Delete_Employee (WebDriver driver)
	{
		super(driver);
	}


	
	private By _New_Employee_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefAddEmployee']");

	private By EnterFirstNameElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtFirstName']");

	private By EnterLastNameElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLastName']");

	private By GenderElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlGender']");

	private By EnterDOBElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDOB']");

	private By Address1Elem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress1']");

	private By EnterAddress2Elem = By.xpath("(.//label[normalize-space()= ''])[1]/../div/input");

	private By DropDownCountryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_DropDownCountry']");

	private By CountryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtCountry']");

	private By EnterPostCodeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtPostCode']");

	private By Mandatory_Payroll_InformationElem = By.xpath("//A[contains(text(),'Mandatory Payroll Information')]");

	private By EnterJoiningDateElem = By.xpath("//label[normalize-space()= 'Joining Date: *']/../div/div/input");

	private By PayrollFrequencyCodeElem = By.xpath("//label[normalize-space()= 'Pay Frequency: *']/../div/select");

	private By EnterTaxCodeElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtTaxCode']");

	private By Pay_DetailsElem = By.xpath("//A[contains(text(),'Pay Details')]");

	private By EnterBasicSalaryElem = By.xpath("//label[normalize-space()= 'Monthly Salary:']/../div/input");

	private By SaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By Personal_DetailsElem = By.xpath("//A[contains(text(),'Personal Details')]");

	private By gotoPayroll_DashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By clickThreeDotElem = By.xpath("//A[@class='report_icon dropdown-toggle']");

	private By chooseDeleteElem = By.xpath("//A[@id='btnEmpDelete']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15454&IsFirstRequest=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15454&IsFirstRequest=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15454&IsFirstRequest=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15454&IsFirstRequest=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/CompanyDashboard.aspx?PayrollCompanyCode=15454&IsFirstRequest=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  New Employee 
     * @name Click  New Employee 
     */
	public void Click__New_Employee_()
	{
        
		WebElement elem = getWebElement(_New_Employee_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Employee_", "Click__New_Employee_ failed. Unable to locate object: " + _New_Employee_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Employee_", "Click__New_Employee_ failed. Unable to locate object: " + _New_Employee_Elem.toString());

			Assert.fail("Unable to locate object: " + _New_Employee_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Employee_");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Employee_");
	}

      
	/**
 	 * Enter EnterFirstName
     * @name Enter EnterFirstName
     */
 	public void Enter_EnterFirstName(String EnterFirstName)
 	{
 	    
 		WebElement elem = getWebElement(EnterFirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterFirstName", "Enter_EnterFirstName failed. Unable to locate object: " + EnterFirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterFirstName", "Enter_EnterFirstName failed. Unable to locate object: " + EnterFirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterFirstNameElem.toString());
         }

 		elem.sendKeys(EnterFirstName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterFirstName " + EnterFirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterFirstName " + EnterFirstName);
 	}

      
	/**
 	 * Enter EnterLastName
     * @name Enter EnterLastName
     */
 	public void Enter_EnterLastName(String EnterLastName)
 	{
 	    
 		WebElement elem = getWebElement(EnterLastNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterLastName", "Enter_EnterLastName failed. Unable to locate object: " + EnterLastNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterLastName", "Enter_EnterLastName failed. Unable to locate object: " + EnterLastNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterLastNameElem.toString());
         }

 		elem.sendKeys(EnterLastName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterLastName " + EnterLastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterLastName " + EnterLastName);
 	}

    
	/**
 	 * Select Gender
     * @name Select Gender
     */
    public void Select_Gender(String Gender)
 	{
 	    
 		WebElement elem = getWebElement(GenderElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Gender", "Select_Gender failed. Unable to locate object: " + GenderElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Gender", "Select_Gender failed. Unable to locate object: " + GenderElem.toString());

 			Assert.fail("Unable to locate object: " + GenderElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Gender);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Gender " + Gender);

 		TestModellerLogger.PassStep(m_Driver, "Select_Gender " + Gender);
 	}

      
	/**
 	 * Enter EnterDOB
     * @name Enter EnterDOB
     */
 	public void Enter_EnterDOB(String EnterDOB)
 	{
 	    
 		WebElement elem = getWebElement(EnterDOBElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterDOB", "Enter_EnterDOB failed. Unable to locate object: " + EnterDOBElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterDOB", "Enter_EnterDOB failed. Unable to locate object: " + EnterDOBElem.toString());

 			Assert.fail("Unable to locate object: " + EnterDOBElem.toString());
         }

 		elem.sendKeys(EnterDOB);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterDOB " + EnterDOB);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterDOB " + EnterDOB);
 	}

      
	/**
 	 * Enter Address1
	 * @throws InterruptedException 
     * @name Enter Address1
     */
 	public void Enter_Address1(String Address1) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Address1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

 			Assert.fail("Unable to locate object: " + Address1Elem.toString());
         }

// 		Thread.sleep(2000);
// 		System.out.println("Hi");
// 	//	elem.sendKeys(Address1);
 		m_Driver.findElement(By.xpath("//*[@id='PersonalDetails']/div[9]/label")).click();
 		Thread.sleep(2000);
 		
 		elem=m_Driver.findElement(By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtAddress1']"));
 		elem.sendKeys(Address1);
// 		System.out.println("Hi2");
 		Thread.sleep(3000);
// 		
// 		
// 		System.out.println("Hi3");
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address1 " + Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address1 " + Address1);
 	}

      
	/**
 	 * Enter EnterAddress2
	 * @throws InterruptedException 
     * @name Enter EnterAddress2
     */
 	public void Enter_EnterAddress2(String EnterAddress2) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EnterAddress2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterAddress2", "Enter_EnterAddress2 failed. Unable to locate object: " + EnterAddress2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterAddress2", "Enter_EnterAddress2 failed. Unable to locate object: " + EnterAddress2Elem.toString());

 			Assert.fail("Unable to locate object: " + EnterAddress2Elem.toString());
         }

 		Thread.sleep(2000);
 		elem.clear();
 		elem.sendKeys(EnterAddress2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterAddress2 " + EnterAddress2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterAddress2 " + EnterAddress2);
 	}

    
	/**
 	 * Select DropDownCountry
     * @name Select DropDownCountry
     */
    public void Select_DropDownCountry(String DropDownCountry)
 	{
 	    
 		WebElement elem = getWebElement(DropDownCountryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_DropDownCountry", "Select_DropDownCountry failed. Unable to locate object: " + DropDownCountryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_DropDownCountry", "Select_DropDownCountry failed. Unable to locate object: " + DropDownCountryElem.toString());

 			Assert.fail("Unable to locate object: " + DropDownCountryElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(DropDownCountry);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_DropDownCountry " + DropDownCountry);

 		TestModellerLogger.PassStep(m_Driver, "Select_DropDownCountry " + DropDownCountry);
 	}

      
	/**
 	 * Enter Country
     * @name Enter Country
     */
 	public void Enter_Country(String Country)
 	{
 	    
 		WebElement elem = getWebElement(CountryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Country", "Enter_Country failed. Unable to locate object: " + CountryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Country", "Enter_Country failed. Unable to locate object: " + CountryElem.toString());

 			Assert.fail("Unable to locate object: " + CountryElem.toString());
         }

 		elem.sendKeys(Country);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Country " + Country);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Country " + Country);
 	}

      
	/**
 	 * Enter EnterPostCode
     * @name Enter EnterPostCode
     */
 	public void Enter_EnterPostCode(String EnterPostCode)
 	{
 	    
 		WebElement elem = getWebElement(EnterPostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterPostCode", "Enter_EnterPostCode failed. Unable to locate object: " + EnterPostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterPostCode", "Enter_EnterPostCode failed. Unable to locate object: " + EnterPostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + EnterPostCodeElem.toString());
         }

 		elem.sendKeys(EnterPostCode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterPostCode " + EnterPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterPostCode " + EnterPostCode);
 	}

     
	/**
 	 * Click Mandatory Payroll Information
     * @name Click Mandatory Payroll Information
     */
	public void Click_Mandatory_Payroll_Information()
	{
        
		WebElement elem = getWebElement(Mandatory_Payroll_InformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Mandatory_Payroll_Information", "Click_Mandatory_Payroll_Information failed. Unable to locate object: " + Mandatory_Payroll_InformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Mandatory_Payroll_Information", "Click_Mandatory_Payroll_Information failed. Unable to locate object: " + Mandatory_Payroll_InformationElem.toString());

			Assert.fail("Unable to locate object: " + Mandatory_Payroll_InformationElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='PersonalDetails']/h3")));
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Mandatory_Payroll_Information");

		TestModellerLogger.PassStep(m_Driver, "Click_Mandatory_Payroll_Information");
	}

      
	/**
 	 * Enter EnterJoiningDate
     * @name Enter EnterJoiningDate
     */
 	public void Enter_EnterJoiningDate(String EnterJoiningDate)
 	{
 	    
 		WebElement elem = getWebElement(EnterJoiningDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterJoiningDate", "Enter_EnterJoiningDate failed. Unable to locate object: " + EnterJoiningDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterJoiningDate", "Enter_EnterJoiningDate failed. Unable to locate object: " + EnterJoiningDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterJoiningDateElem.toString());
         }

 		elem.sendKeys(EnterJoiningDate);
 		
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_UpdatePanel1']/div[2]/label")).click();
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterJoiningDate " + EnterJoiningDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterJoiningDate " + EnterJoiningDate);
 	}

    
	/**
 	 * Select PayrollFrequencyCode
     * @name Select PayrollFrequencyCode
     */
    public void Select_PayrollFrequencyCode(String PayrollFrequencyCode)
 	{
 	    
 		WebElement elem = getWebElement(PayrollFrequencyCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_PayrollFrequencyCode", "Select_PayrollFrequencyCode failed. Unable to locate object: " + PayrollFrequencyCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_PayrollFrequencyCode", "Select_PayrollFrequencyCode failed. Unable to locate object: " + PayrollFrequencyCodeElem.toString());

 			Assert.fail("Unable to locate object: " + PayrollFrequencyCodeElem.toString());
         }
 		
 		elem=m_Driver.findElement(By.xpath("//label[normalize-space()= 'Pay Frequency: *']/../div/select"));

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(PayrollFrequencyCode);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_PayrollFrequencyCode " + PayrollFrequencyCode);

 		TestModellerLogger.PassStep(m_Driver, "Select_PayrollFrequencyCode " + PayrollFrequencyCode);
 	}

      
	/**
 	 * Enter EnterTaxCode
     * @name Enter EnterTaxCode
     */
 	public void Enter_EnterTaxCode(String EnterTaxCode)
 	{
 	    
 		WebElement elem = getWebElement(EnterTaxCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterTaxCode", "Enter_EnterTaxCode failed. Unable to locate object: " + EnterTaxCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterTaxCode", "Enter_EnterTaxCode failed. Unable to locate object: " + EnterTaxCodeElem.toString());

 			Assert.fail("Unable to locate object: " + EnterTaxCodeElem.toString());
         }

 		for(int i=0;i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(EnterTaxCode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterTaxCode " + EnterTaxCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterTaxCode " + EnterTaxCode);
 	}

     
	/**
 	 * Click Pay Details
     * @name Click Pay Details
     */
	public void Click_Pay_Details()
	{
        
		WebElement elem = getWebElement(Pay_DetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pay_Details", "Click_Pay_Details failed. Unable to locate object: " + Pay_DetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pay_Details", "Click_Pay_Details failed. Unable to locate object: " + Pay_DetailsElem.toString());

			Assert.fail("Unable to locate object: " + Pay_DetailsElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_UpdatePanel1']/h3")));
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pay_Details");

		TestModellerLogger.PassStep(m_Driver, "Click_Pay_Details");
	}

      
	/**
 	 * Enter EnterBasicSalary
     * @name Enter EnterBasicSalary
     */
 	public void Enter_EnterBasicSalary(String EnterBasicSalary)
 	{
 	    
 		WebElement elem = getWebElement(EnterBasicSalaryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterBasicSalary", "Enter_EnterBasicSalary failed. Unable to locate object: " + EnterBasicSalaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterBasicSalary", "Enter_EnterBasicSalary failed. Unable to locate object: " + EnterBasicSalaryElem.toString());

 			Assert.fail("Unable to locate object: " + EnterBasicSalaryElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(EnterBasicSalary);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterBasicSalary " + EnterBasicSalary);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterBasicSalary " + EnterBasicSalary);
 	}

     
	/**
 	 * Click Save
     * @name Click Save
     */
	public void Click_Save()
	{
        
		WebElement elem = getWebElement(SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

			Assert.fail("Unable to locate object: " + SaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Save");
	}

     
	/**
 	 * Click Personal Details
     * @name Click Personal Details
     */
	public void Click_Personal_Details()
	{
        
		WebElement elem = getWebElement(Personal_DetailsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Personal_Details", "Click_Personal_Details failed. Unable to locate object: " + Personal_DetailsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Personal_Details", "Click_Personal_Details failed. Unable to locate object: " + Personal_DetailsElem.toString());

			Assert.fail("Unable to locate object: " + Personal_DetailsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Personal_Details");

		TestModellerLogger.PassStep(m_Driver, "Click_Personal_Details");
	}

     
	/**
 	 * Click gotoPayroll Dashboard
     * @name Click gotoPayroll Dashboard
     */
	public void Click_gotoPayroll_Dashboard()
	{
        
		WebElement elem = getWebElement(gotoPayroll_DashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayroll_Dashboard", "Click_gotoPayroll_Dashboard failed. Unable to locate object: " + gotoPayroll_DashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayroll_Dashboard", "Click_gotoPayroll_Dashboard failed. Unable to locate object: " + gotoPayroll_DashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayroll_DashboardElem.toString());
        }

		 jsExec.executeScript("arguments[0].click();", elem);	
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayroll_Dashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayroll_Dashboard");
	}

     
	/**
 	 * Click clickThreeDot
     * @name Click clickThreeDot
     */
	public void Click_clickThreeDot()
	{
        
		WebElement elem = getWebElement(clickThreeDotElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickThreeDot", "Click_clickThreeDot failed. Unable to locate object: " + clickThreeDotElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickThreeDot", "Click_clickThreeDot failed. Unable to locate object: " + clickThreeDotElem.toString());

			Assert.fail("Unable to locate object: " + clickThreeDotElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickThreeDot");

		TestModellerLogger.PassStep(m_Driver, "Click_clickThreeDot");
	}
	
	
	/**
	 * Search delete
	 */
	public void searchDeleteOption()
	{
		
		List<WebElement> ThreeDotList=new ArrayList<WebElement>();
		
		boolean value=false;
		
		ThreeDotList=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[12]/div/ul/li"));
		

		
		for(WebElement li:ThreeDotList)
		{
			String Actual=li.getText();
			System.out.println(Actual+"=srting");
			String Expected="Delete";
			if(Actual.contains(Expected))
			{
			//	System.out.println("Hi");
				value=true;
				break;
			}
		}
		
		System.out.println(value);
		Assert.assertFalse(value);
		
	}
	
	/**
	 * Take ScreenShot
	 * @throws Exception 
	 */
	public void TakeScShot() throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, "Delete Option not visible");
	}

     
	/**
 	 * Click chooseDelete
     * @name Click chooseDelete
     */
	public void Click_chooseDelete()
	{
        
		WebElement elem = getWebElement(chooseDeleteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chooseDelete", "Click_chooseDelete failed. Unable to locate object: " + chooseDeleteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chooseDelete", "Click_chooseDelete failed. Unable to locate object: " + chooseDeleteElem.toString());

			Assert.fail("Unable to locate object: " + chooseDeleteElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_chooseDelete");

		TestModellerLogger.PassStep(m_Driver, "Click_chooseDelete");
	}
	
	
	/**
	 * Click Delete
	 * @throws InterruptedException 
	 * 
	 */
	public void ClickDelete() throws InterruptedException
	{
		
		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='PersonalDetails']/div[15]/label")));
		
		m_Driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		
		Thread.sleep(2000);
		
		String successmsg=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]")).getText();
		
		System.out.println(successmsg);
		
		String Expected="Success! Employee is deleted successfully";
		
		assertEquals(successmsg, Expected);
		
	}
}