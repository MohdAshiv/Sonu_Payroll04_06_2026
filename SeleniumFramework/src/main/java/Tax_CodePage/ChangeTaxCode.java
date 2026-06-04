package Tax_CodePage;

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
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7a72e2a2-a5ec-4cd0-8a89-3588723c7786
@TestModellerModule(guid = "7a72e2a2-a5ec-4cd0-8a89-3588723c7786")
public class ChangeTaxCode extends BasePage
{
	
	public ChangeTaxCode (WebDriver driver)
	{
		super(driver);
	}


	
	private By search_EmployeeElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$search_input']");

	private By SearchElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
	
	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");

	private By ClickOnEmpElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");

	private By _Edit_employee_details_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");

	private By Mandatory_Payroll_InformationElem = By.xpath("//A[contains(text(),'Mandatory Payroll Information')]");

	private By EnterTaxCodeElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtTaxCode']");

	private By checkW1M1_basisElem = By.xpath("//label[normalize-space()= 'W1/M1 basis']/../input");

	private By Pay_DetailsElem = By.xpath("//A[contains(text(),'Pay Details')]");

	private By EnterBasicSalaryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtBasicSalary']");

	private By _SaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=15438&PayrollEmployeeCode=22165&AEJobHolderTypeId=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=15438&PayrollEmployeeCode=22165&AEJobHolderTypeId=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=15438&PayrollEmployeeCode=22165&AEJobHolderTypeId=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=15438&PayrollEmployeeCode=22165&AEJobHolderTypeId=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/PayrollUI/Popup/EmployeeEditor.aspx?action=Edit&PayrollCompanyCode=15438&PayrollEmployeeCode=22165&AEJobHolderTypeId=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter search_Employee
     * @name Enter search_Employee
     */
 	public void Enter_search_Employee(String search_Employee)
 	{
 	    
 		WebElement elem = getWebElement(search_EmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_search_Employee", "Enter_search_Employee failed. Unable to locate object: " + search_EmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_search_Employee", "Enter_search_Employee failed. Unable to locate object: " + search_EmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + search_EmployeeElem.toString());
         }

 		elem.sendKeys(search_Employee);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_search_Employee " + search_Employee);

  		TestModellerLogger.PassStep(m_Driver, "Enter_search_Employee " + search_Employee);
 	}
 	
 	
 	/**
 	 * Click gotoPayrollDashboard
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard()
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	
          

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}

     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}

     
	/**
 	 * Click ClickOnEmp
     * @name Click ClickOnEmp
     */
	public void Click_ClickOnEmp()
	{
        
		WebElement elem = getWebElement(ClickOnEmpElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnEmp", "Click_ClickOnEmp failed. Unable to locate object: " + ClickOnEmpElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnEmp", "Click_ClickOnEmp failed. Unable to locate object: " + ClickOnEmpElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnEmpElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickOnEmp");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnEmp");
	}

     
	/**
 	 * Click  Edit employee details 
     * @name Click  Edit employee details 
     */
	public void Click__Edit_employee_details_()
	{
        
		WebElement elem = getWebElement(_Edit_employee_details_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Edit_employee_details_", "Click__Edit_employee_details_ failed. Unable to locate object: " + _Edit_employee_details_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Edit_employee_details_", "Click__Edit_employee_details_ failed. Unable to locate object: " + _Edit_employee_details_Elem.toString());

			Assert.fail("Unable to locate object: " + _Edit_employee_details_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Edit_employee_details_");

		TestModellerLogger.PassStep(m_Driver, "Click__Edit_employee_details_");
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

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Mandatory_Payroll_Information");

		TestModellerLogger.PassStep(m_Driver, "Click_Mandatory_Payroll_Information");
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
 		
 		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_UpdatePanel1']/div[9]/label")).click();
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterTaxCode " + EnterTaxCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterTaxCode " + EnterTaxCode);
 	}

     
	/**
 	 * Click checkW1/M1 basis
     * @name Click checkW1/M1 basis
     */
	public void Click_checkW1M1_basis()
	{
        
		WebElement elem = getWebElement(checkW1M1_basisElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_checkW1M1_basis", "Click_checkW1M1_basis failed. Unable to locate object: " + checkW1M1_basisElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_checkW1M1_basis", "Click_checkW1M1_basis failed. Unable to locate object: " + checkW1M1_basisElem.toString());

			Assert.fail("Unable to locate object: " + checkW1M1_basisElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_checkW1M1_basis");

		TestModellerLogger.PassStep(m_Driver, "Click_checkW1M1_basis");
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
	 * @throws InterruptedException 
     * @name Enter EnterBasicSalary
     */
 	public void Enter_EnterBasicSalary(String EnterBasicSalary) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(EnterBasicSalaryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterBasicSalary", "Enter_EnterBasicSalary failed. Unable to locate object: " + EnterBasicSalaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterBasicSalary", "Enter_EnterBasicSalary failed. Unable to locate object: " + EnterBasicSalaryElem.toString());

 			Assert.fail("Unable to locate object: " + EnterBasicSalaryElem.toString());
         }
for(int i=0; i<10; i++)
{
 		elem.sendKeys(Keys.BACK_SPACE);
}
 		elem.sendKeys(EnterBasicSalary);
 		elem.sendKeys(Keys.TAB);
 		Thread.sleep(2000);
 		m_Driver.switchTo().alert().accept();
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterBasicSalary " + EnterBasicSalary);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterBasicSalary " + EnterBasicSalary);
 	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save()
	{
        
		WebElement elem = getWebElement(_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

			Assert.fail("Unable to locate object: " + _SaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save");

		TestModellerLogger.PassStep(m_Driver, "Click__Save");
	}
	
	
	/**
	 * Validate Different Tax Code Deduction
	 * 
	 */
	public void validateTaxCode()
	{
		
		////*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[2]
		
		int count=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[2]")).size();
		System.out.println("size="+count);
		
		for(int i=2; i<=count+1; i++)
		{
			double taxDeductionPercent=40;
			String Taxcode=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println("Taxcode="+Taxcode);
			
			if(i==3 || i==5 || i==7 )
			{
				System.out.println("Hi1");
				taxDeductionPercent=45;
			}
			
			if(i==9 || i==10)
			{
				System.out.println("Hi1");
				taxDeductionPercent=46;
			}
			
			//finding gross salary
			String gross=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr["+i+"]/td[4]")).getText();
			String grossvalue=gross.replaceAll("[£]", "");
			 grossvalue=grossvalue.replaceAll("[,]", "");
	      	
	  		double grossvalue1 = Double.parseDouble(grossvalue);
	  		
	  		
	  		double ExpectedTax=(grossvalue1*taxDeductionPercent)/100;
	  		
	  		System.out.println("Expected Tax="+ExpectedTax);
			
			//finding Tax Deducted
			String Tax=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr["+i+"]/td[5]")).getText();
			String TaxValue=Tax.replaceAll("[£]", "");
			TaxValue=TaxValue.replaceAll("[,]", "");
			
			double TaxValue1 = Double.parseDouble(TaxValue);
			
			System.out.println("TaxValue1="+TaxValue1);
			
			
			assertEquals(TaxValue1, ExpectedTax,"Tax deducted is not correct");
			
		}
		
		
		
		
		
	}
	
	public void TaxAt50Percent()
	{
		
		int count=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[2]")).size();
		System.out.println("size="+count);
		
		for(int i=2; i<=count+1; i++)
		{
			double taxDeductionPercent=50;
			String Taxcode=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println("Taxcode="+Taxcode);
			
			String gross=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr["+i+"]/td[4]")).getText();
			String grossvalue=gross.replaceAll("[£]", "");
			 grossvalue=grossvalue.replaceAll("[,]", "");
	      	
	  		double grossvalue1 = Double.parseDouble(grossvalue);
	  		
	  		
	  		double ExpectedTax=(grossvalue1*taxDeductionPercent)/100;
	  		
	  		System.out.println("Expected Tax="+ExpectedTax);
			
			//finding Tax Deducted
			String Tax=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr["+i+"]/td[5]")).getText();
			String TaxValue=Tax.replaceAll("[£]", "");
			TaxValue=TaxValue.replaceAll("[,]", "");
			
			double TaxValue1 = Double.parseDouble(TaxValue);
			
			System.out.println("TaxValue1="+TaxValue1);
			
			
			assertEquals(TaxValue1, ExpectedTax,"Tax deducted is not correct");
		}
		
	}
	
}