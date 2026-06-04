package _2185Net_Pay_Arrangement_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pages.BasePage;
import utilities.WaitUtility;

public class Edit_EmployeeDetails extends BasePage{

	WaitUtility wt=new WaitUtility();
	public Edit_EmployeeDetails(WebDriver driver) {
		super(driver);
	

		
	}
	private By clickEmployeeElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
	private By editEmployeeElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']");
	
	private By payDetailsElem= By.xpath("//*[@id='lipayd']/a");
	
	private By basicSalaryElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtBasicSalary']");
	
	private By saveBtnElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	public void Click_EmployeeA()
	{
		WebElement elem = getWebElement(clickEmployeeElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Employee for Edit");
		
	}
	
	public void Edit_EmployeeA()
	{
		
		WebElement elem = getWebElement(editEmployeeElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click Edit Btn");
		
	}
	
	public void Click_PayDetails()
	{
		WebElement elem = getWebElement(payDetailsElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click pay details");
		
	}
	
	public void Enter_BasicSalary(String BasicSalary)
	{
		WebElement elem = getWebElement(basicSalaryElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		m_Driver.switchTo().alert().accept();
		elem.sendKeys(BasicSalary);
		Reporter.log("Enter basic salary= "+BasicSalary);
		
	}
	
	public void Click_SaveBtn() throws InterruptedException
	{
		WebElement elem = getWebElement(saveBtnElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Thread.sleep(2000);
		Reporter.log("Click pay details");
	}
	
}
