package _1908Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class EditEmployeeDetails extends BasePage{
public WebElement elem;
	public EditEmployeeDetails(WebDriver driver) {
		super(driver);
		
	}
  private By editemplydetail = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");
  private By employdetails = By.xpath("//span[text()='Employee Details']");
  
  private By generalterms = By.xpath("//span[text()='General Terms']");
  private By howmanyhrsperweek = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtWorkingHoursWeekly']");
  
  private By payrolldashboard = By.xpath("//span[text()='Payroll Dashboard']");
  private By payrollbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");
  private By runpayroll = By.xpath("//a[text()='Run Payroll']");
  
  private By paydetails = By.xpath("//a[text()='Pay Details']");
  private By Mon = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cbMonday']");
  private By Tue = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cbTuesday']");		
  private By Wed = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cbWednesday']");   
  private By Thur = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cbThursday']");
  private By Fri = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cbFriday']");
  private By Sat = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cbSaturday']");
  private By Sun = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_cbSunday']");
  private By howpayworkout = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$ddlPayMethod']");
  private By AnnualSal = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtAnnualSalary']");
  private By MonthlySal = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtBasicSalary']");
  private By Weekrate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtWeeklyRate']");
  private By Dayrate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtDayRate']");
  private By Hourrate = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$tbContainer$tpPayrollEmployee$txtHourRate']");
  private By Savebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643");
	}

   
	/**
	 * AssertUrl
   * @name AssertUrl
   */
 public void AssertUrl()
  {
      String currentUrl = m_Driver.getCurrentUrl();
      String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643";

      if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/EmployeeDashboard.aspx?PayrollCompanyCode=12024&PayrollEmployeeCode=18643")) {
          Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
      }
  }
	/**
	 * Click Edit EmployeeDetail
* @name EditEmployeeDetail
*/
 public void Click_editemplydetail()
	{
     
		 elem = getWebElement(editemplydetail);

		if (elem == null) {
 		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_editemplydetail", "Click_editemplydetail failed. Unable to locate object: " + editemplydetail.toString());

 		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_editemplydetail", "Click_editemplydetail failed. Unable to locate object: " + editemplydetail.toString());

			Assert.fail("Unable to locate object: " + editemplydetail.toString());
     }

		elem.click();
       	

		ExtentReportManager.passStep(m_Driver, "Click_editemplydetail");

		TestModellerLogger.PassStep(m_Driver, "Click_editemplydetail");
	}

 
 /**
	 * Select No of Working Days under Edit EmployeeDetail
* @name Working Days
*/
public void Select_NumberofDays(int days)
{
switch(days) {
case 1: 
      getWebElement(Tue).click();
      getWebElement(Wed).click();
      getWebElement(Thur).click();
      getWebElement(Fri).click();
      
break;
case 2: 
      getWebElement(Wed).click();
      getWebElement(Thur).click();
      getWebElement(Fri).click();
break;
case 3:  
	   getWebElement(Thur).click();
       getWebElement(Fri).click();
break;
case 4:  
	   getWebElement(Fri).click();
break;
case 5:
	 getWebElement(Mon).click();
     getWebElement(Tue).click();
     getWebElement(Wed).click();
     getWebElement(Thur).click();
     getWebElement(Fri).click();
     getWebElement(Mon).click();
     getWebElement(Tue).click();
     getWebElement(Wed).click();
     getWebElement(Thur).click();
     getWebElement(Fri).click();
break;
case 6:      
	 getWebElement(Sat).click();
break;
case 7: 
	getWebElement(Sun).click();
break;
default:
	System.out.println("Invalid Day");
break;
}

if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_NumberofDays", "Select_NumberofDays failed. Unable to locate object: " + Mon.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_NumberofDays", "Select_NumberofDays failed. Unable to locate object: " + Mon.toString());

			Assert.fail("Unable to locate object: " + Mon.toString());
  }

		ExtentReportManager.passStep(m_Driver, "Select_NumberofDays");

		TestModellerLogger.PassStep(m_Driver, "Select_NumberofDays");
}

/**
 * Click General Terms under Edit Employee
* @name Pay Details
*/ 
 public void Click_GeneralTerms()
	{
     
		 elem = getWebElement(generalterms);

		if (elem == null) {
 		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_GeneralTerms", "Click_GeneralTerms failed. Unable to locate object: " + generalterms.toString());

 		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_GeneralTerms", "Click_GeneralTerms failed. Unable to locate object: " + generalterms.toString());

			Assert.fail("Unable to locate object: " + generalterms.toString());
     }

		elem.click();
       	

		ExtentReportManager.passStep(m_Driver, "Click_GeneralTerms");

		TestModellerLogger.PassStep(m_Driver, "Click_GeneralTerms");
}
 /**
  * Click Employee Detail under Edit Employee
 * @name Pay Details
 */ 
  public void Click_EmployeeDetails()
 	{
      
 		 elem = getWebElement(employdetails);

 		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmployeeDetails", "Click_EmployeeDetails failed. Unable to locate object: " + employdetails.toString());

  		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmployeeDetails", "Click_EmployeeDetails failed. Unable to locate object: " + employdetails.toString());

 			Assert.fail("Unable to locate object: " + employdetails.toString());
      }

 		elem.click();
        	

 		ExtentReportManager.passStep(m_Driver, "Click_EmployeeDetails");

 		TestModellerLogger.PassStep(m_Driver, "Click_EmployeeDetails");
 } 
 
/**
 * Click Pay Details under Edit Employee
* @name Pay Details
*/ 
 public void Click_Paydetails()
	{
     
		 elem = getWebElement(paydetails);

		if (elem == null) {
 		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_paydetails", "Click_paydetails failed. Unable to locate object: " + paydetails.toString());

 		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_paydetails", "Click_paydetails failed. Unable to locate object: " + paydetails.toString());

			Assert.fail("Unable to locate object: " + paydetails.toString());
     }

		elem.click();
       	

		ExtentReportManager.passStep(m_Driver, "Click_paydetails");

		TestModellerLogger.PassStep(m_Driver, "Click_paydetails");
}

 /**
  * Enter How many hours are worked each week  under Pay Details
 * @name How many hours are worked each week
 */
 public void Enter_Howmanyhoursareworkedeachweek(String Hrsperweek)
 {

 	 elem = getWebElement(howmanyhrsperweek);

 	if (elem == null) {
 	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Howmanyhoursareworkedeachweek", "Enter_Howmanyhoursareworkedeachweek failed. Unable to locate object: " + howmanyhrsperweek.toString());

 	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Howmanyhoursareworkedeachweek", "Enter_Howmanyhoursareworkedeachweek failed. Unable to locate object: " + howmanyhrsperweek.toString());

 		Assert.fail("Unable to locate object: " + howmanyhrsperweek.toString());
 }

 	elem.clear();
 	elem.sendKeys(Hrsperweek);
 	

 	ExtentReportManager.passStep(m_Driver, "Enter_Howmanyhoursareworkedeachweek");

 	TestModellerLogger.PassStep(m_Driver, "Enter_Howmanyhoursareworkedeachweek");
 }
 
 /**
	 * Select howpayworkout Details under Pay Details
	 * @throws InterruptedException 
* @name howpayworkout
*/
public void Click_howpayworkout(String Payworkout) throws InterruptedException
{
  
		 elem = getWebElement(howpayworkout);

		if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_howpayworkout", "Click_howpayworkout failed. Unable to locate object: " + howpayworkout.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_howpayworkout", "Click_howpayworkout failed. Unable to locate object: " + howpayworkout.toString());

			Assert.fail("Unable to locate object: " + howpayworkout.toString());
     }

		Select payrate =  new Select(elem);
	    payrate.selectByVisibleText(Payworkout);
	    Thread.sleep(3000);
	   Alert act = m_Driver.switchTo().alert();
	//   System.out.println(act.getText());
    	act.accept();
     
		ExtentReportManager.passStep(m_Driver, "Click_howpayworkout");

		TestModellerLogger.PassStep(m_Driver, "Click_howpayworkout");
}
/**
 * Enter Weekly Rate Details under Pay Details
* @name Week Rate
*/
public void Enter_WeekRate(String Weekrte)
{

	 elem = getWebElement(Weekrate);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_WeekRate", "Enter_WeekRate failed. Unable to locate object: " + Weekrate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_WeekRate", "Enter_WeekRate failed. Unable to locate object: " + Weekrate.toString());

		Assert.fail("Unable to locate object: " + Weekrate.toString());
}

	elem.clear();
	elem.sendKeys(Weekrte);
	

	ExtentReportManager.passStep(m_Driver, "Enter_WeekRate");

	TestModellerLogger.PassStep(m_Driver, "Enter_WeekRate");
}
/**
 * Enter Annual Salry Details under Pay Details
* @name Annual Salary
*/
public void Enter_Annualsal(String Anulrte)
{

	 elem = getWebElement(AnnualSal);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Annualsal", "Enter_Annualsal failed. Unable to locate object: " + AnnualSal.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Annualsal", "Enter_Annualsal failed. Unable to locate object: " + AnnualSal.toString());

		Assert.fail("Unable to locate object: " + AnnualSal.toString());
}

	elem.clear();
	elem.sendKeys(Anulrte);
	

	ExtentReportManager.passStep(m_Driver, "Enter_Annualsal");

	TestModellerLogger.PassStep(m_Driver, "Enter_Annualsal");
}

/**
 * Enter Day Rate Details under Pay Details
* @name Day Rate
*/
public void Enter_DayRate(String Dayrte)
{

	 elem = getWebElement(Dayrate);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DayRate", "Enter_DayRate failed. Unable to locate object: " + Dayrate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DayRate", "Enter_DayRate failed. Unable to locate object: " + Dayrate.toString());

		Assert.fail("Unable to locate object: " + Dayrate.toString());
}

	elem.clear();
	elem.sendKeys(Dayrte);
	

	ExtentReportManager.passStep(m_Driver, "Enter_DayRate");

	TestModellerLogger.PassStep(m_Driver, "Enter_DayRate");
}

/**
 * Enter Hour Rate Details under Pay Details
 * @throws InterruptedException 
* @name Week Rate
*/
public void Enter_HourRate(String Hourrte) throws InterruptedException
{
     
	 elem = getWebElement(Hourrate);

	

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_HourRate", "Enter_HourRate failed. Unable to locate object: " + Hourrate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_HourRate", "Enter_HourRate failed. Unable to locate object: " + Hourrate.toString());

		Assert.fail("Unable to locate object: " + Hourrate.toString());
}
	
	for(int i=0;i<4;i++) {
    elem.sendKeys(Keys.BACK_SPACE);
	}
	 elem.sendKeys(Hourrte);
	elem.sendKeys(Keys.TAB);
	
	ExtentReportManager.passStep(m_Driver, "Enter_HourRate");

	TestModellerLogger.PassStep(m_Driver, "Enter_HourRate");
}

/**
 * Click Save button under Pay Details
 * @throws Exception 
 * @name Save button
*/
public void Click_SaveBtn() throws Exception
{

	 elem = getWebElement(Savebtn);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveBtn", "Click_SaveBtn failed. Unable to locate object: " + Savebtn.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveBtn", "Click_SaveBtn failed. Unable to locate object: " + Savebtn.toString());

		Assert.fail("Unable to locate object: " + Savebtn.toString());
}

	elem.click();
   Thread.sleep(4000);
	

	ExtentReportManager.passStep(m_Driver, "Click_SaveBtn");

	TestModellerLogger.PassStep(m_Driver, "Click_SaveBtn");
}
/**
 * Take Screen shot of Pay Details

*/
public void TakeShot(String name) throws Exception
{
	TakeScreenshot.takeScreenshot(m_Driver, name);	
}

/**
 * Verify expected data under Pay Details

*/
public void GetExpectedAnnualSal(String ExpAnnualSal)
{

	 elem = getWebElement(AnnualSal);
	String sal = elem.getAttribute("value");
	String[] Anulsal = sal.split("\\.");
	
	String Annualsal = Anulsal[0];
	System.out.println("The actual value is ="+Annualsal);
  
	
	 if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "GetExpectedAnnualSal", "GetExpectedAnnualSal failed. Unable to locate object: " + AnnualSal.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "GetExpectedAnnualSal", "GetExpectedAnnualSal failed. Unable to locate object: " + AnnualSal.toString());

		Assert.fail("Unable to locate object: " + AnnualSal.toString());
}
  System.out.println("The expected value is ="+ExpAnnualSal);
	
    
    
   Assert.assertEquals(Annualsal,ExpAnnualSal,"Salary are not matched");
	ExtentReportManager.passStep(m_Driver, "GetExpectedAnnualSal");

	TestModellerLogger.PassStep(m_Driver, "GetExpectedAnnualSal");
}

public void GetExpectedMonthSal(String ExpMonthSal)
{

	 elem = getWebElement(MonthlySal);
	String sal = elem.getAttribute("value");
	String[] Mnthsal = sal.split("\\.");
	
	String Monthsal = Mnthsal[0];
	System.out.println("The actual value is ="+Monthsal);
  
	
	 if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "GetExpectedMonthSal", "GetExpectedMonthSal failed. Unable to locate object: " + MonthlySal.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "GetExpectedMonthSal", "GetExpectedMonthSal failed. Unable to locate object: " + MonthlySal.toString());

		Assert.fail("Unable to locate object: " + MonthlySal.toString());
}
  System.out.println("The expected value is ="+ExpMonthSal);
   Assert.assertEquals(Monthsal,ExpMonthSal,"Salary are not matched");
	ExtentReportManager.passStep(m_Driver, "GetExpectedMonthSal");

	TestModellerLogger.PassStep(m_Driver, "GetExpectedMonthSal");
}

public void GetExpectedWeekRate(String ExpWeekrate)
{

	 elem = getWebElement(Weekrate);
	String Wrate = elem.getAttribute("value");
	String[] Weekrt= Wrate.split("\\.");
	
	String WeekRt = Weekrt[0];
	System.out.println("The actual value is ="+WeekRt);
 
 
	
	 if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "GetExpectedWeekRate", "GetExpectedWeekRate failed. Unable to locate object: " + Weekrate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "GetExpectedWeekRate", "GetExpectedWeekRate failed. Unable to locate object: " + Weekrate.toString());

		Assert.fail("Unable to locate object: " + AnnualSal.toString());
}
  System.out.println("The expected value is ="+ExpWeekrate);
   Assert.assertEquals(WeekRt,ExpWeekrate,"Salary are not matched");
	ExtentReportManager.passStep(m_Driver, "GetExpectedMonthSal");

	TestModellerLogger.PassStep(m_Driver, "GetExpectedMonthSal");
}

public void GetExpectedDayrate(String ExpDayrate)
{

	 elem = getWebElement(Dayrate);
	String rate = elem.getAttribute("value");
	String[] Dyrate = rate.split("\\.");
	
	String Daysal = Dyrate[0];
	System.out.println("The actual value is ="+Daysal);
  
	
	 if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "GetExpectedDayrate", "GetExpectedDayrate failed. Unable to locate object: " + AnnualSal.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "GetExpectedDayrate", "GetExpectedDayrate failed. Unable to locate object: " + AnnualSal.toString());

		Assert.fail("Unable to locate object: " + AnnualSal.toString());
}
  System.out.println("The expected value is ="+ExpDayrate);
	
    Assert.assertEquals(Daysal,ExpDayrate,"Salary are not matched");
	ExtentReportManager.passStep(m_Driver, "GetExpectedDayrate");

	TestModellerLogger.PassStep(m_Driver, "GetExpectedDayrate");
}

public void GetExpectedHourRate(String ExpHourrate)
{

	 elem = getWebElement(Hourrate);
	String Hrate = elem.getAttribute("value");
	String[] Hourrt= Hrate.split("\\.");
	
	String HourRt = Hourrt[0];
	System.out.println("The actual value is ="+HourRt);
  
	
	 if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "GetExpectedHourRate", "GetExpectedHourRate failed. Unable to locate object: " + Hourrate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "GetExpectedHourRate", "GetExpectedHourRate failed. Unable to locate object: " + Hourrate.toString());

		Assert.fail("Unable to locate object: " + Hourrate.toString());
}
  System.out.println("The expected value is ="+ExpHourrate);
   Assert.assertEquals(HourRt,ExpHourrate,"Salary are not matched");
	ExtentReportManager.passStep(m_Driver, "GetExpectedHourRate");

	TestModellerLogger.PassStep(m_Driver, "GetExpectedHourRate");
}



/**
 * Click General Terms under Edit Employee
 * @throws InterruptedException 
* @name Pay Details
*/ 
 public void Run_Payroll() throws InterruptedException
	{
     
		 elem = getWebElement(payrolldashboard);

		if (elem == null) {
 		ExtentReportManager.failStepWithScreenshot(m_Driver, "Run_Payroll", "Run_Payroll failed. Unable to locate object: " + generalterms.toString());

 		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Run_Payroll", "Run_Payroll failed. Unable to locate object: " + generalterms.toString());

			Assert.fail("Unable to locate object: " + payrolldashboard.toString());
     }

		elem.click();
		  Thread.sleep(3000);
		  elem = getWebElement(payrollbtn);
		  elem.click();
		  Thread.sleep(3000);
		  elem = getWebElement(payrolldashboard);
		  elem.click();
		  Thread.sleep(3000); 

		ExtentReportManager.passStep(m_Driver, "Run_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Run_Payroll");
}

/**
  * undo the changes happen under Pay Details

 */
public void restrainChanges() throws InterruptedException
{
	elem = getWebElement(howpayworkout);

	if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "restrainChanges", "restrainChanges failed. Unable to locate object: " + howpayworkout.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "restrainChanges", "restrainChanges failed. Unable to locate object: " + howpayworkout.toString());

		Assert.fail("Unable to locate object: " + howpayworkout.toString());
}

	Select payrate =  new Select(elem);
    payrate.selectByVisibleText("Annual Salary");
    Thread.sleep(3000);
   
    Alert act = m_Driver.switchTo().alert();
   //   System.out.println(act.getText());
   act.accept();
	elem = getWebElement(Savebtn);
    elem.click();
	Thread.sleep(3000);
	ExtentReportManager.passStep(m_Driver, "restrainChanges");

	TestModellerLogger.PassStep(m_Driver, "restrainChanges");	
}
}
